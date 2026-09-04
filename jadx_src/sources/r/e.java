package r;

import android.text.TextUtils;
import k.g;

/* JADX INFO: compiled from: LookupExtra.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements g.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f138703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f138704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f138705d;

    public e(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("bizId".concat(" can not be empty"));
        }
        this.f138703b = str;
        this.f138704c = str2;
        this.f138705d = str3;
    }

    public String toString() {
        return "LookupExtra{bizId='" + this.f138703b + "', bizKey='" + this.f138704c + "', token='" + this.f138705d + "'}";
    }
}
