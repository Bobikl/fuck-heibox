package com.tencent.qimei.r;

import com.tencent.qimei.sdk.IAsyncQimeiListener;
import com.tencent.qimei.sdk.Qimei;

/* JADX INFO: compiled from: QimeiSDKInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class m implements IAsyncQimeiListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f101413a;

    public m(n nVar) {
        this.f101413a = nVar;
    }

    @Override // com.tencent.qimei.sdk.IAsyncQimeiListener
    public void onQimeiDispatch(Qimei qimei) {
        com.tencent.qimei.p.b.a().a(this.f101413a.f101417d);
    }
}
