package androidx.p001datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: BufferAllocator.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r f22582a = new a();

    /* JADX INFO: compiled from: BufferAllocator.java */
    public static final class a extends r {
        a() {
        }

        @Override // androidx.p001datastore.preferences.protobuf.r
        public d a(int i10) {
            return d.j(ByteBuffer.allocateDirect(i10));
        }

        @Override // androidx.p001datastore.preferences.protobuf.r
        public d b(int i10) {
            return d.k(new byte[i10]);
        }
    }

    r() {
    }

    public static r c() {
        return f22582a;
    }

    public abstract d a(int i10);

    public abstract d b(int i10);
}
