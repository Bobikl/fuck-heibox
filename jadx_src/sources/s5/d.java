package s5;

import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class d extends ContentObserver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f139322d = "VMS_IDLG_SDK_Observer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f139323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f139324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f139325c;

    public d(c cVar, int i10, String str) {
        super(null);
        this.f139325c = cVar;
        this.f139324b = i10;
        this.f139323a = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        c cVar = this.f139325c;
        if (cVar != null) {
            cVar.e(this.f139324b, this.f139323a);
        } else {
            Log.e(f139322d, "mIdentifierIdClient is null");
        }
    }
}
