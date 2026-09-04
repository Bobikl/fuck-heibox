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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import y1.a;

/* JADX INFO: loaded from: classes7.dex */
public class ParcelReader {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f60562c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f60563d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f60564e = 65262;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<Integer, Integer[]> f60565a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Parcel f60566b;

    public class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            super(str);
        }
    }

    public ParcelReader(Parcel parcel) {
        this.f60566b = parcel;
        a();
    }

    private int a(int i10) {
        if (i10 < 0) {
            return 0;
        }
        if (i10 > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return i10;
    }

    private void a() {
        int i10 = this.f60566b.readInt();
        int i11 = i10 & 65535;
        int i12 = (i10 & a.f141526c) != -65536 ? (i10 >> 16) & 65535 : this.f60566b.readInt();
        if (i11 != 65262) {
            throw new ParseException("Parse header error, not 65262. Got 0x" + Integer.toHexString(i11), this.f60566b);
        }
        int iDataPosition = this.f60566b.dataPosition();
        int i13 = i12 + iDataPosition;
        if (i13 < iDataPosition || i13 > this.f60566b.dataSize()) {
            throw new ParseException("invalid size, start=" + iDataPosition + " end=" + i13, this.f60566b);
        }
        while (this.f60566b.dataPosition() < i13) {
            int i14 = this.f60566b.readInt();
            int i15 = i14 & 65535;
            int i16 = (i14 & a.f141526c) != -65536 ? (i14 >> 16) & 65535 : this.f60566b.readInt();
            int iDataPosition2 = this.f60566b.dataPosition();
            this.f60565a.put(Integer.valueOf(i15), new Integer[]{Integer.valueOf(iDataPosition2), Integer.valueOf(i16)});
            this.f60566b.setDataPosition(iDataPosition2 + i16);
        }
        if (this.f60566b.dataPosition() == i13) {
            return;
        }
        throw new ParseException("the dataPosition is not" + i13, this.f60566b);
    }

    private void a(int i10, int i11) {
        Integer[] numArr = this.f60565a.get(Integer.valueOf(i10));
        if (numArr == null) {
            throw new ParseException("Field is null:" + numArr, this.f60566b);
        }
        int iIntValue = numArr[1].intValue();
        if (iIntValue == i11) {
            return;
        }
        throw new ParseException("the field size is not " + i11 + " got " + iIntValue + " (0x" + Integer.toHexString(iIntValue) + ")", this.f60566b);
    }

    private int b(int i10) {
        Integer[] numArr = this.f60565a.get(Integer.valueOf(i10));
        if (numArr != null) {
            this.f60566b.setDataPosition(numArr[0].intValue());
            return numArr[1].intValue();
        }
        throw new ParseException("Field is null:" + numArr, this.f60566b);
    }

    private int b(int i10, int i11) {
        Integer[] numArr = this.f60565a.get(Integer.valueOf(i10));
        if (numArr != null) {
            this.f60566b.setDataPosition(numArr[0].intValue());
            a(i10, i11);
            return i11;
        }
        throw new ParseException("Field is null:" + numArr, this.f60566b);
    }

    public BigDecimal createBigDecimal(int i10, BigDecimal bigDecimal) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return bigDecimal;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        byte[] bArrCreateByteArray = this.f60566b.createByteArray();
        int i11 = this.f60566b.readInt();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i11);
    }

    public BigDecimal[] createBigDecimalArray(int i10, BigDecimal[] bigDecimalArr) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return bigDecimalArr;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        int iA = a(this.f60566b.readInt());
        BigDecimal[] bigDecimalArr2 = new BigDecimal[iA];
        for (int i11 = 0; i11 < iA; i11++) {
            byte[] bArrCreateByteArray = this.f60566b.createByteArray();
            bigDecimalArr2[i11] = new BigDecimal(new BigInteger(bArrCreateByteArray), this.f60566b.readInt());
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return bigDecimalArr2;
    }

    public BigInteger createBigInteger(int i10, BigInteger bigInteger) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return bigInteger;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        byte[] bArrCreateByteArray = this.f60566b.createByteArray();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return new BigInteger(bArrCreateByteArray);
    }

    public BigInteger[] createBigIntegerArray(int i10, BigInteger[] bigIntegerArr) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return bigIntegerArr;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        int iA = a(this.f60566b.readInt());
        BigInteger[] bigIntegerArr2 = new BigInteger[iA];
        for (int i11 = 0; i11 < iA; i11++) {
            bigIntegerArr2[i11] = new BigInteger(this.f60566b.createByteArray());
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return bigIntegerArr2;
    }

    public boolean[] createBooleanArray(int i10, boolean[] zArr) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return zArr;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        boolean[] zArrCreateBooleanArray = this.f60566b.createBooleanArray();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return zArrCreateBooleanArray;
    }

    public ArrayList<Boolean> createBooleanList(int i10, ArrayList<Boolean> arrayList) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return arrayList;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        ArrayList<Boolean> arrayList2 = new ArrayList<>();
        int iA = a(this.f60566b.readInt());
        for (int i11 = 0; i11 < iA; i11++) {
            arrayList2.add(Boolean.valueOf(this.f60566b.readInt() != 0));
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return arrayList2;
    }

    public byte[] createByteArray(int i10, byte[] bArr) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return bArr;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        byte[] bArrCreateByteArray = this.f60566b.createByteArray();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return bArrCreateByteArray;
    }

    public byte[][] createByteArrayArray(int i10, byte[][] bArr) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return bArr;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        int iA = a(this.f60566b.readInt());
        byte[][] bArr2 = new byte[iA][];
        for (int i11 = 0; i11 < iA; i11++) {
            bArr2[i11] = this.f60566b.createByteArray();
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return bArr2;
    }

    public SparseArray<byte[]> createByteArraySparseArray(int i10, SparseArray<byte[]> sparseArray) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return sparseArray;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        int iA = a(this.f60566b.readInt());
        SparseArray<byte[]> sparseArray2 = new SparseArray<>(iA);
        for (int i11 = 0; i11 < iA; i11++) {
            sparseArray2.append(this.f60566b.readInt(), this.f60566b.createByteArray());
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return sparseArray2;
    }

    public char[] createCharArray(int i10, char[] cArr) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return cArr;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        char[] cArrCreateCharArray = this.f60566b.createCharArray();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return cArrCreateCharArray;
    }

    public double[] createDoubleArray(int i10, double[] dArr) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return dArr;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        double[] dArrCreateDoubleArray = this.f60566b.createDoubleArray();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return dArrCreateDoubleArray;
    }

    public ArrayList<Double> createDoubleList(int i10, ArrayList<Double> arrayList) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return arrayList;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        ArrayList<Double> arrayList2 = new ArrayList<>();
        int iA = a(this.f60566b.readInt());
        for (int i11 = 0; i11 < iA; i11++) {
            arrayList2.add(Double.valueOf(this.f60566b.readDouble()));
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return arrayList2;
    }

    public SparseArray<Double> createDoubleSparseArray(int i10, SparseArray<Double> sparseArray) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return sparseArray;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        SparseArray<Double> sparseArray2 = new SparseArray<>();
        int iA = a(this.f60566b.readInt());
        for (int i11 = 0; i11 < iA; i11++) {
            sparseArray2.append(this.f60566b.readInt(), Double.valueOf(this.f60566b.readDouble()));
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return sparseArray2;
    }

    public float[] createFloatArray(int i10, float[] fArr) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return fArr;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        float[] fArrCreateFloatArray = this.f60566b.createFloatArray();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return fArrCreateFloatArray;
    }

    public ArrayList<Float> createFloatList(int i10, ArrayList<Float> arrayList) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return arrayList;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        ArrayList<Float> arrayList2 = new ArrayList<>();
        int iA = a(this.f60566b.readInt());
        for (int i11 = 0; i11 < iA; i11++) {
            arrayList2.add(Float.valueOf(this.f60566b.readFloat()));
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return arrayList2;
    }

    public SparseArray<Float> createFloatSparseArray(int i10, SparseArray<Float> sparseArray) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return sparseArray;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        SparseArray<Float> sparseArray2 = new SparseArray<>();
        int iA = a(this.f60566b.readInt());
        for (int i11 = 0; i11 < iA; i11++) {
            sparseArray2.append(this.f60566b.readInt(), Float.valueOf(this.f60566b.readFloat()));
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return sparseArray2;
    }

    public IBinder[] createIBinderArray(int i10, IBinder[] iBinderArr) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return iBinderArr;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        IBinder[] iBinderArrCreateBinderArray = this.f60566b.createBinderArray();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return iBinderArrCreateBinderArray;
    }

    public ArrayList<IBinder> createIBinderList(int i10, ArrayList<IBinder> arrayList) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return arrayList;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        ArrayList<IBinder> arrayListCreateBinderArrayList = this.f60566b.createBinderArrayList();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return arrayListCreateBinderArrayList;
    }

    public SparseArray<IBinder> createIBinderSparseArray(int i10, SparseArray<IBinder> sparseArray) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return sparseArray;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        int iA = a(this.f60566b.readInt());
        SparseArray<IBinder> sparseArray2 = new SparseArray<>(iA);
        for (int i11 = 0; i11 < iA; i11++) {
            sparseArray2.append(this.f60566b.readInt(), this.f60566b.readStrongBinder());
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return sparseArray2;
    }

    public int[] createIntArray(int i10, int[] iArr) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return iArr;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        int[] iArrCreateIntArray = this.f60566b.createIntArray();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return iArrCreateIntArray;
    }

    public ArrayList<Integer> createIntegerList(int i10, ArrayList<Integer> arrayList) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return arrayList;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int iA = a(this.f60566b.readInt());
        for (int i11 = 0; i11 < iA; i11++) {
            arrayList2.add(Integer.valueOf(this.f60566b.readInt()));
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return arrayList2;
    }

    public long[] createLongArray(int i10, long[] jArr) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return jArr;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        long[] jArrCreateLongArray = this.f60566b.createLongArray();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return jArrCreateLongArray;
    }

    public ArrayList<Long> createLongList(int i10, ArrayList<Long> arrayList) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return arrayList;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        int iA = a(this.f60566b.readInt());
        for (int i11 = 0; i11 < iA; i11++) {
            arrayList2.add(Long.valueOf(this.f60566b.readLong()));
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return arrayList2;
    }

    public Parcel createParcel(int i10, Parcel parcel) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return parcel;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(this.f60566b, iDataPosition, iB);
        this.f60566b.setDataPosition(iDataPosition + iB);
        return parcelObtain;
    }

    public Parcel[] createParcelArray(int i10, Parcel[] parcelArr) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return parcelArr;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        int iA = a(this.f60566b.readInt());
        Parcel[] parcelArr2 = new Parcel[iA];
        for (int i11 = 0; i11 < iA; i11++) {
            int i12 = this.f60566b.readInt();
            if (i12 != 0) {
                int iDataPosition2 = this.f60566b.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(this.f60566b, iDataPosition2, i12);
                parcelArr2[i11] = parcelObtain;
                this.f60566b.setDataPosition(iDataPosition2 + i12);
            } else {
                parcelArr2[i11] = null;
            }
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return parcelArr2;
    }

    public ArrayList<Parcel> createParcelList(int i10, ArrayList<Parcel> arrayList) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return arrayList;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        int iA = a(this.f60566b.readInt());
        ArrayList<Parcel> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < iA; i11++) {
            int i12 = this.f60566b.readInt();
            if (i12 != 0) {
                int iDataPosition2 = this.f60566b.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(this.f60566b, iDataPosition2, i12);
                arrayList2.add(parcelObtain);
                this.f60566b.setDataPosition(iDataPosition2 + i12);
            } else {
                arrayList2.add(null);
            }
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return arrayList2;
    }

    public SparseArray<Parcel> createParcelSparseArray(int i10, SparseArray<Parcel> sparseArray) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return sparseArray;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        int iA = a(this.f60566b.readInt());
        SparseArray<Parcel> sparseArray2 = new SparseArray<>();
        for (int i11 = 0; i11 < iA; i11++) {
            int i12 = this.f60566b.readInt();
            int i13 = this.f60566b.readInt();
            if (i13 != 0) {
                int iDataPosition2 = this.f60566b.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(this.f60566b, iDataPosition2, i13);
                sparseArray2.append(i12, parcelObtain);
                this.f60566b.setDataPosition(iDataPosition2 + i13);
            } else {
                sparseArray2.append(i12, null);
            }
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return sparseArray2;
    }

    public SparseBooleanArray createSparseBooleanArray(int i10, SparseBooleanArray sparseBooleanArray) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return sparseBooleanArray;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        SparseBooleanArray sparseBooleanArray2 = this.f60566b.readSparseBooleanArray();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return sparseBooleanArray2;
    }

    public SparseIntArray createSparseIntArray(int i10, SparseIntArray sparseIntArray) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return sparseIntArray;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        int iA = a(this.f60566b.readInt());
        for (int i11 = 0; i11 < iA; i11++) {
            sparseIntArray2.append(this.f60566b.readInt(), this.f60566b.readInt());
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return sparseIntArray2;
    }

    public SparseLongArray createSparseLongArray(int i10, SparseLongArray sparseLongArray) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return sparseLongArray;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        SparseLongArray sparseLongArray2 = new SparseLongArray();
        int iA = a(this.f60566b.readInt());
        for (int i11 = 0; i11 < iA; i11++) {
            sparseLongArray2.append(this.f60566b.readInt(), this.f60566b.readLong());
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return sparseLongArray2;
    }

    public String createString(int i10, String str) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return str;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        String string = this.f60566b.readString();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return string;
    }

    public String[] createStringArray(int i10, String[] strArr) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return strArr;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        String[] strArrCreateStringArray = this.f60566b.createStringArray();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return strArrCreateStringArray;
    }

    public ArrayList<String> createStringList(int i10, ArrayList<String> arrayList) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return arrayList;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        ArrayList<String> arrayListCreateStringArrayList = this.f60566b.createStringArrayList();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return arrayListCreateStringArrayList;
    }

    public SparseArray<String> createStringSparseArray(int i10, SparseArray<String> sparseArray) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return sparseArray;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        SparseArray<String> sparseArray2 = new SparseArray<>();
        int iA = a(this.f60566b.readInt());
        for (int i11 = 0; i11 < iA; i11++) {
            sparseArray2.append(this.f60566b.readInt(), this.f60566b.readString());
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return sparseArray2;
    }

    public <T> T[] createTypedArray(int i10, Parcelable.Creator<T> creator, T[] tArr) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return tArr;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        T[] tArr2 = (T[]) this.f60566b.createTypedArray(creator);
        this.f60566b.setDataPosition(iDataPosition + iB);
        return tArr2;
    }

    public <T> ArrayList<T> createTypedList(int i10, Parcelable.Creator<T> creator, ArrayList<T> arrayList) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return arrayList;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        ArrayList<T> arrayListCreateTypedArrayList = this.f60566b.createTypedArrayList(creator);
        this.f60566b.setDataPosition(iDataPosition + iB);
        return arrayListCreateTypedArrayList;
    }

    public <T> SparseArray<T> createTypedSparseArray(int i10, Parcelable.Creator<T> creator, SparseArray<T> sparseArray) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return sparseArray;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        int iA = a(this.f60566b.readInt());
        SparseArray<T> sparseArray2 = new SparseArray<>();
        for (int i11 = 0; i11 < iA; i11++) {
            sparseArray2.append(this.f60566b.readInt(), this.f60566b.readInt() != 0 ? creator.createFromParcel(this.f60566b) : null);
        }
        this.f60566b.setDataPosition(iDataPosition + iB);
        return sparseArray2;
    }

    public boolean readBoolean(int i10, boolean z10) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return z10;
        }
        b(i10, 4);
        return this.f60566b.readInt() != 0;
    }

    public Boolean readBooleanObject(int i10, Boolean bool) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return bool;
        }
        if (b(i10) == 0) {
            return null;
        }
        a(i10, 4);
        int i11 = this.f60566b.readInt();
        if (i11 == 0) {
            return Boolean.FALSE;
        }
        if (i11 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public Bundle readBundle(int i10, Bundle bundle) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return bundle;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        Bundle bundle2 = this.f60566b.readBundle();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return bundle2;
    }

    public byte readByte(int i10, byte b10) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return b10;
        }
        b(i10, 4);
        return (byte) this.f60566b.readInt();
    }

    public char readChar(int i10, char c10) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return c10;
        }
        b(i10, 4);
        return (char) this.f60566b.readInt();
    }

    public double readDouble(int i10, double d10) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return d10;
        }
        b(i10, 8);
        return this.f60566b.readDouble();
    }

    public Double readDoubleObject(int i10, Double d10) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return d10;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        a(iB, 8);
        return Double.valueOf(this.f60566b.readDouble());
    }

    public float readFloat(int i10, float f10) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return f10;
        }
        b(i10, 4);
        return this.f60566b.readFloat();
    }

    public Float readFloatObject(int i10, Float f10) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return f10;
        }
        if (b(i10) == 0) {
            return null;
        }
        a(i10, 4);
        return Float.valueOf(this.f60566b.readFloat());
    }

    public IBinder readIBinder(int i10, IBinder iBinder) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return iBinder;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        IBinder strongBinder = this.f60566b.readStrongBinder();
        this.f60566b.setDataPosition(iDataPosition + iB);
        return strongBinder;
    }

    public int readInt(int i10, int i11) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return i11;
        }
        b(i10, 4);
        return this.f60566b.readInt();
    }

    public Integer readIntegerObject(int i10, Integer num) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return num;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        a(iB, 4);
        return Integer.valueOf(this.f60566b.readInt());
    }

    public void readList(int i10, List list, ClassLoader classLoader) {
        if (this.f60565a.containsKey(Integer.valueOf(i10))) {
            int iB = b(i10);
            int iDataPosition = this.f60566b.dataPosition();
            if (iB != 0) {
                this.f60566b.readList(list, classLoader);
                this.f60566b.setDataPosition(iDataPosition + iB);
            }
        }
    }

    public long readLong(int i10, long j10) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return j10;
        }
        b(i10, 8);
        return this.f60566b.readLong();
    }

    public Long readLongObject(int i10, Long l10) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return l10;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        a(iB, 8);
        return Long.valueOf(this.f60566b.readLong());
    }

    public <T extends Parcelable> T readParcelable(int i10, Parcelable.Creator<T> creator, T t10) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return t10;
        }
        int iB = b(i10);
        if (iB == 0) {
            return null;
        }
        int iDataPosition = this.f60566b.dataPosition();
        T tCreateFromParcel = creator.createFromParcel(this.f60566b);
        this.f60566b.setDataPosition(iDataPosition + iB);
        return tCreateFromParcel;
    }

    public short readShort(int i10, short s10) {
        if (!this.f60565a.containsKey(Integer.valueOf(i10))) {
            return s10;
        }
        b(i10, 4);
        return (short) this.f60566b.readInt();
    }
}
