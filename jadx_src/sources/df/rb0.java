package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.android.material.tabs.TabLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutTopicChooseNewEntryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rb0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConsecutiveScrollerLayout f115169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f115172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager2 f115175g;

    private rb0(@androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 ViewPager2 viewPager2) {
        this.f115169a = consecutiveScrollerLayout;
        this.f115170b = recyclerView;
        this.f115171c = recyclerView2;
        this.f115172d = tabLayout;
        this.f115173e = textView;
        this.f115174f = view;
        this.f115175g = viewPager2;
    }

    @androidx.annotation.n0
    public static rb0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21277, new Class[]{View.class}, rb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (rb0) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_topic_recommend4you;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_topic_recommend4you);
        if (recyclerView != null) {
            i10 = R.id.rv_topic_search;
            RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_topic_search);
            if (recyclerView2 != null) {
                i10 = R.id.tab_topic_section;
                TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tab_topic_section);
                if (tabLayout != null) {
                    i10 = R.id.tv_topic_recommend4you_w500;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_topic_recommend4you_w500);
                    if (textView != null) {
                        i10 = R.id.v_topic_recommend4you_divider;
                        View viewA = l3.d.a(view, R.id.v_topic_recommend4you_divider);
                        if (viewA != null) {
                            i10 = R.id.vp2_topic_section;
                            ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, R.id.vp2_topic_section);
                            if (viewPager2 != null) {
                                return new rb0((ConsecutiveScrollerLayout) view, recyclerView, recyclerView2, tabLayout, textView, viewA, viewPager2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static rb0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21275, new Class[]{LayoutInflater.class}, rb0.class);
        return patchProxyResultProxy.isSupported ? (rb0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static rb0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21276, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, rb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (rb0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_topic_choose_new_entry, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConsecutiveScrollerLayout b() {
        return this.f115169a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21278, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
