package com.google.common.escape;

import com.google.common.base.n;

/* JADX INFO: compiled from: Escaper.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b
@s9.f("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n<String, String> f58261a = new n() { // from class: com.google.common.escape.g
        @Override // com.google.common.base.n
        public final Object apply(Object obj) {
            return this.f58260b.b((String) obj);
        }
    };

    protected h() {
    }

    public final n<String, String> a() {
        return this.f58261a;
    }

    public abstract String b(String str);
}
