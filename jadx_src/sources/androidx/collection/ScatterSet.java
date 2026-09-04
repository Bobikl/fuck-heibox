package androidx.collection;

import com.meituan.robust.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1100:1\n267#1,4:1101\n237#1,7:1105\n248#1,3:1113\n251#1,2:1117\n272#1,2:1119\n254#1,6:1121\n274#1:1127\n267#1,4:1128\n237#1,7:1132\n248#1,3:1140\n251#1,2:1144\n272#1,2:1146\n254#1,6:1148\n274#1:1154\n267#1,4:1155\n237#1,7:1159\n248#1,3:1167\n251#1,2:1171\n272#1,2:1173\n254#1,6:1175\n274#1:1181\n237#1,7:1184\n248#1,3:1192\n251#1,9:1196\n267#1,4:1205\n237#1,7:1209\n248#1,3:1217\n251#1,2:1221\n272#1,2:1223\n254#1,6:1225\n274#1:1231\n267#1,4:1232\n237#1,7:1236\n248#1,3:1244\n251#1,2:1248\n272#1,2:1250\n254#1,6:1252\n274#1:1258\n267#1,4:1259\n237#1,7:1263\n248#1,3:1271\n251#1,2:1275\n272#1,2:1277\n254#1,6:1279\n274#1:1285\n433#1:1286\n434#1:1290\n436#1,2:1292\n438#1,3:1295\n441#1:1301\n442#1:1305\n443#1:1307\n444#1,4:1310\n450#1:1315\n451#1,8:1317\n267#1,4:1325\n237#1,7:1329\n248#1,3:1337\n251#1,2:1341\n272#1,2:1343\n254#1,6:1345\n274#1:1351\n267#1,4:1352\n237#1,7:1356\n248#1,3:1364\n251#1,2:1368\n272#1,2:1370\n254#1,6:1372\n274#1:1378\n267#1,4:1379\n237#1,7:1383\n248#1,3:1391\n251#1,2:1395\n272#1,2:1397\n254#1,6:1399\n274#1:1405\n1826#2:1112\n1688#2:1116\n1826#2:1139\n1688#2:1143\n1826#2:1166\n1688#2:1170\n1826#2:1182\n1688#2:1183\n1826#2:1191\n1688#2:1195\n1826#2:1216\n1688#2:1220\n1826#2:1243\n1688#2:1247\n1826#2:1270\n1688#2:1274\n1605#2,3:1287\n1619#2:1291\n1615#2:1294\n1795#2,3:1298\n1809#2,3:1302\n1733#2:1306\n1721#2:1308\n1715#2:1309\n1728#2:1314\n1818#2:1316\n1826#2:1336\n1688#2:1340\n1826#2:1363\n1688#2:1367\n1826#2:1390\n1688#2:1394\n1605#2,3:1406\n1619#2:1409\n1615#2:1410\n1795#2,3:1411\n1809#2,3:1414\n1733#2:1417\n1721#2:1418\n1715#2:1419\n1728#2:1420\n1818#2:1421\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n201#1:1101,4\n201#1:1105,7\n201#1:1113,3\n201#1:1117,2\n201#1:1119,2\n201#1:1121,6\n201#1:1127\n214#1:1128,4\n214#1:1132,7\n214#1:1140,3\n214#1:1144,2\n214#1:1146,2\n214#1:1148,6\n214#1:1154\n227#1:1155,4\n227#1:1159,7\n227#1:1167,3\n227#1:1171,2\n227#1:1173,2\n227#1:1175,6\n227#1:1181\n270#1:1184,7\n270#1:1192,3\n270#1:1196,9\n284#1:1205,4\n284#1:1209,7\n284#1:1217,3\n284#1:1221,2\n284#1:1223,2\n284#1:1225,6\n284#1:1231\n297#1:1232,4\n297#1:1236,7\n297#1:1244,3\n297#1:1248,2\n297#1:1250,2\n297#1:1252,6\n297#1:1258\n318#1:1259,4\n318#1:1263,7\n318#1:1271,3\n318#1:1275,2\n318#1:1277,2\n318#1:1279,6\n318#1:1285\n329#1:1286\n329#1:1290\n329#1:1292,2\n329#1:1295,3\n329#1:1301\n329#1:1305\n329#1:1307\n329#1:1310,4\n329#1:1315\n329#1:1317,8\n352#1:1325,4\n352#1:1329,7\n352#1:1337,3\n352#1:1341,2\n352#1:1343,2\n352#1:1345,6\n352#1:1351\n378#1:1352,4\n378#1:1356,7\n378#1:1364,3\n378#1:1368,2\n378#1:1370,2\n378#1:1372,6\n378#1:1378\n407#1:1379,4\n407#1:1383,7\n407#1:1391,3\n407#1:1395,2\n407#1:1397,2\n407#1:1399,6\n407#1:1405\n201#1:1112\n201#1:1116\n214#1:1139\n214#1:1143\n227#1:1166\n227#1:1170\n243#1:1182\n250#1:1183\n270#1:1191\n270#1:1195\n284#1:1216\n284#1:1220\n297#1:1243\n297#1:1247\n318#1:1270\n318#1:1274\n329#1:1287,3\n329#1:1291\n329#1:1294\n329#1:1298,3\n329#1:1302,3\n329#1:1306\n329#1:1308\n329#1:1309\n329#1:1314\n329#1:1316\n352#1:1336\n352#1:1340\n378#1:1363\n378#1:1367\n407#1:1390\n407#1:1394\n433#1:1406,3\n434#1:1409\n437#1:1410\n440#1:1411,3\n441#1:1414,3\n442#1:1417\n443#1:1418\n443#1:1419\n447#1:1420\n450#1:1421\n*E\n"})
public abstract class ScatterSet<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @xh.e
    public long[] f3526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public Object[] f3527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @xh.e
    public int f3528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @xh.e
    public int f3529d;

    /* JADX INFO: compiled from: ScatterSet.kt */
    @kotlin.jvm.internal.t0({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1100:1\n1855#2,2:1101\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n*L\n478#1:1101,2\n*E\n"})
    public class SetWrapper implements Set<E>, zh.a {
        public SetWrapper() {
        }

        public int a() {
            return ScatterSet.this.f3529d;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return ScatterSet.this.e(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(@dl.d Collection<? extends Object> elements) {
            kotlin.jvm.internal.f0.p(elements, "elements");
            ScatterSet<E> scatterSet = ScatterSet.this;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!scatterSet.e((E) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return ScatterSet.this.r();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @dl.d
        public Iterator<E> iterator() {
            return kotlin.sequences.q.a(new ScatterSet$SetWrapper$iterator$1(ScatterSet.this, null));
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.t.a(this);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.f0.p(array, "array");
            return (T[]) kotlin.jvm.internal.t.b(this, array);
        }
    }

    private ScatterSet() {
        this.f3526a = h2.f3611e;
        this.f3527b = i0.a.f119208c;
    }

    public /* synthetic */ ScatterSet(kotlin.jvm.internal.u uVar) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String A(ScatterSet scatterSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l lVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return scatterSet.z(charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    @kotlin.r0
    public static /* synthetic */ void o() {
    }

    @kotlin.r0
    public static /* synthetic */ void p() {
    }

    public final boolean B() {
        return this.f3529d == 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[LOOP:0: B:5:0x0015->B:20:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x005c A[SYNTHETIC] */
    public final boolean a(@dl.d yh.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3527b;
        long[] jArr = this.f3526a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (((255 & j10) < 128) && !predicate.invoke(objArr[(i10 << 3) + i12]).booleanValue()) {
                            return false;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return true;
    }

    public final boolean b() {
        return this.f3529d != 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0055 A[LOOP:0: B:5:0x0010->B:20:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0058 A[SYNTHETIC] */
    public final boolean c(@dl.d yh.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3527b;
        long[] jArr = this.f3526a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (((255 & j10) < 128) && predicate.invoke(objArr[(i10 << 3) + i12]).booleanValue()) {
                            return true;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
    }

    @dl.d
    public final Set<E> d() {
        return new SetWrapper();
    }

    public final boolean e(E e10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * h2.f3616j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f3528c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f3526a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * h2.f3617k) ^ j10;
            long j12 = (~j11) & (j11 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j12 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                    if (kotlin.jvm.internal.f0.g(this.f3527b[iNumberOfTrailingZeros], e10)) {
                        break loop0;
                    }
                    j12 &= j12 - 1;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0063 A[LOOP:0: B:14:0x0025->B:29:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(@dl.e Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScatterSet)) {
            return false;
        }
        ScatterSet scatterSet = (ScatterSet) obj;
        if (scatterSet.q() != q()) {
            return false;
        }
        Object[] objArr = this.f3527b;
        long[] jArr = this.f3526a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (((255 & j10) < 128) && !scatterSet.e(objArr[(i10 << 3) + i12])) {
                            return false;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return true;
    }

    @androidx.annotation.f0(from = 0)
    public final int f() {
        return q();
    }

    @androidx.annotation.f0(from = 0)
    public final int g(@dl.d yh.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3527b;
        long[] jArr = this.f3526a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (((255 & j10) < 128) && predicate.invoke(objArr[(i11 << 3) + i14]).booleanValue()) {
                            i12++;
                        }
                        j10 >>= 8;
                    }
                    if (i13 != 8) {
                        return i12;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = i12;
                }
            }
        }
        return i10;
    }

    public final int h(E e10) {
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * h2.f3616j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f3528c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f3526a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * h2.f3617k) ^ j10;
            long j12 = (~j11) & (j11 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j12 != 0) {
                    int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                    if (kotlin.jvm.internal.f0.g(this.f3527b[iNumberOfTrailingZeros], e10)) {
                        return iNumberOfTrailingZeros;
                    }
                    j12 &= j12 - 1;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public int hashCode() {
        Object[] objArr = this.f3527b;
        long[] jArr = this.f3526a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int iHashCode = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i11 << 3) + i13];
                            iHashCode += obj != null ? obj.hashCode() : 0;
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return iHashCode;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = iHashCode;
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[LOOP:0: B:5:0x000b->B:19:0x0043, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0046 A[SYNTHETIC] */
    public final E i() {
        Object[] objArr = this.f3527b;
        long[] jArr = this.f3526a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            return (E) objArr[(i10 << 3) + i12];
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        throw new NoSuchElementException("The ScatterSet is empty");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[LOOP:0: B:5:0x0010->B:20:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v7, types: [E, java.lang.Object] */
    public final E j(@dl.d yh.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3527b;
        long[] jArr = this.f3526a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            ?? r10 = (Object) objArr[(i10 << 3) + i12];
                            if (predicate.invoke(r10).booleanValue()) {
                                return r10;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        throw new NoSuchElementException("Could not find a match");
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [E, java.lang.Object] */
    @dl.e
    public final E k(@dl.d yh.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3527b;
        long[] jArr = this.f3526a;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        ?? r10 = (Object) objArr[(i10 << 3) + i12];
                        if (predicate.invoke(r10).booleanValue()) {
                            return r10;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return null;
                }
            }
            if (i10 == length) {
                return null;
            }
            i10++;
        }
    }

    public final void l(@dl.d yh.l<? super E, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        Object[] objArr = this.f3527b;
        long[] jArr = this.f3526a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @kotlin.r0
    public final void m(@dl.d yh.l<? super Integer, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        long[] jArr = this.f3526a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(Integer.valueOf((i10 << 3) + i12));
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @androidx.annotation.f0(from = 0)
    public final int n() {
        return this.f3528c;
    }

    @androidx.annotation.f0(from = 0)
    public final int q() {
        return this.f3529d;
    }

    public final boolean r() {
        return this.f3529d == 0;
    }

    public final boolean s() {
        return this.f3529d != 0;
    }

    @dl.d
    @xh.i
    public final String t() {
        return A(this, null, null, null, 0, null, null, 63, null);
    }

    @dl.d
    public String toString() {
        return A(this, null, Constants.ARRAY_TYPE, "]", 0, null, new yh.l<E, CharSequence>(this) { // from class: androidx.collection.ScatterSet.toString.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ScatterSet<E> f3541b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f3541b = this;
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(E e10) {
                return e10 == this.f3541b ? "(this)" : String.valueOf(e10);
            }
        }, 25, null);
    }

    @dl.d
    @xh.i
    public final String u(@dl.d CharSequence separator) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        return A(this, separator, null, null, 0, null, null, 62, null);
    }

    @dl.d
    @xh.i
    public final String v(@dl.d CharSequence separator, @dl.d CharSequence prefix) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        return A(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @dl.d
    @xh.i
    public final String w(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        return A(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @dl.d
    @xh.i
    public final String x(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        return A(this, separator, prefix, postfix, i10, null, null, 48, null);
    }

    @dl.d
    @xh.i
    public final String y(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        return A(this, separator, prefix, postfix, i10, truncated, null, 32, null);
    }

    @dl.d
    @xh.i
    public final String z(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super E, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f3527b;
        long[] jArr = this.f3526a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((j10 & 255) < 128) {
                        Object obj = objArr[(i11 << 3) + i15];
                        if (i12 == i10) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        if (lVar == null) {
                            sb2.append(obj);
                        } else {
                            sb2.append(lVar.invoke(obj));
                        }
                        i12++;
                        i13 = 8;
                    }
                    j10 >>= i13;
                }
                if (i14 == i13) {
                }
                sb2.append(postfix);
                break;
            }
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
