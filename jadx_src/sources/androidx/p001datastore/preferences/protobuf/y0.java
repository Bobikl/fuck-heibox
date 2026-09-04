package androidx.p001datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.y0.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: FieldSet.java */
/* JADX INFO: loaded from: classes6.dex */
public final class y0<T extends c<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f22723d = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final y0 f22724e = new y0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a3<T, Object> f22725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22727c;

    /* JADX INFO: compiled from: FieldSet.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f22729b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f22729b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22729b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22729b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22729b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22729b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22729b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22729b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22729b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22729b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22729b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22729b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22729b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22729b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22729b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22729b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22729b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22729b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22729b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f22728a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f22728a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f22728a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f22728a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f22728a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f22728a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f22728a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f22728a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f22728a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: FieldSet.java */
    public static final class b<T extends c<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a3<T, Object> f22730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f22731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f22733d;

        private b() {
            this(a3.w(16));
        }

        private b(a3<T, Object> a3Var) {
            this.f22730a = a3Var;
            this.f22732c = true;
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private void d() {
            if (this.f22732c) {
                return;
            }
            this.f22730a = y0.l(this.f22730a, true);
            this.f22732c = true;
        }

        public static <T extends c<T>> b<T> e(y0<T> y0Var) {
            b<T> bVar = new b<>(y0.l(((y0) y0Var).f22725a, true));
            ((b) bVar).f22731b = ((y0) y0Var).f22727c;
            return bVar;
        }

        private void o(Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof k1) {
                value = ((k1) value).p();
            }
            if (key.H()) {
                Object objG = g(key);
                if (objG == null) {
                    objG = new ArrayList();
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    ((List) objG).add(y0.n(it.next()));
                }
                this.f22730a.put(key, objG);
                return;
            }
            if (key.F() != WireFormat.JavaType.MESSAGE) {
                this.f22730a.put(key, y0.n(value));
                return;
            }
            Object objG2 = g(key);
            if (objG2 == null) {
                this.f22730a.put(key, y0.n(value));
            } else if (objG2 instanceof z1.a) {
                key.T((z1.a) objG2, (z1) value);
            } else {
                this.f22730a.put(key, key.T(((z1) objG2).t(), (z1) value).build());
            }
        }

        private static Object p(Object obj) {
            return obj instanceof z1.a ? ((z1.a) obj).build() : obj;
        }

        private static <T extends c<T>> Object q(T t10, Object obj) {
            if (obj == null || t10.F() != WireFormat.JavaType.MESSAGE) {
                return obj;
            }
            if (!t10.H()) {
                return p(obj);
            }
            if (!(obj instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            List arrayList = (List) obj;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj2 = arrayList.get(i10);
                Object objP = p(obj2);
                if (objP != obj2) {
                    if (arrayList == obj) {
                        arrayList = new ArrayList(arrayList);
                    }
                    arrayList.set(i10, objP);
                }
            }
            return arrayList;
        }

        private static <T extends c<T>> void r(a3<T, Object> a3Var) {
            for (int i10 = 0; i10 < a3Var.k(); i10++) {
                s(a3Var.j(i10));
            }
            Iterator it = a3Var.n().iterator();
            while (it.hasNext()) {
                s((Map.Entry) it.next());
            }
        }

        private static <T extends c<T>> void s(Map.Entry<T, Object> entry) {
            entry.setValue(q(entry.getKey(), entry.getValue()));
        }

        private static void v(WireFormat.FieldType fieldType, Object obj) {
            if (y0.G(fieldType, obj)) {
                return;
            }
            if (fieldType.getJavaType() != WireFormat.JavaType.MESSAGE || !(obj instanceof z1.a)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }

        public void a(T t10, Object obj) {
            List arrayList;
            d();
            if (!t10.H()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.f22733d = this.f22733d || (obj instanceof z1.a);
            v(t10.E(), obj);
            Object objG = g(t10);
            if (objG == null) {
                arrayList = new ArrayList();
                this.f22730a.put(t10, arrayList);
            } else {
                arrayList = (List) objG;
            }
            arrayList.add(obj);
        }

        public y0<T> b() {
            if (this.f22730a.isEmpty()) {
                return y0.s();
            }
            this.f22732c = false;
            a3<T, Object> a3VarL = this.f22730a;
            if (this.f22733d) {
                a3VarL = y0.l(a3VarL, false);
                r(a3VarL);
            }
            y0<T> y0Var = new y0<>(a3VarL, null);
            ((y0) y0Var).f22727c = this.f22731b;
            return y0Var;
        }

        public void c(T t10) {
            d();
            this.f22730a.remove(t10);
            if (this.f22730a.isEmpty()) {
                this.f22731b = false;
            }
        }

        public Map<T, Object> f() {
            if (!this.f22731b) {
                return this.f22730a.u() ? this.f22730a : Collections.unmodifiableMap(this.f22730a);
            }
            a3 a3VarL = y0.l(this.f22730a, false);
            if (this.f22730a.u()) {
                a3VarL.v();
            } else {
                r(a3VarL);
            }
            return a3VarL;
        }

        public Object g(T t10) {
            return q(t10, h(t10));
        }

        Object h(T t10) {
            Object obj = this.f22730a.get(t10);
            return obj instanceof k1 ? ((k1) obj).p() : obj;
        }

        public Object i(T t10, int i10) {
            if (this.f22733d) {
                d();
            }
            return p(j(t10, i10));
        }

        Object j(T t10, int i10) {
            if (!t10.H()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objH = h(t10);
            if (objH != null) {
                return ((List) objH).get(i10);
            }
            throw new IndexOutOfBoundsException();
        }

        public int k(T t10) {
            if (!t10.H()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objG = g(t10);
            if (objG == null) {
                return 0;
            }
            return ((List) objG).size();
        }

        public boolean l(T t10) {
            if (t10.H()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.f22730a.get(t10) != null;
        }

        public boolean m() {
            for (int i10 = 0; i10 < this.f22730a.k(); i10++) {
                if (!y0.F(this.f22730a.j(i10))) {
                    return false;
                }
            }
            Iterator it = this.f22730a.n().iterator();
            while (it.hasNext()) {
                if (!y0.F((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void n(y0<T> y0Var) {
            d();
            for (int i10 = 0; i10 < ((y0) y0Var).f22725a.k(); i10++) {
                o(((y0) y0Var).f22725a.j(i10));
            }
            Iterator it = ((y0) y0Var).f22725a.n().iterator();
            while (it.hasNext()) {
                o((Map.Entry) it.next());
            }
        }

        public void t(T t10, Object obj) {
            d();
            if (!t10.H()) {
                v(t10.E(), obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    v(t10.E(), obj2);
                    this.f22733d = this.f22733d || (obj2 instanceof z1.a);
                }
                obj = arrayList;
            }
            if (obj instanceof k1) {
                this.f22731b = true;
            }
            this.f22733d = this.f22733d || (obj instanceof z1.a);
            this.f22730a.put(t10, obj);
        }

        public void u(T t10, int i10, Object obj) {
            d();
            if (!t10.H()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.f22733d = this.f22733d || (obj instanceof z1.a);
            Object objG = g(t10);
            if (objG == null) {
                throw new IndexOutOfBoundsException();
            }
            v(t10.E(), obj);
            ((List) objG).set(i10, obj);
        }
    }

    /* JADX INFO: compiled from: FieldSet.java */
    public interface c<T extends c<T>> extends Comparable<T> {
        WireFormat.FieldType E();

        WireFormat.JavaType F();

        i1.d<?> F0();

        boolean H();

        z1.a T(z1.a aVar, z1 z1Var);

        int getNumber();

        boolean isPacked();
    }

    private y0() {
        this.f22725a = a3.w(16);
    }

    private y0(a3<T, Object> a3Var) {
        this.f22725a = a3Var;
        I();
    }

    /* synthetic */ y0(a3 a3Var, a aVar) {
        this(a3Var);
    }

    private y0(boolean z10) {
        this(a3.w(0));
        I();
    }

    static int A(WireFormat.FieldType fieldType, boolean z10) {
        if (z10) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c<T>> boolean F(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.F() == WireFormat.JavaType.MESSAGE) {
            if (key.H()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((z1) it.next()).l()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof z1)) {
                    if (value instanceof k1) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((z1) value).l()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean G(WireFormat.FieldType fieldType, Object obj) {
        i1.d(obj);
        switch (a.f22728a[fieldType.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof ByteString) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof i1.c);
            case 9:
                return (obj instanceof z1) || (obj instanceof k1);
            default:
                return false;
        }
    }

    private void K(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof k1) {
            value = ((k1) value).p();
        }
        if (key.H()) {
            Object objU = u(key);
            if (objU == null) {
                objU = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objU).add(n(it.next()));
            }
            this.f22725a.put(key, objU);
            return;
        }
        if (key.F() != WireFormat.JavaType.MESSAGE) {
            this.f22725a.put(key, n(value));
            return;
        }
        Object objU2 = u(key);
        if (objU2 == null) {
            this.f22725a.put(key, n(value));
        } else {
            this.f22725a.put(key, key.T(((z1) objU2).t(), (z1) value).build());
        }
    }

    public static <T extends c<T>> b<T> L() {
        return new b<>((a) null);
    }

    public static <T extends c<T>> y0<T> M() {
        return new y0<>();
    }

    public static Object N(w wVar, WireFormat.FieldType fieldType, boolean z10) throws IOException {
        return z10 ? WireFormat.d(wVar, fieldType, WireFormat.Utf8Validation.STRICT) : WireFormat.d(wVar, fieldType, WireFormat.Utf8Validation.LOOSE);
    }

    private void Q(WireFormat.FieldType fieldType, Object obj) {
        if (!G(fieldType, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void R(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i10, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.F1(i10, (z1) obj);
        } else {
            codedOutputStream.g2(i10, A(fieldType, false));
            S(codedOutputStream, fieldType, obj);
        }
    }

    static void S(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f22729b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.A1(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.E1(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.K1(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.i2(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.J1(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.D1(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.C1(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.t1(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.H1((z1) obj);
                break;
            case 10:
                codedOutputStream.N1((z1) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.f2((String) obj);
                } else {
                    codedOutputStream.z1((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.w1((byte[]) obj);
                } else {
                    codedOutputStream.z1((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.h2(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.b2(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.c2(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.d2(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.e2(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof i1.c)) {
                    codedOutputStream.B1(((Integer) obj).intValue());
                } else {
                    codedOutputStream.B1(((i1.c) obj).getNumber());
                }
                break;
        }
    }

    public static void T(c<?> cVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType fieldTypeE = cVar.E();
        int number = cVar.getNumber();
        if (!cVar.H()) {
            if (obj instanceof k1) {
                R(codedOutputStream, fieldTypeE, number, ((k1) obj).p());
                return;
            } else {
                R(codedOutputStream, fieldTypeE, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!cVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                R(codedOutputStream, fieldTypeE, number, it.next());
            }
            return;
        }
        codedOutputStream.g2(number, 2);
        int iP = 0;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iP += p(fieldTypeE, it2.next());
        }
        codedOutputStream.Z1(iP);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            S(codedOutputStream, fieldTypeE, it3.next());
        }
    }

    private void V(Map.Entry<T, Object> entry, CodedOutputStream codedOutputStream) throws IOException {
        T key = entry.getKey();
        if (key.F() != WireFormat.JavaType.MESSAGE || key.H() || key.isPacked()) {
            T(key, entry.getValue(), codedOutputStream);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof k1) {
            value = ((k1) value).p();
        }
        codedOutputStream.P1(entry.getKey().getNumber(), (z1) value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c<T>> a3<T, Object> l(a3<T, Object> a3Var, boolean z10) {
        a3<T, Object> a3VarW = a3.w(16);
        for (int i10 = 0; i10 < a3Var.k(); i10++) {
            m(a3VarW, a3Var.j(i10), z10);
        }
        Iterator it = a3Var.n().iterator();
        while (it.hasNext()) {
            m(a3VarW, (Map.Entry) it.next(), z10);
        }
        return a3VarW;
    }

    private static <T extends c<T>> void m(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z10) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof k1) {
            map.put(key, ((k1) value).p());
        } else if (z10 && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object n(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int o(WireFormat.FieldType fieldType, int i10, Object obj) {
        int iX0 = CodedOutputStream.X0(i10);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iX0 *= 2;
        }
        return iX0 + p(fieldType, obj);
    }

    static int p(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f22729b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.j0(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r0(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.z0(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.b1(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.x0(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.p0(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.n0(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.b0(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.u0((z1) obj);
            case 10:
                return obj instanceof k1 ? CodedOutputStream.C0((k1) obj) : CodedOutputStream.H0((z1) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.h0((ByteString) obj) : CodedOutputStream.W0((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.h0((ByteString) obj) : CodedOutputStream.d0((byte[]) obj);
            case 13:
                return CodedOutputStream.Z0(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.O0(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.Q0(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.S0(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.U0(((Long) obj).longValue());
            case 18:
                return obj instanceof i1.c ? CodedOutputStream.l0(((i1.c) obj).getNumber()) : CodedOutputStream.l0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int q(c<?> cVar, Object obj) {
        WireFormat.FieldType fieldTypeE = cVar.E();
        int number = cVar.getNumber();
        if (!cVar.H()) {
            return o(fieldTypeE, number, obj);
        }
        int iO = 0;
        if (cVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iO += p(fieldTypeE, it.next());
            }
            return CodedOutputStream.X0(number) + iO + CodedOutputStream.L0(iO);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iO += o(fieldTypeE, number, it2.next());
        }
        return iO;
    }

    public static <T extends c<T>> y0<T> s() {
        return f22724e;
    }

    private int w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.F() != WireFormat.JavaType.MESSAGE || key.H() || key.isPacked()) {
            return q(key, value);
        }
        return value instanceof k1 ? CodedOutputStream.A0(entry.getKey().getNumber(), (k1) value) : CodedOutputStream.E0(entry.getKey().getNumber(), (z1) value);
    }

    public boolean B(T t10) {
        if (t10.H()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f22725a.get(t10) != null;
    }

    boolean C() {
        return this.f22725a.isEmpty();
    }

    public boolean D() {
        return this.f22726b;
    }

    public boolean E() {
        for (int i10 = 0; i10 < this.f22725a.k(); i10++) {
            if (!F(this.f22725a.j(i10))) {
                return false;
            }
        }
        Iterator it = this.f22725a.n().iterator();
        while (it.hasNext()) {
            if (!F((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> H() {
        return this.f22727c ? new k1.c(this.f22725a.entrySet().iterator()) : this.f22725a.entrySet().iterator();
    }

    public void I() {
        if (this.f22726b) {
            return;
        }
        this.f22725a.v();
        this.f22726b = true;
    }

    public void J(y0<T> y0Var) {
        for (int i10 = 0; i10 < y0Var.f22725a.k(); i10++) {
            K(y0Var.f22725a.j(i10));
        }
        Iterator it = y0Var.f22725a.n().iterator();
        while (it.hasNext()) {
            K((Map.Entry) it.next());
        }
    }

    public void O(T t10, Object obj) {
        if (!t10.H()) {
            Q(t10.E(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Q(t10.E(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof k1) {
            this.f22727c = true;
        }
        this.f22725a.put(t10, obj);
    }

    public void P(T t10, int i10, Object obj) {
        if (!t10.H()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objU = u(t10);
        if (objU == null) {
            throw new IndexOutOfBoundsException();
        }
        Q(t10.E(), obj);
        ((List) objU).set(i10, obj);
    }

    public void U(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.f22725a.k(); i10++) {
            V(this.f22725a.j(i10), codedOutputStream);
        }
        Iterator it = this.f22725a.n().iterator();
        while (it.hasNext()) {
            V((Map.Entry) it.next(), codedOutputStream);
        }
    }

    public void W(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.f22725a.k(); i10++) {
            Map.Entry<K, Object> entryJ = this.f22725a.j(i10);
            T((c) entryJ.getKey(), entryJ.getValue(), codedOutputStream);
        }
        Iterator it = this.f22725a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            T((c) entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y0) {
            return this.f22725a.equals(((y0) obj).f22725a);
        }
        return false;
    }

    public void h(T t10, Object obj) {
        List arrayList;
        if (!t10.H()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        Q(t10.E(), obj);
        Object objU = u(t10);
        if (objU == null) {
            arrayList = new ArrayList();
            this.f22725a.put(t10, arrayList);
        } else {
            arrayList = (List) objU;
        }
        arrayList.add(obj);
    }

    public int hashCode() {
        return this.f22725a.hashCode();
    }

    public void i() {
        this.f22725a.clear();
        this.f22727c = false;
    }

    public void j(T t10) {
        this.f22725a.remove(t10);
        if (this.f22725a.isEmpty()) {
            this.f22727c = false;
        }
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public y0<T> clone() {
        y0<T> y0VarM = M();
        for (int i10 = 0; i10 < this.f22725a.k(); i10++) {
            Map.Entry<K, Object> entryJ = this.f22725a.j(i10);
            y0VarM.O((c) entryJ.getKey(), entryJ.getValue());
        }
        Iterator it = this.f22725a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            y0VarM.O((c) entry.getKey(), entry.getValue());
        }
        y0VarM.f22727c = this.f22727c;
        return y0VarM;
    }

    Iterator<Map.Entry<T, Object>> r() {
        return this.f22727c ? new k1.c(this.f22725a.h().iterator()) : this.f22725a.h().iterator();
    }

    public Map<T, Object> t() {
        if (!this.f22727c) {
            return this.f22725a.u() ? this.f22725a : Collections.unmodifiableMap(this.f22725a);
        }
        a3 a3VarL = l(this.f22725a, false);
        if (this.f22725a.u()) {
            a3VarL.v();
        }
        return a3VarL;
    }

    public Object u(T t10) {
        Object obj = this.f22725a.get(t10);
        return obj instanceof k1 ? ((k1) obj).p() : obj;
    }

    public int v() {
        int iW = 0;
        for (int i10 = 0; i10 < this.f22725a.k(); i10++) {
            iW += w(this.f22725a.j(i10));
        }
        Iterator it = this.f22725a.n().iterator();
        while (it.hasNext()) {
            iW += w((Map.Entry) it.next());
        }
        return iW;
    }

    public Object x(T t10, int i10) {
        if (!t10.H()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objU = u(t10);
        if (objU != null) {
            return ((List) objU).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int y(T t10) {
        if (!t10.H()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objU = u(t10);
        if (objU == null) {
            return 0;
        }
        return ((List) objU).size();
    }

    public int z() {
        int iQ = 0;
        for (int i10 = 0; i10 < this.f22725a.k(); i10++) {
            Map.Entry<K, Object> entryJ = this.f22725a.j(i10);
            iQ += q((c) entryJ.getKey(), entryJ.getValue());
        }
        Iterator it = this.f22725a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iQ += q((c) entry.getKey(), entry.getValue());
        }
        return iQ;
    }
}
