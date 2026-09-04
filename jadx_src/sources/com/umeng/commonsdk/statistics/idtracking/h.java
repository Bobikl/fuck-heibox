package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.config.FieldManager;

/* JADX INFO: compiled from: OaidTracking.java */
/* JADX INFO: loaded from: classes4.dex */
public class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f105367a = "umeng_sp_oaid";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f105368b = "key_umeng_sp_oaid";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f105369c = "key_umeng_sp_oaid_required_time";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f105370d = "oaid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f105371e;

    public h(Context context) {
        super(f105370d);
        this.f105371e = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        if (!FieldManager.allow(com.umeng.commonsdk.utils.b.G)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = this.f105371e.getSharedPreferences(f105367a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString(f105368b, "");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
