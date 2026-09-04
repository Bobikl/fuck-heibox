package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.n0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f53985b;

    public class a implements Parcelable.Creator<DateValidatorPointBackward> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointBackward createFromParcel(@n0 Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointBackward[] newArray(int i10) {
            return new DateValidatorPointBackward[i10];
        }
    }

    private DateValidatorPointBackward(long j10) {
        this.f53985b = j10;
    }

    /* synthetic */ DateValidatorPointBackward(long j10, a aVar) {
        this(j10);
    }

    @n0
    public static DateValidatorPointBackward a(long j10) {
        return new DateValidatorPointBackward(j10);
    }

    @n0
    public static DateValidatorPointBackward b() {
        return a(s.t().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean e(long j10) {
        return j10 <= this.f53985b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointBackward) && this.f53985b == ((DateValidatorPointBackward) obj).f53985b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f53985b)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@n0 Parcel parcel, int i10) {
        parcel.writeLong(this.f53985b);
    }
}
