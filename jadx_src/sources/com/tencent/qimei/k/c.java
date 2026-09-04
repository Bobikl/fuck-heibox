package com.tencent.qimei.k;

/* JADX INFO: compiled from: PropertiesFile.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f101265a;

    public c(e eVar) {
        this.f101265a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            synchronized (this.f101265a.f101273f) {
                byte[] bArrA = this.f101265a.a(this.f101265a.f101269b.toString().getBytes("ISO8859-1"));
                if (bArrA == null) {
                    return;
                }
                if (bArrA.length + 10 > this.f101265a.f101271d) {
                    this.f101265a.f101271d = bArrA.length + 10;
                    e eVar = this.f101265a;
                    eVar.a(eVar.f101271d);
                }
                this.f101265a.f101270c.putInt(0, bArrA.length);
                this.f101265a.f101270c.position(10);
                this.f101265a.f101270c.put(bArrA);
                this.f101265a.f101270c.force();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
