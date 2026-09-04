package com.max.hbsearch;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.max.hbsearch.bean.WelcomePageList;
import com.max.hbsearch.config.HotWordTypeV2;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: HotSearchSliceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.jvm.internal.t0({"SMAP\nHotSearchSliceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotSearchSliceImpl.kt\ncom/max/hbsearch/HotSearchSliceImpl\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,190:1\n254#2,2:191\n254#2,2:193\n254#2,2:195\n254#2,2:197\n*S KotlinDebug\n*F\n+ 1 HotSearchSliceImpl.kt\ncom/max/hbsearch/HotSearchSliceImpl\n*L\n54#1:191,2\n58#1:193,2\n61#1:195,2\n64#1:197,2\n*E\n"})
public final class c implements e {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f72277e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final String f72278f = "hot_search_view";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private com.max.hbsearch.adapter.d f72279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final List<WelcomePageList> f72280c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private n f72281d;

    /* JADX INFO: compiled from: HotSearchSliceImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: HotSearchSliceImpl.kt */
    public static final class b implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.e TabLayout.h hVar) {
            View viewG;
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, bb.c.k.E1, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported || hVar == null || (viewG = hVar.g()) == null) {
                return;
            }
            if (kotlin.jvm.internal.f0.g(viewG.getTag(), c.f72278f)) {
                ImageView imageView = viewG instanceof ImageView ? (ImageView) viewG : null;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.heybox_search_red_3x);
                    return;
                }
                return;
            }
            TextView textView = viewG instanceof TextView ? (TextView) viewG : null;
            if (textView != null) {
                d.a(textView, true);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.e TabLayout.h hVar) {
            View viewG;
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, bb.c.k.F1, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported || hVar == null || (viewG = hVar.g()) == null) {
                return;
            }
            if (kotlin.jvm.internal.f0.g(viewG.getTag(), c.f72278f)) {
                ImageView imageView = viewG instanceof ImageView ? (ImageView) viewG : null;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.heybox_search_gary_3x);
                    return;
                }
                return;
            }
            TextView textView = viewG instanceof TextView ? (TextView) viewG : null;
            if (textView != null) {
                d.a(textView, false);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.e TabLayout.h hVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(c this$0, Context context, TabLayout.h tab, int i10) {
        if (PatchProxy.proxy(new Object[]{this$0, context, tab, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.D1, new Class[]{c.class, Context.class, TabLayout.h.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(tab, "tab");
        View viewC = this$0.c(context, i10);
        if (viewC != null) {
            tab.v(viewC);
        }
    }

    private final View c(Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.B1, new Class[]{Context.class, Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        WelcomePageList welcomePageList = (WelcomePageList) CollectionsKt___CollectionsKt.R2(this.f72280c, i10);
        if (welcomePageList == null) {
            return null;
        }
        if (kotlin.jvm.internal.f0.g(welcomePageList.is_hot(), Boolean.TRUE)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewUtils.f(context, 75.0f), ViewUtils.f(context, 14.0f));
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setTag(f72278f);
            imageView.setPadding(0, 0, ViewUtils.f(context, 16.0f), 0);
            imageView.setImageResource(R.drawable.heybox_search_red_3x);
            return imageView;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, ViewUtils.f(context, 20.0f));
        TextView textView = new TextView(context);
        textView.setLayoutParams(layoutParams2);
        WelcomePageList welcomePageList2 = (WelcomePageList) CollectionsKt___CollectionsKt.R2(this.f72280c, i10);
        textView.setText(welcomePageList2 != null ? welcomePageList2.getHead_text() : null);
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        textView.setPadding(0, 0, ViewUtils.f(context, 16.0f), 0);
        d.a(textView, false);
        return textView;
    }

    @Override // com.max.hbsearch.e
    public void J2(@dl.e ViewGroup viewGroup, @dl.e final Context context) {
        if (PatchProxy.proxy(new Object[]{viewGroup, context}, this, changeQuickRedirect, false, bb.c.k.A1, new Class[]{ViewGroup.class, Context.class}, Void.TYPE).isSupported || viewGroup == null || context == null) {
            return;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) viewGroup.findViewById(R.id.nsv_hot_search_v3);
        kotlin.jvm.internal.f0.m(nestedScrollView);
        nestedScrollView.setVisibility(0);
        nestedScrollView.setNestedScrollingEnabled(true);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.ll_hot_search_v3);
        kotlin.jvm.internal.f0.m(linearLayout);
        linearLayout.setVisibility(0);
        View viewFindViewById = viewGroup.findViewById(R.id.v_top_space_hot_search_v3);
        kotlin.jvm.internal.f0.m(viewFindViewById);
        viewFindViewById.setVisibility(0);
        Space space = (Space) viewGroup.findViewById(R.id.space_hot_search_v3);
        kotlin.jvm.internal.f0.m(space);
        space.setVisibility(0);
        TabLayout tabLayout = (TabLayout) viewGroup.findViewById(R.id.hot_type_tab);
        ViewPager2 viewPager2 = (ViewPager2) viewGroup.findViewById(R.id.vp_hot_search);
        com.max.hbsearch.adapter.d dVar = new com.max.hbsearch.adapter.d(context, this.f72280c, this.f72281d);
        this.f72279b = dVar;
        viewPager2.setAdapter(dVar);
        new com.google.android.material.tabs.d(tabLayout, viewPager2, true, true, new com.google.android.material.tabs.d.b() { // from class: com.max.hbsearch.b
            @Override // com.google.android.material.tabs.d.b
            public final void a(TabLayout.h hVar, int i10) {
                c.b(this.f72274a, context, hVar, i10);
            }
        }).a();
        tabLayout.setSelectedTabIndicator(new ColorDrawable(0));
        tabLayout.h(new b());
    }

    @Override // com.max.hbsearch.e
    public boolean L2(@dl.e SearchNewFragment.ContainerConfig containerConfig) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{containerConfig}, this, changeQuickRedirect, false, bb.c.k.f33967y1, new Class[]{SearchNewFragment.ContainerConfig.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        boolean zJ = (containerConfig != null ? containerConfig.n() : null) != HotWordTypeV2.MALL ? o.j() : false;
        Log.d("HotSearchSliceImpl-dbg", "[isSupportNewHotSearchWelcomePage] " + zJ);
        return zJ;
    }

    @Override // com.max.hbsearch.e
    public void c2(@dl.d n searchHost) {
        if (PatchProxy.proxy(new Object[]{searchHost}, this, changeQuickRedirect, false, bb.c.k.f33989z1, new Class[]{n.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(searchHost, "searchHost");
        this.f72281d = searchHost;
    }

    @Override // com.max.hbsearch.e
    public void w1(@dl.e List<WelcomePageList> list) {
        List listN2;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.C1, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list != null && (listN2 = CollectionsKt___CollectionsKt.n2(list)) != null) {
            this.f72280c.addAll(listN2);
        }
        com.max.hbsearch.adapter.d dVar = this.f72279b;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }
}
