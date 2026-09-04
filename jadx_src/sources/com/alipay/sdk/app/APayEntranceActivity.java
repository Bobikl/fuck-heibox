package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import h5.b;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class APayEntranceActivity extends Activity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f39420e = "ap_order_info";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f39421f = "ap_target_packagename";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f39422g = "ap_session";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f39423h = "ap_local_info";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f39424i = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f39425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f39426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x5.a f39427d;

    public interface a {
        void a(String str);
    }

    @Override // android.app.Activity
    public void finish() {
        String str = this.f39426c;
        h5.a.d(this.f39427d, b.f119113l, "BSAFinish", str + "|" + TextUtils.isEmpty(this.f39425b));
        if (TextUtils.isEmpty(this.f39425b)) {
            this.f39425b = f5.b.a();
            x5.a aVar = this.f39427d;
            if (aVar != null) {
                aVar.l(true);
            }
        }
        if (str != null) {
            a aVarRemove = f39424i.remove(str);
            if (aVarRemove != null) {
                aVarRemove.a(this.f39425b);
            } else {
                h5.a.i(this.f39427d, "wr", "refNull", "session=" + str);
            }
        }
        try {
            super.finish();
        } catch (Throwable th2) {
            h5.a.e(this.f39427d, "wr", "APStartFinish", th2);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        h5.a.d(this.f39427d, b.f119113l, "BSAOnAR", this.f39426c + "|" + i10 + Constants.ACCEPT_TIME_SEPARATOR_SP + i11);
        if (i10 == 1000) {
            if (intent != null) {
                try {
                    this.f39425b = intent.getStringExtra("result");
                } catch (Throwable unused) {
                }
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            String string = extras.getString(f39420e);
            String string2 = extras.getString(f39421f);
            this.f39426c = extras.getString(f39422g);
            String string3 = extras.getString(f39423h, "{}");
            if (!TextUtils.isEmpty(this.f39426c)) {
                x5.a aVarB = x5.a.C1277a.b(this.f39426c);
                this.f39427d = aVarB;
                h5.a.d(aVarB, b.f119113l, "BSAEntryCreate", this.f39426c + "|" + SystemClock.elapsedRealtime());
            }
            Intent intent = new Intent();
            intent.putExtra("order_info", string);
            intent.putExtra("localInfo", string3);
            intent.setClassName(string2, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            try {
                startActivityForResult(intent, 1000);
            } catch (Throwable th2) {
                h5.a.e(this.f39427d, "wr", "APStartEx", th2);
                finish();
            }
            if (this.f39427d != null) {
                Context applicationContext = getApplicationContext();
                x5.a aVar = this.f39427d;
                h5.a.b(applicationContext, aVar, string, aVar.f141085d);
                this.f39427d.g(true);
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
