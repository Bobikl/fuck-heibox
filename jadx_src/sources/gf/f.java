package gf;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
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
/* JADX INFO: loaded from: classes3.dex */
public class f implements Closeable, c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f119045b = 1179403647;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FileChannel f119046c;

    public f(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f119046c = new FileInputStream(file).getChannel();
    }

    private long a(c.b bVar, long j10, long j11) throws IOException {
        Object[] objArr = {bVar, new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22108, new Class[]{c.b.class, cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        for (long j12 = 0; j12 < j10; j12++) {
            c.AbstractC1077c abstractC1077cB = bVar.b(j12);
            if (abstractC1077cB.f119038a == 1) {
                long j13 = abstractC1077cB.f119040c;
                if (j13 <= j11 && j11 <= abstractC1077cB.f119041d + j13) {
                    return (j11 - j13) + abstractC1077cB.f119039b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public c.b b() throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22106, new Class[0], c.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (c.b) patchProxyResultProxy.result;
        }
        this.f119046c.position(0L);
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
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22107, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        this.f119046c.position(0L);
        ArrayList arrayList = new ArrayList();
        c.b bVarB = b();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(bVarB.f119027a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = bVarB.f119032f;
        if (j11 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j11 = bVarB.c(0).f119042a;
        }
        long j12 = 0;
        while (true) {
            if (j12 >= j11) {
                j10 = 0;
                break;
            }
            c.AbstractC1077c abstractC1077cB = bVarB.b(j12);
            if (abstractC1077cB.f119038a == 2) {
                j10 = abstractC1077cB.f119039b;
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
            long j14 = aVarA.f119022a;
            if (j14 == 1) {
                arrayList2.add(Long.valueOf(aVarA.f119023b));
            } else if (j14 == 5) {
                j13 = aVarA.f119023b;
            }
            i10++;
        } while (aVarA.f119022a != 0);
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
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22109, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f119046c.close();
    }

    public void d(ByteBuffer byteBuffer, long j10, int i10) throws IOException {
        if (PatchProxy.proxy(new Object[]{byteBuffer, new Long(j10), new Integer(i10)}, this, changeQuickRedirect, false, 22115, new Class[]{ByteBuffer.class, Long.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        long j11 = 0;
        while (j11 < i10) {
            int i11 = this.f119046c.read(byteBuffer, j10 + j11);
            if (i11 == -1) {
                throw new EOFException();
            }
            j11 += (long) i11;
        }
        byteBuffer.position(0);
    }

    public short e(ByteBuffer byteBuffer, long j10) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{byteBuffer, new Long(j10)}, this, changeQuickRedirect, false, 22114, new Class[]{ByteBuffer.class, Long.TYPE}, Short.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Short) patchProxyResultProxy.result).shortValue();
        }
        d(byteBuffer, j10, 1);
        return (short) (byteBuffer.get() & 255);
    }

    public int f(ByteBuffer byteBuffer, long j10) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{byteBuffer, new Long(j10)}, this, changeQuickRedirect, false, 22113, new Class[]{ByteBuffer.class, Long.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        d(byteBuffer, j10, 2);
        return byteBuffer.getShort() & x1.f128661e;
    }

    public long g(ByteBuffer byteBuffer, long j10) throws IOException {
        Object[] objArr = {byteBuffer, new Long(j10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22111, new Class[]{ByteBuffer.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        d(byteBuffer, j10, 8);
        return byteBuffer.getLong();
    }

    public String i(ByteBuffer byteBuffer, long j10) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{byteBuffer, new Long(j10)}, this, changeQuickRedirect, false, 22110, new Class[]{ByteBuffer.class, Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
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

    public long k(ByteBuffer byteBuffer, long j10) throws IOException {
        Object[] objArr = {byteBuffer, new Long(j10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22112, new Class[]{ByteBuffer.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        d(byteBuffer, j10, 4);
        return ((long) byteBuffer.getInt()) & KeyboardMap.kValueMask;
    }
}
