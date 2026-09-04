package cn.fly.verify;

import android.os.Handler;
import android.os.Message;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bh implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final WeakHashMap<String, Object> f35833k = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f35834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Object f35835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f35837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f35838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f35839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile long f35840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f35841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35843j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f35844l;

    protected bh(String str, long j10, String str2, long j11, long j12) {
        this.f35834a = 0;
        this.f35842i = 0;
        this.f35843j = false;
        this.f35836c = str;
        this.f35837d = str2;
        this.f35838e = j10;
        this.f35839f = j11;
        this.f35841h = getClass().hashCode();
        this.f35844l = j12;
        this.f35840g = System.currentTimeMillis();
    }

    protected bh(String str, String str2, long j10) {
        this(str, 0L, str2, 0L, j10);
    }

    protected static long a(String str, Long l10) {
        Map map = (Map) by.a(ba.a("005Hhk i!fk>kGhk"), (Object) null);
        if (map == null) {
            return 0L;
        }
        return ((Long) gj.a(map.get(str), l10)).longValue();
    }

    public static void a(String str, File file, String str2, String str3) throws Throwable {
        Object objA;
        Object objA2 = gi.a((Object) ax.g(), ba.a("014(glRhk2gf8ifZhkhkhgfmHfNfe[h>fl"), new Object[0]);
        gi.b(ba.a("028=fe!fi+fffkgjfnhkgehkCkhDfhfnhnYh?gkgfAif,hkhkhgfmKfJfeIhEfl"), ba.a("028=fe!fi+fffkgjfnhkgehkCkhDfhfnhnYh?gkgfAif,hkhkhgfmKfJfeIhEfl"));
        file.setReadOnly();
        File parentFile = file.getParentFile();
        WeakHashMap<String, Object> weakHashMap = f35833k;
        synchronized (weakHashMap) {
            objA = weakHashMap.get(str);
            if (objA == null) {
                objA = gi.a(ba.a("028KfeQfiJfffkgjfnhkgehk0kh8fhfnhnHh-gkgfRif4hkhkhgfm7f'feGh?fl"), file.getAbsolutePath(), parentFile.getAbsolutePath(), parentFile.getAbsolutePath(), objA2);
                weakHashMap.put(str, objA);
            }
        }
        gj.a(parentFile);
        String strA = du.a((bd) null);
        final Object objA3 = gi.a(gi.a(objA, ba.a("009i'fmTf!fegf2if.hkhk"), str2), ba.a("009TglOhkIje:hkj5fmfe"), str3, String.class);
        HashMap map = new HashMap();
        map.put(ba.a("0049fefifkfe"), strA);
        map.put(ba.a("004Hfhfmfkfe"), fc.a(ax.g()).d().ah());
        map.put(ba.a("010Ihkfegjim3hMflhkfkfm2g"), Integer.valueOf(ax.f35783a));
        map.put(ba.a("006fll^ke_h^ge"), ek.a());
        map.put(ba.a("009fll3gn,heHfl0hk"), ax.e());
        map.put(ba.a("006Cfefmfh!fPfk5g"), ax.a().a());
        map.put(ba.a("010UghfmflGehLhm5kkl;hk"), Boolean.valueOf(ax.b()));
        map.put(ba.a("009]ghfmflJehZgg1l*ffjj"), Boolean.valueOf(ax.c()));
        map.put(ba.a("004heh]gk"), Long.valueOf(((Long) by.a(ba.a("004hehVgk"), 5L)).longValue()));
        map.put(ba.a("002eNfe"), (String) by.a(ba.a("002e?fe"), ba.a("0060jgjgjhjhjhjh")));
        map.put("usridt", bu.d());
        map.put("mdp", eq.class.getName());
        final String strA2 = ge.a(map);
        gi.a(objA3, ba.a("0134hkWhk[hf+eehThkhkfkhh:ih"), Boolean.TRUE);
        dx.a().a(15);
        gm.a(0, new Handler.Callback() { // from class: cn.fly.verify.bh.5
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                try {
                    dx.a().a(16);
                    gi.a(objA3, ba.a("006DfkVg.fffmgj@h"), null, new Object[]{strA2});
                    dx.a().a(17);
                } catch (Throwable th2) {
                    dx.a().a(7, th2);
                }
                return false;
            }
        });
    }

    private void m() {
        int i10;
        if (this.f35843j || (i10 = this.f35834a) < 0) {
            return;
        }
        this.f35834a = i10 + 1;
    }

    protected bh a(long j10) {
        if (j10 > 0) {
            this.f35840g = System.currentTimeMillis() + (j10 * 1000);
        } else {
            this.f35840g = -1L;
        }
        return this;
    }

    public bh a(Object obj) {
        this.f35835b = obj;
        return this;
    }

    public bh a(boolean z10) {
        this.f35843j = z10;
        if (z10) {
            this.f35844l = 0L;
        }
        return this;
    }

    public <T> T a(String str, T t10) {
        return (T) by.a(str, t10);
    }

    protected List<HashMap<String, Object>> a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fh.a aVar = new fh.a(it.next());
            try {
                HashMap map = new HashMap();
                map.put("accmt", Float.valueOf(aVar.a()));
                if (aVar.i()) {
                    map.put("vacmt", Float.valueOf(aVar.j()));
                }
                map.put("ltdmt", Double.valueOf(aVar.b()));
                map.put("lndmt", Double.valueOf(aVar.c()));
                map.put(dv.f36169a, Long.valueOf(aVar.d()));
                map.put("prvmt", aVar.e());
                map.put("atdmt", Double.valueOf(aVar.f()));
                map.put("brmt", Float.valueOf(aVar.g()));
                map.put("spmt", Float.valueOf(aVar.h()));
                arrayList.add(map);
            } catch (Throwable th2) {
                es.a().a("[cl] glfe " + th2, new Object[0]);
            }
        }
        return arrayList;
    }

    protected abstract void a() throws Throwable;

    protected void a(int i10) {
        this.f35842i = i10;
    }

    protected void a(long j10, String str, Object obj) {
        a(j10, str, obj, false);
    }

    protected void a(long j10, String str, Object obj, HashMap<String, Object> map, boolean z10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        final long j11 = j10 > 0 ? (j10 * 1000) + jCurrentTimeMillis : jCurrentTimeMillis;
        final HashMap<String, Object> map2 = new HashMap<>();
        map2.put(ba.a("004k$ge>lh"), str);
        map2.put(ba.a("004i=fkhk;k"), obj);
        map2.put(ba.a("008%fe6fkhkZfkfhDh"), Long.valueOf(jCurrentTimeMillis));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        if (z10) {
            a(new gq<HashMap<String, Object>>() { // from class: cn.fly.verify.bh.2
                @Override // cn.fly.verify.gq
                public void a(HashMap<String, Object> map3) {
                    map2.put(ba.a("002ei"), map3);
                    bh.this.a(map3, map2);
                    cr.a().a(j11, map2);
                }
            });
        } else {
            cr.a().a(j11, map2);
        }
    }

    protected void a(long j10, String str, Object obj, boolean z10) {
        a(j10, str, obj, null, z10);
    }

    protected void a(final gq<HashMap<String, Object>> gqVar) {
        if (((Integer) a(ba.a("0020fm*i"), 0)).intValue() == 1) {
            fz.a(ax.g()).a(0, 0, true, false).a(new fz.a() { // from class: cn.fly.verify.bh.1
                @Override // cn.fly.verify.fz.a
                public void a(fz.b bVar) {
                    List<HashMap<String, Object>> listA = bh.this.a(bVar.i(new int[0]));
                    if (listA == null || listA.isEmpty()) {
                        gqVar.a(null);
                    } else {
                        gqVar.a(listA.get(listA.size() - 1));
                    }
                }
            });
        } else {
            gqVar.a(null);
        }
    }

    protected void a(String str, HashMap<String, Object> map) {
        a(str, map, false);
    }

    protected void a(String str, HashMap<String, Object> map, boolean z10) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final HashMap<String, Object> map2 = new HashMap<>();
        map2.put(ba.a("004kXge?lh"), str);
        if (map != null) {
            map2.put(ba.a("004?fe$fkf"), map);
        }
        map2.put(ba.a("008;fe*fkhk*fkfh5h"), Long.valueOf(jCurrentTimeMillis));
        if (z10) {
            a(new gq<HashMap<String, Object>>() { // from class: cn.fly.verify.bh.4
                @Override // cn.fly.verify.gq
                public void a(HashMap<String, Object> map3) {
                    map2.put(ba.a("002ei"), map3);
                    bh.this.a(map3, map2);
                    cr.a().a(jCurrentTimeMillis, map2);
                }
            });
        } else {
            cr.a().a(jCurrentTimeMillis, map2);
        }
    }

    protected void a(HashMap<String, Object> map, final HashMap<String, Object> map2) {
        if (map == null || el.a(((Long) gj.a(map.get(dv.f36169a), Long.valueOf(System.currentTimeMillis()))).longValue(), System.currentTimeMillis())) {
            return;
        }
        fz.a(ax.g()).a(0, 15, false, true).a(new fz.a() { // from class: cn.fly.verify.bh.3
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) throws Throwable {
                if (bVar.i(new int[0]) == null || bVar.i(new int[0]).isEmpty()) {
                    return;
                }
                List<HashMap<String, Object>> listA = bh.this.a(bVar.i(new int[0]));
                HashMap<String, Object> map3 = listA.get(listA.size() - 1);
                map3.put("pt", 2);
                map2.put("nl", map3);
            }
        });
    }

    public bh b(boolean z10) {
        this.f35834a = z10 ? 0 : -1;
        return this;
    }

    protected TreeMap<String, Object> b(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            TreeMap<String, Object> treeMap = new TreeMap<>();
            fh.a aVar = new fh.a(obj);
            treeMap.put("ltdmt", Double.valueOf(aVar.b()));
            treeMap.put("lndmt", Double.valueOf(aVar.c()));
            return treeMap;
        } catch (Throwable unused) {
            return null;
        }
    }

    protected void b() {
        long jL = l();
        if (jL > 0) {
            a(jL);
        } else {
            this.f35843j = true;
        }
    }

    protected void c() {
    }

    public String d() {
        return this.f35836c;
    }

    protected boolean e() {
        return ((Long) by.a(this.f35836c, Long.valueOf(this.f35838e))).longValue() != 0 && f();
    }

    protected final boolean f() {
        if ("bs,l,ol,wi,wl,ext,aa,".contains(this.f35836c + Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            return dz.a().b();
        }
        return true;
    }

    protected boolean g() {
        return this.f35834a == 0;
    }

    public boolean h() {
        if (!e()) {
            return false;
        }
        ep.f36340c.execute(this);
        return true;
    }

    protected boolean i() {
        boolean zA = by.a();
        boolean zB = by.b();
        if (!zA || !zB) {
            es.a().a("slt: " + d() + ", to: " + zA + ", conn: " + zB, new Object[0]);
            return false;
        }
        boolean zE = e();
        es.a().a("slt : " + getClass().getSimpleName() + ", to: " + zA + ", conn: " + zB + ", " + this.f35836c + ": " + zE + ", key: " + a(this.f35836c, 0) + ", gp: " + l() + " , oce " + this.f35843j + " , tt " + this.f35834a, new Object[0]);
        return zE;
    }

    public long j() {
        return this.f35840g;
    }

    public int k() {
        return this.f35841h;
    }

    protected long l() {
        try {
            String str = this.f35837d;
            if (str != null) {
                return Long.parseLong(String.valueOf(by.a(str, Long.valueOf(this.f35839f))));
            }
            return 0L;
        } catch (Throwable th2) {
            es.a().a(th2);
            return 0L;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f35844l > 0) {
            bq.a().a(this.f35844l, this, this.f35842i);
            this.f35844l = 0L;
            return;
        }
        try {
            if (g()) {
                c();
            }
            if (i()) {
                a();
            }
        } catch (Throwable th2) {
            try {
                es.a().a(th2);
            } finally {
                b();
                m();
            }
        }
    }
}
