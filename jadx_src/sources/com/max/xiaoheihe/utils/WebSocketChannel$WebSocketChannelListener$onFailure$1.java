package com.max.xiaoheihe.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: websocket.kt */
/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.utils.WebSocketChannel$WebSocketChannelListener$onFailure$1", f = "websocket.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
public final class WebSocketChannel$WebSocketChannelListener$onFailure$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f95302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ WebSocketChannel.WebSocketChannelListener f95303c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketChannel$WebSocketChannelListener$onFailure$1(WebSocketChannel.WebSocketChannelListener webSocketChannelListener, kotlin.coroutines.c<? super WebSocketChannel$WebSocketChannelListener$onFailure$1> cVar) {
        super(2, cVar);
        this.f95303c = webSocketChannelListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 48966, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new WebSocketChannel$WebSocketChannelListener$onFailure$1(this.f95303c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 48968, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 48967, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((WebSocketChannel$WebSocketChannelListener$onFailure$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48965, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f95302b;
        if (i10 == 0) {
            t0.n(obj);
            com.max.heybox.hblog.g.f74531b.q("WebSocketChannel, onFailure");
            kotlinx.coroutines.flow.i iVar = this.f95303c.f95295a;
            x xVar = new x(null, true);
            this.f95302b = 1;
            if (iVar.emit(xVar, this) == objH) {
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
