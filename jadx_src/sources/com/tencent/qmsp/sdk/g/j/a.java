package com.tencent.qmsp.sdk.g.j;

import android.content.Context;
import com.tencent.qmsp.sdk.base.IVendorCallback;
import com.tencent.qmsp.sdk.base.b;
import com.tencent.qmsp.sdk.base.c;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Class f102033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Object f102034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f102035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f102036e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f102037a;

    public a() {
        try {
            c.c("xm start");
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f102033b = cls;
            f102034c = cls.newInstance();
            f102035d = f102033b.getMethod("getOAID", Context.class);
            f102036e = f102033b.getMethod("getAAID", Context.class);
        } catch (Exception e10) {
            c.a("xm reflect exception!" + e10);
        }
    }

    private String a(Context context, Object obj, Method method) {
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

    @Override // com.tencent.qmsp.sdk.base.b
    public String a() {
        Method method;
        Object obj = f102034c;
        if (obj == null || (method = f102035d) == null) {
            return null;
        }
        return a(this.f102037a, obj, method);
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.f102037a = context;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public String b() {
        Method method;
        Object obj = f102034c;
        if (obj == null || (method = f102036e) == null) {
            return null;
        }
        return a(this.f102037a, obj, method);
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void c() {
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public boolean d() {
        return true;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public boolean e() {
        return (f102033b == null || f102034c == null) ? false : true;
    }

    @Override // com.tencent.qmsp.sdk.base.b
    public void f() {
    }
}
