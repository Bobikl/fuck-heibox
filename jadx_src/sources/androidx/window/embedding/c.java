package androidx.window.embedding;

import android.app.Activity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ActivityStack.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0013\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/window/embedding/c;", "", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, "", ak.av, ak.aF, "other", "equals", "", "hashCode", "", "toString", "", "Ljava/util/List;", "b", "()Ljava/util/List;", "activities", "Z", "isEmpty", "<init>", "(Ljava/util/List;Z)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Activity> activities;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@dl.d List<? extends Activity> activities, boolean z10) {
        f0.p(activities, "activities");
        this.activities = activities;
        this.isEmpty = z10;
    }

    public /* synthetic */ c(List list, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(list, (i10 & 2) != 0 ? false : z10);
    }

    public final boolean a(@dl.d Activity activity) {
        f0.p(activity, "activity");
        return this.activities.contains(activity);
    }

    @dl.d
    public final List<Activity> b() {
        return this.activities;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return (f0.g(this.activities, cVar.activities) || this.isEmpty == cVar.isEmpty) ? false : true;
    }

    public int hashCode() {
        return ((this.isEmpty ? 1 : 0) * 31) + this.activities.hashCode();
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ActivityStack{");
        sb2.append(f0.C("activities=", b()));
        sb2.append("isEmpty=" + this.isEmpty + '}');
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
