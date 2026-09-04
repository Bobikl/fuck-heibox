package com.max.xiaoheihe.module.news.viewholderbinder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsContentGameCommentObj;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.game.component.GameCard;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: NewGameCommentVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class e extends com.max.xiaoheihe.module.news.viewholderbinder.a implements com.max.xiaoheihe.module.news.adapter.a.InterfaceC0842a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91393l = 0;

    /* JADX INFO: compiled from: NewGameCommentVHB.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f91394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f91395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f91396d;

        a(TextView textView, GameObj gameObj, String str) {
            this.f91394b = textView;
            this.f91395c = gameObj;
            this.f91396d = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 42642, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            super.onError(e10);
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.fail));
            r1.n2(this.f91394b, this.f91395c.getFollow_state(), true, true);
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42643, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            super.onNext(result);
            this.f91395c.setFollow_state(this.f91396d);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42644, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: NewGameCommentVHB.kt */
    public static final class b implements r1.y0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f91397a;

        b(TextView textView) {
            this.f91397a = textView;
        }

        @Override // com.max.xiaoheihe.module.game.r1.y0
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42646, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            r1.n2(this.f91397a, GameObj.SUBSCRIBE_STATE_SUBSCRIBING, true, true);
        }

        @Override // com.max.xiaoheihe.module.game.r1.y0
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42645, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            r1.n2(this.f91397a, GameObj.SUBSCRIBE_STATE_SUBSCRIBING, true, true);
        }
    }

    /* JADX INFO: compiled from: NewGameCommentVHB.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f91399c;

        c(BBSUserInfoObj bBSUserInfoObj) {
            this.f91399c = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@dl.e View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42647, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.T(e.this.m(), this.f91399c.getUserid()).A();
        }
    }

    /* JADX INFO: compiled from: NewGameCommentVHB.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f91401c;

        d(GameObj gameObj) {
            this.f91401c = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42648, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            e.this.O(this.f91401c);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.news.viewholderbinder.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NewGameCommentVHB.kt */
    public static final class ViewOnClickListenerC0848e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameCard f91403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameObj f91404d;

        ViewOnClickListenerC0848e(GameCard gameCard, GameObj gameObj) {
            this.f91403c = gameCard;
            this.f91404d = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42649, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            e.this.P(this.f91403c.getTv_follow_state(), this.f91404d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @SuppressLint({"CheckResult"})
    public final void N(@dl.e TextView textView, @dl.d GameObj gameObj, @dl.e String str, @dl.e String str2) {
        io.reactivex.z<Result> zVarI5;
        io.reactivex.z<Result> zVarA4;
        if (PatchProxy.proxy(new Object[]{textView, gameObj, str, str2}, this, changeQuickRedirect, false, 42641, new Class[]{TextView.class, GameObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(gameObj, "gameObj");
        io.reactivex.z<Result> zVarNb = null;
        if (kotlin.text.u.L1("unfollowing", str, true)) {
            zVarNb = com.max.xiaoheihe.network.i.a().x3(gameObj.getAppid());
        } else if (kotlin.text.u.L1("following", str, true)) {
            zVarNb = com.max.xiaoheihe.network.i.a().cb(gameObj.getAppid());
        } else if (kotlin.text.u.L1(GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, str, true)) {
            zVarNb = com.max.xiaoheihe.network.i.a().l8(gameObj.getAppid());
        } else if (kotlin.text.u.L1(GameObj.SUBSCRIBE_STATE_SUBSCRIBING, str, true)) {
            zVarNb = com.max.xiaoheihe.network.i.a().nb(gameObj.getAppid(), str2);
        }
        if (zVarNb == null || (zVarI5 = zVarNb.I5(io.reactivex.schedulers.b.d())) == null || (zVarA4 = zVarI5.a4(io.reactivex.android.schedulers.a.c())) == null) {
            return;
        }
    }

    public final void O(@dl.d GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{gameObj}, this, changeQuickRedirect, false, 42639, new Class[]{GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(gameObj, "gameObj");
        m().startActivity(com.max.xiaoheihe.module.game.z.b(m(), gameObj.getH_src(), gameObj.getAppid(), gameObj.getGame_type(), null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
    }

    public final void P(@dl.e TextView textView, @dl.d GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{textView, gameObj}, this, changeQuickRedirect, false, 42640, new Class[]{TextView.class, GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(gameObj, "gameObj");
        if (!com.max.hbcommon.utils.c.u(gameObj.getDownload_url_android())) {
            com.max.xiaoheihe.utils.l0.z0(m(), gameObj.getDownload_url_android(), gameObj.getBundle_id());
            return;
        }
        if (com.max.xiaoheihe.utils.i0.e(m())) {
            if (kotlin.text.u.L1(GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, gameObj.getFollow_state(), true)) {
                String strX0 = r1.x0();
                String str = com.max.hbcommon.utils.c.B(strX0) ? strX0 : null;
                Context contextM = m();
                kotlin.jvm.internal.f0.n(contextM, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
                r1.h2((BaseActivity) contextM, str, r1.Z(gameObj), new b(textView));
                return;
            }
            if (!kotlin.text.u.L1(GameObj.SUBSCRIBE_STATE_SUBSCRIBING, gameObj.getFollow_state(), true)) {
                kotlin.text.u.L1(GameObj.FOLLOW_STATE_OWNED, gameObj.getFollow_state(), true);
            } else {
                r1.n2(textView, GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, true, true);
                N(textView, gameObj, GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, null);
            }
        }
    }

    public final void Q(@dl.e BBSLinkObj bBSLinkObj, @dl.d BBSLinkListBottomBar vg_bottom_bar) {
        if (PatchProxy.proxy(new Object[]{bBSLinkObj, vg_bottom_bar}, this, changeQuickRedirect, false, 42637, new Class[]{BBSLinkObj.class, BBSLinkListBottomBar.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(vg_bottom_bar, "vg_bottom_bar");
        if (bBSLinkObj != null) {
            String comment_num = bBSLinkObj.getComment_num();
            String link_award_num = bBSLinkObj.getLink_award_num();
            vg_bottom_bar.getLikeComment().getBll_comment().setNum(comment_num);
            vg_bottom_bar.getLikeComment().getBll_like().setNum(link_award_num);
        }
    }

    public final void R(@dl.e BBSUserInfoObj bBSUserInfoObj, @dl.d BBSUserSectionView vg_title) {
        if (PatchProxy.proxy(new Object[]{bBSUserInfoObj, vg_title}, this, changeQuickRedirect, false, 42636, new Class[]{BBSUserInfoObj.class, BBSUserSectionView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(vg_title, "vg_title");
        if (bBSUserInfoObj != null) {
            c cVar = new c(bBSUserInfoObj);
            vg_title.getAvartar().setAvatar(bBSUserInfoObj.getAvartar(), bBSUserInfoObj.getAvatar_decoration());
            vg_title.getAvartar().setOnClickListener(cVar);
            vg_title.setName(bBSUserInfoObj.getUsername());
            vg_title.getTv_name().setOnClickListener(cVar);
            AccountDetailObj accountDetailObjV1 = com.max.xiaoheihe.utils.d.V1(bBSUserInfoObj);
            vg_title.a(accountDetailObjV1.getBbs_medal(), accountDetailObjV1.getMedals(), accountDetailObjV1.getUserid());
            if (bBSUserInfoObj.getLevel_info() == null) {
                vg_title.getUserLevel().setVisibility(8);
            } else {
                vg_title.getUserLevel().setVisibility(0);
                vg_title.setLevel(com.max.hbutils.utils.n.q(bBSUserInfoObj.getLevel_info().getLevel()));
            }
        }
    }

    public final void S(@dl.d GameCard singleGameView, @dl.d GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{singleGameView, gameObj}, this, changeQuickRedirect, false, 42638, new Class[]{GameCard.class, GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(singleGameView, "singleGameView");
        kotlin.jvm.internal.f0.p(gameObj, "gameObj");
        com.max.xiaoheihe.accelworld.l.u(singleGameView, R.color.divider_secondary_2_color, 8.0f, R.color.divider_secondary_1_color, 0.5f);
        singleGameView.setOnClickListener(new d(gameObj));
        singleGameView.b(gameObj);
        if (gameObj.getHeybox_price() != null) {
            singleGameView.getTv_follow_state().setClickable(false);
        } else {
            singleGameView.getTv_follow_state().setOnClickListener(new ViewOnClickListenerC0848e(singleGameView, gameObj));
        }
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.a, com.max.xiaoheihe.module.news.adapter.a.InterfaceC0842a
    public void a(@dl.d RecyclerView recyclerView, int i10, int i11) {
        Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42635, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.a, com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42633, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        FeedsContentGameCommentObj feedsContentGameCommentObj = (FeedsContentGameCommentObj) data;
        viewHolder.b();
        BBSUserSectionView vg_title = (BBSUserSectionView) viewHolder.i(R.id.vg_title);
        BBSLinkListBottomBar vg_bottom_bar = (BBSLinkListBottomBar) viewHolder.i(R.id.vg_bottom_bar);
        GameCard singleGameView = (GameCard) viewHolder.i(R.id.vg_single_game);
        TextView textView = (TextView) viewHolder.i(R.id.tv_game_comments);
        LinearLayout linearLayout = (LinearLayout) viewHolder.i(R.id.vg_bottom_sub);
        BBSUserInfoObj user = feedsContentGameCommentObj.getUser();
        kotlin.jvm.internal.f0.o(vg_title, "vg_title");
        R(user, vg_title);
        vg_title.setType(BBSUserSectionView.BBSUserSectionType.Link);
        vg_bottom_bar.setType(BBSUserSectionView.BBSUserSectionType.GameComment);
        BBSLinkObj link = feedsContentGameCommentObj.getLink();
        kotlin.jvm.internal.f0.o(vg_bottom_bar, "vg_bottom_bar");
        Q(link, vg_bottom_bar);
        if (feedsContentGameCommentObj.getLink() != null) {
            BBSLinkObj link2 = feedsContentGameCommentObj.getLink();
            kotlin.jvm.internal.f0.m(link2);
            if (link2.getBottom_rich_text() != null) {
                RichStackModelView tv_desc = vg_bottom_bar.getTv_desc();
                BBSLinkObj link3 = feedsContentGameCommentObj.getLink();
                kotlin.jvm.internal.f0.m(link3);
                tv_desc.setRichStackData(link3.getBottom_rich_text());
            }
        }
        if (feedsContentGameCommentObj.getLink() != null && feedsContentGameCommentObj.getGames() != null) {
            List<GameObj> games = feedsContentGameCommentObj.getGames();
            kotlin.jvm.internal.f0.m(games);
            if (games.size() > 0) {
                BBSLinkObj link4 = feedsContentGameCommentObj.getLink();
                kotlin.jvm.internal.f0.m(link4);
                if (com.max.hbutils.utils.n.q(link4.getScore()) > 0) {
                    vg_bottom_bar.c(true);
                    vg_bottom_bar.setRating(com.max.hbutils.utils.n.q(link4.getScore()));
                } else {
                    vg_bottom_bar.c(false);
                }
                List<GameObj> games2 = feedsContentGameCommentObj.getGames();
                kotlin.jvm.internal.f0.m(games2);
                GameObj gameObj = games2.get(0);
                kotlin.jvm.internal.f0.o(singleGameView, "singleGameView");
                S(singleGameView, gameObj);
                textView.setText(link4.getDescription());
            }
        }
        M(linearLayout, viewHolder, feedsContentGameCommentObj);
        E(viewHolder, data);
        feedsContentGameCommentObj.setShowDivider(true);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.a, com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42634, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
