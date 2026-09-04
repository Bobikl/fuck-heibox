package com.max.xiaoheihe.module.bbs;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jd.jdcache.util.FileHelperKt;
import com.max.xiaoheihe.bean.bbs.SpLikeIconConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: LikeAnimResourceManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.LikeAnimResourceManager$readCacheMap$1", f = "LikeAnimResourceManager.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
public final class LikeAnimResourceManager$readCacheMap$1 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f79969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<File> f79970c;

    /* JADX INFO: compiled from: LikeAnimResourceManager.kt */
    public static final class a extends TypeToken<HashMap<String, SpLikeIconConfig>> {
        a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LikeAnimResourceManager$readCacheMap$1(Ref.ObjectRef<File> objectRef, kotlin.coroutines.c<? super LikeAnimResourceManager$readCacheMap$1> cVar) {
        super(1, cVar);
        this.f79970c = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 26657, new Class[]{kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new LikeAnimResourceManager$readCacheMap$1(this.f79970c, cVar);
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 26659, new Class[]{Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 26658, new Class[]{kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((LikeAnimResourceManager$readCacheMap$1) create(cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26656, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f79969b;
        if (i10 == 0) {
            t0.n(obj);
            File file = this.f79970c.f124891b;
            this.f79969b = 1;
            obj = FileHelperKt.b(file, this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        String str = (String) obj;
        com.max.hbcommon.utils.d.b("LikeAnimResourceManager", "fileContent==" + str);
        Type type = new a().getType();
        try {
            Result.a aVar = Result.f124476c;
            LikeAnimResourceManager.f79963a.o((HashMap) new Gson().fromJson(str, type));
            objB = Result.b(b2.f124493a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        if (Result.e(objB) != null) {
            com.max.heybox.hblog.g.f74531b.v(LikeAnimResourceManager.f79963a.k() + ", readCacheMap SP_LIKE_RES_MAP error");
        }
        com.max.hbcommon.utils.d.b("LikeAnimResourceManager", "SP_LIKE_RES_MAP==" + LikeAnimResourceManager.f79963a.j());
        return b2.f124493a;
    }
}
