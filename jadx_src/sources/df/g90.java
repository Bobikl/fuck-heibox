package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.ezcalendarview.EZCalendarView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutPubgDailyReportBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g90 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EZCalendarView f110887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110894i;

    private g90(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 EZCalendarView eZCalendarView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f110886a = linearLayout;
        this.f110887b = eZCalendarView;
        this.f110888c = linearLayout2;
        this.f110889d = relativeLayout;
        this.f110890e = relativeLayout2;
        this.f110891f = textView;
        this.f110892g = textView2;
        this.f110893h = linearLayout3;
        this.f110894i = linearLayout4;
    }

    @androidx.annotation.n0
    public static g90 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21030, new Class[]{View.class}, g90.class);
        if (patchProxyResultProxy.isSupported) {
            return (g90) patchProxyResultProxy.result;
        }
        int i10 = R.id.calendar;
        EZCalendarView eZCalendarView = (EZCalendarView) l3.d.a(view, R.id.calendar);
        if (eZCalendarView != null) {
            i10 = R.id.ll_match_count;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_match_count);
            if (linearLayout != null) {
                i10 = R.id.next_month;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.next_month);
                if (relativeLayout != null) {
                    i10 = R.id.prev_month;
                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.prev_month);
                    if (relativeLayout2 != null) {
                        i10 = R.id.tv_current_month;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_current_month);
                        if (textView != null) {
                            i10 = R.id.tv_daily_report_expand;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_daily_report_expand);
                            if (textView2 != null) {
                                i10 = R.id.vg_calendar_container;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_calendar_container);
                                if (linearLayout2 != null) {
                                    LinearLayout linearLayout3 = (LinearLayout) view;
                                    return new g90(linearLayout3, eZCalendarView, linearLayout, relativeLayout, relativeLayout2, textView, textView2, linearLayout2, linearLayout3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static g90 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21028, new Class[]{LayoutInflater.class}, g90.class);
        return patchProxyResultProxy.isSupported ? (g90) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static g90 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21029, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g90.class);
        if (patchProxyResultProxy.isSupported) {
            return (g90) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_pubg_daily_report, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110886a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21031, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
