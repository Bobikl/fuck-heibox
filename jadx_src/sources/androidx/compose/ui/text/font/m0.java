package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/font/m0;", "Landroidx/compose/ui/text/font/z0;", "", "toString", "j", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "name", "k", "fontFamilyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class m0 extends z0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String name;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String fontFamilyName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(@dl.d String name, @dl.d String fontFamilyName) {
        super(null);
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(fontFamilyName, "fontFamilyName");
        this.name = name;
        this.fontFamilyName = fontFamilyName;
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @dl.d
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getFontFamilyName() {
        return this.fontFamilyName;
    }
}
