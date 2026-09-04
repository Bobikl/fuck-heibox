package org.apache.commons.codec.digest;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.k;
import org.apache.commons.codec.binary.l;

/* JADX INFO: compiled from: DigestUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f132916a = 1024;

    public static String A(InputStream inputStream) throws IOException {
        return k.f(x(inputStream));
    }

    public static String B(String str) {
        return k.f(y(str));
    }

    public static String C(byte[] bArr) {
        return k.f(z(bArr));
    }

    public static byte[] D(InputStream inputStream) throws IOException {
        return a(g(), inputStream);
    }

    public static byte[] E(String str) {
        return F(b(str));
    }

    public static byte[] F(byte[] bArr) {
        return g().digest(bArr);
    }

    public static String G(InputStream inputStream) throws IOException {
        return k.f(D(inputStream));
    }

    public static String H(String str) {
        return k.f(E(str));
    }

    public static String I(byte[] bArr) {
        return k.f(F(bArr));
    }

    public static String J(InputStream inputStream) throws IOException {
        return k.f(o(inputStream));
    }

    public static String K(String str) {
        return k.f(p(str));
    }

    public static String L(byte[] bArr) {
        return k.f(q(bArr));
    }

    private static byte[] a(MessageDigest messageDigest, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        int i10 = inputStream.read(bArr, 0, 1024);
        while (i10 > -1) {
            messageDigest.update(bArr, 0, i10);
            i10 = inputStream.read(bArr, 0, 1024);
        }
        return messageDigest.digest();
    }

    private static byte[] b(String str) {
        return l.g(str);
    }

    static MessageDigest c(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    private static MessageDigest d() {
        return c("MD5");
    }

    private static MessageDigest e() {
        return c("SHA-256");
    }

    private static MessageDigest f() {
        return c("SHA-384");
    }

    private static MessageDigest g() {
        return c("SHA-512");
    }

    private static MessageDigest h() {
        return c("SHA");
    }

    public static byte[] i(InputStream inputStream) throws IOException {
        return a(d(), inputStream);
    }

    public static byte[] j(String str) {
        return k(b(str));
    }

    public static byte[] k(byte[] bArr) {
        return d().digest(bArr);
    }

    public static String l(InputStream inputStream) throws IOException {
        return k.f(i(inputStream));
    }

    public static String m(String str) {
        return k.f(j(str));
    }

    public static String n(byte[] bArr) {
        return k.f(k(bArr));
    }

    public static byte[] o(InputStream inputStream) throws IOException {
        return a(h(), inputStream);
    }

    public static byte[] p(String str) {
        return q(b(str));
    }

    public static byte[] q(byte[] bArr) {
        return h().digest(bArr);
    }

    public static byte[] r(InputStream inputStream) throws IOException {
        return a(e(), inputStream);
    }

    public static byte[] s(String str) {
        return t(b(str));
    }

    public static byte[] t(byte[] bArr) {
        return e().digest(bArr);
    }

    public static String u(InputStream inputStream) throws IOException {
        return k.f(r(inputStream));
    }

    public static String v(String str) {
        return k.f(s(str));
    }

    public static String w(byte[] bArr) {
        return k.f(t(bArr));
    }

    public static byte[] x(InputStream inputStream) throws IOException {
        return a(f(), inputStream);
    }

    public static byte[] y(String str) {
        return z(b(str));
    }

    public static byte[] z(byte[] bArr) {
        return f().digest(bArr);
    }
}
