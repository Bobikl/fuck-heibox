package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSNewsItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptFeedsNewsNormalBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class tf implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final BBSNewsItemView f115985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSNewsItemView f115986b;

    private tf(@androidx.annotation.n0 BBSNewsItemView bBSNewsItemView, @androidx.annotation.n0 BBSNewsItemView bBSNewsItemView2) {
        this.f115985a = bBSNewsItemView;
        this.f115986b = bBSNewsItemView2;
    }

    @androidx.annotation.n0
    public static tf a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17980, new Class[]{View.class}, tf.class);
        if (patchProxyResultProxy.isSupported) {
            return (tf) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BBSNewsItemView bBSNewsItemView = (BBSNewsItemView) view;
        return new tf(bBSNewsItemView, bBSNewsItemView);
    }

    @androidx.annotation.n0
    public static tf c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17978, new Class[]{LayoutInflater.class}, tf.class);
        return patchProxyResultProxy.isSupported ? (tf) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static tf d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17979, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, tf.class);
        if (patchProxyResultProxy.isSupported) {
            return (tf) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_feeds_news_normal, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public BBSNewsItemView b() {
        return this.f115985a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17981, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
