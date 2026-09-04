package com.xiaomi.push;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes4.dex */
public class gl implements he {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107215a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    hb f476a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    XMPushService f477a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Exception f478a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f107219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f107220f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private long f475a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f107216b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f107217c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f107218d = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f479a = "";

    gl(XMPushService xMPushService) {
        this.f107219e = 0L;
        this.f107220f = 0L;
        this.f477a = xMPushService;
        b();
        int iMyUid = Process.myUid();
        try {
            this.f107220f = TrafficStats.getUidRxBytes(iMyUid);
            this.f107219e = TrafficStats.getUidTxBytes(iMyUid);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("Failed to obtain traffic data during initialization: " + e10);
            this.f107220f = -1L;
            this.f107219e = -1L;
        }
    }

    private void b() {
        this.f107216b = 0L;
        this.f107218d = 0L;
        this.f475a = 0L;
        this.f107217c = 0L;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (bg.b(this.f477a)) {
            this.f475a = jElapsedRealtime;
        }
        if (this.f477a.m687c()) {
            this.f107217c = jElapsedRealtime;
        }
    }

    private synchronized void c() {
        com.xiaomi.channel.commonutils.logger.b.c("stat connpt = " + this.f479a + " netDuration = " + this.f107216b + " ChannelDuration = " + this.f107218d + " channelConnectedTime = " + this.f107217c);
        gf gfVar = new gf();
        gfVar.f454a = (byte) 0;
        gfVar.a(ge.CHANNEL_ONLINE_RATE.a());
        gfVar.a(this.f479a);
        gfVar.d((int) (System.currentTimeMillis() / 1000));
        gfVar.b((int) (this.f107216b / 1000));
        gfVar.c((int) (this.f107218d / 1000));
        gm.m407a().a(gfVar);
        b();
    }

    Exception a() {
        return this.f478a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized void m406a() {
        XMPushService xMPushService = this.f477a;
        if (xMPushService == null) {
            return;
        }
        String strM175a = bg.m175a((Context) xMPushService);
        boolean zC = bg.c(this.f477a);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f475a;
        if (j10 > 0) {
            this.f107216b += jElapsedRealtime - j10;
            this.f475a = 0L;
        }
        long j11 = this.f107217c;
        if (j11 != 0) {
            this.f107218d += jElapsedRealtime - j11;
            this.f107217c = 0L;
        }
        if (zC) {
            if ((!TextUtils.equals(this.f479a, strM175a) && this.f107216b > 30000) || this.f107216b > 5400000) {
                c();
            }
            this.f479a = strM175a;
            if (this.f475a == 0) {
                this.f475a = jElapsedRealtime;
            }
            if (this.f477a.m687c()) {
                this.f107217c = jElapsedRealtime;
            }
        }
    }

    @Override // com.xiaomi.push.he
    public void a(hb hbVar) {
        this.f107215a = 0;
        this.f478a = null;
        this.f476a = hbVar;
        this.f479a = bg.m175a((Context) this.f477a);
        go.a(0, ge.CONN_SUCCESS.a());
    }

    @Override // com.xiaomi.push.he
    public void a(hb hbVar, int i10, Exception exc) {
        long uidTxBytes;
        if (this.f107215a == 0 && this.f478a == null) {
            this.f107215a = i10;
            this.f478a = exc;
            go.b(hbVar.mo439a(), exc);
        }
        if (i10 == 22 && this.f107217c != 0) {
            long jM437a = hbVar.m437a() - this.f107217c;
            if (jM437a < 0) {
                jM437a = 0;
            }
            this.f107218d += jM437a + ((long) (hh.b() / 2));
            this.f107217c = 0L;
        }
        m406a();
        int iMyUid = Process.myUid();
        long uidRxBytes = -1;
        try {
            uidRxBytes = TrafficStats.getUidRxBytes(iMyUid);
            uidTxBytes = TrafficStats.getUidTxBytes(iMyUid);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("Failed to obtain traffic data: " + e10);
            uidTxBytes = -1L;
        }
        com.xiaomi.channel.commonutils.logger.b.c("Stats rx=" + (uidRxBytes - this.f107220f) + ", tx=" + (uidTxBytes - this.f107219e));
        this.f107220f = uidRxBytes;
        this.f107219e = uidTxBytes;
    }

    @Override // com.xiaomi.push.he
    public void a(hb hbVar, Exception exc) {
        go.a(0, ge.CHANNEL_CON_FAIL.a(), 1, hbVar.mo439a(), bg.c(this.f477a) ? 1 : 0);
        m406a();
    }

    @Override // com.xiaomi.push.he
    public void b(hb hbVar) {
        m406a();
        this.f107217c = SystemClock.elapsedRealtime();
        go.a(0, ge.CONN_SUCCESS.a(), hbVar.mo439a(), hbVar.a());
    }
}
