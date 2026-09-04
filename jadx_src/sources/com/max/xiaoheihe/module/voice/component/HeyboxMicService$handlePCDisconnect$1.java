package com.max.xiaoheihe.module.voice.component;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: HeyboxMicService.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.voice.component.HeyboxMicService", f = "HeyboxMicService.kt", i = {0, 1, 2}, l = {bb.c.b.f30919s1, bb.c.b.f30985v1, bb.c.b.f31007w1}, m = "handlePCDisconnect", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
public final class HeyboxMicService$handlePCDisconnect$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f94035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f94036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ HeyboxMicService f94037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f94038e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeyboxMicService$handlePCDisconnect$1(HeyboxMicService heyboxMicService, kotlin.coroutines.c<? super HeyboxMicService$handlePCDisconnect$1> cVar) {
        super(cVar);
        this.f94037d = heyboxMicService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46744, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f94036c = obj;
        this.f94038e |= Integer.MIN_VALUE;
        return HeyboxMicService.i(this.f94037d, null, this);
    }
}
