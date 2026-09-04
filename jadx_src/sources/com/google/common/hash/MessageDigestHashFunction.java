package com.google.common.hash;

import com.google.common.base.w;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@h
@s9.j
public final class MessageDigestHashFunction extends c implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MessageDigest f58485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f58487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f58488e;

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f58489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f58490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f58491d;

        private SerializedForm(String str, int i10, String str2) {
            this.f58489b = str;
            this.f58490c = i10;
            this.f58491d = str2;
        }

        private Object a() {
            return new MessageDigestHashFunction(this.f58489b, this.f58490c, this.f58491d);
        }
    }

    public static final class b extends com.google.common.hash.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MessageDigest f58492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f58493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f58494d;

        private b(MessageDigest messageDigest, int i10) {
            this.f58492b = messageDigest;
            this.f58493c = i10;
        }

        private void u() {
            w.h0(!this.f58494d, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.m
        public HashCode n() {
            u();
            this.f58494d = true;
            return this.f58493c == this.f58492b.getDigestLength() ? HashCode.h(this.f58492b.digest()) : HashCode.h(Arrays.copyOf(this.f58492b.digest(), this.f58493c));
        }

        @Override // com.google.common.hash.a
        protected void q(byte b10) {
            u();
            this.f58492b.update(b10);
        }

        @Override // com.google.common.hash.a
        protected void r(ByteBuffer byteBuffer) {
            u();
            this.f58492b.update(byteBuffer);
        }

        @Override // com.google.common.hash.a
        protected void t(byte[] bArr, int i10, int i11) {
            u();
            this.f58492b.update(bArr, i10, i11);
        }
    }

    MessageDigestHashFunction(String str, int i10, String str2) {
        this.f58488e = (String) w.E(str2);
        MessageDigest messageDigestL = l(str);
        this.f58485b = messageDigestL;
        int digestLength = messageDigestL.getDigestLength();
        w.m(i10 >= 4 && i10 <= digestLength, "bytes (%s) must be >= 4 and < %s", i10, digestLength);
        this.f58486c = i10;
        this.f58487d = m(messageDigestL);
    }

    MessageDigestHashFunction(String str, String str2) {
        MessageDigest messageDigestL = l(str);
        this.f58485b = messageDigestL;
        this.f58486c = messageDigestL.getDigestLength();
        this.f58488e = (String) w.E(str2);
        this.f58487d = m(messageDigestL);
    }

    private static MessageDigest l(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    private static boolean m(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.k
    public int h() {
        return this.f58486c * 8;
    }

    @Override // com.google.common.hash.k
    public m i() {
        if (this.f58487d) {
            try {
                return new b((MessageDigest) this.f58485b.clone(), this.f58486c);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new b(l(this.f58485b.getAlgorithm()), this.f58486c);
    }

    Object n() {
        return new SerializedForm(this.f58485b.getAlgorithm(), this.f58486c, this.f58488e);
    }

    public String toString() {
        return this.f58488e;
    }
}
