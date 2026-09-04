package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.igexin.assist.sdk.AssistPushConsts;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.d;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import z5.e;
import z5.l;

/* JADX INFO: loaded from: classes6.dex */
public final class OpenAuthTask {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<String, a> f39443e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f39444f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f39445g = 9000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f39446h = 5000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f39447i = 4001;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f39448j = 4000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f39449k = 122;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f39451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f39452c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f39450a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f39453d = new Handler(Looper.getMainLooper());

    public enum BizType {
        Invoice("20000920"),
        AccountAuth("20000067"),
        Deduct("60000157");

        public String appId;

        BizType(String str) {
            this.appId = str;
        }
    }

    public interface a {
        void a(int i10, String str, Bundle bundle);
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39454a;

        static {
            int[] iArr = new int[BizType.values().length];
            f39454a = iArr;
            try {
                iArr[BizType.Deduct.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39454a[BizType.AccountAuth.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39454a[BizType.Invoice.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f39456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f39457d;

        public c(int i10, String str, Bundle bundle) {
            this.f39455b = i10;
            this.f39456c = str;
            this.f39457d = bundle;
        }

        public /* synthetic */ c(OpenAuthTask openAuthTask, int i10, String str, Bundle bundle, b bVar) {
            this(i10, str, bundle);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (OpenAuthTask.this.f39452c != null) {
                OpenAuthTask.this.f39452c.a(this.f39455b, this.f39456c, this.f39457d);
            }
        }
    }

    public OpenAuthTask(Activity activity) {
        this.f39451b = activity;
        x5.b.e().b(activity);
    }

    private String b(long j10, String str, BizType bizType, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AnalyticsConfig.RTD_START_TIME, String.valueOf(j10));
        jSONObject.put(d.aw, str);
        jSONObject.put("package", this.f39451b.getPackageName());
        if (bizType != null) {
            jSONObject.put("appId", bizType.appId);
        }
        jSONObject.put("sdkVersion", "h.a.3.8.11");
        jSONObject.put("mqpURL", str2);
        return Base64.encodeToString(jSONObject.toString().getBytes(Charset.forName("UTF-8")), 2);
    }

    private String c(BizType bizType, Map<String, String> map) {
        if (bizType == null) {
            throw new RuntimeException("missing bizType");
        }
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", bizType.appId);
        if (b.f39454a[bizType.ordinal()] == 1) {
            builderAppendQueryParameter.appendQueryParameter("appClearTop", "false").appendQueryParameter("startMultApp", "YES");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderAppendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderAppendQueryParameter.build().toString();
    }

    public static void d(String str, int i10, String str2, Bundle bundle) {
        a aVarRemove = f39443e.remove(str);
        if (aVarRemove != null) {
            try {
                aVarRemove.a(i10, str2, bundle);
            } catch (Throwable th2) {
                e.d(th2);
            }
        }
    }

    private boolean e(x5.a aVar, String str, BizType bizType, Map<String, String> map, boolean z10) {
        PackageInfo packageInfo;
        if (this.f39450a) {
            this.f39453d.post(new c(this, 4000, "该 OpenAuthTask 已在执行", null, null));
            return true;
        }
        this.f39450a = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f39444f <= 3000) {
            this.f39453d.post(new c(this, 5000, "3s 内重复支付", null, null));
            return true;
        }
        f39444f = jElapsedRealtime;
        f5.a.b("");
        String strG = l.g(32);
        HashMap map2 = new HashMap(map);
        map2.put("mqpPkgName", this.f39451b.getPackageName());
        map2.put("mqpScene", "sdk");
        List<l5.a.b> listZ = l5.a.d().z();
        if (!l5.a.d().f130865h || listZ == null) {
            listZ = f5.a.f118751d;
        }
        l.c cVarT = l.t(aVar, this.f39451b, listZ);
        if (cVarT == null || cVarT.b(aVar) || cVarT.a() || (packageInfo = cVarT.f141907a) == null || packageInfo.versionCode < 122) {
            if (!z10) {
                this.f39453d.post(new c(this, 4001, "支付宝未安装或签名错误", null, null));
                return true;
            }
            map2.put("mqpScheme", String.valueOf(str));
            map2.put("mqpNotifyName", strG);
            map2.put("mqpScene", "landing");
            String strC = c(bizType, map2);
            Intent intent = new Intent(this.f39451b, (Class<?>) H5OpenAuthActivity.class);
            intent.putExtra("url", String.format("https://render.alipay.com/p/s/i?scheme=%s", Uri.encode(strC)));
            x5.a.C1277a.c(aVar, intent);
            this.f39451b.startActivity(intent);
            return false;
        }
        try {
            try {
                HashMap<String, String> mapF = x5.a.f(aVar);
                mapF.put("ts_scheme", String.valueOf(SystemClock.elapsedRealtime()));
                map2.put("mqpLoc", new JSONObject(mapF).toString());
            } catch (Throwable th2) {
                h5.a.e(aVar, h5.b.f119113l, "OpenAuthLocEx", th2);
            }
            String strC2 = c(bizType, map2);
            f39443e.put(strG, this.f39452c);
            String strB = null;
            try {
                strB = b(jElapsedRealtime, strG, bizType, strC2);
            } catch (JSONException e10) {
                h5.a.e(aVar, h5.b.f119113l, h5.b.f119124q0, e10);
            }
            String str2 = strB;
            if (TextUtils.isEmpty(str2)) {
                this.f39453d.post(new c(this, 4000, "参数错误", null, null));
                return true;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", "20001129").appendQueryParameter(AssistPushConsts.MSG_TYPE_PAYLOAD, str2).build());
            intent2.addFlags(268435456);
            intent2.setPackage(cVarT.f141907a.packageName);
            try {
                h5.a.d(aVar, h5.b.f119113l, h5.b.Y, "" + jElapsedRealtime);
                x5.a.C1277a.d(aVar, strG);
                this.f39451b.startActivity(intent2);
            } catch (Throwable th3) {
                h5.a.e(aVar, h5.b.f119113l, "StartWalletEx", th3);
            }
            return false;
        } catch (Throwable unused) {
            this.f39453d.post(new c(this, 4000, "业务参数错误", null, null));
            return true;
        }
    }

    public void f(String str, BizType bizType, Map<String, String> map, a aVar, boolean z10) {
        x5.a aVar2 = new x5.a(this.f39451b, String.valueOf(map), "oa-" + bizType);
        this.f39452c = aVar;
        if (e(aVar2, str, bizType, map, z10)) {
            h5.a.h(this.f39451b, aVar2, "", aVar2.f141085d);
        }
    }
}
