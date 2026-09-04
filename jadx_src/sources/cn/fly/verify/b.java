package cn.fly.verify;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected gd f35811g = new gd();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected HashMap<String, Object> f35812h = new HashMap<>();

    public b b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f35812h = this.f35811g.a(str);
            } catch (Throwable th2) {
                f.a().a(th2, "[FlyVerify] ==>%s", "Entity analyse exception.");
            }
        }
        return this;
    }
}
