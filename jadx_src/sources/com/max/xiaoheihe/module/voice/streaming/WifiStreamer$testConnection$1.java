package com.max.xiaoheihe.module.voice.streaming;

import bb.c;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.net.Socket;
import kotlin.b2;
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
@t0({"SMAP\nWifiStreamer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiStreamer.kt\ncom/max/xiaoheihe/module/voice/streaming/WifiStreamer$testConnection$1\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,244:1\n29#2:245\n5#2,2:246\n22#2:248\n7#2:249\n*S KotlinDebug\n*F\n+ 1 WifiStreamer.kt\ncom/max/xiaoheihe/module/voice/streaming/WifiStreamer$testConnection$1\n*L\n230#1:245\n230#1:246,2\n230#1:248\n230#1:249\n*E\n"})
@d(c = "com.max.xiaoheihe.module.voice.streaming.WifiStreamer$testConnection$1", f = "WifiStreamer.kt", i = {0, 0, 0}, l = {c.b.f30897r1}, m = "invokeSuspend", n = {"$this$runBlocking", "job", "time"}, s = {"L$0", "L$1", "I$0"})
public final class WifiStreamer$testConnection$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f94149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f94150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f94151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f94152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ WifiStreamer f94153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Socket f94154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f94155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ Ref.BooleanRef f94156i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WifiStreamer$testConnection$1(WifiStreamer wifiStreamer, Socket socket, String str, Ref.BooleanRef booleanRef, kotlin.coroutines.c<? super WifiStreamer$testConnection$1> cVar) {
        super(2, cVar);
        this.f94153f = wifiStreamer;
        this.f94154g = socket;
        this.f94155h = str;
        this.f94156i = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46857, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.coroutines.c) patchProxyResultProxy.result;
        }
        WifiStreamer$testConnection$1 wifiStreamer$testConnection$1 = new WifiStreamer$testConnection$1(this.f94153f, this.f94154g, this.f94155h, this.f94156i, cVar);
        wifiStreamer$testConnection$1.f94152e = obj;
        return wifiStreamer$testConnection$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46859, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46858, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((WifiStreamer$testConnection$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:26:0x00be  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x008e, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0083 -> B:20:0x0086). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        q0 q0Var;
        d2 d2VarF;
        int i10;
        WifiStreamer$testConnection$1 wifiStreamer$testConnection$1;
        String name;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46856, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = this.f94151d;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            q0 q0Var2 = (q0) this.f94152e;
            q0Var = q0Var2;
            d2VarF = k.f(q0Var2, null, null, new WifiStreamer$testConnection$1$job$1(this.f94154g, this.f94153f, this.f94155h, this.f94156i, null), 3, null);
            i10 = 5;
            wifiStreamer$testConnection$1 = this;
            if (!d2VarF.x() || i10 >= wifiStreamer$testConnection$1.f94153f.f94125j) {
                if (!d2VarF.x()) {
                    d2.a.b(d2VarF, null, 1, null);
                    String str = wifiStreamer$testConnection$1.f94153f.f94124i + ", testConnection: timeout!";
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
                return b2.f124493a;
            }
            wifiStreamer$testConnection$1.f94152e = q0Var;
            wifiStreamer$testConnection$1.f94149b = d2VarF;
            wifiStreamer$testConnection$1.f94150c = i10;
            wifiStreamer$testConnection$1.f94151d = 1;
            if (DelayKt.b(5L, wifiStreamer$testConnection$1) == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f94150c;
            d2VarF = (d2) this.f94149b;
            q0Var = (q0) this.f94152e;
            kotlin.t0.n(obj);
            wifiStreamer$testConnection$1 = this;
        }
        i10 += 5;
        if (d2VarF.x()) {
        }
        if (!d2VarF.x()) {
            d2.a.b(d2VarF, null, 1, null);
            String str2 = wifiStreamer$testConnection$1.f94153f.f94124i + ", testConnection: timeout!";
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
        return b2.f124493a;
    }
}
