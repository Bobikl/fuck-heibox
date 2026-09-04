package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ActivityHistoryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f115354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f115356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115357e;

    private s0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 View view) {
        this.f115353a = relativeLayout;
        this.f115354b = bottomButtonLeftItemView;
        this.f115355c = recyclerView;
        this.f115356d = smartRefreshLayout;
        this.f115357e = view;
    }

    @androidx.annotation.n0
    public static s0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16416, new Class[]{View.class}, s0.class);
        if (patchProxyResultProxy.isSupported) {
            return (s0) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_button;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bottom_button);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.rv;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
            if (recyclerView != null) {
                i10 = R.id.srl;
                SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                if (smartRefreshLayout != null) {
                    i10 = R.id.v_divider;
                    View viewA = l3.d.a(view, R.id.v_divider);
                    if (viewA != null) {
                        return new s0((RelativeLayout) view, bottomButtonLeftItemView, recyclerView, smartRefreshLayout, viewA);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static s0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16414, new Class[]{LayoutInflater.class}, s0.class);
        return patchProxyResultProxy.isSupported ? (s0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16415, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s0.class);
        if (patchProxyResultProxy.isSupported) {
            return (s0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_history, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115353a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16417, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
