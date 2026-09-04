package cn.fly.verify;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class bt extends bh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f35894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile AtomicInteger f35895d;

    public bt() {
        super(ba.a("002JhiCi"), 0L, ba.a("004Lhi'i7hkfl"), 300L, bh.a(ba.a("002JhiCi"), (Long) 0L));
        this.f35894c = 0L;
        this.f35895d = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.f35894c = System.currentTimeMillis();
        el.a(new gq<ArrayList<HashMap<String, Object>>>() { // from class: cn.fly.verify.bt.2
            @Override // cn.fly.verify.gq
            public void a(ArrayList<HashMap<String, Object>> arrayList) {
                if (arrayList != null) {
                    try {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<HashMap<String, Object>> it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object obj = it.next().get(ba.a("005)hlgngngghn"));
                            if (obj != null) {
                                arrayList2.add(String.valueOf(obj));
                            }
                        }
                        Collections.sort(arrayList2);
                        String strB = ga.b(TextUtils.join("", arrayList2));
                        bv bvVarA = bv.a();
                        String str = bv.f35914j;
                        String strB2 = bvVarA.b(str, (String) null);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        bv bvVarA2 = bv.a();
                        String str2 = bv.f35915k;
                        long jB = bvVarA2.b(str2, 0L);
                        long jIntValue = ((Integer) bt.this.a(ba.a("005:hi,iKgl-fl"), Integer.valueOf(bb.c.g.Rc))).intValue() * 1000;
                        if (strB2 == null || !strB2.equals(strB) || jCurrentTimeMillis - jIntValue >= jB) {
                            bt.this.a(0L, "WLMT", (Object) arrayList, true);
                            bv.a().a(str, strB);
                            bv.a().a(str2, jCurrentTimeMillis);
                        }
                    } catch (Throwable th2) {
                        es.a().b(th2);
                    }
                }
            }
        });
    }

    @Override // cn.fly.verify.bh
    protected void a() {
        Object obj = this.f35835b;
        if (obj != null && (obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            this.f35895d.set(0);
        }
        m();
    }

    @Override // cn.fly.verify.bh
    protected void c() {
        gw.a().a(getClass().getName(), new gw.a() { // from class: cn.fly.verify.bt.1
            @Override // cn.fly.verify.gw.a
            public void a() {
                if (bt.this.e()) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis() - bt.this.f35894c;
                        long jIntValue = ((Integer) by.a("wsct", 300)).intValue() * 1000;
                        if (jCurrentTimeMillis >= jIntValue) {
                            bt.this.m();
                        } else if (bt.this.f35895d.get() == 0) {
                            bt.this.f35895d.getAndSet(1);
                            bt btVar = new bt();
                            btVar.a(Boolean.TRUE).a(true);
                            bi.a().a(btVar, (jIntValue - jCurrentTimeMillis) / 1000, 0);
                        }
                    } catch (Throwable th2) {
                        es.a().a(th2);
                    }
                }
            }
        });
    }
}
