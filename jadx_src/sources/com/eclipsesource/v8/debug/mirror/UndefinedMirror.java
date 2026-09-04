package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;

/* JADX INFO: loaded from: classes6.dex */
public class UndefinedMirror extends ValueMirror {
    UndefinedMirror(V8Object v8Object) {
        super(v8Object);
    }

    @Override // com.eclipsesource.v8.debug.mirror.Mirror
    public boolean isUndefined() {
        return true;
    }

    @Override // com.eclipsesource.v8.debug.mirror.Mirror
    public String toString() {
        return "undefined";
    }
}
