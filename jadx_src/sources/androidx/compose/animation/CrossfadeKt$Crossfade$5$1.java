package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.f0;
import androidx.compose.animation.core.f1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.v1;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.v0;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.i0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: Crossfade.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class CrossfadeKt$Crossfade$5$1 extends Lambda implements yh.p<androidx.compose.runtime.p, Integer, b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Transition<T> f3994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f3995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ f0<Float> f3996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ T f3997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ yh.q<T, androidx.compose.runtime.p, Integer, b2> f3998f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CrossfadeKt$Crossfade$5$1(Transition<T> transition, int i10, f0<Float> f0Var, T t10, yh.q<? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> qVar) {
        super(2);
        this.f3994b = transition;
        this.f3995c = i10;
        this.f3996d = f0Var;
        this.f3997e = t10;
        this.f3998f = qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(m2<Float> m2Var) {
        return m2Var.getValue().floatValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.h
    public final void b(@dl.e androidx.compose.runtime.p pVar, int i10) {
        if ((i10 & 11) == 2 && pVar.b()) {
            pVar.l();
            return;
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1426421288, i10, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)");
        }
        Transition<T> transition = this.f3994b;
        final f0<Float> f0Var = this.f3996d;
        yh.q<Transition.b<T>, androidx.compose.runtime.p, Integer, f0<Float>> qVar = new yh.q<Transition.b<T>, androidx.compose.runtime.p, Integer, f0<Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final f0<Float> a(@dl.d Transition.b<T> animateFloat, @dl.e androidx.compose.runtime.p pVar2, int i11) {
                kotlin.jvm.internal.f0.p(animateFloat, "$this$animateFloat");
                pVar2.T(438406499);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(438406499, i11, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
                }
                f0<Float> f0Var2 = f0Var;
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar2.c0();
                return f0Var2;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ f0<Float> invoke(Object obj, androidx.compose.runtime.p pVar2, Integer num) {
                return a((Transition.b) obj, pVar2, num.intValue());
            }
        };
        T t10 = this.f3997e;
        int i11 = this.f3995c & 14;
        pVar.T(-1338768149);
        f1<Float, androidx.compose.animation.core.l> f1VarE = VectorConvertersKt.e(y.f124996a);
        int i12 = i11 & 14;
        int i13 = i11 << 3;
        int i14 = (i13 & 57344) | i12 | (i13 & bb.c.b.f30796me) | (i13 & bb.c.g.f32954lc);
        pVar.T(-142660079);
        Object objH = transition.h();
        int i15 = (i14 >> 9) & 112;
        pVar.T(-438678252);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-438678252, i15, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
        }
        float f10 = kotlin.jvm.internal.f0.g(objH, t10) ? 1.0f : 0.0f;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        Float fValueOf = Float.valueOf(f10);
        Object objO = transition.o();
        pVar.T(-438678252);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-438678252, i15, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
        }
        float f11 = kotlin.jvm.internal.f0.g(objO, t10) ? 1.0f : 0.0f;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        final m2 m2VarM = androidx.compose.animation.core.TransitionKt.m(transition, fValueOf, Float.valueOf(f11), qVar.invoke(transition.m(), pVar, Integer.valueOf((i14 >> 3) & 112)), f1VarE, "FloatAnimation", pVar, (i14 & 14) | (57344 & (i14 << 9)) | ((i14 << 6) & 458752));
        pVar.c0();
        pVar.c0();
        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
        pVar.T(1157296644);
        boolean zS = pVar.s(m2VarM);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new yh.l<v0, b2>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d v0 graphicsLayer) {
                    kotlin.jvm.internal.f0.p(graphicsLayer, "$this$graphicsLayer");
                    graphicsLayer.f(CrossfadeKt$Crossfade$5$1.c(m2VarM));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(v0 v0Var) {
                    a(v0Var);
                    return b2.f124493a;
                }
            };
            pVar.N(objU);
        }
        pVar.c0();
        androidx.compose.ui.n nVarA = GraphicsLayerModifierKt.a(companion, (yh.l) objU);
        yh.q<T, androidx.compose.runtime.p, Integer, b2> qVar2 = this.f3998f;
        T t11 = this.f3997e;
        int i16 = this.f3995c;
        pVar.T(-1990474327);
        i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar, 0);
        pVar.T(1376089335);
        s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
        LayoutDirection layoutDirection = (LayoutDirection) pVar.K(CompositionLocalsKt.p());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        yh.a<ComposeUiNode> aVarA = companion2.a();
        yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(nVarA);
        if (!(pVar.G() instanceof androidx.compose.runtime.e)) {
            ComposablesKt.n();
        }
        pVar.h();
        if (pVar.D()) {
            pVar.L(aVarA);
        } else {
            pVar.d();
        }
        pVar.Y();
        androidx.compose.runtime.p pVarB = Updater.b(pVar);
        Updater.j(pVarB, i0VarK, companion2.d());
        Updater.j(pVarB, eVar, companion2.b());
        Updater.j(pVarB, layoutDirection, companion2.c());
        pVar.x();
        qVarF.invoke(v1.a(v1.b(pVar)), pVar, 0);
        pVar.T(2058660585);
        pVar.T(-1253629305);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
        pVar.T(-222715758);
        qVar2.invoke(t11, pVar, Integer.valueOf((i16 >> 9) & 112));
        pVar.c0();
        pVar.c0();
        pVar.c0();
        pVar.f();
        pVar.c0();
        pVar.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar, Integer num) {
        b(pVar, num.intValue());
        return b2.f124493a;
    }
}
