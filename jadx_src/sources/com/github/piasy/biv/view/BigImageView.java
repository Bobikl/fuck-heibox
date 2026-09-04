package com.github.piasy.biv.view;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.annotation.i1;
import androidx.annotation.k1;
import androidx.annotation.z0;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.github.piasy.biv.R;
import com.github.piasy.biv.utils.ThreadedCallbacks;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class BigImageView extends FrameLayout implements k8.a.InterfaceC1122a {
    public static final int DEFAULT_IMAGE_SCALE_TYPE = 3;
    public static final ImageView.ScaleType[] IMAGE_SCALE_TYPES = {ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_XY};
    public static final int INIT_SCALE_TYPE_CENTER = 0;
    public static final int INIT_SCALE_TYPE_CENTER_CROP = 1;
    public static final int INIT_SCALE_TYPE_CENTER_INSIDE = 2;
    public static final int INIT_SCALE_TYPE_CUSTOM = 7;
    public static final int INIT_SCALE_TYPE_FIT_CENTER = 3;
    public static final int INIT_SCALE_TYPE_FIT_END = 4;
    public static final int INIT_SCALE_TYPE_FIT_START = 5;
    public static final int INIT_SCALE_TYPE_FIT_XY = 6;
    public static final int INIT_SCALE_TYPE_START = 8;
    private File mCurrentImageFile;
    private boolean mDelayMainImageForTransition;
    private com.github.piasy.biv.utils.a mDisplayOptimizeListener;
    private final View.OnClickListener mFailureImageClickListener;
    private ImageView.ScaleType mFailureImageScaleType;
    private ImageView mFailureImageView;
    private final k8.a mImageLoader;
    private com.github.piasy.biv.view.b mImageSaveCallback;
    private com.github.piasy.biv.view.c mImageShownCallback;
    private int mInitScaleType;
    private final k8.a.InterfaceC1122a mInternalCallback;
    private View mMainView;
    private View.OnClickListener mOnClickListener;
    private View.OnLongClickListener mOnLongClickListener;
    private boolean mOptimizeDisplay;
    private i8.a mProgressIndicator;
    private View mProgressIndicatorView;
    private SubsamplingScaleImageView mSSIV;
    private boolean mTapToRetry;
    private Uri mThumbnail;
    private ImageView.ScaleType mThumbnailScaleType;
    private View mThumbnailView;
    private final Handler mUiHandler;
    private Uri mUri;
    private k8.a.InterfaceC1122a mUserCallback;
    private d mViewFactory;

    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (BigImageView.this.mTapToRetry) {
                BigImageView bigImageView = BigImageView.this;
                bigImageView.showImage(bigImageView.mThumbnail, BigImageView.this.mUri);
            } else if (BigImageView.this.mOnClickListener != null) {
                BigImageView.this.mOnClickListener.onClick(view);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f43463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.github.piasy.biv.view.b f43464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f43465d;

        b(Throwable th2, com.github.piasy.biv.view.b bVar, String str) {
            this.f43463b = th2;
            this.f43464c = bVar;
            this.f43465d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f43463b;
            if (th2 != null) {
                this.f43464c.a(th2);
            } else {
                this.f43464c.onSuccess(this.f43465d);
            }
        }
    }

    public class c implements Animation.AnimationListener {

        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BigImageView.this.clearThumbnailAndProgressIndicator();
            }
        }

        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (BigImageView.this.mThumbnailView != null) {
                BigImageView.this.mThumbnailView.setVisibility(8);
            }
            if (BigImageView.this.mProgressIndicatorView != null) {
                BigImageView.this.mProgressIndicatorView.setVisibility(8);
            }
            if (BigImageView.this.mThumbnailView == null && BigImageView.this.mProgressIndicatorView == null) {
                return;
            }
            BigImageView.this.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public BigImageView(Context context) {
        this(context, null);
    }

    public BigImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BigImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mUiHandler = new Handler(Looper.getMainLooper());
        this.mDelayMainImageForTransition = false;
        this.mFailureImageClickListener = new a();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.f43336p, i10, 0);
        this.mInitScaleType = typedArrayObtainStyledAttributes.getInteger(R.styleable.BigImageView_initScaleType, 3);
        int i11 = R.styleable.BigImageView_failureImage;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.mFailureImageScaleType = scaleType(typedArrayObtainStyledAttributes.getInteger(R.styleable.BigImageView_failureImageInitScaleType, 3));
            setFailureImage(typedArrayObtainStyledAttributes.getDrawable(i11));
        }
        int i12 = R.styleable.BigImageView_thumbnailScaleType;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.mThumbnailScaleType = scaleType(typedArrayObtainStyledAttributes.getInteger(i12, 3));
        }
        this.mOptimizeDisplay = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BigImageView_optimizeDisplay, true);
        this.mTapToRetry = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BigImageView_tapToRetry, true);
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            this.mImageLoader = null;
        } else {
            this.mImageLoader = g8.a.a();
        }
        this.mInternalCallback = (k8.a.InterfaceC1122a) ThreadedCallbacks.create(k8.a.InterfaceC1122a.class, this);
        this.mViewFactory = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThumbnailAndProgressIndicator() {
        View view = this.mThumbnailView;
        if (view != null) {
            removeView(view);
            this.mThumbnailView = null;
        }
        View view2 = this.mProgressIndicatorView;
        if (view2 != null) {
            removeView(view2);
            this.mProgressIndicatorView = null;
        }
    }

    @i1
    private void doOnFinish() {
        if (!this.mOptimizeDisplay) {
            i8.a aVar = this.mProgressIndicator;
            if (aVar != null) {
                aVar.onFinish();
            }
            clearThumbnailAndProgressIndicator();
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setFillAfter(true);
        animationSet.addAnimation(alphaAnimation);
        View view = this.mThumbnailView;
        if (view != null) {
            view.setAnimation(animationSet);
        }
        View view2 = this.mProgressIndicatorView;
        if (view2 != null) {
            view2.setAnimation(animationSet);
        }
        i8.a aVar2 = this.mProgressIndicator;
        if (aVar2 != null) {
            aVar2.onFinish();
        }
        alphaAnimation.setAnimationListener(new c());
    }

    @i1
    private void doShowImage(int i10, File file, boolean z10) {
        if (z10) {
            View view = this.mThumbnailView;
            if (view != null) {
                removeView(view);
            }
            View viewD = this.mViewFactory.d(getContext(), this.mThumbnailScaleType, false);
            this.mThumbnailView = viewD;
            if (viewD != null) {
                addView(viewD, -1, -1);
                this.mThumbnailView.setOnClickListener(this.mOnClickListener);
                this.mThumbnailView.setOnLongClickListener(this.mOnLongClickListener);
                View view2 = this.mThumbnailView;
                if (view2 instanceof ImageView) {
                    this.mViewFactory.i(view2, file);
                    com.github.piasy.biv.view.c cVar = this.mImageShownCallback;
                    if (cVar != null) {
                        cVar.b();
                    }
                }
            }
        } else {
            View view3 = this.mMainView;
            if (view3 != null) {
                removeView(view3);
            }
            View viewB = this.mViewFactory.b(getContext(), i10, this.mInitScaleType);
            this.mMainView = viewB;
            if (viewB == null) {
                onFail(new RuntimeException("Image type not supported: " + l8.a.e(i10)));
                return;
            }
            addView(viewB, -1, -1);
            this.mMainView.setOnClickListener(this.mOnClickListener);
            this.mMainView.setOnLongClickListener(this.mOnLongClickListener);
            View view4 = this.mMainView;
            if (view4 instanceof SubsamplingScaleImageView) {
                SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) view4;
                this.mSSIV = subsamplingScaleImageView;
                subsamplingScaleImageView.setMinimumTileDpi(160);
                setOptimizeDisplay(this.mOptimizeDisplay);
                setInitScaleType(this.mInitScaleType);
            }
            if (this.mViewFactory.e(i10)) {
                this.mViewFactory.f(this.mMainView, i10, file);
            } else {
                this.mViewFactory.g(this.mMainView, Uri.fromFile(file));
            }
            com.github.piasy.biv.view.c cVar2 = this.mImageShownCallback;
            if (cVar2 != null) {
                cVar2.a();
            }
        }
        ImageView imageView = this.mFailureImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @k1
    private void fireSaveImageCallback(String str, Throwable th2) {
        com.github.piasy.biv.view.b bVar = this.mImageSaveCallback;
        if (bVar != null) {
            this.mUiHandler.post(new b(th2, bVar, str));
        }
    }

    public static ImageView.ScaleType scaleType(int i10) {
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = IMAGE_SCALE_TYPES;
            if (i10 < scaleTypeArr.length) {
                return scaleTypeArr[i10];
            }
        }
        return IMAGE_SCALE_TYPES[3];
    }

    @i1
    private void showFailImage() {
        if (this.mFailureImageView == null) {
            return;
        }
        View view = this.mMainView;
        if (view != null) {
            removeView(view);
        }
        this.mFailureImageView.setVisibility(0);
        clearThumbnailAndProgressIndicator();
    }

    public void cancel() {
        this.mImageLoader.b(hashCode());
    }

    public File getCurrentImageFile() {
        return this.mCurrentImageFile;
    }

    public View getMainView() {
        return this.mMainView;
    }

    public SubsamplingScaleImageView getSSIV() {
        return this.mSSIV;
    }

    public void loadMainImageNow() {
        this.mDelayMainImageForTransition = false;
        this.mImageLoader.a(hashCode(), this.mUri, this.mInternalCallback);
    }

    @Override // k8.a.InterfaceC1122a
    public void onCacheHit(int i10, File file) {
        this.mCurrentImageFile = file;
        doShowImage(i10, file, this.mDelayMainImageForTransition);
        k8.a.InterfaceC1122a interfaceC1122a = this.mUserCallback;
        if (interfaceC1122a != null) {
            interfaceC1122a.onCacheHit(i10, file);
        }
    }

    @Override // k8.a.InterfaceC1122a
    public void onCacheMiss(int i10, File file) {
        this.mCurrentImageFile = file;
        doShowImage(i10, file, this.mDelayMainImageForTransition);
        k8.a.InterfaceC1122a interfaceC1122a = this.mUserCallback;
        if (interfaceC1122a != null) {
            interfaceC1122a.onCacheMiss(i10, file);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancel();
    }

    @Override // k8.a.InterfaceC1122a
    public void onFail(Exception exc) {
        showFailImage();
        k8.a.InterfaceC1122a interfaceC1122a = this.mUserCallback;
        if (interfaceC1122a != null) {
            interfaceC1122a.onFail(exc);
        }
    }

    @Override // k8.a.InterfaceC1122a
    public void onFinish() {
        doOnFinish();
        k8.a.InterfaceC1122a interfaceC1122a = this.mUserCallback;
        if (interfaceC1122a != null) {
            interfaceC1122a.onFinish();
        }
    }

    @Override // k8.a.InterfaceC1122a
    public void onProgress(int i10) {
        i8.a aVar = this.mProgressIndicator;
        if (aVar != null) {
            aVar.onProgress(i10);
        }
        k8.a.InterfaceC1122a interfaceC1122a = this.mUserCallback;
        if (interfaceC1122a != null) {
            interfaceC1122a.onProgress(i10);
        }
    }

    @Override // k8.a.InterfaceC1122a
    public void onStart() {
        if (this.mThumbnail != Uri.EMPTY) {
            View viewD = this.mViewFactory.d(getContext(), this.mThumbnailScaleType, true);
            this.mThumbnailView = viewD;
            this.mViewFactory.h(viewD, this.mThumbnail);
            View view = this.mThumbnailView;
            if (view != null) {
                addView(view, -1, -1);
            }
        }
        i8.a aVar = this.mProgressIndicator;
        if (aVar != null) {
            this.mProgressIndicatorView = aVar.a(this);
            this.mProgressIndicator.onStart();
            View view2 = this.mProgressIndicatorView;
            if (view2 != null) {
                addView(view2);
            }
        }
        k8.a.InterfaceC1122a interfaceC1122a = this.mUserCallback;
        if (interfaceC1122a != null) {
            interfaceC1122a.onStart();
        }
    }

    @Override // k8.a.InterfaceC1122a
    public void onSuccess(File file) {
        k8.a.InterfaceC1122a interfaceC1122a = this.mUserCallback;
        if (interfaceC1122a != null) {
            interfaceC1122a.onSuccess(file);
        }
    }

    @k1
    @z0("android.permission.WRITE_EXTERNAL_STORAGE")
    public void saveImageIntoGallery() throws Throwable {
        OutputStream outputStreamOpenOutputStream;
        Uri uriInsert;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (this.mCurrentImageFile == null) {
            fireSaveImageCallback(null, new IllegalStateException("image not downloaded yet"));
            return;
        }
        if (Build.VERSION.SDK_INT < 29) {
            try {
                fireSaveImageCallback(MediaStore.Images.Media.insertImage(getContext().getContentResolver(), this.mCurrentImageFile.getAbsolutePath(), this.mCurrentImageFile.getName(), ""), null);
                return;
            } catch (IOException e10) {
                fireSaveImageCallback(null, e10);
                return;
            }
        }
        boolean z10 = false;
        try {
            try {
                ContentResolver contentResolver = getContext().getContentResolver();
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", this.mCurrentImageFile.getName());
                contentValues.put("mime_type", "image/jpg");
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                try {
                    if (uriInsert != null) {
                        outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                        try {
                            fileInputStream = new FileInputStream(this.mCurrentImageFile);
                            try {
                                try {
                                    com.github.piasy.biv.utils.b.d(fileInputStream, outputStreamOpenOutputStream);
                                    z10 = true;
                                } catch (IOException e11) {
                                    e = e11;
                                    fireSaveImageCallback(null, e);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream2 = fileInputStream;
                                com.github.piasy.biv.utils.b.b(fileInputStream2);
                                com.github.piasy.biv.utils.b.c(outputStreamOpenOutputStream);
                                throw th;
                            }
                        } catch (IOException e12) {
                            e = e12;
                            fileInputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            com.github.piasy.biv.utils.b.b(fileInputStream2);
                            com.github.piasy.biv.utils.b.c(outputStreamOpenOutputStream);
                            throw th;
                        }
                    } else {
                        fireSaveImageCallback(null, new RuntimeException("saveImageIntoGallery fail: insert to MediaStore error"));
                        outputStreamOpenOutputStream = null;
                        fileInputStream = null;
                    }
                } catch (IOException e13) {
                    e = e13;
                    outputStreamOpenOutputStream = null;
                    fileInputStream = null;
                }
            } catch (IOException e14) {
                e = e14;
                outputStreamOpenOutputStream = null;
                uriInsert = null;
                fileInputStream = null;
            }
            com.github.piasy.biv.utils.b.b(fileInputStream);
            com.github.piasy.biv.utils.b.c(outputStreamOpenOutputStream);
            if (z10) {
                fireSaveImageCallback(uriInsert.toString(), null);
            }
        } catch (Throwable th4) {
            th = th4;
            outputStreamOpenOutputStream = null;
        }
    }

    public void setFailureImage(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (this.mFailureImageView == null) {
            ImageView imageView = new ImageView(getContext());
            this.mFailureImageView = imageView;
            imageView.setVisibility(8);
            this.mFailureImageView.setOnClickListener(this.mFailureImageClickListener);
            ImageView.ScaleType scaleType = this.mFailureImageScaleType;
            if (scaleType != null) {
                this.mFailureImageView.setScaleType(scaleType);
            }
            addView(this.mFailureImageView);
        }
        this.mFailureImageView.setImageDrawable(drawable);
    }

    public void setFailureImageInitScaleType(ImageView.ScaleType scaleType) {
        this.mFailureImageScaleType = scaleType;
    }

    public void setImageLoaderCallback(k8.a.InterfaceC1122a interfaceC1122a) {
        this.mUserCallback = interfaceC1122a;
    }

    public void setImageSaveCallback(com.github.piasy.biv.view.b bVar) {
        this.mImageSaveCallback = bVar;
    }

    public void setImageShownCallback(com.github.piasy.biv.view.c cVar) {
        this.mImageShownCallback = cVar;
    }

    public void setImageViewFactory(d dVar) {
        if (dVar == null) {
            return;
        }
        this.mViewFactory = dVar;
    }

    public void setInitScaleType(int i10) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.mSSIV;
        if (subsamplingScaleImageView == null) {
            return;
        }
        this.mInitScaleType = i10;
        if (i10 == 1) {
            subsamplingScaleImageView.setMinimumScaleType(2);
        } else if (i10 == 7) {
            subsamplingScaleImageView.setMinimumScaleType(3);
        } else if (i10 != 8) {
            subsamplingScaleImageView.setMinimumScaleType(1);
        } else {
            subsamplingScaleImageView.setMinimumScaleType(4);
        }
        com.github.piasy.biv.utils.a aVar = this.mDisplayOptimizeListener;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
        View view = this.mMainView;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mOnLongClickListener = onLongClickListener;
        View view = this.mMainView;
        if (view != null) {
            view.setOnLongClickListener(onLongClickListener);
        }
    }

    public void setOptimizeDisplay(boolean z10) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.mSSIV;
        if (subsamplingScaleImageView == null) {
            return;
        }
        this.mOptimizeDisplay = z10;
        if (!z10) {
            this.mDisplayOptimizeListener = null;
            subsamplingScaleImageView.setOnImageEventListener(null);
        } else {
            com.github.piasy.biv.utils.a aVar = new com.github.piasy.biv.utils.a(subsamplingScaleImageView);
            this.mDisplayOptimizeListener = aVar;
            this.mSSIV.setOnImageEventListener(aVar);
        }
    }

    public void setProgressIndicator(i8.a aVar) {
        this.mProgressIndicator = aVar;
    }

    public void setTapToRetry(boolean z10) {
        this.mTapToRetry = z10;
    }

    public void setThumbnailScaleType(ImageView.ScaleType scaleType) {
        this.mThumbnailScaleType = scaleType;
    }

    public void showImage(Uri uri) {
        showImage(Uri.EMPTY, uri);
    }

    public void showImage(Uri uri, Uri uri2) {
        showImage(uri, uri2, false);
    }

    public void showImage(Uri uri, Uri uri2, boolean z10) {
        this.mThumbnail = uri;
        this.mUri = uri2;
        clearThumbnailAndProgressIndicator();
        this.mDelayMainImageForTransition = z10;
        if (z10) {
            g8.a.c(uri2);
            this.mImageLoader.a(hashCode(), uri, this.mInternalCallback);
        } else {
            this.mImageLoader.a(hashCode(), uri2, this.mInternalCallback);
        }
        ImageView imageView = this.mFailureImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }
}
