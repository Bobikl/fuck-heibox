package com.max.xiaoheihe.module.voice.streaming;

import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.net.Socket;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: WifiStreamer.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nWifiStreamer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiStreamer.kt\ncom/max/xiaoheihe/module/voice/streaming/WifiStreamer$receive$2\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,244:1\n29#2:245\n5#2,2:246\n22#2:248\n7#2:249\n*S KotlinDebug\n*F\n+ 1 WifiStreamer.kt\ncom/max/xiaoheihe/module/voice/streaming/WifiStreamer$receive$2\n*L\n84#1:245\n84#1:246,2\n84#1:248\n84#1:249\n*E\n"})
@d(c = "com.max.xiaoheihe.module.voice.streaming.WifiStreamer$receive$2", f = "WifiStreamer.kt", i = {0, 0, 0, 0}, l = {79}, m = "invokeSuspend", n = {"$this$withContext", "received", "job", "time"}, s = {"L$0", "L$1", "L$2", "I$0"})
public final class WifiStreamer$receive$2 extends SuspendLambda implements p<q0, c<? super String>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f94127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f94128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f94129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f94130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f94131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ WifiStreamer f94132g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WifiStreamer$receive$2(WifiStreamer wifiStreamer, c<? super WifiStreamer$receive$2> cVar) {
        super(2, cVar);
        this.f94132g = wifiStreamer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46837, new Class[]{Object.class, c.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        WifiStreamer$receive$2 wifiStreamer$receive$2 = new WifiStreamer$receive$2(this.f94132g, cVar);
        wifiStreamer$receive$2.f94131f = obj;
        return wifiStreamer$receive$2;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super String> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46839, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super String> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46838, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((WifiStreamer$receive$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00b0, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a5 -> B:27:0x00a8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        q0 q0Var;
        int i10;
        WifiStreamer$receive$2 wifiStreamer$receive$2;
        Ref.ObjectRef objectRef;
        d2 d2Var;
        String name;
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46836, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = this.f94130e;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            q0 q0Var2 = (q0) this.f94131f;
            Socket socket = this.f94132g.f94126k;
            if (socket != null && socket.isConnected()) {
                z10 = true;
            }
            if (!z10) {
                return null;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.f124891b = "";
            d2 d2VarF = k.f(q0Var2, null, null, new WifiStreamer$receive$2$job$1(this.f94132g, objectRef2, null), 3, null);
            q0Var = q0Var2;
            i10 = 5;
            wifiStreamer$receive$2 = this;
            objectRef = objectRef2;
            d2Var = d2VarF;
            if (!d2Var.x() || i10 >= wifiStreamer$receive$2.f94132g.f94125j) {
                if (!d2Var.x()) {
                    d2.a.b(d2Var, null, 1, null);
                    String str = wifiStreamer$receive$2.f94132g.f94124i + ", receive: timeout!";
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
                    aVar.q(sb2.toString());
                }
                return objectRef.f124891b;
            }
            wifiStreamer$receive$2.f94131f = q0Var;
            wifiStreamer$receive$2.f94127b = objectRef;
            wifiStreamer$receive$2.f94128c = d2Var;
            wifiStreamer$receive$2.f94129d = i10;
            wifiStreamer$receive$2.f94130e = 1;
            if (DelayKt.b(5L, wifiStreamer$receive$2) == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f94129d;
            d2Var = (d2) this.f94128c;
            objectRef = (Ref.ObjectRef) this.f94127b;
            q0Var = (q0) this.f94131f;
            kotlin.t0.n(obj);
            wifiStreamer$receive$2 = this;
        }
        i10 += 5;
        if (d2Var.x()) {
        }
        if (!d2Var.x()) {
            d2.a.b(d2Var, null, 1, null);
            String str2 = wifiStreamer$receive$2.f94132g.f94124i + ", receive: timeout!";
            g.a aVar2 = g.f74531b;
            StringBuilder sb3 = new StringBuilder();
            if (q0.class.isAnonymousClass()) {
                name = q0.class.getSimpleName();
                f0.m(name);
            } else {
                name = q0.class.getName();
                f0.m(name);
            }
            sb3.append(name);
            sb3.append(", ");
            sb3.append(str2);
            aVar2.q(sb3.toString());
        }
        return objectRef.f124891b;
    }
}
