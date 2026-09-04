package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: ConstantValueFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ConstantValueFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ConstantValueFactory f127518a = new ConstantValueFactory();

    private ConstantValueFactory() {
    }

    private final b a(List<?> list, final PrimitiveType primitiveType) {
        List listQ5 = CollectionsKt___CollectionsKt.Q5(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listQ5.iterator();
        while (it.hasNext()) {
            g<?> gVarC = c(it.next());
            if (gVarC != null) {
                arrayList.add(gVarC);
            }
        }
        return new b(arrayList, new yh.l<d0, kotlin.reflect.jvm.internal.impl.types.d0>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory$createArrayValue$3
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.types.d0 invoke(@dl.d d0 module) {
                f0.p(module, "module");
                j0 j0VarO = module.t().O(primitiveType);
                f0.o(j0VarO, "module.builtIns.getPrimi…KotlinType(componentType)");
                return j0VarO;
            }
        });
    }

    @dl.d
    public final b b(@dl.d List<? extends g<?>> value, @dl.d final kotlin.reflect.jvm.internal.impl.types.d0 type) {
        f0.p(value, "value");
        f0.p(type, "type");
        return new b(value, new yh.l<d0, kotlin.reflect.jvm.internal.impl.types.d0>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory$createArrayValue$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.types.d0 invoke(@dl.d d0 it) {
                f0.p(it, "it");
                return type;
            }
        });
    }

    @dl.e
    public final g<?> c(@dl.e Object obj) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new s(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new l(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new p(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new k(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new h(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new t((String) obj);
        }
        if (obj instanceof byte[]) {
            return a(ArraysKt___ArraysKt.ez((byte[]) obj), PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            return a(ArraysKt___ArraysKt.lz((short[]) obj), PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return a(ArraysKt___ArraysKt.iz((int[]) obj), PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return a(ArraysKt___ArraysKt.jz((long[]) obj), PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            return a(ArraysKt___ArraysKt.fz((char[]) obj), PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            return a(ArraysKt___ArraysKt.hz((float[]) obj), PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            return a(ArraysKt___ArraysKt.gz((double[]) obj), PrimitiveType.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return a(ArraysKt___ArraysKt.mz((boolean[]) obj), PrimitiveType.BOOLEAN);
        }
        if (obj == null) {
            return new q();
        }
        return null;
    }
}
