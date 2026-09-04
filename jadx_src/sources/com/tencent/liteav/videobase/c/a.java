package com.tencent.liteav.videobase.c;

import android.opengl.GLES20;
import androidx.constraintlayout.core.motion.utils.w;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f100282j = {1.1644f, 1.1644f, 1.1644f, 0.0f, -0.3918f, 2.0172f, 1.596f, -0.813f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float[] f100283k = {1.0f, 1.0f, 1.0f, 0.0f, -0.3441f, 1.772f, 1.402f, -0.7141f, 0.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f100284l = {1.1644f, 1.1644f, 1.1644f, 0.0f, -0.2132f, 2.1124f, 1.7927f, -0.5329f, 0.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f100285m = {1.0f, 1.0f, 1.0f, 0.0f, -0.1873f, 1.8556f, 1.5748f, -0.4681f, 0.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float[] f100286n = {-0.0627451f, -0.5019608f, -0.5019608f};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float[] f100287o = {0.0f, -0.5019608f, -0.5019608f};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f100288p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f100289q;

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.c.a$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f100290a;

        static {
            int[] iArr = new int[GLConstants.ColorRange.values().length];
            f100290a = iArr;
            try {
                iArr[GLConstants.ColorRange.FULL_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100290a[GLConstants.ColorRange.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100290a[GLConstants.ColorRange.VIDEO_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public a(GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform sampler2D uvTexture;\nuniform mat3 convertMatrix;\nuniform vec3 offset;\n\nvoid main()\n{\n    highp vec3 yuvColor;\n    highp vec3 rgbColor;\n\n    // Get the YUV values\n    yuvColor.x = texture2D(inputImageTexture, textureCoordinate).r;\n    yuvColor.y = texture2D(uvTexture, vec2(textureCoordinate.x, textureCoordinate.y * 0.5)).r;\n    yuvColor.z = texture2D(uvTexture, vec2(textureCoordinate.x, textureCoordinate.y * 0.5 + 0.5)).r;\n\n    // Do the color transform\n    yuvColor += offset;\n    rgbColor = convertMatrix * yuvColor;\n\n    gl_FragColor = vec4(rgbColor, 1.0);\n}", colorRange, colorSpace);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    static /* synthetic */ void a(a aVar) {
        float[] fArr;
        GLES20.glUseProgram(aVar.f100222f);
        GLES20.glUniform3fv(aVar.f100289q, 1, AnonymousClass1.f100290a[aVar.f100293i.ordinal()] != 1 ? f100286n : f100287o, 0);
        int i10 = aVar.f100288p;
        GLConstants.ColorSpace colorSpace = aVar.f100292h;
        if (colorSpace == null || colorSpace == GLConstants.ColorSpace.UNKNOWN) {
            colorSpace = GLConstants.ColorSpace.BT601;
        }
        GLConstants.ColorRange colorRange = aVar.f100293i;
        if (colorRange == null || colorRange == GLConstants.ColorRange.UNKNOWN) {
            colorRange = GLConstants.ColorRange.VIDEO_RANGE;
        }
        if (colorSpace == GLConstants.ColorSpace.BT601) {
            if (colorRange == GLConstants.ColorRange.VIDEO_RANGE || colorRange != GLConstants.ColorRange.FULL_RANGE) {
                fArr = f100282j;
            } else {
                fArr = f100283k;
            }
        } else if (colorSpace != GLConstants.ColorSpace.BT709) {
            fArr = f100282j;
        } else if (colorRange == GLConstants.ColorRange.VIDEO_RANGE) {
            fArr = f100284l;
        } else if (colorRange == GLConstants.ColorRange.FULL_RANGE) {
            fArr = f100285m;
        } else {
            fArr = f100282j;
        }
        GLES20.glUniformMatrix3fv(i10, 1, false, fArr, 0);
    }

    @Override // com.tencent.liteav.videobase.c.e, com.tencent.liteav.videobase.a.a
    public final void b(com.tencent.liteav.videobase.frame.e eVar) {
        super.b(eVar);
        this.f100288p = GLES20.glGetUniformLocation(this.f100222f, "convertMatrix");
        this.f100289q = GLES20.glGetUniformLocation(this.f100222f, w.c.R);
        a(b.a(this));
    }

    @Override // com.tencent.liteav.videobase.c.e
    protected final int d() {
        return bb.c.f.PB;
    }
}
