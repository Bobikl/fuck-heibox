package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: TypedValues.java */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y {
    static {
        String str = w.c.f17907a;
    }

    public static int a(String str) {
        str.hashCode();
        switch (str) {
            case "easing":
                return 420;
            case "rotationX":
                return 308;
            case "rotationY":
                return 309;
            case "rotationZ":
                return 310;
            case "translationX":
                return 304;
            case "translationY":
                return 305;
            case "translationZ":
                return 306;
            case "progress":
                return 315;
            case "pivotX":
                return 313;
            case "pivotY":
                return 314;
            case "scaleX":
                return 311;
            case "scaleY":
                return 312;
            case "alpha":
                return 403;
            case "curveFit":
                return 401;
            case "pathRotate":
                return 416;
            case "visibility":
                return 402;
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
        if (i10 == 416) {
            return 4;
        }
        if (i10 == 420 || i10 == 421) {
            return 8;
        }
        switch (i10) {
            case 304:
            case 305:
            case 306:
            case 307:
            case 308:
            case 309:
            case 310:
            case 311:
            case 312:
            case 313:
            case 314:
            case 315:
                return 4;
            default:
                switch (i10) {
                    case 401:
                    case 402:
                        return 2;
                    case 403:
                        return 4;
                    default:
                        switch (i10) {
                            case 423:
                            case 424:
                            case 425:
                                return 4;
                            default:
                                return -1;
                        }
                }
        }
    }
}
