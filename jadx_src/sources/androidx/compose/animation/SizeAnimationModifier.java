package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.k0;
import androidx.compose.ui.layout.l0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB \u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014ø\u0001\u0001¢\u0006\u0004\b-\u0010.J)\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R/\u0010!\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e\"\u0004\b\u001f\u0010 RW\u0010(\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\n¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'\u0018\u00010\"8\u0006@\u0006X\u0086\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b\u001c\u0010*\"\u0004\b+\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifier;", "Landroidx/compose/animation/n;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "Ls1/r;", "targetSize", ak.av, "(J)J", "Landroidx/compose/animation/core/h;", "b", "Landroidx/compose/animation/core/h;", "d", "()Landroidx/compose/animation/core/h;", "animSpec", "Lkotlinx/coroutines/q0;", ak.aF, "Lkotlinx/coroutines/q0;", "f", "()Lkotlinx/coroutines/q0;", "scope", "Landroidx/compose/animation/SizeAnimationModifier$a;", "<set-?>", "e", "Landroidx/compose/runtime/a1;", "()Landroidx/compose/animation/SizeAnimationModifier$a;", "g", "(Landroidx/compose/animation/SizeAnimationModifier$a;)V", "animData", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "startSize", "endSize", "Lkotlin/b2;", com.google.android.gms.common.internal.s.a.f52543a, "Lyh/p;", "()Lyh/p;", "m", "(Lyh/p;)V", "<init>", "(Landroidx/compose/animation/core/h;Lkotlinx/coroutines/q0;)V", "animation_release"}, k = 1, mv = {1, 7, 1})
public final class SizeAnimationModifier extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.animation.core.h<s1.r> animSpec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q0 scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private yh.p<? super s1.r, ? super s1.r, b2> f4070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 animData;

    /* JADX INFO: renamed from: androidx.compose.animation.SizeAnimationModifier$a, reason: from toString */
    /* JADX INFO: compiled from: AnimationModifier.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B&\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\t\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003ø\u0001\u0000J\u0019\u0010\u0006\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifier$a;", "", "Landroidx/compose/animation/core/Animatable;", "Ls1/r;", "Landroidx/compose/animation/core/m;", ak.av, "b", "()J", "anim", "startSize", ak.aF, "(Landroidx/compose/animation/core/Animatable;J)Landroidx/compose/animation/SizeAnimationModifier$a;", "", "toString", "", "hashCode", "other", "", "equals", "Landroidx/compose/animation/core/Animatable;", "e", "()Landroidx/compose/animation/core/Animatable;", "J", "f", "g", "(J)V", "<init>", "(Landroidx/compose/animation/core/Animatable;JLkotlin/jvm/internal/u;)V", "animation_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class AnimData {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f4072c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private final Animatable<s1.r, androidx.compose.animation.core.m> anim;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private long startSize;

        private AnimData(Animatable<s1.r, androidx.compose.animation.core.m> animatable, long j10) {
            this.anim = animatable;
            this.startSize = j10;
        }

        public /* synthetic */ AnimData(Animatable animatable, long j10, kotlin.jvm.internal.u uVar) {
            this(animatable, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AnimData d(AnimData animData, Animatable animatable, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                animatable = animData.anim;
            }
            if ((i10 & 2) != 0) {
                j10 = animData.startSize;
            }
            return animData.c(animatable, j10);
        }

        @dl.d
        public final Animatable<s1.r, androidx.compose.animation.core.m> a() {
            return this.anim;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getStartSize() {
            return this.startSize;
        }

        @dl.d
        public final AnimData c(@dl.d Animatable<s1.r, androidx.compose.animation.core.m> anim, long startSize) {
            f0.p(anim, "anim");
            return new AnimData(anim, startSize, null);
        }

        @dl.d
        public final Animatable<s1.r, androidx.compose.animation.core.m> e() {
            return this.anim;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) other;
            return f0.g(this.anim, animData.anim) && s1.r.h(this.startSize, animData.startSize);
        }

        public final long f() {
            return this.startSize;
        }

        public final void g(long j10) {
            this.startSize = j10;
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + s1.r.n(this.startSize);
        }

        @dl.d
        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) s1.r.p(this.startSize)) + ')';
        }
    }

    public SizeAnimationModifier(@dl.d androidx.compose.animation.core.h<s1.r> animSpec, @dl.d q0 scope) {
        f0.p(animSpec, "animSpec");
        f0.p(scope, "scope");
        this.animSpec = animSpec;
        this.scope = scope;
        this.animData = h2.g(null, null, 2, null);
    }

    public final long a(long targetSize) {
        AnimData animDataC = c();
        if (animDataC == null) {
            animDataC = new AnimData(new Animatable(s1.r.b(targetSize), VectorConvertersKt.j(s1.r.f139246b), s1.r.b(s1.s.a(1, 1)), null, 8, null), targetSize, null);
        } else if (!s1.r.h(targetSize, animDataC.e().r().getF139248a())) {
            animDataC.g(animDataC.e().u().getF139248a());
            kotlinx.coroutines.k.f(this.scope, null, null, new SizeAnimationModifier$animateTo$data$1$1(animDataC, targetSize, this, null), 3, null);
        }
        g(animDataC);
        return animDataC.e().u().getF139248a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final AnimData c() {
        return (AnimData) this.animData.getValue();
    }

    @dl.d
    public final androidx.compose.animation.core.h<s1.r> d() {
        return this.animSpec;
    }

    @dl.e
    public final yh.p<s1.r, s1.r, b2> e() {
        return this.f4070d;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final q0 getScope() {
        return this.scope;
    }

    public final void g(@dl.e AnimData animData) {
        this.animData.setValue(animData);
    }

    @Override // androidx.compose.ui.layout.w
    @dl.d
    public j0 k(@dl.d l0 measure, @dl.d g0 measurable, long j10) {
        f0.p(measure, "$this$measure");
        f0.p(measurable, "measurable");
        final e1 e1VarZ1 = measurable.z1(j10);
        long jA = a(s1.s.a(e1VarZ1.getWidth(), e1VarZ1.getHeight()));
        return k0.p(measure, s1.r.m(jA), s1.r.j(jA), null, new yh.l<e1.a, b2>() { // from class: androidx.compose.animation.SizeAnimationModifier$measure$1
            {
                super(1);
            }

            public final void a(@dl.d e1.a layout) {
                f0.p(layout, "$this$layout");
                e1.a.v(layout, e1VarZ1, 0, 0, 0.0f, 4, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null);
    }

    public final void m(@dl.e yh.p<? super s1.r, ? super s1.r, b2> pVar) {
        this.f4070d = pVar;
    }
}
