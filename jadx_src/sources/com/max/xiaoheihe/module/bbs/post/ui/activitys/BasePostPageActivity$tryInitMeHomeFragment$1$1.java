package com.max.xiaoheihe.module.bbs.post.ui.activitys;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: BasePostPageActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity$tryInitMeHomeFragment$1$1", f = "BasePostPageActivity.kt", i = {}, l = {468}, m = "invokeSuspend", n = {}, s = {})
public final class BasePostPageActivity$tryInitMeHomeFragment$1$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f81669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ BasePostPageActivity f81670c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasePostPageActivity$tryInitMeHomeFragment$1$1(BasePostPageActivity basePostPageActivity, c<? super BasePostPageActivity$tryInitMeHomeFragment$1$1> cVar) {
        super(2, cVar);
        this.f81670c = basePostPageActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 28713, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new BasePostPageActivity$tryInitMeHomeFragment$1$1(this.f81670c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 28715, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 28714, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((BasePostPageActivity$tryInitMeHomeFragment$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28712, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f81669b;
        if (i10 == 0) {
            t0.n(obj);
            this.f81669b = 1;
            if (DelayKt.b(200L, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        this.f81670c.q3().setNoScroll(false);
        return b2.f124493a;
    }
}
