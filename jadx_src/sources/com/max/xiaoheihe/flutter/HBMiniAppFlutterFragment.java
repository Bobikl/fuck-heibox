package com.max.xiaoheihe.flutter;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.o;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.module.miniprogram.MiniProgramHostActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import f7.a;
import io.flutter.embedding.android.RenderMode;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBMiniAppFlutterFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public class HBMiniAppFlutterFragment extends ExtendedHBFlutterFragment {
    public static final int $stable = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.xiaoheihe.flutter.ExtendedHBFlutterFragment, com.max.xiaoheihe.okflutter.containers.HBFlutterFragment, com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    @e
    public String getParamJson() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, a.d.f118807r, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Context context = getContext();
        f0.o(context, "context");
        return FlutterRouterKt.serializeFlutterPageParams(context, getArguments(), super.getParamJson());
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterFragment, com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    @d
    public String getPath() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22002, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        g.f74531b.q("HBMiniAppFlutterFragment, getPath, arguments = " + getArguments());
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(MiniProgramHostActivity.J4) : null;
        return string == null ? "" : string;
    }

    @Override // io.flutter.embedding.android.FlutterFragment, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @d
    public RenderMode getRenderMode() {
        return RenderMode.texture;
    }
}
