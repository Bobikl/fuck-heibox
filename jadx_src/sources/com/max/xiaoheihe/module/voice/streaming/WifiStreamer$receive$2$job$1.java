package com.max.xiaoheihe.module.voice.streaming;

import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.DataInputStream;
import java.net.Socket;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: WifiStreamer.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nWifiStreamer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiStreamer.kt\ncom/max/xiaoheihe/module/voice/streaming/WifiStreamer$receive$2$job$1\n+ 2 Utils.kt\ncom/example/androidMic/utils/UtilsKt\n*L\n1#1,244:1\n7#2,6:245\n*S KotlinDebug\n*F\n+ 1 WifiStreamer.kt\ncom/max/xiaoheihe/module/voice/streaming/WifiStreamer$receive$2$job$1\n*L\n67#1:245,6\n*E\n"})
@d(c = "com.max.xiaoheihe.module.voice.streaming.WifiStreamer$receive$2$job$1", f = "WifiStreamer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WifiStreamer$receive$2$job$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ WifiStreamer f94134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<String> f94135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WifiStreamer$receive$2$job$1(WifiStreamer wifiStreamer, Ref.ObjectRef<String> objectRef, c<? super WifiStreamer$receive$2$job$1> cVar) {
        super(2, cVar);
        this.f94134c = wifiStreamer;
        this.f94135d = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46841, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new WifiStreamer$receive$2$job$1(this.f94134c, this.f94135d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46843, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46842, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((WifiStreamer$receive$2$job$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46840, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f94133b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        WifiStreamer wifiStreamer = this.f94134c;
        Ref.ObjectRef<String> objectRef = this.f94135d;
        try {
            Socket socket = wifiStreamer.f94126k;
            if (socket == null || !socket.isConnected()) {
                z10 = false;
            }
            if (z10) {
                Socket socket2 = wifiStreamer.f94126k;
                f0.m(socket2);
                byte[] bArr = new byte[100];
                objectRef.f124891b = new String(bArr, 0, new DataInputStream(socket2.getInputStream()).read(bArr, 0, 100), kotlin.text.d.f128566b);
                g.f74531b.q(wifiStreamer.f94124i + ", receive, received = " + objectRef.f124891b);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return b2.f124493a;
    }
}
