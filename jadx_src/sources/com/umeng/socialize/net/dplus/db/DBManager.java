package com.umeng.socialize.net.dplus.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.umeng.socialize.utils.ContextUtil;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class DBManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static DBManager f106342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static StandardDBHelper f106343b;

    private DBManager() {
        f106343b = new StandardDBHelper(ContextUtil.getContext());
    }

    public static synchronized DBManager get(Context context) {
        if (f106342a == null) {
            f106342a = new DBManager();
        }
        return f106342a;
    }

    public synchronized void closeDatabase() {
        f106343b.close();
    }

    public synchronized void delete(ArrayList<Integer> arrayList, String str) {
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f106343b.getWritableDatabase();
            writableDatabase.beginTransaction();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                writableDatabase.execSQL("delete from " + str + " where Id='" + arrayList.get(i10) + "' ");
            }
            writableDatabase.setTransactionSuccessful();
        } catch (Throwable unused) {
            if (writableDatabase != null) {
            }
        }
        try {
            writableDatabase.endTransaction();
        } catch (Throwable unused2) {
        }
    }

    public synchronized void deleteTable(String str) {
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = f106343b.getWritableDatabase();
            writableDatabase.beginTransaction();
            writableDatabase.execSQL("DELETE FROM " + str + ";");
            writableDatabase.setTransactionSuccessful();
        } catch (Throwable unused) {
            if (writableDatabase != null) {
            }
        }
        try {
            writableDatabase.endTransaction();
        } catch (Throwable unused2) {
        }
    }

    public synchronized void insertAuth(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = f106343b.getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(DBConfig.VALUE, jSONObject.toString());
                    writableDatabase.insert("auth", null, contentValues);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable unused) {
                    sQLiteDatabase = writableDatabase;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.endTransaction();
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
        }
    }

    public synchronized void insertDau(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = f106343b.getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(DBConfig.VALUE, jSONObject.toString());
                    writableDatabase.insert("dau", null, contentValues);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable unused) {
                    sQLiteDatabase = writableDatabase;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.endTransaction();
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
        }
    }

    public synchronized void insertS_E(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = f106343b.getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(DBConfig.VALUE, jSONObject.toString());
                    writableDatabase.insert("s_e", null, contentValues);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable unused) {
                    sQLiteDatabase = writableDatabase;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.endTransaction();
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
        }
    }

    public synchronized void insertStats(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = f106343b.getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(DBConfig.VALUE, jSONObject.toString());
                    writableDatabase.insert("stats", null, contentValues);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable unused) {
                    sQLiteDatabase = writableDatabase;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.endTransaction();
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
        }
    }

    public synchronized void insertUserInfo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = f106343b.getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(DBConfig.VALUE, jSONObject.toString());
                    writableDatabase.insert("userinfo", null, contentValues);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable unused) {
                    sQLiteDatabase = writableDatabase;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.endTransaction();
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
        }
    }

    public synchronized JSONArray select(String str, ArrayList<Integer> arrayList, double d10, boolean z10) throws JSONException {
        JSONArray jSONArray;
        SQLiteDatabase writableDatabase;
        try {
            jSONArray = new JSONArray();
            Cursor cursorQuery = null;
            try {
                try {
                    writableDatabase = f106343b.getWritableDatabase();
                    try {
                        writableDatabase.beginTransaction();
                        cursorQuery = writableDatabase.query(str, null, null, null, null, null, null);
                        while (cursorQuery.moveToNext()) {
                            int i10 = cursorQuery.getInt(0);
                            String string = cursorQuery.getString(1);
                            if (z10 && jSONArray.toString().getBytes().length + string.getBytes().length > d10) {
                                break;
                            }
                            jSONArray.put(new JSONObject(string));
                            if (!arrayList.contains(Integer.valueOf(i10))) {
                                arrayList.add(Integer.valueOf(i10));
                            }
                        }
                        writableDatabase.setTransactionSuccessful();
                        cursorQuery.close();
                    } catch (JSONException e10) {
                        e = e10;
                        try {
                            throw e;
                        } catch (Throwable th2) {
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Throwable unused) {
                                    throw th2;
                                }
                            }
                            if (writableDatabase == null) {
                                throw th2;
                            }
                            writableDatabase.endTransaction();
                            throw th2;
                        }
                    } catch (Throwable unused2) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (writableDatabase != null) {
                        }
                        return jSONArray;
                    }
                } catch (Throwable unused3) {
                }
            } catch (JSONException e11) {
                e = e11;
                writableDatabase = null;
            } catch (Throwable unused4) {
                writableDatabase = null;
            }
            writableDatabase.endTransaction();
        } catch (Throwable th3) {
            throw th3;
        }
        return jSONArray;
    }
}
