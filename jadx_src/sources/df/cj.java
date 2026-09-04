package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemFeedsExpressNewsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cj implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109444c;

    private cj(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f109442a = linearLayout;
        this.f109443b = linearLayout2;
        this.f109444c = relativeLayout;
    }

    @androidx.annotation.n0
    public static cj a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18327, new Class[]{View.class}, cj.class);
        if (patchProxyResultProxy.isSupported) {
            return (cj) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_express_links;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_express_links);
        if (linearLayout != null) {
            i10 = R.id.vg_title;
            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_title);
            if (relativeLayout != null) {
                return new cj((LinearLayout) view, linearLayout, relativeLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static cj c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18325, new Class[]{LayoutInflater.class}, cj.class);
        return patchProxyResultProxy.isSupported ? (cj) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static cj d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18326, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, cj.class);
        if (patchProxyResultProxy.isSupported) {
            return (cj) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_feeds_express_news, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109442a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18328, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
