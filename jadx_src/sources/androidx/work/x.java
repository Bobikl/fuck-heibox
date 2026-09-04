package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: WorkQuery.java */
/* JADX INFO: loaded from: classes6.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<UUID> f29468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f29469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f29470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<WorkInfo.State> f29471d;

    /* JADX INFO: compiled from: WorkQuery.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<UUID> f29472a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<String> f29473b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List<String> f29474c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        List<WorkInfo.State> f29475d = new ArrayList();

        private a() {
        }

        @n0
        @SuppressLint({"BuilderSetStyle"})
        public static a f(@n0 List<UUID> list) {
            a aVar = new a();
            aVar.a(list);
            return aVar;
        }

        @n0
        @SuppressLint({"BuilderSetStyle"})
        public static a g(@n0 List<WorkInfo.State> list) {
            a aVar = new a();
            aVar.b(list);
            return aVar;
        }

        @n0
        @SuppressLint({"BuilderSetStyle"})
        public static a h(@n0 List<String> list) {
            a aVar = new a();
            aVar.c(list);
            return aVar;
        }

        @n0
        @SuppressLint({"BuilderSetStyle"})
        public static a i(@n0 List<String> list) {
            a aVar = new a();
            aVar.d(list);
            return aVar;
        }

        @n0
        public a a(@n0 List<UUID> list) {
            this.f29472a.addAll(list);
            return this;
        }

        @n0
        public a b(@n0 List<WorkInfo.State> list) {
            this.f29475d.addAll(list);
            return this;
        }

        @n0
        public a c(@n0 List<String> list) {
            this.f29474c.addAll(list);
            return this;
        }

        @n0
        public a d(@n0 List<String> list) {
            this.f29473b.addAll(list);
            return this;
        }

        @n0
        public x e() {
            if (this.f29472a.isEmpty() && this.f29473b.isEmpty() && this.f29474c.isEmpty() && this.f29475d.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new x(this);
        }
    }

    x(@n0 a aVar) {
        this.f29468a = aVar.f29472a;
        this.f29469b = aVar.f29473b;
        this.f29470c = aVar.f29474c;
        this.f29471d = aVar.f29475d;
    }

    @n0
    public static x a(@n0 List<UUID> list) {
        return a.f(list).e();
    }

    @n0
    public static x b(@n0 UUID... uuidArr) {
        return a(Arrays.asList(uuidArr));
    }

    @n0
    public static x c(@n0 List<WorkInfo.State> list) {
        return a.g(list).e();
    }

    @n0
    public static x d(@n0 WorkInfo.State... stateArr) {
        return a.g(Arrays.asList(stateArr)).e();
    }

    @n0
    public static x e(@n0 List<String> list) {
        return a.h(list).e();
    }

    @n0
    public static x f(@n0 String... strArr) {
        return e(Arrays.asList(strArr));
    }

    @n0
    public static x g(@n0 List<String> list) {
        return a.i(list).e();
    }

    @n0
    public static x h(@n0 String... strArr) {
        return a.i(Arrays.asList(strArr)).e();
    }

    @n0
    public List<UUID> i() {
        return this.f29468a;
    }

    @n0
    public List<WorkInfo.State> j() {
        return this.f29471d;
    }

    @n0
    public List<String> k() {
        return this.f29470c;
    }

    @n0
    public List<String> l() {
        return this.f29469b;
    }
}
