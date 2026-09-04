package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.hbcommon.component.ezcalendarview.EZCalendarView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewAcCalendarCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class be0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f108926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EZCalendarView f108927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ListSectionHeader f108929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108934i;

    private be0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 EZCalendarView eZCalendarView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ListSectionHeader listSectionHeader, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f108926a = cardView;
        this.f108927b = eZCalendarView;
        this.f108928c = linearLayout;
        this.f108929d = listSectionHeader;
        this.f108930e = relativeLayout;
        this.f108931f = relativeLayout2;
        this.f108932g = textView;
        this.f108933h = textView2;
        this.f108934i = linearLayout2;
    }

    @androidx.annotation.n0
    public static be0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21524, new Class[]{View.class}, be0.class);
        if (patchProxyResultProxy.isSupported) {
            return (be0) patchProxyResultProxy.result;
        }
        int i10 = R.id.calendar;
        EZCalendarView eZCalendarView = (EZCalendarView) l3.d.a(view, R.id.calendar);
        if (eZCalendarView != null) {
            i10 = R.id.ll_week_match_count;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_week_match_count);
            if (linearLayout != null) {
                i10 = R.id.lsh;
                ListSectionHeader listSectionHeader = (ListSectionHeader) l3.d.a(view, R.id.lsh);
                if (listSectionHeader != null) {
                    i10 = R.id.next_month;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.next_month);
                    if (relativeLayout != null) {
                        i10 = R.id.prev_month;
                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.prev_month);
                        if (relativeLayout2 != null) {
                            i10 = R.id.tv_calendar_expand;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_calendar_expand);
                            if (textView != null) {
                                i10 = R.id.tv_current_month;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_current_month);
                                if (textView2 != null) {
                                    i10 = R.id.vg_calendar_container;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_calendar_container);
                                    if (linearLayout2 != null) {
                                        return new be0((CardView) view, eZCalendarView, linearLayout, listSectionHeader, relativeLayout, relativeLayout2, textView, textView2, linearLayout2);
                                    }
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
    public static be0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21522, new Class[]{LayoutInflater.class}, be0.class);
        return patchProxyResultProxy.isSupported ? (be0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static be0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21523, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, be0.class);
        if (patchProxyResultProxy.isSupported) {
            return (be0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_ac_calendar_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f108926a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21525, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
