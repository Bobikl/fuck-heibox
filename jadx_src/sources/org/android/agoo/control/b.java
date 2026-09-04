package org.android.agoo.control;

import com.taobao.accs.base.TaoBaseService;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f132824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f132825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaoBaseService.ExtraInfo f132826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AgooFactory f132827d;

    b(AgooFactory agooFactory, byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo) {
        this.f132827d = agooFactory;
        this.f132824a = bArr;
        this.f132825b = str;
        this.f132826c = extraInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f132827d.msgReceiverPreHandler(this.f132824a, this.f132825b, this.f132826c, true);
    }
}
