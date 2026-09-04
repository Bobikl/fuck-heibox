package be;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbwallet.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: HbwalletRollCouponListFragmentBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final ConstraintLayout f35406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final BottomButtonLeftItemView f35407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final RecyclerView f35408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final SmartRefreshLayout f35409d;

    private t(@n0 ConstraintLayout constraintLayout, @n0 BottomButtonLeftItemView bottomButtonLeftItemView, @n0 RecyclerView recyclerView, @n0 SmartRefreshLayout smartRefreshLayout) {
        this.f35406a = constraintLayout;
        this.f35407b = bottomButtonLeftItemView;
        this.f35408c = recyclerView;
        this.f35409d = smartRefreshLayout;
    }

    @n0
    public static t a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.F5, new Class[]{View.class}, t.class);
        if (patchProxyResultProxy.isSupported) {
            return (t) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_button;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, i10);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.rv;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, i10);
            if (recyclerView != null) {
                i10 = R.id.srl;
                SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, i10);
                if (smartRefreshLayout != null) {
                    return new t((ConstraintLayout) view, bottomButtonLeftItemView, recyclerView, smartRefreshLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static t c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.D5, new Class[]{LayoutInflater.class}, t.class);
        return patchProxyResultProxy.isSupported ? (t) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static t d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.E5, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, t.class);
        if (patchProxyResultProxy.isSupported) {
            return (t) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_roll_coupon_list_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public ConstraintLayout b() {
        return this.f35406a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.G5, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
