package androidx.compose.ui.text.input;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: VisualTransformation.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/input/z;", "Landroidx/compose/ui/text/input/m0;", "Landroidx/compose/ui/text/d;", "text", "Landroidx/compose/ui/text/input/l0;", ak.av, "", "other", "", "equals", "", "hashCode", "", "b", "C", "()C", "mask", "<init>", "(C)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class z implements m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16802c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final char mask;

    public z() {
        this((char) 0, 1, null);
    }

    public z(char c10) {
        this.mask = c10;
    }

    public /* synthetic */ z(char c10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? kotlin.text.y.E : c10);
    }

    @Override // androidx.compose.ui.text.input.m0
    @dl.d
    public TransformedText a(@dl.d androidx.compose.ui.text.d text) {
        kotlin.jvm.internal.f0.p(text, "text");
        return new TransformedText(new androidx.compose.ui.text.d(kotlin.text.u.h2(String.valueOf(this.mask), text.getText().length()), null, null, 6, null), x.INSTANCE.a());
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final char getMask() {
        return this.mask;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof z) && this.mask == ((z) other).mask;
    }

    public int hashCode() {
        return this.mask;
    }
}
