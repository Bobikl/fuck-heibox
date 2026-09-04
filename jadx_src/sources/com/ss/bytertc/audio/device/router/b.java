package com.ss.bytertc.audio.device.router;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRouteDeviceManager f97847b;

    public /* synthetic */ b(AudioRouteDeviceManager audioRouteDeviceManager) {
        this.f97847b = audioRouteDeviceManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f97847b.bluetoothScoConnectionCheck();
    }
}
