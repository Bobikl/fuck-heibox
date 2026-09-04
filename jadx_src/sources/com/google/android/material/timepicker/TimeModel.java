package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.d1;
import androidx.annotation.f0;
import androidx.annotation.p0;
import com.google.android.material.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f55753i = "%02d";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f55754j = "%d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f55755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f55756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f55757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f55758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f55759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f55760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f55761h;

    public class a implements Parcelable.Creator<TimeModel> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i10) {
            return new TimeModel[i10];
        }
    }

    public TimeModel() {
        this(0);
    }

    public TimeModel(int i10) {
        this(0, 0, 10, i10);
    }

    public TimeModel(int i10, int i11, int i12, int i13) {
        this.f55758e = i10;
        this.f55759f = i11;
        this.f55760g = i12;
        this.f55757d = i13;
        this.f55761h = j(i10);
        this.f55755b = new f(59);
        this.f55756c = new f(i13 == 1 ? 23 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @p0
    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, f55753i);
    }

    @p0
    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int j(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @d1
    public int c() {
        return this.f55757d == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix;
    }

    public int d() {
        if (this.f55757d == 1) {
            return this.f55758e % 24;
        }
        int i10 = this.f55758e;
        if (i10 % 12 == 0) {
            return 12;
        }
        return this.f55761h == 1 ? i10 - 12 : i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f55758e == timeModel.f55758e && this.f55759f == timeModel.f55759f && this.f55757d == timeModel.f55757d && this.f55760g == timeModel.f55760g;
    }

    public f f() {
        return this.f55756c;
    }

    public f h() {
        return this.f55755b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f55757d), Integer.valueOf(this.f55758e), Integer.valueOf(this.f55759f), Integer.valueOf(this.f55760g)});
    }

    public void k(int i10) {
        if (this.f55757d == 1) {
            this.f55758e = i10;
        } else {
            this.f55758e = (i10 % 12) + (this.f55761h != 1 ? 0 : 12);
        }
    }

    public void l(int i10) {
        this.f55761h = j(i10);
        this.f55758e = i10;
    }

    public void n(@f0(from = 0, to = 59) int i10) {
        this.f55759f = i10 % 60;
    }

    public void o(int i10) {
        if (i10 != this.f55761h) {
            this.f55761h = i10;
            int i11 = this.f55758e;
            if (i11 < 12 && i10 == 1) {
                this.f55758e = i11 + 12;
            } else {
                if (i11 < 12 || i10 != 0) {
                    return;
                }
                this.f55758e = i11 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f55758e);
        parcel.writeInt(this.f55759f);
        parcel.writeInt(this.f55760g);
        parcel.writeInt(this.f55757d);
    }
}
