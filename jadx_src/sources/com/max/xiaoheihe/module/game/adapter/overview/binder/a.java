package com.max.xiaoheihe.module.game.adapter.overview.binder;

import android.view.View;
import android.widget.TextView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewAllHeroButtonVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class a extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85827b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85828a;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.overview.binder.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GameOverviewAllHeroButtonVHB.kt */
    public static final class ViewOnClickListenerC0765a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        ViewOnClickListenerC0765a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35737, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.r0(a.this.g().b(), a.this.g().h(), a.this.g().g());
        }
    }

    public a(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85828a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35736, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, baseGameOverviewObj);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BaseGameOverviewObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35735, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        TextView textView = (TextView) viewHolder.i(R.id.tv_button);
        textView.setText("全部英雄 \uf0da");
        textView.setTypeface(bb.d.a().b(0));
        textView.setBackground(com.max.hbutils.utils.q.d(this.f85828a.b(), R.color.white_alpha5, R.color.white_alpha4, ViewUtils.o(this.f85828a.b(), textView)));
        textView.setOnClickListener(new ViewOnClickListenerC0765a());
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d g() {
        return this.f85828a;
    }
}
