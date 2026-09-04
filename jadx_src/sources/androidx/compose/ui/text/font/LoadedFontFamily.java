package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.n0, reason: from toString */
/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/font/n0;", "Landroidx/compose/ui/text/font/v;", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/text/font/a1;", "i", "Landroidx/compose/ui/text/font/a1;", "l", "()Landroidx/compose/ui/text/font/a1;", "typeface", "<init>", "(Landroidx/compose/ui/text/font/a1;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class LoadedFontFamily extends v {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f16606j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final a1 typeface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadedFontFamily(@dl.d a1 typeface) {
        super(true, null);
        kotlin.jvm.internal.f0.p(typeface, "typeface");
        this.typeface = typeface;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LoadedFontFamily) && kotlin.jvm.internal.f0.g(this.typeface, ((LoadedFontFamily) other).typeface);
    }

    public int hashCode() {
        return this.typeface.hashCode();
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final a1 getTypeface() {
        return this.typeface;
    }

    @dl.d
    public String toString() {
        return "LoadedFontFamily(typeface=" + this.typeface + ')';
    }
}
