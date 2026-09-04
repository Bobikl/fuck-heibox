package androidx.work;

import com.umeng.analytics.pro.ak;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ArrayCreatingInputMerger.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u001e\u0010\u000b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0016\u0010\u000f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¨\u0006\u0012"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Landroidx/work/k;", "", "array1", "array2", "d", "array", "obj", "Ljava/lang/Class;", "valueClass", ak.aF, "e", "", "Landroidx/work/e;", "inputs", "b", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class ArrayCreatingInputMerger extends k {
    private final Object c(Object array, Object obj, Class<?> valueClass) {
        int length = Array.getLength(array);
        Object newArray = Array.newInstance(valueClass, length + 1);
        System.arraycopy(array, 0, newArray, 0, length);
        Array.set(newArray, length, obj);
        f0.o(newArray, "newArray");
        return newArray;
    }

    private final Object d(Object array1, Object array2) {
        int length = Array.getLength(array1);
        int length2 = Array.getLength(array2);
        Class<?> componentType = array1.getClass().getComponentType();
        f0.m(componentType);
        Object newArray = Array.newInstance(componentType, length + length2);
        System.arraycopy(array1, 0, newArray, 0, length);
        System.arraycopy(array2, 0, newArray, length, length2);
        f0.o(newArray, "newArray");
        return newArray;
    }

    private final Object e(Object obj, Class<?> valueClass) {
        Object newArray = Array.newInstance(valueClass, 1);
        Array.set(newArray, 0, obj);
        f0.o(newArray, "newArray");
        return newArray;
    }

    @Override // androidx.work.k
    @dl.d
    public e b(@dl.d List<e> inputs) throws Throwable {
        f0.p(inputs, "inputs");
        e.a aVar = new e.a();
        HashMap map = new HashMap();
        Iterator<e> it = inputs.iterator();
        while (it.hasNext()) {
            Map<String, Object> mapX = it.next().x();
            f0.o(mapX, "input.keyValueMap");
            for (Map.Entry<String, Object> entry : mapX.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(key);
                f0.o(key, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (f0.g(cls2, cls)) {
                        f0.o(value, "value");
                        value = d(obj, value);
                    } else {
                        if (!f0.g(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        value = c(obj, value, cls);
                    }
                } else if (!cls.isArray()) {
                    value = e(value, cls);
                }
                f0.o(value, "if (existingValue == nul…      }\n                }");
                map.put(key, value);
            }
        }
        aVar.d(map);
        e eVarA = aVar.a();
        f0.o(eVarA, "output.build()");
        return eVarA;
    }
}
