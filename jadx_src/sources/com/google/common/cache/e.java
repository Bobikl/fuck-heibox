package com.google.common.cache;

import com.google.common.base.s;
import com.google.common.base.w;
import com.google.common.math.LongMath;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: CacheStats.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f57001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f57002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f57003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f57004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f57005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f57006f;

    public e(long j10, long j11, long j12, long j13, long j14, long j15) {
        w.d(j10 >= 0);
        w.d(j11 >= 0);
        w.d(j12 >= 0);
        w.d(j13 >= 0);
        w.d(j14 >= 0);
        w.d(j15 >= 0);
        this.f57001a = j10;
        this.f57002b = j11;
        this.f57003c = j12;
        this.f57004d = j13;
        this.f57005e = j14;
        this.f57006f = j15;
    }

    public double a() {
        long jX = LongMath.x(this.f57003c, this.f57004d);
        if (jX == 0) {
            return 0.0d;
        }
        return this.f57005e / jX;
    }

    public long b() {
        return this.f57006f;
    }

    public long c() {
        return this.f57001a;
    }

    public double d() {
        long jM = m();
        if (jM == 0) {
            return 1.0d;
        }
        return this.f57001a / jM;
    }

    public long e() {
        return LongMath.x(this.f57003c, this.f57004d);
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f57001a == eVar.f57001a && this.f57002b == eVar.f57002b && this.f57003c == eVar.f57003c && this.f57004d == eVar.f57004d && this.f57005e == eVar.f57005e && this.f57006f == eVar.f57006f;
    }

    public long f() {
        return this.f57004d;
    }

    public double g() {
        long jX = LongMath.x(this.f57003c, this.f57004d);
        if (jX == 0) {
            return 0.0d;
        }
        return this.f57004d / jX;
    }

    public long h() {
        return this.f57003c;
    }

    public int hashCode() {
        return s.b(Long.valueOf(this.f57001a), Long.valueOf(this.f57002b), Long.valueOf(this.f57003c), Long.valueOf(this.f57004d), Long.valueOf(this.f57005e), Long.valueOf(this.f57006f));
    }

    public e i(e eVar) {
        return new e(Math.max(0L, LongMath.A(this.f57001a, eVar.f57001a)), Math.max(0L, LongMath.A(this.f57002b, eVar.f57002b)), Math.max(0L, LongMath.A(this.f57003c, eVar.f57003c)), Math.max(0L, LongMath.A(this.f57004d, eVar.f57004d)), Math.max(0L, LongMath.A(this.f57005e, eVar.f57005e)), Math.max(0L, LongMath.A(this.f57006f, eVar.f57006f)));
    }

    public long j() {
        return this.f57002b;
    }

    public double k() {
        long jM = m();
        if (jM == 0) {
            return 0.0d;
        }
        return this.f57002b / jM;
    }

    public e l(e eVar) {
        return new e(LongMath.x(this.f57001a, eVar.f57001a), LongMath.x(this.f57002b, eVar.f57002b), LongMath.x(this.f57003c, eVar.f57003c), LongMath.x(this.f57004d, eVar.f57004d), LongMath.x(this.f57005e, eVar.f57005e), LongMath.x(this.f57006f, eVar.f57006f));
    }

    public long m() {
        return LongMath.x(this.f57001a, this.f57002b);
    }

    public long n() {
        return this.f57005e;
    }

    public String toString() {
        return com.google.common.base.q.c(this).e("hitCount", this.f57001a).e("missCount", this.f57002b).e("loadSuccessCount", this.f57003c).e("loadExceptionCount", this.f57004d).e("totalLoadTime", this.f57005e).e("evictionCount", this.f57006f).toString();
    }
}
