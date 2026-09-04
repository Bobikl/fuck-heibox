package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ModernAsyncTask<Params, Progress, Result> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f24323g = "AsyncTask";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f24324h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f24325i = 128;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f24326j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final ThreadFactory f24327k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f24328l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Executor f24329m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f24330n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f24331o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static f f24332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile Executor f24333q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g<Params, Result> f24334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FutureTask<Result> f24335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Status f24336d = Status.PENDING;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicBoolean f24337e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AtomicBoolean f24338f = new AtomicBoolean();

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f24339b = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f24339b.getAndIncrement());
        }
    }

    public class b extends g<Params, Result> {
        b() {
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
        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            ModernAsyncTask.this.f24338f.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) ModernAsyncTask.this.b(this.f24345b);
                Binder.flushPendingCommands();
                ModernAsyncTask.this.q(result);
                return result;
            } catch (Throwable th2) {
                try {
                    ModernAsyncTask.this.f24337e.set(true);
                    throw th2;
                } catch (Throwable th3) {
                    ModernAsyncTask.this.q(result);
                    throw th3;
                }
            }
        }
    }

    public class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                ModernAsyncTask.this.r(get());
            } catch (InterruptedException e10) {
                Log.w(ModernAsyncTask.f24323g, e10);
            } catch (CancellationException unused) {
                ModernAsyncTask.this.r(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24342a;

        static {
            int[] iArr = new int[Status.values().length];
            f24342a = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24342a[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class e<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ModernAsyncTask f24343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Data[] f24344b;

        e(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f24343a = modernAsyncTask;
            this.f24344b = dataArr;
        }
    }

    public static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i10 = message.what;
            if (i10 == 1) {
                eVar.f24343a.f(eVar.f24344b[0]);
            } else {
                if (i10 != 2) {
                    return;
                }
                eVar.f24343a.p(eVar.f24344b);
            }
        }
    }

    public static abstract class g<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Params[] f24345b;

        g() {
        }
    }

    static {
        a aVar = new a();
        f24327k = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f24328l = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f24329m = threadPoolExecutor;
        f24333q = threadPoolExecutor;
    }

    ModernAsyncTask() {
        b bVar = new b();
        this.f24334b = bVar;
        this.f24335c = new c(bVar);
    }

    public static void d(Runnable runnable) {
        f24333q.execute(runnable);
    }

    private static Handler i() {
        f fVar;
        synchronized (ModernAsyncTask.class) {
            if (f24332p == null) {
                f24332p = new f();
            }
            fVar = f24332p;
        }
        return fVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void t(Executor executor) {
        f24333q = executor;
    }

    public final boolean a(boolean z10) {
        this.f24337e.set(true);
        return this.f24335c.cancel(z10);
    }

    protected abstract Result b(Params... paramsArr);

    public final ModernAsyncTask<Params, Progress, Result> c(Params... paramsArr) {
        return e(f24333q, paramsArr);
    }

    public final ModernAsyncTask<Params, Progress, Result> e(Executor executor, Params... paramsArr) {
        if (this.f24336d == Status.PENDING) {
            this.f24336d = Status.RUNNING;
            o();
            this.f24334b.f24345b = paramsArr;
            executor.execute(this.f24335c);
            return this;
        }
        int i10 = d.f24342a[this.f24336d.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    void f(Result result) {
        if (k()) {
            m(result);
        } else {
            n(result);
        }
        this.f24336d = Status.FINISHED;
    }

    public final Result g() throws ExecutionException, InterruptedException {
        return this.f24335c.get();
    }

    public final Result h(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f24335c.get(j10, timeUnit);
    }

    public final Status j() {
        return this.f24336d;
    }

    public final boolean k() {
        return this.f24337e.get();
    }

    protected void l() {
    }

    protected void m(Result result) {
        l();
    }

    protected void n(Result result) {
    }

    protected void o() {
    }

    protected void p(Progress... progressArr) {
    }

    Result q(Result result) {
        i().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    void r(Result result) {
        if (this.f24338f.get()) {
            return;
        }
        q(result);
    }

    protected final void s(Progress... progressArr) {
        if (k()) {
            return;
        }
        i().obtainMessage(2, new e(this, progressArr)).sendToTarget();
    }
}
