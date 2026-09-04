package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.hm;
import com.xiaomi.push.service.XMPushService.b;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class x extends XMPushService.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private XMPushService f108047a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f1118a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private byte[] f1119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f108048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f108049c;

    public x(XMPushService xMPushService, String str, String str2, String str3, byte[] bArr) {
        super(9);
        this.f108047a = xMPushService;
        this.f1118a = str;
        this.f1119a = bArr;
        this.f108048b = str2;
        this.f108049c = str3;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "register app";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo404a() {
        bf.b next;
        u uVarM773a = v.m773a((Context) this.f108047a);
        if (uVarM773a == null) {
            try {
                uVarM773a = v.a(this.f108047a, this.f1118a, this.f108048b, this.f108049c);
            } catch (Exception e10) {
                com.xiaomi.channel.commonutils.logger.b.d("fail to register push account. " + e10);
            }
        }
        if (uVarM773a == null) {
            com.xiaomi.channel.commonutils.logger.b.d("no account for registration.");
            y.a(this.f108047a, ErrorCode.ERROR_AUTHERICATION_ERROR, "no account.");
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("do registration now.");
        Collection<bf.b> collectionM726a = bf.a().m726a("5");
        if (collectionM726a.isEmpty()) {
            next = uVarM773a.a(this.f108047a);
            ai.a(this.f108047a, next);
            bf.a().a(next);
        } else {
            next = collectionM726a.iterator().next();
        }
        if (!this.f108047a.m687c()) {
            y.a(this.f1118a, this.f1119a);
            this.f108047a.a(true);
            return;
        }
        try {
            bf.c cVar = next.f1041a;
            if (cVar == bf.c.binded) {
                ai.a(this.f108047a, this.f1118a, this.f1119a);
            } else if (cVar == bf.c.unbind) {
                y.a(this.f1118a, this.f1119a);
                XMPushService xMPushService = this.f108047a;
                Objects.requireNonNull(xMPushService);
                xMPushService.a(xMPushService.new b(next));
            }
        } catch (hm e11) {
            com.xiaomi.channel.commonutils.logger.b.d("meet error, disconnect connection. " + e11);
            this.f108047a.a(10, e11);
        }
    }
}
