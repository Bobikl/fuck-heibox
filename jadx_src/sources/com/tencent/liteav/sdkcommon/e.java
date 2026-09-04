package com.tencent.liteav.sdkcommon;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DashboardManager f99807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f99808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f99809c;

    private e(DashboardManager dashboardManager, String str, String str2) {
        this.f99807a = dashboardManager;
        this.f99808b = str;
        this.f99809c = str2;
    }

    public static Runnable a(DashboardManager dashboardManager, String str, String str2) {
        return new e(dashboardManager, str, str2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f99807a.setStatusInternal(this.f99808b, this.f99809c);
    }
}
