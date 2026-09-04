package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: AbstractTypeChecker.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f128052a = new c();

    private c() {
    }

    private final boolean c(TypeCheckerState typeCheckerState, si.i iVar, si.m mVar) {
        si.p pVarJ = typeCheckerState.j();
        if (pVarJ.x0(iVar)) {
            return true;
        }
        if (pVarJ.F(iVar)) {
            return false;
        }
        if (typeCheckerState.n() && pVarJ.g0(iVar)) {
            return true;
        }
        return pVarJ.w0(pVarJ.g(iVar), mVar);
    }

    private final boolean e(TypeCheckerState typeCheckerState, si.i iVar, si.i iVar2) {
        si.p pVarJ = typeCheckerState.j();
        if (AbstractTypeChecker.f127959b) {
            if (!pVarJ.b(iVar) && !pVarJ.Y(pVarJ.g(iVar))) {
                typeCheckerState.l(iVar);
            }
            if (!pVarJ.b(iVar2)) {
                typeCheckerState.l(iVar2);
            }
        }
        if (pVarJ.F(iVar2) || pVarJ.H(iVar) || pVarJ.s(iVar)) {
            return true;
        }
        if ((iVar instanceof si.b) && pVarJ.K((si.b) iVar)) {
            return true;
        }
        c cVar = f128052a;
        if (cVar.a(typeCheckerState, iVar, TypeCheckerState.b.C1180b.f128026a)) {
            return true;
        }
        if (pVarJ.H(iVar2) || cVar.a(typeCheckerState, iVar2, TypeCheckerState.b.d.f128028a) || pVarJ.W(iVar)) {
            return false;
        }
        return cVar.b(typeCheckerState, iVar, pVarJ.g(iVar2));
    }

    public final boolean a(@dl.d TypeCheckerState typeCheckerState, @dl.d si.i type, @dl.d TypeCheckerState.b supertypesPolicy) {
        kotlin.jvm.internal.f0.p(typeCheckerState, "<this>");
        kotlin.jvm.internal.f0.p(type, "type");
        kotlin.jvm.internal.f0.p(supertypesPolicy, "supertypesPolicy");
        si.p pVarJ = typeCheckerState.j();
        if (!((pVarJ.W(type) && !pVarJ.F(type)) || pVarJ.H(type))) {
            typeCheckerState.k();
            ArrayDeque<si.i> arrayDequeH = typeCheckerState.h();
            kotlin.jvm.internal.f0.m(arrayDequeH);
            Set<si.i> setI = typeCheckerState.i();
            kotlin.jvm.internal.f0.m(setI);
            arrayDequeH.push(type);
            while (!arrayDequeH.isEmpty()) {
                if (setI.size() > 1000) {
                    throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + CollectionsKt___CollectionsKt.h3(setI, null, null, null, 0, null, null, 63, null)).toString());
                }
                si.i current = arrayDequeH.pop();
                kotlin.jvm.internal.f0.o(current, "current");
                if (setI.add(current)) {
                    TypeCheckerState.b bVar = pVarJ.F(current) ? TypeCheckerState.b.c.f128027a : supertypesPolicy;
                    if (!(!kotlin.jvm.internal.f0.g(bVar, TypeCheckerState.b.c.f128027a))) {
                        bVar = null;
                    }
                    if (bVar == null) {
                        continue;
                    } else {
                        si.p pVarJ2 = typeCheckerState.j();
                        Iterator<si.g> it = pVarJ2.E(pVarJ2.g(current)).iterator();
                        while (it.hasNext()) {
                            si.i iVarA = bVar.a(typeCheckerState, it.next());
                            if ((pVarJ.W(iVarA) && !pVarJ.F(iVarA)) || pVarJ.H(iVarA)) {
                                typeCheckerState.e();
                            } else {
                                arrayDequeH.add(iVarA);
                            }
                        }
                    }
                }
            }
            typeCheckerState.e();
            return false;
        }
        return true;
    }

    public final boolean b(@dl.d TypeCheckerState state, @dl.d si.i start, @dl.d si.m end) {
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(start, "start");
        kotlin.jvm.internal.f0.p(end, "end");
        si.p pVarJ = state.j();
        if (f128052a.c(state, start, end)) {
            return true;
        }
        state.k();
        ArrayDeque<si.i> arrayDequeH = state.h();
        kotlin.jvm.internal.f0.m(arrayDequeH);
        Set<si.i> setI = state.i();
        kotlin.jvm.internal.f0.m(setI);
        arrayDequeH.push(start);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + start + ". Supertypes = " + CollectionsKt___CollectionsKt.h3(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            si.i current = arrayDequeH.pop();
            kotlin.jvm.internal.f0.o(current, "current");
            if (setI.add(current)) {
                TypeCheckerState.b bVar = pVarJ.F(current) ? TypeCheckerState.b.c.f128027a : TypeCheckerState.b.C1180b.f128026a;
                if (!(!kotlin.jvm.internal.f0.g(bVar, TypeCheckerState.b.c.f128027a))) {
                    bVar = null;
                }
                if (bVar == null) {
                    continue;
                } else {
                    si.p pVarJ2 = state.j();
                    Iterator<si.g> it = pVarJ2.E(pVarJ2.g(current)).iterator();
                    while (it.hasNext()) {
                        si.i iVarA = bVar.a(state, it.next());
                        if (f128052a.c(state, iVarA, end)) {
                            state.e();
                            return true;
                        }
                        arrayDequeH.add(iVarA);
                    }
                }
            }
        }
        state.e();
        return false;
    }

    public final boolean d(@dl.d TypeCheckerState state, @dl.d si.i subType, @dl.d si.i superType) {
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(subType, "subType");
        kotlin.jvm.internal.f0.p(superType, "superType");
        return e(state, subType, superType);
    }
}
