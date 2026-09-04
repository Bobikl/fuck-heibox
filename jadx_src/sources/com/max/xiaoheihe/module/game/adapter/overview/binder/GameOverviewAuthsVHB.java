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
import com.max.xiaoheihe.bean.game.gameoverview.Dota2UserListObj;
import com.max.xiaoheihe.bean.game.gameoverview.Dota2UserObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewAuthsObj;
import com.max.xiaoheihe.module.game.component.dota2.Dota2FollowUserItemView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2UserItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewAuthsVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class GameOverviewAuthsVHB extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85787b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85788a;

    /* JADX INFO: compiled from: GameOverviewAuthsVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35755, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.v0(GameOverviewAuthsVHB.this.g().b(), GameOverviewAuthsVHB.this.g().h(), GameOverviewAuthsVHB.this.g().g(), GameOverviewAuthsVHB.this.g().i());
        }
    }

    /* JADX INFO: compiled from: GameOverviewAuthsVHB.kt */
    public static final class b implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseGameOverviewObj f85790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f85791b;

        b(BaseGameOverviewObj baseGameOverviewObj, yh.a<b2> aVar) {
            this.f85790a = baseGameOverviewObj;
            this.f85791b = aVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.e TabLayout.h hVar) {
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 35756, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            if (f0.g(hVar != null ? hVar.n() : null, ((GameOverviewAuthsObj) this.f85790a).getSelect())) {
                return;
            }
            ((GameOverviewAuthsObj) this.f85790a).setSelect((String) (hVar != null ? hVar.n() : null));
            this.f85791b.invoke();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.e TabLayout.h hVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.e TabLayout.h hVar) {
        }
    }

    /* JADX INFO: compiled from: GameOverviewAuthsVHB.kt */
    public static final class c extends com.max.hbcommon.base.adapter.s<Dota2UserObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(ArrayList<Dota2UserObj> arrayList, Context context) {
            super(context, arrayList, R.layout.item_game_overview_auth);
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e Dota2UserObj dota2UserObj) {
            if (PatchProxy.proxy(new Object[]{eVar, dota2UserObj}, this, changeQuickRedirect, false, 35757, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Dota2UserObj.class}, Void.TYPE).isSupported || eVar == null || dota2UserObj == null) {
                return;
            }
            ((Dota2FollowUserItemView) eVar.i(R.id.v_dota2_follow)).setData(dota2UserObj);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Dota2UserObj dota2UserObj) {
            if (PatchProxy.proxy(new Object[]{eVar, dota2UserObj}, this, changeQuickRedirect, false, 35758, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, dota2UserObj);
        }
    }

    /* JADX INFO: compiled from: GameOverviewAuthsVHB.kt */
    public static final class d extends com.max.hbcommon.base.adapter.s<Dota2UserObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(ArrayList<Dota2UserObj> arrayList, Context context) {
            super(context, arrayList, R.layout.item_dota2_user);
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e Dota2UserObj dota2UserObj) {
            if (PatchProxy.proxy(new Object[]{eVar, dota2UserObj}, this, changeQuickRedirect, false, 35761, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Dota2UserObj.class}, Void.TYPE).isSupported || eVar == null || dota2UserObj == null) {
                return;
            }
            ((Dota2UserItemView) eVar.i(R.id.v_dota2_user)).setData(dota2UserObj);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Dota2UserObj dota2UserObj) {
            if (PatchProxy.proxy(new Object[]{eVar, dota2UserObj}, this, changeQuickRedirect, false, 35762, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, dota2UserObj);
        }
    }

    public GameOverviewAuthsVHB(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85788a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35754, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, baseGameOverviewObj);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d final BaseGameOverviewObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35753, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameOverviewAuthsObj) {
            TabLayout tabLayout = (TabLayout) viewHolder.i(R.id.tab);
            final RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv);
            final TextView textView = (TextView) viewHolder.i(R.id.tv_button);
            final ViewGroup viewGroup = (ViewGroup) viewHolder.i(R.id.vg_user_title);
            final ViewGroup viewGroup2 = (ViewGroup) viewHolder.i(R.id.vg_auth_title);
            textView.setTypeface(bb.d.a().b(0));
            textView.setBackground(com.max.hbutils.utils.q.d(this.f85788a.b(), R.color.white_alpha5, R.color.white_alpha4, ViewUtils.o(this.f85788a.b(), textView)));
            textView.setOnClickListener(new a());
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f85788a.b()));
            tabLayout.L();
            tabLayout.t();
            final String str = "关注";
            final String str2 = "好友";
            final String str3 = "队友";
            List[] listArr = new List[1];
            GameOverviewAuthsObj gameOverviewAuthsObj = (GameOverviewAuthsObj) data;
            Dota2UserListObj follows_tab = gameOverviewAuthsObj.getFollows_tab();
            listArr[0] = follows_tab != null ? follows_tab.getPlayer_list() : null;
            if (!com.max.hbcommon.utils.c.w(listArr)) {
                TabLayout.h hVarI = tabLayout.I();
                f0.o(hVarI, "tabLayout.newTab()");
                hVarI.D("关注");
                tabLayout.i(hVarI);
                if (com.max.hbcommon.utils.c.u(gameOverviewAuthsObj.getSelect())) {
                    gameOverviewAuthsObj.setSelect(String.valueOf(hVarI.n()));
                }
            }
            List[] listArr2 = new List[1];
            Dota2UserListObj friends_tab = gameOverviewAuthsObj.getFriends_tab();
            listArr2[0] = friends_tab != null ? friends_tab.getPlayer_list() : null;
            if (!com.max.hbcommon.utils.c.w(listArr2)) {
                TabLayout.h hVarI2 = tabLayout.I();
                f0.o(hVarI2, "tabLayout.newTab()");
                hVarI2.D("好友");
                tabLayout.i(hVarI2);
                if (com.max.hbcommon.utils.c.u(gameOverviewAuthsObj.getSelect())) {
                    gameOverviewAuthsObj.setSelect(String.valueOf(hVarI2.n()));
                }
            }
            List[] listArr3 = new List[1];
            Dota2UserListObj teammates_tab = gameOverviewAuthsObj.getTeammates_tab();
            listArr3[0] = teammates_tab != null ? teammates_tab.getPlayer_list() : null;
            if (!com.max.hbcommon.utils.c.w(listArr3)) {
                TabLayout.h hVarI3 = tabLayout.I();
                f0.o(hVarI3, "tabLayout.newTab()");
                hVarI3.D("队友");
                tabLayout.i(hVarI3);
                if (com.max.hbcommon.utils.c.u(gameOverviewAuthsObj.getSelect())) {
                    gameOverviewAuthsObj.setSelect(String.valueOf(hVarI3.n()));
                }
            }
            if (gameOverviewAuthsObj.getSelect() != null) {
                int tabCount = tabLayout.getTabCount();
                for (int i10 = 0; i10 < tabCount; i10++) {
                    TabLayout.h hVarD = tabLayout.D(i10);
                    if (f0.g(hVarD != null ? hVarD.n() : null, gameOverviewAuthsObj.getSelect())) {
                        tabLayout.R(tabLayout.D(i10));
                        break;
                    }
                }
            } else {
                tabLayout.R(tabLayout.D(0));
            }
            final ArrayList arrayList = new ArrayList();
            final c cVar = new c(arrayList, this.f85788a.b());
            final d dVar = new d(arrayList, this.f85788a.b());
            yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.game.adapter.overview.binder.GameOverviewAuthsVHB$bindView$refresh$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @dl.e
                public final b2 a() {
                    String str4;
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35759, new Class[0], b2.class);
                    if (patchProxyResultProxy.isSupported) {
                        return (b2) patchProxyResultProxy.result;
                    }
                    AutoTransition autoTransition = new AutoTransition();
                    autoTransition.w0(150L);
                    androidx.transition.v.b(this.f85792b.g().f(), autoTransition);
                    String select = ((GameOverviewAuthsObj) data).getSelect();
                    if (f0.g(select, str3)) {
                        viewGroup2.setVisibility(8);
                        viewGroup.setVisibility(0);
                        arrayList.clear();
                        ArrayList<Dota2UserObj> arrayList2 = arrayList;
                        Dota2UserListObj teammates_tab2 = ((GameOverviewAuthsObj) data).getTeammates_tab();
                        f0.m(teammates_tab2);
                        List<Dota2UserObj> player_list = teammates_tab2.getPlayer_list();
                        f0.m(player_list);
                        arrayList2.addAll(player_list);
                        recyclerView.setAdapter(dVar);
                        str4 = "全部队友 \uf0da";
                    } else if (f0.g(select, str2)) {
                        viewGroup2.setVisibility(0);
                        viewGroup.setVisibility(8);
                        arrayList.clear();
                        ArrayList<Dota2UserObj> arrayList3 = arrayList;
                        Dota2UserListObj friends_tab2 = ((GameOverviewAuthsObj) data).getFriends_tab();
                        f0.m(friends_tab2);
                        List<Dota2UserObj> player_list2 = friends_tab2.getPlayer_list();
                        f0.m(player_list2);
                        arrayList3.addAll(player_list2);
                        recyclerView.setAdapter(cVar);
                        str4 = "全部好友 \uf0da";
                    } else if (f0.g(select, str)) {
                        viewGroup2.setVisibility(0);
                        viewGroup.setVisibility(8);
                        arrayList.clear();
                        ArrayList<Dota2UserObj> arrayList4 = arrayList;
                        Dota2UserListObj follows_tab2 = ((GameOverviewAuthsObj) data).getFollows_tab();
                        f0.m(follows_tab2);
                        List<Dota2UserObj> player_list3 = follows_tab2.getPlayer_list();
                        f0.m(player_list3);
                        arrayList4.addAll(player_list3);
                        recyclerView.setAdapter(cVar);
                        str4 = "全部关注 \uf0da";
                    } else {
                        str4 = "";
                    }
                    textView.setText(str4);
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
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35760, new Class[0], Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
                }
            };
            tabLayout.h(new b(data, aVar));
            aVar.invoke();
        }
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d g() {
        return this.f85788a;
    }
}
