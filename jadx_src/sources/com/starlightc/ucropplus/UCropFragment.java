package com.starlightc.ucropplus;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.d0;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.app.e;
import androidx.core.content.d;
import androidx.fragment.app.Fragment;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.v;
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
public class UCropFragment extends Fragment {
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
    public static final String TAG = "UCropFragment";
    public static ChangeQuickRedirect changeQuickRedirect;
    private UCropFragmentCallback callback;
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
    private TextView mTextViewRotateAngle;
    private TextView mTextViewScalePercent;
    private UCropView mUCropView;
    private ViewGroup mWrapperStateAspectRatio;
    private ViewGroup mWrapperStateRotate;
    private ViewGroup mWrapperStateScale;
    private List<ViewGroup> mCropAspectRatioViews = new ArrayList();
    private Bitmap.CompressFormat mCompressFormat = DEFAULT_COMPRESS_FORMAT;
    private int mCompressQuality = 90;
    private int[] mAllowedGestures = {1, 2, 3};
    private TransformImageView.TransformImageListener mImageListener = new TransformImageView.TransformImageListener() { // from class: com.starlightc.ucropplus.UCropFragment.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.starlightc.ucropplus.view.TransformImageView.TransformImageListener
        public void onLoadComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49888, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            UCropFragment.this.mUCropView.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropFragment.this.mBlockingView.setClickable(false);
            UCropFragment.this.callback.loadingProgress(false);
        }

        @Override // com.starlightc.ucropplus.view.TransformImageView.TransformImageListener
        public void onLoadFailure(@n0 Exception exc) {
            if (PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 49889, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                return;
            }
            UCropFragment.this.callback.onCropFinish(UCropFragment.this.getError(exc));
        }

        @Override // com.starlightc.ucropplus.view.TransformImageView.TransformImageListener
        public void onRotate(float f10) {
            if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 49886, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            UCropFragment.access$000(UCropFragment.this, f10);
        }

        @Override // com.starlightc.ucropplus.view.TransformImageView.TransformImageListener
        public void onScale(float f10) {
            if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 49887, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            UCropFragment.access$100(UCropFragment.this, f10);
        }
    };
    private final View.OnClickListener mStateClickListener = new View.OnClickListener() { // from class: com.starlightc.ucropplus.UCropFragment.7
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49899, new Class[]{View.class}, Void.TYPE).isSupported || view.isSelected()) {
                return;
            }
            UCropFragment.access$900(UCropFragment.this, view.getId());
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    public @interface GestureTypes {
    }

    public class UCropResult {
        public int mResultCode;
        public Intent mResultData;

        public UCropResult(int i10, Intent intent) {
            this.mResultCode = i10;
            this.mResultData = intent;
        }
    }

    static {
        e.J(true);
    }

    static /* synthetic */ void access$000(UCropFragment uCropFragment, float f10) {
        if (PatchProxy.proxy(new Object[]{uCropFragment, new Float(f10)}, null, changeQuickRedirect, true, 49881, new Class[]{UCropFragment.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        uCropFragment.setAngleText(f10);
    }

    static /* synthetic */ void access$100(UCropFragment uCropFragment, float f10) {
        if (PatchProxy.proxy(new Object[]{uCropFragment, new Float(f10)}, null, changeQuickRedirect, true, 49882, new Class[]{UCropFragment.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        uCropFragment.setScaleText(f10);
    }

    static /* synthetic */ void access$700(UCropFragment uCropFragment) {
        if (PatchProxy.proxy(new Object[]{uCropFragment}, null, changeQuickRedirect, true, 49883, new Class[]{UCropFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        uCropFragment.resetRotation();
    }

    static /* synthetic */ void access$800(UCropFragment uCropFragment, int i10) {
        if (PatchProxy.proxy(new Object[]{uCropFragment, new Integer(i10)}, null, changeQuickRedirect, true, 49884, new Class[]{UCropFragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        uCropFragment.rotateByAngle(i10);
    }

    static /* synthetic */ void access$900(UCropFragment uCropFragment, int i10) {
        if (PatchProxy.proxy(new Object[]{uCropFragment, new Integer(i10)}, null, changeQuickRedirect, true, 49885, new Class[]{UCropFragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        uCropFragment.setWidgetState(i10);
    }

    private void addBlockingView(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49877, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.mBlockingView == null) {
            this.mBlockingView = new View(getContext());
            this.mBlockingView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.mBlockingView.setClickable(true);
        }
        ((RelativeLayout) view.findViewById(R.id.ucrop_photobox)).addView(this.mBlockingView);
    }

    private void changeSelectedTab(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49875, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (getView() != null) {
            v.b((ViewGroup) getView().findViewById(R.id.ucrop_photobox), this.mControlsTransition);
        }
        this.mWrapperStateScale.findViewById(R.id.text_view_scale).setVisibility(i10 == R.id.state_scale ? 0 : 8);
        this.mWrapperStateAspectRatio.findViewById(R.id.text_view_crop).setVisibility(i10 == R.id.state_aspect_ratio ? 0 : 8);
        this.mWrapperStateRotate.findViewById(R.id.text_view_rotate).setVisibility(i10 != R.id.state_rotate ? 8 : 0);
    }

    private void initiateRootViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49862, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        UCropView uCropView = (UCropView) view.findViewById(R.id.ucrop);
        this.mUCropView = uCropView;
        this.mGestureCropImageView = uCropView.getCropImageView();
        this.mOverlayView = this.mUCropView.getOverlayView();
        this.mGestureCropImageView.setTransformImageListener(this.mImageListener);
        ((ImageView) view.findViewById(R.id.image_view_logo)).setColorFilter(this.mLogoColor, PorterDuff.Mode.SRC_ATOP);
        view.findViewById(R.id.ucrop_frame).setBackgroundColor(this.mRootViewBackgroundColor);
    }

    public static UCropFragment newInstance(Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, null, changeQuickRedirect, true, 49856, new Class[]{Bundle.class}, UCropFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (UCropFragment) patchProxyResultProxy.result;
        }
        UCropFragment uCropFragment = new UCropFragment();
        uCropFragment.setArguments(bundle);
        return uCropFragment;
    }

    private void processOptions(@n0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 49861, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        String string = bundle.getString(UCrop.Options.EXTRA_COMPRESSION_FORMAT_NAME);
        Bitmap.CompressFormat compressFormatValueOf = TextUtils.isEmpty(string) ? null : Bitmap.CompressFormat.valueOf(string);
        if (compressFormatValueOf == null) {
            compressFormatValueOf = DEFAULT_COMPRESS_FORMAT;
        }
        this.mCompressFormat = compressFormatValueOf;
        this.mCompressQuality = bundle.getInt(UCrop.Options.EXTRA_COMPRESSION_QUALITY, 90);
        int[] intArray = bundle.getIntArray(UCrop.Options.EXTRA_ALLOWED_GESTURES);
        if (intArray != null && intArray.length == 3) {
            this.mAllowedGestures = intArray;
        }
        this.mGestureCropImageView.setMaxBitmapSize(bundle.getInt(UCrop.Options.EXTRA_MAX_BITMAP_SIZE, 0));
        this.mGestureCropImageView.setMaxScaleMultiplier(bundle.getFloat(UCrop.Options.EXTRA_MAX_SCALE_MULTIPLIER, 10.0f));
        this.mGestureCropImageView.setImageToWrapCropBoundsAnimDuration(bundle.getInt(UCrop.Options.EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, 500));
        this.mOverlayView.setFreestyleCropEnabled(bundle.getBoolean(UCrop.Options.EXTRA_FREE_STYLE_CROP, false));
        this.mOverlayView.setDimmedColor(bundle.getInt(UCrop.Options.EXTRA_DIMMED_LAYER_COLOR, getResources().getColor(R.color.ucrop_color_default_dimmed)));
        this.mOverlayView.setCircleDimmedLayer(bundle.getBoolean(UCrop.Options.EXTRA_CIRCLE_DIMMED_LAYER, false));
        this.mOverlayView.setShowCropFrame(bundle.getBoolean(UCrop.Options.EXTRA_SHOW_CROP_FRAME, true));
        this.mOverlayView.setCropFrameColor(bundle.getInt(UCrop.Options.EXTRA_CROP_FRAME_COLOR, getResources().getColor(R.color.ucrop_color_default_crop_frame)));
        this.mOverlayView.setCropFrameStrokeWidth(bundle.getInt(UCrop.Options.EXTRA_CROP_FRAME_STROKE_WIDTH, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width)));
        this.mOverlayView.setShowCropGrid(bundle.getBoolean(UCrop.Options.EXTRA_SHOW_CROP_GRID, true));
        this.mOverlayView.setCropGridRowCount(bundle.getInt(UCrop.Options.EXTRA_CROP_GRID_ROW_COUNT, 2));
        this.mOverlayView.setCropGridColumnCount(bundle.getInt(UCrop.Options.EXTRA_CROP_GRID_COLUMN_COUNT, 2));
        this.mOverlayView.setCropGridColor(bundle.getInt(UCrop.Options.EXTRA_CROP_GRID_COLOR, getResources().getColor(R.color.ucrop_color_default_crop_grid)));
        this.mOverlayView.setCropGridStrokeWidth(bundle.getInt(UCrop.Options.EXTRA_CROP_GRID_STROKE_WIDTH, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width)));
        float f10 = bundle.getFloat(UCrop.EXTRA_ASPECT_RATIO_X, -1.0f);
        float f11 = bundle.getFloat(UCrop.EXTRA_ASPECT_RATIO_Y, -1.0f);
        int i10 = bundle.getInt(UCrop.Options.EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, 0);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(UCrop.Options.EXTRA_ASPECT_RATIO_OPTIONS);
        if (f10 >= 0.0f && f11 >= 0.0f) {
            ViewGroup viewGroup = this.mWrapperStateAspectRatio;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            float f12 = f10 / f11;
            this.mGestureCropImageView.setTargetAspectRatio(Float.isNaN(f12) ? 0.0f : f12);
        } else if (parcelableArrayList == null || i10 >= parcelableArrayList.size()) {
            this.mGestureCropImageView.setTargetAspectRatio(0.0f);
        } else {
            float aspectRatioX = ((AspectRatio) parcelableArrayList.get(i10)).getAspectRatioX() / ((AspectRatio) parcelableArrayList.get(i10)).getAspectRatioY();
            this.mGestureCropImageView.setTargetAspectRatio(Float.isNaN(aspectRatioX) ? 0.0f : aspectRatioX);
        }
        int i11 = bundle.getInt(UCrop.EXTRA_MAX_SIZE_X, 0);
        int i12 = bundle.getInt(UCrop.EXTRA_MAX_SIZE_Y, 0);
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        this.mGestureCropImageView.setMaxResultImageSizeX(i11);
        this.mGestureCropImageView.setMaxResultImageSizeY(i12);
    }

    private void resetRotation() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49871, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GestureCropImageView gestureCropImageView = this.mGestureCropImageView;
        gestureCropImageView.postRotate(-gestureCropImageView.getCurrentAngle());
        this.mGestureCropImageView.setImageToWrapCropBounds();
    }

    private void rotateByAngle(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49872, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mGestureCropImageView.postRotate(i10);
        this.mGestureCropImageView.setImageToWrapCropBounds();
    }

    private void setAllowedGestures(int i10) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49876, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
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
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 49867, new Class[]{Float.TYPE}, Void.TYPE).isSupported || (textView = this.mTextViewRotateAngle) == null) {
            return;
        }
        textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f10)));
    }

    private void setAngleTextColor(int i10) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49868, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (textView = this.mTextViewRotateAngle) == null) {
            return;
        }
        textView.setTextColor(i10);
    }

    private void setImageData(@n0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 49860, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        Uri uri = (Uri) bundle.getParcelable(UCrop.EXTRA_INPUT_URI);
        Uri uri2 = (Uri) bundle.getParcelable(UCrop.EXTRA_OUTPUT_URI);
        processOptions(bundle);
        if (uri == null || uri2 == null) {
            this.callback.onCropFinish(getError(new NullPointerException(getString(R.string.ucrop_error_input_data_is_absent))));
            return;
        }
        try {
            this.mGestureCropImageView.setImageUri(uri, uri2);
        } catch (Exception e10) {
            this.callback.onCropFinish(getError(e10));
        }
    }

    private void setInitialState() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49873, new Class[0], Void.TYPE).isSupported) {
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
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 49869, new Class[]{Float.TYPE}, Void.TYPE).isSupported || (textView = this.mTextViewScalePercent) == null) {
            return;
        }
        textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f10 * 100.0f))));
    }

    private void setScaleTextColor(int i10) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49870, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (textView = this.mTextViewScalePercent) == null) {
            return;
        }
        textView.setTextColor(i10);
    }

    private void setWidgetState(@d0 int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49874, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && this.mShowBottomControls) {
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

    private void setupAspectRatioWidget(@n0 Bundle bundle, View view) {
        int i10 = 2;
        if (PatchProxy.proxy(new Object[]{bundle, view}, this, changeQuickRedirect, false, 49864, new Class[]{Bundle.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        int i11 = bundle.getInt(UCrop.Options.EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, 0);
        ArrayList<AspectRatio> parcelableArrayList = bundle.getParcelableArrayList(UCrop.Options.EXTRA_ASPECT_RATIO_OPTIONS);
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            parcelableArrayList = new ArrayList();
            parcelableArrayList.add(new AspectRatio(null, 1.0f, 1.0f));
            parcelableArrayList.add(new AspectRatio(null, 3.0f, 4.0f));
            parcelableArrayList.add(new AspectRatio(getString(R.string.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayList.add(new AspectRatio(null, 3.0f, 2.0f));
            parcelableArrayList.add(new AspectRatio(null, 16.0f, 9.0f));
        } else {
            i10 = i11;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        for (AspectRatio aspectRatio : parcelableArrayList) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(R.layout.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.mActiveControlsWidgetColor);
            aspectRatioTextView.setAspectRatio(aspectRatio);
            linearLayout.addView(frameLayout);
            this.mCropAspectRatioViews.add(frameLayout);
        }
        this.mCropAspectRatioViews.get(i10).setSelected(true);
        Iterator<ViewGroup> it = this.mCropAspectRatioViews.iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.UCropFragment.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 49890, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    UCropFragment.this.mGestureCropImageView.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view2).getChildAt(0)).getAspectRatio(view2.isSelected()));
                    UCropFragment.this.mGestureCropImageView.setImageToWrapCropBounds();
                    if (view2.isSelected()) {
                        return;
                    }
                    for (ViewGroup viewGroup : UCropFragment.this.mCropAspectRatioViews) {
                        viewGroup.setSelected(viewGroup == view2);
                    }
                }
            });
        }
    }

    private void setupRotateWidget(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49865, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mTextViewRotateAngle = (TextView) view.findViewById(R.id.text_view_rotate);
        int i10 = R.id.rotate_scroll_wheel;
        ((HorizontalProgressWheelView) view.findViewById(i10)).setScrollingListener(new HorizontalProgressWheelView.ScrollingListener() { // from class: com.starlightc.ucropplus.UCropFragment.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.starlightc.ucropplus.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScroll(float f10, float f11) {
                Object[] objArr = {new Float(f10), new Float(f11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Float.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49891, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                UCropFragment.this.mGestureCropImageView.postRotate(f10 / 42.0f);
            }

            @Override // com.starlightc.ucropplus.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollEnd() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49892, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                UCropFragment.this.mGestureCropImageView.setImageToWrapCropBounds();
            }

            @Override // com.starlightc.ucropplus.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollStart() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49893, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                UCropFragment.this.mGestureCropImageView.cancelAllAnimations();
            }
        });
        ((HorizontalProgressWheelView) view.findViewById(i10)).setMiddleLineColor(this.mActiveControlsWidgetColor);
        view.findViewById(R.id.wrapper_reset_rotate).setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.UCropFragment.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 49894, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                UCropFragment.access$700(UCropFragment.this);
            }
        });
        view.findViewById(R.id.wrapper_rotate_by_angle).setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.UCropFragment.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 49895, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                UCropFragment.access$800(UCropFragment.this, 90);
            }
        });
        setAngleTextColor(this.mActiveControlsWidgetColor);
    }

    private void setupScaleWidget(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49866, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mTextViewScalePercent = (TextView) view.findViewById(R.id.text_view_scale);
        int i10 = R.id.scale_scroll_wheel;
        ((HorizontalProgressWheelView) view.findViewById(i10)).setScrollingListener(new HorizontalProgressWheelView.ScrollingListener() { // from class: com.starlightc.ucropplus.UCropFragment.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.starlightc.ucropplus.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScroll(float f10, float f11) {
                Object[] objArr = {new Float(f10), new Float(f11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Float.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49896, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                if (f10 > 0.0f) {
                    UCropFragment.this.mGestureCropImageView.zoomInImage(UCropFragment.this.mGestureCropImageView.getCurrentScale() + (f10 * ((UCropFragment.this.mGestureCropImageView.getMaxScale() - UCropFragment.this.mGestureCropImageView.getMinScale()) / 15000.0f)));
                } else {
                    UCropFragment.this.mGestureCropImageView.zoomOutImage(UCropFragment.this.mGestureCropImageView.getCurrentScale() + (f10 * ((UCropFragment.this.mGestureCropImageView.getMaxScale() - UCropFragment.this.mGestureCropImageView.getMinScale()) / 15000.0f)));
                }
            }

            @Override // com.starlightc.ucropplus.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollEnd() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49897, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                UCropFragment.this.mGestureCropImageView.setImageToWrapCropBounds();
            }

            @Override // com.starlightc.ucropplus.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollStart() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49898, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                UCropFragment.this.mGestureCropImageView.cancelAllAnimations();
            }
        });
        ((HorizontalProgressWheelView) view.findViewById(i10)).setMiddleLineColor(this.mActiveControlsWidgetColor);
        setScaleTextColor(this.mActiveControlsWidgetColor);
    }

    private void setupStatesWrapper(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49863, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.image_view_state_scale);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.image_view_state_rotate);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new SelectedStateListDrawable(imageView.getDrawable(), this.mActiveControlsWidgetColor));
        imageView2.setImageDrawable(new SelectedStateListDrawable(imageView2.getDrawable(), this.mActiveControlsWidgetColor));
        imageView3.setImageDrawable(new SelectedStateListDrawable(imageView3.getDrawable(), this.mActiveControlsWidgetColor));
    }

    public void cropAndSaveImage() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49878, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mBlockingView.setClickable(true);
        this.callback.loadingProgress(true);
        this.mGestureCropImageView.cropAndSaveImage(this.mCompressFormat, this.mCompressQuality, new BitmapCropCallback() { // from class: com.starlightc.ucropplus.UCropFragment.8
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.starlightc.ucropplus.callback.BitmapCropCallback
            public void onBitmapCropped(@n0 Uri uri, int i10, int i11, int i12, int i13) {
                Object[] objArr = {uri, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49900, new Class[]{Uri.class, cls, cls, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                UCropFragmentCallback uCropFragmentCallback = UCropFragment.this.callback;
                UCropFragment uCropFragment = UCropFragment.this;
                uCropFragmentCallback.onCropFinish(uCropFragment.getResult(uri, uCropFragment.mGestureCropImageView.getTargetAspectRatio(), i10, i11, i12, i13));
                UCropFragment.this.callback.loadingProgress(false);
            }

            @Override // com.starlightc.ucropplus.callback.BitmapCropCallback
            public void onCropFailure(@n0 Throwable th2) {
                if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 49901, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                UCropFragment.this.callback.onCropFinish(UCropFragment.this.getError(th2));
            }
        });
    }

    public UCropResult getError(Throwable th2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 49880, new Class[]{Throwable.class}, UCropResult.class);
        return patchProxyResultProxy.isSupported ? (UCropResult) patchProxyResultProxy.result : new UCropResult(96, new Intent().putExtra(UCrop.EXTRA_ERROR, th2));
    }

    public UCropResult getResult(Uri uri, float f10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {uri, new Float(f10), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49879, new Class[]{Uri.class, Float.TYPE, cls, cls, cls, cls}, UCropResult.class);
        return patchProxyResultProxy.isSupported ? (UCropResult) patchProxyResultProxy.result : new UCropResult(-1, new Intent().putExtra(UCrop.EXTRA_OUTPUT_URI, uri).putExtra(UCrop.EXTRA_OUTPUT_CROP_ASPECT_RATIO, f10).putExtra(UCrop.EXTRA_OUTPUT_IMAGE_WIDTH, i12).putExtra(UCrop.EXTRA_OUTPUT_IMAGE_HEIGHT, i13).putExtra(UCrop.EXTRA_OUTPUT_OFFSET_X, i10).putExtra(UCrop.EXTRA_OUTPUT_OFFSET_Y, i11));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 49857, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof UCropFragmentCallback) {
            this.callback = (UCropFragmentCallback) getParentFragment();
        } else {
            if (context instanceof UCropFragmentCallback) {
                this.callback = (UCropFragmentCallback) context;
                return;
            }
            throw new IllegalArgumentException(context.toString() + " must implement UCropFragmentCallback");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @p0
    public View onCreateView(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 49858, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.ucrop_fragment_photobox, viewGroup, false);
        Bundle arguments = getArguments();
        setupViews(viewInflate, arguments);
        setImageData(arguments);
        setInitialState();
        addBlockingView(viewInflate);
        return viewInflate;
    }

    public void setCallback(UCropFragmentCallback uCropFragmentCallback) {
        this.callback = uCropFragmentCallback;
    }

    public void setupViews(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 49859, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mActiveControlsWidgetColor = bundle.getInt(UCrop.Options.EXTRA_UCROP_COLOR_CONTROLS_WIDGET_ACTIVE, d.f(getContext(), R.color.ucrop_color_widget_active));
        this.mLogoColor = bundle.getInt(UCrop.Options.EXTRA_UCROP_LOGO_COLOR, d.f(getContext(), R.color.ucrop_color_default_logo));
        this.mShowBottomControls = !bundle.getBoolean(UCrop.Options.EXTRA_HIDE_BOTTOM_CONTROLS, false);
        this.mRootViewBackgroundColor = bundle.getInt(UCrop.Options.EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR, d.f(getContext(), R.color.ucrop_color_crop_background));
        initiateRootViews(view);
        this.callback.loadingProgress(true);
        if (!this.mShowBottomControls) {
            int i10 = R.id.ucrop_frame;
            ((RelativeLayout.LayoutParams) view.findViewById(i10).getLayoutParams()).bottomMargin = 0;
            view.findViewById(i10).requestLayout();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.controls_wrapper);
        viewGroup.setVisibility(0);
        LayoutInflater.from(getContext()).inflate(R.layout.ucrop_controls, viewGroup, true);
        AutoTransition autoTransition = new AutoTransition();
        this.mControlsTransition = autoTransition;
        autoTransition.w0(CONTROLS_ANIMATION_DURATION);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.state_aspect_ratio);
        this.mWrapperStateAspectRatio = viewGroup2;
        viewGroup2.setOnClickListener(this.mStateClickListener);
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.state_rotate);
        this.mWrapperStateRotate = viewGroup3;
        viewGroup3.setOnClickListener(this.mStateClickListener);
        ViewGroup viewGroup4 = (ViewGroup) view.findViewById(R.id.state_scale);
        this.mWrapperStateScale = viewGroup4;
        viewGroup4.setOnClickListener(this.mStateClickListener);
        this.mLayoutAspectRatio = (ViewGroup) view.findViewById(R.id.layout_aspect_ratio);
        this.mLayoutRotate = (ViewGroup) view.findViewById(R.id.layout_rotate_wheel);
        this.mLayoutScale = (ViewGroup) view.findViewById(R.id.layout_scale_wheel);
        setupAspectRatioWidget(bundle, view);
        setupRotateWidget(view);
        setupScaleWidget(view);
        setupStatesWrapper(view);
    }
}
