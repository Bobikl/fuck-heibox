package kotlin.time;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.jvm.internal.f0;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: DurationUnit.kt */
/* JADX INFO: loaded from: classes5.dex */
public class j extends i {

    /* JADX INFO: compiled from: DurationUnit.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128640a;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f128640a = iArr;
        }
    }

    @u0(version = s0.f136928s)
    @dl.d
    public static final DurationUnit f(char c10, boolean z10) {
        if (!z10) {
            if (c10 == 'D') {
                return DurationUnit.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c10);
        }
        if (c10 == 'H') {
            return DurationUnit.HOURS;
        }
        if (c10 == 'M') {
            return DurationUnit.MINUTES;
        }
        if (c10 == 'S') {
            return DurationUnit.SECONDS;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c10);
    }

    @u0(version = s0.f136928s)
    @dl.d
    public static final DurationUnit g(@dl.d String shortName) {
        f0.p(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return DurationUnit.MICROSECONDS;
                                }
                            } else if (shortName.equals("ns")) {
                                return DurationUnit.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return DurationUnit.MILLISECONDS;
                        }
                    } else if (shortName.equals(ak.aB)) {
                        return DurationUnit.SECONDS;
                    }
                } else if (shortName.equals("m")) {
                    return DurationUnit.MINUTES;
                }
            } else if (shortName.equals(RXScreenCaptureService.KEY_HEIGHT)) {
                return DurationUnit.HOURS;
            }
        } else if (shortName.equals("d")) {
            return DurationUnit.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }

    @u0(version = "1.3")
    @dl.d
    public static final String h(@dl.d DurationUnit durationUnit) {
        f0.p(durationUnit, "<this>");
        switch (a.f128640a[durationUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return ak.aB;
            case 5:
                return "m";
            case 6:
                return RXScreenCaptureService.KEY_HEIGHT;
            case 7:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + durationUnit).toString());
        }
    }
}
