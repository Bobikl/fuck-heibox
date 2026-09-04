package androidx.work;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.room.j2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Data.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f28774b = n.i("Data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f28775c = new a().a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final int f28776d = 10240;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map<String, Object> f28777a;

    /* JADX INFO: compiled from: Data.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, Object> f28778a = new HashMap();

        @n0
        public e a() throws Throwable {
            e eVar = new e((Map<String, ?>) this.f28778a);
            e.F(eVar);
            return eVar;
        }

        @n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public a b(@n0 String str, @p0 Object obj) {
            if (obj == null) {
                this.f28778a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f28778a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f28778a.put(str, e.a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f28778a.put(str, e.b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f28778a.put(str, e.e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f28778a.put(str, e.f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f28778a.put(str, e.d((float[]) obj));
                } else {
                    if (cls != double[].class) {
                        throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                    }
                    this.f28778a.put(str, e.c((double[]) obj));
                }
            }
            return this;
        }

        @n0
        public a c(@n0 e eVar) {
            d(eVar.f28777a);
            return this;
        }

        @n0
        public a d(@n0 Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @n0
        public a e(@n0 String str, boolean z10) {
            this.f28778a.put(str, Boolean.valueOf(z10));
            return this;
        }

        @n0
        public a f(@n0 String str, @n0 boolean[] zArr) {
            this.f28778a.put(str, e.a(zArr));
            return this;
        }

        @n0
        public a g(@n0 String str, byte b10) {
            this.f28778a.put(str, Byte.valueOf(b10));
            return this;
        }

        @n0
        public a h(@n0 String str, @n0 byte[] bArr) {
            this.f28778a.put(str, e.b(bArr));
            return this;
        }

        @n0
        public a i(@n0 String str, double d10) {
            this.f28778a.put(str, Double.valueOf(d10));
            return this;
        }

        @n0
        public a j(@n0 String str, @n0 double[] dArr) {
            this.f28778a.put(str, e.c(dArr));
            return this;
        }

        @n0
        public a k(@n0 String str, float f10) {
            this.f28778a.put(str, Float.valueOf(f10));
            return this;
        }

        @n0
        public a l(@n0 String str, @n0 float[] fArr) {
            this.f28778a.put(str, e.d(fArr));
            return this;
        }

        @n0
        public a m(@n0 String str, int i10) {
            this.f28778a.put(str, Integer.valueOf(i10));
            return this;
        }

        @n0
        public a n(@n0 String str, @n0 int[] iArr) {
            this.f28778a.put(str, e.e(iArr));
            return this;
        }

        @n0
        public a o(@n0 String str, long j10) {
            this.f28778a.put(str, Long.valueOf(j10));
            return this;
        }

        @n0
        public a p(@n0 String str, @n0 long[] jArr) {
            this.f28778a.put(str, e.f(jArr));
            return this;
        }

        @n0
        public a q(@n0 String str, @p0 String str2) {
            this.f28778a.put(str, str2);
            return this;
        }

        @n0
        public a r(@n0 String str, @n0 String[] strArr) {
            this.f28778a.put(str, strArr);
            return this;
        }
    }

    e() {
    }

    public e(@n0 e eVar) {
        this.f28777a = new HashMap(eVar.f28777a);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public e(@n0 Map<String, ?> map) {
        this.f28777a = new HashMap(map);
    }

    @j2
    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static byte[] F(@n0 e eVar) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(eVar.D());
                    for (Map.Entry<String, Object> entry : eVar.f28777a.entrySet()) {
                        objectOutputStream2.writeUTF(entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e10) {
                        Log.e(f28774b, "Error in Data#toByteArray: ", e10);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(f28774b, "Error in Data#toByteArray: ", e11);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e12) {
                    e = e12;
                    objectOutputStream = objectOutputStream2;
                    Log.e(f28774b, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e13) {
                            Log.e(f28774b, "Error in Data#toByteArray: ", e13);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e14) {
                        Log.e(f28774b, "Error in Data#toByteArray: ", e14);
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e15) {
                            Log.e(f28774b, "Error in Data#toByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e16) {
                        Log.e(f28774b, "Error in Data#toByteArray: ", e16);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e17) {
            e = e17;
        }
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Boolean[] a(@n0 boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i10 = 0; i10 < zArr.length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Byte[] b(@n0 byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Double[] c(@n0 double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Float[] d(@n0 float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Integer[] e(@n0 int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Long[] f(@n0 long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i10 = 0; i10 < jArr.length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static byte[] g(@n0 Byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = bArr[i10].byteValue();
        }
        return bArr2;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static double[] h(@n0 Double[] dArr) {
        double[] dArr2 = new double[dArr.length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr2[i10] = dArr[i10].doubleValue();
        }
        return dArr2;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static float[] i(@n0 Float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr2[i10] = fArr[i10].floatValue();
        }
        return fArr2;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int[] j(@n0 Integer[] numArr) {
        int[] iArr = new int[numArr.length];
        for (int i10 = 0; i10 < numArr.length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static long[] k(@n0 Long[] lArr) {
        long[] jArr = new long[lArr.length];
        for (int i10 = 0; i10 < lArr.length; i10++) {
            jArr[i10] = lArr[i10].longValue();
        }
        return jArr;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean[] l(@n0 Boolean[] boolArr) {
        boolean[] zArr = new boolean[boolArr.length];
        for (int i10 = 0; i10 < boolArr.length; i10++) {
            zArr[i10] = boolArr[i10].booleanValue();
        }
        return zArr;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @j2
    @n0
    public static e m(@n0 byte[] bArr) throws Throwable {
        Throwable th2;
        ObjectInputStream objectInputStream;
        Throwable e10;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i10 = objectInputStream.readInt(); i10 > 0; i10--) {
                            map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e11) {
                            Log.e(f28774b, "Error in Data#fromByteArray: ", e11);
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e12) {
                        e10 = e12;
                        Log.e(f28774b, "Error in Data#fromByteArray: ", e10);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e13) {
                                Log.e(f28774b, "Error in Data#fromByteArray: ", e13);
                            }
                        }
                        byteArrayInputStream.close();
                    } catch (ClassNotFoundException e14) {
                        e10 = e14;
                        Log.e(f28774b, "Error in Data#fromByteArray: ", e10);
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e15) {
                            Log.e(f28774b, "Error in Data#fromByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th2;
                    } catch (IOException e16) {
                        Log.e(f28774b, "Error in Data#fromByteArray: ", e16);
                        throw th2;
                    }
                }
            } catch (IOException e17) {
                e = e17;
                Throwable th4 = e;
                objectInputStream = null;
                e10 = th4;
                Log.e(f28774b, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new e(map);
            } catch (ClassNotFoundException e18) {
                e = e18;
                Throwable th5 = e;
                objectInputStream = null;
                e10 = th5;
                Log.e(f28774b, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new e(map);
            } catch (Throwable th6) {
                th2 = th6;
                if (0 != 0) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
                throw th2;
            }
        } catch (IOException e19) {
            Log.e(f28774b, "Error in Data#fromByteArray: ", e19);
        }
        return new e(map);
    }

    @p0
    public String A(@n0 String str) {
        Object obj = this.f28777a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @p0
    public String[] B(@n0 String str) {
        Object obj = this.f28777a.get(str);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    public <T> boolean C(@n0 String str, @n0 Class<T> cls) {
        Object obj = this.f28777a.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    @j1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int D() {
        return this.f28777a.size();
    }

    @n0
    public byte[] E() {
        return F(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        Set<String> setKeySet = this.f28777a.keySet();
        if (!setKeySet.equals(eVar.f28777a.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.f28777a.get(str);
            Object obj3 = eVar.f28777a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f28777a.hashCode() * 31;
    }

    public boolean n(@n0 String str, boolean z10) {
        Object obj = this.f28777a.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    @p0
    public boolean[] o(@n0 String str) {
        Object obj = this.f28777a.get(str);
        if (obj instanceof Boolean[]) {
            return l((Boolean[]) obj);
        }
        return null;
    }

    public byte p(@n0 String str, byte b10) {
        Object obj = this.f28777a.get(str);
        return obj instanceof Byte ? ((Byte) obj).byteValue() : b10;
    }

    @p0
    public byte[] q(@n0 String str) {
        Object obj = this.f28777a.get(str);
        if (obj instanceof Byte[]) {
            return g((Byte[]) obj);
        }
        return null;
    }

    public double r(@n0 String str, double d10) {
        Object obj = this.f28777a.get(str);
        return obj instanceof Double ? ((Double) obj).doubleValue() : d10;
    }

    @p0
    public double[] s(@n0 String str) {
        Object obj = this.f28777a.get(str);
        if (obj instanceof Double[]) {
            return h((Double[]) obj);
        }
        return null;
    }

    public float t(@n0 String str, float f10) {
        Object obj = this.f28777a.get(str);
        return obj instanceof Float ? ((Float) obj).floatValue() : f10;
    }

    @n0
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f28777a.isEmpty()) {
            for (String str : this.f28777a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f28777a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append(z5.g.f141884d);
        return sb2.toString();
    }

    @p0
    public float[] u(@n0 String str) {
        Object obj = this.f28777a.get(str);
        if (obj instanceof Float[]) {
            return i((Float[]) obj);
        }
        return null;
    }

    public int v(@n0 String str, int i10) {
        Object obj = this.f28777a.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i10;
    }

    @p0
    public int[] w(@n0 String str) {
        Object obj = this.f28777a.get(str);
        if (obj instanceof Integer[]) {
            return j((Integer[]) obj);
        }
        return null;
    }

    @n0
    public Map<String, Object> x() {
        return Collections.unmodifiableMap(this.f28777a);
    }

    public long y(@n0 String str, long j10) {
        Object obj = this.f28777a.get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j10;
    }

    @p0
    public long[] z(@n0 String str) {
        Object obj = this.f28777a.get(str);
        if (obj instanceof Long[]) {
            return k((Long[]) obj);
        }
        return null;
    }
}
