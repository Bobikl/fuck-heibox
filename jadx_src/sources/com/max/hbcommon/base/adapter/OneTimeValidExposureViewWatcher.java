package com.max.hbcommon.base.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.k0;
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
@t0({"SMAP\nOneTimeValidExposureWatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTimeValidExposureWatcher.kt\ncom/max/hbcommon/base/adapter/OneTimeValidExposureViewWatcher\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,178:1\n29#2:179\n5#2,2:180\n22#2:182\n7#2:183\n29#2:184\n5#2,2:185\n22#2:187\n7#2:188\n*S KotlinDebug\n*F\n+ 1 OneTimeValidExposureWatcher.kt\ncom/max/hbcommon/base/adapter/OneTimeValidExposureViewWatcher\n*L\n53#1:179\n53#1:180,2\n53#1:182\n53#1:183\n67#1:184\n67#1:185,2\n67#1:187\n67#1:188\n*E\n"})
public final class OneTimeValidExposureViewWatcher implements View.OnLayoutChangeListener, View.OnAttachStateChangeListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final WeakReference<com.max.hbcommon.analytics.d.f> f66703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private WeakReference<View> f66704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f66705d;

    /* JADX INFO: renamed from: com.max.hbcommon.base.adapter.OneTimeValidExposureViewWatcher$1, reason: invalid class name */
    /* JADX INFO: compiled from: OneTimeValidExposureWatcher.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.base.adapter.OneTimeValidExposureViewWatcher$1", f = "OneTimeValidExposureWatcher.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f66706b;

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.b.wz, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : OneTimeValidExposureViewWatcher.this.new AnonymousClass1(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 1998, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.xz, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.vz, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f66706b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                this.f66706b = 1;
                if (DelayKt.b(r.f66799a, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            OneTimeValidExposureViewWatcher.this.d();
            return b2.f124493a;
        }
    }

    public OneTimeValidExposureViewWatcher(@dl.d com.max.hbcommon.analytics.d.f page, @dl.d View view) {
        f0.p(page, "page");
        f0.p(view, "view");
        this.f66703b = new WeakReference<>(page);
        this.f66704c = new WeakReference<>(view);
        page.setPageVisited(true);
        view.addOnLayoutChangeListener(this);
        view.addOnAttachStateChangeListener(this);
        kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new AnonymousClass1(null), 3, null);
    }

    private final void c() {
        com.max.hbcommon.analytics.d.f fVar;
        View view;
        String name;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.rz, new Class[0], Void.TYPE).isSupported || (fVar = this.f66703b.get()) == null || (view = this.f66704c.get()) == null) {
            return;
        }
        String str = "processChangeEvent path = " + fVar.getPagePath() + ", successExposure = " + this.f66705d + " visitSuccess = " + r.a(view);
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (OneTimeValidExposureViewWatcher.class.isAnonymousClass()) {
            name = OneTimeValidExposureViewWatcher.class.getName();
            f0.m(name);
        } else {
            name = OneTimeValidExposureViewWatcher.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        if ((view.getParent() instanceof ViewGroup) && r.a(view) && !this.f66705d) {
            this.f66705d = true;
            b();
            a();
        }
    }

    public final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.oz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = this.f66704c.get();
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
            view.removeOnAttachStateChangeListener(this);
        }
        this.f66704c.clear();
    }

    public final void b() {
        com.max.hbcommon.analytics.d.f fVar;
        View view;
        String name;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.pz, new Class[0], Void.TYPE).isSupported || (fVar = this.f66703b.get()) == null || (view = this.f66704c.get()) == null) {
            return;
        }
        String str = "onSuccess path = " + fVar.getPagePath() + ", successExposure = " + this.f66705d + " visitSuccess = " + r.a(view);
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (OneTimeValidExposureViewWatcher.class.isAnonymousClass()) {
            name = OneTimeValidExposureViewWatcher.class.getName();
            f0.m(name);
        } else {
            name = OneTimeValidExposureViewWatcher.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        fVar.onPageVisitSuccess();
    }

    @k0
    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.qz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        c();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@dl.e View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Integer(i14), new Integer(i15), new Integer(i16), new Integer(i17)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.sz, new Class[]{View.class, cls, cls, cls, cls, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@dl.d View v10) {
        if (PatchProxy.proxy(new Object[]{v10}, this, changeQuickRedirect, false, bb.c.b.tz, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(v10, "v");
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@dl.d View v10) {
        if (PatchProxy.proxy(new Object[]{v10}, this, changeQuickRedirect, false, bb.c.b.uz, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(v10, "v");
        a();
    }
}
