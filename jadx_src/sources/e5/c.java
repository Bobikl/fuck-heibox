package e5;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f118550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f118551b;

    public void a(boolean z10) {
        this.f118551b = Boolean.valueOf(z10);
    }

    public boolean b() {
        return this.f118551b != null;
    }

    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(this.f118550a, str);
    }

    public void d(String str) {
        this.f118550a = str;
    }

    public boolean e() {
        Boolean bool = this.f118551b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
