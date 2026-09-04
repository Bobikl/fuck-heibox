package cn.fly.verify;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class bk extends bh {

    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static volatile a f35865d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f35866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f35867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AtomicInteger f35868c = new AtomicInteger(0);

        private a() {
            gr.a().a(new gr.a() { // from class: cn.fly.verify.bk.a.1
                @Override // cn.fly.verify.gr.a
                public void a() {
                    if (by.c()) {
                        if (System.currentTimeMillis() - a.this.f35866a >= ((Integer) by.a("gpdi", 120)).intValue() * 1000) {
                            es.a().a("[cl] tme > ", new Object[0]);
                            a.this.b();
                            a.this.f35866a = System.currentTimeMillis();
                        }
                        a.this.c();
                    }
                }
            });
        }

        public static a a() {
            if (f35865d == null) {
                synchronized (a.class) {
                    if (f35865d == null) {
                        f35865d = new a();
                    }
                }
            }
            return f35865d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.f35868c.getAndSet(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            if (this.f35868c.get() >= 3 || System.currentTimeMillis() - this.f35867b < ((Integer) by.a("gpdi", 120)).intValue() * 1000) {
                return;
            }
            d();
        }

        private void d() {
            Object objC = gr.a().c();
            this.f35868c.getAndIncrement();
            this.f35867b = System.currentTimeMillis();
            Object objB = gr.a().b();
            float fA = 0.0f;
            if (objC != null && objB != null) {
                try {
                    fA = new fh.a(objC).a(objB);
                } catch (Throwable th2) {
                    es.a().a(th2);
                    return;
                }
            }
            if (objC != null) {
                if (objB == null || fA > ((Float) by.a("gped", Float.valueOf(10.0f))).floatValue()) {
                    es.a().a("[cl] cur != las", new Object[0]);
                    gr.a().a(objC);
                    bk bkVar = new bk();
                    bkVar.a(true).a(objC).b(false);
                    bi.a().a(bkVar, 0L, 0);
                }
            }
        }
    }

    public bk() {
        super(ba.a("002,fm1i"), 0L, ba.a("006Rfm)iWglTflj"), 60L, bh.a(ba.a("002,fm1i"), (Long) 0L));
    }

    private void m() {
        fz.a(ax.g()).a(0, 0, true, false).J().I().a(new fz.a() { // from class: cn.fly.verify.bk.1
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                List<HashMap<String, Object>> listA;
                JSONObject jSONObject;
                if (bVar.i(new int[0]) == null || bVar.i(new int[0]).isEmpty() || (listA = bk.this.a(bVar.i(new int[0]))) == null || listA.isEmpty()) {
                    return;
                }
                int i10 = 1;
                HashMap<String, Object> map = listA.get(listA.size() - 1);
                if (map == null || map.isEmpty()) {
                    return;
                }
                bk.this.a(map, map);
                HashMap map2 = map.get("nl") != null ? (HashMap) map.get("nl") : null;
                String strH = bVar.H();
                String strI = bVar.I();
                if (!TextUtils.isEmpty(strI)) {
                    map.put("cbsmt", strI);
                }
                if (!TextUtils.isEmpty(strH)) {
                    map.put("cssmt", strH);
                }
                if (map2 == null || map2.isEmpty()) {
                    jSONObject = new JSONObject(bk.this.b(bVar.i(new int[0]).get(listA.size() - 1)));
                } else {
                    TreeMap treeMap = new TreeMap();
                    treeMap.put("ltdmt", map2.get("ltdmt"));
                    treeMap.put("lndmt", map2.get("lndmt"));
                    jSONObject = new JSONObject(treeMap);
                }
                String strB = ga.b(jSONObject.toString());
                bv bvVarA = bv.a();
                String str = bv.f35911g;
                String strB2 = bvVarA.b(str, (String) null);
                bv bvVarA2 = bv.a();
                String str2 = bv.f35912h;
                long jB = bvVarA2.b(str2, 0L);
                long jLongValue = ((Long) bk.this.a(ba.a("006MfmAiEglUfli"), 3600L)).longValue() * 1000;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (TextUtils.isEmpty(strB2) || !strB2.equals(strB) || jCurrentTimeMillis - jB >= jLongValue) {
                    if (!bk.this.g()) {
                        i10 = jCurrentTimeMillis - jB >= jLongValue ? 2 : 3;
                    }
                    map.put("pt", Integer.valueOf(i10));
                    if (map2 != null && !map2.isEmpty()) {
                        map2.put("pt", Integer.valueOf(i10));
                    }
                    bk.this.a("O_LCMT", map);
                    bv.a().a(str, strB);
                    bv.a().a(str2, jCurrentTimeMillis);
                }
            }
        });
    }

    @Override // cn.fly.verify.bh
    protected void a() {
        HashMap<String, Object> map;
        if (this.f35835b == null) {
            m();
            return;
        }
        es.a().a("[cl] paramObj not null", new Object[0]);
        Object obj = this.f35835b;
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        List<HashMap<String, Object>> listA = a((List) arrayList);
        if (listA == null || listA.isEmpty() || (map = listA.get(listA.size() - 1)) == null || map.isEmpty()) {
            return;
        }
        map.put("pt", 4);
        a("O_LCMT", map);
    }

    @Override // cn.fly.verify.bh
    protected void c() {
        a.a();
    }
}
