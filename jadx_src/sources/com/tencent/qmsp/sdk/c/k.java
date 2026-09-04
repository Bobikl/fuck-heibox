package com.tencent.qmsp.sdk.c;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[][] f101819i = {new byte[]{44, 116}, new byte[]{org.apache.tools.tar.c.G, 105, -93, 69}, new byte[]{35, 124, -78, 71}, new byte[]{40, 127, -73, 69}, new byte[]{org.apache.tools.tar.c.I, 117, -95}, new byte[]{com.google.common.base.a.f56671x, 65, -125, 82, 33, 47, 114, -2, org.apache.tools.tar.c.G, 62, -126, 125, -96, 80}, new byte[]{com.google.common.base.a.f56671x, 125, -96, 80, com.google.common.base.a.G, 11}};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static k f101820j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.tencent.qmsp.sdk.c.g f101824d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f101826f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f101827g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CopyOnWriteArrayList<e> f101828h = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<f> f101822b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f101823c = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<Integer, f> f101821a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f101825e = new g(com.tencent.qmsp.sdk.app.b.e().c());

    public class a implements com.tencent.qmsp.sdk.c.g.c {
        a() {
        }

        @Override // com.tencent.qmsp.sdk.c.g.c
        public void a(List<Pair<Integer, Integer>> list) {
            Message messageObtainMessage = k.this.f101825e.obtainMessage(2);
            messageObtainMessage.obj = list;
            k.this.f101825e.sendMessage(messageObtainMessage);
        }
    }

    public final class b implements com.tencent.qmsp.sdk.c.a.InterfaceC0991a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f101830a;

        b(k kVar) {
        }

        @Override // com.tencent.qmsp.sdk.c.a.InterfaceC0991a
        public void a() {
            this.f101830a.f101836d = 26;
        }

        @Override // com.tencent.qmsp.sdk.c.a.InterfaceC0991a
        public void run() {
            f fVar;
            int i10;
            String str = this.f101830a.f101840h;
            if (str == null || str.contains("..")) {
                fVar = this.f101830a;
                i10 = 15;
            } else {
                File file = new File(this.f101830a.f101840h);
                if (file.exists()) {
                    this.f101830a.f101841i = new o();
                    int i11 = this.f101830a.f101834b;
                    if ((i11 == 2 || i11 == 1) && !com.tencent.qmsp.sdk.d.e.b(file, null)) {
                        this.f101830a.f101836d = 10;
                        return;
                    }
                    Object[] objArr = new Object[1];
                    f fVar2 = this.f101830a;
                    fVar2.f101836d = com.tencent.qmsp.sdk.c.f.a(2L, fVar2.f101834b, fVar2.f101833a, 0L, fVar2.f101840h, null, null, objArr);
                    Object obj = objArr[0];
                    if (obj == null || !(obj instanceof Integer)) {
                        return;
                    }
                    this.f101830a.f101838f = ((Integer) obj).intValue();
                    return;
                }
                fVar = this.f101830a;
                i10 = 12;
            }
            fVar.f101836d = i10;
        }
    }

    public class c extends i {
        c() {
            super(k.this, null);
        }

        @Override // com.tencent.qmsp.sdk.c.k.i
        public void a() {
            if (this.f101844a) {
                k.this.f101823c.a();
            }
        }

        @Override // com.tencent.qmsp.sdk.c.k.i
        public void a(String str, String str2, int i10, int i11, int i12, int i13) throws Throwable {
            com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("visitQSecSFUItem libPath = %s libVer = %s libId = %d", str, str2, Integer.valueOf(i10)));
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            if (i13 != 1 && i13 != 2) {
                com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Invalid mode: %d", Integer.valueOf(i13)));
                return;
            }
            j.a aVarA = k.this.f101823c.a(i10);
            if (aVarA != null) {
                k.this.f101823c.a(aVarA.f101814a, false);
            } else {
                aVarA = new j.a();
            }
            aVarA.f101814a = i10;
            aVarA.f101815b = i11;
            aVarA.f101816c = i12;
            aVarA.f101818e = str;
            aVarA.f101817d = str2;
            k.this.f101823c.a(aVarA, false);
            this.f101844a = true;
            com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("visitQSecSFUItem libId = %d", Integer.valueOf(i10)));
            if (i13 == 1 && k.this.f101824d.a(i10) == 1) {
                f fVar = (f) k.this.f101821a.get(Integer.valueOf(i10));
                if (fVar == null) {
                    k.this.c(k.this.a(aVarA));
                    return;
                }
                k.this.a(fVar, str2, str);
                if (fVar.f101836d != 0) {
                    k.this.f101821a.remove(Integer.valueOf(fVar.f101833a));
                }
            }
        }
    }

    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.i();
        }
    }

    public interface e {
        void a(int i10, int i11);
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f101833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f101834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f101835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f101836d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f101837e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f101838f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f101839g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f101840h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public o f101841i;

        private f() {
            this.f101836d = -1;
            this.f101839g = "";
            this.f101840h = "";
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    public class g extends Handler {
        public g(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            Object obj;
            int i10 = message.what;
            if (i10 == 1) {
                k.this.g();
                return;
            }
            if (i10 == 2) {
                Object obj2 = message.obj;
                if (obj2 != null) {
                    k.this.b((List<Pair<Integer, Integer>>) obj2);
                    return;
                }
                return;
            }
            if (i10 == 3) {
                k.this.h();
                return;
            }
            if (i10 == 4) {
                k.this.i();
            } else if (i10 == 5 && (obj = message.obj) != null) {
                k.this.c((e) obj);
            }
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private i f101843a;

        public h(i iVar) {
            this.f101843a = iVar;
        }

        public void a(int i10) {
            i iVar;
            List<com.tencent.qmsp.sdk.d.d.a> list;
            com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("QSecSFUReader read, bid = %d ", Integer.valueOf(i10)));
            try {
                try {
                    List<com.tencent.qmsp.sdk.d.d.b> listA = new com.tencent.qmsp.sdk.d.b().a(1L);
                    if (listA != null) {
                        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("QSecSFUReader read updateSections count = %d ", Integer.valueOf(listA.size())));
                        for (com.tencent.qmsp.sdk.d.d.b bVar : listA) {
                            if (bVar.f101894b == i10 && (list = bVar.f101907o) != null) {
                                for (com.tencent.qmsp.sdk.d.d.a aVar : list) {
                                    if (!TextUtils.isEmpty(aVar.f101891i)) {
                                        String str = aVar.f101888f;
                                        if (!TextUtils.isEmpty(aVar.f101889g)) {
                                            str = aVar.f101889g;
                                        }
                                        if (str != null) {
                                            com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("ExtraInfo: %s path: %s", aVar.f101891i, str));
                                            JSONObject jSONObject = new JSONObject(aVar.f101891i);
                                            int i11 = jSONObject.getInt(k.b(0));
                                            int i12 = jSONObject.getInt(k.b(1));
                                            int i13 = jSONObject.getInt(k.b(2));
                                            int i14 = jSONObject.getInt(k.b(3));
                                            String string = jSONObject.getString(k.b(4));
                                            i iVar2 = this.f101843a;
                                            if (iVar2 != null) {
                                                iVar2.a(str, string, i11, i12, i13, i14);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    iVar = this.f101843a;
                    if (iVar == null) {
                        return;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    iVar = this.f101843a;
                    if (iVar == null) {
                        return;
                    }
                }
                iVar.a();
            } catch (Throwable th2) {
                i iVar3 = this.f101843a;
                if (iVar3 != null) {
                    iVar3.a();
                }
                throw th2;
            }
        }
    }

    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected boolean f101844a;

        private i() {
            this.f101844a = false;
        }

        /* synthetic */ i(k kVar, a aVar) {
            this();
        }

        public void a() {
            if (this.f101844a) {
                k.this.f101823c.a();
            }
        }

        public void a(String str, String str2, int i10, int i11, int i12, int i13) throws Throwable {
            com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("visitQSecSFUItem libPath = %s libVer = %s libId = %d", str, str2, Integer.valueOf(i10)));
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            j.a aVarA = k.this.f101823c.a(i10);
            if (aVarA != null && str.equals(aVarA.f101818e) && str2.equals(aVarA.f101817d) && i11 == aVarA.f101815b && i12 == aVarA.f101816c) {
                return;
            }
            if (aVarA == null) {
                aVarA = new j.a();
            } else {
                k.this.f101823c.a(i10, false);
                com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Database info mismatch for lib: %d", Integer.valueOf(i10)));
            }
            aVarA.f101814a = i10;
            aVarA.f101815b = i11;
            aVarA.f101816c = i12;
            aVarA.f101818e = str;
            aVarA.f101817d = str2;
            com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Add lost lib: %d,%d,%d,%s", Integer.valueOf(i10), Integer.valueOf(aVarA.f101815b), Integer.valueOf(aVarA.f101816c), aVarA.f101818e));
            k.this.f101823c.a(aVarA, false);
            this.f101844a = true;
        }
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f a(j.a aVar) {
        f fVar = new f(null);
        fVar.f101833a = aVar.f101814a;
        fVar.f101834b = aVar.f101815b;
        fVar.f101835c = aVar.f101816c;
        fVar.f101840h = aVar.f101818e;
        fVar.f101839g = aVar.f101817d;
        fVar.f101837e = 4;
        return fVar;
    }

    private void a(int i10, int i11) {
        for (e eVar : this.f101828h) {
            com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Notify listener [%d:%d]", Integer.valueOf(i10), Integer.valueOf(i11)));
            eVar.a(i10, i11);
        }
    }

    private void a(f fVar) {
        this.f101822b.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(f fVar, String str, String str2) {
        e(fVar);
        if (fVar.f101837e == 4) {
            String str3 = fVar.f101840h;
            if (str3 != null && !str3.equals(str2)) {
                com.tencent.qmsp.sdk.f.d.a(fVar.f101840h, false);
                fVar.f101840h = str2;
            }
            String str4 = fVar.f101839g;
            if (str4 != null && !str4.equals(str)) {
                fVar.f101839g = str;
            }
            fVar.f101838f = 0;
            d(fVar);
            a(fVar);
        }
    }

    private void a(List<j.a> list) throws Throwable {
        for (j.a aVar : list) {
            this.f101823c.a(aVar.f101814a, false);
            String str = aVar.f101818e;
            if (str != null) {
                com.tencent.qmsp.sdk.f.d.a(str, false);
            }
        }
        this.f101823c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i10) {
        return com.tencent.qmsp.sdk.f.h.a(f101819i[i10]);
    }

    private void b(f fVar) {
        try {
            com.tencent.qmsp.sdk.a.g gVar = new com.tencent.qmsp.sdk.a.g();
            gVar.a(fVar.f101833a).a(fVar.f101839g).a(fVar.f101836d);
            com.tencent.qmsp.sdk.a.f.a(gVar.toString(), 3);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<Pair<Integer, Integer>> list) throws Throwable {
        if (list == null || !this.f101826f) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (Pair<Integer, Integer> pair : list) {
            com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("cb changed: id(%d), cb(%d)", pair.first, pair.second));
            f fVar = this.f101821a.get(pair.first);
            if (fVar == null) {
                j.a aVarA = this.f101823c.a(((Integer) pair.first).intValue());
                if (aVarA != null) {
                    if (((Integer) pair.second).intValue() == 1) {
                        c(a(aVarA));
                    } else if (((Integer) pair.second).intValue() == 2) {
                        linkedList.add(aVarA);
                    }
                }
            } else if (((Integer) pair.second).intValue() == 1) {
                if (fVar.f101837e == 4) {
                    d(fVar);
                    if (fVar.f101836d != 0) {
                        this.f101821a.remove(Integer.valueOf(fVar.f101833a));
                    }
                    a(fVar);
                }
            } else if (((Integer) pair.second).intValue() == 2 && fVar.f101837e == 4) {
                this.f101821a.remove(pair.first);
                j.a aVarA2 = this.f101823c.a(((Integer) pair.first).intValue());
                if (aVarA2 != null) {
                    linkedList.add(aVarA2);
                }
            }
        }
        if (linkedList.isEmpty()) {
            return;
        }
        a(linkedList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(e eVar) {
        for (Map.Entry<Integer, f> entry : this.f101821a.entrySet()) {
            if (entry.getValue().f101837e == 1) {
                com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Notify listener [%d:%d]", 1, entry.getKey()));
                eVar.a(1, entry.getKey().intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(f fVar) {
        d(fVar);
        if (fVar.f101836d == 0) {
            this.f101821a.put(Integer.valueOf(fVar.f101833a), fVar);
            a(1, fVar.f101833a);
        }
        a(fVar);
    }

    private void d() {
        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, "addLostUpgradeLibs");
        new h(new i(this, null)).a(1);
    }

    private void d(f fVar) {
        fVar.f101837e = 2;
        b bVar = new b(this);
        bVar.f101830a = fVar;
        new com.tencent.qmsp.sdk.c.a(String.format("Lib%d_%s", Integer.valueOf(fVar.f101833a), fVar.f101839g), x9.a.f141105g).a(bVar);
        Object[] objArr = new Object[3];
        String str = fVar.f101840h;
        if (str == null) {
            str = "null";
        }
        objArr[0] = str;
        objArr[1] = com.tencent.qmsp.sdk.a.c.a(fVar.f101838f);
        objArr[2] = Integer.valueOf(fVar.f101836d);
        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("load: %s ver: %s error: %08X", objArr));
        fVar.f101837e = fVar.f101836d != 0 ? 4 : 1;
    }

    public static k e() {
        if (f101820j == null) {
            synchronized (k.class) {
                if (f101820j == null) {
                    f101820j = new k();
                }
            }
        }
        return f101820j;
    }

    private void e(f fVar) {
        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Prepare to unload: %d,%d,%d,%d,%s,%s", Integer.valueOf(fVar.f101833a), Integer.valueOf(fVar.f101834b), Integer.valueOf(fVar.f101835c), Integer.valueOf(fVar.f101837e), fVar.f101839g, fVar.f101840h));
        if ((fVar.f101835c & 1) != 0 && fVar.f101837e == 1) {
            fVar.f101837e = 3;
            fVar.f101841i.c();
            int iA = com.tencent.qmsp.sdk.c.f.a(3L, fVar.f101833a, 0L, 0L, null, null, null, null);
            com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Unload ret: %d", Integer.valueOf(iA)));
            if (iA == 0) {
                fVar.f101837e = 4;
                a(2, fVar.f101833a);
            } else {
                fVar.f101837e = 5;
                fVar.f101836d = iA;
            }
        }
    }

    private void f() throws Throwable {
        List<j.a> listB = this.f101823c.b();
        if (listB == null || listB.isEmpty()) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (j.a aVar : listB) {
            int iA = this.f101824d.a(aVar.f101814a);
            Object[] objArr = new Object[6];
            objArr[0] = Integer.valueOf(aVar.f101814a);
            objArr[1] = Integer.valueOf(aVar.f101815b);
            objArr[2] = Integer.valueOf(aVar.f101816c);
            objArr[3] = aVar.f101817d;
            String str = aVar.f101818e;
            if (str == null) {
                str = "null";
            }
            objArr[4] = str;
            objArr[5] = Integer.valueOf(iA);
            com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("%d,%d,%d,%s,%s,%d", objArr));
            if (iA != 0 && -1 != iA) {
                if (2 == iA) {
                    linkedList.add(aVar);
                } else if (1 == iA) {
                    f fVarA = a(aVar);
                    c(fVarA);
                    a(fVarA);
                }
                if (!linkedList.isEmpty()) {
                    a(linkedList);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (!this.f101826f) {
            this.f101827g = true;
        } else {
            this.f101827g = false;
            new h(new c()).a(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() throws Throwable {
        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, "onLoadLocalLibs");
        if (this.f101826f) {
            return;
        }
        this.f101826f = true;
        d();
        f();
        if (this.f101827g) {
            b();
        }
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        long j10;
        long j11;
        SharedPreferences sharedPreferences = com.tencent.qmsp.sdk.app.a.getContext().getSharedPreferences(com.tencent.qmsp.sdk.c.b.f101769a + b(6), 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        try {
            j11 = 28800000;
            for (f fVar : this.f101822b) {
                try {
                    String strA = fVar.f101839g;
                    int i10 = fVar.f101838f;
                    if (i10 != 0) {
                        strA = com.tencent.qmsp.sdk.a.c.a(i10);
                    }
                    String str = String.format("Lib%d_%s_%s", Integer.valueOf(fVar.f101833a), com.tencent.qmsp.sdk.app.a.getUid(), strA);
                    String str2 = String.format("Lib%d_%s_%s_lpt", Integer.valueOf(fVar.f101833a), com.tencent.qmsp.sdk.app.a.getUid(), strA);
                    int i11 = sharedPreferences.getInt(str, -1);
                    long jCurrentTimeMillis = System.currentTimeMillis() - sharedPreferences.getLong(str2, 0L);
                    if (jCurrentTimeMillis >= 28800000 || fVar.f101836d != i11) {
                        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Rp: %d,%d,%s", Integer.valueOf(fVar.f101833a), Integer.valueOf(fVar.f101836d), strA));
                        editorEdit.putInt(str, fVar.f101836d);
                        editorEdit.putLong(str2, System.currentTimeMillis());
                        b(fVar);
                        this.f101822b.remove(fVar);
                    } else {
                        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Ignore rp for: %d,%08X,%s", Integer.valueOf(fVar.f101833a), Integer.valueOf(fVar.f101836d), strA));
                        long j12 = 28800000 - jCurrentTimeMillis;
                        if (j11 > j12) {
                            j11 = j12;
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    j10 = j11;
                    e.printStackTrace();
                    j11 = j10;
                }
            }
        } catch (Exception e11) {
            e = e11;
            j10 = 28800000;
        }
        editorEdit.commit();
        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, "next rp interval: " + j11);
        com.tencent.qmsp.sdk.c.f.i().c().postDelayed(new d(), j11);
    }

    private void j() {
        Handler handler = this.f101825e;
        handler.sendMessage(handler.obtainMessage(4));
    }

    public int a(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        int i13;
        int iA;
        f fVar = this.f101821a.get(Integer.valueOf(i10));
        if (fVar == null) {
            i13 = this.f101823c.a(i10) == null ? 4 : 17;
        } else if (i11 != 0 && i11 != fVar.f101838f) {
            i13 = 32;
        } else if (fVar.f101833a != i10) {
            i13 = 5;
        } else {
            int iA2 = this.f101824d.a(i10);
            if (1 == iA2 || iA2 == -1) {
                if (fVar.f101837e == 1 && fVar.f101841i.a()) {
                    iA = com.tencent.qmsp.sdk.c.f.a(4L, fVar.f101833a, i11, i12, null, null, objArr, objArr2);
                    fVar.f101841i.b();
                } else {
                    i13 = 7;
                }
                com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("dispatch to id: %d, cmd: %d, err: %d", Integer.valueOf(i10), Integer.valueOf(i12), Integer.valueOf(iA)));
                return iA;
            }
            i13 = 6;
        }
        iA = i13;
        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("dispatch to id: %d, cmd: %d, err: %d", Integer.valueOf(i10), Integer.valueOf(i12), Integer.valueOf(iA)));
        return iA;
    }

    public void a() {
        try {
            ConcurrentHashMap<Integer, f> concurrentHashMap = this.f101821a;
            if (concurrentHashMap != null) {
                for (Map.Entry<Integer, f> entry : concurrentHashMap.entrySet()) {
                    entry.getValue().f101835c = 1;
                    e(entry.getValue());
                }
            }
            if (f101820j != null) {
                f101820j = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(com.tencent.qmsp.sdk.c.g gVar) {
        this.f101824d = gVar;
        gVar.a(new a());
    }

    public void a(e eVar) {
        this.f101828h.add(eVar);
        Handler handler = this.f101825e;
        handler.sendMessage(handler.obtainMessage(5, eVar));
    }

    public void b() {
        Handler handler = this.f101825e;
        handler.sendMessage(handler.obtainMessage(1));
    }

    public void b(e eVar) {
        this.f101828h.remove(eVar);
    }

    public void c() {
        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("OnEveryLogin mHasLoadLocal = %b", Boolean.valueOf(this.f101826f)));
        if (this.f101826f) {
            return;
        }
        Handler handler = this.f101825e;
        handler.sendMessage(handler.obtainMessage(3));
    }
}
