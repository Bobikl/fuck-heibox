package androidx.lifecycle;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FlowExtKt {
    @dl.d
    public static final <T> kotlinx.coroutines.flow.e<T> a(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, @dl.d Lifecycle lifecycle, @dl.d Lifecycle.State minActiveState) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        kotlin.jvm.internal.f0.p(lifecycle, "lifecycle");
        kotlin.jvm.internal.f0.p(minActiveState, "minActiveState");
        return kotlinx.coroutines.flow.g.s(new FlowExtKt$flowWithLifecycle$1(lifecycle, minActiveState, eVar, null));
    }

    public static /* synthetic */ kotlinx.coroutines.flow.e b(kotlinx.coroutines.flow.e eVar, Lifecycle lifecycle, Lifecycle.State state, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return a(eVar, lifecycle, state);
    }
}
