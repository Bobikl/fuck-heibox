package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.eclipsesource.v8.Platform;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.hbcustomview.CircleProgressView;
import com.max.hbcustomview.CustomHorizontalScrollView;
import com.max.hbcustomview.chart.RadarView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameDetailsWrapperObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.HardwarePerformance;
import com.max.xiaoheihe.bean.game.MultiDimensionRadarObj;
import com.max.xiaoheihe.bean.game.MultiDimensionScore;
import com.max.xiaoheihe.module.game.component.GameItemView;
import com.max.xiaoheihe.module.game.component.RecommendGameView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import df.el;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: GameDetailContentRender.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final m f87809a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f87810b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: GameDetailContentRender.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f87811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f87812c;

        a(Context context, String str) {
            this.f87811b = context;
            this.f87812c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32670, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.Q(this.f87811b, this.f87812c).A();
        }
    }

    /* JADX INFO: compiled from: GameDetailContentRender.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f87813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f87814c;

        b(Context context, String str) {
            this.f87813b = context;
            this.f87814c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32671, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.Q(this.f87813b, this.f87814c).A();
        }
    }

    /* JADX INFO: compiled from: GameDetailContentRender.kt */
    public static final class c extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f87815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f87816c;

        c(Context context, boolean z10) {
            this.f87815b = context;
            this.f87816c = z10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            int itemCount;
            int iF;
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 32672, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(outRect, "outRect");
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(parent, "parent");
            kotlin.jvm.internal.f0.p(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            int iF2 = childAdapterPosition == 0 ? ViewUtils.f(this.f87815b, 12.0f) : ViewUtils.f(this.f87815b, 4.0f);
            if (parent.getAdapter() != null) {
                RecyclerView.Adapter adapter = parent.getAdapter();
                kotlin.jvm.internal.f0.m(adapter);
                itemCount = adapter.getItemCount();
            } else {
                itemCount = 0;
            }
            if (this.f87816c && childAdapterPosition == itemCount - 1) {
                iF = 0;
            } else {
                iF = childAdapterPosition == itemCount - 1 ? ViewUtils.f(this.f87815b, 12.0f) : ViewUtils.f(this.f87815b, 4.0f);
            }
            outRect.set(iF2, 0, iF, ViewUtils.f(this.f87815b, 14.0f));
        }
    }

    /* JADX INFO: compiled from: GameDetailContentRender.kt */
    public static final class d extends com.max.hbcommon.base.adapter.s<GameObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f87817b;

        /* JADX INFO: compiled from: GameDetailContentRender.kt */
        public static final class a implements com.max.hbcommon.analytics.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f87818b;

            a(com.max.hbcommon.base.adapter.s.e eVar) {
                this.f87818b = eVar;
            }

            @Override // com.max.hbcommon.analytics.g
            @dl.e
            public JsonObject getAdditional() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32675, new Class[0], JsonObject.class);
                if (patchProxyResultProxy.isSupported) {
                    return (JsonObject) patchProxyResultProxy.result;
                }
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(UCropPlusActivity.ARG_INDEX, Integer.valueOf(this.f87818b.getBindingAdapterPosition()));
                return jsonObject;
            }

            @Override // com.max.hbcommon.analytics.g
            @dl.e
            public String getPath() {
                return lb.d.f131159f3;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, List<GameObj> list) {
            super(context, list, R.layout.item_hor_recommend_game);
            this.f87817b = context;
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.e GameObj gameObj) {
            View vg_game_price;
            if (PatchProxy.proxy(new Object[]{viewHolder, gameObj}, this, changeQuickRedirect, false, 32673, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            if (gameObj != null) {
                Context context = this.f87817b;
                RecommendGameView rgv = (RecommendGameView) viewHolder.i(R.id.rgv);
                if (rgv != null) {
                    kotlin.jvm.internal.f0.o(rgv, "rgv");
                    RecommendGameView.e(rgv, gameObj, ViewUtils.f(context, 71.0f), null, false, 8, null);
                }
                ViewGroup.LayoutParams layoutParams = null;
                CardView cv_img = rgv != null ? rgv.getCv_img() : null;
                if (cv_img != null) {
                    cv_img.setRadius(ViewUtils.f(context, 5.0f));
                }
                CustomHorizontalScrollView hsv_tags = rgv != null ? rgv.getHsv_tags() : null;
                if (hsv_tags != null) {
                    hsv_tags.setVisibility(8);
                }
                if (rgv != null && (vg_game_price = rgv.getVg_game_price()) != null) {
                    layoutParams = vg_game_price.getLayoutParams();
                }
                kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
                rgv.setTag(new a(viewHolder));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 32674, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameObj);
        }
    }

    /* JADX INFO: compiled from: GameDetailContentRender.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f87819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HardwarePerformance f87820c;

        e(Context context, HardwarePerformance hardwarePerformance) {
            this.f87819b = context;
            this.f87820c = hardwarePerformance;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32676, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f87819b, this.f87820c.getProtocol());
        }
    }

    private m() {
    }

    public final void a(@dl.d View group, @dl.d View space, @dl.e GameDetailsWrapperObj gameDetailsWrapperObj) {
        if (PatchProxy.proxy(new Object[]{group, space, gameDetailsWrapperObj}, this, changeQuickRedirect, false, 32666, new Class[]{View.class, View.class, GameDetailsWrapperObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(group, "group");
        kotlin.jvm.internal.f0.p(space, "space");
        if ((gameDetailsWrapperObj != null ? gameDetailsWrapperObj.getDemo_concat_game() : null) == null || com.max.hbcommon.utils.c.u(gameDetailsWrapperObj.getDemo_concat_game_title())) {
            group.setVisibility(8);
            space.setVisibility(8);
            return;
        }
        group.setVisibility(0);
        space.setVisibility(0);
        ListSectionHeader listSectionHeader = (ListSectionHeader) group.findViewById(R.id.lsh_concat_game);
        GameItemView giv_concat_game = (GameItemView) group.findViewById(R.id.giv_concat_game);
        listSectionHeader.setTitleText(gameDetailsWrapperObj.getDemo_concat_game_title());
        kotlin.jvm.internal.f0.o(giv_concat_game, "giv_concat_game");
        GameObj demo_concat_game = gameDetailsWrapperObj.getDemo_concat_game();
        kotlin.jvm.internal.f0.o(demo_concat_game, "gameDetail.demo_concat_game");
        GameItemView.h(giv_concat_game, demo_concat_game, GameObj.KEY_POINT_FOLLOWED, null, false, null, null, 60, null);
    }

    public final void b(@dl.d Context mContext, @dl.d View group, @dl.d View space, @dl.e GameDetailsWrapperObj gameDetailsWrapperObj, @dl.d String mGameId) {
        if (PatchProxy.proxy(new Object[]{mContext, group, space, gameDetailsWrapperObj, mGameId}, this, changeQuickRedirect, false, 32665, new Class[]{Context.class, View.class, View.class, GameDetailsWrapperObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(group, "group");
        kotlin.jvm.internal.f0.p(space, "space");
        kotlin.jvm.internal.f0.p(mGameId, "mGameId");
        List[] listArr = new List[1];
        listArr[0] = gameDetailsWrapperObj != null ? gameDetailsWrapperObj.getMorelike() : null;
        if (com.max.hbcommon.utils.c.w(listArr)) {
            group.setVisibility(8);
            space.setVisibility(8);
            return;
        }
        group.setVisibility(0);
        space.setVisibility(0);
        RecyclerView recyclerView = (RecyclerView) group.findViewById(R.id.rv_morelike);
        ListSectionHeader listSectionHeader = (ListSectionHeader) group.findViewById(R.id.lsh_morelike);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext, 0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        List<GameObj> morelike = gameDetailsWrapperObj != null ? gameDetailsWrapperObj.getMorelike() : null;
        kotlin.jvm.internal.f0.m(morelike);
        boolean z10 = morelike.size() > 5;
        if (recyclerView.getItemDecorationCount() <= 0) {
            recyclerView.addItemDecoration(new c(mContext, z10));
        }
        kotlin.jvm.internal.f0.m(gameDetailsWrapperObj);
        com.max.hbcommon.base.adapter.w wVar = new com.max.hbcommon.base.adapter.w(mContext, new d(mContext, gameDetailsWrapperObj.getMorelike().subList(0, Math.min(gameDetailsWrapperObj.getMorelike().size(), 5))), new b(mContext, mGameId));
        wVar.J(115);
        wVar.G(z10);
        recyclerView.setAdapter(wVar);
        listSectionHeader.setMoreClickListener(new a(mContext, mGameId));
    }

    public final void c(@dl.d MultiDimensionRadarObj data, @dl.d View rootview, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{data, rootview, str}, this, changeQuickRedirect, false, 32669, new Class[]{MultiDimensionRadarObj.class, View.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(data, "data");
        kotlin.jvm.internal.f0.p(rootview, "rootview");
        el elVarA = el.a(rootview);
        kotlin.jvm.internal.f0.o(elVarA, "bind(rootview)");
        int iU0 = r1.u0(rootview.getContext(), str);
        int iT0 = r1.t0(rootview.getContext(), str);
        if (com.max.hbcommon.utils.c.u(data.getTotal_num())) {
            elVarA.f110236d.setVisibility(4);
            elVarA.f110235c.setVisibility(4);
        } else {
            elVarA.f110236d.setText(data.getTotal_num());
            elVarA.f110236d.setColors(iU0, iT0, GradientDrawable.Orientation.BL_TR);
            elVarA.f110236d.setVisibility(0);
            elVarA.f110235c.setVisibility(0);
        }
        List<MultiDimensionScore> dimension_list = data.getDimension_list();
        kotlin.jvm.internal.f0.m(dimension_list);
        Pair pair = new Pair(Float.valueOf(0.0f), 0);
        Pair pair2 = new Pair(Float.valueOf(0.0f), 0);
        if (dimension_list.size() == 5) {
            ViewGroup.LayoutParams layoutParams = elVarA.f110236d.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = -ViewUtils.f(rootview.getContext(), 20.0f);
        } else {
            ViewGroup.LayoutParams layoutParams2 = elVarA.f110236d.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
        }
        int size = dimension_list.size();
        for (int i10 = 0; i10 < size; i10++) {
            float fP = com.max.hbutils.utils.n.p(dimension_list.get(i10).getScore());
            if (fP > ((Number) pair.e()).floatValue()) {
                pair2 = pair;
                pair = new Pair(Float.valueOf(fP), Integer.valueOf(i10));
            } else if (fP > ((Number) pair2.e()).floatValue()) {
                pair2 = new Pair(Float.valueOf(fP), Integer.valueOf(i10));
            }
        }
        ArrayList arrayList = new ArrayList();
        List<MultiDimensionScore> dimension_list2 = data.getDimension_list();
        kotlin.jvm.internal.f0.m(dimension_list2);
        int size2 = dimension_list2.size();
        int i11 = 0;
        while (i11 < size2) {
            List<MultiDimensionScore> dimension_list3 = data.getDimension_list();
            kotlin.jvm.internal.f0.m(dimension_list3);
            String dimension_name = dimension_list3.get(i11).getDimension_name();
            List<MultiDimensionScore> dimension_list4 = data.getDimension_list();
            kotlin.jvm.internal.f0.m(dimension_list4);
            arrayList.add(new RadarView.b(dimension_name, com.max.hbutils.utils.n.p(dimension_list4.get(i11).getScore()), i11 == ((Number) pair.f()).intValue() || i11 == ((Number) pair2.f()).intValue()));
            i11++;
        }
        elVarA.f110234b.setColors(iU0, iT0);
        RadarView radarView = elVarA.f110234b;
        kotlin.jvm.internal.f0.o(radarView, "viewBinding.radar");
        RadarView.setData$default(radarView, arrayList, null, 2, null);
    }

    public final void d(@dl.d View group, @dl.e GameDetailsWrapperObj gameDetailsWrapperObj) {
        if (PatchProxy.proxy(new Object[]{group, gameDetailsWrapperObj}, this, changeQuickRedirect, false, 32667, new Class[]{View.class, GameDetailsWrapperObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(group, "group");
        GameObj originGame = gameDetailsWrapperObj != null ? gameDetailsWrapperObj.getOriginGame() : null;
        View viewFindViewById = group.findViewById(R.id.ll_origin_game);
        View viewFindViewById2 = group.findViewById(R.id.space_dlc);
        if (originGame == null) {
            viewFindViewById.setVisibility(8);
            return;
        }
        viewFindViewById.setVisibility(0);
        viewFindViewById2.setVisibility(0);
        GameItemView vGame = (GameItemView) viewFindViewById.findViewById(R.id.v_game);
        kotlin.jvm.internal.f0.o(vGame, "vGame");
        GameItemView.h(vGame, originGame, null, null, false, null, null, 62, null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0102  */
    public final void e(@dl.e Context context, @dl.d HardwarePerformance data, @dl.d View view) {
        int i10;
        if (PatchProxy.proxy(new Object[]{context, data, view}, this, changeQuickRedirect, false, 32664, new Class[]{Context.class, HardwarePerformance.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(data, "data");
        kotlin.jvm.internal.f0.p(view, "view");
        if (context == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_hardware_platf);
        View viewFindViewById = view.findViewById(R.id.rl_hardware_info);
        TextView textView = (TextView) view.findViewById(R.id.tv_desc_1);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_desc_2);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_hardware_score);
        View viewFindViewById2 = view.findViewById(R.id.vg_hardware_score);
        CircleProgressView circleProgressView = (CircleProgressView) view.findViewById(R.id.cpv_hardware);
        viewFindViewById.setBackground(com.max.hbutils.utils.q.o(context, R.color.divider_secondary_2_color, ViewUtils.h0(context, ViewUtils.o(context, viewFindViewById))));
        linearLayout.removeAllViews();
        for (String str : data.getSupport_system()) {
            ImageView imageView = new ImageView(context);
            imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(context, 14.0f), ViewUtils.f(context, 14.0f));
            layoutParams.rightMargin = ViewUtils.f(context, 4.0f);
            if (str == null) {
                i10 = R.drawable.common_platform_windows;
            } else {
                int iHashCode = str.hashCode();
                if (iHashCode != 107855) {
                    if (iHashCode != 102977780) {
                        if (iHashCode == 1349493379) {
                            str.equals("windows");
                        }
                    } else if (str.equals(Platform.LINUX)) {
                        i10 = R.drawable.common_platform_steam_filled;
                    }
                    i10 = R.drawable.common_platform_windows;
                } else if (str.equals("mac")) {
                    i10 = R.drawable.common_platform_ios;
                } else {
                    i10 = R.drawable.common_platform_windows;
                }
            }
            imageView.setImageResource(i10);
            linearLayout.addView(imageView, layoutParams);
        }
        String performance = data.getPerformance();
        if (performance == null || performance.length() == 0) {
            textView.setText("与我的配置比较");
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            viewFindViewById2.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            int i11 = com.max.hbutils.utils.n.q(data.getTotal_score()) < 6 ? R.color.delete_red : R.color.lowest_discount_color;
            textView.setText(data.getPerformance());
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(i11));
            viewFindViewById2.setVisibility(0);
            textView2.setVisibility(0);
            textView3.setText(data.getTotal_score());
            textView3.setTextColor(com.max.xiaoheihe.utils.d.E(i11));
            circleProgressView.g(com.max.xiaoheihe.utils.d.E(i11));
            circleProgressView.f(com.max.hbutils.utils.n.p(data.getTotal_score()) / 10.0f);
            textView2.setText("我的配置:");
        }
        view.setOnClickListener(new e(context, data));
    }

    public final void f(@dl.d String path, @dl.d String app_id) {
        if (PatchProxy.proxy(new Object[]{path, app_id}, this, changeQuickRedirect, false, 32668, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(path, "path");
        kotlin.jvm.internal.f0.p(app_id, "app_id");
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setType("3");
        pageEventObj.setPath(path);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", app_id);
        pageEventObj.setAddition(jsonObject);
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
        com.max.hbcommon.analytics.d.c(pageEventObj, true);
    }
}
