package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: compiled from: MapEntryLite.java */
/* JADX INFO: loaded from: classes6.dex */
public class t1<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f22631d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f22632e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b<K, V> f22633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K f22634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V f22635c;

    /* JADX INFO: compiled from: MapEntryLite.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22636a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f22636a = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22636a[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22636a[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: MapEntryLite.java */
    public static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WireFormat.FieldType f22637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f22638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WireFormat.FieldType f22639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f22640d;

        public b(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v10) {
            this.f22637a = fieldType;
            this.f22638b = k10;
            this.f22639c = fieldType2;
            this.f22640d = v10;
        }
    }

    private t1(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v10) {
        this.f22633a = new b<>(fieldType, k10, fieldType2, v10);
        this.f22634b = k10;
        this.f22635c = v10;
    }

    private t1(b<K, V> bVar, K k10, V v10) {
        this.f22633a = bVar;
        this.f22634b = k10;
        this.f22635c = v10;
    }

    static <K, V> int b(b<K, V> bVar, K k10, V v10) {
        return y0.o(bVar.f22637a, 1, k10) + y0.o(bVar.f22639c, 2, v10);
    }

    public static <K, V> t1<K, V> f(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v10) {
        return new t1<>(fieldType, k10, fieldType2, v10);
    }

    static <K, V> Map.Entry<K, V> h(w wVar, b<K, V> bVar, p0 p0Var) throws IOException {
        Object objI = bVar.f22638b;
        Object objI2 = bVar.f22640d;
        while (true) {
            int iY = wVar.Y();
            if (iY == 0) {
                break;
            }
            if (iY == WireFormat.c(1, bVar.f22637a.getWireType())) {
                objI = i(wVar, p0Var, bVar.f22637a, objI);
            } else if (iY == WireFormat.c(2, bVar.f22639c.getWireType())) {
                objI2 = i(wVar, p0Var, bVar.f22639c, objI2);
            } else if (!wVar.g0(iY)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objI, objI2);
    }

    static <T> T i(w wVar, p0 p0Var, WireFormat.FieldType fieldType, T t10) throws IOException {
        int i10 = a.f22636a[fieldType.ordinal()];
        if (i10 == 1) {
            z1.a aVarT = ((z1) t10).t();
            wVar.I(aVarT, p0Var);
            return (T) aVarT.a1();
        }
        if (i10 == 2) {
            return (T) Integer.valueOf(wVar.z());
        }
        if (i10 != 3) {
            return (T) y0.N(wVar, fieldType, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    static <K, V> void l(CodedOutputStream codedOutputStream, b<K, V> bVar, K k10, V v10) throws IOException {
        y0.R(codedOutputStream, bVar.f22637a, 1, k10);
        y0.R(codedOutputStream, bVar.f22639c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        return CodedOutputStream.X0(i10) + CodedOutputStream.D0(b(this.f22633a, k10, v10));
    }

    public K c() {
        return this.f22634b;
    }

    b<K, V> d() {
        return this.f22633a;
    }

    public V e() {
        return this.f22635c;
    }

    public Map.Entry<K, V> g(ByteString byteString, p0 p0Var) throws IOException {
        return h(byteString.L(), this.f22633a, p0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(MapFieldLite<K, V> mapFieldLite, w wVar, p0 p0Var) throws IOException {
        int iT = wVar.t(wVar.N());
        b<K, V> bVar = this.f22633a;
        Object objI = bVar.f22638b;
        Object objI2 = bVar.f22640d;
        while (true) {
            int iY = wVar.Y();
            if (iY == 0) {
                break;
            }
            if (iY == WireFormat.c(1, this.f22633a.f22637a.getWireType())) {
                objI = i(wVar, p0Var, this.f22633a.f22637a, objI);
            } else if (iY == WireFormat.c(2, this.f22633a.f22639c.getWireType())) {
                objI2 = i(wVar, p0Var, this.f22633a.f22639c, objI2);
            } else if (!wVar.g0(iY)) {
                break;
            }
        }
        wVar.a(0);
        wVar.s(iT);
        mapFieldLite.put(objI, objI2);
    }

    public void k(CodedOutputStream codedOutputStream, int i10, K k10, V v10) throws IOException {
        codedOutputStream.g2(i10, 2);
        codedOutputStream.h2(b(this.f22633a, k10, v10));
        l(codedOutputStream, this.f22633a, k10, v10);
    }
}
