package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class ci extends ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ cf f106913a;

    ci(cf cfVar) {
        this.f106913a = cfVar;
    }

    @Override // com.xiaomi.push.ah.a
    /* JADX INFO: renamed from: a */
    public String mo195a() {
        return "10053";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f106913a.f234a != null) {
            this.f106913a.f234a.b(this.f106913a.f231a);
            this.f106913a.b("delete_time");
        }
    }
}
