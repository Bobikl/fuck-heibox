package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.w0;
import kotlin.b2;
import kotlinx.coroutines.t1;

/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PipHintTrackerKt {

    /* JADX INFO: compiled from: PipHintTracker.kt */
    public static final class a<T> implements kotlinx.coroutines.flow.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f1393b;

        a(Activity activity) {
            this.f1393b = activity;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@dl.d Rect rect, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            c.f1410a.a(this.f1393b, rect);
            return b2.f124493a;
        }
    }

    @w0(26)
    @dl.e
    @t1
    public static final Object b(@dl.d Activity activity, @dl.d View view, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = kotlinx.coroutines.flow.g.s(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).a(new a(activity), cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect c(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
