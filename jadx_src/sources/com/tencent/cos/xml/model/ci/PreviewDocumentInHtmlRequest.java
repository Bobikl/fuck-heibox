package com.tencent.cos.xml.model.ci;

import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.object.GetObjectRequest;
import com.tencent.cos.xml.utils.DigestUtils;
import com.tencent.cos.xml.utils.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
public class PreviewDocumentInHtmlRequest extends GetObjectRequest {
    public PreviewDocumentInHtmlRequest(String str, String str2, String str3) {
        this(str, str2, str3, StringUtils.extractNameNoSuffix(str2));
    }

    public PreviewDocumentInHtmlRequest(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
        this.queryParameters.put("ci-process", "doc-preview");
        this.queryParameters.put("dstType", LinkDraftObj.DRAFT_TYPE_HTML);
    }

    @Override // com.tencent.cos.xml.model.object.GetObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "GET";
    }

    public PreviewDocumentInHtmlRequest setCopyable(boolean z10) {
        this.queryParameters.put("copyable", z10 ? "1" : "0");
        return this;
    }

    public PreviewDocumentInHtmlRequest setWatermark(String str) {
        try {
            this.queryParameters.put("htmlwaterword", DigestUtils.getSecurityBase64(str));
        } catch (CosXmlClientException e10) {
            e10.printStackTrace();
        }
        return this;
    }

    public PreviewDocumentInHtmlRequest setWatermarkColor(String str) {
        try {
            this.queryParameters.put("htmlfillstyle", DigestUtils.getSecurityBase64(str));
        } catch (CosXmlClientException e10) {
            e10.printStackTrace();
        }
        return this;
    }

    public PreviewDocumentInHtmlRequest setWatermarkFont(String str) {
        try {
            this.queryParameters.put("htmlfront", DigestUtils.getSecurityBase64(str));
        } catch (CosXmlClientException e10) {
            e10.printStackTrace();
        }
        return this;
    }

    public PreviewDocumentInHtmlRequest setWatermarkHorizontal(int i10) {
        this.queryParameters.put("htmlhorizontal", String.valueOf(i10));
        return this;
    }

    public PreviewDocumentInHtmlRequest setWatermarkRotate(int i10) {
        this.queryParameters.put("htmlrotate", String.valueOf(i10));
        return this;
    }

    public PreviewDocumentInHtmlRequest setWatermarkVertical(int i10) {
        this.queryParameters.put("htmlvertical", String.valueOf(i10));
        return this;
    }
}
