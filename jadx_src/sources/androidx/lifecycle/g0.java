package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: MediatorLiveData.java */
/* JADX INFO: loaded from: classes6.dex */
public class g0<T> extends i0<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.arch.core.internal.b<LiveData<?>, a<?>> f24200m;

    /* JADX INFO: compiled from: MediatorLiveData.java */
    public static class a<V> implements j0<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final LiveData<V> f24201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final j0<? super V> f24202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f24203c = -1;

        a(LiveData<V> liveData, j0<? super V> j0Var) {
            this.f24201a = liveData;
            this.f24202b = j0Var;
        }

        @Override // androidx.lifecycle.j0
        public void a(@androidx.annotation.p0 V v10) {
            if (this.f24203c != this.f24201a.g()) {
                this.f24203c = this.f24201a.g();
                this.f24202b.a(v10);
            }
        }

        void b() {
            this.f24201a.l(this);
        }

        void c() {
            this.f24201a.p(this);
        }
    }

    public g0() {
        this.f24200m = new androidx.arch.core.internal.b<>();
    }

    public g0(T t10) {
        super(t10);
        this.f24200m = new androidx.arch.core.internal.b<>();
    }

    @Override // androidx.lifecycle.LiveData
    @androidx.annotation.i
    protected void m() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f24200m.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    @Override // androidx.lifecycle.LiveData
    @androidx.annotation.i
    protected void n() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f24200m.iterator();
        while (it.hasNext()) {
            it.next().getValue().c();
        }
    }

    @androidx.annotation.k0
    public <S> void s(@androidx.annotation.n0 LiveData<S> liveData, @androidx.annotation.n0 j0<? super S> j0Var) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(liveData, j0Var);
        a<?> aVarI = this.f24200m.i(liveData, aVar);
        if (aVarI != null && aVarI.f24202b != j0Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarI == null && h()) {
            aVar.b();
        }
    }

    @androidx.annotation.k0
    public <S> void t(@androidx.annotation.n0 LiveData<S> liveData) {
        a<?> aVarJ = this.f24200m.j(liveData);
        if (aVarJ != null) {
            aVarJ.c();
        }
    }
}
