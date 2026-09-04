package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSNewsItemView;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionSmallView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemNewsWithTopUserBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vr implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSNewsItemView f116921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionSmallView f116922c;

    private vr(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 BBSNewsItemView bBSNewsItemView, @androidx.annotation.n0 BBSUserSectionSmallView bBSUserSectionSmallView) {
        this.f116920a = linearLayout;
        this.f116921b = bBSNewsItemView;
        this.f116922c = bBSUserSectionSmallView;
    }

    @androidx.annotation.n0
    public static vr a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19232, new Class[]{View.class}, vr.class);
        if (patchProxyResultProxy.isSupported) {
            return (vr) patchProxyResultProxy.result;
        }
        int i10 = R.id.news_item;
        BBSNewsItemView bBSNewsItemView = (BBSNewsItemView) l3.d.a(view, R.id.news_item);
        if (bBSNewsItemView != null) {
            i10 = R.id.vg_user;
            BBSUserSectionSmallView bBSUserSectionSmallView = (BBSUserSectionSmallView) l3.d.a(view, R.id.vg_user);
            if (bBSUserSectionSmallView != null) {
                return new vr((LinearLayout) view, bBSNewsItemView, bBSUserSectionSmallView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static vr c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19230, new Class[]{LayoutInflater.class}, vr.class);
        return patchProxyResultProxy.isSupported ? (vr) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vr d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19231, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vr.class);
        if (patchProxyResultProxy.isSupported) {
            return (vr) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_news_with_top_user, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116920a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19233, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
