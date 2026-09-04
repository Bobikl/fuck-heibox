package com.ss.android.ttvecamera;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class TEFocusParameters implements Parcelable {
    public static final Parcelable.Creator<TEFocusParameters> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f97185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f97186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f97187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f97188e;

    public static final class a implements Parcelable.Creator<TEFocusParameters> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TEFocusParameters createFromParcel(Parcel parcel) {
            return new TEFocusParameters(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TEFocusParameters[] newArray(int i10) {
            return new TEFocusParameters[i10];
        }
    }

    public TEFocusParameters() {
    }

    public TEFocusParameters(Parcel parcel) {
        this.f97185b = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f97187d = parcel.readInt();
        this.f97188e = parcel.readInt();
        this.f97186c = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "active size is:" + this.f97185b.toString() + " crop size is: " + this.f97186c.toString() + "  max AF regions is: " + this.f97187d + "  max AE regions is: " + this.f97188e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f97185b, i10);
        parcel.writeInt(this.f97187d);
        parcel.writeInt(this.f97188e);
        parcel.writeParcelable(this.f97186c, i10);
    }
}
