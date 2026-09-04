package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.n0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: TrustedWebActivityIntent.java */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final Intent f3330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final List<Uri> f3331b;

    u(@n0 Intent intent, @n0 List<Uri> list) {
        this.f3330a = intent;
        this.f3331b = list;
    }

    private void b(Context context) {
        Iterator<Uri> it = this.f3331b.iterator();
        while (it.hasNext()) {
            context.grantUriPermission(this.f3330a.getPackage(), it.next(), 1);
        }
    }

    @n0
    public Intent a() {
        return this.f3330a;
    }

    public void c(@n0 Context context) {
        b(context);
        androidx.core.content.d.w(context, this.f3330a, null);
    }
}
