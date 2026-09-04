package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGridLayoutXBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yn implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f118006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118007j;

    private yn(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f117998a = relativeLayout;
        this.f117999b = imageView;
        this.f118000c = imageView2;
        this.f118001d = imageView3;
        this.f118002e = textView;
        this.f118003f = textView2;
        this.f118004g = textView3;
        this.f118005h = textView4;
        this.f118006i = view;
        this.f118007j = relativeLayout2;
    }

    @androidx.annotation.n0
    public static yn a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18828, new Class[]{View.class}, yn.class);
        if (patchProxyResultProxy.isSupported) {
            return (yn) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_help_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_help_icon);
        if (imageView != null) {
            i10 = R.id.iv_item_grid_layout_icon;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_item_grid_layout_icon);
            if (imageView2 != null) {
                i10 = R.id.iv_item_grid_layout_tips;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_item_grid_layout_tips);
                if (imageView3 != null) {
                    i10 = R.id.tv_item_grid_layout_desc;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_item_grid_layout_desc);
                    if (textView != null) {
                        i10 = R.id.tv_item_grid_layout_secondary_value;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_item_grid_layout_secondary_value);
                        if (textView2 != null) {
                            i10 = R.id.tv_item_grid_layout_value;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_item_grid_layout_value);
                            if (textView3 != null) {
                                i10 = R.id.tv_score;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_score);
                                if (textView4 != null) {
                                    i10 = R.id.v_item_grid_layout_divider;
                                    View viewA = l3.d.a(view, R.id.v_item_grid_layout_divider);
                                    if (viewA != null) {
                                        i10 = R.id.vg_item_grid_layout_value_wrapper;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_item_grid_layout_value_wrapper);
                                        if (relativeLayout != null) {
                                            return new yn((RelativeLayout) view, imageView, imageView2, imageView3, textView, textView2, textView3, textView4, viewA, relativeLayout);
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
    public static yn c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18826, new Class[]{LayoutInflater.class}, yn.class);
        return patchProxyResultProxy.isSupported ? (yn) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yn d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18827, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yn.class);
        if (patchProxyResultProxy.isSupported) {
            return (yn) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_grid_layout_x, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117998a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18829, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
