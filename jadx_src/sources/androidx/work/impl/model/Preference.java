package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.n0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.work.impl.model.d, reason: from toString */
/* JADX INFO: compiled from: Preference.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.room.q
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0019"}, d2 = {"Landroidx/work/impl/model/d;", "", "", ak.av, "", "b", "()Ljava/lang/Long;", "key", "value", ak.aF, "(Ljava/lang/String;Ljava/lang/Long;)Landroidx/work/impl/model/d;", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Ljava/lang/Long;", "f", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "(Ljava/lang/String;Z)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final /* data */ class Preference {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    @n0
    @androidx.room.f(name = "key")
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    @androidx.room.f(name = "long_value")
    private final Long value;

    public Preference(@dl.d String key, @dl.e Long l10) {
        f0.p(key, "key");
        this.key = key;
        this.value = l10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Preference(@dl.d String key, boolean z10) {
        this(key, Long.valueOf(z10 ? 1L : 0L));
        f0.p(key, "key");
    }

    public static /* synthetic */ Preference d(Preference preference, String str, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = preference.key;
        }
        if ((i10 & 2) != 0) {
            l10 = preference.value;
        }
        return preference.c(str, l10);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getValue() {
        return this.value;
    }

    @dl.d
    public final Preference c(@dl.d String key, @dl.e Long value) {
        f0.p(key, "key");
        return new Preference(key, value);
    }

    @dl.d
    public final String e() {
        return this.key;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) other;
        return f0.g(this.key, preference.key) && f0.g(this.value, preference.value);
    }

    @dl.e
    public final Long f() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        Long l10 = this.value;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    @dl.d
    public String toString() {
        return "Preference(key=" + this.key + ", value=" + this.value + ')';
    }
}
