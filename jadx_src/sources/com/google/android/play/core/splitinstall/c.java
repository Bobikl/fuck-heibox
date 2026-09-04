package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public interface c {
    @androidx.annotation.n0
    com.google.android.gms.tasks.k<Void> a(List<Locale> list);

    com.google.android.gms.tasks.k<Integer> b(@androidx.annotation.n0 e eVar);

    @androidx.annotation.n0
    com.google.android.gms.tasks.k<Void> c(List<String> list);

    boolean d(@androidx.annotation.n0 f fVar, @androidx.annotation.n0 androidx.activity.result.g<IntentSenderRequest> gVar);

    void e(@androidx.annotation.n0 g gVar);

    @androidx.annotation.n0
    com.google.android.gms.tasks.k<Void> f(List<String> list);

    void g(@androidx.annotation.n0 g gVar);

    void h(@androidx.annotation.n0 g gVar);

    void i(@androidx.annotation.n0 g gVar);

    @androidx.annotation.n0
    Set<String> j();

    boolean k(@androidx.annotation.n0 f fVar, @androidx.annotation.n0 Activity activity, int i10) throws IntentSender.SendIntentException;

    @androidx.annotation.n0
    com.google.android.gms.tasks.k<Void> l(List<Locale> list);

    @androidx.annotation.n0
    com.google.android.gms.tasks.k<Void> m(int i10);

    @androidx.annotation.n0
    com.google.android.gms.tasks.k<List<f>> n();

    boolean o(@androidx.annotation.n0 f fVar, @androidx.annotation.n0 com.google.android.play.core.common.a aVar, int i10) throws IntentSender.SendIntentException;

    @androidx.annotation.n0
    com.google.android.gms.tasks.k<f> p(int i10);

    @androidx.annotation.n0
    Set<String> q();
}
