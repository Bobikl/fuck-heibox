package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: BoundedByteString.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f127315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f127316g;

    /* JADX INFO: compiled from: BoundedByteString.java */
    public class b implements d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f127317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f127318c;

        private b() {
            int iH = c.this.H();
            this.f127317b = iH;
            this.f127318c = iH + c.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(l());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f127317b < this.f127318c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte l() {
            int i10 = this.f127317b;
            if (i10 >= this.f127318c) {
                throw new NoSuchElementException();
            }
            byte[] bArr = c.this.f127364d;
            this.f127317b = i10 + 1;
            return bArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    c(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (((long) i10) + ((long) i11) <= bArr.length) {
            this.f127315f = i10;
            this.f127316g = i11;
            return;
        }
        StringBuilder sb4 = new StringBuilder(48);
        sb4.append("Offset+Length too large: ");
        sb4.append(i10);
        sb4.append("+");
        sb4.append(i11);
        throw new IllegalArgumentException(sb4.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public byte F(int i10) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("Index too small: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        if (i10 < size()) {
            return this.f127364d[this.f127315f + i10];
        }
        int size = size();
        StringBuilder sb3 = new StringBuilder(41);
        sb3.append("Index too large: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(size);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    protected int H() {
        return this.f127315f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m, kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void l(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f127364d, H() + i10, bArr, i11, i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m, kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* JADX INFO: renamed from: s */
    public d.a iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m, kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f127316g;
    }
}
