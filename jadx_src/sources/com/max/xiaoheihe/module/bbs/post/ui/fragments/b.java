package com.max.xiaoheihe.module.bbs.post.ui.fragments;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.j;
import com.airbnb.lottie.LottieAnimationView;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.max.xiaoheihe.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.File;
import kotlin.Result;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PostOverlayTipsDialogFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nPostOverlayTipsDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostOverlayTipsDialogFragment.kt\ncom/max/xiaoheihe/module/bbs/post/ui/fragments/PostOverlayTipsDialogFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,131:1\n262#2,2:132\n*S KotlinDebug\n*F\n+ 1 PostOverlayTipsDialogFragment.kt\ncom/max/xiaoheihe/module/bbs/post/ui/fragments/PostOverlayTipsDialogFragment\n*L\n103#1:132,2\n*E\n"})
@o(parameters = 0)
public final class b extends j {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final String f81975e = "arg_tip_id";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f81976f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f81977b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f81973c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f81974d = 8;

    /* JADX INFO: compiled from: PostOverlayTipsDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final b a(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 29273, new Class[]{Integer.TYPE}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(b.f81975e, i10);
            b bVar = new b();
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post.ui.fragments.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PostOverlayTipsDialogFragment.kt */
    public static final class ViewOnClickListenerC0706b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f81978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f81979c;

        ViewOnClickListenerC0706b(LottieAnimationView lottieAnimationView, b bVar) {
            this.f81978b = lottieAnimationView;
            this.f81979c = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29274, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.L3(this.f81978b, this.f81979c);
        }
    }

    /* JADX INFO: compiled from: PostOverlayTipsDialogFragment.kt */
    public static final class c implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f81980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f81981c;

        c(LottieAnimationView lottieAnimationView, b bVar) {
            this.f81980b = lottieAnimationView;
            this.f81981c = bVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 29277, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 29276, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            b.L3(this.f81980b, this.f81981c);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 29278, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 29275, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }
    }

    /* JADX INFO: compiled from: PostOverlayTipsDialogFragment.kt */
    public static final class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f81982b;

        d(LottieAnimationView lottieAnimationView) {
            this.f81982b = lottieAnimationView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29279, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f81982b.E();
        }
    }

    public static final /* synthetic */ void L3(LottieAnimationView lottieAnimationView, b bVar) {
        if (PatchProxy.proxy(new Object[]{lottieAnimationView, bVar}, null, changeQuickRedirect, true, 29272, new Class[]{LottieAnimationView.class, b.class}, Void.TYPE).isSupported) {
            return;
        }
        N3(lottieAnimationView, bVar);
    }

    private final void M3(FrameLayout frameLayout) {
        Context context;
        Object objB;
        if (PatchProxy.proxy(new Object[]{frameLayout}, this, changeQuickRedirect, false, 29269, new Class[]{FrameLayout.class}, Void.TYPE).isSupported || (context = getContext()) == null) {
            return;
        }
        File file = new File(r.r(r.f95728e));
        b2 b2Var = null;
        if (!file.exists()) {
            file = null;
        }
        if (file == null) {
            dismiss();
            return;
        }
        try {
            Result.a aVar = Result.f124476c;
            LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
            lottieAnimationView.setFailureListener(r.f95734k);
            AccelWorldLottieKt.a(lottieAnimationView, r.f95728e);
            lottieAnimationView.setOnClickListener(new ViewOnClickListenerC0706b(lottieAnimationView, this));
            lottieAnimationView.j(new c(lottieAnimationView, this));
            lottieAnimationView.setRepeatCount(3);
            lottieAnimationView.setRepeatMode(1);
            lottieAnimationView.post(new d(lottieAnimationView));
            objB = Result.b(lottieAnimationView);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(kotlin.t0.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            g.f74531b.v("[generateVideoTutorialView] error: " + thE);
        }
        if (Result.i(objB)) {
            objB = null;
        }
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) objB;
        if (lottieAnimationView2 != null) {
            frameLayout.setVisibility(0);
            frameLayout.addView(lottieAnimationView2);
            b2Var = b2.f124493a;
        }
        if (b2Var == null) {
            dismiss();
        }
    }

    private static final void N3(LottieAnimationView lottieAnimationView, b bVar) {
        if (PatchProxy.proxy(new Object[]{lottieAnimationView, bVar}, null, changeQuickRedirect, true, 29271, new Class[]{LottieAnimationView.class, b.class}, Void.TYPE).isSupported) {
            return;
        }
        if (lottieAnimationView.A()) {
            lottieAnimationView.p();
        }
        lottieAnimationView.setProgress(0.0f);
        bVar.dismiss();
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(@e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 29267, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f81977b = arguments.getInt(f81975e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @e
    public View onCreateView(@dl.d LayoutInflater inflater, @e ViewGroup viewGroup, @e Bundle bundle) {
        Window window;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 29268, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        Context context = getContext();
        if (context == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (this.f81977b == 0) {
            Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setDimAmount(0.7f);
            }
            M3(frameLayout);
        }
        return frameLayout;
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29270, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
    }
}
