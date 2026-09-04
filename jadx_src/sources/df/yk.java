package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.HeyBoxTabLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameListFilterBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yk implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f117984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxTabLayout f117987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117989g;

    private yk(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 HeyBoxTabLayout heyBoxTabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f117983a = relativeLayout;
        this.f117984b = oVar;
        this.f117985c = view;
        this.f117986d = relativeLayout2;
        this.f117987e = heyBoxTabLayout;
        this.f117988f = textView;
        this.f117989g = textView2;
    }

    @androidx.annotation.n0
    public static yk a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18517, new Class[]{View.class}, yk.class);
        if (patchProxyResultProxy.isSupported) {
            return (yk) patchProxyResultProxy.result;
        }
        int i10 = R.id.filter_divider;
        View viewA = l3.d.a(view, R.id.filter_divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.iv_filter_mask;
            View viewA2 = l3.d.a(view, R.id.iv_filter_mask);
            if (viewA2 != null) {
                i10 = R.id.rv_filter;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rv_filter);
                if (relativeLayout != null) {
                    i10 = R.id.tl_sort_type;
                    HeyBoxTabLayout heyBoxTabLayout = (HeyBoxTabLayout) l3.d.a(view, R.id.tl_sort_type);
                    if (heyBoxTabLayout != null) {
                        i10 = R.id.tv_filter;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_filter);
                        if (textView != null) {
                            i10 = R.id.tv_filter_desc;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_filter_desc);
                            if (textView2 != null) {
                                return new yk((RelativeLayout) view, oVarA, viewA2, relativeLayout, heyBoxTabLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static yk c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18515, new Class[]{LayoutInflater.class}, yk.class);
        return patchProxyResultProxy.isSupported ? (yk) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yk d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18516, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yk.class);
        if (patchProxyResultProxy.isSupported) {
            return (yk) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_list_filter, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117983a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18518, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
