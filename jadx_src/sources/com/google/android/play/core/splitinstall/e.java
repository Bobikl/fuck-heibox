package com.google.android.play.core.splitinstall;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f56231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f56232b;

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f56233a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f56234b = new ArrayList();

        private a() {
        }

        /* synthetic */ a(q qVar) {
        }

        @androidx.annotation.n0
        public a a(@androidx.annotation.p0 Locale locale) {
            this.f56234b.add(locale);
            return this;
        }

        public a b(String str) {
            this.f56233a.add(str);
            return this;
        }

        @androidx.annotation.n0
        public e c() {
            return new e(this, null);
        }
    }

    /* synthetic */ e(a aVar, r rVar) {
        this.f56231a = new ArrayList(aVar.f56233a);
        this.f56232b = new ArrayList(aVar.f56234b);
    }

    @androidx.annotation.n0
    public static a c() {
        return new a(null);
    }

    public List<Locale> a() {
        return this.f56232b;
    }

    public List<String> b() {
        return this.f56231a;
    }

    public String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.f56231a, this.f56232b);
    }
}
