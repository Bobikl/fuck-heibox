package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.HBCalendarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameCalendarHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hk implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f111475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final p60 f111476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBCalendarView f111477c;

    private hk(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 p60 p60Var, @androidx.annotation.n0 HBCalendarView hBCalendarView) {
        this.f111475a = linearLayout;
        this.f111476b = p60Var;
        this.f111477c = hBCalendarView;
    }

    @androidx.annotation.n0
    public static hk a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18451, new Class[]{View.class}, hk.class);
        if (patchProxyResultProxy.isSupported) {
            return (hk) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_empty;
        View viewA = l3.d.a(view, R.id.vg_empty);
        if (viewA != null) {
            p60 p60VarA = p60.a(viewA);
            HBCalendarView hBCalendarView = (HBCalendarView) l3.d.a(view, R.id.view_calendar);
            if (hBCalendarView != null) {
                return new hk((LinearLayout) view, p60VarA, hBCalendarView);
            }
            i10 = R.id.view_calendar;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static hk c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18449, new Class[]{LayoutInflater.class}, hk.class);
        return patchProxyResultProxy.isSupported ? (hk) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hk d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18450, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hk.class);
        if (patchProxyResultProxy.isSupported) {
            return (hk) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_calendar_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f111475a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18452, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
