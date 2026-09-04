package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.GradientTextView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.wf0;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: GameFollowWithNumView.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameFollowWithNumView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameFollowWithNumView.kt\ncom/max/xiaoheihe/module/game/component/GameFollowWithNumView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,100:1\n262#2,2:101\n262#2,2:103\n*S KotlinDebug\n*F\n+ 1 GameFollowWithNumView.kt\ncom/max/xiaoheihe/module/game/component/GameFollowWithNumView\n*L\n56#1:101,2\n97#1:103,2\n*E\n"})
@o(parameters = 0)
public final class GameFollowWithNumView extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f86732l = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public wf0 f86733k;

    public GameFollowWithNumView(@e Context context) {
        this(context, null);
    }

    public GameFollowWithNumView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameFollowWithNumView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        h();
    }

    private final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36551, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        f0.o(context, "context");
        setRadius(com.max.accelworld.c.a(3.0f, context));
        setCardElevation(0.0f);
        setCardBackgroundColor(l.h(getContext(), R.color.white_alpha20));
        Context context2 = getContext();
        f0.o(context2, "context");
        wf0 wf0VarB = wf0.b(kb.c.d(context2), this);
        f0.o(wf0VarB, "inflate(context.layoutInflater(), this)");
        setBinding(wf0VarB);
    }

    private final void j(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36553, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getBinding().f117175e.setText(r1.p(str));
        TextView textView = getBinding().f117176f;
        f0.o(textView, "binding.tvFollowNumUnit");
        textView.setVisibility(n.p(str) >= 10000.0f ? 0 : 8);
    }

    @d
    public final wf0 getBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36549, new Class[0], wf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (wf0) patchProxyResultProxy.result;
        }
        wf0 wf0Var = this.f86733k;
        if (wf0Var != null) {
            return wf0Var;
        }
        f0.S("binding");
        return null;
    }

    public final void i(@e String str, @e String str2, @e String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 36552, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = getBinding().f117179i;
        f0.o(linearLayout, "binding.vgFollowNumContainer");
        ImageView imageView = getBinding().f117172b;
        f0.o(imageView, "binding.ivFollowIcon");
        GradientTextView gradientTextView = getBinding().f117174d;
        f0.o(gradientTextView, "binding.tvFollowDesc");
        TextView textView = getBinding().f117175e;
        f0.o(textView, "binding.tvFollowNum");
        TextView textView2 = getBinding().f117176f;
        f0.o(textView2, "binding.tvFollowNumUnit");
        RelativeLayout relativeLayout = getBinding().f117180j;
        f0.o(relativeLayout, "binding.vgRank");
        ImageView imageView2 = getBinding().f117173c;
        f0.o(imageView2, "binding.ivTritangle");
        GradientTextView gradientTextView2 = getBinding().f117177g;
        f0.o(gradientTextView2, "binding.tvRank");
        imageView2.setVisibility(8);
        if (f0.g("unfollowing", str)) {
            setCardBackgroundColor(l.h(getContext(), R.color.white_alpha20));
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white_alpha90));
            textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white_alpha90));
            linearLayout.setBackgroundResource(R.color.white_alpha30);
            com.max.xiaoheihe.accelworld.c.c(imageView, getContext().getResources().getColor(R.color.white_alpha70));
            gradientTextView.setColors(com.max.xiaoheihe.utils.d.E(R.color.white_alpha70), com.max.xiaoheihe.utils.d.E(R.color.white_alpha70));
            gradientTextView.setText(getContext().getResources().getText(R.string.follow));
            gradientTextView2.setColors(com.max.xiaoheihe.utils.d.E(R.color.white_alpha70), com.max.xiaoheihe.utils.d.E(R.color.white_alpha70));
        } else {
            setCardBackgroundColor(l.h(getContext(), R.color.white));
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            linearLayout.setBackground(ViewUtils.i(0, com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_start_color), com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_end_color)));
            imageView.clearColorFilter();
            imageView.setAlpha(1.0f);
            imageView.setImageResource(R.drawable.game_follow_gradient_red_30x30);
            gradientTextView.setColors(com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_start_color), com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_end_color));
            gradientTextView.setText(getContext().getResources().getText(R.string.has_followed));
            gradientTextView2.setColors(com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_start_color), com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_end_color));
        }
        if (com.max.hbcommon.utils.c.u(str3)) {
            relativeLayout.setVisibility(8);
        } else {
            relativeLayout.setVisibility(0);
            f0.m(str3);
            gradientTextView2.setTextSize(1, str3.length() <= 1 ? 7 : 8);
            gradientTextView2.setText('#' + str3);
        }
        j(str2);
    }

    public final void setBinding(@d wf0 wf0Var) {
        if (PatchProxy.proxy(new Object[]{wf0Var}, this, changeQuickRedirect, false, 36550, new Class[]{wf0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(wf0Var, "<set-?>");
        this.f86733k = wf0Var;
    }
}
