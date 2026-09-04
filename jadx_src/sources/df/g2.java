package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivitySteamStoreAddFreeGamesBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f110773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f110774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110775d;

    private g2(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView) {
        this.f110772a = linearLayout;
        this.f110773b = frameLayout;
        this.f110774c = progressBar;
        this.f110775d = textView;
    }

    @androidx.annotation.n0
    public static g2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16576, new Class[]{View.class}, g2.class);
        if (patchProxyResultProxy.isSupported) {
            return (g2) patchProxyResultProxy.result;
        }
        int i10 = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fragment_container);
        if (frameLayout != null) {
            i10 = R.id.progress;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.progress);
            if (progressBar != null) {
                i10 = R.id.tv_status;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_status);
                if (textView != null) {
                    return new g2((LinearLayout) view, frameLayout, progressBar, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static g2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16574, new Class[]{LayoutInflater.class}, g2.class);
        return patchProxyResultProxy.isSupported ? (g2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static g2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16575, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g2.class);
        if (patchProxyResultProxy.isSupported) {
            return (g2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_steam_store_add_free_games, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110772a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16577, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
