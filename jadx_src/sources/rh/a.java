package rh;

import kotlin.u0;
import sh.f;

/* JADX INFO: compiled from: bitwiseOperations.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    @u0(version = "1.1")
    @f
    private static final byte a(byte b10, byte b11) {
        return (byte) (b10 & b11);
    }

    @u0(version = "1.1")
    @f
    private static final short b(short s10, short s11) {
        return (short) (s10 & s11);
    }

    @u0(version = "1.1")
    @f
    private static final byte c(byte b10) {
        return (byte) (~b10);
    }

    @u0(version = "1.1")
    @f
    private static final short d(short s10) {
        return (short) (~s10);
    }

    @u0(version = "1.1")
    @f
    private static final byte e(byte b10, byte b11) {
        return (byte) (b10 | b11);
    }

    @u0(version = "1.1")
    @f
    private static final short f(short s10, short s11) {
        return (short) (s10 | s11);
    }

    @u0(version = "1.1")
    @f
    private static final byte g(byte b10, byte b11) {
        return (byte) (b10 ^ b11);
    }

    @u0(version = "1.1")
    @f
    private static final short h(short s10, short s11) {
        return (short) (s10 ^ s11);
    }
}
