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

/* JADX INFO: compiled from: DialogPushLowestPriceBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111278h;

    private h6(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f111271a = relativeLayout;
        this.f111272b = imageView;
        this.f111273c = imageView2;
        this.f111274d = textView;
        this.f111275e = textView2;
        this.f111276f = textView3;
        this.f111277g = relativeLayout2;
        this.f111278h = relativeLayout3;
    }

    @androidx.annotation.n0
    public static h6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16996, new Class[]{View.class}, h6.class);
        if (patchProxyResultProxy.isSupported) {
            return (h6) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_close;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
        if (imageView != null) {
            i10 = R.id.iv_img;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
            if (imageView2 != null) {
                i10 = R.id.tv_confirm;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_confirm);
                if (textView != null) {
                    i10 = R.id.tv_desc;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView2 != null) {
                        i10 = R.id.tv_title;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_title);
                        if (textView3 != null) {
                            i10 = R.id.vg_confirm;
                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_confirm);
                            if (relativeLayout != null) {
                                RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                return new h6(relativeLayout2, imageView, imageView2, textView, textView2, textView3, relativeLayout, relativeLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static h6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16994, new Class[]{LayoutInflater.class}, h6.class);
        return patchProxyResultProxy.isSupported ? (h6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16995, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h6.class);
        if (patchProxyResultProxy.isSupported) {
            return (h6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_push_lowest_price, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111271a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16997, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
