package com.tencent.liteav.sdkcommon;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DashboardManager f99802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f99803b;

    private b(DashboardManager dashboardManager, String str) {
        this.f99802a = dashboardManager;
        this.f99803b = str;
    }

    public static Runnable a(DashboardManager dashboardManager, String str) {
        return new b(dashboardManager, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f99802a.addDashboardInternal(this.f99803b);
    }
}
