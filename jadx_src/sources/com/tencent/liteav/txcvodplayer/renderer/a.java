package com.tencent.liteav.txcvodplayer.renderer;

import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;

/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.a$a, reason: collision with other inner class name */
    public interface InterfaceC0964a {
        void a(b bVar);

        void a(b bVar, int i10, int i11);

        boolean a(MotionEvent motionEvent);

        void b(b bVar);
    }

    public interface b {
        a a();

        void a(ITXVCubePlayer iTXVCubePlayer);

        Surface b();

        Surface c();
    }

    void a(int i10, int i11);

    void a(InterfaceC0964a interfaceC0964a);

    boolean a();

    void b(int i10, int i11);

    void b(InterfaceC0964a interfaceC0964a);

    View getView();

    void setAspectRatio(int i10);

    void setVideoRotation(int i10);
}
