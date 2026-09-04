package com.alipay.face.network.model;

/* JADX INFO: loaded from: classes6.dex */
public class ZimInitRes extends ZimResBase {
    public ResultObject resultObject;

    public static class ResultObject {
        public String AccessKeyId;
        public String AccessKeySecret;
        public String BucketName;
        public String CertifyId;
        public String ExtParams;
        public String FileNamePrefix;
        public String Message;
        public String OssEndPoint;
        public String Protocol;
        public String RetCode;
        public String RetCodeSub;
        public String RetMessageSub;
        public String SecurityToken;
    }

    public String getAccessKeyId() {
        return this.resultObject.AccessKeyId;
    }

    public String getAccessKeySecret() {
        return this.resultObject.AccessKeySecret;
    }

    public String getBucketName() {
        return this.resultObject.BucketName;
    }

    public String getCertifyId() {
        return this.resultObject.CertifyId;
    }

    public String getExtParams() {
        return this.resultObject.ExtParams;
    }

    public String getFileName() {
        return this.resultObject.FileNamePrefix;
    }

    public String getMessage() {
        return this.resultObject.Message;
    }

    public String getOssEndPoint() {
        return this.resultObject.OssEndPoint;
    }

    public String getProtocol() {
        return this.resultObject.Protocol;
    }

    public String getRetCode() {
        return this.resultObject.RetCode;
    }

    public String getRetCodeSub() {
        return this.resultObject.RetCodeSub;
    }

    public String getRetMessageSub() {
        return this.resultObject.RetMessageSub;
    }

    public String getSecurityToken() {
        return this.resultObject.SecurityToken;
    }

    public boolean isValid() {
        return this.resultObject != null;
    }
}
