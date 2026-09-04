package com.tencent.liteav.sdkcommon;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DashboardManager f99806a;

    private d(DashboardManager dashboardManager) {
        this.f99806a = dashboardManager;
    }

    public static Runnable a(DashboardManager dashboardManager) {
        return new d(dashboardManager);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f99806a.removeAllDashboardInternal();
    }
}
