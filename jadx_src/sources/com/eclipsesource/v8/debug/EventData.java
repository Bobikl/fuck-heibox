package com.eclipsesource.v8.debug;

import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Object;

/* JADX INFO: loaded from: classes6.dex */
public class EventData implements Releasable {
    protected V8Object v8Object;

    EventData(V8Object v8Object) {
        this.v8Object = v8Object.twin();
    }

    @Override // com.eclipsesource.v8.Releasable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.v8Object.isReleased()) {
            return;
        }
        this.v8Object.close();
    }

    @Override // com.eclipsesource.v8.Releasable
    @Deprecated
    public void release() {
        close();
    }
}
