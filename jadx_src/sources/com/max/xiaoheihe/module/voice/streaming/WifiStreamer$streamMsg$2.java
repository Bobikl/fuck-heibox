package com.max.xiaoheihe.module.voice.streaming;

import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.CancellationException;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: WifiStreamer.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nWifiStreamer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiStreamer.kt\ncom/max/xiaoheihe/module/voice/streaming/WifiStreamer$streamMsg$2\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,244:1\n27#2:245\n5#2,2:246\n22#2:248\n7#2:249\n*S KotlinDebug\n*F\n+ 1 WifiStreamer.kt\ncom/max/xiaoheihe/module/voice/streaming/WifiStreamer$streamMsg$2\n*L\n126#1:245\n126#1:246,2\n126#1:248\n126#1:249\n*E\n"})
@d(c = "com.max.xiaoheihe.module.voice.streaming.WifiStreamer$streamMsg$2", f = "WifiStreamer.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
public final class WifiStreamer$streamMsg$2 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f94146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ WifiStreamer f94147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f94148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WifiStreamer$streamMsg$2(WifiStreamer wifiStreamer, String str, c<? super WifiStreamer$streamMsg$2> cVar) {
        super(2, cVar);
        this.f94147d = wifiStreamer;
        this.f94148e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46853, new Class[]{Object.class, c.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        WifiStreamer$streamMsg$2 wifiStreamer$streamMsg$2 = new WifiStreamer$streamMsg$2(this.f94147d, this.f94148e, cVar);
        wifiStreamer$streamMsg$2.f94146c = obj;
        return wifiStreamer$streamMsg$2;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46855, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46854, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((WifiStreamer$streamMsg$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        String name;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46852, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f94145b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            if (this.f94147d.f94126k != null) {
                Socket socket = this.f94147d.f94126k;
                if (socket != null && socket.isConnected()) {
                    if (!(this.f94148e.length() == 0)) {
                        g.a aVar = g.f74531b;
                        aVar.q("WifiStreamer, streamMsg, msg = " + this.f94148e);
                        try {
                            Socket socket2 = this.f94147d.f94126k;
                            OutputStream outputStream = socket2 != null ? socket2.getOutputStream() : null;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("WifiStreamer, streamMsg, streamOut = ");
                            sb2.append(outputStream);
                            sb2.append(", receiveBufferSize = ");
                            Socket socket3 = this.f94147d.f94126k;
                            sb2.append(socket3 != null ? kotlin.coroutines.jvm.internal.a.f(socket3.getReceiveBufferSize()) : null);
                            sb2.append(", sendBufferSize = ");
                            Socket socket4 = this.f94147d.f94126k;
                            sb2.append(socket4 != null ? kotlin.coroutines.jvm.internal.a.f(socket4.getSendBufferSize()) : null);
                            aVar.q(sb2.toString());
                            if (outputStream != null) {
                                byte[] bytes = this.f94148e.getBytes(kotlin.text.d.f128566b);
                                f0.o(bytes, "this as java.lang.String).getBytes(charset)");
                                outputStream.write(bytes);
                            }
                        } catch (IOException e10) {
                            g.f74531b.M(this.f94147d.f94124i + ", " + e10.getMessage());
                            this.f94145b = 1;
                            if (DelayKt.b(5L, this) == objH) {
                                return objH;
                            }
                            this.f94147d.disconnect();
                        } catch (CancellationException e11) {
                            throw e11;
                        } catch (Exception e12) {
                            String str = this.f94147d.f94124i + ", error msg: " + e12.getMessage();
                            g.a aVar2 = g.f74531b;
                            StringBuilder sb3 = new StringBuilder();
                            if (q0.class.isAnonymousClass()) {
                                name = q0.class.getName();
                                f0.m(name);
                            } else {
                                name = q0.class.getSimpleName();
                                f0.m(name);
                            }
                            sb3.append(name);
                            sb3.append(", ");
                            sb3.append(str);
                            aVar2.M(sb3.toString());
                        }
                        return b2.f124493a;
                    }
                }
            }
            return b2.f124493a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        this.f94147d.disconnect();
        return b2.f124493a;
    }
}
