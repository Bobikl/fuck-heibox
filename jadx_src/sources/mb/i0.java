package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbcustomview.EZTabLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemTitleBarHomeBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class i0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f131569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final EZTabLayout f131576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f131578j;

    private i0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 EZTabLayout eZTabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f131569a = relativeLayout;
        this.f131570b = imageView;
        this.f131571c = imageView2;
        this.f131572d = imageView3;
        this.f131573e = imageView4;
        this.f131574f = imageView5;
        this.f131575g = imageView6;
        this.f131576h = eZTabLayout;
        this.f131577i = textView;
        this.f131578j = relativeLayout2;
    }

    @androidx.annotation.n0
    public static i0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f31718b8, new Class[]{View.class}, i0.class);
        if (patchProxyResultProxy.isSupported) {
            return (i0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_home_mobile;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.iv_home_msg;
            ImageView imageView2 = (ImageView) l3.d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.iv_home_scan;
                ImageView imageView3 = (ImageView) l3.d.a(view, i10);
                if (imageView3 != null) {
                    i10 = R.id.iv_home_search;
                    ImageView imageView4 = (ImageView) l3.d.a(view, i10);
                    if (imageView4 != null) {
                        i10 = R.id.iv_point_home_mobile;
                        ImageView imageView5 = (ImageView) l3.d.a(view, i10);
                        if (imageView5 != null) {
                            i10 = R.id.iv_point_home_msg;
                            ImageView imageView6 = (ImageView) l3.d.a(view, i10);
                            if (imageView6 != null) {
                                i10 = R.id.tl_home;
                                EZTabLayout eZTabLayout = (EZTabLayout) l3.d.a(view, i10);
                                if (eZTabLayout != null) {
                                    i10 = R.id.tv_title;
                                    TextView textView = (TextView) l3.d.a(view, i10);
                                    if (textView != null) {
                                        RelativeLayout relativeLayout = (RelativeLayout) view;
                                        return new i0(relativeLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, eZTabLayout, textView, relativeLayout);
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
    public static i0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.Z7, new Class[]{LayoutInflater.class}, i0.class);
        return patchProxyResultProxy.isSupported ? (i0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static i0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f31701a8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i0.class);
        if (patchProxyResultProxy.isSupported) {
            return (i0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_title_bar_home, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f131569a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31735c8, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
