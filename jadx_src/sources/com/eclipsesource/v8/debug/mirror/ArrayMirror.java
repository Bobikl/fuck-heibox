package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;

/* JADX INFO: loaded from: classes6.dex */
public class ArrayMirror extends ObjectMirror {
    private static final String LENGTH = "length";

    ArrayMirror(V8Object v8Object) {
        super(v8Object);
    }

    @Override // com.eclipsesource.v8.debug.mirror.Mirror
    public boolean isArray() {
        return true;
    }

    public int length() {
        return this.v8Object.executeIntegerFunction("length", null);
    }
}
