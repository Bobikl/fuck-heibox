package anetwork.channel.entity;

import android.os.RemoteException;
import anetwork.channel.aidl.ParcelableHeader;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ anetwork.channel.aidl.g f30227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f30228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Map f30229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ g f30230e;

    h(g gVar, anetwork.channel.aidl.g gVar2, int i10, Map map) {
        this.f30230e = gVar;
        this.f30227b = gVar2;
        this.f30228c = i10;
        this.f30229d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f30227b.s(this.f30228c, new ParcelableHeader(this.f30228c, this.f30229d));
        } catch (RemoteException unused) {
        }
    }
}
