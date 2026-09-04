package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.shinebuttonlib.PorterShapeImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ComponentRecommendBundleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final PorterShapeImageView f110397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110403i;

    private f4(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 PorterShapeImageView porterShapeImageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f110395a = relativeLayout;
        this.f110396b = imageView;
        this.f110397c = porterShapeImageView;
        this.f110398d = textView;
        this.f110399e = textView2;
        this.f110400f = textView3;
        this.f110401g = textView4;
        this.f110402h = textView5;
        this.f110403i = linearLayout;
    }

    @androidx.annotation.n0
    public static f4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16780, new Class[]{View.class}, f4.class);
        if (patchProxyResultProxy.isSupported) {
            return (f4) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_bundle_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bundle_img);
        if (imageView != null) {
            i10 = R.id.psiv_bg;
            PorterShapeImageView porterShapeImageView = (PorterShapeImageView) l3.d.a(view, R.id.psiv_bg);
            if (porterShapeImageView != null) {
                i10 = R.id.tv_bundle_count;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_bundle_count);
                if (textView != null) {
                    i10 = R.id.tv_bundle_name;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_bundle_name);
                    if (textView2 != null) {
                        i10 = R.id.tv_discount;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_discount);
                        if (textView3 != null) {
                            i10 = R.id.tv_final_price;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_final_price);
                            if (textView4 != null) {
                                i10 = R.id.tv_initial_price;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_initial_price);
                                if (textView5 != null) {
                                    i10 = R.id.vg_price;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_price);
                                    if (linearLayout != null) {
                                        return new f4((RelativeLayout) view, imageView, porterShapeImageView, textView, textView2, textView3, textView4, textView5, linearLayout);
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
    public static f4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16778, new Class[]{LayoutInflater.class}, f4.class);
        return patchProxyResultProxy.isSupported ? (f4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static f4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16779, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f4.class);
        if (patchProxyResultProxy.isSupported) {
            return (f4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.component_recommend_bundle, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110395a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16781, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
