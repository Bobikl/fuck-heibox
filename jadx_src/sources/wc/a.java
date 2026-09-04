package wc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hblayout.hbstore.HBAutoRotateFrameLayout;
import com.max.hblayout.hbstore.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import l3.c;
import l3.d;

/* JADX INFO: compiled from: HbLStoreItemMenuStoreBinding.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f141028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final HBAutoRotateFrameLayout f141029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f141030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f141031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f141032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final TextView f141033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final TextView f141034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final RelativeLayout f141035h;

    private a(@n0 RelativeLayout relativeLayout, @n0 HBAutoRotateFrameLayout hBAutoRotateFrameLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 RelativeLayout relativeLayout2) {
        this.f141028a = relativeLayout;
        this.f141029b = hBAutoRotateFrameLayout;
        this.f141030c = imageView;
        this.f141031d = imageView2;
        this.f141032e = textView;
        this.f141033f = textView2;
        this.f141034g = textView3;
        this.f141035h = relativeLayout2;
    }

    @n0
    public static a a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.g.f32818ef, new Class[]{View.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        int i10 = R.id.fl_auto_rotate_container;
        HBAutoRotateFrameLayout hBAutoRotateFrameLayout = (HBAutoRotateFrameLayout) d.a(view, i10);
        if (hBAutoRotateFrameLayout != null) {
            i10 = R.id.iv_button_time;
            ImageView imageView = (ImageView) d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.iv_img;
                ImageView imageView2 = (ImageView) d.a(view, i10);
                if (imageView2 != null) {
                    i10 = R.id.tv_badge;
                    TextView textView = (TextView) d.a(view, i10);
                    if (textView != null) {
                        i10 = R.id.tv_desc;
                        TextView textView2 = (TextView) d.a(view, i10);
                        if (textView2 != null) {
                            i10 = R.id.tv_tipsbox;
                            TextView textView3 = (TextView) d.a(view, i10);
                            if (textView3 != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                return new a(relativeLayout, hBAutoRotateFrameLayout, imageView, imageView2, textView, textView2, textView3, relativeLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static a c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.g.f32778cf, new Class[]{LayoutInflater.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static a d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.g.f32798df, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hb_l_store_item_menu_store, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f141028a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32838ff, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
