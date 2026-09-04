package com.google.android.play.core.splitcompat;

import androidx.annotation.n0;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f56198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f56199b;

    c(File file, String str) {
        if (file == null) {
            throw new NullPointerException("Null splitFile");
        }
        this.f56198a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.f56199b = str;
    }

    @Override // com.google.android.play.core.splitcompat.u
    @n0
    final File a() {
        return this.f56198a;
    }

    @Override // com.google.android.play.core.splitcompat.u
    @n0
    final String b() {
        return this.f56199b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f56198a.equals(uVar.a()) && this.f56199b.equals(uVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f56198a.hashCode() ^ 1000003) * 1000003) ^ this.f56199b.hashCode();
    }

    public final String toString() {
        return "SplitFileInfo{splitFile=" + this.f56198a.toString() + ", splitId=" + this.f56199b + z5.g.f141884d;
    }
}
