package com.tencent.cos.xml.model.tag;

import java.util.List;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class CORSConfiguration {
    public List<CORSRule> corsRules;

    public static class CORSRule {
        public List<String> allowedHeader;
        public List<String> allowedMethod;
        public String allowedOrigin;
        public List<String> exposeHeader;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f99464id;
        public int maxAgeSeconds;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{CORSRule:\n");
            sb2.append("ID:");
            sb2.append(this.f99464id);
            sb2.append("\n");
            sb2.append("AllowedOrigin:");
            sb2.append(this.allowedOrigin);
            sb2.append("\n");
            List<String> list = this.allowedMethod;
            if (list != null) {
                for (String str : list) {
                    if (str != null) {
                        sb2.append("AllowedMethod:");
                        sb2.append(str);
                        sb2.append("\n");
                    }
                }
            }
            List<String> list2 = this.allowedHeader;
            if (list2 != null) {
                for (String str2 : list2) {
                    if (str2 != null) {
                        sb2.append("AllowedHeader:");
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                }
            }
            List<String> list3 = this.exposeHeader;
            if (list3 != null) {
                for (String str3 : list3) {
                    if (str3 != null) {
                        sb2.append("ExposeHeader:");
                        sb2.append(str3);
                        sb2.append("\n");
                    }
                }
            }
            sb2.append("MaxAgeSeconds:");
            sb2.append(this.maxAgeSeconds);
            sb2.append("\n");
            sb2.append(g.f141884d);
            return sb2.toString();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{CORSConfiguration:\n");
        List<CORSRule> list = this.corsRules;
        if (list != null) {
            for (CORSRule cORSRule : list) {
                if (cORSRule != null) {
                    sb2.append(cORSRule.toString());
                    sb2.append("\n");
                }
            }
        }
        sb2.append(g.f141884d);
        return sb2.toString();
    }
}
