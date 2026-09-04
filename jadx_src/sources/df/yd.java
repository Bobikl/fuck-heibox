package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemBbsImgTabHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yd implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f117920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f117921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117922c;

    private yd(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 RecyclerView recyclerView) {
        this.f117920a = constraintLayout;
        this.f117921b = id0Var;
        this.f117922c = recyclerView;
    }

    @androidx.annotation.n0
    public static yd a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17792, new Class[]{View.class}, yd.class);
        if (patchProxyResultProxy.isSupported) {
            return (yd) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider_bottom;
        View viewA = l3.d.a(view, R.id.divider_bottom);
        if (viewA != null) {
            id0 id0VarA = id0.a(viewA);
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_img_tab);
            if (recyclerView != null) {
                return new yd((ConstraintLayout) view, id0VarA, recyclerView);
            }
            i10 = R.id.rv_img_tab;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static yd c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17790, new Class[]{LayoutInflater.class}, yd.class);
        return patchProxyResultProxy.isSupported ? (yd) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yd d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17791, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yd.class);
        if (patchProxyResultProxy.isSupported) {
            return (yd) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_bbs_img_tab_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f117920a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17793, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
