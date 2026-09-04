package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import com.google.common.util.concurrent.p0;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class AbstractFuture<V> implements p0<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final boolean f29315e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f29316f = Logger.getLogger(AbstractFuture.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f29317g = 1000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final b f29318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f29319i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    volatile Object f29320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    volatile d f29321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    volatile h f29322d;

    public static final class Failure {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Failure f29323b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.work.impl.utils.futures.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f29324a;

        Failure(Throwable th2) {
            this.f29324a = (Throwable) AbstractFuture.d(th2);
        }
    }

    public static abstract class b {
        private b() {
        }

        abstract boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2);

        abstract boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        abstract boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f29325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f29326d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f29327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        final Throwable f29328b;

        static {
            if (AbstractFuture.f29315e) {
                f29326d = null;
                f29325c = null;
            } else {
                f29326d = new c(false, null);
                f29325c = new c(true, null);
            }
        }

        c(boolean z10, @androidx.annotation.p0 Throwable th2) {
            this.f29327a = z10;
            this.f29328b = th2;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final d f29329d = new d(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f29330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f29331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        d f29332c;

        d(Runnable runnable, Executor executor) {
            this.f29330a = runnable;
            this.f29331b = executor;
        }
    }

    public static final class e extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<h, Thread> f29333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<h, h> f29334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFuture, h> f29335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFuture, d> f29336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFuture, Object> f29337e;

        e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f29333a = atomicReferenceFieldUpdater;
            this.f29334b = atomicReferenceFieldUpdater2;
            this.f29335c = atomicReferenceFieldUpdater3;
            this.f29336d = atomicReferenceFieldUpdater4;
            this.f29337e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2) {
            return androidx.concurrent.futures.a.a(this.f29336d, abstractFuture, dVar, dVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return androidx.concurrent.futures.a.a(this.f29337e, abstractFuture, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2) {
            return androidx.concurrent.futures.a.a(this.f29335c, abstractFuture, hVar, hVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        void d(h hVar, h hVar2) {
            this.f29334b.lazySet(hVar, hVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        void e(h hVar, Thread thread) {
            this.f29333a.lazySet(hVar, thread);
        }
    }

    public static final class f<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AbstractFuture<V> f29338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final p0<? extends V> f29339c;

        f(AbstractFuture<V> abstractFuture, p0<? extends V> p0Var) {
            this.f29338b = abstractFuture;
            this.f29339c = p0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29338b.f29320b != this) {
                return;
            }
            if (AbstractFuture.f29318h.b(this.f29338b, this, AbstractFuture.i(this.f29339c))) {
                AbstractFuture.f(this.f29338b);
            }
        }
    }

    public static final class g extends b {
        g() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f29321c != dVar) {
                    return false;
                }
                abstractFuture.f29321c = dVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f29320b != obj) {
                    return false;
                }
                abstractFuture.f29320b = obj2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f29322d != hVar) {
                    return false;
                }
                abstractFuture.f29322d = hVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        void d(h hVar, h hVar2) {
            hVar.f29342b = hVar2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        void e(h hVar, Thread thread) {
            hVar.f29341a = thread;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final h f29340c = new h(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        volatile Thread f29341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        volatile h f29342b;

        h() {
            AbstractFuture.f29318h.e(this, Thread.currentThread());
        }

        h(boolean z10) {
        }

        void a(h hVar) {
            AbstractFuture.f29318h.d(this, hVar);
        }

        void b() {
            Thread thread = this.f29341a;
            if (thread != null) {
                this.f29341a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, ak.av), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, h.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, d.class, ak.aF), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "b"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f29318h = gVar;
        if (th != null) {
            f29316f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f29319i = new Object();
    }

    protected AbstractFuture() {
    }

    private void a(StringBuilder sb2) {
        try {
            Object objJ = j(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(s(objJ));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException c(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @n0
    static <T> T d(@androidx.annotation.p0 T t10) {
        t10.getClass();
        return t10;
    }

    private d e(d dVar) {
        d dVar2;
        do {
            dVar2 = this.f29321c;
        } while (!f29318h.a(this, dVar2, d.f29329d));
        d dVar3 = dVar;
        d dVar4 = dVar2;
        while (dVar4 != null) {
            d dVar5 = dVar4.f29332c;
            dVar4.f29332c = dVar3;
            dVar3 = dVar4;
            dVar4 = dVar5;
        }
        return dVar3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static void f(AbstractFuture<?> abstractFuture) {
        d dVar = null;
        while (true) {
            abstractFuture.n();
            abstractFuture.b();
            d dVarE = abstractFuture.e(dVar);
            while (dVarE != null) {
                dVar = dVarE.f29332c;
                Runnable runnable = dVarE.f29330a;
                if (runnable instanceof f) {
                    f fVar = (f) runnable;
                    abstractFuture = fVar.f29338b;
                    if (abstractFuture.f29320b == fVar) {
                        if (f29318h.b(abstractFuture, fVar, i(fVar.f29339c))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, dVarE.f29331b);
                }
                dVarE = dVar;
            }
            return;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f29316f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f29328b);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f29324a);
        }
        if (obj == f29319i) {
            return null;
        }
        return obj;
    }

    static Object i(p0<?> p0Var) {
        if (p0Var instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) p0Var).f29320b;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f29327a) {
                return cVar.f29328b != null ? new c(false, cVar.f29328b) : c.f29326d;
            }
            return obj;
        }
        boolean zIsCancelled = p0Var.isCancelled();
        if ((!f29315e) && zIsCancelled) {
            return c.f29326d;
        }
        try {
            Object objJ = j(p0Var);
            return objJ == null ? f29319i : objJ;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + p0Var, e10));
        } catch (ExecutionException e11) {
            return new Failure(e11.getCause());
        } catch (Throwable th2) {
            return new Failure(th2);
        }
    }

    private static <V> V j(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    private void n() {
        h hVar;
        do {
            hVar = this.f29322d;
        } while (!f29318h.c(this, hVar, h.f29340c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f29342b;
        }
    }

    private void o(h hVar) {
        hVar.f29341a = null;
        while (true) {
            h hVar2 = this.f29322d;
            if (hVar2 == h.f29340c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f29342b;
                if (hVar2.f29341a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f29342b = hVar4;
                    if (hVar3.f29341a == null) {
                    }
                } else if (!f29318h.c(this, hVar2, hVar4)) {
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.p0
    public final void V(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        d dVar = this.f29321c;
        if (dVar != d.f29329d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f29332c = dVar;
                if (f29318h.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.f29321c;
                }
            } while (dVar != d.f29329d);
        }
        g(runnable, executor);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f29320b;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (f29315e) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f29325c : c.f29326d;
        }
        AbstractFuture<V> abstractFuture = this;
        boolean z11 = false;
        while (true) {
            if (f29318h.b(abstractFuture, obj, cVar)) {
                if (z10) {
                    abstractFuture.k();
                }
                f(abstractFuture);
                if (!(obj instanceof f)) {
                    return true;
                }
                p0<? extends V> p0Var = ((f) obj).f29339c;
                if (!(p0Var instanceof AbstractFuture)) {
                    p0Var.cancel(z10);
                    return true;
                }
                abstractFuture = (AbstractFuture) p0Var;
                obj = abstractFuture.f29320b;
                if (!(obj == null) && !(obj instanceof f)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = abstractFuture.f29320b;
                if (!(obj instanceof f)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f29320b;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return h(obj2);
        }
        h hVar = this.f29322d;
        if (hVar != h.f29340c) {
            h hVar2 = new h();
            do {
                hVar2.a(hVar);
                if (f29318h.c(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            o(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f29320b;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return h(obj);
                }
                hVar = this.f29322d;
            } while (hVar != h.f29340c);
        }
        return h(this.f29320b);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f29320b;
        if ((obj != null) && (!(obj instanceof f))) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f29322d;
            if (hVar != h.f29340c) {
                h hVar2 = new h();
                while (true) {
                    hVar2.a(hVar);
                    if (f29318h.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f29320b;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(hVar2);
                        break;
                    }
                    hVar = this.f29322d;
                    if (hVar == h.f29340c) {
                    }
                }
            }
            return h(this.f29320b);
        }
        while (nanos > 0) {
            Object obj3 = this.f29320b;
            if ((obj3 != null) && (!(obj3 instanceof f))) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + Constants.ACCEPT_TIME_SEPARATOR_SP;
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f29320b instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f29320b;
        return (!(obj instanceof f)) & (obj != null);
    }

    protected void k() {
    }

    final void l(@androidx.annotation.p0 Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(t());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.p0
    protected String m() {
        Object obj = this.f29320b;
        if (obj instanceof f) {
            return "setFuture=[" + s(((f) obj).f29339c) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected boolean p(@androidx.annotation.p0 V v10) {
        if (v10 == null) {
            v10 = (V) f29319i;
        }
        if (!f29318h.b(this, null, v10)) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean q(Throwable th2) {
        if (!f29318h.b(this, null, new Failure((Throwable) d(th2)))) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean r(p0<? extends V> p0Var) {
        Failure failure;
        d(p0Var);
        Object obj = this.f29320b;
        if (obj == null) {
            if (p0Var.isDone()) {
                if (!f29318h.b(this, null, i(p0Var))) {
                    return false;
                }
                f(this);
                return true;
            }
            f fVar = new f(this, p0Var);
            if (f29318h.b(this, null, fVar)) {
                try {
                    p0Var.V(fVar, DirectExecutor.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        failure = new Failure(th2);
                    } catch (Throwable unused) {
                        failure = Failure.f29323b;
                    }
                    f29318h.b(this, fVar, failure);
                }
                return true;
            }
            obj = this.f29320b;
        }
        if (obj instanceof c) {
            p0Var.cancel(((c) obj).f29327a);
        }
        return false;
    }

    protected final boolean t() {
        Object obj = this.f29320b;
        return (obj instanceof c) && ((c) obj).f29327a;
    }

    public String toString() {
        String strM;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strM = m();
            } catch (RuntimeException e10) {
                strM = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strM != null && !strM.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strM);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append(BBSLinkObj.REVIEW_STATE_PENDING);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
