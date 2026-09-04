package cn.fly.verify;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class bp extends bh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f35878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<HashMap<String, String>> f35879e;

    public bp() {
        super(eh.b("002ic"), 0L, eh.b("004icXehci"), 300L, bh.a(eh.b("002ic"), (Long) 0L));
        this.f35877c = null;
        this.f35878d = 0L;
        this.f35879e = null;
        try {
            File fileA = gj.a(ax.g(), ec.f36236c, true);
            if (!fileA.getParentFile().exists()) {
                fileA.getParentFile().mkdirs();
            }
            if (!fileA.exists()) {
                fileA.createNewFile();
            }
            this.f35877c = fileA.getAbsolutePath();
            this.f35878d = bv.a().b(bv.f35906b, -1L);
        } catch (Throwable unused) {
        }
    }

    private ArrayList<HashMap<String, String>> a(String str, String str2) {
        return a(str2, gj.b(new File(str)));
    }

    private static ArrayList<HashMap<String, String>> a(String str, byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    return b(ga.c(str.getBytes("UTF-8"), bArr));
                }
            } catch (Throwable th2) {
                es.a().b(th2);
                return new ArrayList<>();
            }
        }
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<HashMap<String, String>> a(ArrayList<HashMap<String, String>> arrayList) throws Throwable {
        ArrayList<HashMap<String, String>> arrayListA = !TextUtils.isEmpty(this.f35877c) ? a(this.f35877c, fz.d.j()) : null;
        if (arrayListA == null) {
            arrayListA = new ArrayList<>();
        }
        if (arrayListA.isEmpty()) {
            bv.a().a("key_rcdat", System.currentTimeMillis());
        }
        ArrayList<HashMap<String, String>> arrayList2 = this.f35879e;
        if (arrayList2 == null || arrayList2.isEmpty() || by.f35936a) {
            by.f35936a = false;
            this.f35879e = arrayList;
        }
        ArrayList<HashMap<String, String>> arrayList3 = this.f35879e;
        if (arrayList3 != null) {
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                HashMap<String, String> map = arrayList3.get(i10);
                String str = map != null ? map.get(eh.b("003iTdgdi")) : null;
                if (!TextUtils.isEmpty(str) && a(str)) {
                    HashMap<String, String> mapB = b(arrayListA, str);
                    mapB.put(eh.b("003i;dgdi"), str);
                    mapB.put(eh.b("004dc!cePe"), map.get(eh.b("004dc!cePe")));
                    mapB.put(eh.b("007>ccUeZciehchcjBd"), map.get(eh.b("007>ccUeZciehchcjBd")));
                    int i11 = mapB.get(eh.b("0080cicf(dhLchce[eYeh")) == null ? 0 : Integer.parseInt(String.valueOf(mapB.get(eh.b("0080cicf(dhLchce[eYeh"))));
                    mapB.put(eh.b("008AcicfLdhUchceTeReh"), (((long) i11) + l()) + "");
                    if (!a(arrayListA, str)) {
                        arrayListA.add(mapB);
                    }
                }
            }
        }
        return arrayListA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ArrayList<HashMap<String, String>> arrayList, String str, String str2) {
        gj.a(new File(str), a(str2, arrayList));
    }

    private boolean a(final String str) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        fz.a(ax.g()).a(true, str, 0).a(new fz.a() { // from class: cn.fly.verify.bp.2
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                boolean z10 = false;
                Object objL = bVar.l(new int[0]);
                if (objL == null) {
                    atomicBoolean.set(false);
                    return;
                }
                ApplicationInfo applicationInfoA = fk.a(objL, str);
                if (applicationInfoA != null) {
                    int i10 = applicationInfoA.flags;
                    boolean z11 = (i10 & 1) == 0 && (i10 & 128) == 0;
                    boolean z12 = (i10 & 2097152) == 0;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if (z11 && z12) {
                        z10 = true;
                    }
                    atomicBoolean2.set(z10);
                }
            }
        });
        return atomicBoolean.get();
    }

    private boolean a(ArrayList<HashMap<String, String>> arrayList, String str) {
        Iterator<HashMap<String, String>> it = arrayList.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().get(eh.b("003i@dgdi")))) {
                return true;
            }
        }
        return false;
    }

    private static byte[] a(String str, ArrayList<HashMap<String, String>> arrayList) {
        new ge();
        String strA = ge.a((Object) arrayList);
        try {
            return ga.a(str, strA);
        } catch (Throwable th2) {
            es.a().b(th2);
            return strA.getBytes();
        }
    }

    private static ArrayList<HashMap<String, String>> b(String str) {
        try {
            ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
            if (TextUtils.isEmpty(str)) {
                return arrayList;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(ge.a(jSONArray.getJSONObject(i10).toString()));
            }
            return arrayList;
        } catch (Throwable th2) {
            es.a().b(th2);
            return new ArrayList<>();
        }
    }

    private HashMap<String, String> b(ArrayList<HashMap<String, String>> arrayList, String str) {
        for (HashMap<String, String> map : arrayList) {
            if (str.equals(map.get(eh.b("003i$dgdi")))) {
                return map;
            }
        }
        return new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<HashMap<String, String>> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return false;
        }
        try {
            HashMap<String, Object> map = new HashMap<>();
            map.put(eh.b("008PciYeb.cjcicb=ch"), Long.valueOf(bv.a().b("key_rcdat", -1L)));
            a(0L, "PRTMT", arrayList, map, false);
        } catch (Throwable unused) {
        }
        bv.a().a(bv.f35906b, System.currentTimeMillis());
        return m();
    }

    private boolean m() {
        try {
            File file = new File(this.f35877c);
            file.delete();
            file.createNewFile();
            return true;
        } catch (Throwable th2) {
            es.a().a(th2);
            return false;
        }
    }

    @Override // cn.fly.verify.bh
    protected void a() {
        fz.a(ax.g()).a(false, false).a(new fz.a() { // from class: cn.fly.verify.bp.1
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) throws Throwable {
                ArrayList arrayListA = bp.this.a(bVar.d(new int[0]));
                if (!TextUtils.isEmpty(bp.this.f35877c)) {
                    bp bpVar = bp.this;
                    bpVar.a((ArrayList<HashMap<String, String>>) arrayListA, bpVar.f35877c, fz.d.j());
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - bp.this.f35878d < ((Long) bp.this.a(eh.b("005icAdi%ci"), 3600L)).longValue() * 1000 || !bp.this.b((ArrayList<HashMap<String, String>>) arrayListA)) {
                    return;
                }
                bp.this.f35878d = bv.a().b(bv.f35906b, -1L);
            }
        });
    }
}
