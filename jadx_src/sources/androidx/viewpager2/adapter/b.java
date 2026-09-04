package androidx.viewpager2.adapter;

import android.os.Parcelable;
import androidx.annotation.n0;

/* JADX INFO: compiled from: StatefulAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public interface b {
    void restoreState(@n0 Parcelable parcelable);

    @n0
    Parcelable saveState();
}
