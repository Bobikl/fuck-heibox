package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.dota2.Dota2CalendarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewAllCalendarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gl implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f111037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2CalendarView f111038b;

    private gl(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 Dota2CalendarView dota2CalendarView) {
        this.f111037a = linearLayout;
        this.f111038b = dota2CalendarView;
    }

    @androidx.annotation.n0
    public static gl a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18549, new Class[]{View.class}, gl.class);
        if (patchProxyResultProxy.isSupported) {
            return (gl) patchProxyResultProxy.result;
        }
        Dota2CalendarView dota2CalendarView = (Dota2CalendarView) l3.d.a(view, R.id.v_calendar);
        if (dota2CalendarView != null) {
            return new gl((LinearLayout) view, dota2CalendarView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.v_calendar)));
    }

    @androidx.annotation.n0
    public static gl c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18547, new Class[]{LayoutInflater.class}, gl.class);
        return patchProxyResultProxy.isSupported ? (gl) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gl d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18548, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gl.class);
        if (patchProxyResultProxy.isSupported) {
            return (gl) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_all_calendar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f111037a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18550, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
