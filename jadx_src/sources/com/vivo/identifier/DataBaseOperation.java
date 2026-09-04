package com.vivo.identifier;

import android.content.ContentValues;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class DataBaseOperation {
    private static final String AAID_FLAG = "AAID";
    private static final String ID_VALUE = "value";
    private static final String OAIDSTATUS_FLAG = "OAIDSTATUS";
    private static final String OAID_FLAG = "OAID";
    private static final String OAID_STATE_FLAG = "OAIDSTATE";
    private static final String OAID_STATE_PERMISSION_FLAG = "OAIDSTATEPERMISSION";
    private static final String REPORT_STATISTICS = "STATISTICS";
    private static final String TAG = "VMS_SDK_DB";
    private static final int TYPE_AAID = 2;
    private static final int TYPE_OAID = 0;
    private static final int TYPE_OAIDSTATUS = 4;
    private static final int TYPE_OAID_LIMITED = 12;
    private static final int TYPE_OAID_STATE_PERMISSION = 14;
    private static final int TYPE_REPORT_STATISTICS = 7;
    private static final int TYPE_VAID = 1;
    private static final String URI_BASE = "content://com.vivo.vms.IdProvider/IdentifierId";
    private static final String VAID_FLAG = "VAID";
    private Context mContext;

    public DataBaseOperation(Context context) {
        this.mContext = context;
    }

    public native boolean insert(int i10, String str, ContentValues[] contentValuesArr);

    public native String query(int i10, String str);
}
