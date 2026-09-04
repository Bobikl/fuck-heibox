package com.max.xiaoheihe.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import okio.ByteString;

/* JADX INFO: compiled from: websocket.kt */
/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.utils.WebSocketChannel$WebSocketChannelListener$onMessage$2", f = "websocket.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
public final class WebSocketChannel$WebSocketChannelListener$onMessage$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f95307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ByteString f95308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ WebSocketChannel.WebSocketChannelListener f95309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketChannel$WebSocketChannelListener$onMessage$2(ByteString byteString, WebSocketChannel.WebSocketChannelListener webSocketChannelListener, kotlin.coroutines.c<? super WebSocketChannel$WebSocketChannelListener$onMessage$2> cVar) {
        super(2, cVar);
        this.f95308c = byteString;
        this.f95309d = webSocketChannelListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 48974, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new WebSocketChannel$WebSocketChannelListener$onMessage$2(this.f95308c, this.f95309d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 48976, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 48975, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((WebSocketChannel$WebSocketChannelListener$onMessage$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48973, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f95307b;
        if (i10 == 0) {
            t0.n(obj);
            com.max.heybox.hblog.g.f74531b.q("WebSocketChannel, onMessage, bytes = " + this.f95308c);
            kotlinx.coroutines.flow.i iVar = this.f95309d.f95295a;
            x xVar = new x(this.f95308c.toString(), false, 2, null);
            this.f95307b = 1;
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
