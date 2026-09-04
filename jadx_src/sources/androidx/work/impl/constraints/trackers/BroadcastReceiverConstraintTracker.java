package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BroadcastReceiverConstraintTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", androidx.exifinterface.media.a.f23244d5, "Landroidx/work/impl/constraints/trackers/g;", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Lkotlin/b2;", "l", "i", "j", "Landroid/content/BroadcastReceiver;", "f", "Landroid/content/BroadcastReceiver;", "broadcastReceiver", "Landroid/content/IntentFilter;", "k", "()Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/work/impl/utils/taskexecutor/c;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/c;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class BroadcastReceiverConstraintTracker<T> extends g<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final BroadcastReceiver broadcastReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastReceiverConstraintTracker(@dl.d Context context, @dl.d androidx.work.impl.utils.taskexecutor.c taskExecutor) {
        super(context, taskExecutor);
        f0.p(context, "context");
        f0.p(taskExecutor, "taskExecutor");
        this.broadcastReceiver = new BroadcastReceiver(this) { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BroadcastReceiverConstraintTracker<T> f28925a;

            {
                this.f28925a = this;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(@dl.d Context context2, @dl.d Intent intent) {
                f0.p(context2, "context");
                f0.p(intent, "intent");
                this.f28925a.l(intent);
            }
        };
    }

    @Override // androidx.work.impl.constraints.trackers.g
    public void i() {
        androidx.work.n.e().a(e.f28929a, getClass().getSimpleName() + ": registering receiver");
        getAppContext().registerReceiver(this.broadcastReceiver, k());
    }

    @Override // androidx.work.impl.constraints.trackers.g
    public void j() {
        androidx.work.n.e().a(e.f28929a, getClass().getSimpleName() + ": unregistering receiver");
        getAppContext().unregisterReceiver(this.broadcastReceiver);
    }

    @dl.d
    public abstract IntentFilter k();

    public abstract void l(@dl.d Intent intent);
}
