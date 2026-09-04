package com.umeng.analytics.process;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.umeng.analytics.pro.q;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UMProcessDBHelper {
    private static UMProcessDBHelper mInstance;
    private Context mContext;
    private FileLockUtil mFileLock = new FileLockUtil();
    private InsertEventCallback ekvCallBack = new InsertEventCallback();

    public class InsertEventCallback implements FileLockCallback {
        private InsertEventCallback() {
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(File file, int i10) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) throws Throwable {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (str.startsWith(com.umeng.analytics.process.a.f105008c)) {
                str = str.replaceFirst(com.umeng.analytics.process.a.f105008c, "");
            }
            UMProcessDBHelper.this.insertEvents(str.replace(com.umeng.analytics.process.a.f105009d, ""), (JSONArray) obj);
            return true;
        }
    }

    public class ProcessToMainCallback implements FileLockCallback {
        private ProcessToMainCallback() {
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(File file, int i10) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str) throws Throwable {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (str.startsWith(com.umeng.analytics.process.a.f105008c)) {
                str = str.replaceFirst(com.umeng.analytics.process.a.f105008c, "");
            }
            UMProcessDBHelper.this.processToMain(str.replace(com.umeng.analytics.process.a.f105009d, ""));
            return true;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) {
            return false;
        }
    }

    public class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f104997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f104998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f104999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f105000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f105002f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f105003g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f105004h;

        private a() {
        }
    }

    private UMProcessDBHelper() {
    }

    private UMProcessDBHelper(Context context) {
        com.umeng.common.a.a().a(context);
    }

    private List<a> datasAdapter(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                a aVar = new a();
                aVar.f104999c = jSONObject.optString("id");
                aVar.f105003g = UMUtils.getAppVersionName(this.mContext);
                aVar.f105004h = UMUtils.getAppVersionCode(this.mContext);
                aVar.f104998b = jSONObject.optString("__i");
                aVar.f105001e = jSONObject.optInt("__t");
                aVar.f105002f = str;
                if (jSONObject.has("ds")) {
                    jSONObject.remove("ds");
                }
                jSONObject.put("ds", getDataSource());
                jSONObject.remove("__i");
                jSONObject.remove("__t");
                aVar.f105000d = com.umeng.common.a.a().a(jSONObject.toString());
                jSONObject.remove("ds");
                arrayList.add(aVar);
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private boolean dbIsExists(String str) {
        try {
            return new File(b.b(this.mContext, str)).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    private int getDataSource() {
        return 0;
    }

    public static UMProcessDBHelper getInstance(Context context) {
        if (mInstance == null) {
            synchronized (UMProcessDBHelper.class) {
                if (mInstance == null) {
                    mInstance = new UMProcessDBHelper(context);
                }
            }
        }
        UMProcessDBHelper uMProcessDBHelper = mInstance;
        uMProcessDBHelper.mContext = context;
        return uMProcessDBHelper;
    }

    private boolean insertEvents_(String str, List<a> list) throws Throwable {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return true;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = c.a(this.mContext).a(str);
            try {
                try {
                    sQLiteDatabaseA.beginTransaction();
                    for (a aVar : list) {
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("__i", aVar.f104998b);
                            contentValues.put("__e", aVar.f104999c);
                            contentValues.put("__t", Integer.valueOf(aVar.f105001e));
                            contentValues.put(com.umeng.analytics.process.a.InterfaceC1039a.f105019f, aVar.f105002f);
                            contentValues.put("__av", aVar.f105003g);
                            contentValues.put("__vc", aVar.f105004h);
                            contentValues.put("__s", aVar.f105000d);
                            sQLiteDatabaseA.insert(com.umeng.analytics.process.a.InterfaceC1039a.f105014a, null, contentValues);
                        } catch (Exception unused) {
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseA.endTransaction();
                    } catch (Throwable unused2) {
                    }
                    c.a(this.mContext).b(str);
                    return true;
                } catch (Exception unused3) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused4) {
                        }
                    }
                    c.a(this.mContext).b(str);
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused5) {
                    }
                }
                c.a(this.mContext).b(str);
                throw th;
            }
        } catch (Exception unused6) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean processIsService(Context context) {
        try {
            return context.getPackageManager().getServiceInfo(new ComponentName(context, this.mContext.getClass()), 0) != null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processToMain(String str) throws Throwable {
        if (dbIsExists(str)) {
            List<a> eventByProcess = readEventByProcess(str);
            if (!eventByProcess.isEmpty() && insertEvents_(com.umeng.analytics.process.a.f105013h, eventByProcess)) {
                deleteEventDatas(str, null, eventByProcess);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c2 A[Catch: Exception -> 0x00c5, TRY_LEAVE, TryCatch #6 {Exception -> 0x00c5, blocks: (B:33:0x00bd, B:35:0x00c2), top: B:45:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.umeng.analytics.process.UMProcessDBHelper$1] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v5 */
    private List<a> readEventByProcess(String str) throws Throwable {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursorQuery;
        Exception e10;
        ArrayList arrayList = new ArrayList();
        ?? r10 = 0;
        r10 = 0;
        try {
            try {
                sQLiteDatabaseA = c.a(this.mContext).a(str);
                try {
                    sQLiteDatabaseA.beginTransaction();
                    cursorQuery = sQLiteDatabaseA.query(com.umeng.analytics.process.a.InterfaceC1039a.f105014a, null, null, null, null, null, null);
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                try {
                                    a aVar = new a();
                                    aVar.f104997a = cursorQuery.getInt(0);
                                    aVar.f104998b = cursorQuery.getString(cursorQuery.getColumnIndex("__i"));
                                    aVar.f104999c = cursorQuery.getString(cursorQuery.getColumnIndex("__e"));
                                    aVar.f105000d = cursorQuery.getString(cursorQuery.getColumnIndex("__s"));
                                    aVar.f105001e = cursorQuery.getInt(cursorQuery.getColumnIndex("__t"));
                                    aVar.f105002f = cursorQuery.getString(cursorQuery.getColumnIndex(com.umeng.analytics.process.a.InterfaceC1039a.f105019f));
                                    aVar.f105003g = cursorQuery.getString(cursorQuery.getColumnIndex("__av"));
                                    aVar.f105004h = cursorQuery.getString(cursorQuery.getColumnIndex("__vc"));
                                    arrayList.add(aVar);
                                } catch (Exception e11) {
                                    e10 = e11;
                                    e10.printStackTrace();
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabaseA != null) {
                                    }
                                    c.a(this.mContext).b(str);
                                    return arrayList;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r10 = cursorQuery;
                                if (r10 != 0) {
                                    try {
                                        r10.close();
                                        if (sQLiteDatabaseA != null) {
                                            sQLiteDatabaseA.endTransaction();
                                        }
                                    } catch (Exception unused) {
                                        c.a(this.mContext).b(str);
                                        throw th;
                                    }
                                } else if (sQLiteDatabaseA != null) {
                                    sQLiteDatabaseA.endTransaction();
                                }
                                c.a(this.mContext).b(str);
                                throw th;
                            }
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Exception e12) {
                    cursorQuery = null;
                    e10 = e12;
                } catch (Throwable th3) {
                    th = th3;
                    if (r10 != 0) {
                        r10.close();
                        if (sQLiteDatabaseA != null) {
                            sQLiteDatabaseA.endTransaction();
                        }
                    } else if (sQLiteDatabaseA != null) {
                        sQLiteDatabaseA.endTransaction();
                    }
                    c.a(this.mContext).b(str);
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Exception e13) {
            cursorQuery = null;
            e10 = e13;
            sQLiteDatabaseA = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabaseA = null;
        }
        sQLiteDatabaseA.endTransaction();
        c.a(this.mContext).b(str);
        return arrayList;
    }

    public void createDBByProcess(String str) {
        try {
            c.a(this.mContext).a(str);
            c.a(this.mContext).b(str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void deleteEventDatas(String str, String str2, List<a> list) throws Throwable {
        SQLiteDatabase sQLiteDatabaseA;
        Throwable th2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = c.a(this.mContext).a(str);
            try {
                sQLiteDatabaseA.beginTransaction();
                int size = list.size();
                if (size > 0) {
                    for (int i10 = 0; i10 < size; i10++) {
                        sQLiteDatabaseA.execSQL("delete from __et_p where rowid=" + list.get(i10).f104997a);
                    }
                } else {
                    sQLiteDatabaseA.delete(com.umeng.analytics.process.a.InterfaceC1039a.f105014a, null, null);
                }
                sQLiteDatabaseA.setTransactionSuccessful();
                sQLiteDatabaseA.endTransaction();
            } catch (Exception unused) {
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
            } catch (Throwable th3) {
                th2 = th3;
                if (sQLiteDatabaseA != null) {
                    sQLiteDatabaseA.endTransaction();
                }
                c.a(this.mContext).b(str);
                throw th2;
            }
        } catch (Exception unused2) {
        } catch (Throwable th4) {
            sQLiteDatabaseA = null;
            th2 = th4;
        }
        c.a(this.mContext).b(str);
    }

    public void deleteMainProcessEventDatasByIds(List<Integer> list) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            sQLiteDatabaseA = c.a(this.mContext).a(com.umeng.analytics.process.a.f105013h);
            sQLiteDatabaseA.beginTransaction();
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                sQLiteDatabaseA.delete(com.umeng.analytics.process.a.InterfaceC1039a.f105014a, "id=?", new String[]{String.valueOf(it.next())});
            }
            sQLiteDatabaseA.setTransactionSuccessful();
        } catch (Exception unused) {
            if (sQLiteDatabaseA != null) {
            }
            c.a(this.mContext).b(com.umeng.analytics.process.a.f105013h);
        } catch (Throwable th2) {
            if (sQLiteDatabaseA != null) {
                sQLiteDatabaseA.endTransaction();
            }
            c.a(this.mContext).b(com.umeng.analytics.process.a.f105013h);
            throw th2;
        }
        sQLiteDatabaseA.endTransaction();
        c.a(this.mContext).b(com.umeng.analytics.process.a.f105013h);
    }

    public void insertEvents(String str, JSONArray jSONArray) throws Throwable {
        if (AnalyticsConstants.SUB_PROCESS_EVENT && !TextUtils.isEmpty(str)) {
            insertEvents_(str, datasAdapter(str, jSONArray));
        }
    }

    public void insertEventsInSubProcess(String str, JSONArray jSONArray) throws Throwable {
        if (AnalyticsConstants.SUB_PROCESS_EVENT && !TextUtils.isEmpty(str)) {
            File file = new File(b.b(this.mContext, str));
            if (file.exists()) {
                this.mFileLock.doFileOperateion(file, this.ekvCallBack, jSONArray);
            } else {
                insertEvents(str, jSONArray);
            }
        }
    }

    public void processDBToMain() {
        try {
            DBFileTraversalUtil.traverseDBFiles(b.a(this.mContext), new ProcessToMainCallback(), new DBFileTraversalUtil.a() { // from class: com.umeng.analytics.process.UMProcessDBHelper.1
                @Override // com.umeng.analytics.process.DBFileTraversalUtil.a
                public void a() {
                    if (AnalyticsConstants.SUB_PROCESS_EVENT) {
                        UMWorkDispatch.sendEvent(UMProcessDBHelper.this.mContext, UMProcessDBDatasSender.UM_PROCESS_CONSTRUCTMESSAGE, UMProcessDBDatasSender.getInstance(UMProcessDBHelper.this.mContext), null);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0184  */
    /* JADX WARN: Code duplicated, block: B:80:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public JSONObject readMainEvents(long j10, List<Integer> list) throws Throwable {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursor;
        JSONObject jSONObject = new JSONObject();
        Cursor cursorQuery = null;
        cursorQuery = null;
        cursorQuery = null;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabaseA = c.a(this.mContext).a(com.umeng.analytics.process.a.f105013h);
                try {
                    sQLiteDatabaseA.beginTransaction();
                    cursorQuery = sQLiteDatabaseA.query(com.umeng.analytics.process.a.InterfaceC1039a.f105014a, null, null, null, null, null, null);
                    if (cursorQuery != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        String str = "";
                        while (cursorQuery.moveToNext()) {
                            int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("id"));
                            int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex("__t"));
                            String string = cursorQuery.getString(cursorQuery.getColumnIndex("__i"));
                            String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("__s"));
                            String string3 = cursorQuery.getString(cursorQuery.getColumnIndex(com.umeng.analytics.process.a.InterfaceC1039a.f105019f));
                            String string4 = cursorQuery.getString(cursorQuery.getColumnIndex("__av"));
                            if (!TextUtils.isEmpty(string)) {
                                if (TextUtils.isEmpty(str)) {
                                    str = string4;
                                }
                                if (!TextUtils.isEmpty(string2) && i11 == 2049) {
                                    JSONObject jSONObject3 = new JSONObject(com.umeng.common.a.a().b(string2));
                                    String strOptString = jSONObject3.optString("pn");
                                    if (TextUtils.isEmpty(strOptString) || "unknown".equals(strOptString)) {
                                        jSONObject3.put("pn", this.mContext.getPackageName() + ":" + string3);
                                    }
                                    JSONArray jSONArrayOptJSONArray = jSONObject2.has(string) ? jSONObject2.optJSONArray(string) : new JSONArray();
                                    if (q.a(jSONObject3) + q.a(jSONArrayOptJSONArray) > j10 || !str.equalsIgnoreCase(string4)) {
                                        break;
                                        break;
                                    }
                                    list.add(Integer.valueOf(i10));
                                    jSONArrayOptJSONArray.put(jSONObject3);
                                    jSONObject2.put(string, jSONArrayOptJSONArray);
                                }
                            }
                        }
                        if (jSONObject2.length() > 0) {
                            JSONArray jSONArray = new JSONArray();
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                JSONObject jSONObject4 = new JSONObject();
                                String next = itKeys.next();
                                jSONObject4.put(next, new JSONArray(jSONObject2.optString(next)));
                                if (jSONObject4.length() > 0) {
                                    jSONArray.put(jSONObject4);
                                }
                            }
                            if (jSONArray.length() > 0) {
                                jSONObject.put("ekv", jSONArray);
                            }
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    sQLiteDatabaseA.endTransaction();
                } catch (Exception unused) {
                    cursor = cursorQuery;
                    sQLiteDatabase = sQLiteDatabaseA;
                    try {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建子进程事件数据异常，清除数据库数据。");
                        sQLiteDatabase.execSQL("delete from __et_p");
                        sQLiteDatabase.setTransactionSuccessful();
                        if (cursor != null) {
                            cursor.close();
                        }
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th2) {
                        th = th2;
                        Cursor cursor2 = cursor;
                        sQLiteDatabaseA = sQLiteDatabase;
                        cursorQuery = cursor2;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (sQLiteDatabaseA != null) {
                            try {
                                sQLiteDatabaseA.endTransaction();
                            } catch (Throwable unused2) {
                            }
                        }
                        c.a(this.mContext).b(com.umeng.analytics.process.a.f105013h);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (sQLiteDatabaseA != null) {
                        sQLiteDatabaseA.endTransaction();
                    }
                    c.a(this.mContext).b(com.umeng.analytics.process.a.f105013h);
                    throw th;
                }
            } catch (Throwable unused3) {
            }
        } catch (Exception unused4) {
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabaseA = null;
        }
        c.a(this.mContext).b(com.umeng.analytics.process.a.f105013h);
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008b A[Catch: Exception -> 0x008e, TRY_LEAVE, TryCatch #1 {Exception -> 0x008e, blocks: (B:35:0x0086, B:37:0x008b), top: B:52:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1 A[Catch: Exception -> 0x00a4, TRY_LEAVE, TryCatch #7 {Exception -> 0x00a4, blocks: (B:42:0x009c, B:44:0x00a1), top: B:59:0x009c }] */
    public JSONObject readVersionInfoFromColumId(Integer num) throws Throwable {
        SQLiteDatabase sQLiteDatabaseA;
        JSONObject jSONObject;
        Cursor cursor = null;
        jSONObject = null;
        JSONObject jSONObject2 = null;
        cursor = null;
        cursor = null;
        cursor = null;
        try {
            sQLiteDatabaseA = c.a(this.mContext).a(com.umeng.analytics.process.a.f105013h);
            try {
                try {
                    sQLiteDatabaseA.beginTransaction();
                    Cursor cursorQuery = sQLiteDatabaseA.query(com.umeng.analytics.process.a.InterfaceC1039a.f105014a, null, "rowid=?", new String[]{String.valueOf(num)}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            try {
                                if (cursorQuery.moveToNext()) {
                                    jSONObject = new JSONObject();
                                    try {
                                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("__av"));
                                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("__vc"));
                                        if (!TextUtils.isEmpty(string)) {
                                            jSONObject.put("__av", string);
                                        }
                                        if (!TextUtils.isEmpty(string2)) {
                                            jSONObject.put("__vc", string2);
                                        }
                                        jSONObject2 = jSONObject;
                                    } catch (Exception e10) {
                                        e = e10;
                                        cursor = cursorQuery;
                                        e.printStackTrace();
                                        if (cursor != null) {
                                            try {
                                                cursor.close();
                                                if (sQLiteDatabaseA != null) {
                                                    sQLiteDatabaseA.endTransaction();
                                                }
                                            } catch (Exception unused) {
                                                c.a(this.mContext).b(com.umeng.analytics.process.a.f105013h);
                                                return jSONObject;
                                            }
                                        } else if (sQLiteDatabaseA != null) {
                                            sQLiteDatabaseA.endTransaction();
                                        }
                                        c.a(this.mContext).b(com.umeng.analytics.process.a.f105013h);
                                        return jSONObject;
                                    }
                                }
                            } catch (Exception e11) {
                                e = e11;
                                jSONObject = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                    if (sQLiteDatabaseA != null) {
                                        sQLiteDatabaseA.endTransaction();
                                    }
                                } catch (Exception unused2) {
                                    c.a(this.mContext).b(com.umeng.analytics.process.a.f105013h);
                                    throw th;
                                }
                            } else if (sQLiteDatabaseA != null) {
                                sQLiteDatabaseA.endTransaction();
                            }
                            c.a(this.mContext).b(com.umeng.analytics.process.a.f105013h);
                            throw th;
                        }
                    }
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Exception unused3) {
                        }
                    }
                    sQLiteDatabaseA.endTransaction();
                    c.a(this.mContext).b(com.umeng.analytics.process.a.f105013h);
                    return jSONObject2;
                } catch (Exception e12) {
                    e = e12;
                    jSONObject = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e13) {
            e = e13;
            sQLiteDatabaseA = null;
            jSONObject = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabaseA = null;
        }
    }
}
