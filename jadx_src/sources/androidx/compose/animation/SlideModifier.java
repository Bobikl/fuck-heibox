package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.f0;
import androidx.compose.runtime.m2;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.k0;
import androidx.compose.ui.layout.l0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001BH\u0012\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0011R\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019\u0012\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019ø\u0001\u0001¢\u0006\u0004\b)\u0010*J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010R0\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0011R\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001f\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR7\u0010%\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060#0!¢\u0006\u0002\b$8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/compose/animation/SlideModifier;", "Landroidx/compose/animation/n;", "Landroidx/compose/animation/EnterExitState;", "targetState", "Ls1/r;", "fullSize", "Ls1/n;", "f", "(Landroidx/compose/animation/EnterExitState;J)J", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/animation/core/Transition$a;", "Landroidx/compose/animation/core/m;", "Landroidx/compose/animation/core/Transition;", "b", "Landroidx/compose/animation/core/Transition$a;", ak.av, "()Landroidx/compose/animation/core/Transition$a;", "lazyAnimation", "Landroidx/compose/runtime/m2;", "Landroidx/compose/animation/t;", ak.aF, "Landroidx/compose/runtime/m2;", "()Landroidx/compose/runtime/m2;", "slideIn", "d", "slideOut", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$b;", "Landroidx/compose/animation/core/f0;", "Lkotlin/t;", "transitionSpec", "Lyh/l;", "e", "()Lyh/l;", "<init>", "(Landroidx/compose/animation/core/Transition$a;Landroidx/compose/runtime/m2;Landroidx/compose/runtime/m2;)V", "animation_release"}, k = 1, mv = {1, 7, 1})
public final class SlideModifier extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Transition<EnterExitState>.a<s1.n, androidx.compose.animation.core.m> lazyAnimation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<Slide> slideIn;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<Slide> slideOut;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.l<Transition.b<EnterExitState>, f0<s1.n>> f4083e;

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4084a;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            f4084a = iArr;
        }
    }

    public SlideModifier(@dl.d Transition<EnterExitState>.a<s1.n, androidx.compose.animation.core.m> lazyAnimation, @dl.d m2<Slide> slideIn, @dl.d m2<Slide> slideOut) {
        kotlin.jvm.internal.f0.p(lazyAnimation, "lazyAnimation");
        kotlin.jvm.internal.f0.p(slideIn, "slideIn");
        kotlin.jvm.internal.f0.p(slideOut, "slideOut");
        this.lazyAnimation = lazyAnimation;
        this.slideIn = slideIn;
        this.slideOut = slideOut;
        this.f4083e = new yh.l<Transition.b<EnterExitState>, f0<s1.n>>() { // from class: androidx.compose.animation.SlideModifier$transitionSpec$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f0<s1.n> invoke(@dl.d Transition.b<EnterExitState> bVar) {
                f0<s1.n> f0VarE;
                f0<s1.n> f0VarE2;
                kotlin.jvm.internal.f0.p(bVar, "$this$null");
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (bVar.b(enterExitState, enterExitState2)) {
                    Slide value = this.f4090b.c().getValue();
                    return (value == null || (f0VarE2 = value.e()) == null) ? EnterExitTransitionKt.f4011d : f0VarE2;
                }
                if (!bVar.b(enterExitState2, EnterExitState.PostExit)) {
                    return EnterExitTransitionKt.f4011d;
                }
                Slide value2 = this.f4090b.d().getValue();
                return (value2 == null || (f0VarE = value2.e()) == null) ? EnterExitTransitionKt.f4011d : f0VarE;
            }
        };
    }

    @dl.d
    public final Transition<EnterExitState>.a<s1.n, androidx.compose.animation.core.m> a() {
        return this.lazyAnimation;
    }

    @dl.d
    public final m2<Slide> c() {
        return this.slideIn;
    }

    @dl.d
    public final m2<Slide> d() {
        return this.slideOut;
    }

    @dl.d
    public final yh.l<Transition.b<EnterExitState>, f0<s1.n>> e() {
        return this.f4083e;
    }

    public final long f(@dl.d EnterExitState targetState, long fullSize) {
        yh.l<s1.r, s1.n> lVarF;
        yh.l<s1.r, s1.n> lVarF2;
        kotlin.jvm.internal.f0.p(targetState, "targetState");
        Slide value = this.slideIn.getValue();
        long jA = (value == null || (lVarF2 = value.f()) == null) ? s1.n.f139237b.a() : lVarF2.invoke(s1.r.b(fullSize)).getF139239a();
        Slide value2 = this.slideOut.getValue();
        long jA2 = (value2 == null || (lVarF = value2.f()) == null) ? s1.n.f139237b.a() : lVarF.invoke(s1.r.b(fullSize)).getF139239a();
        int i10 = a.f4084a[targetState.ordinal()];
        if (i10 == 1) {
            return s1.n.f139237b.a();
        }
        if (i10 == 2) {
            return jA;
        }
        if (i10 == 3) {
            return jA2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.layout.w
    @dl.d
    public j0 k(@dl.d l0 measure, @dl.d g0 measurable, long j10) {
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        final e1 e1VarZ1 = measurable.z1(j10);
        final long jA = s1.s.a(e1VarZ1.getWidth(), e1VarZ1.getHeight());
        return k0.p(measure, e1VarZ1.getWidth(), e1VarZ1.getHeight(), null, new yh.l<e1.a, b2>() { // from class: androidx.compose.animation.SlideModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                Transition<EnterExitState>.a<s1.n, androidx.compose.animation.core.m> aVarA = this.f4085b.a();
                yh.l<Transition.b<EnterExitState>, f0<s1.n>> lVarE = this.f4085b.e();
                final SlideModifier slideModifier = this.f4085b;
                final long j11 = jA;
                e1.a.F(layout, e1VarZ1, aVarA.a(lVarE, new yh.l<EnterExitState, s1.n>() { // from class: androidx.compose.animation.SlideModifier$measure$1$slideOffset$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final long a(@dl.d EnterExitState it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        return slideModifier.f(it, j11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ s1.n invoke(EnterExitState enterExitState) {
                        return s1.n.b(a(enterExitState));
                    }
                }).getValue().getF139239a(), 0.0f, null, 6, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null);
    }
}
