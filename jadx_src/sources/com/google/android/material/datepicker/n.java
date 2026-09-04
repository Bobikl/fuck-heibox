package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.R;
import com.google.android.material.timepicker.TimeModel;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: MonthAdapter.java */
/* JADX INFO: loaded from: classes7.dex */
public class n extends BaseAdapter {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f54151h = s.v().getMaximum(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f54152i = (s.v().getMaximum(5) + s.v().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f54153j = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Month f54154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final DateSelector<?> f54155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Collection<Long> f54156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    b f54157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final CalendarConstraints f54158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    final DayViewDecorator f54159g;

    n(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, @p0 DayViewDecorator dayViewDecorator) {
        this.f54154b = month;
        this.f54155c = dateSelector;
        this.f54158f = calendarConstraints;
        this.f54159g = dayViewDecorator;
        this.f54156d = dateSelector.u0();
    }

    private String c(Context context, long j10) {
        return h.e(context, j10, l(j10), k(j10), g(j10));
    }

    private void f(Context context) {
        if (this.f54157e == null) {
            this.f54157e = new b(context);
        }
    }

    private boolean j(long j10) {
        Iterator<Long> it = this.f54155c.u0().iterator();
        while (it.hasNext()) {
            if (s.a(j10) == s.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean l(long j10) {
        return s.t().getTimeInMillis() == j10;
    }

    private void o(@p0 TextView textView, long j10, int i10) {
        a aVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String strC = c(context, j10);
        textView.setContentDescription(strC);
        boolean zE = this.f54158f.j().e(j10);
        boolean zJ = false;
        if (zE) {
            textView.setEnabled(true);
            zJ = j(j10);
            textView.setSelected(zJ);
            if (zJ) {
                aVar = this.f54157e.f54070b;
            } else {
                aVar = l(j10) ? this.f54157e.f54071c : this.f54157e.f54069a;
            }
        } else {
            textView.setEnabled(false);
            aVar = this.f54157e.f54075g;
        }
        a aVar2 = aVar;
        boolean z10 = zJ;
        DayViewDecorator dayViewDecorator = this.f54159g;
        if (dayViewDecorator == null || i10 == -1) {
            aVar2.f(textView);
            return;
        }
        Month month = this.f54154b;
        int i11 = month.f54034d;
        int i12 = month.f54033c;
        aVar2.g(textView, dayViewDecorator.a(context, i11, i12, i10, zE, z10));
        textView.setCompoundDrawables(this.f54159g.c(context, i11, i12, i10, zE, z10), this.f54159g.f(context, i11, i12, i10, zE, z10), this.f54159g.d(context, i11, i12, i10, zE, z10), this.f54159g.b(context, i11, i12, i10, zE, z10));
        textView.setContentDescription(this.f54159g.h(context, i11, i12, i10, zE, z10, strC));
    }

    private void p(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (Month.c(j10).equals(this.f54154b)) {
            int iJ = this.f54154b.j(j10);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iJ) - materialCalendarGridView.getFirstVisiblePosition()), j10, iJ);
        }
    }

    int a(int i10) {
        return b() + (i10 - 1);
    }

    int b() {
        return this.f54154b.f(this.f54158f.n());
    }

    @Override // android.widget.Adapter
    @p0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 < b() || i10 > m()) {
            return null;
        }
        return Long.valueOf(this.f54154b.h(n(i10)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0056  */
    @Override // android.widget.Adapter
    @n0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public TextView getView(int i10, @p0 View view, @n0 ViewGroup viewGroup) {
        f(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iB = i10 - b();
        int i11 = -1;
        if (iB >= 0) {
            Month month = this.f54154b;
            if (iB >= month.f54036f) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                int i12 = iB + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, TimeModel.f55754j, Integer.valueOf(i12)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                i11 = i12;
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        Long item = getItem(i10);
        if (item == null) {
            return textView;
        }
        o(textView, item.longValue(), i11);
        return textView;
    }

    @j1
    boolean g(long j10) {
        Iterator<androidx.core.util.k<Long, Long>> it = this.f54155c.r1().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().f21264b;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f54152i;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f54154b.f54035e;
    }

    boolean h(int i10) {
        return i10 % this.f54154b.f54035e == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(int i10) {
        return (i10 + 1) % this.f54154b.f54035e == 0;
    }

    @j1
    boolean k(long j10) {
        Iterator<androidx.core.util.k<Long, Long>> it = this.f54155c.r1().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().f21263a;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    int m() {
        return (b() + this.f54154b.f54036f) - 1;
    }

    int n(int i10) {
        return (i10 - b()) + 1;
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f54156d.iterator();
        while (it.hasNext()) {
            p(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.f54155c;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.u0().iterator();
            while (it2.hasNext()) {
                p(materialCalendarGridView, it2.next().longValue());
            }
            this.f54156d = this.f54155c.u0();
        }
    }

    boolean r(int i10) {
        return i10 >= b() && i10 <= m();
    }
}
