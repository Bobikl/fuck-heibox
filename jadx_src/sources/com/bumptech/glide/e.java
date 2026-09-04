package com.bumptech.glide;

import androidx.annotation.p0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: GlideExperiments.java */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, b> f40657a;

    /* JADX INFO: compiled from: GlideExperiments.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, b> f40658a = new HashMap();

        a() {
        }

        a b(b bVar) {
            this.f40658a.put(bVar.getClass(), bVar);
            return this;
        }

        e c() {
            return new e(this);
        }

        a d(b bVar, boolean z10) {
            if (z10) {
                b(bVar);
            } else {
                this.f40658a.remove(bVar.getClass());
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: GlideExperiments.java */
    public interface b {
    }

    e(a aVar) {
        this.f40657a = Collections.unmodifiableMap(new HashMap(aVar.f40658a));
    }

    @p0
    <T extends b> T a(Class<T> cls) {
        return (T) this.f40657a.get(cls);
    }

    public boolean b(Class<? extends b> cls) {
        return this.f40657a.containsKey(cls);
    }
}
