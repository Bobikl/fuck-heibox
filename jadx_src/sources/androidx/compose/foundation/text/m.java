package androidx.compose.foundation.text;

import androidx.compose.ui.text.p0;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import io.flutter.plugin.editing.SpellCheckPlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StringHelpers.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"", "", SpellCheckPlugin.START_INDEX_KEY, "b", ak.av, UCropPlusActivity.ARG_INDEX, "Landroidx/compose/ui/text/o0;", ak.aF, "(Ljava/lang/CharSequence;I)J", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class m {
    public static final int a(@dl.d CharSequence charSequence, int i10) {
        f0.p(charSequence, "<this>");
        int length = charSequence.length();
        for (int i11 = i10 + 1; i11 < length; i11++) {
            if (charSequence.charAt(i11) == '\n') {
                return i11;
            }
        }
        return charSequence.length();
    }

    public static final int b(@dl.d CharSequence charSequence, int i10) {
        f0.p(charSequence, "<this>");
        for (int i11 = i10 - 1; i11 > 0; i11--) {
            if (charSequence.charAt(i11 - 1) == '\n') {
                return i11;
            }
        }
        return 0;
    }

    public static final long c(@dl.d CharSequence charSequence, int i10) {
        f0.p(charSequence, "<this>");
        return p0.b(b(charSequence, i10), a(charSequence, i10));
    }
}
