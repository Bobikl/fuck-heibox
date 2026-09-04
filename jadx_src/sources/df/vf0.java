package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.shadowlayput.ShadowLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewGameDurationMarkerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShadowLayout f116846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116847c;

    private vf0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ShadowLayout shadowLayout, @androidx.annotation.n0 TextView textView) {
        this.f116845a = relativeLayout;
        this.f116846b = shadowLayout;
        this.f116847c = textView;
    }

    @androidx.annotation.n0
    public static vf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21706, new Class[]{View.class}, vf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (vf0) patchProxyResultProxy.result;
        }
        int i10 = R.id.shadow_view;
        ShadowLayout shadowLayout = (ShadowLayout) l3.d.a(view, R.id.shadow_view);
        if (shadowLayout != null) {
            i10 = R.id.tv_number_percent;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_number_percent);
            if (textView != null) {
                return new vf0((RelativeLayout) view, shadowLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static vf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21704, new Class[]{LayoutInflater.class}, vf0.class);
        return patchProxyResultProxy.isSupported ? (vf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21705, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (vf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_duration_marker, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116845a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21707, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
