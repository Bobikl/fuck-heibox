package com.max.hbcommon.base.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.k0;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: OneTimeValidExposureWatcher.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nOneTimeValidExposureWatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTimeValidExposureWatcher.kt\ncom/max/hbcommon/base/adapter/OneTimeValidExposureWatcher\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,178:1\n29#2:179\n5#2,2:180\n22#2:182\n7#2:183\n29#2:184\n5#2,2:185\n22#2:187\n7#2:188\n29#2:189\n5#2,2:190\n22#2:192\n7#2:193\n*S KotlinDebug\n*F\n+ 1 OneTimeValidExposureWatcher.kt\ncom/max/hbcommon/base/adapter/OneTimeValidExposureWatcher\n*L\n123#1:179\n123#1:180,2\n123#1:182\n123#1:183\n162#1:184\n162#1:185,2\n162#1:187\n162#1:188\n154#1:189\n154#1:190,2\n154#1:192\n154#1:193\n*E\n"})
public final class OneTimeValidExposureWatcher implements RecyclerView.OnChildAttachStateChangeListener, View.OnLayoutChangeListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f66708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final WeakReference<com.max.hbcommon.analytics.d.f> f66709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private WeakReference<RecyclerView> f66710d;

    /* JADX INFO: renamed from: com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher$1, reason: invalid class name */
    /* JADX INFO: compiled from: OneTimeValidExposureWatcher.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher$1", f = "OneTimeValidExposureWatcher.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f66711b;

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 2007, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : OneTimeValidExposureWatcher.this.new AnonymousClass1(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 2009, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 2008, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 2006, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f66711b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                this.f66711b = 1;
                if (DelayKt.b(r.f66799a, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            OneTimeValidExposureWatcher.this.f();
            return b2.f124493a;
        }
    }

    public OneTimeValidExposureWatcher(@dl.d com.max.hbcommon.analytics.d.f page, @dl.d RecyclerView recyclerView) {
        f0.p(page, "page");
        f0.p(recyclerView, "recyclerView");
        this.f66709c = new WeakReference<>(page);
        this.f66710d = new WeakReference<>(recyclerView);
        page.setPageVisited(true);
        recyclerView.addOnLayoutChangeListener(this);
        recyclerView.addOnChildAttachStateChangeListener(this);
        kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new AnonymousClass1(null), 3, null);
    }

    private final void b(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 2000, new Class[]{View.class}, Void.TYPE).isSupported || !r.a(view) || this.f66708b) {
            return;
        }
        this.f66708b = true;
        e();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(OneTimeValidExposureWatcher this$0, View view) {
        String name;
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 2005, new Class[]{OneTimeValidExposureWatcher.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(view, "$view");
        com.max.hbcommon.analytics.d.f fVar = this$0.f66709c.get();
        if (fVar != null) {
            String str = "onChildViewAttachedToWindow, path = " + fVar.getPagePath() + ", successExposure = " + this$0.f66708b + " , " + view.isAttachedToWindow() + ", visitSuccess = " + r.a(view);
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            if (OneTimeValidExposureWatcher.class.isAnonymousClass()) {
                name = OneTimeValidExposureWatcher.class.getName();
                f0.m(name);
            } else {
                name = OneTimeValidExposureWatcher.class.getSimpleName();
                f0.m(name);
            }
            sb2.append(name);
            sb2.append(", ");
            sb2.append(str);
            aVar.q(sb2.toString());
            this$0.b(view);
        }
    }

    public final void d() {
        RecyclerView recyclerView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2001, new Class[0], Void.TYPE).isSupported || (recyclerView = this.f66710d.get()) == null) {
            return;
        }
        recyclerView.removeOnLayoutChangeListener(this);
        recyclerView.removeOnChildAttachStateChangeListener(this);
    }

    public final void e() {
        com.max.hbcommon.analytics.d.f fVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2002, new Class[0], Void.TYPE).isSupported || (fVar = this.f66709c.get()) == null) {
            return;
        }
        fVar.onPageVisitSuccess();
    }

    @k0
    public final void f() {
        com.max.hbcommon.analytics.d.f fVar;
        RecyclerView recyclerView;
        String name;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.zz, new Class[0], Void.TYPE).isSupported || (fVar = this.f66709c.get()) == null || (recyclerView = this.f66710d.get()) == null) {
            return;
        }
        String str = "requestCheck path = " + fVar.getPagePath() + ", successExposure = " + this.f66708b + " visitSuccess = " + r.a(recyclerView);
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (OneTimeValidExposureWatcher.class.isAnonymousClass()) {
            name = OneTimeValidExposureWatcher.class.getName();
            f0.m(name);
        } else {
            name = OneTimeValidExposureWatcher.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        if (recyclerView.getParent() instanceof ViewGroup) {
            b(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(@dl.d final View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 2003, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        view.post(new Runnable() { // from class: com.max.hbcommon.base.adapter.q
            @Override // java.lang.Runnable
            public final void run() {
                OneTimeValidExposureWatcher.c(this.f66797b, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(@dl.d View view) {
        String name;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 2004, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        com.max.hbcommon.analytics.d.f fVar = this.f66709c.get();
        if (fVar != null) {
            String str = "onChildViewDetachedFromWindow, path = " + fVar.getPagePath() + ", successExposure = " + this.f66708b + " , " + view.isAttachedToWindow() + ", visitSuccess = " + r.a(view);
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            if (OneTimeValidExposureWatcher.class.isAnonymousClass()) {
                name = OneTimeValidExposureWatcher.class.getName();
                f0.m(name);
            } else {
                name = OneTimeValidExposureWatcher.class.getSimpleName();
                f0.m(name);
            }
            sb2.append(name);
            sb2.append(", ");
            sb2.append(str);
            aVar.q(sb2.toString());
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@dl.e View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
    }
}
