package com.xiaomi.push;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.service.XMPushService;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hi extends hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Exception f107259a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected Socket f539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected XMPushService f107260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107261c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    String f540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f107262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected volatile long f107263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected volatile long f107264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected volatile long f107265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f107266h;

    public hi(XMPushService xMPushService, hc hcVar) {
        super(xMPushService, hcVar);
        this.f107259a = null;
        this.f540c = null;
        this.f107263e = 0L;
        this.f107264f = 0L;
        this.f107265g = 0L;
        this.f107266h = 0L;
        this.f107260b = xMPushService;
    }

    private void a(hc hcVar) throws Throwable {
        a(hcVar.c(), hcVar.m445a());
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:62:0x0238  */
    /* JADX WARN: Code duplicated, block: B:63:0x023a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0253  */
    /* JADX WARN: Code duplicated, block: B:67:0x026b  */
    /* JADX WARN: Code duplicated, block: B:75:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:79:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:84:0x0302  */
    /* JADX WARN: Code duplicated, block: B:89:0x031b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0321  */
    /* JADX WARN: Code duplicated, block: B:93:0x032f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0353  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x01ab, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x023a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x02c4, please report this as an issue */
    private void a(String str, int i10) throws Throwable {
        long j10;
        int i11;
        String str2;
        boolean z10;
        int iElapsedRealtime;
        int i12;
        String str3;
        String str4;
        String str5;
        boolean z11;
        this.f107259a = null;
        ArrayList<String> arrayList = new ArrayList<>();
        int iIntValue = com.xiaomi.channel.commonutils.logger.b.a("get bucket for host : " + str).intValue();
        cz czVarA = a(str);
        com.xiaomi.channel.commonutils.logger.b.a(Integer.valueOf(iIntValue));
        if (czVarA != null) {
            arrayList = czVarA.a(true);
        }
        cz czVarD = dd.a().d(str);
        if (czVarD != null) {
            for (String str6 : czVarD.a(true)) {
                if (arrayList.indexOf(str6) == -1) {
                    arrayList.add(str6);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(str);
        }
        long j11 = 0;
        this.f107265g = 0L;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strM175a = bg.m175a((Context) this.f107260b);
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = arrayList.iterator();
        String str7 = "";
        int i13 = 0;
        while (true) {
            if (it.hasNext()) {
                String next = it.next();
                long jCurrentTimeMillis = System.currentTimeMillis();
                ((hb) this).f520a++;
                i12 = i13 + 1;
                try {
                    com.xiaomi.channel.commonutils.logger.b.m62a("begin to connect to " + next);
                    this.f539a = m450a();
                    this.f539a.connect(db.m237a(next, i10), 8000);
                    com.xiaomi.channel.commonutils.logger.b.m62a("tcp connected");
                    try {
                        this.f539a.setTcpNoDelay(true);
                        this.f107262d = next;
                        mo451a();
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        ((hb) this).f521a = jCurrentTimeMillis2;
                        ((hb) this).f530b = strM175a;
                        if (czVarA != null) {
                            it = it;
                            sb2 = sb2;
                            strM175a = strM175a;
                            z11 = true;
                            j10 = 0;
                            czVarA = czVarA;
                            try {
                                czVarA.b(next, jCurrentTimeMillis2, 0L);
                            } catch (Exception e10) {
                                e = e10;
                                str3 = strM175a;
                                try {
                                    this.f107259a = e;
                                    com.xiaomi.channel.commonutils.logger.b.d("SMACK: Could not connect to:" + next);
                                    sb2.append("SMACK: Could not connect to ");
                                    sb2.append(next);
                                    sb2.append(" port:");
                                    sb2.append(i10);
                                    sb2.append(" err:");
                                    sb2.append(this.f107259a.getClass().getSimpleName());
                                    sb2.append("\n");
                                    if (TextUtils.isEmpty(str7)) {
                                        str2 = next;
                                    } else {
                                        str2 = str7 + "|" + next;
                                    }
                                    go.a(next, this.f107259a);
                                    if (czVarA != null) {
                                        czVarA.b(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f107259a);
                                    }
                                    if (TextUtils.equals(str3, bg.m175a((Context) this.f107260b))) {
                                        str7 = str2;
                                        sb2 = sb2;
                                        strM175a = str3;
                                        i13 = i12;
                                        it = it;
                                        j11 = j10;
                                        czVarA = czVarA;
                                    } else {
                                        i11 = i12;
                                        z10 = false;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    com.xiaomi.channel.commonutils.logger.b.d("SMACK: Could not connect to:" + next);
                                    sb2.append("SMACK: Could not connect to ");
                                    sb2.append(next);
                                    sb2.append(" port:");
                                    sb2.append(i10);
                                    sb2.append(" err:");
                                    sb2.append(this.f107259a.getClass().getSimpleName());
                                    sb2.append("\n");
                                    if (TextUtils.isEmpty(str7)) {
                                        str5 = next;
                                    } else {
                                        str5 = str7 + "|" + next;
                                    }
                                    go.a(next, this.f107259a);
                                    if (czVarA != null) {
                                        czVarA.b(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f107259a);
                                    }
                                    if (!TextUtils.equals(str3, bg.m175a((Context) this.f107260b))) {
                                        throw th;
                                    }
                                    str2 = str5;
                                    i11 = i12;
                                    z10 = false;
                                    dd.a().m248c();
                                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                                    if (!z10) {
                                        go.a(0, ge.BATCH_TCP_CONN_SUCCESS.a(), iElapsedRealtime, str2, i11);
                                        return;
                                    }
                                    if (this.f107266h != j10) {
                                        this.f107266h = SystemClock.elapsedRealtime();
                                        go.a(0, ge.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, bg.c(this.f107260b.getApplicationContext()) ? 1 : 0);
                                    } else {
                                        this.f107266h = SystemClock.elapsedRealtime();
                                        go.a(0, ge.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, bg.c(this.f107260b.getApplicationContext()) ? 1 : 0);
                                    }
                                    throw new hm(sb2.toString());
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    this.f107259a = new Exception("abnormal exception", th);
                                    com.xiaomi.channel.commonutils.logger.b.a(th);
                                    com.xiaomi.channel.commonutils.logger.b.d("SMACK: Could not connect to:" + next);
                                    sb2.append("SMACK: Could not connect to ");
                                    sb2.append(next);
                                    sb2.append(" port:");
                                    sb2.append(i10);
                                    sb2.append(" err:");
                                    sb2.append(this.f107259a.getClass().getSimpleName());
                                    sb2.append("\n");
                                    if (TextUtils.isEmpty(str7)) {
                                        str2 = next;
                                    } else {
                                        str2 = str7 + "|" + next;
                                    }
                                    go.a(next, this.f107259a);
                                    if (czVarA != null) {
                                        czVarA.b(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f107259a);
                                    }
                                    str4 = strM175a;
                                    if (TextUtils.equals(str4, bg.m175a((Context) this.f107260b))) {
                                        str3 = str4;
                                        str7 = str2;
                                        sb2 = sb2;
                                        strM175a = str3;
                                        i13 = i12;
                                        it = it;
                                        j11 = j10;
                                        czVarA = czVarA;
                                    } else {
                                        i11 = i12;
                                        z10 = false;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    str7 = str7;
                                    str3 = strM175a;
                                    com.xiaomi.channel.commonutils.logger.b.d("SMACK: Could not connect to:" + next);
                                    sb2.append("SMACK: Could not connect to ");
                                    sb2.append(next);
                                    sb2.append(" port:");
                                    sb2.append(i10);
                                    sb2.append(" err:");
                                    sb2.append(this.f107259a.getClass().getSimpleName());
                                    sb2.append("\n");
                                    if (TextUtils.isEmpty(str7)) {
                                        str5 = next;
                                    } else {
                                        str5 = str7 + "|" + next;
                                    }
                                    go.a(next, this.f107259a);
                                    if (czVarA != null) {
                                        czVarA.b(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f107259a);
                                    }
                                    if (!TextUtils.equals(str3, bg.m175a((Context) this.f107260b))) {
                                        throw th;
                                    }
                                    str2 = str5;
                                    i11 = i12;
                                    z10 = false;
                                    dd.a().m248c();
                                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                                    if (!z10) {
                                        go.a(0, ge.BATCH_TCP_CONN_SUCCESS.a(), iElapsedRealtime, str2, i11);
                                        return;
                                    }
                                    if (this.f107266h != j10) {
                                        this.f107266h = SystemClock.elapsedRealtime();
                                        go.a(0, ge.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, bg.c(this.f107260b.getApplicationContext()) ? 1 : 0);
                                    } else {
                                        this.f107266h = SystemClock.elapsedRealtime();
                                        go.a(0, ge.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, bg.c(this.f107260b.getApplicationContext()) ? 1 : 0);
                                    }
                                    throw new hm(sb2.toString());
                                }
                            }
                        } else {
                            it = it;
                            sb2 = sb2;
                            strM175a = strM175a;
                            czVarA = czVarA;
                            z11 = true;
                            j10 = 0;
                        }
                        this.f107265g = SystemClock.elapsedRealtime();
                        com.xiaomi.channel.commonutils.logger.b.m62a("connected to " + next + " in " + ((hb) this).f521a);
                        str2 = str7;
                        z10 = z11;
                        i11 = i12;
                    } catch (Exception e11) {
                        e = e11;
                        j10 = 0;
                        str3 = strM175a;
                        this.f107259a = e;
                        com.xiaomi.channel.commonutils.logger.b.d("SMACK: Could not connect to:" + next);
                        sb2.append("SMACK: Could not connect to ");
                        sb2.append(next);
                        sb2.append(" port:");
                        sb2.append(i10);
                        sb2.append(" err:");
                        sb2.append(this.f107259a.getClass().getSimpleName());
                        sb2.append("\n");
                        if (TextUtils.isEmpty(str7)) {
                            str2 = next;
                        } else {
                            str2 = str7 + "|" + next;
                        }
                        go.a(next, this.f107259a);
                        if (czVarA != null) {
                            czVarA.b(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f107259a);
                        }
                        if (TextUtils.equals(str3, bg.m175a((Context) this.f107260b))) {
                            i11 = i12;
                            z10 = false;
                            dd.a().m248c();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                            if (!z10) {
                                go.a(0, ge.BATCH_TCP_CONN_SUCCESS.a(), iElapsedRealtime, str2, i11);
                                return;
                            }
                            if (this.f107266h != j10) {
                                this.f107266h = SystemClock.elapsedRealtime();
                                go.a(0, ge.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, bg.c(this.f107260b.getApplicationContext()) ? 1 : 0);
                            } else {
                                this.f107266h = SystemClock.elapsedRealtime();
                                go.a(0, ge.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, bg.c(this.f107260b.getApplicationContext()) ? 1 : 0);
                            }
                            throw new hm(sb2.toString());
                        }
                        str7 = str2;
                        sb2 = sb2;
                        strM175a = str3;
                        i13 = i12;
                        it = it;
                        j11 = j10;
                        czVarA = czVarA;
                    } catch (Throwable th5) {
                        th = th5;
                        j10 = 0;
                        this.f107259a = new Exception("abnormal exception", th);
                        com.xiaomi.channel.commonutils.logger.b.a(th);
                        com.xiaomi.channel.commonutils.logger.b.d("SMACK: Could not connect to:" + next);
                        sb2.append("SMACK: Could not connect to ");
                        sb2.append(next);
                        sb2.append(" port:");
                        sb2.append(i10);
                        sb2.append(" err:");
                        sb2.append(this.f107259a.getClass().getSimpleName());
                        sb2.append("\n");
                        if (TextUtils.isEmpty(str7)) {
                            str2 = next;
                        } else {
                            str2 = str7 + "|" + next;
                        }
                        go.a(next, this.f107259a);
                        if (czVarA != null) {
                            czVarA.b(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f107259a);
                        }
                        str4 = strM175a;
                        if (TextUtils.equals(str4, bg.m175a((Context) this.f107260b))) {
                            i11 = i12;
                            z10 = false;
                            dd.a().m248c();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                            if (!z10) {
                                go.a(0, ge.BATCH_TCP_CONN_SUCCESS.a(), iElapsedRealtime, str2, i11);
                                return;
                            }
                            if (this.f107266h != j10) {
                                this.f107266h = SystemClock.elapsedRealtime();
                                go.a(0, ge.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, bg.c(this.f107260b.getApplicationContext()) ? 1 : 0);
                            } else {
                                this.f107266h = SystemClock.elapsedRealtime();
                                go.a(0, ge.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, bg.c(this.f107260b.getApplicationContext()) ? 1 : 0);
                            }
                            throw new hm(sb2.toString());
                        }
                        str3 = str4;
                        str7 = str2;
                        sb2 = sb2;
                        strM175a = str3;
                        i13 = i12;
                        it = it;
                        j11 = j10;
                        czVarA = czVarA;
                    }
                } catch (Exception e12) {
                    e = e12;
                } catch (Throwable th6) {
                    th = th6;
                }
                dd.a().m248c();
                iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                if (!z10) {
                    go.a(0, ge.BATCH_TCP_CONN_SUCCESS.a(), iElapsedRealtime, str2, i11);
                    return;
                }
                if (this.f107266h != j10 || SystemClock.elapsedRealtime() - this.f107266h > 480000) {
                    this.f107266h = SystemClock.elapsedRealtime();
                    go.a(0, ge.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, bg.c(this.f107260b.getApplicationContext()) ? 1 : 0);
                }
                throw new hm(sb2.toString());
            }
            sb2 = sb2;
            j10 = j11;
            i11 = i13;
            str2 = str7;
            z10 = false;
            dd.a().m248c();
            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
            if (!z10) {
                go.a(0, ge.BATCH_TCP_CONN_SUCCESS.a(), iElapsedRealtime, str2, i11);
                return;
            }
            if (this.f107266h != j10) {
                this.f107266h = SystemClock.elapsedRealtime();
                go.a(0, ge.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, bg.c(this.f107260b.getApplicationContext()) ? 1 : 0);
            } else {
                this.f107266h = SystemClock.elapsedRealtime();
                go.a(0, ge.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, bg.c(this.f107260b.getApplicationContext()) ? 1 : 0);
            }
            throw new hm(sb2.toString());
            str7 = str2;
            sb2 = sb2;
            strM175a = str3;
            i13 = i12;
            it = it;
            j11 = j10;
            czVarA = czVarA;
        }
    }

    public Context a() {
        return this.f107260b;
    }

    cz a(String str) {
        cz czVarA = dd.a().a(str, false);
        if (!czVarA.b()) {
            ie.a(new hl(this, str));
        }
        return czVarA;
    }

    @Override // com.xiaomi.push.hb
    /* JADX INFO: renamed from: a */
    public String mo439a() {
        return this.f107262d;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Socket m450a() {
        return new Socket();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    protected synchronized void mo451a() {
    }

    protected synchronized void a(int i10, Exception exc) {
        if (b() == 2) {
            return;
        }
        a(2, i10, exc);
        ((hb) this).f525a = "";
        try {
            this.f539a.close();
        } catch (Throwable unused) {
        }
        this.f107263e = 0L;
        this.f107264f = 0L;
    }

    protected void a(Exception exc) {
        if (SystemClock.elapsedRealtime() - this.f107265g >= 300000) {
            this.f107261c = 0;
            return;
        }
        if (bg.b(this.f107260b)) {
            int i10 = this.f107261c + 1;
            this.f107261c = i10;
            if (i10 >= 2) {
                String strMo439a = mo439a();
                com.xiaomi.channel.commonutils.logger.b.m62a("max short conn time reached, sink down current host:" + strMo439a);
                a(strMo439a, 0L, exc);
                this.f107261c = 0;
            }
        }
    }

    protected void a(String str, long j10, Exception exc) {
        cz czVarA = dd.a().a(hc.a(), false);
        if (czVarA != null) {
            czVarA.b(str, j10, 0L, exc);
            dd.a().m248c();
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo431a(boolean z10);

    @Override // com.xiaomi.push.hb
    public void a(gq[] gqVarArr) throws hm {
        throw new hm("Don't support send Blob");
    }

    @Override // com.xiaomi.push.hb
    public void b(int i10, Exception exc) {
        a(i10, exc);
        if ((exc != null || i10 == 18) && this.f107265g != 0) {
            a(exc);
        }
    }

    @Override // com.xiaomi.push.hb
    public void b(boolean z10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        mo431a(z10);
        com.xiaomi.push.service.p.a(this.f107260b).m760c();
        if (z10) {
            return;
        }
        this.f107260b.a(new hj(this, 13, jElapsedRealtime, jCurrentTimeMillis), 10000L);
    }

    public String c() {
        return ((hb) this).f525a;
    }

    public void c(int i10, Exception exc) {
        bg.b();
        this.f107260b.a(new hk(this, 2, i10, exc));
    }

    public synchronized void e() {
        try {
            if (!m444c() && !m443b()) {
                a(0, 0, (Exception) null);
                a(((hb) this).f522a);
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m62a("WARNING: current xmpp has connected");
        } catch (IOException e10) {
            throw new hm(e10);
        }
    }

    public void f() {
        this.f107263e = SystemClock.elapsedRealtime();
    }

    public void g() {
        this.f107264f = SystemClock.elapsedRealtime();
    }
}
