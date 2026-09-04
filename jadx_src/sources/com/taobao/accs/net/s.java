package com.taobao.accs.net;

import com.taobao.accs.data.Message;
import com.taobao.accs.utl.BaseMonitor;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f98362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f98363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f98364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ k f98365d;

    s(k kVar, int i10, boolean z10, int i11) {
        this.f98365d = kVar;
        this.f98362a = i10;
        this.f98363b = z10;
        this.f98364c = i11;
    }

    @Override // java.lang.Runnable
    public void run() {
        Message messageB;
        int i10 = this.f98362a;
        if (i10 > 0) {
            Message.Id id2 = new Message.Id(i10, "");
            Message.Id id3 = null;
            for (Message.Id id4 : this.f98365d.f98301e.f()) {
                if (id4.equals(id2)) {
                    id3 = id4;
                    break;
                }
            }
            if (id3 != null && (messageB = this.f98365d.f98301e.b(id3.getDataId())) != null) {
                if (this.f98363b) {
                    if (!this.f98365d.a(messageB, 2000)) {
                        this.f98365d.f98301e.a(messageB, this.f98364c);
                    }
                    if (messageB.getNetPermanceMonitor() != null) {
                        com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_POINT_RESEND, "total_tnet", 0.0d);
                    }
                } else {
                    this.f98365d.f98301e.a(messageB, this.f98364c);
                }
            }
        }
        int i11 = this.f98362a;
        if (i11 >= 0 || !this.f98363b) {
            return;
        }
        this.f98365d.b(i11);
    }
}
