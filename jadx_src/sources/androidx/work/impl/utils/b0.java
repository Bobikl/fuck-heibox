package androidx.work.impl.utils;

import android.os.PowerManager;
import com.umeng.analytics.pro.ak;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: WakeLocks.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR'\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0003R\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/work/impl/utils/b0;", "", "Ljava/util/WeakHashMap;", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "", "b", "Ljava/util/WeakHashMap;", ak.av, "()Ljava/util/WeakHashMap;", "wakeLocks", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b0 f29274a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final WeakHashMap<PowerManager.WakeLock, String> wakeLocks = new WeakHashMap<>();

    private b0() {
    }

    @dl.d
    public final WeakHashMap<PowerManager.WakeLock, String> a() {
        return wakeLocks;
    }
}
