package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;

/* JADX INFO: loaded from: classes6.dex */
public class ObjectMirror extends ValueMirror {
    private static final String PROPERTIES = "properties";
    private static final String PROPERTY_NAMES = "propertyNames";

    public enum PropertyKind {
        Named(1),
        Indexed(2);

        int index;

        PropertyKind(int i10) {
            this.index = i10;
        }
    }

    ObjectMirror(V8Object v8Object) {
        super(v8Object);
    }

    public PropertiesArray getProperties(PropertyKind propertyKind, int i10) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(propertyKind.index);
        v8Array.push(i10);
        V8Array v8ArrayExecuteArrayFunction = null;
        try {
            v8ArrayExecuteArrayFunction = this.v8Object.executeArrayFunction(PROPERTIES, v8Array);
            return new PropertiesArray(v8ArrayExecuteArrayFunction);
        } finally {
            v8Array.close();
            if (v8ArrayExecuteArrayFunction != null && !v8ArrayExecuteArrayFunction.isReleased()) {
                v8ArrayExecuteArrayFunction.close();
            }
        }
    }

    public String[] getPropertyNames(PropertyKind propertyKind, int i10) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(propertyKind.index);
        v8Array.push(i10);
        V8Array v8ArrayExecuteArrayFunction = null;
        try {
            v8ArrayExecuteArrayFunction = this.v8Object.executeArrayFunction(PROPERTY_NAMES, v8Array);
            int length = v8ArrayExecuteArrayFunction.length();
            String[] strArr = new String[length];
            for (int i11 = 0; i11 < length; i11++) {
                strArr[i11] = v8ArrayExecuteArrayFunction.getString(i11);
            }
            v8Array.close();
            v8ArrayExecuteArrayFunction.close();
            return strArr;
        } catch (Throwable th2) {
            v8Array.close();
            if (v8ArrayExecuteArrayFunction != null) {
                v8ArrayExecuteArrayFunction.close();
            }
            throw th2;
        }
    }

    @Override // com.eclipsesource.v8.debug.mirror.Mirror
    public boolean isObject() {
        return true;
    }

    @Override // com.eclipsesource.v8.debug.mirror.Mirror
    public String toString() {
        return this.v8Object.toString();
    }
}
