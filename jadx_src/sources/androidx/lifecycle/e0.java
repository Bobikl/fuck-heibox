package androidx.lifecycle;

import kotlin.b2;

/* JADX INFO: compiled from: LiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e0 {

    /* JADX INFO: compiled from: LiveData.kt */
    @kotlin.jvm.internal.t0({"SMAP\nLiveData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveData.kt\nandroidx/lifecycle/LiveDataKt$observe$wrappedObserver$1\n*L\n1#1,55:1\n*E\n"})
    public static final class a<T> implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.l<T, b2> f24197a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(yh.l<? super T, b2> lVar) {
            this.f24197a = lVar;
        }

        @Override // androidx.lifecycle.j0
        public final void a(T t10) {
            this.f24197a.invoke(t10);
        }
    }

    @dl.d
    @kotlin.k(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    @androidx.annotation.k0
    public static final <T> j0<T> a(@dl.d LiveData<T> liveData, @dl.d y owner, @dl.d yh.l<? super T, b2> onChanged) {
        kotlin.jvm.internal.f0.p(liveData, "<this>");
        kotlin.jvm.internal.f0.p(owner, "owner");
        kotlin.jvm.internal.f0.p(onChanged, "onChanged");
        a aVar = new a(onChanged);
        liveData.k(owner, aVar);
        return aVar;
    }
}
