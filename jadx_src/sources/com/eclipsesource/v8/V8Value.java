package com.eclipsesource.v8;

/* JADX INFO: loaded from: classes6.dex */
public abstract class V8Value implements Releasable {
    public static final int BOOLEAN = 3;
    public static final int BYTE = 9;
    public static final int DOUBLE = 2;
    public static final int FLOAT_32_ARRAY = 16;
    public static final int FLOAT_64_ARRAY = 2;
    public static final int INTEGER = 1;
    public static final int INT_16_ARRAY = 13;
    public static final int INT_32_ARRAY = 1;
    public static final int INT_8_ARRAY = 9;
    public static final int NULL = 0;
    public static final int STRING = 4;
    public static final int UNDEFINED = 99;
    public static final int UNKNOWN = 0;
    public static final int UNSIGNED_INT_16_ARRAY = 14;
    public static final int UNSIGNED_INT_32_ARRAY = 15;
    public static final int UNSIGNED_INT_8_ARRAY = 11;
    public static final int UNSIGNED_INT_8_CLAMPED_ARRAY = 12;
    public static final int V8_ARRAY = 5;
    public static final int V8_ARRAY_BUFFER = 10;
    public static final int V8_FUNCTION = 7;
    public static final int V8_OBJECT = 6;
    public static final int V8_TYPED_ARRAY = 8;
    protected long objectHandle;
    protected boolean released = true;

    /* JADX INFO: renamed from: v8, reason: collision with root package name */
    protected V8 f42406v8;

    protected V8Value() {
    }

    protected V8Value(V8 v10) {
        if (v10 == null) {
            this.f42406v8 = (V8) this;
        } else {
            this.f42406v8 = v10;
        }
    }

    @Deprecated
    public static String getStringRepresentaion(int i10) {
        return getStringRepresentation(i10);
    }

    public static String getStringRepresentation(int i10) {
        if (i10 == 99) {
            return "Undefined";
        }
        switch (i10) {
            case 0:
                return "Null";
            case 1:
                return "Integer";
            case 2:
                return "Double";
            case 3:
                return "Boolean";
            case 4:
                return "String";
            case 5:
                return "V8Array";
            case 6:
                return "V8Object";
            case 7:
                return "V8Function";
            case 8:
                return "V8TypedArray";
            case 9:
                return "Byte";
            case 10:
                return "V8ArrayBuffer";
            case 11:
                return "UInt8Array";
            case 12:
                return "UInt8ClampedArray";
            case 13:
                return "Int16Array";
            case 14:
                return "UInt16Array";
            case 15:
                return "UInt32Array";
            case 16:
                return "Float32Array";
            default:
                throw new IllegalArgumentException("Invalid V8 type: " + i10);
        }
    }

    protected void addObjectReference(long j10) throws Error {
        this.objectHandle = j10;
        try {
            this.f42406v8.addObjRef(this);
        } catch (Error e10) {
            release();
            throw e10;
        } catch (RuntimeException e11) {
            release();
            throw e11;
        }
    }

    protected void checkReleased() {
        if (this.released) {
            throw new IllegalStateException("Object released");
        }
    }

    public V8Value clearWeak() {
        this.f42406v8.checkThread();
        this.f42406v8.checkReleased();
        this.f42406v8.v8WeakReferences.remove(Long.valueOf(getHandle()));
        V8 v10 = this.f42406v8;
        v10.clearWeak(v10.getV8RuntimePtr(), getHandle());
        return this;
    }

    @Override // com.eclipsesource.v8.Releasable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f42406v8.checkThread();
        if (this.released) {
            return;
        }
        try {
            this.f42406v8.releaseObjRef(this);
        } finally {
            this.released = true;
            V8 v10 = this.f42406v8;
            v10.release(v10.getV8RuntimePtr(), this.objectHandle);
        }
    }

    protected abstract V8Value createTwin();

    public boolean equals(Object obj) {
        return strictEquals(obj);
    }

    public String getConstructorName() {
        this.f42406v8.checkThread();
        this.f42406v8.checkReleased();
        V8 v10 = this.f42406v8;
        return v10.getConstructorName(v10.getV8RuntimePtr(), this.objectHandle);
    }

    protected long getHandle() {
        checkReleased();
        return this.objectHandle;
    }

    public V8 getRuntime() {
        return this.f42406v8;
    }

    public int getV8Type() {
        if (isUndefined()) {
            return 99;
        }
        this.f42406v8.checkThread();
        this.f42406v8.checkReleased();
        V8 v10 = this.f42406v8;
        return v10.getType(v10.getV8RuntimePtr(), this.objectHandle);
    }

    public int hashCode() {
        this.f42406v8.checkThread();
        checkReleased();
        V8 v10 = this.f42406v8;
        return v10.identityHash(v10.getV8RuntimePtr(), getHandle());
    }

    protected void initialize(long j10, Object obj) {
        long jInitNewV8Object = this.f42406v8.initNewV8Object(j10);
        this.released = false;
        addObjectReference(jInitNewV8Object);
    }

    public boolean isReleased() {
        return this.released;
    }

    public boolean isUndefined() {
        return false;
    }

    public boolean isWeak() {
        this.f42406v8.checkThread();
        this.f42406v8.checkReleased();
        V8 v10 = this.f42406v8;
        return v10.isWeak(v10.getV8RuntimePtr(), getHandle());
    }

    public boolean jsEquals(Object obj) {
        this.f42406v8.checkThread();
        checkReleased();
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof V8Value)) {
            return false;
        }
        if (isUndefined() && ((V8Value) obj).isUndefined()) {
            return true;
        }
        V8Value v8Value = (V8Value) obj;
        if (v8Value.isUndefined()) {
            return false;
        }
        V8 v10 = this.f42406v8;
        return v10.equals(v10.getV8RuntimePtr(), getHandle(), v8Value.getHandle());
    }

    @Override // com.eclipsesource.v8.Releasable
    @Deprecated
    public void release() {
        close();
    }

    public V8Value setWeak() {
        this.f42406v8.checkThread();
        this.f42406v8.checkReleased();
        this.f42406v8.v8WeakReferences.put(Long.valueOf(getHandle()), this);
        V8 v10 = this.f42406v8;
        v10.setWeak(v10.getV8RuntimePtr(), getHandle());
        return this;
    }

    public boolean strictEquals(Object obj) {
        this.f42406v8.checkThread();
        checkReleased();
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof V8Value)) {
            return false;
        }
        if (isUndefined() && ((V8Value) obj).isUndefined()) {
            return true;
        }
        V8Value v8Value = (V8Value) obj;
        if (v8Value.isUndefined()) {
            return false;
        }
        V8 v10 = this.f42406v8;
        return v10.strictEquals(v10.getV8RuntimePtr(), getHandle(), v8Value.getHandle());
    }

    public V8Value twin() {
        if (isUndefined()) {
            return this;
        }
        this.f42406v8.checkThread();
        this.f42406v8.checkReleased();
        V8Value v8ValueCreateTwin = createTwin();
        this.f42406v8.createTwin(this, v8ValueCreateTwin);
        return v8ValueCreateTwin;
    }
}
