package cn.fly.verify;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes6.dex */
public class dy {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static dy f36197d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<String> f36200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile HashMap<String, Long> f36201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ReentrantReadWriteLock f36202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ReentrantReadWriteLock f36203j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final CountDownLatch f36196c = new CountDownLatch(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HashMap<String, String> f36194a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ArrayList<String> f36195b = new ArrayList<>(Arrays.asList("cfgc.zztfly.com"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile CountDownLatch f36204k = f36196c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile HashMap<String, HashMap<String, ArrayList<String>>> f36198e = bv.a().m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile HashMap<String, String> f36199f = bv.a().n();

    static {
        f36194a.put("gcfg", "cfgc.zztfly.com");
        f36194a.put("gclg", "upc.zztfly.com");
        f36194a.put("el", "errc.zztfly.com");
        f36194a.put("dg", "devc.zztfly.com");
        f36194a.put("dtc", "fdl.zztfly.com");
    }

    private dy() {
        ArrayList<String> arrayListO = bv.a().o();
        this.f36200g = arrayListO;
        if (arrayListO == null || arrayListO.isEmpty()) {
            this.f36200g = f36195b;
        }
        this.f36201h = bv.a().p();
        this.f36202i = new ReentrantReadWriteLock();
        this.f36203j = new ReentrantReadWriteLock();
    }

    public static dy a() {
        if (f36197d == null) {
            synchronized (dy.class) {
                if (f36197d == null) {
                    f36197d = new dy();
                }
            }
        }
        return f36197d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CountDownLatch countDownLatch, int i10) {
        Object obj;
        try {
            ArrayList<String> arrayList = this.f36200g;
            if (arrayList == null || i10 >= arrayList.size()) {
                es.a().b("DM No pdm");
            } else {
                String strA = el.a(this.f36200g.get(i10) + "/dm");
                HashMap<String, Object> map = new HashMap<>();
                map.put(ei.a("006djj1eh^fZec"), ek.a());
                fu.a aVar = new fu.a();
                aVar.f36613b = 3000;
                aVar.f36612a = 5000;
                String strA2 = new fu().a(strA, map, (HashMap<String, String>) null, aVar);
                es.a().a("DM resp: " + strA2, new Object[0]);
                HashMap mapA = ge.a(strA2);
                if (mapA == null || mapA.isEmpty() || (obj = mapA.get(ei.a("004cLdkdc3f"))) == null || ((Integer) obj).intValue() != 200) {
                    a(countDownLatch, i10 + 1);
                } else {
                    HashMap map2 = (HashMap) mapA.get(ei.a("004IdcKdid"));
                    if (map2 != null && !map2.isEmpty()) {
                        try {
                            HashMap map3 = (HashMap) map2.get(ei.a("0042dcBdid"));
                            if (map3 != null && !map3.isEmpty()) {
                                HashMap map4 = new HashMap();
                                for (Map.Entry entry : map3.entrySet()) {
                                    String str = (String) entry.getKey();
                                    HashMap map5 = (HashMap) entry.getValue();
                                    HashMap map6 = new HashMap();
                                    if (map5 != null && !map5.isEmpty()) {
                                        for (Map.Entry entry2 : map5.entrySet()) {
                                            String str2 = (String) entry2.getKey();
                                            ArrayList<String> arrayList2 = (ArrayList) entry2.getValue();
                                            ArrayList arrayList3 = new ArrayList();
                                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                                for (String str3 : arrayList2) {
                                                    if (b(str3)) {
                                                        arrayList3.add(str3);
                                                    }
                                                }
                                            }
                                            if (!arrayList3.isEmpty()) {
                                                map6.put(str2, arrayList3);
                                            }
                                        }
                                    }
                                    if (!map6.isEmpty()) {
                                        map4.put(str, map6);
                                    }
                                }
                                if (map4.isEmpty()) {
                                    es.a().a("DM busi no avai dm", new Object[0]);
                                } else {
                                    try {
                                        es.a().a("DM busi w 2 cac: " + map4, new Object[0]);
                                        if (this.f36202i.writeLock().tryLock(3000L, TimeUnit.MILLISECONDS)) {
                                            this.f36198e.clear();
                                            this.f36198e.putAll(map4);
                                            bv.a().b(this.f36198e);
                                        }
                                        try {
                                            this.f36202i.writeLock().unlock();
                                        } catch (Throwable th2) {
                                            es.a().a(th2, "DM " + th2.getMessage(), new Object[0]);
                                        }
                                    } catch (Throwable th3) {
                                        try {
                                            es.a().a(th3, "DM " + th3.getMessage(), new Object[0]);
                                            try {
                                                this.f36202i.writeLock().unlock();
                                            } catch (Throwable th4) {
                                                es.a().a(th4, "DM " + th4.getMessage(), new Object[0]);
                                            }
                                        } catch (Throwable th5) {
                                            try {
                                                this.f36202i.writeLock().unlock();
                                                throw th5;
                                            } catch (Throwable th6) {
                                                es.a().a(th6, "DM " + th6.getMessage(), new Object[0]);
                                                throw th5;
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th7) {
                            try {
                                es.a().a(th7, "DM " + th7.getMessage(), new Object[0]);
                            } catch (Throwable th8) {
                                countDownLatch.countDown();
                                throw th8;
                            }
                        }
                        countDownLatch.countDown();
                        try {
                            ArrayList<String> arrayList4 = (ArrayList) map2.get("p");
                            if (arrayList4 != null && !arrayList4.isEmpty()) {
                                ArrayList arrayList5 = new ArrayList();
                                for (String str4 : arrayList4) {
                                    if (b(str4)) {
                                        arrayList5.add(str4);
                                    }
                                }
                                if (arrayList5.isEmpty()) {
                                    es.a().a("DM prx no avai dm", new Object[0]);
                                } else {
                                    es.a().a("DM prx w 2 cac: " + arrayList5, new Object[0]);
                                    this.f36200g.clear();
                                    this.f36200g.addAll(arrayList5);
                                    bv.a().a(this.f36200g);
                                }
                            }
                        } catch (Throwable th9) {
                            es.a().a(th9, "DM " + th9.getMessage(), new Object[0]);
                        }
                    }
                }
            }
            if (countDownLatch.getCount() <= 0) {
            }
        } catch (Throwable th10) {
            try {
                es.a().a(th10, "DM " + th10.getMessage(), new Object[0]);
                a(countDownLatch, i10 + 1);
            } finally {
                if (countDownLatch.getCount() > 0) {
                    countDownLatch.countDown();
                }
            }
        }
    }

    private boolean a(String str, String str2) {
        Long l10;
        boolean z10 = true;
        try {
            if (this.f36203j.readLock().tryLock(3000L, TimeUnit.MILLISECONDS)) {
                String str3 = str + lg.a.f131412e + str2;
                if (this.f36201h != null && this.f36201h.containsKey(str3) && (l10 = this.f36201h.get(str3)) != null && System.currentTimeMillis() - l10.longValue() < 1800000) {
                    z10 = false;
                }
            }
            try {
                this.f36203j.readLock().unlock();
            } catch (Throwable th2) {
                es.a().a(th2, "DM " + th2.getMessage(), new Object[0]);
            }
        } catch (Throwable th3) {
            try {
                es.a().a(th3, "DM " + th3.getMessage(), new Object[0]);
                try {
                    this.f36203j.readLock().unlock();
                } catch (Throwable th4) {
                    es.a().a(th4, "DM " + th4.getMessage(), new Object[0]);
                }
            } catch (Throwable th5) {
                try {
                    this.f36203j.readLock().unlock();
                } catch (Throwable th6) {
                    es.a().a(th6, "DM " + th6.getMessage(), new Object[0]);
                }
                throw th5;
            }
        }
        es.a().a("DM ck dur: " + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2 + ", pass: " + z10, new Object[0]);
        return z10;
    }

    private boolean a(String str, String str2, String str3) {
        boolean zB = b(str3);
        if (zB) {
            try {
                if (this.f36203j.writeLock().tryLock(3000L, TimeUnit.MILLISECONDS)) {
                    this.f36201h.put(str + lg.a.f131412e + str2, Long.valueOf(System.currentTimeMillis()));
                    bv.a().d(this.f36201h);
                }
                try {
                    this.f36203j.writeLock().unlock();
                } catch (Throwable th2) {
                    es.a().a(th2, "DM " + th2.getMessage(), new Object[0]);
                }
            } catch (Throwable th3) {
                try {
                    es.a().a(th3, "DM " + th3.getMessage(), new Object[0]);
                    try {
                        this.f36203j.writeLock().unlock();
                    } catch (Throwable th4) {
                        es.a().a(th4, "DM " + th4.getMessage(), new Object[0]);
                    }
                } catch (Throwable th5) {
                    try {
                        this.f36203j.writeLock().unlock();
                    } catch (Throwable th6) {
                        es.a().a(th6, "DM " + th6.getMessage(), new Object[0]);
                    }
                    throw th5;
                }
            }
        }
        return zB;
    }

    private boolean b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                InetAddress[] allByName = InetAddress.getAllByName(str);
                if (allByName != null) {
                    for (InetAddress inetAddress : allByName) {
                        if (!c(inetAddress.getHostAddress())) {
                            es.a().a("DM ck ht: " + str + ", fai", new Object[0]);
                            return false;
                        }
                    }
                }
                es.a().a("DM ck ht: " + str + ", suc", new Object[0]);
                return true;
            } catch (Throwable th2) {
                es.a().a(th2, "DM " + th2.getMessage(), new Object[0]);
            }
        }
        es.a().a("DM ck ht: " + str + ", fai_emp|exp", new Object[0]);
        return false;
    }

    private static boolean c(String str) {
        if (TextUtils.isEmpty(str) || str.equals("127.0.0.1") || str.startsWith("10.") || str.startsWith("192.168")) {
            return false;
        }
        if (str.startsWith("172.")) {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length > 1) {
                try {
                    int i10 = Integer.parseInt(strArrSplit[1]);
                    return i10 < 16 || i10 > 31;
                } catch (Throwable th2) {
                    es.a().a(th2, "DM " + th2.getMessage(), new Object[0]);
                }
            }
        }
        return true;
    }

    public String a(String str) {
        return el.a(a().a("FCOMMON", str, f36194a.get(str), false));
    }

    public String a(String str, String str2, String str3, boolean z10) {
        HashMap<String, ArrayList<String>> map;
        ArrayList<String> arrayList;
        es.a().a("DM get: " + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str3 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + z10, new Object[0]);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            es.a().a("DM Params 'sName' or 'aName' is null", new Object[0]);
            return str3;
        }
        boolean z11 = this.f36204k.getCount() == 0;
        try {
            if (this.f36202i.readLock().tryLock(3000L, TimeUnit.MILLISECONDS) && this.f36198e != null && this.f36198e.containsKey(str) && (map = this.f36198e.get(str)) != null && map.containsKey(str2) && (arrayList = map.get(str2)) != null && !arrayList.isEmpty()) {
                for (String str4 : arrayList) {
                    if (z10 && a(str, str2)) {
                        if (a(str, str2, str4)) {
                            es.a().a("DM rtn [cac|chk]: " + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2 + ": " + str4, new Object[0]);
                            HashMap<String, String> map2 = this.f36199f;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                            sb2.append(str2);
                            map2.put(sb2.toString(), str4);
                            bv.a().c(this.f36199f);
                            try {
                                this.f36202i.readLock().unlock();
                            } catch (Throwable th2) {
                                es.a().a(th2, "DM " + th2.getMessage(), new Object[0]);
                            }
                            return str4;
                        }
                    } else {
                        if (this.f36199f.containsKey(str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2)) {
                            String str5 = this.f36199f.get(str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2);
                            es.a().a("DM rtn [cac|chk_abt]: " + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2 + ": " + str5, new Object[0]);
                            try {
                                this.f36202i.readLock().unlock();
                            } catch (Throwable th3) {
                                es.a().a(th3, "DM " + th3.getMessage(), new Object[0]);
                            }
                            return str5;
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            es.a().a("DM rtn [cac]: " + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2 + ": " + str4, new Object[0]);
                            try {
                                this.f36202i.readLock().unlock();
                            } catch (Throwable th4) {
                                es.a().a(th4, "DM " + th4.getMessage(), new Object[0]);
                            }
                            return str4;
                        }
                    }
                }
            }
            try {
                this.f36202i.readLock().unlock();
            } catch (Throwable th5) {
                es.a().a(th5, "DM " + th5.getMessage(), new Object[0]);
            }
        } catch (Throwable th6) {
            try {
                es.a().a(th6, "DM " + th6.getMessage(), new Object[0]);
                try {
                    this.f36202i.readLock().unlock();
                } catch (Throwable th7) {
                    es.a().a(th7, "DM " + th7.getMessage(), new Object[0]);
                }
            } catch (Throwable th8) {
                try {
                    this.f36202i.readLock().unlock();
                } catch (Throwable th9) {
                    es.a().a(th9, "DM " + th9.getMessage(), new Object[0]);
                }
                throw th8;
            }
        }
        try {
            this.f36199f.remove(str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2);
            bv.a().c(this.f36199f);
            if (!z10 || !a(str, str2)) {
                if (!this.f36199f.containsKey(str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2)) {
                    es.a().a("DM rtn [def]" + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2 + ": " + str3, new Object[0]);
                    return str3;
                }
                String str6 = this.f36199f.get(str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2);
                es.a().a("DM rtn [def|chk_abt]: " + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2 + ": " + str6, new Object[0]);
                return str6;
            }
            if (a(str, str2, str3)) {
                es.a().a("DM rtn [def|chk_true]: " + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2 + ": " + str3, new Object[0]);
                HashMap<String, String> map3 = this.f36199f;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                sb3.append(str2);
                map3.put(sb3.toString(), str3);
                bv.a().c(this.f36199f);
                return str3;
            }
            if (z11) {
                es.a().a("DM rtn [def|chk_false]" + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2 + ": " + str3, new Object[0]);
                return str3;
            }
            if (this.f36204k.await(5000L, TimeUnit.MILLISECONDS)) {
                es.a().a("DM awt next", new Object[0]);
                return a(str, str2, str3, z10);
            }
            es.a().a("DM rtn [def|awt_to]" + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2 + ": " + str3, new Object[0]);
            return str3;
        } catch (Throwable th10) {
            es.a().a(th10, "DM " + th10.getMessage(), new Object[0]);
            es.a().a("DM rtn [def|exp]" + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2 + ": " + str3, new Object[0]);
            return str3;
        }
    }

    public void b() {
        if (this.f36204k != f36196c && this.f36204k.getCount() != 0) {
            es.a().a("DM obt abort", new Object[0]);
            return;
        }
        es.a().a("DM obt start", new Object[0]);
        this.f36204k = new CountDownLatch(1);
        ep.f36340c.execute(new Runnable() { // from class: cn.fly.verify.dy.1
            @Override // java.lang.Runnable
            public void run() {
                dy dyVar = dy.this;
                dyVar.a(dyVar.f36204k, 0);
            }
        });
    }
}
