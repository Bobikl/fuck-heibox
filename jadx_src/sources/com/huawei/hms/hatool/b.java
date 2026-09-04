package com.huawei.hms.hatool;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    s0 f60883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    s0 f60884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f60885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f60886d;

    public b(Context context) {
        if (context != null) {
            this.f60885c = context.getApplicationContext();
        }
        this.f60883a = new s0();
        this.f60884b = new s0();
    }

    public b a(int i10, String str) {
        s0 s0Var;
        v.c("hmsSdk", "Builder.setCollectURL(int type,String collectURL) is execute.TYPE : " + i10);
        if (!p1.b(str)) {
            str = "";
        }
        if (i10 != 0) {
            if (i10 != 1) {
                v.f("hmsSdk", "Builder.setCollectURL(int type,String collectURL): invalid type!");
            } else {
                s0Var = this.f60884b;
            }
            return this;
        }
        s0Var = this.f60883a;
        s0Var.b(str);
        return this;
    }

    public b a(String str) {
        v.c("hmsSdk", "Builder.setAppID is execute");
        this.f60886d = str;
        return this;
    }

    @Deprecated
    public b a(boolean z10) {
        v.c("hmsSdk", "Builder.setEnableImei(boolean isReportAndroidImei) is execute.");
        this.f60883a.j().a(z10);
        this.f60884b.j().a(z10);
        return this;
    }

    public void a() {
        if (this.f60885c == null) {
            v.b("hmsSdk", "analyticsConf create(): context is null,create failed!");
            return;
        }
        v.c("hmsSdk", "Builder.create() is execute.");
        z0 z0Var = new z0("_hms_config_tag");
        z0Var.b(new s0(this.f60883a));
        z0Var.a(new s0(this.f60884b));
        m.a().a(this.f60885c);
        g0.a().a(this.f60885c);
        q.c().a(z0Var);
        m.a().a(this.f60886d);
    }

    @Deprecated
    public b b(boolean z10) {
        v.c("hmsSdk", "Builder.setEnableSN(boolean isReportSN) is execute.");
        this.f60883a.j().b(z10);
        this.f60884b.j().b(z10);
        return this;
    }

    @Deprecated
    public b c(boolean z10) {
        v.c("hmsSdk", "Builder.setEnableUDID(boolean isReportUDID) is execute.");
        this.f60883a.j().c(z10);
        this.f60884b.j().c(z10);
        return this;
    }
}
