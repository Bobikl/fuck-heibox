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

/* JADX INFO: compiled from: ItemMiniprogramAddedBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class tq implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116056f;

    private tq(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view) {
        this.f116051a = relativeLayout;
        this.f116052b = imageView;
        this.f116053c = imageView2;
        this.f116054d = imageView3;
        this.f116055e = textView;
        this.f116056f = view;
    }

    @androidx.annotation.n0
    public static tq a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19120, new Class[]{View.class}, tq.class);
        if (patchProxyResultProxy.isSupported) {
            return (tq) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
        if (imageView != null) {
            i10 = R.id.iv_logo;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_logo);
            if (imageView2 != null) {
                i10 = R.id.iv_red_dot;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_red_dot);
                if (imageView3 != null) {
                    i10 = R.id.tv_name;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                    if (textView != null) {
                        i10 = R.id.v_background;
                        View viewA = l3.d.a(view, R.id.v_background);
                        if (viewA != null) {
                            return new tq((RelativeLayout) view, imageView, imageView2, imageView3, textView, viewA);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static tq c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19118, new Class[]{LayoutInflater.class}, tq.class);
        return patchProxyResultProxy.isSupported ? (tq) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static tq d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19119, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, tq.class);
        if (patchProxyResultProxy.isSupported) {
            return (tq) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_miniprogram_added, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116051a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19121, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
