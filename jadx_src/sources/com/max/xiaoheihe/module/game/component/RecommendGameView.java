package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcustomview.CustomHorizontalScrollView;
import com.max.hbcustomview.recyclerview.MaxLineFlexboxLayoutManager;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.view.richtext.RichViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: RecommendGameView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class RecommendGameView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f86963y = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RelativeLayout f86964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f86965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GamePriceView f86966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CustomHorizontalScrollView f86967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f86968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f86969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f86970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CardView f86971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f86972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ViewGroup f86973k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f86974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f86975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f86976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CardView f86977o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f86978p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RecyclerView f86979q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f86980r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f86981s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f86982t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f86983u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f86984v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @e
    private s<RichAttributeModelObj> f86985w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @d
    private ArrayList<RichAttributeModelObj> f86986x;

    /* JADX INFO: compiled from: RecommendGameView.kt */
    public static final class a extends s<RichAttributeModelObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Context context, ArrayList<RichAttributeModelObj> arrayList) {
            super(context, arrayList, R.layout.item_rich_text_view);
        }

        public void m(@e s.e eVar, @e RichAttributeModelObj richAttributeModelObj) {
            if (PatchProxy.proxy(new Object[]{eVar, richAttributeModelObj}, this, changeQuickRedirect, false, 37002, new Class[]{s.e.class, RichAttributeModelObj.class}, Void.TYPE).isSupported || eVar == null || richAttributeModelObj == null) {
                return;
            }
            View viewI = eVar.i(R.id.rich_text_group);
            f0.o(viewI, "holder.getView(R.id.rich_text_group)");
            RichViewGroup.setRichText$default((RichViewGroup) viewI, richAttributeModelObj, false, 2, null);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, RichAttributeModelObj richAttributeModelObj) {
            if (PatchProxy.proxy(new Object[]{eVar, richAttributeModelObj}, this, changeQuickRedirect, false, 37003, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, richAttributeModelObj);
        }
    }

    public RecommendGameView(@e Context context) {
        this(context, null);
    }

    public RecommendGameView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecommendGameView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public RecommendGameView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f86986x = new ArrayList<>();
        a();
        this.f86984v = (ViewUtils.L(context) - ViewUtils.f(context, 35.0f)) / 2;
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36995, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setBackgroundResource(R.drawable.list_item_bg);
        View viewInflate = View.inflate(getContext(), R.layout.view_recommend_game_img, this);
        f0.n(viewInflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        setRl_img((RelativeLayout) viewInflate);
        View viewFindViewById = findViewById(R.id.cv_img);
        f0.o(viewFindViewById, "findViewById(R.id.cv_img)");
        setCv_img((CardView) viewFindViewById);
        getCv_img().setRadius(ViewUtils.n(getContext(), (ViewUtils.L(getContext()) / 2) - ViewUtils.f(getContext(), 40.0f), ViewUtils.f(getContext(), 84.0f), ViewUtils.ViewType.IMAGE));
        View viewFindViewById2 = findViewById(R.id.iv_img);
        f0.o(viewFindViewById2, "findViewById(R.id.iv_img)");
        setIv_img((ImageView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.vg_is_owned);
        f0.o(viewFindViewById3, "findViewById(R.id.vg_is_owned)");
        setVg_is_owned((ViewGroup) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.tv_discount);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_discount)");
        setTv_discount((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.tv_tag_ad);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_tag_ad)");
        setTv_tag_ad((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.ll_htag);
        f0.o(viewFindViewById6, "findViewById(R.id.ll_htag)");
        setLl_htag((LinearLayout) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.card_htag);
        f0.o(viewFindViewById7, "findViewById(R.id.card_htag)");
        setCard_htag((CardView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.ll_platform_icon);
        f0.o(viewFindViewById8, "findViewById(R.id.ll_platform_icon)");
        setLl_platform_icon((LinearLayout) viewFindViewById8);
        getCard_htag().setRadius(ViewUtils.m(getContext(), ViewUtils.f(getContext(), 48.0f), ViewUtils.f(getContext(), 15.0f)));
        setTv_name(new TextView(getContext()));
        getTv_name().setId(R.id.tv_name);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, R.id.rl_img);
        layoutParams.topMargin = ViewUtils.f(getContext(), 5.0f);
        layoutParams.bottomMargin = ViewUtils.f(getContext(), 5.0f);
        getTv_name().setEllipsize(TextUtils.TruncateAt.END);
        getTv_name().setMaxLines(1);
        getTv_name().setIncludeFontPadding(false);
        getTv_name().setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
        getTv_name().setTextSize(1, 14.0f);
        getTv_name().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        addView(getTv_name(), layoutParams);
        View viewInflate2 = View.inflate(getContext(), R.layout.layout_game_price_and_more_tags, null);
        f0.o(viewInflate2, "inflate(context, R.layou…rice_and_more_tags, null)");
        setVg_game_price(viewInflate2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, R.id.tv_name);
        layoutParams2.bottomMargin = ViewUtils.f(getContext(), 6.0f);
        getVg_game_price().setMinimumHeight(ViewUtils.f(getContext(), 16.0f));
        addView(getVg_game_price(), layoutParams2);
        View viewFindViewById9 = findViewById(R.id.gpv);
        f0.o(viewFindViewById9, "findViewById(R.id.gpv)");
        setGpv((GamePriceView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.ll_more_tags);
        f0.o(viewFindViewById10, "findViewById(R.id.ll_more_tags)");
        setLl_more_tags((LinearLayout) viewFindViewById10);
        View viewInflate3 = View.inflate(getContext(), R.layout.item_release_time, null);
        f0.o(viewInflate3, "inflate(context, R.layout.item_release_time, null)");
        setLl_release_time(viewInflate3);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, ViewUtils.f(getContext(), 16.0f));
        layoutParams3.bottomMargin = ViewUtils.f(getContext(), 6.0f);
        layoutParams3.addRule(3, R.id.tv_name);
        getLl_release_time().setLayoutParams(layoutParams3);
        getLl_release_time().setVisibility(8);
        addView(getLl_release_time());
        View viewFindViewById11 = getLl_release_time().findViewById(R.id.tv_release_time);
        f0.o(viewFindViewById11, "ll_release_time.findViewById(R.id.tv_release_time)");
        setTv_release_time((TextView) viewFindViewById11);
        getTv_release_time().setTypeface(bb.d.a().b(4));
        View viewInflate4 = View.inflate(getContext(), R.layout.view_recommend_game_tags, null);
        f0.n(viewInflate4, "null cannot be cast to non-null type com.max.hbcustomview.CustomHorizontalScrollView");
        setHsv_tags((CustomHorizontalScrollView) viewInflate4);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(3, R.id.vg_price_and_tags);
        addView(getHsv_tags(), layoutParams4);
        int iF = ViewUtils.f(getContext(), 18.0f);
        int iF2 = ViewUtils.f(getContext(), 8.0f);
        setIv_avatar_0(new ImageView(getContext()));
        getIv_avatar_0().setId(R.id.iv_avatar_0);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iF, iF);
        layoutParams5.addRule(3, R.id.vg_price_and_tags);
        layoutParams5.topMargin = iF2;
        getIv_avatar_0().setVisibility(8);
        addView(getIv_avatar_0(), layoutParams5);
        setIv_avatar_1(new ImageView(getContext()));
        getIv_avatar_1().setId(R.id.iv_avatar_1);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(iF, iF);
        layoutParams6.addRule(8, R.id.iv_avatar_0);
        layoutParams6.addRule(1, R.id.iv_avatar_0);
        layoutParams6.leftMargin = iF2;
        layoutParams6.topMargin = iF2;
        getIv_avatar_1().setVisibility(8);
        addView(getIv_avatar_1(), layoutParams6);
        setIv_avatar_2(new ImageView(getContext()));
        getIv_avatar_2().setId(R.id.iv_avatar_2);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(iF, iF);
        layoutParams7.addRule(8, R.id.iv_avatar_1);
        layoutParams7.addRule(1, R.id.iv_avatar_1);
        layoutParams7.leftMargin = iF2;
        layoutParams7.topMargin = iF2;
        getIv_avatar_2().setVisibility(8);
        addView(getIv_avatar_2(), layoutParams7);
        setRv_rich_tags(new RecyclerView(getContext()));
        Context context = getContext();
        f0.o(context, "context");
        MaxLineFlexboxLayoutManager maxLineFlexboxLayoutManager = new MaxLineFlexboxLayoutManager(context, 1);
        maxLineFlexboxLayoutManager.setFlexWrap(1);
        getRv_rich_tags().setLayoutManager(maxLineFlexboxLayoutManager);
        this.f86985w = new a(getContext(), this.f86986x);
        getRv_rich_tags().setAdapter(this.f86985w);
        getRv_rich_tags().setMinimumHeight(ViewUtils.f(getContext(), 16.0f));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams8.addRule(3, R.id.vg_price_and_tags);
        addView(getRv_rich_tags(), layoutParams8);
    }

    public static /* synthetic */ void e(RecommendGameView recommendGameView, GameObj gameObj, int i10, View.OnClickListener onClickListener, boolean z10, int i11, Object obj) {
        Object[] objArr = {recommendGameView, gameObj, new Integer(i10), onClickListener, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 37001, new Class[]{RecommendGameView.class, GameObj.class, cls, View.OnClickListener.class, Boolean.TYPE, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        recommendGameView.c(gameObj, i10, (i11 & 4) != 0 ? null : onClickListener, (i11 & 8) == 0 ? z10 ? 1 : 0 : false);
    }

    public static /* synthetic */ void f(RecommendGameView recommendGameView, RecommendGameListItemObj recommendGameListItemObj, int i10, boolean z10, int i11, Object obj) {
        Object[] objArr = {recommendGameView, recommendGameListItemObj, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 36999, new Class[]{RecommendGameView.class, RecommendGameListItemObj.class, cls, Boolean.TYPE, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        recommendGameView.d(recommendGameListItemObj, i10, z10);
    }

    public final void b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(@d GameObj data, int i10, @e View.OnClickListener onClickListener, boolean z10) {
        if (PatchProxy.proxy(new Object[]{data, new Integer(i10), onClickListener, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37000, new Class[]{GameObj.class, Integer.TYPE, View.OnClickListener.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        ViewGroup.LayoutParams layoutParams = getIv_img().getLayoutParams();
        if (layoutParams.height != i10) {
            layoutParams.height = i10;
            getIv_img().setLayoutParams(layoutParams);
        }
        com.max.hbimage.b.L(data.getImage(), getIv_img(), R.drawable.common_default_placeholder_375x210);
        r1.B1(getLl_platform_icon(), data);
        if (f0.g("1", data.getIs_owned())) {
            getVg_is_owned().setVisibility(0);
        } else {
            getVg_is_owned().setVisibility(8);
        }
        getTv_name().setText(data.getName());
        GamePriceView.k(getGpv(), data, false, GamePriceView.ColorType.Light, data.getHeybox_price() != null, false, 16, null);
        LinearLayout.LayoutParams layoutParams2 = null;
        r1.x1(getHsv_tags(), null, getLl_htag(), data, Boolean.TRUE);
        this.f86986x.clear();
        if (!com.max.hbcommon.utils.c.w(data.getHb_rich_texts())) {
            this.f86986x.addAll(data.getHb_rich_texts());
        }
        s<RichAttributeModelObj> sVar = this.f86985w;
        if (sVar != null) {
            sVar.notifyDataSetChanged();
        }
        List<RichAttributeModelObj> hb_rich_texts = data.getHb_rich_texts();
        if ((hb_rich_texts == null || hb_rich_texts.isEmpty()) == true) {
            getHsv_tags().setVisibility(0);
            getRv_rich_tags().setVisibility(8);
        } else {
            getHsv_tags().setVisibility(8);
            getRv_rich_tags().setVisibility(0);
        }
        if (f0.g("advertise", data.getLabel())) {
            getTv_tag_ad().setVisibility(0);
            getTv_tag_ad().setText(R.string.advertisement);
        } else {
            getTv_tag_ad().setVisibility(8);
        }
        r1.d2(this, data, onClickListener);
        getLl_more_tags().removeAllViews();
        List<RichAttributeModelObj> rich_tags = data.getRich_tags();
        if ((rich_tags == null || rich_tags.isEmpty()) == true) {
            getLl_more_tags().setVisibility(8);
        } else {
            getLl_more_tags().setVisibility(0);
            Iterator<RichAttributeModelObj> it = data.getRich_tags().iterator();
            while (it.hasNext()) {
                getLl_more_tags().addView(r1.s0(getContext(), it.next()));
            }
        }
        long jR = n.r(data.getRelease_timestamp());
        if (!z10 || jR <= 0) {
            getVg_game_price().setVisibility(0);
            getLl_release_time().setVisibility(8);
            return;
        }
        getVg_game_price().setVisibility(4);
        getLl_release_time().setVisibility(0);
        String releaseTimeStr = w.E(jR);
        getTv_release_time().setText(releaseTimeStr);
        f0.o(releaseTimeStr, "releaseTimeStr");
        if (StringsKt__StringsKt.W2(releaseTimeStr, ".", false, 2, null)) {
            getTv_release_time().setTextSize(1, 12.0f);
            getTv_release_time().setTypeface(bb.d.a().b(4));
            TextView tv_release_time = getTv_release_time();
            ViewGroup.LayoutParams layoutParams3 = tv_release_time.getLayoutParams();
            LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.topMargin = ViewUtils.f(tv_release_time.getContext(), 1.0f);
                layoutParams2 = layoutParams4;
            }
            tv_release_time.setLayoutParams(layoutParams2);
            return;
        }
        getTv_release_time().setTextSize(1, 10.0f);
        getTv_release_time().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        TextView tv_release_time2 = getTv_release_time();
        ViewGroup.LayoutParams layoutParams5 = tv_release_time2.getLayoutParams();
        LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams5 : null;
        if (layoutParams6 != null) {
            layoutParams6.topMargin = 0;
            layoutParams2 = layoutParams6;
        }
        tv_release_time2.setLayoutParams(layoutParams2);
    }

    public final void d(@d RecommendGameListItemObj data, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{data, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36998, new Class[]{RecommendGameListItemObj.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        GameObj gameObjW = r1.w(data);
        f0.o(gameObjW, "convertToGameObj(data)");
        c(gameObjW, i10, null, z10);
    }

    public final void g(@d RecommendGameListItemObj data, int i10) {
        if (PatchProxy.proxy(new Object[]{data, new Integer(i10)}, this, changeQuickRedirect, false, 36996, new Class[]{RecommendGameListItemObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        h(data, i10, false);
    }

    @d
    public final CardView getCard_htag() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36981, new Class[0], CardView.class);
        if (patchProxyResultProxy.isSupported) {
            return (CardView) patchProxyResultProxy.result;
        }
        CardView cardView = this.f86977o;
        if (cardView != null) {
            return cardView;
        }
        f0.S("card_htag");
        return null;
    }

    @d
    public final CardView getCv_img() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36969, new Class[0], CardView.class);
        if (patchProxyResultProxy.isSupported) {
            return (CardView) patchProxyResultProxy.result;
        }
        CardView cardView = this.f86971i;
        if (cardView != null) {
            return cardView;
        }
        f0.S("cv_img");
        return null;
    }

    public final int getDesireWidth() {
        return this.f86984v;
    }

    @d
    public final GamePriceView getGpv() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36959, new Class[0], GamePriceView.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamePriceView) patchProxyResultProxy.result;
        }
        GamePriceView gamePriceView = this.f86966d;
        if (gamePriceView != null) {
            return gamePriceView;
        }
        f0.S("gpv");
        return null;
    }

    @d
    public final CustomHorizontalScrollView getHsv_tags() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36961, new Class[0], CustomHorizontalScrollView.class);
        if (patchProxyResultProxy.isSupported) {
            return (CustomHorizontalScrollView) patchProxyResultProxy.result;
        }
        CustomHorizontalScrollView customHorizontalScrollView = this.f86967e;
        if (customHorizontalScrollView != null) {
            return customHorizontalScrollView;
        }
        f0.S("hsv_tags");
        return null;
    }

    @d
    public final ImageView getIv_avatar_0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36963, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86968f;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_avatar_0");
        return null;
    }

    @d
    public final ImageView getIv_avatar_1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36965, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86969g;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_avatar_1");
        return null;
    }

    @d
    public final ImageView getIv_avatar_2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36967, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86970h;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_avatar_2");
        return null;
    }

    @d
    public final ImageView getIv_img() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36971, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86972j;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_img");
        return null;
    }

    @d
    public final LinearLayout getLl_htag() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36979, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f86976n;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_htag");
        return null;
    }

    @d
    public final LinearLayout getLl_more_tags() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36987, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f86980r;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_more_tags");
        return null;
    }

    @d
    public final LinearLayout getLl_platform_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36983, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f86978p;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_platform_icon");
        return null;
    }

    @d
    public final View getLl_release_time() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36991, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f86982t;
        if (view != null) {
            return view;
        }
        f0.S("ll_release_time");
        return null;
    }

    @d
    public final RelativeLayout getRl_img() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36955, new Class[0], RelativeLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelativeLayout) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = this.f86964b;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        f0.S("rl_img");
        return null;
    }

    @d
    public final RecyclerView getRv_rich_tags() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36985, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.f86979q;
        if (recyclerView != null) {
            return recyclerView;
        }
        f0.S("rv_rich_tags");
        return null;
    }

    @d
    public final TextView getTv_discount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36975, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86974l;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_discount");
        return null;
    }

    @d
    public final TextView getTv_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36957, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86965c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_name");
        return null;
    }

    @d
    public final TextView getTv_release_time() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36993, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86983u;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_release_time");
        return null;
    }

    @d
    public final TextView getTv_tag_ad() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36977, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86975m;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_tag_ad");
        return null;
    }

    @d
    public final View getVg_game_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36989, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f86981s;
        if (view != null) {
            return view;
        }
        f0.S("vg_game_price");
        return null;
    }

    @d
    public final ViewGroup getVg_is_owned() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36973, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f86973k;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vg_is_owned");
        return null;
    }

    public final void h(@d RecommendGameListItemObj data, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{data, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36997, new Class[]{RecommendGameListItemObj.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        int size = data.getFriends() != null ? data.getFriends().size() : 0;
        if (size > 0) {
            getIv_avatar_0().setVisibility(0);
            r1.U1(getIv_avatar_0(), data.getFriends().get(0));
            if (size > 1) {
                getIv_avatar_1().setVisibility(0);
                r1.U1(getIv_avatar_1(), data.getFriends().get(1));
            } else {
                getIv_avatar_1().setVisibility(8);
            }
            if (size > 2) {
                getIv_avatar_2().setVisibility(0);
                r1.U1(getIv_avatar_2(), data.getFriends().get(2));
            } else {
                getIv_avatar_2().setVisibility(8);
            }
        } else {
            getIv_avatar_0().setVisibility(8);
            getIv_avatar_1().setVisibility(8);
            getIv_avatar_1().setVisibility(8);
        }
        d(data, i10, z10);
    }

    public final void setCard_htag(@d CardView cardView) {
        if (PatchProxy.proxy(new Object[]{cardView}, this, changeQuickRedirect, false, 36982, new Class[]{CardView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cardView, "<set-?>");
        this.f86977o = cardView;
    }

    public final void setCv_img(@d CardView cardView) {
        if (PatchProxy.proxy(new Object[]{cardView}, this, changeQuickRedirect, false, 36970, new Class[]{CardView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cardView, "<set-?>");
        this.f86971i = cardView;
    }

    public final void setDesireWidth(int i10) {
        this.f86984v = i10;
    }

    public final void setGpv(@d GamePriceView gamePriceView) {
        if (PatchProxy.proxy(new Object[]{gamePriceView}, this, changeQuickRedirect, false, 36960, new Class[]{GamePriceView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(gamePriceView, "<set-?>");
        this.f86966d = gamePriceView;
    }

    public final void setHsv_tags(@d CustomHorizontalScrollView customHorizontalScrollView) {
        if (PatchProxy.proxy(new Object[]{customHorizontalScrollView}, this, changeQuickRedirect, false, 36962, new Class[]{CustomHorizontalScrollView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(customHorizontalScrollView, "<set-?>");
        this.f86967e = customHorizontalScrollView;
    }

    public final void setIv_avatar_0(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36964, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86968f = imageView;
    }

    public final void setIv_avatar_1(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36966, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86969g = imageView;
    }

    public final void setIv_avatar_2(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36968, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86970h = imageView;
    }

    public final void setIv_img(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36972, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86972j = imageView;
    }

    public final void setLl_htag(@d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 36980, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f86976n = linearLayout;
    }

    public final void setLl_more_tags(@d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 36988, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f86980r = linearLayout;
    }

    public final void setLl_platform_icon(@d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 36984, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f86978p = linearLayout;
    }

    public final void setLl_release_time(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36992, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f86982t = view;
    }

    public final void setRl_img(@d RelativeLayout relativeLayout) {
        if (PatchProxy.proxy(new Object[]{relativeLayout}, this, changeQuickRedirect, false, 36956, new Class[]{RelativeLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(relativeLayout, "<set-?>");
        this.f86964b = relativeLayout;
    }

    public final void setRv_rich_tags(@d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 36986, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "<set-?>");
        this.f86979q = recyclerView;
    }

    public final void setTv_discount(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36976, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86974l = textView;
    }

    public final void setTv_name(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36958, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86965c = textView;
    }

    public final void setTv_release_time(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36994, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86983u = textView;
    }

    public final void setTv_tag_ad(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36978, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86975m = textView;
    }

    public final void setVg_game_price(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36990, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f86981s = view;
    }

    public final void setVg_is_owned(@d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 36974, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f86973k = viewGroup;
    }
}
