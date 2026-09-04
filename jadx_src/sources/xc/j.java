package xc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.cardview.widget.CardView;
import com.max.hblogistics.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HblogisticsItemMallAddressEditBinding.java */
/* JADX INFO: loaded from: classes11.dex */
public final class j implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final CardView f141233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final RelativeLayout f141234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f141235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final LinearLayout f141236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f141237e;

    private j(@n0 CardView cardView, @n0 RelativeLayout relativeLayout, @n0 ImageView imageView, @n0 LinearLayout linearLayout, @n0 TextView textView) {
        this.f141233a = cardView;
        this.f141234b = relativeLayout;
        this.f141235c = imageView;
        this.f141236d = linearLayout;
        this.f141237e = textView;
    }

    @n0
    public static j a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.g.f33200xi, new Class[]{View.class}, j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        int i10 = R.id.content;
        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
        if (relativeLayout != null) {
            i10 = R.id.iv_edit;
            ImageView imageView = (ImageView) l3.d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.right;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                if (linearLayout != null) {
                    i10 = R.id.tv_delete;
                    TextView textView = (TextView) l3.d.a(view, i10);
                    if (textView != null) {
                        return new j((CardView) view, relativeLayout, imageView, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static j c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.g.f33160vi, new Class[]{LayoutInflater.class}, j.class);
        return patchProxyResultProxy.isSupported ? (j) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static j d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.g.f33180wi, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hblogistics_item_mall_address_edit, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public CardView b() {
        return this.f141233a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33220yi, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
