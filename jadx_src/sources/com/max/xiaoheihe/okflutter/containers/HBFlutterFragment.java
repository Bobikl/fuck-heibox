package com.max.xiaoheihe.okflutter.containers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.exifinterface.media.a;
import androidx.fragment.app.FragmentActivity;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.okflutter.OkFlutterLog;
import com.max.xiaoheihe.okflutter.pigeon.IHeyboxProtocol;
import com.max.xiaoheihe.okflutter.pigeon.IHybridMessage;
import com.max.xiaoheihe.okflutter.pigeon.IHybridRoute;
import com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.taobao.agoo.a.a.b;
import com.umeng.analytics.pro.d;
import dl.e;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.TransparencyMode;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HBFlutterFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 82\u00020\u00012\u00020\u0002:\u000289B\u0007¢\u0006\u0004\b6\u00107J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bJ:\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00102\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012J \u0010\u0019\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\"\u0010%\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\b\u0010&\u001a\u00020\u0003H\u0016J\b\u0010'\u001a\u00020\u0003H\u0016J\b\u0010(\u001a\u00020\u0003H\u0016J\u0012\u0010+\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010)H\u0016J\b\u0010,\u001a\u00020\bH\u0016J\n\u0010-\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010.\u001a\u00020\u0003H\u0016R$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006:"}, d2 = {"Lcom/max/xiaoheihe/okflutter/containers/HBFlutterFragment;", "Lio/flutter/embedding/android/FlutterFragment;", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate$Host;", "Lkotlin/b2;", "onResume", "Landroid/content/Context;", d.R, "onAttach", "", "getCachedEngineId", SwitchDetailActivity.P, "Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$NullableResult;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$ProtocolResponse;", "callback", "executeProtocol", "name", "", "params", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$NullableResult;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$HybridMessageResponse;", "sendFlutterMessage", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$HybridMessageInfo;", "messageInfo", "result", "", "handleFlutterMessage", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridWebsocket$FlutterWebsocket;", "getFlutterWebsocket", "Lio/flutter/embedding/engine/FlutterEngine;", "flutterEngine", "configureFlutterEngine", "provideFlutterEngine", "", "requestCode", b.JSON_ERRORCODE, "Landroid/content/Intent;", "data", "onActivityResult", "onDetach", "onDestroyView", "onDestroy", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridRoute$HybridRouteInfo;", "hybridRouteInfo", "finish", "getPath", "getParamJson", "requestHostExit", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate;", "hbHostDelegate", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate;", "getHbHostDelegate", "()Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate;", "setHbHostDelegate", "(Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate;)V", "<init>", "()V", "Companion", "FlutterFragmentBuilder", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1})
public class HBFlutterFragment extends FlutterFragment implements HBFlutterHostDelegate.Host {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private HBFlutterHostDelegate hbHostDelegate;

    /* JADX INFO: compiled from: HBFlutterFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0012\b\u0002\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/max/xiaoheihe/okflutter/containers/HBFlutterFragment$Companion;", "", "()V", "withEngine", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterFragment$FlutterFragmentBuilder;", "fragmentClass", "Ljava/lang/Class;", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterFragment;", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ FlutterFragmentBuilder withEngine$default(Companion companion, Class cls, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{companion, cls, new Integer(i10), obj}, null, changeQuickRedirect, true, 47790, new Class[]{Companion.class, Class.class, Integer.TYPE, Object.class}, FlutterFragmentBuilder.class);
            if (patchProxyResultProxy.isSupported) {
                return (FlutterFragmentBuilder) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                cls = HBFlutterFragment.class;
            }
            return companion.withEngine(cls);
        }

        @dl.d
        public final FlutterFragmentBuilder withEngine(@dl.d Class<? extends HBFlutterFragment> fragmentClass) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragmentClass}, this, changeQuickRedirect, false, 47789, new Class[]{Class.class}, FlutterFragmentBuilder.class);
            if (patchProxyResultProxy.isSupported) {
                return (FlutterFragmentBuilder) patchProxyResultProxy.result;
            }
            f0.p(fragmentClass, "fragmentClass");
            return new FlutterFragmentBuilder(fragmentClass);
        }
    }

    /* JADX INFO: compiled from: HBFlutterFragment.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0017\u0010\u0015\u001a\u0002H\u0016\"\n\b\u0000\u0010\u0016*\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0007J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/max/xiaoheihe/okflutter/containers/HBFlutterFragment$FlutterFragmentBuilder;", "", "fragmentClass", "Ljava/lang/Class;", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterFragment;", "(Ljava/lang/Class;)V", "destroyEngineWithFragment", "", "getFragmentClass", "()Ljava/lang/Class;", "paramJson", "", FlutterActivityLaunchConfigs.EXTRA_PATH, "renderMode", "Lio/flutter/embedding/android/RenderMode;", "shouldAttachEngineToActivity", "shouldAutomaticallyHandleOnBackPressed", "shouldDelayFirstAndroidViewDraw", "transparencyMode", "Lio/flutter/embedding/android/TransparencyMode;", "uniqueId", "build", a.f23244d5, "()Lcom/max/xiaoheihe/okflutter/containers/HBFlutterFragment;", "createArgs", "Landroid/os/Bundle;", "params", "url", "shouldAutomticallyHandleOnBackPressed", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FlutterFragmentBuilder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private boolean destroyEngineWithFragment;

        @dl.d
        private final Class<? extends HBFlutterFragment> fragmentClass;

        @e
        private String paramJson;

        @e
        private String path;

        @dl.d
        private RenderMode renderMode;
        private boolean shouldAttachEngineToActivity;
        private boolean shouldAutomaticallyHandleOnBackPressed;
        private boolean shouldDelayFirstAndroidViewDraw;

        @e
        private TransparencyMode transparencyMode;

        @e
        private String uniqueId;

        /* JADX WARN: Multi-variable type inference failed */
        public FlutterFragmentBuilder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public FlutterFragmentBuilder(@dl.d Class<? extends HBFlutterFragment> fragmentClass) {
            f0.p(fragmentClass, "fragmentClass");
            this.fragmentClass = fragmentClass;
            this.destroyEngineWithFragment = true;
            this.renderMode = RenderMode.surface;
            this.transparencyMode = TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
        }

        public /* synthetic */ FlutterFragmentBuilder(Class cls, int i10, u uVar) {
            this((i10 & 1) != 0 ? HBFlutterFragment.class : cls);
        }

        public final <T extends HBFlutterFragment> T build() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47793, new Class[0], HBFlutterFragment.class);
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
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47792, new Class[0], Bundle.class);
            if (patchProxyResultProxy.isSupported) {
                return (Bundle) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            bundle.putString(FlutterActivityLaunchConfigs.EXTRA_PATH, this.path);
            bundle.putSerializable(FlutterActivityLaunchConfigs.EXTRA_PARAM_JSON, this.paramJson);
            bundle.putSerializable(FlutterActivityLaunchConfigs.EXTRA_UNIQUE_ID, this.uniqueId);
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
            bundle.putBoolean("should_automatically_handle_on_back_pressed", this.shouldAutomaticallyHandleOnBackPressed);
            bundle.putBoolean("should_delay_first_android_view_draw", this.shouldDelayFirstAndroidViewDraw);
            return bundle;
        }

        @dl.d
        public final FlutterFragmentBuilder destroyEngineWithFragment(boolean destroyEngineWithFragment) {
            this.destroyEngineWithFragment = destroyEngineWithFragment;
            return this;
        }

        @dl.d
        public final Class<? extends HBFlutterFragment> getFragmentClass() {
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
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{renderMode}, this, changeQuickRedirect, false, 47791, new Class[]{RenderMode.class}, FlutterFragmentBuilder.class);
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
        public final FlutterFragmentBuilder shouldAutomticallyHandleOnBackPressed(boolean shouldAutomaticallyHandleOnBackPressed) {
            this.shouldAutomaticallyHandleOnBackPressed = shouldAutomaticallyHandleOnBackPressed;
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

    public static /* synthetic */ void sendFlutterMessage$default(HBFlutterFragment hBFlutterFragment, String str, Map map, IHybridMessage.NullableResult nullableResult, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{hBFlutterFragment, str, map, nullableResult, new Integer(i10), obj}, null, changeQuickRedirect, true, 47776, new Class[]{HBFlutterFragment.class, String.class, Map.class, IHybridMessage.NullableResult.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendFlutterMessage");
        }
        if ((i10 & 2) != 0) {
            map = null;
        }
        if ((i10 & 4) != 0) {
            nullableResult = null;
        }
        hBFlutterFragment.sendFlutterMessage(str, map, nullableResult);
    }

    @Override // io.flutter.embedding.android.FlutterFragment, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(@dl.d FlutterEngine flutterEngine) {
        if (PatchProxy.proxy(new Object[]{flutterEngine}, this, changeQuickRedirect, false, 47779, new Class[]{FlutterEngine.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(flutterEngine, "flutterEngine");
        super.configureFlutterEngine(flutterEngine);
        HBFlutterHostDelegate hBFlutterHostDelegate = this.hbHostDelegate;
        if (hBFlutterHostDelegate != null) {
            hBFlutterHostDelegate.configureFlutterEngine(flutterEngine);
        }
    }

    public final void executeProtocol(@dl.d String protocol, @dl.d IHeyboxProtocol.NullableResult<IHeyboxProtocol.ProtocolResponse> callback) {
        if (PatchProxy.proxy(new Object[]{protocol, callback}, this, changeQuickRedirect, false, 47774, new Class[]{String.class, IHeyboxProtocol.NullableResult.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(protocol, "protocol");
        f0.p(callback, "callback");
        HBFlutterHostDelegate hBFlutterHostDelegate = this.hbHostDelegate;
        if (hBFlutterHostDelegate != null) {
            hBFlutterHostDelegate.executeProtocol(protocol, callback);
        }
    }

    public void finish(@e IHybridRoute.HybridRouteInfo hybridRouteInfo) {
        if (PatchProxy.proxy(new Object[]{hybridRouteInfo}, this, changeQuickRedirect, false, 47785, new Class[]{IHybridRoute.HybridRouteInfo.class}, Void.TYPE).isSupported) {
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

    @Override // io.flutter.embedding.android.FlutterFragment, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @e
    public String getCachedEngineId() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47773, new Class[0], String.class);
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
    public final IHybridWebsocket.FlutterWebsocket getFlutterWebsocket() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47778, new Class[0], IHybridWebsocket.FlutterWebsocket.class);
        if (patchProxyResultProxy.isSupported) {
            return (IHybridWebsocket.FlutterWebsocket) patchProxyResultProxy.result;
        }
        HBFlutterHostDelegate hBFlutterHostDelegate = this.hbHostDelegate;
        if (hBFlutterHostDelegate != null) {
            return hBFlutterHostDelegate.getFlutterWebsocket();
        }
        return null;
    }

    @e
    public final HBFlutterHostDelegate getHbHostDelegate() {
        return this.hbHostDelegate;
    }

    @e
    public String getParamJson() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47787, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString(FlutterActivityLaunchConfigs.EXTRA_PARAM_JSON);
        }
        return null;
    }

    @dl.d
    public String getPath() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47786, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(FlutterActivityLaunchConfigs.EXTRA_PATH) : null;
        return string == null ? "" : string;
    }

    public boolean handleFlutterMessage(@e IHybridMessage.HybridMessageInfo messageInfo, @dl.d IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> result) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{messageInfo, result}, this, changeQuickRedirect, false, 47777, new Class[]{IHybridMessage.HybridMessageInfo.class, IHybridMessage.NullableResult.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(result, "result");
        if (!(getContext() instanceof HBFlutterFragmentActivity)) {
            return HBFlutterHostDelegate.Host.DefaultImpls.handleFlutterMessage(this, messageInfo, result);
        }
        Context context = getContext();
        f0.n(context, "null cannot be cast to non-null type com.max.xiaoheihe.okflutter.containers.HBFlutterFragmentActivity");
        return ((HBFlutterFragmentActivity) context).handleFlutterMessage(messageInfo, result);
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47781, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        HBFlutterHostDelegate hBFlutterHostDelegate = this.hbHostDelegate;
        if (hBFlutterHostDelegate != null) {
            hBFlutterHostDelegate.onActivityResult(i10, i11, intent);
        }
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 47772, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        HBFlutterHostDelegate hBFlutterHostDelegate = new HBFlutterHostDelegate(this);
        this.hbHostDelegate = hBFlutterHostDelegate;
        hBFlutterHostDelegate.onAttach(context);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47784, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        if (OkFlutterLog.isDebugLoggingEnabled()) {
            OkFlutterLog.d("HBFlutterFragment", "onDestroy");
        }
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47783, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        if (OkFlutterLog.isDebugLoggingEnabled()) {
            OkFlutterLog.d("HBFlutterFragment", "onDestroyView");
        }
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47782, new Class[0], Void.TYPE).isSupported) {
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

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47771, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        HBFlutterHostDelegate hBFlutterHostDelegate = this.hbHostDelegate;
        if (hBFlutterHostDelegate != null) {
            hBFlutterHostDelegate.onResume();
        }
    }

    @Override // io.flutter.embedding.android.FlutterFragment, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineProvider
    @e
    public FlutterEngine provideFlutterEngine(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 47780, new Class[]{Context.class}, FlutterEngine.class);
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
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47788, new Class[0], Void.TYPE).isSupported || (hBFlutterHostDelegate = this.hbHostDelegate) == null) {
            return;
        }
        hBFlutterHostDelegate.requestHostExit();
    }

    public final void sendFlutterMessage(@dl.d String name, @e Map<String, String> map, @e IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> nullableResult) {
        if (PatchProxy.proxy(new Object[]{name, map, nullableResult}, this, changeQuickRedirect, false, 47775, new Class[]{String.class, Map.class, IHybridMessage.NullableResult.class}, Void.TYPE).isSupported) {
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
}
