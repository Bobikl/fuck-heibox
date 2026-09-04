package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class OperatorChecks extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final OperatorChecks f128208a = new OperatorChecks();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final List<Checks> f128209b;

    static {
        kotlin.reflect.jvm.internal.impl.name.f fVar = o.f128260k;
        j.b bVar = j.b.f128242b;
        f[] fVarArr = {bVar, new p.a(1)};
        kotlin.reflect.jvm.internal.impl.name.f fVar2 = o.f128261l;
        f[] fVarArr2 = {bVar, new p.a(2)};
        kotlin.reflect.jvm.internal.impl.name.f fVar3 = o.f128251b;
        l lVar = l.f128244a;
        i iVar = i.f128238a;
        kotlin.reflect.jvm.internal.impl.name.f fVar4 = o.f128257h;
        p.d dVar = p.d.f128280b;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.f128216d;
        kotlin.reflect.jvm.internal.impl.name.f fVar5 = o.f128259j;
        p.c cVar = p.c.f128279b;
        f128209b = CollectionsKt__CollectionsKt.L(new Checks(fVar, fVarArr, (yh.l) null, 4, (u) null), new Checks(fVar2, fVarArr2, new yh.l<w, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$1
            /* JADX WARN: Code duplicated, block: B:12:0x002a  */
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@dl.d w $receiver) {
                boolean z10;
                f0.p($receiver, "$this$$receiver");
                List<b1> valueParameters = $receiver.i();
                f0.o(valueParameters, "valueParameters");
                b1 b1Var = (b1) CollectionsKt___CollectionsKt.q3(valueParameters);
                if (b1Var != null) {
                    z10 = !DescriptorUtilsKt.c(b1Var) && b1Var.F0() == null;
                }
                OperatorChecks operatorChecks = OperatorChecks.f128208a;
                if (z10) {
                    return null;
                }
                return "last parameter should not have a default value or be a vararg";
            }
        }), new Checks(fVar3, new f[]{bVar, lVar, new p.a(2), iVar}, (yh.l) null, 4, (u) null), new Checks(o.f128252c, new f[]{bVar, lVar, new p.a(3), iVar}, (yh.l) null, 4, (u) null), new Checks(o.f128253d, new f[]{bVar, lVar, new p.b(2), iVar}, (yh.l) null, 4, (u) null), new Checks(o.f128258i, new f[]{bVar}, (yh.l) null, 4, (u) null), new Checks(fVar4, new f[]{bVar, dVar, lVar, returnsBoolean}, (yh.l) null, 4, (u) null), new Checks(fVar5, new f[]{bVar, cVar}, (yh.l) null, 4, (u) null), new Checks(o.f128262m, new f[]{bVar, cVar}, (yh.l) null, 4, (u) null), new Checks(o.f128263n, new f[]{bVar, cVar, returnsBoolean}, (yh.l) null, 4, (u) null), new Checks(o.I, new f[]{bVar, dVar, lVar}, (yh.l) null, 4, (u) null), new Checks(o.J, new f[]{bVar, dVar, lVar}, (yh.l) null, 4, (u) null), new Checks(o.f128254e, new f[]{j.a.f128241b}, new yh.l<w, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2
            private static final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
                return (kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) && kotlin.reflect.jvm.internal.impl.builtins.g.a0((kotlin.reflect.jvm.internal.impl.descriptors.d) kVar);
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@dl.d w $receiver) {
                boolean z10;
                f0.p($receiver, "$this$$receiver");
                OperatorChecks operatorChecks = OperatorChecks.f128208a;
                kotlin.reflect.jvm.internal.impl.descriptors.k containingDeclaration = $receiver.c();
                f0.o(containingDeclaration, "containingDeclaration");
                boolean z11 = true;
                if (!b(containingDeclaration)) {
                    Collection<? extends w> overriddenDescriptors = $receiver.f();
                    f0.o(overriddenDescriptors, "overriddenDescriptors");
                    if (!overriddenDescriptors.isEmpty()) {
                        Iterator<T> it = overriddenDescriptors.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z10 = false;
                                break;
                            }
                            kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = ((w) it.next()).c();
                            f0.o(kVarC, "it.containingDeclaration");
                            if (b(kVarC)) {
                                z10 = true;
                                break;
                            }
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                    if (!z10) {
                        z11 = false;
                    }
                }
                if (z11) {
                    return null;
                }
                return "must override ''equals()'' in Any";
            }
        }), new Checks(o.f128256g, new f[]{bVar, ReturnsCheck.ReturnsInt.f128218d, dVar, lVar}, (yh.l) null, 4, (u) null), new Checks(o.S, new f[]{bVar, dVar, lVar}, (yh.l) null, 4, (u) null), new Checks(o.R, new f[]{bVar, cVar}, (yh.l) null, 4, (u) null), new Checks(CollectionsKt__CollectionsKt.L(o.f128273x, o.f128274y), new f[]{bVar}, new yh.l<w, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$3
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@dl.d w $receiver) {
                boolean zP;
                f0.p($receiver, "$this$$receiver");
                r0 r0VarI0 = $receiver.i0();
                if (r0VarI0 == null) {
                    r0VarI0 = $receiver.l0();
                }
                OperatorChecks operatorChecks = OperatorChecks.f128208a;
                boolean z10 = false;
                if (r0VarI0 != null) {
                    d0 returnType = $receiver.getReturnType();
                    if (returnType != null) {
                        d0 type = r0VarI0.getType();
                        f0.o(type, "receiver.type");
                        zP = TypeUtilsKt.p(returnType, type);
                    } else {
                        zP = false;
                    }
                    if (zP || operatorChecks.d($receiver, r0VarI0)) {
                        z10 = true;
                    }
                }
                if (z10) {
                    return null;
                }
                return "receiver must be a supertype of the return type";
            }
        }), new Checks(o.T, new f[]{bVar, ReturnsCheck.ReturnsUnit.f128220d, dVar, lVar}, (yh.l) null, 4, (u) null), new Checks(o.f128265p, new f[]{bVar, cVar}, (yh.l) null, 4, (u) null));
    }

    private OperatorChecks() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(w wVar, r0 r0Var) {
        kotlin.reflect.jvm.internal.impl.name.b bVarK;
        d0 returnType;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h value = r0Var.getValue();
        f0.o(value, "receiver.value");
        if (!(value instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarO = ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e) value).o();
        if (!dVarO.w0() || (bVarK = DescriptorUtilsKt.k(dVarO)) == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarB = FindClassInModuleKt.b(DescriptorUtilsKt.p(dVarO), bVarK);
        if (!(fVarB instanceof x0)) {
            fVarB = null;
        }
        x0 x0Var = (x0) fVarB;
        if (x0Var == null || (returnType = wVar.getReturnType()) == null) {
            return false;
        }
        return TypeUtilsKt.p(returnType, x0Var.f0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.b
    @dl.d
    public List<Checks> b() {
        return f128209b;
    }
}
