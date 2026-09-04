package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Month f53964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final Month f53965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private final DateValidator f53966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private Month f53967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f53968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f53969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f53970h;

    public interface DateValidator extends Parcelable {
        boolean e(long j10);
    }

    public class a implements Parcelable.Creator<CalendarConstraints> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(@n0 Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f53971f = s.a(Month.b(bb.c.b.Dx, 0).f54037g);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final long f53972g = s.a(Month.b(bb.c.d.f31539t0, 11).f54037g);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f53973h = "DEEP_COPY_VALIDATOR_KEY";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f53974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f53975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f53976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f53977d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private DateValidator f53978e;

        public b() {
            this.f53974a = f53971f;
            this.f53975b = f53972g;
            this.f53978e = DateValidatorPointForward.a(Long.MIN_VALUE);
        }

        b(@n0 CalendarConstraints calendarConstraints) {
            this.f53974a = f53971f;
            this.f53975b = f53972g;
            this.f53978e = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.f53974a = calendarConstraints.f53964b.f54037g;
            this.f53975b = calendarConstraints.f53965c.f54037g;
            this.f53976c = Long.valueOf(calendarConstraints.f53967e.f54037g);
            this.f53977d = calendarConstraints.f53968f;
            this.f53978e = calendarConstraints.f53966d;
        }

        @n0
        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f53973h, this.f53978e);
            Month monthC = Month.c(this.f53974a);
            Month monthC2 = Month.c(this.f53975b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable(f53973h);
            Long l10 = this.f53976c;
            return new CalendarConstraints(monthC, monthC2, dateValidator, l10 == null ? null : Month.c(l10.longValue()), this.f53977d, null);
        }

        @s9.a
        @n0
        public b b(long j10) {
            this.f53975b = j10;
            return this;
        }

        @s9.a
        @n0
        public b c(int i10) {
            this.f53977d = i10;
            return this;
        }

        @s9.a
        @n0
        public b d(long j10) {
            this.f53976c = Long.valueOf(j10);
            return this;
        }

        @s9.a
        @n0
        public b e(long j10) {
            this.f53974a = j10;
            return this;
        }

        @s9.a
        @n0
        public b f(@n0 DateValidator dateValidator) {
            Objects.requireNonNull(dateValidator, "validator cannot be null");
            this.f53978e = dateValidator;
            return this;
        }
    }

    private CalendarConstraints(@n0 Month month, @n0 Month month2, @n0 DateValidator dateValidator, @p0 Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f53964b = month;
        this.f53965c = month2;
        this.f53967e = month3;
        this.f53968f = i10;
        this.f53966d = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > s.v().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f53970h = month.o(month2) + 1;
        this.f53969g = (month2.f54034d - month.f54034d) + 1;
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10, a aVar) {
        this(month, month2, dateValidator, month3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f53964b.equals(calendarConstraints.f53964b) && this.f53965c.equals(calendarConstraints.f53965c) && androidx.core.util.j.a(this.f53967e, calendarConstraints.f53967e) && this.f53968f == calendarConstraints.f53968f && this.f53966d.equals(calendarConstraints.f53966d);
    }

    Month h(Month month) {
        if (month.compareTo(this.f53964b) < 0) {
            return this.f53964b;
        }
        return month.compareTo(this.f53965c) > 0 ? this.f53965c : month;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53964b, this.f53965c, this.f53967e, Integer.valueOf(this.f53968f), this.f53966d});
    }

    public DateValidator j() {
        return this.f53966d;
    }

    @n0
    Month k() {
        return this.f53965c;
    }

    public long l() {
        return this.f53965c.f54037g;
    }

    int n() {
        return this.f53968f;
    }

    int o() {
        return this.f53970h;
    }

    @p0
    Month p() {
        return this.f53967e;
    }

    @p0
    public Long r() {
        Month month = this.f53967e;
        if (month == null) {
            return null;
        }
        return Long.valueOf(month.f54037g);
    }

    @n0
    Month u() {
        return this.f53964b;
    }

    public long v() {
        return this.f53964b.f54037g;
    }

    int w() {
        return this.f53969g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f53964b, 0);
        parcel.writeParcelable(this.f53965c, 0);
        parcel.writeParcelable(this.f53967e, 0);
        parcel.writeParcelable(this.f53966d, 0);
        parcel.writeInt(this.f53968f);
    }

    boolean y(long j10) {
        if (this.f53964b.h(1) <= j10) {
            Month month = this.f53965c;
            if (j10 <= month.h(month.f54036f)) {
                return true;
            }
        }
        return false;
    }

    void z(@p0 Month month) {
        this.f53967e = month;
    }
}
