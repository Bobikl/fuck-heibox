package cn.fly.verify;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class ev implements eu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f36367a = bq.a("014YemgjigifgikgieikIe5gjediheekg");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile boolean f36368j = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Method f36369b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Method f36370c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Method f36371d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f36372e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Method f36373f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Method f36374g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Method f36375h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36376i = false;

    public static boolean b(Context context) {
        if (!f36368j) {
            try {
                File file = new File(context.getFilesDir(), f36367a);
                if (file.exists()) {
                    f36368j = file.delete();
                }
            } catch (Throwable unused) {
            }
        }
        return f36368j;
    }

    @Override // cn.fly.verify.eu
    public <T> T a(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr) throws Throwable {
        Method method = this.f36370c;
        if (method != null) {
            return (T) method.invoke(null, cls, obj, str, clsArr, objArr);
        }
        throw new Throwable("IHA is null");
    }

    @Override // cn.fly.verify.eu
    public <T> T a(String str) throws Throwable {
        Method method = this.f36372e;
        if (method != null) {
            return (T) method.invoke(null, str);
        }
        throw new Throwable("nHI is null");
    }

    @Override // cn.fly.verify.eu
    public <T> T a(String str, Object obj, String str2, Class[] clsArr, Object[] objArr) throws Throwable {
        Method method = this.f36371d;
        if (method != null) {
            return (T) method.invoke(null, str, obj, str2, clsArr, objArr);
        }
        throw new Throwable("IHABC is null");
    }

    @Override // cn.fly.verify.eu
    public <T> T a(String str, String str2, Object obj) throws Throwable {
        Method method = this.f36374g;
        if (method != null) {
            return (T) method.invoke(null, str, str2, obj);
        }
        throw new Throwable("gHF is null");
    }

    @Override // cn.fly.verify.eu
    public <T> T a(String str, Class[] clsArr, Object[] objArr) throws Throwable {
        Method method = this.f36373f;
        if (method != null) {
            return (T) method.invoke(null, str, clsArr, objArr);
        }
        throw new Throwable("nHIByParams is null");
    }

    public boolean a(Context context) {
        try {
            gj.a(new File(context.getFilesDir(), bq.a("0143emgjigifgikgieikVeHgjediheeig")));
        } catch (Throwable unused) {
        }
        try {
            File file = new File(context.getFilesDir(), f36367a);
            FileOutputStream fileOutputStream = null;
            if (!file.exists()) {
                byte[] bArrDecode = Base64.decode("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", 2);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        fileOutputStream2.write(bArrDecode);
                        el.a(fileOutputStream2);
                        file.setReadOnly();
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        el.a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            Class cls = (Class) gi.a(gi.a(gi.a(bq.a("0211ed;ehDeeejfiemgjfdgj,jg6egemgm>gCfjhdej2hg")), file), bq.a("009h-el]eRedfeOhe(gjgj"), new Object[]{bq.a("026d4elegemegedemPdej_emggejHf1ed?gXekemglejgkejSfMed6gBek"), null}, (Class<?>[]) new Class[]{String.class, ClassLoader.class});
            Method declaredMethod = cls.getDeclaredMethod(bq.a("014g5fjPgUeg1kj$ejel,fNgjglgehmff"), String[].class);
            this.f36369b = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls.getDeclaredMethod(bq.a("010*ej3f]eeelfi$gYglgehmff"), Class.class, Object.class, String.class, Class[].class, Object[].class);
            this.f36370c = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = cls.getDeclaredMethod(bq.a("010UejGfUeeelfi7gXglgehmff"), String.class, Object.class, String.class, Class[].class, Object[].class);
            this.f36371d = declaredMethod3;
            declaredMethod3.setAccessible(true);
            Method declaredMethod4 = cls.getDeclaredMethod(bq.a("012fg@ghglffPf*gj^jefdg"), String.class);
            this.f36372e = declaredMethod4;
            declaredMethod4.setAccessible(true);
            Method declaredMethod5 = cls.getDeclaredMethod(bq.a("012fg-ghglffBfWgj'jefdg"), String.class, Class[].class, Object[].class);
            this.f36373f = declaredMethod5;
            declaredMethod5.setAccessible(true);
            Method declaredMethod6 = cls.getDeclaredMethod(bq.a("009Wfk.gjEglhdejQgh1ed"), String.class, String.class, Object.class);
            this.f36374g = declaredMethod6;
            declaredMethod6.setAccessible(true);
            Method declaredMethod7 = cls.getDeclaredMethod(bq.a("0079fk1gj2glfe_h he"), String.class);
            this.f36375h = declaredMethod7;
            declaredMethod7.setAccessible(true);
            this.f36376i = true;
        } catch (Throwable unused2) {
            this.f36376i = false;
        }
        return this.f36376i;
    }
}
