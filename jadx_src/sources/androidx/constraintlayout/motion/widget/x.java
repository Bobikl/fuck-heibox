package androidx.constraintlayout.motion.widget;

/* JADX INFO: compiled from: TransitionBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f19083a = "TransitionBuilder";

    public static s.b a(s sVar, int i10, int i11, androidx.constraintlayout.widget.c cVar, int i12, androidx.constraintlayout.widget.c cVar2) {
        s.b bVar = new s.b(i10, sVar, i11, i12);
        b(sVar, bVar, cVar, cVar2);
        return bVar;
    }

    private static void b(s sVar, s.b bVar, androidx.constraintlayout.widget.c cVar, androidx.constraintlayout.widget.c cVar2) {
        int I = bVar.I();
        int iB = bVar.B();
        sVar.j0(I, cVar);
        sVar.j0(iB, cVar2);
    }

    public static void c(MotionLayout motionLayout) {
        s sVar = motionLayout.J;
        if (sVar == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        if (!sVar.s0(motionLayout)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        if (sVar.f18971c == null || sVar.s().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }
}
