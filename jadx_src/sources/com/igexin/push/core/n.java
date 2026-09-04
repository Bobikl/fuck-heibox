package com.igexin.push.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile n f63761e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f63762a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f63764c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f63765d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63763b = false;

    private n() {
        b();
    }

    public static n a() {
        if (f63761e == null) {
            synchronized (n.class) {
                if (f63761e == null) {
                    f63761e = new n();
                }
            }
        }
        return f63761e;
    }

    private void b() {
        new Thread(new o(this), "MessageTaskIDPreferences-load").start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() throws Throwable {
        Cursor cursorA;
        Throwable th2;
        synchronized (this.f63762a) {
            if (this.f63763b) {
                return;
            }
            Cursor cursor = null;
            try {
                try {
                    cursorA = c.a().k().a("message", new String[]{"taskid"}, " createtime >= " + (System.currentTimeMillis() - 604800000));
                    if (cursorA != null) {
                        try {
                            if (cursorA.getCount() <= 0) {
                                com.igexin.a.a.c.b.a("MessageTaskIDPreference|db cnt = 0", new Object[0]);
                            } else {
                                while (cursorA.moveToNext()) {
                                    this.f63764c.put(cursorA.getString(cursorA.getColumnIndex("taskid")), null);
                                }
                            }
                        } catch (Exception unused) {
                            cursor = cursorA;
                            synchronized (this.f63762a) {
                                this.f63763b = true;
                                this.f63762a.notifyAll();
                            }
                            if (cursor == null) {
                                return;
                            } else {
                                cursor.close();
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            synchronized (this.f63762a) {
                                this.f63763b = true;
                                this.f63762a.notifyAll();
                            }
                            if (cursorA != null) {
                                try {
                                    cursorA.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            throw th2;
                        }
                    } else {
                        com.igexin.a.a.c.b.a("MessageTaskIDPreference|db cnt = 0", new Object[0]);
                    }
                    synchronized (this.f63762a) {
                        this.f63763b = true;
                        this.f63762a.notifyAll();
                    }
                    if (cursorA != null) {
                        cursorA.close();
                    }
                } catch (Throwable unused3) {
                }
            } catch (Exception unused4) {
            } catch (Throwable th4) {
                cursorA = null;
                th2 = th4;
            }
        }
    }

    private void d() {
        synchronized (this.f63762a) {
            while (!this.f63763b) {
                try {
                    this.f63762a.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public void a(String str, ContentValues contentValues) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d();
        synchronized (this.f63762a) {
            this.f63764c.put(str, null);
        }
        this.f63765d.execute(new p(this, contentValues));
    }

    public boolean a(String str) {
        boolean zContainsKey;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        d();
        synchronized (this.f63762a) {
            zContainsKey = this.f63764c.containsKey(str);
        }
        return zContainsKey;
    }

    public void b(String str, ContentValues contentValues) {
        if (a(str)) {
            this.f63765d.execute(new q(this, contentValues, str));
        }
    }
}
