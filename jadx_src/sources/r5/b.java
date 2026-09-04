package r5;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f138798b;

    public b(String str, String str2) {
        this.f138797a = str;
        this.f138798b = str2;
    }

    public String a() {
        return this.f138798b;
    }

    public String b() {
        return this.f138797a;
    }

    public JSONObject c() {
        if (TextUtils.isEmpty(this.f138798b)) {
            return null;
        }
        try {
            return new JSONObject(this.f138798b);
        } catch (Exception e10) {
            z5.e.d(e10);
            return null;
        }
    }

    public String toString() {
        return String.format("<Letter envelop=%s body=%s>", this.f138797a, this.f138798b);
    }
}
