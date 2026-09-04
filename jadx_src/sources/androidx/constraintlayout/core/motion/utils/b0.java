package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: TypedValues.java */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 {
    static {
        String str = w.g.f17988a;
    }

    public static int a(String str) {
        str.hashCode();
        switch (str) {
            case "transitionEasing":
                return 501;
            case "percentWidth":
                return 503;
            case "percentHeight":
                return 504;
            case "drawPath":
                return 502;
            case "sizePercent":
                return 505;
            case "percentX":
                return 506;
            case "percentY":
                return 507;
            default:
                return -1;
        }
    }

    public static int b(int i10) {
        if (i10 == 100) {
            return 2;
        }
        if (i10 == 101) {
            return 8;
        }
        switch (i10) {
            case 501:
            case 502:
                return 8;
            case 503:
            case 504:
            case 505:
            case 506:
            case 507:
                return 4;
            case 508:
                return 2;
            default:
                return -1;
        }
    }
}
