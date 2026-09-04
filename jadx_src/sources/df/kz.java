package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemTimelineTabBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kz implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageFilterView f112768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112769d;

    private kz(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageFilterView imageFilterView, @androidx.annotation.n0 TextView textView) {
        this.f112766a = linearLayout;
        this.f112767b = imageView;
        this.f112768c = imageFilterView;
        this.f112769d = textView;
    }

    @androidx.annotation.n0
    public static kz a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, f7.a.d.f118802m, new Class[]{View.class}, kz.class);
        if (patchProxyResultProxy.isSupported) {
            return (kz) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_tab_avatar;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_tab_avatar);
        if (imageView != null) {
            i10 = R.id.iv_tab_dot;
            ImageFilterView imageFilterView = (ImageFilterView) l3.d.a(view, R.id.iv_tab_dot);
            if (imageFilterView != null) {
                i10 = R.id.tv_tab_name;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_tab_name);
                if (textView != null) {
                    return new kz((LinearLayout) view, imageView, imageFilterView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static kz c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20010, new Class[]{LayoutInflater.class}, kz.class);
        return patchProxyResultProxy.isSupported ? (kz) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kz d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20011, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kz.class);
        if (patchProxyResultProxy.isSupported) {
            return (kz) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_timeline_tab, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112766a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, f7.a.d.f118803n, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
