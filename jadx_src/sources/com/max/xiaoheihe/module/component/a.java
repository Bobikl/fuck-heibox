package com.max.xiaoheihe.module.component;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.max.hbcommon.bean.segmentfilter.FilterItem;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.i;
import com.max.hbcommon.component.segmentfilters.SecondaryWindowSegmentFilterView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BottomMultiSelectDialog.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f83541i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Context f83542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<FilterGroup> f83543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private i f83544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final List<FilterGroup> f83545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f83546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f83547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private s<FilterGroup> f83548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private InterfaceC0730a f83549h;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.component.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BottomMultiSelectDialog.kt */
    public interface InterfaceC0730a {
        void a();
    }

    /* JADX INFO: compiled from: BottomMultiSelectDialog.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31439, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.e();
        }
    }

    /* JADX INFO: compiled from: BottomMultiSelectDialog.kt */
    public static final class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f83551b = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: BottomMultiSelectDialog.kt */
    public static final class d extends s<FilterGroup> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f83553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f83554d;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.component.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BottomMultiSelectDialog.kt */
        public static final class C0731a extends RecyclerView.ItemDecoration {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f83555b;

            C0731a(int i10) {
                this.f83555b = i10;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
                if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 31442, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(outRect, "outRect");
                f0.p(view, "view");
                f0.p(parent, "parent");
                f0.p(state, "state");
                super.getItemOffsets(outRect, view, parent, state);
                int i10 = this.f83555b;
                outRect.right = i10;
                outRect.bottom = i10;
            }
        }

        /* JADX INFO: compiled from: BottomMultiSelectDialog.kt */
        public static final class b extends s<FilterItem> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f83556b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f83557c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ FilterGroup f83558d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ RecyclerView f83559e;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.component.a$d$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BottomMultiSelectDialog.kt */
            public static final class ViewOnClickListenerC0732a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ FilterGroup f83560b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ FilterItem f83561c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ RecyclerView f83562d;

                ViewOnClickListenerC0732a(FilterGroup filterGroup, FilterItem filterItem, RecyclerView recyclerView) {
                    this.f83560b = filterGroup;
                    this.f83561c = filterItem;
                    this.f83562d = recyclerView;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31445, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    SecondaryWindowSegmentFilterView.f67839l.u(this.f83560b, this.f83561c);
                    RecyclerView.Adapter adapter = this.f83562d.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(int i10, a aVar, FilterGroup filterGroup, RecyclerView recyclerView, Context context, List<FilterItem> list) {
                super(context, list, R.layout.item_multi_select_item);
                this.f83556b = i10;
                this.f83557c = aVar;
                this.f83558d = filterGroup;
                this.f83559e = recyclerView;
            }

            public void m(@dl.e s.e eVar, @dl.e FilterItem filterItem) {
                if (PatchProxy.proxy(new Object[]{eVar, filterItem}, this, changeQuickRedirect, false, 31443, new Class[]{s.e.class, FilterItem.class}, Void.TYPE).isSupported || eVar == null) {
                    return;
                }
                int i10 = this.f83556b;
                a aVar = this.f83557c;
                FilterGroup filterGroup = this.f83558d;
                RecyclerView recyclerView = this.f83559e;
                if (filterItem != null) {
                    View view = eVar.itemView;
                    f0.o(view, "itemHolder.itemView");
                    ImageView imageView = (ImageView) eVar.i(R.id.iv);
                    TextView textView = (TextView) eVar.i(R.id.tv);
                    Drawable drawableG = ViewUtils.G(i10, com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                    Drawable drawableG2 = ViewUtils.G(i10, com.max.xiaoheihe.utils.d.E(R.color.background_card_1_color));
                    if (filterItem.isCustom_checked()) {
                        view.setBackground(drawableG);
                        imageView.setColorFilter(aVar.f83546e);
                        textView.setTextColor(aVar.f83546e);
                    } else {
                        view.setBackground(drawableG2);
                        imageView.setColorFilter(aVar.f83547f);
                        textView.setTextColor(aVar.f83547f);
                    }
                    textView.setText(filterItem.getDesc());
                    if (com.max.hbcommon.utils.c.u(filterItem.getImg_url())) {
                        imageView.setVisibility(8);
                    } else {
                        imageView.setVisibility(0);
                        com.max.hbimage.b.K(filterItem.getImg_url(), imageView);
                    }
                    view.setOnClickListener(new ViewOnClickListenerC0732a(filterGroup, filterItem, recyclerView));
                }
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, FilterItem filterItem) {
                if (PatchProxy.proxy(new Object[]{eVar, filterItem}, this, changeQuickRedirect, false, 31444, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, filterItem);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, int i11, Context context, List<FilterGroup> list) {
            super(context, list, R.layout.item_multi_select);
            this.f83553c = i10;
            this.f83554d = i11;
        }

        public void m(@dl.e s.e eVar, @dl.e FilterGroup filterGroup) {
            if (PatchProxy.proxy(new Object[]{eVar, filterGroup}, this, changeQuickRedirect, false, 31440, new Class[]{s.e.class, FilterGroup.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            a aVar = a.this;
            int i10 = this.f83553c;
            int i11 = this.f83554d;
            if (filterGroup != null) {
                View viewI = eVar.i(R.id.tv_title);
                f0.o(viewI, "groupHolder.getView(R.id.tv_title)");
                View viewI2 = eVar.i(R.id.rv_item);
                f0.o(viewI2, "groupHolder.getView(R.id.rv_item)");
                RecyclerView recyclerView = (RecyclerView) viewI2;
                ((TextView) viewI).setText(filterGroup.getDesc());
                recyclerView.getLayoutParams().width = ViewUtils.L(aVar.g()) - ViewUtils.f(aVar.g(), 24.0f);
                recyclerView.setLayoutManager(new FlexboxLayoutManager(aVar.g()));
                if (recyclerView.getItemDecorationCount() == 0) {
                    recyclerView.addItemDecoration(new C0731a(i10));
                }
                Log.d("BottomMultiSelectDialog", String.valueOf(k.p(filterGroup)));
                if (recyclerView.getAdapter() != null) {
                    RecyclerView.Adapter adapter = recyclerView.getAdapter();
                    f0.n(adapter, "null cannot be cast to non-null type com.max.hbcommon.base.adapter.RVCommonAdapter<com.max.hbcommon.bean.segmentfilter.FilterItem>");
                    ((s) adapter).getDataList().clear();
                    RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                    f0.n(adapter2, "null cannot be cast to non-null type com.max.hbcommon.base.adapter.RVCommonAdapter<com.max.hbcommon.bean.segmentfilter.FilterItem>");
                    List dataList = ((s) adapter2).getDataList();
                    List<FilterItem> filters = filterGroup.getFilters();
                    f0.o(filters, "group.filters");
                    dataList.addAll(filters);
                } else {
                    recyclerView.setAdapter(new b(i11, aVar, filterGroup, recyclerView, aVar.g(), filterGroup.getFilters()));
                }
                RecyclerView.Adapter adapter3 = recyclerView.getAdapter();
                if (adapter3 != null) {
                    adapter3.notifyDataSetChanged();
                }
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, FilterGroup filterGroup) {
            if (PatchProxy.proxy(new Object[]{eVar, filterGroup}, this, changeQuickRedirect, false, 31441, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, filterGroup);
        }
    }

    /* JADX INFO: compiled from: BottomMultiSelectDialog.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31446, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Iterator it = a.this.f83545d.iterator();
            while (it.hasNext()) {
                SecondaryWindowSegmentFilterView.f67839l.q((FilterGroup) it.next());
            }
            s sVar = a.this.f83548g;
            if (sVar != null) {
                sVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: compiled from: BottomMultiSelectDialog.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31447, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.j().clear();
            List<FilterGroup> listJ = a.this.j();
            List listB = k.b(k.r(a.this.f83545d), FilterGroup.class);
            f0.o(listB, "deserializeList(\n       …ss.java\n                )");
            listJ.addAll(listB);
            a.this.e();
            InterfaceC0730a interfaceC0730aK = a.this.k();
            if (interfaceC0730aK != null) {
                interfaceC0730aK.a();
            }
        }
    }

    public a(@dl.d Context context, @dl.d List<FilterGroup> filters) {
        f0.p(context, "context");
        f0.p(filters, "filters");
        this.f83542a = context;
        this.f83543b = filters;
        this.f83545d = new ArrayList();
        this.f83544c = new i(context, f());
        this.f83546e = com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color);
        this.f83547f = com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color);
    }

    private final View f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31434, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        Iterator<FilterGroup> it = this.f83543b.iterator();
        while (it.hasNext()) {
            SecondaryWindowSegmentFilterView.f67839l.q(it.next());
        }
        List<FilterGroup> list = this.f83545d;
        List listB = k.b(k.r(this.f83543b), FilterGroup.class);
        f0.o(listB, "deserializeList(\n       …:class.java\n            )");
        list.addAll(listB);
        View view = LayoutInflater.from(this.f83542a).inflate(R.layout.dialog_bottom_multi_select, (ViewGroup) null);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.vg_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv);
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) view.findViewById(R.id.view_bottom_button);
        view.setOnClickListener(new b());
        viewGroup.setOnClickListener(c.f83551b);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f83542a));
        int iF = ViewUtils.f(this.f83542a, 8.0f);
        Context context = this.f83542a;
        d dVar = new d(iF, ViewUtils.m(context, ViewUtils.f(context, 60.0f), ViewUtils.f(this.f83542a, 30.0f)), this.f83542a, this.f83545d);
        this.f83548g = dVar;
        recyclerView.setAdapter(dVar);
        bottomButtonLeftItemView.setLeftClickListener(new e());
        bottomButtonLeftItemView.setRightClickListener(new f());
        f0.o(view, "view");
        return view;
    }

    public final void e() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31436, new Class[0], Void.TYPE).isSupported && this.f83544c.isShowing()) {
            this.f83544c.dismiss();
        }
    }

    @dl.d
    public final Context g() {
        return this.f83542a;
    }

    @dl.d
    public final i h() {
        return this.f83544c;
    }

    @dl.d
    public final HashMap<String, String> i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31438, new Class[0], HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        HashMap<String, String> map = new HashMap<>();
        for (FilterGroup filterGroup : this.f83543b) {
            String key = filterGroup.getKey();
            if (filterGroup.isNormalSlider()) {
                if (filterGroup.getCustom_range() != null) {
                    map.put(key, filterGroup.getCustom_range().getStart().getKey() + ',' + filterGroup.getCustom_range().getEnd().getKey());
                }
            } else if (!f0.g(FilterGroup.TYPE_MULTI, filterGroup.getType())) {
                FilterItem filterItemC = SecondaryWindowSegmentFilterView.f67839l.c(filterGroup);
                if (filterItemC != null) {
                    map.put(key, filterItemC.getKey());
                }
            } else if (!com.max.hbcommon.utils.c.w(filterGroup.getFilters())) {
                StringBuilder sb2 = new StringBuilder();
                for (FilterItem filterItem : filterGroup.getFilters()) {
                    if (filterItem.isCustom_checked()) {
                        if (sb2.length() > 0) {
                            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                        }
                        sb2.append(filterItem.getKey());
                    }
                }
                if (sb2.length() > 0) {
                    map.put(key, sb2.toString());
                }
            }
        }
        return map;
    }

    @dl.d
    public final List<FilterGroup> j() {
        return this.f83543b;
    }

    @dl.e
    public final InterfaceC0730a k() {
        return this.f83549h;
    }

    public final boolean l() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31437, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : SecondaryWindowSegmentFilterView.f67839l.l(this.f83543b);
    }

    public final void m(@dl.d i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, 31433, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(iVar, "<set-?>");
        this.f83544c = iVar;
    }

    public final void n(@dl.e InterfaceC0730a interfaceC0730a) {
        this.f83549h = interfaceC0730a;
    }

    public final void o() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31435, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f83545d.clear();
        List<FilterGroup> list = this.f83545d;
        List listB = k.b(k.r(this.f83543b), FilterGroup.class);
        f0.o(listB, "deserializeList(\n       …:class.java\n            )");
        list.addAll(listB);
        s<FilterGroup> sVar = this.f83548g;
        if (sVar != null) {
            sVar.notifyDataSetChanged();
        }
        this.f83544c.show();
    }
}
