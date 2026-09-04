package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemHeyboxPopupMenuBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f131502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f131503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131507f;

    private c0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f131502a = relativeLayout;
        this.f131503b = view;
        this.f131504c = imageView;
        this.f131505d = imageView2;
        this.f131506e = textView;
        this.f131507f = textView2;
    }

    @androidx.annotation.n0
    public static c0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.D7, new Class[]{View.class}, c0.class);
        if (patchProxyResultProxy.isSupported) {
            return (c0) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, i10);
        if (viewA != null) {
            i10 = R.id.iv_checked;
            ImageView imageView = (ImageView) l3.d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.iv_click_arrow;
                ImageView imageView2 = (ImageView) l3.d.a(view, i10);
                if (imageView2 != null) {
                    i10 = R.id.tv_desc;
                    TextView textView = (TextView) l3.d.a(view, i10);
                    if (textView != null) {
                        i10 = R.id.tv_sub_desc;
                        TextView textView2 = (TextView) l3.d.a(view, i10);
                        if (textView2 != null) {
                            return new c0((RelativeLayout) view, viewA, imageView, imageView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static c0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.B7, new Class[]{LayoutInflater.class}, c0.class);
        return patchProxyResultProxy.isSupported ? (c0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.C7, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c0.class);
        if (patchProxyResultProxy.isSupported) {
            return (c0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_heybox_popup_menu, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f131502a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3968, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
