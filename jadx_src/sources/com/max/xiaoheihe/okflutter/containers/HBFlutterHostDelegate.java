package com.max.xiaoheihe.okflutter.containers;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.SparseArray;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.okflutter.DEBUGKt;
import com.max.xiaoheihe.okflutter.FlutterHelper;
import com.max.xiaoheihe.okflutter.OkFlutterLog;
import com.max.xiaoheihe.okflutter.OkFlutterUtils;
import com.max.xiaoheihe.okflutter.TextInputChannelHook;
import com.max.xiaoheihe.okflutter.entity.HybridResult;
import com.max.xiaoheihe.okflutter.executors.MessageHandler;
import com.max.xiaoheihe.okflutter.extensions.AnyExtensionKt;
import com.max.xiaoheihe.okflutter.pigeon.IHeyboxProtocol;
import com.max.xiaoheihe.okflutter.pigeon.IHybridMessage;
import com.max.xiaoheihe.okflutter.pigeon.IHybridNetwork;
import com.max.xiaoheihe.okflutter.pigeon.IHybridPlatform;
import com.max.xiaoheihe.okflutter.pigeon.IHybridRoute;
import com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket;
import com.max.xiaoheihe.okflutter.pigeon.r;
import com.max.xiaoheihe.okflutter.pigeonimpl.HBNotificationImpl;
import com.max.xiaoheihe.okflutter.pigeonimpl.HBProtocolImpl;
import com.max.xiaoheihe.okflutter.pigeonimpl.HybridNetworkImpl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.taobao.agoo.a.a.b;
import com.umeng.analytics.pro.d;
import dl.e;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.text.u;
import org.json.JSONObject;
import yh.q;

/* JADX INFO: compiled from: HBFlutterHostDelegate.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001eB\u000f\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\bd\u00107J\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0017\u001a\u00020\u0003J\u0006\u0010\u0018\u001a\u00020\u0003J\u0012\u0010\u001b\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001c\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\bH\u0016J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\bH\u0016J\u001e\u0010&\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\b2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#J:\u0010,\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\b2\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010(2\u0012\b\u0002\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010+\u0018\u00010*J \u00100\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016R\"\u00102\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u00108\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010?\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010F\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010M\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010S\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010Z\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001e\u0010a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010c¨\u0006f"}, d2 = {"Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridRoute$HostRouterMethod;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$HostMessageHandler;", "Lkotlin/b2;", "onResume", "Landroid/content/Context;", d.R, "onAttach", "", "engineID", "getCachedEngineId", "Lio/flutter/embedding/engine/FlutterEngine;", "provideFlutterEngine", "flutterEngine", "configureFlutterEngine", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridWebsocket$FlutterWebsocket;", "getFlutterWebsocket", "", "requestCode", b.JSON_ERRORCODE, "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "onActivityResult", "onDetach", "requestHostExit", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridRoute$HybridRouteInfo;", RemoteMessageConst.MessageBody.PARAM, "push", "pop", "url", "bringToFront", "pageId", "disablePopGesture", "enablePopGesture", SwitchDetailActivity.P, "Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$NullableResult;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$ProtocolResponse;", "callback", "executeProtocol", "name", "", "params", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$NullableResult;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$HybridMessageResponse;", "sendFlutterMessage", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$HybridMessageInfo;", "messageInfo", "result", "handleFlutterMessage", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate$Host;", "host", "Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate$Host;", "getHost", "()Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate$Host;", "setHost", "(Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate$Host;)V", "flutterEngineID", "Ljava/lang/String;", "getFlutterEngineID", "()Ljava/lang/String;", "setFlutterEngineID", "(Ljava/lang/String;)V", "Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$FlutterProtocol;", "flutterProtocalHandler", "Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$FlutterProtocol;", "getFlutterProtocalHandler", "()Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$FlutterProtocol;", "setFlutterProtocalHandler", "(Lcom/max/xiaoheihe/okflutter/pigeon/IHeyboxProtocol$FlutterProtocol;)V", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$FlutterMessageHandler;", "flutterMessageHandler", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$FlutterMessageHandler;", "getFlutterMessageHandler", "()Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$FlutterMessageHandler;", "setFlutterMessageHandler", "(Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$FlutterMessageHandler;)V", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridRoute$FlutterRouterMethod;", "flutterRouterMethod", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridRoute$FlutterRouterMethod;", "getFlutterRouterMethod", "()Lcom/max/xiaoheihe/okflutter/pigeon/IHybridRoute$FlutterRouterMethod;", "setFlutterRouterMethod", "(Lcom/max/xiaoheihe/okflutter/pigeon/IHybridRoute$FlutterRouterMethod;)V", "flutterWebSocket", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridWebsocket$FlutterWebsocket;", "getFlutterWebSocket", "()Lcom/max/xiaoheihe/okflutter/pigeon/IHybridWebsocket$FlutterWebsocket;", "setFlutterWebSocket", "(Lcom/max/xiaoheihe/okflutter/pigeon/IHybridWebsocket$FlutterWebsocket;)V", "Lcom/max/xiaoheihe/okflutter/pigeonimpl/HBNotificationImpl;", "notificationApi", "Lcom/max/xiaoheihe/okflutter/pigeonimpl/HBNotificationImpl;", "getNotificationApi", "()Lcom/max/xiaoheihe/okflutter/pigeonimpl/HBNotificationImpl;", "setNotificationApi", "(Lcom/max/xiaoheihe/okflutter/pigeonimpl/HBNotificationImpl;)V", "Landroid/util/SparseArray;", "pageNames", "Landroid/util/SparseArray;", "I", "<init>", "Host", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1})
public final class HBFlutterHostDelegate implements IHybridRoute.HostRouterMethod, IHybridMessage.HostMessageHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String flutterEngineID;

    @e
    private IHybridMessage.FlutterMessageHandler flutterMessageHandler;

    @e
    private IHeyboxProtocol.FlutterProtocol flutterProtocalHandler;

    @e
    private IHybridRoute.FlutterRouterMethod flutterRouterMethod;

    @e
    private IHybridWebsocket.FlutterWebsocket flutterWebSocket;

    @dl.d
    private Host host;

    @e
    private HBNotificationImpl notificationApi;

    @e
    private SparseArray<String> pageNames;
    private int requestCode;

    /* JADX INFO: compiled from: HBFlutterHostDelegate.kt */
    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\t\u001a\u00020\bH&J\n\u0010\n\u001a\u0004\u0018\u00010\bH&J \u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\b\u0010\u0012\u001a\u00020\u0006H&¨\u0006\u0013"}, d2 = {"Lcom/max/xiaoheihe/okflutter/containers/HBFlutterHostDelegate$Host;", "", "Landroid/content/Context;", "getContext", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridRoute$HybridRouteInfo;", "hybridRouteInfo", "Lkotlin/b2;", "finish", "", "getPath", "getParamJson", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$HybridMessageInfo;", "messageInfo", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$NullableResult;", "Lcom/max/xiaoheihe/okflutter/pigeon/IHybridMessage$HybridMessageResponse;", "result", "", "handleFlutterMessage", "requestHostExit", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1})
    public interface Host {

        /* JADX INFO: compiled from: HBFlutterHostDelegate.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class DefaultImpls {
            public static ChangeQuickRedirect changeQuickRedirect;

            public static boolean handleFlutterMessage(@dl.d Host host, @e IHybridMessage.HybridMessageInfo hybridMessageInfo, @dl.d IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> result) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{host, hybridMessageInfo, result}, null, changeQuickRedirect, true, 47829, new Class[]{Host.class, IHybridMessage.HybridMessageInfo.class, IHybridMessage.NullableResult.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                f0.p(result, "result");
                return false;
            }
        }

        void finish(@e IHybridRoute.HybridRouteInfo hybridRouteInfo);

        @dl.d
        Context getContext();

        @e
        String getParamJson();

        @dl.d
        String getPath();

        boolean handleFlutterMessage(@e IHybridMessage.HybridMessageInfo messageInfo, @dl.d IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> result);

        void requestHostExit();
    }

    public HBFlutterHostDelegate(@dl.d Host host) {
        f0.p(host, "host");
        this.host = host;
        this.requestCode = 1000;
    }

    public static /* synthetic */ void sendFlutterMessage$default(HBFlutterHostDelegate hBFlutterHostDelegate, String str, Map map, IHybridMessage.NullableResult nullableResult, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{hBFlutterHostDelegate, str, map, nullableResult, new Integer(i10), obj}, null, changeQuickRedirect, true, 47827, new Class[]{HBFlutterHostDelegate.class, String.class, Map.class, IHybridMessage.NullableResult.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            map = null;
        }
        if ((i10 & 4) != 0) {
            nullableResult = null;
        }
        hBFlutterHostDelegate.sendFlutterMessage(str, map, nullableResult);
    }

    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridRoute.HostRouterMethod
    public void bringToFront(@dl.d String url, @dl.d String engineID) {
        if (PatchProxy.proxy(new Object[]{url, engineID}, this, changeQuickRedirect, false, 47822, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(url, "url");
        f0.p(engineID, "engineID");
        FlutterHelper.INSTANCE.getInstance().bringToFront(url, engineID);
    }

    public final void configureFlutterEngine(@dl.d FlutterEngine flutterEngine) {
        if (PatchProxy.proxy(new Object[]{flutterEngine}, this, changeQuickRedirect, false, 47816, new Class[]{FlutterEngine.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(flutterEngine, "flutterEngine");
        OkFlutterLog.d(AnyExtensionKt.getTAG(this), "configureFlutterEngine");
        TextInputChannelHook.hook(flutterEngine);
        this.flutterMessageHandler = new IHybridMessage.FlutterMessageHandler(flutterEngine.getDartExecutor().getBinaryMessenger());
        this.flutterProtocalHandler = new IHeyboxProtocol.FlutterProtocol(flutterEngine.getDartExecutor().getBinaryMessenger());
        this.flutterRouterMethod = new IHybridRoute.FlutterRouterMethod(flutterEngine.getDartExecutor().getBinaryMessenger());
        this.flutterWebSocket = new IHybridWebsocket.FlutterWebsocket(flutterEngine.getDartExecutor().getBinaryMessenger());
        this.notificationApi = new HBNotificationImpl(this.host.getContext());
        IHybridPlatform.HybridNotificationApi.CC.d(flutterEngine.getDartExecutor().getBinaryMessenger(), this.notificationApi);
        IHeyboxProtocol.HeyboxProtocol.CC.c(flutterEngine.getDartExecutor().getBinaryMessenger(), new HBProtocolImpl(this.host.getContext()));
        IHybridMessage.HostMessageHandler.CC.c(flutterEngine.getDartExecutor().getBinaryMessenger(), this);
        r.g(flutterEngine.getDartExecutor().getBinaryMessenger(), this);
        IHybridNetwork.HybridNetwork.CC.c(flutterEngine.getDartExecutor().getBinaryMessenger(), new HybridNetworkImpl(this.host.getContext()));
    }

    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridRoute.HostRouterMethod
    public void disablePopGesture(@dl.d String pageId) {
        if (PatchProxy.proxy(new Object[]{pageId}, this, changeQuickRedirect, false, 47823, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(pageId, "pageId");
    }

    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridRoute.HostRouterMethod
    public void enablePopGesture(@dl.d String pageId) {
        if (PatchProxy.proxy(new Object[]{pageId}, this, changeQuickRedirect, false, 47824, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(pageId, "pageId");
    }

    public final void executeProtocol(@dl.d String protocol, @dl.d IHeyboxProtocol.NullableResult<IHeyboxProtocol.ProtocolResponse> callback) {
        if (PatchProxy.proxy(new Object[]{protocol, callback}, this, changeQuickRedirect, false, 47825, new Class[]{String.class, IHeyboxProtocol.NullableResult.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(protocol, "protocol");
        f0.p(callback, "callback");
        IHeyboxProtocol.FlutterProtocol flutterProtocol = this.flutterProtocalHandler;
        if (flutterProtocol != null) {
            flutterProtocol.execute(protocol, callback);
        }
    }

    @e
    public final String getCachedEngineId(@e String engineID) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{engineID}, this, changeQuickRedirect, false, 47814, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        OkFlutterLog.d(AnyExtensionKt.getTAG(this), "getCachedEngineId, engineID = " + engineID);
        String str = this.flutterEngineID;
        if (str != null && u.M1(str, engineID, false, 2, null)) {
            return this.flutterEngineID;
        }
        FlutterHelper.Companion companion = FlutterHelper.INSTANCE;
        if (f0.g(companion.getInstance().getWaitEngineID(), engineID) && engineID != null) {
            companion.getInstance().setWaitEngineID(null);
        }
        this.flutterEngineID = engineID;
        return engineID;
    }

    @e
    public final String getFlutterEngineID() {
        return this.flutterEngineID;
    }

    @e
    public final IHybridMessage.FlutterMessageHandler getFlutterMessageHandler() {
        return this.flutterMessageHandler;
    }

    @e
    public final IHeyboxProtocol.FlutterProtocol getFlutterProtocalHandler() {
        return this.flutterProtocalHandler;
    }

    @e
    public final IHybridRoute.FlutterRouterMethod getFlutterRouterMethod() {
        return this.flutterRouterMethod;
    }

    @e
    public final IHybridWebsocket.FlutterWebsocket getFlutterWebSocket() {
        return this.flutterWebSocket;
    }

    @e
    public final IHybridWebsocket.FlutterWebsocket getFlutterWebsocket() {
        return this.flutterWebSocket;
    }

    @dl.d
    public final Host getHost() {
        return this.host;
    }

    @e
    public final HBNotificationImpl getNotificationApi() {
        return this.notificationApi;
    }

    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridMessage.HostMessageHandler
    public void handleFlutterMessage(@e IHybridMessage.HybridMessageInfo hybridMessageInfo, @dl.d IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> result) {
        MessageHandler messageHandler;
        if (PatchProxy.proxy(new Object[]{hybridMessageInfo, result}, this, changeQuickRedirect, false, 47828, new Class[]{IHybridMessage.HybridMessageInfo.class, IHybridMessage.NullableResult.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(result, "result");
        if (this.host.handleFlutterMessage(hybridMessageInfo, result) || (messageHandler = FlutterHelper.INSTANCE.getInstance().getMessageHandler()) == null) {
            return;
        }
        messageHandler.handle(this.host.getContext(), hybridMessageInfo, result);
    }

    public final void onActivityResult(int i10, int i11, @e Intent intent) {
        JSONObject jSONObjectConvertBundleToJson;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47817, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        SparseArray<String> sparseArray = this.pageNames;
        final String str = sparseArray != null ? sparseArray.get(i10) : null;
        SparseArray<String> sparseArray2 = this.pageNames;
        if (sparseArray2 != null) {
            sparseArray2.remove(i10);
        }
        if (str != null) {
            IHybridRoute.HybridRouteInfo hybridRouteInfo = new IHybridRoute.HybridRouteInfo();
            hybridRouteInfo.setUrl(str);
            if (intent != null && (jSONObjectConvertBundleToJson = OkFlutterUtils.convertBundleToJson(intent.getExtras())) != null) {
                hybridRouteInfo.setParamJson(jSONObjectConvertBundleToJson.toString());
            }
            IHybridRoute.FlutterRouterMethod flutterRouterMethod = this.flutterRouterMethod;
            if (flutterRouterMethod != null) {
                flutterRouterMethod.onNativeResult(hybridRouteInfo, new IHybridRoute.VoidResult() { // from class: com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate$onActivityResult$1$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridRoute.VoidResult
                    public void error(@dl.d Throwable error) {
                        if (PatchProxy.proxy(new Object[]{error}, this, changeQuickRedirect, false, 47831, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(error, "error");
                    }

                    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridRoute.VoidResult
                    public void success() {
                        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47830, new Class[0], Void.TYPE).isSupported && DEBUGKt.getDEBUG()) {
                            Log.v(AnyExtensionKt.getTAG(this), "#onNativeResult, pageName=" + str);
                        }
                    }
                });
            }
        }
    }

    public final void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 47813, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        this.pageNames = new SparseArray<>();
    }

    public final void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47818, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        OkFlutterLog.d(AnyExtensionKt.getTAG(this), "onDetach");
        if (this.flutterEngineID != null) {
            FlutterHelper.Companion companion = FlutterHelper.INSTANCE;
            if (companion.getInstance().getNodeMap().get(this.flutterEngineID) != null) {
                FlutterHelper companion2 = companion.getInstance();
                String str = this.flutterEngineID;
                f0.m(str);
                companion2.sendResult(str, new HybridResult(this.flutterEngineID, 0, 0, null, 14, null));
            }
            this.flutterEngineID = null;
        }
        this.flutterMessageHandler = null;
        this.flutterRouterMethod = null;
        this.flutterProtocalHandler = null;
    }

    public final void onResume() {
        HBNotificationImpl hBNotificationImpl;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47812, new Class[0], Void.TYPE).isSupported || (hBNotificationImpl = this.notificationApi) == null) {
            return;
        }
        hBNotificationImpl.onNotificationSetting();
    }

    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridRoute.HostRouterMethod
    public void pop(@e IHybridRoute.HybridRouteInfo hybridRouteInfo) {
        if (PatchProxy.proxy(new Object[]{hybridRouteInfo}, this, changeQuickRedirect, false, 47821, new Class[]{IHybridRoute.HybridRouteInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        this.host.finish(hybridRouteInfo);
    }

    @dl.d
    public final FlutterEngine provideFlutterEngine(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 47815, new Class[]{Context.class}, FlutterEngine.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlutterEngine) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        boolean z10 = (context.getResources().getConfiguration().uiMode & 48) == 32;
        OkFlutterLog.d(AnyExtensionKt.getTAG(this), "provideFlutterEngine, isNightModeOn = " + z10);
        return FlutterHelper.INSTANCE.getInstance().createEngineFromGroup(context, this.host.getPath(), this.host.getParamJson(), z10);
    }

    @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridRoute.HostRouterMethod
    public void push(@e IHybridRoute.HybridRouteInfo hybridRouteInfo) {
        if (PatchProxy.proxy(new Object[]{hybridRouteInfo}, this, changeQuickRedirect, false, 47820, new Class[]{IHybridRoute.HybridRouteInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((hybridRouteInfo != null ? hybridRouteInfo.getUrl() : null) != null) {
            int i10 = this.requestCode + 1;
            this.requestCode = i10;
            SparseArray<String> sparseArray = this.pageNames;
            if (sparseArray != null) {
                sparseArray.put(i10, hybridRouteInfo.getUrl());
            }
            q<String, String, Integer, b2> routeAction = FlutterHelper.INSTANCE.getInstance().getRouteAction();
            String url = hybridRouteInfo.getUrl();
            f0.m(url);
            routeAction.invoke(url, hybridRouteInfo.getParamJson(), Integer.valueOf(this.requestCode));
        }
    }

    public final void requestHostExit() {
        IHybridRoute.FlutterRouterMethod flutterRouterMethod;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47819, new Class[0], Void.TYPE).isSupported || (flutterRouterMethod = this.flutterRouterMethod) == null) {
            return;
        }
        flutterRouterMethod.requestHostExit(new IHybridRoute.VoidResult() { // from class: com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.requestHostExit.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridRoute.VoidResult
            public void error(@dl.d Throwable error) {
                if (PatchProxy.proxy(new Object[]{error}, this, changeQuickRedirect, false, 47833, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(error, "error");
            }

            @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridRoute.VoidResult
            public void success() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47832, new Class[0], Void.TYPE).isSupported && DEBUGKt.getDEBUG()) {
                    Log.v(AnyExtensionKt.getTAG(this), "#requestHostExit");
                }
            }
        });
    }

    public final void sendFlutterMessage(@dl.d String name, @e Map<String, String> map, @e final IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> nullableResult) {
        if (PatchProxy.proxy(new Object[]{name, map, nullableResult}, this, changeQuickRedirect, false, 47826, new Class[]{String.class, Map.class, IHybridMessage.NullableResult.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(name, "name");
        if (this.flutterMessageHandler == null) {
            return;
        }
        IHybridMessage.HybridMessageInfo hybridMessageInfo = new IHybridMessage.HybridMessageInfo();
        hybridMessageInfo.setName(name);
        hybridMessageInfo.setParams(map);
        IHybridMessage.FlutterMessageHandler flutterMessageHandler = this.flutterMessageHandler;
        if (flutterMessageHandler != null) {
            flutterMessageHandler.handleHostMessage(hybridMessageInfo, new IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse>() { // from class: com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.sendFlutterMessage.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridMessage.NullableResult
                public void error(@dl.d Throwable error) {
                    if (PatchProxy.proxy(new Object[]{error}, this, changeQuickRedirect, false, 47835, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(error, "error");
                }

                /* JADX INFO: renamed from: success, reason: avoid collision after fix types in other method */
                public void success2(@e IHybridMessage.HybridMessageResponse hybridMessageResponse) {
                    IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> nullableResult2;
                    if (PatchProxy.proxy(new Object[]{hybridMessageResponse}, this, changeQuickRedirect, false, 47834, new Class[]{IHybridMessage.HybridMessageResponse.class}, Void.TYPE).isSupported || (nullableResult2 = nullableResult) == null) {
                        return;
                    }
                    nullableResult2.success(hybridMessageResponse);
                }

                @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridMessage.NullableResult
                public /* bridge */ /* synthetic */ void success(IHybridMessage.HybridMessageResponse hybridMessageResponse) {
                    if (PatchProxy.proxy(new Object[]{hybridMessageResponse}, this, changeQuickRedirect, false, 47836, new Class[]{Object.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    success2(hybridMessageResponse);
                }
            });
        }
    }

    public final void setFlutterEngineID(@e String str) {
        this.flutterEngineID = str;
    }

    public final void setFlutterMessageHandler(@e IHybridMessage.FlutterMessageHandler flutterMessageHandler) {
        this.flutterMessageHandler = flutterMessageHandler;
    }

    public final void setFlutterProtocalHandler(@e IHeyboxProtocol.FlutterProtocol flutterProtocol) {
        this.flutterProtocalHandler = flutterProtocol;
    }

    public final void setFlutterRouterMethod(@e IHybridRoute.FlutterRouterMethod flutterRouterMethod) {
        this.flutterRouterMethod = flutterRouterMethod;
    }

    public final void setFlutterWebSocket(@e IHybridWebsocket.FlutterWebsocket flutterWebsocket) {
        this.flutterWebSocket = flutterWebsocket;
    }

    public final void setHost(@dl.d Host host) {
        if (PatchProxy.proxy(new Object[]{host}, this, changeQuickRedirect, false, 47811, new Class[]{Host.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(host, "<set-?>");
        this.host = host;
    }

    public final void setNotificationApi(@e HBNotificationImpl hBNotificationImpl) {
        this.notificationApi = hBNotificationImpl;
    }
}
