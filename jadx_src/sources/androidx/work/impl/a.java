package androidx.work.impl;

import android.content.Context;
import androidx.annotation.w0;
import com.umeng.analytics.pro.ak;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: compiled from: WorkDatabasePathHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@w0(21)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/a;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Ljava/io/File;", ak.av, "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f28799a = new a();

    private a() {
    }

    @androidx.annotation.u
    @dl.d
    public final File a(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        kotlin.jvm.internal.f0.o(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
