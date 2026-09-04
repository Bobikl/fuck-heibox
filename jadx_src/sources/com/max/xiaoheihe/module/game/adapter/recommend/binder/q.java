package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.adapter.RVCommonBigBrotherAdapter;
import com.max.hbcommon.base.adapter.RecyclerViewItemWatcher;
import com.max.hbcommon.base.adapter.a0;
import com.max.hbcommon.base.adapter.w;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.RecommendBoardMultiObj;
import com.max.xiaoheihe.bean.mall.RecommendBoardItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.sv;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecommendBoardMultiVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class q extends r {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f86229i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f86230j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final ArrayList<RecommendBoardItem> f86231k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final ArrayList<RecommendBoardItem> f86232l = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private RecyclerViewItemWatcher<w> f86234h;

    /* JADX INFO: compiled from: RecommendBoardMultiVHB.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.m
        public static /* synthetic */ void b() {
        }

        @xh.m
        public static /* synthetic */ void d() {
        }

        @dl.d
        public final ArrayList<RecommendBoardItem> a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36100, new Class[0], ArrayList.class);
            return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : q.f86232l;
        }

        @dl.d
        public final ArrayList<RecommendBoardItem> c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36099, new Class[0], ArrayList.class);
            return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : q.f86231k;
        }
    }

    /* JADX INFO: compiled from: RecommendBoardMultiVHB.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class b implements a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f86235b = 8;
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final RecommendBoardMultiObj f86236a;

        public b(@dl.d RecommendBoardMultiObj data) {
            f0.p(data, "data");
            this.f86236a = data;
        }

        private final void e(PathSrcNode pathSrcNode) {
            if (PatchProxy.proxy(new Object[]{pathSrcNode}, this, changeQuickRedirect, false, 36103, new Class[]{PathSrcNode.class}, Void.TYPE).isSupported) {
                return;
            }
            PageEventObj pageEventObj = new PageEventObj();
            pageEventObj.setType("3");
            pageEventObj.setPath(pathSrcNode.getPath());
            JsonObject jsonObject = pathSrcNode.getAddition() != null ? (JsonObject) com.max.hbutils.utils.k.a(pathSrcNode.getAddition().toString(), JsonObject.class) : new JsonObject();
            if (com.max.hbcommon.utils.i.e(HeyBoxApplication.C())) {
                jsonObject.addProperty("net_mode", "wifi");
            } else {
                jsonObject.addProperty("net_mode", "cellular");
            }
            pageEventObj.setAddition(jsonObject);
            pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
            com.max.hbcommon.analytics.d.c(pageEventObj, true);
        }

        @Override // com.max.hbcommon.base.adapter.a0
        public void a(int i10, @dl.e RecyclerView.ViewHolder viewHolder, float f10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder, new Float(f10)}, this, changeQuickRedirect, false, 36104, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            a0.a.a(this, i10, viewHolder, f10);
        }

        @Override // com.max.hbcommon.base.adapter.a0
        public void b(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
            View view;
            Object tag;
            if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, 36102, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported || viewHolder == null || (view = viewHolder.itemView) == null || (tag = view.getTag()) == null || !(tag instanceof RecommendBoardItem)) {
                return;
            }
            RecommendBoardItem recommendBoardItem = (RecommendBoardItem) tag;
            if (recommendBoardItem.isHideReport()) {
                return;
            }
            com.max.heybox.hblog.g.f74531b.q("RecommendBoardMultiVHB, onScrollOut, it = " + tag);
            recommendBoardItem.setHideReport(true);
            com.max.xiaoheihe.utils.d.d(false, com.max.hbutils.utils.k.p(recommendBoardItem.generateShowInfo()));
            com.max.xiaoheihe.utils.d.f();
        }

        @Override // com.max.hbcommon.base.adapter.a0
        public void c(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
            View view;
            Object tag;
            if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, 36101, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported || viewHolder == null || (view = viewHolder.itemView) == null || (tag = view.getTag()) == null || !(tag instanceof RecommendBoardItem)) {
                return;
            }
            RecommendBoardItem recommendBoardItem = (RecommendBoardItem) tag;
            if (recommendBoardItem.isExposureReport()) {
                return;
            }
            com.max.heybox.hblog.g.f74531b.q("RecommendBoardMultiVHB, onScrollIn, it = " + tag);
            recommendBoardItem.setExposureReport(true);
            e(recommendBoardItem.getGameLibraryShowInfo(this.f86236a));
            com.max.xiaoheihe.utils.d.d(true, com.max.hbutils.utils.k.p(recommendBoardItem.generateShowInfo()));
            com.max.xiaoheihe.utils.d.f();
        }

        @dl.d
        public final RecommendBoardMultiObj d() {
            return this.f86236a;
        }
    }

    /* JADX INFO: compiled from: RecommendBoardMultiVHB.kt */
    public static final class c extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f86237b;

        c(Context context) {
            this.f86237b = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            int itemCount;
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 36105, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(outRect, "outRect");
            f0.p(view, "view");
            f0.p(parent, "parent");
            f0.p(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            int iF = childAdapterPosition == 0 ? ViewUtils.f(this.f86237b, 12.0f) : ViewUtils.f(this.f86237b, 4.0f);
            if (parent.getAdapter() != null) {
                RecyclerView.Adapter adapter = parent.getAdapter();
                f0.m(adapter);
                itemCount = adapter.getItemCount();
            } else {
                itemCount = 0;
            }
            outRect.set(iF, 0, childAdapterPosition == itemCount - 1 ? 0 : ViewUtils.f(this.f86237b, 4.0f), 0);
        }
    }

    /* JADX INFO: compiled from: RecommendBoardMultiVHB.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f86238b;

        d(Context context) {
            this.f86238b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36106, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(this.f86238b, "/game/comment_recommend");
        }
    }

    /* JADX INFO: compiled from: RecommendBoardMultiVHB.kt */
    public static final class e extends RVCommonBigBrotherAdapter<RecommendBoardItem> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f86239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ RecyclerView f86240d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, List<RecommendBoardItem> list, RecyclerView recyclerView) {
            super(context, list);
            this.f86239c = context;
            this.f86240d = recyclerView;
        }

        @Override // com.max.hbcommon.base.adapter.RVCommonBigBrotherAdapter, com.max.hbcommon.base.adapter.e
        public /* bridge */ /* synthetic */ void h(com.max.hbcommon.base.adapter.g gVar, com.max.hbcommon.base.adapter.s sVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{gVar, sVar, obj}, this, changeQuickRedirect, false, 36110, new Class[]{com.max.hbcommon.base.adapter.g.class, com.max.hbcommon.base.adapter.s.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            s(gVar, sVar, (RecommendBoardItem) obj);
        }

        @Override // com.max.hbcommon.base.adapter.RVCommonBigBrotherAdapter, com.max.hbcommon.base.adapter.e
        @dl.d
        public com.max.hbcommon.base.adapter.g i(@dl.d ViewGroup parent, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 36107, new Class[]{ViewGroup.class, Integer.TYPE}, com.max.hbcommon.base.adapter.g.class);
            if (patchProxyResultProxy.isSupported) {
                return (com.max.hbcommon.base.adapter.g) patchProxyResultProxy.result;
            }
            f0.p(parent, "parent");
            Context context = this.f86239c;
            sv svVarD = sv.d(LayoutInflater.from(context), this.f86240d, false);
            f0.o(svVarD, "inflate(\n               …lse\n                    )");
            return new com.max.xiaoheihe.module.game.adapter.recommend.viewholder.b(context, svVarD);
        }

        @Override // com.max.hbcommon.base.adapter.e
        public /* bridge */ /* synthetic */ Pair j(com.max.hbcommon.base.adapter.g gVar, com.max.hbcommon.base.adapter.s sVar, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar, sVar, obj}, this, changeQuickRedirect, false, 36111, new Class[]{com.max.hbcommon.base.adapter.g.class, com.max.hbcommon.base.adapter.s.class, Object.class}, Pair.class);
            return patchProxyResultProxy.isSupported ? (Pair) patchProxyResultProxy.result : r(gVar, sVar, (RecommendBoardItem) obj);
        }

        @dl.e
        public Pair<com.max.hbcommon.base.adapter.l, RecyclerView> r(@dl.d com.max.hbcommon.base.adapter.g viewHolder, @dl.d com.max.hbcommon.base.adapter.s<?> adapter, @dl.d RecommendBoardItem data) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewHolder, adapter, data}, this, changeQuickRedirect, false, 36109, new Class[]{com.max.hbcommon.base.adapter.g.class, com.max.hbcommon.base.adapter.s.class, RecommendBoardItem.class}, Pair.class);
            if (patchProxyResultProxy.isSupported) {
                return (Pair) patchProxyResultProxy.result;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(adapter, "adapter");
            f0.p(data, "data");
            return viewHolder.x(this.f86239c, this, viewHolder, data);
        }

        public void s(@dl.d com.max.hbcommon.base.adapter.g viewHolder, @dl.d com.max.hbcommon.base.adapter.s<?> adapter, @dl.d RecommendBoardItem data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, adapter, data}, this, changeQuickRedirect, false, 36108, new Class[]{com.max.hbcommon.base.adapter.g.class, com.max.hbcommon.base.adapter.s.class, RecommendBoardItem.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(adapter, "adapter");
            f0.p(data, "data");
            viewHolder.itemView.setTag(data);
            viewHolder.v(this.f86239c, this, viewHolder, data);
        }
    }

    public q(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86233g = param;
    }

    @dl.d
    public static final ArrayList<RecommendBoardItem> x() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 36098, new Class[0], ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : f86229i.a();
    }

    @dl.d
    public static final ArrayList<RecommendBoardItem> z() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 36097, new Class[0], ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : f86229i.c();
    }

    public final void A(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 36092, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86233g = recommendVHBParam;
    }

    public final void B(@dl.d Context context, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d List<RecommendBoardItem> data) {
        if (PatchProxy.proxy(new Object[]{context, viewHolder, data}, this, changeQuickRedirect, false, 36094, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv_container);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new c(context));
        }
        e eVar = new e(context, data, recyclerView);
        eVar.q(data);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.clearOnScrollListeners();
        recyclerView.setOnFlingListener(null);
        new PagerSnapHelper().attachToRecyclerView(recyclerView);
        w wVar = new w(context, eVar, new d(context));
        wVar.J(-1);
        wVar.H(R.color.divider_secondary_2_color);
        recyclerView.setAdapter(wVar);
        wVar.notifyDataSetChanged();
        t(eVar);
        u(recyclerView);
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36093, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv_container);
        if (!(data instanceof RecommendBoardMultiObj) || f0.g(data, recyclerView.getTag(R.id.rv_container))) {
            return;
        }
        recyclerView.setTag(R.id.rv_container, data);
        List<RecommendBoardItem> items = ((RecommendBoardMultiObj) data).getItems();
        if (items != null) {
            B(this.f86233g.b(), viewHolder, items);
        }
        viewHolder.itemView.setTag(data);
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void h(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36095, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.h(viewHolder, data);
        if (data instanceof RecommendBoardMultiObj) {
            RecyclerView rv_container = (RecyclerView) viewHolder.i(R.id.rv_container);
            f0.o(rv_container, "rv_container");
            this.f86234h = new RecyclerViewItemWatcher<>(null, rv_container, new b((RecommendBoardMultiObj) data), 100, false);
        }
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void q() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36096, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.q();
        com.max.heybox.hblog.g.f74531b.q("RecommendBoardMultiVHB, onItemWholeExposure");
        RecyclerViewItemWatcher<w> recyclerViewItemWatcher = this.f86234h;
        if (recyclerViewItemWatcher != null) {
            recyclerViewItemWatcher.A();
        }
    }

    @dl.d
    public final RecommendVHBParam y() {
        return this.f86233g;
    }
}
