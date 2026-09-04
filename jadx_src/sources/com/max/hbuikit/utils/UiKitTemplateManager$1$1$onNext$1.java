package com.max.hbuikit.utils;

import com.max.hbuikit.bean.UiKitViewObj;
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

/* JADX INFO: compiled from: UiKitTemplateManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@d(c = "com.max.hbuikit.utils.UiKitTemplateManager$1$1$onNext$1", f = "UiKitTemplateManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UiKitTemplateManager$1$1$onNext$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f73229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<UiKitViewObj> f73230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ UiKitTemplateManager f73231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UiKitTemplateManager$1$1$onNext$1(List<? extends UiKitViewObj> list, UiKitTemplateManager uiKitTemplateManager, c<? super UiKitTemplateManager$1$1$onNext$1> cVar) {
        super(2, cVar);
        this.f73230c = list;
        this.f73231d = uiKitTemplateManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.k.Ll, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new UiKitTemplateManager$1$1$onNext$1(this.f73230c, this.f73231d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.Nl, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.Ml, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((UiKitTemplateManager$1$1$onNext$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.Kl, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f73229b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        for (UiKitViewObj uiKitViewObj : this.f73230c) {
            String template_id = uiKitViewObj.getTemplate_id();
            if (template_id != null) {
                this.f73231d.f73224a.put(template_id, uiKitViewObj);
            }
        }
        this.f73231d.e();
        return b2.f124493a;
    }
}
