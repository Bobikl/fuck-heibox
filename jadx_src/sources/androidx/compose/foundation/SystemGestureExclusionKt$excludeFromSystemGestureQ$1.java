package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SystemGestureExclusion.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class SystemGestureExclusionKt$excludeFromSystemGestureQ$1 extends Lambda implements yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f5079b;

    /* JADX INFO: compiled from: Effects.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements androidx.compose.runtime.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f5080a;

        public a(r rVar) {
            this.f5080a = rVar;
        }

        @Override // androidx.compose.runtime.e0
        public void dispose() {
            this.f5080a.g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemGestureExclusionKt$excludeFromSystemGestureQ$1(r rVar) {
        super(1);
        this.f5079b = rVar;
    }

    @Override // yh.l
    @dl.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
        kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
        return new a(this.f5079b);
    }
}
