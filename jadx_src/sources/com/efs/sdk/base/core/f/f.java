package com.efs.sdk.base.core.f;

import com.efs.sdk.base.core.controller.ControllerCenter;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f42547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ControllerCenter f42548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f42549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f42550d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final f f42551a = new f(0);
    }

    private f() {
        this.f42547a = new c();
        this.f42549c = new d();
        this.f42550d = new g();
    }

    /* synthetic */ f(byte b10) {
        this();
    }

    public final b a(String str, int i10) {
        b bVar = new b("efs_core", str, this.f42547a.f42541c);
        bVar.put("cver", Integer.valueOf(i10));
        return bVar;
    }

    public final void a(int i10) {
        ControllerCenter controllerCenter = this.f42548b;
        if (controllerCenter != null) {
            controllerCenter.send(a("flow_limit", i10));
        }
    }

    public final void a(int i10, String str) {
        if (this.f42548b != null || ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
            b bVarA = a("flow_limit_type", i10);
            bVarA.put("code", str);
            this.f42548b.send(bVarA);
        }
    }

    public final void a(String str, String str2, String str3) {
        this.f42550d.a(str, str2, str3);
    }
}
