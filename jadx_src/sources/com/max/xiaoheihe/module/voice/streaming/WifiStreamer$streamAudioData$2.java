package com.max.xiaoheihe.module.voice.streaming;

import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
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
@t0({"SMAP\nWifiStreamer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiStreamer.kt\ncom/max/xiaoheihe/module/voice/streaming/WifiStreamer$streamAudioData$2\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,244:1\n27#2:245\n5#2,2:246\n22#2:248\n7#2:249\n*S KotlinDebug\n*F\n+ 1 WifiStreamer.kt\ncom/max/xiaoheihe/module/voice/streaming/WifiStreamer$streamAudioData$2\n*L\n142#1:245\n142#1:246,2\n142#1:248\n142#1:249\n*E\n"})
@d(c = "com.max.xiaoheihe.module.voice.streaming.WifiStreamer$streamAudioData$2", f = "WifiStreamer.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
public final class WifiStreamer$streamAudioData$2 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f94142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ WifiStreamer f94143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ short[] f94144e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WifiStreamer$streamAudioData$2(WifiStreamer wifiStreamer, short[] sArr, c<? super WifiStreamer$streamAudioData$2> cVar) {
        super(2, cVar);
        this.f94143d = wifiStreamer;
        this.f94144e = sArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46849, new Class[]{Object.class, c.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        WifiStreamer$streamAudioData$2 wifiStreamer$streamAudioData$2 = new WifiStreamer$streamAudioData$2(this.f94143d, this.f94144e, cVar);
        wifiStreamer$streamAudioData$2.f94142c = obj;
        return wifiStreamer$streamAudioData$2;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46851, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46850, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((WifiStreamer$streamAudioData$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        String name;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46848, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f94141b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            if (this.f94143d.f94126k != null) {
                Socket socket = this.f94143d.f94126k;
                if (socket != null && socket.isConnected()) {
                    if (!(this.f94144e.length == 0)) {
                        try {
                            Socket socket2 = this.f94143d.f94126k;
                            f0.m(socket2);
                            OutputStream outputStream = socket2.getOutputStream();
                            byte[] bArrC = com.max.xiaoheihe.module.voice.audio.a.c(this.f94144e);
                            outputStream.write(bArrC, 0, bArrC.length);
                            outputStream.flush();
                        } catch (IOException e10) {
                            g.f74531b.M(this.f94143d.f94124i + ", " + e10.getMessage());
                            this.f94141b = 1;
                            if (DelayKt.b(5L, this) == objH) {
                                return objH;
                            }
                            this.f94143d.disconnect();
                        } catch (Exception e11) {
                            String str = this.f94143d.f94124i + ", error msg: " + e11.getMessage();
                            g.a aVar = g.f74531b;
                            StringBuilder sb2 = new StringBuilder();
                            if (q0.class.isAnonymousClass()) {
                                name = q0.class.getName();
                                f0.m(name);
                            } else {
                                name = q0.class.getSimpleName();
                                f0.m(name);
                            }
                            sb2.append(name);
                            sb2.append(", ");
                            sb2.append(str);
                            aVar.M(sb2.toString());
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
        this.f94143d.disconnect();
        return b2.f124493a;
    }
}
