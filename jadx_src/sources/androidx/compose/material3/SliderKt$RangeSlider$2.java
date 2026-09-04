package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class SliderKt$RangeSlider$2 extends Lambda implements yh.q<androidx.compose.foundation.layout.l, androidx.compose.runtime.p, Integer, kotlin.b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.a<kotlin.b2> f10534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f10535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.g f10536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.g f10537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f10538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ fi.f<Float> f10539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ fi.f<Float> f10540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f10541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ m2<yh.l<fi.f<Float>, kotlin.b2>> f10542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ float[] f10543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ j1 f10544l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$RangeSlider$2(yh.a<kotlin.b2> aVar, int i10, androidx.compose.foundation.interaction.g gVar, androidx.compose.foundation.interaction.g gVar2, boolean z10, fi.f<Float> fVar, fi.f<Float> fVar2, int i11, m2<? extends yh.l<? super fi.f<Float>, kotlin.b2>> m2Var, float[] fArr, j1 j1Var) {
        super(3);
        this.f10534b = aVar;
        this.f10535c = i10;
        this.f10536d = gVar;
        this.f10537e = gVar2;
        this.f10538f = z10;
        this.f10539g = fVar;
        this.f10540h = fVar2;
        this.f10541i = i11;
        this.f10542j = m2Var;
        this.f10543k = fArr;
        this.f10544l = j1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(fi.f<Float> fVar, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f10) {
        return SliderKt.K(fVar.D().floatValue(), fVar.e().floatValue(), f10, floatRef.f124888b, floatRef2.f124888b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fi.f<Float> e(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, fi.f<Float> fVar, fi.f<Float> fVar2) {
        return SliderKt.L(floatRef.f124888b, floatRef2.f124888b, fVar2, fVar.D().floatValue(), fVar.e().floatValue());
    }

    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public final void c(@dl.d androidx.compose.foundation.layout.l BoxWithConstraints, @dl.e androidx.compose.runtime.p pVar, int i10) {
        int i11;
        kotlin.jvm.internal.f0.p(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i10 & 14) == 0) {
            i11 = (pVar.s(BoxWithConstraints) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 91) == 18 && pVar.b()) {
            pVar.l();
            return;
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(-990606702, i10, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:412)");
        }
        boolean z10 = pVar.K(CompositionLocalsKt.p()) == LayoutDirection.Rtl;
        float fP = s1.b.p(BoxWithConstraints.getConstraints());
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
        float f10 = 2;
        floatRef.f124888b = fP - (eVar.E1(SliderKt.H()) / f10);
        floatRef2.f124888b = eVar.E1(SliderKt.H()) / f10;
        kotlin.b2 b2Var = kotlin.b2.f124493a;
        fi.f<Float> fVar = this.f10540h;
        fi.f<Float> fVar2 = this.f10539g;
        pVar.T(-492369756);
        Object objU = pVar.U();
        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
        if (objU == companion.a()) {
            objU = h2.g(Float.valueOf(d(fVar2, floatRef2, floatRef, fVar.D().floatValue())), null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        final androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) objU;
        fi.f<Float> fVar3 = this.f10540h;
        fi.f<Float> fVar4 = this.f10539g;
        pVar.T(-492369756);
        Object objU2 = pVar.U();
        if (objU2 == companion.a()) {
            objU2 = h2.g(Float.valueOf(d(fVar4, floatRef2, floatRef, fVar3.e().floatValue())), null, 2, null);
            pVar.N(objU2);
        }
        pVar.c0();
        final androidx.compose.runtime.a1 a1Var2 = (androidx.compose.runtime.a1) objU2;
        final yh.a<kotlin.b2> aVar = this.f10534b;
        pVar.T(1157296644);
        boolean zS = pVar.s(aVar);
        Object objU3 = pVar.U();
        if (zS || objU3 == companion.a()) {
            objU3 = new yh.l<Boolean, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2$gestureEndAction$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(boolean z11) {
                    yh.a<kotlin.b2> aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(Boolean bool) {
                    a(bool.booleanValue());
                    return kotlin.b2.f124493a;
                }
            };
            pVar.N(objU3);
        }
        pVar.c0();
        m2 m2VarT = androidx.compose.runtime.e2.t(objU3, pVar, 0);
        final fi.f<Float> fVar5 = this.f10540h;
        final float[] fArr = this.f10543k;
        final m2<yh.l<fi.f<Float>, kotlin.b2>> m2Var = this.f10542j;
        final fi.f<Float> fVar6 = this.f10539g;
        m2 m2VarT2 = androidx.compose.runtime.e2.t(new yh.p<Boolean, Float, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2$onDrag$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(boolean z11, float f11) {
                fi.f<Float> fVarE;
                if (z11) {
                    androidx.compose.runtime.a1<Float> a1Var3 = a1Var;
                    a1Var3.setValue(Float.valueOf(a1Var3.getValue().floatValue() + f11));
                    a1Var2.setValue(Float.valueOf(SliderKt$RangeSlider$2.d(fVar6, floatRef2, floatRef, fVar5.e().floatValue())));
                    float fFloatValue = a1Var2.getValue().floatValue();
                    fVarE = fi.t.e(SliderKt.P(fi.u.H(a1Var.getValue().floatValue(), floatRef2.f124888b, fFloatValue), fArr, floatRef2.f124888b, floatRef.f124888b), fFloatValue);
                } else {
                    androidx.compose.runtime.a1<Float> a1Var4 = a1Var2;
                    a1Var4.setValue(Float.valueOf(a1Var4.getValue().floatValue() + f11));
                    a1Var.setValue(Float.valueOf(SliderKt$RangeSlider$2.d(fVar6, floatRef2, floatRef, fVar5.D().floatValue())));
                    float fFloatValue2 = a1Var.getValue().floatValue();
                    fVarE = fi.t.e(fFloatValue2, SliderKt.P(fi.u.H(a1Var2.getValue().floatValue(), fFloatValue2, floatRef.f124888b), fArr, floatRef2.f124888b, floatRef.f124888b));
                }
                m2Var.getValue().invoke(SliderKt$RangeSlider$2.e(floatRef2, floatRef, fVar6, fVarE));
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Boolean bool, Float f11) {
                a(bool.booleanValue(), f11.floatValue());
                return kotlin.b2.f124493a;
            }
        }, pVar, 0);
        androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
        androidx.compose.ui.n nVarJ = SliderKt.J(companion2, this.f10536d, this.f10537e, a1Var, a1Var2, this.f10538f, z10, fP, this.f10539g, m2VarT, m2VarT2);
        final float fH = fi.u.H(this.f10540h.D().floatValue(), this.f10539g.D().floatValue(), this.f10540h.e().floatValue());
        final float fH2 = fi.u.H(this.f10540h.e().floatValue(), this.f10540h.D().floatValue(), this.f10539g.e().floatValue());
        float fG = SliderKt.G(this.f10539g.D().floatValue(), this.f10539g.e().floatValue(), fH);
        float fG2 = SliderKt.G(this.f10539g.D().floatValue(), this.f10539g.e().floatValue(), fH2);
        int iFloor = (int) Math.floor(this.f10541i * fG2);
        int iFloor2 = (int) Math.floor(this.f10541i * (1.0f - fG));
        boolean z11 = this.f10538f;
        Object obj = this.f10542j;
        Object objValueOf = Float.valueOf(fH2);
        final m2<yh.l<fi.f<Float>, kotlin.b2>> m2Var2 = this.f10542j;
        pVar.T(511388516);
        boolean zS2 = pVar.s(obj) | pVar.s(objValueOf);
        Object objU4 = pVar.U();
        if (zS2 || objU4 == companion.a()) {
            objU4 = new yh.l<Float, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2$startThumbSemantics$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void a(float f11) {
                    m2Var2.getValue().invoke(fi.t.e(f11, fH2));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(Float f11) {
                    a(f11.floatValue());
                    return kotlin.b2.f124493a;
                }
            };
            pVar.N(objU4);
        }
        pVar.c0();
        androidx.compose.ui.n nVarM = SliderKt.M(companion2, fH, z11, (yh.l) objU4, this.f10534b, fi.t.e(this.f10539g.D().floatValue(), fH2), iFloor);
        boolean z12 = this.f10538f;
        Object obj2 = this.f10542j;
        Object objValueOf2 = Float.valueOf(fH);
        final m2<yh.l<fi.f<Float>, kotlin.b2>> m2Var3 = this.f10542j;
        pVar.T(511388516);
        boolean zS3 = pVar.s(obj2) | pVar.s(objValueOf2);
        Object objU5 = pVar.U();
        if (zS3 || objU5 == companion.a()) {
            objU5 = new yh.l<Float, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2$endThumbSemantics$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void a(float f11) {
                    m2Var3.getValue().invoke(fi.t.e(fH, f11));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(Float f11) {
                    a(f11.floatValue());
                    return kotlin.b2.f124493a;
                }
            };
            pVar.N(objU5);
        }
        pVar.c0();
        androidx.compose.ui.n nVarM2 = SliderKt.M(companion2, fH2, z12, (yh.l) objU5, this.f10534b, fi.t.e(fH, this.f10539g.e().floatValue()), iFloor2);
        boolean z13 = this.f10538f;
        float[] fArr2 = this.f10543k;
        j1 j1Var = this.f10544l;
        float f11 = floatRef.f124888b - floatRef2.f124888b;
        androidx.compose.foundation.interaction.g gVar = this.f10536d;
        androidx.compose.foundation.interaction.g gVar2 = this.f10537e;
        int i12 = this.f10535c;
        SliderKt.b(z13, fG, fG2, fArr2, j1Var, f11, gVar, gVar2, nVarJ, nVarM, nVarM2, pVar, 14159872 | ((i12 >> 9) & 14) | ((i12 >> 9) & 57344), 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
    }

    @Override // yh.q
    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.l lVar, androidx.compose.runtime.p pVar, Integer num) {
        c(lVar, pVar, num.intValue());
        return kotlin.b2.f124493a;
    }
}
