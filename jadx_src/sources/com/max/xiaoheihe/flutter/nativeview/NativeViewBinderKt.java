package com.max.xiaoheihe.flutter.nativeview;

import android.content.Context;
import com.max.xiaoheihe.flutter.pages.VerGameCardNativeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import io.flutter.plugin.platform.PlatformView;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NativeViewBinder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NativeViewBinderKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    public static final NativeViewBinder getNativeViewBinder(@d Context context, @d PlatformView platformView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, platformView}, null, changeQuickRedirect, true, 22027, new Class[]{Context.class, PlatformView.class}, NativeViewBinder.class);
        if (patchProxyResultProxy.isSupported) {
            return (NativeViewBinder) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(platformView, "platformView");
        if (platformView instanceof VerGameCardNativeView) {
            return new com.max.xiaoheihe.module.game.adapter.recommend.viewholder.d(context);
        }
        return null;
    }
}
