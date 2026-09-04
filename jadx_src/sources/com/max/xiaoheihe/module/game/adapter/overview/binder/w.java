package com.max.xiaoheihe.module.game.adapter.overview.binder;

import android.view.View;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewNotifyObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewNotifyVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class w extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85914b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85915a;

    /* JADX INFO: compiled from: GameOverviewNotifyVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BaseGameOverviewObj f85917c;

        a(BaseGameOverviewObj baseGameOverviewObj) {
            this.f85917c = baseGameOverviewObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35828, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(w.this.g().b(), ((GameOverviewNotifyObj) this.f85917c).getProtocol());
        }
    }

    public w(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85915a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35827, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, baseGameOverviewObj);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BaseGameOverviewObj data) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35826, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (!(data instanceof GameOverviewNotifyObj) || (textView = (TextView) viewHolder.i(R.id.tv_notify)) == null) {
            return;
        }
        textView.setText(((GameOverviewNotifyObj) data).getMsg());
        textView.setOnClickListener(new a(data));
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d g() {
        return this.f85915a;
    }
}
