package com.apm.lite.b;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.lite.CrashType;
import com.apm.lite.ICrashCallback;
import com.apm.lite.Npth;
import com.apm.lite.k.i;
import com.apm.lite.k.l;
import com.apm.lite.k.o;
import com.apm.lite.k.r;
import com.apm.lite.k.v;
import com.apm.lite.nativecrash.NativeImpl;
import com.apm.lite.runtime.j;
import com.apm.lite.runtime.n;
import com.google.android.exoplayer2.audio.q0;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.igexin.sdk.PushConsts;
import com.tencent.connect.common.Constants;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    private static volatile boolean D = false;
    static volatile boolean E = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.apm.lite.b.b f39835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f39836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f39837c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f39841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f39842h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private JSONArray f39847m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private JSONObject f39848n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JSONArray f39851q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private JSONArray f39852r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private JSONObject f39853s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f39854t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile boolean f39856v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f39838d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f39839e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f39840f = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f39843i = "unknown";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f39844j = "unknown";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f39845k = "unknown";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f39846l = "npth_inner_default";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f39849o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f39850p = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f39855u = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f39857w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f39858x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Runnable f39859y = new RunnableC0306a();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f39860z = 0;
    private List<Pattern> A = null;
    Pattern B = null;
    private File C = null;

    /* JADX INFO: renamed from: com.apm.lite.b.a$a, reason: collision with other inner class name */
    public class RunnableC0306a implements Runnable {
        RunnableC0306a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.h(200, 25);
            } catch (Throwable th2) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th2);
            }
        }
    }

    public class b implements com.apm.lite.d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f39862a;

        b(long j10) {
            this.f39862a = j10;
        }

        @Override // com.apm.lite.d.b.a
        public void a(JSONObject jSONObject) {
            com.apm.lite.j.d.a().b(jSONObject, this.f39862a, a.this.f39840f);
        }
    }

    public a(Context context) {
        this.f39836b = context;
    }

    private static String a(float f10) {
        if (f10 <= 0.0f) {
            return "0%";
        }
        if (f10 <= 0.1f) {
            return "0% - 10%";
        }
        if (f10 <= 0.3f) {
            return "10% - 30%";
        }
        if (f10 <= 0.6f) {
            return "30% - 60%";
        }
        return f10 <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    private static String b(float f10, float f11) {
        if (f11 > 0.0f) {
            return a(f10 / f11);
        }
        return f10 > 0.0f ? "100%" : "0%";
    }

    private JSONObject c(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayB = l.b(256, 128, jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.f39849o++;
        }
        try {
            jSONObject.put(CrashHianalyticsData.THREAD_NAME, str);
            jSONObject.put("thread_stack", jSONArrayB);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x021b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0223  */
    /* JADX WARN: Code duplicated, block: B:108:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x0229  */
    /* JADX WARN: Code duplicated, block: B:112:0x022c  */
    /* JADX WARN: Code duplicated, block: B:114:0x022f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0236  */
    /* JADX WARN: Code duplicated, block: B:118:0x023b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0240  */
    /* JADX WARN: Code duplicated, block: B:120:0x0245  */
    /* JADX WARN: Code duplicated, block: B:121:0x024b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0259  */
    /* JADX WARN: Code duplicated, block: B:126:0x0265  */
    /* JADX WARN: Code duplicated, block: B:127:0x0267 A[PHI: r20 r29
  0x0267: PHI (r20v2 char) = (r20v1 char), (r20v14 char) binds: [B:125:0x0263, B:119:0x0240] A[DONT_GENERATE, DONT_INLINE]
  0x0267: PHI (r29v2 char) = (r7v13 char), (r29v8 char) binds: [B:125:0x0263, B:119:0x0240] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x0271  */
    /* JADX WARN: Code duplicated, block: B:130:0x0275 A[PHI: r20 r29
  0x0275: PHI (r20v3 char) = (r20v2 char), (r20v15 char) binds: [B:128:0x026f, B:118:0x023b] A[DONT_GENERATE, DONT_INLINE]
  0x0275: PHI (r29v3 char) = (r29v2 char), (r29v9 char) binds: [B:128:0x026f, B:118:0x023b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x027f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0283 A[PHI: r20 r29
  0x0283: PHI (r20v4 char) = (r20v3 char), (r20v16 char) binds: [B:131:0x027d, B:117:0x0236] A[DONT_GENERATE, DONT_INLINE]
  0x0283: PHI (r29v4 char) = (r29v3 char), (r29v10 char) binds: [B:131:0x027d, B:117:0x0236] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:135:0x028b  */
    /* JADX WARN: Code duplicated, block: B:136:0x028f A[PHI: r29
  0x028f: PHI (r29v6 char) = (r29v4 char), (r29v11 char) binds: [B:134:0x0289, B:115:0x0232] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x0297  */
    /* JADX WARN: Code duplicated, block: B:139:0x029b A[PHI: r29
  0x029b: PHI (r29v5 char) = (r29v6 char), (r29v11 char) binds: [B:137:0x0295, B:115:0x0232] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:141:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:145:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:156:0x02f8 A[LOOP:2: B:102:0x0218->B:156:0x02f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x0397  */
    /* JADX WARN: Code duplicated, block: B:185:0x039c A[PHI: r3 r15 r16 r22 r23 r25 r26 r27 r28
  0x039c: PHI (r3v7 java.lang.String) = (r3v6 java.lang.String), (r3v4 java.lang.String) binds: [B:183:0x0395, B:159:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x039c: PHI (r15v10 java.lang.String) = (r15v9 java.lang.String), (r15v1 java.lang.String) binds: [B:183:0x0395, B:159:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x039c: PHI (r16v11 java.lang.String) = (r16v9 java.lang.String), (r16v1 java.lang.String) binds: [B:183:0x0395, B:159:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x039c: PHI (r22v5 java.lang.String) = (r22v4 java.lang.String), (r22v7 java.lang.String) binds: [B:183:0x0395, B:159:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x039c: PHI (r23v3 char) = (r23v2 char), (r23v5 char) binds: [B:183:0x0395, B:159:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x039c: PHI (r25v7 java.util.HashMap) = (r25v6 java.util.HashMap), (r25v9 java.util.HashMap) binds: [B:183:0x0395, B:159:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x039c: PHI (r26v7 java.util.HashMap) = (r26v6 java.util.HashMap), (r26v9 java.util.HashMap) binds: [B:183:0x0395, B:159:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x039c: PHI (r27v7 java.util.HashMap) = (r27v6 java.util.HashMap), (r27v9 java.util.HashMap) binds: [B:183:0x0395, B:159:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x039c: PHI (r28v7 java.util.HashMap) = (r28v6 java.util.HashMap), (r28v9 java.util.HashMap) binds: [B:183:0x0395, B:159:0x0308] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:187:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:192:0x03be A[LOOP:4: B:190:0x03bb->B:192:0x03be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:194:0x03cf A[EDGE_INSN: B:157:0x0300->B:194:0x03cf BREAK  A[LOOP:2: B:102:0x0218->B:156:0x02f8], EDGE_INSN: B:238:0x03cf->B:194:0x03cf BREAK  A[LOOP:2: B:102:0x0218->B:156:0x02f8], PHI: r15 r16 r22 r23 r25 r26 r27 r28
  0x03cf: PHI (r15v11 java.lang.String) = (r15v10 java.lang.String), (r15v1 java.lang.String), (r15v1 java.lang.String), (r15v1 java.lang.String) binds: [B:186:0x03a6, B:157:0x0300, B:238:0x03cf, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x03cf: PHI (r16v12 java.lang.String) = (r16v11 java.lang.String), (r16v1 java.lang.String), (r16v1 java.lang.String), (r16v1 java.lang.String) binds: [B:186:0x03a6, B:157:0x0300, B:238:0x03cf, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x03cf: PHI (r22v6 java.lang.String) = (r22v5 java.lang.String), (r22v8 java.lang.String), (r22v8 java.lang.String), (r22v8 java.lang.String) binds: [B:186:0x03a6, B:157:0x0300, B:238:0x03cf, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x03cf: PHI (r23v4 char) = (r23v3 char), (r23v6 char), (r23v6 char), (r23v6 char) binds: [B:186:0x03a6, B:157:0x0300, B:238:0x03cf, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x03cf: PHI (r25v8 java.util.HashMap) = (r25v7 java.util.HashMap), (r25v15 java.util.HashMap), (r25v15 java.util.HashMap), (r25v19 java.util.HashMap) binds: [B:186:0x03a6, B:157:0x0300, B:238:0x03cf, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x03cf: PHI (r26v8 java.util.HashMap) = (r26v7 java.util.HashMap), (r26v13 java.util.HashMap), (r26v13 java.util.HashMap), (r26v17 java.util.HashMap) binds: [B:186:0x03a6, B:157:0x0300, B:238:0x03cf, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x03cf: PHI (r27v8 java.util.HashMap) = (r27v7 java.util.HashMap), (r27v12 java.util.HashMap), (r27v12 java.util.HashMap), (r27v18 java.util.HashMap) binds: [B:186:0x03a6, B:157:0x0300, B:238:0x03cf, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x03cf: PHI (r28v8 java.util.HashMap) = (r28v7 java.util.HashMap), (r28v11 java.util.HashMap), (r28v12 java.util.HashMap), (r6v1 java.util.HashMap) binds: [B:186:0x03a6, B:157:0x0300, B:238:0x03cf, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:201:0x0407 A[PHI: r6 r15 r16 r22 r23 r25 r26 r27 r28
  0x0407: PHI (r6v5 char) = (r6v2 char), (r6v10 char), (r6v22 char), (r6v54 char) binds: [B:199:0x03f9, B:196:0x03d8, B:194:0x03cf, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]
  0x0407: PHI (r15v6 java.lang.String) = (r15v1 java.lang.String), (r15v1 java.lang.String), (r15v11 java.lang.String), (r15v1 java.lang.String) binds: [B:199:0x03f9, B:196:0x03d8, B:194:0x03cf, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]
  0x0407: PHI (r16v5 java.lang.String) = (r16v1 java.lang.String), (r16v1 java.lang.String), (r16v12 java.lang.String), (r16v1 java.lang.String) binds: [B:199:0x03f9, B:196:0x03d8, B:194:0x03cf, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]
  0x0407: PHI (r22v3 java.lang.String) = (r22v0 java.lang.String), (r22v4 java.lang.String), (r22v6 java.lang.String), (r22v9 java.lang.String) binds: [B:199:0x03f9, B:196:0x03d8, B:194:0x03cf, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]
  0x0407: PHI (r23v1 char) = (r23v0 char), (r23v2 char), (r23v4 char), (r23v7 char) binds: [B:199:0x03f9, B:196:0x03d8, B:194:0x03cf, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]
  0x0407: PHI (r25v5 java.util.HashMap) = (r25v2 java.util.HashMap), (r25v6 java.util.HashMap), (r25v8 java.util.HashMap), (r25v21 java.util.HashMap) binds: [B:199:0x03f9, B:196:0x03d8, B:194:0x03cf, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]
  0x0407: PHI (r26v5 java.util.HashMap) = (r26v2 java.util.HashMap), (r26v6 java.util.HashMap), (r26v8 java.util.HashMap), (r26v18 java.util.HashMap) binds: [B:199:0x03f9, B:196:0x03d8, B:194:0x03cf, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]
  0x0407: PHI (r27v5 java.util.HashMap) = (r27v2 java.util.HashMap), (r27v6 java.util.HashMap), (r27v8 java.util.HashMap), (r27v19 java.util.HashMap) binds: [B:199:0x03f9, B:196:0x03d8, B:194:0x03cf, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]
  0x0407: PHI (r28v5 java.util.HashMap) = (r28v2 java.util.HashMap), (r28v6 java.util.HashMap), (r28v8 java.util.HashMap), (r28v17 java.util.HashMap) binds: [B:199:0x03f9, B:196:0x03d8, B:194:0x03cf, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:209:0x0453  */
    /* JADX WARN: Code duplicated, block: B:210:0x0457  */
    /* JADX WARN: Code duplicated, block: B:213:0x046e  */
    /* JADX WARN: Code duplicated, block: B:214:0x0472  */
    /* JADX WARN: Code duplicated, block: B:217:0x0489  */
    /* JADX WARN: Code duplicated, block: B:218:0x048d  */
    /* JADX WARN: Code duplicated, block: B:234:0x042a A[EDGE_INSN: B:234:0x042a->B:207:0x042a BREAK  A[LOOP:0: B:3:0x0038->B:205:0x040d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x040d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x03cf A[EDGE_INSN: B:238:0x03cf->B:194:0x03cf BREAK  A[LOOP:2: B:102:0x0218->B:156:0x02f8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0300 A[SYNTHETIC] */
    private void e(String str, JSONObject jSONObject) throws JSONException {
        HashMap map;
        HashMap map2;
        String str2;
        char c10;
        char c11;
        char c12;
        boolean z10;
        String str3;
        String strTrim;
        String[] strArrSplit;
        int i10;
        String string;
        HashMap map3;
        int i11;
        char c13;
        String str4;
        char c14;
        float fFloatValue;
        SystemClock.uptimeMillis();
        String[] strArrSplit2 = str.split("\n");
        float[] fArr = {-1.0f, -1.0f, -1.0f};
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        HashMap map7 = new HashMap();
        HashMap map8 = new HashMap();
        int length = strArrSplit2.length;
        String str5 = "unknown";
        String strTrim2 = "unknown";
        String str6 = strTrim2;
        int i12 = 0;
        char c15 = 0;
        boolean z11 = false;
        while (true) {
            if (i12 >= length) {
                map5 = map5;
                map = map6;
                map2 = map7;
                map8 = map8;
                break;
            }
            String strTrim3 = strArrSplit2[i12];
            if (!TextUtils.isEmpty(strTrim3)) {
                if (c15 == 0) {
                    map5 = map5;
                    map = map6;
                    map2 = map7;
                    map8 = map8;
                    str2 = str5;
                    c10 = c15;
                    c11 = 3;
                    String strTrim4 = strTrim3.trim();
                    if (strTrim4.startsWith("tag:")) {
                        strTrim2 = strTrim4.replace("tag:", "").trim();
                        c12 = 4;
                        c15 = 1;
                    } else {
                        c15 = c10;
                        c12 = 4;
                    }
                } else if (c15 == 1) {
                    map5 = map5;
                    map = map6;
                    map2 = map7;
                    map8 = map8;
                    str2 = str5;
                    c10 = c15;
                    strTrim3 = strTrim3.trim();
                    String lowerCase = strTrim3.toLowerCase();
                    if (lowerCase.startsWith("shortmsg")) {
                        strTrim3.substring(strTrim3.indexOf(58));
                        z10 = false;
                    } else {
                        if (lowerCase.startsWith("reason:")) {
                            strTrim3.substring(strTrim3.indexOf(58));
                            z10 = true;
                        } else {
                            c11 = 3;
                            if (lowerCase.contains("appfreeze")) {
                                c15 = '\n';
                                str6 = "AppFreeze";
                            } else {
                                c15 = c10;
                            }
                        }
                        c12 = 4;
                    }
                    if (lowerCase.contains("input dispatch")) {
                        str3 = "Input dispatching timed out";
                    } else if (lowerCase.contains("broadcast of intent")) {
                        str3 = "Broadcast of Intent";
                    } else {
                        if (lowerCase.contains("executing service")) {
                            if ("null".equalsIgnoreCase(strTrim2)) {
                                strTrim2 = strTrim3.substring(strTrim3.indexOf("service ") + 8).trim();
                            }
                            str6 = "executing service";
                        } else if (lowerCase.contains("service.startforeground")) {
                            str3 = "not call Service.startForeground";
                        } else {
                            str6 = str2;
                        }
                        if (z10) {
                            c12 = 4;
                            c11 = 3;
                            c15 = 2;
                        } else {
                            strTrim = strTrim3.trim();
                            if (strTrim.startsWith("Load:")) {
                                strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                                c11 = 3;
                                if (3 == strArrSplit.length) {
                                    for (i10 = 0; i10 < strArrSplit.length; i10++) {
                                        fArr[i10] = Float.valueOf(strArrSplit[i10]).floatValue();
                                    }
                                }
                                c15 = 3;
                            } else {
                                c11 = 3;
                                c15 = c10;
                            }
                            c12 = 4;
                        }
                    }
                    str6 = str3;
                    if (z10) {
                        c12 = 4;
                        c11 = 3;
                        c15 = 2;
                    } else {
                        strTrim = strTrim3.trim();
                        if (strTrim.startsWith("Load:")) {
                            strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                            c11 = 3;
                            if (3 == strArrSplit.length) {
                                while (i10 < strArrSplit.length) {
                                    fArr[i10] = Float.valueOf(strArrSplit[i10]).floatValue();
                                }
                            }
                            c15 = 3;
                        } else {
                            c11 = 3;
                            c15 = c10;
                        }
                        c12 = 4;
                    }
                } else if (c15 == 2) {
                    map5 = map5;
                    map = map6;
                    map2 = map7;
                    map8 = map8;
                    str2 = str5;
                    c10 = c15;
                    strTrim = strTrim3.trim();
                    if (strTrim.startsWith("Load:")) {
                        strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                        c11 = 3;
                        if (3 == strArrSplit.length) {
                            while (i10 < strArrSplit.length) {
                                fArr[i10] = Float.valueOf(strArrSplit[i10]).floatValue();
                            }
                        }
                        c15 = 3;
                    } else {
                        c11 = 3;
                        c15 = c10;
                    }
                    c12 = 4;
                } else if (c15 != 3) {
                    map5 = map5;
                    map = map6;
                    map2 = map7;
                    map8 = map8;
                    c11 = 3;
                    str2 = str5;
                    c10 = c15;
                    c15 = c10;
                    c12 = 4;
                } else {
                    String[] strArrSplit3 = strTrim3.split("\\s");
                    str2 = str5;
                    c10 = c15;
                    if (strArrSplit3.length < 2) {
                        map = map6;
                    } else {
                        if ("CPU".equalsIgnoreCase(strArrSplit3[0]) && "usage".equalsIgnoreCase(strArrSplit3[1])) {
                            if (strTrim3.contains("ago")) {
                                z11 = true;
                            }
                            if (map4.isEmpty() && map5.isEmpty() && map6.isEmpty() && map8.isEmpty() && map7.isEmpty()) {
                                map5 = map5;
                                map = map6;
                                map2 = map7;
                                map8 = map8;
                                c15 = c10;
                                c12 = 4;
                                c11 = 3;
                            }
                        } else if (map4.isEmpty() || map5.isEmpty() || map6.isEmpty() || map8.isEmpty() || map7.isEmpty()) {
                            if (map4.isEmpty() && strArrSplit3[1].equalsIgnoreCase("TOTAL:")) {
                                string = "";
                                map3 = map4;
                                map = map6;
                            } else if (strTrim3.contains(this.f39836b.getPackageName())) {
                                string = "";
                                int i13 = 0;
                                while (i13 < strArrSplit3.length) {
                                    String str7 = string;
                                    if (strArrSplit3[i13].contains(this.f39836b.getPackageName())) {
                                        StringBuilder sb2 = new StringBuilder();
                                        String str8 = strArrSplit3[i13];
                                        sb2.append(str8.substring(str8.indexOf(47) + 1, strArrSplit3[i13].length() - 1));
                                        sb2.append('_');
                                        string = sb2.toString();
                                    } else {
                                        string = str7;
                                    }
                                    i13++;
                                    this = this;
                                    map6 = map6;
                                }
                                map = map6;
                                map3 = map;
                            } else {
                                map = map6;
                                if (map5.isEmpty() && strTrim3.contains("system_server:")) {
                                    string = "";
                                    map3 = map5;
                                } else if (map8.isEmpty() && strTrim3.contains("kswapd")) {
                                    string = "";
                                    map3 = map8;
                                } else if (map7.isEmpty() && strTrim3.contains("dex2oat")) {
                                    string = "";
                                    map3 = map7;
                                } else {
                                    string = "";
                                    map3 = null;
                                }
                            }
                            if (map3 != null) {
                                int i14 = 0;
                                while (!strArrSplit3[i14].contains("%") && (i14 = i14 + 1) < strArrSplit3.length) {
                                }
                                try {
                                    float fFloatValue2 = Float.valueOf(strArrSplit3[i14].replace("%", "")).floatValue();
                                    map2 = map7;
                                    try {
                                        String str9 = string + "total";
                                        if (map3 != map4) {
                                            fFloatValue2 /= com.apm.lite.k.d.i();
                                        }
                                        try {
                                            map3.put(str9, Float.valueOf(fFloatValue2));
                                            while (true) {
                                                if (i11 < strArrSplit3.length) {
                                                    map5 = map5;
                                                    break;
                                                }
                                                str4 = "kernel";
                                                map5 = map5;
                                                if (c13 != 0) {
                                                    if (c13 != 1) {
                                                        c14 = 5;
                                                    } else if (c13 != 2) {
                                                        c13 = c13;
                                                        c14 = 5;
                                                        if ("iowait".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            str4 = "iowait";
                                                            c13 = 3;
                                                        } else if ("irq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            str4 = "irq";
                                                            c13 = 4;
                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            str4 = "softirq";
                                                            c13 = c14;
                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            c13 = 6;
                                                            str4 = "softirq";
                                                        }
                                                        if (str4 != null) {
                                                            fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                            String str10 = string + str4;
                                                            if (map3 == map4) {
                                                                fFloatValue /= com.apm.lite.k.d.i();
                                                            }
                                                            map3.put(str10, Float.valueOf(fFloatValue));
                                                        } else {
                                                            strArrSplit3 = strArrSplit3;
                                                        }
                                                        if (c13 >= 6) {
                                                            break;
                                                            break;
                                                        } else {
                                                            i11 += 3;
                                                            strArrSplit3 = strArrSplit3;
                                                            map5 = map5;
                                                        }
                                                    } else if (c13 != 3) {
                                                        c13 = c13;
                                                        c14 = 5;
                                                        if ("irq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            str4 = "irq";
                                                            c13 = 4;
                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            str4 = "softirq";
                                                            c13 = c14;
                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            c13 = 6;
                                                            str4 = "softirq";
                                                        }
                                                        if (str4 != null) {
                                                            fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                            String str11 = string + str4;
                                                            if (map3 == map4) {
                                                                fFloatValue /= com.apm.lite.k.d.i();
                                                            }
                                                            map3.put(str11, Float.valueOf(fFloatValue));
                                                        } else {
                                                            strArrSplit3 = strArrSplit3;
                                                        }
                                                        if (c13 >= 6) {
                                                            break;
                                                            break;
                                                        } else {
                                                            i11 += 3;
                                                            strArrSplit3 = strArrSplit3;
                                                            map5 = map5;
                                                        }
                                                    } else if (c13 != 4) {
                                                        c13 = c13;
                                                        if (c13 != 5) {
                                                            if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                                c13 = 6;
                                                                str4 = "softirq";
                                                            }
                                                        }
                                                        if (str4 != null) {
                                                            try {
                                                                fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                                String str12 = string + str4;
                                                                if (map3 == map4) {
                                                                    fFloatValue /= com.apm.lite.k.d.i();
                                                                }
                                                                try {
                                                                    map3.put(str12, Float.valueOf(fFloatValue));
                                                                } catch (Throwable unused) {
                                                                    map3.put(string + str4, Float.valueOf(-1.0f));
                                                                }
                                                            } catch (Throwable unused2) {
                                                                strArrSplit3 = strArrSplit3;
                                                            }
                                                        } else {
                                                            strArrSplit3 = strArrSplit3;
                                                        }
                                                        if (c13 >= 6) {
                                                            break;
                                                        }
                                                        i11 += 3;
                                                        strArrSplit3 = strArrSplit3;
                                                        map5 = map5;
                                                    } else {
                                                        c13 = c13;
                                                        c14 = 5;
                                                        if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            str4 = "softirq";
                                                            c13 = c14;
                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            c13 = 6;
                                                            str4 = "softirq";
                                                        }
                                                        if (str4 != null) {
                                                            fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                            String str13 = string + str4;
                                                            if (map3 == map4) {
                                                                fFloatValue /= com.apm.lite.k.d.i();
                                                            }
                                                            map3.put(str13, Float.valueOf(fFloatValue));
                                                        } else {
                                                            strArrSplit3 = strArrSplit3;
                                                        }
                                                        if (c13 >= 6) {
                                                            break;
                                                            break;
                                                        } else {
                                                            i11 += 3;
                                                            strArrSplit3 = strArrSplit3;
                                                            map5 = map5;
                                                        }
                                                    }
                                                    c13 = c13;
                                                    str4 = null;
                                                    if (str4 != null) {
                                                        fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                        String str14 = string + str4;
                                                        if (map3 == map4) {
                                                            fFloatValue /= com.apm.lite.k.d.i();
                                                        }
                                                        map3.put(str14, Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArrSplit3 = strArrSplit3;
                                                    }
                                                    if (c13 >= 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11 += 3;
                                                        strArrSplit3 = strArrSplit3;
                                                        map5 = map5;
                                                    }
                                                } else {
                                                    c14 = 5;
                                                    if ("user".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        str4 = "user";
                                                        c13 = 1;
                                                    }
                                                    if (str4 != null) {
                                                        fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                        String str15 = string + str4;
                                                        if (map3 == map4) {
                                                            fFloatValue /= com.apm.lite.k.d.i();
                                                        }
                                                        map3.put(str15, Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArrSplit3 = strArrSplit3;
                                                    }
                                                    if (c13 >= 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11 += 3;
                                                        strArrSplit3 = strArrSplit3;
                                                        map5 = map5;
                                                    }
                                                }
                                                if ("kernel".equalsIgnoreCase(strArrSplit3[i11])) {
                                                    c13 = 2;
                                                } else if ("iowait".equalsIgnoreCase(strArrSplit3[i11])) {
                                                    str4 = "iowait";
                                                    c13 = 3;
                                                } else if ("irq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                    str4 = "irq";
                                                    c13 = 4;
                                                } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                    str4 = "softirq";
                                                    c13 = c14;
                                                } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                    c13 = 6;
                                                    str4 = "softirq";
                                                } else {
                                                    c13 = c13;
                                                    str4 = null;
                                                }
                                                if (str4 != null) {
                                                    fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                    String str16 = string + str4;
                                                    if (map3 == map4) {
                                                        fFloatValue /= com.apm.lite.k.d.i();
                                                    }
                                                    map3.put(str16, Float.valueOf(fFloatValue));
                                                } else {
                                                    strArrSplit3 = strArrSplit3;
                                                }
                                                if (c13 >= 6) {
                                                    break;
                                                    break;
                                                } else {
                                                    i11 += 3;
                                                    strArrSplit3 = strArrSplit3;
                                                    map5 = map5;
                                                }
                                            }
                                        } catch (Throwable unused3) {
                                            map3.put(string + "total", Float.valueOf(-1.0f));
                                        }
                                    } catch (Throwable unused4) {
                                        map8 = map8;
                                        map3.put(string + "total", Float.valueOf(-1.0f));
                                        i11 = i14 + 3;
                                        c13 = 0;
                                        while (true) {
                                            if (i11 < strArrSplit3.length) {
                                                map5 = map5;
                                                break;
                                            }
                                            str4 = "kernel";
                                            map5 = map5;
                                            if (c13 != 0) {
                                                if (c13 != 1) {
                                                    c14 = 5;
                                                } else if (c13 != 2) {
                                                    c13 = c13;
                                                    c14 = 5;
                                                    if ("iowait".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        str4 = "iowait";
                                                        c13 = 3;
                                                    } else if ("irq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        str4 = "irq";
                                                        c13 = 4;
                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        str4 = "softirq";
                                                        c13 = c14;
                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        c13 = 6;
                                                        str4 = "softirq";
                                                    }
                                                    if (str4 != null) {
                                                        fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                        String str17 = string + str4;
                                                        if (map3 == map4) {
                                                            fFloatValue /= com.apm.lite.k.d.i();
                                                        }
                                                        map3.put(str17, Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArrSplit3 = strArrSplit3;
                                                    }
                                                    if (c13 >= 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11 += 3;
                                                        strArrSplit3 = strArrSplit3;
                                                        map5 = map5;
                                                    }
                                                } else if (c13 != 3) {
                                                    c13 = c13;
                                                    c14 = 5;
                                                    if ("irq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        str4 = "irq";
                                                        c13 = 4;
                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        str4 = "softirq";
                                                        c13 = c14;
                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        c13 = 6;
                                                        str4 = "softirq";
                                                    }
                                                    if (str4 != null) {
                                                        fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                        String str18 = string + str4;
                                                        if (map3 == map4) {
                                                            fFloatValue /= com.apm.lite.k.d.i();
                                                        }
                                                        map3.put(str18, Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArrSplit3 = strArrSplit3;
                                                    }
                                                    if (c13 >= 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11 += 3;
                                                        strArrSplit3 = strArrSplit3;
                                                        map5 = map5;
                                                    }
                                                } else if (c13 != 4) {
                                                    c13 = c13;
                                                    if (c13 != 5) {
                                                        if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                            c13 = 6;
                                                            str4 = "softirq";
                                                        }
                                                    }
                                                    if (str4 != null) {
                                                        fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                        String str19 = string + str4;
                                                        if (map3 == map4) {
                                                            fFloatValue /= com.apm.lite.k.d.i();
                                                        }
                                                        map3.put(str19, Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArrSplit3 = strArrSplit3;
                                                    }
                                                    if (c13 >= 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11 += 3;
                                                        strArrSplit3 = strArrSplit3;
                                                        map5 = map5;
                                                    }
                                                } else {
                                                    c13 = c13;
                                                    c14 = 5;
                                                    if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        str4 = "softirq";
                                                        c13 = c14;
                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                        c13 = 6;
                                                        str4 = "softirq";
                                                    }
                                                    if (str4 != null) {
                                                        fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                        String str110 = string + str4;
                                                        if (map3 == map4) {
                                                            fFloatValue /= com.apm.lite.k.d.i();
                                                        }
                                                        map3.put(str110, Float.valueOf(fFloatValue));
                                                    } else {
                                                        strArrSplit3 = strArrSplit3;
                                                    }
                                                    if (c13 >= 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11 += 3;
                                                        strArrSplit3 = strArrSplit3;
                                                        map5 = map5;
                                                    }
                                                }
                                                c13 = c13;
                                                str4 = null;
                                                if (str4 != null) {
                                                    fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                    String str111 = string + str4;
                                                    if (map3 == map4) {
                                                        fFloatValue /= com.apm.lite.k.d.i();
                                                    }
                                                    map3.put(str111, Float.valueOf(fFloatValue));
                                                } else {
                                                    strArrSplit3 = strArrSplit3;
                                                }
                                                if (c13 >= 6) {
                                                    break;
                                                    break;
                                                } else {
                                                    i11 += 3;
                                                    strArrSplit3 = strArrSplit3;
                                                    map5 = map5;
                                                }
                                            } else {
                                                c14 = 5;
                                                if ("user".equalsIgnoreCase(strArrSplit3[i11])) {
                                                    str4 = "user";
                                                    c13 = 1;
                                                }
                                                if (str4 != null) {
                                                    fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                    String str112 = string + str4;
                                                    if (map3 == map4) {
                                                        fFloatValue /= com.apm.lite.k.d.i();
                                                    }
                                                    map3.put(str112, Float.valueOf(fFloatValue));
                                                } else {
                                                    strArrSplit3 = strArrSplit3;
                                                }
                                                if (c13 >= 6) {
                                                    break;
                                                    break;
                                                } else {
                                                    i11 += 3;
                                                    strArrSplit3 = strArrSplit3;
                                                    map5 = map5;
                                                }
                                            }
                                            if ("kernel".equalsIgnoreCase(strArrSplit3[i11])) {
                                                c13 = 2;
                                            } else if ("iowait".equalsIgnoreCase(strArrSplit3[i11])) {
                                                str4 = "iowait";
                                                c13 = 3;
                                            } else if ("irq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                str4 = "irq";
                                                c13 = 4;
                                            } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                str4 = "softirq";
                                                c13 = c14;
                                            } else if ("softirq".equalsIgnoreCase(strArrSplit3[i11])) {
                                                c13 = 6;
                                                str4 = "softirq";
                                            } else {
                                                c13 = c13;
                                                str4 = null;
                                            }
                                            if (str4 != null) {
                                                fFloatValue = Float.valueOf(strArrSplit3[i11 - 1].replace("%", "")).floatValue();
                                                String str113 = string + str4;
                                                if (map3 == map4) {
                                                    fFloatValue /= com.apm.lite.k.d.i();
                                                }
                                                map3.put(str113, Float.valueOf(fFloatValue));
                                            } else {
                                                strArrSplit3 = strArrSplit3;
                                            }
                                            if (c13 >= 6) {
                                                break;
                                                break;
                                            } else {
                                                i11 += 3;
                                                strArrSplit3 = strArrSplit3;
                                                map5 = map5;
                                            }
                                        }
                                        c11 = 3;
                                        c15 = c10;
                                        c12 = 4;
                                        if (c15 >= c12) {
                                            break;
                                            jSONObject.put("anr_tag", strTrim2);
                                            jSONObject.put("anr_has_ago", String.valueOf(z11));
                                            jSONObject.put("anr_reason", str6);
                                            f(map, jSONObject, Constants.JumpUrlConstants.SRC_TYPE_APP);
                                            f(map4, jSONObject, "total");
                                            if (map5.isEmpty()) {
                                                jSONObject.put("npth_anr_systemserver_total", "not found");
                                            } else {
                                                jSONObject.put("npth_anr_systemserver_total", l(r.a(map5).floatValue()));
                                            }
                                            if (map8.isEmpty()) {
                                                jSONObject.put("npth_anr_kswapd_total", "not found");
                                            } else {
                                                jSONObject.put("npth_anr_kswapd_total", l(r.a(map8).floatValue()));
                                            }
                                            if (map2.isEmpty()) {
                                                jSONObject.put("npth_anr_dex2oat_total", "not found");
                                            } else {
                                                jSONObject.put("npth_anr_dex2oat_total", l(r.a(map2).floatValue()));
                                            }
                                        }
                                        i12++;
                                        strArrSplit2 = strArrSplit2;
                                        length = length;
                                        str5 = str2;
                                        map6 = map;
                                        map7 = map2;
                                        map8 = map8;
                                        map5 = map5;
                                    }
                                } catch (Throwable unused5) {
                                    map2 = map7;
                                }
                                i11 = i14 + 3;
                                c13 = 0;
                            }
                            c11 = 3;
                            c15 = c10;
                            c12 = 4;
                        }
                        map5 = map5;
                        map = map6;
                        map2 = map7;
                        map8 = map8;
                        c12 = 4;
                        c11 = 3;
                        c15 = 4;
                    }
                    map2 = map7;
                    map8 = map8;
                    c11 = 3;
                    c15 = c10;
                    c12 = 4;
                }
                if (c15 >= c12) {
                    break;
                }
            } else {
                map5 = map5;
                map = map6;
                map2 = map7;
                map8 = map8;
                str2 = str5;
                c11 = 3;
            }
            i12++;
            strArrSplit2 = strArrSplit2;
            length = length;
            str5 = str2;
            map6 = map;
            map7 = map2;
            map8 = map8;
            map5 = map5;
        }
        jSONObject.put("anr_tag", strTrim2);
        jSONObject.put("anr_has_ago", String.valueOf(z11));
        jSONObject.put("anr_reason", str6);
        f(map, jSONObject, Constants.JumpUrlConstants.SRC_TYPE_APP);
        f(map4, jSONObject, "total");
        if (map5.isEmpty()) {
            jSONObject.put("npth_anr_systemserver_total", "not found");
        } else {
            jSONObject.put("npth_anr_systemserver_total", l(r.a(map5).floatValue()));
        }
        if (map8.isEmpty()) {
            jSONObject.put("npth_anr_kswapd_total", "not found");
        } else {
            jSONObject.put("npth_anr_kswapd_total", l(r.a(map8).floatValue()));
        }
        if (map2.isEmpty()) {
            jSONObject.put("npth_anr_dex2oat_total", "not found");
        } else {
            jSONObject.put("npth_anr_dex2oat_total", l(r.a(map2).floatValue()));
        }
    }

    private static void f(HashMap<String, Float> map, JSONObject jSONObject, String str) throws JSONException {
        String str2;
        String strB;
        String str3 = "npth_anr_" + str;
        if (map.isEmpty()) {
            str2 = str3 + "_total";
            strB = "not found";
        } else {
            float fFloatValue = 0.0f;
            float fFloatValue2 = 0.0f;
            float fFloatValue3 = 0.0f;
            float fFloatValue4 = 0.0f;
            float fFloatValue5 = 0.0f;
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key.endsWith("user")) {
                    fFloatValue += entry.getValue().floatValue();
                } else if (key.endsWith("kernel")) {
                    fFloatValue2 += entry.getValue().floatValue();
                } else if (key.endsWith("iowait")) {
                    fFloatValue3 += entry.getValue().floatValue();
                } else if (key.endsWith("irq")) {
                    fFloatValue4 += entry.getValue().floatValue();
                } else if (key.endsWith("softirq")) {
                    fFloatValue5 += entry.getValue().floatValue();
                }
            }
            float f10 = fFloatValue + fFloatValue2 + fFloatValue3 + fFloatValue4 + fFloatValue5;
            jSONObject.put(str3 + "_total", l(f10));
            jSONObject.put(str3 + "_kernel_user_ratio", b(fFloatValue2, f10));
            str2 = str3 + "_iowait_user_ratio";
            strB = b(fFloatValue3, f10);
        }
        jSONObject.put(str2, strB);
    }

    private void g(JSONArray jSONArray) {
        int[] iArrP;
        int[] iArrP2;
        if (jSONArray == null) {
            return;
        }
        this.f39841g = null;
        this.f39848n = null;
        this.f39849o = 0;
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        this.f39843i = "unknown";
        this.f39844j = "unknown";
        this.f39845k = "unknown";
        int[] iArr = {0, 0, 0};
        JSONArray jSONArray5 = jSONArray4;
        String strSubstring = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            if (TextUtils.isEmpty(strOptString)) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(strSubstring)) {
                    if (this.f39841g == null && "main".equals(strSubstring)) {
                        this.f39841g = r(jSONArray5);
                    } else {
                        jSONArray2.put(c(strSubstring, jSONArray5));
                    }
                    try {
                        if (!"main".equals(strSubstring)) {
                            strSubstring = strSubstring.substring(0, strSubstring.indexOf(40)).trim();
                        }
                    } catch (Throwable unused) {
                    }
                    String str = strSubstring;
                    if (!k(str)) {
                        try {
                            iArrP2 = p(jSONArray5);
                        } catch (IllegalArgumentException e10) {
                            com.apm.lite.c.a();
                            com.apm.lite.c.b("NPTH_CATCH", e10);
                            iArrP2 = null;
                        } catch (Throwable unused2) {
                            iArrP2 = null;
                        }
                        if (iArrP2 != null) {
                            int i11 = iArrP2[0];
                            if (i11 > iArr[0]) {
                                iArr[0] = i11;
                                this.f39843i = str;
                            }
                            int i12 = iArrP2[1];
                            if (i12 > iArr[1]) {
                                iArr[1] = i12;
                                this.f39844j = str;
                            }
                            int i13 = iArrP2[2];
                            if (i13 > iArr[2]) {
                                iArr[2] = i13;
                                this.f39845k = str;
                            }
                        }
                    }
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                strSubstring = null;
            } else {
                if (z10) {
                    if (z10) {
                        if (strOptString.contains(" prio=")) {
                            if (jSONArray5.length() > 0 && !TextUtils.isEmpty(strSubstring)) {
                                if (this.f39841g == null && "main".equals(strSubstring)) {
                                    this.f39841g = r(jSONArray5);
                                } else {
                                    jSONArray2.put(c(strSubstring, jSONArray5));
                                }
                                try {
                                    if (!"main".equals(strSubstring)) {
                                        strSubstring = strSubstring.substring(0, strSubstring.indexOf(40)).trim();
                                    }
                                } catch (Throwable unused3) {
                                }
                                String str2 = strSubstring;
                                if (!k(str2)) {
                                    try {
                                        iArrP = p(jSONArray5);
                                    } catch (IllegalArgumentException e11) {
                                        com.apm.lite.c.a();
                                        com.apm.lite.c.b("NPTH_CATCH", e11);
                                        iArrP = null;
                                    } catch (Throwable unused4) {
                                        iArrP = null;
                                    }
                                    if (iArrP != null) {
                                        int i14 = iArrP[0];
                                        if (i14 > iArr[0]) {
                                            iArr[0] = i14;
                                            this.f39843i = str2;
                                        }
                                        int i15 = iArrP[1];
                                        if (i15 > iArr[1]) {
                                            iArr[1] = i15;
                                            this.f39844j = str2;
                                        }
                                        int i16 = iArrP[2];
                                        if (i16 > iArr[2]) {
                                            iArr[2] = i16;
                                            this.f39845k = str2;
                                        }
                                    }
                                }
                                strSubstring = str2;
                            }
                            try {
                                strSubstring = strOptString.substring(1, strOptString.indexOf(34, 1));
                                if (!"main".equals(strSubstring)) {
                                    strSubstring = strSubstring + "  (" + strOptString.substring(strOptString.indexOf(34, 2) + 1) + " )";
                                }
                            } catch (Throwable unused5) {
                            }
                            if (jSONArray5.length() > 0) {
                                jSONArray5 = new JSONArray();
                            }
                        } else if (TextUtils.isEmpty(strSubstring)) {
                        }
                        jSONArray5.put(strOptString);
                    }
                } else if (strOptString.startsWith("DALVIK THREADS") || strOptString.startsWith("suspend") || strOptString.startsWith("\"")) {
                    z10 = true;
                }
                jSONArray3.put(strOptString);
            }
        }
        if (jSONArray2.length() > 0) {
            this.f39847m = jSONArray3;
            try {
                JSONObject jSONObject = new JSONObject();
                this.f39848n = jSONObject;
                jSONObject.put("thread_all_count", jSONArray2.length());
                this.f39848n.put("thread_stacks", jSONArray2);
            } catch (JSONException e12) {
                e12.printStackTrace();
            }
        }
    }

    private boolean i(long j10) {
        if (this.f39856v) {
            this.f39856v = false;
            n(j10);
        }
        return false;
    }

    private boolean k(String str) {
        if (this.A == null) {
            JSONArray jSONArrayJ = com.apm.lite.runtime.a.j();
            if (jSONArrayJ != null) {
                this.A = new LinkedList();
                this.f39846l = jSONArrayJ.optString(0);
                for (int i10 = 1; i10 < jSONArrayJ.length(); i10++) {
                    try {
                        this.A.add(Pattern.compile(jSONArrayJ.optString(i10)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.A == null) {
                LinkedList linkedList = new LinkedList();
                this.A = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.A.add(Pattern.compile("^default_npth_thread$"));
                this.A.add(Pattern.compile("^RenderThread$"));
                this.A.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.A.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private static String l(float f10) {
        return a(f10 / 100.0f);
    }

    private void n(long j10) {
        if (this.f39858x != this.f39857w) {
            try {
                this.f39850p = System.currentTimeMillis();
                this.f39852r = d.b();
                this.f39851q = f.a(100, j10);
                this.f39842h = d.c(j10);
                JSONObject jSONObject = new JSONObject();
                this.f39853s = jSONObject;
                com.apm.lite.k.a.d(this.f39836b, jSONObject);
                this.f39854t = v();
                this.f39840f = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                this.f39838d = this.f39850p;
                String strK = o.k();
                File file = new File(new File(o.u(this.f39836b), strK), "trace_" + com.apm.lite.k.a.m(this.f39836b).replace(':', '_') + ".txt");
                file.getParentFile().mkdirs();
                i.j(file, com.apm.lite.k.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                com.apm.lite.runtime.o.d("anr_trace", strK);
                NativeImpl.doDumpAllThread(file.getAbsolutePath());
                try {
                    JSONArray jSONArrayU = i.u(file.getAbsolutePath());
                    this.f39847m = jSONArrayU;
                    g(jSONArrayU);
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    com.apm.lite.c.a();
                    com.apm.lite.c.b("NPTH_CATCH", th2);
                }
                if (this.f39841g == null) {
                    this.f39841g = c.c(true);
                }
            } catch (Throwable th3) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th3);
            }
            com.apm.lite.k.f.b();
        } else {
            try {
                this.f39838d = this.f39850p;
                String strK2 = o.k();
                File file2 = new File(new File(o.u(this.f39836b), strK2), AgooConstants.MESSAGE_TRACE + com.apm.lite.k.a.m(this.f39836b).replace(':', '_') + ".txt");
                file2.getParentFile().mkdirs();
                i.j(file2, com.apm.lite.k.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                com.apm.lite.runtime.o.d("anr_trace", strK2);
                NativeImpl.doDumpAllThread(file2.getAbsolutePath());
                try {
                    JSONArray jSONArrayU2 = i.u(file2.getAbsolutePath());
                    this.f39847m = jSONArrayU2;
                    g(jSONArrayU2);
                } catch (IOException unused3) {
                } catch (Throwable th4) {
                    com.apm.lite.c.a();
                    com.apm.lite.c.b("NPTH_CATCH", th4);
                }
                if (this.f39841g == null) {
                    this.f39841g = c.c(true);
                }
            } catch (Throwable th5) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th5);
            }
        }
        long j11 = this.f39857w;
        this.f39858x = j11;
        this.f39857w = -1L;
        if (j11 == -1) {
            this.f39858x = (-1) - 1;
        }
    }

    private static void o(String str) {
        Iterator<ICrashCallback> it = com.apm.lite.runtime.l.a().i().iterator();
        while (it.hasNext()) {
            try {
                it.next().onCrash(CrashType.ANR, str, null);
            } catch (Throwable th2) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th2);
            }
        }
    }

    private int[] p(JSONArray jSONArray) {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            int iIndexOf = (strOptString == null || strOptString.isEmpty()) ? -1 : strOptString.indexOf("utm=");
            if (iIndexOf > 0) {
                if (this.B == null) {
                    this.B = Pattern.compile("[^0-9]+");
                }
                String[] strArrSplit = this.B.split(strOptString.substring(iIndexOf));
                if (strArrSplit == null || strArrSplit.length < 2) {
                    return null;
                }
                try {
                    int iIntValue = Integer.decode(strArrSplit[1]).intValue();
                    int iIntValue2 = Integer.decode(strArrSplit[2]).intValue();
                    return new int[]{iIntValue, iIntValue2, iIntValue + iIntValue2};
                } catch (Throwable unused) {
                    throw new IllegalArgumentException("Err stack line: " + strOptString);
                }
            }
        }
        return null;
    }

    private String q(long j10) {
        long jP = j10 - com.apm.lite.e.p();
        if (jP < 30000) {
            return "0 - 30s";
        }
        if (jP < 60000) {
            return "30s - 1min";
        }
        if (jP < 120000) {
            return "1min - 2min";
        }
        if (jP < 300000) {
            return "2min - 5min";
        }
        if (jP < 600000) {
            return "5min - 10min";
        }
        if (jP < 1800000) {
            return "10min - 30min";
        }
        return jP < 3600000 ? "30min - 1h" : "1h - ";
    }

    private JSONObject r(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayB = l.b(256, 128, jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.f39849o++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
                sb2.append(jSONArrayB.getString(i10));
                sb2.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb2.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private boolean v() {
        boolean z10 = !com.apm.lite.k.a.h(this.f39836b);
        if (!z10 || com.apm.lite.runtime.a.b.y().B() > 2000) {
            return z10;
        }
        return false;
    }

    private File w() {
        if (this.C == null) {
            this.C = new File(this.f39836b.getFilesDir(), "has_anr_signal_" + com.apm.lite.k.a.m(this.f39836b).replaceAll(":", lg.a.f131412e));
        }
        return this.C;
    }

    private boolean x() {
        return com.apm.lite.runtime.a.p();
    }

    public void d() {
        if (this.f39837c) {
            return;
        }
        this.f39835a = new com.apm.lite.b.b(this);
        this.f39838d = com.apm.lite.e.p();
        this.f39837c = true;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x03b5 A[Catch: all -> 0x0459, TRY_ENTER, TryCatch #11 {all -> 0x0459, blocks: (B:77:0x0173, B:81:0x01ed, B:83:0x01f2, B:86:0x01fb, B:88:0x01ff, B:90:0x0205, B:92:0x020d, B:132:0x03b5, B:133:0x03de, B:135:0x03e2, B:136:0x03e8, B:143:0x043d, B:91:0x020b), top: B:179:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x03de A[Catch: all -> 0x0459, TryCatch #11 {all -> 0x0459, blocks: (B:77:0x0173, B:81:0x01ed, B:83:0x01f2, B:86:0x01fb, B:88:0x01ff, B:90:0x0205, B:92:0x020d, B:132:0x03b5, B:133:0x03de, B:135:0x03e2, B:136:0x03e8, B:143:0x043d, B:91:0x020b), top: B:179:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x03e2 A[Catch: all -> 0x0459, TryCatch #11 {all -> 0x0459, blocks: (B:77:0x0173, B:81:0x01ed, B:83:0x01f2, B:86:0x01fb, B:88:0x01ff, B:90:0x0205, B:92:0x020d, B:132:0x03b5, B:133:0x03de, B:135:0x03e2, B:136:0x03e8, B:143:0x043d, B:91:0x020b), top: B:179:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0403 A[Catch: all -> 0x040a, TRY_LEAVE, TryCatch #7 {all -> 0x040a, blocks: (B:137:0x03f5, B:139:0x0403), top: B:170:0x03f5 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0431 A[Catch: all -> 0x043d, TRY_LEAVE, TryCatch #12 {all -> 0x043d, blocks: (B:140:0x040a, B:142:0x0431), top: B:180:0x040a }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    boolean h(int i10, int i11) {
        boolean z10;
        boolean z11;
        JSONArray jSONArrayA;
        JSONObject jSONObject;
        JSONObject jSONObjectC;
        JSONObject jSONObjectC2;
        boolean z12;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        boolean z13;
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray jSONArray3;
        JSONObject jSONObject4;
        String strK;
        File file;
        JSONArray jSONArrayB;
        JSONObject jSONObject5;
        JSONArray jSONArrayB2;
        boolean zA = e.a();
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean zI = i(jUptimeMillis);
        String strB = c.b(this.f39836b, 1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str5 = "normal";
        boolean z14 = TextUtils.isEmpty(strB) && zI;
        if (zI || !TextUtils.isEmpty(strB)) {
            synchronized (this.f39855u) {
                z10 = !z14;
            }
            if (this.f39841g != null) {
                z11 = z10;
                if (System.currentTimeMillis() - this.f39838d <= q0.f44202v) {
                    str5 = z14 ? "trace_only" : "trace_last";
                }
                JSONObject jSONObject6 = this.f39841g;
                String str6 = this.f39843i;
                String str7 = this.f39844j;
                String str8 = this.f39845k;
                JSONArray jSONArray4 = this.f39847m;
                JSONArray jSONArray5 = this.f39852r;
                jSONArrayA = this.f39851q;
                jSONObject = this.f39853s;
                jSONObjectC = jSONObject6;
                jSONObjectC2 = this.f39842h;
                boolean z15 = this.f39854t;
                long j10 = this.f39850p;
                z12 = z15;
                if (!z14) {
                    this.f39841g = null;
                    this.f39847m = null;
                    this.f39851q = null;
                    this.f39842h = null;
                    this.f39852r = null;
                    this.f39843i = "unknown";
                    this.f39844j = "unknown";
                    this.f39845k = "unknown";
                    this.f39849o = 0;
                }
                jSONArray = jSONArray4;
                jSONArray2 = jSONArray5;
                String str9 = str5;
                z13 = z11;
                jCurrentTimeMillis = j10;
                str = str8;
                str2 = str7;
                str3 = str6;
                str4 = str9;
            } else {
                z11 = z10;
            }
            if (this.f39856v) {
                this.f39856v = false;
                str5 = "trace_after";
            }
            n(jUptimeMillis);
            JSONObject jSONObject7 = this.f39841g;
            String str10 = this.f39843i;
            String str11 = this.f39844j;
            String str12 = this.f39845k;
            JSONArray jSONArray6 = this.f39847m;
            JSONArray jSONArray7 = this.f39852r;
            jSONArrayA = this.f39851q;
            jSONObject = this.f39853s;
            jSONObjectC = jSONObject7;
            jSONObjectC2 = this.f39842h;
            boolean z16 = this.f39854t;
            long j11 = this.f39850p;
            z12 = z16;
            if (!z14) {
                this.f39841g = null;
                this.f39847m = null;
                this.f39851q = null;
                this.f39842h = null;
                this.f39852r = null;
                this.f39843i = "unknown";
                this.f39844j = "unknown";
                this.f39845k = "unknown";
                this.f39849o = 0;
            }
            jSONArray = jSONArray6;
            jSONArray2 = jSONArray7;
            String str13 = str5;
            z13 = z11;
            jCurrentTimeMillis = j11;
            str = str12;
            str2 = str11;
            str3 = str10;
            str4 = str13;
        } else {
            z12 = false;
            str = "unknown";
            jSONArray = null;
            jSONArrayA = null;
            jSONObjectC = null;
            jSONObjectC2 = null;
            jSONArray2 = null;
            str2 = "unknown";
            jSONObject = null;
            str3 = "unknown";
            str4 = "normal";
            z13 = false;
        }
        if (!z14 && TextUtils.isEmpty(strB)) {
            if (this.f39841g == null || System.currentTimeMillis() - this.f39838d <= q0.f44202v) {
                if (this.f39841g == null || System.currentTimeMillis() - this.f39838d <= 2000 || !NativeImpl.isResendSigQuit()) {
                    return false;
                }
                i.r(w());
                return false;
            }
            this.f39841g = null;
            this.f39847m = null;
            this.f39851q = null;
            this.f39842h = null;
            this.f39852r = null;
            this.f39843i = "unknown";
            this.f39844j = "unknown";
            this.f39845k = "unknown";
            this.f39849o = 0;
            File file2 = this.f39839e;
            if (file2 != null) {
                i.r(file2);
            }
            this.f39839e = null;
            return false;
        }
        if (jSONObjectC == null) {
            if (jSONArrayA == null) {
                try {
                    jSONArrayB2 = d.b();
                    JSONObject jSONObject8 = jSONObject;
                    try {
                        jSONArrayA = f.a(100, jUptimeMillis);
                        jSONObjectC2 = d.c(jUptimeMillis);
                        JSONObject jSONObject9 = new JSONObject();
                        try {
                            com.apm.lite.k.a.d(this.f39836b, jSONObject9);
                            jSONObject = jSONObject9;
                        } catch (Throwable unused) {
                            jSONObject = jSONObject9;
                        }
                    } catch (Throwable unused2) {
                        jSONObject = jSONObject8;
                    }
                } catch (Throwable unused3) {
                    jSONArrayB2 = jSONArray2;
                }
            } else {
                jSONArrayB2 = jSONArray2;
            }
            try {
                jSONObjectC = c.c(E);
            } catch (Throwable unused4) {
            }
            jSONArray3 = jSONArrayB2;
            jSONObject2 = jSONObjectC;
            jSONObject3 = jSONObjectC2;
        } else {
            jSONObject2 = jSONObjectC;
            jSONObject3 = jSONObjectC2;
            jSONArray3 = jSONArray2;
        }
        if (jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                jSONObject2.put(PushConsts.KEY_SERVICE_PIT, Process.myPid());
                jSONObject2.put("package", this.f39836b.getPackageName());
                jSONObject2.put("is_remote_process", 0);
                jSONObject2.put("is_new_stack", 10);
                com.apm.lite.d.a aVar = new com.apm.lite.d.a(new JSONObject());
                String str14 = str;
                aVar.j("data", jSONObject2.toString());
                JSONObject jSONObject10 = jSONObject2;
                boolean z17 = true;
                aVar.j("is_anr", 1);
                aVar.j("anrType", str4);
                aVar.j("history_message", jSONArray3);
                aVar.j("current_message", jSONObject3);
                aVar.j("pending_messages", jSONArrayA);
                aVar.j("anr_time", Long.valueOf(System.currentTimeMillis()));
                aVar.j("crash_time", Long.valueOf(jCurrentTimeMillis));
                aVar.y(jSONObject);
                aVar.j("anr_info", z14 ? "no anr info" : strB);
                if (jSONArray != null) {
                    aVar.j("dump_trace", jSONArray);
                }
                aVar.j("all_thread_stacks", (z14 || !((jSONObject5 = this.f39848n) == null || jSONObject5.length() == 0)) ? this.f39848n : v.r(null));
                com.apm.lite.runtime.a.e eVarD = com.apm.lite.runtime.a.e.d();
                CrashType crashType = CrashType.ANR;
                com.apm.lite.d.a aVarA = eVarD.a(crashType, aVar);
                aVarA.j("is_background", Boolean.valueOf(z12));
                aVarA.j("logcat", j.b(com.apm.lite.e.l()));
                aVarA.j("has_dump", "true");
                aVarA.j("crash_uuid", com.apm.lite.e.b(jCurrentTimeMillis, crashType, false, false));
                aVarA.j("jiffy", Long.valueOf(n.a.a()));
                JSONObject jSONObjectOptJSONObject = aVarA.G().optJSONObject("filters");
                if (jSONObjectOptJSONObject == null) {
                    try {
                        jSONObject4 = new JSONObject();
                        try {
                            aVarA.j("filters", jSONObject4);
                        } catch (Throwable unused5) {
                            jSONObjectOptJSONObject = jSONObject4;
                            strK = strB;
                            jSONObject4 = jSONObjectOptJSONObject;
                            if (z14) {
                                String strT = com.apm.lite.j.e.t();
                                File file3 = new File(o.b(this.f39836b), com.apm.lite.e.b(jCurrentTimeMillis, CrashType.ANR, false, false));
                                this.f39839e = file3;
                                i.f(file3, file3.getName(), strT, aVarA.G(), com.apm.lite.j.e.q());
                            } else {
                                file = this.f39839e;
                                if (file != null) {
                                    i.r(file);
                                    this.f39839e = null;
                                }
                                n6.a.a().b(CrashType.ANR, jCurrentTimeMillis, com.apm.lite.e.k());
                                try {
                                    if (com.apm.lite.k.f.g().length() > 1024) {
                                        aVarA.e("has_system_traces", "true");
                                    }
                                } catch (Throwable unused6) {
                                }
                                try {
                                    jSONArrayB = com.apm.lite.nativecrash.d.b(o.q(com.apm.lite.e.l()), o.t(com.apm.lite.e.l()));
                                    jSONObject4.put("leak_threads_count", String.valueOf(jSONArrayB.length()));
                                    if (jSONArrayB.length() > 0) {
                                        i.l(o.w(com.apm.lite.e.l()), jSONArrayB, false);
                                    }
                                } catch (Throwable unused7) {
                                }
                                com.apm.lite.d.b.i(aVarA.G(), com.apm.lite.d.b.d(jSONObject10.optString("mainStackFromTrace")), new b(jCurrentTimeMillis));
                                o(strK);
                            }
                            return z13;
                        }
                    } catch (Throwable unused8) {
                        strK = strB;
                        jSONObject4 = jSONObjectOptJSONObject;
                        if (z14) {
                            String strT2 = com.apm.lite.j.e.t();
                            File file4 = new File(o.b(this.f39836b), com.apm.lite.e.b(jCurrentTimeMillis, CrashType.ANR, false, false));
                            this.f39839e = file4;
                            i.f(file4, file4.getName(), strT2, aVarA.G(), com.apm.lite.j.e.q());
                        } else {
                            file = this.f39839e;
                            if (file != null) {
                                i.r(file);
                                this.f39839e = null;
                            }
                            n6.a.a().b(CrashType.ANR, jCurrentTimeMillis, com.apm.lite.e.k());
                            if (com.apm.lite.k.f.g().length() > 1024) {
                                aVarA.e("has_system_traces", "true");
                            }
                            jSONArrayB = com.apm.lite.nativecrash.d.b(o.q(com.apm.lite.e.l()), o.t(com.apm.lite.e.l()));
                            jSONObject4.put("leak_threads_count", String.valueOf(jSONArrayB.length()));
                            if (jSONArrayB.length() > 0) {
                                i.l(o.w(com.apm.lite.e.l()), jSONArrayB, false);
                            }
                            com.apm.lite.d.b.i(aVarA.G(), com.apm.lite.d.b.d(jSONObject10.optString("mainStackFromTrace")), new b(jCurrentTimeMillis));
                            o(strK);
                        }
                        return z13;
                    }
                } else {
                    jSONObject4 = jSONObjectOptJSONObject;
                }
                try {
                    jSONObject4.put("anrType", str4);
                    jSONObject4.put("max_utm_thread", str3);
                    jSONObject4.put("max_stm_thread", str2);
                    jSONObject4.put("max_utm_stm_thread", str14);
                    jSONObject4.put("max_utm_thread_version", this.f39846l);
                    jSONObject4.put("crash_length", q(jCurrentTimeMillis));
                    jSONObject4.put("disable_looper_monitor", String.valueOf(com.apm.lite.runtime.a.l()));
                    jSONObject4.put("sdk_version", "0.0.1-rc.3");
                    jSONObject4.put("has_logcat", String.valueOf(aVarA.o()));
                    jSONObject4.put("memory_leak", String.valueOf(aVarA.E()));
                    jSONObject4.put("fd_leak", String.valueOf(aVarA.A()));
                    jSONObject4.put("threads_leak", String.valueOf(aVarA.D()));
                    jSONObject4.put("is_64_devices", String.valueOf(com.apm.lite.d.c.f()));
                    jSONObject4.put("is_64_runtime", String.valueOf(NativeImpl.is64BitRuntime()));
                    jSONObject4.put("is_x86_devices", String.valueOf(com.apm.lite.d.c.j()));
                    jSONObject4.put("has_meminfo_file", String.valueOf(aVarA.F()));
                    jSONObject4.put("is_root", com.apm.lite.nativecrash.c.y() ? "true" : "false");
                    if (this.f39856v) {
                        z17 = false;
                    }
                    jSONObject4.put("anr_normal_trace", String.valueOf(z17));
                    jSONObject4.put("anr_no_run", String.valueOf(zA));
                    jSONObject4.put("crash_after_crash", Npth.hasCrash() ? "true" : "false");
                    jSONObject4.put("from_file", String.valueOf(c.d()));
                    jSONObject4.put("has_dump", "true");
                    jSONObject4.put("from_kill", String.valueOf(z14));
                    strK = com.apm.lite.runtime.a.b.y().K();
                    jSONObject4.put("last_resume_activity", strK);
                    int i12 = this.f39849o;
                    if (i12 > 0) {
                        strK = "may_have_stack_overflow";
                        jSONObject4.put("may_have_stack_overflow", String.valueOf(i12));
                    }
                    try {
                        if (z14) {
                            strK = strB;
                            if (!x()) {
                                jSONObject4.put(CommonNetImpl.AID, String.valueOf(aVarA.H().s().opt(CommonNetImpl.AID)));
                            }
                        } else {
                            strK = strB;
                            try {
                                e(strK, jSONObject4);
                            } catch (Throwable th2) {
                                com.apm.lite.c.a();
                                com.apm.lite.c.b("NPTH_CATCH", th2);
                            }
                        }
                    } catch (Throwable unused9) {
                        jSONObjectOptJSONObject = jSONObject4;
                        jSONObject4 = jSONObjectOptJSONObject;
                    }
                } catch (Throwable unused10) {
                    strK = strB;
                }
                if (z14) {
                    String strT3 = com.apm.lite.j.e.t();
                    File file5 = new File(o.b(this.f39836b), com.apm.lite.e.b(jCurrentTimeMillis, CrashType.ANR, false, false));
                    this.f39839e = file5;
                    i.f(file5, file5.getName(), strT3, aVarA.G(), com.apm.lite.j.e.q());
                } else {
                    file = this.f39839e;
                    if (file != null) {
                        i.r(file);
                        this.f39839e = null;
                    }
                    n6.a.a().b(CrashType.ANR, jCurrentTimeMillis, com.apm.lite.e.k());
                    if (com.apm.lite.k.f.g().length() > 1024) {
                        aVarA.e("has_system_traces", "true");
                    }
                    jSONArrayB = com.apm.lite.nativecrash.d.b(o.q(com.apm.lite.e.l()), o.t(com.apm.lite.e.l()));
                    jSONObject4.put("leak_threads_count", String.valueOf(jSONArrayB.length()));
                    if (jSONArrayB.length() > 0) {
                        i.l(o.w(com.apm.lite.e.l()), jSONArrayB, false);
                    }
                    com.apm.lite.d.b.i(aVarA.G(), com.apm.lite.d.b.d(jSONObject10.optString("mainStackFromTrace")), new b(jCurrentTimeMillis));
                    o(strK);
                }
            } catch (Throwable th3) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th3);
            }
        }
        return z13;
    }

    public void m() {
        com.apm.lite.b.b bVar = this.f39835a;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void s() {
        if (D) {
            return;
        }
        synchronized (this.f39855u) {
            if (D) {
                return;
            }
            this.f39859y.run();
        }
    }

    public void t() {
        if (NativeImpl.isResendSigQuit()) {
            try {
                i.j(w(), String.valueOf(this.f39860z + 1), false);
            } catch (Throwable th2) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th2);
            }
        }
        this.f39857w = SystemClock.uptimeMillis();
        this.f39856v = true;
    }

    public void u() {
        File fileW = w();
        try {
            int iIntValue = Integer.decode(i.z(fileW.getAbsolutePath())).intValue();
            this.f39860z = iIntValue;
            if (iIntValue >= 2) {
                NativeImpl.setResendSigQuit(false);
            } else {
                NativeImpl.setResendSigQuit(true);
            }
        } catch (IOException unused) {
            NativeImpl.setResendSigQuit(true);
        } catch (Throwable unused2) {
            i.r(fileW);
        }
    }
}
