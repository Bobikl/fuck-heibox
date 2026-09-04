package com.xiaomi.push;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class gc implements ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ga f107165a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static gc f107166a = new gc();
    }

    private gc() {
    }

    public static gc a() {
        return a.f107166a;
    }

    @Override // com.xiaomi.push.ga
    public void a(fz fzVar) {
        ga gaVar = this.f107165a;
        if (gaVar != null) {
            gaVar.a(fzVar);
        }
    }

    public void a(String str, Object obj) {
        if (this.f107165a != null) {
            HashMap map = new HashMap();
            map.put("key", str);
            map.put("package", obj != null ? String.valueOf(obj) : "");
            this.f107165a.a("rd_event", map);
        }
    }

    @Override // com.xiaomi.push.ga
    public void a(String str, Map<String, Object> map) {
        ga gaVar = this.f107165a;
        if (gaVar != null) {
            gaVar.a(str, map);
        }
    }
}
