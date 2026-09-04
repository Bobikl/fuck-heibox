package com.tencent.thumbplayer.tcmedia.core.player;

/* JADX INFO: loaded from: classes4.dex */
public class TPNativePlayerSurfaceRenderInfo {
    public int displayWidth = -1;
    public int displayHeight = -1;
    public TPVideoCropInfo videoCropInfo = null;

    public static class TPVideoCropInfo {
        public int width = -1;
        public int height = -1;
        public int cropLeft = -1;
        public int cropRight = -1;
        public int cropTop = -1;
        public int cropBottom = -1;

        public String toString() {
            return "width:" + this.width + ", height:" + this.height + ", cropLeft:" + this.cropLeft + ", cropRight:" + this.cropRight + ", cropTop:" + this.cropTop + ", cropBottom:" + this.cropBottom;
        }
    }
}
