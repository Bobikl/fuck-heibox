package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.max.hbcommon.component.QRCodeShareView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentShareMyPcDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class nb implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ScrollView f113785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final QRCodeShareView f113787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113789k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113791m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113792n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113793o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113794p;

    private nb(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 ScrollView scrollView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 QRCodeShareView qRCodeShareView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f113779a = relativeLayout;
        this.f113780b = imageView;
        this.f113781c = imageView2;
        this.f113782d = imageView3;
        this.f113783e = linearLayout;
        this.f113784f = relativeLayout2;
        this.f113785g = scrollView;
        this.f113786h = textView;
        this.f113787i = qRCodeShareView;
        this.f113788j = linearLayout2;
        this.f113789k = linearLayout3;
        this.f113790l = linearLayout4;
        this.f113791m = linearLayout5;
        this.f113792n = linearLayout6;
        this.f113793o = linearLayout7;
        this.f113794p = relativeLayout3;
    }

    @androidx.annotation.n0
    public static nb a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17540, new Class[]{View.class}, nb.class);
        if (patchProxyResultProxy.isSupported) {
            return (nb) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
        if (imageView != null) {
            i10 = R.id.iv_user_avatar;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_user_avatar);
            if (imageView2 != null) {
                i10 = R.id.iv_window_close;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_window_close);
                if (imageView3 != null) {
                    i10 = R.id.ll_share_content;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_share_content);
                    if (linearLayout != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i10 = R.id.sv;
                        ScrollView scrollView = (ScrollView) l3.d.a(view, R.id.sv);
                        if (scrollView != null) {
                            i10 = R.id.tv_user_name;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_user_name);
                            if (textView != null) {
                                i10 = R.id.v_qr_code;
                                QRCodeShareView qRCodeShareView = (QRCodeShareView) l3.d.a(view, R.id.v_qr_code);
                                if (qRCodeShareView != null) {
                                    i10 = R.id.vg_share_media;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_share_media);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.vg_share_qq;
                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_share_qq);
                                        if (linearLayout3 != null) {
                                            i10 = R.id.vg_share_save;
                                            LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_share_save);
                                            if (linearLayout4 != null) {
                                                i10 = R.id.vg_share_sina;
                                                LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_share_sina);
                                                if (linearLayout5 != null) {
                                                    i10 = R.id.vg_share_weixin;
                                                    LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_share_weixin);
                                                    if (linearLayout6 != null) {
                                                        i10 = R.id.vg_share_weixin_circle;
                                                        LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_share_weixin_circle);
                                                        if (linearLayout7 != null) {
                                                            i10 = R.id.vg_user;
                                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_user);
                                                            if (relativeLayout2 != null) {
                                                                return new nb(relativeLayout, imageView, imageView2, imageView3, linearLayout, relativeLayout, scrollView, textView, qRCodeShareView, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, relativeLayout2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static nb c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17538, new Class[]{LayoutInflater.class}, nb.class);
        return patchProxyResultProxy.isSupported ? (nb) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static nb d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17539, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, nb.class);
        if (patchProxyResultProxy.isSupported) {
            return (nb) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_share_my_pc_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113779a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17541, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
