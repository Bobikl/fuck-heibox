package com.tencent.cos.xml.model.ci;

import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.object.ObjectRequest;
import com.tencent.cos.xml.utils.DigestUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;

/* JADX INFO: loaded from: classes4.dex */
public class PreviewDocumentInHtmlBytesRequest extends ObjectRequest {
    public PreviewDocumentInHtmlBytesRequest(String str, String str2) {
        super(str, str2);
        this.queryParameters.put("ci-process", "doc-preview");
        this.queryParameters.put("dstType", LinkDraftObj.DRAFT_TYPE_HTML);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "GET";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }

    public PreviewDocumentInHtmlBytesRequest setCopyable(boolean z10) {
        this.queryParameters.put("copyable", z10 ? "1" : "0");
        return this;
    }

    public PreviewDocumentInHtmlBytesRequest setWatermark(String str) {
        try {
            this.queryParameters.put("htmlwaterword", DigestUtils.getSecurityBase64(str));
        } catch (CosXmlClientException e10) {
            e10.printStackTrace();
        }
        return this;
    }

    public PreviewDocumentInHtmlBytesRequest setWatermarkColor(String str) {
        try {
            this.queryParameters.put("htmlfillstyle", DigestUtils.getSecurityBase64(str));
        } catch (CosXmlClientException e10) {
            e10.printStackTrace();
        }
        return this;
    }

    public PreviewDocumentInHtmlBytesRequest setWatermarkFont(String str) {
        try {
            this.queryParameters.put("htmlfront", DigestUtils.getSecurityBase64(str));
        } catch (CosXmlClientException e10) {
            e10.printStackTrace();
        }
        return this;
    }

    public PreviewDocumentInHtmlBytesRequest setWatermarkHorizontal(int i10) {
        this.queryParameters.put("htmlhorizontal", String.valueOf(i10));
        return this;
    }

    public PreviewDocumentInHtmlBytesRequest setWatermarkRotate(int i10) {
        this.queryParameters.put("htmlrotate", String.valueOf(i10));
        return this;
    }

    public PreviewDocumentInHtmlBytesRequest setWatermarkVertical(int i10) {
        this.queryParameters.put("htmlvertical", String.valueOf(i10));
        return this;
    }
}
