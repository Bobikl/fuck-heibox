package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcustomview.MaxHeightRecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutStackCouponDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wa0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final MaxHeightRecyclerView f117105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117108e;

    private wa0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 MaxHeightRecyclerView maxHeightRecyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f117104a = linearLayout;
        this.f117105b = maxHeightRecyclerView;
        this.f117106c = textView;
        this.f117107d = textView2;
        this.f117108e = linearLayout2;
    }

    @androidx.annotation.n0
    public static wa0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21197, new Class[]{View.class}, wa0.class);
        if (patchProxyResultProxy.isSupported) {
            return (wa0) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        MaxHeightRecyclerView maxHeightRecyclerView = (MaxHeightRecyclerView) l3.d.a(view, R.id.rv);
        if (maxHeightRecyclerView != null) {
            i10 = R.id.tv_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
            if (textView != null) {
                i10 = R.id.tv_title;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                if (textView2 != null) {
                    i10 = R.id.vg_title;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_title);
                    if (linearLayout != null) {
                        return new wa0((LinearLayout) view, maxHeightRecyclerView, textView, textView2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static wa0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21195, new Class[]{LayoutInflater.class}, wa0.class);
        return patchProxyResultProxy.isSupported ? (wa0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wa0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21196, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wa0.class);
        if (patchProxyResultProxy.isSupported) {
            return (wa0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_stack_coupon_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117104a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21198, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
