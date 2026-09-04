package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.w0;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.r0;
import kotlin.collections.s0;

/* JADX INFO: compiled from: WorkDatabasePathHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Landroidx/work/impl/b0;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Lkotlin/b2;", "d", "Ljava/io/File;", ak.aF, "", "e", "b", ak.av, "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b0 f28813a = new b0();

    private b0() {
    }

    @w0(23)
    private final File c(Context context) {
        return new File(a.f28799a.a(context), c0.f28922b);
    }

    @xh.m
    public static final void d(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        b0 b0Var = f28813a;
        if (b0Var.b(context).exists()) {
            androidx.work.n.e().a(c0.f28921a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : b0Var.e(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        androidx.work.n.e().l(c0.f28921a, "Over-writing contents of " + value);
                    }
                    androidx.work.n.e().a(c0.f28921a, key.renameTo(value) ? "Migrated " + key + "to " + value : "Renaming " + key + " to " + value + " failed");
                }
            }
        }
    }

    @dl.d
    public final File a(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        return c(context);
    }

    @dl.d
    public final File b(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        File databasePath = context.getDatabasePath(c0.f28922b);
        kotlin.jvm.internal.f0.o(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    @dl.d
    public final Map<File, File> e(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        File fileB = b(context);
        File fileA = a(context);
        String[] strArr = c0.f28923c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(r0.j(strArr.length), 16));
        for (String str : strArr) {
            Pair pairA = c1.a(new File(fileB.getPath() + str), new File(fileA.getPath() + str));
            linkedHashMap.put(pairA.e(), pairA.f());
        }
        return s0.o0(linkedHashMap, c1.a(fileB, fileA));
    }
}
