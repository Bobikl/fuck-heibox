package com.max.xiaoheihe.loader.dynamic_so;

import com.max.heybox.hblog.g;
import com.max.xiaoheihe.loader.bean.dynamic_so.DynamicSoInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.File;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: DynamicSoManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@d(c = "com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager$loadDynamicSo$1$1$1", f = "DynamicSoManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DynamicSoManager$loadDynamicSo$1$1$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f77282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f77283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ DynamicSoManager f77284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ DynamicSoInfoObj f77285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DynamicSoManager$loadDynamicSo$1$1$1(String str, DynamicSoManager dynamicSoManager, DynamicSoInfoObj dynamicSoInfoObj, c<? super DynamicSoManager$loadDynamicSo$1$1$1> cVar) {
        super(2, cVar);
        this.f77283c = str;
        this.f77284d = dynamicSoManager;
        this.f77285e = dynamicSoInfoObj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 22089, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new DynamicSoManager$loadDynamicSo$1$1$1(this.f77283c, this.f77284d, this.f77285e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22091, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22090, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((DynamicSoManager$loadDynamicSo$1$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22088, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        b.h();
        if (this.f77282b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        DynamicSoInfoObj dynamicSoInfoObj = DynamicSoManager.f77247b.c().get(this.f77283c);
        if (dynamicSoInfoObj != null && dynamicSoInfoObj.isLoad()) {
            return b2.f124493a;
        }
        String str = DynamicSoManager.f77251f + this.f77283c + DynamicSoManager.f77250e;
        g.f74531b.M("DynamicSoManager Try2load " + this.f77283c + ' ' + str);
        File file = new File(str);
        try {
            if (file.exists()) {
                this.f77284d.m(this.f77283c, this.f77285e, file);
            } else {
                DynamicSoManager.h(this.f77284d, this.f77285e, 0, 2, null);
            }
        } catch (Exception e10) {
            g.f74531b.v("DynamicSoManager load failed  " + this.f77283c + ' ' + str + "  " + e10.getMessage());
        }
        return b2.f124493a;
    }
}
