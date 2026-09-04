package androidx.p001datastore;

import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xh.h;

/* JADX INFO: renamed from: androidx.datastore.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DataStoreFile.kt */
/* JADX INFO: loaded from: classes.dex */
@h(name = "DataStoreFile")
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "", Progress.F, "Ljava/io/File;", ak.av, "datastore_release"}, k = 2, mv = {1, 5, 1})
public final class Context {
    @d
    public static final File a(@d android.content.Context context, @d String fileName) {
        f0.p(context, "<this>");
        f0.p(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), f0.C("datastore/", fileName));
    }
}
