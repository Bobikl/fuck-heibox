package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSTagRecommendView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptRecHashtagBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hg implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final BBSTagRecommendView f111429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSTagRecommendView f111430b;

    private hg(@androidx.annotation.n0 BBSTagRecommendView bBSTagRecommendView, @androidx.annotation.n0 BBSTagRecommendView bBSTagRecommendView2) {
        this.f111429a = bBSTagRecommendView;
        this.f111430b = bBSTagRecommendView2;
    }

    @androidx.annotation.n0
    public static hg a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18035, new Class[]{View.class}, hg.class);
        if (patchProxyResultProxy.isSupported) {
            return (hg) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BBSTagRecommendView bBSTagRecommendView = (BBSTagRecommendView) view;
        return new hg(bBSTagRecommendView, bBSTagRecommendView);
    }

    @androidx.annotation.n0
    public static hg c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18033, new Class[]{LayoutInflater.class}, hg.class);
        return patchProxyResultProxy.isSupported ? (hg) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hg d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18034, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hg.class);
        if (patchProxyResultProxy.isSupported) {
            return (hg) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_rec_hashtag, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public BBSTagRecommendView b() {
        return this.f111429a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18036, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
