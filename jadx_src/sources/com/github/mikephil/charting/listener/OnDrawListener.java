package com.github.mikephil.charting.listener;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;

/* JADX INFO: loaded from: classes6.dex */
public interface OnDrawListener {
    void onDrawFinished(DataSet<?> dataSet);

    void onEntryAdded(Entry entry);

    void onEntryMoved(Entry entry);
}
