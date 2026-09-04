package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityWelcomeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111229e;

    private h3(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView) {
        this.f111225a = relativeLayout;
        this.f111226b = imageView;
        this.f111227c = linearLayout;
        this.f111228d = relativeLayout2;
        this.f111229e = textView;
    }

    @androidx.annotation.n0
    public static h3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16684, new Class[]{View.class}, h3.class);
        if (patchProxyResultProxy.isSupported) {
            return (h3) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_bg;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg);
        if (imageView != null) {
            i10 = R.id.ll_skip_ads;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_skip_ads);
            if (linearLayout != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i10 = R.id.tv_skip_ads;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_skip_ads);
                if (textView != null) {
                    return new h3(relativeLayout, imageView, linearLayout, relativeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static h3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16682, new Class[]{LayoutInflater.class}, h3.class);
        return patchProxyResultProxy.isSupported ? (h3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16683, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h3.class);
        if (patchProxyResultProxy.isSupported) {
            return (h3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_welcome, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111225a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16685, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
