package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.in;
import com.xiaomi.push.ix;
import com.xiaomi.push.jm;
import com.xiaomi.push.jx;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class aj extends by.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f107871a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ u f1002a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(String str, long j10, XMPushService xMPushService, u uVar) {
        super(str, j10);
        this.f107871a = xMPushService;
        this.f1002a = uVar;
    }

    @Override // com.xiaomi.push.service.by.a
    void a(by byVar) {
        com.xiaomi.push.ax axVarA = com.xiaomi.push.ax.a(this.f107871a);
        String strA = byVar.a("MSAID", "msaid");
        String strMo150a = axVarA.mo150a();
        if (TextUtils.isEmpty(strMo150a) || TextUtils.equals(strA, strMo150a)) {
            return;
        }
        byVar.a("MSAID", "msaid", strMo150a);
        jm jmVar = new jm();
        jmVar.b(this.f1002a.f108040d);
        jmVar.c(ix.ClientInfoUpdate.f623a);
        jmVar.a(bc.a());
        jmVar.a(new HashMap());
        axVarA.a(jmVar.m580a());
        byte[] bArrA = jx.a(ai.a(this.f107871a.getPackageName(), this.f1002a.f108040d, jmVar, in.Notification));
        XMPushService xMPushService = this.f107871a;
        xMPushService.a(xMPushService.getPackageName(), bArrA, true);
    }
}
