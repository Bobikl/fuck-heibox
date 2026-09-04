package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.slicegradeview.SliceGradeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: GgccvNotSteamBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fc implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final SliceGradeView f110516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110518d;

    private fc(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 SliceGradeView sliceGradeView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f110515a = linearLayout;
        this.f110516b = sliceGradeView;
        this.f110517c = linearLayout2;
        this.f110518d = linearLayout3;
    }

    @androidx.annotation.n0
    public static fc a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17612, new Class[]{View.class}, fc.class);
        if (patchProxyResultProxy.isSupported) {
            return (fc) patchProxyResultProxy.result;
        }
        int i10 = R.id.sgv;
        SliceGradeView sliceGradeView = (SliceGradeView) l3.d.a(view, R.id.sgv);
        if (sliceGradeView != null) {
            i10 = R.id.vg_played;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_played);
            if (linearLayout != null) {
                i10 = R.id.vg_want_to_play;
                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_want_to_play);
                if (linearLayout2 != null) {
                    return new fc((LinearLayout) view, sliceGradeView, linearLayout, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static fc c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17610, new Class[]{LayoutInflater.class}, fc.class);
        return patchProxyResultProxy.isSupported ? (fc) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fc d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17611, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fc.class);
        if (patchProxyResultProxy.isSupported) {
            return (fc) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.ggccv_not_steam, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110515a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17613, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
