package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.n0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f53986b;

    public class a implements Parcelable.Creator<DateValidatorPointForward> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward createFromParcel(@n0 Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward[] newArray(int i10) {
            return new DateValidatorPointForward[i10];
        }
    }

    private DateValidatorPointForward(long j10) {
        this.f53986b = j10;
    }

    /* synthetic */ DateValidatorPointForward(long j10, a aVar) {
        this(j10);
    }

    @n0
    public static DateValidatorPointForward a(long j10) {
        return new DateValidatorPointForward(j10);
    }

    @n0
    public static DateValidatorPointForward b() {
        return a(s.t().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean e(long j10) {
        return j10 >= this.f53986b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f53986b == ((DateValidatorPointForward) obj).f53986b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f53986b)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@n0 Parcel parcel, int i10) {
        parcel.writeLong(this.f53986b);
    }
}
