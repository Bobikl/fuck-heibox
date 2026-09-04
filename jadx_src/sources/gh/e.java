package gh;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: NetworkInfoPlusPlugin.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lgh/e;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Lkotlin/b2;", ak.av, "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "onAttachedToEngine", "onDetachedFromEngine", "<init>", "()V", "network_info_plus_release"}, k = 1, mv = {1, 7, 1})
public final class e implements FlutterPlugin {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f119060c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final String f119061d = "dev.fluttercommunity.plus/network_info";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MethodChannel f119062b;

    /* JADX INFO: compiled from: NetworkInfoPlusPlugin.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lgh/e$a;", "", "", "CHANNEL", "Ljava/lang/String;", "<init>", "()V", "network_info_plus_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    private final void a(BinaryMessenger binaryMessenger, Context context) {
        ConnectivityManager connectivityManager;
        this.f119062b = new MethodChannel(binaryMessenger, f119061d);
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        f0.n(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        WifiManager wifiManager = (WifiManager) systemService;
        MethodChannel methodChannel = null;
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService2 = context.getApplicationContext().getSystemService("connectivity");
            f0.n(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
            connectivityManager = (ConnectivityManager) systemService2;
        } else {
            connectivityManager = null;
        }
        d dVar = new d(new c(wifiManager, connectivityManager));
        MethodChannel methodChannel2 = this.f119062b;
        if (methodChannel2 == null) {
            f0.S("methodChannel");
        } else {
            methodChannel = methodChannel2;
        }
        methodChannel.setMethodCallHandler(dVar);
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
        MethodChannel methodChannel = this.f119062b;
        if (methodChannel == null) {
            f0.S("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }
}
