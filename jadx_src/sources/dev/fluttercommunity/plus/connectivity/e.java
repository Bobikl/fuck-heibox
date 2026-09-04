package dev.fluttercommunity.plus.connectivity;

import androidx.annotation.n0;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: compiled from: ConnectivityMethodChannelHandler.java */
/* JADX INFO: loaded from: classes4.dex */
public class e implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f108218c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f108219b;

    e(b bVar) {
        this.f108219b = bVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, @n0 MethodChannel.Result result) {
        if ("check".equals(methodCall.method)) {
            result.success(this.f108219b.d());
        } else {
            result.notImplemented();
        }
    }
}
