package com.tencent.beacon.a.d;

/* JADX INFO: compiled from: PropertiesFile.java */
/* JADX INFO: loaded from: classes4.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f98835a;

    e(g gVar) {
        this.f98835a = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            synchronized (this.f98835a.f98838a) {
                byte[] bArrA = g.a(this.f98835a.f98840c.toString().getBytes("ISO8859-1"));
                if (bArrA == null) {
                    return;
                }
                if (bArrA.length + 10 > this.f98835a.f98842e) {
                    this.f98835a.f98842e = bArrA.length + 10;
                    g gVar = this.f98835a;
                    gVar.a(gVar.f98842e);
                }
                this.f98835a.f98841d.putInt(0, bArrA.length);
                this.f98835a.f98841d.position(10);
                this.f98835a.f98841d.put(bArrA);
                this.f98835a.f98841d.force();
            }
        } catch (Exception e10) {
            com.tencent.beacon.a.b.g.e().a("504", "[properties] write to file error!", e10);
        }
    }
}
