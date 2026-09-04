package com.max.hbcoco;

import com.google.gson.JsonObject;
import com.max.hbmmkv.MMKVManager;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HBCoCoUtil.kt */
/* JADX INFO: loaded from: classes9.dex */
@d(c = "com.max.hbcoco.HBCoCoUtilKt$tryToReportUnCoverageClass$1", f = "HBCoCoUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HBCoCoUtilKt$tryToReportUnCoverageClass$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f66176b;

    HBCoCoUtilKt$tryToReportUnCoverageClass$1(c<? super HBCoCoUtilKt$tryToReportUnCoverageClass$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.b.lq, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new HBCoCoUtilKt$tryToReportUnCoverageClass$1(cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.nq, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.mq, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HBCoCoUtilKt$tryToReportUnCoverageClass$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.kq, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f66176b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        try {
            List<za.a> all = ya.b.f141624b.a().c().getAll();
            List<za.a> all2 = ya.a.f141620b.a().c().getAll();
            all2.removeAll(all);
            if (HBCoCoUtilKt.b() && !com.max.hbcommon.utils.c.w(all2)) {
                MMKVManager.f71329a.n(ad.c.f1233m, ad.c.f1234n, System.currentTimeMillis(), false);
                com.max.hbcommon.analytics.d.f66538a = 1000;
                for (za.a aVar : all2) {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("class", aVar.d());
                    b2 b2Var = b2.f124493a;
                    com.max.hbcommon.analytics.d.d("3", lb.d.I5, null, jsonObject);
                }
                com.max.hbcommon.analytics.d.f66538a = 20;
                HBCoCoUtilKt.k();
            }
        } catch (Throwable th2) {
            g.f74531b.v("UN_COVERAGE  tryToReportUnCoverageClass " + th2.getMessage());
        }
        return b2.f124493a;
    }
}
