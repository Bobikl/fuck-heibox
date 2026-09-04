package anetwork.channel.unified;

import anetwork.channel.unified.m.a;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f30351b;

    o(m mVar) {
        this.f30351b = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        m mVar = this.f30351b;
        mVar.new a(0, mVar.f30345a.f30339a.a(), this.f30351b.f30345a.f30340b).a(this.f30351b.f30345a.f30339a.a(), this.f30351b.f30345a.f30340b);
    }
}
