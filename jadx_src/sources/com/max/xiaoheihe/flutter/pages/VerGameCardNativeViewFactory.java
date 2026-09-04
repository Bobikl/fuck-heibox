package com.max.xiaoheihe.flutter.pages;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.Map;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VerGameCardNativeViewFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class VerGameCardNativeViewFactory extends PlatformViewFactory {
    public static final int $stable = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public VerGameCardNativeViewFactory() {
        super(StandardMessageCodec.INSTANCE);
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    @d
    public PlatformView create(@d Context context, int i10, @e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10), obj}, this, changeQuickRedirect, false, 22031, new Class[]{Context.class, Integer.TYPE, Object.class}, PlatformView.class);
        if (patchProxyResultProxy.isSupported) {
            return (PlatformView) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        return new VerGameCardNativeView(context, i10, (Map) obj);
    }
}
