package cn.fly.verify;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class bi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile bi f35857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f35858b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<bh> f35859c = new CopyOnWriteArrayList<>();

    private bi() {
    }

    public static bi a() {
        if (f35857a == null) {
            synchronized (eo.class) {
                if (f35857a == null) {
                    f35857a = new bi();
                }
            }
        }
        return f35857a;
    }

    private long c() {
        return ((Integer) gj.a(by.a(ba.a("003LflYlk"), 300), 300)).intValue() * 1000;
    }

    public <T extends bh> void a(T t10, int i10) {
        if (i10 != 1) {
            if (i10 != 3) {
                this.f35859c.add(t10);
                return;
            } else {
                this.f35859c.add(0, t10);
                return;
            }
        }
        for (bh bhVar : this.f35859c) {
            if (t10.k() == bhVar.k()) {
                this.f35859c.set(this.f35859c.indexOf(bhVar), t10);
            } else {
                this.f35859c.add(t10);
            }
        }
    }

    public void a(bh bhVar, long j10, int i10) {
        if (j10 == 0 && (i10 == 0 || i10 == 3)) {
            bhVar.h();
        } else {
            bq.a().a(j10, bhVar, i10);
        }
    }

    public void b() {
        if (this.f35858b.compareAndSet(false, true)) {
            a(new bf(), 0);
            a(new bg(), 0);
            a(new bj(), 0);
            a(new bk(), 0);
            a(new bp(), 0);
            bl blVar = new bl();
            blVar.a(true);
            a(blVar, 0);
            a(new bm(), 0);
            a(new bo(), 0);
            a(new bn(), 0);
            a(new br(), 0);
            a(new bs(), 0);
            a(new bt(), 0);
            ep.f36340c.execute(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        bq bqVarA;
        long jC;
        if (this.f35859c.size() <= 0) {
            bqVarA = bq.a();
            jC = c();
        } else if (by.d() && dt.j()) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (bh bhVar : this.f35859c) {
                    if (jCurrentTimeMillis >= bhVar.j()) {
                        bhVar.h();
                    }
                }
            } catch (Throwable unused) {
            }
            bqVarA = bq.a();
            jC = c();
        } else {
            bqVarA = bq.a();
            jC = 60000;
        }
        bqVarA.d(jC, this);
    }
}
