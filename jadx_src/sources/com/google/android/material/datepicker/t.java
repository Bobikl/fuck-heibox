package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.timepicker.TimeModel;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: YearGridAdapter.java */
/* JADX INFO: loaded from: classes7.dex */
public class t extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaterialCalendar<?> f54175b;

    /* JADX INFO: compiled from: YearGridAdapter.java */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f54176b;

        a(int i10) {
            this.f54176b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f54175b.h4(t.this.f54175b.Y3().h(Month.b(this.f54176b, t.this.f54175b.a4().f54033c)));
            t.this.f54175b.i4(MaterialCalendar.CalendarSelector.DAY);
        }
    }

    /* JADX INFO: compiled from: YearGridAdapter.java */
    public static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final TextView f54178b;

        b(TextView textView) {
            super(textView);
            this.f54178b = textView;
        }
    }

    t(MaterialCalendar<?> materialCalendar) {
        this.f54175b = materialCalendar;
    }

    @n0
    private View.OnClickListener n(int i10) {
        return new a(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f54175b.Y3().w();
    }

    int o(int i10) {
        return i10 - this.f54175b.Y3().u().f54034d;
    }

    int p(int i10) {
        return this.f54175b.Y3().u().f54034d + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@n0 b bVar, int i10) {
        int iP = p(i10);
        bVar.f54178b.setText(String.format(Locale.getDefault(), TimeModel.f55754j, Integer.valueOf(iP)));
        TextView textView = bVar.f54178b;
        textView.setContentDescription(h.k(textView.getContext(), iP));
        com.google.android.material.datepicker.b bVarZ3 = this.f54175b.Z3();
        Calendar calendarT = s.t();
        com.google.android.material.datepicker.a aVar = calendarT.get(1) == iP ? bVarZ3.f54074f : bVarZ3.f54072d;
        Iterator<Long> it = this.f54175b.N3().u0().iterator();
        while (it.hasNext()) {
            calendarT.setTimeInMillis(it.next().longValue());
            if (calendarT.get(1) == iP) {
                aVar = bVarZ3.f54073e;
            }
        }
        aVar.f(bVar.f54178b);
        bVar.f54178b.setOnClickListener(n(iP));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @n0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@n0 ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
