package com.eclipsesource.v8;

/* JADX INFO: loaded from: classes6.dex */
public class V8Function extends V8Object {
    protected V8Function(V8 v10) {
        this(v10, null);
    }

    public V8Function(V8 v10, JavaCallback javaCallback) {
        super(v10, javaCallback);
    }

    public Object call(V8Object v8Object, V8Array v8Array) {
        this.f42406v8.checkThread();
        checkReleased();
        this.f42406v8.checkRuntime(v8Object);
        this.f42406v8.checkRuntime(v8Array);
        if (v8Object == null) {
            v8Object = this.f42406v8;
        }
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        if (v8Object.isUndefined()) {
            v8Object = this.f42406v8;
        }
        long handle2 = v8Object.getHandle();
        V8 v10 = this.f42406v8;
        return v10.executeFunction(v10.getV8RuntimePtr(), handle2, this.objectHandle, handle);
    }

    @Override // com.eclipsesource.v8.V8Object, com.eclipsesource.v8.V8Value
    protected V8Value createTwin() {
        return new V8Function(this.f42406v8);
    }

    @Override // com.eclipsesource.v8.V8Value
    protected void initialize(long j10, Object obj) {
        if (obj == null) {
            super.initialize(j10, null);
            return;
        }
        long[] jArrInitNewV8Function = this.f42406v8.initNewV8Function(j10);
        this.f42406v8.createAndRegisterMethodDescriptor((JavaCallback) obj, jArrInitNewV8Function[1]);
        this.released = false;
        addObjectReference(jArrInitNewV8Function[0]);
    }

    @Override // com.eclipsesource.v8.V8Object
    public String toString() {
        return (this.released || this.f42406v8.isReleased()) ? "[Function released]" : super.toString();
    }

    @Override // com.eclipsesource.v8.V8Object, com.eclipsesource.v8.V8Value
    public V8Function twin() {
        return (V8Function) super.twin();
    }
}
