package cn.fly.verify;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class bl extends bh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ea f35870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f35871d = eh.b("0142dg9eSdbcg@cbhCchcc(e!cg6f%cjdi");

    public bl() {
        super(eh.b("002Keech"), 0L, eh.b("005JeechdiJci"), 30L, 0L);
    }

    private void a(long j10, long j11) {
        try {
            bv bvVarA = bv.a();
            String str = f35871d;
            HashMap map = (HashMap) bvVarA.c(str, null);
            if (map == null) {
                map = new HashMap();
            }
            map.put(Long.valueOf(j10), Long.valueOf(j11));
            bv.a().b(str, map);
        } catch (Throwable th2) {
            es.a().b(th2);
        }
    }

    private void b(long j10) {
        if (ba.a().b()) {
            return;
        }
        bl blVar = new bl();
        blVar.a(true).b(false).a(new Long[]{3L, Long.valueOf(j10)});
        bi.a().a(blVar, l(), 0);
    }

    private void m() {
        try {
            HashMap map = (HashMap) bv.a().c(f35871d, null);
            if (map == null || map.isEmpty()) {
                return;
            }
            for (Map.Entry entry : map.entrySet()) {
                long jLongValue = ((Long) entry.getKey()).longValue();
                long jLongValue2 = ((Long) entry.getValue()).longValue();
                HashMap<String, Object> map2 = new HashMap<>();
                map2.put(eh.b("005]cf<dh2chCf"), Long.valueOf(jLongValue2));
                map2.put(eh.b("008ScicfBdh)chce$e,eh"), Long.valueOf(jLongValue2 - jLongValue));
                a("BKIOMT", map2);
            }
            bv.a().b(f35871d);
        } catch (Throwable th2) {
            es.a().b(th2);
        }
    }

    private static synchronized boolean n() {
        boolean z10;
        if (f35870c == null) {
            f35870c = new ea() { // from class: cn.fly.verify.bl.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private volatile long f35872a = 0;

                @Override // cn.fly.verify.ea
                public void a(boolean z11, boolean z12, long j10) {
                    if (z12) {
                        this.f35872a = System.currentTimeMillis();
                        bh blVar = new bl();
                        blVar.a(new Long[]{0L, Long.valueOf(this.f35872a), Long.valueOf(System.currentTimeMillis())}).b(false).a(true);
                        bi.a().a(blVar, 0L, 1);
                    }
                    if (!z11) {
                        if (j10 > 0) {
                            bh blVar2 = new bl();
                            blVar2.a(new Long[]{2L, Long.valueOf(this.f35872a), Long.valueOf(System.currentTimeMillis())}).b(false).a(true);
                            bi.a().a(blVar2, 0L, 1);
                            return;
                        }
                        return;
                    }
                    if (z12) {
                        return;
                    }
                    this.f35872a = System.currentTimeMillis();
                    bh blVar3 = new bl();
                    blVar3.a(new Long[]{1L, Long.valueOf(this.f35872a), Long.valueOf(System.currentTimeMillis())}).b(false).a(true);
                    bi.a().a(blVar3, 0L, 0);
                }
            };
            ba.a().a(f35870c);
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
        Long[] lArr = (Long[]) this.f35835b;
        long jLongValue = lArr[0].longValue();
        long jLongValue2 = lArr[1].longValue();
        long jLongValue3 = (jLongValue != 3 || lArr.length >= 3) ? lArr[2].longValue() : System.currentTimeMillis();
        if (jLongValue == 0) {
            m();
        } else if (jLongValue != 1 && jLongValue != 3) {
            if (jLongValue == 2) {
                a(jLongValue2, jLongValue3);
                m();
                return;
            }
            return;
        }
        a(jLongValue2, jLongValue3);
        b(jLongValue2);
    }

    @Override // cn.fly.verify.bh
    protected void c() {
        n();
    }
}
