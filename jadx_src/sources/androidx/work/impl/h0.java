package androidx.work.impl;

import android.content.Context;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WorkDatabaseMigrations.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/work/impl/h0;", "Lf3/c;", "Lj3/g;", "db", "Lkotlin/b2;", ak.av, "Landroid/content/Context;", ak.aF, "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "<init>", "(Landroid/content/Context;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class h0 extends f3.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(@dl.d Context context) {
        super(9, 10);
        kotlin.jvm.internal.f0.p(context, "context");
        this.context = context;
    }

    @Override // f3.c
    public void a(@dl.d j3.g db2) {
        kotlin.jvm.internal.f0.p(db2, "db");
        db2.y0(androidx.work.impl.utils.r.f29369c);
        androidx.work.impl.utils.r.e(this.context, db2);
        androidx.work.impl.utils.k.c(this.context, db2);
    }
}
