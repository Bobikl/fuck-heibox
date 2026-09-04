package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.config.FieldManager;

/* JADX INFO: compiled from: UTDIdTracker.java */
/* JADX INFO: loaded from: classes4.dex */
public class j extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f105373a = "utdid";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f105374b;

    public j(Context context) {
        super("utdid");
        this.f105374b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.b.f105538u)) {
                return (String) Class.forName("com.ut.device.UTDevice").getMethod("getUtdid", Context.class).invoke(null, this.f105374b);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
