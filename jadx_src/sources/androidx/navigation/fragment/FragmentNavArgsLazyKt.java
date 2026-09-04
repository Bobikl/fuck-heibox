package androidx.navigation.fragment;

import android.os.Bundle;
import androidx.annotation.k0;
import androidx.fragment.app.Fragment;
import androidx.navigation.n;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;

/* JADX INFO: compiled from: FragmentNavArgsLazy.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FragmentNavArgsLazyKt {
    @k0
    public static final /* synthetic */ <Args extends androidx.navigation.m> n<Args> a(final Fragment fragment) {
        f0.p(fragment, "<this>");
        f0.y(4, "Args");
        return new n<>(n0.d(androidx.navigation.m.class), new yh.a<Bundle>() { // from class: androidx.navigation.fragment.FragmentNavArgsLazyKt$navArgs$1
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Bundle invoke() {
                Bundle arguments = fragment.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + fragment + " has null arguments");
            }
        });
    }
}
