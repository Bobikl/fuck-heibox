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

/* JADX INFO: compiled from: ItemR6WeaponBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hv implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111532g;

    private hv(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view) {
        this.f111526a = relativeLayout;
        this.f111527b = imageView;
        this.f111528c = textView;
        this.f111529d = textView2;
        this.f111530e = textView3;
        this.f111531f = textView4;
        this.f111532g = view;
    }

    @androidx.annotation.n0
    public static hv a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19588, new Class[]{View.class}, hv.class);
        if (patchProxyResultProxy.isSupported) {
            return (hv) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
        if (imageView != null) {
            i10 = R.id.tv_headshot;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_headshot);
            if (textView != null) {
                i10 = R.id.tv_hit_ratio;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_hit_ratio);
                if (textView2 != null) {
                    i10 = R.id.tv_k;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_k);
                    if (textView3 != null) {
                        i10 = R.id.tv_name;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                        if (textView4 != null) {
                            i10 = R.id.v_divider;
                            View viewA = l3.d.a(view, R.id.v_divider);
                            if (viewA != null) {
                                return new hv((RelativeLayout) view, imageView, textView, textView2, textView3, textView4, viewA);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static hv c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19586, new Class[]{LayoutInflater.class}, hv.class);
        return patchProxyResultProxy.isSupported ? (hv) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hv d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19587, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hv.class);
        if (patchProxyResultProxy.isSupported) {
            return (hv) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_r6_weapon, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111526a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19589, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
