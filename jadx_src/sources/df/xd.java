package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemBbsHashtagRecommedHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xd implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f117533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f117534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117535c;

    private xd(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f117533a = constraintLayout;
        this.f117534b = oVar;
        this.f117535c = linearLayout;
    }

    @androidx.annotation.n0
    public static xd a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17788, new Class[]{View.class}, xd.class);
        if (patchProxyResultProxy.isSupported) {
            return (xd) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider_bottom;
        View viewA = l3.d.a(view, R.id.divider_bottom);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_container);
            if (linearLayout != null) {
                return new xd((ConstraintLayout) view, oVarA, linearLayout);
            }
            i10 = R.id.ll_container;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static xd c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17786, new Class[]{LayoutInflater.class}, xd.class);
        return patchProxyResultProxy.isSupported ? (xd) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xd d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17787, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xd.class);
        if (patchProxyResultProxy.isSupported) {
            return (xd) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_bbs_hashtag_recommed_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f117533a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17789, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
