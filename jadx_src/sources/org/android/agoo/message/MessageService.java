package org.android.agoo.message;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LruCache;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.j;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.ArrayList;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.MsgDO;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public class MessageService {
    public static final String MSG_ACCS_NOTIFY_CLICK = "8";
    public static final String MSG_ACCS_NOTIFY_DISMISS = "9";
    public static final String MSG_ACCS_READY_REPORT = "4";
    public static final String MSG_DB_COMPLETE = "100";
    public static final String MSG_DB_NOTIFY_CLICK = "2";
    public static final String MSG_DB_NOTIFY_DISMISS = "3";
    public static final String MSG_DB_NOTIFY_REACHED = "1";
    public static final String MSG_DB_READY_REPORT = "0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f132851a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static LruCache<String, Integer> f132852c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile SQLiteOpenHelper f132853b = null;

    /* JADX INFO: compiled from: Taobao */
    public static class a extends SQLiteOpenHelper {
        public a(Context context) {
            super(context, "message_accs_db", (SQLiteDatabase.CursorFactory) null, 3);
        }

        private String a() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("create table accs_message");
            stringBuffer.append("(");
            stringBuffer.append("id text UNIQUE not null,");
            stringBuffer.append("state text,");
            stringBuffer.append("message text,");
            stringBuffer.append("create_time date");
            stringBuffer.append(");");
            return stringBuffer.toString();
        }

        private String b() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("create table message");
            stringBuffer.append("(");
            stringBuffer.append("id text UNIQUE not null,");
            stringBuffer.append("state integer,");
            stringBuffer.append("body_code integer,");
            stringBuffer.append("report long,");
            stringBuffer.append("target_time long,");
            stringBuffer.append("interval integer,");
            stringBuffer.append("type text,");
            stringBuffer.append("message text,");
            stringBuffer.append("notify integer,");
            stringBuffer.append("create_time date");
            stringBuffer.append(");");
            return stringBuffer.toString();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public SQLiteDatabase getWritableDatabase() {
            if (j.a(super.getWritableDatabase().getPath(), 102400)) {
                return super.getWritableDatabase();
            }
            return null;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL(b());
                    sQLiteDatabase.execSQL("CREATE INDEX id_index ON message(id)");
                    sQLiteDatabase.execSQL("CREATE INDEX body_code_index ON message(body_code)");
                    sQLiteDatabase.execSQL(a());
                } catch (Throwable th2) {
                    ALog.e("MessageService", "messagedbhelper create", th2, new Object[0]);
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL("delete from message where create_time< date('now','-7 day') and state=1");
                } catch (Throwable th2) {
                    try {
                        ALog.e("MessageService", "messagedbhelper create", th2, new Object[0]);
                        try {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accs_message");
                            sQLiteDatabase.execSQL(a());
                            return;
                        } catch (Throwable th3) {
                            ALog.e("MessageService", "MessageService onUpgrade is error", th3, new Object[0]);
                            return;
                        }
                    } catch (Throwable th4) {
                        try {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accs_message");
                            sQLiteDatabase.execSQL(a());
                        } catch (Throwable th5) {
                            ALog.e("MessageService", "MessageService onUpgrade is error", th5, new Object[0]);
                        }
                        throw th4;
                    }
                }
            }
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accs_message");
                sQLiteDatabase.execSQL(a());
            } catch (Throwable th6) {
                ALog.e("MessageService", "MessageService onUpgrade is error", th6, new Object[0]);
            }
        }
    }

    private static Bundle a(long j10, MsgDO msgDO) {
        Bundle bundle = new Bundle();
        try {
            char[] charArray = Long.toBinaryString(j10).toCharArray();
            if (charArray != null && 8 <= charArray.length) {
                if (8 <= charArray.length) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("");
                    sb2.append(Integer.parseInt("" + charArray[1] + charArray[2] + charArray[3] + charArray[4], 2));
                    bundle.putString(AgooConstants.MESSAGE_ENCRYPTED, sb2.toString());
                    if (charArray[6] == '1') {
                        bundle.putString("report", "1");
                        msgDO.reportStr = "1";
                    }
                    if (charArray[7] == '1') {
                        bundle.putString("notify", "1");
                    }
                }
                if (9 <= charArray.length && charArray[8] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_HAS_TEST, "1");
                }
                if (10 <= charArray.length && charArray[9] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_DUPLICATE, "1");
                }
                if (11 <= charArray.length && charArray[10] == '1') {
                    bundle.putInt(AgooConstants.MESSAGE_POPUP, 1);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    private String a(Throwable th2) {
        StringBuffer stringBuffer = new StringBuffer();
        StackTraceElement[] stackTrace = th2.getStackTrace();
        if (stackTrace != null && stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stringBuffer.append(stackTraceElement.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    private void a(String str, String str2, String str3, int i10, long j10, int i11, int i12) {
        Throwable th2;
        int iHashCode;
        String str4;
        ALog.d("MessageService", "add sqlite3--->[" + str + "]", new Object[0]);
        SQLiteClosable sQLiteClosable = null;
        try {
            String str5 = "";
            if (TextUtils.isEmpty(str2)) {
                iHashCode = -1;
                str4 = "";
            } else {
                iHashCode = str2.hashCode();
                str4 = str2;
            }
            if (!TextUtils.isEmpty(str3)) {
                str5 = str3;
            }
            if (f132852c.get(str) == null) {
                f132852c.put(str, Integer.valueOf(iHashCode));
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.i("MessageService", "addMessage,messageId=" + str + ", mCache size:" + f132852c.size(), new Object[0]);
                }
            }
            try {
                SQLiteDatabase writableDatabase = this.f132853b.getWritableDatabase();
                if (writableDatabase == null) {
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.close();
                            return;
                        } catch (Throwable th3) {
                            if (ALog.isPrintLog(ALog.Level.E)) {
                                ALog.e("MessageService", "addMessage,db.close(),error,e--->[" + th3 + "]", new Object[0]);
                            }
                            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", j.b(f132851a), "addMessageDBcloseFailed", th3.toString());
                            return;
                        }
                    }
                    return;
                }
                writableDatabase.execSQL("INSERT INTO message VALUES(?,?,?,?,?,?,?,?,?,date('now'))", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(iHashCode), 0, Long.valueOf(j10), Integer.valueOf(i11), str5, str4, Integer.valueOf(i12)});
                try {
                    writableDatabase.close();
                    return;
                } catch (Throwable th4) {
                    th2 = th4;
                    if (ALog.isPrintLog(ALog.Level.E)) {
                        ALog.e("MessageService", "addMessage,db.close(),error,e--->[" + th2 + "]", new Object[0]);
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                try {
                    if (ALog.isPrintLog(ALog.Level.E)) {
                        ALog.e("MessageService", "addMessage error,e--->[" + th + "]", new Object[0]);
                    }
                    UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", j.b(f132851a), "addMessageFailed", th.toString());
                    if (0 == 0) {
                        return;
                    }
                    try {
                        return;
                    } catch (Throwable th6) {
                        th2 = th6;
                        if (ALog.isPrintLog(ALog.Level.E)) {
                            ALog.e("MessageService", "addMessage,db.close(),error,e--->[" + th2 + "]", new Object[0]);
                        }
                    }
                } finally {
                    if (0 != 0) {
                        try {
                            sQLiteClosable.close();
                        } catch (Throwable th7) {
                            if (ALog.isPrintLog(ALog.Level.E)) {
                                ALog.e("MessageService", "addMessage,db.close(),error,e--->[" + th7 + "]", new Object[0]);
                            }
                            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", j.b(f132851a), "addMessageDBcloseFailed", th7.toString());
                        }
                    }
                }
            }
        } catch (Throwable th8) {
            th = th8;
        }
        UTMini uTMini = UTMini.getInstance();
        int i13 = AgooConstants.AGOO_EVENT_ID;
        String strB = j.b(f132851a);
        String string = th2.toString();
    }

    public static final boolean a(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 0) != null;
        } catch (Throwable unused) {
        }
    }

    private MsgDO b(String str, String str2) {
        boolean z10;
        ALog.Level level = ALog.Level.I;
        if (ALog.isPrintLog(level)) {
            ALog.i("MessageService", "msgRecevie,message--->[" + str + "],utdid=" + j.b(f132851a), new Object[0]);
        }
        String string = null;
        if (TextUtils.isEmpty(str)) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.dealMessage", j.b(f132851a), "message==null");
            if (ALog.isPrintLog(level)) {
                ALog.i("MessageService", "handleMessage message==null,utdid=" + j.b(f132851a), new Object[0]);
            }
            return null;
        }
        MsgDO msgDO = new MsgDO();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            new Bundle();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (jSONObject != null) {
                    String string2 = jSONObject.getString("p");
                    String string3 = jSONObject.getString("i");
                    String string4 = jSONObject.getString("b");
                    long j10 = jSONObject.getLong("f");
                    if (!jSONObject.isNull(SocializeProtocolConstants.PROTOCOL_KEY_EXTEND)) {
                        string = jSONObject.getString(SocializeProtocolConstants.PROTOCOL_KEY_EXTEND);
                    }
                    int i11 = length - 1;
                    msgDO.msgIds = string3;
                    msgDO.extData = string;
                    msgDO.messageSource = "accs";
                    msgDO.type = "cache";
                    if (TextUtils.isEmpty(string4)) {
                        msgDO.errorCode = "11";
                    } else if (TextUtils.isEmpty(string2)) {
                        msgDO.errorCode = "12";
                    } else if (j10 == -1) {
                        msgDO.errorCode = "13";
                    } else if (a(f132851a, string2)) {
                        String string5 = a(j10, msgDO).getString(AgooConstants.MESSAGE_ENCRYPTED);
                        if (!f132851a.getPackageName().equals(string2)) {
                            z10 = true;
                        } else if (TextUtils.equals(Integer.toString(0), string5) || TextUtils.equals(Integer.toString(4), string5)) {
                            z10 = false;
                        } else {
                            msgDO.errorCode = "15";
                            ALog.e("MessageService", "error encrypted: " + string5, new Object[0]);
                        }
                        msgDO.agooFlag = z10;
                        if (!TextUtils.isEmpty(str2)) {
                            msgDO.msgStatus = str2;
                        }
                    } else {
                        ALog.d("MessageService", "ondata checkpackage is del,pack=" + string2, new Object[0]);
                        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.dealMessage", j.b(f132851a), "deletePack", string2);
                        msgDO.removePacks = string2;
                    }
                }
            }
        } catch (Throwable th2) {
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.e("MessageService", "createMsg is error,e: " + th2, new Object[0]);
            }
        }
        return msgDO;
    }

    public void a() {
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = this.f132853b.getWritableDatabase();
            if (writableDatabase == null) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            }
            writableDatabase.execSQL("delete from message where create_time< date('now','-7 day') and state=1");
            writableDatabase.execSQL("delete from accs_message where create_time< date('now','-1 day') ");
        } catch (Throwable th2) {
            try {
                ALog.e("MessageService", "deleteCacheMessage sql Throwable", th2, new Object[0]);
            } finally {
                if (0 != 0) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    public void a(Context context) {
        f132852c = new LruCache<>(100);
        f132851a = context;
        this.f132853b = new a(context);
    }

    public void a(String str, String str2) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i("MessageService", "updateAccsMessage sqlite3--->[" + str + ",state=" + str2 + "]", new Object[0]);
        }
        SQLiteDatabase writableDatabase = null;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                writableDatabase = this.f132853b.getWritableDatabase();
                if (writableDatabase == null) {
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } else if (TextUtils.equals(str2, "1")) {
                    writableDatabase.execSQL("UPDATE accs_message set state = ? where id = ? and state = ?", new Object[]{str2, str, "0"});
                } else {
                    writableDatabase.execSQL("UPDATE accs_message set state = ? where id = ?", new Object[]{str2, str});
                }
            }
        } catch (Throwable th2) {
            try {
                if (ALog.isPrintLog(ALog.Level.E)) {
                    ALog.e("MessageService", "updateAccsMessage error,e--->[" + th2 + "],ex=" + th2.getStackTrace().toString(), new Object[0]);
                }
                UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", j.b(f132851a), "updateAccsMessageFailed", th2.toString());
            } finally {
                if (0 != 0) {
                    writableDatabase.close();
                }
            }
        }
    }

    public void a(String str, String str2, String str3) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i("MessageService", "addAccsMessage sqlite3--->[" + str + ",message=" + str2 + ",state=" + str3 + "]", new Object[0]);
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                SQLiteDatabase writableDatabase = this.f132853b.getWritableDatabase();
                if (writableDatabase == null) {
                    if (writableDatabase != null) {
                        writableDatabase.close();
                        return;
                    }
                    return;
                }
                try {
                    Cursor cursorRawQuery = writableDatabase.rawQuery("select count(1) from accs_message where id = ?", new String[]{str});
                    if (cursorRawQuery != null && cursorRawQuery.moveToFirst() && cursorRawQuery.getInt(0) > 0) {
                        cursorRawQuery.close();
                        cursorRawQuery.close();
                        writableDatabase.close();
                    } else {
                        writableDatabase.execSQL("INSERT INTO accs_message VALUES(?,?,?,date('now'))", new Object[]{str, str3, str2});
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        writableDatabase.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = writableDatabase;
                    try {
                        if (ALog.isPrintLog(ALog.Level.E)) {
                            ALog.e("MessageService", "addAccsMessage error,e--->[" + th + "],ex=" + a(th), new Object[0]);
                        }
                        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.add_agoo_message", j.b(f132851a), "addAccsMessageFailed", th.toString());
                    } finally {
                        if (sQLiteDatabase != 0) {
                            sQLiteDatabase.close();
                        }
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void a(String str, String str2, String str3, int i10) {
        a(str, str2, str3, 1, -1L, -1, i10);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006c A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #5 {all -> 0x006f, blocks: (B:31:0x0067, B:33:0x006c), top: B:50:0x0067 }] */
    public boolean a(String str) {
        SQLiteDatabase readableDatabase;
        boolean z10;
        Cursor cursorRawQuery = null;
        boolean z11 = false;
        try {
            if (f132852c.get(str) != null) {
                if (ALog.isPrintLog(ALog.Level.E)) {
                    ALog.e("MessageService", "hasMessageDuplicate,msgid=" + str, new Object[0]);
                }
                z10 = true;
            } else {
                z10 = false;
            }
            try {
                readableDatabase = this.f132853b.getReadableDatabase();
                if (readableDatabase == null) {
                    if (readableDatabase != null) {
                        try {
                            readableDatabase.close();
                        } catch (Throwable unused) {
                        }
                    }
                    return z10;
                }
                try {
                    cursorRawQuery = readableDatabase.rawQuery("select count(1) from message where id = ?", new String[]{str});
                    boolean z12 = (cursorRawQuery == null || !cursorRawQuery.moveToFirst() || cursorRawQuery.getInt(0) <= 0) ? z10 : true;
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Throwable unused2) {
                            return z12;
                        }
                    }
                    readableDatabase.close();
                    return z12;
                } catch (Throwable unused3) {
                    z11 = z10;
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                            if (readableDatabase != null) {
                                readableDatabase.close();
                            }
                        } catch (Throwable unused4) {
                            return z11;
                        }
                    } else if (readableDatabase != null) {
                        readableDatabase.close();
                    }
                    return z11;
                }
            } catch (Throwable unused5) {
                readableDatabase = null;
            }
        } catch (Throwable unused6) {
            readableDatabase = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #1 {all -> 0x0089, blocks: (B:33:0x0081, B:35:0x0086), top: B:44:0x0081 }] */
    public boolean a(String str, int i10) {
        SQLiteDatabase readableDatabase;
        boolean z10;
        Cursor cursorRawQuery = null;
        boolean z11 = false;
        try {
            Integer num = f132852c.get(str);
            if (num == null || i10 != num.intValue()) {
                z10 = false;
            } else {
                if (ALog.isPrintLog(ALog.Level.E)) {
                    ALog.e("MessageService", "hasMessageDuplicate,msgid=" + str, new Object[0]);
                }
                z10 = true;
            }
            try {
                readableDatabase = this.f132853b.getReadableDatabase();
                if (readableDatabase == null) {
                    if (readableDatabase != null) {
                        try {
                            readableDatabase.close();
                        } catch (Throwable unused) {
                        }
                    }
                    return z10;
                }
                try {
                    cursorRawQuery = readableDatabase.rawQuery("select count(1) from message where id = ? and body_code=? create_time< date('now','-1 day')", new String[]{str, "" + i10});
                    boolean z12 = (cursorRawQuery == null || !cursorRawQuery.moveToFirst() || cursorRawQuery.getInt(0) <= 0) ? z10 : true;
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Throwable unused2) {
                            return z12;
                        }
                    }
                    readableDatabase.close();
                    return z12;
                } catch (Throwable unused3) {
                    z11 = z10;
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                            if (readableDatabase != null) {
                                readableDatabase.close();
                            }
                        } catch (Throwable unused4) {
                            return z11;
                        }
                    } else if (readableDatabase != null) {
                        readableDatabase.close();
                    }
                    return z11;
                }
            } catch (Throwable unused5) {
                readableDatabase = null;
            }
        } catch (Throwable unused6) {
            readableDatabase = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0144 A[Catch: all -> 0x0187, TRY_LEAVE, TryCatch #4 {all -> 0x0187, blocks: (B:59:0x013c, B:61:0x0144), top: B:94:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0163 A[DONT_GENERATE, DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0165 A[Catch: all -> 0x0161, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x0161, blocks: (B:63:0x015d, B:67:0x0165), top: B:86:0x015d }] */
    /* JADX WARN: Code duplicated, block: B:86:0x015d A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x0144, please report this as an issue */
    public ArrayList<MsgDO> b() {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        ArrayList<MsgDO> arrayList;
        boolean zIsPrintLog;
        String str;
        try {
            readableDatabase = this.f132853b.getReadableDatabase();
            if (readableDatabase == null) {
                if (readableDatabase != null) {
                    try {
                        readableDatabase.close();
                    } catch (Throwable th2) {
                        if (ALog.isPrintLog(ALog.Level.E)) {
                            ALog.e("MessageService", "getUnReportMsg close cursor or db, e: " + th2, new Object[0]);
                        }
                    }
                }
                return null;
            }
            try {
                arrayList = new ArrayList<>();
                try {
                    Cursor cursorRawQuery = readableDatabase.rawQuery("select * from accs_message where state = ? or state = ? or state = ?", new String[]{"0", "2", "3"});
                    if (cursorRawQuery != null) {
                        try {
                            int columnIndex = cursorRawQuery.getColumnIndex("id");
                            int columnIndex2 = cursorRawQuery.getColumnIndex("state");
                            int columnIndex3 = cursorRawQuery.getColumnIndex("message");
                            int columnIndex4 = cursorRawQuery.getColumnIndex("create_time");
                            while (cursorRawQuery.moveToNext() && !TextUtils.isEmpty(cursorRawQuery.getString(columnIndex3))) {
                                String string = cursorRawQuery.getString(columnIndex2);
                                String string2 = cursorRawQuery.getString(columnIndex3);
                                if (ALog.isPrintLog(ALog.Level.I)) {
                                    ALog.i("MessageService", "state: " + string + " ,cursor.message:" + string2 + " ,cursor.id:" + cursorRawQuery.getString(columnIndex) + " ,cursor.time:" + cursorRawQuery.getString(columnIndex4), new Object[0]);
                                }
                                if (TextUtils.equals("0", string)) {
                                    str = "4";
                                } else if (TextUtils.equals("2", string)) {
                                    str = "8";
                                } else {
                                    str = TextUtils.equals("3", string) ? "9" : null;
                                }
                                new MsgDO();
                                if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(str)) {
                                    MsgDO msgDOB = b(string2, str);
                                    msgDOB.messageSource = "cache";
                                    arrayList.add(msgDOB);
                                }
                                columnIndex2 = columnIndex2;
                                columnIndex = columnIndex;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = cursorRawQuery;
                            try {
                                if (ALog.isPrintLog(ALog.Level.E)) {
                                    ALog.e("MessageService", "getUnReportMsg, e: " + th, new Object[0]);
                                }
                                if (cursor != null) {
                                    try {
                                    } catch (Throwable th4) {
                                        if (zIsPrintLog) {
                                            ALog.e("MessageService", "getUnReportMsg close cursor or db, e: " + th4, new Object[0]);
                                        }
                                    }
                                }
                            } finally {
                                if (cursor != null) {
                                    try {
                                        cursor.close();
                                    } catch (Throwable th5) {
                                        if (ALog.isPrintLog(ALog.Level.E)) {
                                            ALog.e("MessageService", "getUnReportMsg close cursor or db, e: " + th5, new Object[0]);
                                        }
                                    }
                                }
                                if (readableDatabase != null) {
                                    readableDatabase.close();
                                }
                            }
                        }
                    }
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Throwable th6) {
                            if (ALog.isPrintLog(ALog.Level.E)) {
                                ALog.e("MessageService", "getUnReportMsg close cursor or db, e: " + th6, new Object[0]);
                            }
                        }
                    }
                    readableDatabase.close();
                } catch (Throwable th7) {
                    th = th7;
                    cursor = null;
                }
            } catch (Throwable th8) {
                th = th8;
                cursor = null;
                arrayList = null;
                if (ALog.isPrintLog(ALog.Level.E)) {
                    ALog.e("MessageService", "getUnReportMsg, e: " + th, new Object[0]);
                }
                return arrayList;
            }
            return arrayList;
        } catch (Throwable th9) {
            th = th9;
            cursor = null;
            readableDatabase = null;
        }
    }
}
