package com.tencent.liteav.sdkcommon;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DashboardManager f99800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f99801b;

    private a(DashboardManager dashboardManager, boolean z10) {
        this.f99800a = dashboardManager;
        this.f99801b = z10;
    }

    public static Runnable a(DashboardManager dashboardManager, boolean z10) {
        return new a(dashboardManager, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f99800a.showDashboardInternal(this.f99801b);
    }
}
