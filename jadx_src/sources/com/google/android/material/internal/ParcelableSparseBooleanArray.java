package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ParcelableSparseBooleanArray extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseBooleanArray> CREATOR = new a();

    public class a implements Parcelable.Creator<ParcelableSparseBooleanArray> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseBooleanArray createFromParcel(@n0 Parcel parcel) {
            int i10 = parcel.readInt();
            ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(i10);
            int[] iArr = new int[i10];
            boolean[] zArr = new boolean[i10];
            parcel.readIntArray(iArr);
            parcel.readBooleanArray(zArr);
            for (int i11 = 0; i11 < i10; i11++) {
                parcelableSparseBooleanArray.put(iArr[i11], zArr[i11]);
            }
            return parcelableSparseBooleanArray;
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseBooleanArray[] newArray(int i10) {
            return new ParcelableSparseBooleanArray[i10];
        }
    }

    public ParcelableSparseBooleanArray() {
    }

    public ParcelableSparseBooleanArray(int i10) {
        super(i10);
    }

    public ParcelableSparseBooleanArray(@n0 SparseBooleanArray sparseBooleanArray) {
        super(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            put(sparseBooleanArray.keyAt(i10), sparseBooleanArray.valueAt(i10));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@n0 Parcel parcel, int i10) {
        int[] iArr = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int i11 = 0; i11 < size(); i11++) {
            iArr[i11] = keyAt(i11);
            zArr[i11] = valueAt(i11);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeBooleanArray(zArr);
    }
}
