package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.g.b;

/* JADX INFO: compiled from: FieldSet.java */
/* JADX INFO: loaded from: classes5.dex */
public final class g<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g f127347d = new g(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f127349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f127350c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s<FieldDescriptorType, Object> f127348a = s.p(16);

    /* JADX INFO: compiled from: FieldSet.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f127351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f127352b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f127352b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f127352b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f127352b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f127352b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f127352b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f127352b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f127352b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f127352b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f127352b[WireFormat.FieldType.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f127352b[WireFormat.FieldType.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f127352b[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f127352b[WireFormat.FieldType.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f127352b[WireFormat.FieldType.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f127352b[WireFormat.FieldType.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f127352b[WireFormat.FieldType.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f127352b[WireFormat.FieldType.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f127352b[WireFormat.FieldType.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f127352b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f127351a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f127351a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f127351a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f127351a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f127351a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f127351a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f127351a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f127351a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f127351a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: FieldSet.java */
    public interface b<T extends b<T>> extends Comparable<T> {
        WireFormat.FieldType E();

        WireFormat.JavaType F();

        boolean H();

        n.a Q0(n.a aVar, n nVar);

        int getNumber();

        boolean isPacked();
    }

    private g() {
    }

    private g(boolean z10) {
        q();
    }

    private Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int d(WireFormat.FieldType fieldType, int i10, Object obj) {
        int iD = CodedOutputStream.D(i10);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iD *= 2;
        }
        return iD + e(fieldType, obj);
    }

    private static int e(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f127352b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.g(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.q(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.F(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.p(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.k(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.j(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.b(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.C((String) obj);
            case 10:
                return obj instanceof d ? CodedOutputStream.e((d) obj) : CodedOutputStream.c((byte[]) obj);
            case 11:
                return CodedOutputStream.E(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.x(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.z(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.B(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.n((n) obj);
            case 17:
                return obj instanceof i ? CodedOutputStream.r((i) obj) : CodedOutputStream.t((n) obj);
            case 18:
                return obj instanceof h.a ? CodedOutputStream.i(((h.a) obj).getNumber()) : CodedOutputStream.i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        WireFormat.FieldType fieldTypeE = bVar.E();
        int number = bVar.getNumber();
        if (!bVar.H()) {
            return d(fieldTypeE, number, obj);
        }
        int iD = 0;
        if (bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iD += e(fieldTypeE, it.next());
            }
            return CodedOutputStream.D(number) + iD + CodedOutputStream.v(iD);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iD += d(fieldTypeE, number, it2.next());
        }
        return iD;
    }

    public static <T extends b<T>> g<T> g() {
        return f127347d;
    }

    static int l(WireFormat.FieldType fieldType, boolean z10) {
        if (z10) {
            return 2;
        }
        return fieldType.getWireType();
    }

    private boolean o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.F() == WireFormat.JavaType.MESSAGE) {
            if (key.H()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((n) it.next()).l()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof n)) {
                    if (value instanceof i) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((n) value).l()) {
                    return false;
                }
            }
        }
        return true;
    }

    private void s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof i) {
            value = ((i) value).e();
        }
        if (key.H()) {
            Object objH = h(key);
            if (objH == null) {
                objH = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objH).add(c(it.next()));
            }
            this.f127348a.put(key, objH);
            return;
        }
        if (key.F() != WireFormat.JavaType.MESSAGE) {
            this.f127348a.put(key, c(value));
            return;
        }
        Object objH2 = h(key);
        if (objH2 == null) {
            this.f127348a.put(key, c(value));
        } else {
            this.f127348a.put(key, key.Q0(((n) objH2).t(), (n) value).build());
        }
    }

    public static <T extends b<T>> g<T> t() {
        return new g<>();
    }

    public static Object u(e eVar, WireFormat.FieldType fieldType, boolean z10) throws IOException {
        switch (a.f127352b[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(eVar.m());
            case 2:
                return Float.valueOf(eVar.q());
            case 3:
                return Long.valueOf(eVar.t());
            case 4:
                return Long.valueOf(eVar.M());
            case 5:
                return Integer.valueOf(eVar.s());
            case 6:
                return Long.valueOf(eVar.p());
            case 7:
                return Integer.valueOf(eVar.o());
            case 8:
                return Boolean.valueOf(eVar.k());
            case 9:
                return z10 ? eVar.J() : eVar.I();
            case 10:
                return eVar.l();
            case 11:
                return Integer.valueOf(eVar.L());
            case 12:
                return Integer.valueOf(eVar.E());
            case 13:
                return Long.valueOf(eVar.F());
            case 14:
                return Integer.valueOf(eVar.G());
            case 15:
                return Long.valueOf(eVar.H());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    private static void w(WireFormat.FieldType fieldType, Object obj) {
        obj.getClass();
        boolean z10 = true;
        boolean z11 = false;
        switch (a.f127351a[fieldType.getJavaType().ordinal()]) {
            case 1:
                z11 = obj instanceof Integer;
                break;
            case 2:
                z11 = obj instanceof Long;
                break;
            case 3:
                z11 = obj instanceof Float;
                break;
            case 4:
                z11 = obj instanceof Double;
                break;
            case 5:
                z11 = obj instanceof Boolean;
                break;
            case 6:
                z11 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof d) && !(obj instanceof byte[])) {
                    z10 = false;
                }
                z11 = z10;
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof h.a)) {
                    z10 = false;
                }
                z11 = z10;
                break;
            case 9:
                if (!(obj instanceof n) && !(obj instanceof i)) {
                    z10 = false;
                }
                z11 = z10;
                break;
        }
        if (!z11) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private static void x(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i10, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.Y(i10, (n) obj);
        } else {
            codedOutputStream.w0(i10, l(fieldType, false));
            y(codedOutputStream, fieldType, obj);
        }
    }

    private static void y(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f127352b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.R(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.X(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.c0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.z0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.b0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.V(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.U(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.M(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.v0((String) obj);
                break;
            case 10:
                if (!(obj instanceof d)) {
                    codedOutputStream.N((byte[]) obj);
                } else {
                    codedOutputStream.P((d) obj);
                }
                break;
            case 11:
                codedOutputStream.y0(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.q0(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.r0(((Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.s0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.u0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.Z((n) obj);
                break;
            case 17:
                codedOutputStream.e0((n) obj);
                break;
            case 18:
                if (!(obj instanceof h.a)) {
                    codedOutputStream.T(((Integer) obj).intValue());
                } else {
                    codedOutputStream.T(((h.a) obj).getNumber());
                }
                break;
        }
    }

    public static void z(b<?> bVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType fieldTypeE = bVar.E();
        int number = bVar.getNumber();
        if (!bVar.H()) {
            if (obj instanceof i) {
                x(codedOutputStream, fieldTypeE, number, ((i) obj).e());
                return;
            } else {
                x(codedOutputStream, fieldTypeE, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!bVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x(codedOutputStream, fieldTypeE, number, it.next());
            }
            return;
        }
        codedOutputStream.w0(number, 2);
        int iE = 0;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iE += e(fieldTypeE, it2.next());
        }
        codedOutputStream.o0(iE);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            y(codedOutputStream, fieldTypeE, it3.next());
        }
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List arrayList;
        if (!fielddescriptortype.H()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        w(fielddescriptortype.E(), obj);
        Object objH = h(fielddescriptortype);
        if (objH == null) {
            arrayList = new ArrayList();
            this.f127348a.put(fielddescriptortype, arrayList);
        } else {
            arrayList = (List) objH;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g<FieldDescriptorType> clone() {
        g<FieldDescriptorType> gVarT = t();
        for (int i10 = 0; i10 < this.f127348a.i(); i10++) {
            Map.Entry<K, Object> entryH = this.f127348a.h(i10);
            gVarT.v((b) entryH.getKey(), entryH.getValue());
        }
        Iterator it = this.f127348a.j().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            gVarT.v((b) entry.getKey(), entry.getValue());
        }
        gVarT.f127350c = this.f127350c;
        return gVarT;
    }

    public Object h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f127348a.get(fielddescriptortype);
        return obj instanceof i ? ((i) obj).e() : obj;
    }

    public Object i(FieldDescriptorType fielddescriptortype, int i10) {
        if (!fielddescriptortype.H()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(fielddescriptortype);
        if (objH != null) {
            return ((List) objH).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int j(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.H()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(fielddescriptortype);
        if (objH == null) {
            return 0;
        }
        return ((List) objH).size();
    }

    public int k() {
        int iF = 0;
        for (int i10 = 0; i10 < this.f127348a.i(); i10++) {
            Map.Entry<K, Object> entryH = this.f127348a.h(i10);
            iF += f((b) entryH.getKey(), entryH.getValue());
        }
        Iterator it = this.f127348a.j().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean m(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.H()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f127348a.get(fielddescriptortype) != null;
    }

    public boolean n() {
        for (int i10 = 0; i10 < this.f127348a.i(); i10++) {
            if (!o(this.f127348a.h(i10))) {
                return false;
            }
        }
        Iterator it = this.f127348a.j().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> p() {
        return this.f127350c ? new i.c(this.f127348a.entrySet().iterator()) : this.f127348a.entrySet().iterator();
    }

    public void q() {
        if (this.f127349b) {
            return;
        }
        this.f127348a.n();
        this.f127349b = true;
    }

    public void r(g<FieldDescriptorType> gVar) {
        for (int i10 = 0; i10 < gVar.f127348a.i(); i10++) {
            s(gVar.f127348a.h(i10));
        }
        Iterator it = gVar.f127348a.j().iterator();
        while (it.hasNext()) {
            s((Map.Entry) it.next());
        }
    }

    public void v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.H()) {
            w(fielddescriptortype.E(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w(fielddescriptortype.E(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof i) {
            this.f127350c = true;
        }
        this.f127348a.put(fielddescriptortype, obj);
    }
}
