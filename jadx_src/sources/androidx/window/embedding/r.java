package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: MatcherUtils.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J!\u0010\n\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/window/embedding/r;", "", "", "name", org.apache.tools.ant.types.selectors.m.f136546u, "", ak.aF, "Landroid/content/ComponentName;", "activityComponent", "ruleComponent", "b", "(Landroid/content/ComponentName;Landroid/content/ComponentName;)Z", "Landroid/app/Activity;", RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, ak.av, "(Landroid/app/Activity;Landroid/content/ComponentName;)Z", "Z", "sDebugMatchers", "Ljava/lang/String;", "sMatchersTag", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final r f28539a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final boolean sDebugMatchers = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final String sMatchersTag = "SplitRuleResolution";

    private r() {
    }

    private final boolean c(String name, String pattern) {
        if (!StringsKt__StringsKt.W2(pattern, androidx.webkit.b.f28327e, false, 2, null)) {
            return false;
        }
        if (f0.g(pattern, androidx.webkit.b.f28327e)) {
            return true;
        }
        if (!(StringsKt__StringsKt.s3(pattern, androidx.webkit.b.f28327e, 0, false, 6, null) == StringsKt__StringsKt.G3(pattern, androidx.webkit.b.f28327e, 0, false, 6, null) && kotlin.text.u.K1(pattern, androidx.webkit.b.f28327e, false, 2, null))) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
        }
        String strSubstring = pattern.substring(0, pattern.length() - 1);
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return kotlin.text.u.v2(name, strSubstring, false, 2, null);
    }

    public final boolean a(@dl.d Activity activity, @dl.d ComponentName ruleComponent) {
        ComponentName component;
        f0.p(activity, "activity");
        f0.p(ruleComponent, "ruleComponent");
        if (b(activity.getComponentName(), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return f28539a.b(component, ruleComponent);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    public final boolean b(@dl.e ComponentName activityComponent, @dl.d ComponentName ruleComponent) {
        boolean z10;
        boolean z11;
        f0.p(ruleComponent, "ruleComponent");
        if (activityComponent == null) {
            return f0.g(ruleComponent.getPackageName(), androidx.webkit.b.f28327e) && f0.g(ruleComponent.getClassName(), androidx.webkit.b.f28327e);
        }
        String string = activityComponent.toString();
        f0.o(string, "activityComponent.toString()");
        if (!(!StringsKt__StringsKt.W2(string, androidx.webkit.b.f28327e, false, 2, null))) {
            throw new IllegalArgumentException("Wildcard can only be part of the rule.".toString());
        }
        if (f0.g(activityComponent.getPackageName(), ruleComponent.getPackageName())) {
            z10 = true;
        } else {
            String packageName = activityComponent.getPackageName();
            f0.o(packageName, "activityComponent.packageName");
            String packageName2 = ruleComponent.getPackageName();
            f0.o(packageName2, "ruleComponent.packageName");
            if (c(packageName, packageName2)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (f0.g(activityComponent.getClassName(), ruleComponent.getClassName())) {
            z11 = true;
        } else {
            String className = activityComponent.getClassName();
            f0.o(className, "activityComponent.className");
            String className2 = ruleComponent.getClassName();
            f0.o(className2, "ruleComponent.className");
            if (c(className, className2)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z10 && z11;
    }
}
