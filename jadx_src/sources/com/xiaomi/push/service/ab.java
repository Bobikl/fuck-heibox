package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.hm;
import com.xiaomi.push.jj;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ab extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ jj f107863a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ XMPushService f992a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(int i10, XMPushService xMPushService, jj jjVar) {
        super(i10);
        this.f992a = xMPushService;
        this.f107863a = jjVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send ack message for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        Map<String, String> mapA = null;
        try {
            if (com.xiaomi.push.j.m521a((Context) this.f992a)) {
                try {
                    mapA = ah.a((Context) this.f992a, this.f107863a);
                } catch (Throwable unused) {
                }
            }
            ai.a(this.f992a, z.a(this.f992a, this.f107863a, mapA));
        } catch (hm e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            this.f992a.a(10, e10);
        }
    }
}
