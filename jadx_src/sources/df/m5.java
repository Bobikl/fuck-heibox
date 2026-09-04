package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogFragmentUserGameDataBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f113289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f113291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113292d;

    private m5(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 View view) {
        this.f113289a = constraintLayout;
        this.f113290b = frameLayout;
        this.f113291c = guideline;
        this.f113292d = view;
    }

    @androidx.annotation.n0
    public static m5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16912, new Class[]{View.class}, m5.class);
        if (patchProxyResultProxy.isSupported) {
            return (m5) patchProxyResultProxy.result;
        }
        int i10 = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fragment_container);
        if (frameLayout != null) {
            i10 = R.id.guideline3;
            Guideline guideline = (Guideline) l3.d.a(view, R.id.guideline3);
            if (guideline != null) {
                i10 = R.id.view_top;
                View viewA = l3.d.a(view, R.id.view_top);
                if (viewA != null) {
                    return new m5((ConstraintLayout) view, frameLayout, guideline, viewA);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static m5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16910, new Class[]{LayoutInflater.class}, m5.class);
        return patchProxyResultProxy.isSupported ? (m5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16911, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m5.class);
        if (patchProxyResultProxy.isSupported) {
            return (m5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_fragment_user_game_data, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f113289a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16913, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
