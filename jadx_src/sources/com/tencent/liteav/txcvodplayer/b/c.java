package com.tencent.liteav.txcvodplayer.b;

import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.ThreadUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.rtmp.TXPlayInfoParams;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String[] f100056a = {"playvideo.qcloud.com", "bkplayvideo.qcloud.com", "playvideo.vodglcdn.com"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static volatile String f100057g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    TXPlayInfoParams f100058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.tencent.liteav.txcvodplayer.b.b f100059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f100060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    List<String> f100061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f100062f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f100063h = ThreadUtils.getUiThreadHandler();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f f100064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f100065j;

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.c$1, reason: invalid class name */
    public final class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f100066a;

        AnonymousClass1(a aVar) {
            this.f100066a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final com.tencent.liteav.txcvodplayer.b.a aVar = com.tencent.liteav.txcvodplayer.b.a.C0960a.f100038a;
            final c cVar = c.this;
            final com.tencent.liteav.txcvodplayer.b.a.b bVar = new com.tencent.liteav.txcvodplayer.b.a.b() { // from class: com.tencent.liteav.txcvodplayer.b.c.1.1
                @Override // com.tencent.liteav.txcvodplayer.b.a.b
                public final void a() {
                    c.this.a(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.b.c.1.1.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            a aVar2 = AnonymousClass1.this.f100066a;
                            if (aVar2 != null) {
                                aVar2.a(-1, "http request error.");
                            }
                        }
                    });
                    String unused = c.f100057g = "";
                    com.tencent.liteav.txcvodplayer.c.a.a().a(c.f100057g);
                }

                @Override // com.tencent.liteav.txcvodplayer.b.a.b
                public final void a(String str, Map<String, String> map) {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    if (c.this.a(str, map, anonymousClass1.f100066a)) {
                        c.this.a(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.b.c.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                                a aVar2 = anonymousClass2.f100066a;
                                c cVar2 = c.this;
                                aVar2.a(cVar2, cVar2.f100058b);
                            }
                        });
                        if (c.this.f100061e != null) {
                            com.tencent.liteav.txcvodplayer.c.a aVarA = com.tencent.liteav.txcvodplayer.c.a.a();
                            String unused = c.f100057g = (String) c.this.f100061e.get(c.this.f100062f);
                            aVarA.a(c.f100057g);
                        }
                    }
                }
            };
            AsyncTask.execute(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.b.a.1

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private boolean f100036d = true;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private String f100037e;

                /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
                /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
                /* JADX WARN: Code duplicated, block: B:35:0x00eb  */
                /* JADX WARN: Code duplicated, block: B:40:0x0120  */
                /* JADX WARN: Code duplicated, block: B:43:0x016e  */
                /* JADX WARN: Code duplicated, block: B:51:0x019e  */
                /* JADX WARN: Code duplicated, block: B:54:0x01cd  */
                /* JADX WARN: Code duplicated, block: B:57:0x01e7  */
                /* JADX WARN: Code duplicated, block: B:59:0x01f4  */
                /* JADX WARN: Code duplicated, block: B:62:0x01fb  */
                /* JADX WARN: Code duplicated, block: B:63:0x0211  */
                /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
                
                    if (r1 == r0.f100061e.size()) goto L65;
                 */
                /* JADX WARN: Instruction removed from duplicated block: B:32:0x00d0, please report this as an issue */
                /* JADX WARN: Instruction removed from duplicated block: B:35:0x00eb, please report this as an issue */
                /* JADX WARN: Instruction removed from duplicated block: B:54:0x01cd, please report this as an issue */
                /* JADX WARN: Instruction removed from duplicated block: B:62:0x01fb, please report this as an issue */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                private java.net.URLConnection a() throws java.io.IOException {
                    /*
                        Method dump skipped, instruction units count: 610
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.txcvodplayer.b.a.AnonymousClass1.a():java.net.URLConnection");
                }

                /* JADX WARN: Code duplicated, block: B:57:0x00dc A[PHI: r4 r5
  0x00dc: PHI (r4v4 java.io.BufferedReader) = (r4v3 java.io.BufferedReader), (r4v6 java.io.BufferedReader) binds: [B:56:0x00da, B:67:0x0119] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r5v3 com.tencent.liteav.txcvodplayer.b.a$b) = (r5v2 com.tencent.liteav.txcvodplayer.b.a$b), (r5v5 com.tencent.liteav.txcvodplayer.b.a$b) binds: [B:56:0x00da, B:67:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    b bVar2;
                    BufferedReader bufferedReader = null;
                    boolean z10 = true;
                    while (z10) {
                        try {
                            try {
                                URLConnection uRLConnectionA = a();
                                if (uRLConnectionA == null) {
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!z10 || cVar.a()) {
                                        return;
                                    }
                                    LiteavLog.w("TXCHttpURLClient", "http retry request failed, no switch host!");
                                    b bVar3 = bVar;
                                    if (bVar3 != null) {
                                        bVar3.a();
                                        return;
                                    }
                                    return;
                                }
                                uRLConnectionA.setConnectTimeout(15000);
                                uRLConnectionA.setReadTimeout(15000);
                                uRLConnectionA.connect();
                                InputStream inputStream = uRLConnectionA.getInputStream();
                                if (inputStream == null) {
                                    b bVar4 = bVar;
                                    if (bVar4 != null) {
                                        bVar4.a();
                                    }
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    if (!z10 || cVar.a()) {
                                        return;
                                    }
                                    LiteavLog.w("TXCHttpURLClient", "http retry request failed, no switch host!");
                                    b bVar5 = bVar;
                                    if (bVar5 != null) {
                                        bVar5.a();
                                        return;
                                    }
                                    return;
                                }
                                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    while (true) {
                                        String line = bufferedReader2.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        sb2.append(line);
                                        sb2.append("\n");
                                    }
                                    this.f100036d = true;
                                    if (bVar != null) {
                                        bVar.a(sb2.toString(), a.a(uRLConnectionA.getHeaderFields()));
                                    }
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused3) {
                                    }
                                    z10 = false;
                                    bufferedReader = bufferedReader2;
                                } catch (SSLPeerUnverifiedException e10) {
                                    e = e10;
                                    bufferedReader = bufferedReader2;
                                    LiteavLog.w("TXCHttpURLClient", "playcgi get failed SSLPeerUnverifiedException. url: " + this.f100037e + "error: " + Log.getStackTraceString(e));
                                    this.f100036d = false;
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException unused4) {
                                        }
                                    }
                                    if (z10 && !cVar.a()) {
                                        LiteavLog.w("TXCHttpURLClient", "http retry request failed, no switch host!");
                                        bVar2 = bVar;
                                        if (bVar2 != null) {
                                            bVar2.a();
                                        }
                                        z10 = false;
                                    }
                                } catch (IOException e11) {
                                    e = e11;
                                    bufferedReader = bufferedReader2;
                                    LiteavLog.w("TXCHttpURLClient", "playcgi get failed. url: " + this.f100037e + " error: " + Log.getStackTraceString(e));
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException unused5) {
                                        }
                                    }
                                    if (z10 && !cVar.a()) {
                                        LiteavLog.w("TXCHttpURLClient", "http retry request failed, no switch host!");
                                        bVar2 = bVar;
                                        if (bVar2 != null) {
                                            bVar2.a();
                                        }
                                        z10 = false;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader = bufferedReader2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (SSLPeerUnverifiedException e12) {
                            e = e12;
                        } catch (IOException e13) {
                            e = e13;
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused6) {
                            }
                        }
                        if (!z10 || cVar.a()) {
                            throw th;
                        }
                        LiteavLog.w("TXCHttpURLClient", "http retry request failed, no switch host!");
                        b bVar6 = bVar;
                        if (bVar6 == null) {
                            throw th;
                        }
                        bVar6.a();
                        throw th;
                    }
                }
            });
        }
    }

    public interface a {
        void a(int i10, String str);

        void a(c cVar, TXPlayInfoParams tXPlayInfoParams);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f100079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f100080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f100081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f100082d;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.c$c, reason: collision with other inner class name */
    public static final class C0963c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<String> f100083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f100084b;
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f100085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f100086b;

        public final String toString() {
            return "TCPlayKeyFrameDescInfo{content='" + this.f100085a + "', time=" + this.f100086b + '}';
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f100087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f100088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f100089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f100090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f100091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f100092f;
    }

    public c(TXPlayInfoParams tXPlayInfoParams) {
        this.f100058b = tXPlayInfoParams;
    }

    private static String a(Map<String, String> map, String str) {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && key.equalsIgnoreCase(str)) {
                    return entry.getValue();
                }
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable) {
        if (ThreadUtils.runningOnUiThread()) {
            runnable.run();
        } else {
            this.f100063h.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0116  */
    public boolean a(String str, Map<String, String> map, final a aVar) {
        boolean z10;
        if (TextUtils.isEmpty(str)) {
            LiteavLog.e("TXCPlayInfoProtocolV4", "parseJson err, content is empty!");
            a(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.b.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(-1, "request return error!");
                }
            });
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            final int i10 = jSONObject.getInt("code");
            final String strOptString = jSONObject.optString("message");
            String strOptString2 = jSONObject.optString("warning");
            this.f100065j = jSONObject.optString(com.umeng.analytics.pro.d.R);
            LiteavLog.i("TXCPlayInfoProtocolV4", "context : " + this.f100065j);
            LiteavLog.i("TXCPlayInfoProtocolV4", "message: ".concat(String.valueOf(strOptString)));
            LiteavLog.i("TXCPlayInfoProtocolV4", "warning: ".concat(String.valueOf(strOptString2)));
            if (i10 != 0) {
                a(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.b.c.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(i10, strOptString);
                    }
                });
                return false;
            }
            int i11 = jSONObject.getInt("version");
            LiteavLog.i("TXCPlayInfoProtocolV4", "version: ".concat(String.valueOf(i11)));
            if (i11 == 2) {
                this.f100060d = null;
                this.f100064i = new f(jSONObject);
            } else if (i11 == 4) {
                this.f100059c = new com.tencent.liteav.txcvodplayer.b.b(jSONObject);
                b bVar = this.f100060d;
                if (bVar == null || TextUtils.isEmpty(bVar.f100080b) || TextUtils.isEmpty(this.f100060d.f100079a)) {
                    z10 = true;
                } else {
                    String strA = a(map, "x-vod-checksum");
                    String strB = com.tencent.liteav.txcplayer.a.a.b(this.f100060d.f100079a.toLowerCase() + this.f100060d.f100080b.toLowerCase() + str.trim());
                    if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strB) || strA.equalsIgnoreCase(strB)) {
                        z10 = true;
                    } else {
                        LiteavLog.w("TXCPlayInfoProtocolV4", "[checkResponseDataValid], response content not valid, vodChecksum=" + strA + " ,bodyMd5=" + strB + " ,content=" + str);
                        z10 = false;
                    }
                }
                if (z10) {
                    return true;
                }
                a(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.b.c.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(-1, "response data invalid!");
                    }
                });
                return false;
            }
            return true;
        } catch (JSONException e10) {
            e10.printStackTrace();
            LiteavLog.e("TXCPlayInfoProtocolV4", "parseJson err: " + Log.getStackTraceString(e10));
        }
    }

    public final String a(String str) {
        com.tencent.liteav.txcvodplayer.b.b bVar = this.f100059c;
        if (bVar != null) {
            return bVar.a(str);
        }
        return null;
    }

    public final void a(a aVar) {
        if (this.f100058b == null) {
            return;
        }
        com.tencent.liteav.txcplayer.common.a.a().execute(new AnonymousClass1(aVar));
    }

    public final boolean a() {
        List<String> list = this.f100061e;
        if (list != null && this.f100062f >= list.size() - 1) {
            return false;
        }
        if (this.f100061e == null && !TextUtils.isEmpty(f100057g)) {
            f100057g = "";
        }
        return true;
    }

    public final String b() {
        com.tencent.liteav.txcvodplayer.b.b bVar = this.f100059c;
        if (bVar != null) {
            String strA = bVar.a("SimpleAES");
            return !TextUtils.isEmpty(strA) ? strA : this.f100059c.a(org.apache.tools.ant.taskdefs.email.b.K);
        }
        f fVar = this.f100064i;
        if (fVar != null) {
            return fVar.a();
        }
        return null;
    }

    public final String c() {
        com.tencent.liteav.txcvodplayer.b.b bVar = this.f100059c;
        if (bVar != null) {
            return bVar.f100041c;
        }
        f fVar = this.f100064i;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    public final String d() {
        com.tencent.liteav.txcvodplayer.b.b bVar = this.f100059c;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public final String e() {
        com.tencent.liteav.txcvodplayer.b.b bVar = this.f100059c;
        if (bVar != null) {
            return bVar.f100039a;
        }
        f fVar = this.f100064i;
        if (fVar != null) {
            return fVar.g();
        }
        return null;
    }

    public final String f() {
        com.tencent.liteav.txcvodplayer.b.b bVar = this.f100059c;
        if (bVar != null) {
            return bVar.f100040b;
        }
        f fVar = this.f100064i;
        if (fVar != null) {
            return fVar.h();
        }
        return null;
    }

    public final int g() {
        com.tencent.liteav.txcvodplayer.b.b bVar = this.f100059c;
        if (bVar != null) {
            return bVar.f100042d;
        }
        f fVar = this.f100064i;
        if (fVar != null) {
            return fVar.b();
        }
        return -1;
    }

    public final long h() {
        com.tencent.liteav.txcvodplayer.b.b bVar = this.f100059c;
        if (bVar != null) {
            return bVar.f100043e;
        }
        f fVar = this.f100064i;
        if (fVar != null) {
            if (fVar.f100112b == null) {
                fVar.f100112b = fVar.c();
            }
            g gVar = fVar.f100112b;
            if (gVar != null) {
                return gVar.f100119d;
            }
        }
        return -1L;
    }

    public final C0963c i() {
        com.tencent.liteav.txcvodplayer.b.b bVar = this.f100059c;
        if (bVar != null) {
            return bVar.f100047i;
        }
        f fVar = this.f100064i;
        if (fVar != null) {
            return fVar.i();
        }
        return null;
    }

    public final List<d> j() {
        com.tencent.liteav.txcvodplayer.b.b bVar = this.f100059c;
        if (bVar != null) {
            return bVar.f100048j;
        }
        f fVar = this.f100064i;
        if (fVar != null) {
            return fVar.j();
        }
        return null;
    }

    public final List<e> k() {
        com.tencent.liteav.txcvodplayer.b.b bVar = this.f100059c;
        if (bVar != null) {
            return bVar.f100045g;
        }
        f fVar = this.f100064i;
        if (fVar == null) {
            return null;
        }
        List<f.a> listK = fVar.k();
        List<g> listE = this.f100064i.e();
        if (listK == null || listK.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listK.size());
        for (f.a aVar : listK) {
            e eVar = new e();
            eVar.f100087a = aVar.f100114b;
            List<Integer> list = aVar.f100115c;
            if (list != null) {
                for (g gVar : listE) {
                    if (list.contains(Integer.valueOf(gVar.f100124i))) {
                        int i10 = gVar.f100118c;
                        eVar.f100088b = i10;
                        eVar.f100089c = gVar.f100117b;
                        if (i10 > 0) {
                            eVar.f100090d = "video";
                        }
                        arrayList.add(eVar);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public final String l() {
        com.tencent.liteav.txcvodplayer.b.b bVar = this.f100059c;
        return bVar != null ? bVar.f100046h : "";
    }

    public final String m() {
        com.tencent.liteav.txcvodplayer.b.b bVar = this.f100059c;
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }
}
