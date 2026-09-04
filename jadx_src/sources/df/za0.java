package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.hbcustomview.MaxHeightRecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutSteamGameShotPopupWindowBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class za0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f118293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final MaxHeightRecyclerView f118294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118295c;

    private za0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 MaxHeightRecyclerView maxHeightRecyclerView, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f118293a = linearLayout;
        this.f118294b = maxHeightRecyclerView;
        this.f118295c = linearLayout2;
    }

    @androidx.annotation.n0
    public static za0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21209, new Class[]{View.class}, za0.class);
        if (patchProxyResultProxy.isSupported) {
            return (za0) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        MaxHeightRecyclerView maxHeightRecyclerView = (MaxHeightRecyclerView) l3.d.a(view, R.id.rv);
        if (maxHeightRecyclerView != null) {
            i10 = R.id.vg_dialog_root;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_dialog_root);
            if (linearLayout != null) {
                return new za0((LinearLayout) view, maxHeightRecyclerView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static za0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21207, new Class[]{LayoutInflater.class}, za0.class);
        return patchProxyResultProxy.isSupported ? (za0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static za0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21208, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, za0.class);
        if (patchProxyResultProxy.isSupported) {
            return (za0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_steam_game_shot_popup_window, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f118293a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21210, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
