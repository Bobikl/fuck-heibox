package com.max.hbcommon.component.ezcalendarview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.d0;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Calendar;

/* JADX INFO: compiled from: DayPickerPagerAdapter.java */
/* JADX INFO: loaded from: classes9.dex */
public class a extends androidx.viewpager.widget.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f67663t = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EZCalendarView f67667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LayoutInflater f67668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f67669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f67670g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f67672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f67673j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f67674k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f67675l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f67676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f67677n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f67678o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f67679p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f67680q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f67681r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f67664a = Calendar.getInstance();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Calendar f67665b = Calendar.getInstance();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<c> f67666c = new SparseArray<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Calendar f67671h = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final SimpleMonthView.a f67682s = new C0545a();

    /* JADX INFO: renamed from: com.max.hbcommon.component.ezcalendarview.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DayPickerPagerAdapter.java */
    public class C0545a implements SimpleMonthView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0545a() {
        }

        @Override // com.max.hbcommon.component.ezcalendarview.SimpleMonthView.a
        public void a(SimpleMonthView simpleMonthView, Calendar calendar) {
            if (PatchProxy.proxy(new Object[]{simpleMonthView, calendar}, this, changeQuickRedirect, false, bb.c.d.Wp, new Class[]{SimpleMonthView.class, Calendar.class}, Void.TYPE).isSupported || calendar == null) {
                return;
            }
            a.this.q(calendar);
            if (a.this.f67678o != null) {
                a.this.f67678o.a(a.this, calendar);
            }
        }
    }

    /* JADX INFO: compiled from: DayPickerPagerAdapter.java */
    public interface b {
        void a(a aVar, Calendar calendar);
    }

    /* JADX INFO: compiled from: DayPickerPagerAdapter.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f67684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f67685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SimpleMonthView f67686c;

        public c(int i10, View view, SimpleMonthView simpleMonthView) {
            this.f67684a = i10;
            this.f67685b = view;
            this.f67686c = simpleMonthView;
        }
    }

    public a(@n0 Context context, @n0 EZCalendarView eZCalendarView, @i0 int i10, @d0 int i11) {
        this.f67681r = 0;
        this.f67668e = LayoutInflater.from(context);
        this.f67667d = eZCalendarView;
        this.f67669f = i10;
        this.f67670g = i11;
        this.f67681r = eZCalendarView.getStyle();
    }

    int b() {
        return this.f67673j;
    }

    int c() {
        return this.f67674k;
    }

    public int d() {
        return this.f67680q;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10), obj}, this, changeQuickRedirect, false, bb.c.d.Up, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        viewGroup.removeView(((c) obj).f67685b);
        this.f67666c.remove(i10);
    }

    public int e(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.Qp, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (i10 + this.f67664a.get(2)) % 12;
    }

    public int f(@p0 Calendar calendar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{calendar}, this, changeQuickRedirect, false, bb.c.d.Sp, new Class[]{Calendar.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (calendar == null) {
            return -1;
        }
        return ((calendar.get(1) - this.f67664a.get(1)) * 12) + (calendar.get(2) - this.f67664a.get(2));
    }

    public int g(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.Rp, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ((i10 + this.f67664a.get(2)) / 12) + this.f67664a.get(1);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f67679p;
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(Object obj) {
        return ((c) obj).f67684a;
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence getPageTitle(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Vp, new Class[]{Integer.TYPE}, CharSequence.class);
        if (patchProxyResultProxy.isSupported) {
            return (CharSequence) patchProxyResultProxy.result;
        }
        SimpleMonthView simpleMonthView = this.f67666c.get(i10).f67686c;
        if (simpleMonthView != null) {
            return simpleMonthView.getTitle();
        }
        return null;
    }

    public void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Pp, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int size = this.f67666c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f67666c.valueAt(i10).f67686c.t();
        }
    }

    void i(ColorStateList colorStateList) {
        this.f67675l = colorStateList;
    }

    @Override // androidx.viewpager.widget.a
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Tp, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        View viewInflate = this.f67668e.inflate(this.f67669f, viewGroup, false);
        SimpleMonthView simpleMonthView = (SimpleMonthView) viewInflate.findViewById(this.f67670g);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) simpleMonthView.getLayoutParams();
        int mode = this.f67667d.getMode();
        simpleMonthView.setStyle(this.f67681r);
        if (this.f67681r == 1) {
            int iF = ViewUtils.f(viewInflate.getContext(), 12.0f);
            layoutParams.setMargins(iF, 0, iF, 0);
        } else if (mode == 0) {
            layoutParams.setMargins(com.max.hbcommon.component.ezcalendarview.utils.c.a(20.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(20.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(20.0f), com.max.hbcommon.component.ezcalendarview.utils.c.a(20.0f));
            simpleMonthView.setBackgroundDrawable(com.max.hbcommon.component.ezcalendarview.utils.c.d(viewInflate.getContext().getColor(R.color.background_layer_2_color), ViewUtils.m(simpleMonthView.getContext(), ViewUtils.L(simpleMonthView.getContext()), ViewUtils.L(simpleMonthView.getContext()))));
            simpleMonthView.setElevation(com.max.hbcommon.component.ezcalendarview.utils.c.a(2.0f));
        } else if (mode == 1) {
            layoutParams.setMargins(0, 0, 0, 0);
        }
        simpleMonthView.setLayoutParams(layoutParams);
        simpleMonthView.setEZCalendarView(this.f67667d);
        simpleMonthView.setMode(mode);
        simpleMonthView.setOnDayClickListener(this.f67682s);
        simpleMonthView.setMonthTextAppearance(this.f67672i);
        simpleMonthView.setDayOfWeekTextAppearance(this.f67673j);
        simpleMonthView.setDayTextAppearance(this.f67674k);
        ColorStateList colorStateList = this.f67676m;
        if (colorStateList != null) {
            simpleMonthView.setDaySelectorColor(colorStateList);
        }
        ColorStateList colorStateList2 = this.f67677n;
        if (colorStateList2 != null) {
            simpleMonthView.setDayHighlightColor(colorStateList2);
        }
        ColorStateList colorStateList3 = this.f67675l;
        if (colorStateList3 != null) {
            simpleMonthView.setMonthTextColor(colorStateList3);
            simpleMonthView.setDayOfWeekTextColor(this.f67675l);
            simpleMonthView.setDayTextColor(this.f67675l);
        }
        int iE = e(i10);
        int iG = g(i10);
        Calendar calendar = this.f67671h;
        simpleMonthView.w((calendar == null || calendar.get(2) != iE) ? -1 : this.f67671h.get(5), iE, iG, this.f67680q, (this.f67664a.get(2) == iE && this.f67664a.get(1) == iG) ? this.f67664a.get(5) : 1, (this.f67665b.get(2) == iE && this.f67665b.get(1) == iG) ? this.f67665b.get(5) : 31);
        c cVar = new c(i10, viewInflate, simpleMonthView);
        this.f67666c.put(i10, cVar);
        viewGroup.addView(viewInflate);
        return cVar;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(View view, Object obj) {
        return view == ((c) obj).f67685b;
    }

    void j(int i10) {
        this.f67673j = i10;
    }

    void k(ColorStateList colorStateList) {
        this.f67676m = colorStateList;
    }

    void l(int i10) {
        this.f67674k = i10;
    }

    public void m(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Np, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67680q = i10;
        int size = this.f67666c.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f67666c.valueAt(i11).f67686c.setFirstDayOfWeek(i10);
        }
    }

    void n(int i10) {
        this.f67672i = i10;
    }

    public void o(b bVar) {
        this.f67678o = bVar;
    }

    public void p(@n0 Calendar calendar, @n0 Calendar calendar2) {
        if (PatchProxy.proxy(new Object[]{calendar, calendar2}, this, changeQuickRedirect, false, bb.c.d.Mp, new Class[]{Calendar.class, Calendar.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f67664a.setTimeInMillis(calendar.getTimeInMillis());
        this.f67665b.setTimeInMillis(calendar2.getTimeInMillis());
        this.f67679p = (this.f67665b.get(2) - this.f67664a.get(2)) + ((this.f67665b.get(1) - this.f67664a.get(1)) * 12) + 1;
        notifyDataSetChanged();
    }

    public void q(@p0 Calendar calendar) {
        c cVar;
        c cVar2;
        if (PatchProxy.proxy(new Object[]{calendar}, this, changeQuickRedirect, false, bb.c.d.Op, new Class[]{Calendar.class}, Void.TYPE).isSupported) {
            return;
        }
        int iF = f(this.f67671h);
        int iF2 = f(calendar);
        if (iF != iF2 && iF >= 0 && (cVar2 = this.f67666c.get(iF, null)) != null) {
            cVar2.f67686c.setSelectedDay(-1);
        }
        if (iF2 >= 0 && (cVar = this.f67666c.get(iF2, null)) != null) {
            cVar.f67686c.setSelectedDay(calendar.get(5));
        }
        this.f67671h = calendar;
    }
}
