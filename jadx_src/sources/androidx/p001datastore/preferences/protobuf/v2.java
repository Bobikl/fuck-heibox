package androidx.p001datastore.preferences.protobuf;

/* JADX INFO: compiled from: RawMessageInfo.java */
/* JADX INFO: loaded from: classes6.dex */
public final class v2 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z1 f22644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f22646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22647d;

    v2(z1 z1Var, String str, Object[] objArr) {
        this.f22644a = z1Var;
        this.f22645b = str;
        this.f22646c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f22647d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f22647d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.x1
    public boolean a() {
        return (this.f22647d & 2) == 2;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x1
    public z1 b() {
        return this.f22644a;
    }

    Object[] c() {
        return this.f22646c;
    }

    String d() {
        return this.f22645b;
    }

    @Override // androidx.p001datastore.preferences.protobuf.x1
    public ProtoSyntax f() {
        return (this.f22647d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }
}
