package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LoadingViewTopBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class j1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f131590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CircularProgressIndicator f131591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f131592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final Space f131593d;

    private j1(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 CircularProgressIndicator circularProgressIndicator, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 Space space) {
        this.f131590a = constraintLayout;
        this.f131591b = circularProgressIndicator;
        this.f131592c = constraintLayout2;
        this.f131593d = space;
    }

    @androidx.annotation.n0
    public static j1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 4099, new Class[]{View.class}, j1.class);
        if (patchProxyResultProxy.isSupported) {
            return (j1) patchProxyResultProxy.result;
        }
        int i10 = R.id.img_progress;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) l3.d.a(view, i10);
        if (circularProgressIndicator != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i11 = R.id.top_space;
            Space space = (Space) l3.d.a(view, i11);
            if (space != null) {
                return new j1(constraintLayout, circularProgressIndicator, constraintLayout, space);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static j1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 4097, new Class[]{LayoutInflater.class}, j1.class);
        return patchProxyResultProxy.isSupported ? (j1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static j1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 4098, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, j1.class);
        if (patchProxyResultProxy.isSupported) {
            return (j1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.loading_view_top, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f131590a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4100, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
