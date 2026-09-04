package com.max.xiaoheihe.module.bbs.utils;

import android.content.Context;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.bean.bbs.CollectionFolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: BBSKtUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$collectionLink$1", f = "BBSKtUtils.kt", i = {}, l = {71, 72}, m = "invokeSuspend", n = {}, s = {})
public final class BBSKtUtils$Companion$collectionLink$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f83271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f83272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f83273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Map<String, String> f83274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ l<Boolean, b2> f83275f;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$collectionLink$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: BBSKtUtils.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$collectionLink$1$1", f = "BBSKtUtils.kt", i = {}, l = {73, 76}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f83276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f83277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f83278d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<CollectionFolder> f83279e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f83280f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f83281g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l<Boolean, b2> f83282h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Context context, List<CollectionFolder> list, String str, Map<String, String> map, l<? super Boolean, b2> lVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f83278d = context;
            this.f83279e = list;
            this.f83280f = str;
            this.f83281g = map;
            this.f83282h = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 31132, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f83278d, this.f83279e, this.f83280f, this.f83281g, this.f83282h, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31134, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31133, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            l<Boolean, b2> lVar;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31131, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f83277c;
            if (i10 != 0) {
                if (i10 == 1) {
                    t0.n(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar = (l) this.f83276b;
                    t0.n(obj);
                }
                lVar.invoke(kotlin.coroutines.jvm.internal.a.a(((Boolean) obj).booleanValue()));
                return b2.f124493a;
            }
            t0.n(obj);
            BBSKtUtils.Companion companion = BBSKtUtils.f83254a;
            Context context = this.f83278d;
            List<CollectionFolder> list = this.f83279e;
            this.f83277c = 1;
            obj = BBSKtUtils.Companion.e(companion, context, list, this);
            if (obj == objH) {
                return objH;
            }
            CollectionFolder collectionFolder = (CollectionFolder) obj;
            g.f74531b.M("BBSKtUtils, selectCollectionFolder folder " + collectionFolder);
            String id2 = collectionFolder.getId();
            if (id2 != null) {
                String str = this.f83280f;
                Map<String, String> map = this.f83281g;
                l<Boolean, b2> lVar2 = this.f83282h;
                BBSKtUtils.Companion companion2 = BBSKtUtils.f83254a;
                this.f83276b = lVar2;
                this.f83277c = 2;
                obj = BBSKtUtils.Companion.a(companion2, str, id2, map, this);
                if (obj == objH) {
                    return objH;
                }
                lVar = lVar2;
                lVar.invoke(kotlin.coroutines.jvm.internal.a.a(((Boolean) obj).booleanValue()));
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BBSKtUtils$Companion$collectionLink$1(Context context, String str, Map<String, String> map, l<? super Boolean, b2> lVar, kotlin.coroutines.c<? super BBSKtUtils$Companion$collectionLink$1> cVar) {
        super(2, cVar);
        this.f83272c = context;
        this.f83273d = str;
        this.f83274e = map;
        this.f83275f = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 31128, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new BBSKtUtils$Companion$collectionLink$1(this.f83272c, this.f83273d, this.f83274e, this.f83275f, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31130, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31129, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((BBSKtUtils$Companion$collectionLink$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31127, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f83271b;
        if (i10 != 0) {
            if (i10 == 1) {
                t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        BBSKtUtils.Companion companion = BBSKtUtils.f83254a;
        this.f83271b = 1;
        obj = BBSKtUtils.Companion.d(companion, this);
        if (obj == objH) {
            return objH;
        }
        List list = (List) obj;
        n2 n2VarE = e1.e();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f83272c, list, this.f83273d, this.f83274e, this.f83275f, null);
        this.f83271b = 2;
        if (i.h(n2VarE, anonymousClass1, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
