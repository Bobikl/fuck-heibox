package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: MessageSetSchema.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d2<T> implements x2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z1 f22437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v3<?, ?> f22438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q0<?> f22440d;

    private d2(v3<?, ?> v3Var, q0<?> q0Var, z1 z1Var) {
        this.f22438b = v3Var;
        this.f22439c = q0Var.e(z1Var);
        this.f22440d = q0Var;
        this.f22437a = z1Var;
    }

    private <UT, UB> int k(v3<UT, UB> v3Var, T t10) {
        return v3Var.i(v3Var.g(t10));
    }

    private <UT, UB, ET extends y0.c<ET>> void l(v3<UT, UB> v3Var, q0<ET> q0Var, T t10, w2 w2Var, p0 p0Var) throws IOException {
        UB ubF = v3Var.f(t10);
        y0<ET> y0VarD = q0Var.d(t10);
        while (w2Var.p() != Integer.MAX_VALUE) {
            try {
                if (!n(w2Var, p0Var, q0Var, y0VarD, v3Var, ubF)) {
                    return;
                }
            } finally {
                v3Var.o(t10, ubF);
            }
        }
    }

    static <T> d2<T> m(v3<?, ?> v3Var, q0<?> q0Var, z1 z1Var) {
        return new d2<>(v3Var, q0Var, z1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends y0.c<ET>> boolean n(w2 w2Var, p0 p0Var, q0<ET> q0Var, y0<ET> y0Var, v3<UT, UB> v3Var, UB ub2) throws IOException {
        int tag = w2Var.getTag();
        if (tag != WireFormat.f22365q) {
            if (WireFormat.b(tag) != 2) {
                return w2Var.t();
            }
            Object objB = q0Var.b(p0Var, this.f22437a, WireFormat.a(tag));
            if (objB == null) {
                return v3Var.m(ub2, w2Var);
            }
            q0Var.h(w2Var, objB, p0Var, y0Var);
            return true;
        }
        int iC = 0;
        Object objB2 = null;
        ByteString byteStringG = null;
        while (w2Var.p() != Integer.MAX_VALUE) {
            int tag2 = w2Var.getTag();
            if (tag2 == WireFormat.f22367s) {
                iC = w2Var.c();
                objB2 = q0Var.b(p0Var, this.f22437a, iC);
            } else if (tag2 == WireFormat.f22368t) {
                if (objB2 != null) {
                    q0Var.h(w2Var, objB2, p0Var, y0Var);
                } else {
                    byteStringG = w2Var.g();
                }
            } else if (!w2Var.t()) {
                break;
            }
        }
        if (w2Var.getTag() != WireFormat.f22366r) {
            throw InvalidProtocolBufferException.b();
        }
        if (byteStringG != null) {
            if (objB2 != null) {
                q0Var.i(byteStringG, objB2, p0Var, y0Var);
            } else {
                v3Var.d(ub2, iC, byteStringG);
            }
        }
        return true;
    }

    private <UT, UB> void o(v3<UT, UB> v3Var, T t10, Writer writer) throws IOException {
        v3Var.s(v3Var.g(t10), writer);
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public void a(T t10, T t11) {
        z2.J(this.f22438b, t10, t11);
        if (this.f22439c) {
            z2.H(this.f22440d, t10, t11);
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public final boolean b(T t10) {
        return this.f22440d.c(t10).E();
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public void c(T t10, Writer writer) throws IOException {
        Iterator itH = this.f22440d.c(t10).H();
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            y0.c cVar = (y0.c) entry.getKey();
            if (cVar.F() != WireFormat.JavaType.MESSAGE || cVar.H() || cVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof k1.b) {
                writer.b(cVar.getNumber(), ((k1.b) entry).a().n());
            } else {
                writer.b(cVar.getNumber(), entry.getValue());
            }
        }
        o(this.f22438b, t10, writer);
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public boolean d(T t10, T t11) {
        if (!this.f22438b.g(t10).equals(this.f22438b.g(t11))) {
            return false;
        }
        if (this.f22439c) {
            return this.f22440d.c(t10).equals(this.f22440d.c(t11));
        }
        return true;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public void e(T t10, w2 w2Var, p0 p0Var) throws IOException {
        l(this.f22438b, this.f22440d, t10, w2Var, p0Var);
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public void f(T t10) {
        this.f22438b.j(t10);
        this.f22440d.f(t10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public int g(T t10) {
        int iK = k(this.f22438b, t10) + 0;
        return this.f22439c ? iK + this.f22440d.c(t10).v() : iK;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public T h() {
        return (T) this.f22437a.v().a1();
    }

    @Override // androidx.p001datastore.preferences.protobuf.x2
    public int i(T t10) {
        int iHashCode = this.f22438b.g(t10).hashCode();
        return this.f22439c ? (iHashCode * 53) + this.f22440d.c(t10).hashCode() : iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p001datastore.preferences.protobuf.x2
    public void j(T t10, byte[] bArr, int i10, int i11, l.b bVar) throws IOException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t10;
        w3 w3VarP = generatedMessageLite.unknownFields;
        if (w3VarP == w3.e()) {
            w3VarP = w3.p();
            generatedMessageLite.unknownFields = w3VarP;
        }
        y0<GeneratedMessageLite.g> y0VarI2 = ((GeneratedMessageLite.e) t10).I2();
        GeneratedMessageLite.h hVar = null;
        while (i10 < i11) {
            int I = l.I(bArr, i10, bVar);
            int i12 = bVar.f22502a;
            if (i12 == WireFormat.f22365q) {
                int i13 = 0;
                ByteString byteString = null;
                while (I < i11) {
                    I = l.I(bArr, I, bVar);
                    int i14 = bVar.f22502a;
                    int iA = WireFormat.a(i14);
                    int iB = WireFormat.b(i14);
                    if (iA != 2) {
                        if (iA == 3) {
                            if (hVar != null) {
                                I = l.p(r2.a().i(hVar.c().getClass()), bArr, I, i11, bVar);
                                y0VarI2.O(hVar.f22313d, bVar.f22504c);
                            } else if (iB == 2) {
                                I = l.b(bArr, I, bVar);
                                byteString = (ByteString) bVar.f22504c;
                            }
                        }
                        if (i14 == WireFormat.f22366r) {
                            break;
                        } else {
                            I = l.N(i14, bArr, I, i11, bVar);
                        }
                    } else if (iB == 0) {
                        I = l.I(bArr, I, bVar);
                        i13 = bVar.f22502a;
                        hVar = (GeneratedMessageLite.h) this.f22440d.b(bVar.f22505d, this.f22437a, i13);
                    } else {
                        if (i14 == WireFormat.f22366r) {
                            break;
                            break;
                        }
                        I = l.N(i14, bArr, I, i11, bVar);
                    }
                }
                if (byteString != null) {
                    w3VarP.r(WireFormat.c(i13, 2), byteString);
                }
                i10 = I;
            } else if (WireFormat.b(i12) == 2) {
                GeneratedMessageLite.h hVar2 = (GeneratedMessageLite.h) this.f22440d.b(bVar.f22505d, this.f22437a, WireFormat.a(i12));
                if (hVar2 != null) {
                    i10 = l.p(r2.a().i(hVar2.c().getClass()), bArr, I, i11, bVar);
                    y0VarI2.O(hVar2.f22313d, bVar.f22504c);
                } else {
                    i10 = l.G(i12, bArr, I, i11, w3VarP, bVar);
                }
                hVar = hVar2;
            } else {
                i10 = l.N(i12, bArr, I, i11, bVar);
            }
        }
        if (i10 != i11) {
            throw InvalidProtocolBufferException.h();
        }
    }
}
