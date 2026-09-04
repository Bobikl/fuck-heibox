package com.igexin.push.core;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static h f63744d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f63745a = x9.a.f141108j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f63746b = k.DETECT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f63747c = 0;

    private h() {
    }

    public static h a() {
        if (f63744d == null) {
            f63744d = new h();
        }
        return f63744d;
    }

    private void b(j jVar) {
        k kVar;
        int i10 = i.f63749b[jVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                long j10 = this.f63747c + 1;
                this.f63747c = j10;
                if (j10 < 2) {
                    return;
                }
                a(Math.max(this.f63745a - 60000, x9.a.f141108j));
                kVar = k.STABLE;
            } else if (i10 != 4) {
                return;
            } else {
                a(x9.a.f141108j);
            }
            a(kVar);
        }
        a(Math.min(this.f63745a + 60000, 420000L));
        kVar = k.DETECT;
        a(kVar);
    }

    private void c(j jVar) {
        k kVar;
        int i10 = i.f63749b[jVar.ordinal()];
        if (i10 == 1) {
            kVar = k.STABLE;
        } else if (i10 == 2 || i10 == 3) {
            a(Math.max(this.f63745a - 60000, x9.a.f141108j));
            long j10 = this.f63747c + 1;
            this.f63747c = j10;
            if (j10 < 2) {
                return;
            }
            a(x9.a.f141108j);
            kVar = k.PENDING;
        } else {
            if (i10 != 4) {
                return;
            }
            a(x9.a.f141108j);
            kVar = k.DETECT;
        }
        a(kVar);
    }

    private void d(j jVar) {
        k kVar;
        int i10 = i.f63749b[jVar.ordinal()];
        if (i10 == 1) {
            a(x9.a.f141108j);
            kVar = k.DETECT;
        } else if (i10 == 2 || i10 == 3) {
            kVar = k.PENDING;
        } else {
            if (i10 != 4) {
                return;
            }
            a(x9.a.f141108j);
            kVar = k.DETECT;
        }
        a(kVar);
    }

    public void a(long j10) {
        this.f63745a = j10;
    }

    public void a(j jVar) {
        int i10 = i.f63748a[this.f63746b.ordinal()];
        if (i10 == 1) {
            b(jVar);
        } else if (i10 == 2) {
            c(jVar);
        } else {
            if (i10 != 3) {
                return;
            }
            d(jVar);
        }
    }

    public void a(k kVar) {
        this.f63746b = kVar;
        this.f63747c = 0L;
    }

    public long b() {
        long j10 = this.f63745a;
        int i10 = com.igexin.push.config.l.f63426d;
        if (i10 > 0) {
            j10 = i10 * 1000;
        }
        if (d.f63673g && d.f63678l && c.a().i().a()) {
            return j10;
        }
        return 3600000L;
    }
}
