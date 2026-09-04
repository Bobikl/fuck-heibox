package com.max.xiaoheihe.module.game.adapter.overview.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewRecentMatchsObj;
import com.max.xiaoheihe.bean.game.gameoverview.MatchObj;
import com.max.xiaoheihe.module.game.component.ShineMvpView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewRecentMatchVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class z extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85932b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85933a;

    /* JADX INFO: compiled from: GameOverviewRecentMatchVHB.kt */
    public static final class a extends com.max.hbcommon.base.adapter.s<MatchObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f85934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f85935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z f85936d;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.overview.binder.z$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GameOverviewRecentMatchVHB.kt */
        public static final class ViewOnClickListenerC0769a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f85937b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ MatchObj f85938c;

            ViewOnClickListenerC0769a(z zVar, MatchObj matchObj) {
                this.f85937b = zVar;
                this.f85938c = matchObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35849, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.s0(this.f85937b.g().b(), this.f85938c.getMatch_id(), this.f85937b.g().h(), this.f85937b.g().g());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<MatchObj> list, int i10, int i11, z zVar, Context context) {
            super(context, list, R.layout.item_game_match_recently_20);
            this.f85934b = i10;
            this.f85935c = i11;
            this.f85936d = zVar;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e MatchObj matchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, matchObj}, this, changeQuickRedirect, false, 35847, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MatchObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            int i10 = this.f85934b;
            int i11 = this.f85935c;
            z zVar = this.f85936d;
            if (matchObj != null) {
                ViewGroup.LayoutParams layoutParams = eVar.itemView.getLayoutParams();
                layoutParams.width = i10;
                layoutParams.height = i10;
                eVar.itemView.setLayoutParams(layoutParams);
                eVar.itemView.setBackground(ViewUtils.G(i11, com.max.xiaoheihe.utils.d.e1(matchObj.getColor())));
                ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
                ShineMvpView shineMvpView = (ShineMvpView) eVar.i(R.id.v_mvp);
                com.max.hbimage.b.K(matchObj.getHero_icon(), imageView);
                shineMvpView.setRadius(i11);
                shineMvpView.setVisibility(com.max.hbcommon.utils.c.x(matchObj.is_mvp()) ? 0 : 8);
                eVar.itemView.setOnClickListener(new ViewOnClickListenerC0769a(zVar, matchObj));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MatchObj matchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, matchObj}, this, changeQuickRedirect, false, 35848, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, matchObj);
        }
    }

    public z(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85933a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35846, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, baseGameOverviewObj);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BaseGameOverviewObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35845, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        viewHolder.setIsRecyclable(false);
        if (data instanceof GameOverviewRecentMatchsObj) {
            TextView textView = (TextView) viewHolder.i(R.id.tv_title);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_kd);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_win);
            TextView textView4 = (TextView) viewHolder.i(R.id.tv_lose);
            RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv);
            GameOverviewRecentMatchsObj gameOverviewRecentMatchsObj = (GameOverviewRecentMatchsObj) data;
            textView.setText(gameOverviewRecentMatchsObj.getTitle());
            textView2.setText("KD " + gameOverviewRecentMatchsObj.getKda());
            textView3.setText("胜 " + gameOverviewRecentMatchsObj.getWin());
            textView4.setText("败 " + gameOverviewRecentMatchsObj.getLose());
            List<MatchObj> match_list = gameOverviewRecentMatchsObj.getMatch_list();
            if (match_list == null || match_list.size() <= 0) {
                return;
            }
            int iB = ic.a.f119343a.b(this.f85933a.b(), 5);
            if (recyclerView.getItemDecorationCount() == 0) {
                recyclerView.addItemDecoration(new fc.b(10, iB, false));
            }
            int iL = (ViewUtils.L(this.f85933a.b()) - ViewUtils.f(this.f85933a.b(), 69.0f)) / 10;
            int size = (match_list.size() + 9) / 10;
            recyclerView.getLayoutParams().height = (size * iL) + ((size - 1) * iB);
            recyclerView.setLayoutParams(recyclerView.getLayoutParams());
            int iM = ViewUtils.m(this.f85933a.b(), iL, iL);
            recyclerView.setLayoutManager(new GridLayoutManager(this.f85933a.b(), 10));
            recyclerView.setAdapter(new a(match_list, iL, iM, this, this.f85933a.b()));
        }
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d g() {
        return this.f85933a;
    }
}
