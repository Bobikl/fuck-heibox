package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.n0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import y1.a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class SafeParcelReader {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class ParseException extends RuntimeException {
        public ParseException(@n0 String str, @n0 Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private SafeParcelReader() {
    }

    @n0
    public static ArrayList<Parcel> A(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        ArrayList<Parcel> arrayList = new ArrayList<>();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = parcel.readInt();
            if (i13 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i13);
                arrayList.add(parcelObtain);
                parcel.setDataPosition(iDataPosition2 + i13);
            } else {
                arrayList.add(null);
            }
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayList;
    }

    @n0
    public static SparseArray<Parcel> B(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        SparseArray<Parcel> sparseArray = new SparseArray<>();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            if (i14 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i14);
                sparseArray.append(i13, parcelObtain);
                parcel.setDataPosition(iDataPosition2 + i14);
            } else {
                sparseArray.append(i13, null);
            }
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseArray;
    }

    @n0
    public static <T extends Parcelable> T C(@n0 Parcel parcel, int i10, @n0 Parcelable.Creator<T> creator) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iG0);
        return tCreateFromParcel;
    }

    @n0
    public static SparseBooleanArray D(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseBooleanArray;
    }

    @n0
    public static SparseIntArray E(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseIntArray;
    }

    @n0
    public static SparseLongArray F(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        SparseLongArray sparseLongArray = new SparseLongArray();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseLongArray;
    }

    @n0
    public static String G(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iG0);
        return string;
    }

    @n0
    public static String[] H(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return strArrCreateStringArray;
    }

    @n0
    public static ArrayList<String> I(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayListCreateStringArrayList;
    }

    @n0
    public static SparseArray<String> J(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        SparseArray<String> sparseArray = new SparseArray<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseArray;
    }

    @n0
    public static <T> T[] K(@n0 Parcel parcel, int i10, @n0 Parcelable.Creator<T> creator) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iG0);
        return tArr;
    }

    @n0
    public static <T> ArrayList<T> L(@n0 Parcel parcel, int i10, @n0 Parcelable.Creator<T> creator) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayListCreateTypedArrayList;
    }

    @n0
    public static <T> SparseArray<T> M(@n0 Parcel parcel, int i10, @n0 Parcelable.Creator<T> creator) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        SparseArray<T> sparseArray = new SparseArray<>();
        for (int i12 = 0; i12 < i11; i12++) {
            sparseArray.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseArray;
    }

    public static void N(@n0 Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new ParseException("Overread allowed size end=" + i10, parcel);
    }

    public static int O(int i10) {
        return (char) i10;
    }

    public static boolean P(@n0 Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    @n0
    public static Boolean Q(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        if (iG0 == 0) {
            return null;
        }
        j0(parcel, i10, iG0, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte R(@n0 Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    public static char S(@n0 Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return (char) parcel.readInt();
    }

    public static double T(@n0 Parcel parcel, int i10) {
        k0(parcel, i10, 8);
        return parcel.readDouble();
    }

    @n0
    public static Double U(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        if (iG0 == 0) {
            return null;
        }
        j0(parcel, i10, iG0, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float V(@n0 Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return parcel.readFloat();
    }

    @n0
    public static Float W(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        if (iG0 == 0) {
            return null;
        }
        j0(parcel, i10, iG0, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int X(@n0 Parcel parcel) {
        return parcel.readInt();
    }

    @n0
    public static IBinder Y(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iG0);
        return strongBinder;
    }

    public static int Z(@n0 Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return parcel.readInt();
    }

    @n0
    public static BigDecimal a(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i11 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iG0);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i11);
    }

    @n0
    public static Integer a0(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        if (iG0 == 0) {
            return null;
        }
        j0(parcel, i10, iG0, 4);
        return Integer.valueOf(parcel.readInt());
    }

    @n0
    public static BigDecimal[] b(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            bigDecimalArr[i12] = new BigDecimal(new BigInteger(bArrCreateByteArray), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return bigDecimalArr;
    }

    public static void b0(@n0 Parcel parcel, int i10, @n0 List list, @n0 ClassLoader classLoader) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(iDataPosition + iG0);
    }

    @n0
    public static BigInteger c(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return new BigInteger(bArrCreateByteArray);
    }

    public static long c0(@n0 Parcel parcel, int i10) {
        k0(parcel, i10, 8);
        return parcel.readLong();
    }

    @n0
    public static BigInteger[] d(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bigIntegerArr[i12] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return bigIntegerArr;
    }

    @n0
    public static Long d0(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        if (iG0 == 0) {
            return null;
        }
        j0(parcel, i10, iG0, 8);
        return Long.valueOf(parcel.readLong());
    }

    @n0
    public static boolean[] e(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return zArrCreateBooleanArray;
    }

    @n0
    public static PendingIntent e0(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        PendingIntent pendingIntentOrNullFromParcel = PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iG0);
        return pendingIntentOrNullFromParcel;
    }

    @n0
    public static ArrayList<Boolean> f(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Boolean.valueOf(parcel.readInt() != 0));
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayList;
    }

    public static short f0(@n0 Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    @n0
    public static Bundle g(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iG0);
        return bundle;
    }

    public static int g0(@n0 Parcel parcel, int i10) {
        return (i10 & a.f141526c) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    @n0
    public static byte[] h(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return bArrCreateByteArray;
    }

    public static void h0(@n0 Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + g0(parcel, i10));
    }

    @n0
    public static byte[][] i(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        byte[][] bArr = new byte[i11][];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return bArr;
    }

    public static int i0(@n0 Parcel parcel) {
        int iX = X(parcel);
        int iG0 = g0(parcel, iX);
        int iDataPosition = parcel.dataPosition();
        if (O(iX) != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iX))), parcel);
        }
        int i10 = iG0 + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        throw new ParseException("Size read is invalid start=" + iDataPosition + " end=" + i10, parcel);
    }

    @n0
    public static SparseArray<byte[]> j(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        SparseArray<byte[]> sparseArray = new SparseArray<>(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseArray;
    }

    private static void j0(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        throw new ParseException("Expected size " + i12 + " got " + i11 + " (0x" + Integer.toHexString(i11) + ")", parcel);
    }

    @n0
    public static char[] k(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        char[] cArrCreateCharArray = parcel.createCharArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return cArrCreateCharArray;
    }

    private static void k0(Parcel parcel, int i10, int i11) {
        int iG0 = g0(parcel, i10);
        if (iG0 == i11) {
            return;
        }
        throw new ParseException("Expected size " + i11 + " got " + iG0 + " (0x" + Integer.toHexString(iG0) + ")", parcel);
    }

    @n0
    public static double[] l(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        double[] dArrCreateDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return dArrCreateDoubleArray;
    }

    @n0
    public static ArrayList<Double> m(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        ArrayList<Double> arrayList = new ArrayList<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayList;
    }

    @n0
    public static SparseArray<Double> n(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        SparseArray<Double> sparseArray = new SparseArray<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            sparseArray.append(parcel.readInt(), Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseArray;
    }

    @n0
    public static float[] o(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return fArrCreateFloatArray;
    }

    @n0
    public static ArrayList<Float> p(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayList;
    }

    @n0
    public static SparseArray<Float> q(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        SparseArray<Float> sparseArray = new SparseArray<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            sparseArray.append(parcel.readInt(), Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseArray;
    }

    @n0
    public static IBinder[] r(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        IBinder[] iBinderArrCreateBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return iBinderArrCreateBinderArray;
    }

    @n0
    public static ArrayList<IBinder> s(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        ArrayList<IBinder> arrayListCreateBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayListCreateBinderArrayList;
    }

    @n0
    public static SparseArray<IBinder> t(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        SparseArray<IBinder> sparseArray = new SparseArray<>(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return sparseArray;
    }

    @n0
    public static int[] u(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return iArrCreateIntArray;
    }

    @n0
    public static ArrayList<Integer> v(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayList;
    }

    @n0
    public static long[] w(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iG0);
        return jArrCreateLongArray;
    }

    @n0
    public static ArrayList<Long> x(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return arrayList;
    }

    @n0
    public static Parcel y(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(parcel, iDataPosition, iG0);
        parcel.setDataPosition(iDataPosition + iG0);
        return parcelObtain;
    }

    @n0
    public static Parcel[] z(@n0 Parcel parcel, int i10) {
        int iG0 = g0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iG0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        Parcel[] parcelArr = new Parcel[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = parcel.readInt();
            if (i13 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i13);
                parcelArr[i12] = parcelObtain;
                parcel.setDataPosition(iDataPosition2 + i13);
            } else {
                parcelArr[i12] = null;
            }
        }
        parcel.setDataPosition(iDataPosition + iG0);
        return parcelArr;
    }
}
