package com.google.common.base;

import java.nio.Buffer;

/* JADX INFO: compiled from: Java8Compatibility.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.c
@g
public final class o {
    private o() {
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

    static void d(Buffer buffer, int i10) {
        buffer.position(i10);
    }
}
