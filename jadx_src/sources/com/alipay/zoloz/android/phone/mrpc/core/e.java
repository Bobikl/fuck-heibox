package com.alipay.zoloz.android.phone.mrpc.core;

import android.content.Context;

/* JADX INFO: compiled from: DefaultRpcClient.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f39637a;

    /* JADX INFO: compiled from: DefaultRpcClient.java */
    public class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f39638a;

        a(w wVar) {
            this.f39638a = wVar;
        }

        @Override // com.alipay.zoloz.android.phone.mrpc.core.d
        public y d() {
            return i.k(getApplicationContext());
        }

        @Override // com.alipay.zoloz.android.phone.mrpc.core.d
        public boolean e() {
            return this.f39638a.c();
        }

        @Override // com.alipay.zoloz.android.phone.mrpc.core.d
        public w f() {
            return this.f39638a;
        }

        @Override // com.alipay.zoloz.android.phone.mrpc.core.d
        public Context getApplicationContext() {
            return e.this.f39637a.getApplicationContext();
        }

        @Override // com.alipay.zoloz.android.phone.mrpc.core.d
        public String getUrl() {
            return this.f39638a.a();
        }
    }

    public e(Context context) {
        this.f39637a = context;
    }

    private d c(w wVar) {
        return new a(wVar);
    }

    @Override // com.alipay.zoloz.android.phone.mrpc.core.s
    public <T> T a(Class<T> cls, w wVar) {
        return (T) new t(c(wVar)).b(cls);
    }
}
