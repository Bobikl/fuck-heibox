package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.dota2.Dota2CalendarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemDota2CalendarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ci implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2CalendarView f109439c;

    private ci(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 Dota2CalendarView dota2CalendarView) {
        this.f109437a = linearLayout;
        this.f109438b = textView;
        this.f109439c = dota2CalendarView;
    }

    @androidx.annotation.n0
    public static ci a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18223, new Class[]{View.class}, ci.class);
        if (patchProxyResultProxy.isSupported) {
            return (ci) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_year;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_year);
        if (textView != null) {
            i10 = R.id.v_calendar;
            Dota2CalendarView dota2CalendarView = (Dota2CalendarView) l3.d.a(view, R.id.v_calendar);
            if (dota2CalendarView != null) {
                return new ci((LinearLayout) view, textView, dota2CalendarView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ci c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18221, new Class[]{LayoutInflater.class}, ci.class);
        return patchProxyResultProxy.isSupported ? (ci) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ci d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18222, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ci.class);
        if (patchProxyResultProxy.isSupported) {
            return (ci) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dota2_calendar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109437a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18224, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
