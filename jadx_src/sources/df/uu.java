package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemR6MapBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class uu implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f116521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116528j;

    private uu(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 View view) {
        this.f116519a = relativeLayout;
        this.f116520b = imageView;
        this.f116521c = progressBar;
        this.f116522d = textView;
        this.f116523e = textView2;
        this.f116524f = textView3;
        this.f116525g = textView4;
        this.f116526h = textView5;
        this.f116527i = textView6;
        this.f116528j = view;
    }

    @androidx.annotation.n0
    public static uu a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19536, new Class[]{View.class}, uu.class);
        if (patchProxyResultProxy.isSupported) {
            return (uu) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
        if (imageView != null) {
            i10 = R.id.pb_won_per;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_won_per);
            if (progressBar != null) {
                i10 = R.id.tv_divier;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_divier);
                if (textView != null) {
                    i10 = R.id.tv_kd;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_kd);
                    if (textView2 != null) {
                        i10 = R.id.tv_name;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                        if (textView3 != null) {
                            i10 = R.id.tv_rounds_count;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_rounds_count);
                            if (textView4 != null) {
                                i10 = R.id.tv_time_played;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_time_played);
                                if (textView5 != null) {
                                    i10 = R.id.tv_win_rate;
                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_win_rate);
                                    if (textView6 != null) {
                                        i10 = R.id.v_divider;
                                        View viewA = l3.d.a(view, R.id.v_divider);
                                        if (viewA != null) {
                                            return new uu((RelativeLayout) view, imageView, progressBar, textView, textView2, textView3, textView4, textView5, textView6, viewA);
                                        }
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
    public static uu c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19534, new Class[]{LayoutInflater.class}, uu.class);
        return patchProxyResultProxy.isSupported ? (uu) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static uu d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19535, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, uu.class);
        if (patchProxyResultProxy.isSupported) {
            return (uu) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_r6_map, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116519a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19537, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
