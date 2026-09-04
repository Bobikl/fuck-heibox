package com.max.xiaoheihe.module.webview;

import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.utils.MemoryManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: JsCoreManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.webview.JsCoreManager$evaluateJsInJsCore$1$1", f = "JsCoreManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class JsCoreManager$evaluateJsInJsCore$1$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f94225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ JsCoreManager f94226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ JSCore f94227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f94228e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JsCoreManager$evaluateJsInJsCore$1$1(JsCoreManager jsCoreManager, JSCore jSCore, String str, kotlin.coroutines.c<? super JsCoreManager$evaluateJsInJsCore$1$1> cVar) {
        super(2, cVar);
        this.f94226c = jsCoreManager;
        this.f94227d = jSCore;
        this.f94228e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46928, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new JsCoreManager$evaluateJsInJsCore$1$1(this.f94226c, this.f94227d, this.f94228e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46930, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46929, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((JsCoreManager$evaluateJsInJsCore$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46927, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f94225b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        try {
            if (this.f94226c.m() == null) {
                this.f94226c.p(V8.createV8Runtime());
            }
            if (this.f94226c.f94222b == null) {
                JsCoreManager jsCoreManager = this.f94226c;
                jsCoreManager.f94222b = new MemoryManager(jsCoreManager.m());
            }
            if (this.f94226c.f94224d == null) {
                JsCoreManager jsCoreManager2 = this.f94226c;
                jsCoreManager2.f94224d = new V8Object(jsCoreManager2.m());
                JsCoreManager jsCoreManager3 = this.f94226c;
                JSCore jSCore = this.f94227d;
                if (jSCore == null) {
                    jSCore = jsCoreManager3.f94223c;
                }
                jsCoreManager3.f94223c = jSCore;
                V8 v8M = this.f94226c.m();
                if (v8M != null) {
                    v8M.add(JsCoreManager.f94219g, this.f94226c.f94224d);
                }
                V8Object v8Object = this.f94226c.f94224d;
                if (v8Object != null) {
                    v8Object.registerJavaMethod(this.f94226c.f94223c, "success", "success", new Class[]{String.class});
                }
                V8Object v8Object2 = this.f94226c.f94224d;
                if (v8Object2 != null) {
                    v8Object2.registerJavaMethod(this.f94226c.f94223c, "fail", "fail", new Class[]{String.class});
                }
                V8Object v8Object3 = this.f94226c.f94224d;
                if (v8Object3 != null) {
                    v8Object3.registerJavaMethod(this.f94226c.f94223c, "postMessage", "postMessage", new Class[]{Object.class});
                }
                V8Object v8Object4 = this.f94226c.f94224d;
                if (v8Object4 != null) {
                    v8Object4.registerJavaMethod(this.f94226c.f94223c, "debugLog", "debugLog", new Class[]{Object.class});
                }
                V8Object v8Object5 = this.f94226c.f94224d;
                if (v8Object5 != null) {
                    v8Object5.registerJavaMethod(this.f94226c.f94223c, "invalidate", "invalidate", null);
                }
            }
            V8 v8M2 = this.f94226c.m();
            if (v8M2 != null) {
                v8M2.executeScript(this.f94228e);
            }
            com.max.heybox.hblog.g.f74531b.q("JSCORE executeScript: " + this.f94228e);
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.f74531b.v("JSCORE error: " + th2.getMessage());
        }
        return b2.f124493a;
    }
}
