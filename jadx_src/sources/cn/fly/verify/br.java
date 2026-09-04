package cn.fly.verify;

import android.content.pm.ApplicationInfo;
import android.util.Base64;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class br extends bh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35886c = ei.a("0169fefdelfcdhekglfeghfdfldhfceehcgi");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f35887d = ei.a("016Lfefdelfcdhgcfdeefegifldhflfdfcfd");

    public br() {
        super(ei.a("002jg"), 0L, ei.a("005jg-ejNdj"), 86400L, bh.a(ei.a("002jg"), (Long) 0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object b(HashMap<String, Object> map) {
        try {
            map.put(ei.a("005cjgXfd,i"), Long.valueOf(System.currentTimeMillis()));
            return b(map, dy.a().a("gclg") + ei.a("004lcjg"));
        } catch (Throwable th2) {
            es.a().b(th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object b(HashMap<String, Object> map, String str) throws Throwable {
        if (!by.c()) {
            return null;
        }
        return new ft(1024, "009cbd92ccef123be840deec0c6ed0547194c1e471d11b6f375e56038458fb18833e5bab2e1206b261495d7e2d1d9e5aa859e6d4b67" + ei.a("023*hfJd3hdVcdIhidcikhd f2ef8fKdc3fIhlhd5f,hehjhf8d%jfef"), "1dfd1d615cb891ce9a76f42d036af7fce5f8b8efaa11b2f42590ecc4ea4cff28f5f6b0726aeb76254ab5b02a58c1d5b486c39d9da1a58fa6ba2f22196493b3a4cbc283dcf749bf63679ee24d185de70c8dfe05605886c9b53e9f569082eabdf98c4fb0dcf07eb9bb3e647903489ff0b5d933bd004af5be4a1022fdda41f347f1").a(map, str, false);
    }

    private void n() {
        fz.a(ax.g()).h().a(new fz.a() { // from class: cn.fly.verify.br.1
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) throws Throwable {
                final List list;
                HashMap<String, Object> map = new HashMap<>();
                String strA = ek.a();
                String strA2 = du.a((bd) null);
                map.put(ei.a("006djj!ehFf(ec"), strA);
                map.put(ei.a("006djjjHehej"), fz.d.c());
                map.put(ei.a("006djjXdd!f=dj"), Integer.valueOf(fz.d.m()));
                map.put(ei.a("0040dcdgdidc"), strA2);
                map.put(ei.a("004jgdi"), Integer.valueOf(fz.d.e()));
                map.put(ei.a("011efiJfgdkdjeh4iSecWjf"), bVar.h());
                map.put(ei.a("009gd7fi*iGgk9jgYfd0i"), Long.valueOf(bv.a().b(br.f35886c, 0L)));
                String strEncodeToString = Base64.encodeToString((strA + ":" + strA2).getBytes("utf-8"), 2);
                map.put(ei.a("009gd1fiBi3gkSjgOeedc"), strEncodeToString);
                HashMap map2 = (HashMap) br.b(map, dy.a().a("gclg") + ei.a("004l(ddYjg"));
                if (map2 == null || map2.size() == 0 || (list = (List) map2.get(ei.a("004j>ehejfi"))) == null || list.size() <= 0) {
                    return;
                }
                bv.a().a(br.f35886c, System.currentTimeMillis());
                final ArrayList arrayList = new ArrayList();
                es.a().a("[dhss] vpl", new Object[0]);
                fz.c cVarA = fz.a(ax.g());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    cVarA.a(180000, (String) it.next(), 0);
                }
                cVarA.a(new fz.a() { // from class: cn.fly.verify.br.1.1
                    @Override // cn.fly.verify.fz.a
                    public void a(fz.b bVar2) {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            boolean z10 = true;
                            try {
                                Object objM = bVar2.m(i10);
                                if (objM != null) {
                                    String str = (String) list.get(i10);
                                    ApplicationInfo applicationInfoA = fk.a(objM, str);
                                    HashMap map3 = new HashMap();
                                    map3.put(ei.a("006djjj4ehej"), str);
                                    map3.put(ei.a("006djj@dd.f$dj"), fk.c(objM, str));
                                    if (applicationInfoA != null) {
                                        int i11 = applicationInfoA.flags;
                                        boolean z11 = (i11 & 1) == 1;
                                        boolean z12 = (i11 & 128) != 0;
                                        String strA3 = ei.a("0057dififiecfi");
                                        if (!z11 && !z12) {
                                            z10 = false;
                                        }
                                        map3.put(strA3, Boolean.valueOf(z10));
                                    }
                                    arrayList.add(map3);
                                }
                            } catch (Throwable th2) {
                                es.a().a(th2);
                            }
                        }
                    }
                });
                map.remove(ei.a("011efiRfgdkdjehBi%ec(jf"));
                map.remove(ei.a("009gd:fi?i8gkGjgGfd2i"));
                map.remove(ei.a("009gd]fi+i-gkZjg0eedc"));
                map.put(ei.a("005[dfdkdc3fg"), fz.d.j());
                map.put(ei.a("008GdcYdifiAdidfWf"), Long.valueOf(System.currentTimeMillis()));
                map.put(ei.a("002.didc"), strEncodeToString);
                map.put(ei.a("004j4ehejfi"), arrayList);
                Object objB = br.this.b(map);
                if (objB == null) {
                    objB = br.this.b(map);
                }
                if (objB == null) {
                    br.this.a(map);
                }
            }
        });
    }

    @Override // cn.fly.verify.bh
    protected void a() {
        if (az.a().g()) {
            try {
                Thread.sleep(((Long) a(d(), 0L)).longValue() * 1000);
                HashMap<String, Object> map = (HashMap) bv.a().c(f35887d, null);
                if (map != null && !map.isEmpty() && b(map) != null) {
                    a((HashMap<String, Object>) null);
                }
            } catch (Throwable unused) {
            }
            n();
        }
    }

    public synchronized void a(HashMap<String, Object> map) {
        try {
            if (map == null) {
                bv.a().b(f35887d);
            } else {
                bv.a().b(f35887d, map);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
