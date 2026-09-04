package com.uber.autodispose.lifecycle;

import com.uber.autodispose.OutsideScopeException;
import io.reactivex.z;

/* JADX INFO: loaded from: classes4.dex */
public final class TestLifecycleScopeProvider implements c<TestLifecycle> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.reactivex.subjects.a<TestLifecycle> f104106b;

    public enum TestLifecycle {
        STARTED,
        STOPPED
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f104107a;

        static {
            int[] iArr = new int[TestLifecycle.values().length];
            f104107a = iArr;
            try {
                iArr[TestLifecycle.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f104107a[TestLifecycle.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private TestLifecycleScopeProvider(@jh.f TestLifecycle testLifecycle) {
        if (testLifecycle == null) {
            this.f104106b = io.reactivex.subjects.a.n8();
        } else {
            this.f104106b = io.reactivex.subjects.a.o8(testLifecycle);
        }
    }

    public static TestLifecycleScopeProvider f() {
        return new TestLifecycleScopeProvider(null);
    }

    public static TestLifecycleScopeProvider g(TestLifecycle testLifecycle) {
        return new TestLifecycleScopeProvider(testLifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TestLifecycle h(TestLifecycle testLifecycle) throws OutsideScopeException {
        int i10 = a.f104107a[testLifecycle.ordinal()];
        if (i10 == 1) {
            return TestLifecycle.STOPPED;
        }
        if (i10 != 2) {
            throw new IllegalStateException("Unknown lifecycle event.");
        }
        throw new LifecycleEndedException();
    }

    @Override // com.uber.autodispose.lifecycle.c, com.uber.autodispose.y
    public io.reactivex.g a() {
        return g.e(this);
    }

    @Override // com.uber.autodispose.lifecycle.c
    public z<TestLifecycle> b() {
        return this.f104106b.b3();
    }

    @Override // com.uber.autodispose.lifecycle.c
    public com.uber.autodispose.lifecycle.a<TestLifecycle> d() {
        return new com.uber.autodispose.lifecycle.a() { // from class: com.uber.autodispose.lifecycle.h
            @Override // com.uber.autodispose.lifecycle.a, kh.o
            public final Object apply(Object obj) {
                return TestLifecycleScopeProvider.h((TestLifecycleScopeProvider.TestLifecycle) obj);
            }
        };
    }

    @Override // com.uber.autodispose.lifecycle.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public TestLifecycle c() {
        return this.f104106b.p8();
    }

    public void j() {
        this.f104106b.onNext(TestLifecycle.STARTED);
    }

    public void k() {
        if (this.f104106b.p8() != TestLifecycle.STARTED) {
            throw new IllegalStateException("Attempting to stop lifecycle before starting it.");
        }
        this.f104106b.onNext(TestLifecycle.STOPPED);
    }
}
