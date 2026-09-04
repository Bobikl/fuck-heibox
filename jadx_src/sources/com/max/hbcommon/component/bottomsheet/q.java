package com.max.hbcommon.component.bottomsheet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.R;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import mb.o0;

/* JADX INFO: compiled from: BottomSheetsDefault.kt */
/* JADX INFO: loaded from: classes9.dex */
public class q extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    public static final a f67279r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    public static final String f67280s = "ARG_PARAMS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected o0 f67281j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private BottomSheetsParams f67282k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private View.OnClickListener f67283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private View.OnClickListener f67284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private View f67285n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private CharSequence f67286o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private ArrayList<ValueAnimator> f67287p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private t f67288q;

    /* JADX INFO: compiled from: BottomSheetsDefault.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A4(q this$0, ValueAnimator it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, bb.c.d.Hj, new Class[]{q.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.c4().f131682g.setAlpha(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B4(q this$0, ValueAnimator it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, bb.c.d.Ij, new Class[]{q.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        this$0.c4().f131682g.setScaleX(fFloatValue);
        this$0.c4().f131682g.setScaleY(fFloatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o4(q this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.Ej, new Class[]{q.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        View.OnClickListener onClickListener = this$0.f67284m;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        BottomSheetsParams bottomSheetsParams = this$0.f67282k;
        if (bottomSheetsParams == null) {
            f0.S("mParams");
            bottomSheetsParams = null;
        }
        if (bottomSheetsParams.d()) {
            this$0.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p4(q this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 3100, new Class[]{q.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        View.OnClickListener onClickListener = this$0.f67283l;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        BottomSheetsParams bottomSheetsParams = this$0.f67282k;
        if (bottomSheetsParams == null) {
            f0.S("mParams");
            bottomSheetsParams = null;
        }
        if (bottomSheetsParams.c()) {
            this$0.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q4(q this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.Gj, new Class[]{q.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r4(q this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.Dj, new Class[]{q.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s4(View view) {
    }

    private final void z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31690zj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbcommon.component.bottomsheet.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                q.A4(this.f67274b, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.1f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbcommon.component.bottomsheet.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                q.B4(this.f67275b, valueAnimator);
            }
        });
        f0.m(valueAnimatorOfFloat);
        addValueAnimator(valueAnimatorOfFloat);
        f0.m(valueAnimatorOfFloat2);
        addValueAnimator(valueAnimatorOfFloat2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(480L);
        animatorSet.setDuration(480L);
        animatorSet.setInterpolator(new com.max.hbcustomview.shinebuttonlib.a(0.4f));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.start();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    public final void addValueAnimator(@dl.d ValueAnimator valueAnimator) {
        if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.d.Aj, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(valueAnimator, "valueAnimator");
        if (this.f67287p == null) {
            this.f67287p = new ArrayList<>();
        }
        ArrayList<ValueAnimator> arrayList = this.f67287p;
        if (arrayList != null) {
            arrayList.add(valueAnimator);
        }
    }

    @dl.d
    public final o0 c4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31446oj, new Class[0], o0.class);
        if (patchProxyResultProxy.isSupported) {
            return (o0) patchProxyResultProxy.result;
        }
        o0 o0Var = this.f67281j;
        if (o0Var != null) {
            return o0Var;
        }
        f0.S("binding");
        return null;
    }

    public final void clearValueAnimator() {
        ArrayList<ValueAnimator> arrayList;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Bj, new Class[0], Void.TYPE).isSupported || (arrayList = this.f67287p) == null) {
            return;
        }
        for (ValueAnimator valueAnimator : arrayList) {
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                valueAnimator.cancel();
            }
        }
        arrayList.clear();
        this.f67287p = null;
    }

    @dl.d
    public final View d4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31624wj, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        ConstraintLayout clContent = c4().f131679d;
        f0.o(clContent, "clContent");
        return clContent;
    }

    @dl.d
    public final ImageView e4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31646xj, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView ivClose = c4().f131680e;
        f0.o(ivClose, "ivClose");
        return ivClose;
    }

    @dl.d
    public final View f4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31580uj, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        ImageView ivIcon = c4().f131681f;
        f0.o(ivIcon, "ivIcon");
        return ivIcon;
    }

    @dl.e
    public final View g4() {
        return this.f67285n;
    }

    @dl.e
    public final CharSequence h4() {
        return this.f67286o;
    }

    @dl.e
    public final View.OnClickListener i4() {
        return this.f67283l;
    }

    public final boolean isViewCreated() {
        return this.f67281j != null;
    }

    @dl.e
    public final View.OnClickListener j4() {
        return this.f67284m;
    }

    @dl.e
    public final t k4() {
        return this.f67288q;
    }

    @dl.d
    public final TextView l4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31558tj, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView tvTitle = c4().f131684i;
        f0.o(tvTitle, "tvTitle");
        return tvTitle;
    }

    @dl.d
    public final View m4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31602vj, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        LinearLayout vgTitle = c4().f131687l;
        f0.o(vgTitle, "vgTitle");
        return vgTitle;
    }

    public void n4() {
        b2 b2Var;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31536sj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        float fH0 = ViewUtils.h0(getContext(), ViewUtils.t(getContext()));
        BottomSheetsParams bottomSheetsParams = null;
        c4().f131679d.setOnClickListener(null);
        ConstraintLayout constraintLayout = c4().f131679d;
        Context context = getContext();
        int i10 = R.color.background_layer_2_color;
        constraintLayout.setBackground(com.max.hbutils.utils.q.E(context, i10, fH0));
        boolean z10 = true;
        if (this.f67285n != null) {
            c4().f131685j.removeAllViews();
            c4().f131685j.addView(this.f67285n, new ViewGroup.LayoutParams(-1, -2));
            c4().f131678c.setVisibility(4);
        } else {
            c4().f131678c.setVisibility(0);
            BottomButtonLeftItemView bottomButtonLeftItemView = c4().f131678c;
            Drawable drawableI = ViewUtils.i(0, com.max.hbcommon.utils.l.a(R.color.icon_gradient_dark_start_color), com.max.hbcommon.utils.l.a(R.color.icon_gradient_dark_end_color));
            f0.o(drawableI, "getBL2TRGradientRoundedRectDrawable(...)");
            bottomButtonLeftItemView.setRightBackground(drawableI);
            BottomButtonLeftItemView bottomButtonLeftItemView2 = c4().f131678c;
            GradientDrawable gradientDrawableN = com.max.hbutils.utils.q.n(getContext(), R.color.text_primary_1_color_alpha10);
            f0.o(gradientDrawableN, "getRectShape(...)");
            bottomButtonLeftItemView2.setLeftBackground(gradientDrawableN);
            c4().f131678c.setRightClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.bottomsheet.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    q.o4(this.f67276b, view);
                }
            });
            BottomButtonLeftItemView bottomButtonLeftItemView3 = c4().f131678c;
            BottomSheetsParams bottomSheetsParams2 = this.f67282k;
            if (bottomSheetsParams2 == null) {
                f0.S("mParams");
                bottomSheetsParams2 = null;
            }
            bottomButtonLeftItemView3.setRightText(bottomSheetsParams2.i());
            if (this.f67283l != null) {
                BottomButtonLeftItemView bottomButtonLeftItemView4 = c4().f131678c;
                BottomSheetsParams bottomSheetsParams3 = this.f67282k;
                if (bottomSheetsParams3 == null) {
                    f0.S("mParams");
                    bottomSheetsParams3 = null;
                }
                bottomButtonLeftItemView4.setLeftText(bottomSheetsParams3.h());
                c4().f131678c.setShowLeftButton(true);
                c4().f131678c.setLeftClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.bottomsheet.o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        q.p4(this.f67277b, view);
                    }
                });
                b2Var = b2.f124493a;
            } else {
                b2Var = null;
            }
            if (b2Var == null) {
                c4().f131678c.setShowLeftButton(false);
            }
        }
        TextView textView = c4().f131684i;
        BottomSheetsParams bottomSheetsParams4 = this.f67282k;
        if (bottomSheetsParams4 == null) {
            f0.S("mParams");
            bottomSheetsParams4 = null;
        }
        textView.setText(bottomSheetsParams4.l());
        CharSequence charSequence = this.f67286o;
        if (charSequence != null && charSequence.length() != 0) {
            z10 = false;
        }
        if (z10) {
            c4().f131683h.setVisibility(8);
        } else {
            c4().f131683h.setText(this.f67286o);
            c4().f131683h.setVisibility(0);
        }
        BottomSheetsParams bottomSheetsParams5 = this.f67282k;
        if (bottomSheetsParams5 == null) {
            f0.S("mParams");
            bottomSheetsParams5 = null;
        }
        U3(bottomSheetsParams5.e());
        BottomSheetsParams bottomSheetsParams6 = this.f67282k;
        if (bottomSheetsParams6 == null) {
            f0.S("mParams");
            bottomSheetsParams6 = null;
        }
        if (bottomSheetsParams6.j()) {
            c4().f131680e.setVisibility(0);
            c4().f131680e.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.bottomsheet.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    q.q4(this.f67278b, view);
                }
            });
        } else {
            c4().f131680e.setVisibility(8);
        }
        BottomSheetsParams bottomSheetsParams7 = this.f67282k;
        if (bottomSheetsParams7 == null) {
            f0.S("mParams");
            bottomSheetsParams7 = null;
        }
        if (bottomSheetsParams7.k()) {
            c4().f131686k.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(getContext(), i10, 40.0f), getContext(), R.color.divider_secondary_1_color, 0.5f));
        } else {
            c4().f131686k.setBackground(null);
        }
        BottomSheetsParams bottomSheetsParams8 = this.f67282k;
        if (bottomSheetsParams8 == null) {
            f0.S("mParams");
            bottomSheetsParams8 = null;
        }
        if (bottomSheetsParams8.g() != null) {
            c4().f131686k.setVisibility(0);
            BottomSheetsParams bottomSheetsParams9 = this.f67282k;
            if (bottomSheetsParams9 == null) {
                f0.S("mParams");
                bottomSheetsParams9 = null;
            }
            com.max.hbimage.b.K(bottomSheetsParams9.g(), c4().f131681f);
        } else {
            BottomSheetsParams bottomSheetsParams10 = this.f67282k;
            if (bottomSheetsParams10 == null) {
                f0.S("mParams");
                bottomSheetsParams10 = null;
            }
            if (bottomSheetsParams10.f() != null) {
                c4().f131686k.setVisibility(0);
                ImageView imageView = c4().f131681f;
                BottomSheetsParams bottomSheetsParams11 = this.f67282k;
                if (bottomSheetsParams11 == null) {
                    f0.S("mParams");
                    bottomSheetsParams11 = null;
                }
                Integer numF = bottomSheetsParams11.f();
                f0.m(numF);
                imageView.setImageResource(numF.intValue());
            } else {
                c4().f131686k.setVisibility(8);
            }
        }
        BottomSheetsParams bottomSheetsParams12 = this.f67282k;
        if (bottomSheetsParams12 == null) {
            f0.S("mParams");
            bottomSheetsParams12 = null;
        }
        if (bottomSheetsParams12.b() != null) {
            c4().f131682g.setVisibility(0);
            BottomSheetsParams bottomSheetsParams13 = this.f67282k;
            if (bottomSheetsParams13 == null) {
                f0.S("mParams");
            } else {
                bottomSheetsParams = bottomSheetsParams13;
            }
            com.max.hbimage.b.K(bottomSheetsParams.b(), c4().f131682g);
            z4();
            return;
        }
        BottomSheetsParams bottomSheetsParams14 = this.f67282k;
        if (bottomSheetsParams14 == null) {
            f0.S("mParams");
            bottomSheetsParams14 = null;
        }
        if (bottomSheetsParams14.a() == null) {
            c4().f131682g.setVisibility(8);
            return;
        }
        c4().f131682g.setVisibility(0);
        ImageView imageView2 = c4().f131682g;
        BottomSheetsParams bottomSheetsParams15 = this.f67282k;
        if (bottomSheetsParams15 == null) {
            f0.S("mParams");
        } else {
            bottomSheetsParams = bottomSheetsParams15;
        }
        Integer numA = bottomSheetsParams.a();
        f0.m(numA);
        imageView2.setImageResource(numA.intValue());
        z4();
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, bb.c.d.f31492qj, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        if (getArguments() != null) {
            Serializable serializable = requireArguments().getSerializable("ARG_PARAMS");
            f0.n(serializable, "null cannot be cast to non-null type com.max.hbcommon.component.bottomsheet.BottomSheetsParams");
            this.f67282k = (BottomSheetsParams) serializable;
        }
        return inflater.inflate(R.layout.layout_bottom_sheets_default, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31668yj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        clearValueAnimator();
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@dl.d DialogInterface dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, bb.c.d.Cj, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dialog, "dialog");
        super.onDismiss(dialog);
        t tVar = this.f67288q;
        if (tVar != null) {
            tVar.onDismiss();
        }
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.d.f31514rj, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        o0 o0VarA = o0.a(view);
        f0.o(o0VarA, "bind(...)");
        t4(o0VarA);
        BottomSheetsParams bottomSheetsParams = this.f67282k;
        if (bottomSheetsParams == null) {
            f0.S("mParams");
            bottomSheetsParams = null;
        }
        if (bottomSheetsParams.m()) {
            setCancelable(true);
            this.f66927e.setEnableGesture(true);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.bottomsheet.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    q.r4(this.f67273b, view2);
                }
            });
        } else {
            setCancelable(false);
            this.f66927e.setEnableGesture(false);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.bottomsheet.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    q.s4(view2);
                }
            });
        }
        n4();
    }

    public final void t4(@dl.d o0 o0Var) {
        if (PatchProxy.proxy(new Object[]{o0Var}, this, changeQuickRedirect, false, bb.c.d.f31469pj, new Class[]{o0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(o0Var, "<set-?>");
        this.f67281j = o0Var;
    }

    public final void u4(@dl.e View view) {
        this.f67285n = view;
    }

    public final void v4(@dl.e CharSequence charSequence) {
        this.f67286o = charSequence;
    }

    public final void w4(@dl.e View.OnClickListener onClickListener) {
        this.f67283l = onClickListener;
    }

    public final void x4(@dl.e View.OnClickListener onClickListener) {
        this.f67284m = onClickListener;
    }

    public final void y4(@dl.e t tVar) {
        this.f67288q = tVar;
    }
}
