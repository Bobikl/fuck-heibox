package androidx.activity;

import androidx.lifecycle.y;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public static final class a extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.l<o, b2> f1496a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, yh.l<? super o, b2> lVar) {
            super(z10);
            this.f1496a = lVar;
        }

        @Override // androidx.activity.o
        public void handleOnBackPressed() {
            this.f1496a.invoke(this);
        }
    }

    @dl.d
    public static final o a(@dl.d OnBackPressedDispatcher onBackPressedDispatcher, @dl.e y yVar, boolean z10, @dl.d yh.l<? super o, b2> onBackPressed) {
        f0.p(onBackPressedDispatcher, "<this>");
        f0.p(onBackPressed, "onBackPressed");
        a aVar = new a(z10, onBackPressed);
        if (yVar != null) {
            onBackPressedDispatcher.c(yVar, aVar);
        } else {
            onBackPressedDispatcher.b(aVar);
        }
        return aVar;
    }

    public static /* synthetic */ o b(OnBackPressedDispatcher onBackPressedDispatcher, y yVar, boolean z10, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            yVar = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(onBackPressedDispatcher, yVar, z10, lVar);
    }
}
