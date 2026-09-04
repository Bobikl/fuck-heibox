package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcommon.component.QRCodeShareView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemShareImageDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ny implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ScrollView f113973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final QRCodeShareView f113975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113977l;

    private ny(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ScrollView scrollView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 QRCodeShareView qRCodeShareView, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f113966a = relativeLayout;
        this.f113967b = cardView;
        this.f113968c = imageView;
        this.f113969d = imageView2;
        this.f113970e = imageView3;
        this.f113971f = view;
        this.f113972g = linearLayout;
        this.f113973h = scrollView;
        this.f113974i = textView;
        this.f113975j = qRCodeShareView;
        this.f113976k = frameLayout;
        this.f113977l = relativeLayout2;
    }

    @androidx.annotation.n0
    public static ny a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19920, new Class[]{View.class}, ny.class);
        if (patchProxyResultProxy.isSupported) {
            return (ny) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv);
        if (cardView != null) {
            i10 = R.id.iv_bottom;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bottom);
            if (imageView != null) {
                i10 = R.id.iv_bottom_logo;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_bottom_logo);
                if (imageView2 != null) {
                    i10 = R.id.iv_img;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_img);
                    if (imageView3 != null) {
                        i10 = R.id.iv_mask;
                        View viewA = l3.d.a(view, R.id.iv_mask);
                        if (viewA != null) {
                            i10 = R.id.ll_share_content;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_share_content);
                            if (linearLayout != null) {
                                i10 = R.id.sv;
                                ScrollView scrollView = (ScrollView) l3.d.a(view, R.id.sv);
                                if (scrollView != null) {
                                    i10 = R.id.tv_bottom_desc;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_bottom_desc);
                                    if (textView != null) {
                                        i10 = R.id.v_qr_code;
                                        QRCodeShareView qRCodeShareView = (QRCodeShareView) l3.d.a(view, R.id.v_qr_code);
                                        if (qRCodeShareView != null) {
                                            i10 = R.id.vg_bottom_logo;
                                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bottom_logo);
                                            if (frameLayout != null) {
                                                i10 = R.id.vg_custom_view_container;
                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_custom_view_container);
                                                if (relativeLayout != null) {
                                                    return new ny((RelativeLayout) view, cardView, imageView, imageView2, imageView3, viewA, linearLayout, scrollView, textView, qRCodeShareView, frameLayout, relativeLayout);
                                                }
                                            }
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
    public static ny c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19918, new Class[]{LayoutInflater.class}, ny.class);
        return patchProxyResultProxy.isSupported ? (ny) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ny d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19919, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ny.class);
        if (patchProxyResultProxy.isSupported) {
            return (ny) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_share_image_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113966a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19921, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
