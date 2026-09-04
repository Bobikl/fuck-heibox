package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ParcelableSparseArray extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseArray> CREATOR = new a();

    public class a implements Parcelable.ClassLoaderCreator<ParcelableSparseArray> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @p0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseArray createFromParcel(@n0 Parcel parcel) {
            return new ParcelableSparseArray(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @n0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseArray createFromParcel(@n0 Parcel parcel, ClassLoader classLoader) {
            return new ParcelableSparseArray(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @n0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseArray[] newArray(int i10) {
            return new ParcelableSparseArray[i10];
        }
    }

    public ParcelableSparseArray() {
    }

    public ParcelableSparseArray(@n0 Parcel parcel, @p0 ClassLoader classLoader) {
        int i10 = parcel.readInt();
        int[] iArr = new int[i10];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        for (int i11 = 0; i11 < i10; i11++) {
            put(iArr[i11], parcelableArray[i11]);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@n0 Parcel parcel, int i10) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = keyAt(i11);
            parcelableArr[i11] = valueAt(i11);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i10);
    }
}
