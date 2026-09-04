package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutEmptyDescBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j40 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112013c;

    private j40(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView) {
        this.f112011a = linearLayout;
        this.f112012b = imageView;
        this.f112013c = textView;
    }

    @androidx.annotation.n0
    public static j40 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20524, new Class[]{View.class}, j40.class);
        if (patchProxyResultProxy.isSupported) {
            return (j40) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_empty;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_empty);
        if (imageView != null) {
            i10 = R.id.tv_empty_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_empty_desc);
            if (textView != null) {
                return new j40((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static j40 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20522, new Class[]{LayoutInflater.class}, j40.class);
        return patchProxyResultProxy.isSupported ? (j40) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static j40 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20523, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, j40.class);
        if (patchProxyResultProxy.isSupported) {
            return (j40) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_empty_desc, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112011a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20525, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
