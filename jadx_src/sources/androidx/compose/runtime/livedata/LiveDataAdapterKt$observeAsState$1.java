package androidx.compose.runtime.livedata;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.f0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.y;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import yh.l;

/* JADX INFO: compiled from: LiveDataAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class LiveDataAdapterKt$observeAsState$1 extends Lambda implements l<f0, e0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ LiveData<T> f13029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ y f13030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ a1<R> f13031d;

    /* JADX INFO: compiled from: Effects.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LiveData f13032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f13033b;

        public a(LiveData liveData, j0 j0Var) {
            this.f13032a = liveData;
            this.f13033b = j0Var;
        }

        @Override // androidx.compose.runtime.e0
        public void dispose() {
            this.f13032a.p(this.f13033b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveDataAdapterKt$observeAsState$1(LiveData<T> liveData, y yVar, a1<R> a1Var) {
        super(1);
        this.f13029b = liveData;
        this.f13030c = yVar;
        this.f13031d = a1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a1 state, Object obj) {
        kotlin.jvm.internal.f0.p(state, "$state");
        state.setValue(obj);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // yh.l
    @d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final e0 invoke(@d f0 DisposableEffect) {
        kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
        final a1<R> a1Var = this.f13031d;
        j0 j0Var = new j0() { // from class: androidx.compose.runtime.livedata.a
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                LiveDataAdapterKt$observeAsState$1.c(a1Var, obj);
            }
        };
        this.f13029b.k(this.f13030c, (j0<? super T>) j0Var);
        return new a(this.f13029b, j0Var);
    }
}
