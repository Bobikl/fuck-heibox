package com.max.xiaoheihe.module.voice.component;

import android.os.Bundle;
import android.os.Messenger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HeyboxMicService.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nHeyboxMicService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicService.kt\ncom/max/xiaoheihe/module/voice/component/HeyboxMicService$handleStartStream$1\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,490:1\n29#2:491\n5#2,2:492\n22#2:494\n7#2:495\n*S KotlinDebug\n*F\n+ 1 HeyboxMicService.kt\ncom/max/xiaoheihe/module/voice/component/HeyboxMicService$handleStartStream$1\n*L\n142#1:491\n142#1:492,2\n142#1:494\n142#1:495\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.voice.component.HeyboxMicService$handleStartStream$1", f = "HeyboxMicService.kt", i = {1, 3, 4}, l = {145, 148, bb.c.b.f30528b0, 166, 167}, m = "invokeSuspend", n = {"$this$launch", "receiveJob", "receiveJob"}, s = {"L$0", "L$0", "L$0"})
public final class HeyboxMicService$handleStartStream$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f94048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ HeyboxMicService f94049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Serializable f94050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Messenger f94051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Bundle f94052g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeyboxMicService$handleStartStream$1(HeyboxMicService heyboxMicService, Serializable serializable, Messenger messenger, Bundle bundle, kotlin.coroutines.c<? super HeyboxMicService$handleStartStream$1> cVar) {
        super(2, cVar);
        this.f94049d = heyboxMicService;
        this.f94050e = serializable;
        this.f94051f = messenger;
        this.f94052g = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46754, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.coroutines.c) patchProxyResultProxy.result;
        }
        HeyboxMicService$handleStartStream$1 heyboxMicService$handleStartStream$1 = new HeyboxMicService$handleStartStream$1(this.f94049d, this.f94050e, this.f94051f, this.f94052g, cVar);
        heyboxMicService$handleStartStream$1.f94048c = obj;
        return heyboxMicService$handleStartStream$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46756, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46755, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HeyboxMicService$handleStartStream$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:45:0x0114  */
    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    /* JADX WARN: Code duplicated, block: B:51:0x0168  */
    /* JADX WARN: Code duplicated, block: B:53:0x0170  */
    /* JADX WARN: Code duplicated, block: B:56:0x0178  */
    /* JADX WARN: Code duplicated, block: B:58:0x017b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0183  */
    /* JADX WARN: Code duplicated, block: B:63:0x018b  */
    /* JADX WARN: Code duplicated, block: B:66:0x018f  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x022b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0241 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01c0 -> B:49:0x0158). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.xiaoheihe.module.voice.component.HeyboxMicService$handleStartStream$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
