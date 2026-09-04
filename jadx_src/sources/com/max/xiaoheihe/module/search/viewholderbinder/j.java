package com.max.xiaoheihe.module.search.viewholderbinder;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardVideoMovieObj;
import com.max.xiaoheihe.bean.search.SearchGameCardObj;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.game.component.GameCardContainerView;
import com.max.xiaoheihe.module.game.component.SearchGameCardView;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: SearchGameCardVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nSearchGameCardVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchGameCardVHB.kt\ncom/max/xiaoheihe/module/search/viewholderbinder/SearchGameCardVHB\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,113:1\n262#2,2:114\n*S KotlinDebug\n*F\n+ 1 SearchGameCardVHB.kt\ncom/max/xiaoheihe/module/search/viewholderbinder/SearchGameCardVHB\n*L\n79#1:114,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class j extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91800l = 0;

    /* JADX INFO: compiled from: SearchGameCardVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GeneralSearchInfo f91802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SearchGameCardObj f91803d;

        a(GeneralSearchInfo generalSearchInfo, SearchGameCardObj searchGameCardObj) {
            this.f91802c = generalSearchInfo;
            this.f91803d = searchGameCardObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43339, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            j.this.g(this.f91802c);
            j jVar = j.this;
            j.B(jVar, jVar.o().q(), this.f91803d);
        }
    }

    /* JADX INFO: compiled from: SearchGameCardVHB.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SearchGameCardView f91804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SearchGameCardObj f91805c;

        b(SearchGameCardView searchGameCardView, SearchGameCardObj searchGameCardObj) {
            this.f91804b = searchGameCardView;
            this.f91805c = searchGameCardObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43340, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f91804b.l(this.f91805c.toGameCardVideoObj(), true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    public static final /* synthetic */ void B(j jVar, Context context, SearchGameCardObj searchGameCardObj) {
        if (PatchProxy.proxy(new Object[]{jVar, context, searchGameCardObj}, null, changeQuickRedirect, true, 43338, new Class[]{j.class, Context.class, SearchGameCardObj.class}, Void.TYPE).isSupported) {
            return;
        }
        jVar.C(context, searchGameCardObj);
    }

    private final void C(Context context, SearchGameCardObj searchGameCardObj) {
        GameObj game;
        if (PatchProxy.proxy(new Object[]{context, searchGameCardObj}, this, changeQuickRedirect, false, 43336, new Class[]{Context.class, SearchGameCardObj.class}, Void.TYPE).isSupported || (game = searchGameCardObj.getGame()) == null) {
            return;
        }
        Intent intentE3 = ChannelsDetailActivity.e3(com.max.xiaoheihe.module.game.z.b(context, game.getH_src(), r1.Z(game), game.getGame_type(), null, i0.m(), i0.j(), null), com.max.hbcommon.utils.c.w(game.getPlatform_infos()) ? "" : game.getPlatform_infos().get(0).getKey());
        GameCardVideoMovieObj movie = searchGameCardObj.getMovie();
        context.startActivity(ChannelsDetailActivity.Y2(intentE3, movie != null ? movie.getSource_movie() : null, 0L, com.max.xiaoheihe.module.game.adapter.recommend.binder.e.f86098i.e(context).G() ? "1" : null));
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43337, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        SearchGameCardView searchGameCardView;
        String tag_end_color;
        String border_end_color;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43335, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        SearchGameCardObj searchGameCardObj = (SearchGameCardObj) com.max.hbutils.utils.k.a(data.getInfo(), SearchGameCardObj.class);
        if (searchGameCardObj == null || (searchGameCardView = (SearchGameCardView) viewHolder.i(R.id.v_search_game_card)) == null) {
            return;
        }
        f0.o(searchGameCardView, "getView<SearchGameCardVi…(R.id.v_search_game_card)");
        Context contextQ = o().q();
        boolean zG = f0.g(data.getType(), "big_game_card");
        boolean z10 = (com.max.hbcommon.utils.c.u(searchGameCardObj.getBorder_start_color()) || com.max.hbcommon.utils.c.u(searchGameCardObj.getBorder_end_color())) ? false : true;
        int iL = ((ViewUtils.L(contextQ) - com.max.xiaoheihe.accelworld.l.c(24.0f, contextQ)) * (zG ? bb.c.b.f30829o1 : 148)) / bb.c.b.N3;
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        layoutParams.height = iL;
        viewHolder.itemView.setLayoutParams(layoutParams);
        searchGameCardView.setType(z10 ? GameCardContainerView.Type.BORDER : GameCardContainerView.Type.NORMAL, zG ? GameCardContainerView.SizeType.MIDDLE : GameCardContainerView.SizeType.SMALL);
        searchGameCardView.getIv_bg().setImageResource(R.drawable.default_game_avatar_351x351);
        com.max.hbimage.b.K(searchGameCardObj.getImg(), searchGameCardView.getIv_bg());
        searchGameCardView.setGradientColor(com.max.xiaoheihe.utils.d.e1(searchGameCardObj.getColor()));
        String border_start_color = searchGameCardObj.getBorder_start_color();
        if (border_start_color != null && (border_end_color = searchGameCardObj.getBorder_end_color()) != null) {
            searchGameCardView.setBackgroundGradientColor(com.max.hbutils.utils.a.g(border_start_color), com.max.hbutils.utils.a.g(border_end_color));
        }
        searchGameCardView.setLabelText(searchGameCardObj.getTag(), searchGameCardObj.getTag_icon());
        String tag_start_color = searchGameCardObj.getTag_start_color();
        if (tag_start_color != null && (tag_end_color = searchGameCardObj.getTag_end_color()) != null) {
            searchGameCardView.setLabelBackGroundGradientColor(com.max.hbutils.utils.a.g(tag_start_color), com.max.hbutils.utils.a.g(tag_end_color));
        }
        GameObj game = searchGameCardObj.getGame();
        if (game != null) {
            searchGameCardView.getGameItemView().setData(game);
        }
        searchGameCardView.setOnClickListener(new a(data, searchGameCardObj));
        ImageView iv_video_play = searchGameCardView.getIv_video_play();
        GameCardVideoMovieObj movie = searchGameCardObj.getMovie();
        iv_video_play.setVisibility(com.max.hbcommon.utils.c.u(movie != null ? movie.getMovie_url() : null) ^ true ? 0 : 8);
        iv_video_play.setOnClickListener(new b(searchGameCardView, searchGameCardObj));
    }
}
