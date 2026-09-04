package com.max.xiaoheihe.module.account.utils;

import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HBSteamInfoUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.account.utils.HBSteamInfoUtilsKt$initSteamGameNameByIdFromRemote$1", f = "HBSteamInfoUtils.kt", i = {}, l = {150, 151}, m = "invokeSuspend", n = {}, s = {})
public final class HBSteamInfoUtilsKt$initSteamGameNameByIdFromRemote$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f79280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f79281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ b f79282d;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.utils.HBSteamInfoUtilsKt$initSteamGameNameByIdFromRemote$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: HBSteamInfoUtils.kt */
    @t0({"SMAP\nHBSteamInfoUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBSteamInfoUtils.kt\ncom/max/xiaoheihe/module/account/utils/HBSteamInfoUtilsKt$initSteamGameNameByIdFromRemote$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n1#2:187\n1855#3,2:188\n*S KotlinDebug\n*F\n+ 1 HBSteamInfoUtils.kt\ncom/max/xiaoheihe/module/account/utils/HBSteamInfoUtilsKt$initSteamGameNameByIdFromRemote$1$1\n*L\n158#1:188,2\n*E\n"})
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.account.utils.HBSteamInfoUtilsKt$initSteamGameNameByIdFromRemote$1$1", f = "HBSteamInfoUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f79283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<GameObj> f79284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f79285d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends GameObj> list, b bVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f79284c = list;
            this.f79285d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 25378, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f79284c, this.f79285d, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 25380, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 25379, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25377, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f79283b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            if (this.f79284c.isEmpty()) {
                b bVar = this.f79285d;
                if (bVar != null) {
                    bVar.onError();
                }
            } else {
                b bVar2 = this.f79285d;
                if (bVar2 != null) {
                    bVar2.onSuccess();
                }
            }
            List<GameObj> list = this.f79284c;
            if (!(true ^ list.isEmpty())) {
                list = null;
            }
            if (list == null) {
                return null;
            }
            for (GameObj gameObj : list) {
                HBSteamInfoUtilsKt.a(gameObj.getAppid(), gameObj.getName());
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HBSteamInfoUtilsKt$initSteamGameNameByIdFromRemote$1(String str, b bVar, kotlin.coroutines.c<? super HBSteamInfoUtilsKt$initSteamGameNameByIdFromRemote$1> cVar) {
        super(2, cVar);
        this.f79281c = str;
        this.f79282d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 25374, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new HBSteamInfoUtilsKt$initSteamGameNameByIdFromRemote$1(this.f79281c, this.f79282d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 25376, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 25375, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HBSteamInfoUtilsKt$initSteamGameNameByIdFromRemote$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25373, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f79280b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.t0.n(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                }
                return b2.f124493a;
            }
            kotlin.t0.n(obj);
            String str = this.f79281c;
            this.f79280b = 1;
            obj = HBSteamInfoUtilsKt.c(str, this);
            if (obj == objH) {
                return objH;
            }
            n2 n2VarE = e1.e();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((List) obj, this.f79282d, null);
            this.f79280b = 2;
            if (kotlinx.coroutines.i.h(n2VarE, anonymousClass1, this) == objH) {
                return objH;
            }
        } catch (Exception unused) {
        }
        return b2.f124493a;
    }
}
