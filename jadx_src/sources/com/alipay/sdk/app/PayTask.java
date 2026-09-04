package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.d;
import com.max.hbpay.PaymentManager;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;
import z5.e;
import z5.f;
import z5.g;
import z5.j;
import z5.l;

/* JADX INFO: loaded from: classes6.dex */
public class PayTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f39471h = f.class;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static long f39472i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f39473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c6.a f39474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39475c = "wappaygw.alipay.com/service/rest.htm";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39476d = "mclient.alipay.com/service/rest.htm";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39477e = "mclient.alipay.com/home/exterfaceAssign.htm";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f39478f = "mclient.alipay.com/cashier/mobilepay.htm";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<String, c> f39479g = new HashMap();

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f39480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f39481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ H5PayCallback f39482d;

        public a(String str, boolean z10, H5PayCallback h5PayCallback) {
            this.f39480b = str;
            this.f39481c = z10;
            this.f39482d = h5PayCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            g6.a aVarH5Pay = PayTask.this.h5Pay(new x5.a(PayTask.this.f39473a, this.f39480b, "payInterceptorWithUrl"), this.f39480b, this.f39481c);
            e.i(j5.a.f124275z, "inc finished: " + aVarH5Pay.a());
            this.f39482d.onPayResult(aVarH5Pay);
        }
    }

    public class b implements f.g {
        public b() {
        }

        @Override // z5.f.g
        public void a() {
            PayTask.this.dismissLoading();
        }

        @Override // z5.f.g
        public void b() {
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f39485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f39486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f39487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f39488d;

        public c() {
            this.f39485a = "";
            this.f39486b = "";
            this.f39487c = "";
            this.f39488d = "";
        }

        public /* synthetic */ c(PayTask payTask, a aVar) {
            this();
        }

        public String a() {
            return this.f39487c;
        }

        public void b(String str) {
            this.f39487c = str;
        }

        public String c() {
            return this.f39485a;
        }

        public void d(String str) {
            this.f39485a = str;
        }

        public String e() {
            return this.f39486b;
        }

        public void f(String str) {
            this.f39486b = str;
        }

        public String g() {
            return this.f39488d;
        }

        public void h(String str) {
            this.f39488d = str;
        }
    }

    public PayTask(Activity activity) {
        this.f39473a = activity;
        x5.b.e().b(this.f39473a);
        this.f39474b = new c6.a(activity, c6.a.f35596j);
    }

    public static String a(Context context) {
        String str;
        String str2;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                str2 = packageInfo.packageName;
            } catch (Exception e10) {
                e = e10;
                e.d(e);
                str2 = "";
            }
        } catch (Exception e11) {
            e = e11;
            str = "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", j5.a.f124255f);
            jSONObject.put(x5.a.f141074s, "and_lite");
            jSONObject.put(x5.a.f141075t, "h.a.3.8.11");
            jSONObject.put(x5.a.f141076u, str2);
            jSONObject.put(x5.a.f141078w, str);
            jSONObject.put(x5.a.f141079x, System.currentTimeMillis());
            if (!TextUtils.isEmpty("sc")) {
                jSONObject.put("sc", "h5tonative");
            }
            return jSONObject.toString();
        } catch (Throwable th2) {
            e.d(th2);
            return "";
        }
    }

    public static String a(x5.a aVar, String str, List<l5.a.b> list, String str2, Activity activity) {
        l.c cVarT = l.t(aVar, activity, list);
        if (cVarT == null || cVarT.b(aVar) || cVarT.a() || !TextUtils.equals(cVarT.f141907a.packageName, PayResultActivity.f39461e)) {
            return str2;
        }
        e.g(j5.a.f124275z, "PayTask not_login");
        String strValueOf = String.valueOf(str.hashCode());
        Object obj = new Object();
        HashMap<String, Object> map = PayResultActivity.f39460d;
        map.put(strValueOf, obj);
        Intent intent = new Intent(activity, (Class<?>) PayResultActivity.class);
        intent.putExtra(PayResultActivity.f39463g, str);
        intent.putExtra(PayResultActivity.f39464h, activity.getPackageName());
        intent.putExtra(PayResultActivity.f39462f, strValueOf);
        x5.a.C1277a.c(aVar, intent);
        activity.startActivity(intent);
        synchronized (map.get(strValueOf)) {
            try {
                e.g(j5.a.f124275z, "PayTask wait");
                map.get(strValueOf).wait();
            } catch (InterruptedException unused) {
                e.g(j5.a.f124275z, "PayTask interrupted");
                return f5.b.a();
            }
        }
        String str3 = PayResultActivity.b.f39470b;
        e.g(j5.a.f124275z, "PayTask ret: " + str3);
        return str3;
    }

    public static final String a(String... strArr) {
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    private String b(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf(g.f141884d));
    }

    private String c(String str, Map<String, String> map) throws UnsupportedEncodingException {
        boolean zEquals = "9000".equals(map.get(j.f141892a));
        String str2 = map.get("result");
        c cVarRemove = this.f39479g.remove(str);
        String[] strArr = new String[2];
        strArr[0] = cVarRemove != null ? cVarRemove.a() : "";
        strArr[1] = cVarRemove != null ? cVarRemove.g() : "";
        a(strArr);
        if (map.containsKey("callBackUrl")) {
            return map.get("callBackUrl");
        }
        if (str2.length() > 15) {
            String strA = a(l.i("&callBackUrl=\"", "\"", str2), l.i("&call_back_url=\"", "\"", str2), l.i(j5.a.f124269t, "\"", str2), URLDecoder.decode(l.i(j5.a.f124270u, "&", str2), "utf-8"), URLDecoder.decode(l.i("&callBackUrl=", "&", str2), "utf-8"), l.i("call_back_url=\"", "\"", str2));
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
        }
        if (cVarRemove != null) {
            String strC = zEquals ? cVarRemove.c() : cVarRemove.e();
            if (!TextUtils.isEmpty(strC)) {
                return strC;
            }
        }
        return cVarRemove != null ? l5.a.d().F() : "";
    }

    private String d(String str, x5.a aVar) {
        String strB = aVar.b(str);
        if (strB.contains("paymethod=\"expressGateway\"")) {
            return e(aVar, strB);
        }
        List<l5.a.b> listZ = l5.a.d().z();
        if (!l5.a.d().f130865h || listZ == null) {
            listZ = f5.a.f118751d;
        }
        if (!l.y(aVar, this.f39473a, listZ, true)) {
            h5.a.c(aVar, h5.b.f119113l, h5.b.f119110j0);
            return e(aVar, strB);
        }
        f fVar = new f(this.f39473a, aVar, i());
        e.i(j5.a.f124275z, "pay inner started: " + strB);
        String strF = fVar.f(strB, false);
        if (!TextUtils.isEmpty(strF)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("resultStatus={");
            com.alipay.sdk.m.j.c cVar = com.alipay.sdk.m.j.c.ACTIVITY_NOT_START_EXIT;
            sb2.append(cVar.b());
            sb2.append(g.f141884d);
            if (strF.contains(sb2.toString())) {
                l.u("alipaySdk", j5.b.f124292q, this.f39473a, aVar);
                if (l5.a.d().a()) {
                    strF = fVar.f(strB, true);
                } else {
                    strF = strF.replace("resultStatus={" + cVar.b() + g.f141884d, "resultStatus={" + com.alipay.sdk.m.j.c.CANCELED.b() + g.f141884d);
                }
            }
        }
        e.i(j5.a.f124275z, "pay inner raw result: " + strF);
        fVar.i();
        boolean zK = l5.a.d().K();
        if (TextUtils.equals(strF, f.f141859j) || TextUtils.equals(strF, f.f141860k) || (zK && aVar.s())) {
            h5.a.c(aVar, h5.b.f119113l, h5.b.f119109i0);
            return e(aVar, strB);
        }
        if (TextUtils.isEmpty(strF)) {
            return f5.b.a();
        }
        if (!strF.contains(PayResultActivity.f39459c)) {
            return strF;
        }
        h5.a.c(aVar, h5.b.f119113l, h5.b.f119112k0);
        return a(aVar, strB, listZ, strF, this.f39473a);
    }

    private String e(x5.a aVar, String str) {
        showLoading();
        com.alipay.sdk.m.j.c cVarB = null;
        try {
            try {
                try {
                    JSONObject jSONObjectC = new t5.f().i(aVar, this.f39473a.getApplicationContext(), str).c();
                    String strOptString = jSONObjectC.optString("end_code", null);
                    List<v5.a> listB = v5.a.b(jSONObjectC.optJSONObject(j5.c.f124295c).optJSONObject(j5.c.f124296d));
                    for (int i10 = 0; i10 < listB.size(); i10++) {
                        if (listB.get(i10).a() == com.alipay.sdk.m.r.a.Update) {
                            v5.a.c(listB.get(i10));
                        }
                    }
                    j(aVar, jSONObjectC);
                    dismissLoading();
                    h5.a.b(this.f39473a, aVar, str, aVar.f141085d);
                    for (int i11 = 0; i11 < listB.size(); i11++) {
                        v5.a aVar2 = listB.get(i11);
                        if (aVar2.a() == com.alipay.sdk.m.r.a.WapPay) {
                            String strG = g(aVar, aVar2);
                            dismissLoading();
                            h5.a.b(this.f39473a, aVar, str, aVar.f141085d);
                            return strG;
                        }
                        if (aVar2.a() == com.alipay.sdk.m.r.a.OpenWeb) {
                            String strH = h(aVar, aVar2, strOptString);
                            dismissLoading();
                            h5.a.b(this.f39473a, aVar, str, aVar.f141085d);
                            return strH;
                        }
                    }
                    dismissLoading();
                    h5.a.b(this.f39473a, aVar, str, aVar.f141085d);
                } catch (IOException e10) {
                    com.alipay.sdk.m.j.c cVarB2 = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.NETWORK_ERROR.b());
                    h5.a.g(aVar, h5.b.f119111k, e10);
                    dismissLoading();
                    h5.a.b(this.f39473a, aVar, str, aVar.f141085d);
                    cVarB = cVarB2;
                }
            } catch (Throwable th2) {
                e.d(th2);
                h5.a.e(aVar, h5.b.f119113l, h5.b.B, th2);
                dismissLoading();
                h5.a.b(this.f39473a, aVar, str, aVar.f141085d);
            }
            if (cVarB == null) {
                cVarB = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.FAILED.b());
            }
            return f5.b.b(cVarB.b(), cVarB.a(), "");
        } catch (Throwable th3) {
            dismissLoading();
            h5.a.b(this.f39473a, aVar, str, aVar.f141085d);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043 A[Catch: all -> 0x01fc, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0050 A[Catch: all -> 0x01fc, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0057 A[Catch: all -> 0x01fc, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f A[Catch: all -> 0x01fc, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x006c A[Catch: all -> 0x01fc, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0074 A[Catch: all -> 0x01fc, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x015f A[Catch: all -> 0x01fc, PHI: r9
  0x015f: PHI (r9v18 java.lang.String) = (r9v17 java.lang.String), (r9v20 java.lang.String) binds: [B:34:0x015d, B:29:0x0107] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x000f A[Catch: all -> 0x01fc, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0023 A[Catch: all -> 0x01fc, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    private synchronized String f(x5.a aVar, String str, boolean z10) {
        String strA;
        String strSubstring;
        int iIndexOf;
        if (z10) {
            showLoading();
            if (str.contains("payment_inst=")) {
                strSubstring = str.substring(str.indexOf("payment_inst=") + 13);
                iIndexOf = strSubstring.indexOf(38);
                if (iIndexOf > 0) {
                    strSubstring = strSubstring.substring(0, iIndexOf);
                }
                f5.a.b(strSubstring.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll(PaymentManager.f71422u, ""));
            } else {
                f5.a.b("");
            }
            if (str.contains(j5.a.f124271v)) {
                j5.a.f124272w = true;
            }
            if (j5.a.f124272w) {
                if (str.startsWith(j5.a.f124273x)) {
                    str = str.substring(str.indexOf(j5.a.f124273x) + 53);
                } else if (str.startsWith(j5.a.f124274y)) {
                    str = str.substring(str.indexOf(j5.a.f124274y) + 52);
                }
            }
            strA = "";
            try {
                e.i(j5.a.f124275z, "pay prepared: " + str);
                strA = d(str, aVar);
                e.i(j5.a.f124275z, "pay raw result: " + strA);
                g.c(aVar, this.f39473a.getApplicationContext(), strA);
                h5.a.d(aVar, h5.b.f119113l, h5.b.V, "" + SystemClock.elapsedRealtime());
                h5.a.d(aVar, h5.b.f119113l, h5.b.W, j.a(strA, j.f141892a) + "|" + j.a(strA, j.f141893b));
                if (!l5.a.d().G()) {
                    l5.a.d().l(aVar, this.f39473a.getApplicationContext(), false, 3);
                }
            } catch (Throwable th2) {
                try {
                    strA = f5.b.a();
                    e.d(th2);
                    h5.a.d(aVar, h5.b.f119113l, h5.b.V, "" + SystemClock.elapsedRealtime());
                    h5.a.d(aVar, h5.b.f119113l, h5.b.W, j.a(strA, j.f141892a) + "|" + j.a(strA, j.f141893b));
                    if (!l5.a.d().G()) {
                        l5.a.d().l(aVar, this.f39473a.getApplicationContext(), false, 3);
                    }
                } catch (Throwable th3) {
                    h5.a.d(aVar, h5.b.f119113l, h5.b.V, "" + SystemClock.elapsedRealtime());
                    h5.a.d(aVar, h5.b.f119113l, h5.b.W, j.a(strA, j.f141892a) + "|" + j.a(strA, j.f141893b));
                    if (!l5.a.d().G()) {
                        l5.a.d().l(aVar, this.f39473a.getApplicationContext(), false, 3);
                    }
                    dismissLoading();
                    h5.a.h(this.f39473a.getApplicationContext(), aVar, str, aVar.f141085d);
                    throw th3;
                }
            }
            dismissLoading();
            h5.a.h(this.f39473a.getApplicationContext(), aVar, str, aVar.f141085d);
            e.i(j5.a.f124275z, "pay returning: " + strA);
        } else {
            if (str.contains("payment_inst=")) {
                strSubstring = str.substring(str.indexOf("payment_inst=") + 13);
                iIndexOf = strSubstring.indexOf(38);
                if (iIndexOf > 0) {
                    strSubstring = strSubstring.substring(0, iIndexOf);
                }
                f5.a.b(strSubstring.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll(PaymentManager.f71422u, ""));
            } else {
                f5.a.b("");
            }
            if (str.contains(j5.a.f124271v)) {
                j5.a.f124272w = true;
            }
            if (j5.a.f124272w) {
                if (str.startsWith(j5.a.f124273x)) {
                    str = str.substring(str.indexOf(j5.a.f124273x) + 53);
                } else if (str.startsWith(j5.a.f124274y)) {
                    str = str.substring(str.indexOf(j5.a.f124274y) + 52);
                }
            }
            strA = "";
            e.i(j5.a.f124275z, "pay prepared: " + str);
            strA = d(str, aVar);
            e.i(j5.a.f124275z, "pay raw result: " + strA);
            g.c(aVar, this.f39473a.getApplicationContext(), strA);
            h5.a.d(aVar, h5.b.f119113l, h5.b.V, "" + SystemClock.elapsedRealtime());
            h5.a.d(aVar, h5.b.f119113l, h5.b.W, j.a(strA, j.f141892a) + "|" + j.a(strA, j.f141893b));
            if (!l5.a.d().G()) {
                l5.a.d().l(aVar, this.f39473a.getApplicationContext(), false, 3);
            }
            dismissLoading();
            h5.a.h(this.f39473a.getApplicationContext(), aVar, str, aVar.f141085d);
            e.i(j5.a.f124275z, "pay returning: " + strA);
        }
        throw th;
        return strA;
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
        try {
            x5.b.e().b(context);
            long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            if (jElapsedRealtime - f39472i < l5.a.d().r()) {
                return false;
            }
            f39472i = jElapsedRealtime;
            l5.a.d().l(x5.a.w(), context.getApplicationContext(), false, 4);
            return true;
        } catch (Exception e10) {
            e.d(e10);
            return false;
        }
        throw th;
    }

    private String g(x5.a aVar, v5.a aVar2) {
        String[] strArrG = aVar2.g();
        Intent intent = new Intent(this.f39473a, (Class<?>) H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", strArrG[0]);
        if (strArrG.length == 2) {
            bundle.putString("cookie", strArrG[1]);
        }
        intent.putExtras(bundle);
        x5.a.C1277a.c(aVar, intent);
        this.f39473a.startActivity(intent);
        Object obj = f39471h;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e10) {
                e.d(e10);
                return f5.b.a();
            }
        }
        String strG = f5.b.g();
        return TextUtils.isEmpty(strG) ? f5.b.a() : strG;
    }

    private String h(x5.a aVar, v5.a aVar2, String str) {
        boolean zF;
        String strG;
        String[] strArrG = aVar2.g();
        Intent intent = new Intent(this.f39473a, (Class<?>) H5PayActivity.class);
        try {
            JSONObject jSONObjectC0 = l.c0(new String(n5.a.d(strArrG[2])));
            intent.putExtra("url", strArrG[0]);
            intent.putExtra("title", strArrG[1]);
            intent.putExtra("version", "v2");
            intent.putExtra("method", jSONObjectC0.optString("method", "POST"));
            f5.b.d(false);
            f5.b.c(null);
            x5.a.C1277a.c(aVar, intent);
            this.f39473a.startActivity(intent);
            Object obj = f39471h;
            synchronized (obj) {
                try {
                    obj.wait();
                    zF = f5.b.f();
                    strG = f5.b.g();
                    f5.b.d(false);
                    f5.b.c(null);
                } catch (InterruptedException e10) {
                    e.d(e10);
                    return f5.b.a();
                }
            }
            String strB = "";
            if (zF) {
                try {
                    List<v5.a> listB = v5.a.b(l.c0(new String(n5.a.d(strG))));
                    for (int i10 = 0; i10 < listB.size(); i10++) {
                        v5.a aVar3 = listB.get(i10);
                        if (aVar3.a() == com.alipay.sdk.m.r.a.SetResult) {
                            String[] strArrG2 = aVar3.g();
                            strB = f5.b.b(Integer.valueOf(strArrG2[1]).intValue(), strArrG2[0], l.V(aVar, strArrG2[2]));
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    e.d(th2);
                    h5.a.f(aVar, h5.b.f119113l, h5.b.B, th2, strG);
                }
            }
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
            try {
                return f5.b.b(Integer.valueOf(str).intValue(), "", "");
            } catch (Throwable th3) {
                h5.a.f(aVar, h5.b.f119113l, h5.b.B, th3, "endCode: " + str);
                return f5.b.b(8000, "", "");
            }
        } catch (Throwable th4) {
            e.d(th4);
            h5.a.f(aVar, h5.b.f119113l, h5.b.B, th4, Arrays.toString(strArrG));
            return f5.b.a();
        }
    }

    private f.g i() {
        return new b();
    }

    private void j(x5.a aVar, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("tid");
            String strOptString2 = jSONObject.optString("client_key");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                return;
            }
            y5.a.a(x5.b.e().c()).c(strOptString, strOptString2);
        } catch (Throwable th2) {
            h5.a.e(aVar, h5.b.f119113l, h5.b.P, th2);
        }
    }

    private boolean k(boolean z10, boolean z11, String str, StringBuilder sb2, Map<String, String> map, String... strArr) {
        String str2;
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                str2 = "";
                break;
            }
            String str3 = strArr[i10];
            if (!TextUtils.isEmpty(map.get(str3))) {
                str2 = map.get(str3);
                break;
            }
            i10++;
        }
        if (TextUtils.isEmpty(str2)) {
            return !z11;
        }
        if (!z10) {
            sb2.append(str);
            sb2.append("=\"");
            sb2.append(str2);
            sb2.append("\"");
            return true;
        }
        sb2.append("&");
        sb2.append(str);
        sb2.append("=\"");
        sb2.append(str2);
        sb2.append("\"");
        return true;
    }

    public void dismissLoading() {
        c6.a aVar = this.f39474b;
        if (aVar != null) {
            aVar.c();
            this.f39474b = null;
        }
    }

    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String strTrim = str.trim();
                if (strTrim.startsWith("https://wappaygw.alipay.com/service/rest.htm") || strTrim.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
                    String strTrim2 = strTrim.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim2)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + l.i("<request_token>", "</request_token>", l.H(strTrim2).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.f39473a) + "\"";
                    }
                }
                if (strTrim.startsWith("https://mclient.alipay.com/service/rest.htm") || strTrim.startsWith("http://mclient.alipay.com/service/rest.htm")) {
                    String strTrim3 = strTrim.replaceFirst("(http|https)://mclient.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim3)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + l.i("<request_token>", "</request_token>", l.H(strTrim3).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.f39473a) + "\"";
                    }
                }
                if ((strTrim.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || strTrim.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm")) && ((strTrim.contains("alipay.wap.create.direct.pay.by.user") || strTrim.contains("create_forex_trade_wap")) && !TextUtils.isEmpty(strTrim.replaceFirst("(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "").trim()))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", str);
                    jSONObject.put("bizcontext", a(this.f39473a));
                    return x5.a.C + jSONObject.toString();
                }
                a aVar = null;
                if (Pattern.compile("^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)").matcher(str).find()) {
                    String strI = l.i("?", "", str);
                    if (!TextUtils.isEmpty(strI)) {
                        Map<String, String> mapH = l.H(strI);
                        StringBuilder sb2 = new StringBuilder();
                        if (k(false, true, h5.b.B0, sb2, mapH, h5.b.B0, "alipay_trade_no")) {
                            k(true, false, "pay_phase_id", sb2, mapH, "payPhaseId", "pay_phase_id", "out_relation_id");
                            sb2.append("&biz_sub_type=\"TRADE\"");
                            sb2.append("&biz_type=\"trade\"");
                            String str2 = mapH.get("app_name");
                            if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(mapH.get("cid"))) {
                                str2 = "ali1688";
                            } else if (TextUtils.isEmpty(str2) && (!TextUtils.isEmpty(mapH.get("sid")) || !TextUtils.isEmpty(mapH.get("s_id")))) {
                                str2 = d.f49806s0;
                            }
                            sb2.append("&app_name=\"" + str2 + "\"");
                            if (!k(true, true, "extern_token", sb2, mapH, "extern_token", "cid", "sid", "s_id")) {
                                return "";
                            }
                            k(true, false, "appenv", sb2, mapH, "appenv");
                            sb2.append("&pay_channel_id=\"alipay_sdk\"");
                            c cVar = new c(this, aVar);
                            cVar.d(mapH.get("return_url"));
                            cVar.f(mapH.get("show_url"));
                            cVar.b(mapH.get("pay_order_id"));
                            String str3 = sb2.toString() + "&bizcontext=\"" + a(this.f39473a) + "\"";
                            this.f39479g.put(str3, cVar);
                            return str3;
                        }
                    }
                }
                if (!strTrim.startsWith("https://mclient.alipay.com/cashier/mobilepay.htm") && !strTrim.startsWith("http://mclient.alipay.com/cashier/mobilepay.htm") && (!EnvUtils.b() || !strTrim.contains("mobileclientgw.alipaydev.com/cashier/mobilepay.htm"))) {
                    if (l5.a.d().v() && Pattern.compile("^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?").matcher(strTrim).find()) {
                        Uri uri = Uri.parse(strTrim);
                        String queryParameter = uri.getQueryParameter("return_url");
                        String queryParameter2 = uri.getQueryParameter("show_url");
                        String queryParameter3 = uri.getQueryParameter("pay_order_id");
                        String strA = a(uri.getQueryParameter("trade_nos"), uri.getQueryParameter("alipay_trade_no"));
                        String strA2 = a(uri.getQueryParameter("payPhaseId"), uri.getQueryParameter("pay_phase_id"), uri.getQueryParameter("out_relation_id"));
                        String[] strArr = new String[4];
                        strArr[0] = uri.getQueryParameter("app_name");
                        strArr[1] = !TextUtils.isEmpty(uri.getQueryParameter("cid")) ? "ali1688" : "";
                        strArr[2] = !TextUtils.isEmpty(uri.getQueryParameter("sid")) ? d.f49806s0 : "";
                        strArr[3] = !TextUtils.isEmpty(uri.getQueryParameter("s_id")) ? d.f49806s0 : "";
                        String strA3 = a(strArr);
                        String strA4 = a(uri.getQueryParameter("extern_token"), uri.getQueryParameter("cid"), uri.getQueryParameter("sid"), uri.getQueryParameter("s_id"));
                        String strA5 = a(uri.getQueryParameter("appenv"));
                        if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strA3) && !TextUtils.isEmpty(strA4)) {
                            String str4 = String.format("trade_no=\"%s\"&pay_phase_id=\"%s\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"%s\"&extern_token=\"%s\"&appenv=\"%s\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"%s\"", strA, strA2, strA3, strA4, strA5, a(this.f39473a));
                            c cVar2 = new c(this, null);
                            cVar2.d(queryParameter);
                            cVar2.f(queryParameter2);
                            cVar2.b(queryParameter3);
                            cVar2.h(strA);
                            this.f39479g.put(str4, cVar2);
                            return str4;
                        }
                    }
                }
                String strA6 = a(this.f39473a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", strTrim);
                jSONObject2.put("bizcontext", strA6);
                return String.format("new_external_info==%s", jSONObject2.toString());
            }
        } catch (Throwable th2) {
            e.d(th2);
        }
        return "";
    }

    public synchronized String fetchTradeToken() {
        return g.b(new x5.a(this.f39473a, "", "fetchTradeToken"), this.f39473a.getApplicationContext());
    }

    public String getVersion() {
        return "15.8.11";
    }

    public synchronized g6.a h5Pay(x5.a aVar, String str, boolean z10) {
        g6.a aVar2;
        aVar2 = new g6.a();
        try {
            String[] strArrSplit = f(aVar, str, z10).split(";");
            HashMap map = new HashMap();
            for (String str2 : strArrSplit) {
                int iIndexOf = str2.indexOf("={");
                if (iIndexOf >= 0) {
                    String strSubstring = str2.substring(0, iIndexOf);
                    map.put(strSubstring, b(str2, strSubstring));
                }
            }
            if (map.containsKey(j.f141892a)) {
                aVar2.c(map.get(j.f141892a));
            }
            aVar2.d(c(str, map));
            if (TextUtils.isEmpty(aVar2.b())) {
                h5.a.i(aVar, h5.b.f119113l, h5.b.f119118n0, "");
            }
        } catch (Throwable th2) {
            h5.a.e(aVar, h5.b.f119113l, h5.b.f119120o0, th2);
            e.d(th2);
        }
        return aVar2;
    }

    public synchronized String pay(String str, boolean z10) {
        if (z5.b.a()) {
            return f5.b.e();
        }
        return f(new x5.a(this.f39473a, str, SteamWalletJsObj.KEY_PAY), str, z10);
    }

    public synchronized boolean payInterceptorWithUrl(String str, boolean z10, H5PayCallback h5PayCallback) {
        String strFetchOrderInfoFromH5PayUrl;
        strFetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
        if (!TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl)) {
            e.i(j5.a.f124275z, "intercepted: " + strFetchOrderInfoFromH5PayUrl);
            new Thread(new a(strFetchOrderInfoFromH5PayUrl, z10, h5PayCallback)).start();
        }
        return !TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl);
    }

    public synchronized Map<String, String> payV2(String str, boolean z10) {
        String strF;
        x5.a aVar;
        if (z5.b.a()) {
            aVar = null;
            strF = f5.b.e();
        } else {
            x5.a aVar2 = new x5.a(this.f39473a, str, "payV2");
            strF = f(aVar2, str, z10);
            aVar = aVar2;
        }
        return j.d(aVar, strF);
    }

    public void showLoading() {
        c6.a aVar = this.f39474b;
        if (aVar != null) {
            aVar.j();
        }
    }
}
