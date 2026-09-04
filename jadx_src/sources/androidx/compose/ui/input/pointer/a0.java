package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerInputEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/pointer/a0;", "", "", ak.av, "J", ak.aF, "()J", "uptime", "", "Landroidx/compose/ui/input/pointer/b0;", "b", "Ljava/util/List;", "()Ljava/util/List;", "pointers", "Landroid/view/MotionEvent;", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "<init>", "(JLjava/util/List;Landroid/view/MotionEvent;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long uptime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<PointerInputEventData> pointers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final MotionEvent motionEvent;

    public a0(long j10, @dl.d List<PointerInputEventData> pointers, @dl.d MotionEvent motionEvent) {
        kotlin.jvm.internal.f0.p(pointers, "pointers");
        kotlin.jvm.internal.f0.p(motionEvent, "motionEvent");
        this.uptime = j10;
        this.pointers = pointers;
        this.motionEvent = motionEvent;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    @dl.d
    public final List<PointerInputEventData> b() {
        return this.pointers;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getUptime() {
        return this.uptime;
    }
}
