package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: DaysOfWeekAdapter.java */
/* JADX INFO: loaded from: classes7.dex */
public class i extends BaseAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f54089e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f54090f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Calendar f54091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f54093d;

    static {
        f54090f = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public i() {
        Calendar calendarV = s.v();
        this.f54091b = calendarV;
        this.f54092c = calendarV.getMaximum(7);
        this.f54093d = calendarV.getFirstDayOfWeek();
    }

    public i(int i10) {
        Calendar calendarV = s.v();
        this.f54091b = calendarV;
        this.f54092c = calendarV.getMaximum(7);
        this.f54093d = i10;
    }

    private int b(int i10) {
        int i11 = i10 + this.f54093d;
        int i12 = this.f54092c;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    @p0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f54092c) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f54092c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    @p0
    public View getView(int i10, @p0 View view, @n0 ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f54091b.set(7, b(i10));
        textView.setText(this.f54091b.getDisplayName(7, f54090f, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f54091b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
