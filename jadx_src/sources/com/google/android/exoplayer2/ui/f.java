package com.google.android.exoplayer2.ui;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.google.android.exoplayer2.c3;

/* JADX INFO: compiled from: DefaultMediaDescriptionAdapter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f implements PlayerNotificationManager.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final PendingIntent f50725a;

    public f(@androidx.annotation.p0 PendingIntent pendingIntent) {
        this.f50725a = pendingIntent;
    }

    @Override // com.google.android.exoplayer2.ui.PlayerNotificationManager.e
    @androidx.annotation.p0
    public PendingIntent a(c3 c3Var) {
        return this.f50725a;
    }

    @Override // com.google.android.exoplayer2.ui.PlayerNotificationManager.e
    public CharSequence b(c3 c3Var) {
        CharSequence charSequence = c3Var.j2().f46597f;
        if (!TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence charSequence2 = c3Var.j2().f46593b;
        return charSequence2 != null ? charSequence2 : "";
    }

    @Override // com.google.android.exoplayer2.ui.PlayerNotificationManager.e
    @androidx.annotation.p0
    public CharSequence c(c3 c3Var) {
        CharSequence charSequence = c3Var.j2().f46594c;
        return !TextUtils.isEmpty(charSequence) ? charSequence : c3Var.j2().f46596e;
    }

    @Override // com.google.android.exoplayer2.ui.PlayerNotificationManager.e
    @androidx.annotation.p0
    public Bitmap d(c3 c3Var, PlayerNotificationManager.b bVar) {
        byte[] bArr = c3Var.j2().f46603l;
        if (bArr == null) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    @Override // com.google.android.exoplayer2.ui.PlayerNotificationManager.e
    public /* synthetic */ CharSequence e(c3 c3Var) {
        return o.a(this, c3Var);
    }
}
