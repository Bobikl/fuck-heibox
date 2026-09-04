package com.max.xiaoheihe.module.game.adapter.overview.binder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.CareerRecordObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewCareerObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewCareerRecordVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class h extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85873b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85874a;

    /* JADX INFO: compiled from: GameOverviewCareerRecordVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35774, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.u0(h.this.g().b(), h.this.g().h(), h.this.g().g());
        }
    }

    public h(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85874a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35773, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, baseGameOverviewObj);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BaseGameOverviewObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35772, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameOverviewCareerObj) {
            GameOverviewCareerObj gameOverviewCareerObj = (GameOverviewCareerObj) data;
            if (com.max.hbcommon.utils.c.w(gameOverviewCareerObj.getCareer_record())) {
                return;
            }
            TextView textView = (TextView) viewHolder.i(R.id.tv_title);
            RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_button);
            textView.setText(gameOverviewCareerObj.getTitle());
            textView2.setText("全部记录 \uf0da");
            textView2.setTypeface(bb.d.a().b(0));
            textView2.setBackground(com.max.hbutils.utils.q.d(this.f85874a.b(), R.color.white_alpha5, R.color.white_alpha4, ViewUtils.o(this.f85874a.b(), textView2)));
            textView2.setOnClickListener(new a());
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f85874a.b(), 0, false));
            if (recyclerView.getItemDecorationCount() == 0) {
                recyclerView.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.f85874a.b(), 6.0f), ViewUtils.f(this.f85874a.b(), 12.0f)));
            }
            Context contextB = this.f85874a.b();
            List<CareerRecordObj> career_record = gameOverviewCareerObj.getCareer_record();
            f0.m(career_record);
            recyclerView.setAdapter(new com.max.xiaoheihe.module.game.adapter.overview.a(contextB, career_record));
        }
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d g() {
        return this.f85874a;
    }
}
