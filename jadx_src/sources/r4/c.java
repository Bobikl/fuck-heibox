package r4;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class c implements p4.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f138789d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w5.b f138790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f138791b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f138792c = false;

    @Override // p4.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f138791b) {
            w5.b bVar = new w5.b();
            this.f138790a = bVar;
            this.f138792c = bVar.a(context, null) == 1;
            this.f138791b = true;
        }
        t4.a.d("getOAID", "isSupported", Boolean.valueOf(this.f138792c));
        if (this.f138792c && this.f138790a.l()) {
            return this.f138790a.h();
        }
        return null;
    }
}
