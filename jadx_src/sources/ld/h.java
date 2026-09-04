package ld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbsearch.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbsearchItemSearchHotWordBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class h implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final LinearLayout f131378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final QMUIRadiusImageView f131379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f131380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final GradientTextView f131381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f131382e;

    private h(@n0 LinearLayout linearLayout, @n0 QMUIRadiusImageView qMUIRadiusImageView, @n0 ImageView imageView, @n0 GradientTextView gradientTextView, @n0 TextView textView) {
        this.f131378a = linearLayout;
        this.f131379b = qMUIRadiusImageView;
        this.f131380c = imageView;
        this.f131381d = gradientTextView;
        this.f131382e = textView;
    }

    @n0
    public static h a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.O8, new Class[]{View.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_game;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, i10);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) l3.d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.tv_rank;
                GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, i10);
                if (gradientTextView != null) {
                    i10 = R.id.tv_title;
                    TextView textView = (TextView) l3.d.a(view, i10);
                    if (textView != null) {
                        return new h((LinearLayout) view, qMUIRadiusImageView, imageView, gradientTextView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static h c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.M8, new Class[]{LayoutInflater.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static h d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.N8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbsearch_item_search_hot_word, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public LinearLayout b() {
        return this.f131378a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.P8, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
