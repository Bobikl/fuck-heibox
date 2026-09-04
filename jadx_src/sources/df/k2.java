package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityStoryCoreBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f112375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FragmentContainerView f112376b;

    private k2(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 FragmentContainerView fragmentContainerView) {
        this.f112375a = frameLayout;
        this.f112376b = fragmentContainerView;
    }

    @androidx.annotation.n0
    public static k2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16592, new Class[]{View.class}, k2.class);
        if (patchProxyResultProxy.isSupported) {
            return (k2) patchProxyResultProxy.result;
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) l3.d.a(view, R.id.story_fragment_container);
        if (fragmentContainerView != null) {
            return new k2((FrameLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.story_fragment_container)));
    }

    @androidx.annotation.n0
    public static k2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16590, new Class[]{LayoutInflater.class}, k2.class);
        return patchProxyResultProxy.isSupported ? (k2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static k2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16591, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k2.class);
        if (patchProxyResultProxy.isSupported) {
            return (k2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_story_core, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f112375a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16593, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
