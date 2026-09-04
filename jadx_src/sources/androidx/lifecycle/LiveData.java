package androidx.lifecycle;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f24040k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Object f24041l = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f24042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.arch.core.internal.b<j0<? super T>, LiveData<T>.c> f24043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f24044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f24046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile Object f24047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f24048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f24051j;

    public class LifecycleBoundObserver extends LiveData<T>.c implements v {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.n0
        final y f24052f;

        LifecycleBoundObserver(y yVar, j0<? super T> j0Var) {
            super(j0Var);
            this.f24052f = yVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        void c() {
            this.f24052f.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.v
        public void d(@androidx.annotation.n0 y yVar, @androidx.annotation.n0 Lifecycle.Event event) {
            Lifecycle.State stateB = this.f24052f.getLifecycle().b();
            if (stateB == Lifecycle.State.DESTROYED) {
                LiveData.this.p(this.f24056b);
                return;
            }
            Lifecycle.State state = null;
            while (state != stateB) {
                b(f());
                state = stateB;
                stateB = this.f24052f.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean e(y yVar) {
            return this.f24052f == yVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean f() {
            return this.f24052f.getLifecycle().b().isAtLeast(Lifecycle.State.STARTED);
        }
    }

    public class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f24042a) {
                obj = LiveData.this.f24047f;
                LiveData.this.f24047f = LiveData.f24041l;
            }
            LiveData.this.r(obj);
        }
    }

    public class b extends LiveData<T>.c {
        b(j0<? super T> j0Var) {
            super(j0Var);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean f() {
            return true;
        }
    }

    public abstract class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final j0<? super T> f24056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f24057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f24058d = -1;

        c(j0<? super T> j0Var) {
            this.f24056b = j0Var;
        }

        void b(boolean z10) {
            if (z10 == this.f24057c) {
                return;
            }
            this.f24057c = z10;
            LiveData.this.c(z10 ? 1 : -1);
            if (this.f24057c) {
                LiveData.this.e(this);
            }
        }

        void c() {
        }

        boolean e(y yVar) {
            return false;
        }

        abstract boolean f();
    }

    public LiveData() {
        this.f24042a = new Object();
        this.f24043b = new androidx.arch.core.internal.b<>();
        this.f24044c = 0;
        Object obj = f24041l;
        this.f24047f = obj;
        this.f24051j = new a();
        this.f24046e = obj;
        this.f24048g = -1;
    }

    public LiveData(T t10) {
        this.f24042a = new Object();
        this.f24043b = new androidx.arch.core.internal.b<>();
        this.f24044c = 0;
        this.f24047f = f24041l;
        this.f24051j = new a();
        this.f24046e = t10;
        this.f24048g = 0;
    }

    static void b(String str) {
        if (androidx.arch.core.executor.c.h().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(LiveData<T>.c cVar) {
        if (cVar.f24057c) {
            if (!cVar.f()) {
                cVar.b(false);
                return;
            }
            int i10 = cVar.f24058d;
            int i11 = this.f24048g;
            if (i10 >= i11) {
                return;
            }
            cVar.f24058d = i11;
            cVar.f24056b.a((Object) this.f24046e);
        }
    }

    @androidx.annotation.k0
    void c(int i10) {
        int i11 = this.f24044c;
        this.f24044c = i10 + i11;
        if (this.f24045d) {
            return;
        }
        this.f24045d = true;
        while (true) {
            try {
                int i12 = this.f24044c;
                if (i11 == i12) {
                    this.f24045d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    m();
                } else if (z11) {
                    n();
                }
                i11 = i12;
            } catch (Throwable th2) {
                this.f24045d = false;
                throw th2;
            }
        }
    }

    void e(@androidx.annotation.p0 LiveData<T>.c cVar) {
        if (this.f24049h) {
            this.f24050i = true;
            return;
        }
        this.f24049h = true;
        do {
            this.f24050i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                androidx.arch.core.internal.b<j0<? super T>, LiveData<T>.c>.d dVarE = this.f24043b.e();
                while (dVarE.hasNext()) {
                    d((c) dVarE.next().getValue());
                    if (this.f24050i) {
                        break;
                    }
                }
            }
        } while (this.f24050i);
        this.f24049h = false;
    }

    @androidx.annotation.p0
    public T f() {
        T t10 = (T) this.f24046e;
        if (t10 != f24041l) {
            return t10;
        }
        return null;
    }

    int g() {
        return this.f24048g;
    }

    public boolean h() {
        return this.f24044c > 0;
    }

    public boolean i() {
        return this.f24043b.size() > 0;
    }

    public boolean j() {
        return this.f24046e != f24041l;
    }

    @androidx.annotation.k0
    public void k(@androidx.annotation.n0 y yVar, @androidx.annotation.n0 j0<? super T> j0Var) {
        b("observe");
        if (yVar.getLifecycle().b() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(yVar, j0Var);
        LiveData<T>.c cVarI = this.f24043b.i(j0Var, lifecycleBoundObserver);
        if (cVarI != null && !cVarI.e(yVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarI != null) {
            return;
        }
        yVar.getLifecycle().a(lifecycleBoundObserver);
    }

    @androidx.annotation.k0
    public void l(@androidx.annotation.n0 j0<? super T> j0Var) {
        b("observeForever");
        b bVar = new b(j0Var);
        LiveData<T>.c cVarI = this.f24043b.i(j0Var, bVar);
        if (cVarI instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarI != null) {
            return;
        }
        bVar.b(true);
    }

    protected void m() {
    }

    protected void n() {
    }

    protected void o(T t10) {
        boolean z10;
        synchronized (this.f24042a) {
            z10 = this.f24047f == f24041l;
            this.f24047f = t10;
        }
        if (z10) {
            androidx.arch.core.executor.c.h().d(this.f24051j);
        }
    }

    @androidx.annotation.k0
    public void p(@androidx.annotation.n0 j0<? super T> j0Var) {
        b("removeObserver");
        LiveData<T>.c cVarJ = this.f24043b.j(j0Var);
        if (cVarJ == null) {
            return;
        }
        cVarJ.c();
        cVarJ.b(false);
    }

    @androidx.annotation.k0
    public void q(@androidx.annotation.n0 y yVar) {
        b("removeObservers");
        for (Map.Entry<j0<? super T>, LiveData<T>.c> entry : this.f24043b) {
            if (entry.getValue().e(yVar)) {
                p(entry.getKey());
            }
        }
    }

    @androidx.annotation.k0
    protected void r(T t10) {
        b("setValue");
        this.f24048g++;
        this.f24046e = t10;
        e(null);
    }
}
