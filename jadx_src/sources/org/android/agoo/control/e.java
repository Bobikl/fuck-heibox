package org.android.agoo.control;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f132832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f132833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AgooFactory f132834c;

    e(AgooFactory agooFactory, String str, String str2) {
        this.f132834c = agooFactory;
        this.f132832a = str;
        this.f132833b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f132834c.updateMsgStatus(this.f132832a, this.f132833b);
    }
}
