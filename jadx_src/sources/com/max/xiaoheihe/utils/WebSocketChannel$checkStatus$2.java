package com.max.xiaoheihe.utils;

import com.google.gson.JsonObject;
import com.max.hbcommon.network.WsStatus;
import com.max.xiaoheihe.bean.BizMessageObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: websocket.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nwebsocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 websocket.kt\ncom/max/xiaoheihe/utils/WebSocketChannel$checkStatus$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,161:1\n107#2,10:162\n*S KotlinDebug\n*F\n+ 1 websocket.kt\ncom/max/xiaoheihe/utils/WebSocketChannel$checkStatus$2\n*L\n81#1:162,10\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.utils.WebSocketChannel$checkStatus$2", f = "websocket.kt", i = {0, 1, 1}, l = {167, 92}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "testPing"}, s = {"L$0", "L$0", "L$2"})
public final class WebSocketChannel$checkStatus$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super Boolean>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f95310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f95311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f95312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f95313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ WebSocketChannel f95314f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketChannel$checkStatus$2(WebSocketChannel webSocketChannel, kotlin.coroutines.c<? super WebSocketChannel$checkStatus$2> cVar) {
        super(2, cVar);
        this.f95314f = webSocketChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 48978, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new WebSocketChannel$checkStatus$2(this.f95314f, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super Boolean> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 48980, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super Boolean> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 48979, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((WebSocketChannel$checkStatus$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00cc A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:11:0x003c, B:33:0x00c6, B:35:0x00cc, B:37:0x00d6, B:41:0x00e7, B:46:0x00f7), top: B:53:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlinx.coroutines.sync.c cVarI;
        WebSocketChannel webSocketChannel;
        kotlinx.coroutines.sync.c cVar;
        Throwable th2;
        boolean zSend;
        String testPing;
        okhttp3.f0 f0Var;
        boolean z10;
        boolean z11 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48977, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f95313e;
        try {
            if (i10 == 0) {
                kotlin.t0.n(obj);
                cVarI = this.f95314f.i();
                webSocketChannel = this.f95314f;
                this.f95310b = cVarI;
                this.f95311c = webSocketChannel;
                this.f95313e = 1;
                if (cVarI.e(null, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    testPing = (String) this.f95312d;
                    webSocketChannel = (WebSocketChannel) this.f95311c;
                    cVar = (kotlinx.coroutines.sync.c) this.f95310b;
                    try {
                        kotlin.t0.n(obj);
                        f0Var = webSocketChannel.f95284c;
                        if (f0Var != null) {
                            kotlin.jvm.internal.f0.o(testPing, "testPing");
                            zSend = f0Var.send(testPing);
                        } else {
                            zSend = false;
                        }
                        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("WebSocketChannel, checkStatus, send, isSuccess = ");
                        if (zSend) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        sb2.append(z10);
                        aVar.q(sb2.toString());
                        if (zSend) {
                            z11 = false;
                        }
                        Boolean boolA = kotlin.coroutines.jvm.internal.a.a(z11);
                        cVar.f(null);
                        return boolA;
                    } catch (Throwable th3) {
                        th2 = th3;
                        cVar.f(null);
                        throw th2;
                    }
                }
                webSocketChannel = (WebSocketChannel) this.f95311c;
                kotlinx.coroutines.sync.c cVar2 = (kotlinx.coroutines.sync.c) this.f95310b;
                kotlin.t0.n(obj);
                cVarI = cVar2;
            }
            if (webSocketChannel.f95284c == null) {
                webSocketChannel.f95284c = m0.x().B();
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("type", BizMessageObj.TYPE_PING);
            String testPing2 = com.max.hbutils.utils.k.p(jsonObject);
            okhttp3.f0 f0Var2 = webSocketChannel.f95284c;
            if (f0Var2 != null) {
                kotlin.jvm.internal.f0.o(testPing2, "testPing");
                zSend = f0Var2.send(testPing2);
            } else {
                zSend = false;
            }
            if (zSend) {
                cVar = cVarI;
            } else {
                m0.x().M(WsStatus.CONNECT_FAIL);
                m0.x().G();
                this.f95310b = cVarI;
                this.f95311c = webSocketChannel;
                this.f95312d = testPing2;
                this.f95313e = 2;
                if (DelayKt.b(4000L, this) == objH) {
                    return objH;
                }
                cVar = cVarI;
                testPing = testPing2;
                f0Var = webSocketChannel.f95284c;
                if (f0Var != null) {
                    kotlin.jvm.internal.f0.o(testPing, "testPing");
                    zSend = f0Var.send(testPing);
                } else {
                    zSend = false;
                }
                com.max.heybox.hblog.g.a aVar2 = com.max.heybox.hblog.g.f74531b;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("WebSocketChannel, checkStatus, send, isSuccess = ");
                if (zSend) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sb3.append(z10);
                aVar2.q(sb3.toString());
            }
            if (zSend) {
                z11 = false;
            }
            Boolean boolA2 = kotlin.coroutines.jvm.internal.a.a(z11);
            cVar.f(null);
            return boolA2;
        } catch (Throwable th4) {
            cVar = cVarI;
            th2 = th4;
            cVar.f(null);
            throw th2;
        }
    }
}
