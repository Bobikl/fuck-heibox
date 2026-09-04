package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemTradeCheckStateBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vz implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f116954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116957f;

    private vz(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f116952a = relativeLayout;
        this.f116953b = imageView;
        this.f116954c = progressBar;
        this.f116955d = textView;
        this.f116956e = textView2;
        this.f116957f = frameLayout;
    }

    @androidx.annotation.n0
    public static vz a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20056, new Class[]{View.class}, vz.class);
        if (patchProxyResultProxy.isSupported) {
            return (vz) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_state;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_state);
        if (imageView != null) {
            i10 = R.id.pb_progress;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_progress);
            if (progressBar != null) {
                i10 = R.id.tv_action;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_action);
                if (textView != null) {
                    i10 = R.id.tv_desc;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView2 != null) {
                        i10 = R.id.vg_state;
                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_state);
                        if (frameLayout != null) {
                            return new vz((RelativeLayout) view, imageView, progressBar, textView, textView2, frameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static vz c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20054, new Class[]{LayoutInflater.class}, vz.class);
        return patchProxyResultProxy.isSupported ? (vz) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vz d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20055, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vz.class);
        if (patchProxyResultProxy.isSupported) {
            return (vz) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_trade_check_state, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116952a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20057, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
