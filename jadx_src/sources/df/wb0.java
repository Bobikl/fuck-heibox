package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutUserBbsInfoHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wb0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f117122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewStub f117124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final oo f117126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final oo f117127g;

    private wb0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 SegmentFilterView segmentFilterView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 ViewStub viewStub, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 oo ooVar, @androidx.annotation.n0 oo ooVar2) {
        this.f117121a = linearLayout;
        this.f117122b = segmentFilterView;
        this.f117123c = recyclerView;
        this.f117124d = viewStub;
        this.f117125e = linearLayout2;
        this.f117126f = ooVar;
        this.f117127g = ooVar2;
    }

    @androidx.annotation.n0
    public static wb0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21297, new Class[]{View.class}, wb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (wb0) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_tab;
        SegmentFilterView segmentFilterView = (SegmentFilterView) l3.d.a(view, R.id.ll_tab);
        if (segmentFilterView != null) {
            i10 = R.id.rv_post_compilation;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_post_compilation);
            if (recyclerView != null) {
                i10 = R.id.stub_author_banner;
                ViewStub viewStub = (ViewStub) l3.d.a(view, R.id.stub_author_banner);
                if (viewStub != null) {
                    i10 = R.id.vg_home_menu;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_home_menu);
                    if (linearLayout != null) {
                        i10 = R.id.vg_menu_creator_studio;
                        View viewA = l3.d.a(view, R.id.vg_menu_creator_studio);
                        if (viewA != null) {
                            oo ooVarA = oo.a(viewA);
                            i10 = R.id.vg_menu_right;
                            View viewA2 = l3.d.a(view, R.id.vg_menu_right);
                            if (viewA2 != null) {
                                return new wb0((LinearLayout) view, segmentFilterView, recyclerView, viewStub, linearLayout, ooVarA, oo.a(viewA2));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static wb0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21295, new Class[]{LayoutInflater.class}, wb0.class);
        return patchProxyResultProxy.isSupported ? (wb0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wb0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21296, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (wb0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_user_bbs_info_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117121a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21298, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
