package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;

/* JADX INFO: compiled from: AccessibilityClickableSpanCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final String f21330e = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f21332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21333d;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public a(int i10, @n0 a0 a0Var, int i11) {
        this.f21331b = i10;
        this.f21332c = a0Var;
        this.f21333d = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@n0 View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(f21330e, this.f21331b);
        this.f21332c.M0(this.f21333d, bundle);
    }
}
