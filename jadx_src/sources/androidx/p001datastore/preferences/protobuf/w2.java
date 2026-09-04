package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Reader.java */
/* JADX INFO: loaded from: classes6.dex */
public interface w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f22704a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f22705b = 0;

    boolean A() throws IOException;

    void B(List<Long> list) throws IOException;

    void C(List<Long> list) throws IOException;

    void D(List<Integer> list) throws IOException;

    void E(List<String> list) throws IOException;

    int F() throws IOException;

    <T> void G(List<T> list, x2<T> x2Var, p0 p0Var) throws IOException;

    void H(List<Long> list) throws IOException;

    void I(List<Integer> list) throws IOException;

    int J() throws IOException;

    @Deprecated
    <T> T K(Class<T> cls, p0 p0Var) throws IOException;

    <T> void L(List<T> list, Class<T> cls, p0 p0Var) throws IOException;

    <K, V> void M(Map<K, V> map, t1.b<K, V> bVar, p0 p0Var) throws IOException;

    long N() throws IOException;

    String O() throws IOException;

    @Deprecated
    <T> void P(List<T> list, x2<T> x2Var, p0 p0Var) throws IOException;

    int Q() throws IOException;

    String R() throws IOException;

    void a(List<Long> list) throws IOException;

    long b() throws IOException;

    int c() throws IOException;

    int d() throws IOException;

    int e() throws IOException;

    void f(List<Boolean> list) throws IOException;

    ByteString g() throws IOException;

    int getTag();

    @Deprecated
    <T> T h(x2<T> x2Var, p0 p0Var) throws IOException;

    void i(List<Integer> list) throws IOException;

    long j() throws IOException;

    <T> T k(Class<T> cls, p0 p0Var) throws IOException;

    @Deprecated
    <T> void l(List<T> list, Class<T> cls, p0 p0Var) throws IOException;

    void m(List<Long> list) throws IOException;

    void n(List<Integer> list) throws IOException;

    void o(List<Integer> list) throws IOException;

    int p() throws IOException;

    void q(List<String> list) throws IOException;

    void r(List<Float> list) throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    boolean s();

    boolean t() throws IOException;

    void u(List<ByteString> list) throws IOException;

    void v(List<Double> list) throws IOException;

    long w() throws IOException;

    <T> T x(x2<T> x2Var, p0 p0Var) throws IOException;

    long y() throws IOException;

    void z(List<Integer> list) throws IOException;
}
