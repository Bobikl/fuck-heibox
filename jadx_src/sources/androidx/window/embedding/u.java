package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: SplitPairFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/window/embedding/u;", "", "Landroid/app/Activity;", "primaryActivity", "secondaryActivity", "", "e", "Landroid/content/Intent;", "secondaryActivityIntent", "d", "other", "equals", "", "hashCode", "", "toString", "Landroid/content/ComponentName;", ak.av, "Landroid/content/ComponentName;", "()Landroid/content/ComponentName;", "primaryActivityName", "b", ak.aF, "secondaryActivityName", "Ljava/lang/String;", "()Ljava/lang/String;", "secondaryActivityIntentAction", "<init>", "(Landroid/content/ComponentName;Landroid/content/ComponentName;Ljava/lang/String;)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ComponentName primaryActivityName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final ComponentName secondaryActivityName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final String secondaryActivityAction;

    /* JADX WARN: Code duplicated, block: B:13:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x0113 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0114  */
    /* JADX WARN: Code duplicated, block: B:65:0x011e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0128  */
    public u(@dl.d ComponentName primaryActivityName, @dl.d ComponentName secondaryActivityName, @dl.e String str) {
        boolean z10;
        boolean z11;
        Object obj;
        int i10;
        CharSequence charSequence;
        boolean z12;
        String str2;
        boolean z13;
        boolean z14;
        f0.p(primaryActivityName, "primaryActivityName");
        f0.p(secondaryActivityName, "secondaryActivityName");
        this.primaryActivityName = primaryActivityName;
        this.secondaryActivityName = secondaryActivityName;
        this.secondaryActivityAction = str;
        String packageName = primaryActivityName.getPackageName();
        f0.o(packageName, "primaryActivityName.packageName");
        String className = primaryActivityName.getClassName();
        f0.o(className, "primaryActivityName.className");
        String packageName2 = secondaryActivityName.getPackageName();
        f0.o(packageName2, "secondaryActivityName.packageName");
        String className2 = secondaryActivityName.getClassName();
        f0.o(className2, "secondaryActivityName.className");
        boolean z15 = true;
        if (packageName.length() == 0) {
            z10 = false;
        } else {
            if (packageName2.length() == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (!z10) {
            throw new IllegalArgumentException("Package name must not be empty".toString());
        }
        if (className.length() == 0) {
            z11 = false;
        } else {
            if (className2.length() == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if (!z11) {
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (!(!StringsKt__StringsKt.W2(packageName, androidx.webkit.b.f28327e, false, 2, null) || StringsKt__StringsKt.s3(packageName, androidx.webkit.b.f28327e, 0, false, 6, null) == packageName.length() + (-1))) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (StringsKt__StringsKt.W2(className, androidx.webkit.b.f28327e, false, 2, null)) {
            obj = null;
            i10 = 2;
            charSequence = androidx.webkit.b.f28327e;
            z12 = false;
            str2 = className2;
            if (StringsKt__StringsKt.s3(className, androidx.webkit.b.f28327e, 0, false, 6, null) != className.length() - 1) {
                z13 = false;
            }
            if (z13) {
                throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
            }
            if (StringsKt__StringsKt.W2(packageName2, charSequence, z12, i10, obj) || StringsKt__StringsKt.s3(packageName2, androidx.webkit.b.f28327e, 0, false, 6, null) == packageName2.length() - 1) {
                z14 = true;
            } else {
                z14 = z12;
            }
            if (z14) {
                throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
            }
            if (StringsKt__StringsKt.W2(str2, charSequence, z12, i10, obj) && StringsKt__StringsKt.s3(str2, androidx.webkit.b.f28327e, 0, false, 6, null) != str2.length() - 1) {
                z15 = z12;
            }
            if (z15) {
                throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
            }
        }
        obj = null;
        i10 = 2;
        charSequence = androidx.webkit.b.f28327e;
        z12 = false;
        str2 = className2;
        z13 = true;
        if (z13) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
        if (StringsKt__StringsKt.W2(packageName2, charSequence, z12, i10, obj)) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (z14) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (StringsKt__StringsKt.W2(str2, charSequence, z12, i10, obj)) {
            z15 = z12;
        }
        if (z15) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSecondaryActivityAction() {
        return this.secondaryActivityAction;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public final boolean d(@dl.d Activity primaryActivity, @dl.d Intent secondaryActivityIntent) {
        f0.p(primaryActivity, "primaryActivity");
        f0.p(secondaryActivityIntent, "secondaryActivityIntent");
        ComponentName componentName = primaryActivity.getComponentName();
        r rVar = r.f28539a;
        if (!rVar.b(componentName, this.primaryActivityName) || !rVar.b(secondaryActivityIntent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityAction;
        return str == null || f0.g(str, secondaryActivityIntent.getAction());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    public final boolean e(@dl.d Activity primaryActivity, @dl.d Activity secondaryActivity) {
        boolean z10;
        f0.p(primaryActivity, "primaryActivity");
        f0.p(secondaryActivity, "secondaryActivity");
        r rVar = r.f28539a;
        boolean z11 = rVar.b(primaryActivity.getComponentName(), this.primaryActivityName) && rVar.b(secondaryActivity.getComponentName(), this.secondaryActivityName);
        if (secondaryActivity.getIntent() == null) {
            return z11;
        }
        if (z11) {
            Intent intent = secondaryActivity.getIntent();
            f0.o(intent, "secondaryActivity.intent");
            z10 = d(primaryActivity, intent);
        }
        return z10;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        return f0.g(this.primaryActivityName, uVar.primaryActivityName) && f0.g(this.secondaryActivityName, uVar.secondaryActivityName) && f0.g(this.secondaryActivityAction, uVar.secondaryActivityAction);
    }

    public int hashCode() {
        int iHashCode = ((this.primaryActivityName.hashCode() * 31) + this.secondaryActivityName.hashCode()) * 31;
        String str = this.secondaryActivityAction;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @dl.d
    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((Object) this.secondaryActivityAction) + '}';
    }
}
