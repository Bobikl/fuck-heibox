package com.max.xiaoheihe.module.heybox_voice;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.k;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.bean.BizMessageObj;
import com.max.xiaoheihe.utils.m;
import com.max.xiaoheihe.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import io.flutter.plugin.common.EventChannel;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: WebsocketStreamHandler.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class WebsocketStreamHandler implements EventChannel.StreamHandler {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f88620f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final m f88621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final q0 f88622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private EventChannel.EventSink f88623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private d2 f88624e;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.heybox_voice.WebsocketStreamHandler$onListen$1, reason: invalid class name */
    /* JADX INFO: compiled from: WebsocketStreamHandler.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.heybox_voice.WebsocketStreamHandler$onListen$1", f = "WebsocketStreamHandler.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f88625b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<?> f88627d;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.heybox_voice.WebsocketStreamHandler$onListen$1$a */
        /* JADX INFO: compiled from: WebsocketStreamHandler.kt */
        public static final class a implements f<x> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<?> f88628b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ WebsocketStreamHandler f88629c;

            a(List<?> list, WebsocketStreamHandler websocketStreamHandler) {
                this.f88628b = list;
                this.f88629c = websocketStreamHandler;
            }

            @e
            public final Object a(@d x xVar, @d c<? super b2> cVar) {
                EventChannel.EventSink eventSink;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{xVar, cVar}, this, changeQuickRedirect, false, 38515, new Class[]{x.class, c.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                g.f74531b.q("WebsocketStreamHandler, getIncoming, types = " + this.f88628b + ", json = " + xVar);
                if (xVar.f()) {
                    EventChannel.EventSink eventSink2 = this.f88629c.f88623d;
                    if (eventSink2 != null) {
                        eventSink2.error("1", "连接断开", "websocket断开");
                    }
                    return b2.f124493a;
                }
                BizMessageObj bizMessageObj = (BizMessageObj) k.a(xVar.e(), BizMessageObj.class);
                if (bizMessageObj != null && this.f88628b.contains(bizMessageObj.getType()) && (eventSink = this.f88629c.f88623d) != null) {
                    eventSink.success(xVar.e());
                }
                return b2.f124493a;
            }

            @Override // kotlinx.coroutines.flow.f
            public /* bridge */ /* synthetic */ Object emit(x xVar, c cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{xVar, cVar}, this, changeQuickRedirect, false, 38516, new Class[]{Object.class, c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(xVar, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<?> list, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f88627d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final c<b2> create(@e Object obj, @d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 38512, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : WebsocketStreamHandler.this.new AnonymousClass1(this.f88627d, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38514, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@d q0 q0Var, @e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38513, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38511, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.f88625b;
            if (i10 == 0) {
                t0.n(obj);
                kotlinx.coroutines.flow.e<x> eVarA = WebsocketStreamHandler.this.f88621b.a();
                a aVar = new a(this.f88627d, WebsocketStreamHandler.this);
                this.f88625b = 1;
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

    public WebsocketStreamHandler(@d m websoketChannel, @d q0 scope) {
        f0.p(websoketChannel, "websoketChannel");
        f0.p(scope, "scope");
        this.f88621b = websoketChannel;
        this.f88622c = scope;
    }

    @d
    public final q0 c() {
        return this.f88622c;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(@e Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38510, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        g.f74531b.q("WebsocketStreamHandler, onCancel");
        EventChannel.EventSink eventSink = this.f88623d;
        if (eventSink != null) {
            eventSink.endOfStream();
        }
        d2 d2Var = this.f88624e;
        if (d2Var != null) {
            d2.a.b(d2Var, null, 1, null);
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(@e Object obj, @e EventChannel.EventSink eventSink) {
        if (PatchProxy.proxy(new Object[]{obj, eventSink}, this, changeQuickRedirect, false, 38509, new Class[]{Object.class, EventChannel.EventSink.class}, Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WebsocketStreamHandler, onListen, arguments = ");
        sb2.append(obj);
        sb2.append(' ');
        sb2.append(obj != null ? obj.getClass() : null);
        aVar.q(sb2.toString());
        List list = obj instanceof List ? (List) obj : null;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (eventSink != null) {
            EventChannel.EventSink eventSink2 = this.f88623d;
            if (eventSink2 != null) {
                eventSink2.error("1", "test", "test");
            }
            this.f88623d = eventSink;
        }
        this.f88624e = kotlinx.coroutines.k.f(this.f88622c, null, null, new AnonymousClass1(list, null), 3, null);
    }
}
