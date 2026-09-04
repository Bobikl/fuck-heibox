package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.d;
import com.xiaomi.mipush.sdk.Constants;
import h5.b;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import z5.j;

/* JADX INFO: loaded from: classes6.dex */
public class AlipayResultActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f39428b = new ConcurrentHashMap<>();

    public interface a {
        void a(int i10, String str, String str2);
    }

    private void a(String str, Bundle bundle) {
        a aVarRemove = f39428b.remove(str);
        if (aVarRemove == null) {
            finish();
            return;
        }
        try {
            aVarRemove.a(bundle.getInt("endCode"), bundle.getString(j.f141893b), bundle.getString("result"));
        } finally {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Throwable th2;
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            try {
                String stringExtra = intent.getStringExtra(d.aw);
                Bundle bundleExtra = intent.getBundleExtra("result");
                String stringExtra2 = intent.getStringExtra("scene");
                x5.a aVarB = x5.a.C1277a.b(stringExtra);
                if (aVarB == null) {
                    finish();
                    return;
                }
                h5.a.d(aVarB, b.f119113l, "BSPSession", stringExtra + "|" + SystemClock.elapsedRealtime());
                if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
                    a(stringExtra, bundleExtra);
                    return;
                }
                if ((TextUtils.isEmpty(stringExtra) || bundleExtra == null) && intent.getData() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), "UTF-8"));
                        JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                        stringExtra = jSONObject.getString(d.aw);
                        h5.a.d(aVarB, b.f119113l, "BSPUriSession", stringExtra);
                        Bundle bundle2 = new Bundle();
                        try {
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                bundle2.putString(next, jSONObject2.getString(next));
                            }
                            bundleExtra = bundle2;
                        } catch (Throwable th3) {
                            th2 = th3;
                            bundleExtra = bundle2;
                            h5.a.e(aVarB, b.f119113l, "BSPResEx", th2);
                            h5.a.e(aVarB, b.f119113l, b.f119128s0, th2);
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                if (TextUtils.isEmpty(stringExtra) || bundleExtra == null) {
                    h5.a.h(this, aVarB, "", aVarB.f141085d);
                    finish();
                    return;
                }
                try {
                    h5.a.d(aVarB, b.f119113l, b.V, "" + SystemClock.elapsedRealtime());
                    h5.a.d(aVarB, b.f119113l, b.W, bundleExtra.getInt("endCode", -1) + "|" + bundleExtra.getString(j.f141893b, Constants.ACCEPT_TIME_SEPARATOR_SERVER));
                    OpenAuthTask.d(stringExtra, 9000, "OK", bundleExtra);
                } finally {
                    h5.a.h(this, aVarB, "", aVarB.f141085d);
                    finish();
                }
            } catch (Throwable th5) {
                h5.a.e(null, b.f119113l, "BSPSerError", th5);
                h5.a.e(null, b.f119113l, b.f119126r0, th5);
                finish();
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
