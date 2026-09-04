package androidx.compose.animation.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: ComplexDouble.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0000\u001a\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005H\u0080\n\u001a\u0015\u0010\u0003\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005H\u0080\n\u001a\u0015\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005H\u0080\n¨\u0006\n"}, d2 = {"", ak.av, "b", ak.aF, "Lkotlin/Pair;", "Landroidx/compose/animation/core/t;", "num", "other", "d", "e", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class u {
    @dl.d
    public static final Pair<ComplexDouble, ComplexDouble> a(double d10, double d11, double d12) {
        double d13 = -d11;
        double d14 = (d11 * d11) - ((4.0d * d10) * d12);
        ComplexDouble complexDoubleB = b(d14);
        complexDoubleB._real += d13;
        double d15 = d10 * 2.0d;
        complexDoubleB._real /= d15;
        complexDoubleB._imaginary /= d15;
        ComplexDouble complexDoubleB2 = b(d14);
        double d16 = -1;
        complexDoubleB2._real *= d16;
        complexDoubleB2._imaginary *= d16;
        complexDoubleB2._real += d13;
        complexDoubleB2._real /= d15;
        complexDoubleB2._imaginary /= d15;
        return kotlin.c1.a(complexDoubleB, complexDoubleB2);
    }

    @dl.d
    public static final ComplexDouble b(double d10) {
        return d10 < 0.0d ? new ComplexDouble(0.0d, Math.sqrt(Math.abs(d10))) : new ComplexDouble(Math.sqrt(d10), 0.0d);
    }

    @dl.d
    public static final ComplexDouble c(double d10, @dl.d ComplexDouble other) {
        kotlin.jvm.internal.f0.p(other, "other");
        double d11 = -1;
        other._real *= d11;
        other._imaginary *= d11;
        other._real += d10;
        return other;
    }

    @dl.d
    public static final ComplexDouble d(double d10, @dl.d ComplexDouble other) {
        kotlin.jvm.internal.f0.p(other, "other");
        other._real += d10;
        return other;
    }

    @dl.d
    public static final ComplexDouble e(double d10, @dl.d ComplexDouble other) {
        kotlin.jvm.internal.f0.p(other, "other");
        other._real *= d10;
        other._imaginary *= d10;
        return other;
    }
}
