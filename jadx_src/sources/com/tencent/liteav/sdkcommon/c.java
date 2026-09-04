package com.tencent.liteav.sdkcommon;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DashboardManager f99804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f99805b;

    private c(DashboardManager dashboardManager, String str) {
        this.f99804a = dashboardManager;
        this.f99805b = str;
    }

    public static Runnable a(DashboardManager dashboardManager, String str) {
        return new c(dashboardManager, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f99804a.removeDashboardInternal(this.f99805b);
    }
}
