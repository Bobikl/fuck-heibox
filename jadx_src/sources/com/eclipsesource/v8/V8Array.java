package com.eclipsesource.v8;

import bb.c;

/* JADX INFO: loaded from: classes6.dex */
public class V8Array extends V8Object {

    public static class Undefined extends V8Array {
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
        public int executeIntegerFunction(String str, V8Array v8Array) {
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

        @Override // com.eclipsesource.v8.V8Array
        public Object get(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public V8Array getArray(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public V8Array getArray(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public boolean getBoolean(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public boolean getBoolean(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public int getBooleans(int i10, int i11, boolean[] zArr) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public boolean[] getBooleans(int i10, int i11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public byte getByte(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public int getBytes(int i10, int i11, byte[] bArr) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public byte[] getBytes(int i10, int i11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public double getDouble(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public double getDouble(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public int getDoubles(int i10, int i11, double[] dArr) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public double[] getDoubles(int i10, int i11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public int getInteger(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public int getInteger(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public int getIntegers(int i10, int i11, int[] iArr) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public int[] getIntegers(int i10, int i11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public String[] getKeys() {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public V8Object getObject(int i10) {
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

        @Override // com.eclipsesource.v8.V8Array
        public String getString(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Object
        public String getString(String str) throws V8ResultUndefined {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public int getStrings(int i10, int i11, String[] strArr) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public String[] getStrings(int i10, int i11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public int getType() {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public int getType(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public int getType(int i10, int i11) {
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

        @Override // com.eclipsesource.v8.V8Array
        public int length() {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public V8Array push(double d10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public V8Array push(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public V8Array push(V8Value v8Value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public V8Array push(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public V8Array push(boolean z10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.eclipsesource.v8.V8Array
        public V8Array pushUndefined() {
            throw new UnsupportedOperationException();
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

        @Override // com.eclipsesource.v8.V8Array, com.eclipsesource.v8.V8Object
        public String toString() {
            return "undefined";
        }

        @Override // com.eclipsesource.v8.V8Array, com.eclipsesource.v8.V8Object, com.eclipsesource.v8.V8Value
        public Undefined twin() {
            return (Undefined) super.twin();
        }
    }

    protected V8Array() {
    }

    public V8Array(V8 v10) {
        super(v10);
        v10.checkThread();
    }

    protected V8Array(V8 v10, Object obj) {
        super(v10, obj);
    }

    @Override // com.eclipsesource.v8.V8Object, com.eclipsesource.v8.V8Value
    protected V8Value createTwin() {
        return new V8Array(this.f42406v8);
    }

    public Object get(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.arrayGet(v10.getV8RuntimePtr(), 6, this.objectHandle, i10);
    }

    public V8Array getArray(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        Object objArrayGet = v10.arrayGet(v10.getV8RuntimePtr(), 5, this.objectHandle, i10);
        if (objArrayGet == null || (objArrayGet instanceof V8Array)) {
            return (V8Array) objArrayGet;
        }
        throw new V8ResultUndefined();
    }

    public boolean getBoolean(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.arrayGetBoolean(v10.getV8RuntimePtr(), getHandle(), i10);
    }

    public int getBooleans(int i10, int i11, boolean[] zArr) {
        this.f42406v8.checkThread();
        checkReleased();
        if (i11 > zArr.length) {
            throw new IndexOutOfBoundsException();
        }
        V8 v10 = this.f42406v8;
        return v10.arrayGetBooleans(v10.getV8RuntimePtr(), getHandle(), i10, i11, zArr);
    }

    public boolean[] getBooleans(int i10, int i11) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.arrayGetBooleans(v10.getV8RuntimePtr(), getHandle(), i10, i11);
    }

    public byte getByte(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.arrayGetByte(v10.getV8RuntimePtr(), getHandle(), i10);
    }

    public int getBytes(int i10, int i11, byte[] bArr) {
        this.f42406v8.checkThread();
        checkReleased();
        if (i11 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        V8 v10 = this.f42406v8;
        return v10.arrayGetBytes(v10.getV8RuntimePtr(), getHandle(), i10, i11, bArr);
    }

    public byte[] getBytes(int i10, int i11) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.arrayGetBytes(v10.getV8RuntimePtr(), getHandle(), i10, i11);
    }

    public double getDouble(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.arrayGetDouble(v10.getV8RuntimePtr(), getHandle(), i10);
    }

    public int getDoubles(int i10, int i11, double[] dArr) {
        this.f42406v8.checkThread();
        checkReleased();
        if (i11 > dArr.length) {
            throw new IndexOutOfBoundsException();
        }
        V8 v10 = this.f42406v8;
        return v10.arrayGetDoubles(v10.getV8RuntimePtr(), getHandle(), i10, i11, dArr);
    }

    public double[] getDoubles(int i10, int i11) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.arrayGetDoubles(v10.getV8RuntimePtr(), getHandle(), i10, i11);
    }

    public int getInteger(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.arrayGetInteger(v10.getV8RuntimePtr(), getHandle(), i10);
    }

    public int getIntegers(int i10, int i11, int[] iArr) {
        this.f42406v8.checkThread();
        checkReleased();
        if (i11 > iArr.length) {
            throw new IndexOutOfBoundsException();
        }
        V8 v10 = this.f42406v8;
        return v10.arrayGetIntegers(v10.getV8RuntimePtr(), getHandle(), i10, i11, iArr);
    }

    public int[] getIntegers(int i10, int i11) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.arrayGetIntegers(v10.getV8RuntimePtr(), getHandle(), i10, i11);
    }

    public V8Object getObject(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        Object objArrayGet = v10.arrayGet(v10.getV8RuntimePtr(), 6, this.objectHandle, i10);
        if (objArrayGet == null || (objArrayGet instanceof V8Object)) {
            return (V8Object) objArrayGet;
        }
        throw new V8ResultUndefined();
    }

    public String getString(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.arrayGetString(v10.getV8RuntimePtr(), getHandle(), i10);
    }

    public int getStrings(int i10, int i11, String[] strArr) {
        this.f42406v8.checkThread();
        checkReleased();
        if (i11 > strArr.length) {
            throw new IndexOutOfBoundsException();
        }
        V8 v10 = this.f42406v8;
        return v10.arrayGetStrings(v10.getV8RuntimePtr(), getHandle(), i10, i11, strArr);
    }

    public String[] getStrings(int i10, int i11) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.arrayGetStrings(v10.getV8RuntimePtr(), getHandle(), i10, i11);
    }

    public int getType() {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.getArrayType(v10.getV8RuntimePtr(), getHandle());
    }

    public int getType(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.getType(v10.getV8RuntimePtr(), getHandle(), i10);
    }

    public int getType(int i10, int i11) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.getType(v10.getV8RuntimePtr(), getHandle(), i10, i11);
    }

    @Override // com.eclipsesource.v8.V8Value
    protected void initialize(long j10, Object obj) {
        long jInitNewV8Array = this.f42406v8.initNewV8Array(j10);
        this.released = false;
        addObjectReference(jInitNewV8Array);
    }

    public int length() {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.arrayGetSize(v10.getV8RuntimePtr(), getHandle());
    }

    public V8Array push(double d10) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        v10.addArrayDoubleItem(v10.getV8RuntimePtr(), getHandle(), d10);
        return this;
    }

    public V8Array push(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        v10.addArrayIntItem(v10.getV8RuntimePtr(), getHandle(), i10);
        return this;
    }

    public V8Array push(V8Value v8Value) {
        this.f42406v8.checkThread();
        checkReleased();
        this.f42406v8.checkRuntime(v8Value);
        if (v8Value == null) {
            V8 v10 = this.f42406v8;
            v10.addArrayNullItem(v10.getV8RuntimePtr(), getHandle());
        } else if (v8Value.equals(V8.getUndefined())) {
            V8 v11 = this.f42406v8;
            v11.addArrayUndefinedItem(v11.getV8RuntimePtr(), getHandle());
        } else {
            V8 v12 = this.f42406v8;
            v12.addArrayObjectItem(v12.getV8RuntimePtr(), getHandle(), v8Value.getHandle());
        }
        return this;
    }

    public V8Array push(Object obj) {
        this.f42406v8.checkThread();
        checkReleased();
        if (obj instanceof V8Value) {
            this.f42406v8.checkRuntime((V8Value) obj);
        }
        if (obj == null) {
            V8 v10 = this.f42406v8;
            v10.addArrayNullItem(v10.getV8RuntimePtr(), getHandle());
        } else if (obj.equals(V8.getUndefined())) {
            V8 v11 = this.f42406v8;
            v11.addArrayUndefinedItem(v11.getV8RuntimePtr(), getHandle());
        } else if (obj instanceof Double) {
            V8 v12 = this.f42406v8;
            v12.addArrayDoubleItem(v12.getV8RuntimePtr(), getHandle(), ((Double) obj).doubleValue());
        } else if (obj instanceof Integer) {
            V8 v13 = this.f42406v8;
            v13.addArrayIntItem(v13.getV8RuntimePtr(), getHandle(), ((Integer) obj).intValue());
        } else if (obj instanceof Float) {
            V8 v14 = this.f42406v8;
            v14.addArrayDoubleItem(v14.getV8RuntimePtr(), getHandle(), ((Float) obj).doubleValue());
        } else if (obj instanceof Number) {
            V8 v15 = this.f42406v8;
            v15.addArrayDoubleItem(v15.getV8RuntimePtr(), getHandle(), ((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            V8 v16 = this.f42406v8;
            v16.addArrayBooleanItem(v16.getV8RuntimePtr(), getHandle(), ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            V8 v17 = this.f42406v8;
            v17.addArrayStringItem(v17.getV8RuntimePtr(), getHandle(), (String) obj);
        } else {
            if (!(obj instanceof V8Value)) {
                throw new IllegalArgumentException();
            }
            V8 v18 = this.f42406v8;
            v18.addArrayObjectItem(v18.getV8RuntimePtr(), getHandle(), ((V8Value) obj).getHandle());
        }
        return this;
    }

    public V8Array push(String str) {
        this.f42406v8.checkThread();
        checkReleased();
        if (str == null) {
            V8 v10 = this.f42406v8;
            v10.addArrayNullItem(v10.getV8RuntimePtr(), getHandle());
        } else if (str.equals(V8.getUndefined())) {
            V8 v11 = this.f42406v8;
            v11.addArrayUndefinedItem(v11.getV8RuntimePtr(), getHandle());
        } else {
            V8 v12 = this.f42406v8;
            v12.addArrayStringItem(v12.getV8RuntimePtr(), getHandle(), str);
        }
        return this;
    }

    public V8Array push(boolean z10) {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        v10.addArrayBooleanItem(v10.getV8RuntimePtr(), getHandle(), z10);
        return this;
    }

    public V8Array pushNull() {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        v10.addArrayNullItem(v10.getV8RuntimePtr(), getHandle());
        return this;
    }

    public V8Array pushUndefined() {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        v10.addArrayUndefinedItem(v10.getV8RuntimePtr(), getHandle());
        return this;
    }

    @Override // com.eclipsesource.v8.V8Object
    public String toString() {
        return (this.released || this.f42406v8.isReleased()) ? "[Array released]" : super.toString();
    }

    @Override // com.eclipsesource.v8.V8Object, com.eclipsesource.v8.V8Value
    public V8Array twin() {
        return (V8Array) super.twin();
    }
}
