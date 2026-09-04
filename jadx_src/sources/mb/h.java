package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.hbcommon.R;
import com.max.hbcommon.component.ezcalendarview.SimpleMonthView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DatePickerMonthItemMaterialBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class h implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f131558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final SimpleMonthView f131559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131560c;

    private h(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 SimpleMonthView simpleMonthView, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f131558a = linearLayout;
        this.f131559b = simpleMonthView;
        this.f131560c = linearLayout2;
    }

    @androidx.annotation.n0
    public static h a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.Z5, new Class[]{View.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        int i10 = R.id.month_view;
        SimpleMonthView simpleMonthView = (SimpleMonthView) l3.d.a(view, i10);
        if (simpleMonthView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new h(linearLayout, simpleMonthView, linearLayout);
    }

    @androidx.annotation.n0
    public static h c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.X5, new Class[]{LayoutInflater.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.Y5, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.date_picker_month_item_material, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f131558a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31699a6, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
