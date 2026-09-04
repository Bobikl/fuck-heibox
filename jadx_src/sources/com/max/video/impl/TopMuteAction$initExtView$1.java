package com.max.video.impl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.res.i;
import com.max.hbvideo.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.KotlinNothingValueException;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: TopMuteAction.kt */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.video.impl.TopMuteAction$initExtView$1", f = "TopMuteAction.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
public final class TopMuteAction$initExtView$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f76042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TopMuteAction f76043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f76044d;

    /* JADX INFO: compiled from: TopMuteAction.kt */
    @t0({"SMAP\nTopMuteAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopMuteAction.kt\ncom/max/video/impl/TopMuteAction$initExtView$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,88:1\n169#2,2:89\n*S KotlinDebug\n*F\n+ 1 TopMuteAction.kt\ncom/max/video/impl/TopMuteAction$initExtView$1$1\n*L\n53#1:89,2\n*E\n"})
    public static final class a<T> implements kotlinx.coroutines.flow.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TopMuteAction f76045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f76046c;

        a(TopMuteAction topMuteAction, Context context) {
            this.f76045b = topMuteAction;
            this.f76046c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(TopMuteAction this$0, View view) {
            if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.m.Pn, new Class[]{TopMuteAction.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(this$0, "this$0");
            if (this$0.i().getValue().booleanValue()) {
                this$0.l();
            } else {
                this$0.j();
            }
            ze.a aVarH = this$0.h();
            if (aVarH != null) {
                aVarH.a(this$0.i().getValue().booleanValue());
            }
        }

        @dl.e
        public final Object b(boolean z10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, bb.c.m.On, new Class[]{Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            ImageView imageView = null;
            if (z10) {
                ImageView imageView2 = this.f76045b.f76037d;
                if (imageView2 == null) {
                    f0.S("actionView");
                    imageView2 = null;
                }
                imageView2.setImageResource(R.drawable.video_mute_filled_24x24);
            } else {
                ImageView imageView3 = this.f76045b.f76037d;
                if (imageView3 == null) {
                    f0.S("actionView");
                    imageView3 = null;
                }
                imageView3.setImageResource(R.drawable.video_unmute_filled_24x24);
            }
            ye.b bVar = ye.b.f141790a;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bVar.a(this.f76046c, 30.0f), bVar.a(this.f76046c, 30.0f));
            layoutParams.topMargin = bVar.a(this.f76046c, 4.0f);
            ImageView imageView4 = this.f76045b.f76037d;
            if (imageView4 == null) {
                f0.S("actionView");
                imageView4 = null;
            }
            int iA = bVar.a(this.f76046c, 8.0f);
            imageView4.setPadding(iA, iA, iA, iA);
            ImageView imageView5 = this.f76045b.f76037d;
            if (imageView5 == null) {
                f0.S("actionView");
                imageView5 = null;
            }
            imageView5.setLayoutParams(layoutParams);
            ImageView imageView6 = this.f76045b.f76037d;
            if (imageView6 == null) {
                f0.S("actionView");
                imageView6 = null;
            }
            imageView6.setImageTintList(ColorStateList.valueOf(i.e(this.f76046c.getResources(), R.color.white, null)));
            ImageView imageView7 = this.f76045b.f76037d;
            if (imageView7 == null) {
                f0.S("actionView");
                imageView7 = null;
            }
            imageView7.setBackground(i.g(this.f76046c.getResources(), R.drawable.video_text_primary_1_alpha40_15dp, null));
            ImageView imageView8 = this.f76045b.f76037d;
            if (imageView8 == null) {
                f0.S("actionView");
            } else {
                imageView = imageView8;
            }
            final TopMuteAction topMuteAction = this.f76045b;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.impl.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TopMuteAction$initExtView$1.a.f(topMuteAction, view);
                }
            });
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Qn, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : b(((Boolean) obj).booleanValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TopMuteAction$initExtView$1(TopMuteAction topMuteAction, Context context, kotlin.coroutines.c<? super TopMuteAction$initExtView$1> cVar) {
        super(2, cVar);
        this.f76043c = topMuteAction;
        this.f76044d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Ln, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new TopMuteAction$initExtView$1(this.f76043c, this.f76044d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Nn, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Mn, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((TopMuteAction$initExtView$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Kn, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f76042b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            u<Boolean> uVarI = this.f76043c.i();
            a aVar = new a(this.f76043c, this.f76044d);
            this.f76042b = 1;
            if (uVarI.a(aVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        throw new KotlinNothingValueException();
    }
}
