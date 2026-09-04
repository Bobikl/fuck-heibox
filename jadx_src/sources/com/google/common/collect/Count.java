package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public final class Count implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f57164b;

    Count(int i10) {
        this.f57164b = i10;
    }

    public void a(int i10) {
        this.f57164b += i10;
    }

    public int b(int i10) {
        int i11 = this.f57164b + i10;
        this.f57164b = i11;
        return i11;
    }

    public int c() {
        return this.f57164b;
    }

    public int d(int i10) {
        int i11 = this.f57164b;
        this.f57164b = i10;
        return i11;
    }

    public void e(int i10) {
        this.f57164b = i10;
    }

    public boolean equals(@CheckForNull Object obj) {
        return (obj instanceof Count) && ((Count) obj).f57164b == this.f57164b;
    }

    public int hashCode() {
        return this.f57164b;
    }

    public String toString() {
        return Integer.toString(this.f57164b);
    }
}
