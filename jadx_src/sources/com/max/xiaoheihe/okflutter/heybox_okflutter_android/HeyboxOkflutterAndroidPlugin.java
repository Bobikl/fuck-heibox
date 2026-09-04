package com.max.xiaoheihe.okflutter.heybox_okflutter_android;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HeyboxOkflutterAndroidPlugin.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"Lcom/max/xiaoheihe/okflutter/heybox_okflutter_android/HeyboxOkflutterAndroidPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "Lkotlin/b2;", "onAttachedToEngine", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", "result", "onMethodCall", "binding", "onDetachedFromEngine", "<init>", "()V", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1})
public final class HeyboxOkflutterAndroidPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@d FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        if (PatchProxy.proxy(new Object[]{flutterPluginBinding}, this, changeQuickRedirect, false, 47935, new Class[]{FlutterPlugin.FlutterPluginBinding.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(flutterPluginBinding, "flutterPluginBinding");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@d FlutterPlugin.FlutterPluginBinding binding) {
        if (PatchProxy.proxy(new Object[]{binding}, this, changeQuickRedirect, false, 47937, new Class[]{FlutterPlugin.FlutterPluginBinding.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(binding, "binding");
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@d MethodCall call, @d MethodChannel.Result result) {
        if (PatchProxy.proxy(new Object[]{call, result}, this, changeQuickRedirect, false, 47936, new Class[]{MethodCall.class, MethodChannel.Result.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(call, "call");
        f0.p(result, "result");
    }
}
