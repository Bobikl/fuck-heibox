package com.tencent.cos.xml.crypto;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.p0;
import com.tencent.cos.xml.CosXmlSimpleService;
import com.tencent.cos.xml.common.Range;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadResult;
import com.tencent.cos.xml.model.object.InitMultipartUploadRequest;
import com.tencent.cos.xml.model.object.InitMultipartUploadResult;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.object.PutObjectResult;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.cos.xml.model.object.UploadPartResult;
import com.tencent.cos.xml.s3.Base64;
import com.tencent.cos.xml.utils.DigestUtils;
import com.tencent.qcloud.core.auth.QCloudCredentialProvider;
import com.tencent.qcloud.core.util.ContextHolder;
import com.tencent.qcloud.core.util.QCloudUtils;
import com.tencentcloudapi.kms.v20190118.models.GenerateDataKeyRequest;
import com.tencentcloudapi.kms.v20190118.models.GenerateDataKeyResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CryptoModuleBase implements CryptoModule {
    protected static final int DEFAULT_BUFFER_SIZE = 2048;
    private static final boolean IS_MULTI_PART = true;
    protected final ContentCryptoScheme contentCryptoScheme;
    protected final CosXmlSimpleService cos;
    protected final COSCryptoScheme cryptoScheme;
    protected final EncryptionMaterialsProvider kekMaterialsProvider;
    protected final QCLOUDKMS kms;
    protected final Map<String, MultipartUploadCryptoContext> multipartUploadContexts = Collections.synchronizedMap(new HashMap());

    protected CryptoModuleBase(CosXmlSimpleService cosXmlSimpleService, QCloudCredentialProvider qCloudCredentialProvider, EncryptionMaterialsProvider encryptionMaterialsProvider) {
        this.kekMaterialsProvider = encryptionMaterialsProvider;
        this.cos = cosXmlSimpleService;
        COSCryptoScheme cOSCryptoSchemeFrom = COSCryptoScheme.from();
        this.cryptoScheme = cOSCryptoSchemeFrom;
        this.contentCryptoScheme = cOSCryptoSchemeFrom.getContentCryptoScheme();
        this.kms = null;
    }

    protected CryptoModuleBase(QCLOUDKMS qcloudkms, CosXmlSimpleService cosXmlSimpleService, QCloudCredentialProvider qCloudCredentialProvider, EncryptionMaterialsProvider encryptionMaterialsProvider) {
        this.kekMaterialsProvider = encryptionMaterialsProvider;
        this.cos = cosXmlSimpleService;
        COSCryptoScheme cOSCryptoSchemeFrom = COSCryptoScheme.from();
        this.cryptoScheme = cOSCryptoSchemeFrom;
        this.contentCryptoScheme = cOSCryptoSchemeFrom.getContentCryptoScheme();
        this.kms = qcloudkms;
    }

    private ContentCryptoMaterial buildContentCryptoMaterial(EncryptionMaterials encryptionMaterials, Provider provider, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        byte[] bArr = new byte[this.contentCryptoScheme.getIVLengthInBytes()];
        this.cryptoScheme.getSecureRandom().nextBytes(bArr);
        if (!encryptionMaterials.isKMSEnabled()) {
            return ContentCryptoMaterial.create(generateCEK(encryptionMaterials, provider), bArr, encryptionMaterials, this.cryptoScheme, provider, this.kms, cosXmlRequest);
        }
        Map<String, String> mapMergeMaterialDescriptions = ContentCryptoMaterial.mergeMaterialDescriptions(encryptionMaterials, cosXmlRequest);
        GenerateDataKeyRequest generateDataKeyRequest = new GenerateDataKeyRequest();
        try {
            generateDataKeyRequest.setEncryptionContext(JSONUtils.toJsonString(mapMergeMaterialDescriptions));
            generateDataKeyRequest.setKeyId(encryptionMaterials.getCustomerMasterKeyId());
            generateDataKeyRequest.setKeySpec(this.contentCryptoScheme.getKeySpec());
            GenerateDataKeyResponse generateDataKeyResponseGenerateDataKey = this.kms.generateDataKey(generateDataKeyRequest);
            return ContentCryptoMaterial.wrap(new SecretKeySpec(Base64.decode(generateDataKeyResponseGenerateDataKey.getPlaintext()), this.contentCryptoScheme.getKeyGeneratorAlgorithm()), bArr, this.contentCryptoScheme, provider, new KMSSecuredCEK(generateDataKeyResponseGenerateDataKey.getCiphertextBlob().getBytes(), mapMergeMaterialDescriptions));
        } catch (JSONException unused) {
            throw CosXmlClientException.internalException("generate datakey request set encryption context got json processing exception");
        }
    }

    static Range getAdjustedCryptoRange(Range range) {
        if (range == null) {
            return null;
        }
        return new Range(getCipherBlockLowerBound(range.getStart()), range.getEnd() != -1 ? getCipherBlockUpperBound(range.getEnd()) : -1L);
    }

    static long[] getAdjustedCryptoRange(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        long j10 = jArr[0];
        if (j10 > jArr[1]) {
            return null;
        }
        return new long[]{getCipherBlockLowerBound(j10), getCipherBlockUpperBound(jArr[1])};
    }

    private static long getCipherBlockLowerBound(long j10) {
        long j11 = (j10 - (j10 % 16)) - 16;
        if (j11 < 0) {
            return 0L;
        }
        return j11;
    }

    private static long getCipherBlockUpperBound(long j10) {
        long j11 = j10 + (16 - (j10 % 16)) + 16;
        if (j11 < 0) {
            return Long.MAX_VALUE;
        }
        return j11;
    }

    private CipherLiteInputStream newCOSCipherLiteInputStream(PutObjectRequest putObjectRequest, ContentCryptoMaterial contentCryptoMaterial, long j10) throws CosXmlClientException {
        try {
            InputStream inputStreamOpenInputStream = openInputStream(putObjectRequest);
            if (j10 > -1) {
                inputStreamOpenInputStream = new LengthCheckInputStream(inputStreamOpenInputStream, j10, false);
            }
            CipherLite cipherLite = contentCryptoMaterial.getCipherLite();
            return cipherLite.markSupported() ? new CipherLiteInputStream(inputStreamOpenInputStream, cipherLite, 2048) : new RenewableCipherLiteInputStream(inputStreamOpenInputStream, cipherLite, 2048);
        } catch (Exception e10) {
            throw CosXmlClientException.internalException("Unable to create cipher input stream: " + e10.getMessage());
        }
    }

    private ContentCryptoMaterial newContentCryptoMaterial(EncryptionMaterialsProvider encryptionMaterialsProvider, Provider provider, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        EncryptionMaterials encryptionMaterials = encryptionMaterialsProvider.getEncryptionMaterials();
        if (encryptionMaterials != null) {
            return buildContentCryptoMaterial(encryptionMaterials, provider, cosXmlRequest);
        }
        throw CosXmlClientException.internalException("No material available from the encryption material provider");
    }

    private ContentCryptoMaterial newContentCryptoMaterial(EncryptionMaterialsProvider encryptionMaterialsProvider, Map<String, String> map, Provider provider, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        EncryptionMaterials encryptionMaterials = encryptionMaterialsProvider.getEncryptionMaterials(map);
        if (encryptionMaterials == null) {
            return null;
        }
        return buildContentCryptoMaterial(encryptionMaterials, provider, cosXmlRequest);
    }

    @p0
    private InputStream openInputStream(PutObjectRequest putObjectRequest) throws IOException {
        String srcPath = putObjectRequest.getSrcPath();
        Uri uri = putObjectRequest.getUri();
        if (srcPath != null) {
            return new FileInputStream(srcPath);
        }
        if (uri == null || ContextHolder.getAppContext() == null) {
            return null;
        }
        return ContextHolder.getAppContext().getContentResolver().openInputStream(uri);
    }

    protected final InitMultipartUploadRequest cipherInitMultipartUploadRequest(InitMultipartUploadRequest initMultipartUploadRequest) {
        ObjectMetadata metadata = initMultipartUploadRequest.getMetadata();
        if (metadata == null) {
            return initMultipartUploadRequest;
        }
        if (metadata.getContentMD5() != null) {
            metadata.addUserMetadata(Headers.UNENCRYPTED_CONTENT_MD5, metadata.getContentMD5());
        }
        metadata.setContentMD5(null);
        if (metadata.getContentLength() != 0) {
            metadata.addUserMetadata(Headers.UNENCRYPTED_CONTENT_LENGTH, Long.toString(metadata.getContentLength()));
            metadata.setContentLength(0L);
        }
        initMultipartUploadRequest.setMetadata(metadata);
        return initMultipartUploadRequest;
    }

    abstract CipherLite cipherLiteForNextPart(MultipartUploadCryptoContext multipartUploadCryptoContext);

    protected abstract long ciphertextLength(long j10);

    @Override // com.tencent.cos.xml.crypto.CryptoModule
    public CompleteMultiUploadResult completeMultipartUploadSecurely(CompleteMultiUploadRequest completeMultiUploadRequest) throws CosXmlServiceException, CosXmlClientException {
        String uploadId = completeMultiUploadRequest.getUploadId();
        MultipartUploadCryptoContext multipartUploadCryptoContext = this.multipartUploadContexts.get(uploadId);
        if (multipartUploadCryptoContext != null && !multipartUploadCryptoContext.hasFinalPartBeenSeen()) {
            throw CosXmlClientException.internalException("Unable to complete an encrypted multipart upload without being told which part was the last.  Without knowing which part was the last, the encrypted data in COS is incomplete and corrupt.");
        }
        CompleteMultiUploadResult completeMultiUploadResultCompleteMultiUpload = this.cos.completeMultiUpload(completeMultiUploadRequest);
        this.multipartUploadContexts.remove(uploadId);
        return completeMultiUploadResultCompleteMultiUpload;
    }

    abstract long computeLastPartSize(UploadPartRequest uploadPartRequest);

    protected final ContentCryptoMaterial createContentCryptoMaterial(CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        return newContentCryptoMaterial(this.kekMaterialsProvider, null, cosXmlRequest);
    }

    protected final SecretKey generateCEK(EncryptionMaterials encryptionMaterials, Provider provider) throws CosXmlClientException {
        boolean zEquals;
        String keyGeneratorAlgorithm = this.contentCryptoScheme.getKeyGeneratorAlgorithm();
        try {
            KeyGenerator keyGenerator = provider == null ? KeyGenerator.getInstance(keyGeneratorAlgorithm) : KeyGenerator.getInstance(keyGeneratorAlgorithm, provider);
            keyGenerator.init(this.contentCryptoScheme.getKeyLengthInBits(), this.cryptoScheme.getSecureRandom());
            KeyPair keyPair = encryptionMaterials.getKeyPair();
            if (keyPair == null || this.cryptoScheme.getKeyWrapScheme().getKeyWrapAlgorithm(keyPair.getPublic()) != null) {
                zEquals = false;
            } else {
                Provider provider2 = keyGenerator.getProvider();
                zEquals = "BC".equals(provider2 == null ? null : provider2.getName());
            }
            SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
            if (zEquals && secretKeyGenerateKey.getEncoded()[0] == 0) {
                for (int i10 = 0; i10 < 10; i10++) {
                    SecretKey secretKeyGenerateKey2 = keyGenerator.generateKey();
                    if (secretKeyGenerateKey2.getEncoded()[0] != 0) {
                        return secretKeyGenerateKey2;
                    }
                }
                throw CosXmlClientException.internalException("Failed to generate secret key");
            }
            return secretKeyGenerateKey;
        } catch (NoSuchAlgorithmException e10) {
            throw CosXmlClientException.internalException("Unable to generate envelope symmetric key:" + e10.getMessage());
        }
    }

    public final COSCryptoScheme getCOSCryptoScheme() {
        return this.cryptoScheme;
    }

    public MultipartUploadCryptoContext getCryptoContext(String str) {
        return this.multipartUploadContexts.get(str);
    }

    public boolean hasMultipartUploadContext(String str) {
        return this.multipartUploadContexts.containsKey(str);
    }

    @Override // com.tencent.cos.xml.crypto.CryptoModule
    public InitMultipartUploadResult initMultipartUploadSecurely(InitMultipartUploadRequest initMultipartUploadRequest) throws CosXmlServiceException, CosXmlClientException {
        cipherInitMultipartUploadRequest(initMultipartUploadRequest);
        ContentCryptoMaterial contentCryptoMaterialCreateContentCryptoMaterial = createContentCryptoMaterial(initMultipartUploadRequest);
        ObjectMetadata metadata = initMultipartUploadRequest.getMetadata();
        if (metadata == null) {
            metadata = new ObjectMetadata();
        }
        initMultipartUploadRequest.setMetadata(updateMetadataWithContentCryptoMaterial(metadata, contentCryptoMaterialCreateContentCryptoMaterial));
        InitMultipartUploadResult initMultipartUploadResultInitMultipartUpload = this.cos.initMultipartUpload(initMultipartUploadRequest);
        this.multipartUploadContexts.put(initMultipartUploadResultInitMultipartUpload.initMultipartUpload.uploadId, newUploadContext(initMultipartUploadRequest, contentCryptoMaterialCreateContentCryptoMaterial));
        return initMultipartUploadResultInitMultipartUpload;
    }

    public CipherLiteInputStream newCOSCipherLiteInputStream(PutObjectRequest putObjectRequest, CipherLite cipherLite) throws CosXmlClientException {
        try {
            InputStream inputStreamOpenInputStream = openInputStream(putObjectRequest);
            return cipherLite.markSupported() ? new CipherLiteInputStream(inputStreamOpenInputStream, cipherLite, 2048) : new RenewableCipherLiteInputStream(inputStreamOpenInputStream, cipherLite, 2048);
        } catch (Exception e10) {
            throw CosXmlClientException.internalException("Unable to create cipher input stream: " + e10.getMessage());
        }
    }

    public final CipherLiteInputStream newMultipartCOSCipherInputStream(UploadPartRequest uploadPartRequest, CipherLite cipherLite) throws CosXmlClientException {
        InputStream inputStreamOpenInputStream;
        String srcPath = uploadPartRequest.getSrcPath();
        Uri uri = uploadPartRequest.getUri();
        try {
            if (TextUtils.isEmpty(srcPath)) {
                inputStreamOpenInputStream = (uri == null || ContextHolder.getAppContext() == null) ? null : ContextHolder.getAppContext().getContentResolver().openInputStream(uri);
            } else {
                inputStreamOpenInputStream = new ResettableInputStream(srcPath);
            }
            InputSubstream inputSubstream = new InputSubstream(inputStreamOpenInputStream, uploadPartRequest.getFileOffset(), uploadPartRequest.getFileContentLength(), uploadPartRequest.isLastPart());
            return cipherLite.markSupported() ? new CipherLiteInputStream(inputSubstream, cipherLite, 2048, true, uploadPartRequest.isLastPart()) : new RenewableCipherLiteInputStream(inputSubstream, cipherLite, 2048, true, uploadPartRequest.isLastPart());
        } catch (Exception e10) {
            throw CosXmlClientException.internalException("Unable to create cipher input stream: " + e10.getMessage());
        }
    }

    abstract MultipartUploadCryptoContext newUploadContext(InitMultipartUploadRequest initMultipartUploadRequest, ContentCryptoMaterial contentCryptoMaterial);

    protected final long plaintextLength(PutObjectRequest putObjectRequest, ObjectMetadata objectMetadata) {
        Context appContext;
        String srcPath = putObjectRequest.getSrcPath();
        Uri uri = putObjectRequest.getUri();
        if (!TextUtils.isEmpty(srcPath)) {
            return new File(srcPath).length();
        }
        if (uri == null || (appContext = ContextHolder.getAppContext()) == null) {
            return -1L;
        }
        return QCloudUtils.getUriContentLength2(uri, appContext.getContentResolver());
    }

    @Override // com.tencent.cos.xml.crypto.CryptoModule
    public PutObjectResult putObjectSecurely(PutObjectRequest putObjectRequest) throws CosXmlServiceException, CosXmlClientException {
        ContentCryptoMaterial contentCryptoMaterialCreateContentCryptoMaterial = createContentCryptoMaterial(putObjectRequest);
        PutObjectRequest putObjectRequestWrapWithCipher = wrapWithCipher(putObjectRequest, contentCryptoMaterialCreateContentCryptoMaterial);
        putObjectRequest.setMetadata(updateMetadataWithContentCryptoMaterial(putObjectRequest.getMetadata(), contentCryptoMaterialCreateContentCryptoMaterial));
        return this.cos.putObject(putObjectRequestWrapWithCipher);
    }

    protected final ObjectMetadata updateMetadataWithContentCryptoMaterial(ObjectMetadata objectMetadata, ContentCryptoMaterial contentCryptoMaterial) throws CosXmlClientException {
        if (objectMetadata == null) {
            objectMetadata = new ObjectMetadata();
        }
        try {
            return contentCryptoMaterial.toObjectMetadata(objectMetadata);
        } catch (JSONException e10) {
            throw CosXmlClientException.internalException(e10.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    @Override // com.tencent.cos.xml.crypto.CryptoModule
    public void uploadPartAsyncSecurely(UploadPartRequest uploadPartRequest, CosXmlResultListener cosXmlResultListener) throws Throwable {
        MultipartUploadCryptoContext multipartUploadCryptoContext;
        boolean zIsLastPart = uploadPartRequest.isLastPart();
        MultipartUploadCryptoContext multipartUploadCryptoContext2 = null;
        try {
            int blockSizeInBytes = this.contentCryptoScheme.getBlockSizeInBytes();
            String uploadId = uploadPartRequest.getUploadId();
            boolean z10 = 0 == uploadPartRequest.getFileLength() % ((long) blockSizeInBytes);
            if (!zIsLastPart && !z10) {
                throw CosXmlClientException.internalException("Invalid part size: part sizes for encrypted multipart uploads must be multiples of the cipher block size (" + blockSizeInBytes + ") with the exception of the last part.");
            }
            MultipartUploadCryptoContext multipartUploadCryptoContext3 = this.multipartUploadContexts.get(uploadId);
            try {
                if (multipartUploadCryptoContext3 == null) {
                    throw CosXmlClientException.internalException("No client-side information available on upload ID " + uploadId);
                }
                multipartUploadCryptoContext3.beginPartUpload(uploadPartRequest.getPartNumber());
                uploadPartRequest.setInputStream(newMultipartCOSCipherInputStream(uploadPartRequest, cipherLiteForNextPart(multipartUploadCryptoContext3)));
                uploadPartRequest.setSrcPath(null);
                uploadPartRequest.setFileOffset(0L);
                if (zIsLastPart) {
                    long jComputeLastPartSize = computeLastPartSize(uploadPartRequest);
                    if (jComputeLastPartSize > -1) {
                        uploadPartRequest.setFileContentLength(jComputeLastPartSize);
                    }
                    if (multipartUploadCryptoContext3.hasFinalPartBeenSeen()) {
                        throw CosXmlClientException.internalException("This part was specified as the last part in a multipart upload, but a previous part was already marked as the last part.  Only the last part of the upload should be marked as the last part.");
                    }
                }
                this.cos.uploadPartAsync(uploadPartRequest, cosXmlResultListener);
                multipartUploadCryptoContext3.endPartUpload();
                if (!zIsLastPart || multipartUploadCryptoContext3 == null) {
                    return;
                }
                multipartUploadCryptoContext3.setHasFinalPartBeenSeen(true);
            } catch (CosXmlClientException e10) {
                multipartUploadCryptoContext = multipartUploadCryptoContext3;
                e = e10;
                try {
                    cosXmlResultListener.onFail(uploadPartRequest, e, null);
                    if (multipartUploadCryptoContext != null) {
                        multipartUploadCryptoContext.endPartUpload();
                    }
                    multipartUploadCryptoContext3 = multipartUploadCryptoContext;
                } catch (Throwable th2) {
                    th = th2;
                    multipartUploadCryptoContext2 = multipartUploadCryptoContext;
                    if (multipartUploadCryptoContext2 != null) {
                        multipartUploadCryptoContext2.endPartUpload();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                multipartUploadCryptoContext2 = multipartUploadCryptoContext3;
                if (multipartUploadCryptoContext2 != null) {
                    multipartUploadCryptoContext2.endPartUpload();
                }
                throw th;
            }
        } catch (CosXmlClientException e11) {
            e = e11;
            multipartUploadCryptoContext = null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.tencent.cos.xml.crypto.CryptoModule
    public UploadPartResult uploadPartSecurely(UploadPartRequest uploadPartRequest) throws CosXmlServiceException, CosXmlClientException {
        int blockSizeInBytes = this.contentCryptoScheme.getBlockSizeInBytes();
        boolean zIsLastPart = uploadPartRequest.isLastPart();
        String uploadId = uploadPartRequest.getUploadId();
        boolean z10 = 0 == uploadPartRequest.getFileLength() % ((long) blockSizeInBytes);
        if (!zIsLastPart && !z10) {
            throw CosXmlClientException.internalException("Invalid part size: part sizes for encrypted multipart uploads must be multiples of the cipher block size (" + blockSizeInBytes + ") with the exception of the last part.");
        }
        MultipartUploadCryptoContext multipartUploadCryptoContext = this.multipartUploadContexts.get(uploadId);
        if (multipartUploadCryptoContext == null) {
            throw CosXmlClientException.internalException("No client-side information available on upload ID " + uploadId);
        }
        multipartUploadCryptoContext.beginPartUpload(uploadPartRequest.getPartNumber());
        try {
            uploadPartRequest.setInputStream(newMultipartCOSCipherInputStream(uploadPartRequest, cipherLiteForNextPart(multipartUploadCryptoContext)));
            uploadPartRequest.setSrcPath(null);
            uploadPartRequest.setFileOffset(0L);
            if (zIsLastPart) {
                long jComputeLastPartSize = computeLastPartSize(uploadPartRequest);
                if (jComputeLastPartSize > -1) {
                    uploadPartRequest.setFileContentLength(jComputeLastPartSize);
                }
                if (multipartUploadCryptoContext.hasFinalPartBeenSeen()) {
                    throw CosXmlClientException.internalException("This part was specified as the last part in a multipart upload, but a previous part was already marked as the last part.  Only the last part of the upload should be marked as the last part.");
                }
            }
            UploadPartResult uploadPartResultUploadPart = this.cos.uploadPart(uploadPartRequest);
            multipartUploadCryptoContext.endPartUpload();
            if (zIsLastPart) {
                multipartUploadCryptoContext.setHasFinalPartBeenSeen(true);
            }
            return uploadPartResultUploadPart;
        } catch (Throwable th2) {
            multipartUploadCryptoContext.endPartUpload();
            throw th2;
        }
    }

    protected final PutObjectRequest wrapWithCipher(PutObjectRequest putObjectRequest, ContentCryptoMaterial contentCryptoMaterial) throws CosXmlClientException {
        ObjectMetadata metadata = putObjectRequest.getMetadata();
        if (metadata == null) {
            metadata = new ObjectMetadata();
        }
        String contentMD5 = metadata.getContentMD5();
        if (TextUtils.isEmpty(contentMD5)) {
            try {
                InputStream inputStreamOpenInputStream = openInputStream(putObjectRequest);
                if (inputStreamOpenInputStream != null) {
                    contentMD5 = DigestUtils.getCOSMd5(inputStreamOpenInputStream, 0L, -1L);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        if (contentMD5 != null) {
            metadata.addUserMetadata(Headers.UNENCRYPTED_CONTENT_MD5, contentMD5);
        }
        metadata.setContentMD5(null);
        long jPlaintextLength = plaintextLength(putObjectRequest, metadata);
        if (jPlaintextLength >= 0) {
            metadata.addUserMetadata(Headers.UNENCRYPTED_CONTENT_LENGTH, Long.toString(jPlaintextLength));
            metadata.setContentLength(ciphertextLength(jPlaintextLength));
        }
        putObjectRequest.setMetadata(metadata);
        putObjectRequest.setInputStream(newCOSCipherLiteInputStream(putObjectRequest, contentCryptoMaterial, jPlaintextLength));
        putObjectRequest.setSrcPath(null);
        return putObjectRequest;
    }
}
