package com.eclipsesource.v8;

import bb.c;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class V8Object extends V8Value {

    public static class Undefined extends V8Object {
        @Override // com.eclipsesource.v8.V8Object
        public V8Object add(String str, double d10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public V8Object add(String str, int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public V8Object add(String str, V8Value v8Value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public V8Object add(String str, String str2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public V8Object add(String str, boolean z10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public V8Object addUndefined(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Value, com.eclipsesource.v8.Releasable, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // com.eclipsesource.v8.V8Object
        public boolean contains(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Value
        public boolean equals(Object obj) {
            return (obj instanceof V8Object) && ((V8Object) obj).isUndefined();
        }

        @Override // com.eclipsesource.v8.V8Object
        public V8Array executeArrayFunction(String str, V8Array v8Array) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public boolean executeBooleanFunction(String str, V8Array v8Array) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public double executeDoubleFunction(String str, V8Array v8Array) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public Object executeFunction(String str, V8Array v8Array) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public int executeIntegerFunction(String str, V8Array v8Array) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public Object executeJSFunction(String str, Object... objArr) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public V8Object executeObjectFunction(String str, V8Array v8Array) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public String executeStringFunction(String str, V8Array v8Array) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public void executeVoidFunction(String str, V8Array v8Array) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public V8Array getArray(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public boolean getBoolean(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public double getDouble(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public int getInteger(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public String[] getKeys() {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public V8Object getObject(String str) throws V8ResultUndefined {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Value
        public V8 getRuntime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public String getString(String str) throws V8ResultUndefined {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public int getType(String str) throws V8ResultUndefined {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Value
        public int hashCode() {
            return c.b.Je;
        }

        @Override // com.eclipsesource.v8.V8Value
        public boolean isReleased() {
            return false;
        }

        @Override // com.eclipsesource.v8.V8Value
        public boolean isUndefined() {
            return true;
        }

        @Override // com.eclipsesource.v8.V8Object
        public V8Object registerJavaMethod(JavaCallback javaCallback, String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public V8Object registerJavaMethod(JavaVoidCallback javaVoidCallback, String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public V8Object registerJavaMethod(Object obj, String str, String str2, Class<?>[] clsArr, boolean z10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Value, com.eclipsesource.v8.Releasable
        @Deprecated
        public void release() {
        }

        @Override // com.eclipsesource.v8.V8Object
        public V8Object setPrototype(V8Object v8Object) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public String toString() {
            return "undefined";
        }

        @Override // com.eclipsesource.v8.V8Object, com.eclipsesource.v8.V8Value
        public Undefined twin() {
            return (Undefined) super.twin();
        }
    }

    protected V8Object() {
    }

    public V8Object(V8 v10) {
        this(v10, null);
    }

    protected V8Object(V8 v10, Object obj) {
        super(v10);
        if (v10 != null) {
            this.f42406v8.checkThread();
            initialize(this.f42406v8.getV8RuntimePtr(), obj);
        }
    }

    private void checkKey(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
    }

    public V8Object add(String str, double d10) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        v10.add(v10.getV8RuntimePtr(), this.objectHandle, str, d10);
        return this;
    }

    public V8Object add(String str, int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        v10.add(v10.getV8RuntimePtr(), this.objectHandle, str, i10);
        return this;
    }

    public V8Object add(String str, V8Value v8Value) {
        this.f42406v8.checkThread();
        checkReleased();
        this.f42406v8.checkRuntime(v8Value);
        if (v8Value == null) {
            V8 v10 = this.f42406v8;
            v10.addNull(v10.getV8RuntimePtr(), this.objectHandle, str);
        } else if (v8Value.equals(V8.getUndefined())) {
            V8 v11 = this.f42406v8;
            v11.addUndefined(v11.getV8RuntimePtr(), this.objectHandle, str);
        } else {
            V8 v12 = this.f42406v8;
            v12.addObject(v12.getV8RuntimePtr(), this.objectHandle, str, v8Value.getHandle());
        }
        return this;
    }

    public V8Object add(String str, String str2) {
        this.f42406v8.checkThread();
        checkReleased();
        if (str2 == null) {
            V8 v10 = this.f42406v8;
            v10.addNull(v10.getV8RuntimePtr(), this.objectHandle, str);
        } else if (str2.equals(V8.getUndefined())) {
            V8 v11 = this.f42406v8;
            v11.addUndefined(v11.getV8RuntimePtr(), this.objectHandle, str);
        } else {
            V8 v12 = this.f42406v8;
            v12.add(v12.getV8RuntimePtr(), this.objectHandle, str, str2);
        }
        return this;
    }

    public V8Object add(String str, boolean z10) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        v10.add(v10.getV8RuntimePtr(), this.objectHandle, str, z10);
        return this;
    }

    public V8Object addNull(String str) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        v10.addNull(v10.getV8RuntimePtr(), this.objectHandle, str);
        return this;
    }

    public V8Object addUndefined(String str) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        v10.addUndefined(v10.getV8RuntimePtr(), this.objectHandle, str);
        return this;
    }

    public boolean contains(String str) {
        this.f42406v8.checkThread();
        checkReleased();
        checkKey(str);
        V8 v10 = this.f42406v8;
        return v10.contains(v10.getV8RuntimePtr(), this.objectHandle, str);
    }

    @Override // com.eclipsesource.v8.V8Value
    protected V8Value createTwin() {
        return new V8Object(this.f42406v8);
    }

    public V8Array executeArrayFunction(String str, V8Array v8Array) {
        this.f42406v8.checkThread();
        checkReleased();
        this.f42406v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        V8 v10 = this.f42406v8;
        Object objExecuteFunction = v10.executeFunction(v10.getV8RuntimePtr(), 5, this.objectHandle, str, handle);
        if (objExecuteFunction instanceof V8Array) {
            return (V8Array) objExecuteFunction;
        }
        throw new V8ResultUndefined();
    }

    public boolean executeBooleanFunction(String str, V8Array v8Array) {
        this.f42406v8.checkThread();
        checkReleased();
        this.f42406v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        V8 v10 = this.f42406v8;
        return v10.executeBooleanFunction(v10.getV8RuntimePtr(), getHandle(), str, handle);
    }

    public double executeDoubleFunction(String str, V8Array v8Array) {
        this.f42406v8.checkThread();
        checkReleased();
        this.f42406v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        V8 v10 = this.f42406v8;
        return v10.executeDoubleFunction(v10.getV8RuntimePtr(), getHandle(), str, handle);
    }

    public Object executeFunction(String str, V8Array v8Array) {
        this.f42406v8.checkThread();
        checkReleased();
        this.f42406v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        V8 v10 = this.f42406v8;
        return v10.executeFunction(v10.getV8RuntimePtr(), 0, this.objectHandle, str, handle);
    }

    public int executeIntegerFunction(String str, V8Array v8Array) {
        this.f42406v8.checkThread();
        checkReleased();
        this.f42406v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        V8 v10 = this.f42406v8;
        return v10.executeIntegerFunction(v10.getV8RuntimePtr(), getHandle(), str, handle);
    }

    public Object executeJSFunction(String str) {
        return executeFunction(str, null);
    }

    public Object executeJSFunction(String str, Object... objArr) {
        if (objArr == null) {
            return executeFunction(str, null);
        }
        V8Array v8Array = new V8Array(this.f42406v8.getRuntime());
        try {
            for (Object obj : objArr) {
                if (obj == null) {
                    v8Array.pushNull();
                } else if (obj instanceof V8Value) {
                    v8Array.push((V8Value) obj);
                } else if (obj instanceof Integer) {
                    v8Array.push(obj);
                } else if (obj instanceof Double) {
                    v8Array.push(obj);
                } else if (obj instanceof Long) {
                    v8Array.push(((Long) obj).doubleValue());
                } else if (obj instanceof Float) {
                    v8Array.push(((Float) obj).floatValue());
                } else if (obj instanceof Boolean) {
                    v8Array.push(obj);
                } else {
                    if (!(obj instanceof String)) {
                        throw new IllegalArgumentException("Unsupported Object of type: " + obj.getClass());
                    }
                    v8Array.push((String) obj);
                }
            }
            Object objExecuteFunction = executeFunction(str, v8Array);
            v8Array.close();
            return objExecuteFunction;
        } catch (Throwable th2) {
            v8Array.close();
            throw th2;
        }
    }

    public V8Object executeObjectFunction(String str, V8Array v8Array) {
        this.f42406v8.checkThread();
        checkReleased();
        this.f42406v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        V8 v10 = this.f42406v8;
        Object objExecuteFunction = v10.executeFunction(v10.getV8RuntimePtr(), 6, this.objectHandle, str, handle);
        if (objExecuteFunction instanceof V8Object) {
            return (V8Object) objExecuteFunction;
        }
        throw new V8ResultUndefined();
    }

    public String executeStringFunction(String str, V8Array v8Array) {
        this.f42406v8.checkThread();
        checkReleased();
        this.f42406v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        V8 v10 = this.f42406v8;
        return v10.executeStringFunction(v10.getV8RuntimePtr(), getHandle(), str, handle);
    }

    public void executeVoidFunction(String str, V8Array v8Array) {
        this.f42406v8.checkThread();
        checkReleased();
        this.f42406v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        V8 v10 = this.f42406v8;
        v10.executeVoidFunction(v10.getV8RuntimePtr(), this.objectHandle, str, handle);
    }

    public Object get(String str) {
        this.f42406v8.checkThread();
        checkReleased();
        checkKey(str);
        V8 v10 = this.f42406v8;
        return v10.get(v10.getV8RuntimePtr(), 6, this.objectHandle, str);
    }

    public V8Array getArray(String str) {
        this.f42406v8.checkThread();
        checkReleased();
        checkKey(str);
        V8 v10 = this.f42406v8;
        Object obj = v10.get(v10.getV8RuntimePtr(), 5, this.objectHandle, str);
        if (obj == null || (obj instanceof V8Array)) {
            return (V8Array) obj;
        }
        throw new V8ResultUndefined();
    }

    public boolean getBoolean(String str) {
        this.f42406v8.checkThread();
        checkReleased();
        checkKey(str);
        V8 v10 = this.f42406v8;
        return v10.getBoolean(v10.getV8RuntimePtr(), this.objectHandle, str);
    }

    public double getDouble(String str) {
        this.f42406v8.checkThread();
        checkReleased();
        checkKey(str);
        V8 v10 = this.f42406v8;
        return v10.getDouble(v10.getV8RuntimePtr(), this.objectHandle, str);
    }

    public int getInteger(String str) {
        this.f42406v8.checkThread();
        checkReleased();
        checkKey(str);
        V8 v10 = this.f42406v8;
        return v10.getInteger(v10.getV8RuntimePtr(), this.objectHandle, str);
    }

    public String[] getKeys() {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.getKeys(v10.getV8RuntimePtr(), this.objectHandle);
    }

    public V8Object getObject(String str) {
        this.f42406v8.checkThread();
        checkReleased();
        checkKey(str);
        V8 v10 = this.f42406v8;
        Object obj = v10.get(v10.getV8RuntimePtr(), 6, this.objectHandle, str);
        if (obj == null || (obj instanceof V8Object)) {
            return (V8Object) obj;
        }
        throw new V8ResultUndefined();
    }

    public String getString(String str) {
        this.f42406v8.checkThread();
        checkReleased();
        checkKey(str);
        V8 v10 = this.f42406v8;
        return v10.getString(v10.getV8RuntimePtr(), this.objectHandle, str);
    }

    public int getType(String str) {
        this.f42406v8.checkThread();
        checkReleased();
        checkKey(str);
        V8 v10 = this.f42406v8;
        return v10.getType(v10.getV8RuntimePtr(), this.objectHandle, str);
    }

    public V8Object registerJavaMethod(JavaCallback javaCallback, String str) {
        this.f42406v8.checkThread();
        checkReleased();
        this.f42406v8.registerCallback(javaCallback, getHandle(), str);
        return this;
    }

    public V8Object registerJavaMethod(JavaVoidCallback javaVoidCallback, String str) {
        this.f42406v8.checkThread();
        checkReleased();
        this.f42406v8.registerVoidCallback(javaVoidCallback, getHandle(), str);
        return this;
    }

    public V8Object registerJavaMethod(Object obj, String str, String str2, Class<?>[] clsArr) {
        return registerJavaMethod(obj, str, str2, clsArr, false);
    }

    public V8Object registerJavaMethod(Object obj, String str, String str2, Class<?>[] clsArr, boolean z10) {
        this.f42406v8.checkThread();
        checkReleased();
        try {
            Method method = obj.getClass().getMethod(str, clsArr);
            method.setAccessible(true);
            this.f42406v8.registerCallback(obj, method, getHandle(), str2, z10);
            return this;
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException(e10);
        } catch (SecurityException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public V8Object setPrototype(V8Object v8Object) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        v10.setPrototype(v10.getV8RuntimePtr(), this.objectHandle, v8Object.getHandle());
        return this;
    }

    public String toString() {
        if (isReleased() || this.f42406v8.isReleased()) {
            return "[Object released]";
        }
        this.f42406v8.checkThread();
        V8 v10 = this.f42406v8;
        return v10.toString(v10.getV8RuntimePtr(), getHandle());
    }

    @Override // com.eclipsesource.v8.V8Value
    public V8Object twin() {
        return (V8Object) super.twin();
    }
}
