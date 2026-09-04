package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameStoreItemHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class jn implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f112220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.v f112221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.f f112223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final w70 f112224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final pq f112225h;

    private jn(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 SegmentFilterView segmentFilterView, @androidx.annotation.n0 mb.v vVar, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 mb.f fVar, @androidx.annotation.n0 w70 w70Var, @androidx.annotation.n0 pq pqVar) {
        this.f112218a = linearLayout;
        this.f112219b = linearLayout2;
        this.f112220c = segmentFilterView;
        this.f112221d = vVar;
        this.f112222e = linearLayout3;
        this.f112223f = fVar;
        this.f112224g = w70Var;
        this.f112225h = pqVar;
    }

    @androidx.annotation.n0
    public static jn a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18768, new Class[]{View.class}, jn.class);
        if (patchProxyResultProxy.isSupported) {
            return (jn) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_daily_sales;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_daily_sales);
        if (linearLayout != null) {
            i10 = R.id.ll_tab;
            SegmentFilterView segmentFilterView = (SegmentFilterView) l3.d.a(view, R.id.ll_tab);
            if (segmentFilterView != null) {
                i10 = R.id.vg_banner;
                View viewA = l3.d.a(view, R.id.vg_banner);
                if (viewA != null) {
                    mb.v vVarA = mb.v.a(viewA);
                    i10 = R.id.vg_daily_sales;
                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_daily_sales);
                    if (linearLayout2 != null) {
                        i10 = R.id.vg_daily_sales_title;
                        View viewA2 = l3.d.a(view, R.id.vg_daily_sales_title);
                        if (viewA2 != null) {
                            mb.f fVarA = mb.f.a(viewA2);
                            i10 = R.id.vg_member_card;
                            View viewA3 = l3.d.a(view, R.id.vg_member_card);
                            if (viewA3 != null) {
                                w70 w70VarA = w70.a(viewA3);
                                i10 = R.id.vg_menu_container;
                                View viewA4 = l3.d.a(view, R.id.vg_menu_container);
                                if (viewA4 != null) {
                                    return new jn((LinearLayout) view, linearLayout, segmentFilterView, vVarA, linearLayout2, fVarA, w70VarA, pq.a(viewA4));
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
    public static jn c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18766, new Class[]{LayoutInflater.class}, jn.class);
        return patchProxyResultProxy.isSupported ? (jn) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static jn d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18767, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, jn.class);
        if (patchProxyResultProxy.isSupported) {
            return (jn) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_store_item_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112218a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18769, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
