package com.huawei.hms.common.data;

/* JADX INFO: loaded from: classes7.dex */
public interface DataBufferObserver {
    void onDataChanged();

    void onDataRangeChanged(int i10, int i11);

    void onDataRangeInserted(int i10, int i11);

    void onDataRangeMoved(int i10, int i11, int i12);

    void onDataRangeRemoved(int i10, int i11);
}
