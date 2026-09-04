package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "Request")
public class PostDocumentAudit {
    public DocumentAuditInput input = new DocumentAuditInput();
    public AuditConf conf = new AuditConf();

    @XmlBean(name = "Input")
    public static class DocumentAuditInput {
        public String type;
        public String url;
    }
}
