package androidx.compose.ui.text.input;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.l0, reason: from toString */
/* JADX INFO: compiled from: VisualTransformation.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/input/l0;", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/text/d;", ak.av, "Landroidx/compose/ui/text/d;", "b", "()Landroidx/compose/ui/text/d;", "text", "Landroidx/compose/ui/text/input/x;", "Landroidx/compose/ui/text/input/x;", "()Landroidx/compose/ui/text/input/x;", "offsetMapping", "<init>", "(Landroidx/compose/ui/text/d;Landroidx/compose/ui/text/input/x;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class TransformedText {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16747c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final androidx.compose.ui.text.d text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final x offsetMapping;

    public TransformedText(@dl.d androidx.compose.ui.text.d text, @dl.d x offsetMapping) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(offsetMapping, "offsetMapping");
        this.text = text;
        this.offsetMapping = offsetMapping;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final x getOffsetMapping() {
        return this.offsetMapping;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final androidx.compose.ui.text.d getText() {
        return this.text;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransformedText)) {
            return false;
        }
        TransformedText transformedText = (TransformedText) other;
        return kotlin.jvm.internal.f0.g(this.text, transformedText.text) && kotlin.jvm.internal.f0.g(this.offsetMapping, transformedText.offsetMapping);
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
    }

    @dl.d
    public String toString() {
        return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
    }
}
