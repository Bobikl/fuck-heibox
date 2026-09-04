package com.tencent.beacon.a.c;

import com.tencent.qimei.sdk.IAsyncQimeiListener;
import com.tencent.qimei.sdk.Qimei;

/* JADX INFO: compiled from: QimeiWrapper.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements IAsyncQimeiListener {
    g() {
    }

    @Override // com.tencent.qimei.sdk.IAsyncQimeiListener
    public void onQimeiDispatch(Qimei qimei) {
        com.tencent.beacon.base.util.c.a("QimeiWrapper", "init onQimeiDispatch : qimei is %s", qimei.toString());
        com.tencent.beacon.a.a.b.a().a(new com.tencent.beacon.a.a.c(1));
    }
}
