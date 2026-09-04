package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import bb.d;
import com.max.hbcommon.utils.c;
import com.max.hbcustomview.spans.g;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.HeroMmrObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import lb.b;

/* JADX INFO: compiled from: Dota2HeroMmrView.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nDota2HeroMmrView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dota2HeroMmrView.kt\ncom/max/xiaoheihe/module/game/component/dota2/Dota2HeroMmrView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,128:1\n304#2,2:129\n304#2,2:131\n262#2,2:133\n262#2,2:135\n*S KotlinDebug\n*F\n+ 1 Dota2HeroMmrView.kt\ncom/max/xiaoheihe/module/game/component/dota2/Dota2HeroMmrView\n*L\n95#1:129,2\n96#1:131,2\n99#1:133,2\n100#1:135,2\n*E\n"})
@o(parameters = 0)
public final class Dota2HeroMmrView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f87111e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f87112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f87113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f87114d;

    public Dota2HeroMmrView(@e Context context) {
        this(context, null);
    }

    public Dota2HeroMmrView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Dota2HeroMmrView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Dota2HeroMmrView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37181, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Typeface typefaceB = d.a().b(2);
        TextView textView = new TextView(getContext());
        this.f87112b = textView;
        textView.setId(R.id.tv_rank);
        TextView textView2 = this.f87112b;
        TextView textView3 = null;
        if (textView2 == null) {
            f0.S("tv_rank");
            textView2 = null;
        }
        textView2.setTextColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.white));
        TextView textView4 = this.f87112b;
        if (textView4 == null) {
            f0.S("tv_rank");
            textView4 = null;
        }
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.f87112b;
        if (textView5 == null) {
            f0.S("tv_rank");
            textView5 = null;
        }
        textView5.setMaxLines(1);
        TextView textView6 = this.f87112b;
        if (textView6 == null) {
            f0.S("tv_rank");
            textView6 = null;
        }
        textView6.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView7 = this.f87112b;
        if (textView7 == null) {
            f0.S("tv_rank");
            textView7 = null;
        }
        textView7.setTypeface(typefaceB);
        TextView textView8 = this.f87112b;
        if (textView8 == null) {
            f0.S("tv_rank");
            textView8 = null;
        }
        textView8.setGravity(16);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = ViewUtils.f(getContext(), 3.0f);
        TextView textView9 = this.f87112b;
        if (textView9 == null) {
            f0.S("tv_rank");
            textView9 = null;
        }
        textView9.setLayoutParams(layoutParams);
        TextView textView10 = this.f87112b;
        if (textView10 == null) {
            f0.S("tv_rank");
            textView10 = null;
        }
        addView(textView10);
        TextView textView11 = new TextView(getContext());
        this.f87113c = textView11;
        textView11.setTextColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.white));
        TextView textView12 = this.f87113c;
        if (textView12 == null) {
            f0.S("tv_delta");
            textView12 = null;
        }
        textView12.setTextSize(1, 8.0f);
        TextView textView13 = this.f87113c;
        if (textView13 == null) {
            f0.S("tv_delta");
            textView13 = null;
        }
        textView13.setMaxLines(1);
        TextView textView14 = this.f87113c;
        if (textView14 == null) {
            f0.S("tv_delta");
            textView14 = null;
        }
        textView14.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView15 = this.f87113c;
        if (textView15 == null) {
            f0.S("tv_delta");
            textView15 = null;
        }
        textView15.setTypeface(typefaceB);
        TextView textView16 = this.f87113c;
        if (textView16 == null) {
            f0.S("tv_delta");
            textView16 = null;
        }
        textView16.setGravity(16);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(17, R.id.tv_rank);
        layoutParams2.addRule(6, R.id.tv_rank);
        layoutParams2.addRule(8, R.id.tv_rank);
        layoutParams2.setMarginStart(ViewUtils.f(getContext(), 1.0f));
        TextView textView17 = this.f87113c;
        if (textView17 == null) {
            f0.S("tv_delta");
            textView17 = null;
        }
        textView17.setLayoutParams(layoutParams2);
        TextView textView18 = this.f87113c;
        if (textView18 == null) {
            f0.S("tv_delta");
            textView18 = null;
        }
        addView(textView18);
        TextView textView19 = new TextView(getContext());
        this.f87114d = textView19;
        textView19.setTextColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.white_alpha50));
        TextView textView20 = this.f87114d;
        if (textView20 == null) {
            f0.S("tv_percent");
            textView20 = null;
        }
        textView20.setTextSize(1, 10.0f);
        TextView textView21 = this.f87114d;
        if (textView21 == null) {
            f0.S("tv_percent");
            textView21 = null;
        }
        textView21.setMaxLines(1);
        TextView textView22 = this.f87114d;
        if (textView22 == null) {
            f0.S("tv_percent");
            textView22 = null;
        }
        textView22.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView23 = this.f87114d;
        if (textView23 == null) {
            f0.S("tv_percent");
            textView23 = null;
        }
        textView23.setTypeface(typefaceB);
        TextView textView24 = this.f87114d;
        if (textView24 == null) {
            f0.S("tv_percent");
            textView24 = null;
        }
        textView24.setGravity(16);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(3, R.id.tv_rank);
        TextView textView25 = this.f87114d;
        if (textView25 == null) {
            f0.S("tv_percent");
            textView25 = null;
        }
        textView25.setLayoutParams(layoutParams3);
        TextView textView26 = this.f87114d;
        if (textView26 == null) {
            f0.S("tv_percent");
        } else {
            textView3 = textView26;
        }
        addView(textView3);
    }

    public final void setData(@e HeroMmrObj heroMmrObj) {
        if (PatchProxy.proxy(new Object[]{heroMmrObj}, this, changeQuickRedirect, false, 37182, new Class[]{HeroMmrObj.class}, Void.TYPE).isSupported || heroMmrObj == null) {
            return;
        }
        TextView textView = null;
        if (!c.u(heroMmrObj.is_grading())) {
            TextView textView2 = this.f87112b;
            if (textView2 == null) {
                f0.S("tv_rank");
                textView2 = null;
            }
            textView2.setVisibility(8);
            TextView textView3 = this.f87113c;
            if (textView3 == null) {
                f0.S("tv_delta");
                textView3 = null;
            }
            textView3.setVisibility(8);
            TextView textView4 = this.f87114d;
            if (textView4 == null) {
                f0.S("tv_percent");
            } else {
                textView = textView4;
            }
            textView.setText(heroMmrObj.is_grading());
            return;
        }
        TextView textView5 = this.f87112b;
        if (textView5 == null) {
            f0.S("tv_rank");
            textView5 = null;
        }
        textView5.setVisibility(0);
        TextView textView6 = this.f87113c;
        if (textView6 == null) {
            f0.S("tv_delta");
            textView6 = null;
        }
        textView6.setVisibility(0);
        TextView textView7 = this.f87112b;
        if (textView7 == null) {
            f0.S("tv_rank");
            textView7 = null;
        }
        textView7.setText(heroMmrObj.getMmr());
        TextView textView8 = this.f87114d;
        if (textView8 == null) {
            f0.S("tv_percent");
            textView8 = null;
        }
        textView8.setText(heroMmrObj.getRank());
        if (c.u(heroMmrObj.getDelta())) {
            TextView textView9 = this.f87113c;
            if (textView9 == null) {
                f0.S("tv_delta");
            } else {
                textView = textView9;
            }
            textView.setVisibility(8);
            return;
        }
        TextView textView10 = this.f87113c;
        if (textView10 == null) {
            f0.S("tv_delta");
            textView10 = null;
        }
        textView10.setVisibility(0);
        TextView textView11 = this.f87113c;
        if (textView11 == null) {
            f0.S("tv_delta");
            textView11 = null;
        }
        textView11.setTextColor(com.max.xiaoheihe.utils.d.e1(heroMmrObj.getColor()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(n.q(heroMmrObj.getDelta()) > 0 ? b.f131095k : b.f131094j);
        sb2.append(Math.abs(n.q(heroMmrObj.getDelta())));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        spannableStringBuilder.setSpan(new g(d.a().b(0)), 0, 1, 33);
        TextView textView12 = this.f87113c;
        if (textView12 == null) {
            f0.S("tv_delta");
        } else {
            textView = textView12;
        }
        textView.setText(spannableStringBuilder);
    }
}
