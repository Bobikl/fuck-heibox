package org.android.spdy;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public class ProtectedPointer {
    private static final long CLOSED = 3;
    private static final long INIT = 1;
    private static final long WAIT_CLOSE = 2;
    private Object data2protected;
    protected ProtectedPointerOnClose how2close;
    private AtomicLong referAndstatus = new AtomicLong(1);

    public interface ProtectedPointerOnClose {
        void close(Object obj);
    }

    ProtectedPointer(Object obj) {
        this.data2protected = obj;
    }

    boolean enter() {
        long j10;
        do {
            j10 = this.referAndstatus.get();
            if (j10 == 3) {
                return false;
            }
        } while (!this.referAndstatus.compareAndSet(j10, 16 + j10));
        return true;
    }

    void exit() {
        this.referAndstatus.addAndGet(-16L);
        if (this.referAndstatus.compareAndSet(2L, 3L)) {
            ProtectedPointerOnClose protectedPointerOnClose = this.how2close;
            if (protectedPointerOnClose != null) {
                protectedPointerOnClose.close(this.data2protected);
            }
            this.data2protected = null;
        }
    }

    Object getData() {
        return this.data2protected;
    }

    void release() {
        this.referAndstatus.incrementAndGet();
        if (this.referAndstatus.compareAndSet(2L, 3L)) {
            ProtectedPointerOnClose protectedPointerOnClose = this.how2close;
            if (protectedPointerOnClose != null) {
                protectedPointerOnClose.close(this.data2protected);
            }
            this.data2protected = null;
        }
    }

    void setHow2close(ProtectedPointerOnClose protectedPointerOnClose) {
        this.how2close = protectedPointerOnClose;
    }
}
