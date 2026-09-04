package com.max.xiaoheihe.flutter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.b;
import androidx.annotation.l;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.flutter.api.FlutterFragmentParent;
import com.max.xiaoheihe.flutter.pigeon.HBHybridShare;
import com.max.xiaoheihe.okflutter.containers.HBFlutterFragment;
import com.max.xiaoheihe.okflutter.pigeon.IHybridMessage;
import com.max.xiaoheihe.okflutter.pigeon.IHybridShare;
import com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket;
import com.max.xiaoheihe.utils.m0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.Map;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ExtendedHBFlutterFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public class ExtendedHBFlutterFragment extends HBFlutterFragment implements m0.e {
    public static final int $stable = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterFragment, io.flutter.embedding.android.FlutterFragment, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(@d FlutterEngine flutterEngine) {
        if (PatchProxy.proxy(new Object[]{flutterEngine}, this, changeQuickRedirect, false, 21983, new Class[]{FlutterEngine.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(flutterEngine, "flutterEngine");
        super.configureFlutterEngine(flutterEngine);
        BinaryMessenger binaryMessenger = flutterEngine.getDartExecutor().getBinaryMessenger();
        Context context = getContext();
        f0.o(context, "context");
        IHybridShare.HybridShareApi.CC.e(binaryMessenger, new HBHybridShare(context));
    }

    @l
    public int getBackgroundColor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21984, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : getResources().getColor(R.color.background_layer_2_color);
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterFragment, com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    @e
    public String getParamJson() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21985, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Context context = getContext();
        f0.o(context, "context");
        return FlutterRouterKt.serializeFlutterPageParams(context, getArguments(), super.getParamJson());
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterFragment, com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    public boolean handleFlutterMessage(@e IHybridMessage.HybridMessageInfo hybridMessageInfo, @d IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> result) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hybridMessageInfo, result}, this, changeQuickRedirect, false, 21986, new Class[]{IHybridMessage.HybridMessageInfo.class, IHybridMessage.NullableResult.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(result, "result");
        String name = hybridMessageInfo != null ? hybridMessageInfo.getName() : null;
        if (name == null || name.hashCode() != 1849896159 || !name.equals(ExtendedHBFlutterFragmentKt.ON_TOUCH)) {
            return super.handleFlutterMessage(hybridMessageInfo, result);
        }
        Map<String, String> params = hybridMessageInfo.getParams();
        boolean zG = f0.g(params != null ? params.get("horizontal_consumed") : null, "1");
        Map<String, String> params2 = hybridMessageInfo.getParams();
        boolean zG2 = f0.g(params2 != null ? params2.get("vertical_consumed") : null, "1");
        if (getParentFragment() instanceof FlutterFragmentParent) {
            b parentFragment = getParentFragment();
            f0.n(parentFragment, "null cannot be cast to non-null type com.max.xiaoheihe.flutter.api.FlutterFragmentParent");
            ((FlutterFragmentParent) parentFragment).onFlutterViewTouch(zG || zG2);
        }
        return true;
    }

    @Override // com.max.xiaoheihe.utils.m0.e
    public void handleMessage(@d final String content, @d final m0.f result) {
        if (PatchProxy.proxy(new Object[]{content, result}, this, changeQuickRedirect, false, 21987, new Class[]{String.class, m0.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(content, "content");
        f0.p(result, "result");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.max.xiaoheihe.flutter.ExtendedHBFlutterFragment.handleMessage.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    IHybridWebsocket.FlutterWebsocket flutterWebsocket;
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21988, new Class[0], Void.TYPE).isSupported || (flutterWebsocket = ExtendedHBFlutterFragment.this.getFlutterWebsocket()) == null) {
                        return;
                    }
                    String str = content;
                    final m0.f fVar = result;
                    flutterWebsocket.handleMessage(str, new IHybridWebsocket.Result<IHybridWebsocket.HybridWebsocketResult>() { // from class: com.max.xiaoheihe.flutter.ExtendedHBFlutterFragment.handleMessage.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket.Result
                        public void error(@d Throwable p10) {
                            if (PatchProxy.proxy(new Object[]{p10}, this, changeQuickRedirect, false, 21990, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            f0.p(p10, "p0");
                            fVar.a(false);
                        }

                        /* JADX INFO: renamed from: success, reason: avoid collision after fix types in other method */
                        public void success2(@d IHybridWebsocket.HybridWebsocketResult p10) {
                            if (PatchProxy.proxy(new Object[]{p10}, this, changeQuickRedirect, false, 21989, new Class[]{IHybridWebsocket.HybridWebsocketResult.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            f0.p(p10, "p0");
                            m0.f fVar2 = fVar;
                            Long resultCode = p10.getResultCode();
                            fVar2.a(resultCode != null && resultCode.longValue() == 1);
                        }

                        @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket.Result
                        public /* bridge */ /* synthetic */ void success(IHybridWebsocket.HybridWebsocketResult hybridWebsocketResult) {
                            if (PatchProxy.proxy(new Object[]{hybridWebsocketResult}, this, changeQuickRedirect, false, 21991, new Class[]{Object.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            success2(hybridWebsocketResult);
                        }
                    });
                }
            });
        }
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    @e
    public View onCreateView(@d LayoutInflater inflater, @e ViewGroup viewGroup, @e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 21980, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, viewGroup, bundle);
        if (!(viewOnCreateView instanceof FlutterView)) {
            return viewOnCreateView;
        }
        FrameLayout frameLayout = new FrameLayout(((FlutterView) viewOnCreateView).getContext());
        frameLayout.setBackgroundColor(getBackgroundColor());
        frameLayout.addView(viewOnCreateView);
        return frameLayout;
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21982, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        m0.x().L(null);
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterFragment, io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21981, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        m0.x().L(this);
    }
}
