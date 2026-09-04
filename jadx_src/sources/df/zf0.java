package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewGameItemTrendBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f118360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f118361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118363d;

    private zf0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f118360a = linearLayout;
        this.f118361b = frameLayout;
        this.f118362c = textView;
        this.f118363d = linearLayout2;
    }

    @androidx.annotation.n0
    public static zf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21720, new Class[]{View.class}, zf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (zf0) patchProxyResultProxy.result;
        }
        int i10 = R.id.lc_trend_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.lc_trend_container);
        if (frameLayout != null) {
            i10 = R.id.tv_change;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_change);
            if (textView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new zf0(linearLayout, frameLayout, textView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static zf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21718, new Class[]{LayoutInflater.class}, zf0.class);
        return patchProxyResultProxy.isSupported ? (zf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21719, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (zf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_item_trend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f118360a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21721, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
