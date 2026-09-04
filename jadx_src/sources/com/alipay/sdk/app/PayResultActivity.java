package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import z5.e;

/* JADX INFO: loaded from: classes6.dex */
public final class PayResultActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f39459c = "{\"isLogin\":\"false\"}";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap<String, Object> f39460d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f39461e = "hk.alipay.wallet";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f39462f = "phonecashier.pay.hash";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f39463g = "orderSuffix";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f39464h = "externalPkgName";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f39465i = "phonecashier.pay.result";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f39466j = "phonecashier.pay.resultOrderHash";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x5.a f39467b = null;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f39468b;

        public a(Activity activity) {
            this.f39468b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f39468b.finish();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static volatile String f39469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static volatile String f39470b;
    }

    public static void a(Activity activity, int i10) {
        new Handler().postDelayed(new a(activity), i10);
    }

    public static void b(Activity activity, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        Intent intent = new Intent();
        try {
            intent.setPackage(f39461e);
            intent.setData(Uri.parse("alipayhk://platformapi/startApp?appId=20000125&schemePaySession=" + URLEncoder.encode(str, "UTF-8") + "&orderSuffix=" + URLEncoder.encode(str2, "UTF-8") + "&packageName=" + URLEncoder.encode(str3, "UTF-8") + "&externalPkgName=" + URLEncoder.encode(str3, "UTF-8")));
        } catch (UnsupportedEncodingException e10) {
            e.d(e10);
        }
        if (activity != null) {
            try {
                activity.startActivity(intent);
            } catch (Throwable unused) {
                activity.finish();
            }
        }
    }

    public static void c(String str) {
        b.f39470b = f5.b.a();
        e(f39460d, str);
    }

    public static void d(String str, String str2) {
        b.f39470b = str;
        e(f39460d, str2);
    }

    public static boolean e(HashMap<String, Object> map, String str) {
        Object obj;
        if (map == null || str == null || (obj = map.get(str)) == null) {
            return false;
        }
        synchronized (obj) {
            obj.notifyAll();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            if (!TextUtils.isEmpty(intent.getStringExtra(f39463g))) {
                b.f39469a = intent.getStringExtra(f39462f);
                String stringExtra = intent.getStringExtra(f39463g);
                String stringExtra2 = intent.getStringExtra(f39464h);
                x5.a aVarA = x5.a.C1277a.a(intent);
                this.f39467b = aVarA;
                if (aVarA == null) {
                    finish();
                }
                b(this, b.f39469a, stringExtra, stringExtra2);
                a(this, 300);
                return;
            }
            if (this.f39467b == null) {
                finish();
            }
            String stringExtra3 = intent.getStringExtra(f39465i);
            int intExtra = intent.getIntExtra(f39466j, 0);
            if (intExtra != 0 && TextUtils.equals(b.f39469a, String.valueOf(intExtra))) {
                if (TextUtils.isEmpty(stringExtra3)) {
                    c(b.f39469a);
                } else {
                    d(stringExtra3, b.f39469a);
                }
                b.f39469a = "";
                a(this, 300);
                return;
            }
            h5.a.i(this.f39467b, h5.b.f119113l, h5.b.f119114l0, "Expected " + b.f39469a + ", got " + intExtra);
            c(b.f39469a);
            a(this, 300);
        } catch (Throwable unused) {
            finish();
        }
    }
}
