package com.alibaba.sdk.android.httpdns;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile t f38019a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f38020h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f38021k = true;
    private String hostName = null;

    private t() {
    }

    public static t a() {
        if (f38019a == null) {
            synchronized (t.class) {
                if (f38019a == null) {
                    f38019a = new t();
                }
            }
        }
        return f38019a;
    }

    private void a(String str, String str2) {
        try {
            com.alibaba.sdk.android.httpdns.d.b bVarA = com.alibaba.sdk.android.httpdns.d.b.a();
            if (bVarA != null) {
                bVarA.a(str, u.a(s.SNIFF_HOST), str2);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private boolean d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f38020h;
        if (j10 != 0 && jCurrentTimeMillis - j10 < 30000) {
            return false;
        }
        this.f38020h = jCurrentTimeMillis;
        return true;
    }

    public synchronized void c(boolean z10) {
        this.f38021k = z10;
    }

    public synchronized void g() {
        this.f38020h = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017  */
    /* JADX WARN: Code duplicated, block: B:12:0x001a A[Catch: all -> 0x005f, Exception -> 0x0061, TryCatch #0 {Exception -> 0x0061, blocks: (B:4:0x0003, B:5:0x0005, B:17:0x0028, B:18:0x004a, B:9:0x0011, B:12:0x001a), top: B:28:0x0003, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x0028 A[Catch: all -> 0x005f, Exception -> 0x0061, TryCatch #0 {Exception -> 0x0061, blocks: (B:4:0x0003, B:5:0x0005, B:17:0x0028, B:18:0x004a, B:9:0x0011, B:12:0x001a), top: B:28:0x0003, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x004a A[Catch: all -> 0x005f, Exception -> 0x0061, TRY_LEAVE, TryCatch #0 {Exception -> 0x0061, blocks: (B:4:0x0003, B:5:0x0005, B:17:0x0028, B:18:0x004a, B:9:0x0011, B:12:0x001a), top: B:28:0x0003, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011 A[Catch: all -> 0x005f, Exception -> 0x0061, TryCatch #0 {Exception -> 0x0061, blocks: (B:4:0x0003, B:5:0x0005, B:17:0x0028, B:18:0x004a, B:9:0x0011, B:12:0x001a), top: B:28:0x0003, outer: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x004a, please report this as an issue */
    public synchronized void g(String str) {
        boolean z10;
        String str2;
        String str3;
        if (str != null) {
            try {
                this.hostName = str;
                z10 = true;
                if (!this.f38021k) {
                    str3 = "sniffer is turned off";
                } else if (d()) {
                    if (TextUtils.isEmpty(this.hostName)) {
                        str3 = "hostname is null";
                    } else {
                        str2 = null;
                    }
                    if (z10) {
                        i.d("launch a sniff task");
                        String str4 = this.hostName;
                        s sVar = s.SNIFF_HOST;
                        q qVar = new q(str4, sVar);
                        qVar.a(0);
                        c.a().submit(qVar);
                        a(str, u.a(sVar));
                        this.hostName = null;
                    } else {
                        i.d("launch sniffer failed due to " + str2);
                    }
                } else {
                    str3 = "sniff too often";
                }
                str2 = str3;
                z10 = false;
                if (z10) {
                    i.d("launch a sniff task");
                    String str5 = this.hostName;
                    s sVar2 = s.SNIFF_HOST;
                    q qVar2 = new q(str5, sVar2);
                    qVar2.a(0);
                    c.a().submit(qVar2);
                    a(str, u.a(sVar2));
                    this.hostName = null;
                } else {
                    i.d("launch sniffer failed due to " + str2);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            z10 = true;
            if (!this.f38021k) {
                str3 = "sniffer is turned off";
            } else if (d()) {
                str3 = "sniff too often";
            } else {
                if (TextUtils.isEmpty(this.hostName)) {
                    str3 = "hostname is null";
                } else {
                    str2 = null;
                }
                if (z10) {
                    i.d("launch a sniff task");
                    String str6 = this.hostName;
                    s sVar3 = s.SNIFF_HOST;
                    q qVar3 = new q(str6, sVar3);
                    qVar3.a(0);
                    c.a().submit(qVar3);
                    a(str, u.a(sVar3));
                    this.hostName = null;
                } else {
                    i.d("launch sniffer failed due to " + str2);
                }
            }
            str2 = str3;
            z10 = false;
            if (z10) {
                i.d("launch a sniff task");
                String str7 = this.hostName;
                s sVar4 = s.SNIFF_HOST;
                q qVar4 = new q(str7, sVar4);
                qVar4.a(0);
                c.a().submit(qVar4);
                a(str, u.a(sVar4));
                this.hostName = null;
            } else {
                i.d("launch sniffer failed due to " + str2);
            }
        }
    }
}
