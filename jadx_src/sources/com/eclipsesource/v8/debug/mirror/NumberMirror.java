package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;

/* JADX INFO: loaded from: classes6.dex */
public class NumberMirror extends ValueMirror {
    NumberMirror(V8Object v8Object) {
        super(v8Object);
    }

    @Override // com.eclipsesource.v8.debug.mirror.Mirror
    public boolean isNumber() {
        return true;
    }

    @Override // com.eclipsesource.v8.debug.mirror.Mirror
    public String toString() {
        return this.v8Object.executeStringFunction("toText", null);
    }
}
