package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.x1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.m2;
import androidx.compose.ui.layout.d1;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.k0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.unit.LayoutDirection;
import com.lzy.okgo.model.Progress;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003#Y)B'\b\u0000\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\"\u0012\u0006\u0010/\u001a\u00020(\u0012\u0006\u00107\u001a\u000200¢\u0006\u0004\bW\u0010XJ%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\t*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0087\u0004JP\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2#\b\u0002\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00120\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019JP\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2#\b\u0002\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00120\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\tH\u0001¢\u0006\u0004\b \u0010!R \u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R4\u0010?\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00038@@@X\u0080\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R/\u0010F\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030A0@8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER-\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010A8\u0000@\u0000X\u0080\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0007\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001b\u0010P\u001a\u00020M*\u00020\r8BX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001b\u0010R\u001a\u00020M*\u00020\r8BX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u001d\u0010\u0005\u001a\u00020\u00038BX\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bS\u0010<R\u0014\u0010U\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010TR\u0014\u0010V\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010T\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope;", androidx.exifinterface.media.a.R4, "Landroidx/compose/animation/core/Transition$b;", "Ls1/r;", "fullSize", Progress.I, "Ls1/n;", "f", "(JJ)J", "Landroidx/compose/animation/e;", "Landroidx/compose/animation/r;", "sizeTransform", androidx.exifinterface.media.a.W4, "Landroidx/compose/animation/AnimatedContentScope$b;", "towards", "Landroidx/compose/animation/core/f0;", "animationSpec", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "offsetForFullSlide", "initialOffset", "Landroidx/compose/animation/f;", RXScreenCaptureService.KEY_WIDTH, "(ILandroidx/compose/animation/core/f0;Lyh/l;)Landroidx/compose/animation/f;", "targetOffset", "Landroidx/compose/animation/h;", "y", "(ILandroidx/compose/animation/core/f0;Lyh/l;)Landroidx/compose/animation/h;", "contentTransform", "Landroidx/compose/ui/n;", "g", "(Landroidx/compose/animation/e;Landroidx/compose/runtime/p;I)Landroidx/compose/ui/n;", "Landroidx/compose/animation/core/Transition;", ak.av, "Landroidx/compose/animation/core/Transition;", "p", "()Landroidx/compose/animation/core/Transition;", "transition", "Landroidx/compose/ui/c;", "b", "Landroidx/compose/ui/c;", "k", "()Landroidx/compose/ui/c;", "t", "(Landroidx/compose/ui/c;)V", "contentAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", ak.aF, "Landroidx/compose/ui/unit/LayoutDirection;", "m", "()Landroidx/compose/ui/unit/LayoutDirection;", ak.aG, "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "<set-?>", "d", "Landroidx/compose/runtime/a1;", "n", "()J", "v", "(J)V", "measuredSize", "", "Landroidx/compose/runtime/m2;", "e", "Ljava/util/Map;", "o", "()Ljava/util/Map;", "targetSizeMap", "Landroidx/compose/runtime/m2;", "j", "()Landroidx/compose/runtime/m2;", ak.aB, "(Landroidx/compose/runtime/m2;)V", "animatedSize", "", "q", "(I)Z", "isLeft", "r", "isRight", "l", "()Ljava/lang/Object;", "initialState", "targetState", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/c;Landroidx/compose/ui/unit/LayoutDirection;)V", "SizeModifier", "animation_release"}, k = 1, mv = {1, 7, 1})
@j
@androidx.compose.runtime.internal.o(parameters = 0)
public final class AnimatedContentScope<S> implements Transition.b<S> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f3821g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Transition<S> transition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.compose.ui.c contentAlignment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 measuredSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<S, m2<s1.r>> targetSizeMap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private m2<s1.r> animatedSize;

    /* JADX INFO: compiled from: AnimatedContent.kt */
    @j
    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0083\u0004\u0018\u00002\u00020\u0001B8\u0012\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nR\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tR0\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nR\b\u0012\u0004\u0012\u00028\u00000\r8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$SizeModifier;", "Landroidx/compose/animation/n;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/animation/core/Transition$a;", "Ls1/r;", "Landroidx/compose/animation/core/m;", "Landroidx/compose/animation/core/Transition;", "b", "Landroidx/compose/animation/core/Transition$a;", ak.av, "()Landroidx/compose/animation/core/Transition$a;", "sizeAnimation", "Landroidx/compose/runtime/m2;", "Landroidx/compose/animation/r;", ak.aF, "Landroidx/compose/runtime/m2;", "()Landroidx/compose/runtime/m2;", "sizeTransform", "<init>", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/compose/animation/core/Transition$a;Landroidx/compose/runtime/m2;)V", "animation_release"}, k = 1, mv = {1, 7, 1})
    public final class SizeModifier extends n {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Transition<S>.a<s1.r, androidx.compose.animation.core.m> sizeAnimation;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final m2<r> sizeTransform;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AnimatedContentScope<S> f3830d;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifier(@dl.d AnimatedContentScope animatedContentScope, @dl.d Transition<S>.a<s1.r, androidx.compose.animation.core.m> sizeAnimation, m2<? extends r> sizeTransform) {
            f0.p(sizeAnimation, "sizeAnimation");
            f0.p(sizeTransform, "sizeTransform");
            this.f3830d = animatedContentScope;
            this.sizeAnimation = sizeAnimation;
            this.sizeTransform = sizeTransform;
        }

        @dl.d
        public final Transition<S>.a<s1.r, androidx.compose.animation.core.m> a() {
            return this.sizeAnimation;
        }

        @dl.d
        public final m2<r> c() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.layout.w
        @dl.d
        public j0 k(@dl.d l0 measure, @dl.d g0 measurable, long j10) {
            f0.p(measure, "$this$measure");
            f0.p(measurable, "measurable");
            final e1 e1VarZ1 = measurable.z1(j10);
            Transition<S>.a<s1.r, androidx.compose.animation.core.m> aVar = this.sizeAnimation;
            final AnimatedContentScope<S> animatedContentScope = this.f3830d;
            yh.l<Transition.b<S>, androidx.compose.animation.core.f0<s1.r>> lVar = new yh.l<Transition.b<S>, androidx.compose.animation.core.f0<s1.r>>() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$size$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.animation.core.f0<s1.r> invoke(@dl.d Transition.b<S> animate) {
                    androidx.compose.animation.core.f0<s1.r> f0VarF;
                    f0.p(animate, "$this$animate");
                    m2<s1.r> m2Var = animatedContentScope.o().get(animate.c());
                    long f139248a = m2Var != null ? m2Var.getValue().getF139248a() : s1.r.f139246b.a();
                    m2<s1.r> m2Var2 = animatedContentScope.o().get(animate.a());
                    long f139248a2 = m2Var2 != null ? m2Var2.getValue().getF139248a() : s1.r.f139246b.a();
                    r value = this.c().getValue();
                    return (value == null || (f0VarF = value.f(f139248a, f139248a2)) == null) ? androidx.compose.animation.core.i.o(0.0f, 0.0f, null, 7, null) : f0VarF;
                }
            };
            final AnimatedContentScope<S> animatedContentScope2 = this.f3830d;
            m2<s1.r> m2VarA = aVar.a(lVar, (yh.l<? super S, ? extends s1.r>) new yh.l<S, s1.r>() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$size$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final long a(S s10) {
                    m2<s1.r> m2Var = animatedContentScope2.o().get(s10);
                    return m2Var != null ? m2Var.getValue().getF139248a() : s1.r.f139246b.a();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // yh.l
                public /* bridge */ /* synthetic */ s1.r invoke(Object obj) {
                    return s1.r.b(a(obj));
                }
            });
            this.f3830d.s(m2VarA);
            final long jA = this.f3830d.getContentAlignment().a(s1.s.a(e1VarZ1.getWidth(), e1VarZ1.getHeight()), m2VarA.getValue().getF139248a(), LayoutDirection.Ltr);
            return k0.p(measure, s1.r.m(m2VarA.getValue().getF139248a()), s1.r.j(m2VarA.getValue().getF139248a()), null, new yh.l<e1.a, b2>() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d e1.a layout) {
                    f0.p(layout, "$this$layout");
                    e1.a.r(layout, e1VarZ1, jA, 0.0f, 2, null);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar2) {
                    a(aVar2);
                    return b2.f124493a;
                }
            }, 4, null);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.AnimatedContentScope$a, reason: from toString */
    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0015J\u0016\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$a;", "Landroidx/compose/ui/layout/d1;", "Ls1/e;", "", "parentData", androidx.exifinterface.media.a.X4, "", ak.av, "isTarget", ak.aF, "", "toString", "", "hashCode", "other", "equals", "b", "Z", "e", "()Z", "f", "(Z)V", "<init>", "animation_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class ChildData implements d1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean isTarget;

        public ChildData(boolean z10) {
            this.isTarget = z10;
        }

        public static /* synthetic */ ChildData d(ChildData childData, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = childData.isTarget;
            }
            return childData.c(z10);
        }

        @Override // androidx.compose.ui.layout.d1
        @dl.d
        public Object V(@dl.d s1.e eVar, @dl.e Object obj) {
            f0.p(eVar, "<this>");
            return this;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsTarget() {
            return this.isTarget;
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ boolean a0(yh.l lVar) {
            return androidx.compose.ui.o.a(this, lVar);
        }

        @dl.d
        public final ChildData c(boolean isTarget) {
            return new ChildData(isTarget);
        }

        public final boolean e() {
            return this.isTarget;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChildData) && this.isTarget == ((ChildData) other).isTarget;
        }

        public final void f(boolean z10) {
            this.isTarget = z10;
        }

        public int hashCode() {
            boolean z10 = this.isTarget;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        @Override // androidx.compose.ui.n
        public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
            return androidx.compose.ui.m.a(this, nVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ boolean t(yh.l lVar) {
            return androidx.compose.ui.o.b(this, lVar);
        }

        @dl.d
        public String toString() {
            return "ChildData(isTarget=" + this.isTarget + ')';
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ Object v(Object obj, yh.p pVar) {
            return androidx.compose.ui.o.d(this, obj, pVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ Object x(Object obj, yh.p pVar) {
            return androidx.compose.ui.o.c(this, obj, pVar);
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$b;", "", "", "l", "(I)Ljava/lang/String;", "", "k", "(I)I", "other", "", "i", "(ILjava/lang/Object;)Z", ak.av, "I", "value", RXScreenCaptureService.KEY_HEIGHT, "b", "animation_release"}, k = 1, mv = {1, 7, 1})
    @xh.f
    @m0
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f3838c = h(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f3839d = h(1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f3840e = h(2);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f3841f = h(3);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f3842g = h(4);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f3843h = h(5);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: androidx.compose.animation.AnimatedContentScope$b$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: AnimatedContent.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$b$a;", "", "Landroidx/compose/animation/AnimatedContentScope$b;", "Left", "I", ak.aF, "()I", "Right", "d", "Up", "f", "Down", ak.av, "Start", "e", "End", "b", "<init>", "()V", "animation_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final int a() {
                return b.f3841f;
            }

            public final int b() {
                return b.f3843h;
            }

            public final int c() {
                return b.f3838c;
            }

            public final int d() {
                return b.f3839d;
            }

            public final int e() {
                return b.f3842g;
            }

            public final int f() {
                return b.f3840e;
            }
        }

        private /* synthetic */ b(int i10) {
            this.value = i10;
        }

        public static final /* synthetic */ b g(int i10) {
            return new b(i10);
        }

        public static int h(int i10) {
            return i10;
        }

        public static boolean i(int i10, Object obj) {
            return (obj instanceof b) && i10 == ((b) obj).getValue();
        }

        public static final boolean j(int i10, int i11) {
            return i10 == i11;
        }

        public static int k(int i10) {
            return i10;
        }

        @dl.d
        public static String l(int i10) {
            if (j(i10, f3838c)) {
                return "Left";
            }
            if (j(i10, f3839d)) {
                return "Right";
            }
            if (j(i10, f3840e)) {
                return "Up";
            }
            if (j(i10, f3841f)) {
                return "Down";
            }
            if (j(i10, f3842g)) {
                return "Start";
            }
            return j(i10, f3843h) ? "End" : "Invalid";
        }

        public boolean equals(Object obj) {
            return i(this.value, obj);
        }

        public int hashCode() {
            return k(this.value);
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        @dl.d
        public String toString() {
            return l(this.value);
        }
    }

    public AnimatedContentScope(@dl.d Transition<S> transition, @dl.d androidx.compose.ui.c contentAlignment, @dl.d LayoutDirection layoutDirection) {
        f0.p(transition, "transition");
        f0.p(contentAlignment, "contentAlignment");
        f0.p(layoutDirection, "layoutDirection");
        this.transition = transition;
        this.contentAlignment = contentAlignment;
        this.layoutDirection = layoutDirection;
        this.measuredSize = h2.g(s1.r.b(s1.r.f139246b.a()), null, 2, null);
        this.targetSizeMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long f(long fullSize, long currentSize) {
        return this.contentAlignment.a(fullSize, currentSize, LayoutDirection.Ltr);
    }

    private static final boolean h(a1<Boolean> a1Var) {
        return a1Var.getValue().booleanValue();
    }

    private static final void i(a1<Boolean> a1Var, boolean z10) {
        a1Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long l() {
        m2<s1.r> m2Var = this.animatedSize;
        return m2Var != null ? m2Var.getValue().getF139248a() : n();
    }

    private final boolean q(int i10) {
        b.Companion companion = b.INSTANCE;
        return b.j(i10, companion.c()) || (b.j(i10, companion.e()) && this.layoutDirection == LayoutDirection.Ltr) || (b.j(i10, companion.b()) && this.layoutDirection == LayoutDirection.Rtl);
    }

    private final boolean r(int i10) {
        b.Companion companion = b.INSTANCE;
        return b.j(i10, companion.d()) || (b.j(i10, companion.e()) && this.layoutDirection == LayoutDirection.Rtl) || (b.j(i10, companion.b()) && this.layoutDirection == LayoutDirection.Ltr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f x(AnimatedContentScope animatedContentScope, int i10, androidx.compose.animation.core.f0 f0Var, yh.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 0.0f, s1.n.b(x1.f(s1.n.f139237b)), 3, null);
        }
        if ((i11 & 4) != 0) {
            lVar = new yh.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$1
                @dl.d
                public final Integer a(int i12) {
                    return Integer.valueOf(i12);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return a(num.intValue());
                }
            };
        }
        return animatedContentScope.w(i10, f0Var, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h z(AnimatedContentScope animatedContentScope, int i10, androidx.compose.animation.core.f0 f0Var, yh.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 0.0f, s1.n.b(x1.f(s1.n.f139237b)), 3, null);
        }
        if ((i11 & 4) != 0) {
            lVar = new yh.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$1
                @dl.d
                public final Integer a(int i12) {
                    return Integer.valueOf(i12);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return a(num.intValue());
                }
            };
        }
        return animatedContentScope.y(i10, f0Var, lVar);
    }

    @j
    @dl.d
    public final e A(@dl.d e eVar, @dl.e r rVar) {
        f0.p(eVar, "<this>");
        eVar.e(rVar);
        return eVar;
    }

    @Override // androidx.compose.animation.core.Transition.b
    public S a() {
        return this.transition.m().a();
    }

    @Override // androidx.compose.animation.core.Transition.b
    public /* synthetic */ boolean b(Object obj, Object obj2) {
        return androidx.compose.animation.core.d1.a(this, obj, obj2);
    }

    @Override // androidx.compose.animation.core.Transition.b
    public S c() {
        return this.transition.m().c();
    }

    @dl.d
    @androidx.compose.runtime.h
    public final androidx.compose.ui.n g(@dl.d e contentTransform, @dl.e androidx.compose.runtime.p pVar, int i10) {
        androidx.compose.ui.n nVar;
        f0.p(contentTransform, "contentTransform");
        pVar.T(-1349251863);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1349251863, i10, -1, "androidx.compose.animation.AnimatedContentScope.createSizeAnimationModifier (AnimatedContent.kt:458)");
        }
        pVar.T(1157296644);
        boolean zS = pVar.s(this);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = h2.g(Boolean.FALSE, null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        a1 a1Var = (a1) objU;
        boolean z10 = false;
        m2 m2VarT = e2.t(contentTransform.getSizeTransform(), pVar, 0);
        if (f0.g(this.transition.h(), this.transition.o())) {
            i(a1Var, false);
        } else if (m2VarT.getValue() != null) {
            i(a1Var, true);
        }
        if (h(a1Var)) {
            Transition.a aVarL = androidx.compose.animation.core.TransitionKt.l(this.transition, VectorConvertersKt.j(s1.r.f139246b), null, pVar, 64, 2);
            pVar.T(1157296644);
            boolean zS2 = pVar.s(aVarL);
            Object objU2 = pVar.U();
            if (zS2 || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                r rVar = (r) m2VarT.getValue();
                if (rVar != null && !rVar.getClip()) {
                    z10 = true;
                }
                androidx.compose.ui.n nVarB = androidx.compose.ui.n.INSTANCE;
                if (!z10) {
                    nVarB = androidx.compose.ui.draw.d.b(nVarB);
                }
                objU2 = nVarB.s0(new SizeModifier(this, aVarL, m2VarT));
                pVar.N(objU2);
            }
            pVar.c0();
            nVar = (androidx.compose.ui.n) objU2;
        } else {
            this.animatedSize = null;
            nVar = androidx.compose.ui.n.INSTANCE;
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return nVar;
    }

    @dl.e
    public final m2<s1.r> j() {
        return this.animatedSize;
    }

    @dl.d
    /* JADX INFO: renamed from: k, reason: from getter */
    public final androidx.compose.ui.c getContentAlignment() {
        return this.contentAlignment;
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long n() {
        return ((s1.r) this.measuredSize.getValue()).getF139248a();
    }

    @dl.d
    public final Map<S, m2<s1.r>> o() {
        return this.targetSizeMap;
    }

    @dl.d
    public final Transition<S> p() {
        return this.transition;
    }

    public final void s(@dl.e m2<s1.r> m2Var) {
        this.animatedSize = m2Var;
    }

    public final void t(@dl.d androidx.compose.ui.c cVar) {
        f0.p(cVar, "<set-?>");
        this.contentAlignment = cVar;
    }

    public final void u(@dl.d LayoutDirection layoutDirection) {
        f0.p(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    public final void v(long j10) {
        this.measuredSize.setValue(s1.r.b(j10));
    }

    @dl.d
    public final f w(int towards, @dl.d androidx.compose.animation.core.f0<s1.n> animationSpec, @dl.d final yh.l<? super Integer, Integer> initialOffset) {
        f0.p(animationSpec, "animationSpec");
        f0.p(initialOffset, "initialOffset");
        if (q(towards)) {
            return EnterExitTransitionKt.L(animationSpec, new yh.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @dl.d
                public final Integer a(int i10) {
                    return initialOffset.invoke(Integer.valueOf(s1.r.m(this.l()) - s1.n.m(this.f(s1.s.a(i10, i10), this.l()))));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return a(num.intValue());
                }
            });
        }
        if (r(towards)) {
            return EnterExitTransitionKt.L(animationSpec, new yh.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @dl.d
                public final Integer a(int i10) {
                    return initialOffset.invoke(Integer.valueOf((-s1.n.m(this.f(s1.s.a(i10, i10), this.l()))) - i10));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return a(num.intValue());
                }
            });
        }
        b.Companion companion = b.INSTANCE;
        if (b.j(towards, companion.f())) {
            return EnterExitTransitionKt.O(animationSpec, new yh.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @dl.d
                public final Integer a(int i10) {
                    return initialOffset.invoke(Integer.valueOf(s1.r.j(this.l()) - s1.n.o(this.f(s1.s.a(i10, i10), this.l()))));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return a(num.intValue());
                }
            });
        }
        return b.j(towards, companion.a()) ? EnterExitTransitionKt.O(animationSpec, new yh.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentScope$slideIntoContainer$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @dl.d
            public final Integer a(int i10) {
                return initialOffset.invoke(Integer.valueOf((-s1.n.o(this.f(s1.s.a(i10, i10), this.l()))) - i10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return a(num.intValue());
            }
        }) : f.INSTANCE.a();
    }

    @dl.d
    public final h y(int towards, @dl.d androidx.compose.animation.core.f0<s1.n> animationSpec, @dl.d final yh.l<? super Integer, Integer> targetOffset) {
        f0.p(animationSpec, "animationSpec");
        f0.p(targetOffset, "targetOffset");
        if (q(towards)) {
            return EnterExitTransitionKt.S(animationSpec, new yh.l<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ AnimatedContentScope<S> f3855b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.f3855b = this;
                }

                @dl.d
                public final Integer a(int i10) {
                    m2 m2Var = (m2) this.f3855b.o().get(this.f3855b.p().o());
                    return targetOffset.invoke(Integer.valueOf((-s1.n.m(this.f3855b.f(s1.s.a(i10, i10), m2Var != null ? ((s1.r) m2Var.getValue()).getF139248a() : s1.r.f139246b.a()))) - i10));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return a(num.intValue());
                }
            });
        }
        if (r(towards)) {
            return EnterExitTransitionKt.S(animationSpec, new yh.l<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ AnimatedContentScope<S> f3857b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.f3857b = this;
                }

                @dl.d
                public final Integer a(int i10) {
                    m2 m2Var = (m2) this.f3857b.o().get(this.f3857b.p().o());
                    long f139248a = m2Var != null ? ((s1.r) m2Var.getValue()).getF139248a() : s1.r.f139246b.a();
                    return targetOffset.invoke(Integer.valueOf((-s1.n.m(this.f3857b.f(s1.s.a(i10, i10), f139248a))) + s1.r.m(f139248a)));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return a(num.intValue());
                }
            });
        }
        b.Companion companion = b.INSTANCE;
        if (b.j(towards, companion.f())) {
            return EnterExitTransitionKt.U(animationSpec, new yh.l<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ AnimatedContentScope<S> f3859b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.f3859b = this;
                }

                @dl.d
                public final Integer a(int i10) {
                    m2 m2Var = (m2) this.f3859b.o().get(this.f3859b.p().o());
                    return targetOffset.invoke(Integer.valueOf((-s1.n.o(this.f3859b.f(s1.s.a(i10, i10), m2Var != null ? ((s1.r) m2Var.getValue()).getF139248a() : s1.r.f139246b.a()))) - i10));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return a(num.intValue());
                }
            });
        }
        return b.j(towards, companion.a()) ? EnterExitTransitionKt.U(animationSpec, new yh.l<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentScope$slideOutOfContainer$5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AnimatedContentScope<S> f3861b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.f3861b = this;
            }

            @dl.d
            public final Integer a(int i10) {
                m2 m2Var = (m2) this.f3861b.o().get(this.f3861b.p().o());
                long f139248a = m2Var != null ? ((s1.r) m2Var.getValue()).getF139248a() : s1.r.f139246b.a();
                return targetOffset.invoke(Integer.valueOf((-s1.n.o(this.f3861b.f(s1.s.a(i10, i10), f139248a))) + s1.r.j(f139248a)));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return a(num.intValue());
            }
        }) : h.INSTANCE.a();
    }
}
