package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f {
    public static f b(int i10, @l9.b int i11, @l9.a int i12, long j10, long j11, List<String> list, List<String> list2) {
        if (i11 != 8) {
            return new h(i10, i11, i12, j10, j11, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public static f n(Bundle bundle) {
        return new h(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract long a();

    @l9.a
    public abstract int c();

    public boolean d() {
        int i10 = i();
        return i10 == 0 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    @androidx.annotation.n0
    public List<String> e() {
        return k() != null ? new ArrayList(k()) : new ArrayList();
    }

    @androidx.annotation.n0
    public List<String> f() {
        return l() != null ? new ArrayList(l()) : new ArrayList();
    }

    @androidx.annotation.p0
    @Deprecated
    public abstract PendingIntent g();

    public abstract int h();

    @l9.b
    public abstract int i();

    public abstract long j();

    @androidx.annotation.p0
    abstract List k();

    @androidx.annotation.p0
    abstract List l();

    @androidx.annotation.p0
    abstract List m();
}
