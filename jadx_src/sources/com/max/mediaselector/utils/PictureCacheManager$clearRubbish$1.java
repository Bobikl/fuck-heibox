package com.max.mediaselector.utils;

import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.File;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: PictureCacheManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@t0({"SMAP\nPictureCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureCacheManager.kt\ncom/max/mediaselector/utils/PictureCacheManager$clearRubbish$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,148:1\n13309#2,2:149\n*S KotlinDebug\n*F\n+ 1 PictureCacheManager.kt\ncom/max/mediaselector/utils/PictureCacheManager$clearRubbish$1\n*L\n87#1:149,2\n*E\n"})
@d(c = "com.max.mediaselector.utils.PictureCacheManager$clearRubbish$1", f = "PictureCacheManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PictureCacheManager$clearRubbish$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f75677b;

    PictureCacheManager$clearRubbish$1(kotlin.coroutines.c<? super PictureCacheManager$clearRubbish$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Kc, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new PictureCacheManager$clearRubbish$1(cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Mc, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Lc, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PictureCacheManager$clearRubbish$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Jc, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f75677b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        File[] fileArrListFiles = BaseApplication.a().getCacheDir().listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                String name = file.getName();
                f0.o(name, "getName(...)");
                if (u.v2(name, "edit_cache_", false, 2, null)) {
                    file.delete();
                }
            }
        }
        return b2.f124493a;
    }
}
