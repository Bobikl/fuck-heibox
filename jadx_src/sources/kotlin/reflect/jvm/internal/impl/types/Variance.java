package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: Variance.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum Variance {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);

    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;

    @dl.d
    private final String label;
    private final int superpositionFactor;

    Variance(String str, boolean z10, boolean z11, int i10) {
        this.label = str;
        this.allowsInPosition = z10;
        this.allowsOutPosition = z11;
        this.superpositionFactor = i10;
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    @dl.d
    public final String getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    @dl.d
    public String toString() {
        return this.label;
    }
}
