package com.max.xiaoheihe.module.voice.streaming;

import com.max.hbutils.utils.k;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.module.voice.component.SampleRates;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.s0;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: WifiStreamer.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nWifiStreamer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiStreamer.kt\ncom/max/xiaoheihe/module/voice/streaming/WifiStreamer$testConnection$1$job$1\n+ 2 Utils.kt\ncom/example/androidMic/utils/UtilsKt\n+ 3 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,244:1\n7#2,2:245\n9#2,4:257\n29#3:247\n5#3,2:248\n22#3:250\n7#3:251\n29#3:252\n5#3,2:253\n22#3:255\n7#3:256\n*S KotlinDebug\n*F\n+ 1 WifiStreamer.kt\ncom/max/xiaoheihe/module/voice/streaming/WifiStreamer$testConnection$1$job$1\n*L\n199#1:245,2\n199#1:257,4\n219#1:247\n219#1:248,2\n219#1:250\n219#1:251\n220#1:252\n220#1:253,2\n220#1:255\n220#1:256\n*E\n"})
@d(c = "com.max.xiaoheihe.module.voice.streaming.WifiStreamer$testConnection$1$job$1", f = "WifiStreamer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WifiStreamer$testConnection$1$job$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f94158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Socket f94159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ WifiStreamer f94160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f94161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Ref.BooleanRef f94162g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WifiStreamer$testConnection$1$job$1(Socket socket, WifiStreamer wifiStreamer, String str, Ref.BooleanRef booleanRef, c<? super WifiStreamer$testConnection$1$job$1> cVar) {
        super(2, cVar);
        this.f94159d = socket;
        this.f94160e = wifiStreamer;
        this.f94161f = str;
        this.f94162g = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46861, new Class[]{Object.class, c.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        WifiStreamer$testConnection$1$job$1 wifiStreamer$testConnection$1$job$1 = new WifiStreamer$testConnection$1$job$1(this.f94159d, this.f94160e, this.f94161f, this.f94162g, cVar);
        wifiStreamer$testConnection$1$job$1.f94158c = obj;
        return wifiStreamer$testConnection$1$job$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46863, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46862, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((WifiStreamer$testConnection$1$job$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        String name;
        String name2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46860, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f94157b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        Socket socket = this.f94159d;
        WifiStreamer wifiStreamer = this.f94160e;
        String str = this.f94161f;
        Ref.BooleanRef booleanRef = this.f94162g;
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            String clientReply1 = k.p(s0.W(c1.a("type", "connect"), c1.a("token", wifiStreamer.f()), c1.a("ip", str), c1.a("sampleRate", kotlin.coroutines.jvm.internal.a.f(SampleRates.S44100.getValue())), c1.a("channel", kotlin.coroutines.jvm.internal.a.f(1))));
            f0.o(clientReply1, "clientReply1");
            Charset charset = kotlin.text.d.f128566b;
            byte[] bytes = clientReply1.getBytes(charset);
            f0.o(bytes, "this as java.lang.String).getBytes(charset)");
            dataOutputStream.write(bytes);
            dataOutputStream.flush();
            byte[] bArr = new byte[100];
            String str2 = new String(bArr, 0, new DataInputStream(socket.getInputStream()).read(bArr, 0, 100), charset);
            g.a aVar = g.f74531b;
            aVar.q(wifiStreamer.f94124i + ", testConnection, received = " + str2);
            if (!u.V1(str2)) {
                booleanRef.f124884b = true;
                String str3 = wifiStreamer.f94124i + ", testConnection: device matched!";
                StringBuilder sb2 = new StringBuilder();
                if (q0.class.isAnonymousClass()) {
                    name2 = q0.class.getName();
                    f0.m(name2);
                } else {
                    name2 = q0.class.getSimpleName();
                    f0.m(name2);
                }
                sb2.append(name2);
                sb2.append(", ");
                sb2.append(str3);
                aVar.q(sb2.toString());
            } else {
                String str4 = wifiStreamer.f94124i + ", testConnection: device mismatch with " + str2 + '!';
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
                sb3.append(str4);
                aVar.q(sb3.toString());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return b2.f124493a;
    }
}
