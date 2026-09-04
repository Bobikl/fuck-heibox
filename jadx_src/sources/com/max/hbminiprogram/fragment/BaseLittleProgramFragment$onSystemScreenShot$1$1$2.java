package com.max.hbminiprogram.fragment;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.max.hbcommon.bean.ShareImageObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;
import pb.l;
import yh.p;

/* JADX INFO: compiled from: BaseLittleProgramFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.hbminiprogram.fragment.BaseLittleProgramFragment$onSystemScreenShot$1$1$2", f = "BaseLittleProgramFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BaseLittleProgramFragment$onSystemScreenShot$1$1$2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f71268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ BaseLittleProgramFragment f71269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ShareImageObj f71270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseLittleProgramFragment$onSystemScreenShot$1$1$2(BaseLittleProgramFragment baseLittleProgramFragment, ShareImageObj shareImageObj, kotlin.coroutines.c<? super BaseLittleProgramFragment$onSystemScreenShot$1$1$2> cVar) {
        super(2, cVar);
        this.f71269c = baseLittleProgramFragment;
        this.f71270d = shareImageObj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.i.B0, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new BaseLittleProgramFragment$onSystemScreenShot$1$1$2(this.f71269c, this.f71270d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.i.D0, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.i.C0, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((BaseLittleProgramFragment$onSystemScreenShot$1$1$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        l lVarG;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.i.A0, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f71268b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        if (this.f71269c.isActive() && (lVarG = ob.a.g()) != null) {
            Activity activity = ((com.max.hbcommon.base.d) this.f71269c).mContext;
            f0.n(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentManager childFragmentManager = this.f71269c.getChildFragmentManager();
            f0.o(childFragmentManager, "getChildFragmentManager(...)");
            lVarG.a((FragmentActivity) activity, childFragmentManager, this.f71270d);
        }
        return b2.f124493a;
    }
}
