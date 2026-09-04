package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.meituan.robust.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: DependencyGraph.java */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final boolean f18355j = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.d f18356a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.d f18359d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f18357b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18358c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<WidgetRun> f18360e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<l> f18361f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b.InterfaceC0110b f18362g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b.a f18363h = new b.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList<l> f18364i = new ArrayList<>();

    public e(androidx.constraintlayout.core.widgets.d dVar) {
        this.f18356a = dVar;
        this.f18359d = dVar;
    }

    private void a(DependencyNode dependencyNode, int i10, int i11, DependencyNode dependencyNode2, ArrayList<l> arrayList, l lVar) {
        WidgetRun widgetRun = dependencyNode.f18309d;
        if (widgetRun.f18320c == null) {
            androidx.constraintlayout.core.widgets.d dVar = this.f18356a;
            if (widgetRun == dVar.f18260e || widgetRun == dVar.f18262f) {
                return;
            }
            if (lVar == null) {
                lVar = new l(widgetRun, i11);
                arrayList.add(lVar);
            }
            widgetRun.f18320c = lVar;
            lVar.a(widgetRun);
            for (d dVar2 : widgetRun.f18325h.f18316k) {
                if (dVar2 instanceof DependencyNode) {
                    a((DependencyNode) dVar2, i10, 0, dependencyNode2, arrayList, lVar);
                }
            }
            for (d dVar3 : widgetRun.f18326i.f18316k) {
                if (dVar3 instanceof DependencyNode) {
                    a((DependencyNode) dVar3, i10, 1, dependencyNode2, arrayList, lVar);
                }
            }
            if (i10 == 1 && (widgetRun instanceof m)) {
                for (d dVar4 : ((m) widgetRun).f18387k.f18316k) {
                    if (dVar4 instanceof DependencyNode) {
                        a((DependencyNode) dVar4, i10, 2, dependencyNode2, arrayList, lVar);
                    }
                }
            }
            for (DependencyNode dependencyNode3 : widgetRun.f18325h.f18317l) {
                if (dependencyNode3 == dependencyNode2) {
                    lVar.f18381b = true;
                }
                a(dependencyNode3, i10, 0, dependencyNode2, arrayList, lVar);
            }
            for (DependencyNode dependencyNode4 : widgetRun.f18326i.f18317l) {
                if (dependencyNode4 == dependencyNode2) {
                    lVar.f18381b = true;
                }
                a(dependencyNode4, i10, 1, dependencyNode2, arrayList, lVar);
            }
            if (i10 == 1 && (widgetRun instanceof m)) {
                Iterator<DependencyNode> it = ((m) widgetRun).f18387k.f18317l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i10, 2, dependencyNode2, arrayList, lVar);
                }
            }
        }
    }

    private boolean b(androidx.constraintlayout.core.widgets.d dVar) {
        int iJ0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int iD;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        for (ConstraintWidget constraintWidget : dVar.f18505z1) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f18255b0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[1];
            if (constraintWidget.i0() == 8) {
                constraintWidget.f18252a = true;
            } else {
                if (constraintWidget.B < 1.0f && dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.f18296w = 2;
                }
                if (constraintWidget.E < 1.0f && dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.f18298x = 2;
                }
                if (constraintWidget.A() > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour5 == dimensionBehaviour7 && (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.f18296w = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour7 && (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.f18298x = 3;
                    } else if (dimensionBehaviour5 == dimensionBehaviour7 && dimensionBehaviour6 == dimensionBehaviour7) {
                        if (constraintWidget.f18296w == 0) {
                            constraintWidget.f18296w = 3;
                        }
                        if (constraintWidget.f18298x == 0) {
                            constraintWidget.f18298x = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour5 == dimensionBehaviour8 && constraintWidget.f18296w == 1 && (constraintWidget.Q.f18222f == null || constraintWidget.S.f18222f == null)) {
                    dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dimensionBehaviour5;
                if (dimensionBehaviour6 == dimensionBehaviour8 && constraintWidget.f18298x == 1 && (constraintWidget.R.f18222f == null || constraintWidget.T.f18222f == null)) {
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviour6;
                k kVar = constraintWidget.f18260e;
                kVar.f18321d = dimensionBehaviour9;
                int i10 = constraintWidget.f18296w;
                kVar.f18318a = i10;
                m mVar = constraintWidget.f18262f;
                mVar.f18321d = dimensionBehaviour10;
                int i11 = constraintWidget.f18298x;
                mVar.f18318a = i11;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour9 == dimensionBehaviour11 || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour10 == dimensionBehaviour11 || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    int iJ1 = constraintWidget.j0();
                    if (dimensionBehaviour9 == dimensionBehaviour11) {
                        iJ0 = (dVar.j0() - constraintWidget.Q.f18223g) - constraintWidget.S.f18223g;
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        iJ0 = iJ1;
                        dimensionBehaviour = dimensionBehaviour9;
                    }
                    int iD2 = constraintWidget.D();
                    if (dimensionBehaviour10 == dimensionBehaviour11) {
                        iD = (dVar.D() - constraintWidget.R.f18223g) - constraintWidget.T.f18223g;
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        iD = iD2;
                        dimensionBehaviour2 = dimensionBehaviour10;
                    }
                    r(constraintWidget, dimensionBehaviour, iJ0, dimensionBehaviour2, iD);
                    constraintWidget.f18260e.f18322e.e(constraintWidget.j0());
                    constraintWidget.f18262f.f18322e.e(constraintWidget.D());
                    constraintWidget.f18252a = true;
                } else {
                    if (dimensionBehaviour9 == dimensionBehaviour8 && (dimensionBehaviour10 == (dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i10 == 3) {
                            if (dimensionBehaviour10 == dimensionBehaviour4) {
                                r(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                            }
                            int iD3 = constraintWidget.D();
                            int i12 = (int) ((iD3 * constraintWidget.f18263f0) + 0.5f);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                            r(constraintWidget, dimensionBehaviour12, i12, dimensionBehaviour12, iD3);
                            constraintWidget.f18260e.f18322e.e(constraintWidget.j0());
                            constraintWidget.f18262f.f18322e.e(constraintWidget.D());
                            constraintWidget.f18252a = true;
                        } else if (i10 == 1) {
                            r(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour10, 0);
                            constraintWidget.f18260e.f18322e.f18365m = constraintWidget.j0();
                        } else if (i10 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = dVar.f18255b0[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour13 == dimensionBehaviour14 || dimensionBehaviour13 == dimensionBehaviour11) {
                                r(constraintWidget, dimensionBehaviour14, (int) ((constraintWidget.B * dVar.j0()) + 0.5f), dimensionBehaviour10, constraintWidget.D());
                                constraintWidget.f18260e.f18322e.e(constraintWidget.j0());
                                constraintWidget.f18262f.f18322e.e(constraintWidget.D());
                                constraintWidget.f18252a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr = constraintWidget.Y;
                            if (constraintAnchorArr[0].f18222f == null || constraintAnchorArr[1].f18222f == null) {
                                r(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour10, 0);
                                constraintWidget.f18260e.f18322e.e(constraintWidget.j0());
                                constraintWidget.f18262f.f18322e.e(constraintWidget.D());
                                constraintWidget.f18252a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour10 == dimensionBehaviour8 && (dimensionBehaviour9 == (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i11 == 3) {
                            if (dimensionBehaviour9 == dimensionBehaviour3) {
                                r(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour3, 0);
                            }
                            int iJ2 = constraintWidget.j0();
                            float f10 = constraintWidget.f18263f0;
                            if (constraintWidget.B() == -1) {
                                f10 = 1.0f / f10;
                            }
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.FIXED;
                            r(constraintWidget, dimensionBehaviour15, iJ2, dimensionBehaviour15, (int) ((iJ2 * f10) + 0.5f));
                            constraintWidget.f18260e.f18322e.e(constraintWidget.j0());
                            constraintWidget.f18262f.f18322e.e(constraintWidget.D());
                            constraintWidget.f18252a = true;
                        } else if (i11 == 1) {
                            r(constraintWidget, dimensionBehaviour9, 0, dimensionBehaviour3, 0);
                            constraintWidget.f18262f.f18322e.f18365m = constraintWidget.D();
                        } else if (i11 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = dVar.f18255b0[1];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour16 == dimensionBehaviour17 || dimensionBehaviour16 == dimensionBehaviour11) {
                                r(constraintWidget, dimensionBehaviour9, constraintWidget.j0(), dimensionBehaviour17, (int) ((constraintWidget.E * dVar.D()) + 0.5f));
                                constraintWidget.f18260e.f18322e.e(constraintWidget.j0());
                                constraintWidget.f18262f.f18322e.e(constraintWidget.D());
                                constraintWidget.f18252a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr2 = constraintWidget.Y;
                            if (constraintAnchorArr2[2].f18222f == null || constraintAnchorArr2[3].f18222f == null) {
                                r(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour10, 0);
                                constraintWidget.f18260e.f18322e.e(constraintWidget.j0());
                                constraintWidget.f18262f.f18322e.e(constraintWidget.D());
                                constraintWidget.f18252a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour9 == dimensionBehaviour8 && dimensionBehaviour10 == dimensionBehaviour8) {
                        if (i10 == 1 || i11 == 1) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            r(constraintWidget, dimensionBehaviour18, 0, dimensionBehaviour18, 0);
                            constraintWidget.f18260e.f18322e.f18365m = constraintWidget.j0();
                            constraintWidget.f18262f.f18322e.f18365m = constraintWidget.D();
                        } else if (i11 == 2 && i10 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar.f18255b0;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = dimensionBehaviourArr2[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour19 == dimensionBehaviour20 && dimensionBehaviourArr2[1] == dimensionBehaviour20) {
                                r(constraintWidget, dimensionBehaviour20, (int) ((constraintWidget.B * dVar.j0()) + 0.5f), dimensionBehaviour20, (int) ((constraintWidget.E * dVar.D()) + 0.5f));
                                constraintWidget.f18260e.f18322e.e(constraintWidget.j0());
                                constraintWidget.f18262f.f18322e.e(constraintWidget.D());
                                constraintWidget.f18252a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int e(androidx.constraintlayout.core.widgets.d dVar, int i10) {
        int size = this.f18364i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, this.f18364i.get(i11).b(dVar, i10));
        }
        return (int) jMax;
    }

    private void j() {
        Iterator<WidgetRun> it = this.f18360e.iterator();
        String strM = "digraph {\n";
        while (it.hasNext()) {
            strM = m(it.next(), strM);
        }
        String str = strM + "\n}\n";
        System.out.println("content:<<\n" + str + "\n>>");
    }

    private void k(WidgetRun widgetRun, int i10, ArrayList<l> arrayList) {
        for (d dVar : widgetRun.f18325h.f18316k) {
            if (dVar instanceof DependencyNode) {
                a((DependencyNode) dVar, i10, 0, widgetRun.f18326i, arrayList, null);
            } else if (dVar instanceof WidgetRun) {
                a(((WidgetRun) dVar).f18325h, i10, 0, widgetRun.f18326i, arrayList, null);
            }
        }
        for (d dVar2 : widgetRun.f18326i.f18316k) {
            if (dVar2 instanceof DependencyNode) {
                a((DependencyNode) dVar2, i10, 1, widgetRun.f18325h, arrayList, null);
            } else if (dVar2 instanceof WidgetRun) {
                a(((WidgetRun) dVar2).f18326i, i10, 1, widgetRun.f18325h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((m) widgetRun).f18387k.f18316k) {
                if (dVar3 instanceof DependencyNode) {
                    a((DependencyNode) dVar3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    private String l(c cVar, String str) {
        int i10 = cVar.f18323f;
        StringBuilder sb2 = new StringBuilder("subgraph ");
        sb2.append("cluster_");
        sb2.append(cVar.f18319b.y());
        if (i10 == 0) {
            sb2.append("_h");
        } else {
            sb2.append("_v");
        }
        sb2.append(" {\n");
        String strM = "";
        for (WidgetRun widgetRun : cVar.f18353k) {
            sb2.append(widgetRun.f18319b.y());
            if (i10 == 0) {
                sb2.append("_HORIZONTAL");
            } else {
                sb2.append("_VERTICAL");
            }
            sb2.append(";\n");
            strM = m(widgetRun, strM);
        }
        sb2.append("}\n");
        return str + strM + ((Object) sb2);
    }

    private String m(WidgetRun widgetRun, String str) {
        boolean z10;
        DependencyNode dependencyNode = widgetRun.f18325h;
        DependencyNode dependencyNode2 = widgetRun.f18326i;
        StringBuilder sb2 = new StringBuilder(str);
        if (!(widgetRun instanceof j) && dependencyNode.f18316k.isEmpty() && (dependencyNode2.f18316k.isEmpty() && dependencyNode.f18317l.isEmpty()) && dependencyNode2.f18317l.isEmpty()) {
            return str;
        }
        sb2.append(t(widgetRun));
        boolean zQ = q(dependencyNode, dependencyNode2);
        String strN = n(dependencyNode2, zQ, n(dependencyNode, zQ, str));
        boolean z11 = widgetRun instanceof m;
        if (z11) {
            strN = n(((m) widgetRun).f18387k, zQ, strN);
        }
        if ((widgetRun instanceof k) || (((z10 = widgetRun instanceof c)) && ((c) widgetRun).f18323f == 0)) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviourH = widgetRun.f18319b.H();
            if (dimensionBehaviourH == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviourH == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (!dependencyNode.f18317l.isEmpty() && dependencyNode2.f18317l.isEmpty()) {
                    sb2.append("\n");
                    sb2.append(dependencyNode2.d());
                    sb2.append(" -> ");
                    sb2.append(dependencyNode.d());
                    sb2.append("\n");
                } else if (dependencyNode.f18317l.isEmpty() && !dependencyNode2.f18317l.isEmpty()) {
                    sb2.append("\n");
                    sb2.append(dependencyNode.d());
                    sb2.append(" -> ");
                    sb2.append(dependencyNode2.d());
                    sb2.append("\n");
                }
            } else if (dimensionBehaviourH == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun.f18319b.A() > 0.0f) {
                sb2.append("\n");
                sb2.append(widgetRun.f18319b.y());
                sb2.append("_HORIZONTAL -> ");
                sb2.append(widgetRun.f18319b.y());
                sb2.append("_VERTICAL;\n");
            }
        } else if (z11 || (z10 && ((c) widgetRun).f18323f == 1)) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviourG0 = widgetRun.f18319b.g0();
            if (dimensionBehaviourG0 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviourG0 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (!dependencyNode.f18317l.isEmpty() && dependencyNode2.f18317l.isEmpty()) {
                    sb2.append("\n");
                    sb2.append(dependencyNode2.d());
                    sb2.append(" -> ");
                    sb2.append(dependencyNode.d());
                    sb2.append("\n");
                } else if (dependencyNode.f18317l.isEmpty() && !dependencyNode2.f18317l.isEmpty()) {
                    sb2.append("\n");
                    sb2.append(dependencyNode.d());
                    sb2.append(" -> ");
                    sb2.append(dependencyNode2.d());
                    sb2.append("\n");
                }
            } else if (dimensionBehaviourG0 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun.f18319b.A() > 0.0f) {
                sb2.append("\n");
                sb2.append(widgetRun.f18319b.y());
                sb2.append("_VERTICAL -> ");
                sb2.append(widgetRun.f18319b.y());
                sb2.append("_HORIZONTAL;\n");
            }
        }
        return widgetRun instanceof c ? l((c) widgetRun, strN) : sb2.toString();
    }

    private String n(DependencyNode dependencyNode, boolean z10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        for (DependencyNode dependencyNode2 : dependencyNode.f18317l) {
            String str2 = ("\n" + dependencyNode.d()) + " -> " + dependencyNode2.d();
            if (dependencyNode.f18311f > 0 || z10 || (dependencyNode.f18309d instanceof j)) {
                String str3 = str2 + Constants.ARRAY_TYPE;
                if (dependencyNode.f18311f > 0) {
                    str3 = str3 + "label=\"" + dependencyNode.f18311f + "\"";
                    if (z10) {
                        str3 = str3 + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP;
                    }
                }
                if (z10) {
                    str3 = str3 + " style=dashed ";
                }
                if (dependencyNode.f18309d instanceof j) {
                    str3 = str3 + " style=bold,color=gray ";
                }
                str2 = str3 + "]";
            }
            sb2.append(str2 + "\n");
        }
        return sb2.toString();
    }

    private boolean q(DependencyNode dependencyNode, DependencyNode dependencyNode2) {
        Iterator<DependencyNode> it = dependencyNode.f18317l.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next() != dependencyNode2) {
                i10++;
            }
        }
        Iterator<DependencyNode> it2 = dependencyNode2.f18317l.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            if (it2.next() != dependencyNode) {
                i11++;
            }
        }
        return i10 > 0 && i11 > 0;
    }

    private void r(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        b.a aVar = this.f18363h;
        aVar.f18343a = dimensionBehaviour;
        aVar.f18344b = dimensionBehaviour2;
        aVar.f18345c = i10;
        aVar.f18346d = i11;
        this.f18362g.b(constraintWidget, aVar);
        constraintWidget.W1(this.f18363h.f18347e);
        constraintWidget.s1(this.f18363h.f18348f);
        constraintWidget.r1(this.f18363h.f18350h);
        constraintWidget.a1(this.f18363h.f18349g);
    }

    private String t(WidgetRun widgetRun) {
        boolean z10 = widgetRun instanceof m;
        String strY = widgetRun.f18319b.y();
        StringBuilder sb2 = new StringBuilder(strY);
        ConstraintWidget constraintWidget = widgetRun.f18319b;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourH = !z10 ? constraintWidget.H() : constraintWidget.g0();
        l lVar = widgetRun.f18320c;
        if (z10) {
            sb2.append("_VERTICAL");
        } else {
            sb2.append("_HORIZONTAL");
        }
        sb2.append(" [shape=none, label=<");
        sb2.append("<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">");
        sb2.append("  <TR>");
        if (z10) {
            sb2.append("    <TD ");
            if (widgetRun.f18325h.f18315j) {
                sb2.append(" BGCOLOR=\"green\"");
            }
            sb2.append(" PORT=\"TOP\" BORDER=\"1\">T</TD>");
        } else {
            sb2.append("    <TD ");
            if (widgetRun.f18325h.f18315j) {
                sb2.append(" BGCOLOR=\"green\"");
            }
            sb2.append(" PORT=\"LEFT\" BORDER=\"1\">L</TD>");
        }
        sb2.append("    <TD BORDER=\"1\" ");
        boolean z11 = widgetRun.f18322e.f18315j;
        if (z11 && !widgetRun.f18319b.f18252a) {
            sb2.append(" BGCOLOR=\"green\" ");
        } else if (z11) {
            sb2.append(" BGCOLOR=\"lightgray\" ");
        } else if (widgetRun.f18319b.f18252a) {
            sb2.append(" BGCOLOR=\"yellow\" ");
        }
        if (dimensionBehaviourH == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            sb2.append("style=\"dashed\"");
        }
        sb2.append(">");
        sb2.append(strY);
        if (lVar != null) {
            sb2.append(" [");
            sb2.append(lVar.f18385f + 1);
            sb2.append("/");
            sb2.append(l.f18379k);
            sb2.append("]");
        }
        sb2.append(" </TD>");
        if (z10) {
            sb2.append("    <TD ");
            if (((m) widgetRun).f18387k.f18315j) {
                sb2.append(" BGCOLOR=\"green\"");
            }
            sb2.append(" PORT=\"BASELINE\" BORDER=\"1\">b</TD>");
            sb2.append("    <TD ");
            if (widgetRun.f18326i.f18315j) {
                sb2.append(" BGCOLOR=\"green\"");
            }
            sb2.append(" PORT=\"BOTTOM\" BORDER=\"1\">B</TD>");
        } else {
            sb2.append("    <TD ");
            if (widgetRun.f18326i.f18315j) {
                sb2.append(" BGCOLOR=\"green\"");
            }
            sb2.append(" PORT=\"RIGHT\" BORDER=\"1\">R</TD>");
        }
        sb2.append("  </TR></TABLE>");
        sb2.append(">];\n");
        return sb2.toString();
    }

    public void c() {
        d(this.f18360e);
        this.f18364i.clear();
        l.f18379k = 0;
        k(this.f18356a.f18260e, 0, this.f18364i);
        k(this.f18356a.f18262f, 1, this.f18364i);
        this.f18357b = false;
    }

    public void d(ArrayList<WidgetRun> arrayList) {
        arrayList.clear();
        this.f18359d.f18260e.f();
        this.f18359d.f18262f.f();
        arrayList.add(this.f18359d.f18260e);
        arrayList.add(this.f18359d.f18262f);
        HashSet hashSet = null;
        for (ConstraintWidget constraintWidget : this.f18359d.f18505z1) {
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                arrayList.add(new i(constraintWidget));
            } else {
                if (constraintWidget.x0()) {
                    if (constraintWidget.f18256c == null) {
                        constraintWidget.f18256c = new c(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f18256c);
                } else {
                    arrayList.add(constraintWidget.f18260e);
                }
                if (constraintWidget.z0()) {
                    if (constraintWidget.f18258d == null) {
                        constraintWidget.f18258d = new c(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f18258d);
                } else {
                    arrayList.add(constraintWidget.f18262f);
                }
                if (constraintWidget instanceof androidx.constraintlayout.core.widgets.h) {
                    arrayList.add(new j(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        for (WidgetRun widgetRun : arrayList) {
            if (widgetRun.f18319b != this.f18359d) {
                widgetRun.d();
            }
        }
    }

    public void f(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2) {
        if (this.f18357b) {
            c();
            boolean z10 = false;
            for (ConstraintWidget constraintWidget : this.f18356a.f18505z1) {
                boolean[] zArr = constraintWidget.f18264g;
                zArr[0] = true;
                zArr[1] = true;
                if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
                    z10 = true;
                }
            }
            if (z10) {
                return;
            }
            for (l lVar : this.f18364i) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                lVar.d(dimensionBehaviour == dimensionBehaviour3, dimensionBehaviour2 == dimensionBehaviour3);
            }
        }
    }

    public boolean g(boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        if (this.f18357b || this.f18358c) {
            for (ConstraintWidget constraintWidget : this.f18356a.f18505z1) {
                constraintWidget.q();
                constraintWidget.f18252a = false;
                constraintWidget.f18260e.n();
                constraintWidget.f18262f.n();
            }
            this.f18356a.q();
            androidx.constraintlayout.core.widgets.d dVar = this.f18356a;
            dVar.f18252a = false;
            dVar.f18260e.n();
            this.f18356a.f18262f.n();
            this.f18358c = false;
        }
        if (b(this.f18359d)) {
            return false;
        }
        this.f18356a.Z1(0);
        this.f18356a.a2(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourZ = this.f18356a.z(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourZ2 = this.f18356a.z(1);
        if (this.f18357b) {
            c();
        }
        int iL0 = this.f18356a.l0();
        int iM0 = this.f18356a.m0();
        this.f18356a.f18260e.f18325h.e(iL0);
        this.f18356a.f18262f.f18325h.e(iM0);
        s();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviourZ == dimensionBehaviour || dimensionBehaviourZ2 == dimensionBehaviour) {
            if (z13) {
                Iterator<WidgetRun> it = this.f18360e.iterator();
                while (it.hasNext()) {
                    if (!it.next().p()) {
                        z13 = false;
                        break;
                    }
                }
            }
            if (z13 && dimensionBehaviourZ == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f18356a.x1(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar2 = this.f18356a;
                dVar2.W1(e(dVar2, 0));
                androidx.constraintlayout.core.widgets.d dVar3 = this.f18356a;
                dVar3.f18260e.f18322e.e(dVar3.j0());
            }
            if (z13 && dimensionBehaviourZ2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f18356a.S1(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar4 = this.f18356a;
                dVar4.s1(e(dVar4, 1));
                androidx.constraintlayout.core.widgets.d dVar5 = this.f18356a;
                dVar5.f18262f.f18322e.e(dVar5.D());
            }
        }
        androidx.constraintlayout.core.widgets.d dVar6 = this.f18356a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar6.f18255b0[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour2 == dimensionBehaviour3 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int iJ0 = dVar6.j0() + iL0;
            this.f18356a.f18260e.f18326i.e(iJ0);
            this.f18356a.f18260e.f18322e.e(iJ0 - iL0);
            s();
            androidx.constraintlayout.core.widgets.d dVar7 = this.f18356a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar7.f18255b0[1];
            if (dimensionBehaviour4 == dimensionBehaviour3 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iD = dVar7.D() + iM0;
                this.f18356a.f18262f.f18326i.e(iD);
                this.f18356a.f18262f.f18322e.e(iD - iM0);
            }
            s();
            z11 = true;
        } else {
            z11 = false;
        }
        for (WidgetRun widgetRun : this.f18360e) {
            if (widgetRun.f18319b != this.f18356a || widgetRun.f18324g) {
                widgetRun.e();
            }
        }
        for (WidgetRun widgetRun2 : this.f18360e) {
            if (z11 || widgetRun2.f18319b != this.f18356a) {
                if (!widgetRun2.f18325h.f18315j || ((!widgetRun2.f18326i.f18315j && !(widgetRun2 instanceof i)) || (!widgetRun2.f18322e.f18315j && !(widgetRun2 instanceof c) && !(widgetRun2 instanceof i)))) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f18356a.x1(dimensionBehaviourZ);
        this.f18356a.S1(dimensionBehaviourZ2);
        return z12;
    }

    public boolean h(boolean z10) {
        if (this.f18357b) {
            for (ConstraintWidget constraintWidget : this.f18356a.f18505z1) {
                constraintWidget.q();
                constraintWidget.f18252a = false;
                k kVar = constraintWidget.f18260e;
                kVar.f18322e.f18315j = false;
                kVar.f18324g = false;
                kVar.n();
                m mVar = constraintWidget.f18262f;
                mVar.f18322e.f18315j = false;
                mVar.f18324g = false;
                mVar.n();
            }
            this.f18356a.q();
            androidx.constraintlayout.core.widgets.d dVar = this.f18356a;
            dVar.f18252a = false;
            k kVar2 = dVar.f18260e;
            kVar2.f18322e.f18315j = false;
            kVar2.f18324g = false;
            kVar2.n();
            m mVar2 = this.f18356a.f18262f;
            mVar2.f18322e.f18315j = false;
            mVar2.f18324g = false;
            mVar2.n();
            c();
        }
        if (b(this.f18359d)) {
            return false;
        }
        this.f18356a.Z1(0);
        this.f18356a.a2(0);
        this.f18356a.f18260e.f18325h.e(0);
        this.f18356a.f18262f.f18325h.e(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    public boolean i(boolean z10, int i10) {
        boolean z11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z12 = true;
        boolean z13 = z10 & true;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourZ = this.f18356a.z(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourZ2 = this.f18356a.z(1);
        int iL0 = this.f18356a.l0();
        int iM0 = this.f18356a.m0();
        if (z13 && (dimensionBehaviourZ == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviourZ2 == dimensionBehaviour)) {
            for (WidgetRun widgetRun : this.f18360e) {
                if (widgetRun.f18323f == i10 && !widgetRun.p()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && dimensionBehaviourZ == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.f18356a.x1(ConstraintWidget.DimensionBehaviour.FIXED);
                    androidx.constraintlayout.core.widgets.d dVar = this.f18356a;
                    dVar.W1(e(dVar, 0));
                    androidx.constraintlayout.core.widgets.d dVar2 = this.f18356a;
                    dVar2.f18260e.f18322e.e(dVar2.j0());
                }
            } else if (z13 && dimensionBehaviourZ2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f18356a.S1(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar3 = this.f18356a;
                dVar3.s1(e(dVar3, 1));
                androidx.constraintlayout.core.widgets.d dVar4 = this.f18356a;
                dVar4.f18262f.f18322e.e(dVar4.D());
            }
        }
        if (i10 == 0) {
            androidx.constraintlayout.core.widgets.d dVar5 = this.f18356a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar5.f18255b0[0];
            if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iJ0 = dVar5.j0() + iL0;
                this.f18356a.f18260e.f18326i.e(iJ0);
                this.f18356a.f18260e.f18322e.e(iJ0 - iL0);
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            androidx.constraintlayout.core.widgets.d dVar6 = this.f18356a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dVar6.f18255b0[1];
            if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iD = dVar6.D() + iM0;
                this.f18356a.f18262f.f18326i.e(iD);
                this.f18356a.f18262f.f18322e.e(iD - iM0);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        s();
        for (WidgetRun widgetRun2 : this.f18360e) {
            if (widgetRun2.f18323f == i10 && (widgetRun2.f18319b != this.f18356a || widgetRun2.f18324g)) {
                widgetRun2.e();
            }
        }
        for (WidgetRun widgetRun3 : this.f18360e) {
            if (widgetRun3.f18323f == i10 && (z11 || widgetRun3.f18319b != this.f18356a)) {
                if (!widgetRun3.f18325h.f18315j || !widgetRun3.f18326i.f18315j || (!(widgetRun3 instanceof c) && !widgetRun3.f18322e.f18315j)) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f18356a.x1(dimensionBehaviourZ);
        this.f18356a.S1(dimensionBehaviourZ2);
        return z12;
    }

    public void o() {
        this.f18357b = true;
    }

    public void p() {
        this.f18358c = true;
    }

    public void s() {
        f fVar;
        for (ConstraintWidget constraintWidget : this.f18356a.f18505z1) {
            if (!constraintWidget.f18252a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f18255b0;
                boolean z10 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i10 = constraintWidget.f18296w;
                int i11 = constraintWidget.f18298x;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z11 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i10 == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                f fVar2 = constraintWidget.f18260e.f18322e;
                boolean z12 = fVar2.f18315j;
                f fVar3 = constraintWidget.f18262f.f18322e;
                boolean z13 = fVar3.f18315j;
                if (z12 && z13) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    r(constraintWidget, dimensionBehaviour4, fVar2.f18312g, dimensionBehaviour4, fVar3.f18312g);
                    constraintWidget.f18252a = true;
                } else if (z12 && z10) {
                    r(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, fVar2.f18312g, dimensionBehaviour3, fVar3.f18312g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f18262f.f18322e.f18365m = constraintWidget.D();
                    } else {
                        constraintWidget.f18262f.f18322e.e(constraintWidget.D());
                        constraintWidget.f18252a = true;
                    }
                } else if (z13 && z11) {
                    r(constraintWidget, dimensionBehaviour3, fVar2.f18312g, ConstraintWidget.DimensionBehaviour.FIXED, fVar3.f18312g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f18260e.f18322e.f18365m = constraintWidget.j0();
                    } else {
                        constraintWidget.f18260e.f18322e.e(constraintWidget.j0());
                        constraintWidget.f18252a = true;
                    }
                }
                if (constraintWidget.f18252a && (fVar = constraintWidget.f18262f.f18388l) != null) {
                    fVar.e(constraintWidget.t());
                }
            }
        }
    }

    public void u(b.InterfaceC0110b interfaceC0110b) {
        this.f18362g = interfaceC0110b;
    }
}
