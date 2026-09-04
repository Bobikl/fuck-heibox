package com.max.xiaoheihe.okflutter.miniapp;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.l;
import androidx.exifinterface.media.a;
import androidx.fragment.app.FragmentActivity;
import com.max.xiaoheihe.okflutter.OkFlutterLog;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate;
import com.max.xiaoheihe.okflutter.embedding.FlutterFragment;
import com.max.xiaoheihe.okflutter.pigeon.IHybridMessage;
import com.max.xiaoheihe.okflutter.pigeon.IHybridRoute;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.taobao.agoo.a.a.b;
import com.umeng.analytics.pro.d;
import dl.e;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.TransparencyMode;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HBMiniAppFlutterFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0002:;B\u0007¢\u0006\u0004\b8\u00109J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0015J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J:\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00142\u0012\b\u0002\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0016J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\"\u0010\"\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\u0012\u0010&\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\b\u0010'\u001a\u00020\u0011H\u0016J\n\u0010(\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020\u0005H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\b\u00100\u001a\u00020/H\u0016R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/max/xiaoheihe/okflutter/miniapp/HBMiniAppFlutterFragment;", "Lcom/max/xiaoheihe/okflutter/embedding/FlutterFragment;", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate$Host;", "Landroid/content/Context;", d.R, "Lkotlin/b2;", "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", com.google.android.exoplayer2.text.ttml.d.W, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "getSplashBackColor", "", "getCachedEngineId", "name", "", "params", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$NullableResult;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$HybridMessageResponse;", "callback", "sendMessage", "Lio/flutter/embedding/engine/FlutterEngine;", "flutterEngine", "configureFlutterEngine", "provideFlutterEngine", "requestCode", b.JSON_ERRORCODE, "Landroid/content/Intent;", "data", "onActivityResult", "onDetach", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridRoute$HybridRouteInfo;", "hybridRouteInfo", "finish", "getPath", "getParamJson", "requestHostExit", "onStart", "onResume", "onStop", "onDestroyView", "onDestroy", "", "shouldRestoreAndSaveState", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate;", "hbHostDelegate", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate;", "getHbHostDelegate", "()Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate;", "setHbHostDelegate", "(Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate;)V", "<init>", "()V", "Companion", "FlutterFragmentBuilder", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1})
public class HBMiniAppFlutterFragment extends FlutterFragment implements HBFlutterHostDelegate.Host {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private HBFlutterHostDelegate hbHostDelegate;

    /* JADX INFO: compiled from: HBMiniAppFlutterFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0012\b\u0002\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/max/xiaoheihe/okflutter/miniapp/HBMiniAppFlutterFragment$Companion;", "", "()V", "withDefaultEngine", "Lcom/max/xiaoheihe/okflutter/miniapp/HBMiniAppFlutterFragment$FlutterFragmentBuilder;", "fragmentClass", "Ljava/lang/Class;", "Lcom/max/xiaoheihe/okflutter/miniapp/HBMiniAppFlutterFragment;", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ FlutterFragmentBuilder withDefaultEngine$default(Companion companion, Class cls, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{companion, cls, new Integer(i10), obj}, null, changeQuickRedirect, true, 47960, new Class[]{Companion.class, Class.class, Integer.TYPE, Object.class}, FlutterFragmentBuilder.class);
            if (patchProxyResultProxy.isSupported) {
                return (FlutterFragmentBuilder) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                cls = HBMiniAppFlutterFragment.class;
            }
            return companion.withDefaultEngine(cls);
        }

        @dl.d
        public final FlutterFragmentBuilder withDefaultEngine(@dl.d Class<? extends HBMiniAppFlutterFragment> fragmentClass) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragmentClass}, this, changeQuickRedirect, false, 47959, new Class[]{Class.class}, FlutterFragmentBuilder.class);
            if (patchProxyResultProxy.isSupported) {
                return (FlutterFragmentBuilder) patchProxyResultProxy.result;
            }
            f0.p(fragmentClass, "fragmentClass");
            return new FlutterFragmentBuilder(fragmentClass).transparencyMode(TransparencyMode.opaque).renderMode(RenderMode.texture);
        }
    }

    /* JADX INFO: compiled from: HBMiniAppFlutterFragment.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0017\u0010\u0014\u001a\u0002H\u0015\"\n\b\u0000\u0010\u0015*\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/max/xiaoheihe/okflutter/miniapp/HBMiniAppFlutterFragment$FlutterFragmentBuilder;", "", "fragmentClass", "Ljava/lang/Class;", "Lcom/max/xiaoheihe/okflutter/miniapp/HBMiniAppFlutterFragment;", "(Ljava/lang/Class;)V", "destroyEngineWithFragment", "", "getFragmentClass", "()Ljava/lang/Class;", "paramJson", "", FlutterActivityLaunchConfigs.EXTRA_PATH, "renderMode", "Lio/flutter/embedding/android/RenderMode;", "shouldAttachEngineToActivity", "shouldDelayFirstAndroidViewDraw", "transparencyMode", "Lio/flutter/embedding/android/TransparencyMode;", "uniqueId", "build", a.f23244d5, "()Lcom/max/xiaoheihe/okflutter/miniapp/HBMiniAppFlutterFragment;", "createArgs", "Landroid/os/Bundle;", "params", "url", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FlutterFragmentBuilder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private boolean destroyEngineWithFragment;

        @dl.d
        private final Class<? extends HBMiniAppFlutterFragment> fragmentClass;

        @e
        private String paramJson;

        @e
        private String path;

        @dl.d
        private RenderMode renderMode;
        private boolean shouldAttachEngineToActivity;
        private boolean shouldDelayFirstAndroidViewDraw;

        @e
        private TransparencyMode transparencyMode;

        @e
        private String uniqueId;

        /* JADX WARN: Multi-variable type inference failed */
        public FlutterFragmentBuilder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public FlutterFragmentBuilder(@dl.d Class<? extends HBMiniAppFlutterFragment> fragmentClass) {
            f0.p(fragmentClass, "fragmentClass");
            this.fragmentClass = fragmentClass;
            this.destroyEngineWithFragment = true;
            this.renderMode = RenderMode.surface;
            this.transparencyMode = TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
        }

        public /* synthetic */ FlutterFragmentBuilder(Class cls, int i10, u uVar) {
            this((i10 & 1) != 0 ? HBMiniAppFlutterFragment.class : cls);
        }

        public final <T extends HBMiniAppFlutterFragment> T build() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47963, new Class[0], HBMiniAppFlutterFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (T) patchProxyResultProxy.result;
            }
            try {
                T t10 = (T) this.fragmentClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (t10 != null) {
                    t10.setArguments(createArgs());
                    return t10;
                }
                throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.fragmentClass.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e10) {
                throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + this.fragmentClass.getName() + ')', e10);
            }
        }

        @dl.d
        public final Bundle createArgs() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47962, new Class[0], Bundle.class);
            if (patchProxyResultProxy.isSupported) {
                return (Bundle) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("destroy_engine_with_fragment", this.destroyEngineWithFragment);
            bundle.putString("flutterview_render_mode", this.renderMode.name());
            TransparencyMode transparencyMode = this.transparencyMode;
            if (transparencyMode != null) {
                f0.m(transparencyMode);
            } else {
                transparencyMode = TransparencyMode.opaque;
            }
            bundle.putString("flutterview_transparency_mode", transparencyMode.name());
            bundle.putBoolean("should_attach_engine_to_activity", this.shouldAttachEngineToActivity);
            bundle.putString(FlutterActivityLaunchConfigs.EXTRA_PATH, this.path);
            bundle.putSerializable(FlutterActivityLaunchConfigs.EXTRA_PARAM_JSON, this.paramJson);
            bundle.putSerializable(FlutterActivityLaunchConfigs.EXTRA_UNIQUE_ID, this.uniqueId);
            bundle.putBoolean("should_delay_first_android_view_draw", this.shouldDelayFirstAndroidViewDraw);
            return bundle;
        }

        @dl.d
        public final FlutterFragmentBuilder destroyEngineWithFragment(boolean destroyEngineWithFragment) {
            this.destroyEngineWithFragment = destroyEngineWithFragment;
            return this;
        }

        @dl.d
        public final Class<? extends HBMiniAppFlutterFragment> getFragmentClass() {
            return this.fragmentClass;
        }

        @dl.d
        public final FlutterFragmentBuilder paramJson(@e String params) {
            this.paramJson = params;
            return this;
        }

        @dl.d
        public final FlutterFragmentBuilder path(@e String url) {
            this.path = url;
            return this;
        }

        @dl.d
        public final FlutterFragmentBuilder renderMode(@e RenderMode renderMode) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{renderMode}, this, changeQuickRedirect, false, 47961, new Class[]{RenderMode.class}, FlutterFragmentBuilder.class);
            if (patchProxyResultProxy.isSupported) {
                return (FlutterFragmentBuilder) patchProxyResultProxy.result;
            }
            f0.m(renderMode);
            this.renderMode = renderMode;
            return this;
        }

        @dl.d
        public final FlutterFragmentBuilder shouldAttachEngineToActivity(boolean shouldAttachEngineToActivity) {
            this.shouldAttachEngineToActivity = shouldAttachEngineToActivity;
            return this;
        }

        @dl.d
        public final FlutterFragmentBuilder shouldDelayFirstAndroidViewDraw(boolean shouldDelayFirstAndroidViewDraw) {
            this.shouldDelayFirstAndroidViewDraw = shouldDelayFirstAndroidViewDraw;
            return this;
        }

        @dl.d
        public final FlutterFragmentBuilder transparencyMode(@e TransparencyMode transparencyMode) {
            this.transparencyMode = transparencyMode;
            return this;
        }

        @dl.d
        public final FlutterFragmentBuilder uniqueId(@e String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
    }

    public static /* synthetic */ void sendMessage$default(HBMiniAppFlutterFragment hBMiniAppFlutterFragment, String str, Map map, IHybridMessage.NullableResult nullableResult, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{hBMiniAppFlutterFragment, str, map, nullableResult, new Integer(i10), obj}, null, changeQuickRedirect, true, 47943, new Class[]{HBMiniAppFlutterFragment.class, String.class, Map.class, IHybridMessage.NullableResult.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessage");
        }
        if ((i10 & 2) != 0) {
            map = null;
        }
        if ((i10 & 4) != 0) {
            nullableResult = null;
        }
        hBMiniAppFlutterFragment.sendMessage(str, map, nullableResult);
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterFragment, com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(@dl.d FlutterEngine flutterEngine) {
        if (PatchProxy.proxy(new Object[]{flutterEngine}, this, changeQuickRedirect, false, 47944, new Class[]{FlutterEngine.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(flutterEngine, "flutterEngine");
        super.configureFlutterEngine(flutterEngine);
        HBFlutterHostDelegate hBFlutterHostDelegate = this.hbHostDelegate;
        if (hBFlutterHostDelegate != null) {
            hBFlutterHostDelegate.configureFlutterEngine(flutterEngine);
        }
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    public void finish(@e IHybridRoute.HybridRouteInfo hybridRouteInfo) {
        if (PatchProxy.proxy(new Object[]{hybridRouteInfo}, this, changeQuickRedirect, false, 47948, new Class[]{IHybridRoute.HybridRouteInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        if (hybridRouteInfo != null) {
            Intent intent = new Intent();
            intent.putExtra("ActivityResult", hybridRouteInfo.getParamJson());
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setResult(-1, intent);
            }
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterFragment, com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    @e
    public String getCachedEngineId() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47941, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String cachedEngineId = super.getCachedEngineId();
        HBFlutterHostDelegate hBFlutterHostDelegate = this.hbHostDelegate;
        if (hBFlutterHostDelegate == null) {
            return cachedEngineId;
        }
        if (hBFlutterHostDelegate != null) {
            return hBFlutterHostDelegate.getCachedEngineId(cachedEngineId);
        }
        return null;
    }

    @e
    public final HBFlutterHostDelegate getHbHostDelegate() {
        return this.hbHostDelegate;
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    @e
    public String getParamJson() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47950, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString(FlutterActivityLaunchConfigs.EXTRA_PARAM_JSON);
        }
        return null;
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    @dl.d
    public String getPath() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47949, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(FlutterActivityLaunchConfigs.EXTRA_PATH) : null;
        return string == null ? "" : string;
    }

    @l
    public int getSplashBackColor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47940, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : getResources().getColor(R.color.background_light);
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    public boolean handleFlutterMessage(@e IHybridMessage.HybridMessageInfo hybridMessageInfo, @dl.d IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> nullableResult) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hybridMessageInfo, nullableResult}, this, changeQuickRedirect, false, 47958, new Class[]{IHybridMessage.HybridMessageInfo.class, IHybridMessage.NullableResult.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : HBFlutterHostDelegate.Host.DefaultImpls.handleFlutterMessage(this, hybridMessageInfo, nullableResult);
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47946, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        HBFlutterHostDelegate hBFlutterHostDelegate = this.hbHostDelegate;
        if (hBFlutterHostDelegate != null) {
            hBFlutterHostDelegate.onActivityResult(i10, i11, intent);
        }
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterFragment, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 47938, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        HBFlutterHostDelegate hBFlutterHostDelegate = new HBFlutterHostDelegate(this);
        this.hbHostDelegate = hBFlutterHostDelegate;
        hBFlutterHostDelegate.onAttach(context);
        super.onAttach(context);
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterFragment, androidx.fragment.app.Fragment
    @e
    public View onCreateView(@dl.d LayoutInflater inflater, @e ViewGroup container, @e Bundle savedInstanceState) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, container, savedInstanceState}, this, changeQuickRedirect, false, 47939, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        if (!(viewOnCreateView instanceof FlutterView)) {
            return viewOnCreateView;
        }
        FrameLayout frameLayout = new FrameLayout(((FlutterView) viewOnCreateView).getContext());
        frameLayout.setBackgroundColor(getSplashBackColor());
        frameLayout.addView(viewOnCreateView);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47956, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        if (OkFlutterLog.isDebugLoggingEnabled()) {
            OkFlutterLog.d("HBMiniAppFlutterFragment", "onDestroy");
        }
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47955, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        if (OkFlutterLog.isDebugLoggingEnabled()) {
            OkFlutterLog.d("HBMiniAppFlutterFragment", "onDestroyView");
        }
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47947, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (OkFlutterLog.isDebugLoggingEnabled()) {
            OkFlutterLog.d("HBFlutterFragment", "onDetach");
        }
        HBFlutterHostDelegate hBFlutterHostDelegate = this.hbHostDelegate;
        if (hBFlutterHostDelegate != null) {
            hBFlutterHostDelegate.onDetach();
        }
        super.onDetach();
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47953, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        HBFlutterHostDelegate hBFlutterHostDelegate = this.hbHostDelegate;
        if (hBFlutterHostDelegate != null) {
            hBFlutterHostDelegate.onResume();
        }
        if (OkFlutterLog.isDebugLoggingEnabled()) {
            OkFlutterLog.d("HBMiniAppFlutterFragment", "onResume");
        }
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterFragment, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47952, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        if (OkFlutterLog.isDebugLoggingEnabled()) {
            OkFlutterLog.d("HBMiniAppFlutterFragment", "onStart");
        }
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterFragment, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47954, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
        if (OkFlutterLog.isDebugLoggingEnabled()) {
            OkFlutterLog.d("HBMiniAppFlutterFragment", "onStop");
        }
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterFragment, com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineProvider
    @e
    public FlutterEngine provideFlutterEngine(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 47945, new Class[]{Context.class}, FlutterEngine.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlutterEngine) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        HBFlutterHostDelegate hBFlutterHostDelegate = this.hbHostDelegate;
        if (hBFlutterHostDelegate != null) {
            return hBFlutterHostDelegate.provideFlutterEngine(context);
        }
        return null;
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    public void requestHostExit() {
        HBFlutterHostDelegate hBFlutterHostDelegate;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47951, new Class[0], Void.TYPE).isSupported || (hBFlutterHostDelegate = this.hbHostDelegate) == null) {
            return;
        }
        hBFlutterHostDelegate.requestHostExit();
    }

    public final void sendMessage(@dl.d String name, @e Map<String, String> map, @e IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> nullableResult) {
        if (PatchProxy.proxy(new Object[]{name, map, nullableResult}, this, changeQuickRedirect, false, 47942, new Class[]{String.class, Map.class, IHybridMessage.NullableResult.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(name, "name");
        HBFlutterHostDelegate hBFlutterHostDelegate = this.hbHostDelegate;
        if (hBFlutterHostDelegate != null) {
            hBFlutterHostDelegate.sendFlutterMessage(name, map, nullableResult);
        }
    }

    public final void setHbHostDelegate(@e HBFlutterHostDelegate hBFlutterHostDelegate) {
        this.hbHostDelegate = hBFlutterHostDelegate;
    }

    @Override // com.max.xiaoheihe.okflutter.embedding.FlutterFragment, com.max.xiaoheihe.okflutter.embedding.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldRestoreAndSaveState() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47957, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (requireArguments().containsKey(FlutterActivityLaunchConfigs.EXTRA_ENABLE_STATE_RESTORATION)) {
            return requireArguments().getBoolean(FlutterActivityLaunchConfigs.EXTRA_ENABLE_STATE_RESTORATION);
        }
        return true;
    }
}
