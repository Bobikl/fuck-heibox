package androidx.concurrent.futures;

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

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class AbstractResolvableFuture<V> implements p0<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final boolean f17221e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f17222f = Logger.getLogger(AbstractResolvableFuture.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f17223g = 1000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final b f17224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f17225i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    volatile Object f17226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    volatile d f17227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    volatile h f17228d;

    public static final class Failure {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Failure f17229b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.concurrent.futures.AbstractResolvableFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f17230a;

        Failure(Throwable th2) {
            this.f17230a = (Throwable) AbstractResolvableFuture.d(th2);
        }
    }

    public static abstract class b {
        private b() {
        }

        abstract boolean a(AbstractResolvableFuture<?> abstractResolvableFuture, d dVar, d dVar2);

        abstract boolean b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2);

        abstract boolean c(AbstractResolvableFuture<?> abstractResolvableFuture, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f17231c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f17232d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f17233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        final Throwable f17234b;

        static {
            if (AbstractResolvableFuture.f17221e) {
                f17232d = null;
                f17231c = null;
            } else {
                f17232d = new c(false, null);
                f17231c = new c(true, null);
            }
        }

        c(boolean z10, @androidx.annotation.p0 Throwable th2) {
            this.f17233a = z10;
            this.f17234b = th2;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final d f17235d = new d(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f17236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f17237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        d f17238c;

        d(Runnable runnable, Executor executor) {
            this.f17236a = runnable;
            this.f17237b = executor;
        }
    }

    public static final class e extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<h, Thread> f17239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<h, h> f17240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractResolvableFuture, h> f17241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractResolvableFuture, d> f17242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> f17243e;

        e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractResolvableFuture, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractResolvableFuture, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f17239a = atomicReferenceFieldUpdater;
            this.f17240b = atomicReferenceFieldUpdater2;
            this.f17241c = atomicReferenceFieldUpdater3;
            this.f17242d = atomicReferenceFieldUpdater4;
            this.f17243e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        boolean a(AbstractResolvableFuture<?> abstractResolvableFuture, d dVar, d dVar2) {
            return androidx.concurrent.futures.a.a(this.f17242d, abstractResolvableFuture, dVar, dVar2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        boolean b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            return androidx.concurrent.futures.a.a(this.f17243e, abstractResolvableFuture, obj, obj2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        boolean c(AbstractResolvableFuture<?> abstractResolvableFuture, h hVar, h hVar2) {
            return androidx.concurrent.futures.a.a(this.f17241c, abstractResolvableFuture, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        void d(h hVar, h hVar2) {
            this.f17240b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        void e(h hVar, Thread thread) {
            this.f17239a.lazySet(hVar, thread);
        }
    }

    public static final class f<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AbstractResolvableFuture<V> f17244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final p0<? extends V> f17245c;

        f(AbstractResolvableFuture<V> abstractResolvableFuture, p0<? extends V> p0Var) {
            this.f17244b = abstractResolvableFuture;
            this.f17245c = p0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f17244b.f17226b != this) {
                return;
            }
            if (AbstractResolvableFuture.f17224h.b(this.f17244b, this, AbstractResolvableFuture.i(this.f17245c))) {
                AbstractResolvableFuture.f(this.f17244b);
            }
        }
    }

    public static final class g extends b {
        g() {
            super();
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        boolean a(AbstractResolvableFuture<?> abstractResolvableFuture, d dVar, d dVar2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f17227c != dVar) {
                    return false;
                }
                abstractResolvableFuture.f17227c = dVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        boolean b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f17226b != obj) {
                    return false;
                }
                abstractResolvableFuture.f17226b = obj2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        boolean c(AbstractResolvableFuture<?> abstractResolvableFuture, h hVar, h hVar2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f17228d != hVar) {
                    return false;
                }
                abstractResolvableFuture.f17228d = hVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        void d(h hVar, h hVar2) {
            hVar.f17248b = hVar2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        void e(h hVar, Thread thread) {
            hVar.f17247a = thread;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final h f17246c = new h(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        volatile Thread f17247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        volatile h f17248b;

        h() {
            AbstractResolvableFuture.f17224h.e(this, Thread.currentThread());
        }

        h(boolean z10) {
        }

        void a(h hVar) {
            AbstractResolvableFuture.f17224h.d(this, hVar);
        }

        void b() {
            Thread thread = this.f17247a;
            if (thread != null) {
                this.f17247a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, ak.av), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, h.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, d.class, ak.aF), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "b"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f17224h = gVar;
        if (th != null) {
            f17222f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f17225i = new Object();
    }

    protected AbstractResolvableFuture() {
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
            dVar2 = this.f17227c;
        } while (!f17224h.a(this, dVar2, d.f17235d));
        d dVar3 = dVar;
        d dVar4 = dVar2;
        while (dVar4 != null) {
            d dVar5 = dVar4.f17238c;
            dVar4.f17238c = dVar3;
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
    static void f(AbstractResolvableFuture<?> abstractResolvableFuture) {
        d dVar = null;
        while (true) {
            abstractResolvableFuture.n();
            abstractResolvableFuture.b();
            d dVarE = abstractResolvableFuture.e(dVar);
            while (dVarE != null) {
                dVar = dVarE.f17238c;
                Runnable runnable = dVarE.f17236a;
                if (runnable instanceof f) {
                    f fVar = (f) runnable;
                    abstractResolvableFuture = fVar.f17244b;
                    if (abstractResolvableFuture.f17226b == fVar) {
                        if (f17224h.b(abstractResolvableFuture, fVar, i(fVar.f17245c))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, dVarE.f17237b);
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
            f17222f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f17234b);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f17230a);
        }
        if (obj == f17225i) {
            return null;
        }
        return obj;
    }

    static Object i(p0<?> p0Var) {
        if (p0Var instanceof AbstractResolvableFuture) {
            Object obj = ((AbstractResolvableFuture) p0Var).f17226b;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f17233a) {
                return cVar.f17234b != null ? new c(false, cVar.f17234b) : c.f17232d;
            }
            return obj;
        }
        boolean zIsCancelled = p0Var.isCancelled();
        if ((!f17221e) && zIsCancelled) {
            return c.f17232d;
        }
        try {
            Object objJ = j(p0Var);
            return objJ == null ? f17225i : objJ;
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

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    static <V> V j(Future<V> future) throws ExecutionException {
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
            hVar = this.f17228d;
        } while (!f17224h.c(this, hVar, h.f17246c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f17248b;
        }
    }

    private void o(h hVar) {
        hVar.f17247a = null;
        while (true) {
            h hVar2 = this.f17228d;
            if (hVar2 == h.f17246c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f17248b;
                if (hVar2.f17247a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f17248b = hVar4;
                    if (hVar3.f17247a == null) {
                    }
                } else if (!f17224h.c(this, hVar2, hVar4)) {
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
        d dVar = this.f17227c;
        if (dVar != d.f17235d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f17238c = dVar;
                if (f17224h.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.f17227c;
                }
            } while (dVar != d.f17235d);
        }
        g(runnable, executor);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f17226b;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (f17221e) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f17231c : c.f17232d;
        }
        AbstractResolvableFuture<V> abstractResolvableFuture = this;
        boolean z11 = false;
        while (true) {
            if (f17224h.b(abstractResolvableFuture, obj, cVar)) {
                if (z10) {
                    abstractResolvableFuture.k();
                }
                f(abstractResolvableFuture);
                if (!(obj instanceof f)) {
                    return true;
                }
                p0<? extends V> p0Var = ((f) obj).f17245c;
                if (!(p0Var instanceof AbstractResolvableFuture)) {
                    p0Var.cancel(z10);
                    return true;
                }
                abstractResolvableFuture = (AbstractResolvableFuture) p0Var;
                obj = abstractResolvableFuture.f17226b;
                if (!(obj == null) && !(obj instanceof f)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = abstractResolvableFuture.f17226b;
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
        Object obj2 = this.f17226b;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return h(obj2);
        }
        h hVar = this.f17228d;
        if (hVar != h.f17246c) {
            h hVar2 = new h();
            do {
                hVar2.a(hVar);
                if (f17224h.c(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            o(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f17226b;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return h(obj);
                }
                hVar = this.f17228d;
            } while (hVar != h.f17246c);
        }
        return h(this.f17226b);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f17226b;
        if ((obj != null) && (!(obj instanceof f))) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f17228d;
            if (hVar != h.f17246c) {
                h hVar2 = new h();
                while (true) {
                    hVar2.a(hVar);
                    if (f17224h.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f17226b;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(hVar2);
                        break;
                    }
                    hVar = this.f17228d;
                    if (hVar == h.f17246c) {
                    }
                }
            }
            return h(this.f17226b);
        }
        while (nanos > 0) {
            Object obj3 = this.f17226b;
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
        return this.f17226b instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f17226b;
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
        Object obj = this.f17226b;
        if (obj instanceof f) {
            return "setFuture=[" + s(((f) obj).f17245c) + "]";
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
            v10 = (V) f17225i;
        }
        if (!f17224h.b(this, null, v10)) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean q(Throwable th2) {
        if (!f17224h.b(this, null, new Failure((Throwable) d(th2)))) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean r(p0<? extends V> p0Var) {
        Failure failure;
        d(p0Var);
        Object obj = this.f17226b;
        if (obj == null) {
            if (p0Var.isDone()) {
                if (!f17224h.b(this, null, i(p0Var))) {
                    return false;
                }
                f(this);
                return true;
            }
            f fVar = new f(this, p0Var);
            if (f17224h.b(this, null, fVar)) {
                try {
                    p0Var.V(fVar, DirectExecutor.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        failure = new Failure(th2);
                    } catch (Throwable unused) {
                        failure = Failure.f17229b;
                    }
                    f17224h.b(this, fVar, failure);
                }
                return true;
            }
            obj = this.f17226b;
        }
        if (obj instanceof c) {
            p0Var.cancel(((c) obj).f17233a);
        }
        return false;
    }

    protected final boolean t() {
        Object obj = this.f17226b;
        return (obj instanceof c) && ((c) obj).f17233a;
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
