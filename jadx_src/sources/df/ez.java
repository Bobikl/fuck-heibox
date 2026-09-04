package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemTabAndFilterDescBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ez implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f110326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f110327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110332i;

    private ez(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 SegmentFilterView segmentFilterView, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f110324a = linearLayout;
        this.f110325b = view;
        this.f110326c = segmentFilterView;
        this.f110327d = tabLayout;
        this.f110328e = textView;
        this.f110329f = textView2;
        this.f110330g = linearLayout2;
        this.f110331h = linearLayout3;
        this.f110332i = relativeLayout;
    }

    @androidx.annotation.n0
    public static ez a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19988, new Class[]{View.class}, ez.class);
        if (patchProxyResultProxy.isSupported) {
            return (ez) patchProxyResultProxy.result;
        }
        int i10 = R.id.filter_desc_divider;
        View viewA = l3.d.a(view, R.id.filter_desc_divider);
        if (viewA != null) {
            i10 = R.id.ll_tab;
            SegmentFilterView segmentFilterView = (SegmentFilterView) l3.d.a(view, R.id.ll_tab);
            if (segmentFilterView != null) {
                i10 = R.id.tl;
                TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tl);
                if (tabLayout != null) {
                    i10 = R.id.tv_filter_desc;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_filter_desc);
                    if (textView != null) {
                        i10 = R.id.tv_reset;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_reset);
                        if (textView2 != null) {
                            i10 = R.id.vg_expand_filter;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_expand_filter);
                            if (linearLayout != null) {
                                i10 = R.id.vg_filter_card;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_filter_card);
                                if (linearLayout2 != null) {
                                    i10 = R.id.vg_sort;
                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_sort);
                                    if (relativeLayout != null) {
                                        return new ez((LinearLayout) view, viewA, segmentFilterView, tabLayout, textView, textView2, linearLayout, linearLayout2, relativeLayout);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ez c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19986, new Class[]{LayoutInflater.class}, ez.class);
        return patchProxyResultProxy.isSupported ? (ez) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ez d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19987, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ez.class);
        if (patchProxyResultProxy.isSupported) {
            return (ez) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_tab_and_filter_desc, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110324a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19989, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
