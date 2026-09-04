package androidx.p001datastore.core;

import androidx.exifinterface.media.a;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/datastore/core/f;", a.f23244d5, "Landroidx/datastore/core/j;", "", ak.av, "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "finalException", "<init>", "(Ljava/lang/Throwable;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
public final class f<T> extends j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final Throwable finalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@d Throwable finalException) {
        super(null);
        f0.p(finalException, "finalException");
        this.finalException = finalException;
    }

    @d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Throwable getFinalException() {
        return this.finalException;
    }
}
