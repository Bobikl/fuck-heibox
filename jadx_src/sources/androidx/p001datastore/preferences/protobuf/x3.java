package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSetLiteSchema.java */
/* JADX INFO: loaded from: classes6.dex */
public class x3 extends v3<w3, w3> {
    x3() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p001datastore.preferences.protobuf.v3
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public w3 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p001datastore.preferences.protobuf.v3
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(w3 w3Var) {
        return w3Var.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p001datastore.preferences.protobuf.v3
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(w3 w3Var) {
        return w3Var.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p001datastore.preferences.protobuf.v3
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public w3 k(w3 w3Var, w3 w3Var2) {
        return w3Var2.equals(w3.e()) ? w3Var : w3.o(w3Var, w3Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p001datastore.preferences.protobuf.v3
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public w3 n() {
        return w3.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p001datastore.preferences.protobuf.v3
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, w3 w3Var) {
        p(obj, w3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p001datastore.preferences.protobuf.v3
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, w3 w3Var) {
        ((GeneratedMessageLite) obj).unknownFields = w3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p001datastore.preferences.protobuf.v3
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public w3 r(w3 w3Var) {
        w3Var.j();
        return w3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p001datastore.preferences.protobuf.v3
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(w3 w3Var, Writer writer) throws IOException {
        w3Var.t(writer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p001datastore.preferences.protobuf.v3
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(w3 w3Var, Writer writer) throws IOException {
        w3Var.w(writer);
    }

    @Override // androidx.p001datastore.preferences.protobuf.v3
    void j(Object obj) {
        g(obj).j();
    }

    @Override // androidx.p001datastore.preferences.protobuf.v3
    boolean q(w2 w2Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p001datastore.preferences.protobuf.v3
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(w3 w3Var, int i10, int i11) {
        w3Var.r(WireFormat.c(i10, 5), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p001datastore.preferences.protobuf.v3
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(w3 w3Var, int i10, long j10) {
        w3Var.r(WireFormat.c(i10, 1), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p001datastore.preferences.protobuf.v3
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(w3 w3Var, int i10, w3 w3Var2) {
        w3Var.r(WireFormat.c(i10, 3), w3Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p001datastore.preferences.protobuf.v3
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(w3 w3Var, int i10, ByteString byteString) {
        w3Var.r(WireFormat.c(i10, 2), byteString);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p001datastore.preferences.protobuf.v3
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(w3 w3Var, int i10, long j10) {
        w3Var.r(WireFormat.c(i10, 0), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.p001datastore.preferences.protobuf.v3
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public w3 f(Object obj) {
        w3 w3VarG = g(obj);
        if (w3VarG != w3.e()) {
            return w3VarG;
        }
        w3 w3VarP = w3.p();
        p(obj, w3VarP);
        return w3VarP;
    }
}
