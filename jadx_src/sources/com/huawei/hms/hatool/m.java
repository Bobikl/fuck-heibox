package com.huawei.hms.hatool;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static m f60992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f60993c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f60994a;

    private m() {
    }

    public static m a() {
        if (f60992b == null) {
            b();
        }
        return f60992b;
    }

    private static synchronized void b() {
        if (f60992b == null) {
            f60992b = new m();
        }
    }

    public void a(Context context) {
        synchronized (f60993c) {
            if (this.f60994a != null) {
                v.f("hmsSdk", "DataManager already initialized.");
                return;
            }
            this.f60994a = context;
            s.c().b().a(this.f60994a);
            s.c().b().j(context.getPackageName());
            j.a().a(context);
        }
    }

    public void a(String str) {
        v.c("hmsSdk", "HiAnalyticsDataManager.setAppid(String appid) is execute.");
        Context context = this.f60994a;
        if (context == null) {
            v.e("hmsSdk", "sdk is not init");
        } else {
            s.c().b().i(e1.a(x9.b.f141156u, str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}", context.getPackageName()));
        }
    }
}
