package com.uber.autodispose.android;

import android.view.View;
import com.uber.autodispose.y;
import io.reactivex.g;

/* JADX INFO: compiled from: ViewScopeProvider.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f104064b;

    private d(View view) {
        this.f104064b = view;
    }

    public static y e(View view) {
        if (view != null) {
            return new d(view);
        }
        throw new NullPointerException("view == null");
    }

    @Override // com.uber.autodispose.y
    public g a() {
        return new b(this.f104064b);
    }
}
