package xc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.flexbox.FlexboxLayout;
import com.max.hblogistics.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HblogisticsItemChooseAddressHeaderBinding.java */
/* JADX INFO: loaded from: classes11.dex */
public final class f implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final LinearLayout f141215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final FlexboxLayout f141216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final FlexboxLayout f141217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f141218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f141219e;

    private f(@n0 LinearLayout linearLayout, @n0 FlexboxLayout flexboxLayout, @n0 FlexboxLayout flexboxLayout2, @n0 ImageView imageView, @n0 TextView textView) {
        this.f141215a = linearLayout;
        this.f141216b = flexboxLayout;
        this.f141217c = flexboxLayout2;
        this.f141218d = imageView;
        this.f141219e = textView;
    }

    @n0
    public static f a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.g.f32881hi, new Class[]{View.class}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        int i10 = R.id.fl_popular_city;
        FlexboxLayout flexboxLayout = (FlexboxLayout) l3.d.a(view, i10);
        if (flexboxLayout != null) {
            i10 = R.id.fl_selected;
            FlexboxLayout flexboxLayout2 = (FlexboxLayout) l3.d.a(view, i10);
            if (flexboxLayout2 != null) {
                i10 = R.id.iv_close;
                ImageView imageView = (ImageView) l3.d.a(view, i10);
                if (imageView != null) {
                    i10 = R.id.tv_choose_desc;
                    TextView textView = (TextView) l3.d.a(view, i10);
                    if (textView != null) {
                        return new f((LinearLayout) view, flexboxLayout, flexboxLayout2, imageView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static f c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.g.f32841fi, new Class[]{LayoutInflater.class}, f.class);
        return patchProxyResultProxy.isSupported ? (f) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static f d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.g.f32861gi, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hblogistics_item_choose_address_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public LinearLayout b() {
        return this.f141215a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32900ii, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
