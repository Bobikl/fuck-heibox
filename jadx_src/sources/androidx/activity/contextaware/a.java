package androidx.activity.contextaware;

import android.content.Context;
import dl.d;
import dl.e;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes.dex */
public interface a {
    void addOnContextAvailableListener(@d c cVar);

    @e
    Context peekAvailableContext();

    void removeOnContextAvailableListener(@d c cVar);
}
