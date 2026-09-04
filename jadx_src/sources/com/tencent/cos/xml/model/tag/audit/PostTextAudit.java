package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "Request")
public class PostTextAudit {
    public TextAuditInput input = new TextAuditInput();
    public AuditConf conf = new AuditConf();

    @XmlBean(name = "Input")
    public static class TextAuditInput {
        public String content;
        public String object;
    }
}
