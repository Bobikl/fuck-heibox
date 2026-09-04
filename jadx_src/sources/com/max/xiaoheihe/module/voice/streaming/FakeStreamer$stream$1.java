package com.max.xiaoheihe.module.voice.streaming;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: FakeStreamer.kt */
/* JADX INFO: loaded from: classes12.dex */
@d(c = "com.max.xiaoheihe.module.voice.streaming.FakeStreamer", f = "FakeStreamer.kt", i = {0}, l = {26}, m = "stream", n = {"audioBuffer"}, s = {"L$0"})
public final class FakeStreamer$stream$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f94115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f94116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ FakeStreamer f94117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f94118e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FakeStreamer$stream$1(FakeStreamer fakeStreamer, c<? super FakeStreamer$stream$1> cVar) {
        super(cVar);
        this.f94117d = fakeStreamer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46812, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f94116c = obj;
        this.f94118e |= Integer.MIN_VALUE;
        return this.f94117d.k(null, this);
    }
}
