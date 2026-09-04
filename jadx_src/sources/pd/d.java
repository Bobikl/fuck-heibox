package pd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbstory.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: StoryPlayerFragmentBinding.java */
/* JADX INFO: loaded from: classes13.dex */
public final class d implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final ConstraintLayout f138273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ViewPager2 f138274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final FrameLayout f138275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final FrameLayout f138276d;

    private d(@n0 ConstraintLayout constraintLayout, @n0 ViewPager2 viewPager2, @n0 FrameLayout frameLayout, @n0 FrameLayout frameLayout2) {
        this.f138273a = constraintLayout;
        this.f138274b = viewPager2;
        this.f138275c = frameLayout;
        this.f138276d = frameLayout2;
    }

    @n0
    public static d a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.f33598hf, new Class[]{View.class}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        int i10 = R.id.story_main_view_pager2;
        ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, i10);
        if (viewPager2 != null) {
            i10 = R.id.vg_story_overlay_tips;
            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
            if (frameLayout != null) {
                i10 = R.id.vg_story_title_bar;
                FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, i10);
                if (frameLayout2 != null) {
                    return new d((ConstraintLayout) view, viewPager2, frameLayout, frameLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static d c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.f33552ff, new Class[]{LayoutInflater.class}, d.class);
        return patchProxyResultProxy.isSupported ? (d) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static d d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.f33575gf, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.story_player_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public ConstraintLayout b() {
        return this.f138273a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f9if, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
