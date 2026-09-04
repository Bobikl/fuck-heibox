package com.max.xiaoheihe.module.game.component;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.l;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSCommentObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkSpecialTagObj;
import com.max.xiaoheihe.bean.game.HeyboxGameOfficialCommentTipObj;
import com.max.xiaoheihe.bean.game.MultiDimensionObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.utils.e0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.sf0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.v0;
import kotlin.text.u;

/* JADX INFO: compiled from: GameDetailComment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameDetailComment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailComment.kt\ncom/max/xiaoheihe/module/game/component/GameDetailComment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,543:1\n262#2,2:544\n262#2,2:546\n*S KotlinDebug\n*F\n+ 1 GameDetailComment.kt\ncom/max/xiaoheihe/module/game/component/GameDetailComment\n*L\n187#1:544,2\n196#1:546,2\n*E\n"})
@o(parameters = 0)
public final class GameDetailComment extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f86679y = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BBSUserSectionView f86680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f86681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f86682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f86683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f86684o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f86685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f86686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f86687r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public GameCommentLikeDislikeHappyView f86688s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f86689t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinearLayout f86690u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private ViewStub f86691v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.e
    private View f86692w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.e
    private RelativeLayout f86693x;

    /* JADX INFO: compiled from: GameDetailComment.kt */
    public static final class a extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ BBSCommentObj f86695e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(BBSCommentObj bBSCommentObj, int i10) {
            super(i10);
            this.f86695e = bBSCommentObj;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@dl.d View arg0) {
            if (PatchProxy.proxy(new Object[]{arg0}, this, changeQuickRedirect, false, 36497, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(arg0, "arg0");
            Context context = GameDetailComment.this.getContext();
            f0.o(context, "context");
            com.max.xiaoheihe.base.router.b.T(context, this.f86695e.getUser().getUserid()).A();
        }
    }

    /* JADX INFO: compiled from: GameDetailComment.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f86697c;

        b(LinkInfoObj linkInfoObj) {
            this.f86697c = linkInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36498, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDetailComment.h(GameDetailComment.this, this.f86697c);
            GameDetailComment gameDetailComment = GameDetailComment.this;
            Context context = gameDetailComment.getContext();
            f0.o(context, "context");
            GameDetailComment.i(gameDetailComment, context, GameDetailComment.this.getVg_title().getRatingArrowView(), this.f86697c.getMultidimensional_score());
            GameDetailComment.this.getVg_title().setRatingArrowRotation(180.0f);
        }
    }

    /* JADX INFO: compiled from: GameDetailComment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f86698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameDetailComment f86699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HeyboxGameOfficialCommentTipObj f86700d;

        c(LinkInfoObj linkInfoObj, GameDetailComment gameDetailComment, HeyboxGameOfficialCommentTipObj heyboxGameOfficialCommentTipObj) {
            this.f86698b = linkInfoObj;
            this.f86699c = gameDetailComment;
            this.f86700d = heyboxGameOfficialCommentTipObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36499, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f86698b.getLinkid())) {
                return;
            }
            Context context = this.f86699c.getContext();
            f0.o(context, "context");
            com.max.xiaoheihe.base.router.b.j0(context, this.f86700d.getProtocol());
        }
    }

    /* JADX INFO: compiled from: GameDetailComment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f86701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameDetailComment f86702c;

        d(LinkInfoObj linkInfoObj, GameDetailComment gameDetailComment) {
            this.f86701b = linkInfoObj;
            this.f86702c = gameDetailComment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36500, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f86701b.getLinkid())) {
                return;
            }
            com.max.xiaoheihe.module.bbs.utils.b.F(this.f86702c.getContext(), null, this.f86701b.getLinkid(), this.f86701b.getLink_tag(), this.f86701b.getHas_video(), this.f86701b.getHeybox_developer().getRoot_comment_id());
        }
    }

    /* JADX INFO: compiled from: GameDetailComment.kt */
    public static final class e extends s<MultiDimensionObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f86703b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, List<MultiDimensionObj> list) {
            super(context, list, R.layout.item_game_comment_multi_dimension_in_pop);
            this.f86703b = context;
        }

        public void m(@dl.d s.e viewHolder, @dl.d MultiDimensionObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36501, new Class[]{s.e.class, MultiDimensionObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context context = this.f86703b;
            marginLayoutParams.topMargin = ViewUtils.f(context, 4.0f);
            marginLayoutParams.bottomMargin = ViewUtils.f(context, 4.0f);
            TextView textView = (TextView) viewHolder.i(R.id.tv_name);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_user_laber);
            ((GameRateStarView) viewHolder.i(R.id.ll_user_rating)).setRating(n.p(data.getUser_star()));
            textView.setText(data.getDimension_name());
            textView2.setText(data.getUser_label());
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, MultiDimensionObj multiDimensionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, multiDimensionObj}, this, changeQuickRedirect, false, 36502, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, multiDimensionObj);
        }
    }

    /* JADX INFO: compiled from: GameDetailComment.kt */
    public static final class f implements PopupWindow.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36503, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            GameDetailComment.this.getVg_title().setRatingArrowRotation(0.0f);
        }
    }

    public GameDetailComment(@dl.e Context context) {
        this(context, null);
    }

    public GameDetailComment(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailComment(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        j();
    }

    public static final /* synthetic */ void h(GameDetailComment gameDetailComment, LinkInfoObj linkInfoObj) {
        if (PatchProxy.proxy(new Object[]{gameDetailComment, linkInfoObj}, null, changeQuickRedirect, true, 36495, new Class[]{GameDetailComment.class, LinkInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailComment.r(linkInfoObj);
    }

    public static final /* synthetic */ void i(GameDetailComment gameDetailComment, Context context, View view, List list) {
        if (PatchProxy.proxy(new Object[]{gameDetailComment, context, view, list}, null, changeQuickRedirect, true, 36496, new Class[]{GameDetailComment.class, Context.class, View.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDetailComment.s(context, view, list);
    }

    private final void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36482, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View.inflate(getContext(), R.layout.view_game_detail_comment, this);
        View viewFindViewById = findViewById(R.id.vg_title);
        f0.o(viewFindViewById, "findViewById<BBSUserSectionView>(R.id.vg_title)");
        setVg_title((BBSUserSectionView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.iv_steam_tag);
        f0.o(viewFindViewById2, "findViewById<ImageView>(R.id.iv_steam_tag)");
        setIv_steam_tag((ImageView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.tv_description);
        f0.o(viewFindViewById3, "findViewById<TextView>(R.id.tv_description)");
        setTv_description((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.container);
        f0.o(viewFindViewById4, "findViewById<View>(R.id.container)");
        setContainerView(viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.vg_developers_comment);
        f0.o(viewFindViewById5, "findViewById<View>(R.id.vg_developers_comment)");
        setVg_developers_comment(viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.v_developers_divider);
        f0.o(viewFindViewById6, "findViewById<View>(R.id.v_developers_divider)");
        setV_developers_divider(viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.ll_comments);
        f0.o(viewFindViewById7, "findViewById<LinearLayout>(R.id.ll_comments)");
        setCommentsLinearLayout((LinearLayout) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.game_comment_divider);
        f0.o(viewFindViewById8, "findViewById<View>(R.id.game_comment_divider)");
        setGame_comment_divider(viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.gcldh);
        f0.o(viewFindViewById9, "findViewById(R.id.gcldh)");
        setGcldh((GameCommentLikeDislikeHappyView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.ll_rich_tags);
        f0.o(viewFindViewById10, "findViewById(R.id.ll_rich_tags)");
        setLl_rich_tags((LinearLayout) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.vg_interactive_bar);
        f0.o(viewFindViewById11, "findViewById(R.id.vg_interactive_bar)");
        setVg_interactive_bar((LinearLayout) viewFindViewById11);
        this.f86693x = (RelativeLayout) findViewById(R.id.game_detail_body);
        this.f86691v = (ViewStub) findViewById(R.id.vt_official_comment_tip);
    }

    private final View k(LinkSpecialTagObj linkSpecialTagObj, ViewGroup.LayoutParams layoutParams) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linkSpecialTagObj, layoutParams}, this, changeQuickRedirect, false, 36486, new Class[]{LinkSpecialTagObj.class, ViewGroup.LayoutParams.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        String padding_hor = linkSpecialTagObj.getPadding_hor();
        int iF = !(padding_hor == null || padding_hor.length() == 0) ? ViewUtils.f(getContext(), n.p(linkSpecialTagObj.getPadding_hor())) : ViewUtils.f(getContext(), 4.0f);
        String padding_ver = linkSpecialTagObj.getPadding_ver();
        int iF2 = !(padding_ver == null || padding_ver.length() == 0) ? ViewUtils.f(getContext(), n.p(linkSpecialTagObj.getPadding_ver())) : ViewUtils.f(getContext(), 2.0f);
        String corner_radius = linkSpecialTagObj.getCorner_radius();
        int iF3 = !(corner_radius == null || corner_radius.length() == 0) ? ViewUtils.f(getContext(), n.p(linkSpecialTagObj.getCorner_radius())) : ViewUtils.f(getContext(), 2.0f);
        int iE1 = com.max.xiaoheihe.utils.d.e1(linkSpecialTagObj.getStart_color());
        int iE2 = com.max.xiaoheihe.utils.d.e1(linkSpecialTagObj.getEnd_color());
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 8.0f);
        textView.setPadding(iF, iF2, iF, iF2);
        textView.setTextColor(textView.getContext().getColor(R.color.white));
        textView.setIncludeFontPadding(false);
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        textView.setText(linkSpecialTagObj.getName());
        textView.setBackground(ViewUtils.i(iF3, iE1, iE2));
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private final void l(ExpressionTextView expressionTextView, BBSCommentObj bBSCommentObj) {
        if (PatchProxy.proxy(new Object[]{expressionTextView, bBSCommentObj}, this, changeQuickRedirect, false, 36489, new Class[]{ExpressionTextView.class, BBSCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) com.max.xiaoheihe.utils.d.L1(bBSCommentObj.getUser().getUsername())).append((CharSequence) ": ");
        spannableStringBuilder.setSpan(new a(bBSCommentObj, getContext().getResources().getColor(R.color.text_primary_1_color)), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) bBSCommentObj.getText());
        String strQ = ad.a.b(ad.a.G, false, 2, null) ? w.q(getContext(), bBSCommentObj.getCreate_at()) : w.t(getContext(), bBSCommentObj.getCreate_at());
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) strQ);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(R.color.text_secondary_1_color)), spannableStringBuilder.length() - strQ.length(), spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(getContext().getResources().getDimensionPixelSize(R.dimen.text_size_10)), spannableStringBuilder.length() - strQ.length(), spannableStringBuilder.length(), 33);
        expressionTextView.setText(spannableStringBuilder);
        expressionTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void m(LinearLayout linearLayout, List<? extends BBSCommentObj> list, int i10) {
        if (PatchProxy.proxy(new Object[]{linearLayout, list, new Integer(i10)}, this, changeQuickRedirect, false, 36488, new Class[]{LinearLayout.class, List.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        linearLayout.removeAllViews();
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            BBSCommentObj bBSCommentObj = list.get(i11);
            ExpressionTextView expressionTextView = new ExpressionTextView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int iF = ViewUtils.f(getContext(), 10.0f);
            layoutParams.rightMargin = iF;
            layoutParams.leftMargin = iF;
            float f10 = 8.0f;
            layoutParams.topMargin = ViewUtils.f(getContext(), i11 == 0 ? 8.0f : 4.0f);
            Context context = getContext();
            if (i11 != size - 1) {
                f10 = 0.0f;
            }
            layoutParams.bottomMargin = ViewUtils.f(context, f10);
            expressionTextView.setLayoutParams(layoutParams);
            expressionTextView.setGravity(16);
            expressionTextView.setTextSize(0, getContext().getResources().getDimensionPixelSize(R.dimen.text_size_14));
            expressionTextView.setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
            expressionTextView.setMaxLines(3);
            expressionTextView.setEllipsize(TextUtils.TruncateAt.END);
            l(expressionTextView, bBSCommentObj);
            linearLayout.addView(expressionTextView);
            i11++;
        }
        if (i10 > size) {
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) com.max.xiaoheihe.utils.d.V(R.dimen.divider_height)));
            view.setBackgroundColor(getContext().getResources().getColor(R.color.divider_secondary_1_color));
            linearLayout.addView(view);
            TextView textView = new TextView(getContext());
            textView.setLayoutParams(new LinearLayout.LayoutParams(-1, ViewUtils.f(getContext(), 30.0f)));
            textView.setGravity(17);
            textView.setTextSize(0, getContext().getResources().getDimensionPixelSize(R.dimen.text_size_12));
            textView.setTextColor(getContext().getResources().getColor(R.color.text_secondary_1_color));
            bb.d.d(textView, 0);
            StringBuilder sb2 = new StringBuilder();
            v0 v0Var = v0.f124986a;
            Locale locale = Locale.US;
            String string = getContext().getString(R.string.total_comments_format);
            f0.o(string, "context.getString(R.string.total_comments_format)");
            String str = String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            f0.o(str, "format(locale, format, *args)");
            sb2.append(str);
            sb2.append("  \uf0da");
            textView.setText(sb2.toString());
            linearLayout.addView(textView);
        }
    }

    private final void n(LinkInfoObj linkInfoObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36490, new Class[]{LinkInfoObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getVg_title().h(linkInfoObj, z10);
        getVg_title().setRatingBarClickListener(new b(linkInfoObj));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) e0.k(linkInfoObj.getDescription()));
        e0.b(getTv_description(), spannableStringBuilder, null, false, 5);
        o(linkInfoObj);
    }

    private final void p(LinkInfoObj linkInfoObj) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj}, this, changeQuickRedirect, false, 36487, new Class[]{LinkInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(linkInfoObj.getCustom_collapse_game_comments())) {
            getVg_interactive_bar().setVisibility(8);
            return;
        }
        getVg_interactive_bar().setVisibility(0);
        View viewFindViewById = getVg_interactive_bar().findViewById(R.id.vg_icon);
        f0.o(viewFindViewById, "vg_interactive_bar.findV…nearLayout>(R.id.vg_icon)");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = getVg_interactive_bar().findViewById(R.id.vg_related_events);
        f0.o(viewFindViewById2, "vg_interactive_bar.findV…>(R.id.vg_related_events)");
        LinearLayout linearLayout2 = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = getVg_interactive_bar().findViewById(R.id.tv_related_name);
        f0.o(viewFindViewById3, "vg_interactive_bar.findV…ew>(R.id.tv_related_name)");
        TextView textView = (TextView) viewFindViewById3;
        View viewFindViewById4 = getVg_interactive_bar().findViewById(R.id.tv_related_desc);
        f0.o(viewFindViewById4, "vg_interactive_bar.findV…ew>(R.id.tv_related_desc)");
        TextView textView2 = (TextView) viewFindViewById4;
        View viewFindViewById5 = getVg_interactive_bar().findViewById(R.id.iv_arrow);
        f0.o(viewFindViewById5, "vg_interactive_bar.findV…ImageView>(R.id.iv_arrow)");
        ImageView imageView = (ImageView) viewFindViewById5;
        linearLayout2.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
        int iF = ViewUtils.f(getContext(), 20.0f);
        linearLayout.removeAllViews();
        linearLayout.setLayoutDirection(1);
        int iMin = Math.min(3, linkInfoObj.getCustom_collapse_game_comments().size()) - 1;
        for (int i10 = iMin; -1 < i10; i10--) {
            ImageView imageView2 = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iF, iF);
            if (i10 != iMin) {
                layoutParams2.rightMargin = ViewUtils.f(getContext(), -3.0f);
            } else {
                layoutParams2.rightMargin = ViewUtils.f(getContext(), 6.0f);
            }
            imageView2.setLayoutParams(layoutParams2);
            com.max.hbimage.b.I(linkInfoObj.getCustom_collapse_game_comments().get(i10).getUser().getAvartar(), imageView2, R.drawable.common_default_avatar_40x40);
            linearLayout.addView(imageView2);
        }
        textView.setVisibility(8);
        textView2.setText("查看更多 " + linkInfoObj.getCustom_collapse_game_comments().size() + " 位好友评价");
        imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        imageView.setBackgroundResource(R.drawable.common_arrow_down_filled_24x24);
        imageView.getLayoutParams().width = ViewUtils.f(getContext(), 8.0f);
        imageView.getLayoutParams().height = ViewUtils.f(getContext(), 8.0f);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void q(LinkInfoObj linkInfoObj) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{linkInfoObj}, this, changeQuickRedirect, false, 36485, new Class[]{LinkInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        HeyboxGameOfficialCommentTipObj heybox_official = linkInfoObj.getHeybox_official();
        if (heybox_official == null) {
            View view = this.f86692w;
            if (view != null) {
                view.setVisibility(8);
            }
            RelativeLayout relativeLayout = this.f86693x;
            if (relativeLayout != null) {
                relativeLayout.setPadding(0, 0, 0, ViewUtils.f(getContext(), 16.0f));
                return;
            }
            return;
        }
        ViewStub viewStub = this.f86691v;
        if ((viewStub != null ? viewStub.getParent() : null) != null) {
            ViewStub viewStub2 = this.f86691v;
            this.f86692w = viewStub2 != null ? viewStub2.inflate() : null;
        }
        View view2 = this.f86692w;
        if (view2 != null) {
            view2.setVisibility(0);
            RelativeLayout relativeLayout2 = this.f86693x;
            if (relativeLayout2 != null) {
                relativeLayout2.setPadding(0, 0, 0, ViewUtils.f(getContext(), 12.0f));
            }
            sf0 sf0VarA = sf0.a(view2);
            if (sf0VarA != null) {
                sf0VarA.f115623b.d();
                sf0VarA.f115623b.setBackground(null);
                int iF = ViewUtils.f(getContext(), 6.0f);
                int iF2 = ViewUtils.f(getContext(), 20.0f);
                ImageView imageView = new ImageView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF2, iF2);
                layoutParams.setMarginEnd(iF);
                imageView.setLayoutParams(layoutParams);
                sf0VarA.f115623b.a(imageView);
                com.max.hbimage.b.H(heybox_official.getAvatar(), imageView);
                TextView textView = new TextView(getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMarginEnd(iF);
                textView.setLayoutParams(layoutParams2);
                textView.setTextSize(0, ViewUtils.f(textView.getContext(), 13.0f));
                textView.setTextColor(textView.getContext().getColor(R.color.text_primary_1_color));
                textView.setIncludeFontPadding(false);
                textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                textView.setText(heybox_official.getUsername());
                sf0VarA.f115623b.a(textView);
                LinkSpecialTagObj specialTag = heybox_official.getSpecialTag();
                if (specialTag != null) {
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams3.setMarginEnd(iF);
                    sf0VarA.f115623b.a(k(specialTag, layoutParams3));
                }
                String desc = heybox_official.getDesc();
                if (desc != null && !u.V1(desc)) {
                    z10 = false;
                }
                if (!z10) {
                    sf0VarA.f115623b.setText(heybox_official.getDesc());
                }
                sf0VarA.b().setOnClickListener(new c(linkInfoObj, this, heybox_official));
            }
        }
    }

    private final void r(LinkInfoObj linkInfoObj) {
        if (PatchProxy.proxy(new Object[]{linkInfoObj}, this, changeQuickRedirect, false, 36491, new Class[]{LinkInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        if (!com.max.hbcommon.utils.c.u(linkInfoObj.getAppid())) {
            jsonObject.addProperty("app_id", linkInfoObj.getAppid());
        }
        if (!com.max.hbcommon.utils.c.u(linkInfoObj.getLinkid())) {
            jsonObject.addProperty("link_id", linkInfoObj.getLinkid());
        }
        l.f66572a.l(lb.d.f131131b3, jsonObject);
    }

    private final void s(Context context, View view, List<MultiDimensionObj> list) {
        if (PatchProxy.proxy(new Object[]{context, view, list}, this, changeQuickRedirect, false, 36492, new Class[]{Context.class, View.class, List.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(list)) {
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_multi_dimension_pop, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_bg);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new e(context, list));
        int iF = ViewUtils.f(context, 34.0f);
        int iF2 = ViewUtils.f(context, 21.0f);
        f0.m(list);
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, iF + (iF2 * list.size()), true);
        popupWindow.setTouchable(true);
        popupWindow.setOnDismissListener(new f());
        popupWindow.setAnimationStyle(R.style.DropDownPopupWindowAnimation);
        if (popupWindow.isShowing()) {
            return;
        }
        view.getLocationOnScreen(new int[2]);
        popupWindow.showAsDropDown(view, (ViewUtils.W(view) - ViewUtils.W(viewInflate)) / 2, -ViewUtils.f(context, 3.0f));
        if (popupWindow.isAboveAnchor()) {
            imageView.setRotation(0.0f);
        }
    }

    public static /* synthetic */ void setData$default(GameDetailComment gameDetailComment, LinkInfoObj linkInfoObj, String str, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{gameDetailComment, linkInfoObj, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 36484, new Class[]{GameDetailComment.class, LinkInfoObj.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        gameDetailComment.setData(linkInfoObj, str);
    }

    @dl.d
    public final LinearLayout getCommentsLinearLayout() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36472, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f86686q;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("commentsLinearLayout");
        return null;
    }

    @dl.d
    public final View getContainerView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36466, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f86683n;
        if (view != null) {
            return view;
        }
        f0.S("containerView");
        return null;
    }

    @dl.d
    public final View getGame_comment_divider() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36474, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f86687r;
        if (view != null) {
            return view;
        }
        f0.S("game_comment_divider");
        return null;
    }

    @dl.d
    public final GameCommentLikeDislikeHappyView getGcldh() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36476, new Class[0], GameCommentLikeDislikeHappyView.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameCommentLikeDislikeHappyView) patchProxyResultProxy.result;
        }
        GameCommentLikeDislikeHappyView gameCommentLikeDislikeHappyView = this.f86688s;
        if (gameCommentLikeDislikeHappyView != null) {
            return gameCommentLikeDislikeHappyView;
        }
        f0.S("gcldh");
        return null;
    }

    @dl.d
    public final ImageView getIv_steam_tag() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36462, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86681l;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_steam_tag");
        return null;
    }

    @dl.d
    public final LinearLayout getLl_rich_tags() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36478, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f86689t;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_rich_tags");
        return null;
    }

    @dl.d
    public final TextView getTv_description() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36464, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86682m;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_description");
        return null;
    }

    @dl.d
    public final View getV_developers_divider() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36470, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f86685p;
        if (view != null) {
            return view;
        }
        f0.S("v_developers_divider");
        return null;
    }

    @dl.d
    public final View getVg_developers_comment() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36468, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f86684o;
        if (view != null) {
            return view;
        }
        f0.S("vg_developers_comment");
        return null;
    }

    @dl.d
    public final LinearLayout getVg_interactive_bar() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36480, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f86690u;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("vg_interactive_bar");
        return null;
    }

    @dl.d
    public final BBSUserSectionView getVg_title() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36460, new Class[0], BBSUserSectionView.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSUserSectionView) patchProxyResultProxy.result;
        }
        BBSUserSectionView bBSUserSectionView = this.f86680k;
        if (bBSUserSectionView != null) {
            return bBSUserSectionView;
        }
        f0.S("vg_title");
        return null;
    }

    public final void o(@dl.d LinkInfoObj data) {
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 36494, new Class[]{LinkInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        GameCommentLikeDislikeHappyView.f(getGcldh(), data, false, 2, null);
        getLl_rich_tags().removeAllViews();
        List<RichAttributeModelObj> comment_num_rich_text = data.getComment_num_rich_text();
        if (comment_num_rich_text != null) {
            Iterator<RichAttributeModelObj> it = comment_num_rich_text.iterator();
            while (it.hasNext()) {
                getLl_rich_tags().addView(r1.s0(getContext(), it.next()));
            }
        }
    }

    public final void setCommentsLinearLayout(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 36473, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f86686q = linearLayout;
    }

    public final void setContainerView(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36467, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f86683n = view;
    }

    public final void setData(@dl.d LinkInfoObj data, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{data, str}, this, changeQuickRedirect, false, 36483, new Class[]{LinkInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        getVg_title().setData(data, str);
        getIv_steam_tag().setVisibility(8);
        n(data, true);
        if (data.getHeybox_developer() != null) {
            getVg_developers_comment().setVisibility(0);
            getV_developers_divider().setVisibility(0);
            getVg_developers_comment().setOnClickListener(new d(data, this));
        } else {
            getVg_developers_comment().setVisibility(8);
            getV_developers_divider().setVisibility(8);
        }
        if (data.getComments() == null || data.getComments().size() <= 0) {
            getCommentsLinearLayout().setVisibility(8);
        } else {
            getCommentsLinearLayout().setVisibility(0);
            LinearLayout commentsLinearLayout = getCommentsLinearLayout();
            List<BBSCommentObj> comments = data.getComments();
            f0.o(comments, "data.comments");
            m(commentsLinearLayout, comments, n.q(data.getComment_num()));
        }
        q(data);
        p(data);
    }

    public final void setGame_comment_divider(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36475, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f86687r = view;
    }

    public final void setGcldh(@dl.d GameCommentLikeDislikeHappyView gameCommentLikeDislikeHappyView) {
        if (PatchProxy.proxy(new Object[]{gameCommentLikeDislikeHappyView}, this, changeQuickRedirect, false, 36477, new Class[]{GameCommentLikeDislikeHappyView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(gameCommentLikeDislikeHappyView, "<set-?>");
        this.f86688s = gameCommentLikeDislikeHappyView;
    }

    public final void setIv_steam_tag(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36463, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86681l = imageView;
    }

    public final void setLl_rich_tags(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 36479, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f86689t = linearLayout;
    }

    public final void setMoreMenu(@dl.d View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 36493, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onClickListener, "onClickListener");
        getVg_title().getIv_more().setVisibility(0);
        getVg_title().getIv_more().setOnClickListener(onClickListener);
    }

    public final void setTv_description(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36465, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86682m = textView;
    }

    public final void setV_developers_divider(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36471, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f86685p = view;
    }

    public final void setVg_developers_comment(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36469, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f86684o = view;
    }

    public final void setVg_interactive_bar(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 36481, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f86690u = linearLayout;
    }

    public final void setVg_title(@dl.d BBSUserSectionView bBSUserSectionView) {
        if (PatchProxy.proxy(new Object[]{bBSUserSectionView}, this, changeQuickRedirect, false, 36461, new Class[]{BBSUserSectionView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bBSUserSectionView, "<set-?>");
        this.f86680k = bBSUserSectionView;
    }
}
