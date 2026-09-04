package com.xiaomi.push;

import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class ha implements he {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ gz f107243a;

    ha(gz gzVar) {
        this.f107243a = gzVar;
    }

    @Override // com.xiaomi.push.he
    public void a(hb hbVar) {
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + this.f107243a.f516a.format(new Date()) + " Connection started (" + this.f107243a.f513a.hashCode() + ")");
    }

    @Override // com.xiaomi.push.he
    public void a(hb hbVar, int i10, Exception exc) {
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + this.f107243a.f516a.format(new Date()) + " Connection closed (" + this.f107243a.f513a.hashCode() + ")");
    }

    @Override // com.xiaomi.push.he
    public void a(hb hbVar, Exception exc) {
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + this.f107243a.f516a.format(new Date()) + " Reconnection failed due to an exception (" + this.f107243a.f513a.hashCode() + ")");
        exc.printStackTrace();
    }

    @Override // com.xiaomi.push.he
    public void b(hb hbVar) {
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + this.f107243a.f516a.format(new Date()) + " Connection reconnected (" + this.f107243a.f513a.hashCode() + ")");
    }
}
