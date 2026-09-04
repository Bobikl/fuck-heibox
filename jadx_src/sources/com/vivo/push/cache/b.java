package com.vivo.push.cache;

import android.content.Context;
import com.vivo.push.util.p;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ConfigManagerFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f106519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f106520b;

    private b() {
    }

    public static synchronized b a() {
        if (f106519a == null) {
            f106519a = new b();
        }
        return f106519a;
    }

    public final d a(Context context) {
        d dVar = this.f106520b;
        if (dVar != null) {
            return dVar;
        }
        try {
            Method method = ClientConfigManagerImpl.class.getMethod("getInstance", Context.class);
            p.d("ConfigManagerFactory", "createConfig success is ".concat("com.vivo.push.cache.ClientConfigManagerImpl"));
            d dVar2 = (d) method.invoke(null, context);
            this.f106520b = dVar2;
            return dVar2;
        } catch (Exception e10) {
            e10.printStackTrace();
            p.b("ConfigManagerFactory", "createConfig error", e10);
            return null;
        }
    }
}
