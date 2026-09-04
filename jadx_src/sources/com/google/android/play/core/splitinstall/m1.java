package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class m1 implements com.google.android.play.core.common.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f56361a;

    m1(i iVar, Activity activity) {
        this.f56361a = activity;
    }

    @Override // com.google.android.play.core.common.a
    public final void a(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        this.f56361a.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }
}
