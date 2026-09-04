package com.max.xiaoheihe.okflutter.containers;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.okflutter.pigeon.IHeyboxProtocol;
import com.max.xiaoheihe.okflutter.pigeon.IHybridMessage;
import com.max.xiaoheihe.okflutter.pigeon.IHybridRoute;
import com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.taobao.agoo.a.a.b;
import dl.d;
import dl.e;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.TransparencyMode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HBFlutterFragmentActivity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0002*+B\u0007¢\u0006\u0004\b(\u0010)J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0016J\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bJ:\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\t2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00112\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\"\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014J\u0012\u0010#\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\b\u0010$\u001a\u00020\tH\u0016J\n\u0010%\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010&\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/max/xiaoheihe/okflutter/containers/HBFlutterFragmentActivity;", "Lio/flutter/embedding/android/FlutterFragmentActivity;", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate$Host;", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterFragment;", "getFragment", "Lio/flutter/embedding/android/FlutterFragment;", "createFlutterFragment", "", "shouldDestroyEngineWithHost", "", SwitchDetailActivity.P, "Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$NullableResult;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$ProtocolResponse;", "callback", "Lkotlin/b2;", "executeProtocol", "name", "", "params", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$NullableResult;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$HybridMessageResponse;", "sendFlutterMessage", "requestHostExit", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridWebsocket$FlutterWebsocket;", "getFlutterWebsocket", "Landroid/content/Context;", "getContext", "", "requestCode", b.JSON_ERRORCODE, "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridRoute$HybridRouteInfo;", "hybridRouteInfo", "finish", "getPath", "getParamJson", "TAG_FLUTTER_FRAGMENT", "Ljava/lang/String;", "<init>", "()V", "Companion", "FlutterFragmentActivityIntentBuilder", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1})
public class HBFlutterFragmentActivity extends FlutterFragmentActivity implements HBFlutterHostDelegate.Host {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @d
    public static final Companion INSTANCE = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final String TAG_FLUTTER_FRAGMENT = "flutter_fragment";

    /* JADX INFO: compiled from: HBFlutterFragmentActivity.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0012\b\u0002\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/max/xiaoheihe/okflutter/containers/HBFlutterFragmentActivity$Companion;", "", "()V", "withEngine", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterFragmentActivity$FlutterFragmentActivityIntentBuilder;", "activityClass", "Ljava/lang/Class;", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterFragmentActivity;", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ FlutterFragmentActivityIntentBuilder withEngine$default(Companion companion, Class cls, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{companion, cls, new Integer(i10), obj}, null, changeQuickRedirect, true, 47808, new Class[]{Companion.class, Class.class, Integer.TYPE, Object.class}, FlutterFragmentActivityIntentBuilder.class);
            if (patchProxyResultProxy.isSupported) {
                return (FlutterFragmentActivityIntentBuilder) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                cls = HBFlutterFragmentActivity.class;
            }
            return companion.withEngine(cls);
        }

        @d
        public final FlutterFragmentActivityIntentBuilder withEngine(@d Class<? extends HBFlutterFragmentActivity> activityClass) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activityClass}, this, changeQuickRedirect, false, 47807, new Class[]{Class.class}, FlutterFragmentActivityIntentBuilder.class);
            if (patchProxyResultProxy.isSupported) {
                return (FlutterFragmentActivityIntentBuilder) patchProxyResultProxy.result;
            }
            f0.p(activityClass, "activityClass");
            return new FlutterFragmentActivityIntentBuilder(activityClass);
        }
    }

    /* JADX INFO: compiled from: HBFlutterFragmentActivity.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\tJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\tR\u001b\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/max/xiaoheihe/okflutter/containers/HBFlutterFragmentActivity$FlutterFragmentActivityIntentBuilder;", "", "activityClass", "Ljava/lang/Class;", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterFragmentActivity;", "(Ljava/lang/Class;)V", "getActivityClass", "()Ljava/lang/Class;", "backgroundMode", "", "destroyEngineWithActivity", "", "paramJson", FlutterActivityLaunchConfigs.EXTRA_PATH, "Lio/flutter/embedding/android/FlutterActivityLaunchConfigs$BackgroundMode;", "build", "Landroid/content/Intent;", com.umeng.analytics.pro.d.R, "Landroid/content/Context;", "params", "url", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FlutterFragmentActivityIntentBuilder {
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        private final Class<? extends HBFlutterFragmentActivity> activityClass;

        @d
        private String backgroundMode;
        private boolean destroyEngineWithActivity;

        @e
        private String paramJson;

        @e
        private String path;

        /* JADX WARN: Multi-variable type inference failed */
        public FlutterFragmentActivityIntentBuilder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public FlutterFragmentActivityIntentBuilder(@d Class<? extends HBFlutterFragmentActivity> activityClass) {
            f0.p(activityClass, "activityClass");
            this.activityClass = activityClass;
            this.destroyEngineWithActivity = true;
            this.backgroundMode = io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque.name();
        }

        public /* synthetic */ FlutterFragmentActivityIntentBuilder(Class cls, int i10, u uVar) {
            this((i10 & 1) != 0 ? HBFlutterFragmentActivity.class : cls);
        }

        @d
        public final FlutterFragmentActivityIntentBuilder backgroundMode(@d io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{backgroundMode}, this, changeQuickRedirect, false, 47809, new Class[]{io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.class}, FlutterFragmentActivityIntentBuilder.class);
            if (patchProxyResultProxy.isSupported) {
                return (FlutterFragmentActivityIntentBuilder) patchProxyResultProxy.result;
            }
            f0.p(backgroundMode, "backgroundMode");
            this.backgroundMode = backgroundMode.name();
            return this;
        }

        @d
        public final Intent build(@e Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 47810, new Class[]{Context.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            Intent intentPutExtra = new Intent(context, this.activityClass).putExtra(FlutterActivityLaunchConfigs.EXTRA_DESTROY_ENGINE_WITH_ACTIVITY, true).putExtra(FlutterActivityLaunchConfigs.EXTRA_BACKGROUND_MODE, this.backgroundMode).putExtra(FlutterActivityLaunchConfigs.EXTRA_PATH, this.path).putExtra(FlutterActivityLaunchConfigs.EXTRA_PARAM_JSON, this.paramJson);
            f0.o(intentPutExtra, "Intent(context, activity…RA_PARAM_JSON, paramJson)");
            return intentPutExtra;
        }

        @d
        public final FlutterFragmentActivityIntentBuilder destroyEngineWithActivity(boolean destroyEngineWithActivity) {
            this.destroyEngineWithActivity = destroyEngineWithActivity;
            return this;
        }

        @d
        public final Class<? extends HBFlutterFragmentActivity> getActivityClass() {
            return this.activityClass;
        }

        @d
        public final FlutterFragmentActivityIntentBuilder paramJson(@e String params) {
            this.paramJson = params;
            return this;
        }

        @d
        public final FlutterFragmentActivityIntentBuilder path(@e String url) {
            this.path = url;
            return this;
        }
    }

    private final HBFlutterFragment getFragment() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47801, new Class[0], HBFlutterFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBFlutterFragment) patchProxyResultProxy.result;
        }
        Fragment fragmentS0 = getSupportFragmentManager().s0(this.TAG_FLUTTER_FRAGMENT);
        if (fragmentS0 instanceof HBFlutterFragment) {
            return (HBFlutterFragment) fragmentS0;
        }
        return null;
    }

    public static /* synthetic */ void sendFlutterMessage$default(HBFlutterFragmentActivity hBFlutterFragmentActivity, String str, Map map, IHybridMessage.NullableResult nullableResult, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{hBFlutterFragmentActivity, str, map, nullableResult, new Integer(i10), obj}, null, changeQuickRedirect, true, 47798, new Class[]{HBFlutterFragmentActivity.class, String.class, Map.class, IHybridMessage.NullableResult.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
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
        hBFlutterFragmentActivity.sendFlutterMessage(str, map, nullableResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.android.FlutterFragmentActivity
    @d
    public FlutterFragment createFlutterFragment() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47794, new Class[0], FlutterFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlutterFragment) patchProxyResultProxy.result;
        }
        io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode = getBackgroundMode();
        f0.o(backgroundMode, "backgroundMode");
        RenderMode renderMode = getRenderMode();
        f0.o(renderMode, "renderMode");
        TransparencyMode transparencyMode = backgroundMode == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
        int i10 = 1;
        boolean z10 = renderMode == RenderMode.surface;
        if (getCachedEngineId() == null) {
            return new HBFlutterFragment.FlutterFragmentBuilder(null, i10, 0 == true ? 1 : 0).path(getPath()).transparencyMode(transparencyMode).renderMode(renderMode).shouldDelayFirstAndroidViewDraw(z10).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).destroyEngineWithFragment(shouldDestroyEngineWithHost()).paramJson(getParamJson()).build();
        }
        String cachedEngineId = getCachedEngineId();
        f0.m(cachedEngineId);
        FlutterFragment flutterFragmentBuild = new FlutterFragment.CachedEngineFragmentBuilder((Class<? extends FlutterFragment>) HBFlutterFragment.class, cachedEngineId).renderMode(renderMode).transparencyMode(transparencyMode).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).destroyEngineWithFragment(shouldDestroyEngineWithHost()).shouldDelayFirstAndroidViewDraw(z10).build();
        f0.o(flutterFragmentBuild, "CachedEngineFragmentBuil…tAndroidViewDraw).build()");
        return flutterFragmentBuild;
    }

    public final void executeProtocol(@d String protocol, @d IHeyboxProtocol.NullableResult<IHeyboxProtocol.ProtocolResponse> callback) {
        if (PatchProxy.proxy(new Object[]{protocol, callback}, this, changeQuickRedirect, false, 47796, new Class[]{String.class, IHeyboxProtocol.NullableResult.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(protocol, "protocol");
        f0.p(callback, "callback");
        HBFlutterFragment fragment = getFragment();
        if (fragment != null) {
            fragment.executeProtocol(protocol, callback);
        }
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    public void finish(@e IHybridRoute.HybridRouteInfo hybridRouteInfo) {
        if (PatchProxy.proxy(new Object[]{hybridRouteInfo}, this, changeQuickRedirect, false, 47803, new Class[]{IHybridRoute.HybridRouteInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        if (hybridRouteInfo != null) {
            Intent intent = new Intent();
            intent.putExtra("ActivityResult", hybridRouteInfo.getParamJson());
            setResult(-1, intent);
        }
        finish();
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    @d
    public Context getContext() {
        return this;
    }

    @e
    public final IHybridWebsocket.FlutterWebsocket getFlutterWebsocket() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47800, new Class[0], IHybridWebsocket.FlutterWebsocket.class);
        if (patchProxyResultProxy.isSupported) {
            return (IHybridWebsocket.FlutterWebsocket) patchProxyResultProxy.result;
        }
        HBFlutterFragment fragment = getFragment();
        if (fragment != null) {
            return fragment.getFlutterWebsocket();
        }
        return null;
    }

    @e
    public String getParamJson() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47805, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : getIntent().getStringExtra(FlutterActivityLaunchConfigs.EXTRA_PARAM_JSON);
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    @d
    public String getPath() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47804, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String stringExtra = getIntent().getStringExtra(FlutterActivityLaunchConfigs.EXTRA_PATH);
        return stringExtra == null ? "" : stringExtra;
    }

    public boolean handleFlutterMessage(@e IHybridMessage.HybridMessageInfo hybridMessageInfo, @d IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> nullableResult) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hybridMessageInfo, nullableResult}, this, changeQuickRedirect, false, 47806, new Class[]{IHybridMessage.HybridMessageInfo.class, IHybridMessage.NullableResult.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : HBFlutterHostDelegate.Host.DefaultImpls.handleFlutterMessage(this, hybridMessageInfo, nullableResult);
    }

    @Override // io.flutter.embedding.android.FlutterFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47802, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        HBFlutterFragment fragment = getFragment();
        if (fragment != null) {
            fragment.onActivityResult(i10, i11, getIntent());
        }
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    public void requestHostExit() {
        HBFlutterFragment fragment;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47799, new Class[0], Void.TYPE).isSupported || (fragment = getFragment()) == null) {
            return;
        }
        fragment.requestHostExit();
    }

    public final void sendFlutterMessage(@d String name, @e Map<String, String> map, @e IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> nullableResult) {
        if (PatchProxy.proxy(new Object[]{name, map, nullableResult}, this, changeQuickRedirect, false, 47797, new Class[]{String.class, Map.class, IHybridMessage.NullableResult.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(name, "name");
        HBFlutterFragment fragment = getFragment();
        if (fragment != null) {
            fragment.sendFlutterMessage(name, map, nullableResult);
        }
    }

    @Override // io.flutter.embedding.android.FlutterFragmentActivity
    public boolean shouldDestroyEngineWithHost() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47795, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Log.d("HBFlutterFragment", "shouldDestroyEngineWithHost = " + super.shouldDestroyEngineWithHost());
        return true;
    }
}
