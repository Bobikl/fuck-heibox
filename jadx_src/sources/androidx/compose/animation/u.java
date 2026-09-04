package androidx.compose.animation;

import androidx.compose.animation.core.z;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SplineBasedDecay.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e\"\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"", "splinePositions", "splineTimes", "", "nbSamples", "Lkotlin/b2;", "b", androidx.exifinterface.media.a.f23244d5, "Ls1/e;", "density", "Landroidx/compose/animation/core/x;", ak.aF, "", ak.av, "F", "Inflection", "StartTension", "EndTension", "d", "P1", "e", "P2", "animation_release"}, k = 2, mv = {1, 7, 1})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f4614a = 0.35f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f4615b = 0.5f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f4616c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f4617d = 0.175f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f4618e = 0.35000002f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(float[] fArr, float[] fArr2, int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i11 = 0; i11 < i10; i11++) {
            float f20 = i11 / i10;
            float f21 = 1.0f;
            while (true) {
                f10 = ((f21 - f18) / 2.0f) + f18;
                f11 = 1.0f - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f22 = (((f11 * f4617d) + (f10 * f4618e)) * f12) + f13;
                if (Math.abs(f22 - f20) < 1.0E-5d) {
                    break;
                } else if (f22 > f20) {
                    f21 = f10;
                } else {
                    f18 = f10;
                }
            }
            float f23 = 0.5f;
            fArr[i11] = (f12 * ((f11 * 0.5f) + f10)) + f13;
            float f24 = 1.0f;
            while (true) {
                f14 = ((f24 - f19) / 2.0f) + f19;
                f15 = 1.0f - f14;
                f16 = f14 * 3.0f * f15;
                f17 = f14 * f14 * f14;
                float f25 = (((f15 * f23) + f14) * f16) + f17;
                if (Math.abs(f25 - f20) >= 1.0E-5d) {
                    if (f25 > f20) {
                        f24 = f14;
                    } else {
                        f19 = f14;
                    }
                    f23 = 0.5f;
                }
            }
            fArr2[i11] = (f16 * ((f15 * f4617d) + (f14 * f4618e))) + f17;
        }
        fArr2[i10] = 1.0f;
        fArr[i10] = 1.0f;
    }

    @dl.d
    public static final <T> androidx.compose.animation.core.x<T> c(@dl.d s1.e density) {
        f0.p(density, "density");
        return z.e(new v(density));
    }
}
