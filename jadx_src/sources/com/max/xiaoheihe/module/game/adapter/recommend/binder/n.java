package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.w;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.RecGoodsObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecGoodsVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class n extends r {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f86200i = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.mall.k f86202h;

    /* JADX INFO: compiled from: RecGoodsVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameRecommendBaseObj f86204c;

        a(GameRecommendBaseObj gameRecommendBaseObj) {
            this.f86204c = gameRecommendBaseObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36069, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(n.this.v().b(), ((RecGoodsObj) this.f86204c).getProtocol());
        }
    }

    public n(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86201g = param;
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36066, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void h(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36067, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.h(viewHolder, data);
        if (data instanceof RecGoodsObj) {
            RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv_rec_goods);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f86201g.b(), 0, false));
            if (recyclerView.getItemDecorationCount() <= 0) {
                recyclerView.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.f86201g.b(), 6.0f), ViewUtils.f(this.f86201g.b(), 12.0f), 0));
            }
            this.f86202h = new com.max.xiaoheihe.module.mall.k(this.f86201g.b(), ((RecGoodsObj) data).getItems());
            w wVar = new w(this.f86201g.b(), this.f86202h, new a(data));
            wVar.J(-1);
            wVar.H(R.color.transparent);
            recyclerView.setAdapter(wVar);
        }
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void p(@dl.d View itemView, @dl.d List<PathSrcNode> shownList, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{itemView, shownList, data}, this, changeQuickRedirect, false, 36068, new Class[]{View.class, List.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemView, "itemView");
        f0.p(shownList, "shownList");
        f0.p(data, "data");
        if (com.max.hbcommon.utils.c.u(data.getReport_path()) || data.isReported_exposure()) {
            return;
        }
        data.setReported_exposure(true);
        com.max.xiaoheihe.module.mall.k kVar = this.f86202h;
        if (kVar != null) {
            kVar.n();
        }
    }

    @dl.d
    public final RecommendVHBParam v() {
        return this.f86201g;
    }

    public final void w(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 36065, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86201g = recommendVHBParam;
    }
}
