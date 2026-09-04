package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryResult;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import ng.j;
import yh.l;

/* JADX INFO: compiled from: TradeItemFavourListFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nTradeItemFavourListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeItemFavourListFragment.kt\ncom/max/xiaoheihe/module/trade/TradeItemFavourListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,332:1\n1#2:333\n*E\n"})
@o(parameters = 0)
public final class TradeItemFavourListFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f92931i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f92932j = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SmartRefreshLayout f92933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RecyclerView f92934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f92935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private TradeSteamInventoryResult f92936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final List<TradeSteamInventoryObj> f92937f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s<TradeSteamInventoryObj> f92938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private String f92939h;

    /* JADX INFO: compiled from: TradeItemFavourListFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final TradeItemFavourListFragment a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45307, new Class[0], TradeItemFavourListFragment.class);
            return patchProxyResultProxy.isSupported ? (TradeItemFavourListFragment) patchProxyResultProxy.result : new TradeItemFavourListFragment();
        }
    }

    /* JADX INFO: compiled from: TradeItemFavourListFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeSteamInventoryResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45309, new Class[0], Void.TYPE).isSupported && TradeItemFavourListFragment.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = TradeItemFavourListFragment.this.f92933b;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradeItemFavourListFragment.this.f92933b;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45308, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeItemFavourListFragment.this.isActive()) {
                super.onError(e10);
                TradeItemFavourListFragment.T3(TradeItemFavourListFragment.this);
                SmartRefreshLayout smartRefreshLayout = TradeItemFavourListFragment.this.f92933b;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradeItemFavourListFragment.this.f92933b;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<TradeSteamInventoryResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45310, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeItemFavourListFragment.this.isActive()) {
                TradeItemFavourListFragment.this.f92936e = result.getResult();
                TradeItemFavourListFragment.this.Z3();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45311, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSteamInventoryResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeItemFavourListFragment.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 45312, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradeItemFavourListFragment.M3(TradeItemFavourListFragment.this);
        }
    }

    /* JADX INFO: compiled from: TradeItemFavourListFragment.kt */
    public static final class d extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 45314, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(outRect, "outRect");
            f0.p(view, "view");
            f0.p(parent, "parent");
            f0.p(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int viewLayoutPosition = ((RecyclerView.LayoutParams) layoutParams).getViewLayoutPosition();
            if (viewLayoutPosition < 0) {
                outRect.set(0, 0, 0, 0);
            } else if (TradeItemFavourListFragment.Q3(TradeItemFavourListFragment.this, viewLayoutPosition)) {
                outRect.set(0, ViewUtils.f(((com.max.hbcommon.base.d) TradeItemFavourListFragment.this).mContext, 36.0f), 0, 0);
            } else {
                outRect.set(0, 0, 0, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(@dl.d Canvas c10, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{c10, parent, state}, this, changeQuickRedirect, false, 45313, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(c10, "c");
            f0.p(parent, "parent");
            f0.p(state, "state");
            super.onDraw(c10, parent, state);
            int paddingLeft = parent.getPaddingLeft();
            int width = parent.getWidth() - parent.getPaddingRight();
            int childCount = parent.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = parent.getChildAt(i10);
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                f0.n(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                int viewLayoutPosition = layoutParams2.getViewLayoutPosition();
                if (viewLayoutPosition >= 0 && TradeItemFavourListFragment.Q3(TradeItemFavourListFragment.this, viewLayoutPosition)) {
                    TradeItemFavourListFragment tradeItemFavourListFragment = TradeItemFavourListFragment.this;
                    f0.o(child, "child");
                    TradeItemFavourListFragment.L3(tradeItemFavourListFragment, c10, paddingLeft, width, child, layoutParams2, 0);
                }
            }
        }
    }

    /* JADX INFO: compiled from: TradeItemFavourListFragment.kt */
    public static final class e extends s<TradeSteamInventoryObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeItemFavourListFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeItemFavourListFragment f92944b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeSteamInventoryObj f92945c;

            a(TradeItemFavourListFragment tradeItemFavourListFragment, TradeSteamInventoryObj tradeSteamInventoryObj) {
                this.f92944b = tradeItemFavourListFragment;
                this.f92945c = tradeSteamInventoryObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45317, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity activity = ((com.max.hbcommon.base.d) this.f92944b).mContext;
                Activity mContext = ((com.max.hbcommon.base.d) this.f92944b).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(TradeInfoUtilKt.h(mContext, this.f92945c.getSpu_id()));
            }
        }

        /* JADX INFO: compiled from: TradeItemFavourListFragment.kt */
        @t0({"SMAP\nTradeItemFavourListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeItemFavourListFragment.kt\ncom/max/xiaoheihe/module/trade/TradeItemFavourListFragment$initView$3$onBindViewHolder$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,332:1\n1549#2:333\n1620#2,3:334\n*S KotlinDebug\n*F\n+ 1 TradeItemFavourListFragment.kt\ncom/max/xiaoheihe/module/trade/TradeItemFavourListFragment$initView$3$onBindViewHolder$2\n*L\n199#1:333\n199#1:334,3\n*E\n"})
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s.e f92946b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeItemFavourListFragment f92947c;

            b(s.e eVar, TradeItemFavourListFragment tradeItemFavourListFragment) {
                this.f92946b = eVar;
                this.f92947c = tradeItemFavourListFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45318, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                int adapterPosition = this.f92946b.getAdapterPosition();
                List list = this.f92947c.f92937f;
                ArrayList<String> arrayList = new ArrayList<>(t.Y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TradeSteamInventoryObj) it.next()).getSku_id());
                }
                Activity activity = ((com.max.hbcommon.base.d) this.f92947c).mContext;
                TradeItemSkuSlideActivity.a aVar = TradeItemSkuSlideActivity.X;
                Activity mContext = ((com.max.hbcommon.base.d) this.f92947c).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(aVar.a(mContext, arrayList, String.valueOf(adapterPosition), "0", null, 1));
            }
        }

        e(Activity activity, List<TradeSteamInventoryObj> list) {
            super(activity, list, R.layout.item_trade_favour);
        }

        public void m(@dl.d s.e viewHolder, @dl.d TradeSteamInventoryObj data) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 45315, new Class[]{s.e.class, TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            Activity mContext = ((com.max.hbcommon.base.d) TradeItemFavourListFragment.this).mContext;
            f0.o(mContext, "mContext");
            TradeInfoUtilKt.B(mContext, viewHolder, data, false, 8, null);
            Activity mContext2 = ((com.max.hbcommon.base.d) TradeItemFavourListFragment.this).mContext;
            f0.o(mContext2, "mContext");
            TradeInfoUtilKt.u(mContext2, viewHolder, data);
            Activity mContext3 = ((com.max.hbcommon.base.d) TradeItemFavourListFragment.this).mContext;
            f0.o(mContext3, "mContext");
            TradeInfoUtilKt.z(mContext3, viewHolder, data, true);
            TradeInfoUtilKt.t(viewHolder, data);
            TextView textView = (TextView) viewHolder.i(R.id.tv_trade_price);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_price_symbol);
            ConstraintLayout constraintLayout = (ConstraintLayout) viewHolder.i(R.id.cl_root);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_purchase);
            TextView textView4 = (TextView) viewHolder.i(R.id.tv_view);
            TextView textView5 = (TextView) viewHolder.i(R.id.tv_count);
            TextView textView6 = (TextView) viewHolder.i(R.id.tv_buy_state);
            ((ImageView) viewHolder.i(R.id.iv_item_bg)).setBackgroundResource(R.drawable.item_trade_sku_bg);
            bb.d.d(textView2, 5);
            bb.d.d(textView, 5);
            textView5.setVisibility(8);
            textView.setText(data.getPrice());
            if (data.getFloat_value() == null) {
                androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                cVar.H(constraintLayout);
                cVar.M0(R.id.vg_favour_info);
                cVar.K(R.id.vg_favour_info, 3, 0, 3);
                cVar.K(R.id.vg_favour_info, 4, 0, 4);
                cVar.r(constraintLayout);
            } else {
                androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
                cVar2.H(constraintLayout);
                cVar2.M0(R.id.vg_favour_info);
                cVar2.K(R.id.vg_favour_info, 3, R.id.tv_name, 3);
                cVar2.K(R.id.vg_favour_info, 4, R.id.vg_tag, 4);
                cVar2.r(constraintLayout);
            }
            if (f0.g("1", data.getBuy_state())) {
                textView6.setVisibility(8);
                textView3.setVisibility(0);
                textView4.setVisibility(8);
                TradeItemFavourListFragment.this.Y3(viewHolder, 1.0f);
            } else {
                textView6.setVisibility(0);
                textView3.setVisibility(8);
                String spu_id = data.getSpu_id();
                if (spu_id != null && spu_id.length() != 0) {
                    z10 = false;
                }
                if (z10) {
                    textView4.setVisibility(8);
                } else {
                    textView4.setVisibility(0);
                    textView4.setOnClickListener(new a(TradeItemFavourListFragment.this, data));
                }
                TradeItemFavourListFragment.this.Y3(viewHolder, 0.5f);
            }
            viewHolder.itemView.setOnClickListener(new b(viewHolder, TradeItemFavourListFragment.this));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, TradeSteamInventoryObj tradeSteamInventoryObj) {
            if (PatchProxy.proxy(new Object[]{eVar, tradeSteamInventoryObj}, this, changeQuickRedirect, false, 45316, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, tradeSteamInventoryObj);
        }
    }

    public static final /* synthetic */ void L3(TradeItemFavourListFragment tradeItemFavourListFragment, Canvas canvas, int i10, int i11, View view, RecyclerView.LayoutParams layoutParams, int i12) {
        Object[] objArr = {tradeItemFavourListFragment, canvas, new Integer(i10), new Integer(i11), view, layoutParams, new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 45305, new Class[]{TradeItemFavourListFragment.class, Canvas.class, cls, cls, View.class, RecyclerView.LayoutParams.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        tradeItemFavourListFragment.U3(canvas, i10, i11, view, layoutParams, i12);
    }

    public static final /* synthetic */ void M3(TradeItemFavourListFragment tradeItemFavourListFragment) {
        if (PatchProxy.proxy(new Object[]{tradeItemFavourListFragment}, null, changeQuickRedirect, true, 45303, new Class[]{TradeItemFavourListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeItemFavourListFragment.V3();
    }

    public static final /* synthetic */ boolean Q3(TradeItemFavourListFragment tradeItemFavourListFragment, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeItemFavourListFragment, new Integer(i10)}, null, changeQuickRedirect, true, 45304, new Class[]{TradeItemFavourListFragment.class, Integer.TYPE}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : tradeItemFavourListFragment.X3(i10);
    }

    public static final /* synthetic */ void T3(TradeItemFavourListFragment tradeItemFavourListFragment) {
        if (PatchProxy.proxy(new Object[]{tradeItemFavourListFragment}, null, changeQuickRedirect, true, 45306, new Class[]{TradeItemFavourListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeItemFavourListFragment.showError();
    }

    private final void U3(Canvas canvas, int i10, int i11, View view, RecyclerView.LayoutParams layoutParams, int i12) {
        Object[] objArr = {canvas, new Integer(i10), new Integer(i11), view, layoutParams, new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45298, new Class[]{Canvas.class, cls, cls, View.class, RecyclerView.LayoutParams.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        int iF = ViewUtils.f(this.mContext, 12.0f);
        Paint paint = new Paint();
        int top = view.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        float f10 = ViewUtils.f(this.mContext, 4.0f);
        float f11 = ViewUtils.f(this.mContext, 36.0f);
        paint.setAntiAlias(true);
        paint.setColor(com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_2_color));
        float f12 = i10;
        float f13 = top;
        float f14 = f13 - f11;
        float f15 = i11;
        float f16 = f14 + f10;
        canvas.drawRect(f12, f14, f15, f16, paint);
        paint.setColor(com.max.xiaoheihe.utils.d.E(R.color.transparent));
        canvas.drawRect(f12, f16, f15, f13, paint);
        paint.setColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
        paint.setTextSize(com.max.xiaoheihe.utils.d.V(R.dimen.text_size_14));
        paint.getTextBounds("失效单品", 0, 4, new Rect());
        canvas.drawText("失效单品", view.getPaddingLeft() + iF, (view.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - paint.descent(), paint);
    }

    private final void V3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45297, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.f92939h;
        addDisposable((io.reactivex.disposables.b) i.a().y1("sku", str == null || str.length() == 0 ? null : this.f92939h).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void W3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45296, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.f92933b;
        s<TradeSteamInventoryObj> sVar = null;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new c());
        SmartRefreshLayout smartRefreshLayout2 = this.f92933b;
        if (smartRefreshLayout2 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.b0(false);
        RecyclerView recyclerView = this.f92934c;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        RecyclerView recyclerView2 = this.f92934c;
        if (recyclerView2 == null) {
            f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setBackgroundResource(R.color.background_layer_2_color);
        RecyclerView recyclerView3 = this.f92934c;
        if (recyclerView3 == null) {
            f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        recyclerView3.addItemDecoration(new d());
        this.f92938g = new e(this.mContext, this.f92937f);
        RecyclerView recyclerView4 = this.f92934c;
        if (recyclerView4 == null) {
            f0.S("mRecyclerView");
            recyclerView4 = null;
        }
        s<TradeSteamInventoryObj> sVar2 = this.f92938g;
        if (sVar2 == null) {
            f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        recyclerView4.setAdapter(sVar);
    }

    private final boolean X3(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45295, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f92937f.size() <= 1) {
            return false;
        }
        return (i10 <= 0 || this.f92937f.get(i10).getBuy_state() == null || f0.g(this.f92937f.get(i10).getBuy_state(), this.f92937f.get(i10 - 1).getBuy_state())) ? false : true;
    }

    private final void a4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45302, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        View view = this.f92935d;
        View view2 = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(0);
        View view3 = this.f92935d;
        if (view3 == null) {
            f0.S("vg_invntory_empty");
            view3 = null;
        }
        View viewFindViewById = view3.findViewById(R.id.iv_empty);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        View view4 = this.f92935d;
        if (view4 == null) {
            f0.S("vg_invntory_empty");
        } else {
            view2 = view4;
        }
        View viewFindViewById2 = view2.findViewById(R.id.tv_empty);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        imageView.setImageResource(R.drawable.common_tag_favour_46x45);
        ((TextView) viewFindViewById2).setText("暂无收藏品类");
    }

    public final void Y3(@dl.d s.e viewHolder, float f10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Float(f10)}, this, changeQuickRedirect, false, 45301, new Class[]{s.e.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        View viewI = viewHolder.i(R.id.tv_float_value);
        if (viewI != null) {
            viewI.setAlpha(f10);
        }
        View viewI2 = viewHolder.i(R.id.v_float_bar);
        if (viewI2 != null) {
            viewI2.setAlpha(f10);
        }
        View viewI3 = viewHolder.i(R.id.v_float_cursor);
        if (viewI3 != null) {
            viewI3.setAlpha(f10);
        }
        View viewI4 = viewHolder.i(R.id.vg_stickers);
        if (viewI4 != null) {
            viewI4.setAlpha(f10);
        }
        View viewI5 = viewHolder.i(R.id.vg_tag);
        if (viewI5 != null) {
            viewI5.setAlpha(f10);
        }
        View viewI6 = viewHolder.i(R.id.tv_name);
        if (viewI6 != null) {
            viewI6.setAlpha(f10);
        }
        View viewI7 = viewHolder.i(R.id.tv_trade_price);
        if (viewI7 != null) {
            viewI7.setAlpha(f10);
        }
        View viewI8 = viewHolder.i(R.id.tv_price_symbol);
        if (viewI8 == null) {
            return;
        }
        viewI8.setAlpha(f10);
    }

    public final void Z3() {
        ArrayList<TradeSteamInventoryObj> invalid_list;
        ArrayList<TradeSteamInventoryObj> valid_list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45300, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        this.f92937f.clear();
        TradeSteamInventoryResult tradeSteamInventoryResult = this.f92936e;
        if (tradeSteamInventoryResult != null && (valid_list = tradeSteamInventoryResult.getValid_list()) != null) {
            this.f92937f.addAll(valid_list);
        }
        TradeSteamInventoryResult tradeSteamInventoryResult2 = this.f92936e;
        if (tradeSteamInventoryResult2 != null && (invalid_list = tradeSteamInventoryResult2.getInvalid_list()) != null) {
            this.f92937f.addAll(invalid_list);
        }
        List<TradeSteamInventoryObj> list = this.f92937f;
        if (list == null || list.isEmpty()) {
            a4();
            return;
        }
        View view = this.f92935d;
        s<TradeSteamInventoryObj> sVar = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(8);
        s<TradeSteamInventoryObj> sVar2 = this.f92938g;
        if (sVar2 == null) {
            f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        sVar.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View rootView) {
        if (PatchProxy.proxy(new Object[]{rootView}, this, changeQuickRedirect, false, 45294, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootView, "rootView");
        setContentView(R.layout.fragment_item_wait_deliver);
        View viewFindViewById = rootView.findViewById(R.id.srl);
        f0.o(viewFindViewById, "rootView.findViewById(R.id.srl)");
        this.f92933b = (SmartRefreshLayout) viewFindViewById;
        View viewFindViewById2 = rootView.findViewById(R.id.rv);
        f0.o(viewFindViewById2, "rootView.findViewById(R.id.rv)");
        this.f92934c = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = rootView.findViewById(R.id.vg_invntory_empty);
        f0.o(viewFindViewById3, "rootView.findViewById(R.id.vg_invntory_empty)");
        this.f92935d = viewFindViewById3;
        TradeInfoUtilKt.m(rootView, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeItemFavourListFragment.installViews.1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45320, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45319, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                TradeItemFavourListFragment.M3(TradeItemFavourListFragment.this);
            }
        }, new l<String, b2>() { // from class: com.max.xiaoheihe.module.trade.TradeItemFavourListFragment.installViews.2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45322, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(str);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d String q10) {
                if (PatchProxy.proxy(new Object[]{q10}, this, changeQuickRedirect, false, 45321, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(q10, "q");
                TradeItemFavourListFragment.this.f92939h = q10;
            }
        });
        EditText editText = (EditText) rootView.findViewById(R.id.et_item_search);
        if (editText != null) {
            editText.setHint("搜索当前关注饰品");
        }
        W3();
        showLoading();
        V3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45299, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        V3();
    }
}
