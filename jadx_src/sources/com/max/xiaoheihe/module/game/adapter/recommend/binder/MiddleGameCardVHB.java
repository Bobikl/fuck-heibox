package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.module.game.component.GamePriceView;
import com.max.xiaoheihe.module.game.component.InnerGameItemView;
import com.max.xiaoheihe.module.game.component.MiddleGameCardView;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MiddleGameCardVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class MiddleGameCardVHB extends r {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f86028i = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f86030h;

    /* JADX INFO: compiled from: MiddleGameCardVHB.kt */
    public static final class a implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MiddleGameCardView f86031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MiddleGameCardVHB f86032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameRecommendBaseObj f86033c;

        a(MiddleGameCardView middleGameCardView, MiddleGameCardVHB middleGameCardVHB, GameRecommendBaseObj gameRecommendBaseObj) {
            this.f86031a = middleGameCardView;
            this.f86032b = middleGameCardVHB;
            this.f86033c = gameRecommendBaseObj;
        }

        @Override // com.max.hbimage.b.q
        public void a(@dl.e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 36012, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f86031a.getIv_bg().setImageDrawable(drawable);
            MiddleGameCardVHB middleGameCardVHB = this.f86032b;
            MiddleGameCardView middle_game_card = this.f86031a;
            f0.o(middle_game_card, "middle_game_card");
            MiddleGameCardVHB.w(middleGameCardVHB, middle_game_card, com.max.xiaoheihe.utils.d.e1(((GameCardObj) this.f86033c).getColor()));
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(@dl.e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 36013, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f86031a.getIv_bg().setImageDrawable(drawable);
            MiddleGameCardVHB middleGameCardVHB = this.f86032b;
            MiddleGameCardView middle_game_card = this.f86031a;
            f0.o(middle_game_card, "middle_game_card");
            MiddleGameCardVHB.w(middleGameCardVHB, middle_game_card, com.max.xiaoheihe.utils.d.e1(((GameCardObj) this.f86033c).getColor()));
        }
    }

    public MiddleGameCardVHB(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86029g = param;
    }

    public static final /* synthetic */ void w(MiddleGameCardVHB middleGameCardVHB, MiddleGameCardView middleGameCardView, int i10) {
        if (PatchProxy.proxy(new Object[]{middleGameCardVHB, middleGameCardView, new Integer(i10)}, null, changeQuickRedirect, true, 36011, new Class[]{MiddleGameCardVHB.class, MiddleGameCardView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        middleGameCardVHB.y(middleGameCardView, i10);
    }

    private final void y(MiddleGameCardView middleGameCardView, int i10) {
        if (PatchProxy.proxy(new Object[]{middleGameCardView, new Integer(i10)}, this, changeQuickRedirect, false, 36010, new Class[]{MiddleGameCardView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(n(), null, null, new MiddleGameCardVHB$refreshBlur$1(middleGameCardView, i10, this, null), 3, null);
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36009, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameCardObj) {
            MiddleGameCardView middleGameCardView = (MiddleGameCardView) viewHolder.i(R.id.middle_game_card);
            if (this.f86030h == 0) {
                this.f86030h = ((ViewUtils.L(this.f86029g.b()) - ViewUtils.f(this.f86029g.b(), 24.0f)) * 148) / bb.c.b.N3;
            }
            ViewGroup.LayoutParams layoutParams = middleGameCardView.getLayoutParams();
            if (layoutParams == null) {
                new ViewGroup.LayoutParams(-1, this.f86030h);
            } else {
                layoutParams.height = this.f86030h;
            }
            middleGameCardView.getView_blur().getLayoutParams().height = this.f86030h - ViewUtils.f(this.f86029g.b(), 56.0f);
            middleGameCardView.setLayoutParams(layoutParams);
            middleGameCardView.getIv_bg().setImageResource(R.drawable.default_game_avater_351x150);
            GameCardObj gameCardObj = (GameCardObj) data;
            com.max.hbimage.b.X(this.f86029g.b(), middleGameCardView.getIv_bg(), gameCardObj.getImg(), new a(middleGameCardView, this, data));
            RecommendGameListItemObj game = gameCardObj.getGame();
            if (com.max.hbcommon.utils.c.u(game != null ? game.getGame_icon() : null)) {
                middleGameCardView.getGame_item().getIv_icon().setVisibility(8);
            } else {
                middleGameCardView.getGame_item().getIv_icon().setVisibility(0);
                RecommendGameListItemObj game2 = gameCardObj.getGame();
                com.max.hbimage.b.L(game2 != null ? game2.getGame_icon() : null, middleGameCardView.getGame_item().getIv_icon(), R.drawable.common_default_game_avatar_74x74);
            }
            middleGameCardView.getGame_item().setType(InnerGameItemView.Type.GAME_PRICE);
            middleGameCardView.getGame_item().setGamePrice(r1.w(gameCardObj.getGame()), GamePriceView.ColorType.White);
            InnerGameItemView game_item = middleGameCardView.getGame_item();
            RecommendGameListItemObj game3 = gameCardObj.getGame();
            game_item.setGameName(game3 != null ? game3.getGame_name() : null);
            InnerGameItemView game_item2 = middleGameCardView.getGame_item();
            RecommendGameListItemObj game4 = gameCardObj.getGame();
            game_item2.b(game4 != null ? game4.getHb_rich_texts() : null);
            RecommendGameListItemObj game5 = gameCardObj.getGame();
            middleGameCardView.setPlatformsIcon(game5 != null ? game5.getPlatforms_icon() : null);
            r1.e2(middleGameCardView, gameCardObj.getGame(), null);
        }
    }

    @dl.d
    public final RecommendVHBParam x() {
        return this.f86029g;
    }

    public final void z(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 36008, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86029g = recommendVHBParam;
    }
}
