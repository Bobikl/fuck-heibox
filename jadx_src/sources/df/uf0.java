package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewGameDetailScroeStarRatingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class uf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f116411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f116412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f116413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f116414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f116415f;

    private uf0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 ProgressBar progressBar2, @androidx.annotation.n0 ProgressBar progressBar3, @androidx.annotation.n0 ProgressBar progressBar4, @androidx.annotation.n0 ProgressBar progressBar5) {
        this.f116410a = linearLayout;
        this.f116411b = progressBar;
        this.f116412c = progressBar2;
        this.f116413d = progressBar3;
        this.f116414e = progressBar4;
        this.f116415f = progressBar5;
    }

    @androidx.annotation.n0
    public static uf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21702, new Class[]{View.class}, uf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (uf0) patchProxyResultProxy.result;
        }
        int i10 = R.id.pb_star_1;
        ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_star_1);
        if (progressBar != null) {
            i10 = R.id.pb_star_2;
            ProgressBar progressBar2 = (ProgressBar) l3.d.a(view, R.id.pb_star_2);
            if (progressBar2 != null) {
                i10 = R.id.pb_star_3;
                ProgressBar progressBar3 = (ProgressBar) l3.d.a(view, R.id.pb_star_3);
                if (progressBar3 != null) {
                    i10 = R.id.pb_star_4;
                    ProgressBar progressBar4 = (ProgressBar) l3.d.a(view, R.id.pb_star_4);
                    if (progressBar4 != null) {
                        i10 = R.id.pb_star_5;
                        ProgressBar progressBar5 = (ProgressBar) l3.d.a(view, R.id.pb_star_5);
                        if (progressBar5 != null) {
                            return new uf0((LinearLayout) view, progressBar, progressBar2, progressBar3, progressBar4, progressBar5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static uf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21700, new Class[]{LayoutInflater.class}, uf0.class);
        return patchProxyResultProxy.isSupported ? (uf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static uf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21701, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, uf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (uf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_detail_scroe_star_rating, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116410a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21703, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
