package com.google.common.hash;

import java.nio.Buffer;

/* JADX INFO: compiled from: Java8Compatibility.java */
/* JADX INFO: loaded from: classes7.dex */
@h
@o9.c
public final class q {
    private q() {
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
