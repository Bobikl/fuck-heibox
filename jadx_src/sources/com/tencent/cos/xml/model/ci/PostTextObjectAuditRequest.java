package com.tencent.cos.xml.model.ci;

import android.text.TextUtils;
import androidx.annotation.n0;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;

/* JADX INFO: loaded from: classes4.dex */
public class PostTextObjectAuditRequest extends PostTextAuditRequest {
    public PostTextObjectAuditRequest(@n0 String str, @n0 String str2) {
        super(str);
        this.postTextAudit.input.object = str2;
    }

    @Override // com.tencent.cos.xml.model.ci.PostTextAuditRequest, com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (TextUtils.isEmpty(this.postTextAudit.input.object)) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "object must be non-empty");
        }
    }
}
