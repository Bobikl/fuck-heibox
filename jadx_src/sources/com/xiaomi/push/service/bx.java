package com.xiaomi.push.service;

import android.util.Base64;
import com.xiaomi.push.C1339r;
import com.xiaomi.push.dh;
import com.xiaomi.push.ew;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class bx extends com.xiaomi.push.ak.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bw f107979a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    boolean f1064a = false;

    bx(bw bwVar) {
        this.f107979a = bwVar;
    }

    @Override // com.xiaomi.push.ak.b
    public void b() {
        try {
            ew.a aVarA = ew.a.a(Base64.decode(dh.a(C1339r.m655a(), "https://resolver.msg.xiaomi.net/psc/?t=a", (List<com.xiaomi.push.bf>) null), 10));
            if (aVarA != null) {
                this.f107979a.f1062a = aVarA;
                this.f1064a = true;
                this.f107979a.e();
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("fetch config failure: " + e10.getMessage());
        }
    }

    @Override // com.xiaomi.push.ak.b
    /* JADX INFO: renamed from: c */
    public void mo279c() {
        bw.a[] aVarArr;
        this.f107979a.f1061a = null;
        if (this.f1064a) {
            synchronized (this.f107979a) {
                aVarArr = (bw.a[]) this.f107979a.f1063a.toArray(new bw.a[this.f107979a.f1063a.size()]);
            }
            for (bw.a aVar : aVarArr) {
                aVar.a(this.f107979a.f1062a);
            }
        }
    }
}
