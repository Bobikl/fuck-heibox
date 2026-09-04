package com.taobao.accs.net;

import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f98315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f98316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ a f98317c;

    b(a aVar, String str, boolean z10) {
        this.f98317c = aVar;
        this.f98315a = str;
        this.f98316b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        Message messageA = this.f98317c.f98301e.a(this.f98315a);
        if (messageA != null) {
            this.f98317c.f98301e.a(messageA, -9);
            this.f98317c.a(this.f98315a, this.f98316b, "receive data time out");
            ALog.e(this.f98317c.d(), this.f98315a + "-> receive data time out!", new Object[0]);
        }
    }
}
