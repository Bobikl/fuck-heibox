package com.alibaba.fastjson.asm;

import androidx.exifinterface.media.a;
import com.meituan.robust.Constants;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import okhttp3.t;

/* JADX INFO: loaded from: classes6.dex */
public class TypeCollector {
    private static final Map<String, String> primitives = new HashMap<String, String>() { // from class: com.alibaba.fastjson.asm.TypeCollector.1
        {
            put(Constants.INT, "I");
            put("boolean", "Z");
            put(Constants.BYTE, "B");
            put(Constants.CHAR, "C");
            put(Constants.SHORT, a.R4);
            put("float", "F");
            put(Constants.LONG, "J");
            put(Constants.DOUBLE, "D");
        }
    };
    protected MethodCollector collector = null;
    protected boolean jsonType;
    private final String methodName;
    private final Class<?>[] parameterTypes;

    public TypeCollector(String str, Class<?>[] clsArr) {
        this.methodName = str;
        this.parameterTypes = clsArr;
    }

    private boolean correctTypeName(Type type, String str) {
        String className = type.getClassName();
        String str2 = "";
        while (className.endsWith(t.f132643o)) {
            str2 = str2 + Constants.ARRAY_TYPE;
            className = className.substring(0, className.length() - 2);
        }
        if (!str2.equals("")) {
            Map<String, String> map = primitives;
            if (map.containsKey(className)) {
                className = str2 + map.get(className);
            } else {
                className = str2 + "L" + className + ";";
            }
        }
        return className.equals(str);
    }

    public String[] getParameterNamesForMethod() {
        MethodCollector methodCollector = this.collector;
        return (methodCollector == null || !methodCollector.debugInfoPresent) ? new String[0] : methodCollector.getResult().split(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
    }

    public boolean hasJsonType() {
        return this.jsonType;
    }

    public boolean matched() {
        return this.collector != null;
    }

    public void visitAnnotation(String str) {
        if ("Lcom/alibaba/fastjson/annotation/JSONType;".equals(str)) {
            this.jsonType = true;
        }
    }

    protected MethodCollector visitMethod(int i10, String str, String str2) {
        if (this.collector != null || !str.equals(this.methodName)) {
            return null;
        }
        Type[] argumentTypes = Type.getArgumentTypes(str2);
        int i11 = 0;
        for (Type type : argumentTypes) {
            String className = type.getClassName();
            if (className.equals(Constants.LONG) || className.equals(Constants.DOUBLE)) {
                i11++;
            }
        }
        if (argumentTypes.length != this.parameterTypes.length) {
            return null;
        }
        for (int i12 = 0; i12 < argumentTypes.length; i12++) {
            if (!correctTypeName(argumentTypes[i12], this.parameterTypes[i12].getName())) {
                return null;
            }
        }
        MethodCollector methodCollector = new MethodCollector(!Modifier.isStatic(i10) ? 1 : 0, argumentTypes.length + i11);
        this.collector = methodCollector;
        return methodCollector;
    }
}
