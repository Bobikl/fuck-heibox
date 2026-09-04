package com.alipay.sdk.app;

/* JADX INFO: loaded from: classes6.dex */
public class H5AuthActivity extends H5PayActivity {
    @Override // com.alipay.sdk.app.H5PayActivity
    public void a() {
        Object obj = AuthTask.f39429c;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }
}
