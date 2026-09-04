package com.ss.android.ttvecamera;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes8.dex */
public class TEFrameSizei implements Parcelable {
    public static final Parcelable.Creator<TEFrameSizei> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f97206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f97207c;

    public static final class a implements Parcelable.Creator<TEFrameSizei> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TEFrameSizei createFromParcel(Parcel parcel) {
            return new TEFrameSizei(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TEFrameSizei[] newArray(int i10) {
            return new TEFrameSizei[i10];
        }
    }

    public TEFrameSizei() {
        this.f97206b = 720;
        this.f97207c = 1280;
    }

    public TEFrameSizei(int i10, int i11) {
        this.f97206b = i10;
        this.f97207c = i11;
    }

    protected TEFrameSizei(Parcel parcel) {
        this.f97206b = 720;
        this.f97207c = 1280;
        this.f97206b = parcel.readInt();
        this.f97207c = parcel.readInt();
    }

    public boolean a() {
        return this.f97206b > 0 && this.f97207c > 0;
    }

    @w0(api = 21)
    public Size b() {
        return new Size(this.f97206b, this.f97207c);
    }

    public void c(int i10, int i11) {
        this.f97206b = i10;
        this.f97207c = i11;
    }

    public void d(TEFrameSizei tEFrameSizei) {
        this.f97206b = tEFrameSizei.f97206b;
        this.f97207c = tEFrameSizei.f97207c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TEFrameSizei)) {
            return false;
        }
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        return this.f97206b == tEFrameSizei.f97206b && this.f97207c == tEFrameSizei.f97207c;
    }

    public int hashCode() {
        return (this.f97206b * 65537) + 1 + this.f97207c;
    }

    public String toString() {
        return this.f97206b + "x" + this.f97207c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f97206b);
        parcel.writeInt(this.f97207c);
    }
}
