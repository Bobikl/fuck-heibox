package com.google.common.util.concurrent;

import com.google.j2objc.annotations.ReflectionSupport;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
@u
@ReflectionSupport(ReflectionSupport.Level.FULL)
@o9.b(emulated = true)
public abstract class AbstractFuture<V> extends com.google.common.util.concurrent.internal.a implements p0<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final boolean f59162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f59163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f59164g = 1000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f59165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f59166i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private volatile Object f59167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private volatile d f59168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    private volatile k f59169d;

    public static final class Failure {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Failure f59170b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.common.util.concurrent.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f59171a;

        Failure(Throwable th2) {
            this.f59171a = (Throwable) com.google.common.base.w.E(th2);
        }
    }

    public static abstract class b {
        private b() {
        }

        abstract boolean a(AbstractFuture<?> abstractFuture, @CheckForNull d dVar, d dVar2);

        abstract boolean b(AbstractFuture<?> abstractFuture, @CheckForNull Object obj, Object obj2);

        abstract boolean c(AbstractFuture<?> abstractFuture, @CheckForNull k kVar, @CheckForNull k kVar2);

        abstract d d(AbstractFuture<?> abstractFuture, d dVar);

        abstract k e(AbstractFuture<?> abstractFuture, k kVar);

        abstract void f(k kVar, @CheckForNull k kVar2);

        abstract void g(k kVar, Thread thread);
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        static final c f59172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        static final c f59173d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f59174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        final Throwable f59175b;

        static {
            if (AbstractFuture.f59162e) {
                f59173d = null;
                f59172c = null;
            } else {
                f59173d = new c(false, null);
                f59172c = new c(true, null);
            }
        }

        c(boolean z10, @CheckForNull Throwable th2) {
            this.f59174a = z10;
            this.f59175b = th2;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final d f59176d = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @CheckForNull
        final Runnable f59177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        final Executor f59178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        d f59179c;

        d() {
            this.f59177a = null;
            this.f59178b = null;
        }

        d(Runnable runnable, Executor executor) {
            this.f59177a = runnable;
            this.f59178b = executor;
        }
    }

    public static final class e extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<k, Thread> f59180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<k, k> f59181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFuture, k> f59182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFuture, d> f59183d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFuture, Object> f59184e;

        e(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f59180a = atomicReferenceFieldUpdater;
            this.f59181b = atomicReferenceFieldUpdater2;
            this.f59182c = atomicReferenceFieldUpdater3;
            this.f59183d = atomicReferenceFieldUpdater4;
            this.f59184e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean a(AbstractFuture<?> abstractFuture, @CheckForNull d dVar, d dVar2) {
            return androidx.concurrent.futures.a.a(this.f59183d, abstractFuture, dVar, dVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean b(AbstractFuture<?> abstractFuture, @CheckForNull Object obj, Object obj2) {
            return androidx.concurrent.futures.a.a(this.f59184e, abstractFuture, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean c(AbstractFuture<?> abstractFuture, @CheckForNull k kVar, @CheckForNull k kVar2) {
            return androidx.concurrent.futures.a.a(this.f59182c, abstractFuture, kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        d d(AbstractFuture<?> abstractFuture, d dVar) {
            return this.f59183d.getAndSet(abstractFuture, dVar);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        k e(AbstractFuture<?> abstractFuture, k kVar) {
            return this.f59182c.getAndSet(abstractFuture, kVar);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        void f(k kVar, @CheckForNull k kVar2) {
            this.f59181b.lazySet(kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        void g(k kVar, Thread thread) {
            this.f59180a.lazySet(kVar, thread);
        }
    }

    public static final class f<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AbstractFuture<V> f59185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final p0<? extends V> f59186c;

        f(AbstractFuture<V> abstractFuture, p0<? extends V> p0Var) {
            this.f59185b = abstractFuture;
            this.f59186c = p0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractFuture) this.f59185b).f59167b != this) {
                return;
            }
            if (AbstractFuture.f59165h.b(this.f59185b, this, AbstractFuture.u(this.f59186c))) {
                AbstractFuture.r(this.f59185b);
            }
        }
    }

    public static final class g extends b {
        private g() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean a(AbstractFuture<?> abstractFuture, @CheckForNull d dVar, d dVar2) {
            synchronized (abstractFuture) {
                if (((AbstractFuture) abstractFuture).f59168c != dVar) {
                    return false;
                }
                ((AbstractFuture) abstractFuture).f59168c = dVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean b(AbstractFuture<?> abstractFuture, @CheckForNull Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (((AbstractFuture) abstractFuture).f59167b != obj) {
                    return false;
                }
                ((AbstractFuture) abstractFuture).f59167b = obj2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean c(AbstractFuture<?> abstractFuture, @CheckForNull k kVar, @CheckForNull k kVar2) {
            synchronized (abstractFuture) {
                if (((AbstractFuture) abstractFuture).f59169d != kVar) {
                    return false;
                }
                ((AbstractFuture) abstractFuture).f59169d = kVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        d d(AbstractFuture<?> abstractFuture, d dVar) {
            d dVar2;
            synchronized (abstractFuture) {
                dVar2 = ((AbstractFuture) abstractFuture).f59168c;
                if (dVar2 != dVar) {
                    ((AbstractFuture) abstractFuture).f59168c = dVar;
                }
            }
            return dVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        k e(AbstractFuture<?> abstractFuture, k kVar) {
            k kVar2;
            synchronized (abstractFuture) {
                kVar2 = ((AbstractFuture) abstractFuture).f59169d;
                if (kVar2 != kVar) {
                    ((AbstractFuture) abstractFuture).f59169d = kVar;
                }
            }
            return kVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        void f(k kVar, @CheckForNull k kVar2) {
            kVar.f59195b = kVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        void g(k kVar, Thread thread) {
            kVar.f59194a = thread;
        }
    }

    public interface h<V> extends p0<V> {
    }

    public static abstract class i<V> extends AbstractFuture<V> implements h<V> {
        i() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.p0
        public final void V(Runnable runnable, Executor executor) {
            super.V(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @s9.a
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @s9.a
        @b1
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @s9.a
        @b1
        public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j10, timeUnit);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    public static final class j extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Unsafe f59187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final long f59188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final long f59189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final long f59190d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final long f59191e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f59192f;

        public class a implements PrivilegedExceptionAction<Unsafe> {
            a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f59189c = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("d"));
                f59188b = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField(ak.aF));
                f59190d = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("b"));
                f59191e = unsafe.objectFieldOffset(k.class.getDeclaredField(ak.av));
                f59192f = unsafe.objectFieldOffset(k.class.getDeclaredField("b"));
                f59187a = unsafe;
            } catch (Exception e11) {
                com.google.common.base.d0.w(e11);
                throw new RuntimeException(e11);
            }
        }

        private j() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean a(AbstractFuture<?> abstractFuture, @CheckForNull d dVar, d dVar2) {
            return com.google.common.util.concurrent.c.a(f59187a, abstractFuture, f59188b, dVar, dVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean b(AbstractFuture<?> abstractFuture, @CheckForNull Object obj, Object obj2) {
            return com.google.common.util.concurrent.c.a(f59187a, abstractFuture, f59190d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean c(AbstractFuture<?> abstractFuture, @CheckForNull k kVar, @CheckForNull k kVar2) {
            return com.google.common.util.concurrent.c.a(f59187a, abstractFuture, f59189c, kVar, kVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        d d(AbstractFuture<?> abstractFuture, d dVar) {
            d dVar2;
            do {
                dVar2 = ((AbstractFuture) abstractFuture).f59168c;
                if (dVar == dVar2) {
                    return dVar2;
                }
            } while (!a(abstractFuture, dVar2, dVar));
            return dVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        k e(AbstractFuture<?> abstractFuture, k kVar) {
            k kVar2;
            do {
                kVar2 = ((AbstractFuture) abstractFuture).f59169d;
                if (kVar == kVar2) {
                    return kVar2;
                }
            } while (!c(abstractFuture, kVar2, kVar));
            return kVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        void f(k kVar, @CheckForNull k kVar2) {
            f59187a.putObject(kVar, f59192f, kVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        void g(k kVar, Thread thread) {
            f59187a.putObject(kVar, f59191e, thread);
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final k f59193c = new k(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @CheckForNull
        volatile Thread f59194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        volatile k f59195b;

        k() {
            AbstractFuture.f59165h.g(this, Thread.currentThread());
        }

        k(boolean z10) {
        }

        void a(@CheckForNull k kVar) {
            AbstractFuture.f59165h.f(this, kVar);
        }

        void b() {
            Thread thread = this.f59194a;
            if (thread != null) {
                this.f59194a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.common.util.concurrent.AbstractFuture$a] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    static {
        boolean z10;
        b gVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f59162e = z10;
        f59163f = Logger.getLogger(AbstractFuture.class.getName());
        ?? r10 = 0;
        r10 = 0;
        try {
            gVar = new j();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            try {
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, ak.av), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, k.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, d.class, ak.aF), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "b"));
            } catch (Throwable th3) {
                gVar = new g();
                r10 = th3;
            }
        }
        f59165h = gVar;
        if (r10 != 0) {
            ?? r11 = f59163f;
            Level level = Level.SEVERE;
            r11.log(level, "UnsafeAtomicHelper is broken!", th);
            r11.log(level, "SafeAtomicHelper is broken!", r10);
        }
        f59166i = new Object();
    }

    protected AbstractFuture() {
    }

    private void A(k kVar) {
        kVar.f59194a = null;
        while (true) {
            k kVar2 = this.f59169d;
            if (kVar2 == k.f59193c) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.f59195b;
                if (kVar2.f59194a != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.f59195b = kVar4;
                    if (kVar3.f59194a == null) {
                    }
                } else if (!f59165h.c(this, kVar2, kVar4)) {
                }
                kVar2 = kVar4;
            }
            return;
        }
    }

    private void k(StringBuilder sb2) {
        try {
            Object objV = v(this);
            sb2.append("SUCCESS, result=[");
            n(sb2, objV);
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

    private void l(StringBuilder sb2) {
        String string;
        int length = sb2.length();
        sb2.append(BBSLinkObj.REVIEW_STATE_PENDING);
        Object obj = this.f59167b;
        if (obj instanceof f) {
            sb2.append(", setFuture=[");
            o(sb2, ((f) obj).f59186c);
            sb2.append("]");
        } else {
            try {
                string = com.google.common.base.b0.c(y());
            } catch (RuntimeException | StackOverflowError e10) {
                String strValueOf = String.valueOf(e10.getClass());
                StringBuilder sb3 = new StringBuilder(strValueOf.length() + 38);
                sb3.append("Exception thrown from implementation: ");
                sb3.append(strValueOf);
                string = sb3.toString();
            }
            if (string != null) {
                sb2.append(", info=[");
                sb2.append(string);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            k(sb2);
        }
    }

    private void n(StringBuilder sb2, @CheckForNull Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void o(StringBuilder sb2, @CheckForNull Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e10) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e10.getClass());
        }
    }

    private static CancellationException p(String str, @CheckForNull Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @CheckForNull
    private d q(@CheckForNull d dVar) {
        d dVar2 = dVar;
        d dVarD = f59165h.d(this, d.f59176d);
        while (dVarD != null) {
            d dVar3 = dVarD.f59179c;
            dVarD.f59179c = dVar2;
            dVar2 = dVarD;
            dVarD = dVar3;
        }
        return dVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public static void r(AbstractFuture<?> abstractFuture) {
        d dVar = null;
        while (true) {
            abstractFuture.z();
            abstractFuture.m();
            d dVarQ = abstractFuture.q(dVar);
            while (dVarQ != null) {
                dVar = dVarQ.f59179c;
                Runnable runnable = dVarQ.f59177a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof f) {
                    f fVar = (f) runnable2;
                    abstractFuture = fVar.f59185b;
                    if (((AbstractFuture) abstractFuture).f59167b == fVar) {
                        if (f59165h.b(abstractFuture, fVar, u(fVar.f59186c))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dVarQ.f59178b;
                    Objects.requireNonNull(executor);
                    s(runnable2, executor);
                }
                dVarQ = dVar;
            }
            return;
        }
    }

    private static void s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f59163f;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(strValueOf);
            sb2.append(" with executor ");
            sb2.append(strValueOf2);
            logger.log(level, sb2.toString(), (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @b1
    private V t(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw p("Task was cancelled.", ((c) obj).f59175b);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f59171a);
        }
        return obj == f59166i ? (V) z0.b() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object u(p0<?> p0Var) {
        Throwable thA;
        if (p0Var instanceof h) {
            Object cVar = ((AbstractFuture) p0Var).f59167b;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f59174a) {
                    cVar = cVar2.f59175b != null ? new c(false, cVar2.f59175b) : c.f59173d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((p0Var instanceof com.google.common.util.concurrent.internal.a) && (thA = com.google.common.util.concurrent.internal.b.a((com.google.common.util.concurrent.internal.a) p0Var)) != null) {
            return new Failure(thA);
        }
        boolean zIsCancelled = p0Var.isCancelled();
        if ((!f59162e) && zIsCancelled) {
            c cVar3 = c.f59173d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object objV = v(p0Var);
            if (!zIsCancelled) {
                return objV == null ? f59166i : objV;
            }
            String strValueOf = String.valueOf(p0Var);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 84);
            sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb2.append(strValueOf);
            return new c(false, new IllegalArgumentException(sb2.toString()));
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            String strValueOf2 = String.valueOf(p0Var);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 77);
            sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb3.append(strValueOf2);
            return new Failure(new IllegalArgumentException(sb3.toString(), e10));
        } catch (ExecutionException e11) {
            if (!zIsCancelled) {
                return new Failure(e11.getCause());
            }
            String strValueOf3 = String.valueOf(p0Var);
            StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 84);
            sb4.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb4.append(strValueOf3);
            return new c(false, new IllegalArgumentException(sb4.toString(), e11));
        } catch (Throwable th2) {
            return new Failure(th2);
        }
    }

    @b1
    private static <V> V v(Future<V> future) throws ExecutionException {
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

    private void z() {
        for (k kVarE = f59165h.e(this, k.f59193c); kVarE != null; kVarE = kVarE.f59195b) {
            kVarE.b();
        }
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
    @s9.a
    protected boolean B(@b1 V v10) {
        if (v10 == null) {
            v10 = (V) f59166i;
        }
        if (!f59165h.b(this, null, v10)) {
            return false;
        }
        r(this);
        return true;
    }

    @s9.a
    protected boolean C(Throwable th2) {
        if (!f59165h.b(this, null, new Failure((Throwable) com.google.common.base.w.E(th2)))) {
            return false;
        }
        r(this);
        return true;
    }

    @s9.a
    protected boolean D(p0<? extends V> p0Var) {
        Failure failure;
        com.google.common.base.w.E(p0Var);
        Object obj = this.f59167b;
        if (obj == null) {
            if (p0Var.isDone()) {
                if (!f59165h.b(this, null, u(p0Var))) {
                    return false;
                }
                r(this);
                return true;
            }
            f fVar = new f(this, p0Var);
            if (f59165h.b(this, null, fVar)) {
                try {
                    p0Var.V(fVar, DirectExecutor.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        failure = new Failure(th2);
                    } catch (Throwable unused) {
                        failure = Failure.f59170b;
                    }
                    f59165h.b(this, fVar, failure);
                }
                return true;
            }
            obj = this.f59167b;
        }
        if (obj instanceof c) {
            p0Var.cancel(((c) obj).f59174a);
        }
        return false;
    }

    protected final boolean E() {
        Object obj = this.f59167b;
        return (obj instanceof c) && ((c) obj).f59174a;
    }

    @Override // com.google.common.util.concurrent.p0
    public void V(Runnable runnable, Executor executor) {
        d dVar;
        com.google.common.base.w.F(runnable, "Runnable was null.");
        com.google.common.base.w.F(executor, "Executor was null.");
        if (!isDone() && (dVar = this.f59168c) != d.f59176d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f59179c = dVar;
                if (f59165h.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.f59168c;
                }
            } while (dVar != d.f59176d);
        }
        s(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.internal.a
    @CheckForNull
    protected final Throwable a() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.f59167b;
        if (obj instanceof Failure) {
            return ((Failure) obj).f59171a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    @s9.a
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f59167b;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (f59162e) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f59172c : c.f59173d;
            Objects.requireNonNull(cVar);
        }
        AbstractFuture<V> abstractFuture = this;
        boolean z11 = false;
        while (true) {
            if (f59165h.b(abstractFuture, obj, cVar)) {
                if (z10) {
                    abstractFuture.w();
                }
                r(abstractFuture);
                if (!(obj instanceof f)) {
                    return true;
                }
                p0<? extends V> p0Var = ((f) obj).f59186c;
                if (!(p0Var instanceof h)) {
                    p0Var.cancel(z10);
                    return true;
                }
                abstractFuture = (AbstractFuture) p0Var;
                obj = abstractFuture.f59167b;
                if (!(obj == null) && !(obj instanceof f)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = abstractFuture.f59167b;
                if (!(obj instanceof f)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    @s9.a
    @b1
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f59167b;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return t(obj2);
        }
        k kVar = this.f59169d;
        if (kVar != k.f59193c) {
            k kVar2 = new k();
            do {
                kVar2.a(kVar);
                if (f59165h.c(this, kVar, kVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            A(kVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f59167b;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return t(obj);
                }
                kVar = this.f59169d;
            } while (kVar != k.f59193c);
        }
        Object obj3 = this.f59167b;
        Objects.requireNonNull(obj3);
        return t(obj3);
    }

    @Override // java.util.concurrent.Future
    @s9.a
    @b1
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f59167b;
        if ((obj != null) && (!(obj instanceof f))) {
            return t(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar = this.f59169d;
            if (kVar != k.f59193c) {
                k kVar2 = new k();
                while (true) {
                    kVar2.a(kVar);
                    if (f59165h.c(this, kVar, kVar2)) {
                        do {
                            a1.a(this, nanos);
                            if (Thread.interrupted()) {
                                A(kVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f59167b;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return t(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        A(kVar2);
                        break;
                    }
                    kVar = this.f59169d;
                    if (kVar == k.f59193c) {
                    }
                }
            }
            Object obj3 = this.f59167b;
            Objects.requireNonNull(obj3);
            return t(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f59167b;
            if ((obj4 != null) && (!(obj4 instanceof f))) {
                return t(obj4);
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
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb2.append("Waited ");
        sb2.append(j10);
        sb2.append(" ");
        sb2.append(lowerCase2);
        String string3 = sb2.toString();
        if (nanos + 1000 < 0) {
            String strConcat = String.valueOf(string3).concat(" (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strValueOf = String.valueOf(strConcat);
                StringBuilder sb3 = new StringBuilder(strValueOf.length() + 21 + String.valueOf(lowerCase).length());
                sb3.append(strValueOf);
                sb3.append(jConvert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String string4 = sb3.toString();
                if (z10) {
                    string4 = String.valueOf(string4).concat(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                strConcat = String.valueOf(string4).concat(" ");
            }
            if (z10) {
                String strValueOf2 = String.valueOf(strConcat);
                StringBuilder sb4 = new StringBuilder(strValueOf2.length() + 33);
                sb4.append(strValueOf2);
                sb4.append(nanos2);
                sb4.append(" nanoseconds ");
                strConcat = sb4.toString();
            }
            string3 = String.valueOf(strConcat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(string3).concat(" but future completed as timeout expired"));
        }
        StringBuilder sb5 = new StringBuilder(String.valueOf(string3).length() + 5 + String.valueOf(string).length());
        sb5.append(string3);
        sb5.append(" for ");
        sb5.append(string);
        throw new TimeoutException(sb5.toString());
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f59167b instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f59167b;
        return (!(obj instanceof f)) & (obj != null);
    }

    @o9.a
    @s9.g
    protected void m() {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            k(sb2);
        } else {
            l(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected void w() {
    }

    final void x(@CheckForNull Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(E());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    protected String y() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }
}
