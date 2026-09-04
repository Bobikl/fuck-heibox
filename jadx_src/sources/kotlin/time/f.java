package kotlin.time;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DurationJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f128633a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ThreadLocal<DecimalFormat>[] f128634b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f128634b = threadLocalArr;
    }

    private static final DecimalFormat a(int i10) {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        if (i10 > 0) {
            decimalFormat.setMinimumFractionDigits(i10);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @dl.d
    public static final String b(double d10, int i10) {
        DecimalFormat decimalFormatA;
        ThreadLocal<DecimalFormat>[] threadLocalArr = f128634b;
        if (i10 < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i10];
            DecimalFormat decimalFormatA2 = threadLocal.get();
            if (decimalFormatA2 == null) {
                decimalFormatA2 = a(i10);
                threadLocal.set(decimalFormatA2);
            } else {
                f0.o(decimalFormatA2, "get() ?: default().also(this::set)");
            }
            decimalFormatA = decimalFormatA2;
        } else {
            decimalFormatA = a(i10);
        }
        String str = decimalFormatA.format(d10);
        f0.o(str, "format.format(value)");
        return str;
    }

    @dl.d
    public static final String c(double d10, int i10) {
        DecimalFormat decimalFormatA = a(0);
        decimalFormatA.setMaximumFractionDigits(i10);
        String str = decimalFormatA.format(d10);
        f0.o(str, "createFormatForDecimals(… }\n        .format(value)");
        return str;
    }

    public static final boolean d() {
        return f128633a;
    }
}
