package eh;

import android.os.Build;
import dl.d;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FlutterIcmpPingPlugin.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"Leh/b;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "Lkotlin/b2;", "onAttachedToEngine", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", "result", "onMethodCall", "binding", "onDetachedFromEngine", "<init>", "()V", "flutter_icmp_ping_release"}, k = 1, mv = {1, 7, 1})
public final class b implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MethodChannel f118689b;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@d FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        f0.p(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "flutter_icmp_ping");
        this.f118689b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@d FlutterPlugin.FlutterPluginBinding binding) {
        f0.p(binding, "binding");
        MethodChannel methodChannel = this.f118689b;
        if (methodChannel == null) {
            f0.S("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@d MethodCall call, @d MethodChannel.Result result) {
        f0.p(call, "call");
        f0.p(result, "result");
        if (!f0.g(call.method, com.tekartik.sqflite.b.f98581b)) {
            result.notImplemented();
            return;
        }
        result.success("Android " + Build.VERSION.RELEASE);
    }
}
