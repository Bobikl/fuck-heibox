package androidx.compose.foundation.text;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StringHelpers.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"", "", UCropPlusActivity.ARG_INDEX, "b", ak.av, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class n {
    public static final int a(@dl.d String str, int i10) {
        f0.p(str, "<this>");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i10);
    }

    public static final int b(@dl.d String str, int i10) {
        f0.p(str, "<this>");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }
}
