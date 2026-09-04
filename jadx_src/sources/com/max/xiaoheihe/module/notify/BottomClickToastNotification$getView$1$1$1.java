package com.max.xiaoheihe.module.notify;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.base.router.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: BottomClickToastNotification.kt */
/* JADX INFO: loaded from: classes12.dex */
@d(c = "com.max.xiaoheihe.module.notify.BottomClickToastNotification$getView$1$1$1", f = "BottomClickToastNotification.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BottomClickToastNotification$getView$1$1$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f91526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f91527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ BottomClickToastNotification f91528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f91529e;

    /* JADX INFO: compiled from: BottomClickToastNotification.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f91530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BottomClickToastNotification f91531c;

        a(Context context, BottomClickToastNotification bottomClickToastNotification) {
            this.f91530b = context;
            this.f91531c = bottomClickToastNotification;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42821, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.k0(this.f91530b, this.f91531c.f91524k);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomClickToastNotification$getView$1$1$1(View view, BottomClickToastNotification bottomClickToastNotification, Context context, c<? super BottomClickToastNotification$getView$1$1$1> cVar) {
        super(2, cVar);
        this.f91527c = view;
        this.f91528d = bottomClickToastNotification;
        this.f91529e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 42818, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new BottomClickToastNotification$getView$1$1$1(this.f91527c, this.f91528d, this.f91529e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 42820, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 42819, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((BottomClickToastNotification$getView$1$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42817, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f91526b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        ViewGroup viewGroup = (ViewGroup) this.f91527c.findViewById(R.id.vg_container);
        TextView textView = (TextView) this.f91527c.findViewById(R.id.tv_toast_text);
        ImageView imageView = (ImageView) this.f91527c.findViewById(R.id.iv_arrow);
        textView.setText(this.f91528d.f91523j);
        if (com.max.hbcommon.utils.c.u(this.f91528d.f91524k)) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            viewGroup.setOnClickListener(new a(this.f91529e, this.f91528d));
        }
        return b2.f124493a;
    }
}
