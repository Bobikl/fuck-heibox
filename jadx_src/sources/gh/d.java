package gh;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NetworkInfoMethodChannelHandler.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lgh/d;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", "result", "Lkotlin/b2;", "onMethodCall", "Lgh/c;", "networkInfo", "<init>", "(Lgh/c;)V", "network_info_plus_release"}, k = 1, mv = {1, 7, 1})
public final class d implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final c f119059b;

    public d(@dl.d c networkInfo) {
        f0.p(networkInfo, "networkInfo");
        this.f119059b = networkInfo;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@dl.d MethodCall call, @dl.d MethodChannel.Result result) {
        f0.p(call, "call");
        f0.p(result, "result");
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1560837844:
                    if (str.equals("wifiBroadcast")) {
                        result.success(this.f119059b.b());
                        return;
                    }
                    break;
                case -1340798144:
                    if (str.equals("wifiName")) {
                        result.success(this.f119059b.k());
                        return;
                    }
                    break;
                case -989025832:
                    if (str.equals("wifiIPv6Address")) {
                        result.success(this.f119059b.f());
                        return;
                    }
                    break;
                case 183655511:
                    if (str.equals("wifiSubmask")) {
                        result.success(this.f119059b.l());
                        return;
                    }
                    break;
                case 1373405384:
                    if (str.equals("wifiBSSID")) {
                        result.success(this.f119059b.g());
                        return;
                    }
                    break;
                case 1674251141:
                    if (str.equals("wifiGatewayAddress")) {
                        result.success(this.f119059b.c());
                        return;
                    }
                    break;
                case 1756715352:
                    if (str.equals("wifiIPAddress")) {
                        result.success(this.f119059b.h());
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}
