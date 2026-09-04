package cn.fly.verify;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class dr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f36130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f36131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f36132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f36134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f36135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f36136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f36138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object[] f36139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f36140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f36141o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f36142p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f36143q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f36144r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f36145s;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public dl f36147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<Object> f36148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f36149d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f36150e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ArrayList<dr> f36151f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList<Object> f36152g;

        public Class<?> a(String str) {
            return this.f36147b.b(str);
        }

        public Object a() {
            return this.f36147b.a();
        }

        public void a(Object obj) {
            this.f36147b.a(obj);
        }

        public void a(String str, Class<?> cls) {
            this.f36147b.a(str, cls);
        }

        public void a(String str, Object obj) {
            this.f36147b.b(str, obj);
        }

        public Object b(String str) {
            return this.f36147b.a(str);
        }

        public void b(String str, Object obj) {
            this.f36147b.a(str, obj);
        }
    }

    public dr() {
    }

    public dr(int i10) {
        this.f36127a = i10;
    }

    private Object a(Object obj, Class<?> cls) throws Throwable {
        if (obj instanceof ByteArrayOutputStream) {
            return a(((ByteArrayOutputStream) obj).toByteArray(), cls);
        }
        if (obj instanceof byte[]) {
            return a(new String((byte[]) obj, "utf-8"), cls);
        }
        if ((obj instanceof StringBuffer) || (obj instanceof StringBuilder)) {
            return a(obj.toString(), cls);
        }
        if (obj instanceof String) {
            return cls.getConstructor(String.class).newInstance(obj);
        }
        if (obj.getClass().equals(cls)) {
            return obj;
        }
        throw new ClassCastException("Failed to cast " + obj + " to be " + cls.getName() + " at line: " + this.f36128b + "(" + this.f36129c + ")");
    }

    private Object a(Object obj, Object obj2, Class<?> cls, Class<?> cls2) throws Throwable {
        if (obj == null || obj2.equals(obj)) {
            return null;
        }
        if (obj.getClass().equals(cls)) {
            HashMap map = new HashMap();
            a((Map) map, obj, cls, cls2);
            return map;
        }
        if (!obj.getClass().equals(cls2)) {
            return obj;
        }
        Field declaredField = cls2.getDeclaredField("values");
        declaredField.setAccessible(true);
        List list = (List) declaredField.get(obj);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next(), obj2, cls, cls2));
        }
        return arrayList;
    }

    private String a(InputStream inputStream) throws Throwable {
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[1024];
        MessageDigest messageDigest = MessageDigest.getInstance(ec.a("0031fadjfg"));
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return a(messageDigest.digest());
            }
            messageDigest.update(bArr, 0, i10);
        }
    }

    private String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return stringBuffer.toString();
    }

    private void a(Map map, Object obj, Class<?> cls, Class<?> cls2) throws Throwable {
        Field declaredField = cls.getDeclaredField("nameValuePairs");
        declaredField.setAccessible(true);
        Map map2 = (Map) declaredField.get(obj);
        Field declaredField2 = cls.getDeclaredField("NULL");
        declaredField2.setAccessible(true);
        Object obj2 = declaredField2.get(null);
        for (Map.Entry entry : map2.entrySet()) {
            map.put(entry.getKey(), a(entry.getValue(), obj2, cls, cls2));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(dq.a aVar) throws Throwable {
        int i10 = 0;
        switch (this.f36127a) {
            case 1:
                this.f36134h = (String) aVar.b();
                aVar.a();
                break;
            case 2:
                this.f36143q = aVar.b();
                break;
            case 3:
            case 9:
            case 19:
                this.f36134h = (String) aVar.b();
                break;
            case 4:
            case 5:
                this.f36137k = ((Integer) aVar.b()).intValue();
                break;
            case 6:
                this.f36145s = ((Integer) aVar.b()).intValue();
                break;
            case 7:
                this.f36144r = ((Integer) aVar.b()).intValue();
                break;
            case 10:
            case 35:
                this.f36130d = (String) aVar.b();
                this.f36131e = (String) aVar.b();
                break;
            case 11:
            case 24:
                this.f36138l = (String) aVar.b();
                break;
            case 12:
                this.f36142p = (String) aVar.b();
                this.f36135i = ((Integer) aVar.b()).intValue();
                break;
            case 13:
            case 26:
                this.f36140n = (String) aVar.b();
                this.f36138l = (String) aVar.b();
                break;
            case 14:
                this.f36140n = (String) aVar.b();
                this.f36142p = (String) aVar.b();
                this.f36135i = ((Integer) aVar.b()).intValue();
                break;
            case 16:
            case 32:
                this.f36135i = ((Integer) aVar.b()).intValue();
                break;
            case 17:
            case 27:
                this.f36140n = (String) aVar.b();
                break;
            case 18:
                this.f36140n = (String) aVar.b();
                this.f36135i = ((Integer) aVar.b()).intValue();
                break;
            case 20:
                this.f36132f = (String) aVar.b();
                break;
            case 21:
            case 22:
                this.f36132f = (String) aVar.b();
                int iIntValue = ((Integer) aVar.b()).intValue();
                this.f36133g = iIntValue;
                this.f36133g = iIntValue + aVar.c();
                break;
            case 29:
                this.f36134h = (String) aVar.b();
                this.f36135i = ((Integer) aVar.b()).intValue();
                int iIntValue2 = ((Integer) aVar.b()).intValue();
                this.f36136j = iIntValue2;
                this.f36136j = iIntValue2 + aVar.c();
                break;
            case 31:
                this.f36134h = (String) aVar.b();
                this.f36135i = ((Integer) aVar.b()).intValue();
                break;
            case 36:
                int iIntValue3 = ((Integer) aVar.b()).intValue();
                this.f36141o = new String[iIntValue3];
                while (i10 < iIntValue3) {
                    this.f36141o[i10] = (String) aVar.b();
                    aVar.a();
                    i10++;
                }
                break;
            case 37:
                int iIntValue4 = ((Integer) aVar.b()).intValue();
                this.f36139m = new Object[iIntValue4];
                while (i10 < iIntValue4) {
                    this.f36139m[i10] = aVar.b();
                    i10++;
                }
                break;
            case 38:
                int iIntValue5 = ((Integer) aVar.b()).intValue();
                this.f36141o = new String[iIntValue5];
                while (i10 < iIntValue5) {
                    this.f36141o[i10] = (String) aVar.b();
                    i10++;
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:427:0x0935  */
    /* JADX WARN: Code duplicated, block: B:429:0x0941  */
    /* JADX WARN: Code duplicated, block: B:431:0x094e  */
    /* JADX WARN: Code duplicated, block: B:433:0x0952  */
    /* JADX WARN: Code duplicated, block: B:437:0x0961 A[LOOP:13: B:435:0x095a->B:437:0x0961, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:440:0x096a  */
    /* JADX WARN: Code duplicated, block: B:442:0x0972  */
    /* JADX WARN: Code duplicated, block: B:592:0x0c66  */
    /* JADX WARN: Code duplicated, block: B:607:0x0c94  */
    /* JADX WARN: Code duplicated, block: B:608:0x0c97  */
    /* JADX WARN: Code duplicated, block: B:646:0x0965 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:442:0x0972, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [cn.fly.verify.dr$a] */
    /* JADX WARN: Type inference failed for: r2v109, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v112, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v180, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r2v182, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r2v183, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v185, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v206, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v214, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v215, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v216 */
    /* JADX WARN: Type inference failed for: r2v222, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v223, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v225, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v227, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v228, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v230, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v264, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v275, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v277, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v295 */
    /* JADX WARN: Type inference failed for: r2v296 */
    /* JADX WARN: Type inference failed for: r2v297 */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r2v76, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r2v77, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v91, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r2v92, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r2v95, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v96, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v97, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Class] */
    public void a(a aVar) throws Throwable {
        ?? B;
        boolean zEquals;
        boolean zEquals2;
        float fFloatValue;
        int iIntValue;
        int iFloatValue;
        Object bigDecimal;
        InputStream byteArrayInputStream;
        boolean z10;
        OutputStream fileOutputStream;
        boolean z11;
        byte[] bArr;
        int i10;
        File file;
        double dDoubleValue;
        long jLongValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        int iIntValue8;
        int iIntValue9;
        int iIntValue10;
        int iIntValue11;
        Object bigDecimal2;
        int length;
        int iIntValue12;
        String str;
        Class<?> cls;
        Object objB;
        LinkedList<Object> linkedListB;
        dl dlVarB;
        int i11 = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z12 = false;
        int i12 = 0;
        try {
            switch (this.f36127a) {
                case 1:
                    aVar.b(this.f36134h, aVar.a());
                    return;
                case 2:
                    B = this.f36143q;
                    aVar.a(B);
                    return;
                case 3:
                    B = aVar.b(this.f36134h);
                    aVar.a(B);
                    return;
                case 4:
                    B = aVar.a();
                    Object objA = aVar.a();
                    switch (this.f36137k) {
                        case 12:
                            if (B == 0) {
                                if (objA == null) {
                                    B = Boolean.TRUE;
                                } else {
                                    B = Boolean.FALSE;
                                }
                                aVar.a(B);
                                return;
                            }
                            if (!(B instanceof Number) || !(objA instanceof Number)) {
                                zEquals = B.equals(objA);
                                B = Boolean.valueOf(zEquals);
                                aVar.a(B);
                                return;
                            } else {
                                if (((Number) B).doubleValue() == ((Number) objA).doubleValue()) {
                                    z12 = true;
                                }
                                B = Boolean.valueOf(z12);
                                aVar.a(B);
                                return;
                            }
                        case 13:
                            if (B == 0) {
                                if (objA == null) {
                                    B = Boolean.FALSE;
                                } else {
                                    B = Boolean.TRUE;
                                }
                                aVar.a(B);
                                return;
                            }
                            if ((B instanceof Number) && (objA instanceof Number)) {
                                if (((Number) B).doubleValue() != ((Number) objA).doubleValue()) {
                                    z12 = true;
                                }
                                B = Boolean.valueOf(z12);
                                aVar.a(B);
                                return;
                            }
                            zEquals2 = B.equals(objA);
                            zEquals = !zEquals2;
                            B = Boolean.valueOf(zEquals);
                            aVar.a(B);
                            return;
                        case 14:
                            if (!(B instanceof Number) || !(objA instanceof Number) ? ((Comparable) B).compareTo(objA) < 0 : ((Number) B).doubleValue() < ((Number) objA).doubleValue()) {
                                z12 = true;
                            }
                            B = Boolean.valueOf(z12);
                            aVar.a(B);
                            return;
                        case 15:
                            if (!(B instanceof Number) || !(objA instanceof Number) ? ((Comparable) B).compareTo(objA) > 0 : ((Number) B).doubleValue() > ((Number) objA).doubleValue()) {
                                z12 = true;
                            }
                            B = Boolean.valueOf(z12);
                            aVar.a(B);
                            return;
                        case 16:
                            if (!(B instanceof Number) || !(objA instanceof Number) ? ((Comparable) B).compareTo(objA) <= 0 : ((Number) B).doubleValue() <= ((Number) objA).doubleValue()) {
                                z12 = true;
                            }
                            B = Boolean.valueOf(z12);
                            aVar.a(B);
                            return;
                        case 17:
                            if (!(B instanceof Number) || !(objA instanceof Number) ? ((Comparable) B).compareTo(objA) >= 0 : ((Number) B).doubleValue() >= ((Number) objA).doubleValue()) {
                                z12 = true;
                            }
                            B = Boolean.valueOf(z12);
                            aVar.a(B);
                            return;
                        case 18:
                            if (String.class.equals(objA)) {
                                B = B == 0 ? 0 : String.valueOf((Object) B);
                            } else if (Number.class.equals(objA)) {
                                String strValueOf = String.valueOf((Object) B);
                                if (strValueOf.contains(".")) {
                                    try {
                                        try {
                                            B = Float.valueOf(Float.parseFloat(strValueOf));
                                        } catch (Throwable unused) {
                                            bigDecimal2 = new BigDecimal(strValueOf);
                                            B = bigDecimal2;
                                        }
                                    } catch (Throwable unused2) {
                                        B = Double.valueOf(Double.parseDouble(strValueOf));
                                    }
                                } else {
                                    try {
                                        try {
                                            B = Integer.valueOf(Integer.parseInt(strValueOf));
                                        } catch (Throwable unused3) {
                                            bigDecimal2 = new BigInteger(strValueOf);
                                            B = bigDecimal2;
                                        }
                                    } catch (Throwable unused4) {
                                        B = Long.valueOf(Long.parseLong(strValueOf));
                                    }
                                }
                                break;
                            } else if (Double.class.equals(objA) || Double.TYPE.equals(objA)) {
                                B = Double.valueOf(String.valueOf((Object) B));
                            } else if (Float.class.equals(objA) || Float.TYPE.equals(objA)) {
                                fFloatValue = Double.valueOf(String.valueOf((Object) B)).floatValue();
                                B = Float.valueOf(fFloatValue);
                            } else if (Integer.class.equals(objA) || Integer.TYPE.equals(objA)) {
                                iIntValue = Double.valueOf(String.valueOf((Object) B)).intValue();
                                B = Integer.valueOf(iIntValue);
                            } else if (Long.class.equals(objA) || Long.TYPE.equals(objA)) {
                                B = Long.valueOf(Double.valueOf(String.valueOf((Object) B)).longValue());
                            } else if (Short.class.equals(objA) || Short.TYPE.equals(objA)) {
                                B = Short.valueOf(Double.valueOf(String.valueOf((Object) B)).shortValue());
                            } else if (Character.class.equals(objA) || Character.TYPE.equals(objA)) {
                                if (B instanceof Integer) {
                                    iFloatValue = ((Integer) B).intValue();
                                } else if (B instanceof Long) {
                                    iFloatValue = (int) ((Long) B).longValue();
                                } else if (B instanceof Short) {
                                    iFloatValue = ((Short) B).shortValue();
                                } else if (B instanceof Byte) {
                                    iFloatValue = ((Byte) B).byteValue();
                                } else if (B instanceof Double) {
                                    iFloatValue = (int) ((Double) B).doubleValue();
                                } else {
                                    if (!(B instanceof Float)) {
                                        throw new RuntimeException("Bad operator at line: " + this.f36128b + "(" + this.f36129c + ")");
                                    }
                                    iFloatValue = (int) ((Float) B).floatValue();
                                }
                                B = Character.valueOf((char) iFloatValue);
                            } else if (Byte.class.equals(objA) || Byte.TYPE.equals(objA)) {
                                B = Byte.valueOf(Double.valueOf(String.valueOf((Object) B)).byteValue());
                            } else {
                                if (!Boolean.class.equals(objA)) {
                                    if (BigInteger.class.equals(objA)) {
                                        bigDecimal = new BigInteger(String.valueOf((Object) B));
                                    } else if (BigDecimal.class.equals(objA)) {
                                        bigDecimal = new BigDecimal(String.valueOf((Object) B));
                                    } else {
                                        B = ((Class) objA).cast(B);
                                    }
                                    aVar.a(bigDecimal);
                                    return;
                                }
                                if (B == 0) {
                                    B = Boolean.FALSE;
                                } else if (B instanceof Number) {
                                    if (Double.valueOf(B.toString()).doubleValue() == 0.0d) {
                                        z12 = true;
                                    }
                                    B = Boolean.valueOf(z12);
                                } else if (B instanceof String) {
                                    zEquals = ((String) B).trim().toLowerCase().equals(ec.a("004g;bhbeVd"));
                                    B = Boolean.valueOf(zEquals);
                                } else if (!(B instanceof Boolean)) {
                                    B = Boolean.TRUE;
                                }
                            }
                            aVar.a(B);
                            return;
                        case 19:
                            zEquals = ((Class) objA).isInstance(B);
                            B = Boolean.valueOf(zEquals);
                            aVar.a(B);
                            return;
                        case 20:
                            if (B instanceof Collection) {
                                Collection collection = (Collection) B;
                                if (objA instanceof Collection) {
                                    collection.addAll((Collection) objA);
                                    return;
                                } else {
                                    collection.add(objA);
                                    return;
                                }
                            }
                            if ((B instanceof Map) && (objA instanceof Map)) {
                                ((Map) B).putAll((Map) objA);
                                return;
                            }
                            if (objA instanceof String) {
                                byteArrayInputStream = new ByteArrayInputStream(((String) objA).getBytes("utf-8"));
                            } else if (objA instanceof byte[]) {
                                byteArrayInputStream = new ByteArrayInputStream((byte[]) objA);
                            } else if (objA instanceof File) {
                                byteArrayInputStream = new FileInputStream((File) objA);
                            } else {
                                if (objA instanceof InputStream) {
                                    byteArrayInputStream = (InputStream) objA;
                                    z10 = false;
                                } else {
                                    if (!(objA instanceof Serializable)) {
                                        throw new RuntimeException("Bad operator at line: " + this.f36128b + "(" + this.f36129c + ")");
                                    }
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                    objectOutputStream.writeObject(objA);
                                    objectOutputStream.flush();
                                    objectOutputStream.close();
                                    byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                                }
                                if (B instanceof File) {
                                    file = (File) B;
                                    if (!file.getParentFile().exists()) {
                                        file.getParentFile().mkdirs();
                                    }
                                    fileOutputStream = new FileOutputStream(file, true);
                                    z11 = z10;
                                } else {
                                    if (B instanceof OutputStream) {
                                        throw new RuntimeException("Bad operator at line: " + this.f36128b + "(" + this.f36129c + ")");
                                    }
                                    fileOutputStream = (OutputStream) B;
                                    z11 = false;
                                }
                                bArr = new byte[1024];
                                while (true) {
                                    i10 = byteArrayInputStream.read(bArr);
                                    if (i10 != -1) {
                                        fileOutputStream.flush();
                                        if (z11) {
                                            byteArrayInputStream.close();
                                        }
                                        fileOutputStream.close();
                                        return;
                                    }
                                    fileOutputStream.write(bArr, 0, i10);
                                }
                            }
                            z10 = true;
                            if (B instanceof File) {
                                file = (File) B;
                                if (!file.getParentFile().exists()) {
                                    file.getParentFile().mkdirs();
                                }
                                fileOutputStream = new FileOutputStream(file, true);
                                z11 = z10;
                            } else {
                                if (B instanceof OutputStream) {
                                    throw new RuntimeException("Bad operator at line: " + this.f36128b + "(" + this.f36129c + ")");
                                }
                                fileOutputStream = (OutputStream) B;
                                z11 = false;
                            }
                            bArr = new byte[1024];
                            while (true) {
                                i10 = byteArrayInputStream.read(bArr);
                                if (i10 != -1) {
                                    fileOutputStream.flush();
                                    if (z11) {
                                        byteArrayInputStream.close();
                                    }
                                    fileOutputStream.close();
                                    return;
                                }
                                fileOutputStream.write(bArr, 0, i10);
                            }
                            break;
                        case 21:
                            ?? r10 = B;
                            if (B == 0) {
                                r10 = "null";
                            }
                            if (objA == null) {
                                objA = "null";
                            }
                            if (!(r10 instanceof Number) || !(objA instanceof Number)) {
                                B = String.valueOf((Object) r10) + String.valueOf(objA);
                            } else if ((r10 instanceof Double) || (objA instanceof Double)) {
                                dDoubleValue = ((Number) r10).doubleValue() + ((Number) objA).doubleValue();
                                B = Double.valueOf(dDoubleValue);
                            } else if ((r10 instanceof Float) || (objA instanceof Float)) {
                                fFloatValue = ((Number) r10).floatValue() + ((Number) objA).floatValue();
                                B = Float.valueOf(fFloatValue);
                            } else if ((r10 instanceof Long) || (objA instanceof Long)) {
                                jLongValue = ((Number) r10).longValue() + ((Number) objA).longValue();
                                B = Long.valueOf(jLongValue);
                            } else {
                                if ((r10 instanceof Integer) || (objA instanceof Integer)) {
                                    iIntValue2 = ((Number) r10).intValue();
                                    iIntValue3 = ((Number) objA).intValue();
                                } else if ((r10 instanceof Short) || (objA instanceof Short)) {
                                    iIntValue2 = ((Number) r10).shortValue();
                                    iIntValue3 = ((Number) objA).shortValue();
                                } else {
                                    iIntValue2 = ((Number) r10).byteValue();
                                    iIntValue3 = ((Number) objA).byteValue();
                                }
                                iIntValue = iIntValue2 + iIntValue3;
                                B = Integer.valueOf(iIntValue);
                            }
                            aVar.a(B);
                            return;
                        case 22:
                            if (!(B instanceof Number) || !(objA instanceof Number)) {
                                throw new RuntimeException("Bad operator at line: " + this.f36128b + "(" + this.f36129c + ")");
                            }
                            if ((B instanceof Double) || (objA instanceof Double)) {
                                dDoubleValue = ((Number) B).doubleValue() - ((Number) objA).doubleValue();
                                B = Double.valueOf(dDoubleValue);
                                aVar.a(B);
                                return;
                            }
                            if ((B instanceof Float) || (objA instanceof Float)) {
                                fFloatValue = ((Number) B).floatValue() - ((Number) objA).floatValue();
                                B = Float.valueOf(fFloatValue);
                                aVar.a(B);
                                return;
                            }
                            if ((B instanceof Long) || (objA instanceof Long)) {
                                jLongValue = ((Number) B).longValue() - ((Number) objA).longValue();
                                B = Long.valueOf(jLongValue);
                                aVar.a(B);
                                return;
                            }
                            if ((B instanceof Integer) || (objA instanceof Integer)) {
                                iIntValue4 = ((Number) B).intValue();
                                iIntValue5 = ((Number) objA).intValue();
                            } else if ((B instanceof Short) || (objA instanceof Short)) {
                                iIntValue4 = ((Number) B).shortValue();
                                iIntValue5 = ((Number) objA).shortValue();
                            } else {
                                iIntValue4 = ((Number) B).byteValue();
                                iIntValue5 = ((Number) objA).byteValue();
                            }
                            iIntValue = iIntValue4 - iIntValue5;
                            B = Integer.valueOf(iIntValue);
                            aVar.a(B);
                            return;
                        case 23:
                            if (!(B instanceof Number) || !(objA instanceof Number)) {
                                throw new RuntimeException("Bad operator at line: " + this.f36128b + "(" + this.f36129c + ")");
                            }
                            if ((B instanceof Double) || (objA instanceof Double)) {
                                dDoubleValue = ((Number) B).doubleValue() * ((Number) objA).doubleValue();
                                B = Double.valueOf(dDoubleValue);
                                aVar.a(B);
                                return;
                            }
                            if ((B instanceof Float) || (objA instanceof Float)) {
                                fFloatValue = ((Number) B).floatValue() * ((Number) objA).floatValue();
                                B = Float.valueOf(fFloatValue);
                                aVar.a(B);
                                return;
                            }
                            if ((B instanceof Long) || (objA instanceof Long)) {
                                jLongValue = ((Number) B).longValue() * ((Number) objA).longValue();
                                B = Long.valueOf(jLongValue);
                                aVar.a(B);
                                return;
                            }
                            if ((B instanceof Integer) || (objA instanceof Integer)) {
                                iIntValue6 = ((Number) B).intValue();
                                iIntValue7 = ((Number) objA).intValue();
                            } else if ((B instanceof Short) || (objA instanceof Short)) {
                                iIntValue6 = ((Number) B).shortValue();
                                iIntValue7 = ((Number) objA).shortValue();
                            } else {
                                iIntValue6 = ((Number) B).byteValue();
                                iIntValue7 = ((Number) objA).byteValue();
                            }
                            iIntValue = iIntValue6 * iIntValue7;
                            B = Integer.valueOf(iIntValue);
                            aVar.a(B);
                            return;
                        case 24:
                            if (!(B instanceof Number) || !(objA instanceof Number)) {
                                throw new RuntimeException("Bad operator at line: " + this.f36128b + "(" + this.f36129c + ")");
                            }
                            if ((B instanceof Double) || (objA instanceof Double)) {
                                dDoubleValue = ((Number) B).doubleValue() / ((Number) objA).doubleValue();
                                B = Double.valueOf(dDoubleValue);
                                aVar.a(B);
                                return;
                            }
                            if ((B instanceof Float) || (objA instanceof Float)) {
                                fFloatValue = ((Number) B).floatValue() / ((Number) objA).floatValue();
                                B = Float.valueOf(fFloatValue);
                                aVar.a(B);
                                return;
                            }
                            if ((B instanceof Long) || (objA instanceof Long)) {
                                jLongValue = ((Number) B).longValue() / ((Number) objA).longValue();
                                B = Long.valueOf(jLongValue);
                                aVar.a(B);
                                return;
                            }
                            if ((B instanceof Integer) || (objA instanceof Integer)) {
                                iIntValue8 = ((Number) B).intValue();
                                iIntValue9 = ((Number) objA).intValue();
                            } else if ((B instanceof Short) || (objA instanceof Short)) {
                                iIntValue8 = ((Number) B).shortValue();
                                iIntValue9 = ((Number) objA).shortValue();
                            } else {
                                iIntValue8 = ((Number) B).byteValue();
                                iIntValue9 = ((Number) objA).byteValue();
                            }
                            iIntValue = iIntValue8 / iIntValue9;
                            B = Integer.valueOf(iIntValue);
                            aVar.a(B);
                            return;
                        case 25:
                            if (!(B instanceof Number) || !(objA instanceof Number)) {
                                throw new RuntimeException("Bad operator at line: " + this.f36128b + "(" + this.f36129c + ")");
                            }
                            if ((B instanceof Double) || (objA instanceof Double)) {
                                dDoubleValue = ((Number) B).doubleValue() % ((Number) objA).doubleValue();
                                B = Double.valueOf(dDoubleValue);
                                aVar.a(B);
                                return;
                            }
                            if ((B instanceof Float) || (objA instanceof Float)) {
                                fFloatValue = ((Number) B).floatValue() % ((Number) objA).floatValue();
                                B = Float.valueOf(fFloatValue);
                                aVar.a(B);
                                return;
                            }
                            if ((B instanceof Long) || (objA instanceof Long)) {
                                jLongValue = ((Number) B).longValue() % ((Number) objA).longValue();
                                B = Long.valueOf(jLongValue);
                                aVar.a(B);
                                return;
                            }
                            if ((B instanceof Integer) || (objA instanceof Integer)) {
                                iIntValue10 = ((Number) B).intValue();
                                iIntValue11 = ((Number) objA).intValue();
                            } else if ((B instanceof Short) || (objA instanceof Short)) {
                                iIntValue10 = ((Number) B).shortValue();
                                iIntValue11 = ((Number) objA).shortValue();
                            } else {
                                iIntValue10 = ((Number) B).byteValue();
                                iIntValue11 = ((Number) objA).byteValue();
                            }
                            iIntValue = iIntValue10 % iIntValue11;
                            B = Integer.valueOf(iIntValue);
                            aVar.a(B);
                            return;
                        default:
                            throw new RuntimeException("Bad operator at line: " + this.f36128b + "(" + this.f36129c + ")");
                    }
                    break;
                case 5:
                    Object objA2 = aVar.a();
                    if (this.f36137k == 26) {
                        zEquals2 = ((Boolean) objA2).booleanValue();
                        zEquals = !zEquals2;
                        B = Boolean.valueOf(zEquals);
                        aVar.a(B);
                        return;
                    }
                    throw new RuntimeException("Bad operator at line: " + this.f36128b + "(" + this.f36129c + ")");
                case 6:
                    B = new ArrayList();
                    if (this.f36145s == 1) {
                        Object objA3 = aVar.a();
                        if (objA3 == null || !objA3.getClass().isArray()) {
                            B.add(objA3);
                        } else {
                            int length2 = Array.getLength(objA3);
                            for (int i13 = 0; i13 < length2; i13++) {
                                B.add(Array.get(objA3, i13));
                            }
                        }
                    } else {
                        for (int i14 = 0; i14 < this.f36145s; i14++) {
                            B.add(aVar.a());
                        }
                    }
                    aVar.a(B);
                    return;
                case 7:
                    B = new HashMap();
                    for (int i15 = 0; i15 < this.f36144r; i15++) {
                        B.put(aVar.a(), aVar.a());
                    }
                    aVar.a(B);
                    return;
                case 8:
                    Object objA4 = aVar.a();
                    Object objA5 = aVar.a();
                    if (objA4 instanceof List) {
                        List list = (List) objA4;
                        if (objA5 instanceof ct) {
                            Number[] numberArrB = ((ct) objA5).b();
                            int iIntValue13 = numberArrB[0].intValue();
                            if (iIntValue13 < 0) {
                                iIntValue13 += list.size();
                            }
                            int iIntValue14 = numberArrB[1].intValue();
                            if (iIntValue14 < 0) {
                                iIntValue14 += list.size();
                            }
                            B = list.subList(iIntValue13, iIntValue14);
                        } else {
                            int iIntValue15 = ((Integer) objA5).intValue();
                            if (iIntValue15 < 0) {
                                iIntValue15 += list.size();
                            }
                            B = list.get(iIntValue15);
                        }
                    } else if (objA4 instanceof Map) {
                        B = ((Map) objA4).get(objA5);
                    } else if (!objA4.getClass().isArray()) {
                        if (!(objA4 instanceof String)) {
                            throw new IllegalArgumentException(objA4.getClass().getName() + " is not entry");
                        }
                        String str2 = (String) objA4;
                        if (objA5 instanceof ct) {
                            Number[] numberArrB2 = ((ct) objA5).b();
                            iIntValue12 = numberArrB2[0].intValue();
                            length = numberArrB2[1].intValue();
                        } else {
                            length = str2.length();
                            iIntValue12 = ((Integer) objA5).intValue();
                        }
                        if (iIntValue12 < 0) {
                            iIntValue12 += str2.length();
                        }
                        if (length < 0) {
                            length += str2.length();
                        }
                        B = str2.substring(iIntValue12, length);
                    } else if (objA5 instanceof ct) {
                        int length3 = Array.getLength(objA4);
                        Number[] numberArrB3 = ((ct) objA5).b();
                        int iIntValue16 = numberArrB3[0].intValue();
                        if (iIntValue16 < 0) {
                            iIntValue16 += length3;
                        }
                        int iIntValue17 = numberArrB3[1].intValue();
                        if (iIntValue17 < 0) {
                            iIntValue17 += length3;
                        }
                        int i16 = iIntValue17 - iIntValue16;
                        Object objNewInstance = Array.newInstance(objA4.getClass().getComponentType(), i16);
                        System.arraycopy(objA4, iIntValue16, objNewInstance, 0, i16);
                        bigDecimal2 = objNewInstance;
                        B = bigDecimal2;
                    } else {
                        int iIntValue18 = ((Integer) objA5).intValue();
                        if (iIntValue18 < 0) {
                            iIntValue18 += Array.getLength(objA4);
                        }
                        B = Array.get(objA4, iIntValue18);
                    }
                    aVar.a(B);
                    return;
                case 9:
                    B = aVar.a(this.f36134h);
                    aVar.a(B);
                    return;
                case 10:
                    str = this.f36131e;
                    cls = Class.forName(this.f36130d);
                    aVar.a(str, cls);
                    return;
                case 11:
                    a(aVar.a(), aVar.f36147b);
                    return;
                case 12:
                    Object objA6 = aVar.a();
                    Object[] objArr = new Object[this.f36135i];
                    for (int i17 = 0; i17 < this.f36135i; i17++) {
                        objArr[i17] = aVar.a();
                    }
                    a(objA6, objArr, aVar.f36147b);
                    return;
                case 13:
                    a(aVar.a(this.f36140n), aVar.f36147b);
                    return;
                case 14:
                    Class<?> clsA = aVar.a(this.f36140n);
                    Object[] objArr2 = new Object[this.f36135i];
                    for (int i18 = 0; i18 < this.f36135i; i18++) {
                        objArr2[i18] = aVar.a();
                    }
                    a(clsA, objArr2, aVar.f36147b);
                    return;
                case 15:
                    Object objA7 = aVar.a();
                    dr drVar = new dr(11);
                    drVar.f36128b = this.f36128b;
                    drVar.f36129c = this.f36129c;
                    drVar.f36138l = (String) aVar.a();
                    drVar.a(objA7, aVar.f36147b);
                    return;
                case 16:
                    Object objA8 = aVar.a();
                    dr drVar2 = new dr(12);
                    drVar2.f36128b = this.f36128b;
                    drVar2.f36129c = this.f36129c;
                    drVar2.f36142p = (String) aVar.a();
                    drVar2.f36135i = this.f36135i;
                    Object[] objArr3 = new Object[this.f36135i];
                    for (int i19 = 0; i19 < this.f36135i; i19++) {
                        objArr3[i19] = aVar.a();
                    }
                    drVar2.a(objA8, objArr3, aVar.f36147b);
                    return;
                case 17:
                    Class<?> clsA2 = aVar.a(this.f36140n);
                    dr drVar3 = new dr(13);
                    drVar3.f36128b = this.f36128b;
                    drVar3.f36129c = this.f36129c;
                    drVar3.f36138l = (String) aVar.a();
                    drVar3.a(clsA2, aVar.f36147b);
                    return;
                case 18:
                    Class<?> clsA3 = aVar.a(this.f36140n);
                    dr drVar4 = new dr(14);
                    drVar4.f36128b = this.f36128b;
                    drVar4.f36129c = this.f36129c;
                    drVar4.f36140n = this.f36140n;
                    drVar4.f36142p = (String) aVar.a();
                    drVar4.f36135i = this.f36135i;
                    Object[] objArr4 = new Object[this.f36135i];
                    for (int i20 = 0; i20 < this.f36135i; i20++) {
                        objArr4[i20] = aVar.a();
                    }
                    drVar4.a(clsA3, objArr4, aVar.f36147b);
                    return;
                case 19:
                    aVar.a(this.f36134h, aVar.a());
                    return;
                case 20:
                default:
                    return;
                case 21:
                    if (((Boolean) aVar.a()).booleanValue()) {
                        return;
                    }
                    aVar.f36146a = this.f36133g;
                    return;
                case 22:
                    aVar.f36146a = this.f36133g;
                    return;
                case 23:
                    Object objA9 = aVar.a();
                    Object objA10 = aVar.a();
                    Object objA11 = aVar.a();
                    if (objA9 instanceof List) {
                        List list2 = (List) objA9;
                        int iIntValue19 = ((Integer) objA10).intValue();
                        if (iIntValue19 < 0) {
                            iIntValue19 += list2.size();
                        }
                        list2.set(iIntValue19, objA11);
                        return;
                    }
                    if (objA9 instanceof Map) {
                        ((Map) objA9).put(objA10, objA11);
                        return;
                    }
                    if (!objA9.getClass().isArray()) {
                        throw new IllegalArgumentException(objA9.getClass().getName() + " is not entry");
                    }
                    int iIntValue20 = ((Integer) objA10).intValue();
                    if (iIntValue20 < 0) {
                        iIntValue20 += Array.getLength(objA9);
                    }
                    Array.set(objA9, iIntValue20, objA11);
                    return;
                case 24:
                    b(aVar.a(), aVar.f36147b);
                    return;
                case 25:
                    Object objA12 = aVar.a();
                    dr drVar5 = new dr(24);
                    drVar5.f36128b = this.f36128b;
                    drVar5.f36129c = this.f36129c;
                    drVar5.f36138l = (String) aVar.a();
                    drVar5.b(objA12, aVar.f36147b);
                    return;
                case 26:
                    b(aVar.a(this.f36140n), aVar.f36147b);
                    return;
                case 27:
                    Class<?> clsA4 = aVar.a(this.f36140n);
                    dr drVar6 = new dr(26);
                    drVar6.f36128b = this.f36128b;
                    drVar6.f36129c = this.f36129c;
                    drVar6.f36138l = (String) aVar.a();
                    drVar6.b(clsA4, aVar.f36147b);
                    return;
                case 28:
                    List<Object> list3 = aVar.f36148c;
                    if (list3 != null) {
                        list3.add(aVar.a());
                    }
                    aVar.f36149d = true;
                    aVar.f36150e = true;
                    return;
                case 29:
                    int i21 = aVar.f36146a;
                    int i22 = this.f36136j;
                    if (i22 > 0) {
                        aVar.f36146a = i22;
                    } else {
                        int i23 = i21 + 1;
                        int i24 = 1;
                        i22 = i21;
                        while (i24 > 0) {
                            int i25 = aVar.f36151f.get(i23).f36127a;
                            if (i25 == 29) {
                                i24++;
                            } else if (i25 == 30) {
                                i24--;
                            }
                            if (i24 == 0) {
                                aVar.f36146a = i23;
                                i22 = i23;
                            }
                            i23++;
                        }
                    }
                    int i26 = i21 + 1;
                    B = i26 == i22 ? ds.a(this.f36134h, this.f36135i, aVar.f36151f, aVar.f36152g, i26, i22, aVar.f36147b) : new ds(this.f36134h, this.f36135i, aVar.f36151f, aVar.f36152g, i26, i22, aVar.f36147b);
                    String str3 = this.f36134h;
                    if (str3 != null) {
                        aVar.b(str3, B);
                        return;
                    }
                    aVar.a(B);
                    return;
                case 30:
                    aVar.f36150e = true;
                    return;
                case 31:
                    objB = aVar.b(this.f36134h);
                    if (!(objB instanceof ds)) {
                        if (!(objB instanceof Method)) {
                            throw new NoSuchMethodException(this.f36134h + " at line: " + this.f36128b + "(" + this.f36129c + ")");
                        }
                        aVar.f36147b.a((Method) objB, this.f36135i);
                        return;
                    }
                    ds dsVar = (ds) objB;
                    Object[] objArr5 = new Object[this.f36135i];
                    for (int i27 = 0; i27 < this.f36135i; i27++) {
                        objArr5[i27] = aVar.a();
                    }
                    linkedListB = dsVar.b(objArr5);
                    if (linkedListB.size() <= 0) {
                        return;
                    }
                    B = linkedListB.get(0);
                    aVar.a(B);
                    return;
                case 32:
                    objB = aVar.a();
                    if (!(objB instanceof ds)) {
                        if (!(objB instanceof Method)) {
                            throw new RuntimeException("at line: " + this.f36128b + "(" + this.f36129c + ")");
                        }
                        aVar.f36147b.a((Method) objB, this.f36135i);
                        return;
                    }
                    ds dsVar2 = (ds) objB;
                    Object[] objArr6 = new Object[this.f36135i];
                    for (int i28 = 0; i28 < this.f36135i; i28++) {
                        objArr6[i28] = aVar.a();
                    }
                    linkedListB = dsVar2.b(objArr6);
                    if (linkedListB.size() <= 0) {
                        return;
                    }
                    B = linkedListB.get(0);
                    aVar.a(B);
                    return;
                case 33:
                    dlVarB = aVar.f36147b.b();
                    aVar.f36147b = dlVarB;
                    return;
                case 34:
                    dlVarB = aVar.f36147b.c();
                    aVar.f36147b = dlVarB;
                    return;
                case 35:
                    str = this.f36131e;
                    cls = aVar.a(this.f36130d);
                    aVar.a(str, cls);
                    return;
                case 36:
                    while (true) {
                        String[] strArr = this.f36141o;
                        if (i12 >= strArr.length) {
                            return;
                        }
                        aVar.b(strArr[i12], aVar.a());
                        i12++;
                    }
                    break;
                case 37:
                    while (true) {
                        Object[] objArr7 = this.f36139m;
                        if (i11 >= objArr7.length) {
                            return;
                        }
                        aVar.a(objArr7[i11]);
                        i11++;
                    }
                    break;
                case 38:
                    for (String str4 : this.f36141o) {
                        aVar.a(aVar.b(str4));
                    }
                    return;
            }
        } catch (Throwable unused5) {
        }
    }

    void a(Class<?> cls, dl dlVar) throws Throwable {
        Field declaredField;
        while (true) {
            if (cls == null) {
                dr drVar = new dr(14);
                drVar.f36128b = this.f36128b;
                drVar.f36129c = this.f36129c;
                drVar.f36140n = this.f36140n;
                drVar.f36142p = ec.a("003?chWdg") + Character.toUpperCase(this.f36138l.charAt(0)) + this.f36138l.substring(1);
                drVar.f36135i = 1;
                drVar.a(cls, new Object[0], dlVar);
                return;
            }
            if ("class".equals(this.f36138l)) {
                dlVar.a(cls);
                return;
            }
            if (cls.equals(dq.class) && ec.a("007Wbb>d(bhdgbgbi!c").equals(this.f36138l)) {
                dlVar.a((Object) 70);
                return;
            }
            if (cls.isEnum()) {
                Object[] enumConstants = cls.getEnumConstants();
                if (enumConstants != null) {
                    for (Object obj : enumConstants) {
                        if (((Enum) obj).name().equals(this.f36138l)) {
                            dlVar.a(obj);
                            return;
                        }
                    }
                } else {
                    continue;
                }
            } else {
                try {
                    declaredField = cls.getDeclaredField(this.f36138l);
                } catch (Throwable unused) {
                    declaredField = null;
                }
                if (declaredField != null && Modifier.isStatic(declaredField.getModifiers())) {
                    declaredField.setAccessible(true);
                    dlVar.a(declaredField.get(null));
                    return;
                }
                cls = cls.getSuperclass();
            }
        }
    }

    void a(Class<?> cls, Object[] objArr, dl dlVar) throws Throwable {
        Class<?>[] parameterTypes;
        boolean[] zArr;
        boolean[] zArrA;
        Object obj;
        Class<?> superclass = cls;
        if ("new".equals(this.f36142p)) {
            if (List.class.isAssignableFrom(superclass) && objArr.length == 1 && (obj = objArr[0]) != null && obj.getClass().isArray()) {
                int length = Array.getLength(objArr[0]);
                List arrayList = superclass.equals(List.class) ? new ArrayList(length) : (List) cls.newInstance();
                for (int i10 = 0; i10 < length; i10++) {
                    arrayList.add(Array.get(objArr[0], i10));
                }
                dlVar.a(arrayList);
                return;
            }
            if (Map.class.isAssignableFrom(superclass) && objArr.length == 1 && objArr[0] != null) {
                Map map = superclass.equals(Map.class) ? new HashMap() : (Map) cls.newInstance();
                Object obj2 = objArr[0];
                if (obj2 instanceof Map) {
                    map.putAll((Map) obj2);
                } else {
                    Class<?> cls2 = Class.forName("org.json.JSONObject");
                    a(map, a(objArr[0], cls2), cls2, Class.forName("org.json.JSONArray"));
                }
                dlVar.a(map);
                return;
            }
            if (superclass.equals(ct.class)) {
                if (objArr.length == 2) {
                    dlVar.a(new ct((Number) objArr[0], (Number) objArr[1], null));
                    return;
                }
                if (objArr.length == 3) {
                    dlVar.a(new ct((Number) objArr[0], (Number) objArr[1], (Number) objArr[2]));
                    return;
                }
                throw new NoSuchMethodException("method name: new at line: " + this.f36128b + "(" + this.f36129c + ")");
            }
            boolean[][] zArr2 = new boolean[2][];
            Constructor constructorA = dlVar.g().a(superclass, objArr, zArr2);
            if (constructorA != null) {
                Object[] objArrA = !zArr2[1][0] ? dlVar.g().a(dlVar, constructorA.getParameterTypes(), objArr, zArr2[0]) : objArr;
                constructorA.setAccessible(true);
                dlVar.a(constructorA.newInstance(objArrA));
                return;
            }
            for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                Class<?>[] parameterTypes2 = constructor.getParameterTypes();
                boolean[] zArr3 = new boolean[1];
                boolean[] zArrA2 = dlVar.g().a(parameterTypes2, objArr, zArr3);
                if (zArrA2 != null) {
                    Object[] objArrA2 = !zArr3[0] ? dlVar.g().a(dlVar, parameterTypes2, objArr, zArrA2) : objArr;
                    constructor.setAccessible(true);
                    dlVar.a(constructor.newInstance(objArrA2));
                    return;
                }
            }
            throw new NoSuchMethodException("method name: new at line: " + this.f36128b + "(" + this.f36129c + ")");
        }
        if ("fromJson".equals(this.f36142p) && Map.class.isAssignableFrom(superclass) && objArr.length == 1 && objArr[0] != null) {
            this.f36142p = "new";
            a(cls, objArr, dlVar);
            return;
        }
        if (superclass.equals(Array.class)) {
            if (this.f36142p.equals(ec.a("011cdRdecc]c0dg2gbcad")) && objArr.length == 2) {
                Object obj3 = objArr[1];
                if (obj3 instanceof Integer) {
                    dlVar.a(Array.newInstance((Class<?>) objArr[0], ((Integer) obj3).intValue()));
                    return;
                }
            }
            if ("copy".equals(this.f36142p)) {
                int i11 = this.f36135i;
                if (i11 == 5) {
                    System.arraycopy(objArr[0], Integer.parseInt(String.valueOf(objArr[1])), objArr[2], Integer.parseInt(String.valueOf(objArr[3])), Integer.parseInt(String.valueOf(objArr[44])));
                    return;
                }
                if (i11 == 2) {
                    Object obj4 = objArr[0];
                    System.arraycopy(obj4, 0, objArr[1], 0, Math.min(Array.getLength(obj4), Array.getLength(objArr[1])));
                    return;
                }
                throw new NoSuchMethodException("method name: copy at line: " + this.f36128b + "(" + this.f36129c + ")");
            }
        } else if ("quit".equals(this.f36142p) && superclass.equals(dq.class)) {
            dlVar.e();
            return;
        }
        if (dlVar.g().a((Object) null, cls, this.f36142p, objArr, dlVar)) {
            return;
        }
        for (Class<?> superclass2 = superclass; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
            boolean[][] zArr4 = new boolean[2][];
            Method methodA = dlVar.g().a(superclass2, this.f36142p, true, objArr, zArr4);
            if (methodA != null) {
                Object[] objArrA3 = !zArr4[1][0] ? dlVar.g().a(dlVar, methodA.getParameterTypes(), objArr, zArr4[0]) : objArr;
                methodA.setAccessible(true);
                if (methodA.getReturnType() == Void.TYPE) {
                    methodA.invoke(null, objArrA3);
                    return;
                } else {
                    dlVar.a(methodA.invoke(null, objArrA3));
                    return;
                }
            }
        }
        while (superclass != null) {
            for (Method method : superclass.getDeclaredMethods()) {
                if (method.getName().equals(this.f36142p) && Modifier.isStatic(method.getModifiers()) && (zArrA = dlVar.g().a((parameterTypes = method.getParameterTypes()), objArr, (zArr = new boolean[1]))) != null) {
                    Object[] objArrA4 = !zArr[0] ? dlVar.g().a(dlVar, parameterTypes, objArr, zArrA) : objArr;
                    method.setAccessible(true);
                    if (method.getReturnType() == Void.TYPE) {
                        method.invoke(null, objArrA4);
                        return;
                    } else {
                        dlVar.a(method.invoke(null, objArrA4));
                        return;
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
        throw new NoSuchMethodException("method name: " + this.f36142p + " at line: " + this.f36128b + "(" + this.f36129c + ")");
    }

    void a(Object obj, dl dlVar) throws Throwable {
        if (obj instanceof Map) {
            dlVar.a(((Map) obj).get(this.f36138l));
            return;
        }
        if (ec.a("006edcHch*gf").equals(this.f36138l) && obj.getClass().isArray()) {
            dlVar.a(Integer.valueOf(Array.getLength(obj)));
            return;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            Field declaredField = null;
            try {
                declaredField = superclass.getDeclaredField(this.f36138l);
            } catch (Throwable unused) {
            }
            if (declaredField != null && !Modifier.isStatic(declaredField.getModifiers())) {
                declaredField.setAccessible(true);
                dlVar.a(declaredField.get(obj));
                return;
            }
        }
        dr drVar = new dr(12);
        drVar.f36128b = this.f36128b;
        drVar.f36129c = this.f36129c;
        drVar.f36142p = ec.a("0032ch=dg") + Character.toUpperCase(this.f36138l.charAt(0)) + this.f36138l.substring(1);
        drVar.f36135i = 0;
        drVar.a(obj, new Object[0], dlVar);
    }

    /* JADX WARN: Code duplicated, block: B:269:0x052c  */
    void a(Object obj, Object[] objArr, dl dlVar) throws Throwable {
        byte[] bArr;
        String[] strArr;
        Object obj2;
        ds dsVar;
        String strValueOf;
        Object obj3;
        Class<?>[] parameterTypes;
        boolean[] zArr;
        boolean[] zArrA;
        Object obj4;
        Class<?>[] clsArr;
        Object[] objArrA = objArr;
        int i10 = 0;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj5 = map.get(this.f36142p);
            if (obj5 != null) {
                if (obj5 instanceof ds) {
                    LinkedList<Object> linkedListB = ((ds) obj5).b(objArrA);
                    if (linkedListB.size() > 0) {
                        dlVar.a(linkedListB.get(0));
                        return;
                    }
                    return;
                }
                if (obj5 instanceof Method) {
                    dlVar.a((Method) obj5, objArrA);
                    return;
                }
            } else {
                if ((ec.a("005h'bhbicgca").equals(this.f36142p) || ec.a("011Bbe(cZdg>b)cd3d%ejbhbicgca").equals(this.f36142p)) && objArrA.length == 1 && (obj4 = objArrA[0]) != null) {
                    if (obj4 instanceof Class) {
                        clsArr = new Class[]{(Class) obj4};
                    } else {
                        if (!(obj4 instanceof List)) {
                            throw new NoSuchMethodException("method name: " + this.f36142p + " at line: " + this.f36128b + "(" + this.f36129c + ")");
                        }
                        List list = (List) obj4;
                        clsArr = (Class[]) list.toArray(new Class[list.size()]);
                    }
                    dlVar.a(dlVar.a(obj, ec.a("005hUbhbicgca").equals(this.f36142p), clsArr));
                    return;
                }
                if ("iterator".equals(this.f36142p) && objArrA.length == 0) {
                    dlVar.a(map.entrySet().iterator());
                    return;
                } else if ("toJson".equals(this.f36142p) && objArrA.length == 0) {
                    dlVar.a(Class.forName("org.json.JSONObject").getDeclaredConstructor(Map.class).newInstance(obj));
                    return;
                }
            }
        } else if (obj instanceof ds) {
            ds dsVar2 = (ds) obj;
            if (ec.a("004gdUdg0g").equals(this.f36142p)) {
                dlVar.a(dsVar2.a(objArrA));
                return;
            } else if (ec.a("008a'bebhbhcabgXc9ch").equals(this.f36142p)) {
                dlVar.a(dsVar2.a(dlVar, this.f36128b, this.f36129c));
                return;
            }
        } else if (obj instanceof Method) {
            if (ec.a("004gd0dg@g").equals(this.f36142p)) {
                ds.a aVar = new ds.a();
                dl dlVarB = dlVar.b();
                try {
                    dlVarB.a((Method) obj, objArrA);
                    aVar.f36160b = dlVarB.a();
                } catch (Throwable th2) {
                    aVar.f36159a = th2;
                }
                dlVar.a(aVar);
                return;
            }
            if (ec.a("013Gdg dg^db.aad_dgdgbgddSed").equals(this.f36142p) && objArrA.length == 1) {
                ((Method) obj).setAccessible(((Boolean) objArrA[0]).booleanValue());
                return;
            }
        } else if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            int size = collection.size();
            if ("toArray".equals(this.f36142p) && objArrA.length == 1 && (obj3 = objArrA[0]) != null && (obj3 instanceof Class)) {
                Object objNewInstance = Array.newInstance((Class<?>) obj3, size);
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Array.set(objNewInstance, i10, it.next());
                    i10++;
                }
                dlVar.a(objNewInstance);
                return;
            }
        } else if (obj.getClass().isArray()) {
            if ("iterator".equals(this.f36142p) && objArrA.length == 0) {
                ArrayList arrayList = new ArrayList();
                int length = Array.getLength(obj);
                while (i10 < length) {
                    arrayList.add(Array.get(obj, i10));
                    i10++;
                }
                dlVar.a(arrayList.iterator());
                return;
            }
            if ("toList".equals(this.f36142p) && objArrA.length == 0) {
                ArrayList arrayList2 = new ArrayList();
                int length2 = Array.getLength(obj);
                while (i10 < length2) {
                    arrayList2.add(Array.get(obj, i10));
                    i10++;
                }
                dlVar.a(arrayList2);
                return;
            }
            if (obj.getClass().getComponentType() == Byte.TYPE) {
                if (ec.a("0038bdbafg").equals(this.f36142p) && objArrA.length == 0) {
                    byte[] bArr2 = (byte[]) obj;
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2, 0, bArr2.length);
                    Object objA = a(byteArrayInputStream);
                    byteArrayInputStream.close();
                    dlVar.a(objA);
                    return;
                }
                if ("hex".equals(this.f36142p) && objArrA.length == 0) {
                    dlVar.a(a((byte[]) obj));
                    return;
                } else if ("sha".equals(this.f36142p) && objArrA.length == 1) {
                    MessageDigest messageDigest = MessageDigest.getInstance((String) objArrA[0]);
                    messageDigest.update((byte[]) obj);
                    dlVar.a(messageDigest.digest());
                    return;
                }
            }
        } else if (Iterator.class.isAssignableFrom(obj.getClass())) {
            if ("hasNext".equals(this.f36142p)) {
                dlVar.a(Boolean.valueOf(((Iterator) obj).hasNext()));
                return;
            } else if ("next".equals(this.f36142p)) {
                dlVar.a(((Iterator) obj).next());
                return;
            } else if ("remove".equals(this.f36142p)) {
                ((Iterator) obj).remove();
                return;
            }
        } else if (obj instanceof ct.a) {
            if ("hasNext".equals(this.f36142p) && objArrA.length == 0) {
                dlVar.a(Boolean.valueOf(((ct.a) obj).a()));
                return;
            } else if ("next".equals(this.f36142p) && objArrA.length == 0) {
                dlVar.a(((ct.a) obj).b());
                return;
            }
        } else if (obj instanceof ct) {
            if ("iterator".equals(this.f36142p) && objArrA.length == 0) {
                dlVar.a(((ct) obj).a());
                return;
            }
            if ("isInRange".equals(this.f36142p) && objArrA.length == 1) {
                dlVar.a(Boolean.valueOf(((ct) obj).a((Number) objArrA[0])));
                return;
            }
            if ("contains".equals(this.f36142p) && objArrA.length == 1) {
                dlVar.a(Boolean.valueOf(((ct) obj).b((Number) objArrA[0])));
                return;
            } else if ("boundary".equals(this.f36142p) && objArrA.length == 0) {
                dlVar.a(((ct) obj).b());
                return;
            }
        } else if (obj instanceof String) {
            if ("getBytes".equals(this.f36142p)) {
                if (objArrA.length == 0) {
                    dlVar.a(((String) obj).getBytes());
                    return;
                } else if (objArrA.length == 1) {
                    Object obj6 = objArrA[0];
                    if (obj6 instanceof String) {
                        dlVar.a(((String) obj).getBytes((String) obj6));
                        return;
                    }
                }
            } else if ("input".equals(this.f36142p)) {
                if (objArrA.length == 0) {
                    dlVar.a(new FileInputStream((String) obj));
                    return;
                } else if (objArrA.length == 1 && (objArrA[0] instanceof ds)) {
                    FileInputStream fileInputStream = new FileInputStream((String) obj);
                    ((ds) objArrA[0]).b(fileInputStream);
                    fileInputStream.close();
                    return;
                }
            } else if (!"output".equals(this.f36142p)) {
                File file = null;
                String strValueOf2 = null;
                String strValueOf3 = null;
                FileInputStream fileInputStream2 = null;
                arrayList = null;
                Collection arrayList3 = null;
                file = null;
                if (ec.a("012@bhJdbPbaeabhbibdeabg;ed").equals(this.f36142p)) {
                    if (objArrA.length == 0) {
                        strValueOf2 = "utf-8";
                    } else if (objArrA.length == 1) {
                        strValueOf2 = String.valueOf(objArrA[0]);
                    }
                    if (strValueOf2 != null) {
                        FileInputStream fileInputStream3 = new FileInputStream((String) obj);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr3 = new byte[4096];
                        while (true) {
                            int i11 = fileInputStream3.read(bArr3);
                            if (i11 == -1) {
                                fileInputStream3.close();
                                byteArrayOutputStream.flush();
                                byteArrayOutputStream.close();
                                dlVar.a(new String(byteArrayOutputStream.toByteArray(), strValueOf2));
                                return;
                            }
                            byteArrayOutputStream.write(bArr3, 0, i11);
                        }
                    }
                } else if (ec.a("011Cdebhbg(gd[dabieabgZed").equals(this.f36142p)) {
                    if (objArrA.length == 1) {
                        strValueOf3 = String.valueOf(objArrA[0]);
                        strValueOf = "utf-8";
                    } else if (objArrA.length == 2) {
                        strValueOf3 = String.valueOf(objArrA[0]);
                        strValueOf = String.valueOf(objArrA[1]);
                    } else {
                        strValueOf = null;
                    }
                    if (strValueOf3 != null) {
                        FileOutputStream fileOutputStream = new FileOutputStream(strValueOf3);
                        fileOutputStream.write(((String) obj).getBytes(strValueOf));
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return;
                    }
                } else if (ec.a("009Ybh9dbEbadcbgEcd0dg").equals(this.f36142p)) {
                    String str = "utf-8";
                    if (objArrA.length == 0) {
                        dsVar = null;
                        fileInputStream2 = new FileInputStream((String) obj);
                    } else if (objArrA.length == 1) {
                        Object obj7 = objArrA[0];
                        if (obj7 instanceof String) {
                            fileInputStream2 = new FileInputStream((String) obj);
                            str = (String) objArrA[0];
                            dsVar = null;
                        } else if (obj7 instanceof ds) {
                            fileInputStream2 = new FileInputStream((String) obj);
                            obj2 = objArrA[0];
                            dsVar = (ds) obj2;
                        } else {
                            dsVar = null;
                        }
                    } else if (objArrA.length == 2 && (objArrA[0] instanceof String) && (objArrA[1] instanceof ds)) {
                        fileInputStream2 = new FileInputStream((String) obj);
                        str = (String) objArrA[0];
                        obj2 = objArrA[1];
                        dsVar = (ds) obj2;
                    } else {
                        dsVar = null;
                    }
                    if (fileInputStream2 != null) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2, str));
                        String line = bufferedReader.readLine();
                        if (dsVar == null) {
                            ArrayList arrayList4 = new ArrayList();
                            while (line != null) {
                                arrayList4.add(line);
                                line = bufferedReader.readLine();
                            }
                            dlVar.a(arrayList4);
                        } else {
                            while (line != null) {
                                dsVar.b(line);
                                line = bufferedReader.readLine();
                            }
                        }
                        bufferedReader.close();
                        return;
                    }
                } else if (ec.a("010Ydebhbg5gdOdcbgDcdLdg").equals(this.f36142p)) {
                    String str2 = "utf-8";
                    if (objArrA.length >= 1) {
                        if (objArrA.length == 2) {
                            Object obj8 = objArrA[1];
                            if (obj8 instanceof String) {
                                str2 = (String) obj8;
                            }
                        }
                        Object obj9 = objArrA[0];
                        if (obj9 instanceof String) {
                            arrayList3 = new ArrayList();
                            arrayList3.add(objArrA[0]);
                        } else if (obj9 instanceof Collection) {
                            arrayList3 = (Collection) obj9;
                        } else if (obj9.getClass().isArray()) {
                            arrayList3 = new ArrayList();
                            int length3 = Array.getLength(objArrA[0]);
                            for (int i12 = 0; i12 < length3; i12++) {
                                arrayList3.add(Array.get(objArrA[0], i12));
                            }
                        }
                    }
                    if (arrayList3 != null) {
                        FileOutputStream fileOutputStream2 = new FileOutputStream((String) obj);
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            fileOutputStream2.write((it2.next() + "\r\n").getBytes(str2));
                        }
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        return;
                    }
                } else if (ec.a("004d>cg.da").equals(this.f36142p)) {
                    if (objArrA.length == 0) {
                        dlVar.a(Runtime.getRuntime().exec((String) obj));
                        return;
                    }
                    if (objArrA.length == 1 || objArrA.length == 2) {
                        Object obj10 = objArrA[0];
                        if (obj10 instanceof String[]) {
                            strArr = (String[]) obj10;
                        } else if (obj10 instanceof List) {
                            List list2 = (List) obj10;
                            int size2 = list2.size();
                            String[] strArr2 = new String[size2];
                            for (int i13 = 0; i13 < size2; i13++) {
                                Object obj11 = list2.get(i13);
                                strArr2[i13] = obj11 == null ? null : String.valueOf(obj11);
                            }
                            strArr = strArr2;
                        } else {
                            strArr = null;
                        }
                        if (objArrA.length == 2) {
                            Object obj12 = objArrA[1];
                            if (obj12 instanceof File) {
                                file = (File) obj12;
                            }
                        }
                        if (strArr != null) {
                            dlVar.a(Runtime.getRuntime().exec((String) obj, strArr, file));
                            return;
                        }
                    }
                } else if (ec.a("007Fcdbhbibddi.d%cg").equals(this.f36142p) && objArrA.length == 0) {
                    String str3 = (String) obj;
                    int length4 = str3.length();
                    if (length4 % 2 == 1) {
                        length4++;
                        bArr = new byte[length4 / 2];
                        str3 = "0" + str3;
                    } else {
                        bArr = new byte[length4 / 2];
                    }
                    int i14 = 0;
                    while (i10 < length4) {
                        int i15 = i10 + 2;
                        bArr[i14] = (byte) Integer.parseInt(str3.substring(i10, i15), 16);
                        i14++;
                        i10 = i15;
                    }
                    dlVar.a(bArr);
                    return;
                }
            } else if (objArrA.length == 0) {
                dlVar.a(new FileOutputStream((String) obj));
                return;
            } else if (objArrA.length == 1 && (objArrA[0] instanceof ds)) {
                FileOutputStream fileOutputStream3 = new FileOutputStream((String) obj);
                ((ds) objArrA[0]).b(fileOutputStream3);
                fileOutputStream3.flush();
                fileOutputStream3.close();
                return;
            }
        } else if (obj instanceof InputStream) {
            if (ec.a("017g0bidjDbgb5cc^ch'be'g9cjAg;bhHdbEbd").equals(this.f36142p) && objArrA.length == 0) {
                dlVar.a(new DataInputStream((InputStream) obj));
                return;
            }
            if (ec.a("021g:bidhbecdcdDd8bh@d3baccDchKbe3g6cj1g3bhIdb7bd").equals(this.f36142p) && objArrA.length == 0) {
                dlVar.a(new BufferedInputStream((InputStream) obj));
                return;
            }
            if (ec.a("017g(bigbghccejcc:chQbe<gAcjWgJbh[db'bd").equals(this.f36142p) && objArrA.length == 0) {
                dlVar.a(new GZIPInputStream((InputStream) obj));
                return;
            } else if (ec.a("019gObiefddfe'dag*cc8ch*be@g%cj^gTbhHdb+bd").equals(this.f36142p) && objArrA.length == 0) {
                dlVar.a(new ObjectInputStream((InputStream) obj));
                return;
            } else if (ec.a("003Rbdbafg").equals(this.f36142p) && objArrA.length == 0) {
                a((InputStream) obj);
            }
        } else if (obj instanceof OutputStream) {
            if (ec.a("018g^bidj*bgb^efbeZghXbe3g>cjZg.bhKdb$bd").equals(this.f36142p) && objArrA.length == 0) {
                dlVar.a(new DataOutputStream((OutputStream) obj));
                return;
            }
            if (ec.a("022gUbidhbecdcdUd.bhVdBbaefbeHghZbe!g_cjHg6bh^dbHbd").equals(this.f36142p) && objArrA.length == 0) {
                dlVar.a(new BufferedOutputStream((OutputStream) obj));
                return;
            }
            if (ec.a("018gCbigbghccejefbe;gh?beUg_cj;g9bhVdbNbd").equals(this.f36142p) && objArrA.length == 0) {
                dlVar.a(new GZIPOutputStream((OutputStream) obj));
                return;
            } else if (ec.a("020g1biefddfe2dag^efbe*ghLbe]gKcj4g-bh!dbDbd").equals(this.f36142p) && objArrA.length == 0) {
                dlVar.a(new ObjectOutputStream((OutputStream) obj));
                return;
            }
        } else if (obj instanceof Class) {
            if (ec.a("006]bgbdIhUbibhRg").equals(this.f36142p)) {
                if (objArrA.length == 0) {
                    Class<?> cls = (Class) obj;
                    dlVar.a(cls.getSimpleName(), cls);
                    return;
                } else if (objArrA.length == 1) {
                    Object obj13 = objArrA[0];
                    if (obj13 instanceof String) {
                        dlVar.a((String) obj13, (Class<?>) obj);
                        return;
                    }
                }
            }
        } else if (obj instanceof Throwable) {
            if (ec.a("005gfLbhbide").equals(this.f36142p) && objArrA.length == 0) {
                throw ((Throwable) obj);
            }
        } else if (AccessibleObject.class.isAssignableFrom(obj.getClass()) && ec.a("0133dg4dgBdb<aad-dgdgbgdd)ed").equals(this.f36142p) && objArrA.length == 1) {
            ((AccessibleObject) obj).setAccessible(((Boolean) objArrA[0]).booleanValue());
            return;
        }
        if (ec.a("004eXbiPaYcf").equals(this.f36142p) && objArrA.length > 0 && (objArrA[0] instanceof ds)) {
            synchronized (obj) {
                ds dsVar3 = (ds) objArrA[0];
                int length5 = objArrA.length - 1;
                Object[] objArr2 = new Object[length5];
                if (objArrA.length > 1) {
                    System.arraycopy(objArrA, 1, objArr2, 0, length5);
                }
                LinkedList<Object> linkedListB2 = dsVar3.b(objArr2);
                if (!linkedListB2.isEmpty()) {
                    dlVar.a(linkedListB2.get(0));
                }
            }
            return;
        }
        Class<?> superclass = obj.getClass();
        if (dlVar.g().a(obj, superclass, this.f36142p, objArr, dlVar)) {
            return;
        }
        for (Class<?> superclass2 = superclass; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
            boolean[][] zArr2 = new boolean[2][];
            Method methodA = dlVar.g().a(superclass2, this.f36142p, false, objArr, zArr2);
            if (methodA != null) {
                if (!zArr2[1][0]) {
                    objArrA = dlVar.g().a(dlVar, methodA.getParameterTypes(), objArrA, zArr2[0]);
                }
                methodA.setAccessible(true);
                if (methodA.getReturnType() == Void.TYPE) {
                    methodA.invoke(obj, objArrA);
                    return;
                } else {
                    dlVar.a(methodA.invoke(obj, objArrA));
                    return;
                }
            }
        }
        while (superclass != null) {
            for (Method method : superclass.getDeclaredMethods()) {
                if (method.getName().equals(this.f36142p) && !Modifier.isStatic(method.getModifiers()) && (zArrA = dlVar.g().a((parameterTypes = method.getParameterTypes()), objArrA, (zArr = new boolean[1]))) != null) {
                    if (!zArr[0]) {
                        objArrA = dlVar.g().a(dlVar, parameterTypes, objArrA, zArrA);
                    }
                    method.setAccessible(true);
                    if (method.getReturnType() == Void.TYPE) {
                        method.invoke(obj, objArrA);
                        return;
                    } else {
                        dlVar.a(method.invoke(obj, objArrA));
                        return;
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
        throw new NoSuchMethodException("method name: " + this.f36142p + " at line: " + this.f36128b + "(" + this.f36129c + ")");
    }

    void b(Class<?> cls, dl dlVar) throws Throwable {
        Field declaredField;
        Object objA = dlVar.a();
        while (cls != null) {
            try {
                declaredField = cls.getDeclaredField(this.f36138l);
            } catch (Throwable unused) {
                declaredField = null;
            }
            if (declaredField != null && Modifier.isStatic(declaredField.getModifiers())) {
                declaredField.setAccessible(true);
                declaredField.set(null, objA);
                return;
            }
            cls = cls.getSuperclass();
        }
        dr drVar = new dr(14);
        drVar.f36128b = this.f36128b;
        drVar.f36129c = this.f36129c;
        drVar.f36140n = this.f36140n;
        drVar.f36142p = "set" + Character.toUpperCase(this.f36138l.charAt(0)) + this.f36138l.substring(1);
        drVar.f36135i = 1;
        drVar.a(cls, new Object[]{objA}, dlVar);
    }

    void b(Object obj, dl dlVar) throws Throwable {
        Object objA = dlVar.a();
        if (obj instanceof Map) {
            ((Map) obj).put(this.f36138l, objA);
            return;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            Field declaredField = null;
            try {
                declaredField = superclass.getDeclaredField(this.f36138l);
            } catch (Throwable unused) {
            }
            if (declaredField != null && !Modifier.isStatic(declaredField.getModifiers())) {
                declaredField.setAccessible(true);
                declaredField.set(obj, objA);
                return;
            }
        }
        dr drVar = new dr(12);
        drVar.f36128b = this.f36128b;
        drVar.f36129c = this.f36129c;
        drVar.f36142p = "set" + Character.toUpperCase(this.f36138l.charAt(0)) + this.f36138l.substring(1);
        drVar.f36135i = 1;
        drVar.a(obj, new Object[]{objA}, dlVar);
    }
}
