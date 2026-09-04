package com.tencent.liteav.txcvodplayer.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.a$a, reason: collision with other inner class name */
    public static final class C0960a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f100038a = new a(0);
    }

    public interface b {
        void a();

        void a(String str, Map<String, String> map);
    }

    private a() {
    }

    /* synthetic */ a(byte b10) {
        this();
    }

    static /* synthetic */ Map a(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                map2.put(entry.getKey(), ((List) entry.getValue()).get(0));
            }
        }
        return map2;
    }
}
