package cn.fly.verify;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class bs extends bh {
    public bs() {
        super(ba.a("002Thifk"), 0L, ba.a("005Fhifkgl,fl"), 3600L, bh.a(ba.a("002Thifk"), (Long) 0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        fz.a(ax.g()).G().H().a(new fz.a() { // from class: cn.fly.verify.bs.2
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                HashMap<String, Object> map = new HashMap<>();
                HashMap<String, Object> mapF = bVar.F();
                if (mapF == null) {
                    return;
                }
                String str = (String) mapF.get("bsmt");
                String str2 = (String) mapF.get("ssmt");
                if (!TextUtils.isEmpty(str)) {
                    ArrayList<HashMap<String, Object>> arrayListG = bVar.G();
                    if (arrayListG != null && !arrayListG.isEmpty()) {
                        for (HashMap<String, Object> map2 : arrayListG) {
                            Object obj = map2.get(ba.a("0057hlgngngghn"));
                            if (obj != null && String.valueOf(obj).equals(str)) {
                                map.putAll(map2);
                                break;
                            }
                        }
                        map.remove(ba.a("005Nhlgngngghn"));
                        map.remove(ba.a("0044gngngghn"));
                    }
                } else if (TextUtils.isEmpty(str2) || ba.a("014.kgfi5gYgj'g7fmhi)gOkhhkhkfkfeki").equalsIgnoreCase(str2)) {
                    return;
                }
                map.putAll(mapF);
                map.put("ssmt", str2);
                map.put("bsmt", str);
                bs.this.a("WIMT", map, true);
                TreeMap treeMap = new TreeMap();
                treeMap.put("ssmt", str2);
                treeMap.put("bsmt", str);
                bv.a().a(bv.f35913i, ga.b(new JSONObject(treeMap).toString()));
            }
        });
    }

    @Override // cn.fly.verify.bh
    protected void a() {
        m();
    }

    @Override // cn.fly.verify.bh
    protected void c() {
        gw.a().a(getClass().getName(), new gw.a() { // from class: cn.fly.verify.bs.1
            @Override // cn.fly.verify.gw.a
            public void a() {
                if (bs.this.e()) {
                    bs.this.m();
                }
            }
        });
    }
}
