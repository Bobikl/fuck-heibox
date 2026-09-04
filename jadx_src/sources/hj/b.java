package hj;

/* JADX INFO: compiled from: Level.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f119190a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f119191b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f119192c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f119193d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f119194e = 6;

    public static String a(int i10) {
        if (i10 == 2) {
            return "VERBOSE";
        }
        if (i10 == 3) {
            return "DEBUG";
        }
        if (i10 == 4) {
            return "INFO";
        }
        if (i10 == 5) {
            return "WARN";
        }
        if (i10 == 6) {
            return "ERROR";
        }
        if (i10 < 2) {
            return "VERBOSE-" + (2 - i10);
        }
        return "ERROR+" + (i10 - 6);
    }

    public static String b(int i10) {
        if (i10 == 2) {
            return androidx.exifinterface.media.a.X4;
        }
        if (i10 == 3) {
            return "D";
        }
        if (i10 == 4) {
            return "I";
        }
        if (i10 == 5) {
            return androidx.exifinterface.media.a.T4;
        }
        if (i10 == 6) {
            return androidx.exifinterface.media.a.S4;
        }
        if (i10 < 2) {
            return "V-" + (2 - i10);
        }
        return "E+" + (i10 - 6);
    }
}
