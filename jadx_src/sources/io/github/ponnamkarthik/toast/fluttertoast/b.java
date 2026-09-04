package io.github.ponnamkarthik.toast.fluttertoast;

import android.content.Context;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FlutterToastPlugin.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0013"}, d2 = {"Lio/github/ponnamkarthik/toast/fluttertoast/b;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Lkotlin/b2;", ak.av, "b", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "onAttachedToEngine", "p0", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodChannel;", "Lio/flutter/plugin/common/MethodChannel;", "channel", "<init>", "()V", "fluttertoast_release"}, k = 1, mv = {1, 7, 1})
public final class b implements FlutterPlugin {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private MethodChannel channel;

    private final void a(BinaryMessenger binaryMessenger, Context context) {
        this.channel = new MethodChannel(binaryMessenger, "PonnamKarthik/fluttertoast");
        e eVar = new e(context);
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(eVar);
        }
    }

    private final void b() {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.channel = null;
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
    public void onDetachedFromEngine(@dl.d FlutterPlugin.FlutterPluginBinding p10) {
        f0.p(p10, "p0");
        b();
    }
}
