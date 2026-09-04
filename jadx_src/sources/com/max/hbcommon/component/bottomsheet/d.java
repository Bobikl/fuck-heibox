package com.max.hbcommon.component.bottomsheet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.max.hbcommon.R;
import com.max.hbcustomview.CubicBezierInterpolators;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: BottomSheetsAchieveEvent.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nBottomSheetsAchieveEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetsAchieveEvent.kt\ncom/max/hbcommon/component/bottomsheet/BottomSheetsAchieveEvent\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,148:1\n254#2,2:149\n254#2,2:151\n254#2,2:153\n254#2,2:155\n*S KotlinDebug\n*F\n+ 1 BottomSheetsAchieveEvent.kt\ncom/max/hbcommon/component/bottomsheet/BottomSheetsAchieveEvent\n*L\n41#1:149,2\n49#1:151,2\n90#1:153,2\n96#1:155,2\n*E\n"})
public final class d extends q {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f67256t = 600;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final long f67257u = 600;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private ImageView f67258v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.e
    private ImageView f67259w;

    private final void G4(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.Ji, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        int iF = ViewUtils.f(context, 10.0f);
        ImageView imageView = new ImageView(context);
        int i10 = R.id.iv_sheet_star_left;
        imageView.setId(i10);
        int i11 = R.drawable.user_achievements_star_10x10;
        imageView.setImageResource(i11);
        imageView.setVisibility(8);
        c4().b().addView(imageView, new ConstraintLayout.LayoutParams(iF, iF));
        this.f67258v = imageView;
        ImageView imageView2 = new ImageView(context);
        int i12 = R.id.iv_sheet_star_right;
        imageView2.setId(i12);
        imageView2.setImageResource(i11);
        imageView2.setVisibility(8);
        c4().b().addView(imageView2, new ConstraintLayout.LayoutParams(iF, iF));
        this.f67259w = imageView2;
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.H(c4().b());
        int i13 = R.id.vg_icon;
        cVar.L(i10, 2, i13, 1, ViewUtils.f(context, 7.0f));
        int i14 = R.id.cl_content;
        cVar.L(i10, 4, i14, 3, ViewUtils.f(context, 42.0f));
        cVar.L(i12, 1, i13, 2, ViewUtils.f(context, 11.0f));
        cVar.L(i12, 4, i14, 3, ViewUtils.f(context, 17.0f));
        cVar.r(c4().b());
        ImageView imageView3 = this.f67258v;
        if (imageView3 != null) {
            imageView3.setScaleX(0.1f);
            imageView3.setScaleY(0.1f);
            imageView3.setAlpha(0.0f);
            imageView3.setVisibility(0);
        }
        ImageView imageView4 = this.f67259w;
        if (imageView4 != null) {
            imageView4.setScaleX(0.1f);
            imageView4.setScaleY(0.1f);
            imageView4.setAlpha(0.0f);
            imageView4.setVisibility(0);
        }
    }

    private final void H4(final View view, long j10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Long(j10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.Li, new Class[]{View.class, Long.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = z10 ? ValueAnimator.ofFloat(0.0f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbcommon.component.bottomsheet.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                d.I4(view, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = z10 ? ValueAnimator.ofFloat(0.1f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.1f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbcommon.component.bottomsheet.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                d.J4(view, valueAnimator);
            }
        });
        f0.m(valueAnimatorOfFloat);
        addValueAnimator(valueAnimatorOfFloat);
        f0.m(valueAnimatorOfFloat2);
        addValueAnimator(valueAnimatorOfFloat2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(j10);
        animatorSet.setDuration(this.f67257u);
        animatorSet.setInterpolator(CubicBezierInterpolators.Type.EASE_OUT.create());
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I4(View targetView, ValueAnimator it) {
        if (PatchProxy.proxy(new Object[]{targetView, it}, null, changeQuickRedirect, true, bb.c.d.Mi, new Class[]{View.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(targetView, "$targetView");
        f0.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        targetView.setAlpha(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J4(View targetView, ValueAnimator it) {
        if (PatchProxy.proxy(new Object[]{targetView, it}, null, changeQuickRedirect, true, bb.c.d.Ni, new Class[]{View.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(targetView, "$targetView");
        f0.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        targetView.setScaleX(fFloatValue);
        targetView.setScaleY(fFloatValue);
    }

    public final long E4() {
        return this.f67257u;
    }

    public final long F4() {
        return this.f67256t;
    }

    @Override // com.max.hbcommon.component.bottomsheet.q
    public void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ii, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.n4();
        Context context = getContext();
        if (context == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c4().f131686k.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = ViewUtils.f(context, 110.0f);
        marginLayoutParams.height = ViewUtils.f(context, 110.0f);
        marginLayoutParams.topMargin = -ViewUtils.f(context, 52.0f);
        G4(context);
    }

    @Override // androidx.fragment.app.j
    public void showNow(@dl.d FragmentManager manager, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{manager, str}, this, changeQuickRedirect, false, bb.c.d.Ki, new Class[]{FragmentManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(manager, "manager");
        super.showNow(manager, str);
        ImageView imageView = this.f67258v;
        if (imageView != null) {
            long j10 = 300;
            H4(imageView, this.f67256t + j10, true);
            H4(imageView, this.f67256t + j10 + this.f67257u, false);
        }
        ImageView imageView2 = this.f67259w;
        if (imageView2 != null) {
            long j11 = 900;
            H4(imageView2, this.f67256t + j11, true);
            H4(imageView2, this.f67256t + j11 + this.f67257u, false);
        }
        c4().f131686k.setShimmerAnimationDuration(1200);
        c4().f131686k.setAnimDelay(300L);
        c4().f131686k.o();
    }
}
