package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemHotLinksBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class uo implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f116491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f116494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116497i;

    private uo(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f116489a = relativeLayout;
        this.f116490b = imageView;
        this.f116491c = qMUIRadiusImageView;
        this.f116492d = textView;
        this.f116493e = textView2;
        this.f116494f = gradientTextView;
        this.f116495g = textView3;
        this.f116496h = relativeLayout2;
        this.f116497i = relativeLayout3;
    }

    @androidx.annotation.n0
    public static uo a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18916, new Class[]{View.class}, uo.class);
        if (patchProxyResultProxy.isSupported) {
            return (uo) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_comment;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_comment);
        if (imageView != null) {
            i10 = R.id.iv_img;
            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_img);
            if (qMUIRadiusImageView != null) {
                i10 = R.id.tv_comment;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_comment);
                if (textView != null) {
                    i10 = R.id.tv_desc;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView2 != null) {
                        i10 = R.id.tv_rank;
                        GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_rank);
                        if (gradientTextView != null) {
                            i10 = R.id.tv_title;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_title);
                            if (textView3 != null) {
                                i10 = R.id.vg_tags;
                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_tags);
                                if (relativeLayout != null) {
                                    i10 = R.id.vg_title;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_title);
                                    if (relativeLayout2 != null) {
                                        return new uo((RelativeLayout) view, imageView, qMUIRadiusImageView, textView, textView2, gradientTextView, textView3, relativeLayout, relativeLayout2);
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
    public static uo c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18914, new Class[]{LayoutInflater.class}, uo.class);
        return patchProxyResultProxy.isSupported ? (uo) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static uo d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18915, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, uo.class);
        if (patchProxyResultProxy.isSupported) {
            return (uo) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_hot_links, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116489a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18917, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
