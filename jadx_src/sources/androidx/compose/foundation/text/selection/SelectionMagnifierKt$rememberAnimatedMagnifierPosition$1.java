package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.m2;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: SelectionMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
public final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f8207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ m2<b1.f> f8208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Animatable<b1.f, androidx.compose.animation.core.m> f8209e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(m2<b1.f> m2Var, Animatable<b1.f, androidx.compose.animation.core.m> animatable, kotlin.coroutines.c<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1> cVar) {
        super(2, cVar);
        this.f8208d = m2Var;
        this.f8209e = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(this.f8208d, this.f8209e, cVar);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1.f8207c = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f8206b;
        if (i10 == 0) {
            t0.n(obj);
            final q0 q0Var = (q0) this.f8207c;
            final m2<b1.f> m2Var = this.f8208d;
            kotlinx.coroutines.flow.e eVarV = e2.v(new yh.a<b1.f>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public final long a() {
                    return SelectionMagnifierKt.i(m2Var);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b1.f invoke() {
                    return b1.f.d(a());
                }
            });
            final Animatable<b1.f, androidx.compose.animation.core.m> animatable = this.f8209e;
            kotlinx.coroutines.flow.f<b1.f> fVar = new kotlinx.coroutines.flow.f<b1.f>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1.2
                @dl.e
                public final Object a(long j10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                    if (b1.g.d(animatable.u().getF30368a()) && b1.g.d(j10)) {
                        if (!(b1.f.r(animatable.u().getF30368a()) == b1.f.r(j10))) {
                            kotlinx.coroutines.k.f(q0Var, null, null, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2(animatable, j10, null), 3, null);
                            return b2.f124493a;
                        }
                    }
                    Object objB = animatable.B(b1.f.d(j10), cVar);
                    return objB == kotlin.coroutines.intrinsics.b.h() ? objB : b2.f124493a;
                }

                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(b1.f fVar2, kotlin.coroutines.c cVar) {
                    return a(fVar2.getF30368a(), cVar);
                }
            };
            this.f8206b = 1;
            if (eVarV.a(fVar, this) == objH) {
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
