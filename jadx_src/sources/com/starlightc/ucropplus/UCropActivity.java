package com.starlightc.ucropplus;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.d0;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.v;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.d;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.callback.BitmapCropCallback;
import com.starlightc.ucropplus.model.AspectRatio;
import com.starlightc.ucropplus.util.SelectedStateListDrawable;
import com.starlightc.ucropplus.view.GestureCropImageView;
import com.starlightc.ucropplus.view.OverlayView;
import com.starlightc.ucropplus.view.TransformImageView;
import com.starlightc.ucropplus.view.UCropView;
import com.starlightc.ucropplus.view.widget.AspectRatioTextView;
import com.starlightc.ucropplus.view.widget.HorizontalProgressWheelView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class UCropActivity extends AppCompatActivity {
    public static final int ALL = 3;
    private static final long CONTROLS_ANIMATION_DURATION = 50;
    public static final Bitmap.CompressFormat DEFAULT_COMPRESS_FORMAT = Bitmap.CompressFormat.JPEG;
    public static final int DEFAULT_COMPRESS_QUALITY = 90;
    public static final int NONE = 0;
    public static final int ROTATE = 2;
    private static final int ROTATE_WIDGET_SENSITIVITY_COEFFICIENT = 42;
    public static final int SCALE = 1;
    private static final int SCALE_WIDGET_SENSITIVITY_COEFFICIENT = 15000;
    private static final int TABS_COUNT = 3;
    private static final String TAG = "UCropActivity";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mActiveControlsWidgetColor;
    private View mBlockingView;
    private Transition mControlsTransition;
    private GestureCropImageView mGestureCropImageView;
    private ViewGroup mLayoutAspectRatio;
    private ViewGroup mLayoutRotate;
    private ViewGroup mLayoutScale;
    private int mLogoColor;
    private OverlayView mOverlayView;

    @l
    private int mRootViewBackgroundColor;
    private boolean mShowBottomControls;
    private int mStatusBarColor;
    private TextView mTextViewRotateAngle;
    private TextView mTextViewScalePercent;

    @v
    private int mToolbarCancelDrawable;
    private int mToolbarColor;

    @v
    private int mToolbarCropDrawable;
    private String mToolbarTitle;
    private int mToolbarWidgetColor;
    private UCropView mUCropView;
    private ViewGroup mWrapperStateAspectRatio;
    private ViewGroup mWrapperStateRotate;
    private ViewGroup mWrapperStateScale;
    private boolean mShowLoader = true;
    private List<ViewGroup> mCropAspectRatioViews = new ArrayList();
    private Bitmap.CompressFormat mCompressFormat = DEFAULT_COMPRESS_FORMAT;
    private int mCompressQuality = 90;
    private int[] mAllowedGestures = {1, 2, 3};
    private TransformImageView.TransformImageListener mImageListener = new TransformImageView.TransformImageListener() { // from class: com.starlightc.ucropplus.UCropActivity.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.starlightc.ucropplus.view.TransformImageView.TransformImageListener
        public void onLoadComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49842, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            UCropActivity.this.mUCropView.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.mBlockingView.setClickable(false);
            UCropActivity.this.mShowLoader = false;
            UCropActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // com.starlightc.ucropplus.view.TransformImageView.TransformImageListener
        public void onLoadFailure(@n0 Exception exc) {
            if (PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 49843, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                return;
            }
            UCropActivity.this.setResultError(exc);
            UCropActivity.this.finish();
        }

        @Override // com.starlightc.ucropplus.view.TransformImageView.TransformImageListener
        public void onRotate(float f10) {
            if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 49840, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            UCropActivity.access$000(UCropActivity.this, f10);
        }

        @Override // com.starlightc.ucropplus.view.TransformImageView.TransformImageListener
        public void onScale(float f10) {
            if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 49841, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            UCropActivity.access$100(UCropActivity.this, f10);
        }
    };
    private final View.OnClickListener mStateClickListener = new View.OnClickListener() { // from class: com.starlightc.ucropplus.UCropActivity.7
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49853, new Class[]{View.class}, Void.TYPE).isSupported || view.isSelected()) {
                return;
            }
            UCropActivity.access$900(UCropActivity.this, view.getId());
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    public @interface GestureTypes {
    }

    static {
        e.J(true);
    }

    static /* synthetic */ void access$000(UCropActivity uCropActivity, float f10) {
        if (PatchProxy.proxy(new Object[]{uCropActivity, new Float(f10)}, null, changeQuickRedirect, true, 49835, new Class[]{UCropActivity.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        uCropActivity.setAngleText(f10);
    }

    static /* synthetic */ void access$100(UCropActivity uCropActivity, float f10) {
        if (PatchProxy.proxy(new Object[]{uCropActivity, new Float(f10)}, null, changeQuickRedirect, true, 49836, new Class[]{UCropActivity.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        uCropActivity.setScaleText(f10);
    }

    static /* synthetic */ void access$700(UCropActivity uCropActivity) {
        if (PatchProxy.proxy(new Object[]{uCropActivity}, null, changeQuickRedirect, true, 49837, new Class[]{UCropActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        uCropActivity.resetRotation();
    }

    static /* synthetic */ void access$800(UCropActivity uCropActivity, int i10) {
        if (PatchProxy.proxy(new Object[]{uCropActivity, new Integer(i10)}, null, changeQuickRedirect, true, 49838, new Class[]{UCropActivity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        uCropActivity.rotateByAngle(i10);
    }

    static /* synthetic */ void access$900(UCropActivity uCropActivity, int i10) {
        if (PatchProxy.proxy(new Object[]{uCropActivity, new Integer(i10)}, null, changeQuickRedirect, true, 49839, new Class[]{UCropActivity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        uCropActivity.setWidgetState(i10);
    }

    private void addBlockingView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49831, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.mBlockingView == null) {
            this.mBlockingView = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, R.id.toolbar);
            this.mBlockingView.setLayoutParams(layoutParams);
            this.mBlockingView.setClickable(true);
        }
        ((RelativeLayout) findViewById(R.id.ucrop_photobox)).addView(this.mBlockingView);
    }

    private void changeSelectedTab(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49829, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        androidx.transition.v.b((ViewGroup) findViewById(R.id.ucrop_photobox), this.mControlsTransition);
        this.mWrapperStateScale.findViewById(R.id.text_view_scale).setVisibility(i10 == R.id.state_scale ? 0 : 8);
        this.mWrapperStateAspectRatio.findViewById(R.id.text_view_crop).setVisibility(i10 == R.id.state_aspect_ratio ? 0 : 8);
        this.mWrapperStateRotate.findViewById(R.id.text_view_rotate).setVisibility(i10 != R.id.state_rotate ? 8 : 0);
    }

    private void initiateRootViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49815, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UCropView uCropView = (UCropView) findViewById(R.id.ucrop);
        this.mUCropView = uCropView;
        this.mGestureCropImageView = uCropView.getCropImageView();
        this.mOverlayView = this.mUCropView.getOverlayView();
        this.mGestureCropImageView.setTransformImageListener(this.mImageListener);
        ((ImageView) findViewById(R.id.image_view_logo)).setColorFilter(this.mLogoColor, PorterDuff.Mode.SRC_ATOP);
        int i10 = R.id.ucrop_frame;
        findViewById(i10).setBackgroundColor(this.mRootViewBackgroundColor);
        if (this.mShowBottomControls) {
            return;
        }
        ((RelativeLayout.LayoutParams) findViewById(i10).getLayoutParams()).bottomMargin = 0;
        findViewById(i10).requestLayout();
    }

    private void processOptions(@n0 Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 49812, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        String stringExtra = intent.getStringExtra(UCrop.Options.EXTRA_COMPRESSION_FORMAT_NAME);
        Bitmap.CompressFormat compressFormatValueOf = TextUtils.isEmpty(stringExtra) ? null : Bitmap.CompressFormat.valueOf(stringExtra);
        if (compressFormatValueOf == null) {
            compressFormatValueOf = DEFAULT_COMPRESS_FORMAT;
        }
        this.mCompressFormat = compressFormatValueOf;
        this.mCompressQuality = intent.getIntExtra(UCrop.Options.EXTRA_COMPRESSION_QUALITY, 90);
        int[] intArrayExtra = intent.getIntArrayExtra(UCrop.Options.EXTRA_ALLOWED_GESTURES);
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.mAllowedGestures = intArrayExtra;
        }
        this.mGestureCropImageView.setMaxBitmapSize(intent.getIntExtra(UCrop.Options.EXTRA_MAX_BITMAP_SIZE, 0));
        this.mGestureCropImageView.setMaxScaleMultiplier(intent.getFloatExtra(UCrop.Options.EXTRA_MAX_SCALE_MULTIPLIER, 10.0f));
        this.mGestureCropImageView.setImageToWrapCropBoundsAnimDuration(intent.getIntExtra(UCrop.Options.EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, 500));
        this.mOverlayView.setFreestyleCropEnabled(intent.getBooleanExtra(UCrop.Options.EXTRA_FREE_STYLE_CROP, false));
        this.mOverlayView.setDimmedColor(intent.getIntExtra(UCrop.Options.EXTRA_DIMMED_LAYER_COLOR, getResources().getColor(R.color.ucrop_color_default_dimmed)));
        this.mOverlayView.setCircleDimmedLayer(intent.getBooleanExtra(UCrop.Options.EXTRA_CIRCLE_DIMMED_LAYER, false));
        this.mOverlayView.setShowCropFrame(intent.getBooleanExtra(UCrop.Options.EXTRA_SHOW_CROP_FRAME, true));
        this.mOverlayView.setCropFrameColor(intent.getIntExtra(UCrop.Options.EXTRA_CROP_FRAME_COLOR, getResources().getColor(R.color.ucrop_color_default_crop_frame)));
        this.mOverlayView.setCropFrameStrokeWidth(intent.getIntExtra(UCrop.Options.EXTRA_CROP_FRAME_STROKE_WIDTH, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width)));
        this.mOverlayView.setShowCropGrid(intent.getBooleanExtra(UCrop.Options.EXTRA_SHOW_CROP_GRID, true));
        this.mOverlayView.setCropGridRowCount(intent.getIntExtra(UCrop.Options.EXTRA_CROP_GRID_ROW_COUNT, 2));
        this.mOverlayView.setCropGridColumnCount(intent.getIntExtra(UCrop.Options.EXTRA_CROP_GRID_COLUMN_COUNT, 2));
        this.mOverlayView.setCropGridColor(intent.getIntExtra(UCrop.Options.EXTRA_CROP_GRID_COLOR, getResources().getColor(R.color.ucrop_color_default_crop_grid)));
        this.mOverlayView.setCropGridStrokeWidth(intent.getIntExtra(UCrop.Options.EXTRA_CROP_GRID_STROKE_WIDTH, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width)));
        float floatExtra = intent.getFloatExtra(UCrop.EXTRA_ASPECT_RATIO_X, -1.0f);
        float floatExtra2 = intent.getFloatExtra(UCrop.EXTRA_ASPECT_RATIO_Y, -1.0f);
        int intExtra = intent.getIntExtra(UCrop.Options.EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(UCrop.Options.EXTRA_ASPECT_RATIO_OPTIONS);
        if (floatExtra >= 0.0f && floatExtra2 >= 0.0f) {
            ViewGroup viewGroup = this.mWrapperStateAspectRatio;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            float f10 = floatExtra / floatExtra2;
            this.mGestureCropImageView.setTargetAspectRatio(Float.isNaN(f10) ? 0.0f : f10);
        } else if (parcelableArrayListExtra == null || intExtra >= parcelableArrayListExtra.size()) {
            this.mGestureCropImageView.setTargetAspectRatio(0.0f);
        } else {
            float aspectRatioX = ((AspectRatio) parcelableArrayListExtra.get(intExtra)).getAspectRatioX() / ((AspectRatio) parcelableArrayListExtra.get(intExtra)).getAspectRatioY();
            this.mGestureCropImageView.setTargetAspectRatio(Float.isNaN(aspectRatioX) ? 0.0f : aspectRatioX);
        }
        int intExtra2 = intent.getIntExtra(UCrop.EXTRA_MAX_SIZE_X, 0);
        int intExtra3 = intent.getIntExtra(UCrop.EXTRA_MAX_SIZE_Y, 0);
        if (intExtra2 <= 0 || intExtra3 <= 0) {
            return;
        }
        this.mGestureCropImageView.setMaxResultImageSizeX(intExtra2);
        this.mGestureCropImageView.setMaxResultImageSizeY(intExtra3);
    }

    private void resetRotation() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49825, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GestureCropImageView gestureCropImageView = this.mGestureCropImageView;
        gestureCropImageView.postRotate(-gestureCropImageView.getCurrentAngle());
        this.mGestureCropImageView.setImageToWrapCropBounds();
    }

    private void rotateByAngle(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49826, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mGestureCropImageView.postRotate(i10);
        this.mGestureCropImageView.setImageToWrapCropBounds();
    }

    private void setAllowedGestures(int i10) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49830, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        GestureCropImageView gestureCropImageView = this.mGestureCropImageView;
        int i11 = this.mAllowedGestures[i10];
        gestureCropImageView.setScaleEnabled(i11 == 3 || i11 == 1);
        GestureCropImageView gestureCropImageView2 = this.mGestureCropImageView;
        int i12 = this.mAllowedGestures[i10];
        if (i12 != 3 && i12 != 2) {
            z10 = false;
        }
        gestureCropImageView2.setRotateEnabled(z10);
    }

    private void setAngleText(float f10) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 49821, new Class[]{Float.TYPE}, Void.TYPE).isSupported || (textView = this.mTextViewRotateAngle) == null) {
            return;
        }
        textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f10)));
    }

    private void setAngleTextColor(int i10) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49822, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (textView = this.mTextViewRotateAngle) == null) {
            return;
        }
        textView.setTextColor(i10);
    }

    private void setImageData(@n0 Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 49811, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        Uri uri = (Uri) intent.getParcelableExtra(UCrop.EXTRA_INPUT_URI);
        Uri uri2 = (Uri) intent.getParcelableExtra(UCrop.EXTRA_OUTPUT_URI);
        processOptions(intent);
        if (uri == null || uri2 == null) {
            setResultError(new NullPointerException(getString(R.string.ucrop_error_input_data_is_absent)));
            finish();
            return;
        }
        try {
            this.mGestureCropImageView.setImageUri(uri, uri2);
        } catch (Exception e10) {
            setResultError(e10);
            finish();
        }
    }

    private void setInitialState() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49827, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.mShowBottomControls) {
            setAllowedGestures(0);
        } else if (this.mWrapperStateAspectRatio.getVisibility() == 0) {
            setWidgetState(R.id.state_aspect_ratio);
        } else {
            setWidgetState(R.id.state_scale);
        }
    }

    private void setScaleText(float f10) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 49823, new Class[]{Float.TYPE}, Void.TYPE).isSupported || (textView = this.mTextViewScalePercent) == null) {
            return;
        }
        textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f10 * 100.0f))));
    }

    private void setScaleTextColor(int i10) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49824, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (textView = this.mTextViewScalePercent) == null) {
            return;
        }
        textView.setTextColor(i10);
    }

    @TargetApi(21)
    private void setStatusBarColor(@l int i10) {
        Window window;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49817, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (window = getWindow()) == null) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i10);
    }

    private void setWidgetState(@d0 int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49828, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && this.mShowBottomControls) {
            ViewGroup viewGroup = this.mWrapperStateAspectRatio;
            int i11 = R.id.state_aspect_ratio;
            viewGroup.setSelected(i10 == i11);
            ViewGroup viewGroup2 = this.mWrapperStateRotate;
            int i12 = R.id.state_rotate;
            viewGroup2.setSelected(i10 == i12);
            ViewGroup viewGroup3 = this.mWrapperStateScale;
            int i13 = R.id.state_scale;
            viewGroup3.setSelected(i10 == i13);
            this.mLayoutAspectRatio.setVisibility(i10 == i11 ? 0 : 8);
            this.mLayoutRotate.setVisibility(i10 == i12 ? 0 : 8);
            this.mLayoutScale.setVisibility(i10 == i13 ? 0 : 8);
            changeSelectedTab(i10);
            if (i10 == i13) {
                setAllowedGestures(0);
            } else if (i10 == i12) {
                setAllowedGestures(1);
            } else {
                setAllowedGestures(2);
            }
        }
    }

    private void setupAppBar() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49814, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setStatusBarColor(this.mStatusBarColor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(this.mToolbarColor);
        toolbar.setTitleTextColor(this.mToolbarWidgetColor);
        TextView textView = (TextView) toolbar.findViewById(R.id.toolbar_title);
        textView.setTextColor(this.mToolbarWidgetColor);
        textView.setText(this.mToolbarTitle);
        Drawable drawableMutate = d.i(this, this.mToolbarCancelDrawable).mutate();
        drawableMutate.setColorFilter(this.mToolbarWidgetColor, PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(drawableMutate);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.c0(false);
        }
    }

    private void setupAspectRatioWidget(@n0 Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 49818, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        int intExtra = intent.getIntExtra(UCrop.Options.EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, 0);
        ArrayList<AspectRatio> parcelableArrayListExtra = intent.getParcelableArrayListExtra(UCrop.Options.EXTRA_ASPECT_RATIO_OPTIONS);
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            intExtra = 2;
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new AspectRatio(null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new AspectRatio(null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new AspectRatio(getString(R.string.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new AspectRatio(null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new AspectRatio(null, 16.0f, 9.0f));
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        for (AspectRatio aspectRatio : parcelableArrayListExtra) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(R.layout.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.mActiveControlsWidgetColor);
            aspectRatioTextView.setAspectRatio(aspectRatio);
            linearLayout.addView(frameLayout);
            this.mCropAspectRatioViews.add(frameLayout);
        }
        this.mCropAspectRatioViews.get(intExtra).setSelected(true);
        Iterator<ViewGroup> it = this.mCropAspectRatioViews.iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.UCropActivity.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49844, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    UCropActivity.this.mGestureCropImageView.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).getAspectRatio(view.isSelected()));
                    UCropActivity.this.mGestureCropImageView.setImageToWrapCropBounds();
                    if (view.isSelected()) {
                        return;
                    }
                    for (ViewGroup viewGroup : UCropActivity.this.mCropAspectRatioViews) {
                        viewGroup.setSelected(viewGroup == view);
                    }
                }
            });
        }
    }

    private void setupRotateWidget() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49819, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mTextViewRotateAngle = (TextView) findViewById(R.id.text_view_rotate);
        int i10 = R.id.rotate_scroll_wheel;
        ((HorizontalProgressWheelView) findViewById(i10)).setScrollingListener(new HorizontalProgressWheelView.ScrollingListener() { // from class: com.starlightc.ucropplus.UCropActivity.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.starlightc.ucropplus.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScroll(float f10, float f11) {
                Object[] objArr = {new Float(f10), new Float(f11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Float.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49845, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                UCropActivity.this.mGestureCropImageView.postRotate(f10 / 42.0f);
            }

            @Override // com.starlightc.ucropplus.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollEnd() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49846, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                UCropActivity.this.mGestureCropImageView.setImageToWrapCropBounds();
            }

            @Override // com.starlightc.ucropplus.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollStart() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49847, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                UCropActivity.this.mGestureCropImageView.cancelAllAnimations();
            }
        });
        ((HorizontalProgressWheelView) findViewById(i10)).setMiddleLineColor(this.mActiveControlsWidgetColor);
        findViewById(R.id.wrapper_reset_rotate).setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.UCropActivity.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49848, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                UCropActivity.access$700(UCropActivity.this);
            }
        });
        findViewById(R.id.wrapper_rotate_by_angle).setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.UCropActivity.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49849, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                UCropActivity.access$800(UCropActivity.this, 90);
            }
        });
        setAngleTextColor(this.mActiveControlsWidgetColor);
    }

    private void setupScaleWidget() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49820, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mTextViewScalePercent = (TextView) findViewById(R.id.text_view_scale);
        int i10 = R.id.scale_scroll_wheel;
        ((HorizontalProgressWheelView) findViewById(i10)).setScrollingListener(new HorizontalProgressWheelView.ScrollingListener() { // from class: com.starlightc.ucropplus.UCropActivity.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.starlightc.ucropplus.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScroll(float f10, float f11) {
                Object[] objArr = {new Float(f10), new Float(f11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Float.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49850, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                if (f10 > 0.0f) {
                    UCropActivity.this.mGestureCropImageView.zoomInImage(UCropActivity.this.mGestureCropImageView.getCurrentScale() + (f10 * ((UCropActivity.this.mGestureCropImageView.getMaxScale() - UCropActivity.this.mGestureCropImageView.getMinScale()) / 15000.0f)));
                } else {
                    UCropActivity.this.mGestureCropImageView.zoomOutImage(UCropActivity.this.mGestureCropImageView.getCurrentScale() + (f10 * ((UCropActivity.this.mGestureCropImageView.getMaxScale() - UCropActivity.this.mGestureCropImageView.getMinScale()) / 15000.0f)));
                }
            }

            @Override // com.starlightc.ucropplus.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollEnd() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49851, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                UCropActivity.this.mGestureCropImageView.setImageToWrapCropBounds();
            }

            @Override // com.starlightc.ucropplus.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollStart() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49852, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                UCropActivity.this.mGestureCropImageView.cancelAllAnimations();
            }
        });
        ((HorizontalProgressWheelView) findViewById(i10)).setMiddleLineColor(this.mActiveControlsWidgetColor);
        setScaleTextColor(this.mActiveControlsWidgetColor);
    }

    private void setupStatesWrapper() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49816, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) findViewById(R.id.image_view_state_scale);
        ImageView imageView2 = (ImageView) findViewById(R.id.image_view_state_rotate);
        ImageView imageView3 = (ImageView) findViewById(R.id.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new SelectedStateListDrawable(imageView.getDrawable(), this.mActiveControlsWidgetColor));
        imageView2.setImageDrawable(new SelectedStateListDrawable(imageView2.getDrawable(), this.mActiveControlsWidgetColor));
        imageView3.setImageDrawable(new SelectedStateListDrawable(imageView3.getDrawable(), this.mActiveControlsWidgetColor));
    }

    private void setupViews(@n0 Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 49813, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mStatusBarColor = intent.getIntExtra(UCrop.Options.EXTRA_STATUS_BAR_COLOR, d.f(this, R.color.ucrop_color_statusbar));
        this.mToolbarColor = intent.getIntExtra(UCrop.Options.EXTRA_TOOL_BAR_COLOR, d.f(this, R.color.ucrop_color_toolbar));
        this.mActiveControlsWidgetColor = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_COLOR_CONTROLS_WIDGET_ACTIVE, d.f(this, R.color.ucrop_color_active_controls_color));
        this.mToolbarWidgetColor = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_WIDGET_COLOR_TOOLBAR, d.f(this, R.color.ucrop_color_toolbar_widget));
        this.mToolbarCancelDrawable = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_WIDGET_CANCEL_DRAWABLE, R.drawable.ucrop_ic_cross);
        this.mToolbarCropDrawable = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_WIDGET_CROP_DRAWABLE, R.drawable.ucrop_ic_done);
        String stringExtra = intent.getStringExtra(UCrop.Options.EXTRA_UCROP_TITLE_TEXT_TOOLBAR);
        this.mToolbarTitle = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(R.string.ucrop_label_edit_photo);
        }
        this.mToolbarTitle = stringExtra;
        this.mLogoColor = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_LOGO_COLOR, d.f(this, R.color.ucrop_color_default_logo));
        this.mShowBottomControls = !intent.getBooleanExtra(UCrop.Options.EXTRA_HIDE_BOTTOM_CONTROLS, false);
        this.mRootViewBackgroundColor = intent.getIntExtra(UCrop.Options.EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR, d.f(this, R.color.ucrop_color_crop_background));
        setupAppBar();
        initiateRootViews();
        if (this.mShowBottomControls) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(R.id.ucrop_photobox)).findViewById(R.id.controls_wrapper);
            viewGroup.setVisibility(0);
            LayoutInflater.from(this).inflate(R.layout.ucrop_controls, viewGroup, true);
            AutoTransition autoTransition = new AutoTransition();
            this.mControlsTransition = autoTransition;
            autoTransition.w0(CONTROLS_ANIMATION_DURATION);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.state_aspect_ratio);
            this.mWrapperStateAspectRatio = viewGroup2;
            viewGroup2.setOnClickListener(this.mStateClickListener);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.state_rotate);
            this.mWrapperStateRotate = viewGroup3;
            viewGroup3.setOnClickListener(this.mStateClickListener);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(R.id.state_scale);
            this.mWrapperStateScale = viewGroup4;
            viewGroup4.setOnClickListener(this.mStateClickListener);
            this.mLayoutAspectRatio = (ViewGroup) findViewById(R.id.layout_aspect_ratio);
            this.mLayoutRotate = (ViewGroup) findViewById(R.id.layout_rotate_wheel);
            this.mLayoutScale = (ViewGroup) findViewById(R.id.layout_scale_wheel);
            setupAspectRatioWidget(intent);
            setupRotateWidget();
            setupScaleWidget();
            setupStatesWrapper();
        }
    }

    public void cropAndSaveImage() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49832, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mBlockingView.setClickable(true);
        this.mShowLoader = true;
        supportInvalidateOptionsMenu();
        this.mGestureCropImageView.cropAndSaveImage(this.mCompressFormat, this.mCompressQuality, new BitmapCropCallback() { // from class: com.starlightc.ucropplus.UCropActivity.8
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.starlightc.ucropplus.callback.BitmapCropCallback
            public void onBitmapCropped(@n0 Uri uri, int i10, int i11, int i12, int i13) {
                Object[] objArr = {uri, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49854, new Class[]{Uri.class, cls, cls, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                UCropActivity uCropActivity = UCropActivity.this;
                uCropActivity.setResultUri(uri, uCropActivity.mGestureCropImageView.getTargetAspectRatio(), i10, i11, i12, i13);
                UCropActivity.this.finish();
            }

            @Override // com.starlightc.ucropplus.callback.BitmapCropCallback
            public void onCropFailure(@n0 Throwable th2) {
                if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 49855, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                UCropActivity.this.setResultError(th2);
                UCropActivity.this.finish();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 49806, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.ucrop_activity_photobox);
        Intent intent = getIntent();
        setupViews(intent);
        setImageData(intent);
        setInitialState();
        addBlockingView();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{menu}, this, changeQuickRedirect, false, 49807, new Class[]{Menu.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        getMenuInflater().inflate(R.menu.ucrop_menu_activity, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_loader);
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.mToolbarWidgetColor, PorterDuff.Mode.SRC_ATOP);
                menuItemFindItem.setIcon(icon);
            } catch (IllegalStateException e10) {
                Log.i(TAG, String.format("%s - %s", e10.getMessage(), getString(R.string.ucrop_mutate_exception_hint)));
            }
            ((Animatable) menuItemFindItem.getIcon()).start();
        }
        MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_crop);
        Drawable drawableI = d.i(this, this.mToolbarCropDrawable);
        if (drawableI != null) {
            drawableI.mutate();
            drawableI.setColorFilter(this.mToolbarWidgetColor, PorterDuff.Mode.SRC_ATOP);
            menuItemFindItem2.setIcon(drawableI);
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{menuItem}, this, changeQuickRedirect, false, 49809, new Class[]{MenuItem.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (menuItem.getItemId() == R.id.menu_crop) {
            cropAndSaveImage();
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{menu}, this, changeQuickRedirect, false, 49808, new Class[]{Menu.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        menu.findItem(R.id.menu_crop).setVisible(true ^ this.mShowLoader);
        menu.findItem(R.id.menu_loader).setVisible(this.mShowLoader);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49810, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
        GestureCropImageView gestureCropImageView = this.mGestureCropImageView;
        if (gestureCropImageView != null) {
            gestureCropImageView.cancelAllAnimations();
        }
    }

    public void setResultError(Throwable th2) {
        if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 49834, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        setResult(96, new Intent().putExtra(UCrop.EXTRA_ERROR, th2));
    }

    public void setResultUri(Uri uri, float f10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {uri, new Float(f10), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49833, new Class[]{Uri.class, Float.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setResult(-1, new Intent().putExtra(UCrop.EXTRA_OUTPUT_URI, uri).putExtra(UCrop.EXTRA_OUTPUT_CROP_ASPECT_RATIO, f10).putExtra(UCrop.EXTRA_OUTPUT_IMAGE_WIDTH, i12).putExtra(UCrop.EXTRA_OUTPUT_IMAGE_HEIGHT, i13).putExtra(UCrop.EXTRA_OUTPUT_OFFSET_X, i10).putExtra(UCrop.EXTRA_OUTPUT_OFFSET_Y, i11));
    }
}
