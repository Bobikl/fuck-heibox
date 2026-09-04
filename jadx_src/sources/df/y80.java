package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.QRCodeShareView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutPostCommentShareBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y80 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f117835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final QRCodeShareView f117838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117840k;

    private y80(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 QRCodeShareView qRCodeShareView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f117830a = relativeLayout;
        this.f117831b = imageView;
        this.f117832c = imageView2;
        this.f117833d = imageView3;
        this.f117834e = imageView4;
        this.f117835f = expressionTextView;
        this.f117836g = textView;
        this.f117837h = textView2;
        this.f117838i = qRCodeShareView;
        this.f117839j = linearLayout;
        this.f117840k = relativeLayout2;
    }

    @androidx.annotation.n0
    public static y80 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20998, new Class[]{View.class}, y80.class);
        if (patchProxyResultProxy.isSupported) {
            return (y80) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_avatar;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
        if (imageView != null) {
            i10 = R.id.iv_bg;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_bg);
            if (imageView2 != null) {
                i10 = R.id.iv_image;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_image);
                if (imageView3 != null) {
                    i10 = R.id.iv_title;
                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_title);
                    if (imageView4 != null) {
                        i10 = R.id.tv_comment;
                        ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_comment);
                        if (expressionTextView != null) {
                            i10 = R.id.tv_name;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                            if (textView != null) {
                                i10 = R.id.tv_title;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                                if (textView2 != null) {
                                    i10 = R.id.v_qr_code;
                                    QRCodeShareView qRCodeShareView = (QRCodeShareView) l3.d.a(view, R.id.v_qr_code);
                                    if (qRCodeShareView != null) {
                                        i10 = R.id.vg_comment;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_comment);
                                        if (linearLayout != null) {
                                            i10 = R.id.vg_content;
                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_content);
                                            if (relativeLayout != null) {
                                                return new y80((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, expressionTextView, textView, textView2, qRCodeShareView, linearLayout, relativeLayout);
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
    public static y80 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20996, new Class[]{LayoutInflater.class}, y80.class);
        return patchProxyResultProxy.isSupported ? (y80) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static y80 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20997, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, y80.class);
        if (patchProxyResultProxy.isSupported) {
            return (y80) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_post_comment_share, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117830a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20999, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
