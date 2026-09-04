package io.reactivex.schedulers;

import java.util.concurrent.TimeUnit;
import jh.e;

/* JADX INFO: compiled from: Timed.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final T f124066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f124067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f124068c;

    public d(@e T t10, long j10, @e TimeUnit timeUnit) {
        this.f124066a = t10;
        this.f124067b = j10;
        this.f124068c = (TimeUnit) io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
    }

    public long a() {
        return this.f124067b;
    }

    public long b(@e TimeUnit timeUnit) {
        return timeUnit.convert(this.f124067b, this.f124068c);
    }

    @e
    public TimeUnit c() {
        return this.f124068c;
    }

    @e
    public T d() {
        return this.f124066a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return io.reactivex.internal.functions.a.c(this.f124066a, dVar.f124066a) && this.f124067b == dVar.f124067b && io.reactivex.internal.functions.a.c(this.f124068c, dVar.f124068c);
    }

    public int hashCode() {
        T t10 = this.f124066a;
        int iHashCode = t10 != null ? t10.hashCode() : 0;
        long j10 = this.f124067b;
        return (((iHashCode * 31) + ((int) (j10 ^ (j10 >>> 31)))) * 31) + this.f124068c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.f124067b + ", unit=" + this.f124068c + ", value=" + this.f124066a + "]";
    }
}
