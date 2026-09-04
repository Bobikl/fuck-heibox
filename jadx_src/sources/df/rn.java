package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcustomview.CircleProgressView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGamedetailTagBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rn implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CircleProgressView f115279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115283f;

    private rn(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CircleProgressView circleProgressView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f115278a = linearLayout;
        this.f115279b = circleProgressView;
        this.f115280c = imageView;
        this.f115281d = linearLayout2;
        this.f115282e = textView;
        this.f115283f = linearLayout3;
    }

    @androidx.annotation.n0
    public static rn a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18800, new Class[]{View.class}, rn.class);
        if (patchProxyResultProxy.isSupported) {
            return (rn) patchProxyResultProxy.result;
        }
        int i10 = R.id.cp_percent;
        CircleProgressView circleProgressView = (CircleProgressView) l3.d.a(view, R.id.cp_percent);
        if (circleProgressView != null) {
            i10 = R.id.iv_add;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_add);
            if (imageView != null) {
                i10 = R.id.ll_tags;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_tags);
                if (linearLayout != null) {
                    i10 = R.id.tv_name;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                    if (textView != null) {
                        LinearLayout linearLayout2 = (LinearLayout) view;
                        return new rn(linearLayout2, circleProgressView, imageView, linearLayout, textView, linearLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static rn c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18798, new Class[]{LayoutInflater.class}, rn.class);
        return patchProxyResultProxy.isSupported ? (rn) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static rn d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18799, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, rn.class);
        if (patchProxyResultProxy.isSupported) {
            return (rn) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_gamedetail_tag, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115278a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18801, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
