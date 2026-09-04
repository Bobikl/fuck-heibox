package com.max.xiaoheihe.module.littleprogram.fragment.webwithnative;

import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: WebWithNativeContainerFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.WebWithNativeContainerFragment$initFragment$1", f = "WebWithNativeContainerFragment.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
public final class WebWithNativeContainerFragment$initFragment$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f89374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ WebWithNativeContainerFragment f89375c;

    /* JADX INFO: compiled from: WebWithNativeContainerFragment.kt */
    public static final class a implements com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebWithNativeContainerFragment f89376a;

        a(WebWithNativeContainerFragment webWithNativeContainerFragment) {
            this.f89376a = webWithNativeContainerFragment;
        }

        @Override // com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.a
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39761, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            WebWithNativeContainerFragment.T4(this.f89376a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebWithNativeContainerFragment$initFragment$1(WebWithNativeContainerFragment webWithNativeContainerFragment, c<? super WebWithNativeContainerFragment$initFragment$1> cVar) {
        super(2, cVar);
        this.f89375c = webWithNativeContainerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39758, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new WebWithNativeContainerFragment$initFragment$1(this.f89375c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39760, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39759, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((WebWithNativeContainerFragment$initFragment$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        WebviewFragment webviewFragmentN2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39757, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f89374b;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        do {
            b bVar = this.f89375c.f89364y;
            if (!((bVar == null || bVar.isActive()) ? false : true)) {
                b bVar2 = this.f89375c.f89364y;
                WebviewFragment webviewFragment = null;
                if ((bVar2 != null ? bVar2.N2() : null) == null) {
                    WebWithNativeContainerFragment.I4(this.f89375c);
                } else {
                    WebWithNativeContainerFragment webWithNativeContainerFragment = this.f89375c;
                    b bVar3 = webWithNativeContainerFragment.f89364y;
                    if (bVar3 != null && (webviewFragmentN2 = bVar3.N2()) != null) {
                        webviewFragmentN2.N7(new a(this.f89375c));
                        webviewFragment = webviewFragmentN2;
                    }
                    webWithNativeContainerFragment.f89363x = webviewFragment;
                }
                return b2.f124493a;
            }
            this.f89374b = 1;
        } while (DelayKt.b(10L, this) != objH);
        return objH;
    }
}
