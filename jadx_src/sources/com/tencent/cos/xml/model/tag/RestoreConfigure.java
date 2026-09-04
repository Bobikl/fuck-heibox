package com.tencent.cos.xml.model.tag;

import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class RestoreConfigure {
    public CASJobParameters casJobParameters;
    public int days;

    public static class CASJobParameters {
        public String tier = Tier.Standard.getTier();

        public String toString() {
            return "{CASJobParameters:\nTier:" + this.tier + "\n" + g.f141884d;
        }
    }

    public enum Tier {
        Expedited("Expedited"),
        Standard("Standard"),
        Bulk("Bulk");

        private String tier;

        Tier(String str) {
            this.tier = str;
        }

        public String getTier() {
            return this.tier;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{RestoreRequest:\n");
        sb2.append("Days:");
        sb2.append(this.days);
        sb2.append("\n");
        CASJobParameters cASJobParameters = this.casJobParameters;
        if (cASJobParameters != null) {
            sb2.append(cASJobParameters.toString());
            sb2.append("\n");
        }
        sb2.append(g.f141884d);
        return sb2.toString();
    }
}
