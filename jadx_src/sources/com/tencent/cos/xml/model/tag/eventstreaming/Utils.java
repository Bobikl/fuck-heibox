package com.tencent.cos.xml.model.tag.eventstreaming;

import io.flutter.embedding.android.KeyboardMap;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import kotlin.x1;

/* JADX INFO: loaded from: classes4.dex */
public final class Utils {
    private static final String UTF8 = "UTF-8";

    private Utils() {
    }

    private static void checkByteArrayBounds(int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Byte arrays may not be empty");
        }
        if (i10 <= 32767) {
            return;
        }
        throw new IllegalArgumentException("Illegal byte array length: " + i10);
    }

    private static void checkStringBounds(int i10, int i11) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Strings may not be empty");
        }
        if (i10 <= i11) {
            return;
        }
        throw new IllegalArgumentException("Illegal string length: " + i10);
    }

    static byte[] readBytes(ByteBuffer byteBuffer) {
        int i10 = byteBuffer.getShort() & x1.f128661e;
        checkByteArrayBounds(i10);
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return bArr;
    }

    static String readShortString(ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        int i10 = byteBuffer.get() & 255;
        checkStringBounds(i10, 255);
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return new String(bArr, "UTF-8");
    }

    static String readString(ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        int i10 = byteBuffer.getShort() & x1.f128661e;
        checkStringBounds(i10, 32767);
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return new String(bArr, "UTF-8");
    }

    static int toIntExact(long j10) {
        int i10 = (int) j10;
        if (i10 == j10) {
            return i10;
        }
        throw new ArithmeticException("integer overflow");
    }

    static long toUnsignedLong(int i10) {
        return ((long) i10) & KeyboardMap.kValueMask;
    }

    static void writeBytes(DataOutputStream dataOutputStream, byte[] bArr) throws IOException {
        checkByteArrayBounds(bArr.length);
        dataOutputStream.writeShort((short) bArr.length);
        dataOutputStream.write(bArr);
    }

    static void writeShortString(DataOutputStream dataOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        checkStringBounds(bytes.length, 255);
        dataOutputStream.writeByte(bytes.length);
        dataOutputStream.write(bytes);
    }

    static void writeString(DataOutputStream dataOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        checkStringBounds(bytes.length, 32767);
        writeBytes(dataOutputStream, bytes);
    }
}
