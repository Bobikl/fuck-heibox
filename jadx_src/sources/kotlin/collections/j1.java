package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.e2;
import kotlin.k1;
import kotlin.n1;
import kotlin.o1;
import kotlin.r1;
import kotlin.s1;
import kotlin.x1;
import kotlin.y1;

/* JADX INFO: compiled from: _UCollections.kt */
/* JADX INFO: loaded from: classes5.dex */
public class j1 {
    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @xh.h(name = "sumOfUByte")
    @e2(markerClass = {kotlin.s.class})
    public static final int a(@dl.d Iterable<kotlin.j1> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<kotlin.j1> it = iterable.iterator();
        int iH = 0;
        while (it.hasNext()) {
            iH = n1.h(iH + n1.h(it.next().o0() & 255));
        }
        return iH;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @xh.h(name = "sumOfUInt")
    @e2(markerClass = {kotlin.s.class})
    public static final int b(@dl.d Iterable<n1> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<n1> it = iterable.iterator();
        int iH = 0;
        while (it.hasNext()) {
            iH = n1.h(iH + it.next().q0());
        }
        return iH;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @xh.h(name = "sumOfULong")
    @e2(markerClass = {kotlin.s.class})
    public static final long c(@dl.d Iterable<r1> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<r1> it = iterable.iterator();
        long jH = 0;
        while (it.hasNext()) {
            jH = r1.h(jH + it.next().q0());
        }
        return jH;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136928s)
    @xh.h(name = "sumOfUShort")
    @e2(markerClass = {kotlin.s.class})
    public static final int d(@dl.d Iterable<x1> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        Iterator<x1> it = iterable.iterator();
        int iH = 0;
        while (it.hasNext()) {
            iH = n1.h(iH + n1.h(it.next().o0() & x1.f128661e));
        }
        return iH;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.s
    public static final byte[] e(@dl.d Collection<kotlin.j1> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        byte[] bArrE = k1.e(collection.size());
        Iterator<kotlin.j1> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            k1.B(bArrE, i10, it.next().o0());
            i10++;
        }
        return bArrE;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.s
    public static final int[] f(@dl.d Collection<n1> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        int[] iArrE = o1.e(collection.size());
        Iterator<n1> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            o1.B(iArrE, i10, it.next().q0());
            i10++;
        }
        return iArrE;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.s
    public static final long[] g(@dl.d Collection<r1> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        long[] jArrE = s1.e(collection.size());
        Iterator<r1> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            s1.B(jArrE, i10, it.next().q0());
            i10++;
        }
        return jArrE;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.s
    public static final short[] h(@dl.d Collection<x1> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        short[] sArrE = y1.e(collection.size());
        Iterator<x1> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            y1.B(sArrE, i10, it.next().o0());
            i10++;
        }
        return sArrE;
    }
}
