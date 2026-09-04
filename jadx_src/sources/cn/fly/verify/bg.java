package cn.fly.verify;

import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class bg extends bh {
    public bg() {
        super(ec.a("002Bdddg"), 0L, ec.a("005Sdddgch3bh"), 86400L, bh.a(ec.a("002Bdddg"), (Long) 0L));
    }

    private void m() {
        fz.c cVarL = fz.a(ax.g()).d().e().L();
        final int i10 = Build.VERSION.SDK_INT;
        cVarL.M().a(new fz.a() { // from class: cn.fly.verify.bg.1
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                int i11;
                HashMap<String, Object> map;
                int iIntValue;
                int i12;
                int iIntValue2;
                int iIntValue3;
                long j10;
                int i13;
                int i14;
                int iIntValue4;
                int i15;
                try {
                    i11 = Integer.parseInt(bVar.d());
                } catch (Throwable unused) {
                    i11 = -1;
                }
                HashMap map2 = null;
                if (i10 >= 17 && bVar.L() != null && !bVar.L().isEmpty()) {
                    ArrayList<HashMap<String, Object>> arrayListL = bVar.L();
                    HashMap<String, Object> map3 = new HashMap<>();
                    map3.put("bsd", arrayListL);
                    HashMap<String, Object> map4 = arrayListL.get(0);
                    HashMap map5 = new HashMap();
                    if (((Integer) map4.get(ec.a("004g:ca:hd"))).intValue() == 2) {
                        map5.put(ec.a("016_cbbabdGbRcbQdee$dcbi^abgSbgbiFc"), 1);
                        map5.put(ec.a("003!ddbgba"), map4.get(ec.a("004adee")));
                        map5.put(ec.a("003Udgbgba"), map4.get(ec.a("003Udgbgba")));
                        map5.put(ec.a("003c5bgba"), map4.get(ec.a("003c5bgba")));
                        map5.put(ec.a("003ebg"), map4.get(ec.a("003ebg")));
                        map5.put(ec.a("003e bi7c"), map4.get(ec.a("003e bi7c")));
                    } else {
                        map5.put(ec.a("0162cbbabd9b;cbHdeeMdcbi3abg?bgbi c"), -1);
                        map5.put(ec.a("003hOdg[a"), map4.get(ec.a("003hOdg[a")));
                        map5.put(ec.a("003eba"), map4.get(ec.a("003eba")));
                        map5.put(ec.a("004adee"), map4.get(ec.a("004adee")));
                    }
                    map = map3;
                    map2 = map5;
                } else if (bVar.n() != null) {
                    map2 = (HashMap) bVar.n();
                    map = null;
                } else {
                    map = null;
                }
                if (map2 != null) {
                    if (((Integer) gj.a(map2.get(ec.a("016Zcbbabd4bQcbPdeeAdcbiIabgJbgbi+c")), -1)).intValue() == 1) {
                        int iIntValue5 = ((Integer) gj.a(map2.get(ec.a("003ebg")), -1)).intValue();
                        int iIntValue6 = ((Integer) gj.a(map2.get(ec.a("003e8biFc")), -1)).intValue();
                        j10 = -1;
                        iIntValue2 = ((Integer) gj.a(map2.get(ec.a("003Tddbgba")), -1)).intValue();
                        iIntValue3 = ((Integer) gj.a(map2.get(ec.a("003;dgbgba")), -1)).intValue();
                        i14 = -1;
                        i13 = iIntValue6;
                        iIntValue4 = ((Integer) gj.a(map2.get(ec.a("003c)bgba")), -1)).intValue();
                        i12 = iIntValue5;
                        iIntValue = -1;
                    } else {
                        iIntValue = ((Integer) gj.a(map2.get(ec.a("003hYdg0a")), -1)).intValue();
                        int iIntValue7 = ((Integer) gj.a(map2.get(ec.a("003eba")), -1)).intValue();
                        long jLongValue = ((Long) gj.a(map2.get(ec.a("004adee")), -1L)).longValue();
                        i12 = -1;
                        iIntValue2 = -1;
                        iIntValue3 = -1;
                        j10 = jLongValue;
                        i13 = -1;
                        i14 = iIntValue7;
                        iIntValue4 = -1;
                    }
                    if (i11 != -1 && i14 != -1 && j10 != -1) {
                        if (map == null) {
                            map = new HashMap<>();
                        }
                        map.put(ec.a("003eba"), Integer.valueOf(i14));
                        map.put(ec.a("004adee"), Long.valueOf(j10));
                        if (iIntValue != -1) {
                            map.put(ec.a("003hDdg:a"), Integer.valueOf(iIntValue));
                        }
                    }
                    if (i11 != -1 && iIntValue2 != -1 && (i15 = iIntValue3) != -1 && iIntValue4 != -1) {
                        if (map == null) {
                            map = new HashMap<>();
                        }
                        map.put(ec.a("003Bddbgba"), Integer.valueOf(iIntValue2));
                        map.put(ec.a("003Gdgbgba"), Integer.valueOf(i15));
                        map.put(ec.a("003cQbgba"), Integer.valueOf(iIntValue4));
                        if (i12 != -1) {
                            map.put(ec.a("003ebg"), Integer.valueOf(i12));
                        }
                        if (i13 != -1) {
                            map.put(ec.a("003e>bi0c"), Integer.valueOf(i13));
                        }
                    }
                    if (map != null) {
                        map.put(ec.a("007abRbhbhbgGdRbh"), Integer.valueOf(i11));
                        map.put(ec.a("009?dgbgbdbi;hcbObdZd"), bVar.e());
                        ArrayList<HashMap<String, Object>> arrayListK = bVar.K();
                        if (arrayListK != null && arrayListK.size() > 0) {
                            map.put(ec.a("006cdb*bhddca"), arrayListK);
                        }
                        bg.this.a("BSIOMT", map, true);
                    }
                }
            }
        });
    }

    @Override // cn.fly.verify.bh
    protected void a() {
        m();
    }
}
