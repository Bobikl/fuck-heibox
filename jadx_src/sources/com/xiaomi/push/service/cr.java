package com.xiaomi.push.service;

import com.xiaomi.push.ex;
import com.xiaomi.push.hc;
import com.xiaomi.push.hf;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class cr extends hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f108001a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cr(XMPushService xMPushService, Map map, int i10, String str, hf hfVar) {
        super(map, i10, str, hfVar);
        this.f108001a = xMPushService;
    }

    @Override // com.xiaomi.push.hc
    /* JADX INFO: renamed from: a */
    public byte[] mo447a() {
        try {
            ex.b bVar = new ex.b();
            bVar.a(bw.a().m741a());
            return bVar.m274a();
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("getOBBString err: " + e10.toString());
            return null;
        }
    }
}
