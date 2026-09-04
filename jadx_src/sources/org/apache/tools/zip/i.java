package org.apache.tools.zip;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Simple8BitZipEncoding.java */
/* JADX INFO: loaded from: classes5.dex */
public class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char[] f137415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f137416b;

    /* JADX INFO: compiled from: Simple8BitZipEncoding.java */
    public static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final char f137417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte f137418c;

        a(byte b10, char c10) {
            this.f137418c = b10;
            this.f137417b = c10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.f137417b - aVar.f137417b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f137417b == aVar.f137417b && this.f137418c == aVar.f137418c;
        }

        public int hashCode() {
            return this.f137417b;
        }

        public String toString() {
            return "0x" + Integer.toHexString(this.f137417b & kotlin.jvm.internal.p.f124952c) + "->0x" + Integer.toHexString(this.f137418c & 255);
        }
    }

    public i(char[] cArr) {
        char[] cArr2 = (char[]) cArr.clone();
        this.f137415a = cArr2;
        ArrayList arrayList = new ArrayList(cArr2.length);
        byte b10 = 127;
        for (char c10 : cArr2) {
            b10 = (byte) (b10 + 1);
            arrayList.add(new a(b10, c10));
        }
        Collections.sort(arrayList);
        this.f137416b = Collections.unmodifiableList(arrayList);
    }

    private a e(char c10) {
        int size = this.f137416b.size();
        int i10 = 0;
        while (size > i10) {
            int i11 = ((size - i10) / 2) + i10;
            a aVar = this.f137416b.get(i11);
            char c11 = aVar.f137417b;
            if (c11 == c10) {
                return aVar;
            }
            if (c11 < c10) {
                i10 = i11 + 1;
            } else {
                size = i11;
            }
        }
        if (i10 >= this.f137416b.size()) {
            return null;
        }
        a aVar2 = this.f137416b.get(i10);
        if (aVar2.f137417b != c10) {
            return null;
        }
        return aVar2;
    }

    @Override // org.apache.tools.zip.r
    public ByteBuffer a(String str) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length() + 6 + ((str.length() + 1) / 2));
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (byteBufferAllocate.remaining() < 6) {
                byteBufferAllocate = s.c(byteBufferAllocate, byteBufferAllocate.position() + 6);
            }
            if (!f(byteBufferAllocate, cCharAt)) {
                s.a(byteBufferAllocate, cCharAt);
            }
        }
        s.e(byteBufferAllocate);
        return byteBufferAllocate;
    }

    @Override // org.apache.tools.zip.r
    public boolean b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (!c(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public boolean c(char c10) {
        return (c10 >= 0 && c10 < 128) || e(c10) != null;
    }

    public char d(byte b10) {
        return b10 >= 0 ? (char) b10 : this.f137415a[b10 + 128];
    }

    @Override // org.apache.tools.zip.r
    public String decode(byte[] bArr) throws IOException {
        char[] cArr = new char[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            cArr[i10] = d(bArr[i10]);
        }
        return new String(cArr);
    }

    public boolean f(ByteBuffer byteBuffer, char c10) {
        if (c10 >= 0 && c10 < 128) {
            byteBuffer.put((byte) c10);
            return true;
        }
        a aVarE = e(c10);
        if (aVarE == null) {
            return false;
        }
        byteBuffer.put(aVarE.f137418c);
        return true;
    }
}
