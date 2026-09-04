package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.bean.analytics.RvVisiableRangeObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.max.xiaoheihe.bean.game.recommend.GameAwardObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardListObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.module.game.component.BigGameCardView;
import com.max.xiaoheihe.module.game.component.GameAwardView;
import com.max.xiaoheihe.module.game.component.InnerGameItemView;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;

/* JADX INFO: compiled from: RecommendBigScrollCardVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public class p extends r {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f86221i = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f86223h;

    /* JADX INFO: compiled from: RecommendBigScrollCardVHB.kt */
    public static final class a extends com.max.hbcommon.base.adapter.s<GameCardObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameRecommendBaseObj f86225c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(GameRecommendBaseObj gameRecommendBaseObj, Context context, ArrayList<GameCardObj> arrayList) {
            super(context, arrayList, R.layout.item_big_game_card);
            this.f86225c = gameRecommendBaseObj;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e GameCardObj gameCardObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameCardObj}, this, changeQuickRedirect, false, 36088, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameCardObj.class}, Void.TYPE).isSupported || gameCardObj == null) {
                return;
            }
            p pVar = p.this;
            GameRecommendBaseObj gameRecommendBaseObj = this.f86225c;
            BigGameCardView bigGameCardView = eVar != null ? (BigGameCardView) eVar.i(R.id.big_game_card) : null;
            if (pVar.w() == 0) {
                pVar.z(ViewUtils.L(pVar.v().b()) - ViewUtils.f(pVar.v().b(), 40.0f));
            }
            ViewGroup.LayoutParams layoutParams = bigGameCardView != null ? bigGameCardView.getLayoutParams() : null;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(pVar.w(), pVar.w());
            } else {
                layoutParams.height = pVar.w();
                layoutParams.width = pVar.w();
            }
            if (bigGameCardView != null) {
                bigGameCardView.setLayoutParams(layoutParams);
            }
            if (bigGameCardView != null) {
                bigGameCardView.setRadius(ViewUtils.m(pVar.v().b(), layoutParams.width, layoutParams.height));
            }
            f0.m(eVar);
            pVar.x(bigGameCardView, gameCardObj, gameRecommendBaseObj, eVar.getBindingAdapterPosition());
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameCardObj gameCardObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameCardObj}, this, changeQuickRedirect, false, 36089, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameCardObj);
        }
    }

    /* JADX INFO: compiled from: RecommendBigScrollCardVHB.kt */
    public static final class b extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36090, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            RvVisiableRangeObj subRange = com.max.xiaoheihe.utils.d.j0(recyclerView);
            if (recyclerView.getTag(p.this.m()) == null || recyclerView.getTag(p.this.l()) == null) {
                return;
            }
            Object tag = recyclerView.getTag(p.this.m());
            f0.n(tag, "null cannot be cast to non-null type kotlin.collections.MutableList<com.max.hbcommon.bean.analytics.PathSrcNode>");
            List<PathSrcNode> listG = w0.g(tag);
            Object tag2 = recyclerView.getTag(p.this.l());
            f0.n(tag2, "null cannot be cast to non-null type com.max.xiaoheihe.bean.game.recommend.GameCardListObj");
            p pVar = p.this;
            f0.o(subRange, "subRange");
            pVar.i(listG, subRange, (GameCardListObj) tag2);
        }
    }

    /* JADX INFO: compiled from: RecommendBigScrollCardVHB.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameCardObj f86227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f86228c;

        c(GameCardObj gameCardObj, p pVar) {
            this.f86227b = gameCardObj;
            this.f86228c = pVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            GameAwardObj award;
            String prot;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36091, new Class[]{View.class}, Void.TYPE).isSupported || (award = this.f86227b.getAward()) == null || (prot = award.getProt()) == null) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f86228c.v().b(), prot);
        }
    }

    public p(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86222g = param;
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36085, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv);
        if (!(data instanceof GameCardListObj) || f0.g(data, recyclerView.getTag(R.id.rv))) {
            return;
        }
        recyclerView.setTag(R.id.rv, data);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f86222g.b(), 0, false));
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.f86222g.b(), 8.0f), ViewUtils.f(this.f86222g.b(), 12.0f)));
        }
        b bVar = new b();
        if (recyclerView.getTag(l()) == null) {
            recyclerView.addOnScrollListener(bVar);
        }
        recyclerView.setTag(l(), data);
        recyclerView.setAdapter(new a(data, this.f86222g.b(), ((GameCardListObj) data).getGames()));
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        recyclerView.setOnFlingListener(null);
        pagerSnapHelper.attachToRecyclerView(recyclerView);
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void p(@dl.d View itemView, @dl.d List<PathSrcNode> shownList, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{itemView, shownList, data}, this, changeQuickRedirect, false, 36086, new Class[]{View.class, List.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemView, "itemView");
        f0.p(shownList, "shownList");
        f0.p(data, "data");
        if (com.max.hbcommon.utils.c.u(data.getReport_path()) || !(data instanceof GameCardListObj)) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) itemView.findViewById(R.id.rv);
        RvVisiableRangeObj range = com.max.xiaoheihe.utils.d.j0(recyclerView);
        recyclerView.setTag(m(), shownList);
        f0.o(range, "range");
        i(shownList, range, data);
    }

    @dl.d
    public final RecommendVHBParam v() {
        return this.f86222g;
    }

    public final int w() {
        return this.f86223h;
    }

    public final void x(@dl.e BigGameCardView bigGameCardView, @dl.d GameCardObj gameCard, @dl.d GameRecommendBaseObj data, int i10) {
        if (PatchProxy.proxy(new Object[]{bigGameCardView, gameCard, data, new Integer(i10)}, this, changeQuickRedirect, false, 36087, new Class[]{BigGameCardView.class, GameCardObj.class, GameRecommendBaseObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(gameCard, "gameCard");
        f0.p(data, "data");
        if (bigGameCardView != null) {
            bigGameCardView.getIv_bg().setCornerRadius(0);
            bigGameCardView.setLabelText(gameCard.getTag());
            String tag_color = gameCard.getTag_color();
            if (tag_color != null) {
                bigGameCardView.setLabelBackGroundColor(com.max.xiaoheihe.utils.d.e1(tag_color));
            }
            bigGameCardView.getIv_bg().setImageResource(R.drawable.default_game_avatar_351x351);
            com.max.hbimage.b.K(gameCard.getImg(), bigGameCardView.getIv_bg());
            BigGameCardView.setBottomGradientColor$default(bigGameCardView, com.max.xiaoheihe.utils.d.I(0.0f, com.max.xiaoheihe.utils.d.e1(gameCard.getColor())), com.max.xiaoheihe.utils.d.e1(gameCard.getColor()), false, 4, null);
            RecommendGameListItemObj game = gameCard.getGame();
            if (com.max.hbcommon.utils.c.u(game != null ? game.getGame_icon() : null)) {
                bigGameCardView.getGame_item().getIv_icon().setVisibility(8);
            } else {
                RecommendGameListItemObj game2 = gameCard.getGame();
                com.max.hbimage.b.L(game2 != null ? game2.getGame_icon() : null, bigGameCardView.getGame_item().getIv_icon(), R.drawable.common_default_game_avatar_74x74);
                bigGameCardView.getGame_item().getIv_icon().setVisibility(0);
            }
            bigGameCardView.getGame_item().setType(InnerGameItemView.Type.GAME_AWARD);
            GameAwardView view_award = bigGameCardView.getGame_item().getView_award();
            GameAwardObj award = gameCard.getAward();
            view_award.setAwardName(award != null ? award.getDetail_name() : null);
            GameAwardView view_award2 = bigGameCardView.getGame_item().getView_award();
            GameAwardObj award2 = gameCard.getAward();
            view_award2.setAwardTime(award2 != null ? award2.getDesc() : null);
            bigGameCardView.getGame_item().getView_award().setOnClickListener(new c(gameCard, this));
            InnerGameItemView game_item = bigGameCardView.getGame_item();
            RecommendGameListItemObj game3 = gameCard.getGame();
            game_item.setGameName(game3 != null ? game3.getGame_name() : null);
            bigGameCardView.setType(BigGameCardView.Type.NORMAL);
            InnerGameItemView game_item2 = bigGameCardView.getGame_item();
            RecommendGameListItemObj game4 = gameCard.getGame();
            game_item2.b(game4 != null ? game4.getHb_rich_texts() : null);
            RecommendGameListItemObj game5 = gameCard.getGame();
            String appid = game5 != null ? game5.getAppid() : null;
            RecommendGameListItemObj game6 = gameCard.getGame();
            s(bigGameCardView, data, appid, i10, game6 != null ? game6.getGame_name() : null);
            r1.e2(bigGameCardView, gameCard.getGame(), null);
        }
    }

    public final void y(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 36084, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86222g = recommendVHBParam;
    }

    public final void z(int i10) {
        this.f86223h = i10;
    }
}
