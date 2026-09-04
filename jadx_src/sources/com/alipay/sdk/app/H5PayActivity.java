package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.alipay.sdk.m.x.c;
import com.alipay.sdk.m.x.d;
import f5.b;
import java.lang.ref.WeakReference;
import x5.a;
import z5.e;
import z5.l;

/* JADX INFO: loaded from: classes6.dex */
public class H5PayActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f39435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f39436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f39437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f39438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f39439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f39440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f39441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public WeakReference<a> f39442i;

    private void b() {
        try {
            super.requestWindowFeature(1);
            getWindow().addFlags(8192);
        } catch (Throwable th2) {
            e.d(th2);
        }
    }

    public void a() {
        Object obj = PayTask.f39471h;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        a();
        super.finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1010) {
            f5.c.a((a) l.f(this.f39442i), i10, i11, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c cVar = this.f39435b;
        if (cVar == null) {
            finish();
            return;
        }
        if (cVar.m()) {
            cVar.n();
            return;
        }
        if (!cVar.n()) {
            super.onBackPressed();
        }
        b.c(b.a());
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        b();
        super.onCreate(bundle);
        try {
            a aVarA = a.C1277a.a(getIntent());
            if (aVarA == null) {
                finish();
                return;
            }
            this.f39442i = new WeakReference<>(aVarA);
            if (l5.a.d().M()) {
                setRequestedOrientation(3);
            } else {
                setRequestedOrientation(1);
            }
            try {
                Bundle extras = getIntent().getExtras();
                String string = extras.getString("url", null);
                this.f39436c = string;
                if (!l.Y(string)) {
                    finish();
                    return;
                }
                this.f39438e = extras.getString("cookie", null);
                this.f39437d = extras.getString("method", null);
                this.f39439f = extras.getString("title", null);
                this.f39441h = extras.getString("version", c.f39529d);
                this.f39440g = extras.getBoolean("backisexit", false);
                try {
                    d dVar = new d(this, aVarA, this.f39441h);
                    setContentView(dVar);
                    dVar.r(this.f39439f, this.f39437d, this.f39440g);
                    dVar.l(this.f39436c, this.f39438e);
                    dVar.k(this.f39436c);
                    this.f39435b = dVar;
                } catch (Throwable th2) {
                    h5.a.e(aVarA, h5.b.f119113l, "GetInstalledAppEx", th2);
                    finish();
                }
            } catch (Exception unused) {
                finish();
            }
        } catch (Exception unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c cVar = this.f39435b;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        try {
            super.setRequestedOrientation(i10);
        } catch (Throwable th2) {
            try {
                h5.a.e((a) l.f(this.f39442i), h5.b.f119113l, h5.b.B, th2);
            } catch (Throwable unused) {
            }
        }
    }
}
