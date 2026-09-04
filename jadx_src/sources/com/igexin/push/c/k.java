package com.igexin.push.c;

import com.igexin.push.config.SDKUrlConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63380a = "DT_" + k.class.getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadPoolExecutor f63381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Future<j> f63382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f63383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r f63384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f63385f;

    public static String a(InetAddress inetAddress) throws NoSuchMethodException {
        try {
            Method declaredMethod = Class.forName("java.net.InetAddress").getDeclaredMethod("holder", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(inetAddress, new Object[0]);
            Field declaredField = objInvoke.getClass().getDeclaredField("address");
            declaredField.setAccessible(true);
            int iIntValue = ((Integer) declaredField.get(objInvoke)).intValue();
            String str = ((iIntValue >>> 24) & 255) + "." + ((iIntValue >>> 16) & 255) + "." + ((iIntValue >>> 8) & 255) + "." + (iIntValue & 255);
            com.igexin.a.a.c.b.a(f63380a + " i new Str: " + str, new Object[0]);
            return str;
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a(f63380a, "get i e = " + th2);
            throw new NoSuchMethodException("can't get ad by new method");
        }
    }

    public static void a() {
        ThreadPoolExecutor threadPoolExecutor;
        if (SDKUrlConfig.getXfrAddress().length != 1 || (threadPoolExecutor = f63381b) == null) {
            return;
        }
        try {
            threadPoolExecutor.shutdownNow();
            f63381b = null;
        } catch (Throwable unused) {
        }
    }

    private void g() {
        if (f63381b == null) {
            f63381b = new ThreadPoolExecutor(0, 12, 60L, TimeUnit.SECONDS, new SynchronousQueue());
        }
        this.f63382c = f63381b.submit(new l(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String h() {
        return this.f63383d.a() + "|" + this.f63383d.c();
    }

    private void i() {
        try {
            Future<j> future = this.f63382c;
            if (future == null || future.isCancelled() || this.f63382c.isDone()) {
                return;
            }
            this.f63382c.cancel(true);
            this.f63382c = null;
        } catch (Exception unused) {
        }
    }

    public void a(j jVar) {
        this.f63383d = jVar;
    }

    public void a(r rVar) {
        synchronized (r.class) {
            this.f63384e = rVar;
        }
    }

    public void a(boolean z10) {
        this.f63385f = z10;
    }

    public j b() {
        return this.f63383d;
    }

    protected void c() {
        synchronized (r.class) {
            if (this.f63384e != null) {
                g();
            }
        }
    }

    public void d() {
        com.igexin.a.a.c.b.a(f63380a + "|stop " + h() + " task", new Object[0]);
        i();
    }

    public void e() {
        a((r) null);
        i();
    }
}
