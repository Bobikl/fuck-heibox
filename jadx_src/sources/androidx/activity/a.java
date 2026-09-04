package androidx.activity;

import android.view.View;
import androidx.annotation.w0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(19)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f1409a = new a();

    private a() {
    }

    public final boolean a(@dl.d View view) {
        f0.p(view, "view");
        return view.isAttachedToWindow();
    }
}
