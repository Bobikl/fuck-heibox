package com.tencent.cos.xml.model.tag;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DomainConfiguration {
    public static final String REPLACE_CNAME = "CNAME";
    public static final String REPLACE_TXT = "TXT";
    public static final String STATUS_DISABLED = "DISABLED";
    public static final String STATUS_ENABLED = "ENABLED";
    public static final String TYPE_REST = "REST";
    public static final String TYPE_WEBSITE = "WEBSITE";
    public List<DomainRule> domainRules;

    public static class DomainRule {
        public String forcedReplacement;
        public String name;
        public String status;
        public String type;

        public DomainRule() {
        }

        public DomainRule(String str, String str2, String str3) {
            this.status = str;
            this.name = str2;
            this.type = str3;
        }
    }
}
