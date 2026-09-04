package gf;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Elf32Header.java */
/* JADX INFO: loaded from: classes3.dex */
public class d extends c.b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f f119043m;

    public d(boolean z10, f fVar) throws IOException {
        this.f119027a = z10;
        this.f119043m = fVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f119028b = fVar.f(byteBufferAllocate, 16L);
        this.f119029c = fVar.k(byteBufferAllocate, 28L);
        this.f119030d = fVar.k(byteBufferAllocate, 32L);
        this.f119031e = fVar.f(byteBufferAllocate, 42L);
        this.f119032f = fVar.f(byteBufferAllocate, 44L);
        this.f119033g = fVar.f(byteBufferAllocate, 46L);
        this.f119034h = fVar.f(byteBufferAllocate, 48L);
        this.f119035i = fVar.f(byteBufferAllocate, 50L);
    }

    @Override // gf.c.b
    public c.a a(long j10, int i10) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10), new Integer(i10)}, this, changeQuickRedirect, false, 22102, new Class[]{Long.TYPE, Integer.TYPE}, c.a.class);
        return patchProxyResultProxy.isSupported ? (c.a) patchProxyResultProxy.result : new a(this.f119043m, this, j10, i10);
    }

    @Override // gf.c.b
    public c.AbstractC1077c b(long j10) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 22101, new Class[]{Long.TYPE}, c.AbstractC1077c.class);
        return patchProxyResultProxy.isSupported ? (c.AbstractC1077c) patchProxyResultProxy.result : new g(this.f119043m, this, j10);
    }

    @Override // gf.c.b
    public c.d c(int i10) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 22100, new Class[]{Integer.TYPE}, c.d.class);
        return patchProxyResultProxy.isSupported ? (c.d) patchProxyResultProxy.result : new i(this.f119043m, this, i10);
    }
}
