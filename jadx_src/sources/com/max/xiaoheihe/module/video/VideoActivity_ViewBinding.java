package com.max.xiaoheihe.module.video;

import android.view.View;
import androidx.annotation.i;
import androidx.annotation.i1;
import butterknife.Unbinder;
import butterknife.internal.f;
import com.max.video.AbsVideoView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes12.dex */
public class VideoActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VideoActivity f93545b;

    @i1
    public VideoActivity_ViewBinding(VideoActivity videoActivity) {
        this(videoActivity, videoActivity.getWindow().getDecorView());
    }

    @i1
    public VideoActivity_ViewBinding(VideoActivity videoActivity, View view) {
        this.f93545b = videoActivity;
        videoActivity.mVideoView = (AbsVideoView) f.f(view, R.id.video_view, "field 'mVideoView'", AbsVideoView.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46224, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VideoActivity videoActivity = this.f93545b;
        if (videoActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f93545b = null;
        videoActivity.mVideoView = null;
    }
}
