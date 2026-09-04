package com.tencent.qmsp.sdk.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.material.timepicker.TimeModel;
import com.tencent.qmsp.sdk.a.f;
import com.tencent.qmsp.sdk.f.g;
import com.tencent.qmsp.sdk.f.h;
import com.tencent.qmsp.sdk.f.k;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class c implements Handler.Callback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SharedPreferences f101860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.tencent.qmsp.sdk.d.b f101861i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, com.tencent.qmsp.sdk.b.b> f101853a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Object f101855c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f101856d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d.b f101857e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f101858f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f101859g = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f101862j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f101854b = new Handler(com.tencent.qmsp.sdk.app.b.e().b(), this);

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a();
        }
    }

    public class b implements com.tencent.qmsp.sdk.b.e {
        b() {
        }

        @Override // com.tencent.qmsp.sdk.b.e
        public void a(int i10, JSONObject jSONObject) {
            if (i10 != 161 || jSONObject == null) {
                return;
            }
            c.this.a(i10, jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.tencent.qmsp.sdk.d.c$c, reason: collision with other inner class name */
    public static class C0993c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f101865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f101866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f101867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f101868d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f101869e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f101870f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f101871g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f101872h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f101873i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f101874j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f101875k;

        public C0993c(int i10, int i11, String str, String str2, String str3, String str4, int i12, boolean z10, int i13, long j10, int i14) {
            this.f101865a = i10;
            this.f101866b = i11;
            this.f101867c = str;
            this.f101868d = str2;
            this.f101869e = str3;
            this.f101870f = str4;
            this.f101871g = i12;
            this.f101872h = z10;
            this.f101873i = i13;
            this.f101874j = j10;
            this.f101875k = i14;
        }

        public String toString() {
            return "filePath=" + this.f101867c + ",fileName=" + this.f101868d + ",fileId=" + this.f101866b + ",fileUrl=" + this.f101869e + ",fileHash=" + this.f101870f + ",fileVersion=" + this.f101871g + ",zipFlag=" + this.f101872h + ",startTime=" + this.f101874j + ",tryTimes=" + this.f101873i + ",downloadFlag=" + this.f101875k;
        }
    }

    public c(Context context) {
        this.f101860h = null;
        this.f101861i = null;
        this.f101860h = context.getSharedPreferences(com.tencent.qmsp.sdk.c.b.f101769a + a(d.f101877b), 0);
        this.f101861i = new com.tencent.qmsp.sdk.d.b();
    }

    private int a(int i10, String str) {
        String strA;
        try {
            if (i10 == 0) {
                g.a("Qp.QUM", 1, "No matched update from server.");
                return -1;
            }
            if (this.f101860h.getInt(a(d.f101879d), 0) < i10) {
                return 0;
            }
            String strC = c();
            if (new File(strC).exists() && (strA = com.tencent.qmsp.sdk.d.a.a(strC)) != null && strA.equalsIgnoreCase(str)) {
                return strA.equalsIgnoreCase(str) ? 1 : -1;
            }
            return 0;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private String a(byte[] bArr) {
        return h.a(bArr);
    }

    private void a(int i10, int i11) {
        try {
            JSONObject jSONObjectA = com.tencent.qmsp.sdk.a.d.a(2);
            if (jSONObjectA == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.tencent.qmsp.sdk.a.e.a(20), i10);
            jSONObject.put(com.tencent.qmsp.sdk.a.e.a(21), i11);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.tencent.qmsp.sdk.a.e.a(15), jSONObjectA);
            jSONObject2.put(com.tencent.qmsp.sdk.a.e.a(16), jSONObject);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[SFU] request : ");
            sb2.append(jSONObject2.toString());
            g.d("Qp.QUM", 0, sb2.toString());
            com.tencent.qmsp.sdk.b.g.b().a(2, com.tencent.qmsp.sdk.app.a.getAppID(), 2, jSONObject2, new b());
            a("0X80078AA", i10, this.f101862j, "", "");
            g.a("Qp.QUM", 1, String.format("[SFU] send update query: fileid=%d, localversion=%d", Integer.valueOf(i10), Integer.valueOf(i11)));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void a(String str, int i10, int i11, String str2, String str3) {
        String str4 = String.format(TimeModel.f55754j, Integer.valueOf(i10));
        d.b bVar = this.f101857e;
        int i12 = bVar != null ? (int) bVar.f101894b : 0;
        String str5 = bVar != null ? String.format(TimeModel.f55754j, Long.valueOf(bVar.f101893a)) : "";
        g.a("Qp.QUM", 1, String.format("[SFU] report: actiontype=%s, actionname=%s, actionfrom=%d, actionresult=%d, sectionId=%s, reportId=%s, fileInfo: %s", str, str, Integer.valueOf(i12), Integer.valueOf(this.f101856d), str5, str4, "", ""));
        com.tencent.qmsp.sdk.a.g gVar = new com.tencent.qmsp.sdk.a.g();
        try {
            gVar.a(str).a(str4).a(str5).a(this.f101856d).a(i11).a(str2).a(str3);
            f.a(gVar.toString(), 2);
        } catch (Exception e10) {
            e10.printStackTrace();
            g.b(g.f101940a, 0, "onReport error! <JsonObject userData>!");
        }
    }

    private void a(boolean z10, com.tencent.qmsp.sdk.b.b bVar) {
        int i10;
        if (!z10 || bVar == null) {
            a(3);
            return;
        }
        File file = new File(bVar.f101722b);
        C0993c c0993c = (C0993c) bVar.a();
        if (!file.exists() || c0993c == null) {
            a(3);
            return;
        }
        g.a("Qp.QUM", 1, String.format("[SFU] http download complete: %s, %s", bVar.f101722b, c0993c.f101869e));
        int i11 = c0993c.f101865a;
        if (i11 == 1) {
            File file2 = new File(c());
            new File(bVar.f101722b).renameTo(file2);
            a("0X80078AC", c0993c.f101871g, this.f101862j, "", "");
            if (!this.f101861i.a(file2.toString())) {
                a("0X80078AD", c0993c.f101871g, this.f101862j, c0993c.f101868d, c0993c.f101869e);
                g.a("Qp.QUM", 1, "[SFU] invalid config (sig not accepted)");
                a(1);
                return;
            } else {
                this.f101860h.edit().putInt(a(d.f101879d), c0993c.f101871g).commit();
                if (this.f101861i.a().isEmpty()) {
                    g.a("Qp.QUM", 1, "[SFU] config ok but without any sections");
                    i10 = 16;
                } else {
                    i10 = 5;
                }
            }
        } else {
            if (i11 != 2) {
                return;
            }
            a("0X80078AE", c0993c.f101871g, this.f101862j, "", "");
            i10 = 7;
        }
        b(i10);
    }

    private boolean a(C0993c c0993c) {
        if (c0993c == null) {
            return false;
        }
        if (c0993c.f101865a == 2 && c0993c.f101875k != 1 && !com.tencent.qmsp.sdk.f.f.b(com.tencent.qmsp.sdk.app.a.getContext())) {
            g.a("Qp.QUM", 1, "[SFU] donot download file because not using wifi");
            com.tencent.qmsp.sdk.a.a.a(3, 3);
            return false;
        }
        if (c0993c.f101873i < 3 && this.f101853a.contains(c0993c.f101870f.toLowerCase())) {
            return false;
        }
        com.tencent.qmsp.sdk.b.b bVar = new com.tencent.qmsp.sdk.b.b();
        bVar.f101721a = c0993c.f101869e;
        bVar.f101722b = c0993c.f101867c + c0993c.f101868d;
        bVar.f101724d = c0993c.f101868d;
        bVar.f101723c = c0993c.f101867c;
        c0993c.f101873i = c0993c.f101873i + 1;
        bVar.a(c0993c);
        this.f101853a.put(c0993c.f101870f.toLowerCase(), bVar);
        try {
            com.tencent.qmsp.sdk.b.d.a(bVar);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        g.a("Qp.QUM", 1, String.format("[SFU] begin http download %s", c0993c.f101869e));
        return true;
    }

    private boolean a(d.b bVar) throws Throwable {
        boolean z10;
        if (bVar != null) {
            g.a("Qp.QUM", 1, String.format("[SFU] backup: sid=%d", Long.valueOf(bVar.f101893a)));
            long j10 = bVar.f101910r;
            long j11 = 0;
            if (j10 == 0) {
                g.a("Qp.QUM", 1, "[SFU] no files need to backup");
            } else {
                if (j10 > 0) {
                    String strF = f(bVar);
                    for (int i10 = 0; i10 < bVar.f101909q.size(); i10++) {
                        d.a aVar = bVar.f101909q.get(i10);
                        if (1 == aVar.f101892j) {
                            a(new File(aVar.f101888f), new File(strF + aVar.f101885c));
                            j11++;
                        }
                    }
                    g.a("Qp.QUM", 1, String.format("[SFU] backup %d files of %d", Long.valueOf(j11), Integer.valueOf(bVar.f101909q.size())));
                    if (bVar.f101910r == j11) {
                    }
                }
                z10 = false;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        g.a("Qp.QUM", 1, String.format("[SFU] backup result: %b", Boolean.valueOf(z10)));
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[SYNTHETIC] */
    private boolean a(File file, File file2) throws Throwable {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream3 = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            if (!file2.exists()) {
                File file3 = new File(file2.getParent());
                if (!file3.exists() && !file3.mkdirs()) {
                    return false;
                }
            } else if (!file2.delete()) {
                return false;
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(file2);
            try {
                bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    byte[] bArrA = com.tencent.qmsp.sdk.f.a.a().a(4096);
                    while (true) {
                        int i10 = bufferedInputStream2.read(bArrA);
                        if (i10 == -1) {
                            break;
                        }
                        fileOutputStream3.write(bArrA, 0, i10);
                        fileOutputStream3.flush();
                    }
                    com.tencent.qmsp.sdk.f.a.a().a(bArrA);
                    try {
                        fileOutputStream3.close();
                    } catch (IOException unused) {
                    }
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused2) {
                    }
                    return true;
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream2 = fileOutputStream3;
                    try {
                        e.printStackTrace();
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (bufferedInputStream2 != null) {
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException unused4) {
                            }
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream3 = fileOutputStream2;
                        bufferedInputStream3 = bufferedInputStream2;
                        bufferedInputStream = bufferedInputStream3;
                        fileOutputStream = fileOutputStream3;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (bufferedInputStream != null) {
                            throw th;
                        }
                        try {
                            bufferedInputStream.close();
                            throw th;
                        } catch (IOException unused6) {
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream3 = bufferedInputStream2;
                    bufferedInputStream = bufferedInputStream3;
                    fileOutputStream = fileOutputStream3;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (bufferedInputStream != null) {
                        throw th;
                    }
                    bufferedInputStream.close();
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                bufferedInputStream2 = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = bufferedInputStream3;
                fileOutputStream = fileOutputStream3;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (bufferedInputStream != null) {
                    throw th;
                }
                bufferedInputStream.close();
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            bufferedInputStream2 = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedInputStream = null;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (bufferedInputStream != null) {
                throw th;
            }
            bufferedInputStream.close();
            throw th;
        }
    }

    private void b() {
        try {
            this.f101860h.edit().putLong(a(d.f101878c), System.currentTimeMillis()).commit();
            b(2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void b(int i10) {
        d.b bVar;
        int i11 = 0;
        g.a("Qp.QUM", 2, String.format("[SFU] update event: %d", Integer.valueOf(i10)));
        int i12 = 6;
        int i13 = 8;
        try {
            if (i10 != 1) {
                if (i10 == 2) {
                    i();
                    return;
                }
                switch (i10) {
                    case 5:
                        if (d() && (bVar = this.f101857e) != null) {
                            if (!e(bVar)) {
                                i12 = 15;
                            }
                        }
                        break;
                    case 6:
                        d.b bVar2 = this.f101857e;
                        if (bVar2 == null || !d(bVar2)) {
                            i11 = 3;
                            a(i11);
                        }
                        break;
                    case 7:
                        d.b bVar3 = this.f101857e;
                        if (bVar3 != null && n(bVar3)) {
                            i12 = 8;
                        } else {
                            a("0X80078AF", 0, this.f101862j, "", "");
                            i11 = 4;
                            a(i11);
                        }
                        break;
                    case 8:
                        d.b bVar4 = this.f101857e;
                        if (bVar4 != null && k(bVar4)) {
                            i12 = 9;
                        } else {
                            a("0X80078B0", 0, this.f101862j, "", "");
                            i11 = 5;
                            a(i11);
                        }
                        break;
                    case 9:
                        d.b bVar5 = this.f101857e;
                        if (bVar5 != null && a(bVar5)) {
                            i12 = 10;
                        } else {
                            a("0X80078B1", 0, this.f101862j, "", "");
                            i11 = 6;
                            a(i11);
                        }
                        break;
                    case 10:
                        d.b bVar6 = this.f101857e;
                        if (bVar6 != null && l(bVar6)) {
                            i12 = 11;
                        } else {
                            i13 = 7;
                            c(i13);
                            i12 = 13;
                        }
                        break;
                    case 11:
                        d.b bVar7 = this.f101857e;
                        if (bVar7 != null && m(bVar7)) {
                            i12 = 12;
                        } else {
                            c(i13);
                            i12 = 13;
                        }
                        break;
                    case 12:
                        d.b bVar8 = this.f101857e;
                        if (bVar8 == null || !c(bVar8)) {
                            i11 = 9;
                        }
                        a(i11);
                        break;
                    case 13:
                        d.b bVar9 = this.f101857e;
                        if (bVar9 == null || !j(bVar9)) {
                            a("0X80078B3", 0, this.f101862j, "", "");
                            i11 = 10;
                        }
                        a(i11);
                        break;
                    case 14:
                        d.b bVar10 = this.f101857e;
                        if (bVar10 != null) {
                            b(bVar10);
                        }
                        i12 = 15;
                        break;
                    case 15:
                        i(this.f101857e);
                        this.f101857e = null;
                        i12 = !f() ? 5 : 16;
                        break;
                    case 16:
                        g();
                        break;
                    case 17:
                        h();
                        break;
                }
            }
            i12 = this.f101856d == 1 ? 17 : 14;
            b(i12);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void b(com.tencent.qmsp.sdk.b.c cVar) {
        if (cVar == null) {
            return;
        }
        int i10 = cVar.f101726a;
        if (i10 == 2) {
            g.a("Qp.QUM", 1, String.format("[SFU] http download error=%d", Integer.valueOf(i10)));
            return;
        }
        C0993c c0993c = (C0993c) cVar.f101727b.a();
        if (c0993c == null) {
            return;
        }
        boolean z10 = cVar.f101726a == 0;
        if (!z10) {
            try {
                int i11 = c0993c.f101873i;
                if (i11 < 3) {
                    g.a("Qp.QUM", 1, String.format("[SFU] retried to download, retry=%d, result=%b, url=%s", Integer.valueOf(i11), Boolean.valueOf(z10), c0993c.f101869e));
                    a(c0993c);
                    return;
                } else {
                    File file = new File(cVar.f101727b.f101722b);
                    if (file.exists()) {
                        file.delete();
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                return;
            }
        }
        this.f101853a.remove(c0993c.f101870f.toLowerCase());
        a(z10, cVar.f101727b);
    }

    private void b(d.b bVar) {
        if (bVar != null) {
            g.a("Qp.QUM", 1, String.format("[SFU] cleanup: sid=%d", Long.valueOf(bVar.f101893a)));
            com.tencent.qmsp.sdk.f.d.a(g(bVar), false);
        }
    }

    private String c() {
        return e() + a(d.f101876a);
    }

    private void c(int i10) {
        this.f101856d = i10;
    }

    private boolean c(d.b bVar) {
        return true;
    }

    private boolean d() {
        boolean z10;
        this.f101857e = null;
        List<d.b> listA = this.f101861i.a();
        for (int i10 = 0; i10 < listA.size(); i10++) {
            d.b bVar = listA.get(i10);
            if (!bVar.a()) {
                if (bVar.f101905m && bVar.f101904l && bVar.f101906n) {
                    this.f101857e = bVar;
                    c(0);
                    g.a("Qp.QUM", 1, String.format("[SFU] next update: sid=%d", Long.valueOf(this.f101857e.f101893a)));
                    z10 = true;
                    g.a("Qp.QUM", 1, String.format("[SFU] get next section result? %b", Boolean.valueOf(z10)));
                    return z10;
                }
                g.d("Qp.QUM", 1, String.format("[SFU] not matched section: sid=%d, os: %b, qq:%b, cpu:%b", Long.valueOf(bVar.f101893a), Boolean.valueOf(bVar.f101905m), Boolean.valueOf(bVar.f101904l), Boolean.valueOf(bVar.f101906n)));
                bVar.b();
            }
        }
        z10 = false;
        g.a("Qp.QUM", 1, String.format("[SFU] get next section result? %b", Boolean.valueOf(z10)));
        return z10;
    }

    private boolean d(d.b bVar) {
        if (bVar == null) {
            return false;
        }
        g.a("Qp.QUM", 1, String.format("[SFU] download package: sid=%d", Long.valueOf(bVar.f101893a)));
        return a(new C0993c(2, 0, g(bVar), bVar.f101895c, bVar.f101897e, bVar.f101896d, 0, true, 0, System.currentTimeMillis(), bVar.f101913u));
    }

    private String e() {
        String strC = com.tencent.qmsp.sdk.a.b.c();
        File file = new File(strC);
        if (!file.exists()) {
            file.mkdirs();
        }
        return strC;
    }

    private boolean e(d.b bVar) {
        if (bVar == null) {
            return false;
        }
        g.a("Qp.QUM", 1, String.format("[SFU] get different: sid=%d", Long.valueOf(bVar.f101893a)));
        List<d.a> list = bVar.f101907o;
        for (int i10 = 0; i10 < list.size(); i10++) {
            d.a aVar = list.get(i10);
            if (new File(aVar.f101888f).exists()) {
                String strA = com.tencent.qmsp.sdk.d.a.a(aVar.f101888f);
                if (strA == null || !strA.equalsIgnoreCase(aVar.f101884b)) {
                    aVar.f101892j = 1;
                    if (strA == null) {
                        strA = "";
                    }
                    aVar.f101885c = strA;
                    bVar.f101909q.add(aVar);
                    bVar.f101910r++;
                }
            } else {
                aVar.f101892j = 2;
                bVar.f101909q.add(aVar);
            }
        }
        g.a("Qp.QUM", 1, String.format("[SFU] need to update %d files of %d", Integer.valueOf(bVar.f101909q.size()), Integer.valueOf(bVar.f101907o.size())));
        return !bVar.f101909q.isEmpty();
    }

    private String f(d.b bVar) {
        String str = g(bVar) + "bak" + File.separator;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    private boolean f() {
        boolean z10;
        List<d.b> listA = this.f101861i.a();
        int i10 = 0;
        while (true) {
            if (i10 >= listA.size()) {
                z10 = true;
                break;
            }
            if (!listA.get(i10).a()) {
                z10 = false;
                break;
            }
            i10++;
        }
        Object[] objArr = new Object[1];
        objArr[0] = z10 ? "yes" : "no";
        g.a("Qp.QUM", 1, String.format("[SFU] all complete: %s", objArr));
        return z10;
    }

    private String g(d.b bVar) {
        String str = e() + bVar.f101893a + File.separator;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    private void g() {
        g.a("Qp.QUM", 1, "[SFU] all sections update complete");
        try {
            if (!TextUtils.isEmpty(this.f101858f)) {
                com.tencent.qmsp.sdk.c.f.i().e();
                this.f101860h.edit().putString(a(d.f101880e), this.f101858f).putString(a(d.f101881f), this.f101859g).commit();
                a("0X80078B6", 0, this.f101862j, this.f101858f, this.f101859g);
            }
            g.a("Qp.QUM", 1, String.format("[SFU] notify update complete: %s", this.f101858f));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private String h(d.b bVar) {
        return g(bVar) + bVar.f101895c;
    }

    private void h() {
        synchronized (this.f101855c) {
            a("0X80078B5", 0, this.f101862j, "", "");
            this.f101857e = null;
            g.a("Qp.QUM", 1, "[SFU] update ended");
        }
    }

    private void i() {
        a(1, this.f101860h.getInt(a(d.f101879d), 0));
        this.f101860h.edit().remove(a(d.f101880e)).commit();
    }

    private void i(d.b bVar) {
        if (bVar != null) {
            g.a("Qp.QUM", 1, String.format("[SFU] update complete: sid=%d", Long.valueOf(bVar.f101893a)));
            bVar.b();
            if (j()) {
                this.f101858f += String.format("#%d#", Long.valueOf(bVar.f101894b));
                this.f101859g += String.format("#%d#", Long.valueOf(bVar.f101893a));
            }
            a("0X80078B4", 0, this.f101862j, "", "");
        }
    }

    private boolean j() {
        return this.f101856d == 0;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    private boolean j(d.b bVar) throws Throwable {
        boolean z10;
        if (bVar != null) {
            g.a("Qp.QUM", 1, String.format("[SFU] rollback: sid=%d", Long.valueOf(bVar.f101893a)));
            if (bVar.f101908p.isEmpty()) {
                g.a("Qp.QUM", 1, "[SFU] no files need to rollback");
            } else {
                String strF = f(bVar);
                long j10 = 0;
                for (int i10 = 0; i10 < bVar.f101908p.size(); i10++) {
                    d.a aVar = bVar.f101908p.get(i10);
                    File file = new File(aVar.f101888f);
                    File file2 = new File(aVar.f101889g);
                    if (file2.exists()) {
                        if (!file2.delete()) {
                            file2.deleteOnExit();
                        }
                        j10++;
                    }
                    if (aVar.f101892j == 2 && file.exists()) {
                        if (!file.delete()) {
                            file.deleteOnExit();
                        }
                        j10++;
                    }
                    File file3 = new File(strF, aVar.f101885c);
                    if (file3.exists() && file3.canRead() && file.exists() && file.canWrite()) {
                        a(file3, file);
                        j10++;
                    }
                }
                if (j10 != bVar.f101908p.size()) {
                    z10 = false;
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        g.a("Qp.QUM", 1, String.format("[SFU] rollback result: %b", Boolean.valueOf(z10)));
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    private boolean k(d.b bVar) {
        boolean z10;
        if (bVar != null) {
            g.a("Qp.QUM", 1, String.format("[SFU] unzip package: sid=%d", Long.valueOf(bVar.f101893a)));
            String strG = g(bVar);
            File file = new File(strG);
            if (!file.exists()) {
                file.mkdir();
            }
            if (k.a(h(bVar), strG) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        g.a("Qp.QUM", 1, String.format("[SFU] unzip result: %b", Boolean.valueOf(z10)));
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x011c  */
    private boolean l(d.b bVar) throws Throwable {
        boolean z10;
        if (bVar == null || bVar.f101909q.isEmpty()) {
            z10 = false;
        } else {
            g.a("Qp.QUM", 1, String.format("[SFU] do update files: sid=%d", Long.valueOf(bVar.f101893a)));
            String strG = g(bVar);
            for (int i10 = 0; i10 < bVar.f101909q.size(); i10++) {
                d.a aVar = bVar.f101909q.get(i10);
                File file = new File(strG, aVar.f101884b);
                File file2 = new File(aVar.f101888f);
                if (file.exists() && file.canRead()) {
                    boolean zA = a(file, file2);
                    if (!zA) {
                        String str = aVar.f101888f + ".1";
                        File file3 = new File(str);
                        aVar.f101892j = 3;
                        aVar.f101889g = str;
                        zA = a(file, file3);
                        g.a("Qp.QUM", 1, String.format("[SFU] copied failed, renamed to: %s", aVar.f101889g));
                        if (zA) {
                            this.f101860h.edit().putString(aVar.f101888f, aVar.f101889g).commit();
                        }
                    }
                    if (!zA) {
                        a("0X80078B2", (int) aVar.f101890h, this.f101862j, aVar.f101883a, aVar.f101884b);
                        g.a("Qp.QUM", 1, String.format("[SFU] failed copied: %s", aVar.f101888f));
                        break;
                    }
                    g.a("Qp.QUM", 1, String.format("[SFU] success copied: %s", aVar.f101888f));
                    bVar.f101908p.add(aVar);
                    bVar.f101911s++;
                } else {
                    g.a("Qp.QUM", 1, String.format("[SFU] copied failed, src not existed or cannot read: %s", file.toString()));
                }
            }
            g.a("Qp.QUM", 1, String.format("[SFU] update %d files of %d", Long.valueOf(bVar.f101911s), Integer.valueOf(bVar.f101909q.size())));
            if (bVar.f101911s == bVar.f101909q.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        g.a("Qp.QUM", 1, String.format("[SFU] update result: %b", Boolean.valueOf(z10)));
        return z10;
    }

    private boolean m(d.b bVar) {
        boolean z10;
        if (bVar != null) {
            g.a("Qp.QUM", 1, String.format("[SFU] verify: sid=%d", Long.valueOf(bVar.f101893a)));
            if (bVar.f101909q.isEmpty()) {
                g.a("Qp.QUM", 1, String.format("[SFU] no diff: sid=%d", Long.valueOf(bVar.f101893a)));
            } else {
                int i10 = 0;
                while (true) {
                    if (i10 < bVar.f101909q.size()) {
                        d.a aVar = bVar.f101909q.get(i10);
                        String strA = com.tencent.qmsp.sdk.d.a.a(TextUtils.isEmpty(aVar.f101889g) ? aVar.f101888f : aVar.f101889g);
                        if (strA == null || !strA.equalsIgnoreCase(aVar.f101884b)) {
                            g.a("Qp.QUM", 1, String.format("[SFU] not matched: %s!=%s, sid=%d", strA, aVar.f101884b, Long.valueOf(bVar.f101893a)));
                            z10 = false;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        g.a("Qp.QUM", 1, String.format("[SFU] verify result: %b", Boolean.valueOf(z10)));
        return z10;
    }

    private boolean n(d.b bVar) {
        boolean zEqualsIgnoreCase;
        if (bVar != null) {
            g.a("Qp.QUM", 1, String.format("[SFU] verify package: sid=%d", Long.valueOf(bVar.f101893a)));
            String strA = com.tencent.qmsp.sdk.d.a.a(h(bVar));
            if (strA == null) {
                return false;
            }
            zEqualsIgnoreCase = strA.equalsIgnoreCase(bVar.f101896d);
        } else {
            zEqualsIgnoreCase = false;
        }
        g.a("Qp.QUM", 1, String.format("[SFU] verify result: %b", Boolean.valueOf(zEqualsIgnoreCase)));
        return zEqualsIgnoreCase;
    }

    public void a() {
        if (!com.tencent.qmsp.sdk.app.a.getTaskStatus()) {
            g.a("Qp.QUM", 1, "[SFU] Plugin Update Task Finish！");
            return;
        }
        if (!com.tencent.qmsp.sdk.c.f.i().a(1001).booleanValue()) {
            a(com.tencent.qmsp.sdk.app.a.getAtomUpdateInterval().get());
            return;
        }
        long j10 = this.f101860h.getLong(a(d.f101878c), 0L);
        long jCurrentTimeMillis = System.currentTimeMillis() - j10;
        long j11 = jCurrentTimeMillis >= 0 ? jCurrentTimeMillis : 0L;
        long j12 = com.tencent.qmsp.sdk.app.a.getAtomUpdateInterval().get();
        g.a("Qp.QUM", 2, String.format("[SFU] startSFU last time: %d, interval: %d", Long.valueOf(j10), Long.valueOf(j11)));
        if (j11 >= com.tencent.qmsp.sdk.app.a.getAtomUpdateInterval().get()) {
            b();
        } else {
            j12 = ((long) com.tencent.qmsp.sdk.app.a.getAtomUpdateInterval().get()) - j11;
            g.a("Qp.QUM", 0, "[SFU] next time: " + j12);
        }
        a(j12);
    }

    protected void a(int i10) {
        g.b("Qp.QUM", 2, String.format("[SFU] update error: %d", Integer.valueOf(i10)));
        switch (i10) {
            case 1:
                File file = new File(c());
                if (file.exists()) {
                    file.delete();
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
                c(i10);
                break;
        }
        b(1);
    }

    public void a(int i10, Object obj) {
        String str;
        try {
            JSONObject jSONObject = (JSONObject) obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[SFU] rcv : ");
            sb2.append(obj);
            boolean zA = false;
            g.a("Qp.QUM", 0, sb2.toString());
            if (jSONObject != null) {
                int iOptInt = jSONObject.optInt("st");
                int iIntValue = Integer.valueOf(jSONObject.optString("tsi")).intValue();
                this.f101862j = iIntValue;
                a("0X80078B8", iOptInt, iIntValue, "", "");
                if (iOptInt == 0) {
                    int iOptInt2 = jSONObject.optInt("sc");
                    int iOptInt3 = jSONObject.optInt("fi");
                    int iOptInt4 = jSONObject.optInt("fv");
                    String str2 = (String) jSONObject.opt("fh");
                    String str3 = (String) jSONObject.opt("fu");
                    int iOptInt5 = jSONObject.optInt("zf");
                    boolean z10 = iOptInt5 == 1;
                    int iA = a(iOptInt4, str2);
                    g.a("Qp.QUM", 1, String.format("[SFU] resp: cmd=%d, status=%d, fileid=%d, fileversion=%d, md5=%s, url=%s, zipped: %d", Integer.valueOf(iOptInt2), Integer.valueOf(iOptInt), Integer.valueOf(iOptInt3), Integer.valueOf(iOptInt4), str2, str3, Integer.valueOf(iOptInt5)));
                    if (iA == 0) {
                        a("0X80078AB", iOptInt3, this.f101862j, "", "");
                        g.a("Qp.QUM", 1, String.format("Need to update config file, fileid=%d", Integer.valueOf(iOptInt3)));
                        zA = a(new C0993c(1, iOptInt3, e(), a(d.f101876a), str3, str2, iOptInt4, z10, 0, System.currentTimeMillis(), 1));
                    } else if (iA != 1) {
                        str = "[SFU] NO Need UPDATE";
                    } else if (this.f101861i.a(new File(c()).toString())) {
                        b(this.f101861i.a().isEmpty() ? 16 : 5);
                        zA = true;
                    }
                } else {
                    str = String.format("[SFU] Server replied with error, status=%d", Integer.valueOf(iOptInt));
                }
                g.a("Qp.QUM", 1, str);
            }
            if (zA) {
                return;
            }
            b(17);
        } catch (Exception e10) {
            e10.printStackTrace();
            b(17);
        }
    }

    public void a(long j10) {
        com.tencent.qmsp.sdk.c.f.i().c().postDelayed(new a(), j10);
    }

    public void a(com.tencent.qmsp.sdk.b.c cVar) {
        Handler handler = this.f101854b;
        if (handler != null) {
            handler.obtainMessage(1052688, cVar).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1052688) {
            return false;
        }
        b((com.tencent.qmsp.sdk.b.c) message.obj);
        return false;
    }
}
