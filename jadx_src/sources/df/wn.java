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

/* JADX INFO: compiled from: ItemGridLayoutBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wn implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117224h;

    private wn(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f117217a = relativeLayout;
        this.f117218b = imageView;
        this.f117219c = imageView2;
        this.f117220d = textView;
        this.f117221e = textView2;
        this.f117222f = textView3;
        this.f117223g = textView4;
        this.f117224h = relativeLayout2;
    }

    @androidx.annotation.n0
    public static wn a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18820, new Class[]{View.class}, wn.class);
        if (patchProxyResultProxy.isSupported) {
            return (wn) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_item_grid_layout_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_item_grid_layout_icon);
        if (imageView != null) {
            i10 = R.id.iv_item_grid_layout_tips;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_item_grid_layout_tips);
            if (imageView2 != null) {
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
                                i10 = R.id.vg_item_grid_layout_value_wrapper;
                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_item_grid_layout_value_wrapper);
                                if (relativeLayout != null) {
                                    return new wn((RelativeLayout) view, imageView, imageView2, textView, textView2, textView3, textView4, relativeLayout);
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
    public static wn c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18818, new Class[]{LayoutInflater.class}, wn.class);
        return patchProxyResultProxy.isSupported ? (wn) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wn d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18819, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wn.class);
        if (patchProxyResultProxy.isSupported) {
            return (wn) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_grid_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117217a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18821, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
