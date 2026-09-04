package com.max.xiaoheihe.module.voice.component;

import android.os.Bundle;
import android.os.Messenger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HeyboxMicService.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nHeyboxMicService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicService.kt\ncom/max/xiaoheihe/module/voice/component/HeyboxMicService$handleStartAudio$1\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,490:1\n29#2:491\n5#2,2:492\n22#2:494\n7#2:495\n*S KotlinDebug\n*F\n+ 1 HeyboxMicService.kt\ncom/max/xiaoheihe/module/voice/component/HeyboxMicService$handleStartAudio$1\n*L\n270#1:491\n270#1:492,2\n270#1:494\n270#1:495\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.voice.component.HeyboxMicService$handleStartAudio$1", f = "HeyboxMicService.kt", i = {1}, l = {bb.c.b.f30553c2, bb.c.b.f30623f2, bb.c.b.f30830o2, bb.c.b.f30942t2}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class HeyboxMicService$handleStartAudio$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f94043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ HeyboxMicService f94044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Messenger f94045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Bundle f94046f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeyboxMicService$handleStartAudio$1(HeyboxMicService heyboxMicService, Messenger messenger, Bundle bundle, kotlin.coroutines.c<? super HeyboxMicService$handleStartAudio$1> cVar) {
        super(2, cVar);
        this.f94044d = heyboxMicService;
        this.f94045e = messenger;
        this.f94046f = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46750, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.coroutines.c) patchProxyResultProxy.result;
        }
        HeyboxMicService$handleStartAudio$1 heyboxMicService$handleStartAudio$1 = new HeyboxMicService$handleStartAudio$1(this.f94044d, this.f94045e, this.f94046f, cVar);
        heyboxMicService$handleStartAudio$1.f94043c = obj;
        return heyboxMicService$handleStartAudio$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46752, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46751, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HeyboxMicService$handleStartAudio$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x012b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0133  */
    /* JADX WARN: Code duplicated, block: B:44:0x0143 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0144  */
    /* JADX WARN: Code duplicated, block: B:49:0x0182 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0180 -> B:38:0x011b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.xiaoheihe.module.voice.component.HeyboxMicService$handleStartAudio$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
