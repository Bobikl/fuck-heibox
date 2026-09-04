package com.xiaomi.mipush.sdk;

/* JADX INFO: loaded from: classes4.dex */
public class ab implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MiTinyDataClient.a.C1063a f106743a;

    ab(MiTinyDataClient.a.C1063a c1063a) {
        this.f106743a = c1063a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f106743a.f111a.size() != 0) {
            this.f106743a.b();
        } else if (this.f106743a.f112a != null) {
            this.f106743a.f112a.cancel(false);
            this.f106743a.f112a = null;
        }
    }
}
