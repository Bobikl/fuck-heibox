package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.bean.analytics.RvVisiableRangeObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.recommend.GameCardListV2Obj;
import com.max.xiaoheihe.bean.game.recommend.GameCardV2Obj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;

/* JADX INFO: compiled from: NormalGameCardScrollVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class m extends r {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f86197h = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86198g;

    /* JADX INFO: compiled from: NormalGameCardScrollVHB.kt */
    public static final class a extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36064, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            RvVisiableRangeObj subRange = com.max.xiaoheihe.utils.d.j0(recyclerView);
            if (recyclerView.getTag(m.this.m()) == null || recyclerView.getTag(m.this.l()) == null) {
                return;
            }
            Object tag = recyclerView.getTag(m.this.m());
            f0.n(tag, "null cannot be cast to non-null type kotlin.collections.MutableList<com.max.hbcommon.bean.analytics.PathSrcNode>");
            List<PathSrcNode> listG = w0.g(tag);
            Object tag2 = recyclerView.getTag(m.this.l());
            f0.n(tag2, "null cannot be cast to non-null type com.max.xiaoheihe.bean.game.recommend.GameCardListV2Obj");
            m mVar = m.this;
            f0.o(subRange, "subRange");
            mVar.i(listG, subRange, (GameCardListV2Obj) tag2);
        }
    }

    public m(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86198g = param;
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        com.max.xiaoheihe.module.game.adapter.recommend.e eVar;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36062, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv);
        if (!(data instanceof GameCardListV2Obj) || f0.g(data, recyclerView.getTag(R.id.rv))) {
            return;
        }
        recyclerView.setTag(R.id.rv, data);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f86198g.b(), 0, false));
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.f86198g.b(), 8.0f), ViewUtils.f(this.f86198g.b(), 12.0f)));
        }
        a aVar = new a();
        if (recyclerView.getTag(l()) == null) {
            recyclerView.addOnScrollListener(aVar);
        }
        recyclerView.setTag(l(), data);
        ArrayList<GameCardV2Obj> games = ((GameCardListV2Obj) data).getGames();
        if (games != null) {
            eVar = new com.max.xiaoheihe.module.game.adapter.recommend.e(this.f86198g.b(), games);
            eVar.q(data.copyToPathNode());
        } else {
            eVar = null;
        }
        recyclerView.setAdapter(eVar);
        gc.a aVar2 = new gc.a();
        aVar2.d(ViewUtils.f(this.f86198g.b(), 7.0f));
        recyclerView.setOnFlingListener(null);
        aVar2.attachToRecyclerView(recyclerView);
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void p(@dl.d View itemView, @dl.d List<PathSrcNode> shownList, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{itemView, shownList, data}, this, changeQuickRedirect, false, 36063, new Class[]{View.class, List.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemView, "itemView");
        f0.p(shownList, "shownList");
        f0.p(data, "data");
        if (com.max.hbcommon.utils.c.u(data.getReport_path()) || !(data instanceof GameCardListV2Obj)) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) itemView.findViewById(R.id.rv);
        RvVisiableRangeObj range = com.max.xiaoheihe.utils.d.j0(recyclerView);
        recyclerView.setTag(m(), shownList);
        f0.o(range, "range");
        i(shownList, range, data);
    }

    @dl.d
    public final RecommendVHBParam v() {
        return this.f86198g;
    }

    public final void w(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 36061, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86198g = recommendVHBParam;
    }
}
