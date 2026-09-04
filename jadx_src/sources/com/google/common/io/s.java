package com.google.common.io;

import java.nio.Buffer;

/* JADX INFO: compiled from: Java8Compatibility.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public final class s {
    private s() {
    }

    static void a(Buffer buffer) {
        buffer.clear();
    }

    static void b(Buffer buffer) {
        buffer.flip();
    }

    static void c(Buffer buffer, int i10) {
        buffer.limit(i10);
    }

    static void d(Buffer buffer) {
        buffer.mark();
    }

    static void e(Buffer buffer, int i10) {
        buffer.position(i10);
    }

    static void f(Buffer buffer) {
        buffer.reset();
    }
}
