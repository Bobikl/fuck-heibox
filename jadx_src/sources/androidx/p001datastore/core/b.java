package androidx.p001datastore.core;

import androidx.exifinterface.media.a;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0004\u001a\u00020\u0003R\u0017\u0010\b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/datastore/core/b;", a.f23244d5, "Landroidx/datastore/core/j;", "Lkotlin/b2;", ak.av, "Ljava/lang/Object;", ak.aF, "()Ljava/lang/Object;", "value", "", "b", "I", "()I", "hashCode", "<init>", "(Ljava/lang/Object;I)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
public final class b<T> extends j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int hashCode;

    public b(T t10, int i10) {
        super(null);
        this.value = t10;
        this.hashCode = i10;
    }

    public final void a() {
        T t10 = this.value;
        if (!((t10 != null ? t10.hashCode() : 0) == this.hashCode)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getHashCode() {
        return this.hashCode;
    }

    public final T c() {
        return this.value;
    }
}
