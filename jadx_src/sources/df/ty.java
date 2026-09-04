package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.flyco.tablayout.CommonTabLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSortTypeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ty implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f116092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CommonTabLayout f116093d;

    private ty(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 CommonTabLayout commonTabLayout) {
        this.f116090a = linearLayout;
        this.f116091b = imageView;
        this.f116092c = oVar;
        this.f116093d = commonTabLayout;
    }

    @androidx.annotation.n0
    public static ty a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19944, new Class[]{View.class}, ty.class);
        if (patchProxyResultProxy.isSupported) {
            return (ty) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_moderators_page;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_moderators_page);
        if (imageView != null) {
            i10 = R.id.sort_type_divider;
            View viewA = l3.d.a(view, R.id.sort_type_divider);
            if (viewA != null) {
                mb.o oVarA = mb.o.a(viewA);
                CommonTabLayout commonTabLayout = (CommonTabLayout) l3.d.a(view, R.id.tl_sort_type);
                if (commonTabLayout != null) {
                    return new ty((LinearLayout) view, imageView, oVarA, commonTabLayout);
                }
                i10 = R.id.tl_sort_type;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ty c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19942, new Class[]{LayoutInflater.class}, ty.class);
        return patchProxyResultProxy.isSupported ? (ty) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ty d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19943, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ty.class);
        if (patchProxyResultProxy.isSupported) {
            return (ty) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_sort_type, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116090a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19945, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
