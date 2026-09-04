package com.tencent.cos.xml.crypto;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.s3.Base64;
import com.tencentcloudapi.kms.v20190118.models.DecryptRequest;
import com.tencentcloudapi.kms.v20190118.models.EncryptRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentCryptoMaterial {
    private final CipherLite cipherLite;
    private final byte[] encryptedCEK;
    private final Map<String, String> kekMaterialsDescription;
    private final String keyWrappingAlgorithm;

    ContentCryptoMaterial(Map<String, String> map, byte[] bArr, String str, CipherLite cipherLite) {
        this.cipherLite = cipherLite;
        this.keyWrappingAlgorithm = str;
        this.encryptedCEK = (byte[]) bArr.clone();
        this.kekMaterialsDescription = map;
    }

    private static SecretKey cek(byte[] bArr, String str, EncryptionMaterials encryptionMaterials, Provider provider, ContentCryptoScheme contentCryptoScheme, QCLOUDKMS qcloudkms) throws CosXmlClientException {
        Key symmetricKey;
        if (KMSSecuredCEK.isKMSKeyWrapped(str)) {
            return cekByKMS(bArr, str, encryptionMaterials, contentCryptoScheme, qcloudkms);
        }
        if (encryptionMaterials.getKeyPair() != null) {
            symmetricKey = encryptionMaterials.getKeyPair().getPrivate();
            if (symmetricKey == null) {
                throw CosXmlClientException.internalException("Key encrypting key not available");
            }
        } else {
            symmetricKey = encryptionMaterials.getSymmetricKey();
            if (symmetricKey == null) {
                throw CosXmlClientException.internalException("Key encrypting key not available");
            }
        }
        try {
            if (str != null) {
                Cipher cipher = provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
                cipher.init(4, symmetricKey);
                return (SecretKey) cipher.unwrap(bArr, str, 3);
            }
            Cipher cipher2 = provider != null ? Cipher.getInstance(symmetricKey.getAlgorithm(), provider) : Cipher.getInstance(symmetricKey.getAlgorithm());
            cipher2.init(2, symmetricKey);
            return new SecretKeySpec(cipher2.doFinal(bArr), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        } catch (Exception unused) {
            throw CosXmlClientException.internalException("Unable to decrypt symmetric key from object metadata");
        }
    }

    private static SecretKey cekByKMS(byte[] bArr, String str, EncryptionMaterials encryptionMaterials, ContentCryptoScheme contentCryptoScheme, QCLOUDKMS qcloudkms) throws CosXmlClientException {
        DecryptRequest decryptRequest = new DecryptRequest();
        try {
            decryptRequest.setEncryptionContext(JSONUtils.toJsonString(encryptionMaterials.getMaterialsDescription()));
            decryptRequest.setCiphertextBlob(new String(bArr));
            return new SecretKeySpec(Base64.decode(qcloudkms.decrypt(decryptRequest).getPlaintext()), contentCryptoScheme.getKeyGeneratorAlgorithm());
        } catch (JSONException unused) {
            throw CosXmlClientException.internalException("decrypt request set encryption context got json processing exception");
        }
    }

    private static String convertStreamToString(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    inputStream.close();
                    return sb2.toString();
                }
                sb2.append(line);
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    static ContentCryptoMaterial create(SecretKey secretKey, byte[] bArr, EncryptionMaterials encryptionMaterials, COSCryptoScheme cOSCryptoScheme, Provider provider, QCLOUDKMS qcloudkms, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        return doCreate(secretKey, bArr, encryptionMaterials, cOSCryptoScheme.getContentCryptoScheme(), cOSCryptoScheme, provider, qcloudkms, cosXmlRequest);
    }

    static ContentCryptoMaterial create(SecretKey secretKey, byte[] bArr, EncryptionMaterials encryptionMaterials, ContentCryptoScheme contentCryptoScheme, COSCryptoScheme cOSCryptoScheme, Provider provider, QCLOUDKMS qcloudkms, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        return doCreate(secretKey, bArr, encryptionMaterials, contentCryptoScheme, cOSCryptoScheme, provider, qcloudkms, cosXmlRequest);
    }

    private static ContentCryptoMaterial doCreate(SecretKey secretKey, byte[] bArr, EncryptionMaterials encryptionMaterials, ContentCryptoScheme contentCryptoScheme, COSCryptoScheme cOSCryptoScheme, Provider provider, QCLOUDKMS qcloudkms, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        return wrap(secretKey, bArr, contentCryptoScheme, provider, secureCEK(secretKey, encryptionMaterials, cOSCryptoScheme.getKeyWrapScheme(), cOSCryptoScheme.getSecureRandom(), provider, qcloudkms, cosXmlRequest));
    }

    static ContentCryptoMaterial fromObjectMetadata(ObjectMetadata objectMetadata, EncryptionMaterialsAccessor encryptionMaterialsAccessor, Provider provider, boolean z10, QCLOUDKMS qcloudkms) throws JSONException, CosXmlClientException {
        return fromObjectMetadata0(objectMetadata, encryptionMaterialsAccessor, provider, null, z10, qcloudkms);
    }

    static ContentCryptoMaterial fromObjectMetadata(ObjectMetadata objectMetadata, EncryptionMaterialsAccessor encryptionMaterialsAccessor, Provider provider, long[] jArr, boolean z10, QCLOUDKMS qcloudkms) throws JSONException, CosXmlClientException {
        return fromObjectMetadata0(objectMetadata, encryptionMaterialsAccessor, provider, jArr, z10, qcloudkms);
    }

    private static ContentCryptoMaterial fromObjectMetadata0(ObjectMetadata objectMetadata, EncryptionMaterialsAccessor encryptionMaterialsAccessor, Provider provider, long[] jArr, boolean z10, QCLOUDKMS qcloudkms) throws JSONException, CosXmlClientException {
        EncryptionMaterials encryptionMaterials;
        int i10;
        Map<String, String> userMetadata = objectMetadata.getUserMetadata();
        String str = userMetadata.get("x-cos-meta-client-side-encryption-key");
        if (str == null && (str = userMetadata.get("x-cos-meta-client-side-encryption-key")) == null) {
            throw CosXmlClientException.internalException("Content encrypting key not found.");
        }
        byte[] bArrDecode = Base64.decode(str);
        byte[] bArrDecode2 = Base64.decode(userMetadata.get(Headers.CRYPTO_IV));
        if (bArrDecode == null || bArrDecode2 == null) {
            throw CosXmlClientException.internalException("Content encrypting key or IV not found.");
        }
        String str2 = userMetadata.get(Headers.MATERIALS_DESCRIPTION);
        String str3 = userMetadata.get(Headers.CRYPTO_KEYWRAP_ALGORITHM);
        boolean zIsKMSKeyWrapped = KMSSecuredCEK.isKMSKeyWrapped(str3);
        Map<String, String> mapMatdescFromJson = matdescFromJson(str2);
        if (zIsKMSKeyWrapped) {
            encryptionMaterials = new KMSEncryptionMaterials(mapMatdescFromJson.get(KMSEncryptionMaterials.CUSTOMER_MASTER_KEY_ID));
            encryptionMaterials.addDescriptions(mapMatdescFromJson);
        } else {
            encryptionMaterials = encryptionMaterialsAccessor == null ? null : encryptionMaterialsAccessor.getEncryptionMaterials(mapMatdescFromJson);
            if (encryptionMaterials == null) {
                throw CosXmlClientException.internalException("Unable to retrieve the client encryption materials");
            }
        }
        EncryptionMaterials encryptionMaterials2 = encryptionMaterials;
        String str4 = userMetadata.get(Headers.CRYPTO_CEK_ALGORITHM);
        boolean z11 = jArr != null;
        ContentCryptoScheme contentCryptoSchemeFromCEKAlgo = ContentCryptoScheme.fromCEKAlgo(str4);
        if (z11) {
            bArrDecode2 = contentCryptoSchemeFromCEKAlgo.adjustIV(bArrDecode2, jArr[0]);
        } else {
            int tagLengthInBits = contentCryptoSchemeFromCEKAlgo.getTagLengthInBits();
            if (tagLengthInBits > 0 && tagLengthInBits != (i10 = Integer.parseInt(userMetadata.get(Headers.CRYPTO_TAG_LENGTH)))) {
                throw CosXmlClientException.internalException("Unsupported tag length: " + i10 + ", expected: " + tagLengthInBits);
            }
        }
        if (z10 && str3 == null) {
            throw newKeyWrapException();
        }
        return new ContentCryptoMaterial(mapMatdescFromJson, bArrDecode, str3, contentCryptoSchemeFromCEKAlgo.createCipherLite(cek(bArrDecode, str3, encryptionMaterials2, provider, contentCryptoSchemeFromCEKAlgo, qcloudkms), bArrDecode2, 2, provider));
    }

    private String kekMaterialDescAsJson() throws JSONException {
        Map<String, String> kEKMaterialsDescription = getKEKMaterialsDescription();
        if (kEKMaterialsDescription == null) {
            kEKMaterialsDescription = Collections.emptyMap();
        }
        return JSONUtils.toJsonString(kEKMaterialsDescription);
    }

    private static Map<String, String> matdescFromJson(String str) throws JSONException {
        Map<String, String> map = JSONUtils.toMap(str);
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static Map<String, String> mergeMaterialDescriptions(EncryptionMaterials encryptionMaterials, CosXmlRequest cosXmlRequest) {
        Map<String, String> materialsDescription;
        Map<String, String> materialsDescription2 = encryptionMaterials.getMaterialsDescription();
        if (!(cosXmlRequest instanceof MaterialsDescriptionProvider) || (materialsDescription = ((MaterialsDescriptionProvider) cosXmlRequest).getMaterialsDescription()) == null) {
            return materialsDescription2;
        }
        TreeMap treeMap = new TreeMap(materialsDescription2);
        treeMap.putAll(materialsDescription);
        return treeMap;
    }

    private static CosXmlClientException newKeyWrapException() throws CosXmlClientException {
        return CosXmlClientException.internalException("Missing key-wrap for the content-encrypting-key");
    }

    private static SecuredCEK secureCEK(SecretKey secretKey, EncryptionMaterials encryptionMaterials, COSKeyWrapScheme cOSKeyWrapScheme, SecureRandom secureRandom, Provider provider, QCLOUDKMS qcloudkms, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        if (encryptionMaterials.isKMSEnabled()) {
            Map<String, String> mapMergeMaterialDescriptions = mergeMaterialDescriptions(encryptionMaterials, cosXmlRequest);
            EncryptRequest encryptRequest = new EncryptRequest();
            try {
                encryptRequest.setEncryptionContext(JSONUtils.toJsonString(mapMergeMaterialDescriptions));
                encryptRequest.setKeyId(encryptionMaterials.getCustomerMasterKeyId());
                encryptRequest.setPlaintext(secretKey.getEncoded().toString());
                return new KMSSecuredCEK(qcloudkms.encrypt(encryptRequest).getCiphertextBlob().getBytes(), mapMergeMaterialDescriptions);
            } catch (JSONException unused) {
                throw CosXmlClientException.internalException("encrypt request set encryption context got json processing exception");
            }
        }
        Map<String, String> materialsDescription = encryptionMaterials.getMaterialsDescription();
        Key key = encryptionMaterials.getKeyPair() != null ? encryptionMaterials.getKeyPair().getPublic() : encryptionMaterials.getSymmetricKey();
        String keyWrapAlgorithm = cOSKeyWrapScheme.getKeyWrapAlgorithm(key);
        try {
            Cipher cipher = provider == null ? Cipher.getInstance(keyWrapAlgorithm) : Cipher.getInstance(keyWrapAlgorithm, provider);
            cipher.init(3, key, secureRandom);
            return new SecuredCEK(cipher.wrap(secretKey), keyWrapAlgorithm, materialsDescription);
        } catch (Exception unused2) {
            throw CosXmlClientException.internalException("Unable to encrypt symmetric key");
        }
    }

    private boolean usesKMSKey() {
        return KMSSecuredCEK.isKMSKeyWrapped(this.keyWrappingAlgorithm);
    }

    public static ContentCryptoMaterial wrap(SecretKey secretKey, byte[] bArr, ContentCryptoScheme contentCryptoScheme, Provider provider, SecuredCEK securedCEK) throws CosXmlClientException {
        return new ContentCryptoMaterial(securedCEK.getMaterialDescription(), securedCEK.getEncrypted(), securedCEK.getKeyWrapAlgorithm(), contentCryptoScheme.createCipherLite(secretKey, bArr, 1, provider));
    }

    public CipherLite getCipherLite() {
        return this.cipherLite;
    }

    ContentCryptoScheme getContentCryptoScheme() {
        return this.cipherLite.getContentCryptoScheme();
    }

    byte[] getEncryptedCEK() {
        return (byte[]) this.encryptedCEK.clone();
    }

    Map<String, String> getKEKMaterialsDescription() {
        return this.kekMaterialsDescription;
    }

    String getKeyWrappingAlgorithm() {
        return this.keyWrappingAlgorithm;
    }

    ContentCryptoMaterial recreate(EncryptionMaterials encryptionMaterials, EncryptionMaterialsAccessor encryptionMaterialsAccessor, COSCryptoScheme cOSCryptoScheme, Provider provider, QCLOUDKMS qcloudkms, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        EncryptionMaterials encryptionMaterials2;
        if (!usesKMSKey() && encryptionMaterials.getMaterialsDescription().equals(this.kekMaterialsDescription)) {
            throw new SecurityException("Material description of the new KEK must differ from the current one");
        }
        if (usesKMSKey()) {
            encryptionMaterials2 = new KMSEncryptionMaterials(this.kekMaterialsDescription.get(KMSEncryptionMaterials.CUSTOMER_MASTER_KEY_ID));
        } else {
            encryptionMaterials2 = encryptionMaterialsAccessor.getEncryptionMaterials(this.kekMaterialsDescription);
            if (encryptionMaterials2 == null) {
                throw CosXmlClientException.internalException("Unable to retrieve the origin encryption materials");
            }
        }
        ContentCryptoMaterial contentCryptoMaterialCreate = create(cek(this.encryptedCEK, this.keyWrappingAlgorithm, encryptionMaterials2, provider, getContentCryptoScheme(), qcloudkms), this.cipherLite.getIV(), encryptionMaterials, getContentCryptoScheme(), cOSCryptoScheme, provider, qcloudkms, cosXmlRequest);
        if (Arrays.equals(contentCryptoMaterialCreate.encryptedCEK, this.encryptedCEK)) {
            throw new SecurityException("The new KEK must differ from the original");
        }
        return contentCryptoMaterialCreate;
    }

    ContentCryptoMaterial recreate(Map<String, String> map, EncryptionMaterialsAccessor encryptionMaterialsAccessor, COSCryptoScheme cOSCryptoScheme, Provider provider, QCLOUDKMS qcloudkms, CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        EncryptionMaterials encryptionMaterials;
        if (!usesKMSKey() && map.equals(this.kekMaterialsDescription)) {
            throw new SecurityException("Material description of the new KEK must differ from the current one");
        }
        if (usesKMSKey()) {
            encryptionMaterials = new KMSEncryptionMaterials(this.kekMaterialsDescription.get(KMSEncryptionMaterials.CUSTOMER_MASTER_KEY_ID));
        } else {
            encryptionMaterials = encryptionMaterialsAccessor.getEncryptionMaterials(this.kekMaterialsDescription);
            if (encryptionMaterials == null) {
                throw CosXmlClientException.internalException("Unable to retrieve the origin encryption materials");
            }
        }
        EncryptionMaterials encryptionMaterials2 = encryptionMaterials;
        EncryptionMaterials encryptionMaterials3 = encryptionMaterialsAccessor.getEncryptionMaterials(map);
        if (encryptionMaterials3 != null) {
            ContentCryptoMaterial contentCryptoMaterialCreate = create(cek(this.encryptedCEK, this.keyWrappingAlgorithm, encryptionMaterials2, provider, getContentCryptoScheme(), qcloudkms), this.cipherLite.getIV(), encryptionMaterials3, getContentCryptoScheme(), cOSCryptoScheme, provider, qcloudkms, cosXmlRequest);
            if (Arrays.equals(contentCryptoMaterialCreate.encryptedCEK, this.encryptedCEK)) {
                throw new SecurityException("The new KEK must differ from the original");
            }
            return contentCryptoMaterialCreate;
        }
        throw CosXmlClientException.internalException("No material available with the description " + map + " from the encryption material provider");
    }

    String toJsonString() throws JSONException {
        HashMap map = new HashMap();
        map.put("x-cos-meta-client-side-encryption-key", Base64.encodeAsString(getEncryptedCEK()));
        map.put(Headers.CRYPTO_IV, Base64.encodeAsString(this.cipherLite.getIV()));
        map.put(Headers.MATERIALS_DESCRIPTION, kekMaterialDescAsJson());
        ContentCryptoScheme contentCryptoScheme = getContentCryptoScheme();
        map.put(Headers.CRYPTO_CEK_ALGORITHM, contentCryptoScheme.getCipherAlgorithm());
        int tagLengthInBits = contentCryptoScheme.getTagLengthInBits();
        if (tagLengthInBits > 0) {
            map.put(Headers.CRYPTO_TAG_LENGTH, String.valueOf(tagLengthInBits));
        }
        String keyWrappingAlgorithm = getKeyWrappingAlgorithm();
        if (keyWrappingAlgorithm != null) {
            map.put(Headers.CRYPTO_KEYWRAP_ALGORITHM, keyWrappingAlgorithm);
        }
        return JSONUtils.toJsonString(map);
    }

    ObjectMetadata toObjectMetadata(ObjectMetadata objectMetadata) throws JSONException {
        objectMetadata.addUserMetadata("x-cos-meta-client-side-encryption-key", Base64.encodeAsString(getEncryptedCEK()));
        objectMetadata.addUserMetadata(Headers.CRYPTO_IV, Base64.encodeAsString(this.cipherLite.getIV()));
        objectMetadata.addUserMetadata(Headers.MATERIALS_DESCRIPTION, kekMaterialDescAsJson());
        ContentCryptoScheme contentCryptoScheme = getContentCryptoScheme();
        objectMetadata.addUserMetadata(Headers.CRYPTO_CEK_ALGORITHM, contentCryptoScheme.getCipherAlgorithm());
        int tagLengthInBits = contentCryptoScheme.getTagLengthInBits();
        if (tagLengthInBits > 0) {
            objectMetadata.addUserMetadata(Headers.CRYPTO_TAG_LENGTH, String.valueOf(tagLengthInBits));
        }
        String keyWrappingAlgorithm = getKeyWrappingAlgorithm();
        if (keyWrappingAlgorithm != null) {
            objectMetadata.addUserMetadata(Headers.CRYPTO_KEYWRAP_ALGORITHM, keyWrappingAlgorithm);
        }
        return objectMetadata;
    }
}
