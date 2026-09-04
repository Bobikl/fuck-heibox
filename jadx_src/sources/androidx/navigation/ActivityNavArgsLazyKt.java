package androidx.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: compiled from: ActivityNavArgsLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityNavArgsLazyKt {
    @androidx.annotation.k0
    public static final /* synthetic */ <Args extends m> n<Args> a(final Activity activity) {
        kotlin.jvm.internal.f0.p(activity, "<this>");
        kotlin.jvm.internal.f0.y(4, "Args");
        return new n<>(kotlin.jvm.internal.n0.d(m.class), new yh.a<Bundle>() { // from class: androidx.navigation.ActivityNavArgsLazyKt$navArgs$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Bundle invoke() {
                Bundle extras;
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Activity activity2 = activity;
                    extras = intent.getExtras();
                    if (extras == null) {
                        throw new IllegalStateException("Activity " + activity2 + " has null extras in " + intent);
                    }
                } else {
                    extras = null;
                }
                if (extras != null) {
                    return extras;
                }
                throw new IllegalStateException("Activity " + activity + " has a null Intent");
            }
        });
    }
}
