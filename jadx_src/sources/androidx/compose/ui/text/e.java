package androidx.compose.ui.text;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextMeasurer.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/e;", "", "", "hashCode", "other", "", "equals", "Landroidx/compose/ui/text/h0;", ak.av, "Landroidx/compose/ui/text/h0;", "()Landroidx/compose/ui/text/h0;", "textLayoutInput", "<init>", "(Landroidx/compose/ui/text/h0;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TextLayoutInput textLayoutInput;

    public e(@dl.d TextLayoutInput textLayoutInput) {
        kotlin.jvm.internal.f0.p(textLayoutInput, "textLayoutInput");
        this.textLayoutInput = textLayoutInput;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextLayoutInput getTextLayoutInput() {
        return this.textLayoutInput;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        e eVar = (e) other;
        return kotlin.jvm.internal.f0.g(textLayoutInput.getText(), eVar.textLayoutInput.getText()) && textLayoutInput.getStyle().N(eVar.textLayoutInput.getStyle()) && kotlin.jvm.internal.f0.g(textLayoutInput.i(), eVar.textLayoutInput.i()) && textLayoutInput.getMaxLines() == eVar.textLayoutInput.getMaxLines() && textLayoutInput.getSoftWrap() == eVar.textLayoutInput.getSoftWrap() && androidx.compose.ui.text.style.q.g(textLayoutInput.getOverflow(), eVar.textLayoutInput.getOverflow()) && kotlin.jvm.internal.f0.g(textLayoutInput.getDensity(), eVar.textLayoutInput.getDensity()) && textLayoutInput.getLayoutDirection() == eVar.textLayoutInput.getLayoutDirection() && textLayoutInput.getFontFamilyResolver() == eVar.textLayoutInput.getFontFamilyResolver() && s1.b.p(textLayoutInput.getConstraints()) == s1.b.p(eVar.textLayoutInput.getConstraints()) && s1.b.o(textLayoutInput.getConstraints()) == s1.b.o(eVar.textLayoutInput.getConstraints());
    }

    public int hashCode() {
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        return (((((((((((((((((((textLayoutInput.getText().hashCode() * 31) + textLayoutInput.getStyle().O()) * 31) + textLayoutInput.i().hashCode()) * 31) + textLayoutInput.getMaxLines()) * 31) + androidx.compose.foundation.b0.a(textLayoutInput.getSoftWrap())) * 31) + androidx.compose.ui.text.style.q.h(textLayoutInput.getOverflow())) * 31) + textLayoutInput.getDensity().hashCode()) * 31) + textLayoutInput.getLayoutDirection().hashCode()) * 31) + textLayoutInput.getFontFamilyResolver().hashCode()) * 31) + s1.b.p(textLayoutInput.getConstraints())) * 31) + s1.b.o(textLayoutInput.getConstraints());
    }
}
