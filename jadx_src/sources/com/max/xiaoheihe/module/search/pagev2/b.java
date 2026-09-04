package com.max.xiaoheihe.module.search.pagev2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.core.motion.utils.w;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.base.adapter.t;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.NewFilterListObj;
import com.max.hbcommon.bean.NewFilterObj;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbcommon.component.FilterCheckedListView;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbsearch.n;
import com.max.hbsearch.p;
import com.max.hbsearch.y0;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.GeneralSearchResultObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SearchGeneralFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nSearchGeneralFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchGeneralFragment.kt\ncom/max/xiaoheihe/module/search/pagev2/SearchGeneralFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,721:1\n262#2,2:722\n260#2:724\n1864#3,3:725\n*S KotlinDebug\n*F\n+ 1 SearchGeneralFragment.kt\ncom/max/xiaoheihe/module/search/pagev2/SearchGeneralFragment\n*L\n169#1:722,2\n174#1:724\n382#1:725,3\n*E\n"})
@o(parameters = 0)
public final class b extends y0 {

    @dl.d
    public static final String J3 = "type";
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private com.max.xiaoheihe.module.bbs.i<t> G2;

    @dl.e
    private t K;

    @dl.e
    private com.max.xiaoheihe.module.search.d L;

    @dl.e
    private String M;

    @dl.e
    private String N;

    @dl.e
    private TabLayout T;
    public View V;
    public FilterCheckedListView W;
    public ViewGroup X;
    public CheckBox Y;
    public TextView Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.component.o f91693a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.search.pagev2.a f91694b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.e
    private String f91695c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f91696p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.e
    private String f91697p2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private int f91698x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.e
    private String f91699x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.e
    private String f91700y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @dl.e
    private LoadingDialog f91701y2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @dl.d
    public static final a f91692p3 = new a(null);
    public static final int G3 = 8;

    @dl.d
    private final ArrayList<GeneralSearchInfo> I = new ArrayList<>();

    @dl.d
    private final ArrayList<String> J = new ArrayList<>();

    @dl.d
    private final ArrayList<KeyDescObj> O = new ArrayList<>();

    @dl.d
    private final ArrayList<KeyDescObj> P = new ArrayList<>();

    @dl.d
    private final ArrayList<NewFilterListObj> Q = new ArrayList<>();

    @dl.d
    private final List<Integer> R = new ArrayList();
    private boolean S = true;

    @dl.d
    private com.max.xiaoheihe.module.search.pagev2.d U = new com.max.xiaoheihe.module.search.pagev2.d();

    /* JADX INFO: compiled from: SearchGeneralFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final b a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43220, new Class[0], b.class);
            return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : new b();
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.search.pagev2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SearchGeneralFragment.kt */
    public static final class C0857b extends com.max.hbcommon.network.d<Result<GeneralSearchResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f91703c;

        C0857b(String str, b bVar) {
            this.f91702b = str;
            this.f91703c = bVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43223, new Class[0], Void.TYPE).isSupported && f0.g(this.f91702b, b.U5(this.f91703c)) && this.f91703c.isActive()) {
                super.onComplete();
                b.L5(this.f91703c, this.f91702b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43222, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            b.b6(this.f91703c);
            if (f0.g(this.f91702b, b.U5(this.f91703c)) && this.f91703c.isActive()) {
                super.onError(e10);
                b.o6(this.f91703c);
                b.L5(this.f91703c, this.f91702b);
            }
        }

        public void onNext(@dl.d Result<GeneralSearchResultObj> r10) {
            ArrayList<KeyDescObj> time_range_list;
            ArrayList<KeyDescObj> game_type_list;
            com.max.xiaoheihe.module.search.pagev2.a aVar;
            GeneralSearchResultObj result;
            ArrayList<KeyDescObj> sort_filter_list;
            ArrayList<GeneralSearchInfo> items;
            if (PatchProxy.proxy(new Object[]{r10}, this, changeQuickRedirect, false, 43221, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(r10, "r");
            if (f0.g(this.f91702b, b.U5(this.f91703c)) && this.f91703c.isActive()) {
                b.m6(this.f91703c);
                GeneralSearchResultObj result2 = r10.getResult();
                if (result2 != null) {
                    b bVar = this.f91703c;
                    bVar.f91700y1 = result2.getBottom_tips();
                    bVar.f91697p2 = result2.getSearch_not_result_tips();
                    GeneralSearchResultObj result3 = r10.getResult();
                    if (result3 != null && (items = result3.getItems()) != null) {
                        if (b.R5(bVar) == 0) {
                            bVar.J.clear();
                            bVar.I.clear();
                        }
                        bVar.f91698x1 = items.size();
                        b.q6(bVar, items);
                    }
                    if (bVar.P.isEmpty() && (result = r10.getResult()) != null && (sort_filter_list = result.getSort_filter_list()) != null) {
                        bVar.P.addAll(sort_filter_list);
                        b.r6(bVar, sort_filter_list);
                    }
                    if (bVar.D6().isEmpty()) {
                        ArrayList<NewFilterListObj> filter_list = result2.getFilter_list();
                        if (!(filter_list == null || filter_list.isEmpty())) {
                            com.max.xiaoheihe.module.search.pagev2.a aVar2 = bVar.f91694b0;
                            if ((aVar2 != null && aVar2.l2(bVar)) && (aVar = bVar.f91694b0) != null) {
                                aVar.r0();
                            }
                            ArrayList<NewFilterListObj> arrayListD6 = bVar.D6();
                            GeneralSearchResultObj result4 = r10.getResult();
                            ArrayList<NewFilterListObj> filter_list2 = result4 != null ? result4.getFilter_list() : null;
                            f0.m(filter_list2);
                            arrayListD6.addAll(filter_list2);
                            bVar.R.clear();
                            for (NewFilterListObj newFilterListObj : bVar.D6()) {
                                bVar.R.add(0);
                            }
                        }
                    }
                    GeneralSearchResultObj result5 = r10.getResult();
                    if (result5 != null && (game_type_list = result5.getGame_type_list()) != null) {
                        b.s6(bVar, game_type_list);
                    }
                    GeneralSearchResultObj result6 = r10.getResult();
                    if (result6 != null && (time_range_list = result6.getTime_range_list()) != null) {
                        b.s6(bVar, time_range_list);
                    }
                }
                b.d6(this.f91703c);
                b.b6(this.f91703c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43224, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GeneralSearchResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SearchGeneralFragment.kt */
    public static final class c implements p {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbsearch.p
        public void g(@dl.e String str) {
        }

        @Override // com.max.hbsearch.p
        public void n() {
        }

        @Override // com.max.hbsearch.p
        public void q(int i10) {
            com.max.xiaoheihe.module.search.d dVar;
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43226, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (dVar = b.this.L) == null) {
                return;
            }
            dVar.q(i10);
        }

        @Override // com.max.hbsearch.p
        @dl.d
        public String r() {
            String strR;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43225, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            com.max.hbsearch.m mVarQ5 = b.Q5(b.this);
            return (mVarQ5 == null || (strR = mVarQ5.r()) == null) ? "" : strR;
        }
    }

    /* JADX INFO: compiled from: SearchGeneralFragment.kt */
    public static final class d implements com.max.hbsearch.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbsearch.f
        public void a(@dl.e String str) {
            n nVarH4;
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43229, new Class[]{String.class}, Void.TYPE).isSupported || (nVarH4 = b.this.h4()) == null) {
                return;
            }
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setName(str);
            n.a.b(nVarH4, keyDescObj, null, 2, null);
        }

        @Override // com.max.hbsearch.f
        public void b(@dl.e String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43228, new Class[]{String.class}, Void.TYPE).isSupported || f0.g(b.this.f91699x2, str)) {
                return;
            }
            b.this.f91699x2 = str;
            b.i6(b.this, 0);
            String strU5 = b.U5(b.this);
            if (strU5 != null) {
                b bVar = b.this;
                b.n6(bVar);
                bVar.h5(strU5, b.V5(bVar));
            }
        }

        @Override // com.max.hbsearch.f
        @dl.e
        public String c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43227, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b.this.f91699x2;
        }
    }

    /* JADX INFO: compiled from: SearchGeneralFragment.kt */
    public static final class e implements com.max.xiaoheihe.module.news.adapter.a.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a.b
        public void B3(int i10) {
            t tVar;
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43230, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (tVar = b.this.K) == null) {
                return;
            }
            tVar.notifyItemRemoved(i10);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a.b
        public void G2(int i10) {
        }
    }

    /* JADX INFO: compiled from: SearchGeneralFragment.kt */
    public static final class f extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 43231, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            if (i11 > 0) {
                SearchHelper.f91573a.a().i(b.W5(b.this), b.this.J, b.K5(b.this));
            }
            super.onScrolled(recyclerView, i10, i11);
        }
    }

    /* JADX INFO: compiled from: SearchGeneralFragment.kt */
    public static final class g implements FilterCheckedListView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.component.FilterCheckedListView.a
        public void a(@dl.d NewFilterObj filter) {
            t tVar;
            int iIntValue = 0;
            if (PatchProxy.proxy(new Object[]{filter}, this, changeQuickRedirect, false, 43232, new Class[]{NewFilterObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(filter, "filter");
            int size = b.this.D6().size();
            for (int i10 = 0; i10 < size; i10++) {
                List<NewFilterObj> filters = b.this.D6().get(i10).getFilters();
                if (filters != null) {
                    b bVar = b.this;
                    Iterator<NewFilterObj> it = filters.iterator();
                    while (it.hasNext()) {
                        if (f0.g(it.next().getKey(), filter.getKey())) {
                            bVar.R.set(i10, 0);
                            b.p6(bVar);
                            bVar.O3(b.U5(bVar));
                            break;
                        }
                    }
                }
            }
            Iterator it2 = b.this.R.iterator();
            while (it2.hasNext()) {
                iIntValue += ((Number) it2.next()).intValue();
            }
            if (iIntValue != 0 || (tVar = b.this.K) == null) {
                return;
            }
            tVar.F(R.layout.item_filter_checked_list);
        }

        @Override // com.max.hbcommon.component.FilterCheckedListView.a
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43233, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            int size = b.this.R.size();
            for (int i10 = 0; i10 < size; i10++) {
                b.this.R.set(i10, 0);
            }
            t tVar = b.this.K;
            if (tVar != null) {
                tVar.F(R.layout.item_filter_checked_list);
            }
            b.n6(b.this);
            b bVar = b.this;
            bVar.O3(b.U5(bVar));
        }
    }

    /* JADX INFO: compiled from: SearchGeneralFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43234, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.this.x6().setChecked(true ^ b.this.x6().isChecked());
        }
    }

    /* JADX INFO: compiled from: SearchGeneralFragment.kt */
    public static final class i implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 43235, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.accelworld.l.v(b.this.E6(), z10 ? R.color.text_primary_1_color : R.color.text_secondary_1_color);
            b bVar = b.this;
            bVar.P3(b.U5(bVar), 0, b.P5(b.this));
        }
    }

    /* JADX INFO: compiled from: SearchGeneralFragment.kt */
    @t0({"SMAP\nSearchGeneralFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchGeneralFragment.kt\ncom/max/xiaoheihe/module/search/pagev2/SearchGeneralFragment$initTabLayout$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,721:1\n1295#2,2:722\n1295#2,2:724\n*S KotlinDebug\n*F\n+ 1 SearchGeneralFragment.kt\ncom/max/xiaoheihe/module/search/pagev2/SearchGeneralFragment$initTabLayout$1\n*L\n634#1:722,2\n650#1:724,2\n*E\n"})
    public static final class j implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 43236, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
            TabLayout.TabView tabView = tab.f55494i;
            f0.o(tabView, "tab.view");
            for (View view : ViewGroupKt.e(tabView)) {
                if (view instanceof TextView) {
                    ((TextView) view).setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                }
            }
            if (tab.k() < b.this.O.size()) {
                b bVar = b.this;
                bVar.M = ((KeyDescObj) bVar.O.get(tab.k())).getValue();
            }
            if (!b.this.S) {
                b.n6(b.this);
                b bVar2 = b.this;
                bVar2.P3(b.U5(bVar2), 0, b.P5(b.this));
            }
            b.this.S = false;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 43237, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
            TabLayout.TabView tabView = tab.f55494i;
            f0.o(tabView, "tab.view");
            for (View view : ViewGroupKt.e(tabView)) {
                if (view instanceof TextView) {
                    ((TextView) view).setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 43238, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
        }
    }

    /* JADX INFO: compiled from: SearchGeneralFragment.kt */
    public static final class k implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43239, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.i<t> iVarZ6 = b.this.z6();
            if (iVarZ6 != null) {
                iVarZ6.q();
            }
            SearchHelper.f91573a.a().i(b.W5(b.this), b.this.J, b.K5(b.this));
        }
    }

    /* JADX INFO: compiled from: SearchGeneralFragment.kt */
    public static final class l implements com.max.hbcommon.component.o.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // com.max.hbcommon.component.o.a
        public void a(@dl.d List<Integer> selectedList) {
            if (PatchProxy.proxy(new Object[]{selectedList}, this, changeQuickRedirect, false, 43240, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(selectedList, "selectedList");
            b.this.R.clear();
            b.this.R.addAll(selectedList);
            b.this.A6().h();
            int size = b.this.D6().size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Number) b.this.R.get(i10)).intValue() > 0) {
                    FilterCheckedListView filterCheckedListViewA6 = b.this.A6();
                    List<NewFilterObj> filters = b.this.D6().get(i10).getFilters();
                    filterCheckedListViewA6.c(filters != null ? filters.get(((Number) b.this.R.get(i10)).intValue()) : null);
                }
            }
            t tVar = b.this.K;
            if (tVar != null) {
                b bVar = b.this;
                if (bVar.A6().getChildCount() > 0 && !tVar.A(R.layout.item_filter_checked_list)) {
                    tVar.p(R.layout.item_filter_checked_list, bVar.C6());
                    tVar.notifyDataSetChanged();
                }
            }
            b bVar2 = b.this;
            bVar2.P3(b.U5(bVar2), 0, b.P5(b.this));
        }
    }

    /* JADX INFO: compiled from: SearchGeneralFragment.kt */
    public static final class m implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList<KeyDescObj> f91714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f91715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FilterButtonView f91716c;

        m(ArrayList<KeyDescObj> arrayList, b bVar, FilterButtonView filterButtonView) {
            this.f91714a = arrayList;
            this.f91715b = bVar;
            this.f91716c = filterButtonView;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj data) {
            if (PatchProxy.proxy(new Object[]{view, data}, this, changeQuickRedirect, false, 43241, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            for (KeyDescObj keyDescObj : this.f91714a) {
                keyDescObj.setChecked(f0.g(data.getName(), keyDescObj.getName()));
            }
            b bVar = this.f91715b;
            f0.o(data, "data");
            b.e6(bVar, data, this.f91716c);
            b bVar2 = this.f91715b;
            String value = data.getValue();
            f0.o(value, "data.value");
            bVar2.f5(value);
        }
    }

    @dl.d
    @xh.m
    public static final b B6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 43200, new Class[0], b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : f91692p3.a();
    }

    private final String F6() {
        String string;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43181, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("type")) == null) ? "" : string;
    }

    private final void H6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43198, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.f91701y2;
        if (loadingDialog != null) {
            loadingDialog.c();
        }
        this.f91701y2 = null;
    }

    private final void I6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43183, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        P4().addOnScrollListener(new f());
    }

    private final void J6() {
        TabLayout tabLayout;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43195, new Class[0], Void.TYPE).isSupported || (tabLayout = this.T) == null) {
            return;
        }
        tabLayout.h(new j());
    }

    public static final /* synthetic */ String K5(b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43210, new Class[]{b.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : bVar.v6();
    }

    private final void K6(ArrayList<GeneralSearchInfo> arrayList, int i10) {
        if (PatchProxy.proxy(new Object[]{arrayList, new Integer(i10)}, this, changeQuickRedirect, false, 43189, new Class[]{ArrayList.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i11 = i10 - 1;
        List listB = com.max.hbutils.utils.k.b(arrayList.get(i11).getInfo(), MallProductObj.class);
        MallProductObj mallProductObj = (MallProductObj) com.max.hbutils.utils.k.a(arrayList.get(i10).getInfo(), MallProductObj.class);
        if (mallProductObj != null) {
            mallProductObj.setReport_id(arrayList.get(i10).getReport_id());
        }
        if (mallProductObj != null) {
            mallProductObj.setCustom_index(arrayList.get(i10).getReport_idx());
        }
        if (mallProductObj != null) {
            mallProductObj.setCustom_suggested_from(arrayList.get(i10).getSuggested_from());
        }
        listB.add(mallProductObj);
        arrayList.get(i11).setInfo(com.max.hbutils.utils.k.p(listB));
        arrayList.remove(i10);
    }

    public static final /* synthetic */ void L5(b bVar, String str) {
        if (PatchProxy.proxy(new Object[]{bVar, str}, null, changeQuickRedirect, true, 43215, new Class[]{b.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.Q3(str);
    }

    private final void L6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43191, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V6();
        t tVar = this.K;
        if (tVar != null) {
            tVar.notifyDataSetChanged();
        }
        if (t6()) {
            y4();
        } else {
            Q4().i0(true);
            Q4().b0(true);
            E5(true);
            N4().setVisibility(8);
            Y4().setVisibility(8);
        }
        P4().post(new k());
    }

    public static final /* synthetic */ int P5(b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43204, new Class[]{b.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : bVar.a4();
    }

    public static final /* synthetic */ com.max.hbsearch.m Q5(b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43205, new Class[]{b.class}, com.max.hbsearch.m.class);
        return patchProxyResultProxy.isSupported ? (com.max.hbsearch.m) patchProxyResultProxy.result : bVar.b4();
    }

    public static final /* synthetic */ int R5(b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43216, new Class[]{b.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : bVar.c4();
    }

    private final void S6() {
        LoadingDialog loadingDialog;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43197, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f91701y2 == null) {
            Activity mContext = this.mContext;
            f0.o(mContext, "mContext");
            this.f91701y2 = new LoadingDialog(mContext);
        }
        LoadingDialog loadingDialog2 = this.f91701y2;
        if (loadingDialog2 != null && !loadingDialog2.i()) {
            z10 = true;
        }
        if (!z10 || (loadingDialog = this.f91701y2) == null) {
            return;
        }
        loadingDialog.r();
    }

    public static final /* synthetic */ String U5(b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43202, new Class[]{b.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : bVar.d4();
    }

    private final void U6(ArrayList<GeneralSearchInfo> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 43187, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        if (c4() == 0) {
            this.f91696p1 = 0;
        }
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (!f0.g("space", arrayList.get(i11).getType())) {
                arrayList.get(i11).setReport_idx(String.valueOf(this.f91696p1 + i10));
                i10++;
            }
            arrayList.get(i11).setSuggested_from(this.f91695c0);
        }
        this.f91696p1 += i10;
        int size2 = arrayList.size();
        boolean z10 = true;
        String type = null;
        GeneralSearchInfo generalSearchInfo = null;
        int i12 = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            int i14 = i13 + i12;
            if (i14 >= arrayList.size()) {
                break;
            }
            if (f0.g("mall", arrayList.get(i14).getType())) {
                if (z10) {
                    u6(arrayList, i14);
                }
                z10 = false;
            } else {
                z10 = true;
            }
            if (type != null && generalSearchInfo != null && f0.g("mall", type)) {
                K6(arrayList, i14);
                i12--;
            }
            int i15 = i13 + i12;
            generalSearchInfo = arrayList.get(i15);
            type = arrayList.get(i15).getType();
        }
        if (!com.max.hbcommon.utils.c.u(this.f91700y1) && this.I.size() == 0) {
            this.I.add(new GeneralSearchInfo(this.f91700y1, "search_tips", null));
        }
        this.I.addAll(arrayList);
        t tVar = this.K;
        if (tVar != null) {
            tVar.notifyDataSetChanged();
        }
    }

    public static final /* synthetic */ String V5(b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43207, new Class[]{b.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : bVar.e4();
    }

    private final void V6() {
        t tVar;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43190, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.O.isEmpty()) {
            t tVar2 = this.K;
            if (tVar2 != null && true == tVar2.A(R.layout.item_search_filter_header)) {
                t tVar3 = this.K;
                if (tVar3 != null) {
                    tVar3.F(R.layout.item_search_filter_header);
                    return;
                }
                return;
            }
        }
        if (this.O.isEmpty()) {
            return;
        }
        t tVar4 = this.K;
        if (tVar4 != null && !tVar4.A(R.layout.item_search_filter_header)) {
            z10 = true;
        }
        if (!z10 || (tVar = this.K) == null) {
            return;
        }
        tVar.p(R.layout.item_search_filter_header, X4());
    }

    public static final /* synthetic */ RecyclerView W5(b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43209, new Class[]{b.class}, RecyclerView.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView) patchProxyResultProxy.result : bVar.P4();
    }

    private final void W6(List<? extends KeyDescObj> list) {
        if (!PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 43194, new Class[]{List.class}, Void.TYPE).isSupported && (true ^ list.isEmpty()) && this.O.isEmpty()) {
            for (KeyDescObj keyDescObj : list) {
                TabLayout tabLayout = this.T;
                if (tabLayout != null) {
                    tabLayout.i(tabLayout.I().D(keyDescObj.getName()));
                    this.O.add(keyDescObj);
                }
            }
        }
    }

    public static final /* synthetic */ void b6(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43213, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.H6();
    }

    public static final /* synthetic */ void d6(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43212, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.L6();
    }

    public static final /* synthetic */ void e6(b bVar, KeyDescObj keyDescObj, FilterButtonView filterButtonView) {
        if (PatchProxy.proxy(new Object[]{bVar, keyDescObj, filterButtonView}, null, changeQuickRedirect, true, 43208, new Class[]{b.class, KeyDescObj.class, FilterButtonView.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.g5(keyDescObj, filterButtonView);
    }

    private final void g5(KeyDescObj keyDescObj, FilterButtonView filterButtonView) {
        if (PatchProxy.proxy(new Object[]{keyDescObj, filterButtonView}, this, changeQuickRedirect, false, 43184, new Class[]{KeyDescObj.class, FilterButtonView.class}, Void.TYPE).isSupported) {
            return;
        }
        filterButtonView.setText(keyDescObj.getName());
    }

    private final void getArgumentInfo() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43180, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.U.a(F6());
    }

    public static final /* synthetic */ void i6(b bVar, int i10) {
        if (PatchProxy.proxy(new Object[]{bVar, new Integer(i10)}, null, changeQuickRedirect, true, 43206, new Class[]{b.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        bVar.r4(i10);
    }

    public static final /* synthetic */ void m6(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43211, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.showContentView();
    }

    public static final /* synthetic */ void n6(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43201, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.S6();
    }

    public static final /* synthetic */ void o6(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43214, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.showError();
    }

    public static final /* synthetic */ void p6(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 43203, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.showLoading();
    }

    public static final /* synthetic */ void q6(b bVar, ArrayList arrayList) {
        if (PatchProxy.proxy(new Object[]{bVar, arrayList}, null, changeQuickRedirect, true, 43217, new Class[]{b.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.U6(arrayList);
    }

    public static final /* synthetic */ void r6(b bVar, List list) {
        if (PatchProxy.proxy(new Object[]{bVar, list}, null, changeQuickRedirect, true, 43218, new Class[]{b.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.I5(list);
    }

    public static final /* synthetic */ void s6(b bVar, List list) {
        if (PatchProxy.proxy(new Object[]{bVar, list}, null, changeQuickRedirect, true, 43219, new Class[]{b.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.W6(list);
    }

    private final boolean t6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43192, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.I.isEmpty()) {
            return true;
        }
        if (this.I.size() != 1) {
            return false;
        }
        GeneralSearchInfo generalSearchInfo = (GeneralSearchInfo) CollectionsKt___CollectionsKt.R2(this.I, 0);
        return f0.g(generalSearchInfo != null ? generalSearchInfo.getType() : null, "search_tips");
    }

    private final void u6(ArrayList<GeneralSearchInfo> arrayList, int i10) {
        if (PatchProxy.proxy(new Object[]{arrayList, new Integer(i10)}, this, changeQuickRedirect, false, 43188, new Class[]{ArrayList.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        MallProductObj mallProductObj = (MallProductObj) com.max.hbutils.utils.k.a(arrayList.get(i10).getInfo(), MallProductObj.class);
        if (mallProductObj != null) {
            mallProductObj.setReport_id(arrayList.get(i10).getReport_id());
        }
        if (mallProductObj != null) {
            mallProductObj.setCustom_index(arrayList.get(i10).getReport_idx());
        }
        if (mallProductObj != null) {
            mallProductObj.setCustom_suggested_from(arrayList.get(i10).getSuggested_from());
        }
        arrayList2.add(mallProductObj);
        arrayList.get(i10).setInfo(com.max.hbutils.utils.k.p(arrayList2));
    }

    private final String v6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43182, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        SearchType searchTypeB = this.U.b();
        return searchTypeB.isUnknown() ? SearchType.GENERAL.getValue() : searchTypeB.getValue();
    }

    @SuppressLint({"AutoDispose"})
    private final void w6(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 43186, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().T0(str, this.U.b().getValue(), str2, y6()).a4(io.reactivex.android.schedulers.a.c()).I5(io.reactivex.schedulers.b.d()).J5(new C0857b(str, this)));
    }

    private final Map<String, String> y6() {
        List<NewFilterObj> filters;
        NewFilterObj newFilterObj;
        String key;
        String strZ2;
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43185, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap();
        map.putAll(com.max.xiaoheihe.module.search.pagev2.e.a(this.U.b(), this.N, this.M));
        String str = this.f91699x2;
        if (str != null) {
            map.put(SearchHelper.f91579g, str);
        }
        String strU4 = U4();
        if (strU4 != null) {
            map.put("topic_id", strU4);
            if (this.U.b() == SearchType.LINK) {
                map.put("only_topic_links", this.Y != null ? String.valueOf(x6().isChecked()) : "false");
            }
        }
        map.put(w.c.R, String.valueOf(c4()));
        map.put("limit", String.valueOf(a4()));
        com.max.hbsearch.m mVarB4 = b4();
        if (mVarB4 == null || (strZ2 = mVarB4.Z2()) == null) {
            this.f91695c0 = null;
        } else {
            map.put("suggested_from", strZ2);
            this.f91695c0 = strZ2;
            com.max.hbsearch.m mVarB5 = b4();
            if (mVarB5 != null) {
                mVarB5.S(null);
            }
        }
        for (Object obj : this.Q) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            NewFilterListObj newFilterListObj = (NewFilterListObj) obj;
            String key2 = newFilterListObj.getKey();
            if (key2 != null && (filters = newFilterListObj.getFilters()) != null && (newFilterObj = filters.get(this.R.get(i10).intValue())) != null && (key = newFilterObj.getKey()) != null) {
                map.put(key2, key);
            }
            i10 = i11;
        }
        if (d5()) {
            map.put("is_pull_down", "true");
        }
        return map;
    }

    @dl.d
    public final FilterCheckedListView A6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43162, new Class[0], FilterCheckedListView.class);
        if (patchProxyResultProxy.isSupported) {
            return (FilterCheckedListView) patchProxyResultProxy.result;
        }
        FilterCheckedListView filterCheckedListView = this.W;
        if (filterCheckedListView != null) {
            return filterCheckedListView;
        }
        f0.S("filterCheckedListView");
        return null;
    }

    @dl.d
    public final View C6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43160, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.V;
        if (view != null) {
            return view;
        }
        f0.S("mFilterCheckedViewContainer");
        return null;
    }

    @dl.d
    public final ArrayList<NewFilterListObj> D6() {
        return this.Q;
    }

    @dl.d
    public final TextView E6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43168, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.Z;
        if (textView != null) {
            return textView;
        }
        f0.S("tvSelectInTopic");
        return null;
    }

    @Override // com.max.hbsearch.y0
    public void F5(@dl.d FilterButtonView anchor, @dl.e List<? extends KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{anchor, list}, this, changeQuickRedirect, false, 43177, new Class[]{FilterButtonView.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(anchor, "anchor");
        if (this.mContext.isFinishing()) {
            return;
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList<KeyDescObj> arrayList = new ArrayList(list);
        for (KeyDescObj keyDescObj : arrayList) {
            keyDescObj.setDesc(keyDescObj.getName());
        }
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.mContext, arrayList);
        heyBoxPopupMenu.R(new m(arrayList, this, anchor));
        heyBoxPopupMenu.show();
    }

    @dl.d
    public final ViewGroup G6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43164, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.X;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vgSelectInTopic");
        return null;
    }

    public final void M6(@dl.d CheckBox checkBox) {
        if (PatchProxy.proxy(new Object[]{checkBox}, this, changeQuickRedirect, false, 43167, new Class[]{CheckBox.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(checkBox, "<set-?>");
        this.Y = checkBox;
    }

    public final void N6(@dl.e com.max.xiaoheihe.module.bbs.i<t> iVar) {
        this.G2 = iVar;
    }

    public final void O6(@dl.d FilterCheckedListView filterCheckedListView) {
        if (PatchProxy.proxy(new Object[]{filterCheckedListView}, this, changeQuickRedirect, false, 43163, new Class[]{FilterCheckedListView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(filterCheckedListView, "<set-?>");
        this.W = filterCheckedListView;
    }

    public final void P6(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43161, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.V = view;
    }

    public final void Q6(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 43169, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.Z = textView;
    }

    public final void R6(@dl.d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 43165, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.X = viewGroup;
    }

    public final void T6() throws Exception {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43196, new Class[0], Void.TYPE).isSupported && isActive() && (!this.Q.isEmpty()) && (!this.R.isEmpty()) && this.R.size() == this.Q.size()) {
            com.max.hbcommon.component.o oVar = this.f91693a0;
            if (oVar == null) {
                Activity mContext = this.mContext;
                f0.o(mContext, "mContext");
                this.f91693a0 = new com.max.hbcommon.component.o(mContext, this.Q, this.R, new l());
            } else {
                f0.m(oVar);
                oVar.E(this.Q, this.R);
                com.max.hbcommon.component.o oVar2 = this.f91693a0;
                f0.m(oVar2);
                oVar2.B();
            }
            com.max.hbcommon.component.o oVar3 = this.f91693a0;
            f0.m(oVar3);
            oVar3.setCancelable(true);
            com.max.hbcommon.component.o oVar4 = this.f91693a0;
            f0.m(oVar4);
            oVar4.show();
        }
    }

    @Override // com.max.hbsearch.y0
    public void Z4() {
        com.max.hbsearch.g gVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43174, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (getParentFragment() instanceof com.max.hbsearch.g) {
            androidx.activity.result.b parentFragment = getParentFragment();
            f0.n(parentFragment, "null cannot be cast to non-null type com.max.hbsearch.ISearchTabManager");
            gVar = (com.max.hbsearch.g) parentFragment;
        } else {
            gVar = null;
        }
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        com.max.xiaoheihe.module.search.a aVar = new com.max.xiaoheihe.module.search.a(mContext, this.I, new c(), J4(), gVar, new d(), new e());
        aVar.B(this.J);
        this.K = new t(aVar);
    }

    @Override // com.max.hbsearch.y0
    public void a5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43173, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = this.mInflater.inflate(R.layout.item_filter_checked_list, (ViewGroup) P4(), false);
        f0.o(viewInflate, "mInflater.inflate(R.layo…st, mRecyclerView, false)");
        P6(viewInflate);
        View viewFindViewById = C6().findViewById(R.id.fclv);
        f0.o(viewFindViewById, "mFilterCheckedViewContai…r.findViewById(R.id.fclv)");
        O6((FilterCheckedListView) viewFindViewById);
        A6().setMListener(new g());
        View viewFindViewById2 = X4().findViewById(R.id.fbv_sort);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type com.max.hbcommon.component.FilterButtonView");
        t5((FilterButtonView) viewFindViewById2);
        View viewFindViewById3 = X4().findViewById(R.id.tl_sort_type);
        f0.n(viewFindViewById3, "null cannot be cast to non-null type com.google.android.material.tabs.TabLayout");
        this.T = (TabLayout) viewFindViewById3;
        View viewFindViewById4 = X4().findViewById(R.id.vg_select_in_topic);
        f0.o(viewFindViewById4, "sortTypeHeader.findViewB…(R.id.vg_select_in_topic)");
        R6((ViewGroup) viewFindViewById4);
        View viewFindViewById5 = X4().findViewById(R.id.cb_select_in_topic);
        f0.o(viewFindViewById5, "sortTypeHeader.findViewB…(R.id.cb_select_in_topic)");
        M6((CheckBox) viewFindViewById5);
        View viewFindViewById6 = X4().findViewById(R.id.tv_select_in_topic);
        f0.o(viewFindViewById6, "sortTypeHeader.findViewB…(R.id.tv_select_in_topic)");
        Q6((TextView) viewFindViewById6);
        ViewGroup viewGroupG6 = G6();
        viewGroupG6.setVisibility(!com.max.hbcommon.utils.c.u(U4()) && this.U.b() == SearchType.LINK ? 0 : 8);
        viewGroupG6.setOnClickListener(new h());
        if ((G6().getVisibility() == 0) && f0.g(ChannelsDetailActivity.f79607q4, T4())) {
            x6().setChecked(true);
            com.max.xiaoheihe.accelworld.l.v(E6(), R.color.text_primary_1_color);
        }
        x6().setOnCheckedChangeListener(new i());
        J6();
    }

    @Override // com.max.hbsearch.y0
    public void f5(@dl.d String sortFilter) {
        if (PatchProxy.proxy(new Object[]{sortFilter}, this, changeQuickRedirect, false, 43178, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sortFilter, "sortFilter");
        if (f0.g(sortFilter, this.N)) {
            return;
        }
        this.N = sortFilter;
        S6();
        P3(d4(), 0, a4());
    }

    @Override // com.max.hbsearch.y0
    public void h5(@dl.d String q10, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{q10, str}, this, changeQuickRedirect, false, 43176, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(q10, "q");
        if (!isAdded() || isDetached()) {
            return;
        }
        w6(q10, str);
    }

    @Override // com.max.hbsearch.k
    public int i4() {
        return 38;
    }

    @Override // com.max.hbsearch.y0, com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43171, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        getArgumentInfo();
        super.installViews(view);
        I6();
        showLoading();
    }

    @Override // com.max.hbsearch.y0
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43175, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        P4().setAdapter(this.K);
        this.G2 = new com.max.xiaoheihe.module.bbs.i<>(this, P4(), BBSLinkObj.class);
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    public void m4() {
        int iV;
        TextView textView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43193, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.m4();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(N4().getLayoutParams());
        int iF = ViewUtils.f(this.mContext, 4.0f);
        t tVar = this.K;
        if (tVar != null && tVar.A(R.layout.item_filter_checked_list)) {
            iV = iF + ViewUtils.V(C6());
            E5(true);
            Q4().i0(false);
            Q4().b0(false);
        } else {
            t tVar2 = this.K;
            if (tVar2 != null && tVar2.A(R.layout.item_search_filter_header)) {
                iV = iF + ViewUtils.V(X4());
                E5(true);
                Q4().i0(false);
                Q4().b0(false);
            } else {
                iV = 0;
            }
        }
        layoutParams.topMargin = iV;
        if (com.max.hbcommon.utils.c.u(this.f91700y1)) {
            Y4().setVisibility(8);
        } else {
            Y4().setVisibility(0);
            Y4().setText(this.f91700y1);
        }
        N4().setLayoutParams(layoutParams);
        ImageView imageView = (ImageView) N4().findViewById(R.id.iv_empty);
        if (imageView != null) {
            imageView.setImageResource(R.drawable.common_tag_common_45x45);
            imageView.setColorFilter(this.mContext.getColor(R.color.bottom_logo_color));
        }
        String str = this.f91697p2;
        if (!(!(str == null || str.length() == 0))) {
            str = null;
        }
        if (str == null || (textView = (TextView) N4().findViewById(R.id.tv_empty)) == null) {
            return;
        }
        f0.o(textView, "findViewById<TextView>(R.id.tv_empty)");
        textView.setText(str);
    }

    @Override // com.max.hbsearch.k
    public void n4(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43199, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        super.n4(str);
        this.f91699x2 = null;
    }

    @Override // com.max.hbsearch.k, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        com.max.xiaoheihe.module.search.d dVar;
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 43170, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        super.onAttach(context);
        if (getParentFragment() instanceof com.max.xiaoheihe.module.search.d) {
            androidx.activity.result.b parentFragment = getParentFragment();
            f0.n(parentFragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.search.SearchPageListener");
            dVar = (com.max.xiaoheihe.module.search.d) parentFragment;
        } else {
            if (!(context instanceof com.max.xiaoheihe.module.search.d)) {
                throw new RuntimeException(getParentFragment() + " or " + context + " must implement SearchPageListener");
            }
            dVar = (com.max.xiaoheihe.module.search.d) context;
        }
        this.L = dVar;
        if (getParentFragment() instanceof com.max.xiaoheihe.module.search.pagev2.a) {
            androidx.activity.result.b parentFragment2 = getParentFragment();
            f0.n(parentFragment2, "null cannot be cast to non-null type com.max.xiaoheihe.module.search.pagev2.OnShowHideFilterButtonListener");
            this.f91694b0 = (com.max.xiaoheihe.module.search.pagev2.a) parentFragment2;
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43172, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        com.max.hbcommon.component.o oVar = this.f91693a0;
        if (oVar != null) {
            oVar.dismiss();
        }
        H6();
    }

    @dl.d
    public final CheckBox x6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43166, new Class[0], CheckBox.class);
        if (patchProxyResultProxy.isSupported) {
            return (CheckBox) patchProxyResultProxy.result;
        }
        CheckBox checkBox = this.Y;
        if (checkBox != null) {
            return checkBox;
        }
        f0.S("cbSelectInTopic");
        return null;
    }

    @Override // com.max.hbsearch.k
    public void z4(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43179, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        super.z4(str);
        com.max.xiaoheihe.module.bbs.i<t> iVar = this.G2;
        if (iVar != null) {
            iVar.v(str);
        }
    }

    @dl.e
    public final com.max.xiaoheihe.module.bbs.i<t> z6() {
        return this.G2;
    }
}
