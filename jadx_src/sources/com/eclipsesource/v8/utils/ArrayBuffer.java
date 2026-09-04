package com.eclipsesource.v8.utils;

import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8ArrayBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class ArrayBuffer {
    private V8ArrayBuffer arrayBuffer;

    public ArrayBuffer(V8 v10, ByteBuffer byteBuffer) {
        V8ArrayBuffer v8ArrayBuffer = new V8ArrayBuffer(v10, byteBuffer);
        try {
            this.arrayBuffer = (V8ArrayBuffer) v8ArrayBuffer.twin().setWeak();
        } finally {
            v8ArrayBuffer.close();
        }
    }

    ArrayBuffer(V8ArrayBuffer v8ArrayBuffer) {
        this.arrayBuffer = (V8ArrayBuffer) v8ArrayBuffer.twin().setWeak();
    }

    public V8ArrayBuffer getV8ArrayBuffer() {
        return this.arrayBuffer.twin();
    }

    public boolean isAvailable() {
        return !this.arrayBuffer.isReleased();
    }
}
