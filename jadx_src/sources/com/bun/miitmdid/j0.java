package com.bun.miitmdid;

import android.content.Context;
import com.bun.lib.MsaIdInterface;

/* JADX INFO: loaded from: classes6.dex */
public class j0 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f42106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g0 f42108c;

    public class a implements h0 {
        public a() {
        }

        @Override // com.bun.miitmdid.h0
        public native void a(MsaIdInterface msaIdInterface);
    }

    public j0(Context context) {
        l0.c("ZteProvider", "ZteProvider(Context)");
        this.f42106a = context;
        this.f42107b = context.getPackageName();
        try {
            if (context.getPackageManager().getPackageInfo("com.mdid.msa", 0) == null) {
                l0.d("ZteProvider", "Constructor: getPackageInfo is null");
                throw new NullPointerException("Constructor: getPackageInfo is null");
            }
        } catch (Exception unused) {
            l0.d("ZteProvider", "Constructor: MsaService not found");
        }
        try {
            g0.a(this.f42106a, this.f42107b);
            l0.c("ZteProvider", "Constructor: MsaService start success");
        } catch (Exception e10) {
            l0.b("ZteProvider", "Constructor: MsaService start Exception: " + e10.getMessage());
        }
    }

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public void doStart() {
        l0.c("ZteProvider", "doStart()");
        try {
            this.f42106a = checkContext(this.f42106a);
            doAsyncCallBefore();
            g0 g0Var = new g0(this.f42106a, new a());
            this.f42108c = g0Var;
            g0Var.a(this.f42107b);
            l0.c("ZteProvider", "doStart: BindService success");
            doAsyncCallAfter();
        } catch (Exception e10) {
            l0.d("ZteProvider", "doStart: Exception: " + e10.getMessage());
            cleanCache();
            onSupportCache();
        }
    }

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public void shutDown() {
        g0 g0Var = this.f42108c;
        if (g0Var != null) {
            g0Var.e();
        }
    }
}
