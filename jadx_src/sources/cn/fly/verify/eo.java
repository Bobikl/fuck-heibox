package cn.fly.verify;

import android.content.pm.ApplicationInfo;
import android.media.MediaDrm;
import android.os.Build;
import android.text.TextUtils;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile eo f36318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap<String, Integer> f36323f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f36319a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f36320b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile String f36321c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile String f36322d = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f36324g = new byte[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f36325h = new byte[0];

    private eo() {
    }

    public static eo a() {
        if (f36318e == null) {
            synchronized (eo.class) {
                if (f36318e == null) {
                    f36318e = new eo();
                }
            }
        }
        return f36318e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] a(UUID uuid) {
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        byte[] bArr = new byte[16];
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = (7 - i10) * 8;
            bArr[i10] = (byte) (mostSignificantBits >>> i11);
            bArr[i10 + 8] = (byte) (leastSignificantBits >>> i11);
        }
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[Catch: all -> 0x00af, LOOP:0: B:16:0x0053->B:18:0x0056, LOOP_END, TryCatch #0 {all -> 0x00af, blocks: (B:4:0x0008, B:8:0x001a, B:10:0x0021, B:12:0x0030, B:13:0x0035, B:15:0x003e, B:18:0x0056, B:19:0x005e, B:20:0x0067, B:22:0x006d, B:23:0x007f, B:25:0x0099, B:14:0x0039, B:7:0x0015), top: B:30:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x006d A[Catch: all -> 0x00af, LOOP:1: B:20:0x0067->B:22:0x006d, LOOP_END, TryCatch #0 {all -> 0x00af, blocks: (B:4:0x0008, B:8:0x001a, B:10:0x0021, B:12:0x0030, B:13:0x0035, B:15:0x003e, B:18:0x0056, B:19:0x005e, B:20:0x0067, B:22:0x006d, B:23:0x007f, B:25:0x0099, B:14:0x0039, B:7:0x0015), top: B:30:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0099 A[Catch: all -> 0x00af, TRY_LEAVE, TryCatch #0 {all -> 0x00af, blocks: (B:4:0x0008, B:8:0x001a, B:10:0x0021, B:12:0x0030, B:13:0x0035, B:15:0x003e, B:18:0x0056, B:19:0x005e, B:20:0x0067, B:22:0x006d, B:23:0x007f, B:25:0x0099, B:14:0x0039, B:7:0x0015), top: B:30:0x0008 }] */
    private void b(String str) {
        ArrayList<Map.Entry> arrayList;
        int size;
        LinkedHashMap linkedHashMap;
        int iMin;
        int i10;
        int iValueOf;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap map = (HashMap) bv.a().a("key_drds");
            if (map == null) {
                map = new HashMap();
            }
            if (map.containsKey(str)) {
                int iIntValue = ((Integer) map.get(str)).intValue();
                iValueOf = iIntValue < 100000 ? Integer.valueOf(iIntValue + 1) : 1;
                arrayList = new ArrayList(map.entrySet());
                Collections.sort(arrayList, new Comparator<Map.Entry<String, Integer>>() { // from class: cn.fly.verify.eo.2
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
                        return entry2.getValue().compareTo(entry.getValue());
                    }
                });
                for (size = arrayList.size(); size > 7; size--) {
                    arrayList.remove(size - 1);
                }
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : arrayList) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                bv.a().a("key_drds", linkedHashMap);
                this.f36323f = new LinkedHashMap();
                iMin = Math.min(3, arrayList.size());
                for (i10 = 0; i10 < iMin; i10++) {
                    Map.Entry entry2 = (Map.Entry) arrayList.get(i10);
                    this.f36323f.put((String) entry2.getKey(), (Integer) entry2.getValue());
                }
            }
            map.put(str, iValueOf);
            arrayList = new ArrayList(map.entrySet());
            Collections.sort(arrayList, new Comparator<Map.Entry<String, Integer>>() { // from class: cn.fly.verify.eo.2
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(Map.Entry<String, Integer> entry3, Map.Entry<String, Integer> entry4) {
                    return entry4.getValue().compareTo(entry3.getValue());
                }
            });
            while (size > 7) {
                arrayList.remove(size - 1);
            }
            linkedHashMap = new LinkedHashMap();
            while (r2.hasNext()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            bv.a().a("key_drds", linkedHashMap);
            this.f36323f = new LinkedHashMap();
            iMin = Math.min(3, arrayList.size());
            while (i10 < iMin) {
                Map.Entry entry3 = (Map.Entry) arrayList.get(i10);
                this.f36323f.put((String) entry3.getKey(), (Integer) entry3.getValue());
            }
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    private String c(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        String strK = fz.d.k();
        String strJ = fz.d.j();
        if (!TextUtils.isEmpty(strK)) {
            sb2.append(strK.trim().toUpperCase());
        }
        if (!TextUtils.isEmpty(strJ)) {
            sb2.append(strJ.trim().toUpperCase());
        }
        return ga.b(sb2.toString());
    }

    private String j() {
        StringBuilder sb2;
        String string;
        if (!TextUtils.isEmpty(h())) {
            sb2 = new StringBuilder();
            sb2.append("12");
            string = h();
        } else if (!TextUtils.isEmpty(g())) {
            sb2 = new StringBuilder();
            sb2.append("22");
            string = g();
        } else if (TextUtils.isEmpty(l())) {
            sb2 = new StringBuilder();
            sb2.append("42");
            string = UUID.randomUUID().toString();
        } else {
            sb2 = new StringBuilder();
            sb2.append(BBSLinkObj.CONTENT_TYPE_REC_LINK);
            string = this.f36322d;
        }
        sb2.append(c(string));
        return sb2.toString();
    }

    private String k() {
        StringBuilder sb2;
        String string;
        if (TextUtils.isEmpty(h())) {
            sb2 = new StringBuilder();
            sb2.append("42");
            string = UUID.randomUUID().toString();
        } else {
            sb2 = new StringBuilder();
            sb2.append("12");
            string = h();
        }
        sb2.append(c(string));
        return sb2.toString();
    }

    private String l() {
        fz.a(ax.g()).B().a(new fz.a() { // from class: cn.fly.verify.eo.1
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                String strA = bVar.A();
                List<String> listAsList = Arrays.asList("00000000-0000-0000-0000-000000000000", "00000000000000000000000000000000");
                ay.d dVarI = bv.a().i();
                if (dVarI != null && dVarI.d() != null) {
                    listAsList = dVarI.d();
                }
                if (TextUtils.isEmpty(strA) || listAsList.contains(strA)) {
                    return;
                }
                eo.this.f36322d = strA;
            }
        });
        return this.f36322d;
    }

    private String m() throws Throwable {
        final String[] strArr = {null};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ep.f36340c.execute(new gu() { // from class: cn.fly.verify.eo.3
            @Override // cn.fly.verify.gu
            protected void a() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strA = ba.a("061iUgklhffjjhjjjRh<ghkmjl%heZfnffKiXjjhkRehFghfejnfnfkglfkhhkmjjlhkmjffn^k+glgkMe$gkjkhh)eJhhfnfmhkgljkfejgjhjgWePjjjhjhkmkm,e=jhhj");
                UUID uuid = new UUID(-1301668207276963122L, -6645017420763422227L);
                MediaDrm mediaDrm = null;
                try {
                    try {
                        MediaDrm mediaDrm2 = new MediaDrm(uuid);
                        try {
                            ex.a(ax.g()).a(mediaDrm2.getClass(), mediaDrm2, ba.a("012gfk fkffQh9fjhkJhk<fiHl"), new Class[]{Object.class, byte[].class, String.class}, new Object[]{new WeakReference(mediaDrm2), eo.this.a(uuid), strA}, (Object) null);
                            byte[] propertyByteArray = mediaDrm2.getPropertyByteArray(ba.a("014Cfe6hTfffk2eh.gm5g)fkfgfiChAggfe"));
                            strArr[0] = ga.a(propertyByteArray, 0, propertyByteArray.length);
                            es.a().a("rddd wv c " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
                            countDownLatch.countDown();
                            if (Build.VERSION.SDK_INT >= 28) {
                                mediaDrm2.close();
                            } else {
                                mediaDrm2.release();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            mediaDrm = mediaDrm2;
                            try {
                                es.a().a(th);
                                countDownLatch.countDown();
                                if (Build.VERSION.SDK_INT >= 28) {
                                    if (mediaDrm != null) {
                                        mediaDrm.close();
                                    }
                                } else if (mediaDrm != null) {
                                    mediaDrm.release();
                                }
                            } catch (Throwable th3) {
                                try {
                                    countDownLatch.countDown();
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        if (mediaDrm != null) {
                                            mediaDrm.close();
                                        }
                                    } else if (mediaDrm != null) {
                                        mediaDrm.release();
                                    }
                                } catch (Throwable th4) {
                                    es.a().a(th4);
                                }
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        es.a().a(th5);
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        });
        countDownLatch.await(3L, TimeUnit.SECONDS);
        return strArr[0];
    }

    private String n() {
        final String[] strArr = new String[1];
        if (by.a(ba.a("003fii"))) {
            try {
                String strB = bv.a().b("key_pddt", (String) null);
                strArr[0] = strB;
                if (!TextUtils.isEmpty(strB)) {
                    long jB = bv.a().b("key_lgpdt", 0L);
                    long j10 = 604800000;
                    try {
                        j10 = Long.parseLong(String.valueOf(by.a(ba.a("006-hkgehkglQfl"), 604800))) * 1000;
                    } catch (Throwable unused) {
                    }
                    if (System.currentTimeMillis() - jB < j10) {
                        es.a().a("rddd che p useable", new Object[0]);
                        return strArr[0];
                    }
                }
                if (ba.a("004Pfffkfffm").equalsIgnoreCase(fz.d.k()) && Build.VERSION.SDK_INT <= 25) {
                    return null;
                }
                ba.a("006jVfi0f!hiKh9fk").equalsIgnoreCase(fz.d.k());
                final List<String> listO = o();
                if (!listO.isEmpty()) {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    final StringBuilder sb2 = new StringBuilder();
                    fz.c cVarA = fz.a(ax.g());
                    Iterator<String> it = listO.iterator();
                    while (it.hasNext()) {
                        cVarA.b(it.next(), 1);
                    }
                    cVarA.a(new fz.a() { // from class: cn.fly.verify.eo.4
                        @Override // cn.fly.verify.fz.a
                        public void a(fz.b bVar) {
                            int i10 = 0;
                            for (int i11 = 0; i11 < listO.size(); i11++) {
                                try {
                                    ApplicationInfo applicationInfoH = bVar.h(i11);
                                    if (applicationInfoH != null) {
                                        sb2.append((String) listO.get(i11));
                                        sb2.append(fk.a(applicationInfoH, (String) listO.get(i11)));
                                        i10++;
                                    }
                                } catch (Throwable th2) {
                                    countDownLatch.countDown();
                                    throw th2;
                                }
                            }
                            if (i10 > 0) {
                                StringBuilder sb3 = sb2;
                                String str = Build.BRAND;
                                Locale locale = Locale.ROOT;
                                sb3.append(str.toUpperCase(locale));
                                sb3.append(Build.MODEL.toUpperCase(locale));
                                sb3.append(Build.MANUFACTURER.toUpperCase(locale));
                                sb2.append(i10);
                                strArr[0] = ga.b(sb2.toString());
                                bv.a().a("key_pddt", strArr[0]);
                                bv.a().a("key_lgpdt", System.currentTimeMillis());
                            }
                            countDownLatch.countDown();
                        }
                    });
                    try {
                        countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        return strArr[0];
    }

    private List<String> o() {
        final ArrayList arrayList = new ArrayList();
        fz.a(ax.g()).k().a(new fz.a() { // from class: cn.fly.verify.eo.5
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                if (bVar.k() == null || bVar.k().isEmpty()) {
                    return;
                }
                Iterator<HashMap<String, String>> it = bVar.k().iterator();
                while (it.hasNext()) {
                    String str = it.next().get(ba.a("003l(gjgl"));
                    if (str != null && !str.contains("com.google.android") && !str.contains("com.miui.packageinstaller")) {
                        arrayList.add(str);
                    }
                }
                Collections.sort(arrayList);
            }
        });
        return arrayList;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, this.f36320b)) {
            return;
        }
        es.a().a("rddd saveRD pre is " + this.f36320b + " cur is " + str, new Object[0]);
        bv.a().a("key_rdt2", str);
    }

    public String b() {
        return "2";
    }

    public String c() {
        if (TextUtils.isEmpty(this.f36320b)) {
            String strB = bv.a().b("key_rdt2", (String) null);
            if (!TextUtils.isEmpty(strB)) {
                this.f36320b = strB;
            }
        }
        return this.f36320b;
    }

    public boolean d() {
        if (!TextUtils.isEmpty(this.f36320b)) {
            return false;
        }
        synchronized (this) {
            if (!TextUtils.isEmpty(this.f36320b)) {
                return false;
            }
            return TextUtils.isEmpty(bv.a().b("key_rdt2", (String) null));
        }
    }

    public synchronized String e() {
        String strC;
        strC = c();
        if (TextUtils.isEmpty(strC)) {
            strC = j();
            this.f36320b = strC;
            if (!TextUtils.isEmpty(strC)) {
                bv.a().a("key_rdt2", strC);
            }
        }
        return strC;
    }

    public String f() {
        String strC = c();
        if (TextUtils.isEmpty(strC)) {
            strC = k();
            this.f36320b = strC;
            if (!TextUtils.isEmpty(strC)) {
                bv.a().a("key_rdt2", strC);
            }
        }
        return strC;
    }

    public String g() {
        if (TextUtils.isEmpty(this.f36321c)) {
            synchronized (this.f36325h) {
                if (TextUtils.isEmpty(this.f36321c)) {
                    this.f36321c = n();
                }
            }
        }
        return this.f36321c;
    }

    public String h() {
        if (TextUtils.isEmpty(this.f36319a)) {
            synchronized (this.f36324g) {
                if (TextUtils.isEmpty(this.f36319a)) {
                    try {
                        this.f36319a = m();
                        b(this.f36319a);
                    } catch (Throwable th2) {
                        es.a().a(th2);
                    }
                }
            }
        }
        return this.f36319a;
    }

    public HashMap<String, Integer> i() {
        return this.f36323f;
    }
}
