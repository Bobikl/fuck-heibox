package com.alipay.sdk.app;

import android.content.Intent;
import android.net.Uri;
import h5.b;
import x5.a;

/* JADX INFO: loaded from: classes6.dex */
public class H5OpenAuthActivity extends H5PayActivity {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f39434j = false;

    @Override // com.alipay.sdk.app.H5PayActivity
    public void a() {
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onDestroy() {
        if (this.f39434j) {
            try {
                a aVarA = a.C1277a.a(getIntent());
                if (aVarA != null) {
                    h5.a.h(this, aVarA, "", aVarA.f141085d);
                }
            } catch (Throwable unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        try {
            a aVarA = a.C1277a.a(intent);
            try {
                super.startActivity(intent);
                Uri data = intent != null ? intent.getData() : null;
                if (data == null || !data.toString().startsWith("alipays://platformapi/startapp")) {
                    return;
                }
                finish();
            } catch (Throwable th2) {
                String string = (intent == null || intent.getData() == null) ? "null" : intent.getData().toString();
                if (aVarA != null) {
                    h5.a.f(aVarA, b.f119113l, b.f119122p0, th2, string);
                }
                this.f39434j = true;
                throw th2;
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
