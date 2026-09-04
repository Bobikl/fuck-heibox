package ib;

import android.view.View;
import com.max.hbcommon.component.dialog.TopViewStyle;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HBDialogTopInfo.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private View f119341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final TopViewStyle f119342b;

    public f(@dl.e View view, @dl.e TopViewStyle topViewStyle) {
        this.f119341a = view;
        this.f119342b = topViewStyle;
    }

    public /* synthetic */ f(View view, TopViewStyle topViewStyle, int i10, u uVar) {
        this(view, (i10 & 2) != 0 ? TopViewStyle.Style_56 : topViewStyle);
    }

    @dl.e
    public final TopViewStyle a() {
        return this.f119342b;
    }

    @dl.e
    public final View b() {
        return this.f119341a;
    }

    public final void c(@dl.e View view) {
        this.f119341a = view;
    }
}
