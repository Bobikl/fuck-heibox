package kotlin.sequences;

import java.util.Iterator;
import kotlin.e2;
import kotlin.j1;
import kotlin.jvm.internal.f0;
import kotlin.n1;
import kotlin.r1;
import kotlin.u0;
import kotlin.x1;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: _USequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public class y {
    @u0(version = s0.f136928s)
    @xh.h(name = "sumOfUByte")
    @e2(markerClass = {kotlin.s.class})
    public static final int a(@dl.d m<j1> mVar) {
        f0.p(mVar, "<this>");
        Iterator<j1> it = mVar.iterator();
        int iH = 0;
        while (it.hasNext()) {
            iH = n1.h(iH + n1.h(it.next().o0() & 255));
        }
        return iH;
    }

    @u0(version = s0.f136928s)
    @xh.h(name = "sumOfUInt")
    @e2(markerClass = {kotlin.s.class})
    public static final int b(@dl.d m<n1> mVar) {
        f0.p(mVar, "<this>");
        Iterator<n1> it = mVar.iterator();
        int iH = 0;
        while (it.hasNext()) {
            iH = n1.h(iH + it.next().q0());
        }
        return iH;
    }

    @u0(version = s0.f136928s)
    @xh.h(name = "sumOfULong")
    @e2(markerClass = {kotlin.s.class})
    public static final long c(@dl.d m<r1> mVar) {
        f0.p(mVar, "<this>");
        Iterator<r1> it = mVar.iterator();
        long jH = 0;
        while (it.hasNext()) {
            jH = r1.h(jH + it.next().q0());
        }
        return jH;
    }

    @u0(version = s0.f136928s)
    @xh.h(name = "sumOfUShort")
    @e2(markerClass = {kotlin.s.class})
    public static final int d(@dl.d m<x1> mVar) {
        f0.p(mVar, "<this>");
        Iterator<x1> it = mVar.iterator();
        int iH = 0;
        while (it.hasNext()) {
            iH = n1.h(iH + n1.h(it.next().o0() & x1.f128661e));
        }
        return iH;
    }
}
