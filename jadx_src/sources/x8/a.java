package x8;

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
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class a {
    private a() {
    }

    public static void A(@n0 Parcel parcel, int i10, @n0 SparseArray<Float> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseArray.keyAt(i11));
            parcel.writeFloat(sparseArray.valueAt(i11).floatValue());
        }
        g0(parcel, iF0);
    }

    public static void B(@n0 Parcel parcel, int i10, @n0 IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            g0(parcel, iF0);
        }
    }

    public static void C(@n0 Parcel parcel, int i10, @n0 IBinder[] iBinderArr, boolean z10) {
        if (iBinderArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeBinderArray(iBinderArr);
            g0(parcel, iF0);
        }
    }

    public static void D(@n0 Parcel parcel, int i10, @n0 List<IBinder> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeBinderList(list);
            g0(parcel, iF0);
        }
    }

    public static void E(@n0 Parcel parcel, int i10, @n0 SparseArray<IBinder> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseArray.keyAt(i11));
            parcel.writeStrongBinder(sparseArray.valueAt(i11));
        }
        g0(parcel, iF0);
    }

    public static void F(@n0 Parcel parcel, int i10, int i11) {
        h0(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    public static void G(@n0 Parcel parcel, int i10, @n0 int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeIntArray(iArr);
            g0(parcel, iF0);
        }
    }

    public static void H(@n0 Parcel parcel, int i10, @n0 List<Integer> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(list.get(i11).intValue());
        }
        g0(parcel, iF0);
    }

    public static void I(@n0 Parcel parcel, int i10, @n0 Integer num, boolean z10) {
        if (num != null) {
            h0(parcel, i10, 4);
            parcel.writeInt(num.intValue());
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void J(@n0 Parcel parcel, int i10, @n0 List list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeList(list);
            g0(parcel, iF0);
        }
    }

    public static void K(@n0 Parcel parcel, int i10, long j10) {
        h0(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    public static void L(@n0 Parcel parcel, int i10, @n0 long[] jArr, boolean z10) {
        if (jArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeLongArray(jArr);
            g0(parcel, iF0);
        }
    }

    public static void M(@n0 Parcel parcel, int i10, @n0 List<Long> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeLong(list.get(i11).longValue());
        }
        g0(parcel, iF0);
    }

    public static void N(@n0 Parcel parcel, int i10, @n0 Long l10, boolean z10) {
        if (l10 != null) {
            h0(parcel, i10, 8);
            parcel.writeLong(l10.longValue());
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void O(@n0 Parcel parcel, int i10, @n0 Parcel parcel2, boolean z10) {
        if (parcel2 == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            g0(parcel, iF0);
        }
    }

    public static void P(@n0 Parcel parcel, int i10, @n0 Parcel[] parcelArr, boolean z10) {
        if (parcelArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        g0(parcel, iF0);
    }

    public static void Q(@n0 Parcel parcel, int i10, @n0 List<Parcel> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcel parcel2 = list.get(i11);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        g0(parcel, iF0);
    }

    public static void R(@n0 Parcel parcel, int i10, @n0 SparseArray<Parcel> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseArray.keyAt(i11));
            Parcel parcelValueAt = sparseArray.valueAt(i11);
            if (parcelValueAt != null) {
                parcel.writeInt(parcelValueAt.dataSize());
                parcel.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        g0(parcel, iF0);
    }

    public static void S(@n0 Parcel parcel, int i10, @n0 Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            g0(parcel, iF0);
        }
    }

    public static void T(@n0 Parcel parcel, int i10, @n0 PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            g0(parcel, iF0);
        }
    }

    public static void U(@n0 Parcel parcel, int i10, short s10) {
        h0(parcel, i10, 4);
        parcel.writeInt(s10);
    }

    public static void V(@n0 Parcel parcel, int i10, @n0 SparseBooleanArray sparseBooleanArray, boolean z10) {
        if (sparseBooleanArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            g0(parcel, iF0);
        }
    }

    public static void W(@n0 Parcel parcel, int i10, @n0 SparseIntArray sparseIntArray, boolean z10) {
        if (sparseIntArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseIntArray.keyAt(i11));
            parcel.writeInt(sparseIntArray.valueAt(i11));
        }
        g0(parcel, iF0);
    }

    public static void X(@n0 Parcel parcel, int i10, @n0 SparseLongArray sparseLongArray, boolean z10) {
        if (sparseLongArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseLongArray.keyAt(i11));
            parcel.writeLong(sparseLongArray.valueAt(i11));
        }
        g0(parcel, iF0);
    }

    public static void Y(@n0 Parcel parcel, int i10, @n0 String str, boolean z10) {
        if (str == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeString(str);
            g0(parcel, iF0);
        }
    }

    public static void Z(@n0 Parcel parcel, int i10, @n0 String[] strArr, boolean z10) {
        if (strArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeStringArray(strArr);
            g0(parcel, iF0);
        }
    }

    public static int a(@n0 Parcel parcel) {
        return f0(parcel, 20293);
    }

    public static void a0(@n0 Parcel parcel, int i10, @n0 List<String> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeStringList(list);
            g0(parcel, iF0);
        }
    }

    public static void b(@n0 Parcel parcel, int i10) {
        g0(parcel, i10);
    }

    public static void b0(@n0 Parcel parcel, int i10, @n0 SparseArray<String> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseArray.keyAt(i11));
            parcel.writeString(sparseArray.valueAt(i11));
        }
        g0(parcel, iF0);
    }

    public static void c(@n0 Parcel parcel, int i10, @n0 BigDecimal bigDecimal, boolean z10) {
        if (bigDecimal == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            g0(parcel, iF0);
        }
    }

    public static <T extends Parcelable> void c0(@n0 Parcel parcel, int i10, @n0 T[] tArr, int i11, boolean z10) {
        if (tArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        parcel.writeInt(tArr.length);
        for (T t10 : tArr) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                i0(parcel, t10, i11);
            }
        }
        g0(parcel, iF0);
    }

    public static void d(@n0 Parcel parcel, int i10, @n0 BigDecimal[] bigDecimalArr, boolean z10) {
        if (bigDecimalArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i11 = 0; i11 < length; i11++) {
            parcel.writeByteArray(bigDecimalArr[i11].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i11].scale());
        }
        g0(parcel, iF0);
    }

    public static <T extends Parcelable> void d0(@n0 Parcel parcel, int i10, @n0 List<T> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            T t10 = list.get(i11);
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                i0(parcel, t10, 0);
            }
        }
        g0(parcel, iF0);
    }

    public static void e(@n0 Parcel parcel, int i10, @n0 BigInteger bigInteger, boolean z10) {
        if (bigInteger == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeByteArray(bigInteger.toByteArray());
            g0(parcel, iF0);
        }
    }

    public static <T extends Parcelable> void e0(@n0 Parcel parcel, int i10, @n0 SparseArray<T> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseArray.keyAt(i11));
            T tValueAt = sparseArray.valueAt(i11);
            if (tValueAt == null) {
                parcel.writeInt(0);
            } else {
                i0(parcel, tValueAt, 0);
            }
        }
        g0(parcel, iF0);
    }

    public static void f(@n0 Parcel parcel, int i10, @n0 BigInteger[] bigIntegerArr, boolean z10) {
        if (bigIntegerArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        g0(parcel, iF0);
    }

    private static int f0(Parcel parcel, int i10) {
        parcel.writeInt(i10 | y1.a.f141526c);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void g(@n0 Parcel parcel, int i10, boolean z10) {
        h0(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    private static void g0(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    public static void h(@n0 Parcel parcel, int i10, @n0 boolean[] zArr, boolean z10) {
        if (zArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeBooleanArray(zArr);
            g0(parcel, iF0);
        }
    }

    private static void h0(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    public static void i(@n0 Parcel parcel, int i10, @n0 List<Boolean> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(list.get(i11).booleanValue() ? 1 : 0);
        }
        g0(parcel, iF0);
    }

    private static void i0(Parcel parcel, Parcelable parcelable, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static void j(@n0 Parcel parcel, int i10, @n0 Boolean bool, boolean z10) {
        if (bool != null) {
            h0(parcel, i10, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void k(@n0 Parcel parcel, int i10, @n0 Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeBundle(bundle);
            g0(parcel, iF0);
        }
    }

    public static void l(@n0 Parcel parcel, int i10, byte b10) {
        h0(parcel, i10, 4);
        parcel.writeInt(b10);
    }

    public static void m(@n0 Parcel parcel, int i10, @n0 byte[] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeByteArray(bArr);
            g0(parcel, iF0);
        }
    }

    public static void n(@n0 Parcel parcel, int i10, @n0 byte[][] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        g0(parcel, iF0);
    }

    public static void o(@n0 Parcel parcel, int i10, @n0 SparseArray<byte[]> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseArray.keyAt(i11));
            parcel.writeByteArray(sparseArray.valueAt(i11));
        }
        g0(parcel, iF0);
    }

    public static void p(@n0 Parcel parcel, int i10, char c10) {
        h0(parcel, i10, 4);
        parcel.writeInt(c10);
    }

    public static void q(@n0 Parcel parcel, int i10, @n0 char[] cArr, boolean z10) {
        if (cArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeCharArray(cArr);
            g0(parcel, iF0);
        }
    }

    public static void r(@n0 Parcel parcel, int i10, double d10) {
        h0(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    public static void s(@n0 Parcel parcel, int i10, @n0 double[] dArr, boolean z10) {
        if (dArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeDoubleArray(dArr);
            g0(parcel, iF0);
        }
    }

    public static void t(@n0 Parcel parcel, int i10, @n0 List<Double> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeDouble(list.get(i11).doubleValue());
        }
        g0(parcel, iF0);
    }

    public static void u(@n0 Parcel parcel, int i10, @n0 Double d10, boolean z10) {
        if (d10 != null) {
            h0(parcel, i10, 8);
            parcel.writeDouble(d10.doubleValue());
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void v(@n0 Parcel parcel, int i10, @n0 SparseArray<Double> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(sparseArray.keyAt(i11));
            parcel.writeDouble(sparseArray.valueAt(i11).doubleValue());
        }
        g0(parcel, iF0);
    }

    public static void w(@n0 Parcel parcel, int i10, float f10) {
        h0(parcel, i10, 4);
        parcel.writeFloat(f10);
    }

    public static void x(@n0 Parcel parcel, int i10, @n0 float[] fArr, boolean z10) {
        if (fArr == null) {
            if (z10) {
                h0(parcel, i10, 0);
            }
        } else {
            int iF0 = f0(parcel, i10);
            parcel.writeFloatArray(fArr);
            g0(parcel, iF0);
        }
    }

    public static void y(@n0 Parcel parcel, int i10, @n0 List<Float> list, boolean z10) {
        if (list == null) {
            if (z10) {
                h0(parcel, i10, 0);
                return;
            }
            return;
        }
        int iF0 = f0(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeFloat(list.get(i11).floatValue());
        }
        g0(parcel, iF0);
    }

    public static void z(@n0 Parcel parcel, int i10, @n0 Float f10, boolean z10) {
        if (f10 != null) {
            h0(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }
}
