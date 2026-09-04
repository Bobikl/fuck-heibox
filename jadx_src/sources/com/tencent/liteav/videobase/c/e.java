package com.tencent.liteav.videobase.c;

import android.opengl.GLES20;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends com.tencent.liteav.videobase.a.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final GLConstants.ColorSpace f100292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final GLConstants.ColorRange f100293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f100294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f100295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f100296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f100297m;

    public e(String str, String str2) {
        this(str, str2, GLConstants.ColorRange.VIDEO_RANGE, GLConstants.ColorSpace.BT601);
    }

    public e(String str, String str2, GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        super(str, str2);
        int[] iArr = new int[2];
        this.f100295k = iArr;
        this.f100296l = 0;
        this.f100297m = 0;
        Arrays.fill(iArr, -1);
        this.f100292h = colorSpace == GLConstants.ColorSpace.UNKNOWN ? GLConstants.ColorSpace.BT601 : colorSpace;
        this.f100293i = colorRange == GLConstants.ColorRange.UNKNOWN ? GLConstants.ColorRange.VIDEO_RANGE : colorRange;
    }

    private void e() {
        int i10 = 0;
        while (true) {
            int[] iArr = this.f100295k;
            if (i10 >= iArr.length) {
                return;
            }
            OpenGlUtils.deleteTexture(iArr[i10]);
            this.f100295k[i10] = -1;
            i10++;
        }
    }

    @Override // com.tencent.liteav.videobase.a.a
    public final void a(int i10) {
        super.a(i10);
        GLES20.glActiveTexture(33985);
        OpenGlUtils.bindTexture(a(), this.f100295k[1]);
        GLES20.glUniform1i(this.f100294j, 1);
    }

    @Override // com.tencent.liteav.videobase.a.a
    public final void a(int i10, com.tencent.liteav.videobase.frame.d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        super.a(this.f100295k[0], dVar, floatBuffer, floatBuffer2);
    }

    public final void a(ByteBuffer byteBuffer, int i10, int i11) {
        if (this.f100296l != i10 || this.f100297m != i11) {
            e();
            this.f100296l = i10;
            this.f100297m = i11;
        }
        OpenGlUtils.loadYuv420DataToTextures(byteBuffer, d(), i10, i11, this.f100295k);
    }

    @Override // com.tencent.liteav.videobase.a.a
    public void b(com.tencent.liteav.videobase.frame.e eVar) {
        super.b(eVar);
        this.f100294j = GLES20.glGetUniformLocation(this.f100222f, "uvTexture");
    }

    @Override // com.tencent.liteav.videobase.a.a
    public final void c() {
        e();
        super.c();
    }

    protected abstract int d();
}
