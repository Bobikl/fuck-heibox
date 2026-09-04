package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.n0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f53979d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f53980e = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final d f53983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final List<CalendarConstraints.DateValidator> f53984c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f53981f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d f53982g = new b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new c();

    public class a implements d {
        a() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public boolean a(@n0 List<CalendarConstraints.DateValidator> list, long j10) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.e(j10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public int getId() {
            return 1;
        }
    }

    public class b implements d {
        b() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public boolean a(@n0 List<CalendarConstraints.DateValidator> list, long j10) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.e(j10)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public int getId() {
            return 2;
        }
    }

    public class c implements Parcelable.Creator<CompositeDateValidator> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator createFromParcel(@n0 Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i10 = parcel.readInt();
            d dVar = (i10 != 2 && i10 == 1) ? CompositeDateValidator.f53981f : CompositeDateValidator.f53982g;
            return new CompositeDateValidator((List) androidx.core.util.o.l(arrayList), dVar, null);
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator[] newArray(int i10) {
            return new CompositeDateValidator[i10];
        }
    }

    public interface d {
        boolean a(@n0 List<CalendarConstraints.DateValidator> list, long j10);

        int getId();
    }

    private CompositeDateValidator(@n0 List<CalendarConstraints.DateValidator> list, d dVar) {
        this.f53984c = list;
        this.f53983b = dVar;
    }

    /* synthetic */ CompositeDateValidator(List list, d dVar, a aVar) {
        this(list, dVar);
    }

    @n0
    public static CalendarConstraints.DateValidator c(@n0 List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f53982g);
    }

    @n0
    public static CalendarConstraints.DateValidator d(@n0 List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f53981f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean e(long j10) {
        return this.f53983b.a(this.f53984c, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.f53984c.equals(compositeDateValidator.f53984c) && this.f53983b.getId() == compositeDateValidator.f53983b.getId();
    }

    public int hashCode() {
        return this.f53984c.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@n0 Parcel parcel, int i10) {
        parcel.writeList(this.f53984c);
        parcel.writeInt(this.f53983b.getId());
    }
}
