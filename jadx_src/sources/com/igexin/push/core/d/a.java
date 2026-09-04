package com.igexin.push.core.d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a f63694b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f63695c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f63696d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f63697e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f63699g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ThreadPoolExecutor f63698f = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f63693a = d.a(Build.MANUFACTURER.toUpperCase());

    public static a a() {
        if (f63694b == null) {
            synchronized (a.class) {
                if (f63694b == null) {
                    f63694b = new a();
                }
            }
        }
        return f63694b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        c cVar = f63693a;
        if (cVar == null || context == null) {
            return;
        }
        f63695c = context.getApplicationContext();
        boolean zC = c();
        f63697e = zC;
        if (zC) {
            f63696d = cVar.c(f63695c);
        }
    }

    private boolean c() {
        c cVar;
        try {
            Context context = f63695c;
            if (context == null || (cVar = f63693a) == null) {
                return false;
            }
            return cVar.a(context);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d() {
        c cVar;
        try {
            Context context = f63695c;
            if (context != null && (cVar = f63693a) != null && f63696d) {
                return cVar.b(context);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a(Context context, e eVar) {
        if (!TextUtils.isEmpty(f63699g) && eVar != null) {
            eVar.a(true, f63699g);
        } else {
            try {
                f63698f.execute(new b(this, context, eVar));
            } catch (Throwable unused) {
            }
        }
    }
}
