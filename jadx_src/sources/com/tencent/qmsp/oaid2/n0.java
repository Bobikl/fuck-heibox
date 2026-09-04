package com.tencent.qmsp.oaid2;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class n0 implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class f101635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Object f101636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f101637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f101638e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f101639a;

    public n0() {
        try {
            c.c("xm start");
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f101635b = cls;
            f101636c = cls.newInstance();
            f101637d = f101635b.getMethod("getOAID", Context.class);
            f101638e = f101635b.getMethod("getAAID", Context.class);
        } catch (Exception e10) {
            c.a("xm reflect exception!" + e10);
        }
    }

    @Override // com.tencent.qmsp.oaid2.b
    public String a() {
        Method method;
        Object obj = f101636c;
        if (obj == null || (method = f101637d) == null) {
            return null;
        }
        return a(this.f101639a, obj, method);
    }

    public final String a(Context context, Object obj, Method method) {
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f101639a = context;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public String d() {
        Method method;
        Object obj = f101636c;
        if (obj == null || (method = f101638e) == null) {
            return null;
        }
        return a(this.f101639a, obj, method);
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean e() {
        return (f101635b == null || f101636c == null) ? false : true;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void j() {
    }

    @Override // com.tencent.qmsp.oaid2.b
    public boolean k() {
        return true;
    }

    @Override // com.tencent.qmsp.oaid2.b
    public void l() {
    }
}
