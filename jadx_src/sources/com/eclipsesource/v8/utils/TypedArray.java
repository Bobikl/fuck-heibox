package com.eclipsesource.v8.utils;

import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8ArrayBuffer;
import com.eclipsesource.v8.V8TypedArray;

/* JADX INFO: loaded from: classes6.dex */
public class TypedArray {
    private V8TypedArray typedArray;

    public TypedArray(V8 v10, ArrayBuffer arrayBuffer, int i10, int i11, int i12) {
        V8ArrayBuffer v8ArrayBuffer = arrayBuffer.getV8ArrayBuffer();
        V8TypedArray v8TypedArray = new V8TypedArray(v10, v8ArrayBuffer, i10, i11, i12);
        try {
            this.typedArray = (V8TypedArray) v8TypedArray.twin().setWeak();
        } finally {
            v8ArrayBuffer.close();
            v8TypedArray.close();
        }
    }

    TypedArray(V8TypedArray v8TypedArray) {
        this.typedArray = (V8TypedArray) v8TypedArray.twin().setWeak();
    }

    public V8TypedArray getV8TypedArray() {
        return (V8TypedArray) this.typedArray.twin();
    }

    public boolean isAvailable() {
        return !this.typedArray.isReleased();
    }
}
