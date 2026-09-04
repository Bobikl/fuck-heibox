package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentPostToolsV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class na implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f113773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewStub f113774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewStub f113775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewStub f113776d;

    private na(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ViewStub viewStub, @androidx.annotation.n0 ViewStub viewStub2, @androidx.annotation.n0 ViewStub viewStub3) {
        this.f113773a = frameLayout;
        this.f113774b = viewStub;
        this.f113775c = viewStub2;
        this.f113776d = viewStub3;
    }

    @androidx.annotation.n0
    public static na a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17436, new Class[]{View.class}, na.class);
        if (patchProxyResultProxy.isSupported) {
            return (na) patchProxyResultProxy.result;
        }
        int i10 = R.id.stub_gallery_tool;
        ViewStub viewStub = (ViewStub) l3.d.a(view, R.id.stub_gallery_tool);
        if (viewStub != null) {
            i10 = R.id.stub_game_shot_tool;
            ViewStub viewStub2 = (ViewStub) l3.d.a(view, R.id.stub_game_shot_tool);
            if (viewStub2 != null) {
                i10 = R.id.stub_template_tool;
                ViewStub viewStub3 = (ViewStub) l3.d.a(view, R.id.stub_template_tool);
                if (viewStub3 != null) {
                    return new na((FrameLayout) view, viewStub, viewStub2, viewStub3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static na c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17434, new Class[]{LayoutInflater.class}, na.class);
        return patchProxyResultProxy.isSupported ? (na) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static na d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17435, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, na.class);
        if (patchProxyResultProxy.isSupported) {
            return (na) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_post_tools_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f113773a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17437, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
