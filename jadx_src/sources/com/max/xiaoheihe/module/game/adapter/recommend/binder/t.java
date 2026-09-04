package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.SpaceObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SpaceVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class t extends r {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f86253h = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86254g;

    public t(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86254g = param;
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36155, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof SpaceObj) {
            Context contextB = this.f86254g.b();
            View viewI = viewHolder.i(R.id.view_space);
            SpaceObj spaceObj = (SpaceObj) data;
            viewI.setLayoutParams(new ViewGroup.LayoutParams(-1, ViewUtils.f(contextB, com.max.hbutils.utils.n.p(spaceObj.getHeight()))));
            if (com.max.hbcommon.utils.c.u(spaceObj.getBg_color())) {
                viewI.setBackgroundResource(R.color.transparent);
            } else {
                viewI.setBackgroundColor(com.max.xiaoheihe.utils.d.H(contextB, spaceObj.getBg_color()));
            }
        }
    }

    @dl.d
    public final RecommendVHBParam v() {
        return this.f86254g;
    }

    public final void w(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 36154, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86254g = recommendVHBParam;
    }
}
