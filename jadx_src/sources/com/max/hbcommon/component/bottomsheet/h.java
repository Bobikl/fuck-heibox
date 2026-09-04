package com.max.hbcommon.component.bottomsheet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.commentimagepainter.sharecard.CardRecyclerView;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import mb.n0;

/* JADX INFO: compiled from: BottomSheetsCardShare.kt */
/* JADX INFO: loaded from: classes9.dex */
public class h extends ee.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final a f67263j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final String f67264k = "ARG_PARAMS";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected n0 f67265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BottomSheetsParams f67266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private View f67267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private CharSequence f67268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private ArrayList<ValueAnimator> f67269i;

    /* JADX INFO: compiled from: BottomSheetsCardShare.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m4(h this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.f31216ej, new Class[]{h.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.dismiss();
    }

    private final void q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31146bj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbcommon.component.bottomsheet.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.r4(this.f67260b, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.1f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbcommon.component.bottomsheet.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.s4(this.f67261b, valueAnimator);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r4(h this$0, ValueAnimator it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, bb.c.d.f31239fj, new Class[]{h.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.b4().f131666f.setAlpha(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s4(h this$0, ValueAnimator it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, bb.c.d.f31262gj, new Class[]{h.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        this$0.b4().f131666f.setScaleX(fFloatValue);
        this$0.b4().f131666f.setScaleY(fFloatValue);
    }

    public final void addValueAnimator(@dl.d ValueAnimator valueAnimator) {
        if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.d.f31169cj, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(valueAnimator, "valueAnimator");
        if (this.f67269i == null) {
            this.f67269i = new ArrayList<>();
        }
        ArrayList<ValueAnimator> arrayList = this.f67269i;
        if (arrayList != null) {
            arrayList.add(valueAnimator);
        }
    }

    @dl.d
    public final n0 b4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Oi, new Class[0], n0.class);
        if (patchProxyResultProxy.isSupported) {
            return (n0) patchProxyResultProxy.result;
        }
        n0 n0Var = this.f67265e;
        if (n0Var != null) {
            return n0Var;
        }
        f0.S("binding");
        return null;
    }

    @dl.d
    public final View c4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Yi, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        ConstraintLayout clContent = b4().f131662b;
        f0.o(clContent, "clContent");
        return clContent;
    }

    public final void clearValueAnimator() {
        ArrayList<ValueAnimator> arrayList;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31193dj, new Class[0], Void.TYPE).isSupported || (arrayList = this.f67269i) == null) {
            return;
        }
        for (ValueAnimator valueAnimator : arrayList) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        arrayList.clear();
        this.f67269i = null;
    }

    @dl.d
    public final ImageView d4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Zi, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView ivClose = b4().f131663c;
        f0.o(ivClose, "ivClose");
        return ivClose;
    }

    @dl.d
    public final View e4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Wi, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        ImageView ivIcon = b4().f131664d;
        f0.o(ivIcon, "ivIcon");
        return ivIcon;
    }

    @dl.e
    public final View f4() {
        return this.f67267g;
    }

    @dl.e
    public final CharSequence g4() {
        return this.f67268h;
    }

    @dl.d
    public final CardRecyclerView h4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ui, new Class[0], CardRecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (CardRecyclerView) patchProxyResultProxy.result;
        }
        CardRecyclerView rvCardRecycler = b4().f131667g;
        f0.o(rvCardRecycler, "rvCardRecycler");
        return rvCardRecycler;
    }

    @dl.d
    public final CardRecyclerView i4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Vi, new Class[0], CardRecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (CardRecyclerView) patchProxyResultProxy.result;
        }
        CardRecyclerView rvCardV2Recycler = b4().f131668h;
        f0.o(rvCardV2Recycler, "rvCardV2Recycler");
        return rvCardV2Recycler;
    }

    public final boolean isViewCreated() {
        return this.f67265e != null;
    }

    @dl.d
    public final TextView j4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ti, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView tvTitle = b4().f131670j;
        f0.o(tvTitle, "tvTitle");
        return tvTitle;
    }

    @dl.d
    public final View k4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Xi, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        LinearLayout vgTitle = b4().f131673m;
        f0.o(vgTitle, "vgTitle");
        return vgTitle;
    }

    public void l4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Si, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        float fH0 = ViewUtils.h0(getContext(), ViewUtils.t(getContext()));
        BottomSheetsParams bottomSheetsParams = null;
        b4().f131662b.setOnClickListener(null);
        ConstraintLayout constraintLayout = b4().f131662b;
        Context context = getContext();
        int i10 = R.color.background_layer_2_color;
        constraintLayout.setBackground(com.max.hbutils.utils.q.E(context, i10, fH0));
        if (this.f67267g != null) {
            b4().f131671k.removeAllViews();
            b4().f131671k.addView(this.f67267g, new ViewGroup.LayoutParams(-1, -2));
        }
        TextView textView = b4().f131670j;
        BottomSheetsParams bottomSheetsParams2 = this.f67266f;
        if (bottomSheetsParams2 == null) {
            f0.S("mParams");
            bottomSheetsParams2 = null;
        }
        textView.setText(bottomSheetsParams2.l());
        CharSequence charSequence = this.f67268h;
        if (charSequence == null || charSequence.length() == 0) {
            b4().f131669i.setVisibility(8);
        } else {
            b4().f131669i.setText(this.f67268h);
            b4().f131669i.setVisibility(0);
        }
        BottomSheetsParams bottomSheetsParams3 = this.f67266f;
        if (bottomSheetsParams3 == null) {
            f0.S("mParams");
            bottomSheetsParams3 = null;
        }
        if (bottomSheetsParams3.j()) {
            b4().f131663c.setVisibility(0);
            b4().f131663c.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.bottomsheet.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.m4(this.f67262b, view);
                }
            });
        } else {
            b4().f131663c.setVisibility(8);
        }
        BottomSheetsParams bottomSheetsParams4 = this.f67266f;
        if (bottomSheetsParams4 == null) {
            f0.S("mParams");
            bottomSheetsParams4 = null;
        }
        if (bottomSheetsParams4.k()) {
            b4().f131672l.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(getContext(), i10, 40.0f), getContext(), R.color.divider_secondary_1_color, 0.5f));
        } else {
            b4().f131672l.setBackground(null);
        }
        BottomSheetsParams bottomSheetsParams5 = this.f67266f;
        if (bottomSheetsParams5 == null) {
            f0.S("mParams");
            bottomSheetsParams5 = null;
        }
        if (bottomSheetsParams5.g() != null) {
            b4().f131672l.setVisibility(0);
            BottomSheetsParams bottomSheetsParams6 = this.f67266f;
            if (bottomSheetsParams6 == null) {
                f0.S("mParams");
                bottomSheetsParams6 = null;
            }
            com.max.hbimage.b.K(bottomSheetsParams6.g(), b4().f131664d);
        } else {
            BottomSheetsParams bottomSheetsParams7 = this.f67266f;
            if (bottomSheetsParams7 == null) {
                f0.S("mParams");
                bottomSheetsParams7 = null;
            }
            if (bottomSheetsParams7.f() != null) {
                b4().f131672l.setVisibility(0);
                ImageView imageView = b4().f131664d;
                BottomSheetsParams bottomSheetsParams8 = this.f67266f;
                if (bottomSheetsParams8 == null) {
                    f0.S("mParams");
                    bottomSheetsParams8 = null;
                }
                Integer numF = bottomSheetsParams8.f();
                f0.m(numF);
                imageView.setImageResource(numF.intValue());
            } else {
                b4().f131672l.setVisibility(8);
            }
        }
        BottomSheetsParams bottomSheetsParams9 = this.f67266f;
        if (bottomSheetsParams9 == null) {
            f0.S("mParams");
            bottomSheetsParams9 = null;
        }
        if (bottomSheetsParams9.b() != null) {
            b4().f131666f.setVisibility(0);
            BottomSheetsParams bottomSheetsParams10 = this.f67266f;
            if (bottomSheetsParams10 == null) {
                f0.S("mParams");
            } else {
                bottomSheetsParams = bottomSheetsParams10;
            }
            com.max.hbimage.b.K(bottomSheetsParams.b(), b4().f131666f);
            q4();
            return;
        }
        BottomSheetsParams bottomSheetsParams11 = this.f67266f;
        if (bottomSheetsParams11 == null) {
            f0.S("mParams");
            bottomSheetsParams11 = null;
        }
        if (bottomSheetsParams11.a() == null) {
            b4().f131666f.setVisibility(8);
            return;
        }
        b4().f131666f.setVisibility(0);
        ImageView imageView2 = b4().f131666f;
        BottomSheetsParams bottomSheetsParams12 = this.f67266f;
        if (bottomSheetsParams12 == null) {
            f0.S("mParams");
        } else {
            bottomSheetsParams = bottomSheetsParams12;
        }
        Integer numA = bottomSheetsParams.a();
        f0.m(numA);
        imageView2.setImageResource(numA.intValue());
        q4();
    }

    public final void n4(@dl.d n0 n0Var) {
        if (PatchProxy.proxy(new Object[]{n0Var}, this, changeQuickRedirect, false, bb.c.d.Pi, new Class[]{n0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(n0Var, "<set-?>");
        this.f67265e = n0Var;
    }

    public final void o4(@dl.e View view) {
        this.f67267g = view;
    }

    @Override // fe.a, androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, bb.c.d.Qi, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        if (getArguments() != null) {
            Serializable serializable = requireArguments().getSerializable("ARG_PARAMS");
            f0.n(serializable, "null cannot be cast to non-null type com.max.hbcommon.component.bottomsheet.BottomSheetsParams");
            this.f67266f = (BottomSheetsParams) serializable;
        }
        return inflater.inflate(R.layout.layout_bottom_sheets_card_share, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31123aj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        clearValueAnimator();
    }

    @Override // com.max.hbwidget.hbdialog.animator.AnimatorBottomDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.d.Ri, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        n0 n0VarA = n0.a(view);
        f0.o(n0VarA, "bind(...)");
        n4(n0VarA);
        l4();
    }

    public final void p4(@dl.e CharSequence charSequence) {
        this.f67268h = charSequence;
    }
}
