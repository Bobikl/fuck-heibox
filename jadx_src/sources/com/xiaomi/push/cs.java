package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class cs extends ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ cr f106930a;

    cs(cr crVar) {
        this.f106930a = crVar;
    }

    @Override // com.xiaomi.push.ah.a
    /* JADX INFO: renamed from: a */
    public String mo195a() {
        return "100957";
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f106930a.f244a) {
            if (this.f106930a.f244a.size() > 0) {
                if (this.f106930a.f244a.size() > 1) {
                    cr crVar = this.f106930a;
                    crVar.a(crVar.f244a);
                } else {
                    cr crVar2 = this.f106930a;
                    crVar2.b((cr.a) crVar2.f244a.get(0));
                }
                this.f106930a.f244a.clear();
                System.gc();
            }
        }
    }
}
