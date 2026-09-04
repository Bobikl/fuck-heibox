package com.max.xiaoheihe.module.game.adapter.overview.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewDataStatsListObj;
import com.max.xiaoheihe.module.game.component.GameOverviewAllStatsView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewAllStatsVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class c extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85840b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85841a;

    /* JADX INFO: compiled from: GameOverviewAllStatsVHB.kt */
    public static final class a extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f85842b;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.overview.binder.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GameOverviewAllStatsVHB.kt */
        public static final class ViewOnClickListenerC0767a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f85843b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ KeyDescObj f85844c;

            ViewOnClickListenerC0767a(c cVar, KeyDescObj keyDescObj) {
                this.f85843b = cVar;
                this.f85844c = keyDescObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35747, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Context contextB = this.f85843b.h().b();
                KeyDescObj keyDescObj = this.f85844c;
                com.max.xiaoheihe.base.router.b.k0(contextB, keyDescObj != null ? keyDescObj.getProtocol() : null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<KeyDescObj> list, c cVar, Context context) {
            super(context, list, R.layout.item_game_overview_all_stat);
            this.f85842b = cVar;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e KeyDescObj keyDescObj) {
            View view;
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 35745, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            GameOverviewAllStatsView gameOverviewAllStatsView = eVar != null ? (GameOverviewAllStatsView) eVar.i(R.id.v_all_stats) : null;
            if (gameOverviewAllStatsView != null) {
                gameOverviewAllStatsView.setData(keyDescObj);
            }
            if (eVar == null || (view = eVar.itemView) == null) {
                return;
            }
            view.setOnClickListener(new ViewOnClickListenerC0767a(this.f85842b, keyDescObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 35746, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    /* JADX INFO: compiled from: GameOverviewAllStatsVHB.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameOverviewDataStatsListObj f85845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f85846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AutoTransition f85847d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f85848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ RecyclerView f85849f;

        b(GameOverviewDataStatsListObj gameOverviewDataStatsListObj, c cVar, AutoTransition autoTransition, TextView textView, RecyclerView recyclerView) {
            this.f85845b = gameOverviewDataStatsListObj;
            this.f85846c = cVar;
            this.f85847d = autoTransition;
            this.f85848e = textView;
            this.f85849f = recyclerView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35748, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f85845b.setExpend(Boolean.FALSE);
            androidx.transition.v.b(this.f85846c.h().f(), this.f85847d);
            c.f(this.f85846c, this.f85848e, this.f85845b, this.f85849f);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.overview.binder.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GameOverviewAllStatsVHB.kt */
    public static final class ViewOnClickListenerC0768c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameOverviewDataStatsListObj f85850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f85851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AutoTransition f85852d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f85853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ RecyclerView f85854f;

        ViewOnClickListenerC0768c(GameOverviewDataStatsListObj gameOverviewDataStatsListObj, c cVar, AutoTransition autoTransition, TextView textView, RecyclerView recyclerView) {
            this.f85850b = gameOverviewDataStatsListObj;
            this.f85851c = cVar;
            this.f85852d = autoTransition;
            this.f85853e = textView;
            this.f85854f = recyclerView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35749, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f85850b.setExpend(Boolean.TRUE);
            this.f85851c.h().a();
            androidx.transition.v.b(this.f85851c.h().f(), this.f85852d);
            c.f(this.f85851c, this.f85853e, this.f85850b, this.f85854f);
        }
    }

    public c(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85841a = param;
    }

    public static final /* synthetic */ void f(c cVar, TextView textView, GameOverviewDataStatsListObj gameOverviewDataStatsListObj, RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{cVar, textView, gameOverviewDataStatsListObj, recyclerView}, null, changeQuickRedirect, true, 35744, new Class[]{c.class, TextView.class, GameOverviewDataStatsListObj.class, RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.i(textView, gameOverviewDataStatsListObj, recyclerView);
    }

    private final void i(TextView textView, GameOverviewDataStatsListObj gameOverviewDataStatsListObj, RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{textView, gameOverviewDataStatsListObj, recyclerView}, this, changeQuickRedirect, false, 35742, new Class[]{TextView.class, GameOverviewDataStatsListObj.class, RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.w0(200L);
        if (f0.g(gameOverviewDataStatsListObj.isExpend(), Boolean.TRUE)) {
            textView.setText("收起 \uf0d8");
            textView.setOnClickListener(new b(gameOverviewDataStatsListObj, this, autoTransition, textView, recyclerView));
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            layoutParams.height = -2;
            recyclerView.setLayoutParams(layoutParams);
            return;
        }
        textView.setText("更多摘要 \uf0d7");
        textView.setOnClickListener(new ViewOnClickListenerC0768c(gameOverviewDataStatsListObj, this, autoTransition, textView, recyclerView));
        ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
        layoutParams2.height = 0;
        recyclerView.setLayoutParams(layoutParams2);
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35743, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        g(eVar, baseGameOverviewObj);
    }

    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BaseGameOverviewObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35741, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameOverviewDataStatsListObj) {
            RecyclerView rv = (RecyclerView) viewHolder.i(R.id.rv);
            TextView tv_expend = (TextView) viewHolder.i(R.id.tv_expand_data);
            tv_expend.setTypeface(bb.d.a().b(0));
            tv_expend.setBackground(com.max.hbutils.utils.q.d(this.f85841a.b(), R.color.white_alpha5, R.color.white_alpha4, ViewUtils.o(this.f85841a.b(), tv_expend)));
            tv_expend.setClickable(true);
            f0.o(tv_expend, "tv_expend");
            GameOverviewDataStatsListObj gameOverviewDataStatsListObj = (GameOverviewDataStatsListObj) data;
            f0.o(rv, "rv");
            i(tv_expend, gameOverviewDataStatsListObj, rv);
            List<KeyDescObj> data_list = gameOverviewDataStatsListObj.getData_list();
            if (data_list == null || data_list.size() <= 0) {
                return;
            }
            if (rv.getItemDecorationCount() == 0) {
                rv.addItemDecoration(new fc.b(4, ic.a.f119343a.b(this.f85841a.b(), 4), false));
            }
            rv.setLayoutManager(new GridLayoutManager(this.f85841a.b(), 4));
            rv.setAdapter(new a(data_list, this, this.f85841a.b()));
        }
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d h() {
        return this.f85841a;
    }
}
