package ld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbsearch.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSearchDiscoverBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class j implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f131391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final QMUIRadiusImageView f131392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final RelativeLayout f131393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final TextView f131394d;

    private j(@n0 RelativeLayout relativeLayout, @n0 QMUIRadiusImageView qMUIRadiusImageView, @n0 RelativeLayout relativeLayout2, @n0 TextView textView) {
        this.f131391a = relativeLayout;
        this.f131392b = qMUIRadiusImageView;
        this.f131393c = relativeLayout2;
        this.f131394d = textView;
    }

    @n0
    public static j a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.W8, new Class[]{View.class}, j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, i10);
        if (qMUIRadiusImageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i11 = R.id.tv_desc;
            TextView textView = (TextView) l3.d.a(view, i11);
            if (textView != null) {
                return new j(relativeLayout, qMUIRadiusImageView, relativeLayout, textView);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static j c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.U8, new Class[]{LayoutInflater.class}, j.class);
        return patchProxyResultProxy.isSupported ? (j) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static j d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.V8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_search_discover, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f131391a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.X8, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
