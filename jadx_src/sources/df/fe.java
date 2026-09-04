package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemBottomBarMultiOpBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fe implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f110552b;

    private fe(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView) {
        this.f110551a = linearLayout;
        this.f110552b = bottomButtonLeftItemView;
    }

    @androidx.annotation.n0
    public static fe a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17820, new Class[]{View.class}, fe.class);
        if (patchProxyResultProxy.isSupported) {
            return (fe) patchProxyResultProxy.result;
        }
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bottom_button);
        if (bottomButtonLeftItemView != null) {
            return new fe((LinearLayout) view, bottomButtonLeftItemView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.bottom_button)));
    }

    @androidx.annotation.n0
    public static fe c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17818, new Class[]{LayoutInflater.class}, fe.class);
        return patchProxyResultProxy.isSupported ? (fe) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fe d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17819, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fe.class);
        if (patchProxyResultProxy.isSupported) {
            return (fe) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_bottom_bar_multi_op, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110551a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17821, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
