package com.max.xiaoheihe.okflutter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.flutter.embedding.engine.FlutterEngine;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes13.dex */
public class TextInputChannelHook {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void hook(FlutterEngine flutterEngine) {
        if (PatchProxy.proxy(new Object[]{flutterEngine}, null, changeQuickRedirect, true, 47750, new Class[]{FlutterEngine.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Field declaredField = flutterEngine.getClass().getDeclaredField("textInputChannel");
            declaredField.setAccessible(true);
            declaredField.set(flutterEngine, new MyTextInputChannel(flutterEngine.getDartExecutor()));
        } catch (Exception unused) {
        }
    }
}
