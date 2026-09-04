package com.google.common.eventbus;

import com.google.common.base.q;
import com.google.common.base.w;
import com.google.common.util.concurrent.y0;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: EventBus.java */
/* JADX INFO: loaded from: classes7.dex */
@e
public class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f58282f = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f58283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f58284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f58285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f58286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f58287e;

    /* JADX INFO: compiled from: EventBus.java */
    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f58288a = new a();

        a() {
        }

        private static Logger b(k kVar) {
            String name = f.class.getName();
            String strC = kVar.b().c();
            StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(strC).length());
            sb2.append(name);
            sb2.append(".");
            sb2.append(strC);
            return Logger.getLogger(sb2.toString());
        }

        private static String c(k kVar) {
            Method methodD = kVar.d();
            String name = methodD.getName();
            String name2 = methodD.getParameterTypes()[0].getName();
            String strValueOf = String.valueOf(kVar.c());
            String strValueOf2 = String.valueOf(kVar.a());
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 80 + name2.length() + strValueOf.length() + strValueOf2.length());
            sb2.append("Exception thrown by subscriber method ");
            sb2.append(name);
            sb2.append('(');
            sb2.append(name2);
            sb2.append(')');
            sb2.append(" on subscriber ");
            sb2.append(strValueOf);
            sb2.append(" when dispatching event: ");
            sb2.append(strValueOf2);
            return sb2.toString();
        }

        @Override // com.google.common.eventbus.l
        public void a(Throwable th2, k kVar) {
            Logger loggerB = b(kVar);
            Level level = Level.SEVERE;
            if (loggerB.isLoggable(level)) {
                loggerB.log(level, c(kVar), th2);
            }
        }
    }

    public f() {
        this("default");
    }

    public f(l lVar) {
        this("default", y0.c(), d.d(), lVar);
    }

    public f(String str) {
        this(str, y0.c(), d.d(), a.f58288a);
    }

    f(String str, Executor executor, d dVar, l lVar) {
        this.f58286d = new m(this);
        this.f58283a = (String) w.E(str);
        this.f58284b = (Executor) w.E(executor);
        this.f58287e = (d) w.E(dVar);
        this.f58285c = (l) w.E(lVar);
    }

    final Executor a() {
        return this.f58284b;
    }

    void b(Throwable th2, k kVar) {
        w.E(th2);
        w.E(kVar);
        try {
            this.f58285c.a(th2, kVar);
        } catch (Throwable th3) {
            f58282f.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", th3, th2), th3);
        }
    }

    public final String c() {
        return this.f58283a;
    }

    public void d(Object obj) {
        Iterator<j> itF = this.f58286d.f(obj);
        if (itF.hasNext()) {
            this.f58287e.a(obj, itF);
        } else {
            if (obj instanceof c) {
                return;
            }
            d(new c(this, obj));
        }
    }

    public void e(Object obj) {
        this.f58286d.h(obj);
    }

    public void f(Object obj) {
        this.f58286d.i(obj);
    }

    public String toString() {
        return q.c(this).s(this.f58283a).toString();
    }
}
