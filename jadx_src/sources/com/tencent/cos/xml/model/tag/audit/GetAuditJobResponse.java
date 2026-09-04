package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "Response")
public class GetAuditJobResponse {
    public JobsDetail jobsDetail;
    public String nonExistJobIds;

    @XmlBean
    public static class AudioScenarioInfo {
        public int hitFlag;
        public String keywords;
        public int score;
    }

    @XmlBean
    public static class AudioSection {
        public AudioScenarioInfo adsInfo;
        public int duration;
        public String label;
        public int offsetTime;
        public AudioScenarioInfo politicsInfo;
        public AudioScenarioInfo pornInfo;
        public int result;
        public AudioScenarioInfo terrorismInfo;
        public String text;
        public String url;
    }

    @XmlBean
    public static class AuditScenarioInfo {
        public int count;
        public int hitFlag;
    }

    @XmlBean
    public static class JobsDetail {
        public AuditScenarioInfo adsInfo;
        public AudioSection audioSection;
        public String label;
        public String object;
        public AuditScenarioInfo politicsInfo;
        public AuditScenarioInfo pornInfo;
        public String result;
        public Snapshot snapshot;
        public String snapshotCount;
        public AuditScenarioInfo terrorismInfo;
        public String url;
    }

    @XmlBean
    public static class ObjectResults {
        public String name;
    }

    @XmlBean
    public static class Snapshot {
        public SnapshotAuditScenarioInfo adsInfo;
        public SnapshotAuditScenarioInfo politicsInfo;
        public SnapshotAuditScenarioInfo pornInfo;
        public int snapshotTime;
        public SnapshotAuditScenarioInfo terrorismInfo;
        public String text;
        public String url;
    }

    @XmlBean
    public static class SnapshotAuditScenarioInfo {
        public int hitFlag;
        public String label;
        public ObjectResults objectResults;
        public AuditOcrResults ocrResults;
        public int score;
        public String subLabel;
    }
}
