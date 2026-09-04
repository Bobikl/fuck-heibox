package com.huawei.hms.push.utils.ha;

/* JADX INFO: loaded from: classes7.dex */
public class PushAnalyticsCenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PushBaseAnalytics f61302a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static PushAnalyticsCenter f61303a = new PushAnalyticsCenter();
    }

    public static PushAnalyticsCenter getInstance() {
        return a.f61303a;
    }

    public PushBaseAnalytics getPushAnalytics() {
        return this.f61302a;
    }

    public void register(PushBaseAnalytics pushBaseAnalytics) {
        this.f61302a = pushBaseAnalytics;
    }
}
