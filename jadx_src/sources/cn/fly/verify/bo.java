package cn.fly.verify;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class bo extends bh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ea f35876c;

    public bo() {
        super("p", 0L, null, 0L, 0L);
        a(0);
    }

    private static synchronized boolean m() {
        boolean z10;
        if (f35876c == null) {
            f35876c = new ea() { // from class: cn.fly.verify.bo.1
                @Override // cn.fly.verify.ea
                public void a(boolean z11, boolean z12, long j10) {
                    if (z11) {
                        bo boVar = new bo();
                        boVar.b(false).a(Long.valueOf(System.currentTimeMillis())).a(true);
                        bi.a().a(boVar, 0L, 0);
                    }
                }
            };
            ba.a().a(f35876c);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    @Override // cn.fly.verify.bh
    protected void a() {
        if (g()) {
            return;
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put(ei.a("004iDecOjf"), "PVMT");
        map.put(ei.a("008]dc?difiKdidfTf"), this.f35835b);
        if (!dz.a().f36207a.get()) {
            map.putAll(dz.a().c());
            dz.a().f36207a.compareAndSet(false, true);
        }
        cr.a().a(System.currentTimeMillis(), map);
    }

    @Override // cn.fly.verify.bh
    protected void c() {
        m();
    }
}
