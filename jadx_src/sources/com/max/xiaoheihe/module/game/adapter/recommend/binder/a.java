package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.view.ViewGroup;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.module.game.component.BigGameCardView;
import com.max.xiaoheihe.module.game.component.GamePriceView;
import com.max.xiaoheihe.module.game.component.InnerGameItemView;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BigGameCardVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class a extends r {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f86084j = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f86086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f86087i;

    public a(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86085g = param;
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35940, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        BigGameCardView big_game_card = (BigGameCardView) viewHolder.i(R.id.big_game_card);
        if (!(data instanceof GameCardObj) || f0.g(data, big_game_card.getTag(R.id.big_game_card))) {
            return;
        }
        big_game_card.setTag(R.id.big_game_card, data);
        if (this.f86087i == 0) {
            this.f86087i = big_game_card.getIv_bg().getCornerRadius();
        }
        big_game_card.getIv_bg().setCornerRadius(0);
        int iF = ViewUtils.f(this.f86085g.b(), 12.0f);
        if (this.f86086h == 0) {
            this.f86086h = ViewUtils.L(this.f86085g.b()) - (iF * 2);
        }
        ViewGroup.LayoutParams layoutParams = big_game_card.getLayoutParams();
        int i10 = this.f86086h;
        layoutParams.height = i10;
        layoutParams.width = i10;
        float fN = ViewUtils.n(this.f86085g.b(), layoutParams.width, layoutParams.height, ViewUtils.ViewType.IMAGE);
        big_game_card.setRadius(fN);
        this.f86087i = ((int) fN) - ViewUtils.f(this.f86085g.b(), 3.0f);
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = iF;
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        marginLayoutParams.rightMargin = iF;
        big_game_card.setLayoutParams(layoutParams);
        big_game_card.setType(BigGameCardView.Type.BORDER);
        GameCardObj gameCardObj = (GameCardObj) data;
        big_game_card.setLabelText(gameCardObj.getTag());
        String tag_color = gameCardObj.getTag_color();
        if (tag_color != null) {
            big_game_card.setLabelBackGroundColor(com.max.xiaoheihe.utils.d.e1(tag_color));
        }
        com.max.hbimage.b.L(gameCardObj.getImg(), big_game_card.getIv_bg(), R.drawable.default_game_avatar_351x351);
        RecommendGameListItemObj game = gameCardObj.getGame();
        if (com.max.hbcommon.utils.c.u(game != null ? game.getGame_icon() : null)) {
            big_game_card.getGame_item().getIv_icon().setVisibility(8);
        } else {
            big_game_card.getGame_item().getIv_icon().setVisibility(0);
            RecommendGameListItemObj game2 = gameCardObj.getGame();
            com.max.hbimage.b.L(game2 != null ? game2.getGame_icon() : null, big_game_card.getGame_item().getIv_icon(), R.drawable.common_default_game_avatar_74x74);
        }
        big_game_card.getGame_item().setType(InnerGameItemView.Type.GAME_PRICE);
        big_game_card.getGame_item().setGamePrice(r1.w(gameCardObj.getGame()), GamePriceView.ColorType.White);
        InnerGameItemView game_item = big_game_card.getGame_item();
        RecommendGameListItemObj game3 = gameCardObj.getGame();
        game_item.setGameName(game3 != null ? game3.getGame_name() : null);
        InnerGameItemView game_item2 = big_game_card.getGame_item();
        RecommendGameListItemObj game4 = gameCardObj.getGame();
        game_item2.b(game4 != null ? game4.getHb_rich_texts() : null);
        big_game_card.setBackgroundGradientColor(com.max.xiaoheihe.utils.d.e1(gameCardObj.getBorder_start_color()), com.max.xiaoheihe.utils.d.e1(gameCardObj.getBorder_end_color()));
        if (com.max.hbcommon.utils.c.u(gameCardObj.getBottom_start_color()) || com.max.hbcommon.utils.c.u(gameCardObj.getBottom_end_color())) {
            f0.o(big_game_card, "big_game_card");
            BigGameCardView.setBottomGradientColor$default(big_game_card, com.max.xiaoheihe.utils.d.I(0.0f, com.max.xiaoheihe.utils.d.e1(gameCardObj.getColor())), com.max.xiaoheihe.utils.d.e1(gameCardObj.getColor()), false, 4, null);
        } else {
            big_game_card.setBottomGradientColor(com.max.xiaoheihe.utils.d.e1(gameCardObj.getBottom_start_color()), com.max.xiaoheihe.utils.d.e1(gameCardObj.getBottom_end_color()), true);
        }
        r1.e2(big_game_card, gameCardObj.getGame(), null);
    }

    public final int v() {
        return this.f86087i;
    }

    @dl.d
    public final RecommendVHBParam w() {
        return this.f86085g;
    }

    public final void x(int i10) {
        this.f86087i = i10;
    }

    public final void y(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 35939, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86085g = recommendVHBParam;
    }
}
