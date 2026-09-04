package com.tencent.cos.xml.model.object;

import android.util.Base64;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.crypto.Headers;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.utils.DigestUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ObjectRequest extends CosXmlRequest {
    protected String cosPath;

    public ObjectRequest(String str, String str2) {
        this.bucket = str;
        this.cosPath = str2;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (this.requestURL != null) {
            return;
        }
        String str = this.bucket;
        if (str == null || str.length() < 1) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "bucket must not be null ");
        }
        String str2 = this.cosPath;
        if (str2 == null || str2.length() < 1) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "cosPath must not be null ");
        }
    }

    protected String getContentType() {
        List<String> list = this.requestHeaders.get("Content-Type");
        if (list == null || list.isEmpty()) {
            list = this.requestHeaders.get("content-type");
        }
        if (list == null || list.isEmpty()) {
            list = this.requestHeaders.get("Content-type");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public String getCosPath() {
        return this.cosPath;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getUrlPath(this.bucket, this.cosPath);
    }

    public void setCOSServerSideEncryption() {
        addHeader(Headers.SERVER_SIDE_ENCRYPTION, "AES256");
    }

    public void setCOSServerSideEncryptionWithCustomerKey(String str) throws CosXmlClientException {
        if (str != null) {
            addHeader(Headers.SERVER_SIDE_ENCRYPTION_CUSTOMER_ALGORITHM, "AES256");
            addHeader(Headers.SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY, DigestUtils.getBase64(str));
            try {
                addHeader(Headers.SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_MD5, Base64.encodeToString(MessageDigest.getInstance("MD5").digest(str.getBytes(Charset.forName("UTF-8"))), 2));
            } catch (NoSuchAlgorithmException e10) {
                throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e10);
            }
        }
    }

    public void setCOSServerSideEncryptionWithKMS(String str, String str2) throws CosXmlClientException {
        addHeader(Headers.SERVER_SIDE_ENCRYPTION, "cos/kms");
        if (str != null) {
            addHeader(Headers.SERVER_SIDE_ENCRYPTION_COS_KMS_KEY_ID, str);
        }
        if (str2 != null) {
            addHeader(Headers.SERVER_SIDE_ENCRYPTION_CONTEXT, DigestUtils.getBase64(str2));
        }
    }

    public void setCosPath(String str) {
        this.cosPath = str;
    }
}
