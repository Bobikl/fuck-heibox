package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptImgIndicatorBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bg implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f108954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108955b;

    private bg(@androidx.annotation.n0 View view, @androidx.annotation.n0 View view2) {
        this.f108954a = view;
        this.f108955b = view2;
    }

    @androidx.annotation.n0
    public static bg a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18012, new Class[]{View.class}, bg.class);
        if (patchProxyResultProxy.isSupported) {
            return (bg) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new bg(view, view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static bg b(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18010, new Class[]{LayoutInflater.class}, bg.class);
        return patchProxyResultProxy.isSupported ? (bg) patchProxyResultProxy.result : c(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bg c(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18011, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bg.class);
        if (patchProxyResultProxy.isSupported) {
            return (bg) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_img_indicator, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f108954a;
    }
}
