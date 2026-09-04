package com.xiaomi.push;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class av implements ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f106836a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Class<?> f195a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Object f196a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Method f197a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Method f106837b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Method f106838c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Method f106839d = null;

    public av(Context context) {
        this.f106836a = context;
        a(context);
    }

    private String a(Context context, Method method) {
        Object obj = this.f196a;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a("miui invoke error", e10);
            return null;
        }
    }

    private void a(Context context) {
        try {
            Class<?> clsA = C1339r.a(context, "com.android.id.impl.IdProviderImpl");
            this.f195a = clsA;
            this.f196a = clsA.newInstance();
            this.f106837b = this.f195a.getMethod("getOAID", Context.class);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a("miui load class error", e10);
        }
    }

    @Override // com.xiaomi.push.ar
    /* JADX INFO: renamed from: a */
    public String mo150a() {
        return a(this.f106836a, this.f106837b);
    }

    @Override // com.xiaomi.push.ar
    /* JADX INFO: renamed from: a */
    public boolean mo151a() {
        return (this.f195a == null || this.f196a == null) ? false : true;
    }
}
