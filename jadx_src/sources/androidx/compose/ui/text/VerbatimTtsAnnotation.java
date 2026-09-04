package androidx.compose.ui.text;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.u0, reason: from toString */
/* JADX INFO: compiled from: TtsAnnotation.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/u0;", "Landroidx/compose/ui/text/s0;", "", "other", "", "equals", "", "hashCode", "", "toString", "b", "Ljava/lang/String;", ak.av, "()Ljava/lang/String;", "verbatim", "<init>", "(Ljava/lang/String;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class VerbatimTtsAnnotation extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16985c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final String verbatim;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerbatimTtsAnnotation(@dl.d String verbatim) {
        super(null);
        kotlin.jvm.internal.f0.p(verbatim, "verbatim");
        this.verbatim = verbatim;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getVerbatim() {
        return this.verbatim;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VerbatimTtsAnnotation) && kotlin.jvm.internal.f0.g(this.verbatim, ((VerbatimTtsAnnotation) other).verbatim);
    }

    public int hashCode() {
        return this.verbatim.hashCode();
    }

    @dl.d
    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.verbatim + ')';
    }
}
