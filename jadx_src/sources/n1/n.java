package n1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextDecorationSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Ln1/n;", "Landroid/text/style/CharacterStyle;", "Landroid/text/TextPaint;", "textPaint", "Lkotlin/b2;", "updateDrawState", "", "isUnderlineText", "Z", "b", "()Z", "isStrikethroughText", ak.av, "<init>", "(ZZ)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.android.g
public final class n extends CharacterStyle {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f131991c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f131992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f131993b;

    public n(boolean z10, boolean z11) {
        this.f131992a = z10;
        this.f131993b = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF131993b() {
        return this.f131993b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF131992a() {
        return this.f131992a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@dl.d TextPaint textPaint) {
        f0.p(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f131992a);
        textPaint.setStrikeThruText(this.f131993b);
    }
}
