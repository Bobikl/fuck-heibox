package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: TypedValues.java */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 {
    static {
        String str = w.h.f18007a;
    }

    public static int a(String str) {
        str.hashCode();
        switch (str) {
            case "transitionFlags":
                return 707;
            case "duration":
                return 700;
            case "motionInterpolator":
                return 705;
            case "autoTransition":
                return 704;
            case "to":
                return 702;
            case "from":
                return 701;
            case "pathMotionArc":
                return 509;
            case "staggered":
                return 706;
            default:
                return -1;
        }
    }

    public static int b(int i10) {
        if (i10 == 509) {
            return 2;
        }
        switch (i10) {
            case 700:
                return 2;
            case 701:
            case 702:
                return 8;
            default:
                switch (i10) {
                    case 705:
                    case 707:
                        return 8;
                    case 706:
                        return 4;
                    default:
                        return -1;
                }
        }
    }
}
