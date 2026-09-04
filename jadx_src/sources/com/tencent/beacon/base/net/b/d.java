package com.tencent.beacon.base.net.b;

import android.text.TextUtils;
import com.tencent.beacon.base.net.a.m;
import com.tencent.beacon.e.g;
import com.tencent.beacon.pack.SocketRequestPackage;
import java.util.Map;

/* JADX INFO: compiled from: SocketRequestConverter.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements c<m, SocketRequestPackage> {
    private Map<String, String> b(m mVar) {
        Map<String, String> mapD = mVar.d();
        if (!mapD.containsKey("sid")) {
            String strC = g.b().c();
            if (!TextUtils.isEmpty(strC)) {
                mapD.put("sid", strC);
            }
        }
        return mapD;
    }

    @Override // com.tencent.beacon.base.net.b.c
    public SocketRequestPackage a(m mVar) {
        return new SocketRequestPackage(b(mVar), mVar.b());
    }
}
