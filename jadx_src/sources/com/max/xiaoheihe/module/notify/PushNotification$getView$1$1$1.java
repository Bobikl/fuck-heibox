package com.max.xiaoheihe.module.notify;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcommon.component.HeyBoxAvatarView;
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
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: PushNotification.kt */
/* JADX INFO: loaded from: classes12.dex */
@d(c = "com.max.xiaoheihe.module.notify.PushNotification$getView$1$1$1", f = "PushNotification.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PushNotification$getView$1$1$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f91535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f91536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PushNotification f91537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f91538e;

    /* JADX INFO: compiled from: PushNotification.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f91539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PushNotification f91540c;

        a(Context context, PushNotification pushNotification) {
            this.f91539b = context;
            this.f91540c = pushNotification;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42829, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.k0(this.f91539b, this.f91540c.f91533j.getProtocol());
            PushNotification pushNotification = this.f91540c;
            PushNotification.m(pushNotification, pushNotification.f91533j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushNotification$getView$1$1$1(View view, PushNotification pushNotification, Context context, c<? super PushNotification$getView$1$1$1> cVar) {
        super(2, cVar);
        this.f91536c = view;
        this.f91537d = pushNotification;
        this.f91538e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 42826, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new PushNotification$getView$1$1$1(this.f91536c, this.f91537d, this.f91538e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 42828, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 42827, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PushNotification$getView$1$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42825, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f91535b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) this.f91536c.findViewById(R.id.iv_avatar);
        CardView cardView = (CardView) this.f91536c.findViewById(R.id.card_view);
        TextView textView = (TextView) this.f91536c.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) this.f91536c.findViewById(R.id.tv_desc);
        ImageView imageView = (ImageView) this.f91536c.findViewById(R.id.iv_icon);
        ((ViewGroup) this.f91536c.findViewById(R.id.vg_icon)).setVisibility(8);
        imageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f91537d.f91534k;
        heyBoxAvatarView.setAvatar(this.f91537d.f91533j.getAvartar(), this.f91537d.f91533j.getAvatar_decoration());
        textView.setText(this.f91537d.f91533j.getTitle());
        textView2.setText(this.f91537d.f91533j.getText());
        if (com.max.hbcommon.utils.c.u(this.f91537d.f91533j.getAvatar_subscript())) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            com.max.hbimage.b.K(this.f91537d.f91533j.getAvatar_subscript(), imageView);
        }
        this.f91536c.setOnClickListener(new a(this.f91538e, this.f91537d));
        return b2.f124493a;
    }
}
