package androidx.browser.trusted.sharing;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ShareData.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f3295d = "androidx.browser.trusted.sharing.KEY_TITLE";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f3296e = "androidx.browser.trusted.sharing.KEY_TEXT";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f3297f = "androidx.browser.trusted.sharing.KEY_URIS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final String f3298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f3299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final List<Uri> f3300c;

    public a(@p0 String str, @p0 String str2, @p0 List<Uri> list) {
        this.f3298a = str;
        this.f3299b = str2;
        this.f3300c = list;
    }

    @n0
    public static a a(@n0 Bundle bundle) {
        return new a(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), bundle.getParcelableArrayList(f3297f));
    }

    @n0
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.f3298a);
        bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.f3299b);
        if (this.f3300c != null) {
            bundle.putParcelableArrayList(f3297f, new ArrayList<>(this.f3300c));
        }
        return bundle;
    }
}
