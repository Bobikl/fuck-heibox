package androidx.navigation;

import android.os.Bundle;

/* JADX INFO: compiled from: ActionOnlyNavDirections.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Bundle f24958b = new Bundle();

    public a(int i10) {
        this.f24957a = i10;
    }

    public static /* synthetic */ a c(a aVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = aVar.f24957a;
        }
        return aVar.b(i10);
    }

    public final int a() {
        return this.f24957a;
    }

    @dl.d
    public final a b(int i10) {
        return new a(i10);
    }

    @Override // androidx.navigation.c0
    @dl.d
    public Bundle d() {
        return this.f24958b;
    }

    @Override // androidx.navigation.c0
    public int e() {
        return this.f24957a;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kotlin.jvm.internal.f0.g(a.class, obj.getClass()) && e() == ((a) obj).e();
    }

    public int hashCode() {
        return 31 + e();
    }

    @dl.d
    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + e() + ')';
    }
}
