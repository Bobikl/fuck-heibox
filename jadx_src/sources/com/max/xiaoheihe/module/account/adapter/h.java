package com.max.xiaoheihe.module.account.adapter;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.meituan.robust.ChangeQuickRedirect;
import df.r50;
import kotlin.jvm.internal.f0;
import pokercc.android.expandablerecyclerview.ExpandableAdapter;

/* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class h extends ExpandableAdapter.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final r50 f78790d;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(@dl.d r50 binding) {
        f0.p(binding, "binding");
        ConstraintLayout constraintLayoutB = binding.b();
        f0.o(constraintLayoutB, "binding.root");
        super(constraintLayoutB);
        this.f78790d = binding;
    }

    @dl.d
    public final r50 g() {
        return this.f78790d;
    }
}
