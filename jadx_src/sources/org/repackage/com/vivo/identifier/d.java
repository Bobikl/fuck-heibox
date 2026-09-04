package org.repackage.com.vivo.identifier;

import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: compiled from: IdentifierIdObserver.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends ContentObserver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f138080d = "VMS_IDLG_SDK_Observer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f138081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f138082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f138083c;

    public d(c cVar, int i10, String str) {
        super(null);
        this.f138083c = cVar;
        this.f138082b = i10;
        this.f138081a = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        c cVar = this.f138083c;
        if (cVar != null) {
            cVar.d(this.f138082b, this.f138081a);
        } else {
            Log.e("VMS_IDLG_SDK_Observer", "mIdentifierIdClient is null");
        }
    }
}
