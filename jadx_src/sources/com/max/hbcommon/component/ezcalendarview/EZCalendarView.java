package com.max.hbcommon.component.ezcalendarview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.p0;
import androidx.viewpager.widget.ViewPager;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class EZCalendarView extends ViewGroup {
    public static final String A = "style";
    public static final String B = "style_color";
    public static final String C = "style_count";
    public static final String D = "style_text_color";
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 3;
    public static final int I = 4;
    public static final int J = 5;
    public static final int K = 6;
    public static final int L = 7;
    public static final int M = 8;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f67600t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f67601u = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f67603w = 1900;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f67604x = 2100;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f67605y = "yyyy-MM-dd";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Calendar f67607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Calendar f67608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Calendar f67609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ViewPager f67610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageButton f67611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageButton f67612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.max.hbcommon.component.ezcalendarview.a f67613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Calendar f67614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f67615j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e f67616k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private f f67617l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f67618m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private HashMap<String, Bundle> f67619n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f67620o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f67621p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Context f67622q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ViewPager.i f67623r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final View.OnClickListener f67624s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f67602v = R.layout.day_picker_content_material;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final DateFormat f67606z = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

    public class a implements com.max.hbcommon.component.ezcalendarview.a.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.component.ezcalendarview.a.b
        public void a(com.max.hbcommon.component.ezcalendarview.a aVar, Calendar calendar) {
            if (PatchProxy.proxy(new Object[]{aVar, calendar}, this, changeQuickRedirect, false, bb.c.d.Fq, new Class[]{com.max.hbcommon.component.ezcalendarview.a.class, Calendar.class}, Void.TYPE).isSupported || EZCalendarView.this.f67615j == null) {
                return;
            }
            EZCalendarView.this.f67615j.a(EZCalendarView.this, calendar);
        }
    }

    public class b implements ViewPager.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
            Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.Gq, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported) {
                return;
            }
            float fAbs = Math.abs(0.5f - f10) * 2.0f;
            EZCalendarView.this.f67611f.setAlpha(fAbs);
            EZCalendarView.this.f67612g.setAlpha(fAbs);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Hq, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            EZCalendarView.d(EZCalendarView.this, i10);
            if (EZCalendarView.this.f67616k != null) {
                int iG = EZCalendarView.this.f67613h.g(i10);
                int iE = EZCalendarView.this.f67613h.e(i10);
                Calendar calendar = Calendar.getInstance();
                calendar.set(iG, iE, 1, 0, 0, 0);
                EZCalendarView.this.f67616k.a(EZCalendarView.this, calendar);
            }
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i10;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.Iq, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (view == EZCalendarView.this.f67611f) {
                i10 = -1;
            } else if (view != EZCalendarView.this.f67612g) {
                return;
            } else {
                i10 = 1;
            }
            EZCalendarView.this.r(i10, true);
        }
    }

    public interface d {
        void a(EZCalendarView eZCalendarView, Calendar calendar);
    }

    public interface e {
        void a(EZCalendarView eZCalendarView, Calendar calendar);
    }

    public interface f {
        void a(int i10, boolean z10, boolean z11);
    }

    public EZCalendarView(Context context) {
        this(context, null);
    }

    public EZCalendarView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67607b = Calendar.getInstance();
        this.f67608c = Calendar.getInstance();
        this.f67609d = Calendar.getInstance();
        this.f67618m = false;
        this.f67619n = new HashMap<>();
        this.f67621p = 0;
        this.f67623r = new b();
        this.f67624s = new c();
        this.f67622q = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f66465v0);
        this.f67620o = typedArrayObtainStyledAttributes.getInt(R.styleable.EZCalendarView_ezCalendarViewMode, 0);
        typedArrayObtainStyledAttributes.recycle();
        p();
    }

    static /* synthetic */ void d(EZCalendarView eZCalendarView, int i10) {
        if (PatchProxy.proxy(new Object[]{eZCalendarView, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.d.Eq, new Class[]{EZCalendarView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        eZCalendarView.t(i10);
    }

    private int h(Calendar calendar, Calendar calendar2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{calendar, calendar2}, this, changeQuickRedirect, false, bb.c.d.vq, new Class[]{Calendar.class, Calendar.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (calendar2.get(2) - calendar.get(2)) + ((calendar2.get(1) - calendar.get(1)) * 12);
    }

    private int l(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.d.wq, new Class[]{Long.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : com.max.hbcommon.component.ezcalendarview.utils.a.g(h(this.f67608c, m(j10)), 0, h(this.f67608c, this.f67609d));
    }

    private Calendar m(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.d.xq, new Class[]{Long.TYPE}, Calendar.class);
        if (patchProxyResultProxy.isSupported) {
            return (Calendar) patchProxyResultProxy.result;
        }
        if (this.f67614i == null) {
            this.f67614i = Calendar.getInstance();
        }
        this.f67614i.setTimeInMillis(j10);
        return this.f67614i;
    }

    private void s(long j10, boolean z10, boolean z11) {
        Object[] objArr = {new Long(j10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.kq, new Class[]{Long.TYPE, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (z11) {
            this.f67607b.setTimeInMillis(j10);
        }
        int iL = l(j10);
        if (iL != this.f67610e.getCurrentItem()) {
            this.f67610e.setCurrentItem(iL, z10);
        }
        this.f67614i.setTimeInMillis(j10);
        this.f67613h.q(this.f67614i);
    }

    private void t(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.aq, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        boolean z10 = i10 > 0;
        boolean z11 = i10 < this.f67613h.getCount() - 1;
        f fVar = this.f67617l;
        if (fVar != null) {
            fVar.a(i10, z10, z11);
        }
        int i11 = this.f67620o;
        if (i11 == 0) {
            this.f67611f.setVisibility(z10 ? 0 : 4);
            this.f67612g.setVisibility(z11 ? 0 : 4);
        } else {
            if (i11 != 1) {
                return;
            }
            this.f67611f.setVisibility(4);
            this.f67612g.setVisibility(4);
        }
    }

    public void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.mq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67619n.clear();
        this.f67613h.h();
    }

    public long getDate() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.lq, new Class[0], Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : this.f67607b.getTimeInMillis();
    }

    public int getDayOfWeekTextAppearance() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.fq, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f67613h.b();
    }

    public int getDayTextAppearance() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.hq, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f67613h.c();
    }

    public HashMap<String, Bundle> getExtraDataList() {
        return this.f67619n;
    }

    public int getFirstDayOfWeek() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.pq, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f67613h.d();
    }

    public long getMaxDate() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.tq, new Class[0], Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : this.f67609d.getTimeInMillis();
    }

    public long getMinDate() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.rq, new Class[0], Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : this.f67608c.getTimeInMillis();
    }

    public int getMode() {
        return this.f67620o;
    }

    public int getMostVisiblePosition() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.yq, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f67610e.getCurrentItem();
    }

    public int getStyle() {
        return this.f67621p;
    }

    public Bundle i(Calendar calendar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{calendar}, this, changeQuickRedirect, false, bb.c.d.Dq, new Class[]{Calendar.class}, Bundle.class);
        return patchProxyResultProxy.isSupported ? (Bundle) patchProxyResultProxy.result : j(calendar.getTimeInMillis());
    }

    public Bundle j(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.d.Bq, new Class[]{Long.TYPE}, Bundle.class);
        return patchProxyResultProxy.isSupported ? (Bundle) patchProxyResultProxy.result : this.f67619n.get(f67606z.format(new Date(j10)));
    }

    public Bundle k(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.Cq, new Class[]{cls, cls, cls}, Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(i10, i11, i12, 0, 0, 0);
        return j(calendar.getTimeInMillis());
    }

    public void n(long j10, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{new Long(j10), bundle}, this, changeQuickRedirect, false, bb.c.d.nq, new Class[]{Long.TYPE, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f67619n.put(f67606z.format(new Date(j10)), bundle);
        this.f67613h.h();
    }

    public void o() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.uq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67613h.p(this.f67608c, this.f67609d);
        s(this.f67607b.getTimeInMillis(), false, false);
        t(this.f67610e.getCurrentItem());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.dq, new Class[]{Boolean.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        ImageButton imageButton = this.f67611f;
        ImageButton imageButton2 = this.f67612g;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        this.f67610e.layout(0, 0, i14, i15);
        SimpleMonthView simpleMonthView = (SimpleMonthView) ((ViewGroup) this.f67610e.getChildAt(0)).getChildAt(0);
        int monthHeight = simpleMonthView.getMonthHeight();
        int cellWidth = simpleMonthView.getCellWidth();
        int measuredWidth = imageButton.getMeasuredWidth();
        int measuredHeight = imageButton.getMeasuredHeight();
        int paddingTop = this.f67618m ? simpleMonthView.getPaddingTop() + ((monthHeight - measuredHeight) / 2) : (i15 - measuredHeight) / 2;
        int i16 = this.f67618m ? (cellWidth - measuredWidth) / 2 : 0;
        imageButton.layout(i16, paddingTop, measuredWidth + i16, measuredHeight + paddingTop);
        int measuredWidth2 = imageButton2.getMeasuredWidth();
        int measuredHeight2 = imageButton2.getMeasuredHeight();
        int paddingTop2 = this.f67618m ? simpleMonthView.getPaddingTop() + ((monthHeight - measuredHeight2) / 2) : (i15 - measuredHeight2) / 2;
        if (this.f67618m) {
            i14 -= (cellWidth - measuredWidth2) / 2;
        }
        imageButton2.layout(i14 - measuredWidth2, paddingTop2, i14, measuredHeight2 + paddingTop2);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.bq, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        ViewPager viewPager = this.f67610e;
        measureChild(viewPager, i10, i11);
        setMeasuredDimension(viewPager.getMeasuredWidthAndState(), viewPager.getMeasuredHeightAndState());
        int measuredWidth = viewPager.getMeasuredWidth();
        int measuredHeight = viewPager.getMeasuredHeight();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f67611f.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f67612g.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.cq, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.onRtlPropertiesChanged(i10);
        requestLayout();
    }

    public void p() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Yp, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        q(0);
    }

    public void q(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Zp, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67621p = i10;
        if (i10 == 1) {
            this.f67613h = new com.max.hbcommon.component.ezcalendarview.a(this.f67622q, this, R.layout.date_pick_month_item_pubg, R.id.month_view);
        } else {
            this.f67613h = new com.max.hbcommon.component.ezcalendarview.a(this.f67622q, this, R.layout.date_picker_month_item_material, R.id.month_view);
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f67622q).inflate(f67602v, (ViewGroup) this, false);
        while (viewGroup.getChildCount() > 0) {
            View childAt = viewGroup.getChildAt(0);
            viewGroup.removeViewAt(0);
            addView(childAt);
        }
        ImageButton imageButton = (ImageButton) findViewById(R.id.prev);
        this.f67611f = imageButton;
        imageButton.setOnClickListener(this.f67624s);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.next);
        this.f67612g = imageButton2;
        imageButton2.setOnClickListener(this.f67624s);
        ViewPager viewPager = (ViewPager) findViewById(R.id.day_picker_view_pager);
        this.f67610e = viewPager;
        viewPager.setAdapter(this.f67613h);
        this.f67610e.setOnPageChangeListener(this.f67623r);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1900, 0, 1);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(2100, 11, 31);
        long timeInMillis2 = calendar.getTimeInMillis();
        if (timeInMillis2 < timeInMillis) {
            throw new IllegalArgumentException("maxDate must be >= minDate hkey");
        }
        long jH = com.max.hbcommon.component.ezcalendarview.utils.a.h(System.currentTimeMillis(), timeInMillis, timeInMillis2);
        setFirstDayOfWeek(Calendar.getInstance().getFirstDayOfWeek());
        setMinDate(timeInMillis);
        setMaxDate(timeInMillis2);
        setDate(jH, false);
        this.f67613h.o(new a());
    }

    public void r(int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.Aq, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67610e.setCurrentItem(this.f67610e.getCurrentItem() + i10, z10);
    }

    public void setDate(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.d.iq, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setDate(j10, false);
    }

    public void setDate(long j10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.jq, new Class[]{Long.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        s(j10, z10, true);
    }

    public void setDayOfWeekTextAppearance(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.eq, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67613h.j(i10);
    }

    public void setDayTextAppearance(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.gq, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67613h.l(i10);
    }

    public void setFirstDayOfWeek(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.oq, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67613h.m(i10);
    }

    public void setMaxDate(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.d.sq, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67609d.setTimeInMillis(j10);
        o();
    }

    public void setMinDate(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.d.qq, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67608c.setTimeInMillis(j10);
        o();
    }

    public void setMode(int i10) {
        this.f67620o = i10;
    }

    public void setOnDaySelectedListener(d dVar) {
        this.f67615j = dVar;
    }

    public void setOnMonthChangedListener(e eVar) {
        this.f67616k = eVar;
    }

    public void setOnUpdateNavButtonListener(f fVar) {
        this.f67617l = fVar;
    }

    public void setPosition(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.zq, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67610e.setCurrentItem(i10, false);
    }
}
