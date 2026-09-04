package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentConsoleGameGlobalPricesBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f115114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioGroup f115115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115117f;

    private r7(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 RadioGroup radioGroup, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f115112a = relativeLayout;
        this.f115113b = imageView;
        this.f115114c = progressBar;
        this.f115115d = radioGroup;
        this.f115116e = recyclerView;
        this.f115117f = linearLayout;
    }

    @androidx.annotation.n0
    public static r7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17140, new Class[]{View.class}, r7.class);
        if (patchProxyResultProxy.isSupported) {
            return (r7) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_window_close;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_window_close);
        if (imageView != null) {
            i10 = R.id.progress;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.progress);
            if (progressBar != null) {
                i10 = R.id.rg_filter;
                RadioGroup radioGroup = (RadioGroup) l3.d.a(view, R.id.rg_filter);
                if (radioGroup != null) {
                    i10 = R.id.rv_game_global_prices;
                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_game_global_prices);
                    if (recyclerView != null) {
                        i10 = R.id.vg_content;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_content);
                        if (linearLayout != null) {
                            return new r7((RelativeLayout) view, imageView, progressBar, radioGroup, recyclerView, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static r7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17138, new Class[]{LayoutInflater.class}, r7.class);
        return patchProxyResultProxy.isSupported ? (r7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17139, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r7.class);
        if (patchProxyResultProxy.isSupported) {
            return (r7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_console_game_global_prices, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115112a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17141, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
