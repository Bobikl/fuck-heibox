package com.tencent.beacon.a.d;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: BeaconProperties.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f98827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f98828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f98829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SharedPreferencesEditorC0949a f98830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SharedPreferences f98831e;

    /* JADX INFO: renamed from: com.tencent.beacon.a.d.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BeaconProperties.java */
    public static class SharedPreferencesEditorC0949a implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f98832a;

        SharedPreferencesEditorC0949a(g gVar) {
            this.f98832a = gVar;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f98832a.a();
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            return true;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(@n0 String str, boolean z10) {
            this.f98832a.b(str, Boolean.valueOf(z10));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(@n0 String str, float f10) {
            this.f98832a.b(str, Float.valueOf(f10));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(@n0 String str, int i10) {
            this.f98832a.b(str, Integer.valueOf(i10));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(@n0 String str, long j10) {
            this.f98832a.b(str, Long.valueOf(j10));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(@n0 String str, @n0 String str2) {
            this.f98832a.b(str, str2);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(@n0 String str, @n0 Set<String> set) {
            this.f98832a.b(str, (Set) set);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.f98832a.b(str);
            return this;
        }
    }

    private a() {
    }

    public static a a() {
        if (f98827a == null) {
            synchronized (a.class) {
                if (f98827a == null) {
                    f98827a = new a();
                }
            }
        }
        return f98827a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> Object a(@n0 String str, T t10) {
        if (!this.f98828b) {
            return t10;
        }
        Object objA = this.f98829c.a(str, t10);
        if (objA == null || objA == t10) {
            Context contextC = com.tencent.beacon.a.c.c.d().c();
            if (this.f98831e == null) {
                this.f98831e = contextC.getSharedPreferences("DENGTA_META", 0);
            }
            if (t10 instanceof Boolean) {
                objA = Boolean.valueOf(this.f98831e.getBoolean(str, ((Boolean) t10).booleanValue()));
            } else if (t10 instanceof String) {
                objA = this.f98831e.getString(str, (String) t10);
            } else if (t10 instanceof Integer) {
                objA = Integer.valueOf(this.f98831e.getInt(str, ((Integer) t10).intValue()));
            } else if (t10 instanceof Long) {
                objA = Long.valueOf(this.f98831e.getLong(str, ((Long) t10).longValue()));
            } else if (t10 instanceof Float) {
                objA = Float.valueOf(this.f98831e.getFloat(str, ((Float) t10).floatValue()));
            }
            if (objA != null && objA != t10) {
                this.f98829c.b(str, objA);
            }
        }
        return objA == null ? t10 : objA;
    }

    public synchronized void a(Context context) {
        if (this.f98828b || context == null) {
            return;
        }
        try {
            String strReplace = com.tencent.beacon.a.c.b.c(context).replace(context.getPackageName(), "");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("prop_");
            sb2.append(strReplace);
            g gVarA = g.a(context, sb2.toString());
            this.f98829c = gVarA;
            this.f98830d = new SharedPreferencesEditorC0949a(gVarA);
            this.f98828b = true;
        } catch (IOException e10) {
            com.tencent.beacon.base.util.c.a(e10);
            com.tencent.beacon.a.b.g.e().a("504", "[properties] PropertiesFile create error!", e10);
            this.f98828b = false;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return this.f98829c.a(str);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferencesEditorC0949a edit() {
        if (!this.f98828b) {
            com.tencent.beacon.base.util.e.a("BeaconProperties has not init!");
            a(com.tencent.beacon.a.c.c.d().c());
        }
        return this.f98830d;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        return this.f98829c.b();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(@n0 String str, boolean z10) {
        Object objA = a(str, Boolean.valueOf(z10));
        return objA instanceof Boolean ? ((Boolean) objA).booleanValue() : z10;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(@n0 String str, float f10) {
        Object objA = a(str, Float.valueOf(f10));
        return objA instanceof Number ? ((Number) objA).floatValue() : f10;
    }

    @Override // android.content.SharedPreferences
    public int getInt(@n0 String str, int i10) {
        Object objA = a(str, Integer.valueOf(i10));
        return objA instanceof Number ? ((Number) objA).intValue() : i10;
    }

    @Override // android.content.SharedPreferences
    public long getLong(@n0 String str, long j10) {
        Object objA = a(str, Long.valueOf(j10));
        return objA instanceof Number ? ((Number) objA).longValue() : j10;
    }

    @Override // android.content.SharedPreferences
    public String getString(@n0 String str, @n0 String str2) {
        Object objA = a(str, str2);
        return objA instanceof String ? (String) objA : str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(@n0 String str, @p0 Set<String> set) {
        return !this.f98828b ? set : this.f98829c.a(str, (Set) set);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
