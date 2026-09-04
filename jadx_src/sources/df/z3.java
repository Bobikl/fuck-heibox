package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ComponentGameSaleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f118178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f118181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118186i;

    private z3(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5) {
        this.f118178a = cardView;
        this.f118179b = imageView;
        this.f118180c = imageView2;
        this.f118181d = progressBar;
        this.f118182e = textView;
        this.f118183f = textView2;
        this.f118184g = textView3;
        this.f118185h = textView4;
        this.f118186i = textView5;
    }

    @androidx.annotation.n0
    public static z3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16756, new Class[]{View.class}, z3.class);
        if (patchProxyResultProxy.isSupported) {
            return (z3) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_buy;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_buy);
        if (imageView != null) {
            i10 = R.id.iv_img;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
            if (imageView2 != null) {
                i10 = R.id.pb_progress;
                ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_progress);
                if (progressBar != null) {
                    i10 = R.id.tv_heybox_origin_price;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_heybox_origin_price);
                    if (textView != null) {
                        i10 = R.id.tv_heybox_price;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_heybox_price);
                        if (textView2 != null) {
                            i10 = R.id.tv_heybox_price_symbol;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_heybox_price_symbol);
                            if (textView3 != null) {
                                i10 = R.id.tv_name;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                if (textView4 != null) {
                                    i10 = R.id.tv_progress_desc;
                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_progress_desc);
                                    if (textView5 != null) {
                                        return new z3((CardView) view, imageView, imageView2, progressBar, textView, textView2, textView3, textView4, textView5);
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
    public static z3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16754, new Class[]{LayoutInflater.class}, z3.class);
        return patchProxyResultProxy.isSupported ? (z3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16755, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z3.class);
        if (patchProxyResultProxy.isSupported) {
            return (z3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.component_game_sale, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f118178a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16757, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
