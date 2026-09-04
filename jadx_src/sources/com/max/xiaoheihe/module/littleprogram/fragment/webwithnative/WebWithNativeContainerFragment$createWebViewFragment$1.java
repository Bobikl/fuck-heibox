package com.max.xiaoheihe.module.littleprogram.fragment.webwithnative;

import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.module.webview.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: WebWithNativeContainerFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.WebWithNativeContainerFragment$createWebViewFragment$1", f = "WebWithNativeContainerFragment.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
public final class WebWithNativeContainerFragment$createWebViewFragment$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f89369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ WebWithNativeContainerFragment f89370c;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.WebWithNativeContainerFragment$createWebViewFragment$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: WebWithNativeContainerFragment.kt */
    @d(c = "com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.WebWithNativeContainerFragment$createWebViewFragment$1$3", f = "WebWithNativeContainerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f89371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebWithNativeContainerFragment f89372c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(WebWithNativeContainerFragment webWithNativeContainerFragment, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.f89372c = webWithNativeContainerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39754, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass3(this.f89372c, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39756, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39755, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39753, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f89371b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            b bVar = this.f89372c.f89364y;
            if (bVar == null) {
                return null;
            }
            WebviewFragment webviewFragment = this.f89372c.f89363x;
            f0.m(webviewFragment);
            bVar.J3(webviewFragment);
            return b2.f124493a;
        }
    }

    /* JADX INFO: compiled from: WebWithNativeContainerFragment.kt */
    public static final class a implements com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebWithNativeContainerFragment f89373a;

        a(WebWithNativeContainerFragment webWithNativeContainerFragment) {
            this.f89373a = webWithNativeContainerFragment;
        }

        @Override // com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.a
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39752, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            WebWithNativeContainerFragment.T4(this.f89373a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebWithNativeContainerFragment$createWebViewFragment$1(WebWithNativeContainerFragment webWithNativeContainerFragment, c<? super WebWithNativeContainerFragment$createWebViewFragment$1> cVar) {
        super(2, cVar);
        this.f89370c = webWithNativeContainerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39749, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new WebWithNativeContainerFragment$createWebViewFragment$1(this.f89370c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39751, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39750, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((WebWithNativeContainerFragment$createWebViewFragment$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39748, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f89369b;
        if (i10 == 0) {
            t0.n(obj);
            b bVar = this.f89370c.f89364y;
            if ((bVar != null ? bVar.N2() : null) == null) {
                u uVar = new u(this.f89370c.f89356q);
                uVar.u(false);
                uVar.m(true);
                uVar.D(true);
                WebProtocolObj webProtocolObj = this.f89370c.f89359t;
                if (webProtocolObj != null) {
                    WebWithNativeContainerFragment webWithNativeContainerFragment = this.f89370c;
                    boolean zX = com.max.hbcommon.utils.c.x(webProtocolObj.valueOf(WebviewFragment.Q4));
                    uVar.z(WebWithNativeContainerFragment.V4(webWithNativeContainerFragment));
                    uVar.A(zX);
                    uVar.v(com.max.hbcommon.utils.c.x(webProtocolObj.valueOf(WebviewFragment.N4)));
                    uVar.w(webProtocolObj.valueOf(WebviewFragment.L4));
                    uVar.x(webProtocolObj.valueOf(WebviewFragment.M4));
                }
                this.f89370c.f89363x = uVar.a();
                WebviewFragment webviewFragment = this.f89370c.f89363x;
                if (webviewFragment != null) {
                    webviewFragment.N7(new a(this.f89370c));
                }
                n2 n2VarE = e1.e();
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f89370c, null);
                this.f89369b = 1;
                if (i.h(n2VarE, anonymousClass3, this) == objH) {
                    return objH;
                }
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
