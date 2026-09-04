package com.max.xiaoheihe.module.team;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.core.view.ViewGroupKt;
import com.max.hbcommon.utils.l;
import com.max.hbcustomview.CubicBezierInterpolators;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import df.rb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TeamDialogFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class c extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    public static final a f92386m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f92387n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final String f92388o = "ARG_WEB_PROTOCOL";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private rb f92389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private WebProtocolObj f92390k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private ArrayList<ValueAnimator> f92391l;

    /* JADX INFO: compiled from: TeamDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final c a(@dl.d WebProtocolObj protocol) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{protocol}, this, changeQuickRedirect, false, 44295, new Class[]{WebProtocolObj.class}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            f0.p(protocol, "protocol");
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putSerializable(c.f92388o, protocol);
            cVar.setArguments(bundle);
            return cVar;
        }
    }

    /* JADX INFO: compiled from: TeamDialogFragment.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44296, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            c.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.team.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TeamDialogFragment.kt */
    public static final class ViewOnClickListenerC0869c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        ViewOnClickListenerC0869c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44297, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            c.this.dismiss();
            Context context = c.this.getContext();
            if (context != null) {
                c cVar = c.this;
                com.max.xiaoheihe.module.team.b bVar = com.max.xiaoheihe.module.team.b.f92383a;
                WebProtocolObj webProtocolObj = cVar.f92390k;
                WebProtocolObj webProtocolObj2 = null;
                if (webProtocolObj == null) {
                    f0.S("mProtocol");
                    webProtocolObj = null;
                }
                String strValueOf = webProtocolObj.valueOf("room_id");
                WebProtocolObj webProtocolObj3 = cVar.f92390k;
                if (webProtocolObj3 == null) {
                    f0.S("mProtocol");
                    webProtocolObj3 = null;
                }
                String strValueOf2 = webProtocolObj3.valueOf("channel_id");
                WebProtocolObj webProtocolObj4 = cVar.f92390k;
                if (webProtocolObj4 == null) {
                    f0.S("mProtocol");
                } else {
                    webProtocolObj2 = webProtocolObj4;
                }
                bVar.c(context, strValueOf, strValueOf2, webProtocolObj2.valueOf("link_id"));
            }
        }
    }

    /* JADX INFO: compiled from: TeamDialogFragment.kt */
    public static final class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44298, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            c.X3(c.this);
            com.max.hbcommon.utils.d.b("zzzzteam", "startUserAnim");
            if (c.this.isActive()) {
                rb rbVar = c.this.f92389j;
                if (rbVar == null) {
                    f0.S("binding");
                    rbVar = null;
                }
                rbVar.f115168j.postDelayed(this, 800L);
            }
        }
    }

    /* JADX INFO: compiled from: TeamDialogFragment.kt */
    public static final class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f92395b = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: TeamDialogFragment.kt */
    public static final class f implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f92396b;

        f(View view) {
            this.f92396b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44299, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Object animatedValue = it.getAnimatedValue();
            f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            this.f92396b.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    /* JADX INFO: compiled from: TeamDialogFragment.kt */
    public static final class g implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f92397b;

        g(View view) {
            this.f92397b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44300, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Object animatedValue = it.getAnimatedValue();
            f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            this.f92397b.setScaleX(fFloatValue);
            this.f92397b.setScaleY(fFloatValue);
        }
    }

    /* JADX INFO: compiled from: TeamDialogFragment.kt */
    public static final class h extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f92398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f92399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f92400d;

        h(boolean z10, c cVar, View view) {
            this.f92398b = z10;
            this.f92399c = cVar;
            this.f92400d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 44301, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            super.onAnimationEnd(animation);
            if (this.f92398b) {
                return;
            }
            rb rbVar = this.f92399c.f92389j;
            if (rbVar == null) {
                f0.S("binding");
                rbVar = null;
            }
            rbVar.f115168j.removeView(this.f92400d);
        }
    }

    /* JADX INFO: compiled from: TeamDialogFragment.kt */
    public static final class i implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f92401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f92402c;

        i(View view, Ref.IntRef intRef) {
            this.f92401b = view;
            this.f92402c = intRef;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44302, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Object animatedValue = it.getAnimatedValue();
            f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) animatedValue).intValue();
            ViewGroup.LayoutParams layoutParams = this.f92401b.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.rightMargin = this.f92402c.f124889b - iIntValue;
            this.f92401b.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: compiled from: TeamDialogFragment.kt */
    public static final class j implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44303, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Object animatedValue = it.getAnimatedValue();
            f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            rb rbVar = c.this.f92389j;
            if (rbVar == null) {
                f0.S("binding");
                rbVar = null;
            }
            rbVar.f115162d.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: compiled from: TeamDialogFragment.kt */
    public static final class k implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44304, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Object animatedValue = it.getAnimatedValue();
            f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            rb rbVar = c.this.f92389j;
            rb rbVar2 = null;
            if (rbVar == null) {
                f0.S("binding");
                rbVar = null;
            }
            rbVar.f115162d.setScaleX(fFloatValue);
            rb rbVar3 = c.this.f92389j;
            if (rbVar3 == null) {
                f0.S("binding");
            } else {
                rbVar2 = rbVar3;
            }
            rbVar2.f115162d.setScaleY(fFloatValue);
        }
    }

    public static final /* synthetic */ void X3(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, 44294, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.e4();
    }

    private final void Y3(boolean z10, String str, int i10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str, new Integer(i10)}, this, changeQuickRedirect, false, 44286, new Class[]{Boolean.TYPE, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        QMUIRadiusImageView qMUIRadiusImageView = new QMUIRadiusImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewUtils.f(getContext(), 22.0f), ViewUtils.f(getContext(), 22.0f));
        layoutParams.rightMargin = i10 * ViewUtils.f(getContext(), 18.0f);
        layoutParams.gravity = 5;
        qMUIRadiusImageView.setCircle(true);
        qMUIRadiusImageView.setBorderWidth(ViewUtils.f(getContext(), 1.0f));
        qMUIRadiusImageView.setBorderColor(-1);
        qMUIRadiusImageView.setTag(R.id.vg_user, str);
        if (z10) {
            qMUIRadiusImageView.setAlpha(0.0f);
            qMUIRadiusImageView.setScaleX(0.2f);
            qMUIRadiusImageView.setScaleY(0.2f);
        }
        rb rbVar = this.f92389j;
        if (rbVar == null) {
            f0.S("binding");
            rbVar = null;
        }
        rbVar.f115168j.addView(qMUIRadiusImageView, layoutParams);
        com.max.hbimage.b.K(str, qMUIRadiusImageView);
    }

    private final void Z3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44284, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        Context context2 = getContext();
        rb rbVar = this.f92389j;
        rb rbVar2 = null;
        if (rbVar == null) {
            f0.S("binding");
            rbVar = null;
        }
        float fH0 = ViewUtils.h0(context, ViewUtils.o(context2, rbVar.f115160b));
        rb rbVar3 = this.f92389j;
        if (rbVar3 == null) {
            f0.S("binding");
            rbVar3 = null;
        }
        rbVar3.f115160b.setBackground(q.E(getContext(), R.color.team_chat_bg, fH0));
        Context context3 = getContext();
        Context context4 = getContext();
        rb rbVar4 = this.f92389j;
        if (rbVar4 == null) {
            f0.S("binding");
            rbVar4 = null;
        }
        float fH1 = ViewUtils.h0(context3, ViewUtils.o(context4, rbVar4.f115166h));
        rb rbVar5 = this.f92389j;
        if (rbVar5 == null) {
            f0.S("binding");
            rbVar5 = null;
        }
        rbVar5.f115166h.setBackground(q.o(getContext(), R.color.team_chat_interactive, fH1));
        rb rbVar6 = this.f92389j;
        if (rbVar6 == null) {
            f0.S("binding");
            rbVar6 = null;
        }
        TextView textView = rbVar6.f115165g;
        WebProtocolObj webProtocolObj = this.f92390k;
        if (webProtocolObj == null) {
            f0.S("mProtocol");
            webProtocolObj = null;
        }
        textView.setText(webProtocolObj.valueOf("title"));
        rb rbVar7 = this.f92389j;
        if (rbVar7 == null) {
            f0.S("binding");
            rbVar7 = null;
        }
        TextView textView2 = rbVar7.f115163e;
        WebProtocolObj webProtocolObj2 = this.f92390k;
        if (webProtocolObj2 == null) {
            f0.S("mProtocol");
            webProtocolObj2 = null;
        }
        textView2.setText(webProtocolObj2.valueOf(SocialConstants.PARAM_APP_DESC));
        rb rbVar8 = this.f92389j;
        if (rbVar8 == null) {
            f0.S("binding");
            rbVar8 = null;
        }
        rbVar8.f115161c.setOnClickListener(new b());
        rb rbVar9 = this.f92389j;
        if (rbVar9 == null) {
            f0.S("binding");
            rbVar9 = null;
        }
        rbVar9.f115166h.setOnClickListener(new ViewOnClickListenerC0869c());
        d4();
        WebProtocolObj webProtocolObj3 = this.f92390k;
        if (webProtocolObj3 == null) {
            f0.S("mProtocol");
            webProtocolObj3 = null;
        }
        List<? extends BBSUserInfoObj> listListOf = webProtocolObj3.listOf("users", BBSUserInfoObj.class);
        if (com.max.hbcommon.utils.c.w(listListOf)) {
            rb rbVar10 = this.f92389j;
            if (rbVar10 == null) {
                f0.S("binding");
            } else {
                rbVar2 = rbVar10;
            }
            rbVar2.f115168j.setVisibility(8);
            return;
        }
        rb rbVar11 = this.f92389j;
        if (rbVar11 == null) {
            f0.S("binding");
            rbVar11 = null;
        }
        rbVar11.f115168j.setVisibility(0);
        f0.m(listListOf);
        a4(listListOf);
        rb rbVar12 = this.f92389j;
        if (rbVar12 == null) {
            f0.S("binding");
            rbVar12 = null;
        }
        if (rbVar12.f115168j.getChildCount() > 1) {
            d dVar = new d();
            rb rbVar13 = this.f92389j;
            if (rbVar13 == null) {
                f0.S("binding");
            } else {
                rbVar2 = rbVar13;
            }
            rbVar2.f115168j.postDelayed(dVar, 800L);
        }
    }

    private final void a4(List<? extends BBSUserInfoObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 44285, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        rb rbVar = this.f92389j;
        if (rbVar == null) {
            f0.S("binding");
            rbVar = null;
        }
        rbVar.f115168j.removeAllViews();
        int iB = fi.u.B(list.size(), 3);
        for (int i10 = 0; i10 < iB; i10++) {
            String avatar = list.get(i10).getAvatar();
            f0.o(avatar, "user.avatar");
            Y3(false, avatar, i10);
        }
    }

    private final void b4(View view, boolean z10) {
        ValueAnimator alphaAnimator;
        ValueAnimator scaleAnimator;
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44290, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        float[] fArr = {1.0f, 0.0f};
        if (z10) {
            // fill-array-data instruction
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            alphaAnimator = ValueAnimator.ofFloat(fArr);
        } else {
            alphaAnimator = ValueAnimator.ofFloat(fArr);
        }
        alphaAnimator.addUpdateListener(new f(view));
        float[] fArr2 = {1.0f, 0.2f};
        if (z10) {
            // fill-array-data instruction
            fArr2[0] = 0.2f;
            fArr2[1] = 1.0f;
            scaleAnimator = ValueAnimator.ofFloat(fArr2);
        } else {
            scaleAnimator = ValueAnimator.ofFloat(fArr2);
        }
        scaleAnimator.addUpdateListener(new g(view));
        f0.o(alphaAnimator, "alphaAnimator");
        addValueAnimator(alphaAnimator);
        f0.o(scaleAnimator, "scaleAnimator");
        addValueAnimator(scaleAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(CubicBezierInterpolators.a(CubicBezierInterpolators.Type.EASE_OUT));
        animatorSet.playTogether(alphaAnimator, scaleAnimator);
        animatorSet.addListener(new h(z10, this, view));
        animatorSet.start();
    }

    private final void c4(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44289, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.f124889b = ((FrameLayout.LayoutParams) layoutParams).rightMargin;
        ValueAnimator animator = ValueAnimator.ofInt(0, ViewUtils.f(getContext(), 18.0f));
        animator.addUpdateListener(new i(view, intRef));
        animator.setDuration(300L);
        animator.setInterpolator(CubicBezierInterpolators.a(CubicBezierInterpolators.Type.EASE_OUT));
        animator.start();
        f0.o(animator, "animator");
        addValueAnimator(animator);
    }

    private final void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44291, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator alphaAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
        alphaAnimator.addUpdateListener(new j());
        ValueAnimator scaleAnimator = ValueAnimator.ofFloat(0.1f, 1.0f);
        scaleAnimator.addUpdateListener(new k());
        f0.o(alphaAnimator, "alphaAnimator");
        addValueAnimator(alphaAnimator);
        f0.o(scaleAnimator, "scaleAnimator");
        addValueAnimator(scaleAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(480L);
        animatorSet.setDuration(480L);
        animatorSet.setInterpolator(new com.max.hbcustomview.shinebuttonlib.a(0.4f));
        animatorSet.playTogether(alphaAnimator, scaleAnimator);
        animatorSet.start();
    }

    private final void e4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44288, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        rb rbVar = this.f92389j;
        if (rbVar == null) {
            f0.S("binding");
            rbVar = null;
        }
        if (rbVar.f115168j.getChildCount() < 2 || !isActive()) {
            return;
        }
        rb rbVar2 = this.f92389j;
        if (rbVar2 == null) {
            f0.S("binding");
            rbVar2 = null;
        }
        FrameLayout frameLayout = rbVar2.f115168j;
        f0.o(frameLayout, "binding.vgUser");
        Object tag = ViewGroupKt.d(frameLayout, 0).getTag(R.id.vg_user);
        f0.n(tag, "null cannot be cast to non-null type kotlin.String");
        String str = (String) tag;
        rb rbVar3 = this.f92389j;
        if (rbVar3 == null) {
            f0.S("binding");
            rbVar3 = null;
        }
        Y3(true, str, rbVar3.f115168j.getChildCount() - 1);
        rb rbVar4 = this.f92389j;
        if (rbVar4 == null) {
            f0.S("binding");
            rbVar4 = null;
        }
        FrameLayout frameLayout2 = rbVar4.f115168j;
        f0.o(frameLayout2, "binding.vgUser");
        b4(ViewGroupKt.d(frameLayout2, 0), false);
        rb rbVar5 = this.f92389j;
        if (rbVar5 == null) {
            f0.S("binding");
            rbVar5 = null;
        }
        FrameLayout frameLayout3 = rbVar5.f115168j;
        f0.o(frameLayout3, "binding.vgUser");
        rb rbVar6 = this.f92389j;
        if (rbVar6 == null) {
            f0.S("binding");
            rbVar6 = null;
        }
        b4(ViewGroupKt.d(frameLayout3, rbVar6.f115168j.getChildCount() - 1), true);
        rb rbVar7 = this.f92389j;
        if (rbVar7 == null) {
            f0.S("binding");
            rbVar7 = null;
        }
        int childCount = rbVar7.f115168j.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (i10 != 0) {
                rb rbVar8 = this.f92389j;
                if (rbVar8 == null) {
                    f0.S("binding");
                    rbVar8 = null;
                }
                if (i10 != rbVar8.f115168j.getChildCount() - 1) {
                    rb rbVar9 = this.f92389j;
                    if (rbVar9 == null) {
                        f0.S("binding");
                        rbVar9 = null;
                    }
                    FrameLayout frameLayout4 = rbVar9.f115168j;
                    f0.o(frameLayout4, "binding.vgUser");
                    c4(ViewGroupKt.d(frameLayout4, i10));
                }
            }
        }
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    public final void addValueAnimator(@dl.d ValueAnimator valueAnimator) {
        if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 44292, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(valueAnimator, "valueAnimator");
        if (this.f92391l == null) {
            this.f92391l = new ArrayList<>();
        }
        ArrayList<ValueAnimator> arrayList = this.f92391l;
        if (arrayList != null) {
            arrayList.add(valueAnimator);
        }
    }

    public final void clearValueAnimator() {
        ArrayList<ValueAnimator> arrayList;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44293, new Class[0], Void.TYPE).isSupported || (arrayList = this.f92391l) == null) {
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
        this.f92391l = null;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 44282, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        if (getArguments() != null) {
            Serializable serializable = requireArguments().getSerializable(f92388o);
            f0.n(serializable, "null cannot be cast to non-null type com.max.xiaoheihe.bean.WebProtocolObj");
            this.f92390k = (WebProtocolObj) serializable;
        }
        return inflater.inflate(R.layout.fragment_team_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44287, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        clearValueAnimator();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 44283, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        rb rbVarA = rb.a(view);
        f0.o(rbVarA, "bind(view)");
        this.f92389j = rbVarA;
        view.setOnClickListener(e.f92395b);
        setCancelable(false);
        this.f66927e.setEnableGesture(false);
        Dialog dialog = getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window != null) {
            window.setNavigationBarColor(l.a(R.color.team_chat_bg));
        }
        Z3();
    }
}
