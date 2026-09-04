package com.max.xiaoheihe.module.game.adapter.overview.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import com.google.android.material.tabs.TabLayout;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewMatchListObj;
import com.max.xiaoheihe.bean.game.gameoverview.MatchObj;
import com.max.xiaoheihe.module.game.component.GameConsecutiveWinView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2FollowMatchItemView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2MatchItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewMatchListAllVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class GameOverviewMatchListAllVHB extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85804b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85805a;

    /* JADX INFO: compiled from: GameOverviewMatchListAllVHB.kt */
    public static final class a implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseGameOverviewObj f85806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f85807b;

        a(BaseGameOverviewObj baseGameOverviewObj, yh.a<b2> aVar) {
            this.f85806a = baseGameOverviewObj;
            this.f85807b = aVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.e TabLayout.h hVar) {
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 35807, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            if (f0.g(hVar != null ? hVar.n() : null, ((GameOverviewMatchListObj) this.f85806a).getSelect())) {
                return;
            }
            ((GameOverviewMatchListObj) this.f85806a).setSelect((String) (hVar != null ? hVar.n() : null));
            this.f85807b.invoke();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.e TabLayout.h hVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.e TabLayout.h hVar) {
        }
    }

    /* JADX INFO: compiled from: GameOverviewMatchListAllVHB.kt */
    public static final class b extends com.max.hbcommon.base.adapter.s<MatchObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameOverviewMatchListAllVHB f85808b;

        /* JADX INFO: compiled from: GameOverviewMatchListAllVHB.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameOverviewMatchListAllVHB f85809b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ MatchObj f85810c;

            a(GameOverviewMatchListAllVHB gameOverviewMatchListAllVHB, MatchObj matchObj) {
                this.f85809b = gameOverviewMatchListAllVHB;
                this.f85810c = matchObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35810, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Context contextB = this.f85809b.g().b();
                MatchObj matchObj = this.f85810c;
                com.max.xiaoheihe.base.router.b.s0(contextB, matchObj != null ? matchObj.getMatch_id() : null, this.f85809b.g().h(), this.f85809b.g().g());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ArrayList<MatchObj> arrayList, GameOverviewMatchListAllVHB gameOverviewMatchListAllVHB, Context context) {
            super(context, arrayList, R.layout.item_dota2_match);
            this.f85808b = gameOverviewMatchListAllVHB;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e MatchObj matchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, matchObj}, this, changeQuickRedirect, false, 35808, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MatchObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            GameOverviewMatchListAllVHB gameOverviewMatchListAllVHB = this.f85808b;
            if (matchObj != null) {
                Dota2MatchItemView dota2MatchItemView = (Dota2MatchItemView) eVar.i(R.id.v_match);
                dota2MatchItemView.setMatch(matchObj);
                dota2MatchItemView.setOnClickListener(new a(gameOverviewMatchListAllVHB, matchObj));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MatchObj matchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, matchObj}, this, changeQuickRedirect, false, 35809, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, matchObj);
        }
    }

    /* JADX INFO: compiled from: GameOverviewMatchListAllVHB.kt */
    public static final class c extends com.max.hbcommon.base.adapter.s<MatchObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameOverviewMatchListAllVHB f85824b;

        /* JADX INFO: compiled from: GameOverviewMatchListAllVHB.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameOverviewMatchListAllVHB f85825b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ MatchObj f85826c;

            a(GameOverviewMatchListAllVHB gameOverviewMatchListAllVHB, MatchObj matchObj) {
                this.f85825b = gameOverviewMatchListAllVHB;
                this.f85826c = matchObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35817, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Context contextB = this.f85825b.g().b();
                MatchObj matchObj = this.f85826c;
                com.max.xiaoheihe.base.router.b.s0(contextB, matchObj != null ? matchObj.getMatch_id() : null, this.f85825b.g().h(), this.f85825b.g().g());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ArrayList<MatchObj> arrayList, GameOverviewMatchListAllVHB gameOverviewMatchListAllVHB, Context context) {
            super(context, arrayList, R.layout.item_game_overview_follow_match);
            this.f85824b = gameOverviewMatchListAllVHB;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e MatchObj matchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, matchObj}, this, changeQuickRedirect, false, 35815, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MatchObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            GameOverviewMatchListAllVHB gameOverviewMatchListAllVHB = this.f85824b;
            if (matchObj != null) {
                Dota2FollowMatchItemView dota2FollowMatchItemView = (Dota2FollowMatchItemView) eVar.i(R.id.v_match);
                dota2FollowMatchItemView.setMatch(matchObj);
                dota2FollowMatchItemView.setOnClickListener(new a(gameOverviewMatchListAllVHB, matchObj));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MatchObj matchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, matchObj}, this, changeQuickRedirect, false, 35816, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, matchObj);
        }
    }

    public GameOverviewMatchListAllVHB(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85805a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35806, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, baseGameOverviewObj);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d final BaseGameOverviewObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35805, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameOverviewMatchListObj) {
            TabLayout tabLayout = (TabLayout) viewHolder.i(R.id.tab);
            GameConsecutiveWinView gameConsecutiveWinView = (GameConsecutiveWinView) viewHolder.i(R.id.v_game_consecutive_win);
            final RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv);
            final TextView textView = (TextView) viewHolder.i(R.id.tv_button);
            final ViewGroup viewGroup = (ViewGroup) viewHolder.i(R.id.vg_my_match_title);
            final ViewGroup viewGroup2 = (ViewGroup) viewHolder.i(R.id.vg_follow_match_title);
            textView.setTypeface(bb.d.a().b(0));
            textView.setBackground(com.max.hbutils.utils.q.d(this.f85805a.b(), R.color.white_alpha5, R.color.white_alpha4, ViewUtils.o(this.f85805a.b(), textView)));
            GameOverviewMatchListObj gameOverviewMatchListObj = (GameOverviewMatchListObj) data;
            gameConsecutiveWinView.setData(gameOverviewMatchListObj.getConsecutive_info());
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f85805a.b()));
            tabLayout.L();
            tabLayout.t();
            String title = gameOverviewMatchListObj.getTitle();
            if (title == null) {
                title = "我的比赛";
            }
            final String str = title;
            final String str2 = "关注比赛";
            if (!com.max.hbcommon.utils.c.w(gameOverviewMatchListObj.getMatch_list())) {
                TabLayout.h hVarI = tabLayout.I();
                f0.o(hVarI, "tabLayout.newTab()");
                hVarI.D(str);
                tabLayout.i(hVarI);
                if (com.max.hbcommon.utils.c.u(gameOverviewMatchListObj.getSelect())) {
                    gameOverviewMatchListObj.setSelect(String.valueOf(hVarI.n()));
                }
            }
            if (!com.max.hbcommon.utils.c.w(gameOverviewMatchListObj.getFollow_match_list())) {
                TabLayout.h hVarI2 = tabLayout.I();
                f0.o(hVarI2, "tabLayout.newTab()");
                hVarI2.D("关注比赛");
                tabLayout.i(hVarI2);
                if (com.max.hbcommon.utils.c.u(gameOverviewMatchListObj.getSelect())) {
                    gameOverviewMatchListObj.setSelect(String.valueOf(hVarI2.n()));
                }
            }
            if (gameOverviewMatchListObj.getSelect() != null) {
                int tabCount = tabLayout.getTabCount();
                for (int i10 = 0; i10 < tabCount; i10++) {
                    TabLayout.h hVarD = tabLayout.D(i10);
                    if (f0.g(hVarD != null ? hVarD.n() : null, gameOverviewMatchListObj.getSelect())) {
                        tabLayout.R(tabLayout.D(i10));
                        break;
                    }
                }
            } else {
                tabLayout.R(tabLayout.D(0));
            }
            final ArrayList arrayList = new ArrayList();
            final b bVar = new b(arrayList, this, this.f85805a.b());
            final c cVar = new c(arrayList, this, this.f85805a.b());
            yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.game.adapter.overview.binder.GameOverviewMatchListAllVHB$bindView$refresh$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: compiled from: GameOverviewMatchListAllVHB.kt */
                public static final class a implements View.OnClickListener {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ GameOverviewMatchListAllVHB f85822b;

                    a(GameOverviewMatchListAllVHB gameOverviewMatchListAllVHB) {
                        this.f85822b = gameOverviewMatchListAllVHB;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35813, new Class[]{View.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        com.max.xiaoheihe.base.router.b.o0(this.f85822b.g().b(), this.f85822b.g().h(), this.f85822b.g().g());
                    }
                }

                /* JADX INFO: compiled from: GameOverviewMatchListAllVHB.kt */
                public static final class b implements View.OnClickListener {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ GameOverviewMatchListAllVHB f85823b;

                    b(GameOverviewMatchListAllVHB gameOverviewMatchListAllVHB) {
                        this.f85823b = gameOverviewMatchListAllVHB;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35814, new Class[]{View.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        com.max.xiaoheihe.base.router.b.t0(this.f85823b.g().b(), this.f85823b.g().h(), this.f85823b.g().g());
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @dl.e
                public final b2 a() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35811, new Class[0], b2.class);
                    if (patchProxyResultProxy.isSupported) {
                        return (b2) patchProxyResultProxy.result;
                    }
                    AutoTransition autoTransition = new AutoTransition();
                    autoTransition.w0(150L);
                    androidx.transition.v.b(this.f85811b.g().f(), autoTransition);
                    String select = ((GameOverviewMatchListObj) data).getSelect();
                    if (f0.g(select, str2)) {
                        viewGroup2.setVisibility(0);
                        viewGroup.setVisibility(8);
                        arrayList.clear();
                        ArrayList<MatchObj> arrayList2 = arrayList;
                        List<MatchObj> follow_match_list = ((GameOverviewMatchListObj) data).getFollow_match_list();
                        f0.m(follow_match_list);
                        arrayList2.addAll(follow_match_list);
                        recyclerView.setAdapter(cVar);
                        textView.setOnClickListener(new a(this.f85811b));
                    } else if (f0.g(select, str)) {
                        viewGroup2.setVisibility(8);
                        viewGroup.setVisibility(0);
                        arrayList.clear();
                        ArrayList<MatchObj> arrayList3 = arrayList;
                        List<MatchObj> match_list = ((GameOverviewMatchListObj) data).getMatch_list();
                        f0.m(match_list);
                        arrayList3.addAll(match_list);
                        recyclerView.setAdapter(bVar);
                        textView.setOnClickListener(new b(this.f85811b));
                    }
                    textView.setText("全部比赛 \uf0da");
                    RecyclerView.Adapter adapter = recyclerView.getAdapter();
                    if (adapter == null) {
                        return null;
                    }
                    adapter.notifyDataSetChanged();
                    return b2.f124493a;
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35812, new Class[0], Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
                }
            };
            tabLayout.h(new a(data, aVar));
            aVar.invoke();
        }
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d g() {
        return this.f85805a;
    }
}
