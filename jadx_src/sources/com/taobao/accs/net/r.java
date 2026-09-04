package com.taobao.accs.net;

import anet.channel.session.TnetSpdySession;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f98358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ byte[] f98359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TnetSpdySession f98360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ k f98361d;

    r(k kVar, int i10, byte[] bArr, TnetSpdySession tnetSpdySession) {
        this.f98361d = kVar;
        this.f98358a = i10;
        this.f98359b = bArr;
        this.f98360c = tnetSpdySession;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f98358a != 200) {
            ALog.e(this.f98361d.d(), "drop frame len:" + this.f98359b.length + " frameType" + this.f98358a, new Object[0]);
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f98361d.f98301e.a(this.f98359b, this.f98360c.getHost());
            com.taobao.accs.ut.a.d dVarG = this.f98361d.f98301e.g();
            if (dVarG != null) {
                dVarG.f98417c = String.valueOf(jCurrentTimeMillis);
                dVarG.f98421g = this.f98361d.f98299c == 0 ? "service" : "inapp";
                dVarG.a();
            }
        } catch (Throwable th2) {
            ALog.e(this.f98361d.d(), "onDataReceive ", th2, new Object[0]);
            UTMini.getInstance().commitEvent(66001, "DATA_RECEIVE", UtilityImpl.a(th2));
        }
    }
}
