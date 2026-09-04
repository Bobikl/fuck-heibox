package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private UUID f28709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private e f28710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private Set<String> f28711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private a f28712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    private Executor f28714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    private androidx.work.impl.utils.taskexecutor.c f28715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    private z f28716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    private u f28717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    private i f28718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f28719k;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        public List<String> f28720a = Collections.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        public List<Uri> f28721b = Collections.emptyList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @w0(28)
        @p0
        public Network f28722c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerParameters(@n0 UUID uuid, @n0 e eVar, @n0 Collection<String> collection, @n0 a aVar, @f0(from = 0) int i10, @f0(from = 0) int i11, @n0 Executor executor, @n0 androidx.work.impl.utils.taskexecutor.c cVar, @n0 z zVar, @n0 u uVar, @n0 i iVar) {
        this.f28709a = uuid;
        this.f28710b = eVar;
        this.f28711c = new HashSet(collection);
        this.f28712d = aVar;
        this.f28713e = i10;
        this.f28719k = i11;
        this.f28714f = executor;
        this.f28715g = cVar;
        this.f28716h = zVar;
        this.f28717i = uVar;
        this.f28718j = iVar;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Executor a() {
        return this.f28714f;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public i b() {
        return this.f28718j;
    }

    @f0(from = 0)
    public int c() {
        return this.f28719k;
    }

    @n0
    public UUID d() {
        return this.f28709a;
    }

    @n0
    public e e() {
        return this.f28710b;
    }

    @w0(28)
    @p0
    public Network f() {
        return this.f28712d.f28722c;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public u g() {
        return this.f28717i;
    }

    @f0(from = 0)
    public int h() {
        return this.f28713e;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public a i() {
        return this.f28712d;
    }

    @n0
    public Set<String> j() {
        return this.f28711c;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.impl.utils.taskexecutor.c k() {
        return this.f28715g;
    }

    @n0
    @w0(24)
    public List<String> l() {
        return this.f28712d.f28720a;
    }

    @n0
    @w0(24)
    public List<Uri> m() {
        return this.f28712d.f28721b;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public z n() {
        return this.f28716h;
    }
}
