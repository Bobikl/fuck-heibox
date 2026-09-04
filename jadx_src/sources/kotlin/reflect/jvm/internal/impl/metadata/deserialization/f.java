package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: protoTypeTableUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    @dl.e
    public static final ProtoBuf.Type a(@dl.d ProtoBuf.Type type, @dl.d g typeTable) {
        f0.p(type, "<this>");
        f0.p(typeTable, "typeTable");
        if (type.k0()) {
            return type.S();
        }
        if (type.l0()) {
            return typeTable.a(type.T());
        }
        return null;
    }

    @dl.d
    public static final List<ProtoBuf.Type> b(@dl.d ProtoBuf.Class r10, @dl.d g typeTable) {
        f0.p(r10, "<this>");
        f0.p(typeTable, "typeTable");
        List<ProtoBuf.Type> listY0 = r10.y0();
        if (!(!listY0.isEmpty())) {
            listY0 = null;
        }
        if (listY0 == null) {
            List<Integer> contextReceiverTypeIdList = r10.x0();
            f0.o(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            listY0 = new ArrayList<>(t.Y(contextReceiverTypeIdList, 10));
            for (Integer it : contextReceiverTypeIdList) {
                f0.o(it, "it");
                listY0.add(typeTable.a(it.intValue()));
            }
        }
        return listY0;
    }

    @dl.d
    public static final List<ProtoBuf.Type> c(@dl.d ProtoBuf.Function function, @dl.d g typeTable) {
        f0.p(function, "<this>");
        f0.p(typeTable, "typeTable");
        List<ProtoBuf.Type> listZ = function.Z();
        if (!(!listZ.isEmpty())) {
            listZ = null;
        }
        if (listZ == null) {
            List<Integer> contextReceiverTypeIdList = function.Y();
            f0.o(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            listZ = new ArrayList<>(t.Y(contextReceiverTypeIdList, 10));
            for (Integer it : contextReceiverTypeIdList) {
                f0.o(it, "it");
                listZ.add(typeTable.a(it.intValue()));
            }
        }
        return listZ;
    }

    @dl.d
    public static final List<ProtoBuf.Type> d(@dl.d ProtoBuf.Property property, @dl.d g typeTable) {
        f0.p(property, "<this>");
        f0.p(typeTable, "typeTable");
        List<ProtoBuf.Type> listY = property.Y();
        if (!(!listY.isEmpty())) {
            listY = null;
        }
        if (listY == null) {
            List<Integer> contextReceiverTypeIdList = property.X();
            f0.o(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            listY = new ArrayList<>(t.Y(contextReceiverTypeIdList, 10));
            for (Integer it : contextReceiverTypeIdList) {
                f0.o(it, "it");
                listY.add(typeTable.a(it.intValue()));
            }
        }
        return listY;
    }

    @dl.d
    public static final ProtoBuf.Type e(@dl.d ProtoBuf.TypeAlias typeAlias, @dl.d g typeTable) {
        f0.p(typeAlias, "<this>");
        f0.p(typeTable, "typeTable");
        if (typeAlias.e0()) {
            ProtoBuf.Type expandedType = typeAlias.U();
            f0.o(expandedType, "expandedType");
            return expandedType;
        }
        if (typeAlias.f0()) {
            return typeTable.a(typeAlias.V());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
    }

    @dl.e
    public static final ProtoBuf.Type f(@dl.d ProtoBuf.Type type, @dl.d g typeTable) {
        f0.p(type, "<this>");
        f0.p(typeTable, "typeTable");
        if (type.p0()) {
            return type.c0();
        }
        if (type.q0()) {
            return typeTable.a(type.d0());
        }
        return null;
    }

    public static final boolean g(@dl.d ProtoBuf.Function function) {
        f0.p(function, "<this>");
        return function.w0() || function.x0();
    }

    public static final boolean h(@dl.d ProtoBuf.Property property) {
        f0.p(property, "<this>");
        return property.t0() || property.u0();
    }

    @dl.e
    public static final ProtoBuf.Type i(@dl.d ProtoBuf.Class r10, @dl.d g typeTable) {
        f0.p(r10, "<this>");
        f0.p(typeTable, "typeTable");
        if (r10.p1()) {
            return r10.K0();
        }
        if (r10.q1()) {
            return typeTable.a(r10.L0());
        }
        return null;
    }

    @dl.e
    public static final ProtoBuf.Type j(@dl.d ProtoBuf.Type type, @dl.d g typeTable) {
        f0.p(type, "<this>");
        f0.p(typeTable, "typeTable");
        if (type.s0()) {
            return type.f0();
        }
        if (type.t0()) {
            return typeTable.a(type.g0());
        }
        return null;
    }

    @dl.e
    public static final ProtoBuf.Type k(@dl.d ProtoBuf.Function function, @dl.d g typeTable) {
        f0.p(function, "<this>");
        f0.p(typeTable, "typeTable");
        if (function.w0()) {
            return function.g0();
        }
        if (function.x0()) {
            return typeTable.a(function.h0());
        }
        return null;
    }

    @dl.e
    public static final ProtoBuf.Type l(@dl.d ProtoBuf.Property property, @dl.d g typeTable) {
        f0.p(property, "<this>");
        f0.p(typeTable, "typeTable");
        if (property.t0()) {
            return property.f0();
        }
        if (property.u0()) {
            return typeTable.a(property.g0());
        }
        return null;
    }

    @dl.d
    public static final ProtoBuf.Type m(@dl.d ProtoBuf.Function function, @dl.d g typeTable) {
        f0.p(function, "<this>");
        f0.p(typeTable, "typeTable");
        if (function.y0()) {
            ProtoBuf.Type returnType = function.i0();
            f0.o(returnType, "returnType");
            return returnType;
        }
        if (function.z0()) {
            return typeTable.a(function.j0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    @dl.d
    public static final ProtoBuf.Type n(@dl.d ProtoBuf.Property property, @dl.d g typeTable) {
        f0.p(property, "<this>");
        f0.p(typeTable, "typeTable");
        if (property.v0()) {
            ProtoBuf.Type returnType = property.h0();
            f0.o(returnType, "returnType");
            return returnType;
        }
        if (property.w0()) {
            return typeTable.a(property.i0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    @dl.d
    public static final List<ProtoBuf.Type> o(@dl.d ProtoBuf.Class r10, @dl.d g typeTable) {
        f0.p(r10, "<this>");
        f0.p(typeTable, "typeTable");
        List<ProtoBuf.Type> listB1 = r10.b1();
        if (!(!listB1.isEmpty())) {
            listB1 = null;
        }
        if (listB1 == null) {
            List<Integer> supertypeIdList = r10.a1();
            f0.o(supertypeIdList, "supertypeIdList");
            listB1 = new ArrayList<>(t.Y(supertypeIdList, 10));
            for (Integer it : supertypeIdList) {
                f0.o(it, "it");
                listB1.add(typeTable.a(it.intValue()));
            }
        }
        return listB1;
    }

    @dl.e
    public static final ProtoBuf.Type p(@dl.d ProtoBuf.Type.Argument argument, @dl.d g typeTable) {
        f0.p(argument, "<this>");
        f0.p(typeTable, "typeTable");
        if (argument.C()) {
            return argument.z();
        }
        if (argument.D()) {
            return typeTable.a(argument.A());
        }
        return null;
    }

    @dl.d
    public static final ProtoBuf.Type q(@dl.d ProtoBuf.ValueParameter valueParameter, @dl.d g typeTable) {
        f0.p(valueParameter, "<this>");
        f0.p(typeTable, "typeTable");
        if (valueParameter.T()) {
            ProtoBuf.Type type = valueParameter.N();
            f0.o(type, "type");
            return type;
        }
        if (valueParameter.U()) {
            return typeTable.a(valueParameter.O());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }

    @dl.d
    public static final ProtoBuf.Type r(@dl.d ProtoBuf.TypeAlias typeAlias, @dl.d g typeTable) {
        f0.p(typeAlias, "<this>");
        f0.p(typeTable, "typeTable");
        if (typeAlias.i0()) {
            ProtoBuf.Type underlyingType = typeAlias.b0();
            f0.o(underlyingType, "underlyingType");
            return underlyingType;
        }
        if (typeAlias.j0()) {
            return typeTable.a(typeAlias.c0());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
    }

    @dl.d
    public static final List<ProtoBuf.Type> s(@dl.d ProtoBuf.TypeParameter typeParameter, @dl.d g typeTable) {
        f0.p(typeParameter, "<this>");
        f0.p(typeTable, "typeTable");
        List<ProtoBuf.Type> listT = typeParameter.T();
        if (!(!listT.isEmpty())) {
            listT = null;
        }
        if (listT == null) {
            List<Integer> upperBoundIdList = typeParameter.S();
            f0.o(upperBoundIdList, "upperBoundIdList");
            listT = new ArrayList<>(t.Y(upperBoundIdList, 10));
            for (Integer it : upperBoundIdList) {
                f0.o(it, "it");
                listT.add(typeTable.a(it.intValue()));
            }
        }
        return listT;
    }

    @dl.e
    public static final ProtoBuf.Type t(@dl.d ProtoBuf.ValueParameter valueParameter, @dl.d g typeTable) {
        f0.p(valueParameter, "<this>");
        f0.p(typeTable, "typeTable");
        if (valueParameter.V()) {
            return valueParameter.P();
        }
        if (valueParameter.W()) {
            return typeTable.a(valueParameter.Q());
        }
        return null;
    }
}
