package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecListHeaderMultiBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qv implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f114979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.f f114980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager2 f114981c;

    private qv(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 mb.f fVar, @androidx.annotation.n0 ViewPager2 viewPager2) {
        this.f114979a = constraintLayout;
        this.f114980b = fVar;
        this.f114981c = viewPager2;
    }

    @androidx.annotation.n0
    public static qv a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19624, new Class[]{View.class}, qv.class);
        if (patchProxyResultProxy.isSupported) {
            return (qv) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_title;
        View viewA = l3.d.a(view, R.id.vg_title);
        if (viewA != null) {
            mb.f fVarA = mb.f.a(viewA);
            ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, R.id.vp_container);
            if (viewPager2 != null) {
                return new qv((ConstraintLayout) view, fVarA, viewPager2);
            }
            i10 = R.id.vp_container;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static qv c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19622, new Class[]{LayoutInflater.class}, qv.class);
        return patchProxyResultProxy.isSupported ? (qv) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static qv d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19623, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, qv.class);
        if (patchProxyResultProxy.isSupported) {
            return (qv) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_rec_list_header_multi, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f114979a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19625, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
