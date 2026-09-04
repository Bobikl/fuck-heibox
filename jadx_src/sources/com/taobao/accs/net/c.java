package com.taobao.accs.net;

import com.taobao.accs.utl.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f98318a;

    c(a aVar) {
        this.f98318a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f98318a.f98301e.c()) {
            ALog.e(this.f98318a.d(), "receive ping time out! ", new Object[0]);
            g.a(this.f98318a.f98300d).c();
            this.f98318a.a("", false, "receive ping timeout");
            this.f98318a.f98301e.a(-12);
        }
    }
}
