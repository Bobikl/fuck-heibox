package com.eclipsesource.v8.utils;

import com.eclipsesource.v8.ReferenceHandler;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Value;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class MemoryManager {
    private MemoryManagerReferenceHandler memoryManagerReferenceHandler;

    /* JADX INFO: renamed from: v8, reason: collision with root package name */
    private V8 f42408v8;
    private ArrayList<V8Value> references = new ArrayList<>();
    private boolean releasing = false;
    private boolean released = false;

    public class MemoryManagerReferenceHandler implements ReferenceHandler {
        private MemoryManagerReferenceHandler() {
        }

        @Override // com.eclipsesource.v8.ReferenceHandler
        public void v8HandleCreated(V8Value v8Value) {
            MemoryManager.this.references.add(v8Value);
        }

        @Override // com.eclipsesource.v8.ReferenceHandler
        public void v8HandleDisposed(V8Value v8Value) {
            if (MemoryManager.this.releasing) {
                return;
            }
            Iterator it = MemoryManager.this.references.iterator();
            while (it.hasNext()) {
                if (it.next() == v8Value) {
                    it.remove();
                    return;
                }
            }
        }
    }

    public MemoryManager(V8 v10) {
        this.f42408v8 = v10;
        MemoryManagerReferenceHandler memoryManagerReferenceHandler = new MemoryManagerReferenceHandler();
        this.memoryManagerReferenceHandler = memoryManagerReferenceHandler;
        v10.addReferenceHandler(memoryManagerReferenceHandler);
    }

    private void checkReleased() {
        if (this.released) {
            throw new IllegalStateException("Memory manager released");
        }
    }

    public int getObjectReferenceCount() {
        checkReleased();
        return this.references.size();
    }

    public boolean isReleased() {
        return this.released;
    }

    public void persist(V8Value v8Value) {
        this.f42408v8.getLocker().checkThread();
        checkReleased();
        this.references.remove(v8Value);
    }

    public void release() {
        this.f42408v8.getLocker().checkThread();
        if (this.released) {
            return;
        }
        this.releasing = true;
        try {
            Iterator<V8Value> it = this.references.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.f42408v8.removeReferenceHandler(this.memoryManagerReferenceHandler);
            this.references.clear();
            this.releasing = false;
            this.released = true;
        } catch (Throwable th2) {
            this.releasing = false;
            throw th2;
        }
    }
}
