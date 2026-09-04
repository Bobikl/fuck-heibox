package com.eclipsesource.v8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public class V8ArrayBuffer extends V8Value {
    ByteBuffer byteBuffer;

    public V8ArrayBuffer(V8 v10, int i10) {
        super(v10);
        initialize(v10.getV8RuntimePtr(), Integer.valueOf(i10));
        ByteBuffer byteBufferCreateV8ArrayBufferBackingStore = v10.createV8ArrayBufferBackingStore(v10.getV8RuntimePtr(), this.objectHandle, i10);
        this.byteBuffer = byteBufferCreateV8ArrayBufferBackingStore;
        byteBufferCreateV8ArrayBufferBackingStore.order(ByteOrder.nativeOrder());
    }

    public V8ArrayBuffer(V8 v10, ByteBuffer byteBuffer) {
        super(v10);
        byteBuffer = byteBuffer == null ? ByteBuffer.allocateDirect(0) : byteBuffer;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
        }
        initialize(v10.getV8RuntimePtr(), byteBuffer);
        this.byteBuffer = byteBuffer;
        byteBuffer.order(ByteOrder.nativeOrder());
    }

    public final byte[] array() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.array();
    }

    public final int arrayOffset() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.arrayOffset();
    }

    public final int capacity() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.capacity();
    }

    public final V8ArrayBuffer clear() {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.clear();
        return this;
    }

    public V8ArrayBuffer compact() {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.compact();
        return this;
    }

    @Override // com.eclipsesource.v8.V8Value
    protected V8Value createTwin() {
        return new V8ArrayBuffer(this.f42406v8, this.byteBuffer);
    }

    public int doubleLimit() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.asDoubleBuffer().limit();
    }

    public final V8ArrayBuffer flip() {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.flip();
        return this;
    }

    public int floatLimit() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.asFloatBuffer().limit();
    }

    public byte get() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.get();
    }

    public byte get(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.get(i10);
    }

    public V8ArrayBuffer get(byte[] bArr) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.get(bArr);
        return this;
    }

    public V8ArrayBuffer get(byte[] bArr, int i10, int i11) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.get(bArr, i10, i11);
        return this;
    }

    public char getChar() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.getChar();
    }

    public char getChar(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.getChar(i10);
    }

    public double getDouble() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.getDouble();
    }

    public double getDouble(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.getDouble(i10);
    }

    public float getFloat() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.getFloat();
    }

    public float getFloat(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.getFloat(i10);
    }

    public int getInt() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.getInt();
    }

    public int getInt(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.getInt(i10);
    }

    public long getLong() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.getLong();
    }

    public long getLong(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.getLong(i10);
    }

    public short getShort() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.getShort();
    }

    public short getShort(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.getShort(i10);
    }

    public final boolean hasArray() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.hasArray();
    }

    public final boolean hasRemaining() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.hasRemaining();
    }

    @Override // com.eclipsesource.v8.V8Value
    protected void initialize(long j10, Object obj) {
        this.f42406v8.checkThread();
        if (obj instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            int iLimit = byteBuffer.limit();
            V8 v10 = this.f42406v8;
            this.objectHandle = v10.initNewV8ArrayBuffer(v10.getV8RuntimePtr(), byteBuffer, iLimit);
        } else {
            int iIntValue = ((Integer) obj).intValue();
            V8 v11 = this.f42406v8;
            this.objectHandle = v11.initNewV8ArrayBuffer(v11.getV8RuntimePtr(), iIntValue);
        }
        this.released = false;
        addObjectReference(this.objectHandle);
    }

    public int intLimit() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.asIntBuffer().limit();
    }

    public boolean isDirect() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.isDirect();
    }

    public boolean isReadOnly() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.isReadOnly();
    }

    public int limit() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.limit();
    }

    public final V8ArrayBuffer limit(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.limit(i10);
        return this;
    }

    public final V8ArrayBuffer mark() {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.mark();
        return this;
    }

    public final V8ArrayBuffer order(ByteOrder byteOrder) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.order(byteOrder);
        return this;
    }

    public final ByteOrder order() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.order();
    }

    public final int position() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.position();
    }

    public final V8ArrayBuffer position(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.position(i10);
        return this;
    }

    public V8ArrayBuffer put(byte b10) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.put(b10);
        return this;
    }

    public V8ArrayBuffer put(int i10, byte b10) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.put(i10, b10);
        return this;
    }

    public V8ArrayBuffer put(ByteBuffer byteBuffer) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.put(byteBuffer);
        return this;
    }

    public final V8ArrayBuffer put(byte[] bArr) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.put(bArr);
        return this;
    }

    public V8ArrayBuffer put(byte[] bArr, int i10, int i11) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.put(bArr, i10, i11);
        return this;
    }

    public V8ArrayBuffer putChar(char c10) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.putChar(c10);
        return this;
    }

    public V8ArrayBuffer putChar(int i10, char c10) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.putChar(i10, c10);
        return this;
    }

    public V8ArrayBuffer putDouble(double d10) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.putDouble(d10);
        return this;
    }

    public V8ArrayBuffer putDouble(int i10, double d10) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.putDouble(i10, d10);
        return this;
    }

    public V8ArrayBuffer putFloat(float f10) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.putFloat(f10);
        return this;
    }

    public V8ArrayBuffer putFloat(int i10, float f10) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.putFloat(i10, f10);
        return this;
    }

    public V8ArrayBuffer putInt(int i10) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.putInt(i10);
        return this;
    }

    public V8ArrayBuffer putInt(int i10, int i11) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.asIntBuffer().put(i10, i11);
        return this;
    }

    public V8ArrayBuffer putLong(int i10, long j10) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.putLong(i10, j10);
        return this;
    }

    public V8ArrayBuffer putLong(long j10) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.putLong(j10);
        return this;
    }

    public V8ArrayBuffer putShort(int i10, short s10) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.putShort(i10, s10);
        return this;
    }

    public V8ArrayBuffer putShort(short s10) {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.putShort(s10);
        return this;
    }

    public final int remaining() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.remaining();
    }

    public final V8ArrayBuffer reset() {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.reset();
        return this;
    }

    public final V8ArrayBuffer rewind() {
        this.f42406v8.checkThread();
        checkReleased();
        this.byteBuffer.rewind();
        return this;
    }

    public int shortLimit() {
        this.f42406v8.checkThread();
        checkReleased();
        return this.byteBuffer.asShortBuffer().limit();
    }

    @Override // com.eclipsesource.v8.V8Value
    public V8ArrayBuffer twin() {
        this.f42406v8.checkThread();
        checkReleased();
        return (V8ArrayBuffer) super.twin();
    }
}
