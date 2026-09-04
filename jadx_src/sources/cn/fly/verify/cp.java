package cn.fly.verify;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class cp extends cg {
    public cp(Context context) {
        super(context);
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
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    @Override // cn.fly.verify.cg
    protected cg.b b() {
        Class<?> cls;
        Object objNewInstance;
        Method method = null;
        try {
            cls = Class.forName(eh.b("034bYcjceckQcd'cbcicjchcbckchcbckchceYifSckddcbfkcicjccchcb;e1ciddce]if"));
            try {
                objNewInstance = cls.newInstance();
            } catch (Throwable th2) {
                th = th2;
                es.a().a(th);
                objNewInstance = null;
            }
        } catch (Throwable th3) {
            th = th3;
            cls = null;
        }
        if (cls != null && objNewInstance != null) {
            try {
                method = cls.getMethod(eh.b("0074di*ehVfgecddek"), Context.class);
            } catch (Throwable th4) {
                es.a().a(th4);
            }
        }
        cg.b bVar = new cg.b();
        bVar.f36026a = a(this.f36018a, objNewInstance, method);
        return bVar;
    }
}
