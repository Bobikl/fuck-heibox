package com.huawei.hms.common.parcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import y1.a;

/* JADX INFO: loaded from: classes7.dex */
public class ParcelWrite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f60568b = 65262;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Parcel f60569a;

    public ParcelWrite(Parcel parcel) {
        this.f60569a = parcel;
    }

    private int a(int i10) {
        this.f60569a.writeInt(i10 | a.f141526c);
        this.f60569a.writeInt(0);
        return this.f60569a.dataPosition();
    }

    private void a(int i10, int i11) {
        if (i11 < 65535) {
            this.f60569a.writeInt(i10 | (i11 << 16));
        } else {
            this.f60569a.writeInt(i10 | a.f141526c);
            this.f60569a.writeInt(i11);
        }
    }

    private <T extends Parcelable> void a(T t10, int i10) {
        int iDataPosition = this.f60569a.dataPosition();
        this.f60569a.writeInt(1);
        int iDataPosition2 = this.f60569a.dataPosition();
        t10.writeToParcel(this.f60569a, i10);
        int iDataPosition3 = this.f60569a.dataPosition();
        this.f60569a.setDataPosition(iDataPosition);
        this.f60569a.writeInt(iDataPosition3 - iDataPosition2);
        this.f60569a.setDataPosition(iDataPosition3);
    }

    private void b(int i10) {
        int iDataPosition = this.f60569a.dataPosition();
        this.f60569a.setDataPosition(i10 - 4);
        this.f60569a.writeInt(iDataPosition - i10);
        this.f60569a.setDataPosition(iDataPosition);
    }

    public int beginObjectHeader() {
        return a(65262);
    }

    public void finishObjectHeader(int i10) {
        b(i10);
    }

    public void writeBigDecimal(int i10, BigDecimal bigDecimal, boolean z10) {
        if (bigDecimal == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            this.f60569a.writeInt(bigDecimal.scale());
            b(iA);
        }
    }

    public void writeBigDecimalArray(int i10, BigDecimal[] bigDecimalArr, boolean z10) {
        if (bigDecimalArr == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int length = bigDecimalArr.length;
        this.f60569a.writeInt(length);
        for (int i11 = 0; i11 < length; i11++) {
            this.f60569a.writeByteArray(bigDecimalArr[i11].unscaledValue().toByteArray());
            this.f60569a.writeInt(bigDecimalArr[i11].scale());
        }
        b(iA);
    }

    public void writeBigInteger(int i10, BigInteger bigInteger, boolean z10) {
        if (bigInteger == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeByteArray(bigInteger.toByteArray());
            b(iA);
        }
    }

    public void writeBigIntegerArray(int i10, BigInteger[] bigIntegerArr, boolean z10) {
        if (bigIntegerArr == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        this.f60569a.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            this.f60569a.writeByteArray(bigInteger.toByteArray());
        }
        b(iA);
    }

    public void writeBoolean(int i10, boolean z10) {
        a(i10, 4);
        this.f60569a.writeInt(z10 ? 1 : 0);
    }

    public void writeBooleanArray(int i10, boolean[] zArr, boolean z10) {
        if (zArr == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeBooleanArray(zArr);
            b(iA);
        }
    }

    public void writeBooleanList(int i10, List<Boolean> list, boolean z10) {
        if (list == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int size = list.size();
        this.f60569a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f60569a.writeInt(list.get(i11).booleanValue() ? 1 : 0);
        }
        b(iA);
    }

    public void writeBooleanObject(int i10, Boolean bool) {
        writeBooleanObject(i10, bool, false);
    }

    public void writeBooleanObject(int i10, Boolean bool, boolean z10) {
        if (bool != null) {
            a(i10, 4);
            this.f60569a.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z10) {
            a(i10, 0);
        }
    }

    public void writeBundle(int i10, Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeBundle(bundle);
            b(iA);
        }
    }

    public void writeByte(int i10, byte b10) {
        a(i10, 4);
        this.f60569a.writeInt(b10);
    }

    public void writeByteArray(int i10, byte[] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeByteArray(bArr);
            b(iA);
        }
    }

    public void writeByteArrayArray(int i10, byte[][] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        this.f60569a.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            this.f60569a.writeByteArray(bArr2);
        }
        b(iA);
    }

    public void writeByteArraySparseArray(int i10, SparseArray<byte[]> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int size = sparseArray.size();
        this.f60569a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f60569a.writeInt(sparseArray.keyAt(i11));
            this.f60569a.writeByteArray(sparseArray.valueAt(i11));
        }
        b(iA);
    }

    public void writeChar(int i10, char c10) {
        a(i10, 4);
        this.f60569a.writeInt(c10);
    }

    public void writeCharArray(int i10, char[] cArr, boolean z10) {
        if (cArr == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeCharArray(cArr);
            b(iA);
        }
    }

    public void writeDouble(int i10, double d10) {
        a(i10, 8);
        this.f60569a.writeDouble(d10);
    }

    public void writeDoubleArray(int i10, double[] dArr, boolean z10) {
        if (dArr == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeDoubleArray(dArr);
            b(iA);
        }
    }

    public void writeDoubleList(int i10, List<Double> list, boolean z10) {
        if (list == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int size = list.size();
        this.f60569a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f60569a.writeDouble(list.get(i11).doubleValue());
        }
        b(iA);
    }

    public void writeDoubleObject(int i10, Double d10, boolean z10) {
        if (d10 != null) {
            a(i10, 8);
            this.f60569a.writeDouble(d10.doubleValue());
        } else if (z10) {
            a(i10, 0);
        }
    }

    public void writeDoubleSparseArray(int i10, SparseArray<Double> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int size = sparseArray.size();
        this.f60569a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f60569a.writeInt(sparseArray.keyAt(i11));
            this.f60569a.writeDouble(sparseArray.valueAt(i11).doubleValue());
        }
        b(iA);
    }

    public void writeFloat(int i10, float f10) {
        a(i10, 4);
        this.f60569a.writeFloat(f10);
    }

    public void writeFloatArray(int i10, float[] fArr, boolean z10) {
        if (fArr == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeFloatArray(fArr);
            b(iA);
        }
    }

    public void writeFloatList(int i10, List<Float> list, boolean z10) {
        if (list == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int size = list.size();
        this.f60569a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f60569a.writeFloat(list.get(i11).floatValue());
        }
        b(iA);
    }

    public void writeFloatObject(int i10, Float f10, boolean z10) {
        if (f10 != null) {
            a(i10, 4);
            this.f60569a.writeFloat(f10.floatValue());
        } else if (z10) {
            a(i10, 0);
        }
    }

    public void writeFloatSparseArray(int i10, SparseArray<Float> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int size = sparseArray.size();
        this.f60569a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f60569a.writeInt(sparseArray.keyAt(i11));
            this.f60569a.writeFloat(sparseArray.valueAt(i11).floatValue());
        }
        b(iA);
    }

    public void writeIBinder(int i10, IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeStrongBinder(iBinder);
            b(iA);
        }
    }

    public void writeIBinderArray(int i10, IBinder[] iBinderArr, boolean z10) {
        if (iBinderArr == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeBinderArray(iBinderArr);
            b(iA);
        }
    }

    public void writeIBinderList(int i10, List<IBinder> list, boolean z10) {
        if (list == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeBinderList(list);
            b(iA);
        }
    }

    public void writeIBinderSparseArray(int i10, SparseArray<IBinder> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int size = sparseArray.size();
        this.f60569a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f60569a.writeInt(sparseArray.keyAt(i11));
            this.f60569a.writeStrongBinder(sparseArray.valueAt(i11));
        }
        b(iA);
    }

    public void writeInt(int i10, int i11) {
        a(i10, 4);
        this.f60569a.writeInt(i11);
    }

    public void writeIntArray(int i10, int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeIntArray(iArr);
            b(iA);
        }
    }

    public void writeIntegerList(int i10, List<Integer> list, boolean z10) {
        if (list == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int size = list.size();
        this.f60569a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f60569a.writeInt(list.get(i11).intValue());
        }
        b(iA);
    }

    public void writeIntegerObject(int i10, Integer num, boolean z10) {
        if (num != null) {
            a(i10, 4);
            this.f60569a.writeInt(num.intValue());
        } else if (z10) {
            a(i10, 0);
        }
    }

    public void writeList(int i10, List list, boolean z10) {
        if (list == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeList(list);
            b(iA);
        }
    }

    public void writeLong(int i10, long j10) {
        a(i10, 8);
        this.f60569a.writeLong(j10);
    }

    public void writeLongArray(int i10, long[] jArr, boolean z10) {
        if (jArr == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeLongArray(jArr);
            b(iA);
        }
    }

    public void writeLongList(int i10, List<Long> list, boolean z10) {
        if (list == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int size = list.size();
        this.f60569a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f60569a.writeLong(list.get(i11).longValue());
        }
        b(iA);
    }

    public void writeLongObject(int i10, Long l10, boolean z10) {
        if (l10 != null) {
            a(i10, 8);
            this.f60569a.writeLong(l10.longValue());
        } else if (z10) {
            a(i10, 0);
        }
    }

    public void writeParcel(int i10, Parcel parcel, boolean z10) {
        if (parcel == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.appendFrom(parcel, 0, parcel.dataSize());
            b(iA);
        }
    }

    public void writeParcelArray(int i10, Parcel[] parcelArr, boolean z10) {
        if (parcelArr == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        this.f60569a.writeInt(parcelArr.length);
        for (Parcel parcel : parcelArr) {
            if (parcel != null) {
                this.f60569a.writeInt(parcel.dataSize());
                this.f60569a.appendFrom(parcel, 0, parcel.dataSize());
            } else {
                this.f60569a.writeInt(0);
            }
        }
        b(iA);
    }

    public void writeParcelList(int i10, List<Parcel> list, boolean z10) {
        if (list == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int size = list.size();
        this.f60569a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcel parcel = list.get(i11);
            if (parcel != null) {
                this.f60569a.writeInt(parcel.dataSize());
                this.f60569a.appendFrom(parcel, 0, parcel.dataSize());
            } else {
                this.f60569a.writeInt(0);
            }
        }
        b(iA);
    }

    public void writeParcelSparseArray(int i10, SparseArray<Parcel> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int size = sparseArray.size();
        this.f60569a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f60569a.writeInt(sparseArray.keyAt(i11));
            Parcel parcelValueAt = sparseArray.valueAt(i11);
            if (parcelValueAt != null) {
                this.f60569a.writeInt(parcelValueAt.dataSize());
                this.f60569a.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            } else {
                this.f60569a.writeInt(0);
            }
        }
        b(iA);
    }

    public void writeParcelable(int i10, Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            parcelable.writeToParcel(this.f60569a, i11);
            b(iA);
        }
    }

    public void writeShort(int i10, short s10) {
        a(i10, 4);
        this.f60569a.writeInt(s10);
    }

    public void writeSparseBooleanArray(int i10, SparseBooleanArray sparseBooleanArray, boolean z10) {
        if (sparseBooleanArray == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeSparseBooleanArray(sparseBooleanArray);
            b(iA);
        }
    }

    public void writeSparseIntArray(int i10, SparseIntArray sparseIntArray, boolean z10) {
        if (sparseIntArray == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int size = sparseIntArray.size();
        this.f60569a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f60569a.writeInt(sparseIntArray.keyAt(i11));
            this.f60569a.writeInt(sparseIntArray.valueAt(i11));
        }
        b(iA);
    }

    public void writeSparseLongArray(int i10, SparseLongArray sparseLongArray, boolean z10) {
        if (sparseLongArray == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int size = sparseLongArray.size();
        this.f60569a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f60569a.writeInt(sparseLongArray.keyAt(i11));
            this.f60569a.writeLong(sparseLongArray.valueAt(i11));
        }
        b(iA);
    }

    public void writeString(int i10, String str, boolean z10) {
        if (str == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeString(str);
            b(iA);
        }
    }

    public void writeStringArray(int i10, String[] strArr, boolean z10) {
        if (strArr == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeStringArray(strArr);
            b(iA);
        }
    }

    public void writeStringList(int i10, List<String> list, boolean z10) {
        if (list == null) {
            if (z10) {
                a(i10, 0);
            }
        } else {
            int iA = a(i10);
            this.f60569a.writeStringList(list);
            b(iA);
        }
    }

    public void writeStringSparseArray(int i10, SparseArray<String> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int size = sparseArray.size();
        this.f60569a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f60569a.writeInt(sparseArray.keyAt(i11));
            this.f60569a.writeString(sparseArray.valueAt(i11));
        }
        b(iA);
    }

    public <T extends Parcelable> void writeTypedArray(int i10, T[] tArr, int i11, boolean z10) {
        if (tArr == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        this.f60569a.writeInt(tArr.length);
        for (T t10 : tArr) {
            if (t10 == null) {
                this.f60569a.writeInt(0);
            } else {
                a(t10, i11);
            }
        }
        b(iA);
    }

    public <T extends Parcelable> void writeTypedList(int i10, List<T> list, boolean z10) {
        if (list == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int size = list.size();
        this.f60569a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            T t10 = list.get(i11);
            if (t10 == null) {
                this.f60569a.writeInt(0);
            } else {
                a(t10, 0);
            }
        }
        b(iA);
    }

    public <T extends Parcelable> void writeTypedSparseArray(int i10, SparseArray<T> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                a(i10, 0);
                return;
            }
            return;
        }
        int iA = a(i10);
        int size = sparseArray.size();
        this.f60569a.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f60569a.writeInt(sparseArray.keyAt(i11));
            T tValueAt = sparseArray.valueAt(i11);
            if (tValueAt == null) {
                this.f60569a.writeInt(0);
            } else {
                a(tValueAt, 0);
            }
        }
        b(iA);
    }
}
