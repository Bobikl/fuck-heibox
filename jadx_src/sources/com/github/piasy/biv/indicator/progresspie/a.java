package com.github.piasy.biv.indicator.progresspie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.filippudak.ProgressPieView.ProgressPieView;
import com.github.piasy.biv.view.BigImageView;
import java.util.Locale;

/* JADX INFO: compiled from: ProgressPieIndicator.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements i8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ProgressPieView f43399a;

    @Override // i8.a
    public View a(BigImageView bigImageView) {
        ProgressPieView progressPieView = (ProgressPieView) LayoutInflater.from(bigImageView.getContext()).inflate(R.layout.ui_progress_pie_indicator, (ViewGroup) bigImageView, false);
        this.f43399a = progressPieView;
        return progressPieView;
    }

    @Override // i8.a
    public void onFinish() {
    }

    @Override // i8.a
    public void onProgress(int i10) {
        ProgressPieView progressPieView;
        if (i10 < 0 || i10 > 100 || (progressPieView = this.f43399a) == null) {
            return;
        }
        progressPieView.setProgress(i10);
        this.f43399a.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf(i10)));
    }

    @Override // i8.a
    public void onStart() {
    }
}
