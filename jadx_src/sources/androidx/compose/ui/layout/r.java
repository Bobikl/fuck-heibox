package androidx.compose.ui.layout;

import androidx.compose.ui.node.NodeCoordinator;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutCoordinates.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\n\u0010\t\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\u0000*\u00020\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/layout/q;", "Lb1/f;", "f", "(Landroidx/compose/ui/layout/q;)J", "g", "Lb1/i;", "b", ak.aF, "e", ak.av, "d", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class r {
    @dl.d
    public static final b1.i a(@dl.d q qVar) {
        b1.i iVarC;
        kotlin.jvm.internal.f0.p(qVar, "<this>");
        q qVarD = qVar.D();
        return (qVarD == null || (iVarC = p.c(qVarD, qVar, false, 2, null)) == null) ? new b1.i(0.0f, 0.0f, s1.r.m(qVar.a()), s1.r.j(qVar.a())) : iVarC;
    }

    @dl.d
    public static final b1.i b(@dl.d q qVar) {
        kotlin.jvm.internal.f0.p(qVar, "<this>");
        return p.c(d(qVar), qVar, false, 2, null);
    }

    @dl.d
    public static final b1.i c(@dl.d q qVar) {
        kotlin.jvm.internal.f0.p(qVar, "<this>");
        q qVarD = d(qVar);
        b1.i iVarB = b(qVar);
        float fM = s1.r.m(qVarD.a());
        float fJ = s1.r.j(qVarD.a());
        float fH = fi.u.H(iVarB.t(), 0.0f, fM);
        float fH2 = fi.u.H(iVarB.getF30372b(), 0.0f, fJ);
        float fH3 = fi.u.H(iVarB.x(), 0.0f, fM);
        float fH4 = fi.u.H(iVarB.j(), 0.0f, fJ);
        if (!(fH == fH3)) {
            if (!(fH2 == fH4)) {
                long jW = qVarD.w(b1.g.a(fH, fH2));
                long jW2 = qVarD.w(b1.g.a(fH3, fH2));
                long jW3 = qVarD.w(b1.g.a(fH3, fH4));
                long jW4 = qVarD.w(b1.g.a(fH, fH4));
                return new b1.i(kotlin.comparisons.h.l0(b1.f.p(jW), b1.f.p(jW2), b1.f.p(jW4), b1.f.p(jW3)), kotlin.comparisons.h.l0(b1.f.r(jW), b1.f.r(jW2), b1.f.r(jW4), b1.f.r(jW3)), kotlin.comparisons.h.Q(b1.f.p(jW), b1.f.p(jW2), b1.f.p(jW4), b1.f.p(jW3)), kotlin.comparisons.h.Q(b1.f.r(jW), b1.f.r(jW2), b1.f.r(jW4), b1.f.r(jW3)));
            }
        }
        return b1.i.f30369e.a();
    }

    @dl.d
    public static final q d(@dl.d q qVar) {
        q qVar2;
        kotlin.jvm.internal.f0.p(qVar, "<this>");
        q qVarD = qVar.D();
        while (true) {
            q qVar3 = qVarD;
            qVar2 = qVar;
            qVar = qVar3;
            if (qVar == null) {
                break;
            }
            qVarD = qVar.D();
        }
        NodeCoordinator nodeCoordinator = qVar2 instanceof NodeCoordinator ? (NodeCoordinator) qVar2 : null;
        if (nodeCoordinator == null) {
            return qVar2;
        }
        NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            wrappedBy = nodeCoordinator.getWrappedBy();
        }
    }

    public static final long e(@dl.d q qVar) {
        kotlin.jvm.internal.f0.p(qVar, "<this>");
        q qVarD = qVar.D();
        return qVarD != null ? qVarD.a0(qVar, b1.f.f30364b.e()) : b1.f.f30364b.e();
    }

    public static final long f(@dl.d q qVar) {
        kotlin.jvm.internal.f0.p(qVar, "<this>");
        return qVar.L(b1.f.f30364b.e());
    }

    public static final long g(@dl.d q qVar) {
        kotlin.jvm.internal.f0.p(qVar, "<this>");
        return qVar.w(b1.f.f30364b.e());
    }
}
