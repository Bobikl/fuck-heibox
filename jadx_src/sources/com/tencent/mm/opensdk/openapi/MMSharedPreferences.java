package com.tencent.mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.a;
import com.umeng.analytics.pro.ao;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class MMSharedPreferences implements SharedPreferences {
    private static final String TAG = "MicroMsg.SDK.SharedPreferences";
    private final ContentResolver cr;
    private final String[] columns = {ao.f104522d, "key", "type", "value"};
    private final HashMap<String, Object> values = new HashMap<>();
    private REditor editor = null;

    public static class REditor implements SharedPreferences.Editor {
        private ContentResolver cr;
        private Map<String, Object> values = new HashMap();
        private Set<String> remove = new HashSet();
        private boolean clear = false;

        public REditor(ContentResolver contentResolver) {
            this.cr = contentResolver;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.clear = true;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x009c  */
        /* JADX WARN: Code duplicated, block: B:37:0x009e  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:0x003f A[SYNTHETIC] */
        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            String str;
            int i10;
            boolean z10;
            ContentValues contentValues = new ContentValues();
            if (this.clear) {
                this.cr.delete(a.f100925a, null, null);
                this.clear = false;
            }
            Iterator<String> it = this.remove.iterator();
            while (it.hasNext()) {
                this.cr.delete(a.f100925a, "key = ?", new String[]{it.next()});
            }
            for (Map.Entry<String, Object> entry : this.values.entrySet()) {
                Object value = entry.getValue();
                if (value == null) {
                    str = "unresolve failed, null value";
                } else {
                    if (value instanceof Integer) {
                        i10 = 1;
                    } else if (value instanceof Long) {
                        i10 = 2;
                    } else if (value instanceof String) {
                        i10 = 3;
                    } else if (value instanceof Boolean) {
                        i10 = 4;
                    } else if (value instanceof Float) {
                        i10 = 5;
                    } else if (value instanceof Double) {
                        i10 = 6;
                    } else {
                        str = "unresolve failed, unknown type=" + value.getClass().toString();
                    }
                    if (i10 == 0) {
                        z10 = false;
                    } else {
                        contentValues.put("type", Integer.valueOf(i10));
                        contentValues.put("value", value.toString());
                        z10 = true;
                    }
                    if (z10) {
                        this.cr.update(a.f100925a, contentValues, "key = ?", new String[]{entry.getKey()});
                    }
                }
                Log.e("MicroMsg.SDK.PluginProvider.Resolver", str);
                i10 = 0;
                if (i10 == 0) {
                    z10 = false;
                } else {
                    contentValues.put("type", Integer.valueOf(i10));
                    contentValues.put("value", value.toString());
                    z10 = true;
                }
                if (z10) {
                    this.cr.update(a.f100925a, contentValues, "key = ?", new String[]{entry.getKey()});
                }
            }
            return true;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            this.values.put(str, Boolean.valueOf(z10));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f10) {
            this.values.put(str, Float.valueOf(f10));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i10) {
            this.values.put(str, Integer.valueOf(i10));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j10) {
            this.values.put(str, Long.valueOf(j10));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            this.values.put(str, str2);
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            return null;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.remove.add(str);
            return this;
        }
    }

    public MMSharedPreferences(Context context) {
        this.cr = context.getContentResolver();
    }

    private Object getValue(String str) {
        try {
            Cursor cursorQuery = this.cr.query(a.f100925a, this.columns, "key = ?", new String[]{str}, null);
            if (cursorQuery == null) {
                return null;
            }
            Object objA = cursorQuery.moveToFirst() ? com.tencent.mm.opensdk.channel.a.a.a(cursorQuery.getInt(cursorQuery.getColumnIndex("type")), cursorQuery.getString(cursorQuery.getColumnIndex("value"))) : null;
            cursorQuery.close();
            return objA;
        } catch (Exception e10) {
            Log.e(TAG, "getValue exception:" + e10.getMessage());
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return getValue(str) != null;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        if (this.editor == null) {
            this.editor = new REditor(this.cr);
        }
        return this.editor;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        try {
            Cursor cursorQuery = this.cr.query(a.f100925a, this.columns, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("key");
            int columnIndex2 = cursorQuery.getColumnIndex("type");
            int columnIndex3 = cursorQuery.getColumnIndex("value");
            while (cursorQuery.moveToNext()) {
                this.values.put(cursorQuery.getString(columnIndex), com.tencent.mm.opensdk.channel.a.a.a(cursorQuery.getInt(columnIndex2), cursorQuery.getString(columnIndex3)));
            }
            cursorQuery.close();
            return this.values;
        } catch (Exception e10) {
            Log.e(TAG, "getAll exception:" + e10.getMessage());
            return this.values;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z10) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Boolean)) ? z10 : ((Boolean) value).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f10) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Float)) ? f10 : ((Float) value).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i10) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Integer)) ? i10 : ((Integer) value).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j10) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Long)) ? j10 : ((Long) value).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object value = getValue(str);
        return (value == null || !(value instanceof String)) ? str2 : (String) value;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        return null;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
