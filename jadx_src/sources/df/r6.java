package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.flyco.tablayout.CommonTabLayout;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.segmentfilters.SegmentFilterSelected;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogTradeInventoryFilterBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f115103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f115104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterSelected f115105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final CommonTabLayout f115107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f115108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115109g;

    private r6(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 SegmentFilterSelected segmentFilterSelected, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 CommonTabLayout commonTabLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f115103a = constraintLayout;
        this.f115104b = bottomButtonLeftItemView;
        this.f115105c = segmentFilterSelected;
        this.f115106d = recyclerView;
        this.f115107e = commonTabLayout;
        this.f115108f = frameLayout;
        this.f115109g = linearLayout;
    }

    @androidx.annotation.n0
    public static r6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17036, new Class[]{View.class}, r6.class);
        if (patchProxyResultProxy.isSupported) {
            return (r6) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_button;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bottom_button);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.filter_selected;
            SegmentFilterSelected segmentFilterSelected = (SegmentFilterSelected) l3.d.a(view, R.id.filter_selected);
            if (segmentFilterSelected != null) {
                i10 = R.id.rv;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                if (recyclerView != null) {
                    i10 = R.id.tab;
                    CommonTabLayout commonTabLayout = (CommonTabLayout) l3.d.a(view, R.id.tab);
                    if (commonTabLayout != null) {
                        i10 = R.id.vg_bg;
                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bg);
                        if (frameLayout != null) {
                            i10 = R.id.vg_bottom_bar;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bottom_bar);
                            if (linearLayout != null) {
                                return new r6((ConstraintLayout) view, bottomButtonLeftItemView, segmentFilterSelected, recyclerView, commonTabLayout, frameLayout, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static r6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17034, new Class[]{LayoutInflater.class}, r6.class);
        return patchProxyResultProxy.isSupported ? (r6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17035, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r6.class);
        if (patchProxyResultProxy.isSupported) {
            return (r6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_trade_inventory_filter, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f115103a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17037, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
