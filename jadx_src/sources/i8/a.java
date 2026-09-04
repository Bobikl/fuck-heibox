package i8;

import android.view.View;
import com.github.piasy.biv.view.BigImageView;

/* JADX INFO: compiled from: ProgressIndicator.java */
/* JADX INFO: loaded from: classes6.dex */
public interface a {
    View a(BigImageView bigImageView);

    void onFinish();

    void onProgress(int i10);

    void onStart();
}
