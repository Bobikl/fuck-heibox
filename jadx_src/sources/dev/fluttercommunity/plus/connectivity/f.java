package dev.fluttercommunity.plus.connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.n0;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: compiled from: ConnectivityPlugin.java */
/* JADX INFO: loaded from: classes4.dex */
public class f implements FlutterPlugin {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MethodChannel f108220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EventChannel f108221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ConnectivityBroadcastReceiver f108222d;

    private void a(BinaryMessenger binaryMessenger, Context context) {
        this.f108220b = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity");
        this.f108221c = new EventChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity_status");
        b bVar = new b((ConnectivityManager) context.getSystemService("connectivity"));
        e eVar = new e(bVar);
        this.f108222d = new ConnectivityBroadcastReceiver(context, bVar);
        this.f108220b.setMethodCallHandler(eVar);
        this.f108221c.setStreamHandler(this.f108222d);
    }

    private void b() {
        this.f108220b.setMethodCallHandler(null);
        this.f108221c.setStreamHandler(null);
        this.f108222d.onCancel(null);
        this.f108220b = null;
        this.f108221c = null;
        this.f108222d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        a(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        b();
    }
}
