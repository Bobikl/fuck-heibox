package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.w0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(26)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f1410a = new c();

    private c() {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.app.PictureInPictureParams$Builder] */
    public final void a(@dl.d Activity activity, @dl.d Rect hint) {
        f0.p(activity, "activity");
        f0.p(hint, "hint");
        activity.setPictureInPictureParams(new Object() { // from class: android.app.PictureInPictureParams$Builder
            static {
                throw new NoClassDefFoundError();
            }

            public native /* synthetic */ PictureInPictureParams build();

            public native /* synthetic */ PictureInPictureParams$Builder setSourceRectHint(Rect rect);
        }.setSourceRectHint(hint).build());
    }
}
