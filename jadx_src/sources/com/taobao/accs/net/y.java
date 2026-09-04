package com.taobao.accs.net;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f98389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f98390b;

    y(v vVar, String str) {
        this.f98390b = vVar;
        this.f98389a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str = this.f98389a;
        if (str != null && str.equals(this.f98390b.O) && this.f98390b.f98374t == 2) {
            this.f98390b.K = false;
            this.f98390b.M = true;
            this.f98390b.o();
            this.f98390b.I.setCloseReason("conn timeout");
        }
    }
}
