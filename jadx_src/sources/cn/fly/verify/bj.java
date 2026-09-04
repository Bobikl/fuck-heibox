package cn.fly.verify;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class bj extends bh {
    public bj() {
        super("l", 0L, eh.b("004f>di3ci"), 86400L, bh.a("l", (Long) 0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ArrayList<HashMap<String, Object>> arrayList) {
        try {
            a(arrayList, 2);
            a(arrayList, 1);
        } catch (Throwable th2) {
            es.a().b(th2);
        }
    }

    private void a(final ArrayList<HashMap<String, Object>> arrayList, final int i10) {
        fz.c cVarJ = fz.a(ax.g()).I().J();
        if (i10 == 1) {
            cVarJ.a(30, 0, true, false);
        } else {
            cVarJ.a(0, 15, true, false);
        }
        cVarJ.a(new fz.a() { // from class: cn.fly.verify.bj.2
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                List listI = bVar.i(new int[0]);
                if (listI == null || listI.isEmpty()) {
                    return;
                }
                List<HashMap<String, Object>> listA = bj.this.a(listI);
                if (listA != null && !listA.isEmpty()) {
                    for (HashMap<String, Object> map : listA) {
                        if (map != null && !map.isEmpty()) {
                            bj.this.a(map, map);
                            String strH = bVar.H();
                            String strI = bVar.I();
                            if (!TextUtils.isEmpty(strI)) {
                                map.put("cbsmt", strI);
                            }
                            if (!TextUtils.isEmpty(strH)) {
                                map.put("cssmt", strH);
                            }
                            map.put("pt", bj.this.g() ? 1 : 2);
                            map.put("lctpmt", Integer.valueOf(i10));
                            ArrayList arrayList2 = arrayList;
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                map.put("wilmt", arrayList);
                            }
                            bj.this.a("LCMT", map);
                        }
                    }
                }
                if (i10 == 1) {
                    gr.a().a(listI.get(listI.size() - 1));
                }
            }
        });
    }

    @Override // cn.fly.verify.bh
    protected void a() throws Throwable {
        long jB = bv.a().b("key_lgwst", 0L);
        if (fz.d.b(eh.b("036cd?cbcicjchcbck6ieVcicechehehchcjTdPckdcejecdfhcfhcgfeddfbddcgdkebecebfh")) && fz.d.b(eh.b("036cd9cbcicjchcbckUie!cicechehehchcj7d-ckecdcdcfhdkdkcgfeddfbddcgdkebecebfh")) && System.currentTimeMillis() - jB >= 1800000) {
            el.a(new gq<ArrayList<HashMap<String, Object>>>() { // from class: cn.fly.verify.bj.1
                @Override // cn.fly.verify.gq
                public void a(ArrayList<HashMap<String, Object>> arrayList) {
                    bv.a().a("key_lgwst", System.currentTimeMillis());
                    bj.this.a(arrayList);
                }
            });
        } else {
            a((ArrayList<HashMap<String, Object>>) null);
        }
    }
}
