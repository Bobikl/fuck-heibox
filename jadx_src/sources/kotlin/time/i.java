package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: DurationUnitJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: compiled from: DurationUnitJvm.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128639a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f128639a = iArr;
        }
    }

    @u0(version = "1.3")
    public static final double a(double d10, @dl.d DurationUnit sourceUnit, @dl.d DurationUnit targetUnit) {
        f0.p(sourceUnit, "sourceUnit");
        f0.p(targetUnit, "targetUnit");
        long jConvert = targetUnit.getTimeUnit$kotlin_stdlib().convert(1L, sourceUnit.getTimeUnit$kotlin_stdlib());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.getTimeUnit$kotlin_stdlib().convert(1L, targetUnit.getTimeUnit$kotlin_stdlib());
    }

    @u0(version = s0.f136928s)
    public static final long b(long j10, @dl.d DurationUnit sourceUnit, @dl.d DurationUnit targetUnit) {
        f0.p(sourceUnit, "sourceUnit");
        f0.p(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j10, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    @u0(version = s0.f136928s)
    public static final long c(long j10, @dl.d DurationUnit sourceUnit, @dl.d DurationUnit targetUnit) {
        f0.p(sourceUnit, "sourceUnit");
        f0.p(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j10, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    @u0(version = s0.f136934y)
    @dl.d
    @e2(markerClass = {k.class})
    public static final DurationUnit d(@dl.d TimeUnit timeUnit) {
        f0.p(timeUnit, "<this>");
        switch (a.f128639a[timeUnit.ordinal()]) {
            case 1:
                return DurationUnit.NANOSECONDS;
            case 2:
                return DurationUnit.MICROSECONDS;
            case 3:
                return DurationUnit.MILLISECONDS;
            case 4:
                return DurationUnit.SECONDS;
            case 5:
                return DurationUnit.MINUTES;
            case 6:
                return DurationUnit.HOURS;
            case 7:
                return DurationUnit.DAYS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @u0(version = s0.f136934y)
    @dl.d
    @e2(markerClass = {k.class})
    public static final TimeUnit e(@dl.d DurationUnit durationUnit) {
        f0.p(durationUnit, "<this>");
        return durationUnit.getTimeUnit$kotlin_stdlib();
    }
}
