package m5;

import android.content.Context;
import android.content.SharedPreferences;
import k5.f;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f131443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f131444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences.Editor f131445c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f131446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f131447e;

    public a(Context context, String str, String str2, boolean z10, boolean z11) {
        this.f131444b = null;
        this.f131447e = z11;
        this.f131443a = str2;
        this.f131446d = context;
        if (context != null) {
            this.f131444b = context.getSharedPreferences(str2, 0);
        }
    }

    private void d() {
        SharedPreferences sharedPreferences;
        if (this.f131445c != null || (sharedPreferences = this.f131444b) == null) {
            return;
        }
        this.f131445c = sharedPreferences.edit();
    }

    public String a(String str) {
        SharedPreferences sharedPreferences = this.f131444b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!f.b(string)) {
                return string;
            }
        }
        return "";
    }

    public void b(String str, String str2) {
        if (f.b(str) || str.equals("t")) {
            return;
        }
        d();
        SharedPreferences.Editor editor = this.f131445c;
        if (editor != null) {
            editor.putString(str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    public boolean c() {
        boolean z10;
        Context context;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = this.f131445c;
        if (editor == null) {
            z10 = true;
        } else {
            if (!this.f131447e && this.f131444b != null) {
                editor.putLong("t", jCurrentTimeMillis);
            }
            if (this.f131445c.commit()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (this.f131444b != null && (context = this.f131446d) != null) {
            this.f131444b = context.getSharedPreferences(this.f131443a, 0);
        }
        return z10;
    }

    public void e(String str) {
        if (f.b(str) || str.equals("t")) {
            return;
        }
        d();
        SharedPreferences.Editor editor = this.f131445c;
        if (editor != null) {
            editor.remove(str);
        }
    }
}
