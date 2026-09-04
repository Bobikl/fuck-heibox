package com.max.xiaoheihe.module.game.adapter.overview.binder;

import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewSpaceObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewSpaceVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class b0 extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85838b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85839a;

    public b0(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85839a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35856, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, baseGameOverviewObj);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BaseGameOverviewObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35855, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameOverviewSpaceObj) {
            viewHolder.itemView.getLayoutParams().height = ViewUtils.f(this.f85839a.b(), com.max.hbutils.utils.n.p(((GameOverviewSpaceObj) data).getHeight()));
        }
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d g() {
        return this.f85839a;
    }
}
