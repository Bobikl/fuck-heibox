package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;

/* JADX INFO: compiled from: BrowserActionItem.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final PendingIntent f3069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @v
    private int f3070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Uri f3071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private Runnable f3072e;

    public a(@n0 String str, @n0 PendingIntent pendingIntent) {
        this(str, pendingIntent, 0);
    }

    public a(@n0 String str, @n0 PendingIntent pendingIntent, @v int i10) {
        this.f3068a = str;
        this.f3069b = pendingIntent;
        this.f3070c = i10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public a(@n0 String str, @n0 PendingIntent pendingIntent, @n0 Uri uri) {
        this.f3068a = str;
        this.f3069b = pendingIntent;
        this.f3071d = uri;
    }

    a(@n0 String str, @n0 Runnable runnable) {
        this.f3068a = str;
        this.f3069b = null;
        this.f3072e = runnable;
    }

    @n0
    public PendingIntent a() {
        PendingIntent pendingIntent = this.f3069b;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    public int b() {
        return this.f3070c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    public Uri c() {
        return this.f3071d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @p0
    Runnable d() {
        return this.f3072e;
    }

    @n0
    public String e() {
        return this.f3068a;
    }
}
