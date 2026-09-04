package cn.fly.verify;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class bf extends bh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile long f35829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile HashMap<Long, Long> f35830d;

    public bf() {
        super(ba.a("002fk"), 0L, ba.a("005fk)gl fl"), 900L, 0L);
        if (f35830d == null) {
            f35829c = System.currentTimeMillis();
            f35830d = bv.a().f();
        }
    }

    private void m() {
        try {
            HashMap<String, Object> map = new HashMap<>();
            for (Map.Entry<Long, Long> entry : f35830d.entrySet()) {
                if (entry != null) {
                    map.put(ba.a("008if]fiEgej,hfOk"), entry.getKey());
                    map.put(ba.a("008Xfefifl>fkXfkfm4g"), entry.getValue());
                }
            }
            a("ARSTAMT", map);
            bv.a().a(bv.f35910f, System.currentTimeMillis());
            if (f35830d != null) {
                f35830d.clear();
            }
            bv.a().a((HashMap<Long, Long>) null);
        } catch (Throwable th2) {
            es.a().b(th2);
        }
    }

    @Override // cn.fly.verify.bh
    protected void a() {
        if (f35830d == null) {
            f35830d = new HashMap<>();
        }
        for (Map.Entry<Long, Long> entry : f35830d.entrySet()) {
            if (entry != null && entry.getKey().longValue() != f35829c) {
                m();
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - f35829c;
        f35830d.put(Long.valueOf(f35829c), Long.valueOf(jCurrentTimeMillis));
        bv.a().a(f35830d);
        long jB = bv.a().b(bv.f35910f, 0L);
        long jL = l() * 1000;
        if (jCurrentTimeMillis < jL || System.currentTimeMillis() - jB <= jL) {
            return;
        }
        m();
    }

    @Override // cn.fly.verify.bh
    protected void b() {
        long jLongValue = ((Long) a(d(), 0L)).longValue();
        if (jLongValue <= 0 || jLongValue >= 604800) {
            return;
        }
        a(jLongValue);
    }
}
