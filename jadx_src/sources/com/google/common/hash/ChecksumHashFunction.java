package com.google.common.hash;

import com.google.common.base.w;
import java.io.Serializable;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes7.dex */
@h
@s9.j
public final class ChecksumHashFunction extends c implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p<? extends Checksum> f58462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f58464d;

    public final class b extends com.google.common.hash.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Checksum f58465b;

        private b(Checksum checksum) {
            this.f58465b = (Checksum) w.E(checksum);
        }

        @Override // com.google.common.hash.m
        public HashCode n() {
            long value = this.f58465b.getValue();
            return ChecksumHashFunction.this.f58463c == 32 ? HashCode.i((int) value) : HashCode.j(value);
        }

        @Override // com.google.common.hash.a
        protected void q(byte b10) {
            this.f58465b.update(b10);
        }

        @Override // com.google.common.hash.a
        protected void t(byte[] bArr, int i10, int i11) {
            this.f58465b.update(bArr, i10, i11);
        }
    }

    ChecksumHashFunction(p<? extends Checksum> pVar, int i10, String str) {
        this.f58462b = (p) w.E(pVar);
        w.k(i10 == 32 || i10 == 64, "bits (%s) must be either 32 or 64", i10);
        this.f58463c = i10;
        this.f58464d = (String) w.E(str);
    }

    @Override // com.google.common.hash.k
    public int h() {
        return this.f58463c;
    }

    @Override // com.google.common.hash.k
    public m i() {
        return new b(this.f58462b.get());
    }

    public String toString() {
        return this.f58464d;
    }
}
