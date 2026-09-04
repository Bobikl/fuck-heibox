package v4;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements i, j {
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    @Override // v4.j
    public final Object a(Object obj) throws IllegalAccessException {
        Object objB;
        TreeMap treeMap = new TreeMap();
        Class<?> superclass = obj.getClass();
        while (true) {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (superclass.equals(Object.class)) {
                return treeMap;
            }
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    if (field == null || "this$0".equals(field.getName())) {
                        objB = null;
                    } else {
                        boolean zIsAccessible = field.isAccessible();
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        if (obj2 == null) {
                            objB = null;
                        } else {
                            field.setAccessible(zIsAccessible);
                            objB = f.b(obj2);
                        }
                    }
                    if (objB != null) {
                        treeMap.put(field.getName(), objB);
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
    }

    @Override // v4.i
    public final Object a(Object obj, Type type) throws IllegalAccessException, InstantiationException {
        if (!obj.getClass().equals(org.json.alipay.b.class)) {
            return null;
        }
        org.json.alipay.b bVar = (org.json.alipay.b) obj;
        Class superclass = (Class) type;
        Object objNewInstance = superclass.newInstance();
        while (!superclass.equals(Object.class)) {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    String name = field.getName();
                    Type genericType = field.getGenericType();
                    if (bVar.b(name)) {
                        field.setAccessible(true);
                        field.set(objNewInstance, e.a(bVar.a(name), genericType));
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
        return objNewInstance;
    }

    @Override // v4.i, v4.j
    public final boolean a(Class<?> cls) {
        return true;
    }
}
