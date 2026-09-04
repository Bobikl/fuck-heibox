package com.max.hbminiprogram.component;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbminiprogram.R;
import com.max.hbminiprogram.bean.MiniProgramObj;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: MiniProgramView.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nMiniProgramView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniProgramView.kt\ncom/max/hbminiprogram/component/MiniProgramView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,300:1\n252#2:301\n*S KotlinDebug\n*F\n+ 1 MiniProgramView.kt\ncom/max/hbminiprogram/component/MiniProgramView\n*L\n284#1:301\n*E\n"})
public final class MiniProgramView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f71209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f71210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f71211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewGroup f71212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f71213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f71214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f71215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f71216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public QMUIRadiusImageView f71217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ViewGroup f71218k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private AnimatorSet f71219l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f71220m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final q0 f71221n;

    /* JADX INFO: compiled from: MiniProgramView.kt */
    public static final class a extends s<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f71222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MiniProgramView f71223c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, MiniProgramView miniProgramView, Context context, List<String> list, int i11) {
            super(context, list, i11);
            this.f71222b = i10;
            this.f71223c = miniProgramView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(MiniProgramView this$0, View view) {
            if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.i.f33389u, new Class[]{MiniProgramView.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(this$0, "this$0");
            this$0.performClick();
        }

        public void n(@dl.e s.e eVar, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, bb.c.i.f33384t, new Class[]{s.e.class, String.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            int i10 = this.f71222b;
            final MiniProgramView miniProgramView = this.f71223c;
            View viewI = eVar.i(R.id.iv);
            f0.o(viewI, "getView(...)");
            ImageView imageView = (ImageView) viewI;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = i10;
            layoutParams.height = i10;
            imageView.setLayoutParams(layoutParams);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbminiprogram.component.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MiniProgramView.a.o(miniProgramView, view);
                }
            });
            com.max.hbimage.b.K(str, imageView);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, String str) {
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, bb.c.i.f33394v, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            n(eVar, str);
        }
    }

    public MiniProgramView(@dl.e Context context) {
        this(context, null);
    }

    public MiniProgramView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniProgramView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        this.f71220m = ViewUtils.f(BaseApplication.a(), 8.0f);
        this.f71221n = r0.a(e1.e());
        i();
    }

    private final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33307e, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setClipChildren(false);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.view_mini_program, (ViewGroup) null, false);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(viewInflate);
        View viewFindViewById = findViewById(R.id.vg_mini_app);
        f0.o(viewFindViewById, "findViewById(...)");
        setVg_mini_app((ViewGroup) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.tv_name);
        f0.o(viewFindViewById2, "findViewById(...)");
        setTv_name((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.tv_desc);
        f0.o(viewFindViewById3, "findViewById(...)");
        setTv_desc((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.vg_icon);
        f0.o(viewFindViewById4, "findViewById(...)");
        setVg_icon((ViewGroup) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.rv_icon);
        f0.o(viewFindViewById5, "findViewById(...)");
        setRv_icon((RecyclerView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.iv_icon);
        f0.o(viewFindViewById6, "findViewById(...)");
        setIv_icon((ImageView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.iv_icon_animator);
        f0.o(viewFindViewById7, "findViewById(...)");
        setIv_icon_animator((ImageView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.iv_point);
        f0.o(viewFindViewById8, "findViewById(...)");
        setIv_point((ImageView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.iv_deafult);
        f0.o(viewFindViewById9, "findViewById(...)");
        setIv_deafult((QMUIRadiusImageView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.vg_add);
        f0.o(viewFindViewById10, "findViewById(...)");
        setVg_add((ViewGroup) viewFindViewById10);
        getIv_point().setVisibility(8);
        getIv_deafult().setVisibility(8);
        getIv_deafult().setCornerRadius(this.f71220m);
        if (ViewUtils.L(getContext()) >= ViewUtils.f(getContext(), 390.0f)) {
            getTv_name().setTextSize(1, 12.0f);
            ViewGroup.LayoutParams layoutParams = getTv_desc().getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ViewUtils.f(getContext(), 2.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(MiniProgramView this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.i.f33344l, new Class[]{MiniProgramView.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.performClick();
    }

    private final void l() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33324h, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f71219l == null) {
            final int iF = ViewUtils.f(getContext(), 22.0f);
            final int iF2 = ViewUtils.f(getContext(), 20.0f);
            final int iF3 = ViewUtils.f(getContext(), 23.0f);
            final int iF4 = ViewUtils.f(getContext(), 8.0f);
            final int i10 = 8;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iF, iF2);
            valueAnimatorOfInt.setDuration(150L);
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbminiprogram.component.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MiniProgramView.p(this.f71229b, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(iF2, iF3);
            valueAnimatorOfInt2.setDuration(150L);
            valueAnimatorOfInt2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbminiprogram.component.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MiniProgramView.q(this.f71230b, iF2, iF3, iF4, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(iF3, iF);
            valueAnimatorOfInt3.setDuration(100L);
            valueAnimatorOfInt3.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbminiprogram.component.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MiniProgramView.r(this.f71234b, iF3, iF, i10, valueAnimator);
                }
            });
            float f10 = 8;
            float f11 = -f10;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f11, f10);
            valueAnimatorOfFloat.setDuration(100L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbminiprogram.component.d
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MiniProgramView.s(this.f71238b, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f10, f11);
            valueAnimatorOfFloat2.setDuration(100L);
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbminiprogram.component.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MiniProgramView.m(this.f71239b, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f11, f10);
            valueAnimatorOfFloat3.setDuration(100L);
            valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbminiprogram.component.f
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MiniProgramView.n(this.f71240b, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
            valueAnimatorOfFloat4.setDuration(300L);
            valueAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbminiprogram.component.g
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MiniProgramView.o(this.f71241b, i10, iF4, valueAnimator);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfInt3, valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
            this.f71219l = animatorSet;
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.max.hbminiprogram.component.MiniProgramView$startAnimator$2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@dl.d Animator animation) {
                    if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.i.f33409y, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@dl.d Animator animation) {
                    if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.i.f33404x, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(animation, "animation");
                    k.f(this.f71224b.getMainScope(), null, null, new MiniProgramView$startAnimator$2$onAnimationEnd$1(this.f71224b, null), 3, null);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@dl.d Animator animation) {
                    if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.i.f33414z, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@dl.d Animator animation) {
                    if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.i.f33399w, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(animation, "animation");
                }
            });
        }
        k.f(this.f71221n, null, null, new MiniProgramView$startAnimator$3(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(MiniProgramView this$0, ValueAnimator it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, bb.c.i.f33369q, new Class[]{MiniProgramView.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.getIv_icon_animator().setRotation(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(MiniProgramView this$0, ValueAnimator it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, bb.c.i.f33374r, new Class[]{MiniProgramView.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.getIv_icon_animator().setRotation(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(MiniProgramView this$0, int i10, int i11, ValueAnimator it) {
        Object[] objArr = {this$0, new Integer(i10), new Integer(i11), it};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.i.f33379s, new Class[]{MiniProgramView.class, cls, cls, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        this$0.getIv_icon_animator().setRotation(fFloatValue);
        this$0.getIv_icon_animator().setTranslationY(((-fFloatValue) / i10) * i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(MiniProgramView this$0, ValueAnimator it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, bb.c.i.f33349m, new Class[]{MiniProgramView.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = this$0.getIv_icon_animator().getLayoutParams();
        layoutParams.height = iIntValue;
        this$0.getIv_icon_animator().setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(MiniProgramView this$0, int i10, int i11, int i12, ValueAnimator it) {
        Object[] objArr = {this$0, new Integer(i10), new Integer(i11), new Integer(i12), it};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.i.f33354n, new Class[]{MiniProgramView.class, cls, cls, cls, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = this$0.getIv_icon_animator().getLayoutParams();
        layoutParams.height = iIntValue;
        this$0.getIv_icon_animator().setLayoutParams(layoutParams);
        this$0.getIv_icon_animator().setTranslationY(((-(iIntValue - i10)) / (i11 - i10)) * i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(MiniProgramView this$0, int i10, int i11, int i12, ValueAnimator it) {
        Object[] objArr = {this$0, new Integer(i10), new Integer(i11), new Integer(i12), it};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.i.f33359o, new Class[]{MiniProgramView.class, cls, cls, cls, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = this$0.getIv_icon_animator().getLayoutParams();
        layoutParams.height = iIntValue;
        this$0.getIv_icon_animator().setLayoutParams(layoutParams);
        this$0.getIv_icon_animator().setRotation(((-(i10 - iIntValue)) / (i10 - i11)) * i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(MiniProgramView this$0, ValueAnimator it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, bb.c.i.f33364p, new Class[]{MiniProgramView.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.getIv_icon_animator().setRotation(((Float) animatedValue).floatValue());
    }

    @dl.e
    public final AnimatorSet getAnimationSet() {
        return this.f71219l;
    }

    @dl.d
    public final QMUIRadiusImageView getIv_deafult() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33283a, new Class[0], QMUIRadiusImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (QMUIRadiusImageView) patchProxyResultProxy.result;
        }
        QMUIRadiusImageView qMUIRadiusImageView = this.f71217j;
        if (qMUIRadiusImageView != null) {
            return qMUIRadiusImageView;
        }
        f0.S("iv_deafult");
        return null;
    }

    @dl.d
    public final ImageView getIv_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.h.f33262k0, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f71214g;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_icon");
        return null;
    }

    @dl.d
    public final ImageView getIv_icon_animator() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.h.f33266m0, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f71215h;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_icon_animator");
        return null;
    }

    @dl.d
    public final ImageView getIv_point() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.h.f33270o0, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f71216i;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_point");
        return null;
    }

    @dl.d
    public final q0 getMainScope() {
        return this.f71221n;
    }

    public final int getRadius() {
        return this.f71220m;
    }

    @dl.d
    public final RecyclerView getRv_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.h.f33258i0, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.f71213f;
        if (recyclerView != null) {
            return recyclerView;
        }
        f0.S("rv_icon");
        return null;
    }

    @dl.d
    public final TextView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.h.f33250e0, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f71211d;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_desc");
        return null;
    }

    @dl.d
    public final TextView getTv_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.h.f33246c0, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f71210c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_name");
        return null;
    }

    @dl.d
    public final ViewGroup getVg_add() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33295c, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f71218k;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vg_add");
        return null;
    }

    @dl.d
    public final ViewGroup getVg_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.h.f33254g0, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f71212e;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vg_icon");
        return null;
    }

    @dl.d
    public final ViewGroup getVg_mini_app() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.h.f33242a0, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f71209b;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vg_mini_app");
        return null;
    }

    public final void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33319g, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getIv_icon().setVisibility(8);
        getIv_icon_animator().setVisibility(0);
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33334j, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f71219l;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33339k, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f71219l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void setAnimationSet(@dl.e AnimatorSet animatorSet) {
        this.f71219l = animatorSet;
    }

    public final void setData(@dl.e MiniProgramObj miniProgramObj) {
        int iF;
        if (PatchProxy.proxy(new Object[]{miniProgramObj}, this, changeQuickRedirect, false, bb.c.i.f33313f, new Class[]{MiniProgramObj.class}, Void.TYPE).isSupported || miniProgramObj == null) {
            return;
        }
        getVg_mini_app().setVisibility(0);
        getVg_add().setVisibility(8);
        getIv_deafult().setVisibility(8);
        if (f0.g(miniProgramObj.getCategory_id(), "-4")) {
            getVg_add().setVisibility(0);
            getVg_mini_app().setVisibility(8);
            setBackground(q.d(getContext(), R.color.divider_secondary_1_color, R.color.divider_secondary_1_color_alpha60, this.f71220m));
            return;
        }
        if (f0.g(miniProgramObj.getCategory_id(), "-3")) {
            getIv_deafult().setVisibility(0);
            com.max.hbimage.b.K(miniProgramObj.getIcon_img(), getIv_deafult());
            setBackground(null);
            return;
        }
        setBackground(q.d(getContext(), R.color.divider_secondary_1_color, R.color.divider_secondary_1_color_alpha60, this.f71220m));
        getTv_name().setText(miniProgramObj.getName());
        getTv_desc().setText(miniProgramObj.getDesc());
        com.max.hbimage.b.K(miniProgramObj.getIcon_img(), getIv_icon());
        com.max.hbimage.b.K(miniProgramObj.getIcon_img(), getIv_icon_animator());
        if (miniProgramObj.getHave_new()) {
            getIv_point().setVisibility(0);
        } else {
            getIv_point().setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = getVg_icon().getLayoutParams();
        if (f0.g(miniProgramObj.is_more(), Boolean.TRUE)) {
            iF = ViewUtils.f(getContext(), 25.0f);
            getIv_icon_animator().setVisibility(8);
            if (com.max.hbcommon.utils.c.w(miniProgramObj.getMore_image())) {
                getIv_icon().setVisibility(0);
                getRv_icon().setVisibility(8);
                com.max.hbimage.b.K(miniProgramObj.getIcon_img(), getIv_icon());
            } else {
                int iF2 = ViewUtils.f(getContext(), 1.0f);
                getIv_icon().setVisibility(8);
                getRv_icon().setVisibility(0);
                getRv_icon().setLayoutManager(new GridLayoutManager(getContext(), 2));
                if (getRv_icon().getItemDecorationCount() == 0) {
                    getRv_icon().addItemDecoration(new fc.b(2, iF2, false));
                }
                getRv_icon().setOnClickListener(new View.OnClickListener() { // from class: com.max.hbminiprogram.component.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MiniProgramView.j(this.f71244b, view);
                    }
                });
                int i10 = (iF - iF2) / 2;
                RecyclerView rv_icon = getRv_icon();
                Context context = getContext();
                List<String> more_image = miniProgramObj.getMore_image();
                f0.m(more_image);
                rv_icon.setAdapter(new a(i10, this, context, more_image, R.layout.item_image));
            }
        } else {
            getRv_icon().setVisibility(8);
            iF = ViewUtils.f(getContext(), 22.0f);
            if (miniProgramObj.getShow_animator()) {
                k();
            } else {
                t();
            }
        }
        layoutParams.width = iF;
        layoutParams.height = iF;
        getVg_icon().setLayoutParams(layoutParams);
    }

    public final void setIv_deafult(@dl.d QMUIRadiusImageView qMUIRadiusImageView) {
        if (PatchProxy.proxy(new Object[]{qMUIRadiusImageView}, this, changeQuickRedirect, false, bb.c.i.f33289b, new Class[]{QMUIRadiusImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(qMUIRadiusImageView, "<set-?>");
        this.f71217j = qMUIRadiusImageView;
    }

    public final void setIv_icon(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.h.f33264l0, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f71214g = imageView;
    }

    public final void setIv_icon_animator(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.h.f33268n0, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f71215h = imageView;
    }

    public final void setIv_point(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.h.f33272p0, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f71216i = imageView;
    }

    public final void setRv_icon(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, bb.c.h.f33260j0, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "<set-?>");
        this.f71213f = recyclerView;
    }

    public final void setTv_desc(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, bb.c.h.f33252f0, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f71211d = textView;
    }

    public final void setTv_name(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, bb.c.h.f33248d0, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f71210c = textView;
    }

    public final void setVg_add(@dl.d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, bb.c.i.f33301d, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f71218k = viewGroup;
    }

    public final void setVg_icon(@dl.d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, bb.c.h.f33256h0, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f71212e = viewGroup;
    }

    public final void setVg_mini_app(@dl.d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, bb.c.h.f33244b0, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f71209b = viewGroup;
    }

    public final void t() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33329i, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!(getRv_icon().getVisibility() == 0)) {
            getIv_icon().setVisibility(0);
            getIv_icon_animator().setVisibility(8);
        }
        AnimatorSet animatorSet = this.f71219l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
