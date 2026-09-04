package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ParcelableSparseIntArray extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseIntArray> CREATOR = new a();

    public class a implements Parcelable.Creator<ParcelableSparseIntArray> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseIntArray createFromParcel(@n0 Parcel parcel) {
            int i10 = parcel.readInt();
            ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(i10);
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            parcel.readIntArray(iArr);
            parcel.readIntArray(iArr2);
            for (int i11 = 0; i11 < i10; i11++) {
                parcelableSparseIntArray.put(iArr[i11], iArr2[i11]);
            }
            return parcelableSparseIntArray;
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseIntArray[] newArray(int i10) {
            return new ParcelableSparseIntArray[i10];
        }
    }

    public ParcelableSparseIntArray() {
    }

    public ParcelableSparseIntArray(int i10) {
        super(i10);
    }

    public ParcelableSparseIntArray(@n0 SparseIntArray sparseIntArray) {
        for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
            put(sparseIntArray.keyAt(i10), sparseIntArray.valueAt(i10));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@n0 Parcel parcel, int i10) {
        int[] iArr = new int[size()];
        int[] iArr2 = new int[size()];
        for (int i11 = 0; i11 < size(); i11++) {
            iArr[i11] = keyAt(i11);
            iArr2[i11] = valueAt(i11);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeIntArray(iArr2);
    }
}
