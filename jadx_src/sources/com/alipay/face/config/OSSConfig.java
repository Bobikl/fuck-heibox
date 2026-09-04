package com.alipay.face.config;

/* JADX INFO: loaded from: classes6.dex */
public class OSSConfig {
    public String AccessKeyId;
    public String AccessKeySecret;
    public String BucketName;
    public String FileNamePrefix;
    public String OssEndPoint;
    public String SecurityToken;

    public String toString() {
        return "OSSConfig{OssEndPoint='" + this.OssEndPoint + "', AccessKeyId='" + this.AccessKeyId + "', AccessKeySecret='" + this.AccessKeySecret + "', SecurityToken='" + this.SecurityToken + "', BucketName='" + this.BucketName + "', FileName='" + this.FileNamePrefix + "'}";
    }
}
