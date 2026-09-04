package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutDownloadProgressBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h40 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f111249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f111250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111251c;

    private h40(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView) {
        this.f111249a = linearLayout;
        this.f111250b = progressBar;
        this.f111251c = textView;
    }

    @androidx.annotation.n0
    public static h40 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20518, new Class[]{View.class}, h40.class);
        if (patchProxyResultProxy.isSupported) {
            return (h40) patchProxyResultProxy.result;
        }
        int i10 = R.id.pb_progress;
        ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_progress);
        if (progressBar != null) {
            i10 = R.id.tv_progress_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_progress_desc);
            if (textView != null) {
                return new h40((LinearLayout) view, progressBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static h40 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20516, new Class[]{LayoutInflater.class}, h40.class);
        return patchProxyResultProxy.isSupported ? (h40) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h40 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20517, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h40.class);
        if (patchProxyResultProxy.isSupported) {
            return (h40) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_download_progress, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f111249a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20519, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
