package com.max.hbminiprogram.fragment;

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
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: BaseLittleProgramFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.hbminiprogram.fragment.BaseLittleProgramFragment$getMiniProgramTopicInfo$1", f = "BaseLittleProgramFragment.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
public final class BaseLittleProgramFragment$getMiniProgramTopicInfo$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f71262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ BaseLittleProgramFragment f71263c;

    /* JADX INFO: compiled from: BaseLittleProgramFragment.kt */
    public static final class a<T> implements f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseLittleProgramFragment f71264b;

        a(BaseLittleProgramFragment baseLittleProgramFragment) {
            this.f71264b = baseLittleProgramFragment;
        }

        @e
        public final Object a(@dl.d Pair<TopicInfoObj, Boolean> pair, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pair, cVar}, this, changeQuickRedirect, false, bb.c.i.f33370q0, new Class[]{Pair.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            if (this.f71264b.f4()) {
                this.f71264b.r4(pair.e(), pair.f().booleanValue());
            }
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.i.f33375r0, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a((Pair) obj, cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseLittleProgramFragment$getMiniProgramTopicInfo$1(BaseLittleProgramFragment baseLittleProgramFragment, kotlin.coroutines.c<? super BaseLittleProgramFragment$getMiniProgramTopicInfo$1> cVar) {
        super(2, cVar);
        this.f71263c = baseLittleProgramFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.i.f33355n0, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new BaseLittleProgramFragment$getMiniProgramTopicInfo$1(this.f71263c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.i.f33365p0, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.i.f33360o0, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((BaseLittleProgramFragment$getMiniProgramTopicInfo$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.i.f33350m0, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f71262b;
        if (i10 == 0) {
            t0.n(obj);
            kotlinx.coroutines.flow.e<Pair<TopicInfoObj, Boolean>> eVarM = this.f71263c.S3().m();
            a aVar = new a(this.f71263c);
            this.f71262b = 1;
            if (eVarM.a(aVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
