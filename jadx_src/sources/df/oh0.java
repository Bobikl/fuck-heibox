package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcustomview.CustomHorizontalScrollView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewRecommendGameTagsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class oh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CustomHorizontalScrollView f114240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CustomHorizontalScrollView f114241b;

    private oh0(@androidx.annotation.n0 CustomHorizontalScrollView customHorizontalScrollView, @androidx.annotation.n0 CustomHorizontalScrollView customHorizontalScrollView2) {
        this.f114240a = customHorizontalScrollView;
        this.f114241b = customHorizontalScrollView2;
    }

    @androidx.annotation.n0
    public static oh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21882, new Class[]{View.class}, oh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (oh0) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CustomHorizontalScrollView customHorizontalScrollView = (CustomHorizontalScrollView) view;
        return new oh0(customHorizontalScrollView, customHorizontalScrollView);
    }

    @androidx.annotation.n0
    public static oh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21880, new Class[]{LayoutInflater.class}, oh0.class);
        return patchProxyResultProxy.isSupported ? (oh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static oh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21881, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, oh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (oh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_recommend_game_tags, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CustomHorizontalScrollView b() {
        return this.f114240a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21883, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
