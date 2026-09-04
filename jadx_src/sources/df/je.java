package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemBundleProgressBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class je implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f112159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112160c;

    private je(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView) {
        this.f112158a = relativeLayout;
        this.f112159b = progressBar;
        this.f112160c = textView;
    }

    @androidx.annotation.n0
    public static je a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17836, new Class[]{View.class}, je.class);
        if (patchProxyResultProxy.isSupported) {
            return (je) patchProxyResultProxy.result;
        }
        int i10 = R.id.pb_percent;
        ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_percent);
        if (progressBar != null) {
            i10 = R.id.tv_percent;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_percent);
            if (textView != null) {
                return new je((RelativeLayout) view, progressBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static je c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17834, new Class[]{LayoutInflater.class}, je.class);
        return patchProxyResultProxy.isSupported ? (je) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static je d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17835, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, je.class);
        if (patchProxyResultProxy.isSupported) {
            return (je) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_bundle_progress, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112158a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17837, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
