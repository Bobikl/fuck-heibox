package com.tencent.beacon.a.c;

import android.content.Context;
import com.tencent.qimei.sdk.IAsyncQimeiListener;
import com.tencent.qimei.sdk.QimeiSDK;

/* JADX INFO: compiled from: QimeiWrapper.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f98823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f98824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ IAsyncQimeiListener f98825c;

    i(String str, Context context, IAsyncQimeiListener iAsyncQimeiListener) {
        this.f98823a = str;
        this.f98824b = context;
        this.f98825c = iAsyncQimeiListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.beacon.base.util.c.a("QimeiWrapper", "async getQimeiWithAppkey  appkey is %s", this.f98823a);
        j.c(this.f98824b.getApplicationContext(), this.f98823a);
        QimeiSDK.getInstance(this.f98823a).getQimei(this.f98825c);
    }
}
