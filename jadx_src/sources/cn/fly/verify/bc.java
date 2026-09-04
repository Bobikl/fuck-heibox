package cn.fly.verify;

import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public class bc {
    public static <T> T a(bd bdVar, String str, Class<T> cls, T t10) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            es.a().b("WARNING: gt mta in main: key = " + str);
        }
        Object objA = eh.a(str, cls, bdVar);
        if (objA == null) {
            objA = eh.a(str);
        }
        return objA == null ? t10 : (T) objA;
    }
}
