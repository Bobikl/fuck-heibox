package com.getkeepsafe.relinker.elf;

import io.flutter.embedding.android.KeyboardMap;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.x1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: ElfParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class f implements Closeable, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43047b = 1179403647;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FileChannel f43048c;

    public f(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f43048c = new FileInputStream(file).getChannel();
    }

    private long a(c.b bVar, long j10, long j11) throws IOException {
        for (long j12 = 0; j12 < j10; j12++) {
            c.AbstractC0364c abstractC0364cB = bVar.b(j12);
            if (abstractC0364cB.f43040a == 1) {
                long j13 = abstractC0364cB.f43042c;
                if (j13 <= j11 && j11 <= abstractC0364cB.f43043d + j13) {
                    return (j11 - j13) + abstractC0364cB.f43041b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public c.b b() throws IOException {
        this.f43048c.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (k(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short sE = e(byteBufferAllocate, 4L);
        boolean z10 = e(byteBufferAllocate, 5L) == 2;
        if (sE == 1) {
            return new d(z10, this);
        }
        if (sE == 2) {
            return new e(z10, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    public List<String> c() throws IOException {
        long j10;
        c.a aVarA;
        this.f43048c.position(0L);
        ArrayList arrayList = new ArrayList();
        c.b bVarB = b();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(bVarB.f43029a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = bVarB.f43034f;
        int i10 = 0;
        if (j11 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j11 = bVarB.c(0).f43044a;
        }
        long j12 = 0;
        while (true) {
            if (j12 >= j11) {
                j10 = 0;
                break;
            }
            c.AbstractC0364c abstractC0364cB = bVarB.b(j12);
            if (abstractC0364cB.f43040a == 2) {
                j10 = abstractC0364cB.f43041b;
                break;
            }
            j12++;
        }
        if (j10 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j13 = 0;
        do {
            aVarA = bVarB.a(j10, i10);
            long j14 = aVarA.f43024a;
            if (j14 == 1) {
                arrayList2.add(Long.valueOf(aVarA.f43025b));
            } else if (j14 == 5) {
                j13 = aVarA.f43025b;
            }
            i10++;
        } while (aVarA.f43024a != 0);
        if (j13 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long jA = a(bVarB, j11, j13);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(i(byteBufferAllocate, ((Long) it.next()).longValue() + jA));
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f43048c.close();
    }

    protected void d(ByteBuffer byteBuffer, long j10, int i10) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        long j11 = 0;
        while (j11 < i10) {
            int i11 = this.f43048c.read(byteBuffer, j10 + j11);
            if (i11 == -1) {
                throw new EOFException();
            }
            j11 += (long) i11;
        }
        byteBuffer.position(0);
    }

    protected short e(ByteBuffer byteBuffer, long j10) throws IOException {
        d(byteBuffer, j10, 1);
        return (short) (byteBuffer.get() & 255);
    }

    protected int f(ByteBuffer byteBuffer, long j10) throws IOException {
        d(byteBuffer, j10, 2);
        return byteBuffer.getShort() & x1.f128661e;
    }

    protected long g(ByteBuffer byteBuffer, long j10) throws IOException {
        d(byteBuffer, j10, 8);
        return byteBuffer.getLong();
    }

    protected String i(ByteBuffer byteBuffer, long j10) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j11 = 1 + j10;
            short sE = e(byteBuffer, j10);
            if (sE == 0) {
                return sb2.toString();
            }
            sb2.append((char) sE);
            j10 = j11;
        }
    }

    protected long k(ByteBuffer byteBuffer, long j10) throws IOException {
        d(byteBuffer, j10, 4);
        return ((long) byteBuffer.getInt()) & KeyboardMap.kValueMask;
    }
}
