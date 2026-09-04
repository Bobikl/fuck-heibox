package fh;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.WindowManager;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.d;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DeviceInfoPlusPlugin.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lfh/b;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "Landroid/content/Context;", d.R, "Lkotlin/b2;", ak.av, "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "onAttachedToEngine", "onDetachedFromEngine", "<init>", "()V", "device_info_plus_release"}, k = 1, mv = {1, 7, 1})
public final class b implements FlutterPlugin {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MethodChannel f118846b;

    private final void a(BinaryMessenger binaryMessenger, Context context) {
        this.f118846b = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        f0.o(packageManager, "context.packageManager");
        Object systemService = context.getSystemService("window");
        f0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        c cVar = new c(packageManager, (WindowManager) systemService);
        MethodChannel methodChannel = this.f118846b;
        if (methodChannel == null) {
            f0.S("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(cVar);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@dl.d FlutterPlugin.FlutterPluginBinding binding) {
        f0.p(binding, "binding");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        f0.o(binaryMessenger, "binding.binaryMessenger");
        Context applicationContext = binding.getApplicationContext();
        f0.o(applicationContext, "binding.applicationContext");
        a(binaryMessenger, applicationContext);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@dl.d FlutterPlugin.FlutterPluginBinding binding) {
        f0.p(binding, "binding");
        MethodChannel methodChannel = this.f118846b;
        if (methodChannel == null) {
            f0.S("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }
}
