package com.tencent.cos.xml.model.object;

import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.qcloud.core.auth.STSCredentialScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseMultipartUploadRequest extends UploadRequest {
    BaseMultipartUploadRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public STSCredentialScope[] getSTSCredentialScope(CosXmlServiceConfig cosXmlServiceConfig) {
        String[] strArr = {"name/cos:InitiateMultipartUpload", "name/cos:ListParts", "name/cos:UploadPart", "name/cos:CompleteMultipartUpload", "name/cos:AbortMultipartUpload"};
        STSCredentialScope[] sTSCredentialScopeArr = new STSCredentialScope[5];
        int i10 = 0;
        int i11 = 0;
        while (i10 < 5) {
            sTSCredentialScopeArr[i11] = new STSCredentialScope(strArr[i10], cosXmlServiceConfig.getBucket(this.bucket), cosXmlServiceConfig.getRegion(), getPath(cosXmlServiceConfig));
            i10++;
            i11++;
        }
        return sTSCredentialScopeArr;
    }
}
