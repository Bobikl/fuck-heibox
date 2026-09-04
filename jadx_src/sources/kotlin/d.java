package kotlin;

/* JADX INFO: compiled from: CharCode.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {q.class})
    @sh.f
    private static final char a(int i10) {
        if (i10 >= 0 && i10 <= 65535) {
            return (char) i10;
        }
        throw new IllegalArgumentException("Invalid Char code: " + i10);
    }

    private static final int b(char c10) {
        return c10;
    }

    @u0(version = org.apache.tools.ant.util.s0.f136928s)
    @e2(markerClass = {q.class})
    @sh.g
    @sh.f
    public static /* synthetic */ void c(char c10) {
    }
}
