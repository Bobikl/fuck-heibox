package cn.fly.verify;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class bn extends bh {
    public bn() {
        super(bq.a("0031gjfdgj"), 0L, bq.a("006=gjfdgjfkIek"), 2592000L, bh.a(bq.a("0031gjfdgj"), (Long) 0L));
    }

    @Override // cn.fly.verify.bh
    protected void a() {
        fz.a(ax.g()).k().a(new fz.a() { // from class: cn.fly.verify.bn.1
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                boolean z10;
                ArrayList<HashMap<String, String>> arrayListK = bVar.k();
                if (arrayListK == null || arrayListK.isEmpty()) {
                    return;
                }
                long jB = bv.a().b(bv.f35908d, 0L);
                long jL = bn.this.l() * 1000;
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z11 = jCurrentTimeMillis - jL >= jB;
                if (!z11) {
                    ArrayList<HashMap<String, String>> arrayListA = gj.a(ec.f36238e, true);
                    Iterator<HashMap<String, String>> it = arrayListK.iterator();
                    while (it.hasNext()) {
                        String str = it.next().get(bq.a("003k.fifk"));
                        if (!TextUtils.isEmpty(str)) {
                            Iterator<HashMap<String, String>> it2 = arrayListA.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z10 = false;
                                    break;
                                } else if (str.equals(it2.next().get(bq.a("003kGfifk")))) {
                                    z10 = true;
                                    break;
                                }
                            }
                            if (!z10) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                }
                if (z11) {
                    bn.this.a(0L, "SALMT", arrayListK);
                    gj.a(arrayListK, ec.f36238e, true);
                    bv.a().a(bv.f35908d, jCurrentTimeMillis);
                }
            }
        });
    }
}
