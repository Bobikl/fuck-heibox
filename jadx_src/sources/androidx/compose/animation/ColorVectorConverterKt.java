package androidx.compose.animation;

import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.f1;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.n0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ColorVectorConverter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\"\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n\"?\u0010\u0019\u001a)\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\u000f*\u00020\u000e8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"", "column", "", "x", "y", ak.aD, "", "matrix", "e", "b", "[F", "M1", ak.aF, "InverseM1", "Landroidx/compose/ui/graphics/l0$a;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/colorspace/c;", "Lkotlin/m0;", "name", "colorSpace", "Landroidx/compose/animation/core/f1;", "Landroidx/compose/ui/graphics/l0;", "Landroidx/compose/animation/core/o;", "d", "(Landroidx/compose/ui/graphics/l0$a;)Lyh/l;", "VectorConverter", "animation_release"}, k = 2, mv = {1, 7, 1})
public final class ColorVectorConverterKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final yh.l<androidx.compose.ui.graphics.colorspace.c, f1<l0, androidx.compose.animation.core.o>> f3973a = new yh.l<androidx.compose.ui.graphics.colorspace.c, f1<l0, androidx.compose.animation.core.o>>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1
        @Override // yh.l
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f1<l0, androidx.compose.animation.core.o> invoke(@dl.d final androidx.compose.ui.graphics.colorspace.c colorSpace) {
            f0.p(colorSpace, "colorSpace");
            return VectorConvertersKt.a(new yh.l<l0, androidx.compose.animation.core.o>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
                @dl.d
                public final androidx.compose.animation.core.o a(long j10) {
                    long jU = l0.u(j10, ColorSpaces.f13697a.g());
                    float fI = l0.I(jU);
                    float fG = l0.G(jU);
                    float fC = l0.C(jU);
                    double d10 = 0.33333334f;
                    return new androidx.compose.animation.core.o(l0.A(j10), (float) Math.pow(ColorVectorConverterKt.e(0, fI, fG, fC, ColorVectorConverterKt.f3974b), d10), (float) Math.pow(ColorVectorConverterKt.e(1, fI, fG, fC, ColorVectorConverterKt.f3974b), d10), (float) Math.pow(ColorVectorConverterKt.e(2, fI, fG, fC, ColorVectorConverterKt.f3974b), d10));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.o invoke(l0 l0Var) {
                    return a(l0Var.M());
                }
            }, new yh.l<androidx.compose.animation.core.o, l0>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
                {
                    super(1);
                }

                public final long a(@dl.d androidx.compose.animation.core.o it) {
                    f0.p(it, "it");
                    double d10 = 3.0f;
                    float fPow = (float) Math.pow(it.getV2(), d10);
                    float fPow2 = (float) Math.pow(it.getCom.huawei.hms.feature.dynamic.b.u java.lang.String(), d10);
                    float fPow3 = (float) Math.pow(it.getV4(), d10);
                    return l0.u(n0.a(fi.u.H(ColorVectorConverterKt.e(0, fPow, fPow2, fPow3, ColorVectorConverterKt.f3975c), -2.0f, 2.0f), fi.u.H(ColorVectorConverterKt.e(1, fPow, fPow2, fPow3, ColorVectorConverterKt.f3975c), -2.0f, 2.0f), fi.u.H(ColorVectorConverterKt.e(2, fPow, fPow2, fPow3, ColorVectorConverterKt.f3975c), -2.0f, 2.0f), fi.u.H(it.getCom.alipay.sdk.m.x.c.d java.lang.String(), 0.0f, 1.0f), ColorSpaces.f13697a.g()), colorSpace);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ l0 invoke(androidx.compose.animation.core.o oVar) {
                    return l0.n(a(oVar));
                }
            });
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final float[] f3974b = {0.80405736f, 0.026893456f, 0.04586542f, 0.3188387f, 0.9319606f, 0.26299807f, -0.11419419f, 0.05105356f, 0.83999807f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final float[] f3975c = {1.2485008f, -0.032856926f, -0.057883114f, -0.48331892f, 1.1044513f, -0.3194066f, 0.19910365f, -0.07159331f, 1.202023f};

    @dl.d
    public static final yh.l<androidx.compose.ui.graphics.colorspace.c, f1<l0, androidx.compose.animation.core.o>> d(@dl.d l0.Companion companion) {
        f0.p(companion, "<this>");
        return f3973a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(int i10, float f10, float f11, float f12, float[] fArr) {
        return (f10 * fArr[i10]) + (f11 * fArr[i10 + 3]) + (f12 * fArr[i10 + 6]);
    }
}
