package com.tencent.cos.xml;

import android.content.Context;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.ci.DeleteBucketDPStateRequest;
import com.tencent.cos.xml.model.ci.DeleteBucketDPStateResult;
import com.tencent.cos.xml.model.ci.GetBucketDPStateRequest;
import com.tencent.cos.xml.model.ci.GetBucketDPStateResult;
import com.tencent.cos.xml.model.ci.PutBucketDPStateRequest;
import com.tencent.cos.xml.model.ci.PutBucketDPStateResult;
import com.tencent.cos.xml.model.ci.QRCodeUploadRequest;
import com.tencent.cos.xml.model.ci.QRCodeUploadResult;
import com.tencent.cos.xml.model.ci.SensitiveContentRecognitionRequest;
import com.tencent.cos.xml.model.ci.SensitiveContentRecognitionResult;
import com.tencent.qcloud.core.auth.COSXmlSigner;
import com.tencent.qcloud.core.auth.QCloudCredentialProvider;
import com.tencent.qcloud.core.auth.SignerFactory;

/* JADX INFO: loaded from: classes4.dex */
public class CIService extends CosXmlService {

    public static class CISigner extends COSXmlSigner {
        private CISigner() {
        }

        @Override // com.tencent.qcloud.core.auth.COSXmlSigner
        protected String getSessionTokenKey() {
            return "x-ci-security-token";
        }
    }

    public CIService(Context context, CosXmlServiceConfig cosXmlServiceConfig, QCloudCredentialProvider qCloudCredentialProvider) {
        super(context, cosXmlServiceConfig, qCloudCredentialProvider);
        this.signerType = "CISigner";
        SignerFactory.registerSigner("CISigner", new CISigner());
    }

    public DeleteBucketDPStateResult deleteBucketDocumentPreviewState(DeleteBucketDPStateRequest deleteBucketDPStateRequest) throws CosXmlServiceException, CosXmlClientException {
        return (DeleteBucketDPStateResult) execute(deleteBucketDPStateRequest, new DeleteBucketDPStateResult());
    }

    public void deleteBucketDocumentPreviewStateAsync(DeleteBucketDPStateRequest deleteBucketDPStateRequest, CosXmlResultListener cosXmlResultListener) throws CosXmlServiceException, CosXmlClientException {
        schedule(deleteBucketDPStateRequest, new DeleteBucketDPStateResult(), cosXmlResultListener);
    }

    public GetBucketDPStateResult getBucketDocumentPreviewState(GetBucketDPStateRequest getBucketDPStateRequest) throws CosXmlServiceException, CosXmlClientException {
        return (GetBucketDPStateResult) execute(getBucketDPStateRequest, new GetBucketDPStateResult());
    }

    public void getBucketDocumentPreviewStateAsync(GetBucketDPStateRequest getBucketDPStateRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getBucketDPStateRequest, new GetBucketDPStateResult(), cosXmlResultListener);
    }

    public PutBucketDPStateResult putBucketDocumentPreviewState(PutBucketDPStateRequest putBucketDPStateRequest) throws CosXmlServiceException, CosXmlClientException {
        return (PutBucketDPStateResult) execute(putBucketDPStateRequest, new PutBucketDPStateResult());
    }

    public void putBucketDocumentPreviewStateAsync(PutBucketDPStateRequest putBucketDPStateRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(putBucketDPStateRequest, new PutBucketDPStateResult(), cosXmlResultListener);
    }

    public QRCodeUploadResult qrCodeUpload(QRCodeUploadRequest qRCodeUploadRequest) throws CosXmlServiceException, CosXmlClientException {
        return (QRCodeUploadResult) execute(qRCodeUploadRequest, new QRCodeUploadResult());
    }

    public void qrCodeUploadAsync(QRCodeUploadRequest qRCodeUploadRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(qRCodeUploadRequest, new QRCodeUploadResult(), cosXmlResultListener);
    }

    public SensitiveContentRecognitionResult sensitiveContentRecognition(SensitiveContentRecognitionRequest sensitiveContentRecognitionRequest) throws CosXmlServiceException, CosXmlClientException {
        return (SensitiveContentRecognitionResult) execute(sensitiveContentRecognitionRequest, new SensitiveContentRecognitionResult());
    }

    public void sensitiveContentRecognitionAsync(SensitiveContentRecognitionRequest sensitiveContentRecognitionRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(sensitiveContentRecognitionRequest, new SensitiveContentRecognitionResult(), cosXmlResultListener);
    }
}
