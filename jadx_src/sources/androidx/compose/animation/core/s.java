package androidx.compose.animation.core;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s {
    public static /* synthetic */ int a(double d10) {
        long jDoubleToLongBits = Double.doubleToLongBits(d10);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }
}
