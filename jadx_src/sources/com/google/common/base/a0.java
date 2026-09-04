package com.google.common.base;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Stopwatch.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@g
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f56674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f56675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f56676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f56677d;

    /* JADX INFO: compiled from: Stopwatch.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56678a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f56678a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56678a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56678a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56678a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56678a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56678a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56678a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    a0() {
        this.f56674a = e0.b();
    }

    a0(e0 e0Var) {
        this.f56674a = (e0) w.F(e0Var, RemoteMessageConst.Notification.TICKER);
    }

    private static String a(TimeUnit timeUnit) {
        switch (a.f56678a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return ak.aB;
            case 5:
                return org.apache.tools.ant.types.selectors.o.f136588l;
            case 6:
                return RXScreenCaptureService.KEY_HEIGHT;
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    private static TimeUnit b(long j10) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j10, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j10, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j10, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j10, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j10, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j10, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    public static a0 c() {
        return new a0().k();
    }

    public static a0 d(e0 e0Var) {
        return new a0(e0Var).k();
    }

    public static a0 e() {
        return new a0();
    }

    public static a0 f(e0 e0Var) {
        return new a0(e0Var);
    }

    private long h() {
        return this.f56675b ? (this.f56674a.a() - this.f56677d) + this.f56676c : this.f56676c;
    }

    public long g(TimeUnit timeUnit) {
        return timeUnit.convert(h(), TimeUnit.NANOSECONDS);
    }

    public boolean i() {
        return this.f56675b;
    }

    @s9.a
    public a0 j() {
        this.f56676c = 0L;
        this.f56675b = false;
        return this;
    }

    @s9.a
    public a0 k() {
        w.h0(!this.f56675b, "This stopwatch is already running.");
        this.f56675b = true;
        this.f56677d = this.f56674a.a();
        return this;
    }

    @s9.a
    public a0 l() {
        long jA = this.f56674a.a();
        w.h0(this.f56675b, "This stopwatch is already stopped.");
        this.f56675b = false;
        this.f56676c += jA - this.f56677d;
        return this;
    }

    public String toString() {
        long jH = h();
        TimeUnit timeUnitB = b(jH);
        String strD = v.d(jH / TimeUnit.NANOSECONDS.convert(1L, timeUnitB));
        String strA = a(timeUnitB);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strD).length() + 1 + String.valueOf(strA).length());
        sb2.append(strD);
        sb2.append(" ");
        sb2.append(strA);
        return sb2.toString();
    }
}
