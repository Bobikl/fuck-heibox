package com.max.hblayout.hbgame;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import vc.a;
import xh.i;

/* JADX INFO: compiled from: GameSingleCardFrameLayout.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class GameSingleCardFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final a f70655b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public GameSingleCardFrameLayout(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public GameSingleCardFrameLayout(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public GameSingleCardFrameLayout(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        a aVarD = a.d(LayoutInflater.from(context), this, true);
        f0.o(aVarD, "inflate(...)");
        this.f70655b = aVarD;
    }

    public /* synthetic */ GameSingleCardFrameLayout(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @d
    public final a getBinding() {
        return this.f70655b;
    }
}
