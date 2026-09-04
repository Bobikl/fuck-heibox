package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;

/* JADX INFO: loaded from: classes6.dex */
public class FunctionMirror extends ObjectMirror {
    private static final String NAME = "name";
    private static final String SCRIPT = "script";

    FunctionMirror(V8Object v8Object) {
        super(v8Object);
    }

    public String getName() {
        return this.v8Object.executeStringFunction("name", null);
    }

    public String getScriptName() {
        V8Object v8ObjectExecuteObjectFunction = this.v8Object.executeObjectFunction("script", null);
        try {
            return v8ObjectExecuteObjectFunction.executeStringFunction("name", null);
        } finally {
            v8ObjectExecuteObjectFunction.close();
        }
    }

    @Override // com.eclipsesource.v8.debug.mirror.Mirror
    public boolean isFunction() {
        return true;
    }
}
