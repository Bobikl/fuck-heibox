package com.tencent.cos.xml.transfer;

import com.tencent.cos.xml.CosXmlService;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.CompleteMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadResult;
import com.tencent.cos.xml.model.object.CopyObjectRequest;
import com.tencent.cos.xml.model.object.CopyObjectResult;
import com.tencent.cos.xml.model.object.HeadObjectRequest;
import com.tencent.cos.xml.model.object.HeadObjectResult;
import com.tencent.cos.xml.model.object.InitMultipartUploadRequest;
import com.tencent.cos.xml.model.object.UploadPartCopyRequest;
import com.tencent.cos.xml.model.object.UploadPartCopyResult;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class CopyObjectService {
    private CosXmlService cosXmlService;
    private String sourceCustomerKey;
    private String sourceCustomerKeyId;
    private String sourceJsonContent;
    private long maxSliceSize = 5242880;
    private UploadService.EncryptionType encryptionType = UploadService.EncryptionType.NONE;

    /* JADX INFO: renamed from: com.tencent.cos.xml.transfer.CopyObjectService$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$cos$xml$transfer$UploadService$EncryptionType;

        static {
            int[] iArr = new int[UploadService.EncryptionType.values().length];
            $SwitchMap$com$tencent$cos$xml$transfer$UploadService$EncryptionType = iArr;
            try {
                iArr[UploadService.EncryptionType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$UploadService$EncryptionType[UploadService.EncryptionType.SSEC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$cos$xml$transfer$UploadService$EncryptionType[UploadService.EncryptionType.SSEKMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class CopyServerResult extends CosXmlResult {
        public String eTag;
    }

    public CopyObjectService(CosXmlService cosXmlService) {
        this.cosXmlService = cosXmlService;
    }

    private CompleteMultiUploadResult completeMultipart(String str, String str2, String str3, Map<Integer, String> map) throws CosXmlServiceException, CosXmlClientException {
        return this.cosXmlService.completeMultiUpload(new CompleteMultiUploadRequest(str, str2, str3, map));
    }

    private CompleteMultiUploadResult copyObjectForLargeFile(String str, String str2, CopyObjectRequest.CopySourceStruct copySourceStruct, long j10) throws CosXmlServiceException, CosXmlClientException {
        String strInitMultiUpload = initMultiUpload(str, str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j11 = this.maxSliceSize;
        long j12 = -1;
        int i10 = 1;
        while (true) {
            long j13 = j10 - 1;
            if (j12 >= j13) {
                return completeMultipart(str, str2, strInitMultiUpload, linkedHashMap);
            }
            long j14 = j12 + 1;
            long j15 = j12 + j11;
            long j16 = j15 >= j13 ? j13 : j15;
            linkedHashMap.put(Integer.valueOf(i10), copyObjectForLargeFile(str, str2, i10, strInitMultiUpload, copySourceStruct, j14, j16).copyObject.eTag);
            i10++;
            j12 = j16;
        }
    }

    private UploadPartCopyResult copyObjectForLargeFile(String str, String str2, int i10, String str3, CopyObjectRequest.CopySourceStruct copySourceStruct, long j10, long j11) throws CosXmlServiceException, CosXmlClientException {
        UploadPartCopyRequest uploadPartCopyRequest = new UploadPartCopyRequest(str, str2, i10, str3, copySourceStruct, j10, j11);
        setCopySourceEncryptionRequest(uploadPartCopyRequest);
        return this.cosXmlService.copyObject(uploadPartCopyRequest);
    }

    private CopyObjectResult copyObjectForSmallFile(String str, String str2, CopyObjectRequest.CopySourceStruct copySourceStruct) throws CosXmlServiceException, CosXmlClientException {
        CopyObjectRequest copyObjectRequest = new CopyObjectRequest(str, str2, copySourceStruct);
        setCopySourceEncryptionRequest(copyObjectRequest);
        return this.cosXmlService.copyObject(copyObjectRequest);
    }

    private long headObject(String str, String str2) throws CosXmlServiceException, CosXmlClientException {
        HeadObjectRequest headObjectRequest = new HeadObjectRequest(str, str2);
        setCopySourceEncryptionRequest(headObjectRequest);
        HeadObjectResult headObjectResultHeadObject = this.cosXmlService.headObject(headObjectRequest);
        if (headObjectResultHeadObject != null) {
            return Long.valueOf(headObjectResultHeadObject.headers.get("Content-Length").get(0)).longValue();
        }
        return -1L;
    }

    private String initMultiUpload(String str, String str2) throws CosXmlServiceException, CosXmlClientException {
        return this.cosXmlService.initMultipartUpload(new InitMultipartUploadRequest(str, str2)).initMultipartUpload.uploadId;
    }

    private void setCopySourceEncryptionRequest(CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        if (cosXmlRequest == null) {
            return;
        }
        int i10 = AnonymousClass1.$SwitchMap$com$tencent$cos$xml$transfer$UploadService$EncryptionType[this.encryptionType.ordinal()];
        if (i10 == 2) {
            if (cosXmlRequest instanceof HeadObjectRequest) {
                ((HeadObjectRequest) cosXmlRequest).setCOSServerSideEncryptionWithCustomerKey(this.sourceCustomerKey);
                return;
            } else {
                if (cosXmlRequest instanceof CopyObjectRequest) {
                    ((CopyObjectRequest) cosXmlRequest).setCopySourceServerSideEncryptionCustomerKey(this.sourceCustomerKey);
                    return;
                }
                return;
            }
        }
        if (i10 != 3) {
            return;
        }
        if (cosXmlRequest instanceof HeadObjectRequest) {
            ((HeadObjectRequest) cosXmlRequest).setCOSServerSideEncryptionWithKMS(this.sourceCustomerKeyId, this.sourceJsonContent);
        } else if (cosXmlRequest instanceof CopyObjectRequest) {
            ((CopyObjectRequest) cosXmlRequest).setCopySourceServerSideEncryptionKMS(this.sourceCustomerKeyId, this.sourceJsonContent);
        }
    }

    public CosXmlResult copyObject(String str, String str2, CopyObjectRequest.CopySourceStruct copySourceStruct) throws CosXmlServiceException, CosXmlClientException {
        CopyServerResult copyServerResult = new CopyServerResult();
        long jHeadObject = headObject(copySourceStruct.bucket, copySourceStruct.cosPath);
        if (jHeadObject >= this.maxSliceSize) {
            CompleteMultiUploadResult completeMultiUploadResultCopyObjectForLargeFile = copyObjectForLargeFile(str, str2, copySourceStruct, jHeadObject);
            copyServerResult.headers = completeMultiUploadResultCopyObjectForLargeFile.headers;
            copyServerResult.httpCode = completeMultiUploadResultCopyObjectForLargeFile.httpCode;
            copyServerResult.httpMessage = completeMultiUploadResultCopyObjectForLargeFile.httpMessage;
            copyServerResult.accessUrl = completeMultiUploadResultCopyObjectForLargeFile.accessUrl;
            copyServerResult.eTag = completeMultiUploadResultCopyObjectForLargeFile.completeMultipartUpload.eTag;
        } else {
            CopyObjectResult copyObjectResultCopyObjectForSmallFile = copyObjectForSmallFile(str, str2, copySourceStruct);
            copyServerResult.headers = copyObjectResultCopyObjectForSmallFile.headers;
            copyServerResult.httpCode = copyObjectResultCopyObjectForSmallFile.httpCode;
            copyServerResult.httpMessage = copyObjectResultCopyObjectForSmallFile.httpMessage;
            copyServerResult.accessUrl = copyObjectResultCopyObjectForSmallFile.accessUrl;
            copyServerResult.eTag = copyObjectResultCopyObjectForSmallFile.copyObject.eTag;
        }
        return copyServerResult;
    }

    public CosXmlResult copyObject(String str, String str2, CopyObjectRequest.CopySourceStruct copySourceStruct, long j10) throws CosXmlServiceException, CosXmlClientException {
        return j10 >= this.maxSliceSize ? copyObjectForLargeFile(str, str2, copySourceStruct, j10) : copyObjectForSmallFile(str, str2, copySourceStruct);
    }

    public void setCopySourceCustomerKey(String str) {
        this.encryptionType = UploadService.EncryptionType.SSEC;
        this.sourceCustomerKey = str;
    }

    public void setCopySourceCustomerKeyIdAndJsonContent(String str, String str2) {
        this.sourceCustomerKeyId = str;
        this.sourceJsonContent = str2;
        this.encryptionType = UploadService.EncryptionType.SSEKMS;
    }
}
