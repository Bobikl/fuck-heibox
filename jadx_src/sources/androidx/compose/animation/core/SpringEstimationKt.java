package androidx.compose.animation.core;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: SpringEstimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a.\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000\u001a.\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b\u001a6\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b\u001a4\u0010\u0013\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0002\u001a4\u0010\u0014\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0002\u001a4\u0010\u0015\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0002\u001a<\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0002\u001a9\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0019H\u0082\b\u001a\r\u0010\u001e\u001a\u00020\u001d*\u00020\bH\u0082\b¨\u0006\u001f"}, d2 = {"", "stiffness", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "", ak.aF, "", ak.av, "springConstant", "dampingCoefficient", "mass", "b", "Lkotlin/Pair;", "Landroidx/compose/animation/core/t;", "roots", "p0", "v0", "j", "d", RXScreenCaptureService.KEY_HEIGHT, "initialPosition", "g", "x", "Lkotlin/Function1;", "fn", "fnPrime", "l", "", "k", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class SpringEstimationKt {
    public static final long a(double d10, double d11, double d12, double d13, double d14) {
        return g(u.a(1.0d, 2.0d * d11 * Math.sqrt(d10), d10), d11, d12, d13, d14);
    }

    public static final long b(double d10, double d11, double d12, double d13, double d14, double d15) {
        return g(u.a(d12, d11, d10), d11 / (Math.sqrt(d10 * d12) * 2.0d), d13, d14, d15);
    }

    public static final long c(float f10, float f11, float f12, float f13, float f14) {
        return a(f10, f11, f12, f13, f14);
    }

    private static final double d(Pair<ComplexDouble, ComplexDouble> pair, final double d10, double d11, double d12) {
        double d13;
        final double d14;
        final double dK = pair.e().k();
        double d15 = dK * d10;
        final double d16 = d11 - d15;
        double dLog = Math.log(Math.abs(d12 / d10)) / dK;
        double dE = e(Math.log(Math.abs(d12 / d16)), dK) / dK;
        int i10 = 0;
        if (!((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true)) {
            d13 = dE;
        } else {
            if (!(!((Double.isInfinite(dE) || Double.isNaN(dE)) ? false : true))) {
                dLog = Math.max(dLog, dE);
            }
            d13 = dLog;
        }
        double d17 = (-(d15 + d16)) / (dK * d16);
        if (Double.isNaN(d17) || d17 <= 0.0d) {
            d14 = -d12;
        } else if (d17 <= 0.0d || (-f(d10, dK, d17, d16)) >= d12) {
            d13 = (-(2.0d / dK)) - (d10 / d16);
            d14 = d12;
        } else {
            if (d16 < 0.0d && d10 > 0.0d) {
                d13 = 0.0d;
            }
            d14 = -d12;
        }
        yh.l<Double, Double> lVar = new yh.l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @dl.d
            public final Double a(double d18) {
                return Double.valueOf(((d10 + (d16 * d18)) * Math.exp(dK * d18)) + d14);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Double invoke(Double d18) {
                return a(d18.doubleValue());
            }
        };
        yh.l<Double, Double> lVar2 = new yh.l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @dl.d
            public final Double a(double d18) {
                double d19 = d16;
                double d20 = dK;
                return Double.valueOf(((d19 * ((d20 * d18) + ((double) 1))) + (d10 * d20)) * Math.exp(d20 * d18));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Double invoke(Double d18) {
                return a(d18.doubleValue());
            }
        };
        double d18 = Double.MAX_VALUE;
        while (d18 > 0.001d && i10 < 100) {
            i10++;
            double dDoubleValue = d13 - (lVar.invoke(Double.valueOf(d13)).doubleValue() / lVar2.invoke(Double.valueOf(d13)).doubleValue());
            double dAbs = Math.abs(d13 - dDoubleValue);
            d13 = dDoubleValue;
            d18 = dAbs;
        }
        return d13;
    }

    private static final double e(double d10, double d11) {
        double dLog = d10;
        for (int i10 = 0; i10 < 6; i10++) {
            dLog = d10 - Math.log(Math.abs(dLog / d11));
        }
        return dLog;
    }

    private static final double f(double d10, double d11, double d12, double d13) {
        double d14 = d11 * d12;
        return (d10 * Math.exp(d14)) + (d13 * d12 * Math.exp(d14));
    }

    private static final long g(Pair<ComplexDouble, ComplexDouble> pair, double d10, double d11, double d12, double d13) {
        double dJ;
        if (d12 == 0.0d) {
            if (d11 == 0.0d) {
                return 0L;
            }
        }
        if (d12 < 0.0d) {
            d11 = -d11;
        }
        double d14 = d11;
        double dAbs = Math.abs(d12);
        if (d10 > 1.0d) {
            dJ = h(pair, dAbs, d14, d13);
        } else {
            dJ = d10 < 1.0d ? j(pair, dAbs, d14, d13) : d(pair, dAbs, d14, d13);
        }
        return (long) (dJ * 1000.0d);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb  */
    private static final double h(Pair<ComplexDouble, ComplexDouble> pair, double d10, double d11, double d12) {
        double dLog;
        double d13;
        yh.l<Double, Double> lVar;
        yh.l<Double, Double> lVar2;
        double d14;
        int i10;
        double d15 = d12;
        final double dK = pair.e().k();
        final double dK2 = pair.f().k();
        double d16 = dK - dK2;
        double d17 = ((dK * d10) - d11) / d16;
        final double d18 = d10 - d17;
        double dLog2 = Math.log(Math.abs(d15 / d18)) / dK;
        double dLog3 = Math.log(Math.abs(d15 / d17)) / dK2;
        if (!((Double.isInfinite(dLog2) || Double.isNaN(dLog2)) ? false : true)) {
            dLog = dLog3;
        } else {
            if (!(!((Double.isInfinite(dLog3) || Double.isNaN(dLog3)) ? false : true))) {
                dLog2 = Math.max(dLog2, dLog3);
            }
            dLog = dLog2;
        }
        double d19 = d18 * dK;
        double dLog4 = Math.log(d19 / ((-d17) * dK2)) / (dK2 - dK);
        if (!Double.isNaN(dLog4) && dLog4 > 0.0d) {
            if (dLog4 > 0.0d) {
                d13 = d17;
                if ((-i(d18, dK, dLog4, d17, dK2)) < d15) {
                    if (d13 > 0.0d && d18 < 0.0d) {
                        dLog = 0.0d;
                    }
                }
                final double d20 = d15;
                final double d21 = d13;
                lVar = new yh.l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @dl.d
                    public final Double a(double d22) {
                        return Double.valueOf((d18 * Math.exp(dK * d22)) + (d21 * Math.exp(dK2 * d22)) + d20);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Double invoke(Double d22) {
                        return a(d22.doubleValue());
                    }
                };
                lVar2 = new yh.l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fnPrime$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @dl.d
                    public final Double a(double d22) {
                        double d23 = d18;
                        double d24 = dK;
                        double dExp = d23 * d24 * Math.exp(d24 * d22);
                        double d25 = d21;
                        double d26 = dK2;
                        return Double.valueOf(dExp + (d25 * d26 * Math.exp(d26 * d22)));
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Double invoke(Double d22) {
                        return a(d22.doubleValue());
                    }
                };
                if (Math.abs(lVar.invoke(Double.valueOf(dLog)).doubleValue()) < 1.0E-4d) {
                    return dLog;
                }
                d14 = Double.MAX_VALUE;
                i10 = 0;
                while (d14 > 0.001d && i10 < 100) {
                    i10++;
                    double dDoubleValue = dLog - (lVar.invoke(Double.valueOf(dLog)).doubleValue() / lVar2.invoke(Double.valueOf(dLog)).doubleValue());
                    double dAbs = Math.abs(dLog - dDoubleValue);
                    dLog = dDoubleValue;
                    d14 = dAbs;
                }
                return dLog;
            }
            d13 = d17;
            dLog = Math.log((-((d13 * dK2) * dK2)) / (d19 * dK)) / d16;
            final double d22 = d15;
            final double d23 = d13;
            lVar = new yh.l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fn$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @dl.d
                public final Double a(double d24) {
                    return Double.valueOf((d18 * Math.exp(dK * d24)) + (d23 * Math.exp(dK2 * d24)) + d22);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Double invoke(Double d24) {
                    return a(d24.doubleValue());
                }
            };
            lVar2 = new yh.l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fnPrime$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @dl.d
                public final Double a(double d24) {
                    double d25 = d18;
                    double d26 = dK;
                    double dExp = d25 * d26 * Math.exp(d26 * d24);
                    double d27 = d23;
                    double d28 = dK2;
                    return Double.valueOf(dExp + (d27 * d28 * Math.exp(d28 * d24)));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Double invoke(Double d24) {
                    return a(d24.doubleValue());
                }
            };
            if (Math.abs(lVar.invoke(Double.valueOf(dLog)).doubleValue()) < 1.0E-4d) {
                return dLog;
            }
            d14 = Double.MAX_VALUE;
            i10 = 0;
            while (d14 > 0.001d) {
                i10++;
                double dDoubleValue2 = dLog - (lVar.invoke(Double.valueOf(dLog)).doubleValue() / lVar2.invoke(Double.valueOf(dLog)).doubleValue());
                double dAbs2 = Math.abs(dLog - dDoubleValue2);
                dLog = dDoubleValue2;
                d14 = dAbs2;
            }
            return dLog;
        }
        d13 = d17;
        d15 = -d15;
        final double d24 = d15;
        final double d25 = d13;
        lVar = new yh.l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @dl.d
            public final Double a(double d26) {
                return Double.valueOf((d18 * Math.exp(dK * d26)) + (d25 * Math.exp(dK2 * d26)) + d24);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Double invoke(Double d26) {
                return a(d26.doubleValue());
            }
        };
        lVar2 = new yh.l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fnPrime$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @dl.d
            public final Double a(double d26) {
                double d27 = d18;
                double d28 = dK;
                double dExp = d27 * d28 * Math.exp(d28 * d26);
                double d29 = d25;
                double d210 = dK2;
                return Double.valueOf(dExp + (d29 * d210 * Math.exp(d210 * d26)));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Double invoke(Double d26) {
                return a(d26.doubleValue());
            }
        };
        if (Math.abs(lVar.invoke(Double.valueOf(dLog)).doubleValue()) < 1.0E-4d) {
            return dLog;
        }
        d14 = Double.MAX_VALUE;
        i10 = 0;
        while (d14 > 0.001d) {
            i10++;
            double dDoubleValue3 = dLog - (lVar.invoke(Double.valueOf(dLog)).doubleValue() / lVar2.invoke(Double.valueOf(dLog)).doubleValue());
            double dAbs3 = Math.abs(dLog - dDoubleValue3);
            dLog = dDoubleValue3;
            d14 = dAbs3;
        }
        return dLog;
    }

    private static final double i(double d10, double d11, double d12, double d13, double d14) {
        return (d10 * Math.exp(d11 * d12)) + (d13 * Math.exp(d14 * d12));
    }

    private static final double j(Pair<ComplexDouble, ComplexDouble> pair, double d10, double d11, double d12) {
        double dK = pair.e().k();
        double dJ = (d11 - (dK * d10)) / pair.e().j();
        return Math.log(d12 / Math.sqrt((d10 * d10) + (dJ * dJ))) / dK;
    }

    private static final boolean k(double d10) {
        return !((Double.isInfinite(d10) || Double.isNaN(d10)) ? false : true);
    }

    private static final double l(double d10, yh.l<? super Double, Double> lVar, yh.l<? super Double, Double> lVar2) {
        return d10 - (lVar.invoke(Double.valueOf(d10)).doubleValue() / lVar2.invoke(Double.valueOf(d10)).doubleValue());
    }
}
