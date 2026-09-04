package com.max.xiaoheihe.module.account.adapter;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.jvm.internal.f0;
import pokercc.android.expandablerecyclerview.ExpandableAdapter;

/* JADX INFO: compiled from: ChangeBindListAdapterV2.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class c extends ExpandableAdapter.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final l3.c f78771d;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(@dl.d l3.c binding) {
        f0.p(binding, "binding");
        View root = binding.getRoot();
        f0.o(root, "binding.root");
        super(root);
        this.f78771d = binding;
    }

    @dl.d
    public final l3.c g() {
        return this.f78771d;
    }
}
