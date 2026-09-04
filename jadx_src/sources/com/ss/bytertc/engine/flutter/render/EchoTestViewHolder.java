package com.ss.bytertc.engine.flutter.render;

import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.ss.bytertc.engine.VideoCanvas;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class EchoTestViewHolder {

    @n0
    private static WeakReference<VideoCanvas> ref = new WeakReference<>(null);

    @p0
    public static View getRenderView() {
        VideoCanvas view = getView();
        if (view == null) {
            return null;
        }
        return view.renderView;
    }

    @p0
    public static VideoCanvas getView() {
        return ref.get();
    }

    public static void setView(@p0 VideoCanvas videoCanvas) {
        ref = new WeakReference<>(videoCanvas);
    }
}
