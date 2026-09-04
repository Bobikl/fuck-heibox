package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameCommentStatsObj;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameDetailScore.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameDetailScore extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f86718h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f86719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f86720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f86721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f86722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f86723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f86724g;

    public GameDetailScore(@e Context context) {
        this(context, null);
    }

    public GameDetailScore(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameDetailScore(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public GameDetailScore(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36528, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = null;
        View viewInflate = View.inflate(getContext(), R.layout.view_game_detail_scroe_and_rule, null);
        f0.n(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.f86719b = (LinearLayout) viewInflate;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        View view2 = this.f86719b;
        if (view2 == null) {
            f0.S("vg_score_and_rule");
            view2 = null;
        }
        addView(view2, layoutParams);
        View viewInflate2 = View.inflate(getContext(), R.layout.view_game_detail_scroe_star_rating, null);
        f0.n(viewInflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.f86720c = (LinearLayout) viewInflate2;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10);
        layoutParams2.leftMargin = ViewUtils.f(getContext(), 10.0f);
        layoutParams2.addRule(1, R.id.vg_score_and_rule);
        View view3 = this.f86720c;
        if (view3 == null) {
            f0.S("vg_star_rating");
        } else {
            view = view3;
        }
        addView(view, layoutParams2);
        View viewFindViewById = findViewById(R.id.tv_score_stats);
        f0.o(viewFindViewById, "findViewById(R.id.tv_score_stats)");
        this.f86721d = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tv_score_comment);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_score_comment)");
        this.f86722e = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.vg_score_stats);
        f0.o(viewFindViewById3, "findViewById(R.id.vg_score_stats)");
        setVg_score_stats(viewFindViewById3);
        this.f86724g = ViewUtils.n(getContext(), ViewUtils.f(getContext(), 88.0f), ViewUtils.f(getContext(), 70.0f), ViewUtils.ViewType.IMAGE);
    }

    private final void b(ProgressBar progressBar, String str) {
        if (PatchProxy.proxy(new Object[]{progressBar, str}, this, changeQuickRedirect, false, 36535, new Class[]{ProgressBar.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        progressBar.setProgress((int) (n.p(str) + 0.5f));
    }

    @d
    public final View getVg_score_stats() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36526, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f86723f;
        if (view != null) {
            return view;
        }
        f0.S("vg_score_stats");
        return null;
    }

    public final void setAllStarRatingNum(@d GameCommentStatsObj gameCommentStatsObj) {
        if (PatchProxy.proxy(new Object[]{gameCommentStatsObj}, this, changeQuickRedirect, false, 36533, new Class[]{GameCommentStatsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(gameCommentStatsObj, "gameCommentStatsObj");
        String star_5 = gameCommentStatsObj.getStar_5();
        f0.o(star_5, "gameCommentStatsObj.star_5");
        String star_4 = gameCommentStatsObj.getStar_4();
        f0.o(star_4, "gameCommentStatsObj.star_4");
        String star_3 = gameCommentStatsObj.getStar_3();
        f0.o(star_3, "gameCommentStatsObj.star_3");
        String star_2 = gameCommentStatsObj.getStar_2();
        f0.o(star_2, "gameCommentStatsObj.star_2");
        String star_1 = gameCommentStatsObj.getStar_1();
        f0.o(star_1, "gameCommentStatsObj.star_1");
        setAllStarRatingNum(star_5, star_4, star_3, star_2, star_1);
    }

    public final void setAllStarRatingNum(@d String star_5, @d String star_4, @d String star_3, @d String star_2, @d String star_1) {
        if (PatchProxy.proxy(new Object[]{star_5, star_4, star_3, star_2, star_1}, this, changeQuickRedirect, false, 36534, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(star_5, "star_5");
        f0.p(star_4, "star_4");
        f0.p(star_3, "star_3");
        f0.p(star_2, "star_2");
        f0.p(star_1, "star_1");
        View viewFindViewById = findViewById(R.id.pb_star_5);
        f0.o(viewFindViewById, "findViewById(R.id.pb_star_5)");
        b((ProgressBar) viewFindViewById, star_5);
        View viewFindViewById2 = findViewById(R.id.pb_star_4);
        f0.o(viewFindViewById2, "findViewById(R.id.pb_star_4)");
        b((ProgressBar) viewFindViewById2, star_4);
        View viewFindViewById3 = findViewById(R.id.pb_star_3);
        f0.o(viewFindViewById3, "findViewById(R.id.pb_star_3)");
        b((ProgressBar) viewFindViewById3, star_3);
        View viewFindViewById4 = findViewById(R.id.pb_star_2);
        f0.o(viewFindViewById4, "findViewById(R.id.pb_star_2)");
        b((ProgressBar) viewFindViewById4, star_2);
        View viewFindViewById5 = findViewById(R.id.pb_star_1);
        f0.o(viewFindViewById5, "findViewById(R.id.pb_star_1)");
        b((ProgressBar) viewFindViewById5, star_1);
    }

    public final void setRatingNum(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36531, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f86722e;
        if (textView == null) {
            f0.S("tv_score_comment");
            textView = null;
        }
        textView.setText(r1.r(str));
    }

    public final void setScore(@d String score) {
        if (PatchProxy.proxy(new Object[]{score}, this, changeQuickRedirect, false, 36530, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(score, "score");
        TextView textView = this.f86721d;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("tv_score_stats");
            textView = null;
        }
        bb.d.d(textView, 1);
        TextView textView3 = this.f86721d;
        if (textView3 == null) {
            f0.S("tv_score_stats");
            textView3 = null;
        }
        textView3.setTextSize(1, 34.0f);
        TextView textView4 = this.f86721d;
        if (textView4 == null) {
            f0.S("tv_score_stats");
            textView4 = null;
        }
        textView4.setText(score);
        TextView textView5 = this.f86722e;
        if (textView5 == null) {
            f0.S("tv_score_comment");
        } else {
            textView2 = textView5;
        }
        textView2.setPadding(0, 0, 0, 0);
        getVg_score_stats().setBackgroundDrawable(ViewUtils.i(this.f86724g, r1.u0(getContext(), score), r1.t0(getContext(), score)));
    }

    public final void setScoreDesc(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36529, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f86721d;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("tv_score_stats");
            textView = null;
        }
        textView.setTextSize(1, 14.0f);
        TextView textView3 = this.f86721d;
        if (textView3 == null) {
            f0.S("tv_score_stats");
            textView3 = null;
        }
        textView3.setText(str);
        TextView textView4 = this.f86722e;
        if (textView4 == null) {
            f0.S("tv_score_comment");
        } else {
            textView2 = textView4;
        }
        textView2.setPadding(0, ViewUtils.f(getContext(), 7.0f), 0, 0);
        getVg_score_stats().setBackgroundDrawable(ViewUtils.i(this.f86724g, getContext().getResources().getColor(R.color.user_level_1_start), getContext().getResources().getColor(R.color.user_level_1_end)));
    }

    public final void setVg_score_stats(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36527, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f86723f = view;
    }

    public final void setW2PNum(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36532, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f86722e;
        if (textView == null) {
            f0.S("tv_score_comment");
            textView = null;
        }
        textView.setText(r1.z(str));
    }
}
