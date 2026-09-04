package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.RVCommonBigBrotherAdapter;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.bean.analytics.RvVisiableRangeObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.recommend.GameCardListObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.c10;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;

/* JADX INFO: compiled from: VerGameCardScrollVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class v extends r {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f86259h = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86260g;

    /* JADX INFO: compiled from: VerGameCardScrollVHB.kt */
    public static final class a extends RVCommonBigBrotherAdapter<GameCardObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameRecommendBaseObj f86262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ RecyclerView f86263e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(GameRecommendBaseObj gameRecommendBaseObj, RecyclerView recyclerView, Context context, ArrayList<GameCardObj> arrayList) {
            super(context, arrayList);
            this.f86262d = gameRecommendBaseObj;
            this.f86263e = recyclerView;
        }

        @Override // com.max.hbcommon.base.adapter.RVCommonBigBrotherAdapter, com.max.hbcommon.base.adapter.e
        public /* bridge */ /* synthetic */ void h(com.max.hbcommon.base.adapter.g gVar, com.max.hbcommon.base.adapter.s sVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{gVar, sVar, obj}, this, changeQuickRedirect, false, 36165, new Class[]{com.max.hbcommon.base.adapter.g.class, com.max.hbcommon.base.adapter.s.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            s(gVar, sVar, (GameCardObj) obj);
        }

        @Override // com.max.hbcommon.base.adapter.RVCommonBigBrotherAdapter, com.max.hbcommon.base.adapter.e
        @dl.d
        public com.max.hbcommon.base.adapter.g i(@dl.d ViewGroup parent, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 36162, new Class[]{ViewGroup.class, Integer.TYPE}, com.max.hbcommon.base.adapter.g.class);
            if (patchProxyResultProxy.isSupported) {
                return (com.max.hbcommon.base.adapter.g) patchProxyResultProxy.result;
            }
            f0.p(parent, "parent");
            Context contextB = v.this.v().b();
            v vVar = v.this;
            GameRecommendBaseObj gameRecommendBaseObj = this.f86262d;
            c10 c10VarD = c10.d(LayoutInflater.from(vVar.v().b()), this.f86263e, false);
            f0.o(c10VarD, "inflate(\n               …                        )");
            return new com.max.xiaoheihe.module.game.adapter.recommend.viewholder.c(contextB, vVar, gameRecommendBaseObj, c10VarD);
        }

        @Override // com.max.hbcommon.base.adapter.e
        public /* bridge */ /* synthetic */ Pair j(com.max.hbcommon.base.adapter.g gVar, com.max.hbcommon.base.adapter.s sVar, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar, sVar, obj}, this, changeQuickRedirect, false, 36166, new Class[]{com.max.hbcommon.base.adapter.g.class, com.max.hbcommon.base.adapter.s.class, Object.class}, Pair.class);
            return patchProxyResultProxy.isSupported ? (Pair) patchProxyResultProxy.result : r(gVar, sVar, (GameCardObj) obj);
        }

        @dl.e
        public Pair<com.max.hbcommon.base.adapter.l, RecyclerView> r(@dl.d com.max.hbcommon.base.adapter.g viewHolder, @dl.d com.max.hbcommon.base.adapter.s<?> adapter, @dl.d GameCardObj gameCard) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewHolder, adapter, gameCard}, this, changeQuickRedirect, false, 36164, new Class[]{com.max.hbcommon.base.adapter.g.class, com.max.hbcommon.base.adapter.s.class, GameCardObj.class}, Pair.class);
            if (patchProxyResultProxy.isSupported) {
                return (Pair) patchProxyResultProxy.result;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(adapter, "adapter");
            f0.p(gameCard, "gameCard");
            return viewHolder.x(v.this.v().b(), this, viewHolder, gameCard);
        }

        public void s(@dl.d com.max.hbcommon.base.adapter.g viewHolder, @dl.d com.max.hbcommon.base.adapter.s<?> adapter, @dl.d GameCardObj gameCard) {
            if (PatchProxy.proxy(new Object[]{viewHolder, adapter, gameCard}, this, changeQuickRedirect, false, 36163, new Class[]{com.max.hbcommon.base.adapter.g.class, com.max.hbcommon.base.adapter.s.class, GameCardObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(adapter, "adapter");
            f0.p(gameCard, "gameCard");
            super.h(viewHolder, adapter, gameCard);
            viewHolder.v(v.this.v().b(), this, viewHolder, gameCard);
        }
    }

    /* JADX INFO: compiled from: VerGameCardScrollVHB.kt */
    public static final class b extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36167, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            RvVisiableRangeObj subRange = com.max.xiaoheihe.utils.d.k0(recyclerView, 0.3f);
            if (recyclerView.getTag(v.this.m()) == null || recyclerView.getTag(v.this.l()) == null) {
                return;
            }
            Object tag = recyclerView.getTag(v.this.m());
            f0.n(tag, "null cannot be cast to non-null type kotlin.collections.MutableList<com.max.hbcommon.bean.analytics.PathSrcNode>");
            List<PathSrcNode> listG = w0.g(tag);
            Object tag2 = recyclerView.getTag(v.this.l());
            f0.n(tag2, "null cannot be cast to non-null type com.max.xiaoheihe.bean.game.recommend.GameCardListObj");
            v vVar = v.this;
            f0.o(subRange, "subRange");
            vVar.i(listG, subRange, (GameCardListObj) tag2);
        }
    }

    public v(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86260g = param;
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36160, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        com.max.heybox.hblog.g.f74531b.q("VerGameCardScrollVHB, contentBinding " + Thread.currentThread().getName());
        RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv);
        if (!(data instanceof GameCardListObj) || f0.g(data, recyclerView.getTag(R.id.rv))) {
            return;
        }
        recyclerView.setTag(R.id.rv, data);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f86260g.b(), 0, false));
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.f86260g.b(), 8.0f), ViewUtils.f(this.f86260g.b(), 12.0f)));
        }
        RecyclerView.OnScrollListener bVar = new b();
        if (recyclerView.getTag(l()) == null) {
            recyclerView.addOnScrollListener(bVar);
        }
        recyclerView.setTag(l(), data);
        GameCardListObj gameCardListObj = (GameCardListObj) data;
        a aVar = new a(data, recyclerView, this.f86260g.b(), gameCardListObj.getGames());
        aVar.q(gameCardListObj.getGames());
        recyclerView.setAdapter(aVar);
        gc.a aVar2 = new gc.a();
        aVar2.d(ViewUtils.f(this.f86260g.b(), 7.0f));
        recyclerView.setOnFlingListener(null);
        aVar2.attachToRecyclerView(recyclerView);
        t(aVar);
        u(recyclerView);
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void p(@dl.d View itemView, @dl.d List<PathSrcNode> shownList, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{itemView, shownList, data}, this, changeQuickRedirect, false, 36161, new Class[]{View.class, List.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemView, "itemView");
        f0.p(shownList, "shownList");
        f0.p(data, "data");
        if (com.max.hbcommon.utils.c.u(data.getReport_path()) || !(data instanceof GameCardListObj)) {
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
        return this.f86260g;
    }

    public final void w(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 36159, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86260g = recommendVHBParam;
    }
}
