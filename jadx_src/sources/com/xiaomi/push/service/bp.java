package com.xiaomi.push.service;

import com.xiaomi.push.gm;
import com.xiaomi.push.service.XMPushService.e;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class bp {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f107965d = 300000;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private XMPushService f1057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f107967b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107968c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107966a = 500;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private long f1056a = 0;

    public bp(XMPushService xMPushService) {
        this.f1057a = xMPushService;
    }

    private int a() {
        double d10;
        if (this.f107967b > 8) {
            return w4.a.f140984a;
        }
        double dRandom = (Math.random() * 2.0d) + 1.0d;
        int i10 = this.f107967b;
        if (i10 > 4) {
            d10 = 60000.0d;
        } else {
            if (i10 <= 1) {
                if (this.f1056a == 0) {
                    return 0;
                }
                if (System.currentTimeMillis() - this.f1056a >= 310000) {
                    this.f107966a = 1000;
                    this.f107968c = 0;
                    return 0;
                }
                int i11 = this.f107966a;
                int i12 = f107965d;
                if (i11 >= i12) {
                    return i11;
                }
                int i13 = this.f107968c + 1;
                this.f107968c = i13;
                if (i13 >= 4) {
                    return i12;
                }
                this.f107966a = (int) (((double) i11) * 1.5d);
                return i11;
            }
            d10 = 10000.0d;
        }
        return (int) (dRandom * d10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m736a() {
        this.f1056a = System.currentTimeMillis();
        this.f1057a.a(1);
        this.f107967b = 0;
    }

    public void a(boolean z10) {
        if (!this.f1057a.m682a()) {
            com.xiaomi.channel.commonutils.logger.b.c("should not reconnect as no client or network.");
            return;
        }
        if (z10) {
            if (!this.f1057a.m683a(1)) {
                this.f107967b++;
            }
            this.f1057a.a(1);
            com.xiaomi.channel.commonutils.logger.b.m63a("ReconnectionManager", "-->tryReconnect(): exec ConnectJob");
            XMPushService xMPushService = this.f1057a;
            Objects.requireNonNull(xMPushService);
            xMPushService.a(xMPushService.new e());
            return;
        }
        if (this.f1057a.m683a(1)) {
            return;
        }
        int iA = a();
        this.f107967b++;
        com.xiaomi.channel.commonutils.logger.b.m62a("schedule reconnect in " + iA + "ms");
        XMPushService xMPushService2 = this.f1057a;
        Objects.requireNonNull(xMPushService2);
        xMPushService2.a(xMPushService2.new e(), (long) iA);
        if (this.f107967b == 2 && gm.m407a().m412a()) {
            ao.b();
        }
        if (this.f107967b == 3) {
            ao.a();
        }
    }
}
