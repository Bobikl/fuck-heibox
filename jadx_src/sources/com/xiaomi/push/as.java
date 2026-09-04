package com.xiaomi.push;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes4.dex */
public class as implements ar, InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[][] f106824a = {new String[]{"com.bun.supplier.IIdentifierListener", "com.bun.supplier.IdSupplier"}, new String[]{"com.bun.miitmdid.core.IIdentifierListener", "com.bun.miitmdid.supplier.IdSupplier"}};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f187a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Class f189a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class f106825b = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Method f191a = null;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Method f192b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Method f106826c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Method f106827d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f106828e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Method f106829f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Method f106830g = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final Object f190a = new Object();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private volatile int f185a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private volatile long f186a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private volatile a f188a = null;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        Boolean f193a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        String f194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f106832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f106833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f106834d;

        private a() {
            this.f193a = null;
            this.f194a = null;
            this.f106832b = null;
            this.f106833c = null;
            this.f106834d = null;
        }

        boolean a() {
            if (!TextUtils.isEmpty(this.f194a) || !TextUtils.isEmpty(this.f106832b) || !TextUtils.isEmpty(this.f106833c) || !TextUtils.isEmpty(this.f106834d)) {
                this.f193a = Boolean.TRUE;
            }
            return this.f193a != null;
        }
    }

    public as(Context context) {
        this.f187a = context.getApplicationContext();
        a(context);
        b(context);
    }

    private static Class<?> a(Context context, String str) {
        try {
            return C1339r.a(context, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static <T> T a(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            T t10 = (T) method.invoke(obj, objArr);
            if (t10 != null) {
                return t10;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    private void a() {
        synchronized (this.f190a) {
            try {
                this.f190a.notifyAll();
            } catch (Exception unused) {
            }
        }
    }

    private void a(Context context) {
        Class<?> clsA = a(context, "com.bun.miitmdid.core.MdidSdk");
        Class<?> cls = null;
        Class<?> cls2 = null;
        int i10 = 0;
        while (true) {
            String[][] strArr = f106824a;
            if (i10 >= strArr.length) {
                break;
            }
            String[] strArr2 = strArr[i10];
            Class<?> clsA2 = a(context, strArr2[0]);
            Class<?> clsA3 = a(context, strArr2[1]);
            if (clsA2 != null && clsA3 != null) {
                b("found class in index " + i10);
                cls2 = clsA3;
                cls = clsA2;
                break;
            }
            i10++;
            cls2 = clsA3;
            cls = clsA2;
        }
        this.f189a = clsA;
        this.f191a = a(clsA, "InitSdk", (Class<?>[]) new Class[]{Context.class, cls});
        this.f106825b = cls;
        this.f106826c = a(cls2, "getOAID", (Class<?>[]) new Class[0]);
        this.f106829f = a(cls2, "isSupported", (Class<?>[]) new Class[0]);
        this.f106830g = a(cls2, "shutDown", (Class<?>[]) new Class[0]);
    }

    private void a(String str) {
        if (this.f188a != null) {
            return;
        }
        long j10 = this.f186a;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j10);
        int i10 = this.f185a;
        if (jElapsedRealtime > 3000 && i10 < 3) {
            synchronized (this.f190a) {
                if (this.f186a == j10 && this.f185a == i10) {
                    b("retry, current count is " + i10);
                    this.f185a = this.f185a + 1;
                    b(this.f187a);
                    j10 = this.f186a;
                    jElapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j10);
                }
            }
        }
        if (this.f188a != null || j10 < 0 || jElapsedRealtime > 3000 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f190a) {
            if (this.f188a == null) {
                try {
                    b(str + " wait...");
                    this.f190a.wait(3000L);
                } catch (Exception unused) {
                }
            }
        }
    }

    private static boolean a(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double);
    }

    private void b(Context context) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = -jElapsedRealtime;
        Class cls = this.f106825b;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    classLoader = context.getClassLoader();
                }
                a(this.f191a, this.f189a.newInstance(), context, Proxy.newProxyInstance(classLoader, new Class[]{this.f106825b}, this));
            } catch (Throwable th2) {
                b("call init sdk error:" + th2);
                jElapsedRealtime = j10;
            }
        } else {
            jElapsedRealtime = j10;
        }
        this.f186a = jElapsedRealtime;
    }

    private static void b(String str) {
        com.xiaomi.channel.commonutils.logger.b.m62a("mdid:" + str);
    }

    @Override // com.xiaomi.push.ar
    /* JADX INFO: renamed from: a */
    public String mo150a() {
        a("getOAID");
        if (this.f188a == null) {
            return null;
        }
        return this.f188a.f106832b;
    }

    @Override // com.xiaomi.push.ar
    /* JADX INFO: renamed from: a */
    public boolean mo151a() {
        a("isSupported");
        return this.f188a != null && Boolean.TRUE.equals(this.f188a.f193a);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        this.f186a = SystemClock.elapsedRealtime();
        if (objArr != null) {
            a aVar = new a();
            for (Object obj2 : objArr) {
                if (obj2 != null && !a(obj2)) {
                    aVar.f106832b = (String) a(this.f106826c, obj2, new Object[0]);
                    aVar.f193a = (Boolean) a(this.f106829f, obj2, new Object[0]);
                    a(this.f106830g, obj2, new Object[0]);
                    if (aVar.a()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("has get succ, check duplicate:");
                        sb2.append(this.f188a != null);
                        b(sb2.toString());
                        synchronized (as.class) {
                            if (this.f188a == null) {
                                this.f188a = aVar;
                            }
                        }
                        break;
                    }
                }
            }
        }
        a();
        return null;
    }
}
