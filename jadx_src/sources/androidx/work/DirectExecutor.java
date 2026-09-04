package androidx.work;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DirectExecutor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016j\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/work/DirectExecutor;", "", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lkotlin/b2;", com.tekartik.sqflite.b.f98590i, "", "toString", "<init>", "(Ljava/lang/String;I)V", "INSTANCE", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public enum DirectExecutor implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(@dl.d Runnable command) {
        f0.p(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    @dl.d
    public String toString() {
        return "DirectExecutor";
    }
}
