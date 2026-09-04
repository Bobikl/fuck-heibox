package com.max.xiaoheihe.module.bbs.post.ui.activitys;

import bb.c;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.network.CoroutineServiceGenerator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.Map;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: BasePostPageActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity$collectionLinkV2$1", f = "BasePostPageActivity.kt", i = {}, l = {c.b.Np, c.b.Vp}, m = "invokeSuspend", n = {}, s = {})
public final class BasePostPageActivity$collectionLinkV2$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f81623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f81624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ LinkInfoObj f81625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Map<String, String> f81626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ l<Boolean, b2> f81627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ BasePostPageActivity f81628g;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity$collectionLinkV2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: BasePostPageActivity.kt */
    @d(c = "com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity$collectionLinkV2$1$1", f = "BasePostPageActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f81629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Boolean, b2> f81630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f81631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ BasePostPageActivity f81632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f81633f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f81634g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super Boolean, b2> lVar, boolean z10, BasePostPageActivity basePostPageActivity, LinkInfoObj linkInfoObj, Map<String, String> map, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f81630c = lVar;
            this.f81631d = z10;
            this.f81632e = basePostPageActivity;
            this.f81633f = linkInfoObj;
            this.f81634g = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 28660, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f81630c, this.f81631d, this.f81632e, this.f81633f, this.f81634g, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 28662, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 28661, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28659, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            b.h();
            if (this.f81629b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            this.f81630c.invoke(a.a(this.f81631d));
            if (this.f81631d) {
                BasePostPageActivity.b2(this.f81632e, this.f81633f, this.f81634g);
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BasePostPageActivity$collectionLinkV2$1(LinkInfoObj linkInfoObj, Map<String, String> map, l<? super Boolean, b2> lVar, BasePostPageActivity basePostPageActivity, kotlin.coroutines.c<? super BasePostPageActivity$collectionLinkV2$1> cVar) {
        super(2, cVar);
        this.f81625d = linkInfoObj;
        this.f81626e = map;
        this.f81627f = lVar;
        this.f81628g = basePostPageActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 28656, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.coroutines.c) patchProxyResultProxy.result;
        }
        BasePostPageActivity$collectionLinkV2$1 basePostPageActivity$collectionLinkV2$1 = new BasePostPageActivity$collectionLinkV2$1(this.f81625d, this.f81626e, this.f81627f, this.f81628g, cVar);
        basePostPageActivity$collectionLinkV2$1.f81624c = obj;
        return basePostPageActivity$collectionLinkV2$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 28658, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 28657, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((BasePostPageActivity$collectionLinkV2$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objB;
        Object objMa;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28655, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f81623b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    t0.n(obj);
                    objMa = obj;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                return b2.f124493a;
            }
            t0.n(obj);
            LinkInfoObj linkInfoObj = this.f81625d;
            Map<String, String> map = this.f81626e;
            Result.a aVar = Result.f124476c;
            com.max.xiaoheihe.network.b bVarA = CoroutineServiceGenerator.f94823a.a();
            String linkid = linkInfoObj.getLinkid();
            f0.o(linkid, "linkInfoObj.linkid");
            this.f81623b = 1;
            objMa = bVarA.ma(linkid, "1", null, map, this);
            if (objMa == objH) {
                return objH;
            }
            objB = Result.b(a.a(((com.max.hbutils.bean.Result) objMa).isOk()));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        Boolean bool = (Boolean) objB;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        n2 n2VarE = e1.e();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f81627f, zBooleanValue, this.f81628g, this.f81625d, this.f81626e, null);
        this.f81623b = 2;
        if (i.h(n2VarE, anonymousClass1, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
