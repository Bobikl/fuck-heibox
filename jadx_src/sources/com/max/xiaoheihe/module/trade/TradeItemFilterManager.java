package com.max.xiaoheihe.module.trade;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbcommon.bean.TabEntity;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.i;
import com.max.hbcommon.component.segmentfilters.SegmentFilterSelected;
import com.max.hbcommon.utils.j;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.trade.TradeFilterItemObj;
import com.max.xiaoheihe.bean.trade.TradeFilterObj;
import com.max.xiaoheihe.bean.trade.TradeFilterTabObj;
import com.max.xiaoheihe.bean.trade.TradePageFilterWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: TradeItemFilterManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nTradeItemFilterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeItemFilterManager.kt\ncom/max/xiaoheihe/module/trade/TradeItemFilterManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,506:1\n1855#2:507\n1855#2,2:508\n1856#2:510\n*S KotlinDebug\n*F\n+ 1 TradeItemFilterManager.kt\ncom/max/xiaoheihe/module/trade/TradeItemFilterManager\n*L\n171#1:507\n175#1:508,2\n171#1:510\n*E\n"})
@o(parameters = 0)
public final class TradeItemFilterManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f92950i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f92951j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private Context f92952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private b f92953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private i f92954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private View f92955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private SegmentFilterSelected f92956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u<TradeFilterObj> f92957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private TradePageFilterWrapper f92958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private ArrayList<TradeFilterTabObj> f92959h;

    /* JADX INFO: compiled from: TradeItemFilterManager.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.trade.TradeItemFilterManager$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TradeItemFilterManager.kt */
        public static final class ViewOnClickListenerC0870a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradePageFilterWrapper f92960b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f92961c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f92962d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ SegmentFilterSelected f92963e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ yh.a<b2> f92964f;

            ViewOnClickListenerC0870a(TradePageFilterWrapper tradePageFilterWrapper, b bVar, Context context, SegmentFilterSelected segmentFilterSelected, yh.a<b2> aVar) {
                this.f92960b = tradePageFilterWrapper;
                this.f92961c = bVar;
                this.f92962d = context;
                this.f92963e = segmentFilterSelected;
                this.f92964f = aVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<TradeFilterItemObj> list;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45329, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                for (String str : this.f92960b.getFilterMap().keySet()) {
                    b bVar = this.f92961c;
                    if (!f0.g(bVar != null ? bVar.z1() : null, str) && (list = this.f92960b.getFilterMap().get(str)) != null) {
                        list.clear();
                    }
                }
                this.f92960b.setMinPrice("");
                this.f92960b.setMaxPrice("");
                TradeItemFilterManager.f92950i.a(this.f92962d, this.f92963e, this.f92960b, this.f92961c, this.f92964f);
                this.f92964f.invoke();
            }
        }

        /* JADX INFO: compiled from: TradeItemFilterManager.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f92965b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f92966c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ TradePageFilterWrapper f92967d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ TradeFilterItemObj f92968e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Context f92969f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ SegmentFilterSelected f92970g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ yh.a<b2> f92971h;

            b(b bVar, String str, TradePageFilterWrapper tradePageFilterWrapper, TradeFilterItemObj tradeFilterItemObj, Context context, SegmentFilterSelected segmentFilterSelected, yh.a<b2> aVar) {
                this.f92965b = bVar;
                this.f92966c = str;
                this.f92967d = tradePageFilterWrapper;
                this.f92968e = tradeFilterItemObj;
                this.f92969f = context;
                this.f92970g = segmentFilterSelected;
                this.f92971h = aVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45330, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                b bVar = this.f92965b;
                if (f0.g(bVar != null ? bVar.z1() : null, this.f92966c)) {
                    return;
                }
                List<TradeFilterItemObj> list = this.f92967d.getFilterMap().get(this.f92966c);
                f0.m(list);
                list.remove(this.f92968e);
                TradeItemFilterManager.f92950i.a(this.f92969f, this.f92970g, this.f92967d, this.f92965b, this.f92971h);
                this.f92971h.invoke();
            }
        }

        /* JADX INFO: compiled from: TradeItemFilterManager.kt */
        public static final class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradePageFilterWrapper f92972b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f92973c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ SegmentFilterSelected f92974d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f92975e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ yh.a<b2> f92976f;

            c(TradePageFilterWrapper tradePageFilterWrapper, Context context, SegmentFilterSelected segmentFilterSelected, b bVar, yh.a<b2> aVar) {
                this.f92972b = tradePageFilterWrapper;
                this.f92973c = context;
                this.f92974d = segmentFilterSelected;
                this.f92975e = bVar;
                this.f92976f = aVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45331, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f92972b.setMinPrice("");
                this.f92972b.setMaxPrice("");
                TradeItemFilterManager.f92950i.a(this.f92973c, this.f92974d, this.f92972b, this.f92975e, this.f92976f);
                this.f92976f.invoke();
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final void a(@dl.d Context mContext, @dl.d SegmentFilterSelected filter_selected, @dl.d TradePageFilterWrapper filterInfo, @dl.e b bVar, @dl.d yh.a<b2> refreshAction) {
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{mContext, filter_selected, filterInfo, bVar, refreshAction}, this, changeQuickRedirect, false, 45328, new Class[]{Context.class, SegmentFilterSelected.class, TradePageFilterWrapper.class, b.class, yh.a.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(mContext, "mContext");
            f0.p(filter_selected, "filter_selected");
            f0.p(filterInfo, "filterInfo");
            f0.p(refreshAction, "refreshAction");
            filter_selected.i();
            for (String str : filterInfo.getFilterMap().keySet()) {
                List<TradeFilterItemObj> list = filterInfo.getFilterMap().get(str);
                if (!((list == null || list.isEmpty()) ? true : z10)) {
                    List<TradeFilterItemObj> list2 = filterInfo.getFilterMap().get(str);
                    f0.m(list2);
                    for (TradeFilterItemObj tradeFilterItemObj : list2) {
                        String desc_in_hsv = tradeFilterItemObj.getDesc_in_hsv();
                        filter_selected.e((desc_in_hsv == null || desc_in_hsv.length() == 0) ? true : z10 ? tradeFilterItemObj.getDesc() : tradeFilterItemObj.getDesc_in_hsv(), new b(bVar, str, filterInfo, tradeFilterItemObj, mContext, filter_selected, refreshAction), !f0.g(bVar != null ? bVar.z1() : null, str));
                        z10 = false;
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            if (n.o(filterInfo.getMinPrice()) > 0.0d && n.o(filterInfo.getMaxPrice()) > 0.0d) {
                sb2.append(filterInfo.getMinPrice() + "元-" + filterInfo.getMaxPrice() + (char) 20803);
            } else if (n.o(filterInfo.getMinPrice()) > 0.0d) {
                sb2.append(">=" + filterInfo.getMinPrice() + (char) 20803);
            } else if (n.o(filterInfo.getMaxPrice()) > 0.0d) {
                sb2.append("<=" + filterInfo.getMaxPrice() + (char) 20803);
            }
            if (sb2.length() > 0) {
                SegmentFilterSelected.f(filter_selected, sb2.toString(), new c(filterInfo, mContext, filter_selected, bVar, refreshAction), false, 4, null);
            }
            filter_selected.setResetClickListener(new ViewOnClickListenerC0870a(filterInfo, bVar, mContext, filter_selected, refreshAction));
            filter_selected.j();
        }
    }

    /* JADX INFO: compiled from: TradeItemFilterManager.kt */
    public interface b {

        /* JADX INFO: compiled from: TradeItemFilterManager.kt */
        public static final class a {
            public static ChangeQuickRedirect changeQuickRedirect;

            @dl.d
            public static String a(@dl.d b bVar) {
                return "";
            }
        }

        @dl.d
        TradePageFilterWrapper H3();

        void n2(@dl.d TradePageFilterWrapper tradePageFilterWrapper);

        @dl.e
        ArrayList<TradeFilterTabObj> n3();

        @dl.d
        String z1();
    }

    /* JADX INFO: compiled from: TradeItemFilterManager.kt */
    public static final class c implements OnTabSelectListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<ArrayList<TradeFilterObj>> f92978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<RecyclerView> f92979c;

        c(Ref.ObjectRef<ArrayList<TradeFilterObj>> objectRef, Ref.ObjectRef<RecyclerView> objectRef2) {
            this.f92978b = objectRef;
            this.f92979c = objectRef2;
        }

        @Override // com.flyco.tablayout.listener.OnTabSelectListener
        public void onTabReselect(int i10) {
        }

        @Override // com.flyco.tablayout.listener.OnTabSelectListener
        public void onTabSelect(int i10) {
            TradeFilterTabObj tradeFilterTabObj;
            int i11 = 0;
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45350, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ArrayList arrayList = TradeItemFilterManager.this.f92959h;
            String key = (arrayList == null || (tradeFilterTabObj = (TradeFilterTabObj) arrayList.get(i10)) == null) ? null : tradeFilterTabObj.getKey();
            Iterator<TradeFilterObj> it = this.f92978b.f124891b.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int i13 = i12 + 1;
                if (f0.g(it.next().getKey(), key)) {
                    i11 = i12;
                    break;
                }
                i12 = i13;
            }
            RecyclerView recyclerView = this.f92979c.f124891b;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(i11);
            }
        }
    }

    /* JADX INFO: compiled from: TradeItemFilterManager.kt */
    public static final class d extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<ArrayList<TradeFilterObj>> f92980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TradeItemFilterManager f92981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<CommonTabLayout> f92982d;

        d(Ref.ObjectRef<ArrayList<TradeFilterObj>> objectRef, TradeItemFilterManager tradeItemFilterManager, Ref.ObjectRef<CommonTabLayout> objectRef2) {
            this.f92980b = objectRef;
            this.f92981c = tradeItemFilterManager;
            this.f92982d = objectRef2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            TradeFilterObj tradeFilterObj;
            int i12 = 0;
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45351, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
            if (iFindFirstCompletelyVisibleItemPosition < 0 || iFindFirstCompletelyVisibleItemPosition > this.f92980b.f124891b.size() - 1) {
                return;
            }
            ArrayList<TradeFilterObj> arrayList = this.f92980b.f124891b;
            String key = (arrayList == null || (tradeFilterObj = arrayList.get(iFindFirstCompletelyVisibleItemPosition)) == null) ? null : tradeFilterObj.getKey();
            ArrayList arrayList2 = this.f92981c.f92959h;
            f0.m(arrayList2);
            Iterator it = arrayList2.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                int i14 = i13 + 1;
                if (f0.g(((TradeFilterTabObj) it.next()).getKey(), key)) {
                    i12 = i13;
                    break;
                }
                i13 = i14;
            }
            CommonTabLayout commonTabLayout = this.f92982d.f124891b;
            if (commonTabLayout == null) {
                return;
            }
            commonTabLayout.setCurrentTab(i12);
        }
    }

    /* JADX INFO: compiled from: TradeItemFilterManager.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45352, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.v(TradeItemFilterManager.this.f92958g.getMinPrice(), TradeItemFilterManager.this.f92958g.getMaxPrice()) && n.o(TradeItemFilterManager.this.f92958g.getMinPrice()) > n.o(TradeItemFilterManager.this.f92958g.getMaxPrice())) {
                com.max.hbutils.utils.c.f("非法的价格区间");
                return;
            }
            TradeItemFilterManager.this.g().n2(TradeItemFilterManager.this.f92958g);
            i iVar = TradeItemFilterManager.this.f92954c;
            if (iVar != null) {
                iVar.dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: TradeItemFilterManager.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            i iVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45356, new Class[]{View.class}, Void.TYPE).isSupported || (iVar = TradeItemFilterManager.this.f92954c) == null) {
                return;
            }
            iVar.dismiss();
        }
    }

    public TradeItemFilterManager(@dl.d Context mContext, @dl.d b mListener) {
        f0.p(mContext, "mContext");
        f0.p(mListener, "mListener");
        this.f92952a = mContext;
        this.f92953b = mListener;
        this.f92958g = new TradePageFilterWrapper(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.util.ArrayList] */
    private final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45326, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        View view = this.f92955d;
        objectRef.f124891b = view != null ? (CommonTabLayout) view.findViewById(R.id.tab) : 0;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        View view2 = this.f92955d;
        objectRef2.f124891b = view2 != null ? (RecyclerView) view2.findViewById(R.id.rv) : 0;
        View view3 = this.f92955d;
        BottomButtonLeftItemView bottomButtonLeftItemView = view3 != null ? (BottomButtonLeftItemView) view3.findViewById(R.id.bottom_button) : null;
        View view4 = this.f92955d;
        TextView textView = view4 != null ? (TextView) view4.findViewById(R.id.tv_reset_btn) : null;
        RecyclerView recyclerView = (RecyclerView) objectRef2.f124891b;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f92952a));
        }
        RecyclerView recyclerView2 = (RecyclerView) objectRef2.f124891b;
        if (recyclerView2 != null) {
            recyclerView2.setPadding(0, 0, 0, ViewUtils.f(this.f92952a, 4.0f));
        }
        RecyclerView recyclerView3 = (RecyclerView) objectRef2.f124891b;
        if (recyclerView3 != null) {
            recyclerView3.setClipToPadding(false);
        }
        RecyclerView recyclerView4 = (RecyclerView) objectRef2.f124891b;
        if (recyclerView4 != null) {
            recyclerView4.setClipChildren(false);
        }
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.f124891b = new ArrayList();
        ArrayList<TradeFilterTabObj> arrayListN3 = this.f92953b.n3();
        this.f92959h = arrayListN3;
        if (arrayListN3 == null || arrayListN3.isEmpty()) {
            return;
        }
        ArrayList<TradeFilterTabObj> arrayList = this.f92959h;
        if (arrayList != null) {
            for (TradeFilterTabObj tradeFilterTabObj : arrayList) {
                if (f0.g(tradeFilterTabObj.getKey(), "price_range")) {
                    ((ArrayList) objectRef3.f124891b).add(new TradeFilterObj(null, "price_range", null, null, null));
                } else {
                    for (TradeFilterObj tradeFilterObj : tradeFilterTabObj.getList()) {
                        tradeFilterObj.setKey(tradeFilterTabObj.getKey());
                        String desc = tradeFilterObj.getDesc();
                        if (desc == null || desc.length() == 0) {
                            tradeFilterObj.setDesc(tradeFilterTabObj.getDesc());
                        }
                    }
                    ((ArrayList) objectRef3.f124891b).addAll(tradeFilterTabObj.getList());
                }
            }
        }
        final Context context = this.f92952a;
        u<TradeFilterObj> uVar = new u<TradeFilterObj>(objectRef3, this, context) { // from class: com.max.xiaoheihe.module.trade.TradeItemFilterManager$initFilterContentView$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeItemFilterManager f92985b;

            /* JADX INFO: compiled from: TradeItemFilterManager.kt */
            public static final class a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef<View> f92986b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ TradeFilterObj f92987c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef<ArrayList<TradeFilterItemObj>> f92988d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef<TradeItemFilterManager$initFilterContentView$2$onBindViewHolder$adapter$1> f92989e;

                a(Ref.ObjectRef<View> objectRef, TradeFilterObj tradeFilterObj, Ref.ObjectRef<ArrayList<TradeFilterItemObj>> objectRef2, Ref.ObjectRef<TradeItemFilterManager$initFilterContentView$2$onBindViewHolder$adapter$1> objectRef3) {
                    this.f92986b = objectRef;
                    this.f92987c = tradeFilterObj;
                    this.f92988d = objectRef2;
                    this.f92989e = objectRef3;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45338, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    if (this.f92986b.f124891b.getRotation() == 90.0f) {
                        this.f92986b.f124891b.setRotation(270.0f);
                        ArrayList<TradeFilterItemObj> list = this.f92987c.getList();
                        f0.m(list);
                        if (list.size() <= 3) {
                            return;
                        }
                        this.f92988d.f124891b.clear();
                        ArrayList<TradeFilterItemObj> arrayList = this.f92988d.f124891b;
                        ArrayList<TradeFilterItemObj> list2 = this.f92987c.getList();
                        f0.m(list2);
                        arrayList.addAll(list2);
                        TradeItemFilterManager$initFilterContentView$2$onBindViewHolder$adapter$1 tradeItemFilterManager$initFilterContentView$2$onBindViewHolder$adapter$1 = this.f92989e.f124891b;
                        ArrayList<TradeFilterItemObj> list3 = this.f92987c.getList();
                        f0.m(list3);
                        tradeItemFilterManager$initFilterContentView$2$onBindViewHolder$adapter$1.notifyItemRangeInserted(3, list3.size() - 1);
                        return;
                    }
                    this.f92986b.f124891b.setRotation(90.0f);
                    ArrayList<TradeFilterItemObj> list4 = this.f92987c.getList();
                    f0.m(list4);
                    if (list4.size() <= 3) {
                        return;
                    }
                    this.f92988d.f124891b.clear();
                    ArrayList<TradeFilterItemObj> arrayList2 = this.f92988d.f124891b;
                    ArrayList<TradeFilterItemObj> list5 = this.f92987c.getList();
                    f0.m(list5);
                    ArrayList<TradeFilterItemObj> list6 = this.f92987c.getList();
                    f0.m(list6);
                    arrayList2.addAll(list5.subList(0, Math.min(list6.size(), 3)));
                    TradeItemFilterManager$initFilterContentView$2$onBindViewHolder$adapter$1 tradeItemFilterManager$initFilterContentView$2$onBindViewHolder$adapter$2 = this.f92989e.f124891b;
                    ArrayList<TradeFilterItemObj> list7 = this.f92987c.getList();
                    f0.m(list7);
                    tradeItemFilterManager$initFilterContentView$2$onBindViewHolder$adapter$2.notifyItemRangeRemoved(3, list7.size() - 1);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, objectRef3.f124891b);
                this.f92985b = this;
            }

            @Override // com.max.hbcommon.base.adapter.u
            public /* bridge */ /* synthetic */ int m(int i10, TradeFilterObj tradeFilterObj2) {
                Object[] objArr = {new Integer(i10), tradeFilterObj2};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45337, new Class[]{cls, Object.class}, cls);
                return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, tradeFilterObj2);
            }

            public int n(int i10, @dl.d TradeFilterObj data) {
                Object[] objArr = {new Integer(i10), data};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45334, new Class[]{cls, TradeFilterObj.class}, cls);
                if (patchProxyResultProxy.isSupported) {
                    return ((Integer) patchProxyResultProxy.result).intValue();
                }
                f0.p(data, "data");
                return f0.g(data.getSub_cat(), "price_range") ? R.layout.item_trade_filter_price_range : R.layout.item_trade_filter_category;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v1, types: [T, android.view.View] */
            /* JADX WARN: Type inference failed for: r3v8, types: [T, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v3, types: [T, com.max.xiaoheihe.module.trade.TradeItemFilterManager$initFilterContentView$2$onBindViewHolder$adapter$1] */
            public void o(@dl.d s.e viewHolder, @dl.d final TradeFilterObj data) {
                if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 45333, new Class[]{s.e.class, TradeFilterObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(viewHolder, "viewHolder");
                f0.p(data, "data");
                if (viewHolder.d() == R.layout.item_trade_filter_price_range) {
                    View viewI = viewHolder.i(R.id.et_min_price);
                    View viewI2 = viewHolder.i(R.id.et_max_price);
                    EditText editText = (EditText) viewI;
                    if (editText != null) {
                        editText.setFilters(new InputFilter[]{new j(100000000L)});
                    }
                    EditText editText2 = (EditText) viewI2;
                    if (editText2 != null) {
                        editText2.setFilters(new InputFilter[]{new j(100000000L)});
                    }
                    String minPrice = this.f92985b.f92958g.getMinPrice();
                    if (minPrice != null) {
                        editText.setText(minPrice);
                    }
                    String maxPrice = this.f92985b.f92958g.getMaxPrice();
                    if (maxPrice != null) {
                        editText2.setText(maxPrice);
                        return;
                    }
                    return;
                }
                TextView textView2 = (TextView) viewHolder.i(R.id.tv_gourp_name);
                RecyclerView recyclerView5 = (RecyclerView) viewHolder.i(R.id.rv_filter);
                Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                objectRef4.f124891b = viewHolder.i(R.id.vg_arrow);
                boolean zG = f0.g(data.getShow(), "all");
                if (zG) {
                    ((View) objectRef4.f124891b).setRotation(270.0f);
                } else {
                    ((View) objectRef4.f124891b).setRotation(90.0f);
                }
                textView2.setText(data.getDesc());
                recyclerView5.setLayoutManager(new GridLayoutManager(this.f92985b.f(), 3));
                final Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                objectRef5.f124891b = new ArrayList();
                ArrayList<TradeFilterItemObj> list = data.getList();
                f0.m(list);
                if (list.size() <= 3 || zG) {
                    ArrayList arrayList2 = (ArrayList) objectRef5.f124891b;
                    ArrayList<TradeFilterItemObj> list2 = data.getList();
                    f0.m(list2);
                    arrayList2.addAll(list2);
                } else {
                    ArrayList arrayList3 = (ArrayList) objectRef5.f124891b;
                    ArrayList<TradeFilterItemObj> list3 = data.getList();
                    f0.m(list3);
                    ArrayList<TradeFilterItemObj> list4 = data.getList();
                    f0.m(list4);
                    arrayList3.addAll(list3.subList(0, Math.min(list4.size(), 3)));
                }
                Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                final Context contextF = this.f92985b.f();
                final TradeItemFilterManager tradeItemFilterManager = this.f92985b;
                ?? r10 = new s<TradeFilterItemObj>(objectRef5, data, tradeItemFilterManager, contextF) { // from class: com.max.xiaoheihe.module.trade.TradeItemFilterManager$initFilterContentView$2$onBindViewHolder$adapter$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ TradeFilterObj f92990b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ TradeItemFilterManager f92991c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(contextF, objectRef5.f124891b, R.layout.item_trade_filter_item);
                        this.f92990b = data;
                        this.f92991c = tradeItemFilterManager;
                    }

                    /* JADX WARN: Type inference failed for: r3v5, types: [T, java.lang.String] */
                    public void m(@dl.d s.e viewHolder2, @dl.d final TradeFilterItemObj keydesc) {
                        boolean z10 = false;
                        if (PatchProxy.proxy(new Object[]{viewHolder2, keydesc}, this, changeQuickRedirect, false, 45339, new Class[]{s.e.class, TradeFilterItemObj.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(viewHolder2, "viewHolder");
                        f0.p(keydesc, "keydesc");
                        TextView textView3 = (TextView) viewHolder2.i(R.id.tv_item_name);
                        View viewI3 = viewHolder2.i(R.id.vg_filter_item);
                        ImageView imageView = (ImageView) viewHolder2.i(R.id.iv_icon);
                        if (com.max.hbcommon.utils.c.u(keydesc.getImg())) {
                            imageView.setVisibility(8);
                        } else {
                            imageView.setVisibility(0);
                            com.max.hbimage.b.K(keydesc.getImg(), imageView);
                        }
                        final Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                        objectRef7.f124891b = this.f92990b.getKey();
                        List<TradeFilterItemObj> list5 = this.f92991c.f92958g.getFilterMap().get(objectRef7.f124891b);
                        if (list5 != null && list5.contains(keydesc)) {
                            z10 = true;
                        }
                        if (z10) {
                            textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                            viewI3.setBackgroundDrawable(q.M(q.o(this.f92991c.f(), R.color.divider_color, 2.0f), this.f92991c.f(), R.color.text_primary_2_color, 1.0f));
                        } else {
                            viewI3.setBackgroundDrawable(q.o(this.f92991c.f(), R.color.divider_secondary_1_color, 2.0f));
                            textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
                        }
                        textView3.setText(keydesc.getDesc());
                        View view5 = viewHolder2.itemView;
                        final TradeItemFilterManager tradeItemFilterManager2 = this.f92991c;
                        final TradeFilterObj tradeFilterObj2 = this.f92990b;
                        view5.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.trade.TradeItemFilterManager$initFilterContentView$2$onBindViewHolder$adapter$1$onBindViewHolder$1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view6) {
                                List<TradeFilterItemObj> list6;
                                List<TradeFilterItemObj> list7;
                                if (PatchProxy.proxy(new Object[]{view6}, this, changeQuickRedirect, false, 45341, new Class[]{View.class}, Void.TYPE).isSupported) {
                                    return;
                                }
                                List<TradeFilterItemObj> list8 = tradeItemFilterManager2.f92958g.getFilterMap().get(objectRef7.f124891b);
                                if (list8 != null && list8.contains(keydesc)) {
                                    if (f0.g(tradeItemFilterManager2.g().z1(), objectRef7.f124891b)) {
                                        List<TradeFilterItemObj> list9 = tradeItemFilterManager2.f92958g.getFilterMap().get(objectRef7.f124891b);
                                        if (list9 != null && list9.size() == 1) {
                                            return;
                                        }
                                    }
                                    List<TradeFilterItemObj> list10 = tradeItemFilterManager2.f92958g.getFilterMap().get(objectRef7.f124891b);
                                    if (list10 != null) {
                                        list10.remove(keydesc);
                                    }
                                } else {
                                    if (StringsKt__StringsKt.W2(keydesc.getValue(), "all_", false, 2, null) || f0.g(tradeItemFilterManager2.g().z1(), objectRef7.f124891b)) {
                                        ArrayList<TradeFilterItemObj> list11 = tradeFilterObj2.getList();
                                        if (list11 != null) {
                                            TradeItemFilterManager tradeItemFilterManager3 = tradeItemFilterManager2;
                                            Ref.ObjectRef<String> objectRef8 = objectRef7;
                                            for (TradeFilterItemObj tradeFilterItemObj : list11) {
                                                List<TradeFilterItemObj> list12 = tradeItemFilterManager3.f92958g.getFilterMap().get(objectRef8.f124891b);
                                                if ((list12 != null && list12.contains(tradeFilterItemObj)) && (list6 = tradeItemFilterManager3.f92958g.getFilterMap().get(objectRef8.f124891b)) != null) {
                                                    list6.remove(tradeFilterItemObj);
                                                }
                                            }
                                        }
                                    } else {
                                        ArrayList<TradeFilterItemObj> list13 = tradeFilterObj2.getList();
                                        if (list13 != null) {
                                            TradeItemFilterManager tradeItemFilterManager4 = tradeItemFilterManager2;
                                            Ref.ObjectRef<String> objectRef9 = objectRef7;
                                            for (TradeFilterItemObj tradeFilterItemObj2 : list13) {
                                                if (StringsKt__StringsKt.W2(tradeFilterItemObj2.getValue(), "all_", false, 2, null)) {
                                                    List<TradeFilterItemObj> list14 = tradeItemFilterManager4.f92958g.getFilterMap().get(objectRef9.f124891b);
                                                    if ((list14 != null && list14.contains(tradeFilterItemObj2)) && (list7 = tradeItemFilterManager4.f92958g.getFilterMap().get(objectRef9.f124891b)) != null) {
                                                        list7.remove(tradeFilterItemObj2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    Iterator<String> it = tradeItemFilterManager2.f92958g.getFilterMap().keySet().iterator();
                                    int size = 0;
                                    while (it.hasNext()) {
                                        List<TradeFilterItemObj> list15 = tradeItemFilterManager2.f92958g.getFilterMap().get(it.next());
                                        size += list15 != null ? list15.size() : 0;
                                    }
                                    if (size >= 10) {
                                        com.max.hbutils.utils.c.d("最多选择10项过滤");
                                        return;
                                    } else {
                                        List<TradeFilterItemObj> list16 = tradeItemFilterManager2.f92958g.getFilterMap().get(objectRef7.f124891b);
                                        if (list16 != null) {
                                            list16.add(keydesc);
                                        }
                                    }
                                }
                                notifyDataSetChanged();
                                TradeItemFilterManager.a aVar = TradeItemFilterManager.f92950i;
                                Context contextF2 = tradeItemFilterManager2.f();
                                SegmentFilterSelected segmentFilterSelected = tradeItemFilterManager2.f92956e;
                                f0.m(segmentFilterSelected);
                                TradePageFilterWrapper tradePageFilterWrapper = tradeItemFilterManager2.f92958g;
                                TradeItemFilterManager.b bVarG = tradeItemFilterManager2.g();
                                final TradeItemFilterManager tradeItemFilterManager5 = tradeItemFilterManager2;
                                aVar.a(contextF2, segmentFilterSelected, tradePageFilterWrapper, bVarG, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeItemFilterManager$initFilterContentView$2$onBindViewHolder$adapter$1$onBindViewHolder$1.3
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ b2 invoke() {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45343, new Class[0], Object.class);
                                        if (patchProxyResultProxy.isSupported) {
                                            return patchProxyResultProxy.result;
                                        }
                                        invoke2();
                                        return b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45342, new Class[0], Void.TYPE).isSupported) {
                                            return;
                                        }
                                        u uVar2 = tradeItemFilterManager5.f92957f;
                                        if (uVar2 == null) {
                                            f0.S("mFilterAdapter");
                                            uVar2 = null;
                                        }
                                        uVar2.notifyDataSetChanged();
                                    }
                                });
                            }
                        });
                    }

                    @Override // com.max.hbcommon.base.adapter.s
                    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, TradeFilterItemObj tradeFilterItemObj) {
                        if (PatchProxy.proxy(new Object[]{eVar, tradeFilterItemObj}, this, changeQuickRedirect, false, 45340, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        m(eVar, tradeFilterItemObj);
                    }
                };
                objectRef6.f124891b = r10;
                recyclerView5.setAdapter((RecyclerView.Adapter) r10);
                ((View) objectRef4.f124891b).setOnClickListener(new a(objectRef4, data, objectRef5, objectRef6));
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
                if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 45336, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                o(eVar, (TradeFilterObj) obj);
            }

            @Override // com.max.hbcommon.base.adapter.u, com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
            public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 45335, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
                return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
            }

            @Override // com.max.hbcommon.base.adapter.u, com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
            @dl.d
            public s.e onCreateViewHolder(@dl.d ViewGroup parent, int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 45332, new Class[]{ViewGroup.class, Integer.TYPE}, s.e.class);
                if (patchProxyResultProxy.isSupported) {
                    return (s.e) patchProxyResultProxy.result;
                }
                f0.p(parent, "parent");
                s.e eVarOnCreateViewHolder = super.onCreateViewHolder(parent, i10);
                f0.o(eVarOnCreateViewHolder, "super.onCreateViewHolder(parent, viewType)");
                if (eVarOnCreateViewHolder.d() == R.layout.item_trade_filter_price_range) {
                    EditText editText = (EditText) eVarOnCreateViewHolder.i(R.id.et_min_price);
                    EditText editText2 = (EditText) eVarOnCreateViewHolder.i(R.id.et_max_price);
                    if (editText != null) {
                        final TradeItemFilterManager tradeItemFilterManager = this.f92985b;
                        editText.addTextChangedListener(new TextWatcher() { // from class: com.max.xiaoheihe.module.trade.TradeItemFilterManager$initFilterContentView$2$onCreateViewHolder$1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // android.text.TextWatcher
                            public void afterTextChanged(@dl.e Editable editable) {
                                if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 45344, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                                    return;
                                }
                                tradeItemFilterManager.f92958g.setMinPrice(String.valueOf(editable));
                                TradeItemFilterManager.a aVar = TradeItemFilterManager.f92950i;
                                Context contextF = tradeItemFilterManager.f();
                                SegmentFilterSelected segmentFilterSelected = tradeItemFilterManager.f92956e;
                                f0.m(segmentFilterSelected);
                                TradePageFilterWrapper tradePageFilterWrapper = tradeItemFilterManager.f92958g;
                                TradeItemFilterManager.b bVarG = tradeItemFilterManager.g();
                                final TradeItemFilterManager tradeItemFilterManager2 = tradeItemFilterManager;
                                aVar.a(contextF, segmentFilterSelected, tradePageFilterWrapper, bVarG, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeItemFilterManager$initFilterContentView$2$onCreateViewHolder$1$afterTextChanged$1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ b2 invoke() {
                                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45346, new Class[0], Object.class);
                                        if (patchProxyResultProxy2.isSupported) {
                                            return patchProxyResultProxy2.result;
                                        }
                                        invoke2();
                                        return b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45345, new Class[0], Void.TYPE).isSupported) {
                                            return;
                                        }
                                        u uVar2 = tradeItemFilterManager2.f92957f;
                                        if (uVar2 == null) {
                                            f0.S("mFilterAdapter");
                                            uVar2 = null;
                                        }
                                        uVar2.notifyDataSetChanged();
                                    }
                                });
                            }

                            @Override // android.text.TextWatcher
                            public void beforeTextChanged(@dl.e CharSequence charSequence, int i11, int i12, int i13) {
                            }

                            @Override // android.text.TextWatcher
                            public void onTextChanged(@dl.e CharSequence charSequence, int i11, int i12, int i13) {
                            }
                        });
                    }
                    if (editText2 != null) {
                        final TradeItemFilterManager tradeItemFilterManager2 = this.f92985b;
                        editText2.addTextChangedListener(new TextWatcher() { // from class: com.max.xiaoheihe.module.trade.TradeItemFilterManager$initFilterContentView$2$onCreateViewHolder$2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // android.text.TextWatcher
                            public void afterTextChanged(@dl.e Editable editable) {
                                if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 45347, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                                    return;
                                }
                                tradeItemFilterManager2.f92958g.setMaxPrice(String.valueOf(editable));
                                TradeItemFilterManager.a aVar = TradeItemFilterManager.f92950i;
                                Context contextF = tradeItemFilterManager2.f();
                                SegmentFilterSelected segmentFilterSelected = tradeItemFilterManager2.f92956e;
                                f0.m(segmentFilterSelected);
                                TradePageFilterWrapper tradePageFilterWrapper = tradeItemFilterManager2.f92958g;
                                TradeItemFilterManager.b bVarG = tradeItemFilterManager2.g();
                                final TradeItemFilterManager tradeItemFilterManager3 = tradeItemFilterManager2;
                                aVar.a(contextF, segmentFilterSelected, tradePageFilterWrapper, bVarG, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeItemFilterManager$initFilterContentView$2$onCreateViewHolder$2$afterTextChanged$1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ b2 invoke() {
                                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45349, new Class[0], Object.class);
                                        if (patchProxyResultProxy2.isSupported) {
                                            return patchProxyResultProxy2.result;
                                        }
                                        invoke2();
                                        return b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45348, new Class[0], Void.TYPE).isSupported) {
                                            return;
                                        }
                                        u uVar2 = tradeItemFilterManager3.f92957f;
                                        if (uVar2 == null) {
                                            f0.S("mFilterAdapter");
                                            uVar2 = null;
                                        }
                                        uVar2.notifyDataSetChanged();
                                    }
                                });
                            }

                            @Override // android.text.TextWatcher
                            public void beforeTextChanged(@dl.e CharSequence charSequence, int i11, int i12, int i13) {
                            }

                            @Override // android.text.TextWatcher
                            public void onTextChanged(@dl.e CharSequence charSequence, int i11, int i12, int i13) {
                            }
                        });
                    }
                }
                return eVarOnCreateViewHolder;
            }
        };
        this.f92957f = uVar;
        RecyclerView recyclerView5 = (RecyclerView) objectRef2.f124891b;
        if (recyclerView5 != null) {
            recyclerView5.setAdapter(uVar);
        }
        CommonTabLayout commonTabLayout = (CommonTabLayout) objectRef.f124891b;
        if (commonTabLayout != null) {
            commonTabLayout.setOnTabSelectListener(new c(objectRef3, objectRef2));
        }
        RecyclerView recyclerView6 = (RecyclerView) objectRef2.f124891b;
        if (recyclerView6 != null) {
            recyclerView6.addOnScrollListener(new d(objectRef3, this, objectRef));
        }
        if (bottomButtonLeftItemView != null) {
            bottomButtonLeftItemView.setRightClickListener(new e());
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.max.xiaoheihe.module.trade.TradeItemFilterManager$initFilterContentView$resetOnClickListener$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                List<TradeFilterItemObj> list;
                if (PatchProxy.proxy(new Object[]{view5}, this, changeQuickRedirect, false, 45353, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                for (String str : this.f93002b.f92958g.getFilterMap().keySet()) {
                    if (!f0.g(this.f93002b.g().z1(), str) && (list = this.f93002b.f92958g.getFilterMap().get(str)) != null) {
                        list.clear();
                    }
                }
                this.f93002b.f92958g.setMinPrice("");
                this.f93002b.f92958g.setMaxPrice("");
                TradeItemFilterManager.a aVar = TradeItemFilterManager.f92950i;
                Context contextF = this.f93002b.f();
                SegmentFilterSelected segmentFilterSelected = this.f93002b.f92956e;
                f0.m(segmentFilterSelected);
                TradePageFilterWrapper tradePageFilterWrapper = this.f93002b.f92958g;
                TradeItemFilterManager.b bVarG = this.f93002b.g();
                final TradeItemFilterManager tradeItemFilterManager = this.f93002b;
                aVar.a(contextF, segmentFilterSelected, tradePageFilterWrapper, bVarG, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeItemFilterManager$initFilterContentView$resetOnClickListener$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45355, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45354, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        u uVar2 = tradeItemFilterManager.f92957f;
                        if (uVar2 == null) {
                            f0.S("mFilterAdapter");
                            uVar2 = null;
                        }
                        uVar2.notifyDataSetChanged();
                    }
                });
                u uVar2 = this.f93002b.f92957f;
                if (uVar2 == null) {
                    f0.S("mFilterAdapter");
                    uVar2 = null;
                }
                uVar2.notifyDataSetChanged();
            }
        };
        if (bottomButtonLeftItemView != null) {
            bottomButtonLeftItemView.setLeftClickListener(onClickListener);
        }
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        ArrayList<CustomTabEntity> arrayList2 = new ArrayList<>();
        ArrayList<TradeFilterTabObj> arrayList3 = this.f92959h;
        f0.m(arrayList3);
        for (TradeFilterTabObj tradeFilterTabObj2 : arrayList3) {
            String short_desc = tradeFilterTabObj2.getShort_desc();
            arrayList2.add(new TabEntity(!(short_desc == null || short_desc.length() == 0) ? tradeFilterTabObj2.getShort_desc() : tradeFilterTabObj2.getDesc()));
        }
        CommonTabLayout commonTabLayout2 = (CommonTabLayout) objectRef.f124891b;
        if (commonTabLayout2 != null) {
            commonTabLayout2.setTabData(arrayList2);
        }
        CommonTabLayout commonTabLayout3 = (CommonTabLayout) objectRef.f124891b;
        if (commonTabLayout3 == null) {
            return;
        }
        commonTabLayout3.setCurrentTab(0);
    }

    private final void l() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45327, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f92958g = this.f92953b.H3();
        u<TradeFilterObj> uVar = this.f92957f;
        if (uVar == null) {
            f0.S("mFilterAdapter");
            uVar = null;
        }
        uVar.notifyDataSetChanged();
        a aVar = f92950i;
        Context context = this.f92952a;
        SegmentFilterSelected segmentFilterSelected = this.f92956e;
        f0.m(segmentFilterSelected);
        aVar.a(context, segmentFilterSelected, this.f92958g, this.f92953b, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeItemFilterManager$updateFilterContentView$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45358, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45357, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                u uVar2 = this.f93004b.f92957f;
                if (uVar2 == null) {
                    f0.S("mFilterAdapter");
                    uVar2 = null;
                }
                uVar2.notifyDataSetChanged();
            }
        });
    }

    @dl.d
    public final Context f() {
        return this.f92952a;
    }

    @dl.d
    public final b g() {
        return this.f92953b;
    }

    public final void i(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 45323, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f92952a = context;
    }

    public final void j(@dl.d b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 45324, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bVar, "<set-?>");
        this.f92953b = bVar;
    }

    public final void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45325, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f92954c == null) {
            View viewInflate = LayoutInflater.from(this.f92952a).inflate(R.layout.dialog_trade_inventory_filter, (ViewGroup) null, false);
            this.f92955d = viewInflate;
            View viewFindViewById = viewInflate != null ? viewInflate.findViewById(R.id.vg_bg) : null;
            f0.n(viewFindViewById, "null cannot be cast to non-null type android.view.View");
            View view = this.f92955d;
            this.f92956e = view != null ? (SegmentFilterSelected) view.findViewById(R.id.filter_selected) : null;
            h();
            this.f92954c = new i(this.f92952a, true, this.f92955d);
            viewFindViewById.setOnClickListener(new f());
        }
        ArrayList<TradeFilterTabObj> arrayList = this.f92959h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        l();
        i iVar = this.f92954c;
        if (iVar != null) {
            iVar.setCancelable(true);
        }
        i iVar2 = this.f92954c;
        if (iVar2 != null) {
            iVar2.show();
        }
    }
}
