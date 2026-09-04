package androidx.compose.foundation.text;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StringHelpers.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "codePoint", ak.av, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class o {
    @dl.d
    public static final StringBuilder a(@dl.d StringBuilder sb2, int i10) {
        f0.p(sb2, "<this>");
        StringBuilder appendCodePointX = sb2.appendCodePoint(i10);
        f0.o(appendCodePointX, "appendCodePointX");
        return appendCodePointX;
    }
}
