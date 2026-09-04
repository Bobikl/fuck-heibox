package com.google.common.hash;

import com.google.common.base.w;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* JADX INFO: compiled from: MacHashFunction.java */
/* JADX INFO: loaded from: classes7.dex */
@h
@s9.j
public final class s extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Mac f58587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Key f58588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f58589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f58590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f58591f;

    /* JADX INFO: compiled from: MacHashFunction.java */
    public static final class b extends com.google.common.hash.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Mac f58592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f58593c;

        private b(Mac mac) {
            this.f58592b = mac;
        }

        private void u() {
            w.h0(!this.f58593c, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.m
        public HashCode n() {
            u();
            this.f58593c = true;
            return HashCode.h(this.f58592b.doFinal());
        }

        @Override // com.google.common.hash.a
        protected void q(byte b10) {
            u();
            this.f58592b.update(b10);
        }

        @Override // com.google.common.hash.a
        protected void r(ByteBuffer byteBuffer) {
            u();
            w.E(byteBuffer);
            this.f58592b.update(byteBuffer);
        }

        @Override // com.google.common.hash.a
        protected void s(byte[] bArr) {
            u();
            this.f58592b.update(bArr);
        }

        @Override // com.google.common.hash.a
        protected void t(byte[] bArr, int i10, int i11) {
            u();
            this.f58592b.update(bArr, i10, i11);
        }
    }

    s(String str, Key key, String str2) {
        Mac macL = l(str, key);
        this.f58587b = macL;
        this.f58588c = (Key) w.E(key);
        this.f58589d = (String) w.E(str2);
        this.f58590e = macL.getMacLength() * 8;
        this.f58591f = m(macL);
    }

    private static Mac l(String str, Key key) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(key);
            return mac;
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static boolean m(Mac mac) {
        try {
            mac.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.k
    public int h() {
        return this.f58590e;
    }

    @Override // com.google.common.hash.k
    public m i() {
        if (this.f58591f) {
            try {
                return new b((Mac) this.f58587b.clone());
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new b(l(this.f58587b.getAlgorithm(), this.f58588c));
    }

    public String toString() {
        return this.f58589d;
    }
}
