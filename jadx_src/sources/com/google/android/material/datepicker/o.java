package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.j1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;

/* JADX INFO: compiled from: MonthsPagerAdapter.java */
/* JADX INFO: loaded from: classes7.dex */
public class o extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final CalendarConstraints f54160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DateSelector<?> f54161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final DayViewDecorator f54162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MaterialCalendar.k f54163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f54164f;

    /* JADX INFO: compiled from: MonthsPagerAdapter.java */
    public class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f54165b;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f54165b = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f54165b.getAdapter().r(i10)) {
                o.this.f54163e.a(this.f54165b.getAdapter().getItem(i10).longValue());
            }
        }
    }

    /* JADX INFO: compiled from: MonthsPagerAdapter.java */
    public static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final TextView f54167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final MaterialCalendarGridView f54168c;

        b(@n0 LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f54167b = textView;
            j1.C1(textView, true);
            this.f54168c = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    o(@n0 Context context, DateSelector<?> dateSelector, @n0 CalendarConstraints calendarConstraints, @p0 DayViewDecorator dayViewDecorator, MaterialCalendar.k kVar) {
        Month monthU = calendarConstraints.u();
        Month monthK = calendarConstraints.k();
        Month monthP = calendarConstraints.p();
        if (monthU.compareTo(monthP) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthP.compareTo(monthK) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f54164f = (n.f54151h * MaterialCalendar.b4(context)) + (j.k4(context) ? MaterialCalendar.b4(context) : 0);
        this.f54160b = calendarConstraints;
        this.f54161c = dateSelector;
        this.f54162d = dayViewDecorator;
        this.f54163e = kVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f54160b.o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return this.f54160b.u().n(i10).l();
    }

    @n0
    Month n(int i10) {
        return this.f54160b.u().n(i10);
    }

    @n0
    CharSequence o(int i10) {
        return n(i10).k();
    }

    int p(@n0 Month month) {
        return this.f54160b.u().o(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@n0 b bVar, int i10) {
        Month monthN = this.f54160b.u().n(i10);
        bVar.f54167b.setText(monthN.k());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f54168c.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !monthN.equals(materialCalendarGridView.getAdapter().f54154b)) {
            n nVar = new n(monthN, this.f54161c, this.f54160b, this.f54162d);
            materialCalendarGridView.setNumColumns(monthN.f54035e);
            materialCalendarGridView.setAdapter((ListAdapter) nVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @n0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@n0 ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!j.k4(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f54164f));
        return new b(linearLayout, true);
    }
}
