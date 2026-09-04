package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class cg extends ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ cf f106911a;

    cg(cf cfVar) {
        this.f106911a = cfVar;
    }

    @Override // com.xiaomi.push.ah.a
    /* JADX INFO: renamed from: a */
    public String mo195a() {
        return "10052";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.xiaomi.channel.commonutils.logger.b.c("exec== mUploadJob");
        if (this.f106911a.f234a != null) {
            this.f106911a.f234a.a(this.f106911a.f231a);
            this.f106911a.b("upload_time");
        }
    }
}
