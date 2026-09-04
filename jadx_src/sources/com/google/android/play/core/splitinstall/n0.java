package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f56363a;

    public n0(@androidx.annotation.n0 Context context) {
        this.f56363a = context;
    }

    private final SharedPreferences e() {
        return this.f56363a.getSharedPreferences("playcore_split_install_internal", 0);
    }

    public final Set a() {
        Set<String> hashSet;
        synchronized (n0.class) {
            try {
                hashSet = e().getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }

    public final void b() {
        synchronized (n0.class) {
            e().edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    final void c(Collection collection) {
        synchronized (n0.class) {
            HashSet hashSet = new HashSet(a());
            Iterator it = collection.iterator();
            boolean zAdd = false;
            while (it.hasNext()) {
                zAdd |= hashSet.add((String) it.next());
            }
            if (zAdd) {
                try {
                    e().edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
    }

    final void d(Collection collection) {
        synchronized (n0.class) {
            Set<String> setA = a();
            HashSet hashSet = new HashSet();
            boolean z10 = false;
            for (String str : setA) {
                if (collection.contains(str)) {
                    z10 = true;
                } else {
                    hashSet.add(str);
                }
            }
            if (z10) {
                try {
                    e().edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
    }
}
