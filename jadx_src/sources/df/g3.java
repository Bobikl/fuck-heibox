package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityWebActionV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f110778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110779c;

    private g3(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f110777a = relativeLayout;
        this.f110778b = frameLayout;
        this.f110779c = linearLayout;
    }

    @androidx.annotation.n0
    public static g3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16680, new Class[]{View.class}, g3.class);
        if (patchProxyResultProxy.isSupported) {
            return (g3) patchProxyResultProxy.result;
        }
        int i10 = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fragment_container);
        if (frameLayout != null) {
            i10 = R.id.vg_little_program_root;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_little_program_root);
            if (linearLayout != null) {
                return new g3((RelativeLayout) view, frameLayout, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static g3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16678, new Class[]{LayoutInflater.class}, g3.class);
        return patchProxyResultProxy.isSupported ? (g3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static g3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16679, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g3.class);
        if (patchProxyResultProxy.isSupported) {
            return (g3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_web_action_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110777a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16681, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
