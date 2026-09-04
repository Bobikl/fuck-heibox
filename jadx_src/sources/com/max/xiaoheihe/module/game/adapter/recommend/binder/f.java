package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.bean.analytics.RvVisiableRangeObj;
import com.max.hbcommon.component.MoreButton;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.recommend.GameCardListV2Obj;
import com.max.xiaoheihe.bean.game.recommend.GameCardV2Obj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter;
import com.max.xiaoheihe.module.game.component.RecommendGameAlbumCard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;

/* JADX INFO: compiled from: GameListCardVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class f extends r {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f86115h = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86116g;

    /* JADX INFO: compiled from: GameListCardVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameRecommendBaseObj f86118c;

        a(GameRecommendBaseObj gameRecommendBaseObj) {
            this.f86118c = gameRecommendBaseObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35978, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(f.this.v().b(), ((GameCardListV2Obj) this.f86118c).getProt());
        }
    }

    /* JADX INFO: compiled from: GameListCardVHB.kt */
    public static final class b extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35979, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            RvVisiableRangeObj subRange = com.max.xiaoheihe.utils.d.k0(recyclerView, 0.3f);
            if (recyclerView.getTag(f.this.m()) == null || recyclerView.getTag(f.this.l()) == null) {
                return;
            }
            Object tag = recyclerView.getTag(f.this.m());
            f0.n(tag, "null cannot be cast to non-null type kotlin.collections.MutableList<com.max.hbcommon.bean.analytics.PathSrcNode>");
            List<PathSrcNode> listG = w0.g(tag);
            Object tag2 = recyclerView.getTag(f.this.l());
            f0.n(tag2, "null cannot be cast to non-null type com.max.xiaoheihe.bean.game.recommend.GameCardListV2Obj");
            f fVar = f.this;
            f0.o(subRange, "subRange");
            fVar.i(listG, subRange, (GameCardListV2Obj) tag2);
        }
    }

    public f(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86116g = param;
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        RecommendGameAlbumCard recommendGameAlbumCard;
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35976, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (!(data instanceof GameCardListV2Obj) || (recommendGameAlbumCard = (RecommendGameAlbumCard) viewHolder.i(R.id.view_game_ablum)) == null) {
            return;
        }
        b bVar = new b();
        if (recommendGameAlbumCard.getRv().getTag(l()) == null) {
            recommendGameAlbumCard.getRv().addOnScrollListener(bVar);
        }
        recommendGameAlbumCard.setReportInfo(l(), data);
        GameCardListV2Obj gameCardListV2Obj = (GameCardListV2Obj) data;
        if (f0.g(GameRecommendAdapter.f85974x, gameCardListV2Obj.getType())) {
            recommendGameAlbumCard.setType(RecommendGameAlbumCard.Type.Square);
        } else {
            recommendGameAlbumCard.setType(RecommendGameAlbumCard.Type.Rectangle);
        }
        ArrayList<GameCardV2Obj> games = gameCardListV2Obj.getGames();
        if (games != null) {
            recommendGameAlbumCard.setGames(games);
        }
        com.max.hbimage.b.L(gameCardListV2Obj.getImage(), recommendGameAlbumCard.getIv_card_bg(), R.drawable.common_default_placeholder_375x210);
        com.max.hbimage.b.L(gameCardListV2Obj.getIcon(), recommendGameAlbumCard.getIv_card_icon(), R.drawable.common_default_game_avatar_74x74);
        recommendGameAlbumCard.setMainColor(com.max.xiaoheihe.utils.d.e1(gameCardListV2Obj.getColor()));
        recommendGameAlbumCard.getTv_card_title().setText(gameCardListV2Obj.getName());
        String desc = gameCardListV2Obj.getDesc();
        if (desc != null && desc.length() != 0) {
            z10 = false;
        }
        if (z10) {
            recommendGameAlbumCard.getTv_desc().setVisibility(8);
        } else {
            recommendGameAlbumCard.getTv_desc().setText(gameCardListV2Obj.getDesc());
            recommendGameAlbumCard.getTv_desc().setVisibility(0);
        }
        recommendGameAlbumCard.getLl_bottom().setOnClickListener(null);
        if (com.max.hbcommon.utils.c.u(gameCardListV2Obj.getProt())) {
            recommendGameAlbumCard.setOnClickListener(null);
            recommendGameAlbumCard.getMb_more().setVisibility(8);
            return;
        }
        recommendGameAlbumCard.getMb_more().setVisibility(0);
        recommendGameAlbumCard.setOnClickListener(new a(data));
        MoreButton mb_more = recommendGameAlbumCard.getMb_more();
        String more_button_text = gameCardListV2Obj.getMore_button_text();
        if (more_button_text == null) {
            more_button_text = this.f86116g.b().getResources().getString(R.string.more);
            f0.o(more_button_text, "param.context.resources.getString(R.string.more)");
        }
        mb_more.setText(more_button_text);
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void p(@dl.d View itemView, @dl.d List<PathSrcNode> shownList, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{itemView, shownList, data}, this, changeQuickRedirect, false, 35977, new Class[]{View.class, List.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemView, "itemView");
        f0.p(shownList, "shownList");
        f0.p(data, "data");
        if (com.max.hbcommon.utils.c.u(data.getReport_path()) || !(data instanceof GameCardListV2Obj)) {
            return;
        }
        RecommendGameAlbumCard recommendGameAlbumCard = (RecommendGameAlbumCard) itemView.findViewById(R.id.view_game_ablum);
        RvVisiableRangeObj range = com.max.xiaoheihe.utils.d.j0(recommendGameAlbumCard.getRv());
        recommendGameAlbumCard.getRv().setTag(m(), shownList);
        f0.o(range, "range");
        i(shownList, range, data);
    }

    @dl.d
    public final RecommendVHBParam v() {
        return this.f86116g;
    }

    public final void w(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 35975, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86116g = recommendVHBParam;
    }
}
