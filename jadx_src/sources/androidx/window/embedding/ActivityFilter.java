package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: androidx.window.embedding.a, reason: from toString */
/* JADX INFO: compiled from: ActivityFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0013\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/a;", "", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "", "d", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, ak.aF, "other", "equals", "", "hashCode", "", "toString", "Landroid/content/ComponentName;", ak.av, "Landroid/content/ComponentName;", "()Landroid/content/ComponentName;", "componentName", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "intentAction", "<init>", "(Landroid/content/ComponentName;Ljava/lang/String;)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class ActivityFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final ComponentName componentName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final String intentAction;

    public ActivityFilter(@dl.d ComponentName componentName, @dl.e String str) {
        f0.p(componentName, "componentName");
        this.componentName = componentName;
        this.intentAction = str;
        String packageName = componentName.getPackageName();
        f0.o(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        f0.o(className, "componentName.className");
        boolean z10 = true;
        if (!(packageName.length() > 0)) {
            throw new IllegalArgumentException("Package name must not be empty".toString());
        }
        if (!(className.length() > 0)) {
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (!(!StringsKt__StringsKt.W2(packageName, androidx.webkit.b.f28327e, false, 2, null) || StringsKt__StringsKt.s3(packageName, androidx.webkit.b.f28327e, 0, false, 6, null) == packageName.length() - 1)) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (StringsKt__StringsKt.W2(className, androidx.webkit.b.f28327e, false, 2, null) && StringsKt__StringsKt.s3(className, androidx.webkit.b.f28327e, 0, false, 6, null) != className.length() - 1) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ComponentName getComponentName() {
        return this.componentName;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getIntentAction() {
        return this.intentAction;
    }

    public final boolean c(@dl.d Activity activity) {
        f0.p(activity, "activity");
        if (r.f28539a.a(activity, this.componentName)) {
            String str = this.intentAction;
            if (str != null) {
                Intent intent = activity.getIntent();
                if (f0.g(str, intent == null ? null : intent.getAction())) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(@dl.d Intent intent) {
        f0.p(intent, "intent");
        if (!r.f28539a.b(intent.getComponent(), this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        return str == null || f0.g(str, intent.getAction());
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityFilter)) {
            return false;
        }
        ActivityFilter activityFilter = (ActivityFilter) other;
        return f0.g(this.componentName, activityFilter.componentName) && f0.g(this.intentAction, activityFilter.intentAction);
    }

    public int hashCode() {
        int iHashCode = this.componentName.hashCode() * 31;
        String str = this.intentAction;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @dl.d
    public String toString() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + ((Object) this.intentAction) + ')';
    }
}
