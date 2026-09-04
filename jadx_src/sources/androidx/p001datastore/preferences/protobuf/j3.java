package androidx.p001datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: StructuralMessageInfo.java */
/* JADX INFO: loaded from: classes6.dex */
public final class j3 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProtoSyntax f22484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f22486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t0[] f22487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z1 f22488e;

    /* JADX INFO: compiled from: StructuralMessageInfo.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<t0> f22489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ProtoSyntax f22490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f22492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f22493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f22494f;

        public a() {
            this.f22493e = null;
            this.f22489a = new ArrayList();
        }

        public a(int i10) {
            this.f22493e = null;
            this.f22489a = new ArrayList(i10);
        }

        public j3 a() {
            if (this.f22491c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.f22490b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.f22491c = true;
            Collections.sort(this.f22489a);
            return new j3(this.f22490b, this.f22492d, this.f22493e, (t0[]) this.f22489a.toArray(new t0[0]), this.f22494f);
        }

        public void b(int[] iArr) {
            this.f22493e = iArr;
        }

        public void c(Object obj) {
            this.f22494f = obj;
        }

        public void d(t0 t0Var) {
            if (this.f22491c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.f22489a.add(t0Var);
        }

        public void e(boolean z10) {
            this.f22492d = z10;
        }

        public void f(ProtoSyntax protoSyntax) {
            this.f22490b = (ProtoSyntax) i1.e(protoSyntax, "syntax");
        }
    }

    j3(ProtoSyntax protoSyntax, boolean z10, int[] iArr, t0[] t0VarArr, Object obj) {
        this.f22484a = protoSyntax;
        this.f22485b = z10;
        this.f22486c = iArr;
        this.f22487d = t0VarArr;
        this.f22488e = (z1) i1.e(obj, "defaultInstance");
    }

    public static a e() {
        return new a();
    }

    public static a g(int i10) {
        return new a(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.x1
    public boolean a() {
        return this.f22485b;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x1
    public z1 b() {
        return this.f22488e;
    }

    public int[] c() {
        return this.f22486c;
    }

    public t0[] d() {
        return this.f22487d;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x1
    public ProtoSyntax f() {
        return this.f22484a;
    }
}
