package com.max.xiaoheihe.module.game.component;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.flexbox.FlexboxLayout;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.hbutils.utils.w;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.GamePriceObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.game.adapter.u;
import com.max.xiaoheihe.module.game.d0;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.utils.d;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import yh.l;

/* JADX INFO: compiled from: GameItemView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameItemView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f86750s = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CardView f86751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f86752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayout f86753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RelativeLayout f86754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f86755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f86756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f86757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FrameLayout f86758i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f86759j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f86760k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f86761l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f86762m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ViewGroup f86763n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f86764o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f86765p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f86766q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.e
    private LinearLayout f86767r;

    /* JADX INFO: compiled from: GameItemView.kt */
    public static final class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LineChart f86768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameItemView f86769c;

        a(LineChart lineChart, GameItemView gameItemView) {
            this.f86768b = lineChart;
            this.f86769c = gameItemView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36613, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f86768b.requestLayout();
            int iL = (ViewUtils.L(this.f86769c.getContext()) - ViewUtils.f(this.f86769c.getContext(), 166.0f)) - ViewUtils.W(this.f86769c.getVg_trend());
            ViewGroup.LayoutParams layoutParams = this.f86769c.getTv_name().getLayoutParams();
            if (layoutParams == null || ViewUtils.W(this.f86769c.getTv_name()) <= iL) {
                return;
            }
            layoutParams.width = iL;
        }
    }

    /* JADX INFO: compiled from: GameItemView.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f86771c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f86772d;

        /* JADX INFO: compiled from: GameItemView.kt */
        public static final class a implements r1.a1 {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f86773a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameObj f86774b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ GameItemView f86775c;

            a(String str, GameObj gameObj, GameItemView gameItemView) {
                this.f86773a = str;
                this.f86774b = gameObj;
                this.f86775c = gameItemView;
            }

            @Override // com.max.xiaoheihe.module.game.r1.a1
            public void onError() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36616, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f86775c.c(this.f86774b);
            }

            @Override // com.max.xiaoheihe.module.game.r1.a1
            public void onSuccess() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36615, new Class[0], Void.TYPE).isSupported && f0.g("calendar", this.f86773a) && f0.g("following", this.f86774b.getFollow_state())) {
                    GameItemView.a(this.f86775c, this.f86774b);
                }
            }
        }

        b(GameObj gameObj, String str) {
            this.f86771c = gameObj;
            this.f86772d = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36614, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameItemView.this.c(this.f86771c);
            r1.D(r1.Z(this.f86771c), this.f86771c.getFollow_state(), new a(this.f86772d, this.f86771c, GameItemView.this));
        }
    }

    /* JADX INFO: compiled from: GameItemView.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameObj f86776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameItemView f86777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f86778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f86779e;

        c(GameObj gameObj, GameItemView gameItemView, String str, View.OnClickListener onClickListener) {
            this.f86776b = gameObj;
            this.f86777c = gameItemView;
            this.f86778d = str;
            this.f86779e = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36617, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.hbcommon.utils.c.u(this.f86776b.getProtocol())) {
                this.f86777c.getContext().startActivity(ChannelsDetailActivity.e3(z.b(this.f86777c.getContext(), this.f86776b.getH_src(), r1.Z(this.f86776b), this.f86776b.getGame_type(), null, i0.m(), i0.j(), null), this.f86778d));
            } else {
                Context context = this.f86777c.getContext();
                f0.o(context, "context");
                com.max.xiaoheihe.base.router.b.j0(context, this.f86776b.getProtocol());
            }
            View.OnClickListener onClickListener = this.f86779e;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: compiled from: GameItemView.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f86780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameItemView f86781c;

        d(String str, GameItemView gameItemView) {
            this.f86780b = str;
            this.f86781c = gameItemView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36618, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.base.c cVarL4 = d0.l4(this.f86780b, "switch");
            if (this.f86781c.getContext() instanceof AppCompatActivity) {
                Context context = this.f86781c.getContext();
                f0.n(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                cVarL4.M3(((AppCompatActivity) context).getSupportFragmentManager(), "GameGlobalPrices");
            }
        }
    }

    /* JADX INFO: compiled from: GameItemView.kt */
    public static final class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f86782b = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@dl.e View view) {
        }
    }

    public GameItemView(@dl.e Context context) {
        this(context, null);
    }

    public GameItemView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameItemView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public GameItemView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        b();
    }

    public static final /* synthetic */ void a(GameItemView gameItemView, GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{gameItemView, gameObj}, null, changeQuickRedirect, true, 36612, new Class[]{GameItemView.class, GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameItemView.k(gameObj);
    }

    private final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36599, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = View.inflate(getContext(), R.layout.component_game_img, null);
        f0.n(viewInflate, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        setCv_img((CardView) viewInflate);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewUtils.f(getContext(), 128.0f), ViewUtils.f(getContext(), 64.0f));
        getCv_img().setRadius(ViewUtils.n(getContext(), layoutParams.width, layoutParams.height, ViewUtils.ViewType.IMAGE));
        addView(getCv_img(), layoutParams);
        setTv_name(new TextView(getContext()));
        getTv_name().setId(R.id.tv_name);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, ViewUtils.f(getContext(), 20.0f));
        layoutParams2.addRule(6, R.id.cv_img);
        layoutParams2.leftMargin = ViewUtils.f(getContext(), 10.0f);
        layoutParams2.rightMargin = ViewUtils.f(getContext(), 10.0f);
        layoutParams2.topMargin = ViewUtils.f(getContext(), 8.0f);
        layoutParams2.addRule(0, R.id.vg_max_online);
        layoutParams2.addRule(1, R.id.cv_img);
        getTv_name().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        getTv_name().setEllipsize(TextUtils.TruncateAt.END);
        getTv_name().setMaxLines(1);
        getTv_name().setGravity(16);
        getTv_name().setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
        getTv_name().setTextSize(1, 14.0f);
        addView(getTv_name(), layoutParams2);
        setVg_special_tags(new LinearLayout(getContext()));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = ViewUtils.f(getContext(), 10.0f);
        layoutParams3.addRule(1, R.id.cv_img);
        getVg_special_tags().setOrientation(0);
        getVg_special_tags().setPadding(0, 0, 0, ViewUtils.f(getContext(), 2.0f));
        getVg_special_tags().setVisibility(8);
        addView(getVg_special_tags(), layoutParams3);
        View viewInflate2 = View.inflate(getContext(), R.layout.view_game_item_bottom, null);
        f0.n(viewInflate2, "null cannot be cast to non-null type android.widget.RelativeLayout");
        setVg_bottom((RelativeLayout) viewInflate2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(8, R.id.cv_img);
        layoutParams4.addRule(1, R.id.cv_img);
        layoutParams4.leftMargin = ViewUtils.f(getContext(), 10.0f);
        layoutParams4.bottomMargin = ViewUtils.f(getContext(), 11.0f);
        addView(getVg_bottom(), layoutParams4);
        View viewInflate3 = View.inflate(getContext(), R.layout.view_game_item_trend, null);
        f0.n(viewInflate3, "null cannot be cast to non-null type android.widget.LinearLayout");
        setVg_trend((LinearLayout) viewInflate3);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(11);
        layoutParams5.addRule(15);
        getVg_trend().setTranslationY(ViewUtils.f(getContext(), 8.0f));
        getVg_trend().setVisibility(8);
        addView(getVg_trend(), layoutParams5);
        setTv_all_price(new TextView(getContext()));
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, ViewUtils.f(getContext(), 15.0f));
        layoutParams6.addRule(8, R.id.cv_img);
        layoutParams6.addRule(1, R.id.cv_img);
        layoutParams6.leftMargin = ViewUtils.f(getContext(), 10.0f);
        getTv_all_price().setTextColor(getContext().getResources().getColor(R.color.text_primary_2_color));
        getTv_all_price().setTextSize(1, 11.0f);
        getTv_all_price().setVisibility(8);
        getTv_all_price().setGravity(17);
        addView(getTv_all_price(), layoutParams6);
        View viewInflate4 = View.inflate(getContext(), R.layout.layout_max_online_num, null);
        f0.n(viewInflate4, "null cannot be cast to non-null type android.widget.LinearLayout");
        setVg_max_online((LinearLayout) viewInflate4);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        addView(getVg_max_online(), layoutParams7);
        getVg_max_online().setVisibility(8);
        View viewInflate5 = View.inflate(getContext(), R.layout.game_score, null);
        this.f86767r = viewInflate5 instanceof LinearLayout ? (LinearLayout) viewInflate5 : null;
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(18, R.id.cv_img);
        layoutParams8.addRule(8, R.id.cv_img);
        layoutParams8.setMarginStart(ViewUtils.f(getContext(), -4.0f));
        layoutParams8.bottomMargin = ViewUtils.f(getContext(), 3.0f);
        addView(this.f86767r, layoutParams8);
        LinearLayout linearLayout = this.f86767r;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        View viewFindViewById = getVg_max_online().findViewById(R.id.tv_max_online_num);
        f0.o(viewFindViewById, "vg_max_online.findViewById(R.id.tv_max_online_num)");
        setTv_max_online_num((TextView) viewFindViewById);
        View viewFindViewById2 = getVg_max_online().findViewById(R.id.tv_max_online_num_unit);
        f0.o(viewFindViewById2, "vg_max_online.findViewBy…d.tv_max_online_num_unit)");
        setTv_max_online_num_unit((TextView) viewFindViewById2);
        View viewFindViewById3 = getVg_max_online().findViewById(R.id.tv_max_online_time);
        f0.o(viewFindViewById3, "vg_max_online.findViewBy…(R.id.tv_max_online_time)");
        setTv_max_online_time((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.iv_follow_icon);
        f0.o(viewFindViewById4, "findViewById<ImageView>(R.id.iv_follow_icon)");
        setIv_follow_icon((ImageView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.tv_follow_num);
        f0.o(viewFindViewById5, "findViewById<TextView>(R.id.tv_follow_num)");
        setTv_follow_num((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.tv_follow_num_unit);
        f0.o(viewFindViewById6, "findViewById<TextView>(R.id.tv_follow_num_unit)");
        setTv_follow_num_unit((TextView) viewFindViewById6);
    }

    private final void f(TextView textView, TextView textView2, GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{textView, textView2, gameObj}, this, changeQuickRedirect, false, 36603, new Class[]{TextView.class, TextView.class, GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (TextUtils.isEmpty(gameObj.getRelease_timestamp())) {
            textView2.setVisibility(8);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText("即将上线");
            textView.setTextSize(ViewUtils.g(getContext(), 9.0f));
            textView.setTranslationY(0.0f);
            return;
        }
        textView2.setVisibility(0);
        textView.setTextSize(ViewUtils.g(getContext(), 12.0f));
        textView.setText(w.g(gameObj.getRelease_timestamp(), "."));
        bb.d.d(textView, 4);
        textView.setTranslationY(ViewUtils.f(getContext(), 1.0f));
    }

    public static /* synthetic */ void h(GameItemView gameItemView, GameObj gameObj, String str, com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist.d dVar, boolean z10, View.OnClickListener onClickListener, s.e eVar, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{gameItemView, gameObj, str, dVar, new Byte(z10 ? (byte) 1 : (byte) 0), onClickListener, eVar, new Integer(i10), obj}, null, changeQuickRedirect, true, 36601, new Class[]{GameItemView.class, GameObj.class, String.class, com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist.d.class, Boolean.TYPE, View.OnClickListener.class, s.e.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        gameItemView.g(gameObj, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : dVar, (i10 & 8) == 0 ? z10 ? 1 : 0 : true, (i10 & 16) != 0 ? null : onClickListener, (i10 & 32) == 0 ? eVar : null);
    }

    private final void k(final GameObj gameObj) {
        AppCompatActivity appCompatActivity;
        if (PatchProxy.proxy(new Object[]{gameObj}, this, changeQuickRedirect, false, 36602, new Class[]{GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (getContext() instanceof AppCompatActivity) {
            Context context = getContext();
            f0.n(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            appCompatActivity = (AppCompatActivity) context;
        } else {
            Activity activityA = com.max.hbutils.utils.e.b().a();
            f0.n(activityA, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            appCompatActivity = (AppCompatActivity) activityA;
        }
        try {
            new com.max.hbcommon.component.bottomsheet.a().z("游戏发售提醒").h(R.drawable.bottom_sheets_key_correct_blue_28x28).n(R.drawable.bottom_sheets_broken_date_80x80).k(true).x(false).l(new SpannableString("游戏发售后，" + com.max.xiaoheihe.utils.d.A() + "会通过系统日历提醒你，是否创建日历提醒日程？")).v("好的", true, new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.component.GameItemView$showGamePublishDialog$bSheets$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public final void onClick(@e View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36619, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    String str = (char) 12298 + gameObj.getName() + "》今日发售 来" + d.A() + "查看攻略百科";
                    long jR = (n.r(gameObj.getRelease_timestamp()) * ((long) 1000)) + 39600000;
                    CalendarUtils calendarUtils = CalendarUtils.f86571a;
                    Context context2 = this.getContext();
                    f0.o(context2, "context");
                    final GameItemView gameItemView = this;
                    calendarUtils.d(context2, str, "", jR, jR + 3600000, false, true, 15, new l<Integer, b2>() { // from class: com.max.xiaoheihe.module.game.component.GameItemView$showGamePublishDialog$bSheets$1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        {
                            super(1);
                        }

                        public final void a(int i10) {
                            String string;
                            int i11;
                            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36620, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                                return;
                            }
                            Context context3 = gameItemView.getContext();
                            if (context3 != null) {
                                if (i10 != 1) {
                                    i11 = i10 != 2 ? R.string.add_calendar_fail : R.string.already_add_calendar;
                                } else {
                                    i11 = R.string.add_calendar_success;
                                }
                                string = context3.getString(i11);
                            } else {
                                string = null;
                            }
                            com.max.hbutils.utils.c.d(string);
                        }

                        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(Integer num) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 36621, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            a(num.intValue());
                            return b2.f124493a;
                        }
                    });
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("app_id", r1.Z(gameObj));
                    com.max.hbcommon.analytics.d.e("4", lb.d.f131146d4, null, null, jsonObject, null, true);
                }
            }).p("不提醒", true, e.f86782b).a().M3(appCompatActivity.getSupportFragmentManager(), "game_publish_calendar");
        } catch (IllegalStateException e10) {
            g.f74531b.u(e10);
        }
    }

    public final void c(@dl.d GameObj data) {
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 36604, new Class[]{GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        if (f0.g("following", data.getFollow_state())) {
            data.setFollow_state("unfollowing");
            data.setFollow_num(String.valueOf(Math.max(0, ((int) n.p(data.getFollow_num())) - 1)));
        } else {
            data.setFollow_state("following");
            data.setFollow_num(String.valueOf(((int) n.p(data.getFollow_num())) + 1));
        }
        e(data.getFollow_state(), (int) n.p(data.getFollow_num()));
    }

    public final void d(@dl.d GameObj data) {
        LineChart lineChart;
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 36611, new Class[]{GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        if (this.f86755f) {
            if (getLc_trend_container().getChildAt(0) != null) {
                View childAt = getLc_trend_container().getChildAt(0);
                f0.n(childAt, "null cannot be cast to non-null type com.github.mikephil.charting.charts.LineChart");
                lineChart = (LineChart) childAt;
            } else {
                lineChart = new LineChart(getContext());
                getLc_trend_container().addView(lineChart, -1, -1);
            }
            r1.C1(getContext(), lineChart, data.getPeak_values());
            getTv_change().setText(data.getPeak_change());
            getTv_change().post(new a(lineChart, this));
        }
    }

    public final void e(@dl.e String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 36605, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (f0.g("following", str)) {
            int iE = com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_start_color);
            getIv_follow_icon().setColorFilter(iE);
            getTv_follow_num().setTextColor(iE);
            getTv_follow_num_unit().setTextColor(iE);
        } else {
            getIv_follow_icon().setColorFilter(getContext().getResources().getColor(R.color.text_secondary_2_color));
            int iE2 = com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color);
            getTv_follow_num().setTextColor(iE2);
            getTv_follow_num_unit().setTextColor(iE2);
        }
        getTv_follow_num().setText(r1.p(String.valueOf(Math.max(i10, 0))));
        if (i10 >= 10000) {
            getTv_follow_num_unit().setVisibility(0);
        } else {
            getTv_follow_num_unit().setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:102:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:104:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:106:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:107:0x0516  */
    /* JADX WARN: Code duplicated, block: B:109:0x0536  */
    /* JADX WARN: Code duplicated, block: B:111:0x053e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0566  */
    /* JADX WARN: Code duplicated, block: B:115:0x0571  */
    /* JADX WARN: Code duplicated, block: B:150:0x0639  */
    /* JADX WARN: Code duplicated, block: B:151:0x0651  */
    /* JADX WARN: Code duplicated, block: B:158:0x06a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:163:0x06af  */
    /* JADX WARN: Code duplicated, block: B:164:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:165:0x06ef A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:168:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:178:0x074d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0755  */
    /* JADX WARN: Code duplicated, block: B:182:0x0761  */
    /* JADX WARN: Code duplicated, block: B:183:0x076e  */
    /* JADX WARN: Code duplicated, block: B:186:0x077c  */
    /* JADX WARN: Code duplicated, block: B:190:0x0785  */
    /* JADX WARN: Code duplicated, block: B:192:0x0788  */
    /* JADX WARN: Code duplicated, block: B:195:0x079c A[LOOP:1: B:193:0x0796->B:195:0x079c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:196:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x0324  */
    /* JADX WARN: Code duplicated, block: B:59:0x032a  */
    /* JADX WARN: Code duplicated, block: B:61:0x033a  */
    /* JADX WARN: Code duplicated, block: B:62:0x034e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0379  */
    /* JADX WARN: Code duplicated, block: B:84:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x03f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [boolean, int] */
    public final void g(@dl.d GameObj data, @dl.e String str, @dl.e com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist.d dVar, boolean z10, @dl.e View.OnClickListener onClickListener, @dl.e s.e eVar) {
        boolean zS;
        ImageView imageView;
        View view;
        GamePriceObj heybox_price;
        List<String> platforms_icon;
        ImageView imageView2;
        View view2;
        ?? r10;
        Object obj;
        String str2;
        int i10;
        boolean z11;
        boolean z12;
        String peak_max;
        List<RichAttributeModelObj> rich_tags;
        boolean z13;
        LinearLayout linearLayout;
        Iterator<RichAttributeModelObj> it;
        if (PatchProxy.proxy(new Object[]{data, str, dVar, new Byte(z10 ? (byte) 1 : (byte) 0), onClickListener, eVar}, this, changeQuickRedirect, false, 36600, new Class[]{GameObj.class, String.class, com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist.d.class, Boolean.TYPE, View.OnClickListener.class, s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        if (dVar == null || !(dVar.h() instanceof u)) {
            zS = false;
        } else {
            s<?> sVarH = dVar.h();
            f0.n(sVarH, "null cannot be cast to non-null type com.max.xiaoheihe.module.game.adapter.GameListAdapter");
            zS = ((u) sVarH).s();
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.iv_img);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.ll_platform_icon);
        View viewFindViewById = findViewById(R.id.vg_is_owned);
        TextView textView = (TextView) findViewById(R.id.tv_discount);
        TextView textView2 = (TextView) findViewById(R.id.tv_tag_ad);
        TextView textView3 = (TextView) findViewById(R.id.tv_deadline_date);
        TextView textView4 = (TextView) findViewById(R.id.tv_deadline_date_unit);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.vg_deadline_date);
        TextView textView5 = (TextView) findViewById(R.id.tv_game_popularity);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.vg_online);
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.vg_score);
        LinearLayout linearLayout4 = (LinearLayout) findViewById(R.id.vg_follow_num);
        boolean z14 = zS;
        TextView textView6 = (TextView) findViewById(R.id.tv_free_time);
        TextView tv_game_date = (TextView) findViewById(R.id.tv_game_date);
        TextView tv_game_date_unit = (TextView) findViewById(R.id.tv_game_date_unit);
        ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.vg_game_date);
        TextView textView7 = (TextView) findViewById(R.id.tv_game_popularity_unit);
        GamePriceView gamePriceView = (GamePriceView) findViewById(R.id.gpv);
        ImageView imageView4 = (ImageView) findViewById(R.id.iv_owned);
        TextView textView8 = (TextView) findViewById(R.id.tv_owned);
        ImageView imageView5 = (ImageView) findViewById(R.id.iv_in_wish_list);
        FlexboxLayout flexboxLayout = (FlexboxLayout) findViewById(R.id.fl_tags);
        LinearLayout linearLayout5 = (LinearLayout) findViewById(R.id.ll_more_tags);
        TextView textView9 = (TextView) findViewById(R.id.tv_dlc_tag);
        TextView textView10 = (TextView) findViewById(R.id.tv_already_release);
        getCv_img().setRadius(ViewUtils.p(getContext(), getCv_img(), ViewUtils.ViewType.IMAGE));
        String key = com.max.hbcommon.utils.c.w(data.getPlatform_infos()) ? "" : data.getPlatform_infos().get(0).getKey();
        if (!f0.g(GameObj.KEY_POINT_DISCOUNT_LIST, str)) {
            imageView = imageView4;
            if (com.max.hbcommon.utils.c.x(data.getIs_use_new_style())) {
                getVg_special_tags().removeAllViews();
                n(true);
                if (!com.max.hbcommon.utils.c.w(data.getSpecial_tags_v2())) {
                    List<KeyDescObj> special_tags_v2 = data.getSpecial_tags_v2();
                    f0.m(special_tags_v2);
                    Iterator<KeyDescObj> it2 = special_tags_v2.iterator();
                    while (it2.hasNext()) {
                        it2 = it2;
                        View viewV0 = r1.v0(getContext(), it2.next());
                        if (viewV0 != null) {
                            getVg_special_tags().addView(viewV0);
                            ViewUtils.n0(viewV0, ViewUtils.f(getContext(), 10.0f), 0, 0, 0);
                            viewFindViewById = viewFindViewById;
                        }
                    }
                }
            } else {
                view = viewFindViewById;
                n(false);
            }
            textView10.setVisibility(8);
            getVg_max_online().setVisibility(8);
            viewGroup2.setVisibility(8);
            getTv_all_price().setVisibility(8);
            imageView5.setVisibility(8);
            com.max.hbimage.b.L(data.getImage(), imageView3, R.drawable.common_default_placeholder_375x210);
            heybox_price = data.getHeybox_price();
            if (heybox_price == null && f0.g("switch", key) && !com.max.hbcommon.utils.c.w(data.getPlatform_infos())) {
                heybox_price = data.getPlatform_infos().get(0).getPrice();
            }
            r1.i1(textView, heybox_price, null);
            bb.d.d(textView, 5);
            r1.x1(null, flexboxLayout, null, data, Boolean.valueOf(z10));
            platforms_icon = data.getPlatforms_icon();
            if (platforms_icon != null || platforms_icon.size() <= 0 || f0.g(GameObj.KEY_POINT_DISCOUNT_LIST, str)) {
                linearLayout2.setVisibility(8);
            } else {
                linearLayout2.setVisibility(0);
                linearLayout2.removeAllViews();
                Iterator<String> it3 = platforms_icon.iterator();
                while (it3.hasNext()) {
                    ImageView imageViewN0 = r1.n0(getContext(), it3.next(), ViewUtils.f(getContext(), 14.0f));
                    if (imageViewN0 != null) {
                        linearLayout2.addView(imageViewN0);
                        b2 b2Var = b2.f124493a;
                    }
                }
            }
            if (f0.g(GameObj.KEY_POINT_DISCOUNT_LIST, str)) {
                imageView2 = imageView;
                view2 = view;
                if (f0.g("1", data.getIs_owned())) {
                    view2.setVisibility(0);
                    imageView2.setVisibility(0);
                    imageView2.setImageResource(R.drawable.ic_more_white_small);
                    textView8.setText(R.string.own);
                } else {
                    view2.setVisibility(8);
                }
            } else if (!com.max.hbcommon.utils.c.w(data.getSpecial_tags_v2()) || com.max.hbcommon.utils.c.u(data.getSpecial_tags_v2().get(0).getDesc())) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
                imageView.setVisibility(8);
                textView8.setText(data.getSpecial_tags_v2().get(0).getDesc());
            }
            if ((!f0.g(GameObj.KEY_POINT_FOLLOWED, str) || f0.g(GameObj.KEY_POINT_FOLLOW_LIST, str)) && f0.g("1", data.getIn_wish_list())) {
                r10 = 0;
                imageView5.setVisibility(0);
            } else {
                r10 = 0;
            }
            if (!f0.g("recommend", str)) {
                getTv_name().setText(data.getName());
                r1.C(gamePriceView, data, r10, z10);
                if (data.getPrice() != null || com.max.hbcommon.utils.c.u(data.getPrice().getDeadline_timestamp())) {
                    viewGroup.setVisibility(8);
                } else {
                    viewGroup.setVisibility(r10);
                    String[] strArrR = w.r(getContext(), n.r(data.getPrice().getDeadline_timestamp()));
                    if (com.max.hbcommon.utils.c.u(strArrR[r10]) || com.max.hbcommon.utils.c.u(strArrR[1])) {
                        viewGroup.setVisibility(8);
                    } else {
                        viewGroup.setVisibility(r10);
                        textView3.setText(strArrR[r10]);
                        bb.d.d(textView3, 4);
                        textView4.setText(strArrR[1]);
                    }
                }
                i10 = 8;
                str2 = key;
                obj = "1";
            } else {
                obj = "1";
                getTv_name().setText(data.getName());
                viewGroup2.setVisibility(8);
                viewGroup3.setVisibility(8);
                viewGroup.setVisibility(8);
                linearLayout3.setVisibility(8);
                linearLayout4.setVisibility(8);
                str2 = key;
                getVg_trend().setVisibility(8);
                if (!f0.g(GameObj.KEY_POINT_PEAK_USER_NUM, str) && !TextUtils.isEmpty(data.getOnline_player())) {
                    r1.C(gamePriceView, data, false, z10);
                    f0.m(viewGroup2);
                    viewGroup2.setVisibility(0);
                    String onlineNum = data.getOnline_player();
                    textView7.setVisibility(0);
                    String online_player = data.getOnline_player();
                    f0.o(online_player, "data.online_player");
                    if (StringsKt__StringsKt.W2(online_player, "万", false, 2, null)) {
                        textView7.setText("万");
                        f0.o(onlineNum, "onlineNum");
                        onlineNum = kotlin.text.u.l2(kotlin.text.u.l2(onlineNum, "万", "", false, 4, null), " ", "", false, 4, null);
                    } else {
                        String online_player2 = data.getOnline_player();
                        f0.o(online_player2, "data.online_player");
                        if (StringsKt__StringsKt.W2(online_player2, "亿", false, 2, null)) {
                            textView7.setText("亿");
                            f0.o(onlineNum, "onlineNum");
                            onlineNum = kotlin.text.u.l2(kotlin.text.u.l2(onlineNum, "亿", "", false, 4, null), " ", "", false, 4, null);
                        } else {
                            textView7.setVisibility(8);
                        }
                    }
                    textView5.setText(onlineNum);
                } else if (f0.g(GameObj.KEY_POINT_PEAK_MAX, str)) {
                    r1.C(gamePriceView, data, false, z10);
                    getVg_max_online().setVisibility(0);
                    if (data.getPeak_max() != null) {
                        peak_max = data.getPeak_max();
                        f0.o(peak_max, "data.peak_max");
                        if (kotlin.text.u.K1(peak_max, "万", false, 2, null)) {
                            TextView tv_max_online_num = getTv_max_online_num();
                            String peak_max2 = data.getPeak_max();
                            f0.o(peak_max2, "data.peak_max");
                            tv_max_online_num.setText(kotlin.text.u.l2(peak_max2, "万", "", false, 4, null));
                            getTv_max_online_num_unit().setText("万");
                            getTv_max_online_num_unit().setVisibility(0);
                        } else {
                            getTv_max_online_num().setText(data.getPeak_max());
                            getTv_max_online_num_unit().setVisibility(8);
                        }
                    } else {
                        getTv_max_online_num().setText(data.getPeak_max());
                        getTv_max_online_num_unit().setVisibility(8);
                    }
                    getTv_max_online_time().setText(data.getPeak_time());
                } else if (f0.g("release_date", str)) {
                    gamePriceView.j(data, false, GamePriceView.ColorType.Light, false, false);
                    f0.o(tv_game_date, "tv_game_date");
                    f0.o(tv_game_date_unit, "tv_game_date_unit");
                    f(tv_game_date, tv_game_date_unit, data);
                    viewGroup3.setVisibility(0);
                } else {
                    linearLayout5 = linearLayout5;
                    if (!f0.g("discount", str) || f0.g(GameObj.KEY_POINT_DISCOUNT_LIST, str)) {
                        r1.C(gamePriceView, data, false, z10);
                        if (data.getPrice() != null || com.max.hbcommon.utils.c.u(data.getPrice().getDeadline_timestamp())) {
                            i10 = 8;
                            z11 = true;
                            viewGroup.setVisibility(8);
                        } else {
                            String[] strArrR2 = w.r(getContext(), n.r(data.getPrice().getDeadline_timestamp()));
                            if (com.max.hbcommon.utils.c.u(strArrR2[0])) {
                                z11 = true;
                            } else {
                                z11 = true;
                                if (!com.max.hbcommon.utils.c.u(strArrR2[1])) {
                                    viewGroup.setVisibility(0);
                                    textView3.setText(strArrR2[0]);
                                    bb.d.d(textView3, 4);
                                    textView4.setText(strArrR2[1]);
                                    i10 = 8;
                                }
                            }
                            i10 = 8;
                            viewGroup.setVisibility(8);
                        }
                        if (textView2 != null) {
                            if (f0.g("advertise", data.getLabel())) {
                                textView2.setVisibility(0);
                                textView2.setText(R.string.advertisement);
                            } else {
                                textView2.setVisibility(i10);
                            }
                        }
                        linearLayout5.removeAllViews();
                        rich_tags = data.getRich_tags();
                        if (rich_tags != null || rich_tags.isEmpty()) {
                            z13 = z11;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            linearLayout5.setVisibility(8);
                        } else {
                            linearLayout = linearLayout5;
                            linearLayout.setVisibility(0);
                            it = data.getRich_tags().iterator();
                            while (it.hasNext()) {
                                linearLayout.addView(r1.s0(getContext(), it.next()));
                            }
                        }
                        setOnClickListener(new c(data, this, str2, onClickListener));
                        j(f0.g(obj, data.getIs_expired()));
                    }
                    if (kotlin.text.u.L1(GameObj.KEY_POINT_PEAK_CHANGE, str, true)) {
                        r1.C(gamePriceView, data, false, z10);
                        View viewFindViewById2 = findViewById(R.id.lc_trend_container);
                        f0.o(viewFindViewById2, "findViewById<FrameLayout>(R.id.lc_trend_container)");
                        setLc_trend_container((FrameLayout) viewFindViewById2);
                        View viewFindViewById3 = findViewById(R.id.tv_change);
                        f0.o(viewFindViewById3, "findViewById<TextView>(R.id.tv_change)");
                        setTv_change((TextView) viewFindViewById3);
                        getLc_trend_container().setVisibility(0);
                        getVg_trend().setVisibility(0);
                        this.f86755f = true;
                        if (com.max.xiaoheihe.utils.d.P0()) {
                            d(data);
                        }
                        linearLayout5 = linearLayout5;
                    } else {
                        if (z14) {
                            textView6.setVisibility(0);
                            textView6.setText(data.getTime_desc());
                        } else {
                            r1.C(gamePriceView, data, false, z10);
                            textView6.setVisibility(8);
                        }
                        boolean z15 = n.p(data.getScore()) > 0.0f;
                        boolean z16 = n.p(data.getFollow_num()) > 0.0f || f0.g("calendar", str) || f0.g(GameObj.KEY_POINT_FOLLOWED, str);
                        if (f0.g("calendar", str)) {
                            linearLayout5 = linearLayout5;
                            z12 = n.r(data.getRelease_timestamp()) < System.currentTimeMillis() / ((long) 1000);
                            if (z12) {
                                linearLayout4.setVisibility(8);
                                linearLayout3.setVisibility(8);
                                textView10.setVisibility(0);
                                textView10.setBackground(q.o(getContext(), R.color.background_card_1_color, 2.0f));
                            } else if ((z15 || f0.g(GameObj.KEY_POINT_FOLLOWED, str)) && z16) {
                                linearLayout4.setVisibility(0);
                                linearLayout3.setVisibility(8);
                                linearLayout4.setOnClickListener(new b(data, str));
                                linearLayout4.setBackgroundDrawable(q.o(getContext(), R.color.background_card_1_color, 2.0f));
                                e(data.getFollow_state(), (int) n.p(data.getFollow_num()));
                            } else {
                                r1.S1(new s.e(R.layout.game_score, linearLayout3), data.getScore_desc(), data.getScore(), data.getExpect_num());
                            }
                            if (!z14) {
                                if (linearLayout2 != null) {
                                    linearLayout2.setVisibility(8);
                                }
                                if (data.isIs_dlc()) {
                                    textView9.setVisibility(0);
                                    textView9.setBackground(ViewUtils.w(ViewUtils.o(getContext(), textView9), getContext().getResources().getColor(R.color.dlc_tag_start_color), getContext().getResources().getColor(R.color.dlc_tag_end_color), GradientDrawable.Orientation.BL_TR));
                                } else {
                                    i10 = 8;
                                    textView9.setVisibility(8);
                                }
                            }
                        } else {
                            linearLayout5 = linearLayout5;
                        }
                        if (z12) {
                            linearLayout4.setVisibility(8);
                            linearLayout3.setVisibility(8);
                            textView10.setVisibility(0);
                            textView10.setBackground(q.o(getContext(), R.color.background_card_1_color, 2.0f));
                        } else if (z15) {
                            linearLayout4.setVisibility(0);
                            linearLayout3.setVisibility(8);
                            linearLayout4.setOnClickListener(new b(data, str));
                            linearLayout4.setBackgroundDrawable(q.o(getContext(), R.color.background_card_1_color, 2.0f));
                            e(data.getFollow_state(), (int) n.p(data.getFollow_num()));
                        } else {
                            linearLayout4.setVisibility(0);
                            linearLayout3.setVisibility(8);
                            linearLayout4.setOnClickListener(new b(data, str));
                            linearLayout4.setBackgroundDrawable(q.o(getContext(), R.color.background_card_1_color, 2.0f));
                            e(data.getFollow_state(), (int) n.p(data.getFollow_num()));
                        }
                        if (!z14) {
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(8);
                            }
                            if (data.isIs_dlc()) {
                                textView9.setVisibility(0);
                                textView9.setBackground(ViewUtils.w(ViewUtils.o(getContext(), textView9), getContext().getResources().getColor(R.color.dlc_tag_start_color), getContext().getResources().getColor(R.color.dlc_tag_end_color), GradientDrawable.Orientation.BL_TR));
                            } else {
                                i10 = 8;
                                textView9.setVisibility(8);
                            }
                        }
                    }
                }
                i10 = 8;
            }
            z11 = true;
            if (textView2 != null) {
                if (f0.g("advertise", data.getLabel())) {
                    textView2.setVisibility(0);
                    textView2.setText(R.string.advertisement);
                } else {
                    textView2.setVisibility(i10);
                }
            }
            linearLayout5.removeAllViews();
            rich_tags = data.getRich_tags();
            if (rich_tags != null) {
                z13 = z11;
            } else {
                z13 = z11;
            }
            if (z13) {
                linearLayout = linearLayout5;
                linearLayout.setVisibility(0);
                it = data.getRich_tags().iterator();
                while (it.hasNext()) {
                    linearLayout.addView(r1.s0(getContext(), it.next()));
                }
            } else {
                linearLayout5.setVisibility(8);
            }
            setOnClickListener(new c(data, this, str2, onClickListener));
            j(f0.g(obj, data.getIs_expired()));
        }
        imageView = imageView4;
        i(f0.g("switch", key), data.getAppid());
        view = viewFindViewById;
        textView10.setVisibility(8);
        getVg_max_online().setVisibility(8);
        viewGroup2.setVisibility(8);
        getTv_all_price().setVisibility(8);
        imageView5.setVisibility(8);
        com.max.hbimage.b.L(data.getImage(), imageView3, R.drawable.common_default_placeholder_375x210);
        heybox_price = data.getHeybox_price();
        if (heybox_price == null) {
            heybox_price = data.getPlatform_infos().get(0).getPrice();
        }
        r1.i1(textView, heybox_price, null);
        bb.d.d(textView, 5);
        r1.x1(null, flexboxLayout, null, data, Boolean.valueOf(z10));
        platforms_icon = data.getPlatforms_icon();
        if (platforms_icon != null) {
            linearLayout2.setVisibility(8);
        } else {
            linearLayout2.setVisibility(8);
        }
        if (f0.g(GameObj.KEY_POINT_DISCOUNT_LIST, str)) {
            imageView2 = imageView;
            view2 = view;
            if (f0.g("1", data.getIs_owned())) {
                view2.setVisibility(0);
                imageView2.setVisibility(0);
                imageView2.setImageResource(R.drawable.ic_more_white_small);
                textView8.setText(R.string.own);
            } else {
                view2.setVisibility(8);
            }
        } else if (com.max.hbcommon.utils.c.w(data.getSpecial_tags_v2())) {
            view.setVisibility(8);
        } else {
            view.setVisibility(8);
        }
        if (f0.g(GameObj.KEY_POINT_FOLLOWED, str)) {
            r10 = 0;
            imageView5.setVisibility(0);
        } else {
            r10 = 0;
            imageView5.setVisibility(0);
        }
        if (!f0.g("recommend", str)) {
            obj = "1";
            getTv_name().setText(data.getName());
            viewGroup2.setVisibility(8);
            viewGroup3.setVisibility(8);
            viewGroup.setVisibility(8);
            linearLayout3.setVisibility(8);
            linearLayout4.setVisibility(8);
            str2 = key;
            getVg_trend().setVisibility(8);
            if (!f0.g(GameObj.KEY_POINT_PEAK_USER_NUM, str)) {
                if (f0.g(GameObj.KEY_POINT_PEAK_MAX, str)) {
                    r1.C(gamePriceView, data, false, z10);
                    getVg_max_online().setVisibility(0);
                    if (data.getPeak_max() != null) {
                        peak_max = data.getPeak_max();
                        f0.o(peak_max, "data.peak_max");
                        if (kotlin.text.u.K1(peak_max, "万", false, 2, null)) {
                            TextView tv_max_online_num2 = getTv_max_online_num();
                            String peak_max3 = data.getPeak_max();
                            f0.o(peak_max3, "data.peak_max");
                            tv_max_online_num2.setText(kotlin.text.u.l2(peak_max3, "万", "", false, 4, null));
                            getTv_max_online_num_unit().setText("万");
                            getTv_max_online_num_unit().setVisibility(0);
                        } else {
                            getTv_max_online_num().setText(data.getPeak_max());
                            getTv_max_online_num_unit().setVisibility(8);
                        }
                    } else {
                        getTv_max_online_num().setText(data.getPeak_max());
                        getTv_max_online_num_unit().setVisibility(8);
                    }
                    getTv_max_online_time().setText(data.getPeak_time());
                } else if (f0.g("release_date", str)) {
                    gamePriceView.j(data, false, GamePriceView.ColorType.Light, false, false);
                    f0.o(tv_game_date, "tv_game_date");
                    f0.o(tv_game_date_unit, "tv_game_date_unit");
                    f(tv_game_date, tv_game_date_unit, data);
                    viewGroup3.setVisibility(0);
                } else {
                    linearLayout5 = linearLayout5;
                    if (f0.g("discount", str)) {
                    }
                    r1.C(gamePriceView, data, false, z10);
                    if (data.getPrice() != null) {
                        i10 = 8;
                        z11 = true;
                        viewGroup.setVisibility(8);
                    } else {
                        i10 = 8;
                        z11 = true;
                        viewGroup.setVisibility(8);
                    }
                }
                i10 = 8;
            } else {
                if (f0.g(GameObj.KEY_POINT_PEAK_MAX, str)) {
                    r1.C(gamePriceView, data, false, z10);
                    getVg_max_online().setVisibility(0);
                    if (data.getPeak_max() != null) {
                        peak_max = data.getPeak_max();
                        f0.o(peak_max, "data.peak_max");
                        if (kotlin.text.u.K1(peak_max, "万", false, 2, null)) {
                            TextView tv_max_online_num3 = getTv_max_online_num();
                            String peak_max4 = data.getPeak_max();
                            f0.o(peak_max4, "data.peak_max");
                            tv_max_online_num3.setText(kotlin.text.u.l2(peak_max4, "万", "", false, 4, null));
                            getTv_max_online_num_unit().setText("万");
                            getTv_max_online_num_unit().setVisibility(0);
                        } else {
                            getTv_max_online_num().setText(data.getPeak_max());
                            getTv_max_online_num_unit().setVisibility(8);
                        }
                    } else {
                        getTv_max_online_num().setText(data.getPeak_max());
                        getTv_max_online_num_unit().setVisibility(8);
                    }
                    getTv_max_online_time().setText(data.getPeak_time());
                } else if (f0.g("release_date", str)) {
                    gamePriceView.j(data, false, GamePriceView.ColorType.Light, false, false);
                    f0.o(tv_game_date, "tv_game_date");
                    f0.o(tv_game_date_unit, "tv_game_date_unit");
                    f(tv_game_date, tv_game_date_unit, data);
                    viewGroup3.setVisibility(0);
                } else {
                    linearLayout5 = linearLayout5;
                    if (f0.g("discount", str)) {
                    }
                    r1.C(gamePriceView, data, false, z10);
                    if (data.getPrice() != null) {
                        i10 = 8;
                        z11 = true;
                        viewGroup.setVisibility(8);
                    } else {
                        i10 = 8;
                        z11 = true;
                        viewGroup.setVisibility(8);
                    }
                }
                i10 = 8;
            }
            if (textView2 != null) {
                if (f0.g("advertise", data.getLabel())) {
                    textView2.setVisibility(0);
                    textView2.setText(R.string.advertisement);
                } else {
                    textView2.setVisibility(i10);
                }
            }
            linearLayout5.removeAllViews();
            rich_tags = data.getRich_tags();
            if (rich_tags != null) {
                z13 = z11;
            } else {
                z13 = z11;
            }
            if (z13) {
                linearLayout = linearLayout5;
                linearLayout.setVisibility(0);
                it = data.getRich_tags().iterator();
                while (it.hasNext()) {
                    linearLayout.addView(r1.s0(getContext(), it.next()));
                }
            } else {
                linearLayout5.setVisibility(8);
            }
            setOnClickListener(new c(data, this, str2, onClickListener));
            j(f0.g(obj, data.getIs_expired()));
        }
        getTv_name().setText(data.getName());
        r1.C(gamePriceView, data, r10, z10);
        if (data.getPrice() != null) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(8);
        }
        i10 = 8;
        str2 = key;
        obj = "1";
        z11 = true;
        if (textView2 != null) {
            if (f0.g("advertise", data.getLabel())) {
                textView2.setVisibility(0);
                textView2.setText(R.string.advertisement);
            } else {
                textView2.setVisibility(i10);
            }
        }
        linearLayout5.removeAllViews();
        rich_tags = data.getRich_tags();
        if (rich_tags != null) {
            z13 = z11;
        } else {
            z13 = z11;
        }
        if (z13) {
            linearLayout = linearLayout5;
            linearLayout.setVisibility(0);
            it = data.getRich_tags().iterator();
            while (it.hasNext()) {
                linearLayout.addView(r1.s0(getContext(), it.next()));
            }
        } else {
            linearLayout5.setVisibility(8);
        }
        setOnClickListener(new c(data, this, str2, onClickListener));
        j(f0.g(obj, data.getIs_expired()));
    }

    @dl.d
    public final CardView getCv_img() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36569, new Class[0], CardView.class);
        if (patchProxyResultProxy.isSupported) {
            return (CardView) patchProxyResultProxy.result;
        }
        CardView cardView = this.f86751b;
        if (cardView != null) {
            return cardView;
        }
        f0.S("cv_img");
        return null;
    }

    @dl.d
    public final ImageView getIv_follow_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36585, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86760k;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_follow_icon");
        return null;
    }

    @dl.d
    public final FrameLayout getLc_trend_container() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36581, new Class[0], FrameLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (FrameLayout) patchProxyResultProxy.result;
        }
        FrameLayout frameLayout = this.f86758i;
        if (frameLayout != null) {
            return frameLayout;
        }
        f0.S("lc_trend_container");
        return null;
    }

    public final boolean getShowTrend() {
        return this.f86755f;
    }

    @dl.d
    public final TextView getTv_all_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36583, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86759j;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_all_price");
        return null;
    }

    @dl.d
    public final TextView getTv_change() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36579, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86757h;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_change");
        return null;
    }

    @dl.d
    public final TextView getTv_follow_num() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36587, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86761l;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_follow_num");
        return null;
    }

    @dl.d
    public final TextView getTv_follow_num_unit() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36589, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86762m;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_follow_num_unit");
        return null;
    }

    @dl.d
    public final TextView getTv_max_online_num() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36593, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86764o;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_max_online_num");
        return null;
    }

    @dl.d
    public final TextView getTv_max_online_num_unit() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36595, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86765p;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_max_online_num_unit");
        return null;
    }

    @dl.d
    public final TextView getTv_max_online_time() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36597, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86766q;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_max_online_time");
        return null;
    }

    @dl.d
    public final TextView getTv_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36571, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86752c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_name");
        return null;
    }

    @dl.d
    public final RelativeLayout getVg_bottom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36575, new Class[0], RelativeLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelativeLayout) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = this.f86754e;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        f0.S("vg_bottom");
        return null;
    }

    @dl.d
    public final ViewGroup getVg_max_online() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36591, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f86763n;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vg_max_online");
        return null;
    }

    @dl.d
    public final LinearLayout getVg_special_tags() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36573, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f86753d;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("vg_special_tags");
        return null;
    }

    @dl.d
    public final LinearLayout getVg_trend() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36577, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f86756g;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("vg_trend");
        return null;
    }

    public final void i(boolean z10, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 36606, new Class[]{Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        getVg_special_tags().setVisibility(8);
        int iF = ViewUtils.f(getContext(), 10.0f);
        int iF2 = ViewUtils.f(getContext(), 12.0f);
        if (!z10 || str == null) {
            getTv_all_price().setVisibility(8);
            ViewUtils.n0(getTv_name(), iF, ViewUtils.f(getContext(), 8.0f), iF, 0);
            ViewUtils.n0(getVg_bottom(), iF, 0, 0, iF2);
        } else {
            getTv_all_price().setVisibility(0);
            bb.d.d(getTv_all_price(), 0);
            getTv_all_price().setText("全区价格/趋势 \uf0d7");
            getTv_all_price().setOnClickListener(new d(str, this));
            ViewUtils.n0(getTv_name(), iF, 0, iF, 0);
            ViewUtils.n0(getVg_bottom(), iF, 0, 0, ViewUtils.f(getContext(), 19.0f));
        }
    }

    public final void j(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36609, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            setAlpha(1.0f);
        } else {
            setAlpha(0.4f);
            i(false, null);
        }
    }

    public final void l(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 36610, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        r1.O1(this.f86767r, str2, str);
        setClipToPadding(false);
    }

    public final void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36608, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getCv_img().getLayoutParams().width = ViewUtils.f(getContext(), 120.0f);
        getCv_img().getLayoutParams().height = ViewUtils.f(getContext(), 56.0f);
        ViewGroup.LayoutParams layoutParams = getTv_name().getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ViewUtils.f(getContext(), 3.0f);
        ViewGroup.LayoutParams layoutParams2 = getVg_bottom().getLayoutParams();
        f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = ViewUtils.f(getContext(), 6.0f);
    }

    public final void n(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36607, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getTv_all_price().setVisibility(8);
        int iF = ViewUtils.f(getContext(), 10.0f);
        int iF2 = ViewUtils.f(getContext(), 12.0f);
        if (z10) {
            ViewUtils.n0(getTv_name(), iF, ViewUtils.f(getContext(), 2.0f), iF, 0);
            ViewUtils.n0(getVg_bottom(), iF, 0, 0, ViewUtils.f(getContext(), 5.0f));
            getVg_special_tags().setVisibility(0);
        } else {
            ViewUtils.n0(getTv_name(), iF, ViewUtils.f(getContext(), 8.0f), iF, 0);
            ViewUtils.n0(getVg_bottom(), iF, 0, 0, iF2);
            getVg_special_tags().setVisibility(8);
        }
    }

    public final void setCv_img(@dl.d CardView cardView) {
        if (PatchProxy.proxy(new Object[]{cardView}, this, changeQuickRedirect, false, 36570, new Class[]{CardView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cardView, "<set-?>");
        this.f86751b = cardView;
    }

    public final void setIv_follow_icon(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36586, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86760k = imageView;
    }

    public final void setLc_trend_container(@dl.d FrameLayout frameLayout) {
        if (PatchProxy.proxy(new Object[]{frameLayout}, this, changeQuickRedirect, false, 36582, new Class[]{FrameLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(frameLayout, "<set-?>");
        this.f86758i = frameLayout;
    }

    public final void setShowTrend(boolean z10) {
        this.f86755f = z10;
    }

    public final void setTv_all_price(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36584, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86759j = textView;
    }

    public final void setTv_change(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36580, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86757h = textView;
    }

    public final void setTv_follow_num(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36588, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86761l = textView;
    }

    public final void setTv_follow_num_unit(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36590, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86762m = textView;
    }

    public final void setTv_max_online_num(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36594, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86764o = textView;
    }

    public final void setTv_max_online_num_unit(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36596, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86765p = textView;
    }

    public final void setTv_max_online_time(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36598, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86766q = textView;
    }

    public final void setTv_name(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36572, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86752c = textView;
    }

    public final void setVg_bottom(@dl.d RelativeLayout relativeLayout) {
        if (PatchProxy.proxy(new Object[]{relativeLayout}, this, changeQuickRedirect, false, 36576, new Class[]{RelativeLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(relativeLayout, "<set-?>");
        this.f86754e = relativeLayout;
    }

    public final void setVg_max_online(@dl.d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 36592, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f86763n = viewGroup;
    }

    public final void setVg_special_tags(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 36574, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f86753d = linearLayout;
    }

    public final void setVg_trend(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 36578, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f86756g = linearLayout;
    }
}
