package androidx.recyclerview.widget;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes6.dex */
public interface ListUpdateCallback {
    void onChanged(int i10, int i11, @p0 Object obj);

    void onInserted(int i10, int i11);

    void onMoved(int i10, int i11);

    void onRemoved(int i10, int i11);
}
