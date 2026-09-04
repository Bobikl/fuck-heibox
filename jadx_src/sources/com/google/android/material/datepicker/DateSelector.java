package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.text.SimpleDateFormat;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface DateSelector<S> extends Parcelable {
    @d1
    int Q();

    @e1
    int S(Context context);

    @n0
    String W0(@n0 Context context);

    void Z(@n0 S s10);

    @n0
    View i0(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle, @n0 CalendarConstraints calendarConstraints, @n0 p<S> pVar);

    @p0
    String q();

    void q0(@p0 SimpleDateFormat simpleDateFormat);

    @n0
    String q1(Context context);

    @n0
    Collection<androidx.core.util.k<Long, Long>> r1();

    boolean s0();

    @p0
    S t();

    @n0
    Collection<Long> u0();

    void w0(long j10);
}
