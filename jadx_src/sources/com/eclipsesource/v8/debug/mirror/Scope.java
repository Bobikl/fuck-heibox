package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8Value;

/* JADX INFO: loaded from: classes6.dex */
public class Scope extends Mirror {
    private static final String SCOPE_OBJECT = "scopeObject";
    private static final String SCOPE_TYPE = "scopeType";
    private static final String SET_VARIABLE_VALUE = "setVariableValue";

    public enum ScopeType {
        Global(0),
        Local(1),
        With(2),
        Closure(3),
        Catch(4),
        Block(5),
        Script(6);

        int index;

        ScopeType(int i10) {
            this.index = i10;
        }
    }

    Scope(V8Object v8Object) {
        super(v8Object);
    }

    public ObjectMirror getScopeObject() {
        V8Object v8ObjectExecuteObjectFunction = null;
        try {
            v8ObjectExecuteObjectFunction = this.v8Object.executeObjectFunction(SCOPE_OBJECT, null);
            return (ObjectMirror) Mirror.createMirror(v8ObjectExecuteObjectFunction);
        } finally {
            if (v8ObjectExecuteObjectFunction != null) {
                v8ObjectExecuteObjectFunction.close();
            }
        }
    }

    public ScopeType getType() {
        return ScopeType.values()[this.v8Object.executeIntegerFunction(SCOPE_TYPE, null)];
    }

    public void setVariableValue(String str, double d10) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(str);
        v8Array.push(d10);
        try {
            this.v8Object.executeVoidFunction(SET_VARIABLE_VALUE, v8Array);
        } finally {
            v8Array.close();
        }
    }

    public void setVariableValue(String str, int i10) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(str);
        v8Array.push(i10);
        try {
            this.v8Object.executeVoidFunction(SET_VARIABLE_VALUE, v8Array);
        } finally {
            v8Array.close();
        }
    }

    public void setVariableValue(String str, V8Value v8Value) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(str);
        v8Array.push(v8Value);
        try {
            this.v8Object.executeVoidFunction(SET_VARIABLE_VALUE, v8Array);
        } finally {
            v8Array.close();
        }
    }

    public void setVariableValue(String str, String str2) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(str);
        v8Array.push(str2);
        try {
            this.v8Object.executeVoidFunction(SET_VARIABLE_VALUE, v8Array);
        } finally {
            v8Array.close();
        }
    }

    public void setVariableValue(String str, boolean z10) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(str);
        v8Array.push(z10);
        try {
            this.v8Object.executeVoidFunction(SET_VARIABLE_VALUE, v8Array);
        } finally {
            v8Array.close();
        }
    }
}
