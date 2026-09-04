package androidx.work.impl;

import android.content.Context;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WorkDatabaseMigrations.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/work/impl/s;", "Lf3/c;", "Lj3/g;", "db", "Lkotlin/b2;", ak.av, "Landroid/content/Context;", ak.aF, "Landroid/content/Context;", "b", "()Landroid/content/Context;", "mContext", "", "startVersion", "endVersion", "<init>", "(Landroid/content/Context;II)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class s extends f3.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Context mContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@dl.d Context mContext, int i10, int i11) {
        super(i10, i11);
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        this.mContext = mContext;
    }

    @Override // f3.c
    public void a(@dl.d j3.g db2) {
        kotlin.jvm.internal.f0.p(db2, "db");
        if (this.f118739b >= 10) {
            db2.P0(androidx.work.impl.utils.r.f29368b, new Object[]{androidx.work.impl.utils.r.f29372f, 1});
        } else {
            this.mContext.getSharedPreferences(androidx.work.impl.utils.r.f29370d, 0).edit().putBoolean(androidx.work.impl.utils.r.f29372f, true).apply();
        }
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Context getMContext() {
        return this.mContext;
    }
}
