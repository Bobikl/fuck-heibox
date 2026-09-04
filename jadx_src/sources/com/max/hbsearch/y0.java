package com.max.hbsearch;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.WikiObj;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbsearch.bean.SearchHotwordObj;
import com.max.hbsearch.bean.SearchHotwordsObj;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: SinglePageSearchFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class y0 extends k {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private WikiObj A;
    private boolean B;

    @dl.e
    private String C;

    @dl.e
    private String D;

    @dl.e
    private final BannerViewPager<AdsBannerObj> E;
    private int F;
    protected View G;
    private boolean H;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected SmartRefreshLayout f72393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected RecyclerView f72394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected LinearLayout f72395s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected TextView f72396t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected FilterButtonView f72397u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private String f72398v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.e
    private String f72399w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.e
    private String f72400x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.e
    private String f72401y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.e
    private Map<String, String> f72402z;

    /* JADX INFO: compiled from: SinglePageSearchFragment.kt */
    public static final class a extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            m mVarB4;
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.f33750o6, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
            if (i11 <= 0 || (mVarB4 = y0.this.b4()) == null) {
                return;
            }
            mVarB4.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C5(y0 this$0, ng.j it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, bb.c.k.f33658k6, new Class[]{y0.class, ng.j.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(it, "it");
        if (!com.max.hbcommon.utils.c.u(this$0.d4())) {
            this$0.H = true;
            this$0.P3(this$0.d4(), 0, this$0.a4());
        } else {
            this$0.r4(0);
            this$0.p4(30);
            this$0.H5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D5(y0 this$0, ng.j it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, bb.c.k.f33681l6, new Class[]{y0.class, ng.j.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(it, "it");
        if (!com.max.hbcommon.utils.c.u(this$0.d4())) {
            this$0.P3(this$0.d4(), this$0.c4() + this$0.a4(), this$0.a4());
            return;
        }
        this$0.r4(this$0.c4() + this$0.a4());
        this$0.p4(30);
        this$0.H5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G5(ArrayList showList, y0 this$0, FilterButtonView anchor, View view, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{showList, this$0, anchor, view, keyDescObj}, null, changeQuickRedirect, true, bb.c.k.f33704m6, new Class[]{ArrayList.class, y0.class, FilterButtonView.class, View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(showList, "$showList");
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(anchor, "$anchor");
        Iterator it = showList.iterator();
        while (it.hasNext()) {
            KeyDescObj keyDescObj2 = (KeyDescObj) it.next();
            keyDescObj2.setChecked(kotlin.jvm.internal.f0.g(keyDescObj.getValue(), keyDescObj2.getValue()));
        }
        kotlin.jvm.internal.f0.m(keyDescObj);
        this$0.g5(keyDescObj, anchor);
        String value = keyDescObj.getValue();
        kotlin.jvm.internal.f0.o(value, "getValue(...)");
        this$0.f5(value);
    }

    private final void H4(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.R5, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.srl);
        kotlin.jvm.internal.f0.o(viewFindViewById, "findViewById(...)");
        r5((SmartRefreshLayout) viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.rv);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "findViewById(...)");
        q5((RecyclerView) viewFindViewById2);
        View viewFindViewById3 = view.findViewById(R.id.ll_no_result);
        kotlin.jvm.internal.f0.o(viewFindViewById3, "findViewById(...)");
        o5((LinearLayout) viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.tv_search_tips);
        kotlin.jvm.internal.f0.o(viewFindViewById4, "findViewById(...)");
        A5((TextView) viewFindViewById4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J5(y0 this$0, List list, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, list, view}, null, changeQuickRedirect, true, bb.c.k.f33727n6, new Class[]{y0.class, List.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.F5(this$0.S4(), list);
    }

    private final void c5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33566g6, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = this.mInflater.inflate(R.layout.item_search_filter_header, (ViewGroup) P4(), false);
        kotlin.jvm.internal.f0.o(viewInflate, "inflate(...)");
        z5(viewInflate);
    }

    private final void g5(KeyDescObj keyDescObj, FilterButtonView filterButtonView) {
        if (PatchProxy.proxy(new Object[]{keyDescObj, filterButtonView}, this, changeQuickRedirect, false, 8213, new Class[]{KeyDescObj.class, FilterButtonView.class}, Void.TYPE).isSupported) {
            return;
        }
        filterButtonView.setText(keyDescObj.getName());
    }

    public static /* synthetic */ void i5(y0 y0Var, String str, String str2, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{y0Var, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.k.f33635j6, new Class[]{y0.class, String.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchContent");
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        y0Var.h5(str, str2);
    }

    public final void A5(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 8196, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.f72396t = textView;
    }

    public final void B5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.S5, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Q4().setVisibility(0);
        Q4().S(new pg.d() { // from class: com.max.hbsearch.v0
            @Override // pg.d
            public final void k(ng.j jVar) {
                y0.C5(this.f72385b, jVar);
            }
        });
        Q4().f0(new pg.b() { // from class: com.max.hbsearch.w0
            @Override // pg.b
            public final void f(ng.j jVar) {
                y0.D5(this.f72388b, jVar);
            }
        });
    }

    public final void E5(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 8210, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Q4().setVisibility(z10 ? 0 : 8);
    }

    public void F5(@dl.d final FilterButtonView anchor, @dl.e List<? extends KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{anchor, list}, this, changeQuickRedirect, false, 8214, new Class[]{FilterButtonView.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(anchor, "anchor");
        if (this.mContext.isFinishing() || list == null || !(!list.isEmpty())) {
            return;
        }
        final ArrayList<KeyDescObj> arrayList = new ArrayList(list);
        for (KeyDescObj keyDescObj : arrayList) {
            keyDescObj.setDesc(keyDescObj.getName());
        }
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.mContext, arrayList);
        heyBoxPopupMenu.R(new HeyBoxPopupMenu.h() { // from class: com.max.hbsearch.u0
            @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
            public final void a(View view, KeyDescObj keyDescObj2) {
                y0.G5(arrayList, this, anchor, view, keyDescObj2);
            }
        });
        heyBoxPopupMenu.show();
    }

    public void H5() {
    }

    public final int I4() {
        return this.F;
    }

    public final void I5(@dl.e final List<? extends KeyDescObj> list) {
        KeyDescObj keyDescObj;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.f33543f6, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i4() != 5 && i4() != 38 && i4() != 19 && i4() != 20) || list == null || list.size() <= 0) {
            S4().setVisibility(8);
            return;
        }
        S4().setVisibility(0);
        if (com.max.hbcommon.utils.c.u(this.D)) {
            keyDescObj = list.get(0);
            keyDescObj.setChecked(true);
        } else {
            keyDescObj = null;
            for (KeyDescObj keyDescObj2 : list) {
                if (kotlin.text.u.M1(this.D, keyDescObj2.getValue(), false, 2, null)) {
                    keyDescObj2.setChecked(true);
                    keyDescObj = keyDescObj2;
                } else {
                    keyDescObj2.setChecked(false);
                }
            }
        }
        if (keyDescObj != null) {
            g5(keyDescObj, S4());
        }
        S4().setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y0.J5(this.f72390b, list, view);
            }
        });
    }

    @dl.e
    public final BannerViewPager<AdsBannerObj> J4() {
        return this.E;
    }

    @dl.e
    public final String K4() {
        return this.C;
    }

    @dl.e
    public final String L4() {
        return this.f72400x;
    }

    @dl.e
    public final String M4() {
        return this.f72399w;
    }

    @dl.d
    public final LinearLayout N4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8193, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f72395s;
        if (linearLayout != null) {
            return linearLayout;
        }
        kotlin.jvm.internal.f0.S("mNoResultLinearLayout");
        return null;
    }

    public final boolean O4() {
        return this.B;
    }

    @Override // com.max.hbsearch.k
    public void P3(@dl.e String str, int i10, int i11) {
        Object[] objArr = {str, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 8208, new Class[]{String.class, cls, cls}, Void.TYPE).isSupported || !isAdded() || isDetached()) {
            return;
        }
        r4(i10);
        p4(i11);
        clearCompositeDisposable();
        if (com.max.hbcommon.utils.c.u(str)) {
            s4("");
            e5();
            N4().setVisibility(8);
        } else {
            s4(str);
            if (c4() == 0) {
                P4().scrollToPosition(0);
            }
            z4(e4());
            kotlin.jvm.internal.f0.m(str);
            h5(str, e4());
        }
        this.H = false;
    }

    @dl.d
    public final RecyclerView P4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8191, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.f72394r;
        if (recyclerView != null) {
            return recyclerView;
        }
        kotlin.jvm.internal.f0.S("mRecyclerView");
        return null;
    }

    @dl.d
    public final SmartRefreshLayout Q4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.E5, new Class[0], SmartRefreshLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (SmartRefreshLayout) patchProxyResultProxy.result;
        }
        SmartRefreshLayout smartRefreshLayout = this.f72393q;
        if (smartRefreshLayout != null) {
            return smartRefreshLayout;
        }
        kotlin.jvm.internal.f0.S("mRefreshLayout");
        return null;
    }

    @dl.e
    public final String R4() {
        return this.D;
    }

    @dl.d
    public final FilterButtonView S4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8197, new Class[0], FilterButtonView.class);
        if (patchProxyResultProxy.isSupported) {
            return (FilterButtonView) patchProxyResultProxy.result;
        }
        FilterButtonView filterButtonView = this.f72397u;
        if (filterButtonView != null) {
            return filterButtonView;
        }
        kotlin.jvm.internal.f0.S("mSortView");
        return null;
    }

    @dl.e
    public final String T4() {
        return this.f72401y;
    }

    @dl.e
    public final String U4() {
        return this.f72398v;
    }

    @dl.e
    public final Map<String, String> V4() {
        return this.f72402z;
    }

    @dl.e
    public final WikiObj W4() {
        return this.A;
    }

    @dl.d
    public final View X4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8199, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.G;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.f0.S("sortTypeHeader");
        return null;
    }

    @dl.d
    public final TextView Y4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8195, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f72396t;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("tv_search_tips");
        return null;
    }

    @Override // com.max.hbsearch.k
    @dl.e
    public List<SearchHotwordObj> Z3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33589h6, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        SearchHotwordsObj searchHotwordsObj = o.f72358b;
        if (searchHotwordsObj != null) {
            return searchHotwordsObj.getList();
        }
        return null;
    }

    public abstract void Z4();

    public abstract void a5();

    public final void b5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.T5, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        P4().setBackgroundResource(R.color.background_card_1_color);
        P4().setLayoutManager(new LinearLayoutManager(this.mContext));
        P4().setPadding(0, ViewUtils.f(this.mContext, 4.0f), 0, ViewUtils.f(this.mContext, 4.0f));
        P4().setClipToPadding(false);
        P4().setClipChildren(false);
        P4().clearOnScrollListeners();
        P4().addOnScrollListener(new a());
    }

    public final boolean d5() {
        return this.H;
    }

    public void e5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8209, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E5(false);
    }

    public void f5(@dl.d String sortFilter) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{sortFilter}, this, changeQuickRedirect, false, 8215, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(sortFilter, "sortFilter");
        if (kotlin.jvm.internal.f0.g(sortFilter, this.D)) {
            z10 = false;
        } else {
            this.D = sortFilter;
        }
        if (z10) {
            P3(d4(), 0, a4());
        }
    }

    public abstract void h5(@dl.d String str, @dl.e String str2);

    @Override // com.max.hbcommon.base.d
    public void initData() {
        String strR;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.W5, new Class[0], Void.TYPE).isSupported || b4() == null) {
            return;
        }
        m mVarB4 = b4();
        if (com.max.hbcommon.utils.c.u(mVarB4 != null ? mVarB4.r() : null)) {
            s4("");
            e5();
            N4().setVisibility(8);
            return;
        }
        m mVarB5 = b4();
        if (mVarB5 != null && (strR = mVarB5.r()) != null && kotlin.text.u.L1(strR, d4(), true)) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        m mVarB6 = b4();
        s4(mVarB6 != null ? mVarB6.r() : null);
        m mVarB7 = b4();
        t4(mVarB7 != null ? mVarB7.x3() : null);
        O3(d4());
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        HashMap map;
        WikiObj wikiObj;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 8201, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.hbsearch_fragment_single_search);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.B = arguments.getBoolean(l.f72320a0, false);
            this.f72398v = arguments.getString("topic_id");
            this.f72399w = arguments.getString("hashtag_name");
            this.f72400x = arguments.getString(l.f72324c0);
            this.f72401y = arguments.getString(l.W);
            Serializable serializable = arguments.getSerializable(l.X);
            if (serializable != null) {
                kotlin.jvm.internal.f0.n(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
                map = (HashMap) serializable;
            } else {
                map = new HashMap();
            }
            this.f72402z = map;
            Serializable serializable2 = arguments.getSerializable("wiki");
            if (serializable2 != null) {
                kotlin.jvm.internal.f0.n(serializable2, "null cannot be cast to non-null type com.max.hbcommon.bean.WikiObj");
                wikiObj = (WikiObj) serializable2;
            } else {
                wikiObj = null;
            }
            this.A = wikiObj;
        }
        if (this.f72402z == null) {
            this.f72402z = new HashMap(16);
        }
        this.F = ViewUtils.f(this.mContext, 0.5f);
        kotlin.jvm.internal.f0.m(view);
        H4(view);
        b5();
        c5();
        a5();
        Z4();
        j5();
        B5();
        H5();
    }

    @Override // com.max.hbcommon.base.d
    public boolean isNotPage() {
        return true;
    }

    @Override // com.max.hbsearch.k
    @dl.d
    public String j4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33612i6, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strE = com.max.hbcommon.utils.l.e(R.string.search_all_hint);
        kotlin.jvm.internal.f0.o(strE, "getString(...)");
        return strE;
    }

    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8205, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        P4().setAdapter(null);
    }

    public final void k5(int i10) {
        this.F = i10;
    }

    @Override // com.max.hbsearch.k
    public void l4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8211, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Q4().A(0);
        Q4().p(0);
    }

    public final void l5(@dl.e String str) {
        this.C = str;
    }

    @Override // com.max.hbcommon.base.d
    public void loadData() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.V5, new Class[0], Void.TYPE).isSupported && this.mIsPrepared && this.mIsVisible) {
            initData();
        }
    }

    @Override // com.max.hbsearch.k
    public void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8212, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E5(false);
        N4().setVisibility(0);
        View viewFindViewById = N4().findViewById(R.id.iv_empty);
        kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        View viewFindViewById2 = N4().findViewById(R.id.tv_empty);
        kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((ImageView) viewFindViewById).setImageResource(R.drawable.common_tag_search_error_45x45);
        ((TextView) viewFindViewById2).setText(String.format(getString(R.string.no_result_about_account), d4()));
    }

    public final void m5(@dl.e String str) {
        this.f72400x = str;
    }

    public final void n5(@dl.e String str) {
        this.f72399w = str;
    }

    public final void o5(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 8194, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(linearLayout, "<set-?>");
        this.f72395s = linearLayout;
    }

    public final void p5(boolean z10) {
        this.B = z10;
    }

    public final void q5(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 8192, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(recyclerView, "<set-?>");
        this.f72394r = recyclerView;
    }

    public final void r5(@dl.d SmartRefreshLayout smartRefreshLayout) {
        if (PatchProxy.proxy(new Object[]{smartRefreshLayout}, this, changeQuickRedirect, false, bb.c.k.F5, new Class[]{SmartRefreshLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(smartRefreshLayout, "<set-?>");
        this.f72393q = smartRefreshLayout;
    }

    public final void s5(@dl.e String str) {
        this.D = str;
    }

    public final void t5(@dl.d FilterButtonView filterButtonView) {
        if (PatchProxy.proxy(new Object[]{filterButtonView}, this, changeQuickRedirect, false, bb.c.k.N5, new Class[]{FilterButtonView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(filterButtonView, "<set-?>");
        this.f72397u = filterButtonView;
    }

    public final void u5(@dl.e String str) {
        this.f72401y = str;
    }

    public final void v5(@dl.e String str) {
        this.f72398v = str;
    }

    public final void w5(@dl.e Map<String, String> map) {
        this.f72402z = map;
    }

    public final void x5(@dl.e WikiObj wikiObj) {
        this.A = wikiObj;
    }

    public final void y5(boolean z10) {
        this.H = z10;
    }

    public final void z5(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 8200, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "<set-?>");
        this.G = view;
    }
}
