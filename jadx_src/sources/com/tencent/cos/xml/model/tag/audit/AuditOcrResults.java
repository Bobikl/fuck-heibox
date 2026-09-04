package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "OcrResults")
public class AuditOcrResults {
    public String keywords;
    public AuditOcrLocation location;
    public String text;
}
