package androidx.compose.foundation.text;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.p0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.o0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: TextFieldCursor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a4\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001d\u0010\u0015\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/x;", "offsetMapping", "Landroidx/compose/ui/graphics/a0;", "cursorBrush", "", "enabled", "b", "Landroidx/compose/animation/core/h;", "", ak.av, "Landroidx/compose/animation/core/h;", "cursorAnimationSpec", "Ls1/h;", "F", ak.aF, "()F", "DefaultCursorThickness", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class TextFieldCursorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.animation.core.h<Float> f7905a = androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.g(new yh.l<p0.b<Float>, b2>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursorAnimationSpec$1
        public final void a(@dl.d p0.b<Float> keyframes) {
            f0.p(keyframes, "$this$keyframes");
            keyframes.g(1000);
            Float fValueOf = Float.valueOf(1.0f);
            keyframes.a(fValueOf, 0);
            keyframes.a(fValueOf, bb.c.b.F6);
            Float fValueOf2 = Float.valueOf(0.0f);
            keyframes.a(fValueOf2, 500);
            keyframes.a(fValueOf2, 999);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(p0.b<Float> bVar) {
            a(bVar);
            return b2.f124493a;
        }
    }), null, 0, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f7906b = s1.h.g(2);

    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d final TextFieldState state, @dl.d final TextFieldValue value, @dl.d final androidx.compose.ui.text.input.x offsetMapping, @dl.d final androidx.compose.ui.graphics.a0 cursorBrush, boolean z10) {
        f0.p(nVar, "<this>");
        f0.p(state, "state");
        f0.p(value, "value");
        f0.p(offsetMapping, "offsetMapping");
        f0.p(cursorBrush, "cursorBrush");
        return z10 ? ComposedModifierKt.l(nVar, null, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1

            /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: TextFieldCursor.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", i = {}, l = {50, 52}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f7911b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Animatable<Float, androidx.compose.animation.core.l> f7912c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Animatable<Float, androidx.compose.animation.core.l> animatable, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.f7912c = animatable;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    return new AnonymousClass1(this.f7912c, cVar);
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
                    int i10 = this.f7911b;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            t0.n(obj);
                        } else {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t0.n(obj);
                        }
                        return b2.f124493a;
                    }
                    t0.n(obj);
                    Animatable<Float, androidx.compose.animation.core.l> animatable = this.f7912c;
                    Float fE = kotlin.coroutines.jvm.internal.a.e(1.0f);
                    this.f7911b = 1;
                    if (animatable.B(fE, this) == objH) {
                        return objH;
                    }
                    Animatable<Float, androidx.compose.animation.core.l> animatable2 = this.f7912c;
                    Float fE2 = kotlin.coroutines.jvm.internal.a.e(0.0f);
                    androidx.compose.animation.core.h hVar = TextFieldCursorKt.f7905a;
                    this.f7911b = 2;
                    if (Animatable.i(animatable2, fE2, hVar, null, null, this, 12, null) == objH) {
                        return objH;
                    }
                    return b2.f124493a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0058  */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                boolean z11;
                androidx.compose.ui.n nVarC;
                f0.p(composed, "$this$composed");
                pVar.T(1634330012);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1634330012, i10, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:43)");
                }
                pVar.T(-492369756);
                Object objU = pVar.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = androidx.compose.animation.core.b.b(1.0f, 0.0f, 2, null);
                    pVar.N(objU);
                }
                pVar.c0();
                final Animatable animatable = (Animatable) objU;
                androidx.compose.ui.graphics.a0 a0Var = cursorBrush;
                if (a0Var instanceof SolidColor) {
                    z11 = (((SolidColor) a0Var).getValue() > l0.INSTANCE.u() ? 1 : (((SolidColor) a0Var).getValue() == l0.INSTANCE.u() ? 0 : -1)) == 0 ? false : true;
                }
                if (state.d() && o0.h(value.getSelection()) && z11) {
                    EffectsKt.g(value.getText(), o0.b(value.getSelection()), new AnonymousClass1(animatable, null), pVar, 512);
                    final androidx.compose.ui.text.input.x xVar = offsetMapping;
                    final TextFieldValue textFieldValue = value;
                    final TextFieldState textFieldState = state;
                    final androidx.compose.ui.graphics.a0 a0Var2 = cursorBrush;
                    nVarC = DrawModifierKt.c(composed, new yh.l<androidx.compose.ui.graphics.drawscope.d, b2>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.graphics.drawscope.d drawWithContent) {
                            b1.i iVar;
                            TextLayoutResult value2;
                            f0.p(drawWithContent, "$this$drawWithContent");
                            drawWithContent.T0();
                            float fH = fi.u.H(animatable.u().floatValue(), 0.0f, 1.0f);
                            if (fH == 0.0f) {
                                return;
                            }
                            int iB = xVar.b(o0.n(textFieldValue.getSelection()));
                            w wVarG = textFieldState.g();
                            if (wVarG == null || (value2 = wVarG.getValue()) == null || (iVar = value2.e(iB)) == null) {
                                iVar = new b1.i(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            float fE1 = drawWithContent.E1(TextFieldCursorKt.c());
                            float f10 = fE1 / 2;
                            float fA = fi.u.A(iVar.t() + f10, b1.m.t(drawWithContent.c()) - f10);
                            androidx.compose.ui.graphics.drawscope.f.B(drawWithContent, a0Var2, b1.g.a(fA, iVar.getF30372b()), b1.g.a(fA, iVar.j()), fE1, 0, null, fH, null, 0, bb.c.b.f30879q5, null);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
                            a(dVar);
                            return b2.f124493a;
                        }
                    });
                } else {
                    nVarC = androidx.compose.ui.n.INSTANCE;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarC;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        }, 1, null) : nVar;
    }

    public static final float c() {
        return f7906b;
    }
}
