package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentForbidHistoryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u8 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f116269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f116270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116272f;

    private u8(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f116267a = relativeLayout;
        this.f116268b = imageView;
        this.f116269c = progressBar;
        this.f116270d = recyclerView;
        this.f116271e = linearLayout;
        this.f116272f = linearLayout2;
    }

    @androidx.annotation.n0
    public static u8 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17256, new Class[]{View.class}, u8.class);
        if (patchProxyResultProxy.isSupported) {
            return (u8) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_window_close;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_window_close);
        if (imageView != null) {
            i10 = R.id.progress;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.progress);
            if (progressBar != null) {
                i10 = R.id.rv_list;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_list);
                if (recyclerView != null) {
                    i10 = R.id.vg_content;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_content);
                    if (linearLayout != null) {
                        i10 = R.id.vg_empty;
                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_empty);
                        if (linearLayout2 != null) {
                            return new u8((RelativeLayout) view, imageView, progressBar, recyclerView, linearLayout, linearLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static u8 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17254, new Class[]{LayoutInflater.class}, u8.class);
        return patchProxyResultProxy.isSupported ? (u8) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static u8 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17255, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, u8.class);
        if (patchProxyResultProxy.isSupported) {
            return (u8) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_forbid_history, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116267a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17257, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
