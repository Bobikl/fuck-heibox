package com.taobao.accs.net;

import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.entity.ConnType;
import com.taobao.accs.utl.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f98357a;

    q(k kVar) {
        this.f98357a = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f98357a.f98303g) {
            try {
                Session session = SessionCenter.getInstance(this.f98357a.f98305i.getAppKey()).get(this.f98357a.b((String) null), ConnType.TypeLevel.SPDY, 0L);
                if (session != null) {
                    ALog.e(this.f98357a.d(), "try session ping", new Object[0]);
                    int pingTimeout = this.f98357a.f98305i.getPingTimeout();
                    if (pingTimeout > 0) {
                        session.ping(true, pingTimeout);
                    } else {
                        session.ping(true);
                    }
                }
            } catch (Exception e10) {
                ALog.e(this.f98357a.d(), "ping error", e10, new Object[0]);
            }
        }
    }
}
