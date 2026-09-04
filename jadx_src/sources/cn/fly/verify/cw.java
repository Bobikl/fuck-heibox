package cn.fly.verify;

import java.io.OutputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class cw implements dm<cw> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final fu f36088a = new fu();

    public static <T> T a(ft ftVar, HashMap<String, String> map, HashMap<String, Object> map2, String str, boolean z10) throws Throwable {
        return (T) ftVar.a(false, map, map2, str, z10);
    }

    public static String a(String str, HashMap<String, Object> map, HashMap<String, String> map2) throws Throwable {
        return f36088a.a(str, map, map2);
    }

    public static String a(String str, HashMap<String, Object> map, HashMap<String, String> map2, fu.a aVar) throws Throwable {
        return f36088a.b(str, map, map2, aVar);
    }

    public static void a(String str, OutputStream outputStream, fu.a aVar) throws Throwable {
        f36088a.a(str, outputStream, aVar);
    }

    @Override // cn.fly.verify.dm
    public boolean a(cw cwVar, Class<cw> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if ("hGet".equals(str)) {
            try {
                objArr2[0] = a((String) objArr[0], (HashMap<String, Object>) objArr[1], (HashMap<String, String>) objArr[2]);
            } catch (Throwable th2) {
                thArr[0] = th2;
                objArr2[0] = null;
            }
            return true;
        }
        if ("pst".equals(str)) {
            try {
                objArr2[0] = a((String) objArr[0], (HashMap) objArr[1], (HashMap) objArr[2], (fu.a) objArr[3]);
            } catch (Throwable th3) {
                thArr[0] = th3;
                objArr2[0] = null;
            }
            return true;
        }
        if (ba.a("0081fefmhi)giZfm=f^fe").equals(str)) {
            try {
                a((String) objArr[0], (OutputStream) objArr[1], (fu.a) objArr[2]);
            } catch (Throwable th4) {
                thArr[0] = th4;
                objArr2[0] = null;
            }
            return true;
        }
        if (!ba.a("007Xfl%hEfggngePge").equals(str)) {
            return false;
        }
        try {
            objArr2[0] = a((ft) objArr[0], (HashMap) objArr[1], (HashMap) objArr[2], (String) objArr[3], ((Boolean) objArr[4]).booleanValue());
        } catch (Throwable th5) {
            thArr[0] = th5;
            objArr2[0] = null;
        }
        return true;
    }
}
