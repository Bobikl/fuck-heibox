package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.RecommendUserView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecommendUserOrTopicBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gw implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RecommendUserView f111115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecommendUserView f111116b;

    private gw(@androidx.annotation.n0 RecommendUserView recommendUserView, @androidx.annotation.n0 RecommendUserView recommendUserView2) {
        this.f111115a = recommendUserView;
        this.f111116b = recommendUserView2;
    }

    @androidx.annotation.n0
    public static gw a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19688, new Class[]{View.class}, gw.class);
        if (patchProxyResultProxy.isSupported) {
            return (gw) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecommendUserView recommendUserView = (RecommendUserView) view;
        return new gw(recommendUserView, recommendUserView);
    }

    @androidx.annotation.n0
    public static gw c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19686, new Class[]{LayoutInflater.class}, gw.class);
        return patchProxyResultProxy.isSupported ? (gw) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gw d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19687, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gw.class);
        if (patchProxyResultProxy.isSupported) {
            return (gw) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_recommend_user_or_topic, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RecommendUserView b() {
        return this.f111115a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19689, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
