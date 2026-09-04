package com.max.hbsearch;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbsearch.bean.SearchHotwordObj;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: SearchAbstractFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class k extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private m f72299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private String f72300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f72301d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private String f72303f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private String f72311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private LinearLayout f72312o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private n f72313p;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f72302e = 30;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final String f72304g = "1";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final String f72305h = "2";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final String f72306i = "0";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final String f72307j = "0";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final String f72308k = "1";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final String f72309l = "2";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final String f72310m = "3";

    /* JADX INFO: compiled from: SearchAbstractFragment.kt */
    public static final class a extends com.max.hbcommon.network.d<List<? extends KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f72314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f72315c;

        a(String str, k kVar) {
            this.f72314b = str;
            this.f72315c = kVar;
        }

        public void a(@dl.d List<? extends KeyDescObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.W1, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            List listT5 = CollectionsKt___CollectionsKt.T5(result);
            kotlin.jvm.internal.f0.m(listT5);
            super.onNext(listT5);
            Iterator it = listT5.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.f0.g(this.f72314b, ((KeyDescObj) it.next()).getValue())) {
                    it.remove();
                }
            }
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setKey(System.currentTimeMillis() + "");
            keyDescObj.setValue(this.f72314b);
            listT5.add(0, keyDescObj);
            com.max.hbcache.b.j("search_history", this.f72315c.f4(), listT5);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.V1, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            super.onError(e10);
            ArrayList arrayList = new ArrayList();
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setKey(System.currentTimeMillis() + "");
            keyDescObj.setValue(this.f72314b);
            arrayList.add(keyDescObj);
            com.max.hbcache.b.j("search_history", this.f72315c.f4(), arrayList);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 8000, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((List) obj);
        }
    }

    /* JADX INFO: compiled from: SearchAbstractFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<List<? extends KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void a(@dl.d List<? extends KeyDescObj> result) {
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 8001, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (k.this.isActive()) {
                List listT5 = CollectionsKt___CollectionsKt.T5(result);
                Iterator it = listT5.iterator();
                while (it.hasNext()) {
                    if (System.currentTimeMillis() - com.max.hbutils.utils.n.r(((KeyDescObj) it.next()).getKey()) > 604800000) {
                        it.remove();
                        z10 = true;
                    }
                }
                if (z10) {
                    com.max.hbcache.b.j("search_history", k.this.f4(), listT5);
                }
                k.this.A4(result);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 8002, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((List) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B4(k this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.T1, new Class[]{k.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.o4();
        this$0.A4(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C4(k this$0, String str, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, str, view}, null, changeQuickRedirect, true, bb.c.k.U1, new Class[]{k.class, String.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        n nVar = this$0.f72313p;
        if (nVar != null) {
            n.a.b(nVar, new KeyDescObj(str), null, 2, null);
        }
    }

    public final void A4(@dl.e List<? extends KeyDescObj> list) {
        int i10;
        byte b10;
        int i11 = 0;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.O1, new Class[]{List.class}, Void.TYPE).isSupported || this.f72312o == null) {
            return;
        }
        if (list == null || list.size() <= 0) {
            LinearLayout linearLayout = this.f72312o;
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
            return;
        }
        LinearLayout linearLayout2 = this.f72312o;
        if (linearLayout2 != null) {
            linearLayout2.removeAllViews();
        }
        View viewInflate = this.mInflater.inflate(R.layout.hbsearch_item_search_history_header, (ViewGroup) this.f72312o, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int iF = ViewUtils.f(this.mContext, 12.0f);
        marginLayoutParams.rightMargin = iF;
        marginLayoutParams.leftMargin = iF;
        viewInflate.setLayoutParams(marginLayoutParams);
        viewInflate.findViewById(R.id.vg_clear).setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.B4(this.f72291b, view);
            }
        });
        LinearLayout linearLayout3 = this.f72312o;
        if (linearLayout3 != null) {
            linearLayout3.addView(viewInflate);
        }
        int iF2 = ViewUtils.f(this.mContext, 12.0f);
        int iF3 = ViewUtils.f(this.mContext, 10.0f);
        int iF4 = ViewUtils.f(this.mContext, 59.0f);
        int iF5 = ViewUtils.f(this.mContext, 26.0f);
        int iL = ViewUtils.L(this.mContext) - (iF2 * 2);
        LinearLayout linearLayout4 = new LinearLayout(this.mContext);
        linearLayout4.setOrientation(0);
        int i12 = -2;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(iF2, 0, iF2, iF3);
        linearLayout4.setLayoutParams(layoutParams2);
        LinearLayout linearLayout5 = this.f72312o;
        if (linearLayout5 != null) {
            linearLayout5.addView(linearLayout4);
        }
        int size = list.size();
        int i13 = 0;
        int iMax = 0;
        while (i13 < size) {
            final String value = list.get(i13).getValue();
            TextView textView = new TextView(this.mContext);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i12, i12);
            layoutParams3.gravity = 16;
            if (i13 == 0) {
                layoutParams3.setMargins(i11, i11, i11, i11);
            } else {
                layoutParams3.setMargins(iF3, i11, i11, i11);
            }
            textView.setLayoutParams(layoutParams3);
            textView.setMinWidth(iF4);
            textView.setMinHeight(iF5);
            textView.setGravity(17);
            textView.setTextSize(i11, getResources().getDimensionPixelSize(R.dimen.text_size_13));
            textView.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
            textView.setPadding(iF3, ViewUtils.f(this.mContext, 3.0f), iF3, ViewUtils.f(this.mContext, 3.0f));
            textView.setBackgroundDrawable(getResources().getDrawable(R.drawable.btn_reference_2dp));
            textView.setText(value);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k.C4(this.f72294b, value, view);
                }
            });
            float f10 = iF3 * 2;
            int iMax2 = Math.max((int) (ViewUtils.S(textView.getPaint(), value) + f10), iF4);
            if (i13 != 0) {
                iMax2 += iF2;
            }
            iMax += iMax2;
            if (iMax > iL) {
                linearLayout4 = new LinearLayout(this.mContext);
                linearLayout4.setOrientation(0);
                i10 = -2;
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.setMargins(iF2, 0, iF2, iF3);
                linearLayout4.setLayoutParams(layoutParams4);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                linearLayout4.addView(textView);
                LinearLayout linearLayout6 = this.f72312o;
                if (linearLayout6 != null) {
                    linearLayout6.addView(linearLayout4);
                }
                iMax = Math.max((int) (ViewUtils.S(textView.getPaint(), value) + f10), iF4);
                b10 = -1;
            } else {
                i10 = -2;
                b10 = -1;
                linearLayout4.addView(textView);
            }
            i13++;
            i12 = i10;
            iF5 = iF5;
            i11 = 0;
        }
        LinearLayout linearLayout7 = this.f72312o;
        if (linearLayout7 == null) {
            return;
        }
        linearLayout7.setVisibility(0);
    }

    public final void N3(@dl.d String q10) {
        if (PatchProxy.proxy(new Object[]{q10}, this, changeQuickRedirect, false, bb.c.k.Q1, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(q10, "q");
        if (com.max.hbcommon.utils.c.u(q10)) {
            return;
        }
        com.max.hbcache.b.g("search_history", this.f72311n, KeyDescObj.class).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new a(q10, this));
    }

    public final void O3(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.K1, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        P3(str, 0, 30);
    }

    public abstract void P3(@dl.e String str, int i10, int i11);

    public final void Q3(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.L1, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        m mVar = this.f72299b;
        if (mVar != null) {
            mVar.g(str);
        }
        showContentView();
        l4();
    }

    @dl.d
    public final String R3() {
        return this.f72306i;
    }

    @dl.d
    public final String S3() {
        return this.f72305h;
    }

    @dl.d
    public final String T3() {
        return this.f72304g;
    }

    @dl.d
    public final String U3() {
        return this.f72307j;
    }

    @dl.d
    public final String V3() {
        return this.f72309l;
    }

    @dl.d
    public final String W3() {
        return this.f72310m;
    }

    @dl.d
    public final String X3() {
        return this.f72308k;
    }

    @dl.e
    public String Y3() {
        return this.f72311n;
    }

    @dl.e
    public abstract List<SearchHotwordObj> Z3();

    public final int a4() {
        return this.f72302e;
    }

    @dl.e
    public final m b4() {
        return this.f72299b;
    }

    public final int c4() {
        return this.f72301d;
    }

    @dl.e
    public final String d4() {
        return this.f72300c;
    }

    @dl.e
    public final String e4() {
        return this.f72303f;
    }

    @dl.e
    public final String f4() {
        return this.f72311n;
    }

    @dl.e
    public final LinearLayout g4() {
        return this.f72312o;
    }

    @dl.e
    public final n h4() {
        return this.f72313p;
    }

    @kotlin.k(message = "烂代码，逐渐删除")
    public abstract int i4();

    @dl.d
    public abstract String j4();

    public final void k4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.P1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.hbcache.b.g("search_history", this.f72311n, KeyDescObj.class).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    public abstract void l4();

    public abstract void m4();

    public void n4(@dl.e String str) {
    }

    public final void o4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.R1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.b.j("search_history", this.f72311n, new ArrayList());
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        m mVar;
        n nVar;
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.k.I1, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        super.onAttach(context);
        if (getParentFragment() instanceof m) {
            androidx.activity.result.b parentFragment = getParentFragment();
            kotlin.jvm.internal.f0.n(parentFragment, "null cannot be cast to non-null type com.max.hbsearch.SearchEventListener");
            mVar = (m) parentFragment;
        } else {
            if (!(context instanceof m)) {
                throw new RuntimeException(getParentFragment() + " or " + context + " must implement SearchEventListener");
            }
            mVar = (m) context;
        }
        this.f72299b = mVar;
        if (getParentFragment() instanceof n) {
            androidx.activity.result.b parentFragment2 = getParentFragment();
            kotlin.jvm.internal.f0.n(parentFragment2, "null cannot be cast to non-null type com.max.hbsearch.SearchHost");
            nVar = (n) parentFragment2;
        } else {
            nVar = context instanceof n ? (n) context : null;
        }
        this.f72313p = nVar;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.J1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f72299b = null;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.N1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
        m mVar = this.f72299b;
        if ((mVar != null ? mVar.r() : null) == null || this.f72311n == null) {
            return;
        }
        m mVar2 = this.f72299b;
        kotlin.jvm.internal.f0.m(mVar2);
        String strR = mVar2.r();
        kotlin.jvm.internal.f0.m(strR);
        N3(strR);
    }

    public final void p4(int i10) {
        this.f72302e = i10;
    }

    public final void q4(@dl.e m mVar) {
        this.f72299b = mVar;
    }

    public final void r4(int i10) {
        this.f72301d = i10;
    }

    public final void s4(@dl.e String str) {
        this.f72300c = str;
    }

    public final void t4(@dl.e String str) {
        this.f72303f = str;
    }

    public final void u4(@dl.e String str) {
        this.f72311n = str;
    }

    public final void v4(@dl.e LinearLayout linearLayout) {
        this.f72312o = linearLayout;
    }

    public final void w4(@dl.e n nVar) {
        this.f72313p = nVar;
    }

    public final void x4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.S1, new Class[0], Void.TYPE).isSupported && isActive()) {
            showLoading();
        }
    }

    public final void y4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.M1, new Class[0], Void.TYPE).isSupported && isAdded()) {
            m4();
        }
    }

    public void z4(@dl.e String str) {
        this.f72303f = str;
    }
}
