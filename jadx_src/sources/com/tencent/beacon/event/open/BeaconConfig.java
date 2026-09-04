package com.tencent.beacon.event.open;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public class BeaconConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f99140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f99141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f99142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f99143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f99144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f99145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.tencent.beacon.base.net.adapter.a f99146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f99147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f99148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f99149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f99150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f99151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f99152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f99153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f99154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f99155p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f99156q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f99157r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f99158s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f99159t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f99160u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f99161v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f99162w;

    public static final class Builder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ScheduledExecutorService f99167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.tencent.beacon.base.net.adapter.a f99168f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f99169g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f99170h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f99171i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f99172j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f99163a = 10000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f99164b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f99165c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f99166d = true;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f99173k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f99174l = true;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f99175m = true;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f99176n = "";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f99177o = "";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f99178p = "";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private String f99179q = "";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f99180r = "";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private String f99181s = "";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f99182t = "";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private String f99183u = "";

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private String f99184v = "";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private String f99185w = "";

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private boolean f99186x = true;

        public Builder auditEnable(boolean z10) {
            this.f99165c = z10;
            return this;
        }

        public Builder bidEnable(boolean z10) {
            this.f99166d = z10;
            return this;
        }

        public BeaconConfig build() {
            ScheduledExecutorService scheduledExecutorService = this.f99167e;
            if (scheduledExecutorService != null) {
                com.tencent.beacon.a.b.a.a(scheduledExecutorService);
            }
            return new BeaconConfig(this.f99163a, this.f99164b, this.f99165c, this.f99166d, this.f99169g, this.f99170h, this.f99168f, this.f99171i, this.f99172j, this.f99173k, this.f99174l, this.f99175m, this.f99176n, this.f99177o, this.f99178p, this.f99179q, this.f99180r, this.f99181s, this.f99182t, this.f99183u, this.f99184v, this.f99185w, this.f99186x);
        }

        public Builder eventReportEnable(boolean z10) {
            this.f99164b = z10;
            return this;
        }

        public Builder maxDBCount(int i10) {
            this.f99163a = i10;
            return this;
        }

        public Builder pagePathEnable(boolean z10) {
            this.f99175m = z10;
            return this;
        }

        public Builder qmspEnable(boolean z10) {
            this.f99174l = z10;
            return this;
        }

        public Builder setAndroidID(String str) {
            this.f99176n = str;
            return this;
        }

        public Builder setConfigHost(String str) {
            this.f99172j = str;
            return this;
        }

        public Builder setExecutorService(ScheduledExecutorService scheduledExecutorService) {
            this.f99167e = scheduledExecutorService;
            return this;
        }

        public Builder setForceEnableAtta(boolean z10) {
            this.f99173k = z10;
            return this;
        }

        public Builder setHttpAdapter(com.tencent.beacon.base.net.adapter.a aVar) {
            this.f99168f = aVar;
            return this;
        }

        public Builder setImei(String str) {
            this.f99177o = str;
            return this;
        }

        public Builder setImei2(String str) {
            this.f99178p = str;
            return this;
        }

        public Builder setImsi(String str) {
            this.f99179q = str;
            return this;
        }

        public Builder setMac(String str) {
            this.f99182t = str;
            return this;
        }

        public Builder setMeid(String str) {
            this.f99180r = str;
            return this;
        }

        public Builder setModel(String str) {
            this.f99181s = str;
            return this;
        }

        public Builder setNeedInitQimei(boolean z10) {
            this.f99186x = z10;
            return this;
        }

        public Builder setNormalPollingTime(long j10) {
            this.f99170h = j10;
            return this;
        }

        public Builder setOaid(String str) {
            this.f99185w = str;
            return this;
        }

        public Builder setRealtimePollingTime(long j10) {
            this.f99169g = j10;
            return this;
        }

        public Builder setUploadHost(String str) {
            this.f99171i = str;
            return this;
        }

        public Builder setWifiMacAddress(String str) {
            this.f99183u = str;
            return this;
        }

        public Builder setWifiSSID(String str) {
            this.f99184v = str;
            return this;
        }
    }

    public BeaconConfig(int i10, boolean z10, boolean z11, boolean z12, long j10, long j11, com.tencent.beacon.base.net.adapter.a aVar, String str, String str2, boolean z13, boolean z14, boolean z15, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z16) {
        this.f99140a = i10;
        this.f99141b = z10;
        this.f99142c = z11;
        this.f99143d = z12;
        this.f99144e = j10;
        this.f99145f = j11;
        this.f99146g = aVar;
        this.f99147h = str;
        this.f99148i = str2;
        this.f99149j = z13;
        this.f99150k = z14;
        this.f99151l = z15;
        this.f99152m = str3;
        this.f99153n = str4;
        this.f99154o = str5;
        this.f99155p = str6;
        this.f99156q = str7;
        this.f99157r = str8;
        this.f99158s = str9;
        this.f99159t = str10;
        this.f99160u = str11;
        this.f99161v = str12;
        this.f99162w = z16;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAndroidID() {
        return this.f99152m;
    }

    public String getConfigHost() {
        return this.f99148i;
    }

    public com.tencent.beacon.base.net.adapter.a getHttpAdapter() {
        return this.f99146g;
    }

    public String getImei() {
        return this.f99153n;
    }

    public String getImei2() {
        return this.f99154o;
    }

    public String getImsi() {
        return this.f99155p;
    }

    public String getMac() {
        return this.f99158s;
    }

    public int getMaxDBCount() {
        return this.f99140a;
    }

    public String getMeid() {
        return this.f99156q;
    }

    public String getModel() {
        return this.f99157r;
    }

    public long getNormalPollingTIme() {
        return this.f99145f;
    }

    public String getOaid() {
        return this.f99161v;
    }

    public long getRealtimePollingTime() {
        return this.f99144e;
    }

    public String getUploadHost() {
        return this.f99147h;
    }

    public String getWifiMacAddress() {
        return this.f99159t;
    }

    public String getWifiSSID() {
        return this.f99160u;
    }

    public boolean isAuditEnable() {
        return this.f99142c;
    }

    public boolean isBidEnable() {
        return this.f99143d;
    }

    public boolean isEnableQmsp() {
        return this.f99150k;
    }

    public boolean isEventReportEnable() {
        return this.f99141b;
    }

    public boolean isForceEnableAtta() {
        return this.f99149j;
    }

    public boolean isNeedInitQimei() {
        return this.f99162w;
    }

    public boolean isPagePathEnable() {
        return this.f99151l;
    }

    public String toString() {
        return "BeaconConfig{maxDBCount=" + this.f99140a + ", eventReportEnable=" + this.f99141b + ", auditEnable=" + this.f99142c + ", bidEnable=" + this.f99143d + ", realtimePollingTime=" + this.f99144e + ", normalPollingTIme=" + this.f99145f + ", httpAdapter=" + this.f99146g + ", uploadHost='" + this.f99147h + "', configHost='" + this.f99148i + "', forceEnableAtta=" + this.f99149j + ", enableQmsp=" + this.f99150k + ", pagePathEnable=" + this.f99151l + ", androidID='" + this.f99152m + "', imei='" + this.f99153n + "', imei2='" + this.f99154o + "', imsi='" + this.f99155p + "', meid='" + this.f99156q + "', model='" + this.f99157r + "', mac='" + this.f99158s + "', wifiMacAddress='" + this.f99159t + "', wifiSSID='" + this.f99160u + "', oaid='" + this.f99161v + "', needInitQimei='" + this.f99162w + "'}";
    }
}
