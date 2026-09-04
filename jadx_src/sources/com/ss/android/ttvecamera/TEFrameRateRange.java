package com.ss.android.ttvecamera;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Range;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.meituan.robust.Constants;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class TEFrameRateRange implements Parcelable {
    public static final Parcelable.Creator<TEFrameRateRange> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f97203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f97204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f97205d;

    public static final class a implements Parcelable.Creator<TEFrameRateRange> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TEFrameRateRange createFromParcel(Parcel parcel) {
            return new TEFrameRateRange(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TEFrameRateRange[] newArray(int i10) {
            return new TEFrameRateRange[i10];
        }
    }

    public TEFrameRateRange(int i10, int i11) {
        this.f97205d = 1;
        this.f97203b = i10;
        this.f97204c = i11;
        this.f97205d = i11 > 1000 ? 1000 : 1;
    }

    protected TEFrameRateRange(Parcel parcel) {
        this.f97205d = 1;
        this.f97203b = parcel.readInt();
        this.f97204c = parcel.readInt();
        this.f97205d = parcel.readInt();
    }

    public static int a(List<int[]> list) {
        return (list.size() > 0 && list.get(0)[1] > 1000) ? 1000 : 1;
    }

    public static TEFrameRateRange d(TEFrameRateRange tEFrameRateRange, int i10) {
        return new TEFrameRateRange(tEFrameRateRange.f97203b * i10, tEFrameRateRange.f97204c * i10);
    }

    public int[] b() {
        int i10 = this.f97203b;
        int i11 = this.f97205d;
        return new int[]{i10 / i11, this.f97204c / i11};
    }

    public boolean c() {
        int i10 = this.f97203b;
        return i10 >= 0 && this.f97204c >= i10 && this.f97205d > 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TEFrameRateRange)) {
            return false;
        }
        TEFrameRateRange tEFrameRateRange = (TEFrameRateRange) obj;
        return this.f97203b == tEFrameRateRange.f97203b && this.f97204c == tEFrameRateRange.f97204c;
    }

    public int[] f(int i10) {
        int i11 = this.f97203b;
        int i12 = this.f97205d;
        return new int[]{(i11 / i12) * i10, (this.f97204c / i12) * i10};
    }

    public int h(List<int[]> list) {
        return (list.size() > 0 && list.get(0)[1] > 1000) ? 1000 : 1;
    }

    public int hashCode() {
        return (this.f97203b * 65537) + 1 + this.f97204c;
    }

    @w0(api = 21)
    public int j(Range<Integer>[] rangeArr) {
        return (rangeArr.length > 0 && ((Integer) rangeArr[0].getUpper()).intValue() < 1000) ? 1000 : 1;
    }

    @n0
    public String toString() {
        return Constants.ARRAY_TYPE + (this.f97203b / this.f97205d) + ", " + (this.f97204c / this.f97205d) + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f97203b);
        parcel.writeInt(this.f97204c);
        parcel.writeInt(this.f97205d);
    }
}
