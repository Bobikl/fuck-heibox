package com.tencent.liteav.sdkcommon;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DashboardManager f99810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f99811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f99812c;

    private f(DashboardManager dashboardManager, String str, String str2) {
        this.f99810a = dashboardManager;
        this.f99811b = str;
        this.f99812c = str2;
    }

    public static Runnable a(DashboardManager dashboardManager, String str, String str2) {
        return new f(dashboardManager, str, str2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f99810a.appendLogInternal(this.f99811b, this.f99812c);
    }
}
