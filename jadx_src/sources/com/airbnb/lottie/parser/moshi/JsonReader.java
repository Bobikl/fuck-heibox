package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;

/* JADX INFO: loaded from: classes6.dex */
public abstract class JsonReader implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f37719h = new String[128];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f37720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f37721c = new int[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String[] f37722d = new String[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f37723e = new int[32];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f37724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f37725g;

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String[] f37726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Options f37727b;

        private a(String[] strArr, Options options) {
            this.f37726a = strArr;
            this.f37727b = options;
        }

        public static a a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    JsonReader.x(buffer, strArr[i10]);
                    buffer.readByte();
                    byteStringArr[i10] = buffer.readByteString();
                }
                return new a((String[]) strArr.clone(), Options.of(byteStringArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f37719h[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f37719h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    JsonReader() {
    }

    public static JsonReader o(BufferedSource bufferedSource) {
        return new b(bufferedSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void x(BufferedSink bufferedSink, String str) throws IOException {
        String str2;
        String[] strArr = f37719h;
        bufferedSink.writeByte(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        bufferedSink.writeUtf8(str, i10, i11);
                    }
                    bufferedSink.writeUtf8(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    bufferedSink.writeUtf8(str, i10, i11);
                }
                bufferedSink.writeUtf8(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            bufferedSink.writeUtf8(str, i10, length);
        }
        bufferedSink.writeByte(34);
    }

    public abstract void b() throws IOException;

    public abstract void c() throws IOException;

    public abstract void d() throws IOException;

    public abstract void e() throws IOException;

    public abstract boolean f() throws IOException;

    public abstract boolean g() throws IOException;

    public final String getPath() {
        return com.airbnb.lottie.parser.moshi.a.a(this.f37720b, this.f37721c, this.f37722d, this.f37723e);
    }

    public abstract double i() throws IOException;

    public abstract int k() throws IOException;

    public abstract String m() throws IOException;

    public abstract String n() throws IOException;

    public abstract Token p() throws IOException;

    final void q(int i10) {
        int i11 = this.f37720b;
        int[] iArr = this.f37721c;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            this.f37721c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f37722d;
            this.f37722d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f37723e;
            this.f37723e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f37721c;
        int i12 = this.f37720b;
        this.f37720b = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int r(a aVar) throws IOException;

    public abstract void s() throws IOException;

    public abstract void t() throws IOException;

    final JsonEncodingException z(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + getPath());
    }
}
