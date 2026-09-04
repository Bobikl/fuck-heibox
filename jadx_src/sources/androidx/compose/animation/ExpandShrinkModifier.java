package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.f0;
import androidx.compose.runtime.m2;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.k0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001Bv\u0012\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u0012R\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u0012R\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d\u0012\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d\u0012\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u001dø\u0001\u0001¢\u0006\u0004\b5\u00106J#\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0007J)\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R0\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u0012R\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R0\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u0012R\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001f\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b#\u0010!R\u001f\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u001d8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b&\u0010!R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010(\u001a\u0004\b\u001a\u0010)\"\u0004\b*\u0010+R7\u00101\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040/0-¢\u0006\u0002\b08\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, d2 = {"Landroidx/compose/animation/ExpandShrinkModifier;", "Landroidx/compose/animation/n;", "Landroidx/compose/animation/EnterExitState;", "targetState", "Ls1/r;", "fullSize", "o", "(Landroidx/compose/animation/EnterExitState;J)J", "Ls1/n;", "q", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/animation/core/Transition$a;", "Landroidx/compose/animation/core/m;", "Landroidx/compose/animation/core/Transition;", "b", "Landroidx/compose/animation/core/Transition$a;", "g", "()Landroidx/compose/animation/core/Transition$a;", "sizeAnimation", ak.aF, "e", "offsetAnimation", "Landroidx/compose/runtime/m2;", "Landroidx/compose/animation/ChangeSize;", "d", "Landroidx/compose/runtime/m2;", "()Landroidx/compose/runtime/m2;", "expand", "f", "shrink", "Landroidx/compose/ui/c;", ak.av, "alignment", "Landroidx/compose/ui/c;", "()Landroidx/compose/ui/c;", "n", "(Landroidx/compose/ui/c;)V", "currentAlignment", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$b;", "Landroidx/compose/animation/core/f0;", "Lkotlin/t;", "sizeTransitionSpec", "Lyh/l;", "m", "()Lyh/l;", "<init>", "(Landroidx/compose/animation/core/Transition$a;Landroidx/compose/animation/core/Transition$a;Landroidx/compose/runtime/m2;Landroidx/compose/runtime/m2;Landroidx/compose/runtime/m2;)V", "animation_release"}, k = 1, mv = {1, 7, 1})
public final class ExpandShrinkModifier extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Transition<EnterExitState>.a<s1.r, androidx.compose.animation.core.m> sizeAnimation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Transition<EnterExitState>.a<s1.n, androidx.compose.animation.core.m> offsetAnimation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<ChangeSize> expand;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<ChangeSize> shrink;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<androidx.compose.ui.c> alignment;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.c currentAlignment;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final yh.l<Transition.b<EnterExitState>, f0<s1.r>> f4057h;

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4058a;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            f4058a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandShrinkModifier(@dl.d Transition<EnterExitState>.a<s1.r, androidx.compose.animation.core.m> sizeAnimation, @dl.d Transition<EnterExitState>.a<s1.n, androidx.compose.animation.core.m> offsetAnimation, @dl.d m2<ChangeSize> expand, @dl.d m2<ChangeSize> shrink, @dl.d m2<? extends androidx.compose.ui.c> alignment) {
        kotlin.jvm.internal.f0.p(sizeAnimation, "sizeAnimation");
        kotlin.jvm.internal.f0.p(offsetAnimation, "offsetAnimation");
        kotlin.jvm.internal.f0.p(expand, "expand");
        kotlin.jvm.internal.f0.p(shrink, "shrink");
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        this.sizeAnimation = sizeAnimation;
        this.offsetAnimation = offsetAnimation;
        this.expand = expand;
        this.shrink = shrink;
        this.alignment = alignment;
        this.f4057h = new yh.l<Transition.b<EnterExitState>, f0<s1.r>>() { // from class: androidx.compose.animation.ExpandShrinkModifier$sizeTransitionSpec$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f0<s1.r> invoke(@dl.d Transition.b<EnterExitState> bVar) {
                kotlin.jvm.internal.f0.p(bVar, "$this$null");
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                f0<s1.r> f0VarH = null;
                if (bVar.b(enterExitState, enterExitState2)) {
                    ChangeSize value = this.f4067b.d().getValue();
                    if (value != null) {
                        f0VarH = value.h();
                    }
                } else if (bVar.b(enterExitState2, EnterExitState.PostExit)) {
                    ChangeSize value2 = this.f4067b.f().getValue();
                    if (value2 != null) {
                        f0VarH = value2.h();
                    }
                } else {
                    f0VarH = EnterExitTransitionKt.f4012e;
                }
                return f0VarH == null ? EnterExitTransitionKt.f4012e : f0VarH;
            }
        };
    }

    @dl.d
    public final m2<androidx.compose.ui.c> a() {
        return this.alignment;
    }

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final androidx.compose.ui.c getCurrentAlignment() {
        return this.currentAlignment;
    }

    @dl.d
    public final m2<ChangeSize> d() {
        return this.expand;
    }

    @dl.d
    public final Transition<EnterExitState>.a<s1.n, androidx.compose.animation.core.m> e() {
        return this.offsetAnimation;
    }

    @dl.d
    public final m2<ChangeSize> f() {
        return this.shrink;
    }

    @dl.d
    public final Transition<EnterExitState>.a<s1.r, androidx.compose.animation.core.m> g() {
        return this.sizeAnimation;
    }

    @Override // androidx.compose.ui.layout.w
    @dl.d
    public j0 k(@dl.d l0 measure, @dl.d g0 measurable, long j10) {
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        final e1 e1VarZ1 = measurable.z1(j10);
        final long jA = s1.s.a(e1VarZ1.getWidth(), e1VarZ1.getHeight());
        long f139248a = this.sizeAnimation.a(this.f4057h, new yh.l<EnterExitState, s1.r>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$currentSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final long a(@dl.d EnterExitState it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return this.f4062b.o(it, jA);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ s1.r invoke(EnterExitState enterExitState) {
                return s1.r.b(a(enterExitState));
            }
        }).getValue().getF139248a();
        final long f139239a = this.offsetAnimation.a(new yh.l<Transition.b<EnterExitState>, f0<s1.n>>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$offsetDelta$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f0<s1.n> invoke(@dl.d Transition.b<EnterExitState> animate) {
                kotlin.jvm.internal.f0.p(animate, "$this$animate");
                return EnterExitTransitionKt.f4011d;
            }
        }, new yh.l<EnterExitState, s1.n>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final long a(@dl.d EnterExitState it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return this.f4065b.q(it, jA);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ s1.n invoke(EnterExitState enterExitState) {
                return s1.n.b(a(enterExitState));
            }
        }).getValue().getF139239a();
        androidx.compose.ui.c cVar = this.currentAlignment;
        final long jA2 = cVar != null ? cVar.a(jA, f139248a, LayoutDirection.Ltr) : s1.n.f139237b.a();
        return k0.p(measure, s1.r.m(f139248a), s1.r.j(f139248a), null, new yh.l<e1.a, b2>() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                e1.a.p(layout, e1VarZ1, s1.n.m(jA2) + s1.n.m(f139239a), s1.n.o(jA2) + s1.n.o(f139239a), 0.0f, 4, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null);
    }

    @dl.d
    public final yh.l<Transition.b<EnterExitState>, f0<s1.r>> m() {
        return this.f4057h;
    }

    public final void n(@dl.e androidx.compose.ui.c cVar) {
        this.currentAlignment = cVar;
    }

    public final long o(@dl.d EnterExitState targetState, long fullSize) {
        kotlin.jvm.internal.f0.p(targetState, "targetState");
        ChangeSize value = this.expand.getValue();
        long f139248a = value != null ? value.j().invoke(s1.r.b(fullSize)).getF139248a() : fullSize;
        ChangeSize value2 = this.shrink.getValue();
        long f139248a2 = value2 != null ? value2.j().invoke(s1.r.b(fullSize)).getF139248a() : fullSize;
        int i10 = a.f4058a[targetState.ordinal()];
        if (i10 == 1) {
            return fullSize;
        }
        if (i10 == 2) {
            return f139248a;
        }
        if (i10 == 3) {
            return f139248a2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long q(@dl.d EnterExitState targetState, long fullSize) {
        int i10;
        kotlin.jvm.internal.f0.p(targetState, "targetState");
        if (this.currentAlignment != null && this.alignment.getValue() != null && !kotlin.jvm.internal.f0.g(this.currentAlignment, this.alignment.getValue()) && (i10 = a.f4058a[targetState.ordinal()]) != 1 && i10 != 2) {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ChangeSize value = this.shrink.getValue();
            if (value == null) {
                return s1.n.f139237b.a();
            }
            long f139248a = value.j().invoke(s1.r.b(fullSize)).getF139248a();
            androidx.compose.ui.c value2 = this.alignment.getValue();
            kotlin.jvm.internal.f0.m(value2);
            androidx.compose.ui.c cVar = value2;
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            long jA = cVar.a(fullSize, f139248a, layoutDirection);
            androidx.compose.ui.c cVar2 = this.currentAlignment;
            kotlin.jvm.internal.f0.m(cVar2);
            long jA2 = cVar2.a(fullSize, f139248a, layoutDirection);
            return s1.o.a(s1.n.m(jA) - s1.n.m(jA2), s1.n.o(jA) - s1.n.o(jA2));
        }
        return s1.n.f139237b.a();
    }
}
