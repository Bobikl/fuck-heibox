package androidx.compose.foundation.gestures;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.m2;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import s1.x;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollableKt$pointerScrollable$3$1 extends SuspendLambda implements yh.q<q0, x, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ long f5541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ a1<NestedScrollDispatcher> f5542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ m2<ScrollingLogic> f5543e;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Scrollable.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1", f = "Scrollable.kt", i = {}, l = {bb.c.b.f30876q2}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f5544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m2<ScrollingLogic> f5545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f5546d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(m2<ScrollingLogic> m2Var, long j10, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f5545c = m2Var;
            this.f5546d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f5545c, this.f5546d, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f5544b;
            if (i10 == 0) {
                t0.n(obj);
                ScrollingLogic value = this.f5545c.getValue();
                long j10 = this.f5546d;
                this.f5544b = 1;
                if (value.i(j10, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableKt$pointerScrollable$3$1(a1<NestedScrollDispatcher> a1Var, m2<ScrollingLogic> m2Var, kotlin.coroutines.c<? super ScrollableKt$pointerScrollable$3$1> cVar) {
        super(3, cVar);
        this.f5542d = a1Var;
        this.f5543e = m2Var;
    }

    @dl.e
    public final Object a(@dl.d q0 q0Var, long j10, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        ScrollableKt$pointerScrollable$3$1 scrollableKt$pointerScrollable$3$1 = new ScrollableKt$pointerScrollable$3$1(this.f5542d, this.f5543e, cVar);
        scrollableKt$pointerScrollable$3$1.f5541c = j10;
        return scrollableKt$pointerScrollable$3$1.invokeSuspend(b2.f124493a);
    }

    @Override // yh.q
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, x xVar, kotlin.coroutines.c<? super b2> cVar) {
        return a(q0Var, xVar.getF139264a(), cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f5540b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        kotlinx.coroutines.k.f(this.f5542d.getValue().f(), null, null, new AnonymousClass1(this.f5543e, this.f5541c, null), 3, null);
        return b2.f124493a;
    }
}
