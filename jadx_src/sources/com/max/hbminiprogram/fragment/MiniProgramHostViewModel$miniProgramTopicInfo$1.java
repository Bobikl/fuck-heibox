package com.max.hbminiprogram.fragment;

import com.max.hbminiprogram.bean.MiniProgramMenuInfoObj;
import com.max.hbminiprogram.bean.TopicInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.Pair;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import yh.q;

/* JADX INFO: compiled from: MiniProgramHostViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.hbminiprogram.fragment.MiniProgramHostViewModel$miniProgramTopicInfo$1", f = "MiniProgramHostViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MiniProgramHostViewModel$miniProgramTopicInfo$1 extends SuspendLambda implements q<MiniProgramMenuInfoObj, Boolean, kotlin.coroutines.c<? super Pair<? extends TopicInfoObj, ? extends Boolean>>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f71288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f71289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ boolean f71290d;

    MiniProgramHostViewModel$miniProgramTopicInfo$1(kotlin.coroutines.c<? super MiniProgramHostViewModel$miniProgramTopicInfo$1> cVar) {
        super(3, cVar);
    }

    @e
    public final Object a(MiniProgramMenuInfoObj miniProgramMenuInfoObj, boolean z10, @e kotlin.coroutines.c<? super Pair<TopicInfoObj, Boolean>> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{miniProgramMenuInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, bb.c.i.W0, new Class[]{MiniProgramMenuInfoObj.class, Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        MiniProgramHostViewModel$miniProgramTopicInfo$1 miniProgramHostViewModel$miniProgramTopicInfo$1 = new MiniProgramHostViewModel$miniProgramTopicInfo$1(cVar);
        miniProgramHostViewModel$miniProgramTopicInfo$1.f71289c = miniProgramMenuInfoObj;
        miniProgramHostViewModel$miniProgramTopicInfo$1.f71290d = z10;
        return miniProgramHostViewModel$miniProgramTopicInfo$1.invokeSuspend(b2.f124493a);
    }

    @Override // yh.q
    public /* bridge */ /* synthetic */ Object invoke(MiniProgramMenuInfoObj miniProgramMenuInfoObj, Boolean bool, kotlin.coroutines.c<? super Pair<? extends TopicInfoObj, ? extends Boolean>> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{miniProgramMenuInfoObj, bool, cVar}, this, changeQuickRedirect, false, bb.c.i.X0, new Class[]{Object.class, Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(miniProgramMenuInfoObj, bool.booleanValue(), cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.i.V0, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f71288b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        return new Pair(((MiniProgramMenuInfoObj) this.f71289c).getTopic_info(), kotlin.coroutines.jvm.internal.a.a(this.f71290d));
    }
}
