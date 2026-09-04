package com.max.hbuikit.utils;

import android.content.Context;
import android.view.View;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.hbutils.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: UiKitUtil.kt */
/* JADX INFO: loaded from: classes13.dex */
@d(c = "com.max.hbuikit.utils.UiKitUtil$setBaseViewParams$1$1$3", f = "UiKitUtil.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
public final class UiKitUtil$setBaseViewParams$1$1$3 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f73240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ UiKitViewObj f73241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ WeakReference<View> f73242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f73243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UiKitUtil$setBaseViewParams$1$1$3(UiKitViewObj uiKitViewObj, WeakReference<View> weakReference, Context context, c<? super UiKitUtil$setBaseViewParams$1$1$3> cVar) {
        super(2, cVar);
        this.f73241c = uiKitViewObj;
        this.f73242d = weakReference;
        this.f73243e = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(UiKitViewObj uiKitViewObj, Context context, View view) {
        if (PatchProxy.proxy(new Object[]{uiKitViewObj, context, view}, null, changeQuickRedirect, true, bb.c.k.tm, new Class[]{UiKitViewObj.class, Context.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        List<String> click_action_list = uiKitViewObj.getClick_action_list();
        f0.m(click_action_list);
        Iterator<String> it = click_action_list.iterator();
        while (it.hasNext()) {
            ob.a.p().c(context, it.next());
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.k.rm, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new UiKitUtil$setBaseViewParams$1$1$3(this.f73241c, this.f73242d, this.f73243e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.um, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.sm, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((UiKitUtil$setBaseViewParams$1$1$3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.qm, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f73240b;
        if (i10 == 0) {
            t0.n(obj);
            long jR = n.r(this.f73241c.getClick_delay());
            this.f73240b = 1;
            if (DelayKt.b(jR, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        View view = this.f73242d.get();
        if (view != null) {
            final UiKitViewObj uiKitViewObj = this.f73241c;
            final Context context = this.f73243e;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbuikit.utils.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UiKitUtil$setBaseViewParams$1$1$3.f(uiKitViewObj, context, view2);
                }
            });
        }
        return b2.f124493a;
    }
}
