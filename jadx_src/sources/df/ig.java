package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptRecNewsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ig implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f111797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BannerViewPager f111798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f111799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.f f111800d;

    private ig(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 BannerViewPager bannerViewPager, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 mb.f fVar) {
        this.f111797a = cardView;
        this.f111798b = bannerViewPager;
        this.f111799c = id0Var;
        this.f111800d = fVar;
    }

    @androidx.annotation.n0
    public static ig a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18039, new Class[]{View.class}, ig.class);
        if (patchProxyResultProxy.isSupported) {
            return (ig) patchProxyResultProxy.result;
        }
        int i10 = R.id.banner;
        BannerViewPager bannerViewPager = (BannerViewPager) l3.d.a(view, R.id.banner);
        if (bannerViewPager != null) {
            i10 = R.id.divider;
            View viewA = l3.d.a(view, R.id.divider);
            if (viewA != null) {
                id0 id0VarA = id0.a(viewA);
                View viewA2 = l3.d.a(view, R.id.vg_title);
                if (viewA2 != null) {
                    return new ig((CardView) view, bannerViewPager, id0VarA, mb.f.a(viewA2));
                }
                i10 = R.id.vg_title;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ig c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18037, new Class[]{LayoutInflater.class}, ig.class);
        return patchProxyResultProxy.isSupported ? (ig) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ig d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18038, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ig.class);
        if (patchProxyResultProxy.isSupported) {
            return (ig) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_rec_news, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f111797a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18040, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
