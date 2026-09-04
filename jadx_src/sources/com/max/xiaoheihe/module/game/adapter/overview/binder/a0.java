package com.max.xiaoheihe.module.game.adapter.overview.binder;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewDataStatsListObj;
import com.max.xiaoheihe.module.game.component.GameOverviewRecentStatsView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewRecentStatsVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class a0 extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85830b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85831a;

    /* JADX INFO: compiled from: GameOverviewRecentStatsVHB.kt */
    public static final class a extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f85832b;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.overview.binder.a0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GameOverviewRecentStatsVHB.kt */
        public static final class ViewOnClickListenerC0766a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f85833b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ KeyDescObj f85834c;

            ViewOnClickListenerC0766a(a0 a0Var, KeyDescObj keyDescObj) {
                this.f85833b = a0Var;
                this.f85834c = keyDescObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35854, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Context contextB = this.f85833b.g().b();
                KeyDescObj keyDescObj = this.f85834c;
                com.max.xiaoheihe.base.router.b.k0(contextB, keyDescObj != null ? keyDescObj.getProtocol() : null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<KeyDescObj> list, a0 a0Var, Context context) {
            super(context, list, R.layout.item_game_overview_recent_stat);
            this.f85832b = a0Var;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e KeyDescObj keyDescObj) {
            View view;
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 35852, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            GameOverviewRecentStatsView gameOverviewRecentStatsView = eVar != null ? (GameOverviewRecentStatsView) eVar.i(R.id.v_recent_stats) : null;
            if (gameOverviewRecentStatsView != null) {
                gameOverviewRecentStatsView.setData(keyDescObj);
            }
            if (eVar == null || (view = eVar.itemView) == null) {
                return;
            }
            view.setOnClickListener(new ViewOnClickListenerC0766a(this.f85832b, keyDescObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 35853, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    public a0(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85831a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35851, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, baseGameOverviewObj);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BaseGameOverviewObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35850, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameOverviewDataStatsListObj) {
            RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv);
            List<KeyDescObj> data_list = ((GameOverviewDataStatsListObj) data).getData_list();
            if (data_list == null || data_list.size() <= 0) {
                return;
            }
            if (recyclerView.getItemDecorationCount() == 0) {
                ic.a aVar = ic.a.f119343a;
                recyclerView.addItemDecoration(new com.max.hbcustomview.d(aVar.b(this.f85831a.b(), 10), aVar.b(this.f85831a.b(), 12)));
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f85831a.b(), 0, false));
            recyclerView.setAdapter(new a(data_list, this, this.f85831a.b()));
        }
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d g() {
        return this.f85831a;
    }
}
