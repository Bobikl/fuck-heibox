package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.p;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public final class g extends b.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Fragment f52674b;

    private g(Fragment fragment) {
        this.f52674b = fragment;
    }

    @v8.a
    @p0
    public static g r0(@p0 Fragment fragment) {
        if (fragment != null) {
            return new g(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.b
    public final int A() {
        return this.f52674b.getId();
    }

    @Override // com.google.android.gms.dynamic.b
    @n0
    public final c B() {
        return e.f1(this.f52674b.getView());
    }

    @Override // com.google.android.gms.dynamic.b
    public final boolean B0() {
        return this.f52674b.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.b
    @n0
    public final c D() {
        return e.f1(this.f52674b.getActivity());
    }

    @Override // com.google.android.gms.dynamic.b
    @p0
    public final Bundle E() {
        return this.f52674b.getArguments();
    }

    @Override // com.google.android.gms.dynamic.b
    @n0
    public final c F() {
        return e.f1(this.f52674b.getResources());
    }

    @Override // com.google.android.gms.dynamic.b
    @p0
    public final b G() {
        return r0(this.f52674b.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.b
    @p0
    public final String H() {
        return this.f52674b.getTag();
    }

    @Override // com.google.android.gms.dynamic.b
    public final void M(boolean z10) {
        this.f52674b.setHasOptionsMenu(z10);
    }

    @Override // com.google.android.gms.dynamic.b
    public final void N0(@n0 c cVar) {
        View view = (View) e.r0(cVar);
        Fragment fragment = this.f52674b;
        p.l(view);
        fragment.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.b
    public final void P(boolean z10) {
        this.f52674b.setMenuVisibility(z10);
    }

    @Override // com.google.android.gms.dynamic.b
    public final void T(boolean z10) {
        this.f52674b.setRetainInstance(z10);
    }

    @Override // com.google.android.gms.dynamic.b
    public final void U(@n0 Intent intent) {
        this.f52674b.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.b
    public final void W(@n0 Intent intent, int i10) {
        this.f52674b.startActivityForResult(intent, i10);
    }

    @Override // com.google.android.gms.dynamic.b
    public final void e1(@n0 c cVar) {
        View view = (View) e.r0(cVar);
        Fragment fragment = this.f52674b;
        p.l(view);
        fragment.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.b
    @p0
    public final b h1() {
        return r0(this.f52674b.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.b
    public final boolean j0() {
        return this.f52674b.isAdded();
    }

    @Override // com.google.android.gms.dynamic.b
    public final boolean k0() {
        return this.f52674b.isDetached();
    }

    @Override // com.google.android.gms.dynamic.b
    public final boolean n0() {
        return this.f52674b.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.b
    public final void o0(boolean z10) {
        this.f52674b.setUserVisibleHint(z10);
    }

    @Override // com.google.android.gms.dynamic.b
    public final boolean p1() {
        return this.f52674b.isVisible();
    }

    @Override // com.google.android.gms.dynamic.b
    public final boolean q0() {
        return this.f52674b.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.b
    public final boolean t0() {
        return this.f52674b.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.b
    public final boolean v0() {
        return this.f52674b.isResumed();
    }

    @Override // com.google.android.gms.dynamic.b
    public final int y() {
        return this.f52674b.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.b
    public final boolean z0() {
        return this.f52674b.isHidden();
    }
}
