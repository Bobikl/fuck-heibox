package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "Request")
public class PostAudioAudit {
    public AuditInput input = new AuditInput();
    public AudioAuditConf conf = new AudioAuditConf();

    @XmlBean(name = "Conf")
    public static class AudioAuditConf extends AuditConf {
        public String callbackVersion;
    }
}
