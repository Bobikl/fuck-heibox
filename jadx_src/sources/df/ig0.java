package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.max.hbview.AutoOffsettingBackgroundLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewLoginBackgroundBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ig0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f111801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AutoOffsettingBackgroundLayout f111802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111803c;

    private ig0(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 AutoOffsettingBackgroundLayout autoOffsettingBackgroundLayout, @androidx.annotation.n0 View view) {
        this.f111801a = frameLayout;
        this.f111802b = autoOffsettingBackgroundLayout;
        this.f111803c = view;
    }

    @androidx.annotation.n0
    public static ig0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21754, new Class[]{View.class}, ig0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ig0) patchProxyResultProxy.result;
        }
        int i10 = R.id.auto_offset_background;
        AutoOffsettingBackgroundLayout autoOffsettingBackgroundLayout = (AutoOffsettingBackgroundLayout) l3.d.a(view, R.id.auto_offset_background);
        if (autoOffsettingBackgroundLayout != null) {
            i10 = R.id.mask_background;
            View viewA = l3.d.a(view, R.id.mask_background);
            if (viewA != null) {
                return new ig0((FrameLayout) view, autoOffsettingBackgroundLayout, viewA);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ig0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21752, new Class[]{LayoutInflater.class}, ig0.class);
        return patchProxyResultProxy.isSupported ? (ig0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ig0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21753, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ig0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ig0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_login_background, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f111801a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21755, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
