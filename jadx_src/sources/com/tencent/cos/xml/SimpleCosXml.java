package com.tencent.cos.xml;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.listener.CosXmlResultSimpleListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.bucket.ListMultiUploadsRequest;
import com.tencent.cos.xml.model.bucket.ListMultiUploadsResult;
import com.tencent.cos.xml.model.object.AbortMultiUploadRequest;
import com.tencent.cos.xml.model.object.AbortMultiUploadResult;
import com.tencent.cos.xml.model.object.CompleteMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadResult;
import com.tencent.cos.xml.model.object.CopyObjectRequest;
import com.tencent.cos.xml.model.object.CopyObjectResult;
import com.tencent.cos.xml.model.object.DeleteObjectRequest;
import com.tencent.cos.xml.model.object.DeleteObjectResult;
import com.tencent.cos.xml.model.object.GetObjectRequest;
import com.tencent.cos.xml.model.object.GetObjectResult;
import com.tencent.cos.xml.model.object.HeadObjectRequest;
import com.tencent.cos.xml.model.object.HeadObjectResult;
import com.tencent.cos.xml.model.object.InitMultipartUploadRequest;
import com.tencent.cos.xml.model.object.InitMultipartUploadResult;
import com.tencent.cos.xml.model.object.ListPartsRequest;
import com.tencent.cos.xml.model.object.ListPartsResult;
import com.tencent.cos.xml.model.object.PostObjectRequest;
import com.tencent.cos.xml.model.object.PostObjectResult;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.object.PutObjectResult;
import com.tencent.cos.xml.model.object.UploadPartCopyRequest;
import com.tencent.cos.xml.model.object.UploadPartCopyResult;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.cos.xml.model.object.UploadPartResult;

/* JADX INFO: loaded from: classes4.dex */
public interface SimpleCosXml {
    AbortMultiUploadResult abortMultiUpload(AbortMultiUploadRequest abortMultiUploadRequest) throws CosXmlServiceException, CosXmlClientException;

    void abortMultiUploadAsync(AbortMultiUploadRequest abortMultiUploadRequest, CosXmlResultListener cosXmlResultListener);

    void cancel(CosXmlRequest cosXmlRequest);

    void cancelAll();

    CompleteMultiUploadResult completeMultiUpload(CompleteMultiUploadRequest completeMultiUploadRequest) throws CosXmlServiceException, CosXmlClientException;

    void completeMultiUploadAsync(CompleteMultiUploadRequest completeMultiUploadRequest, CosXmlResultListener cosXmlResultListener);

    CopyObjectResult copyObject(CopyObjectRequest copyObjectRequest) throws CosXmlServiceException, CosXmlClientException;

    UploadPartCopyResult copyObject(UploadPartCopyRequest uploadPartCopyRequest) throws CosXmlServiceException, CosXmlClientException;

    void copyObjectAsync(CopyObjectRequest copyObjectRequest, CosXmlResultListener cosXmlResultListener);

    void copyObjectAsync(UploadPartCopyRequest uploadPartCopyRequest, CosXmlResultListener cosXmlResultListener);

    DeleteObjectResult deleteObject(DeleteObjectRequest deleteObjectRequest) throws CosXmlServiceException, CosXmlClientException;

    void deleteObjectAsync(DeleteObjectRequest deleteObjectRequest, CosXmlResultListener cosXmlResultListener);

    GetObjectResult getObject(GetObjectRequest getObjectRequest) throws CosXmlServiceException, CosXmlClientException;

    byte[] getObject(String str, String str2) throws CosXmlServiceException, CosXmlClientException;

    void getObjectAsync(GetObjectRequest getObjectRequest, CosXmlResultListener cosXmlResultListener);

    String getObjectUrl(String str, String str2, String str3);

    HeadObjectResult headObject(HeadObjectRequest headObjectRequest) throws CosXmlServiceException, CosXmlClientException;

    void headObjectAsync(HeadObjectRequest headObjectRequest, CosXmlResultListener cosXmlResultListener);

    InitMultipartUploadResult initMultipartUpload(InitMultipartUploadRequest initMultipartUploadRequest) throws CosXmlServiceException, CosXmlClientException;

    void initMultipartUploadAsync(InitMultipartUploadRequest initMultipartUploadRequest, CosXmlResultListener cosXmlResultListener);

    ListMultiUploadsResult listMultiUploads(ListMultiUploadsRequest listMultiUploadsRequest) throws CosXmlServiceException, CosXmlClientException;

    void listMultiUploadsAsync(ListMultiUploadsRequest listMultiUploadsRequest, CosXmlResultListener cosXmlResultListener);

    ListPartsResult listParts(ListPartsRequest listPartsRequest) throws CosXmlServiceException, CosXmlClientException;

    void listPartsAsync(ListPartsRequest listPartsRequest, CosXmlResultListener cosXmlResultListener);

    PostObjectResult postObject(PostObjectRequest postObjectRequest) throws CosXmlServiceException, CosXmlClientException;

    void postObjectAsync(PostObjectRequest postObjectRequest, CosXmlResultListener cosXmlResultListener);

    boolean preBuildConnection(String str) throws CosXmlServiceException, CosXmlClientException;

    void preBuildConnectionAsync(String str, CosXmlResultSimpleListener cosXmlResultSimpleListener);

    PutObjectResult putObject(PutObjectRequest putObjectRequest) throws CosXmlServiceException, CosXmlClientException;

    void putObjectAsync(PutObjectRequest putObjectRequest, CosXmlResultListener cosXmlResultListener);

    void release();

    UploadPartResult uploadPart(UploadPartRequest uploadPartRequest) throws CosXmlServiceException, CosXmlClientException;

    void uploadPartAsync(UploadPartRequest uploadPartRequest, CosXmlResultListener cosXmlResultListener);
}
