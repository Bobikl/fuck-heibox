package cn.fly.verify;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static fd f36453a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f36454d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f36455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, Object> f36456c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile File f36459g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f36463k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f36464l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f36465m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f36457e = new byte[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicBoolean f36458f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ConcurrentLinkedQueue<CountDownLatch> f36460h = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile String f36461i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile int f36462j = -1;

    private fd(Context context) {
        this.f36455b = context;
    }

    public static fd a(Context context) {
        if (f36453a == null) {
            synchronized (fd.class) {
                if (f36453a == null) {
                    f36453a = new fd(context);
                }
            }
        }
        return f36453a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, File file, String str2) {
        FileOutputStream fileOutputStream;
        if (!TextUtils.isEmpty(str) && file != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str3 = null;
            try {
                if (file.exists()) {
                    file.delete();
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    es.a().a("dhs d...", new Object[0]);
                    new fu().a(str, fileOutputStream, (fu.a) null);
                    String strA = ga.a(file);
                    if (TextUtils.equals(str2, strA)) {
                        el.a(fileOutputStream);
                        if (TextUtils.isEmpty(null)) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            this.f36464l = jCurrentTimeMillis2;
                            str3 = String.format("dhs d %d", Long.valueOf(jCurrentTimeMillis2));
                        }
                        es.a().a(str3, new Object[0]);
                        return strA;
                    }
                    dw.a().a(-1, 20, "", str2);
                    if (file.exists()) {
                        file.delete();
                    }
                    el.a(fileOutputStream);
                    if (TextUtils.isEmpty(null)) {
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                        this.f36464l = jCurrentTimeMillis3;
                        str3 = String.format("dhs d %d", Long.valueOf(jCurrentTimeMillis3));
                    }
                    es.a().a(str3, new Object[0]);
                    return "";
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (file.exists()) {
                            file.delete();
                        }
                        str3 = "dhs d e: " + th.getMessage();
                        es.a().a(th);
                        dw.a().a(2, b(), th, "" + str2);
                        el.a(fileOutputStream);
                        if (TextUtils.isEmpty(str3)) {
                            long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
                            this.f36464l = jCurrentTimeMillis4;
                            str3 = String.format("dhs d %d", Long.valueOf(jCurrentTimeMillis4));
                        }
                        es.a().a(str3, new Object[0]);
                        return "";
                    } catch (Throwable th3) {
                        el.a(fileOutputStream);
                        if (TextUtils.isEmpty(str3)) {
                            long jCurrentTimeMillis5 = System.currentTimeMillis() - jCurrentTimeMillis;
                            this.f36464l = jCurrentTimeMillis5;
                            str3 = String.format("dhs d %d", Long.valueOf(jCurrentTimeMillis5));
                        }
                        es.a().a(str3, new Object[0]);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, Object> a(File file, String str) {
        HashMap map = new HashMap();
        String strC = bv.a().c();
        if (TextUtils.isEmpty(strC)) {
            strC = ge.a(map);
        }
        HashMap<String, Object> map2 = new HashMap<>();
        if (this.f36456c == null) {
            HashMap<String, Object> map3 = new HashMap<>();
            this.f36456c = map3;
            map3.put("cacheMap", new ConcurrentHashMap());
            this.f36456c.put("invokeTimesMap", new ConcurrentHashMap());
            this.f36456c.put("expireTimeMap", new ConcurrentHashMap());
        }
        String str2 = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            cs.a(ax.g(), file.getAbsolutePath(), strC, map2, this.f36456c);
            this.f36463k = System.currentTimeMillis() - jCurrentTimeMillis;
            es.a().a(TextUtils.isEmpty(null) ? String.format("dhs l %d", Long.valueOf(this.f36463k)) : null, new Object[0]);
        } catch (Throwable th2) {
            try {
                str2 = "dhs l e: " + th2.getMessage();
                map2.clear();
                dw.a().a(5, b(), th2, "" + str);
                es.a().a(th2);
            } catch (Throwable unused) {
            }
            this.f36463k = System.currentTimeMillis() - jCurrentTimeMillis;
            if (TextUtils.isEmpty(str2)) {
                str2 = String.format("dhs l %d", Long.valueOf(this.f36463k));
            }
            es.a().a(str2, new Object[0]);
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file) {
        if (this.f36459g != null && this.f36459g.exists()) {
            if (this.f36459g.delete()) {
                es.a().a("dhs dof succ", new Object[0]);
            } else {
                es.a().a("dhs dof fail", new Object[0]);
            }
        }
        this.f36459g = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File b(File file, String str) {
        if (!file.exists()) {
            file.mkdirs();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d(str);
        return new File(file, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str) || (strArrSplit = str.split("#")) == null || strArrSplit.length != 2) {
            return null;
        }
        return strArrSplit[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str) || (strArrSplit = str.split("#")) == null || strArrSplit.length != 2) {
            return null;
        }
        return strArrSplit[1];
    }

    public static boolean c() {
        return f36454d;
    }

    private void d(String str) {
        File fileB = gj.b(this.f36455b, str);
        if (!fileB.exists() || fileB.length() <= 0) {
            return;
        }
        fileB.delete();
    }

    private String e() {
        try {
            String str = (String) by.b(ba.a("002)hkhk"), (Object) null);
            return str == null ? (String) by.b(ba.a("009!hkhhflgnhifk:kej"), (Object) null) : str;
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str) {
        return (TextUtils.isEmpty(b(str)) || TextUtils.isEmpty(c(str))) ? false : true;
    }

    public final CountDownLatch a() {
        return a(e());
    }

    public final CountDownLatch a(final String str) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        es.a().a("dhs ofr: " + countDownLatch, new Object[0]);
        this.f36460h.offer(countDownLatch);
        ep.f36343f.execute(new Runnable() { // from class: cn.fly.verify.fd.1
            /* JADX WARN: Code duplicated, block: B:107:0x03c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:66:0x03c6 A[Catch: all -> 0x03c9, TRY_LEAVE, TryCatch #4 {all -> 0x03c9, blocks: (B:64:0x03c0, B:66:0x03c6), top: B:107:0x03c0 }] */
            @Override // java.lang.Runnable
            public void run() {
                dw dwVarA;
                Throwable th2;
                String string;
                int i10;
                int i11;
                String str2;
                fd fdVar;
                String strC;
                HashMap mapA;
                synchronized (fd.this.f36457e) {
                    fl.f36581c.set(Boolean.TRUE);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        es.a().a("dhs stch: " + fd.this.e(str), new Object[0]);
                        File file = new File(ax.g().getFilesDir(), ba.a("0038fefeTj"));
                        if (!fd.this.e(str)) {
                            boolean unused = fd.f36454d = false;
                            gj.a(file);
                            fd.this.f36465m = System.currentTimeMillis() - jCurrentTimeMillis;
                            es.a().a("dhs ctd: " + countDownLatch, new Object[0]);
                            countDownLatch.countDown();
                            fd.this.f36460h.remove(countDownLatch);
                            es.a().a("dhs tt " + fd.this.f36465m, new Object[0]);
                            if (fd.this.f36465m > 3500 && fd.this.b() == 16) {
                                dw dwVarA2 = dw.a();
                                Throwable th3 = new Throwable(("-t-" + fd.this.f36465m) + "-d-" + fd.this.f36464l + "-l-" + fd.this.f36463k + " ");
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("");
                                sb2.append(fd.this.f36461i);
                                dwVarA2.a(3, 11, th3, sb2.toString());
                            }
                            return;
                        }
                        fd.this.a(0);
                        String strB = fd.this.b(str);
                        if (TextUtils.isEmpty(strB)) {
                            boolean unused2 = fd.f36454d = false;
                            dw.a().a(-1, 4, "", "");
                            fd.this.f36465m = System.currentTimeMillis() - jCurrentTimeMillis;
                            es.a().a("dhs ctd: " + countDownLatch, new Object[0]);
                            countDownLatch.countDown();
                            fd.this.f36460h.remove(countDownLatch);
                            es.a().a("dhs tt " + fd.this.f36465m, new Object[0]);
                            if (fd.this.f36465m > 3500 && fd.this.b() == 16) {
                                dw dwVarA3 = dw.a();
                                Throwable th4 = new Throwable(("-t-" + fd.this.f36465m) + "-d-" + fd.this.f36464l + "-l-" + fd.this.f36463k + " ");
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("");
                                sb3.append(fd.this.f36461i);
                                dwVarA3.a(3, 11, th4, sb3.toString());
                            }
                            return;
                        }
                        try {
                            if (fz.d.b()) {
                                str2 = strB;
                            } else {
                                String strReplace = fz.d.d() + "";
                                String strC2 = fz.d.c();
                                if (strReplace.contains(strC2)) {
                                    strReplace = strReplace.replace(strC2, "");
                                }
                                str2 = strB + lg.a.f131412e + strReplace.replace(":", "");
                                try {
                                    es.a().a("dhs cld nm " + str2, new Object[0]);
                                } catch (Throwable unused3) {
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                        File fileB = fd.this.b(file, str2);
                        boolean z10 = fileB != null && fileB.exists() && fileB.isFile();
                        es.a().a("dhs cac: " + z10, new Object[0]);
                        String strA = ga.a(fileB);
                        if (z10) {
                            fd.this.a(5);
                            boolean zEquals = strB.equals(strA);
                            es.a().a("dhs m5: " + zEquals, new Object[0]);
                            if (zEquals) {
                                es.a().a("dhs tbm: " + fd.this.f36458f.get(), new Object[0]);
                                if (!fd.this.f36458f.compareAndSet(false, true)) {
                                    strA = "";
                                }
                            } else {
                                fd.this.a(6);
                                fdVar = fd.this;
                                strC = fdVar.c(str);
                            }
                            es.a().a("dhs cl:  tm5: " + strA + ", cm5: " + fd.this.f36461i, new Object[0]);
                            if (!TextUtils.isEmpty(strA) && !strA.equals(fd.this.f36461i)) {
                                fd.this.a(fileB);
                                mapA = fd.this.a(fileB, strA);
                                if (mapA != null || mapA.isEmpty()) {
                                    try {
                                        if (fileB.exists()) {
                                            fileB.delete();
                                        }
                                    } catch (Throwable unused5) {
                                    }
                                    es.a().a("dhs l fail", new Object[0]);
                                } else {
                                    es.a().a("dhs l succ", new Object[0]);
                                    ff ffVar = new ff(mapA);
                                    fd.this.f36461i = ga.a(fileB);
                                    boolean unused6 = fd.f36454d = fc.a(fd.this.f36455b).a(ffVar);
                                    fd.this.a(16);
                                    es.a().a("dhs fin", new Object[0]);
                                }
                            }
                            fd.this.f36465m = System.currentTimeMillis() - jCurrentTimeMillis;
                            es.a().a("dhs ctd: " + countDownLatch, new Object[0]);
                            countDownLatch.countDown();
                            fd.this.f36460h.remove(countDownLatch);
                            es.a().a("dhs tt " + fd.this.f36465m, new Object[0]);
                            if (fd.this.f36465m > 3500 && fd.this.b() == 16) {
                                dwVarA = dw.a();
                                th2 = new Throwable(("-t-" + fd.this.f36465m) + "-d-" + fd.this.f36464l + "-l-" + fd.this.f36463k + " ");
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("");
                                sb4.append(fd.this.f36461i);
                                string = sb4.toString();
                                i10 = 11;
                                i11 = 3;
                                dwVarA.a(i11, i10, th2, string);
                            }
                            fl.f36581c.set(Boolean.FALSE);
                        }
                        fd.this.a(8);
                        fdVar = fd.this;
                        strC = fdVar.c(str);
                        strA = fdVar.a(strC, fileB, strB);
                        es.a().a("dhs cl:  tm5: " + strA + ", cm5: " + fd.this.f36461i, new Object[0]);
                        if (!TextUtils.isEmpty(strA)) {
                            fd.this.a(fileB);
                            mapA = fd.this.a(fileB, strA);
                            if (mapA != null) {
                                if (fileB.exists()) {
                                    fileB.delete();
                                }
                                es.a().a("dhs l fail", new Object[0]);
                            } else {
                                if (fileB.exists()) {
                                    fileB.delete();
                                }
                                es.a().a("dhs l fail", new Object[0]);
                            }
                        }
                        fd.this.f36465m = System.currentTimeMillis() - jCurrentTimeMillis;
                        es.a().a("dhs ctd: " + countDownLatch, new Object[0]);
                        countDownLatch.countDown();
                        fd.this.f36460h.remove(countDownLatch);
                        es.a().a("dhs tt " + fd.this.f36465m, new Object[0]);
                        if (fd.this.f36465m > 3500) {
                            dwVarA = dw.a();
                            th2 = new Throwable(("-t-" + fd.this.f36465m) + "-d-" + fd.this.f36464l + "-l-" + fd.this.f36463k + " ");
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("");
                            sb5.append(fd.this.f36461i);
                            string = sb5.toString();
                            i10 = 11;
                            i11 = 3;
                            dwVarA.a(i11, i10, th2, string);
                        }
                        fl.f36581c.set(Boolean.FALSE);
                    } catch (Throwable th5) {
                        try {
                            es.a().a("dhs oops: " + th5.getMessage(), new Object[0]);
                            es.a().a(th5);
                            fd.this.f36465m = System.currentTimeMillis() - jCurrentTimeMillis;
                            es.a().a("dhs ctd: " + countDownLatch, new Object[0]);
                            countDownLatch.countDown();
                            fd.this.f36460h.remove(countDownLatch);
                            es.a().a("dhs tt " + fd.this.f36465m, new Object[0]);
                            if (fd.this.f36465m > 3500 && fd.this.b() == 16) {
                                dwVarA = dw.a();
                                th2 = new Throwable(("-t-" + fd.this.f36465m) + "-d-" + fd.this.f36464l + "-l-" + fd.this.f36463k + " ");
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("");
                                sb6.append(fd.this.f36461i);
                                string = sb6.toString();
                                i10 = 11;
                                i11 = 3;
                            }
                        } catch (Throwable th6) {
                            fd.this.f36465m = System.currentTimeMillis() - jCurrentTimeMillis;
                            es.a().a("dhs ctd: " + countDownLatch, new Object[0]);
                            countDownLatch.countDown();
                            fd.this.f36460h.remove(countDownLatch);
                            es.a().a("dhs tt " + fd.this.f36465m, new Object[0]);
                            if (fd.this.f36465m <= 3500 || fd.this.b() != 16) {
                                throw th6;
                            }
                            dw dwVarA4 = dw.a();
                            Throwable th7 = new Throwable(("-t-" + fd.this.f36465m) + "-d-" + fd.this.f36464l + "-l-" + fd.this.f36463k + " ");
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("");
                            sb7.append(fd.this.f36461i);
                            dwVarA4.a(3, 11, th7, sb7.toString());
                            throw th6;
                        }
                    }
                }
            }
        });
        return countDownLatch;
    }

    public void a(int i10) {
        this.f36462j = i10;
    }

    public int b() {
        return this.f36462j;
    }

    public CountDownLatch d() {
        ConcurrentLinkedQueue<CountDownLatch> concurrentLinkedQueue = this.f36460h;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return null;
        }
        return this.f36460h.peek();
    }
}
