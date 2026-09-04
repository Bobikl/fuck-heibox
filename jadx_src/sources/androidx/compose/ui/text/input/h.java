package androidx.compose.ui.text.input;

import kotlin.Metadata;

/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¨\u0006\u0005"}, d2 = {"", "high", "low", "", "b", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(char c10, char c11) {
        return Character.isHighSurrogate(c10) && Character.isLowSurrogate(c11);
    }
}
