package io.flutter.util;

import androidx.annotation.n0;
import androidx.tracing.b;

/* JADX INFO: loaded from: classes4.dex */
public final class TraceSection implements AutoCloseable {
    private TraceSection(String str) {
        begin(str);
    }

    public static void begin(@n0 String str) {
        b.c(cropSectionName(str));
    }

    public static void beginAsyncSection(String str, int i10) {
        b.a(cropSectionName(str), i10);
    }

    private static String cropSectionName(@n0 String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void end() throws RuntimeException {
        b.f();
    }

    public static void endAsyncSection(String str, int i10) {
        b.d(cropSectionName(str), i10);
    }

    public static TraceSection scoped(String str) {
        return new TraceSection(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        end();
    }
}
