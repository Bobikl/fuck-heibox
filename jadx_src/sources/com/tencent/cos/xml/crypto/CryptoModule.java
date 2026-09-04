package com.tencent.cos.xml.crypto;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.object.CompleteMultiUploadRequest;
import com.tencent.cos.xml.model.object.CompleteMultiUploadResult;
import com.tencent.cos.xml.model.object.GetObjectRequest;
import com.tencent.cos.xml.model.object.GetObjectResult;
import com.tencent.cos.xml.model.object.InitMultipartUploadRequest;
import com.tencent.cos.xml.model.object.InitMultipartUploadResult;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.object.PutObjectResult;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.cos.xml.model.object.UploadPartResult;

/* JADX INFO: loaded from: classes4.dex */
public interface CryptoModule {
    CompleteMultiUploadResult completeMultipartUploadSecurely(CompleteMultiUploadRequest completeMultiUploadRequest) throws CosXmlServiceException, CosXmlClientException;

    GetObjectResult getObjectSecurely(GetObjectRequest getObjectRequest) throws CosXmlServiceException, CosXmlClientException;

    InitMultipartUploadResult initMultipartUploadSecurely(InitMultipartUploadRequest initMultipartUploadRequest) throws CosXmlServiceException, CosXmlClientException;

    PutObjectResult putObjectSecurely(PutObjectRequest putObjectRequest) throws CosXmlServiceException, CosXmlClientException;

    void uploadPartAsyncSecurely(UploadPartRequest uploadPartRequest, CosXmlResultListener cosXmlResultListener);

    UploadPartResult uploadPartSecurely(UploadPartRequest uploadPartRequest) throws CosXmlServiceException, CosXmlClientException;
}
