package androidx.compose.ui.text.android;

import android.text.Spanned;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SpannedExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000\u001a(\u0010\b\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¨\u0006\t"}, d2 = {"Landroid/text/Spanned;", "Ljava/lang/Class;", "clazz", "", ak.av, "", "startInclusive", "endExclusive", "b", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class q {
    public static final boolean a(@dl.d Spanned spanned, @dl.d Class<?> clazz) {
        kotlin.jvm.internal.f0.p(spanned, "<this>");
        kotlin.jvm.internal.f0.p(clazz, "clazz");
        return spanned.nextSpanTransition(-1, spanned.length(), clazz) != spanned.length();
    }

    public static final boolean b(@dl.d Spanned spanned, @dl.d Class<?> clazz, int i10, int i11) {
        kotlin.jvm.internal.f0.p(spanned, "<this>");
        kotlin.jvm.internal.f0.p(clazz, "clazz");
        return spanned.nextSpanTransition(i10 - 1, i11, clazz) != i11;
    }
}
