package com.huawei.hms.common.data;

import android.content.ContentValues;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class DataHolderBuilderCreator extends DataHolder.Builder {
    DataHolderBuilderCreator(String[] strArr, String str) {
        super(strArr, (String) null, (DataHolderBuilderCreator) null);
    }

    @Override // com.huawei.hms.common.data.DataHolder.Builder
    public final DataHolder.Builder setDataForContentValuesHashMap(HashMap<String, Object> map) {
        throw new UnsupportedOperationException("DataHolderBuilderCreator unsupported setDataForContentValuesHashMap");
    }

    @Override // com.huawei.hms.common.data.DataHolder.Builder
    public final DataHolder.Builder withRow(ContentValues contentValues) {
        throw new UnsupportedOperationException("DataHolderBuilderCreator unsupported withRow");
    }
}
