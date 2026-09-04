package androidx.compose.ui.text;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.b0, reason: from toString */
/* JADX INFO: compiled from: AndroidTextStyle.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/b0;", "", "", "hashCode", "other", "", "equals", "", "toString", "Landroidx/compose/ui/text/z;", ak.av, "Landroidx/compose/ui/text/z;", "b", "()Landroidx/compose/ui/text/z;", "spanStyle", "Landroidx/compose/ui/text/y;", "Landroidx/compose/ui/text/y;", "()Landroidx/compose/ui/text/y;", "paragraphStyle", "<init>", "(Landroidx/compose/ui/text/z;Landroidx/compose/ui/text/y;)V", "includeFontPadding", "(Z)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class PlatformTextStyle {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16362c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final z spanStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final PlatformParagraphStyle paragraphSyle;

    public PlatformTextStyle(@dl.e z zVar, @dl.e PlatformParagraphStyle platformParagraphStyle) {
        this.spanStyle = zVar;
        this.paragraphSyle = platformParagraphStyle;
    }

    @kotlin.k(message = "includeFontPadding was added to Android in order to prevent clipping issues on tall scripts. However that issue has been fixed since Android 28. Compose backports the fix for Android versions prior to Android 28. Therefore the original reason why includeFontPadding was needed is invalid on Compose.This configuration was added for migration of the apps in case some code or design was relying includeFontPadding=true behavior; and will be removed.")
    public PlatformTextStyle(boolean z10) {
        this(null, new PlatformParagraphStyle(z10));
    }

    public /* synthetic */ PlatformTextStyle(boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? true : z10);
    }

    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final PlatformParagraphStyle getParagraphSyle() {
        return this.paragraphSyle;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final z getSpanStyle() {
        return this.spanStyle;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) other;
        return kotlin.jvm.internal.f0.g(this.paragraphSyle, platformTextStyle.paragraphSyle) && kotlin.jvm.internal.f0.g(this.spanStyle, platformTextStyle.spanStyle);
    }

    public int hashCode() {
        z zVar = this.spanStyle;
        int iHashCode = (zVar != null ? zVar.hashCode() : 0) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.paragraphSyle;
        return iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.spanStyle + ", paragraphSyle=" + this.paragraphSyle + ')';
    }
}
