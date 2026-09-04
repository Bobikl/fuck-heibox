package cn.fly.verify;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class dz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static dz f36206b = new dz();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f36208c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile long f36209d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f36210e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f36211f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f36207a = new AtomicBoolean(false);

    private dz() {
    }

    public static dz a() {
        return f36206b;
    }

    private boolean a(final int i10) {
        final boolean[] zArr = {true};
        fz.c cVarA = fz.a(ax.g());
        if (i10 == 0) {
            cVarA.v();
        } else if (i10 == 1) {
            cVarA.u();
        } else if (i10 == 2) {
            cVarA.w();
        } else if (i10 == 3) {
            cVarA.K();
        } else if (i10 == 4) {
            cVarA.a();
        } else if (i10 == 5) {
            cVarA.s();
        }
        cVarA.a(new fz.a() { // from class: cn.fly.verify.dz.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                ConcurrentHashMap concurrentHashMap;
                String strA;
                int i11;
                int i12 = i10;
                if (i12 == 0) {
                    zArr[0] = bVar.v();
                    concurrentHashMap = dz.this.f36210e;
                    strA = ba.a("002 fi-e");
                    i11 = zArr[0];
                } else if (i12 == 1) {
                    zArr[0] = bVar.u();
                    concurrentHashMap = dz.this.f36210e;
                    strA = ba.a("002[fife");
                    i11 = zArr[0];
                } else if (i12 == 2) {
                    zArr[0] = bVar.w();
                    concurrentHashMap = dz.this.f36210e;
                    strA = ba.a("002>ff?l");
                    i11 = zArr[0];
                } else if (i12 == 3) {
                    zArr[0] = bVar.J();
                    concurrentHashMap = dz.this.f36210e;
                    strA = ba.a("002$hiMl");
                    i11 = zArr[0];
                } else if (i12 == 4) {
                    zArr[0] = bVar.a();
                    concurrentHashMap = dz.this.f36210e;
                    strA = ba.a("002?fl1k");
                    i11 = zArr[0];
                } else {
                    if (i12 != 5) {
                        return;
                    }
                    zArr[0] = bVar.s();
                    concurrentHashMap = dz.this.f36210e;
                    strA = ba.a("002 gk%l");
                    i11 = zArr[0];
                }
                concurrentHashMap.put(strA, Integer.valueOf(i11));
            }
        });
        return zArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        return locale.getLanguage().startsWith("zh") && TextUtils.equals(locale.getCountry(), com.huawei.hms.feature.dynamic.f.e.f60734e);
    }

    private boolean a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            char[] charArray = str.toCharArray();
            HashMap map = new HashMap();
            boolean zA = false;
            for (int i10 = 0; i10 < charArray.length; i10++) {
                char c10 = charArray[i10];
                if (c10 == '1') {
                    zA |= a(i10);
                } else if (c10 != '0') {
                    List arrayList = (List) map.get(Character.valueOf(c10));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(i10));
                    map.put(Character.valueOf(charArray[i10]), arrayList);
                }
            }
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
                boolean zA2 = true;
                while (it2.hasNext()) {
                    zA2 &= a(((Integer) it2.next()).intValue());
                }
                zA |= zA2;
            }
            return zA;
        } catch (Throwable th2) {
            es.a().c(th2);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025 A[PHI: r0
  0x0025: PHI (r0v7 java.lang.String) = (r0v5 java.lang.String), (r0v5 java.lang.String), (r0v0 java.lang.String), (r0v0 java.lang.String) binds: [B:31:0x00d3, B:33:0x00e5, B:5:0x001c, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    private boolean a(String str, HashMap<String, Object> map) {
        String str2 = com.umeng.analytics.pro.ak.av;
        boolean z10 = true;
        if (TextUtils.equals(str, com.umeng.analytics.pro.ak.av)) {
            if (((Integer) gj.a(map.get(com.umeng.analytics.pro.ak.av), 0)).intValue() != 1 || !d()) {
                z10 = false;
            }
        } else {
            if (TextUtils.equals(str, "p")) {
                List<String> list = (List) gj.a(map.get("p"), (Object) null);
                ArrayList<Boolean> arrayList = new ArrayList<>();
                boolean zB = b(arrayList, list);
                this.f36211f.put("p", arrayList);
                return zB;
            }
            if (TextUtils.equals(str, "fp")) {
                List<String> list2 = (List) gj.a(map.get("fp"), (Object) null);
                ArrayList<Boolean> arrayList2 = new ArrayList<>();
                boolean zB2 = b(arrayList2, list2);
                this.f36211f.put("fp", arrayList2);
                return zB2;
            }
            if (TextUtils.equals(str, com.umeng.analytics.pro.ak.aB)) {
                boolean zA = a(new ArrayList<>(), (List<String>) gj.a(map.get(com.umeng.analytics.pro.ak.aB), (Object) null));
                this.f36211f.put(com.umeng.analytics.pro.ak.aB, Boolean.valueOf(zA));
                return zA;
            }
            if (TextUtils.equals(str, "fs")) {
                boolean zA2 = a(new ArrayList<>(), (List<String>) gj.a(map.get("fs"), (Object) null));
                this.f36211f.put("fs", Boolean.valueOf(zA2));
                return zA2;
            }
            str2 = "d";
            if (!TextUtils.equals(str, "d")) {
                if (!TextUtils.equals(str, "bl")) {
                    return false;
                }
                boolean zB3 = b((String) gj.a(map.get("bl"), ""));
                this.f36211f.put("bl", Boolean.valueOf(zB3));
                return zB3;
            }
            if (((Integer) gj.a(map.get("d"), 0)).intValue() != 1 || !fc.a(ax.g()).d().aw()) {
                z10 = false;
            }
        }
        this.f36211f.put(str2, Boolean.valueOf(z10));
        return z10;
    }

    private boolean a(ArrayList<Boolean> arrayList, final List<String> list) {
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        if (list != null && list.size() > 0) {
            fz.c cVarA = fz.a(ax.g());
            for (int i10 = 0; i10 < list.size(); i10++) {
                cVarA.a(new Intent(list.get(i10)), 0);
            }
            cVarA.a(new fz.a() { // from class: cn.fly.verify.dz.3
                @Override // cn.fly.verify.fz.a
                public void a(fz.b bVar) {
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        List<ResolveInfo> listF = bVar.f(i11);
                        if (listF != null && listF.size() > 0) {
                            linkedBlockingQueue.offer(Boolean.TRUE);
                        }
                    }
                    linkedBlockingQueue.offer(Boolean.FALSE);
                }
            });
        }
        try {
            Boolean bool = (Boolean) linkedBlockingQueue.poll(150L, TimeUnit.MILLISECONDS);
            return bool != null && bool.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean b(String str) {
        String strD = el.d();
        if (TextUtils.isEmpty(strD) || strD.length() < str.length()) {
            return false;
        }
        String[] strArrSplit = strD.split("");
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        boolean zEquals = false;
        for (int i10 = 0; i10 < charArray.length; i10++) {
            char c10 = charArray[i10];
            if (c10 == '1') {
                zEquals |= TextUtils.equals(strArrSplit[i10], "1");
            } else if (c10 == '2') {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (arrayList.size() <= 0) {
            return zEquals;
        }
        Iterator it = arrayList.iterator();
        boolean zEquals2 = true;
        while (it.hasNext()) {
            zEquals2 &= TextUtils.equals(strArrSplit[((Integer) it.next()).intValue()], "1");
        }
        return zEquals | zEquals2;
    }

    private boolean b(final ArrayList<Boolean> arrayList, final List<String> list) {
        fz.c cVarA = fz.a(ax.g());
        if (list == null || list.size() == 0) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            cVarA.a(it.next());
        }
        final boolean[] zArr = {false};
        cVarA.a(new fz.a() { // from class: cn.fly.verify.dz.4
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    boolean zE = bVar.e(i10);
                    arrayList.add(Boolean.valueOf(zE));
                    boolean[] zArr2 = zArr;
                    boolean z10 = zE | zArr2[0];
                    zArr2[0] = z10;
                    if (z10) {
                        return;
                    }
                }
            }
        });
        return zArr[0];
    }

    private synchronized boolean b(boolean z10) {
        long jLongValue;
        Object objA;
        try {
            if (z10) {
                HashMap mapA = ge.a(bv.a().d());
                if (mapA.isEmpty()) {
                    mapA = ge.a(bv.a().c());
                }
                jLongValue = ((Long) gj.a(mapA.get(ba.a("004heh4gk")), 5L)).longValue() * 1000;
                objA = gj.a(mapA.get(ba.a("002e;fe")), ba.a("006@jgjgjhjhjhjh"));
            } else {
                jLongValue = ((Long) by.a(ba.a("004hehZgk"), 5L)).longValue() * 1000;
                objA = by.a(ba.a("002eKfe"), ba.a("006Tjgjgjhjhjhjh"));
            }
            String str = (String) objA;
            if (this.f36209d != 0 && System.currentTimeMillis() - this.f36209d <= jLongValue) {
                return this.f36208c;
            }
            boolean zA = a(str);
            if (this.f36209d == 0 || zA != this.f36208c) {
                c(zA);
            }
            this.f36209d = System.currentTimeMillis();
            this.f36208c = zA;
            return zA;
        } catch (Throwable th2) {
            es.a().c(th2);
            return true;
        }
    }

    private void c(boolean z10) {
        HashMap map = new HashMap();
        map.put(ba.a("005eihf-fl"), Integer.valueOf(!z10 ? 1 : 0));
        map.put(ba.a("0024fi6e"), gj.a(this.f36210e.get(ba.a("0024fi6e")), 0));
        map.put(ba.a("002[fife"), gj.a(this.f36210e.get(ba.a("002[fife")), 0));
        map.put(ba.a("002:ff5l"), gj.a(this.f36210e.get(ba.a("002:ff5l")), 0));
        map.put(ba.a("002>hi@l"), gj.a(this.f36210e.get(ba.a("002>hi@l")), 0));
        map.put(ba.a("002JflEk"), gj.a(this.f36210e.get(ba.a("002JflEk")), 0));
        map.put(ba.a("002Hgk=l"), gj.a(this.f36210e.get(ba.a("002Hgk=l")), 0));
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put(ba.a("004k?ge2lh"), "ECMT");
        map2.put(ba.a("004@feDfkf"), map);
        map2.put(ba.a("008'fe:fkhkEfkfh7h"), Long.valueOf(jCurrentTimeMillis));
        cr.a().a(jCurrentTimeMillis, map2);
    }

    private boolean d() {
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        fz.a(ax.g()).d().a(new fz.a() { // from class: cn.fly.verify.dz.2
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                String strD = bVar.d();
                if (!TextUtils.isEmpty(strD) && !TextUtils.equals("-1", strD)) {
                    linkedBlockingQueue.offer(Boolean.valueOf(!strD.startsWith("460")));
                }
                linkedBlockingQueue.offer(Boolean.valueOf(!dz.this.a(ax.g())));
            }
        });
        try {
            Boolean bool = (Boolean) linkedBlockingQueue.poll(120L, TimeUnit.MILLISECONDS);
            return bool != null && bool.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void a(HashMap<String, Object> map, HashMap<String, Object> map2, HashMap<String, Object> map3) {
        try {
            Object obj = this.f36210e.get(ba.a("006hRfhfjfl h,hk"));
            Boolean bool = Boolean.FALSE;
            boolean zBooleanValue = ((Boolean) gj.a(obj, bool)).booleanValue();
            boolean zBooleanValue2 = ((Boolean) gj.a(this.f36210e.get(ba.a("006)glTlDfjfl@h5hk")), bool)).booleanValue();
            HashMap map4 = new HashMap(4);
            map4.put(ba.a("003UflQhHhk"), Boolean.valueOf(zBooleanValue));
            map4.put(ba.a("003Dflfkfe"), gj.a(map.get(ba.a("003Dflfkfe")), (Object) null));
            if (zBooleanValue || map2 == null) {
                map4.put(ba.a("003Dhkfkfe"), gj.a(map.get(ba.a("003Dhkfkfe")), (Object) null));
            } else {
                map4.put(ba.a("003'hkfkfe"), gj.a(map2.get(ba.a("003'hkfkfe")), (Object) null));
            }
            this.f36210e.put(ba.a("006h1fhfjfl1h8hk"), ge.a(map4));
            if (zBooleanValue) {
                HashMap map5 = new HashMap(4);
                map5.put(ba.a("003Bfl4h^hk"), Boolean.valueOf(zBooleanValue2));
                map5.put(ba.a("003Nflfkfe"), gj.a(map.get(ba.a("003Nflfkfe")), (Object) null));
                if (zBooleanValue2 || map3 == null) {
                    map5.put(ba.a("0032hkfkfe"), gj.a(map.get(ba.a("0032hkfkfe")), (Object) null));
                } else {
                    map5.put(ba.a("003Dhkfkfe"), gj.a(map3.get(ba.a("003Dhkfkfe")), (Object) null));
                }
                map5.putAll(this.f36211f);
                this.f36210e.put(ba.a("006FglElPfjflYh+hk"), ge.a(map5));
            }
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    public boolean a(HashMap<String, Object> map) {
        try {
            List<String> list = (List) gj.a(map.get("j"), (Object) null);
            if (list != null && list.size() > 0) {
                boolean zA = false;
                for (String str : list) {
                    if (str.contains(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                        boolean zA2 = true;
                        for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                            zA2 &= a(str2, map);
                        }
                        zA |= zA2;
                    } else {
                        zA |= a(str, map);
                    }
                }
                this.f36210e.put(ba.a("0061gl^l.fjflChShk"), Boolean.valueOf(zA ? false : true));
                return !zA;
            }
        } catch (Throwable th2) {
            es.a().c(th2);
        }
        this.f36210e.put(ba.a("0062gl=lTfjfl_h%hk"), Boolean.TRUE);
        return true;
    }

    public synchronized boolean a(boolean z10) {
        return !b(z10);
    }

    public boolean b() {
        return a(false);
    }

    public ConcurrentHashMap<String, Object> c() {
        return this.f36210e;
    }
}
