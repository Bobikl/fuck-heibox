package com.eclipsesource.v8;

/* JADX INFO: loaded from: classes6.dex */
public class V8TypedArray extends V8Array {

    public static class V8ArrayData {
        private V8ArrayBuffer buffer;
        private int offset;
        private int size;
        private int type;

        public V8ArrayData(V8ArrayBuffer v8ArrayBuffer, int i10, int i11, int i12) {
            this.buffer = v8ArrayBuffer;
            this.offset = i10;
            this.size = i11;
            this.type = i12;
        }
    }

    private V8TypedArray(V8 v10) {
        super(v10);
    }

    public V8TypedArray(V8 v10, V8ArrayBuffer v8ArrayBuffer, int i10, int i11, int i12) {
        super(v10, new V8ArrayData(v8ArrayBuffer, i11, i12, i10));
    }

    private void checkArrayProperties(V8ArrayData v8ArrayData) {
        checkOffset(v8ArrayData);
        checkSize(v8ArrayData);
    }

    private void checkOffset(V8ArrayData v8ArrayData) {
        if (v8ArrayData.offset % getStructureSize(v8ArrayData.type) == 0) {
            return;
        }
        throw new IllegalStateException("RangeError: Start offset of Int32Array must be a multiple of " + getStructureSize(v8ArrayData.type));
    }

    private void checkSize(V8ArrayData v8ArrayData) {
        if (v8ArrayData.size < 0) {
            throw new IllegalStateException("RangeError: Invalid typed array length");
        }
        if ((v8ArrayData.size * getStructureSize(v8ArrayData.type)) + v8ArrayData.offset > v8ArrayData.buffer.limit()) {
            throw new IllegalStateException("RangeError: Invalid typed array length");
        }
    }

    private long createTypedArray(long j10, V8ArrayData v8ArrayData) {
        int i10 = v8ArrayData.type;
        if (i10 == 1) {
            return this.f42406v8.initNewV8Int32Array(j10, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
        }
        if (i10 == 2) {
            return this.f42406v8.initNewV8Float64Array(j10, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
        }
        if (i10 == 9) {
            return this.f42406v8.initNewV8Int8Array(j10, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
        }
        switch (i10) {
            case 11:
                return this.f42406v8.initNewV8UInt8Array(j10, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
            case 12:
                return this.f42406v8.initNewV8UInt8ClampedArray(j10, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
            case 13:
                return this.f42406v8.initNewV8Int16Array(j10, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
            case 14:
                return this.f42406v8.initNewV8UInt16Array(j10, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
            case 15:
                return this.f42406v8.initNewV8UInt32Array(j10, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
            case 16:
                return this.f42406v8.initNewV8Float32Array(j10, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
            default:
                throw new IllegalArgumentException("Cannot create a typed array of type " + V8Value.getStringRepresentation(v8ArrayData.type));
        }
    }

    public static int getStructureSize(int i10) {
        if (i10 == 1) {
            return 4;
        }
        if (i10 == 2) {
            return 8;
        }
        if (i10 != 9) {
            switch (i10) {
                case 11:
                case 12:
                    break;
                case 13:
                case 14:
                    return 2;
                case 15:
                case 16:
                    return 4;
                default:
                    throw new IllegalArgumentException("Cannot create a typed array of type " + V8Value.getStringRepresentation(i10));
            }
        }
        return 1;
    }

    @Override // com.eclipsesource.v8.V8Array, com.eclipsesource.v8.V8Object, com.eclipsesource.v8.V8Value
    protected V8Value createTwin() {
        this.f42406v8.checkThread();
        checkReleased();
        return new V8TypedArray(this.f42406v8);
    }

    @Override // com.eclipsesource.v8.V8Array
    public Object get(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        int type = getType();
        if (type != 1 && type != 2) {
            if (type == 9) {
                return Byte.valueOf(((Number) super.get(i10)).byteValue());
            }
            switch (type) {
                case 11:
                    return Short.valueOf((short) (((Number) super.get(i10)).shortValue() & 255));
                case 12:
                    return Short.valueOf((short) (((Number) super.get(i10)).byteValue() & 255));
                case 13:
                    return Short.valueOf(((Number) super.get(i10)).shortValue());
                case 14:
                    return Integer.valueOf(((Integer) super.get(i10)).intValue() & 65535);
                case 15:
                    return Long.valueOf((-1) & ((Number) super.get(i10)).longValue());
                case 16:
                    return Float.valueOf(((Number) super.get(i10)).floatValue());
                default:
                    return null;
            }
        }
        return super.get(i10);
    }

    public V8ArrayBuffer getBuffer() {
        return (V8ArrayBuffer) get("buffer");
    }

    @Override // com.eclipsesource.v8.V8Array, com.eclipsesource.v8.V8Value
    protected void initialize(long j10, Object obj) {
        this.f42406v8.checkThread();
        if (obj == null) {
            super.initialize(j10, obj);
            return;
        }
        V8ArrayData v8ArrayData = (V8ArrayData) obj;
        checkArrayProperties(v8ArrayData);
        long jCreateTypedArray = createTypedArray(j10, v8ArrayData);
        this.released = false;
        addObjectReference(jCreateTypedArray);
    }
}
