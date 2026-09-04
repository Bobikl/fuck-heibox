package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameStoreDailySalesBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hn implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final k60 f111484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f111487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111491i;

    private hn(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 k60 k60Var, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f111483a = relativeLayout;
        this.f111484b = k60Var;
        this.f111485c = imageView;
        this.f111486d = imageView2;
        this.f111487e = progressBar;
        this.f111488f = textView;
        this.f111489g = textView2;
        this.f111490h = textView3;
        this.f111491i = linearLayout;
    }

    @androidx.annotation.n0
    public static hn a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18760, new Class[]{View.class}, hn.class);
        if (patchProxyResultProxy.isSupported) {
            return (hn) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_img;
        View viewA = l3.d.a(view, R.id.cv_img);
        if (viewA != null) {
            k60 k60VarA = k60.a(viewA);
            i10 = R.id.iv_purchase;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_purchase);
            if (imageView != null) {
                i10 = R.id.iv_scrim;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_scrim);
                if (imageView2 != null) {
                    i10 = R.id.pb_progress;
                    ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_progress);
                    if (progressBar != null) {
                        i10 = R.id.tv_name;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                        if (textView != null) {
                            i10 = R.id.tv_progress_desc;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_progress_desc);
                            if (textView2 != null) {
                                i10 = R.id.tv_purchase;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_purchase);
                                if (textView3 != null) {
                                    i10 = R.id.vg_purchase;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_purchase);
                                    if (linearLayout != null) {
                                        return new hn((RelativeLayout) view, k60VarA, imageView, imageView2, progressBar, textView, textView2, textView3, linearLayout);
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
    public static hn c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18758, new Class[]{LayoutInflater.class}, hn.class);
        return patchProxyResultProxy.isSupported ? (hn) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hn d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18759, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hn.class);
        if (patchProxyResultProxy.isSupported) {
            return (hn) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_store_daily_sales, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111483a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18761, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
