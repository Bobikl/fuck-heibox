package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.x;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: LazyLayoutSemantics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a3\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/lazy/layout/i;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/q;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "userScrollEnabled", ak.av, "(Landroidx/compose/ui/n;Landroidx/compose/foundation/lazy/layout/i;Landroidx/compose/foundation/lazy/layout/q;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/runtime/p;I)Landroidx/compose/ui/n;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyLayoutSemanticsKt {
    @dl.d
    @androidx.compose.runtime.h
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final i itemProvider, @dl.d final q state, @dl.d Orientation orientation, boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        f0.p(nVar, "<this>");
        f0.p(itemProvider, "itemProvider");
        f0.p(state, "state");
        f0.p(orientation, "orientation");
        pVar.T(1548174271);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1548174271, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:39)");
        }
        pVar.T(773894976);
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            x xVar = new x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar));
            pVar.N(xVar);
            objU = xVar;
        }
        pVar.c0();
        final q0 coroutineScope = ((x) objU).getCoroutineScope();
        pVar.c0();
        Object[] objArr = {itemProvider, state, orientation, Boolean.valueOf(z10)};
        pVar.T(-568225417);
        boolean zS = false;
        for (int i11 = 0; i11 < 4; i11++) {
            zS |= pVar.s(objArr[i11]);
        }
        Object objU2 = pVar.U();
        if (zS || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
            final boolean z11 = orientation == Orientation.Vertical;
            final yh.l<Object, Integer> lVar = new yh.l<Object, Integer>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Integer invoke(@dl.d Object needle) {
                    f0.p(needle, "needle");
                    int iA = itemProvider.a();
                    int i12 = 0;
                    while (i12 < iA) {
                        if (f0.g(itemProvider.e(i12), needle)) {
                            return Integer.valueOf(i12);
                        }
                        i12++;
                    }
                    i12 = -1;
                    return Integer.valueOf(i12);
                }
            };
            final ScrollAxisRange scrollAxisRangeB = state.b();
            final yh.p<Float, Float, Boolean> pVar2 = z10 ? new yh.p<Float, Float, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1

                /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: LazyLayoutSemantics.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1", f = "LazyLayoutSemantics.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f7093b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ q f7094c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ float f7095d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(q qVar, float f10, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.f7094c = qVar;
                        this.f7095d = f10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                        return new AnonymousClass1(this.f7094c, this.f7095d, cVar);
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
                        int i10 = this.f7093b;
                        if (i10 == 0) {
                            t0.n(obj);
                            q qVar = this.f7094c;
                            float f10 = this.f7095d;
                            this.f7093b = 1;
                            if (qVar.c(f10, this) == objH) {
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
                {
                    super(2);
                }

                @dl.d
                public final Boolean a(float f10, float f11) {
                    if (z11) {
                        f10 = f11;
                    }
                    kotlinx.coroutines.k.f(coroutineScope, null, null, new AnonymousClass1(state, f10, null), 3, null);
                    return Boolean.TRUE;
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Boolean invoke(Float f10, Float f11) {
                    return a(f10.floatValue(), f11.floatValue());
                }
            } : null;
            final yh.l<Integer, Boolean> lVar2 = z10 ? new yh.l<Integer, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1

                /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: LazyLayoutSemantics.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2", f = "LazyLayoutSemantics.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f7099b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ q f7100c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ int f7101d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(q qVar, int i10, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                        super(2, cVar);
                        this.f7100c = qVar;
                        this.f7101d = i10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                        return new AnonymousClass2(this.f7100c, this.f7101d, cVar);
                    }

                    @Override // yh.p
                    @dl.e
                    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                        return ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                        Object objH = kotlin.coroutines.intrinsics.b.h();
                        int i10 = this.f7099b;
                        if (i10 == 0) {
                            t0.n(obj);
                            q qVar = this.f7100c;
                            int i11 = this.f7101d;
                            this.f7099b = 1;
                            if (qVar.a(i11, this) == objH) {
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
                {
                    super(1);
                }

                @dl.d
                public final Boolean a(int i12) {
                    boolean z12 = i12 >= 0 && i12 < itemProvider.a();
                    i iVar = itemProvider;
                    if (z12) {
                        kotlinx.coroutines.k.f(coroutineScope, null, null, new AnonymousClass2(state, i12, null), 3, null);
                        return Boolean.TRUE;
                    }
                    throw new IllegalArgumentException(("Can't scroll to index " + i12 + ", it is out of bounds [0, " + iVar.a() + ')').toString());
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                    return a(num.intValue());
                }
            } : null;
            final androidx.compose.ui.semantics.b bVarD = state.d();
            objU2 = SemanticsModifierKt.c(androidx.compose.ui.n.INSTANCE, false, new yh.l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                    f0.p(semantics, "$this$semantics");
                    SemanticsPropertiesKt.L(semantics, lVar);
                    if (z11) {
                        SemanticsPropertiesKt.A0(semantics, scrollAxisRangeB);
                    } else {
                        SemanticsPropertiesKt.i0(semantics, scrollAxisRangeB);
                    }
                    yh.p<Float, Float, Boolean> pVar3 = pVar2;
                    if (pVar3 != null) {
                        SemanticsPropertiesKt.Y(semantics, null, pVar3, 1, null);
                    }
                    yh.l<Integer, Boolean> lVar3 = lVar2;
                    if (lVar3 != null) {
                        SemanticsPropertiesKt.a0(semantics, null, lVar3, 1, null);
                    }
                    SemanticsPropertiesKt.c0(semantics, bVarD);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                    a(rVar);
                    return b2.f124493a;
                }
            }, 1, null);
            pVar.N(objU2);
        }
        pVar.c0();
        androidx.compose.ui.n nVarS0 = nVar.s0((androidx.compose.ui.n) objU2);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return nVarS0;
    }
}
