package com.max.xiaoheihe.okflutter.containers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HBFlutterActivity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 32\u00020\u00012\u00020\u0002:\u000234B\u0007¢\u0006\u0004\b1\u00102J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fJ<\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\b2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00142\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0014J\"\u0010!\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014J\u0012\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010%\u001a\u00020\bH\u0016J\n\u0010&\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010(\u001a\u0004\u0018\u00010'J\b\u0010)\u001a\u00020\u0005H\u0016R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00065"}, d2 = {"Lcom/max/xiaoheihe/okflutter/containers/HBFlutterActivity;", "Lio/flutter/embedding/android/FlutterActivity;", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate$Host;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/b2;", "onCreate", "onResume", "", "getCachedEngineId", "Landroid/content/Context;", d.R, "Lio/flutter/embedding/engine/FlutterEngine;", "provideFlutterEngine", SwitchDetailActivity.P, "Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$NullableResult;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$ProtocolResponse;", "callback", "executeProtocol", "name", "", "params", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$NullableResult;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$HybridMessageResponse;", "sendFlutterMessage", "flutterEngine", "configureFlutterEngine", "onDestroy", "", "requestCode", b.JSON_ERRORCODE, "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridRoute$HybridRouteInfo;", "hybridRouteInfo", "finish", "getPath", "getParamJson", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridWebsocket$FlutterWebsocket;", "getFlutterWebsocket", "requestHostExit", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate;", "hbHostDelegate", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate;", "getHbHostDelegate", "()Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate;", "setHbHostDelegate", "(Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate;)V", "<init>", "()V", "Companion", "FlutterActivityIntentBuilder", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1})
public class HBFlutterActivity extends FlutterActivity implements HBFlutterHostDelegate.Host {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private HBFlutterHostDelegate hbHostDelegate;

    /* JADX INFO: compiled from: HBFlutterActivity.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0012\b\u0002\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/max/xiaoheihe/okflutter/containers/HBFlutterActivity$Companion;", "", "()V", "withEngine", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterActivity$FlutterActivityIntentBuilder;", "activityClass", "Ljava/lang/Class;", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterActivity;", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ FlutterActivityIntentBuilder withEngine$default(Companion companion, Class cls, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{companion, cls, new Integer(i10), obj}, null, changeQuickRedirect, true, 47768, new Class[]{Companion.class, Class.class, Integer.TYPE, Object.class}, FlutterActivityIntentBuilder.class);
            if (patchProxyResultProxy.isSupported) {
                return (FlutterActivityIntentBuilder) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                cls = HBFlutterActivity.class;
            }
            return companion.withEngine(cls);
        }

        @dl.d
        public final FlutterActivityIntentBuilder withEngine(@dl.d Class<? extends HBFlutterActivity> activityClass) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activityClass}, this, changeQuickRedirect, false, 47767, new Class[]{Class.class}, FlutterActivityIntentBuilder.class);
            if (patchProxyResultProxy.isSupported) {
                return (FlutterActivityIntentBuilder) patchProxyResultProxy.result;
            }
            f0.p(activityClass, "activityClass");
            return new FlutterActivityIntentBuilder(activityClass);
        }
    }

    /* JADX INFO: compiled from: HBFlutterActivity.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\tR\u001b\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/max/xiaoheihe/okflutter/containers/HBFlutterActivity$FlutterActivityIntentBuilder;", "", "activityClass", "Ljava/lang/Class;", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterActivity;", "(Ljava/lang/Class;)V", "getActivityClass", "()Ljava/lang/Class;", "backgroundMode", "", "paramJson", FlutterActivityLaunchConfigs.EXTRA_PATH, "Lio/flutter/embedding/android/FlutterActivityLaunchConfigs$BackgroundMode;", "build", "Landroid/content/Intent;", d.R, "Landroid/content/Context;", "params", "url", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FlutterActivityIntentBuilder {
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        private final Class<? extends HBFlutterActivity> activityClass;

        @dl.d
        private String backgroundMode;

        @e
        private String paramJson;

        @e
        private String path;

        /* JADX WARN: Multi-variable type inference failed */
        public FlutterActivityIntentBuilder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public FlutterActivityIntentBuilder(@dl.d Class<? extends HBFlutterActivity> activityClass) {
            f0.p(activityClass, "activityClass");
            this.activityClass = activityClass;
            this.backgroundMode = io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque.name();
        }

        public /* synthetic */ FlutterActivityIntentBuilder(Class cls, int i10, u uVar) {
            this((i10 & 1) != 0 ? HBFlutterActivity.class : cls);
        }

        @dl.d
        public final FlutterActivityIntentBuilder backgroundMode(@dl.d io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{backgroundMode}, this, changeQuickRedirect, false, 47769, new Class[]{io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.class}, FlutterActivityIntentBuilder.class);
            if (patchProxyResultProxy.isSupported) {
                return (FlutterActivityIntentBuilder) patchProxyResultProxy.result;
            }
            f0.p(backgroundMode, "backgroundMode");
            this.backgroundMode = backgroundMode.name();
            return this;
        }

        @dl.d
        public final Intent build(@e Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 47770, new Class[]{Context.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            Intent intentPutExtra = new Intent(context, this.activityClass).putExtra(FlutterActivityLaunchConfigs.EXTRA_DESTROY_ENGINE_WITH_ACTIVITY, true).putExtra(FlutterActivityLaunchConfigs.EXTRA_BACKGROUND_MODE, this.backgroundMode).putExtra(FlutterActivityLaunchConfigs.EXTRA_PATH, this.path).putExtra(FlutterActivityLaunchConfigs.EXTRA_PARAM_JSON, this.paramJson);
            f0.o(intentPutExtra, "Intent(context, activity…RA_PARAM_JSON, paramJson)");
            return intentPutExtra;
        }

        @dl.d
        public final Class<? extends HBFlutterActivity> getActivityClass() {
            return this.activityClass;
        }

        @dl.d
        public final FlutterActivityIntentBuilder paramJson(@e String params) {
            this.paramJson = params;
            return this;
        }

        @dl.d
        public final FlutterActivityIntentBuilder path(@e String url) {
            this.path = url;
            return this;
        }
    }

    public static /* synthetic */ void sendFlutterMessage$default(HBFlutterActivity hBFlutterActivity, String str, Map map, IHybridMessage.NullableResult nullableResult, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{hBFlutterActivity, str, map, nullableResult, new Integer(i10), obj}, null, changeQuickRedirect, true, 47757, new Class[]{HBFlutterActivity.class, String.class, Map.class, IHybridMessage.NullableResult.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
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
        hBFlutterActivity.sendFlutterMessage(str, map, nullableResult);
    }

    @Override // io.flutter.embedding.android.FlutterActivity, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(@dl.d FlutterEngine flutterEngine) {
        if (PatchProxy.proxy(new Object[]{flutterEngine}, this, changeQuickRedirect, false, 47758, new Class[]{FlutterEngine.class}, Void.TYPE).isSupported) {
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
        if (PatchProxy.proxy(new Object[]{protocol, callback}, this, changeQuickRedirect, false, 47755, new Class[]{String.class, IHeyboxProtocol.NullableResult.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(protocol, "protocol");
        f0.p(callback, "callback");
        HBFlutterHostDelegate hBFlutterHostDelegate = this.hbHostDelegate;
        if (hBFlutterHostDelegate != null) {
            hBFlutterHostDelegate.executeProtocol(protocol, callback);
        }
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    public void finish(@e IHybridRoute.HybridRouteInfo hybridRouteInfo) {
        if (PatchProxy.proxy(new Object[]{hybridRouteInfo}, this, changeQuickRedirect, false, 47761, new Class[]{IHybridRoute.HybridRouteInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        if (hybridRouteInfo != null) {
            Intent intent = new Intent();
            intent.putExtra("ActivityResult", hybridRouteInfo.getParamJson());
            setResult(-1, intent);
        }
        finish();
    }

    @Override // io.flutter.embedding.android.FlutterActivity, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @e
    public String getCachedEngineId() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47753, new Class[0], String.class);
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
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47764, new Class[0], IHybridWebsocket.FlutterWebsocket.class);
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

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    @e
    public String getParamJson() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47763, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : getIntent().getStringExtra(FlutterActivityLaunchConfigs.EXTRA_PARAM_JSON);
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    @dl.d
    public String getPath() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47762, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String stringExtra = getIntent().getStringExtra(FlutterActivityLaunchConfigs.EXTRA_PATH);
        return stringExtra == null ? "" : stringExtra;
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    public boolean handleFlutterMessage(@e IHybridMessage.HybridMessageInfo hybridMessageInfo, @dl.d IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> nullableResult) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hybridMessageInfo, nullableResult}, this, changeQuickRedirect, false, 47766, new Class[]{IHybridMessage.HybridMessageInfo.class, IHybridMessage.NullableResult.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : HBFlutterHostDelegate.Host.DefaultImpls.handleFlutterMessage(this, hybridMessageInfo, nullableResult);
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47760, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        HBFlutterHostDelegate hBFlutterHostDelegate = this.hbHostDelegate;
        if (hBFlutterHostDelegate != null) {
            hBFlutterHostDelegate.onActivityResult(i10, i11, getIntent());
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onCreate(@e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 47751, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        HBFlutterHostDelegate hBFlutterHostDelegate = new HBFlutterHostDelegate(this);
        this.hbHostDelegate = hBFlutterHostDelegate;
        Context context = getContext();
        f0.o(context, "context");
        hBFlutterHostDelegate.onAttach(context);
        OkFlutterLog.d("HBFlutterActivity", "onCreate");
        super.onCreate(bundle);
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47759, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HBFlutterHostDelegate hBFlutterHostDelegate = this.hbHostDelegate;
        if (hBFlutterHostDelegate != null) {
            hBFlutterHostDelegate.onDetach();
        }
        super.onDestroy();
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47752, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        HBFlutterHostDelegate hBFlutterHostDelegate = this.hbHostDelegate;
        if (hBFlutterHostDelegate != null) {
            hBFlutterHostDelegate.onResume();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivity, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineProvider
    @e
    public FlutterEngine provideFlutterEngine(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 47754, new Class[]{Context.class}, FlutterEngine.class);
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
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47765, new Class[0], Void.TYPE).isSupported || (hBFlutterHostDelegate = this.hbHostDelegate) == null) {
            return;
        }
        hBFlutterHostDelegate.requestHostExit();
    }

    public void sendFlutterMessage(@dl.d String name, @e Map<String, String> map, @e IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> nullableResult) {
        if (PatchProxy.proxy(new Object[]{name, map, nullableResult}, this, changeQuickRedirect, false, 47756, new Class[]{String.class, Map.class, IHybridMessage.NullableResult.class}, Void.TYPE).isSupported) {
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
