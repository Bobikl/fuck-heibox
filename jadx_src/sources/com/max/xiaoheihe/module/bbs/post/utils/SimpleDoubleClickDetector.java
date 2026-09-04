package com.max.xiaoheihe.module.bbs.post.utils;

import androidx.compose.runtime.internal.o;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import yh.a;

/* JADX INFO: compiled from: SimpleDoubleTapDetector.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class SimpleDoubleClickDetector {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f82024j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f82025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final LifecycleCoroutineScope f82026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final a<b2> f82027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final a<b2> f82028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f82029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f82030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private d2 f82031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private d2 f82032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e
    private d2 f82033i;

    public SimpleDoubleClickDetector(long j10, @d LifecycleCoroutineScope lifecycleCoroutineScope, @d a<b2> onSingleTapConfirmed, @d a<b2> onDoubleClick) {
        f0.p(lifecycleCoroutineScope, "lifecycleCoroutineScope");
        f0.p(onSingleTapConfirmed, "onSingleTapConfirmed");
        f0.p(onDoubleClick, "onDoubleClick");
        this.f82025a = j10;
        this.f82026b = lifecycleCoroutineScope;
        this.f82027c = onSingleTapConfirmed;
        this.f82028d = onDoubleClick;
    }

    public /* synthetic */ SimpleDoubleClickDetector(long j10, LifecycleCoroutineScope lifecycleCoroutineScope, a aVar, a aVar2, int i10, u uVar) {
        this(j10, lifecycleCoroutineScope, (i10 & 4) != 0 ? new a<b2>() { // from class: com.max.xiaoheihe.module.bbs.post.utils.SimpleDoubleClickDetector.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29494, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        } : aVar, aVar2);
    }

    public final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29493, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.f82030f) {
            this.f82030f = true;
            d2 d2Var = this.f82031g;
            if (d2Var != null) {
                d2.a.b(d2Var, null, 1, null);
            }
            this.f82031g = k.f(this.f82026b, e1.e(), null, new SimpleDoubleClickDetector$onClick$2(this, null), 2, null);
            return;
        }
        d2 d2Var2 = this.f82031g;
        if (d2Var2 != null) {
            d2.a.b(d2Var2, null, 1, null);
        }
        this.f82028d.invoke();
        this.f82030f = false;
        this.f82029e = true;
        d2 d2Var3 = this.f82033i;
        if (d2Var3 != null) {
            d2.a.b(d2Var3, null, 1, null);
        }
        this.f82033i = k.f(this.f82026b, e1.e(), null, new SimpleDoubleClickDetector$onClick$1(this, null), 2, null);
    }
}
