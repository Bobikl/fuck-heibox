package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.component.ezcalendarview.EZCalendarView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutRetroactiveCalendarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z90 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f118262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EZCalendarView f118263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118266e;

    private z90(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 EZCalendarView eZCalendarView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f118262a = linearLayout;
        this.f118263b = eZCalendarView;
        this.f118264c = textView;
        this.f118265d = textView2;
        this.f118266e = linearLayout2;
    }

    @androidx.annotation.n0
    public static z90 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21106, new Class[]{View.class}, z90.class);
        if (patchProxyResultProxy.isSupported) {
            return (z90) patchProxyResultProxy.result;
        }
        int i10 = R.id.calendarView;
        EZCalendarView eZCalendarView = (EZCalendarView) l3.d.a(view, R.id.calendarView);
        if (eZCalendarView != null) {
            i10 = R.id.tv_current_month;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_current_month);
            if (textView != null) {
                i10 = R.id.tv_rule_desc;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_rule_desc);
                if (textView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new z90(linearLayout, eZCalendarView, textView, textView2, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static z90 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21104, new Class[]{LayoutInflater.class}, z90.class);
        return patchProxyResultProxy.isSupported ? (z90) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z90 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21105, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z90.class);
        if (patchProxyResultProxy.isSupported) {
            return (z90) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_retroactive_calendar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f118262a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21107, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
