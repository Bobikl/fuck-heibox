package com.max.xiaoheihe.module.voice.component;

import com.max.heybox.hblog.g;
import com.max.xiaoheihe.module.voice.audio.AudioBuffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HeyboxMicService.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nHeyboxMicService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicService.kt\ncom/max/xiaoheihe/module/voice/component/HeyboxMicService$sendPcMsg$2\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,490:1\n29#2:491\n5#2,2:492\n22#2:494\n7#2:495\n*S KotlinDebug\n*F\n+ 1 HeyboxMicService.kt\ncom/max/xiaoheihe/module/voice/component/HeyboxMicService$sendPcMsg$2\n*L\n406#1:491\n406#1:492,2\n406#1:494\n406#1:495\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.voice.component.HeyboxMicService$sendPcMsg$2", f = "HeyboxMicService.kt", i = {}, l = {409}, m = "invokeSuspend", n = {}, s = {})
public final class HeyboxMicService$sendPcMsg$2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f94061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f94062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ HeyboxMicService f94063e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeyboxMicService$sendPcMsg$2(String str, HeyboxMicService heyboxMicService, kotlin.coroutines.c<? super HeyboxMicService$sendPcMsg$2> cVar) {
        super(2, cVar);
        this.f94062d = str;
        this.f94063e = heyboxMicService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46770, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.coroutines.c) patchProxyResultProxy.result;
        }
        HeyboxMicService$sendPcMsg$2 heyboxMicService$sendPcMsg$2 = new HeyboxMicService$sendPcMsg$2(this.f94062d, this.f94063e, cVar);
        heyboxMicService$sendPcMsg$2.f94061c = obj;
        return heyboxMicService$sendPcMsg$2;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46772, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46771, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HeyboxMicService$sendPcMsg$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        String name;
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46769, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f94060b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("sendPcMsg, msg = ");
            sb2.append(this.f94062d);
            sb2.append(", isConnected = ");
            com.max.xiaoheihe.module.voice.streaming.a aVar = this.f94063e.f94027k;
            sb2.append(aVar != null ? kotlin.coroutines.jvm.internal.a.a(aVar.b()) : null);
            sb2.append(", streamShouldStop = ");
            sb2.append(this.f94063e.f94019c.i().get());
            String string = sb2.toString();
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
            sb3.append(string);
            aVar2.q(sb3.toString());
            com.max.xiaoheihe.module.voice.streaming.a aVar3 = this.f94063e.f94027k;
            if (aVar3 != null && aVar3.b()) {
                z10 = true;
            }
            if (z10 && !this.f94063e.f94019c.i().get()) {
                this.f94063e.f94025i.g();
                com.max.xiaoheihe.module.voice.streaming.a aVar4 = this.f94063e.f94027k;
                if (aVar4 != null) {
                    AudioBuffer audioBuffer = this.f94063e.f94025i;
                    String str = this.f94062d;
                    this.f94060b = 1;
                    if (aVar4.i(audioBuffer, str, this) == objH) {
                        return objH;
                    }
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return b2.f124493a;
    }
}
