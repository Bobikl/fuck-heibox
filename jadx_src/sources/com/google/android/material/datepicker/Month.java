package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes7.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Calendar f54032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f54033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f54034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f54035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f54036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f54037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private String f54038h;

    public class a implements Parcelable.Creator<Month> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(@n0 Parcel parcel) {
            return Month.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i10) {
            return new Month[i10];
        }
    }

    private Month(@n0 Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarF = s.f(calendar);
        this.f54032b = calendarF;
        this.f54033c = calendarF.get(2);
        this.f54034d = calendarF.get(1);
        this.f54035e = calendarF.getMaximum(7);
        this.f54036f = calendarF.getActualMaximum(5);
        this.f54037g = calendarF.getTimeInMillis();
    }

    @n0
    static Month b(int i10, int i11) {
        Calendar calendarV = s.v();
        calendarV.set(1, i10);
        calendarV.set(2, i11);
        return new Month(calendarV);
    }

    @n0
    static Month c(long j10) {
        Calendar calendarV = s.v();
        calendarV.setTimeInMillis(j10);
        return new Month(calendarV);
    }

    @n0
    static Month d() {
        return new Month(s.t());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@n0 Month month) {
        return this.f54032b.compareTo(month.f54032b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f54033c == month.f54033c && this.f54034d == month.f54034d;
    }

    int f(int i10) {
        int i11 = this.f54032b.get(7);
        if (i10 <= 0) {
            i10 = this.f54032b.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f54035e : i12;
    }

    long h(int i10) {
        Calendar calendarF = s.f(this.f54032b);
        calendarF.set(5, i10);
        return calendarF.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f54033c), Integer.valueOf(this.f54034d)});
    }

    int j(long j10) {
        Calendar calendarF = s.f(this.f54032b);
        calendarF.setTimeInMillis(j10);
        return calendarF.get(5);
    }

    @n0
    String k() {
        if (this.f54038h == null) {
            this.f54038h = h.l(this.f54032b.getTimeInMillis());
        }
        return this.f54038h;
    }

    long l() {
        return this.f54032b.getTimeInMillis();
    }

    @n0
    Month n(int i10) {
        Calendar calendarF = s.f(this.f54032b);
        calendarF.add(2, i10);
        return new Month(calendarF);
    }

    int o(@n0 Month month) {
        if (this.f54032b instanceof GregorianCalendar) {
            return ((month.f54034d - this.f54034d) * 12) + (month.f54033c - this.f54033c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@n0 Parcel parcel, int i10) {
        parcel.writeInt(this.f54034d);
        parcel.writeInt(this.f54033c);
    }
}
