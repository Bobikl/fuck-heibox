package com.jd.jdcache;

import dl.d;
import kotlin.b0;
import kotlin.z;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.f3;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: JDCacheConstant.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class JDCacheConstant {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final JDCacheConstant f64122a = new JDCacheConstant();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static final z f64123b = b0.c(new yh.a<q0>() { // from class: com.jd.jdcache.JDCacheConstant$applicationScope$2
        @Override // yh.a
        @d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q0 invoke() {
            return r0.a(f3.c(null, 1, null));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private static final z f64124c = b0.c(new yh.a<CoroutineDispatcher>() { // from class: com.jd.jdcache.JDCacheConstant$ioDispatcher$2
        @Override // yh.a
        @d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher invoke() {
            return e1.c();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private static final z f64125d = b0.c(new yh.a<n2>() { // from class: com.jd.jdcache.JDCacheConstant$mainDispatcher$2
        @Override // yh.a
        @d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n2 invoke() {
            return e1.e().p0();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f64126e = 10240;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f64127f = 2048;

    private JDCacheConstant() {
    }

    @d
    public final q0 a() {
        return (q0) f64123b.getValue();
    }

    @d
    public final CoroutineDispatcher b() {
        return (CoroutineDispatcher) f64124c.getValue();
    }

    @d
    public final n2 c() {
        return (n2) f64125d.getValue();
    }
}
