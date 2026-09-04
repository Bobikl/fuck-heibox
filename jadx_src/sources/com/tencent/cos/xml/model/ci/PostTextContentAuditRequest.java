package com.tencent.cos.xml.model.ci;

import android.text.TextUtils;
import androidx.annotation.n0;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.utils.DigestUtils;

/* JADX INFO: loaded from: classes4.dex */
public class PostTextContentAuditRequest extends PostTextAuditRequest {
    public PostTextContentAuditRequest(@n0 String str, @n0 String str2) throws CosXmlClientException {
        super(str);
        this.postTextAudit.input.content = DigestUtils.getBase64(str2);
    }

    @Override // com.tencent.cos.xml.model.ci.PostTextAuditRequest, com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (TextUtils.isEmpty(this.postTextAudit.input.content)) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "content must be non-empty");
        }
    }
}
