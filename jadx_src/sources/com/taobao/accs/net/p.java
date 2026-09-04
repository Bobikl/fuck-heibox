package com.taobao.accs.net;

import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f98354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f98355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f98356c;

    p(k kVar, String str, boolean z10) {
        this.f98356c = kVar;
        this.f98354a = str;
        this.f98355b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        Message messageA = this.f98356c.f98301e.a(this.f98354a);
        if (messageA != null) {
            this.f98356c.f98301e.a(messageA, -9);
            this.f98356c.a(this.f98354a, this.f98355b, "receive data time out");
            ALog.e(this.f98356c.d(), this.f98354a + "-> receive data time out!", new Object[0]);
        }
    }
}
