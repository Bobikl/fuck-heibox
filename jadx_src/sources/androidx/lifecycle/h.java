package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.k1;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: ComputableLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Executor f24204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final LiveData<T> f24205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final LiveData<T> f24206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final AtomicBoolean f24207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final AtomicBoolean f24208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    @xh.e
    public final Runnable f24209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    @xh.e
    public final Runnable f24210g;

    /* JADX INFO: compiled from: ComputableLiveData.kt */
    public static final class a extends LiveData<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ h<T> f24211m;

        a(h<T> hVar) {
            this.f24211m = hVar;
        }

        @Override // androidx.lifecycle.LiveData
        protected void m() {
            this.f24211m.e().execute(this.f24211m.f24209f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @xh.i
    public h() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @xh.i
    public h(@dl.d Executor executor) {
        kotlin.jvm.internal.f0.p(executor, "executor");
        this.f24204a = executor;
        a aVar = new a(this);
        this.f24205b = aVar;
        this.f24206c = aVar;
        this.f24207d = new AtomicBoolean(true);
        this.f24208e = new AtomicBoolean(false);
        this.f24209f = new Runnable() { // from class: androidx.lifecycle.f
            @Override // java.lang.Runnable
            public final void run() {
                h.l(this.f24198b);
            }
        };
        this.f24210g = new Runnable() { // from class: androidx.lifecycle.g
            @Override // java.lang.Runnable
            public final void run() {
                h.k(this.f24199b);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ h(Executor executor, int i10, kotlin.jvm.internal.u uVar) {
        if ((i10 & 1) != 0) {
            executor = androidx.arch.core.executor.c.g();
            kotlin.jvm.internal.f0.o(executor, "getIOThreadExecutor()");
        }
        this(executor);
    }

    @j1
    public static /* synthetic */ void g() {
    }

    @j1
    public static /* synthetic */ void i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(h this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        boolean zH = this$0.h().h();
        if (this$0.f24207d.compareAndSet(false, true) && zH) {
            this$0.f24204a.execute(this$0.f24209f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(h this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        do {
            boolean z10 = false;
            if (this$0.f24208e.compareAndSet(false, true)) {
                Object objC = null;
                boolean z11 = false;
                while (this$0.f24207d.compareAndSet(true, false)) {
                    try {
                        objC = this$0.c();
                        z11 = true;
                    } catch (Throwable th2) {
                        this$0.f24208e.set(false);
                        throw th2;
                    }
                }
                if (z11) {
                    this$0.h().o(objC);
                }
                this$0.f24208e.set(false);
                z10 = z11;
            }
            if (!z10) {
                return;
            }
        } while (this$0.f24207d.get());
    }

    @k1
    protected abstract T c();

    @dl.d
    public final AtomicBoolean d() {
        return this.f24208e;
    }

    @dl.d
    public final Executor e() {
        return this.f24204a;
    }

    @dl.d
    public final AtomicBoolean f() {
        return this.f24207d;
    }

    @dl.d
    public LiveData<T> h() {
        return this.f24206c;
    }

    public void j() {
        androidx.arch.core.executor.c.h().b(this.f24210g);
    }
}
