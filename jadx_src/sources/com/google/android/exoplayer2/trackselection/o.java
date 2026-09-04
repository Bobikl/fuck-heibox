package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.source.n1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: TrackSelection.java */
/* JADX INFO: loaded from: classes7.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f50123a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f50124b = 10000;

    /* JADX INFO: compiled from: TrackSelection.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    int e(int i10);

    int g(int i10);

    int getType();

    n1 h();

    int length();

    a2 p(int i10);

    int t(a2 a2Var);
}
