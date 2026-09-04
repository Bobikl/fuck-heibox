package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "Request")
public class PostVideoAudit {
    public AuditInput input = new AuditInput();
    public VideoAuditConf conf = new VideoAuditConf();

    @XmlBean
    public static class Snapshot {
        public int count;
        public String mode;

        @XmlElement(ignoreZero = true)
        public float timeInterval;
    }

    @XmlBean(name = "Conf")
    public static class VideoAuditConf extends AuditConf {
        public String callbackVersion;
        public int detectContent;
        public Snapshot snapshot = new Snapshot();
    }
}
