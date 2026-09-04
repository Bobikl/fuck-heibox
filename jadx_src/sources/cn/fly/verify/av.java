package cn.fly.verify;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ft f35782a;

    public av(int i10, String str, String str2) {
        this.f35782a = new ft(i10, str, str2);
    }

    public static HashMap<String, String> a() throws Throwable {
        return ft.a();
    }

    public <T> T a(HashMap<String, String> map, HashMap<String, Object> map2, String str, boolean z10) throws Throwable {
        return (T) a(true, map, map2, str, z10);
    }

    public <T> T a(boolean z10, HashMap<String, String> map, HashMap<String, Object> map2, String str, boolean z11) throws Throwable {
        return (T) this.f35782a.a(z10, map, map2, str, z11);
    }
}
