package k;

import android.text.TextUtils;
import androidx.annotation.n0;

/* JADX INFO: compiled from: DnsDescription.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f124367b;

    public e(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("channel".concat(" can not be empty"));
        }
        if (a(i10)) {
            throw new IllegalArgumentException("family".concat(" is invalid"));
        }
        this.f124366a = str;
        this.f124367b = i10;
    }

    public static boolean a(int i10) {
        return (1 == i10 || 2 == i10 || 3 == i10) ? false : true;
    }

    @n0
    public String toString() {
        return this.f124366a + "Dns(" + this.f124367b + ")";
    }
}
