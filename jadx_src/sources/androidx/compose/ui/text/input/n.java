package androidx.compose.ui.text.input;

import com.umeng.analytics.pro.ak;
import io.flutter.plugin.editing.SpellCheckPlugin;
import kotlin.Metadata;

/* JADX INFO: compiled from: GapBuffer.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¨\u0006\t"}, d2 = {"", "", "destination", "", "destinationOffset", SpellCheckPlugin.START_INDEX_KEY, SpellCheckPlugin.END_INDEX_KEY, "Lkotlin/b2;", ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class n {
    public static final void a(@dl.d String str, @dl.d char[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.f0.p(str, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        str.getChars(i11, i12, destination, i10);
    }
}
