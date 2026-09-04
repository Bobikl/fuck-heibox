package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptFeedsNewsWideBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class uf implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.p f116401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f116402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f116403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f116404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f116405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116409j;

    private uf(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.p pVar, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView2, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView3, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f116400a = relativeLayout;
        this.f116401b = pVar;
        this.f116402c = qMUIRadiusImageView;
        this.f116403d = qMUIRadiusImageView2;
        this.f116404e = qMUIRadiusImageView3;
        this.f116405f = qMUIRadiusImageView4;
        this.f116406g = textView;
        this.f116407h = textView2;
        this.f116408i = frameLayout;
        this.f116409j = linearLayout;
    }

    @androidx.annotation.n0
    public static uf a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17984, new Class[]{View.class}, uf.class);
        if (patchProxyResultProxy.isSupported) {
            return (uf) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.p pVarA = mb.p.a(viewA);
            i10 = R.id.iv_long_img;
            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_long_img);
            if (qMUIRadiusImageView != null) {
                i10 = R.id.iv_multi_img_0;
                QMUIRadiusImageView qMUIRadiusImageView2 = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_multi_img_0);
                if (qMUIRadiusImageView2 != null) {
                    i10 = R.id.iv_multi_img_1;
                    QMUIRadiusImageView qMUIRadiusImageView3 = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_multi_img_1);
                    if (qMUIRadiusImageView3 != null) {
                        i10 = R.id.iv_multi_img_2;
                        QMUIRadiusImageView qMUIRadiusImageView4 = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_multi_img_2);
                        if (qMUIRadiusImageView4 != null) {
                            i10 = R.id.tv_internal_tag;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_internal_tag);
                            if (textView != null) {
                                i10 = R.id.tv_title;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                                if (textView2 != null) {
                                    i10 = R.id.vg_image;
                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_image);
                                    if (frameLayout != null) {
                                        i10 = R.id.vg_multi_img;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_multi_img);
                                        if (linearLayout != null) {
                                            return new uf((RelativeLayout) view, pVarA, qMUIRadiusImageView, qMUIRadiusImageView2, qMUIRadiusImageView3, qMUIRadiusImageView4, textView, textView2, frameLayout, linearLayout);
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
    public static uf c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17982, new Class[]{LayoutInflater.class}, uf.class);
        return patchProxyResultProxy.isSupported ? (uf) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static uf d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17983, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, uf.class);
        if (patchProxyResultProxy.isSupported) {
            return (uf) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_feeds_news_wide, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116400a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17985, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
