package com.max.xiaoheihe.module.heybox_voice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.l;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.z;
import com.max.hbminiprogram.k;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.bean.BizMessageObj;
import com.max.xiaoheihe.flutter.ExtendedHBFlutterFragment;
import com.max.xiaoheihe.flutter.pigeon.HBHybridShare;
import com.max.xiaoheihe.module.heybox_voice.bean.WebsocketResult;
import com.max.xiaoheihe.module.voice.component.ToolKitService;
import com.max.xiaoheihe.okflutter.containers.HBFlutterFragment;
import com.max.xiaoheihe.okflutter.pigeon.IHeyboxProtocol;
import com.max.xiaoheihe.okflutter.pigeon.IHybridMessage;
import com.max.xiaoheihe.okflutter.pigeon.IHybridRoute;
import com.max.xiaoheihe.okflutter.pigeon.IHybridShare;
import com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket;
import com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler;
import com.max.xiaoheihe.utils.WebSocketChannel;
import com.max.xiaoheihe.utils.m;
import com.max.xiaoheihe.utils.m0;
import com.max.xiaoheihe.utils.n0;
import com.max.xiaoheihe.utils.w;
import com.max.xiaoheihe.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.ss.bytertc.engine.flutter.base.RTCVideoManager;
import com.tencent.trtc.TRTCCloud;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.EventChannel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HeyboxVoiceFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class HeyboxVoiceFragment extends ExtendedHBFlutterFragment implements k, m0.g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f88592f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f88593g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private Boolean f88594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f88595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private e f88596d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private Map<Integer, IHybridWebsocket.Result<IHybridWebsocket.HybridWebsocketResponse>> f88597e = new LinkedHashMap();

    /* JADX INFO: compiled from: HeyboxVoiceFragment.kt */
    public final class HeyboxHybridWebsocketHandler implements IHybridWebsocket.HybridWebsocket {
        public static ChangeQuickRedirect changeQuickRedirect;

        public HeyboxHybridWebsocketHandler() {
        }

        public void a(@dl.d String message, boolean z10, @dl.d IHybridWebsocket.NullableResult<IHybridWebsocket.HybridWebsocketResponse> result) {
            if (PatchProxy.proxy(new Object[]{message, new Byte(z10 ? (byte) 1 : (byte) 0), result}, this, changeQuickRedirect, false, 38482, new Class[]{String.class, Boolean.TYPE, IHybridWebsocket.NullableResult.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(message, "message");
            f0.p(result, "result");
            com.max.heybox.hblog.g.f74531b.M("HeyboxHybridWebsocketHandler, configureFlutterEngine, push, message = " + message + ", WsManager.getInstance().status = " + m0.x().y());
            kotlinx.coroutines.k.f(z.a(HeyboxVoiceFragment.this), null, null, new HeyboxVoiceFragment$HeyboxHybridWebsocketHandler$push$1(HeyboxVoiceFragment.this, result, z10, message, null), 3, null);
        }

        public void b(long j10, @dl.d String message, boolean z10, @dl.d IHybridWebsocket.Result<IHybridWebsocket.HybridWebsocketResponse> result) {
            if (PatchProxy.proxy(new Object[]{new Long(j10), message, new Byte(z10 ? (byte) 1 : (byte) 0), result}, this, changeQuickRedirect, false, 38483, new Class[]{Long.TYPE, String.class, Boolean.TYPE, IHybridWebsocket.Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(message, "message");
            f0.p(result, "result");
            com.max.heybox.hblog.g.f74531b.M("HeyboxVoiceFragment, configureFlutterEngine, pushForResult, id = " + j10 + ", message = " + message + ", WsManager.getInstance().status = " + m0.x().y());
            int i10 = (int) j10;
            if (HeyboxVoiceFragment.this.f88597e.containsKey(Integer.valueOf(i10))) {
                HeyboxVoiceFragment.this.f88597e.remove(Integer.valueOf(i10));
            }
            HeyboxVoiceFragment.this.f88597e.put(Integer.valueOf(i10), result);
            kotlinx.coroutines.k.f(z.a(HeyboxVoiceFragment.this), null, null, new HeyboxVoiceFragment$HeyboxHybridWebsocketHandler$pushForResult$1(HeyboxVoiceFragment.this, result, z10, message, j10, null), 3, null);
        }

        @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket.HybridWebsocket
        @dl.d
        public IHybridWebsocket.HybridWebsocketResponse checkStatus() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38484, new Class[0], IHybridWebsocket.HybridWebsocketResponse.class);
            if (patchProxyResultProxy.isSupported) {
                return (IHybridWebsocket.HybridWebsocketResponse) patchProxyResultProxy.result;
            }
            IHybridWebsocket.HybridWebsocketResponse hybridWebsocketResponseBuild = new IHybridWebsocket.HybridWebsocketResponse.Builder().setStatus(IHybridWebsocket.HybridWebsocketStatus.OK).build();
            f0.o(hybridWebsocketResponseBuild, "Builder()\n              …bsocketStatus.OK).build()");
            return hybridWebsocketResponseBuild;
        }

        @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket.HybridWebsocket
        public /* bridge */ /* synthetic */ void push(String str, Boolean bool, IHybridWebsocket.NullableResult nullableResult) {
            if (PatchProxy.proxy(new Object[]{str, bool, nullableResult}, this, changeQuickRedirect, false, 38485, new Class[]{String.class, Boolean.class, IHybridWebsocket.NullableResult.class}, Void.TYPE).isSupported) {
                return;
            }
            a(str, bool.booleanValue(), nullableResult);
        }

        @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket.HybridWebsocket
        public /* bridge */ /* synthetic */ void pushForResult(Long l10, String str, Boolean bool, IHybridWebsocket.Result result) {
            if (PatchProxy.proxy(new Object[]{l10, str, bool, result}, this, changeQuickRedirect, false, 38486, new Class[]{Long.class, String.class, Boolean.class, IHybridWebsocket.Result.class}, Void.TYPE).isSupported) {
                return;
            }
            b(l10.longValue(), str, bool.booleanValue(), result);
        }
    }

    /* JADX INFO: compiled from: HeyboxVoiceFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final HeyboxVoiceFragment a(@dl.e Bundle bundle) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 38481, new Class[]{Bundle.class}, HeyboxVoiceFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (HeyboxVoiceFragment) patchProxyResultProxy.result;
            }
            HeyboxVoiceFragment heyboxVoiceFragment = new HeyboxVoiceFragment();
            if (bundle == null) {
                bundle = new Bundle();
            }
            heyboxVoiceFragment.setArguments(bundle);
            return heyboxVoiceFragment;
        }
    }

    /* JADX INFO: compiled from: HeyboxVoiceFragment.kt */
    public static final class b implements IHeyboxProtocol.NullableResult<IHeyboxProtocol.ProtocolResponse> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88611b;

        b(String str) {
            this.f88611b = str;
        }

        public void a(@dl.e IHeyboxProtocol.ProtocolResponse protocolResponse) {
            Long resultCode;
            if (PatchProxy.proxy(new Object[]{protocolResponse}, this, changeQuickRedirect, false, 38495, new Class[]{IHeyboxProtocol.ProtocolResponse.class}, Void.TYPE).isSupported) {
                return;
            }
            if (protocolResponse == null || (resultCode = protocolResponse.getResultCode()) == null || resultCode.longValue() != 1) {
                Context context = HeyboxVoiceFragment.this.getContext();
                f0.o(context, "context");
                com.max.xiaoheihe.base.router.b.k0(context, this.f88611b);
            }
        }

        @Override // com.max.xiaoheihe.okflutter.pigeon.IHeyboxProtocol.NullableResult
        public void error(@dl.d Throwable error) {
            if (PatchProxy.proxy(new Object[]{error}, this, changeQuickRedirect, false, 38496, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(error, "error");
            Context context = HeyboxVoiceFragment.this.getContext();
            f0.o(context, "context");
            com.max.xiaoheihe.base.router.b.k0(context, this.f88611b);
        }

        @Override // com.max.xiaoheihe.okflutter.pigeon.IHeyboxProtocol.NullableResult
        public /* bridge */ /* synthetic */ void success(IHeyboxProtocol.ProtocolResponse protocolResponse) {
            if (PatchProxy.proxy(new Object[]{protocolResponse}, this, changeQuickRedirect, false, 38497, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(protocolResponse);
        }
    }

    /* JADX INFO: compiled from: HeyboxVoiceFragment.kt */
    public static final class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38498, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ToolKitService.a(HeyboxVoiceFragment.this.getContext());
        }
    }

    /* JADX INFO: compiled from: HeyboxVoiceFragment.kt */
    public static final class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38499, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ToolKitService.b(HeyboxVoiceFragment.this.getContext());
        }
    }

    /* JADX INFO: compiled from: HeyboxVoiceFragment.kt */
    public static final class e extends androidx.activity.o {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(true);
        }

        @Override // androidx.activity.o
        public void handleOnBackPressed() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38500, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.f74531b.q("HeyboxVoiceFragment, handleOnBackPressed");
            HeyboxVoiceFragment.this.onBackPressed();
        }
    }

    /* JADX INFO: compiled from: HeyboxVoiceFragment.kt */
    public static final class f implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HeyboxVoiceFragment f88616c;

        f(String str, HeyboxVoiceFragment heyboxVoiceFragment) {
            this.f88615b = str;
            this.f88616c = heyboxVoiceFragment;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38501, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            HashMap map = new HashMap();
            map.put("msg", this.f88615b);
            HBFlutterFragment.sendFlutterMessage$default(this.f88616c, "web_socket", map, null, 4, null);
        }
    }

    /* JADX INFO: compiled from: HeyboxVoiceFragment.kt */
    public static final class g implements IHybridWebsocket.VoidResult {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket.VoidResult
        public void error(@dl.d Throwable error) {
            if (PatchProxy.proxy(new Object[]{error}, this, changeQuickRedirect, false, 38508, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(error, "error");
        }

        @Override // com.max.xiaoheihe.okflutter.pigeon.IHybridWebsocket.VoidResult
        public void success() {
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.heybox_voice.HeyboxVoiceFragment$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: compiled from: HeyboxVoiceFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.heybox_voice.HeyboxVoiceFragment$onViewCreated$1", f = "HeyboxVoiceFragment.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f88617b;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.heybox_voice.HeyboxVoiceFragment$onViewCreated$1$a */
        /* JADX INFO: compiled from: HeyboxVoiceFragment.kt */
        public static final class a implements kotlinx.coroutines.flow.f<x> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HeyboxVoiceFragment f88619b;

            a(HeyboxVoiceFragment heyboxVoiceFragment) {
                this.f88619b = heyboxVoiceFragment;
            }

            @dl.e
            public final Object a(@dl.d x xVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{xVar, cVar}, this, changeQuickRedirect, false, 38506, new Class[]{x.class, kotlin.coroutines.c.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                if (xVar.f()) {
                    HeyboxVoiceFragment.N3(this.f88619b);
                    return b2.f124493a;
                }
                com.max.heybox.hblog.g.f74531b.q("HeyboxVoiceFragment, json = " + xVar.e());
                WebsocketResult websocketResult = (WebsocketResult) com.max.hbutils.utils.k.a(xVar.e(), WebsocketResult.class);
                if (websocketResult == null) {
                    return b2.f124493a;
                }
                Integer id2 = websocketResult.getId();
                if (id2 != null) {
                    HeyboxVoiceFragment heyboxVoiceFragment = this.f88619b;
                    int iIntValue = id2.intValue();
                    if (heyboxVoiceFragment.f88597e.containsKey(kotlin.coroutines.jvm.internal.a.f(iIntValue))) {
                        try {
                            IHybridWebsocket.Result result = (IHybridWebsocket.Result) heyboxVoiceFragment.f88597e.remove(kotlin.coroutines.jvm.internal.a.f(iIntValue));
                            if (result != null) {
                                result.success(new IHybridWebsocket.HybridWebsocketResponse.Builder().setStatus(IHybridWebsocket.HybridWebsocketStatus.OK).setId(kotlin.coroutines.jvm.internal.a.g(iIntValue)).setResult(xVar.e()).build());
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                return b2.f124493a;
            }

            @Override // kotlinx.coroutines.flow.f
            public /* bridge */ /* synthetic */ Object emit(x xVar, kotlin.coroutines.c cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{xVar, cVar}, this, changeQuickRedirect, false, 38507, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(xVar, cVar);
            }
        }

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 38503, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : HeyboxVoiceFragment.this.new AnonymousClass1(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38505, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38504, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38502, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f88617b;
            if (i10 == 0) {
                t0.n(obj);
                m mVar = HeyboxVoiceFragment.this.f88595c;
                if (mVar == null) {
                    f0.S("websocketChannel");
                    mVar = null;
                }
                kotlinx.coroutines.flow.e<x> eVarA = mVar.a();
                a aVar = new a(HeyboxVoiceFragment.this);
                this.f88617b = 1;
                if (eVarA.a(aVar, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    public static final /* synthetic */ void N3(HeyboxVoiceFragment heyboxVoiceFragment) {
        if (PatchProxy.proxy(new Object[]{heyboxVoiceFragment}, null, changeQuickRedirect, true, 38480, new Class[]{HeyboxVoiceFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxVoiceFragment.Q3();
    }

    private final void O3(String str) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38466, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (str != null && str.length() != 0) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        executeProtocol(str, new b(str));
    }

    @dl.d
    @xh.m
    public static final HeyboxVoiceFragment P3(@dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, null, changeQuickRedirect, true, 38479, new Class[]{Bundle.class}, HeyboxVoiceFragment.class);
        return patchProxyResultProxy.isSupported ? (HeyboxVoiceFragment) patchProxyResultProxy.result : f88592f.a(bundle);
    }

    private final void Q3() {
        IHybridWebsocket.FlutterWebsocket flutterWebsocket;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38472, new Class[0], Void.TYPE).isSupported || (flutterWebsocket = getFlutterWebsocket()) == null) {
            return;
        }
        flutterWebsocket.onClose(new g());
    }

    @Override // com.max.xiaoheihe.utils.m0.g
    public /* synthetic */ void F2() {
        n0.a(this);
    }

    @Override // com.max.hbminiprogram.k
    public boolean I0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38477, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        requestHostExit();
        return true;
    }

    @Override // com.max.xiaoheihe.flutter.ExtendedHBFlutterFragment, com.max.xiaoheihe.okflutter.containers.HBFlutterFragment, io.flutter.embedding.android.FlutterFragment, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(@dl.d FlutterEngine flutterEngine) {
        if (PatchProxy.proxy(new Object[]{flutterEngine}, this, changeQuickRedirect, false, 38474, new Class[]{FlutterEngine.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(flutterEngine, "flutterEngine");
        IHybridWebsocket.HybridWebsocket.CC.e(flutterEngine.getDartExecutor().getBinaryMessenger(), new HeyboxHybridWebsocketHandler());
        DartExecutor dartExecutor = flutterEngine.getDartExecutor();
        Context context = getContext();
        f0.o(context, "context");
        IHybridShare.HybridShareApi.CC.e(dartExecutor, new HBHybridShare(context));
        EventChannel eventChannel = new EventChannel(flutterEngine.getDartExecutor(), "heybox/web_socket/receive");
        m mVar = this.f88595c;
        if (mVar == null) {
            f0.S("websocketChannel");
            mVar = null;
        }
        eventChannel.setStreamHandler(new WebsocketStreamHandler(mVar, z.a(this)));
        super.configureFlutterEngine(flutterEngine);
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterFragment, com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    public void finish(@dl.e IHybridRoute.HybridRouteInfo hybridRouteInfo) {
        if (PatchProxy.proxy(new Object[]{hybridRouteInfo}, this, changeQuickRedirect, false, 38475, new Class[]{IHybridRoute.HybridRouteInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f88596d.setEnabled(false);
        if (getContext() instanceof com.max.hbminiprogram.f) {
            Object context = getContext();
            f0.n(context, "null cannot be cast to non-null type com.max.hbminiprogram.MiniProgramContainer");
            ((com.max.hbminiprogram.f) context).e0();
        } else if (getContext() instanceof com.max.hbminiprogram.b) {
            Object context2 = getContext();
            f0.n(context2, "null cannot be cast to non-null type com.max.hbminiprogram.FlutterNativeContainer");
            ((com.max.hbminiprogram.b) context2).onBackPressed();
        }
        this.f88596d.setEnabled(true);
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterFragment, com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    @dl.d
    public String getPath() {
        return "/flutter/heybox_voice";
    }

    @Override // io.flutter.embedding.android.FlutterFragment, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    @dl.d
    public RenderMode getRenderMode() {
        return RenderMode.texture;
    }

    @l
    public final int getSplashBackColor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38473, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : com.max.xiaoheihe.utils.d.e1("#111111");
    }

    @Override // com.max.xiaoheihe.flutter.ExtendedHBFlutterFragment, com.max.xiaoheihe.okflutter.containers.HBFlutterFragment, com.max.xiaoheihe.okflutter.containers.HBFlutterHostDelegate.Host
    public boolean handleFlutterMessage(@dl.e IHybridMessage.HybridMessageInfo hybridMessageInfo, @dl.d IHybridMessage.NullableResult<IHybridMessage.HybridMessageResponse> result) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hybridMessageInfo, result}, this, changeQuickRedirect, false, 38476, new Class[]{IHybridMessage.HybridMessageInfo.class, IHybridMessage.NullableResult.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(result, "result");
        if (!f0.g(hybridMessageInfo != null ? hybridMessageInfo.getName() : null, "encrypt")) {
            if (f0.g(hybridMessageInfo != null ? hybridMessageInfo.getName() : null, "startMicService")) {
                requireActivity().runOnUiThread(new c());
                return true;
            }
            if (!f0.g(hybridMessageInfo != null ? hybridMessageInfo.getName() : null, "stopMicService")) {
                return super.handleFlutterMessage(hybridMessageInfo, result);
            }
            requireActivity().runOnUiThread(new d());
            return true;
        }
        Map<String, String> params = hybridMessageInfo.getParams();
        String str = params != null ? params.get("message") : null;
        if (str != null) {
            String strA = w.a(str);
            com.max.heybox.hblog.g.f74531b.M("HeyboxVoiceFragment, handleFlutterMessage, message = " + str + ", encrypt = " + strA);
            if (strA != null) {
                result.success(new IHybridMessage.HybridMessageResponse.Builder().setResult(strA).build());
            } else {
                result.error(new Throwable());
            }
        }
        return true;
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterFragment, io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 38465, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        this.f88595c = new WebSocketChannel(this, z.a(this));
        super.onAttach(context);
        Bundle arguments = getArguments();
        O3(arguments != null ? arguments.getString("deeplink") : null);
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 38467, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        this.f88594b = Boolean.valueOf(m0.x().E());
        m0.x().K(true);
        m0.x().q(this);
        requireActivity().getWindow().setNavigationBarColor(0);
        requireActivity().getOnBackPressedDispatcher().c(this, this.f88596d);
    }

    @Override // com.max.xiaoheihe.flutter.ExtendedHBFlutterFragment, io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 38468, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, viewGroup, bundle);
        if (!(viewOnCreateView instanceof FlutterView)) {
            return viewOnCreateView;
        }
        FrameLayout frameLayout = new FrameLayout(((FlutterView) viewOnCreateView).getContext());
        frameLayout.setBackgroundColor(getSplashBackColor());
        frameLayout.addView(viewOnCreateView);
        return frameLayout;
    }

    @Override // com.max.xiaoheihe.okflutter.containers.HBFlutterFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38478, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        this.f88597e.clear();
        TRTCCloud.destroySharedInstance();
        RTCVideoManager.destroy();
        m0 m0VarX = m0.x();
        Boolean bool = this.f88594b;
        m0VarX.K(bool != null ? bool.booleanValue() : false);
        m0.x().I(this);
    }

    @Override // io.flutter.embedding.android.FlutterFragment
    public void onNewIntent(@dl.d Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 38470, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(intent, "intent");
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra(HeyboxWebProtocolHandler.f95008f);
        Bundle extras = intent.getExtras();
        String string = extras != null ? extras.getString("deeplink") : null;
        O3(stringExtra);
        O3(string);
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 38469, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        t.M(getActivity(), false);
        kotlinx.coroutines.k.f(z.a(this), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // com.max.xiaoheihe.utils.m0.g
    public void s2(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 38471, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            if (!f0.g(BizMessageObj.TYPE_HEYCHAT_IM_MESSAGE, str2) || str == null) {
                return;
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.runOnUiThread(new f(str, this));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.flutter.embedding.android.FlutterFragment, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    @Override // io.flutter.embedding.android.FlutterFragment, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldDestroyEngineWithHost() {
        return true;
    }
}
