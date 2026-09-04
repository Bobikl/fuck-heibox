package d1;

import android.view.View;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PlatformHapticFeedback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Ld1/c;", "Ld1/a;", "Ld1/b;", "hapticFeedbackType", "Lkotlin/b2;", ak.av, "(I)V", "Landroid/view/View;", sd.b.f139384b, "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final View f108128a;

    public c(@dl.d View view) {
        f0.p(view, "view");
        this.f108128a = view;
    }

    @Override // d1.a
    public void a(int hapticFeedbackType) {
        b.a aVar = b.f108126b;
        if (b.d(hapticFeedbackType, aVar.a())) {
            this.f108128a.performHapticFeedback(0);
        } else if (b.d(hapticFeedbackType, aVar.b())) {
            this.f108128a.performHapticFeedback(9);
        }
    }
}
