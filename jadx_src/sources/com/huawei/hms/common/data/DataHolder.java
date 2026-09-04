package com.huawei.hms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.common.sqlite.HMSCursorWrapper;
import com.huawei.hms.support.log.HMSLog;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    private static final String TAG = "DataHolder";
    public static final String TYPE_BOOLEAN = "type_boolean";
    public static final String TYPE_BYTE_ARRAY = "type_byte_array";
    public static final String TYPE_DOUBLE = "type_double";
    public static final String TYPE_FLOAT = "type_float";
    public static final String TYPE_INT = "type_int";
    public static final String TYPE_LONG = "type_long";
    public static final String TYPE_STRING = "type_string";
    private String[] columns;
    private Bundle columnsBundle;
    private CursorWindow[] cursorWindows;
    private int dataCount;
    private boolean isInstance;
    private boolean mClosed;
    private Bundle metadata;
    private int[] perCursorCounts;
    private int statusCode;
    private int version;
    public static final Parcelable.Creator<DataHolder> CREATOR = new DataHolderCreator();
    private static final Builder BUILDER = new DataHolderBuilderCreator(new String[0], null);

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String[] f60493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<HashMap<String, Object>> f60494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f60495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final HashMap<Object, Integer> f60496d;

        private Builder(String[] strArr, String str) {
            Preconditions.checkNotNull(strArr, "builderColumnsP cannot be null");
            this.f60493a = strArr;
            this.f60494b = new ArrayList<>();
            this.f60495c = str;
            this.f60496d = new HashMap<>();
        }

        Builder(String[] strArr, String str, DataHolderBuilderCreator dataHolderBuilderCreator) {
            this(strArr, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DataHolder build(int i10) {
            return new DataHolder(this, i10, (Bundle) null);
        }

        public DataHolder build(int i10, Bundle bundle) {
            return new DataHolder(this, i10, bundle, -1);
        }

        public Builder setDataForContentValuesHashMap(HashMap<String, Object> map) {
            int iIntValue;
            Object obj;
            Preconditions.checkNotNull(map, "contentValuesHashMap cannot be null");
            String str = this.f60495c;
            boolean z10 = false;
            if (str == null || (obj = map.get(str)) == null) {
                iIntValue = 0;
            } else {
                Integer num = this.f60496d.get(obj);
                if (num != null) {
                    z10 = true;
                    iIntValue = num.intValue();
                } else {
                    this.f60496d.put(obj, Integer.valueOf(this.f60494b.size()));
                    iIntValue = 0;
                }
            }
            if (z10) {
                this.f60494b.remove(iIntValue);
                this.f60494b.add(iIntValue, map);
            } else {
                this.f60494b.add(map);
            }
            return this;
        }

        public Builder withRow(ContentValues contentValues) {
            Preconditions.checkNotNull(contentValues, "contentValues cannot be null");
            HashMap<String, Object> map = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return setDataForContentValuesHashMap(map);
        }
    }

    public static class DataHolderException extends RuntimeException {
        public DataHolderException(String str) {
            super(str);
        }
    }

    DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.mClosed = false;
        this.isInstance = true;
        this.version = i10;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i11;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    public DataHolder(Cursor cursor, int i10, Bundle bundle) {
        this(new HMSCursorWrapper(cursor), i10, bundle);
    }

    private DataHolder(Builder builder, int i10, Bundle bundle) {
        this(builder.f60493a, getCursorWindows(builder, -1), i10, (Bundle) null);
    }

    private DataHolder(Builder builder, int i10, Bundle bundle, int i11) {
        this(builder.f60493a, getCursorWindows(builder, -1), i10, bundle);
    }

    private DataHolder(HMSCursorWrapper hMSCursorWrapper, int i10, Bundle bundle) {
        this(hMSCursorWrapper.getColumnNames(), getCursorWindows(hMSCursorWrapper), i10, bundle);
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i10, Bundle bundle) {
        Preconditions.checkNotNull(strArr, "columnsP cannot be null");
        Preconditions.checkNotNull(cursorWindowArr, "cursorWindowP cannot be null");
        this.mClosed = false;
        this.isInstance = true;
        this.version = 1;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i10;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, (String) null);
    }

    private void checkAvailable(String str, int i10) {
        String str2;
        Bundle bundle = this.columnsBundle;
        if (bundle == null || !bundle.containsKey(str)) {
            str2 = "cannot find column: " + str;
        } else if (isClosed()) {
            str2 = "buffer has been closed";
        } else if (i10 < 0 || i10 >= this.dataCount) {
            str2 = "row is out of index:" + i10;
        } else {
            str2 = "";
        }
        Preconditions.checkArgument(str2.isEmpty(), str2);
    }

    public static DataHolder empty(int i10) {
        return new DataHolder(BUILDER, i10, (Bundle) null);
    }

    private static CursorWindow[] getCursorWindows(Builder builder, int i10) {
        if (builder.f60493a.length == 0) {
            return new CursorWindow[0];
        }
        if (i10 < 0 || i10 >= builder.f60494b.size()) {
            i10 = builder.f60494b.size();
        }
        ArrayList<CursorWindow> arrayListIterCursorWindow = iterCursorWindow(builder, i10, builder.f60494b.subList(0, i10));
        return (CursorWindow[]) arrayListIterCursorWindow.toArray(new CursorWindow[arrayListIterCursorWindow.size()]);
    }

    private static CursorWindow[] getCursorWindows(HMSCursorWrapper hMSCursorWrapper) {
        int numRows;
        ArrayList arrayList = new ArrayList();
        try {
            int count = hMSCursorWrapper.getCount();
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                numRows = 0;
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
                arrayList.add(window);
                numRows = window.getNumRows();
            }
            arrayList.addAll(iterCursorWrapper(hMSCursorWrapper, numRows, count));
            CursorWindow[] cursorWindowArr = (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
            hMSCursorWrapper.close();
            return cursorWindowArr;
        } catch (Throwable th2) {
            try {
                HMSLog.e(TAG, "fail to getCursorWindows: " + th2.getMessage());
                return new CursorWindow[0];
            } finally {
                hMSCursorWrapper.close();
            }
        }
    }

    private static ArrayList<CursorWindow> iterCursorWindow(Builder builder, int i10, List list) {
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        CursorWindow cursorWindow = new CursorWindow((String) null);
        cursorWindow.setNumColumns(builder.f60493a.length);
        arrayList.add(cursorWindow);
        for (int i11 = 0; i11 < i10; i11++) {
            try {
                if (!cursorWindow.allocRow()) {
                    HMSLog.d(TAG, "Failed to allocate a row");
                    cursorWindow = new CursorWindow((String) null);
                    cursorWindow.setStartPosition(i11);
                    cursorWindow.setNumColumns(builder.f60493a.length);
                    if (!cursorWindow.allocRow()) {
                        HMSLog.e(TAG, "Failed to retry to allocate a row");
                        return arrayList;
                    }
                    arrayList.add(cursorWindow);
                }
                HashMap map = (HashMap) list.get(i11);
                boolean zPutValue = true;
                for (int i12 = 0; i12 < builder.f60493a.length && (zPutValue = putValue(cursorWindow, map.get(builder.f60493a[i12]), i11, i12)); i12++) {
                }
                if (!zPutValue) {
                    HMSLog.d(TAG, "fail to put data for row " + i11);
                    cursorWindow.freeLastRow();
                    CursorWindow cursorWindow2 = new CursorWindow((String) null);
                    cursorWindow2.setStartPosition(i11);
                    cursorWindow2.setNumColumns(builder.f60493a.length);
                    arrayList.add(cursorWindow2);
                    break;
                }
            } catch (RuntimeException e10) {
                Iterator<CursorWindow> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                throw e10;
            }
        }
        return arrayList;
    }

    private static ArrayList<CursorWindow> iterCursorWrapper(HMSCursorWrapper hMSCursorWrapper, int i10, int i11) {
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        while (i10 < i11 && hMSCursorWrapper.moveToPosition(i10)) {
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null) {
                window = new CursorWindow((String) null);
                window.setStartPosition(i10);
                hMSCursorWrapper.fillWindow(i10, window);
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
            }
            if (window.getNumRows() == 0) {
                break;
            }
            arrayList.add(window);
            i10 = window.getNumRows() + window.getStartPosition();
        }
        return arrayList;
    }

    private static boolean putValue(CursorWindow cursorWindow, Object obj, int i10, int i11) throws IllegalArgumentException {
        if (obj == null) {
            return cursorWindow.putNull(i10, i11);
        }
        if (obj instanceof Boolean) {
            return cursorWindow.putLong(((Boolean) obj).booleanValue() ? 1L : 0L, i10, i11);
        }
        if (obj instanceof Integer) {
            return cursorWindow.putLong(((Integer) obj).intValue(), i10, i11);
        }
        if (obj instanceof Long) {
            return cursorWindow.putLong(((Long) obj).longValue(), i10, i11);
        }
        if (obj instanceof Float) {
            return cursorWindow.putDouble(((Float) obj).floatValue(), i10, i11);
        }
        if (obj instanceof Double) {
            return cursorWindow.putDouble(((Double) obj).doubleValue(), i10, i11);
        }
        if (obj instanceof String) {
            return cursorWindow.putString((String) obj, i10, i11);
        }
        if (obj instanceof byte[]) {
            return cursorWindow.putBlob((byte[]) obj, i10, i11);
        }
        throw new IllegalArgumentException("unsupported type for column: " + obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.mClosed) {
            for (CursorWindow cursorWindow : this.cursorWindows) {
                cursorWindow.close();
            }
            this.mClosed = true;
        }
    }

    public final void collectColumsAndCount() {
        this.columnsBundle = new Bundle();
        String[] strArr = this.columns;
        int i10 = 0;
        if (strArr == null || strArr.length == 0) {
            this.dataCount = 0;
            return;
        }
        int i11 = 0;
        while (true) {
            String[] strArr2 = this.columns;
            if (i11 >= strArr2.length) {
                break;
            }
            this.columnsBundle.putInt(strArr2[i11], i11);
            i11++;
        }
        CursorWindow[] cursorWindowArr = this.cursorWindows;
        if (cursorWindowArr == null || cursorWindowArr.length == 0) {
            this.dataCount = 0;
            return;
        }
        this.perCursorCounts = new int[cursorWindowArr.length];
        int startPosition = 0;
        while (true) {
            CursorWindow[] cursorWindowArr2 = this.cursorWindows;
            if (i10 >= cursorWindowArr2.length) {
                this.dataCount = startPosition;
                return;
            } else {
                this.perCursorCounts[i10] = startPosition;
                startPosition = cursorWindowArr2[i10].getStartPosition() + this.cursorWindows[i10].getNumRows();
                i10++;
            }
        }
    }

    public final void copyToBuffer(String str, int i10, int i11, CharArrayBuffer charArrayBuffer) {
        checkAvailable(str, i10);
        this.cursorWindows[i11].copyStringToBuffer(i10, this.columnsBundle.getInt(str), charArrayBuffer);
    }

    protected final void finalize() throws Throwable {
        if (this.isInstance && this.cursorWindows.length > 0 && !isClosed()) {
            close();
        }
        super.finalize();
    }

    public final int getCount() {
        return this.dataCount;
    }

    public final Bundle getMetadata() {
        return this.metadata;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final Object getValue(String str, int i10, int i11, String str2) {
        str2.hashCode();
        switch (str2) {
            case "type_float":
                checkAvailable(str, i10);
                return Float.valueOf(this.cursorWindows[i11].getFloat(i10, this.columnsBundle.getInt(str)));
            case "type_boolean":
                checkAvailable(str, i10);
                return Boolean.valueOf(this.cursorWindows[i11].getLong(i10, this.columnsBundle.getInt(str)) == 1);
            case "type_int":
                checkAvailable(str, i10);
                return Integer.valueOf(this.cursorWindows[i11].getInt(i10, this.columnsBundle.getInt(str)));
            case "type_double":
                checkAvailable(str, i10);
                return Double.valueOf(this.cursorWindows[i11].getDouble(i10, this.columnsBundle.getInt(str)));
            case "type_long":
                checkAvailable(str, i10);
                return Long.valueOf(this.cursorWindows[i11].getLong(i10, this.columnsBundle.getInt(str)));
            case "type_string":
                checkAvailable(str, i10);
                return this.cursorWindows[i11].getString(i10, this.columnsBundle.getInt(str));
            case "type_byte_array":
                checkAvailable(str, i10);
                return this.cursorWindows[i11].getBlob(i10, this.columnsBundle.getInt(str));
            default:
                return null;
        }
    }

    public final int getWindowIndex(int i10) {
        int[] iArr;
        int i11 = 0;
        Preconditions.checkArgument(i10 >= 0 || i10 < this.dataCount, "rowIndex is out of index:" + i10);
        while (true) {
            iArr = this.perCursorCounts;
            if (i11 >= iArr.length) {
                break;
            }
            if (i10 < iArr[i11]) {
                i11--;
                break;
            }
            i11++;
        }
        return i11 == iArr.length ? i11 - 1 : i11;
    }

    public final boolean hasColumn(String str) {
        return this.columnsBundle.containsKey(str);
    }

    public final boolean hasNull(String str, int i10, int i11) {
        checkAvailable(str, i10);
        return this.cursorWindows[i11].getType(i10, this.columnsBundle.getInt(str)) == 0;
    }

    public final synchronized boolean isClosed() {
        return this.mClosed;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.columns, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.cursorWindows, i10, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.version);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
