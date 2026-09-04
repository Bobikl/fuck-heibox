package androidx.work;

import androidx.annotation.RestrictTo;
import androidx.annotation.f0;
import androidx.annotation.n0;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class WorkInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private UUID f28697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private State f28698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private e f28699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private Set<String> f28700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    private e f28701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f28703g;

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkInfo(@n0 UUID uuid, @n0 State state, @n0 e eVar, @n0 List<String> list, @n0 e eVar2, int i10, int i11) {
        this.f28697a = uuid;
        this.f28698b = state;
        this.f28699c = eVar;
        this.f28700d = new HashSet(list);
        this.f28701e = eVar2;
        this.f28702f = i10;
        this.f28703g = i11;
    }

    public int a() {
        return this.f28703g;
    }

    @n0
    public UUID b() {
        return this.f28697a;
    }

    @n0
    public e c() {
        return this.f28699c;
    }

    @n0
    public e d() {
        return this.f28701e;
    }

    @f0(from = 0)
    public int e() {
        return this.f28702f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkInfo.class != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f28702f == workInfo.f28702f && this.f28703g == workInfo.f28703g && this.f28697a.equals(workInfo.f28697a) && this.f28698b == workInfo.f28698b && this.f28699c.equals(workInfo.f28699c) && this.f28700d.equals(workInfo.f28700d)) {
            return this.f28701e.equals(workInfo.f28701e);
        }
        return false;
    }

    @n0
    public State f() {
        return this.f28698b;
    }

    @n0
    public Set<String> g() {
        return this.f28700d;
    }

    public int hashCode() {
        return (((((((((((this.f28697a.hashCode() * 31) + this.f28698b.hashCode()) * 31) + this.f28699c.hashCode()) * 31) + this.f28700d.hashCode()) * 31) + this.f28701e.hashCode()) * 31) + this.f28702f) * 31) + this.f28703g;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f28697a + "', mState=" + this.f28698b + ", mOutputData=" + this.f28699c + ", mTags=" + this.f28700d + ", mProgress=" + this.f28701e + '}';
    }
}
