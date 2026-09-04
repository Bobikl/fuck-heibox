package com.ss.bytertc.audio.device.router;

/* JADX INFO: loaded from: classes10.dex */
public interface IAudioRouteCallback {
    void onDeviceEvent(@AudioRouteDeviceManager.RoutingDeviceType int i10, boolean z10);

    void onError(int i10, String str);
}
