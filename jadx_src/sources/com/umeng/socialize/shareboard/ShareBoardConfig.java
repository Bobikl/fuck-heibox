package com.umeng.socialize.shareboard;

import android.graphics.Color;
import android.text.TextUtils;
import android.widget.PopupWindow;
import com.umeng.socialize.utils.ShareBoardlistener;

/* JADX INFO: loaded from: classes4.dex */
public class ShareBoardConfig {
    public static int BG_SHAPE_CIRCULAR = 1;
    public static int BG_SHAPE_NONE = 0;
    public static int BG_SHAPE_ROUNDED_SQUARE = 2;
    static final int CANCEL_BTN_HEIGHT = 50;
    static final int CANCEL_BTN_TEXT_SIZE_IN_SP = 15;
    static final int CENTER_MENU_LEFT_PADDING = 36;
    static final int INDICATOR_BOTTOM_MARGIN = 20;
    static final int INDICATOR_SIZE = 3;
    static final int INDICATOR_SPACE = 5;
    private static final int MENU_COLUMN_NUM = 4;
    private static final int MENU_COLUMN_NUM_CENTER = 3;
    private static final int MENU_COLUMN_NUM_HORIZONTAL = 6;
    private static final int MENU_COLUMN_NUM_HORIZONTAL_CENTER = 5;
    static final int MENU_ROW_MARGIN = 20;
    static final int MENU_ROW_NUM = 2;
    static final int MENU_TOP_MARGIN = 20;
    public static int SHAREBOARD_POSITION_BOTTOM = 3;
    public static int SHAREBOARD_POSITION_CENTER = 2;
    static int SHAREBOARD_POSITION_TOP = 1;
    static final int TITLE_TEXT_SIZE_IN_SP = 16;
    static final int TITLE_TOP_MARGIN = 20;
    static final int VIEW_PAGER_LEFT_MARGIN = 10;
    int mCancelBtnBgColor;
    int mCancelBtnBgPressedColor;
    int mCancelBtnColor;
    String mCancelBtnText;
    boolean mCancelBtnVisibility;
    int mIndicatorNormalColor;
    int mIndicatorSelectedColor;
    boolean mIndicatorVisibility;
    int mMenuBgColor;
    int mMenuBgPressedColor;
    int mMenuBgShape;
    int mMenuBgShapeAngle;
    int mMenuColumnNum;
    int mMenuIconPressedColor;
    int mMenuTextColor;
    private PopupWindow.OnDismissListener mOnDismissListener;
    private ShareBoardlistener mShareBoardlistener;
    int mShareboardBgColor;
    int mShareboardPosition;
    String mTitleText;
    int mTitleTextColor;
    boolean mTitleVisibility;
    int mTopMargin;

    public ShareBoardConfig() {
        setDefaultValue();
    }

    private void setDefaultValue() {
        int color = Color.parseColor("#575A5C");
        setShareboardBackgroundColor(Color.parseColor("#E9EFF2"));
        setShareboardPostion(SHAREBOARD_POSITION_BOTTOM);
        setTitleText("选择要分享到的平台");
        setTitleTextColor(color);
        setMenuItemBackgroundShape(BG_SHAPE_ROUNDED_SQUARE, 5);
        setMenuItemBackgroundColor(Color.parseColor("#ffffff"), Color.parseColor("#22000000"));
        setMenuItemIconPressedColor(Color.parseColor("#22000000"));
        setMenuItemTextColor(color);
        setCancelButtonText("取消分享");
        setCancelButtonTextColor(color);
        setCancelButtonBackground(Color.parseColor("#ffffff"), Color.parseColor("#22000000"));
        setIndicatorColor(Color.parseColor("#C2C9CC"), Color.parseColor("#0086DC"));
    }

    int calculateMenuHeightInDp(int i10) {
        int i11 = i10 <= this.mMenuColumnNum ? 1 : 2;
        return (i11 * 75) + ((i11 - 1) * 20) + 20;
    }

    PopupWindow.OnDismissListener getOnDismissListener() {
        return this.mOnDismissListener;
    }

    ShareBoardlistener getShareBoardlistener() {
        return this.mShareBoardlistener;
    }

    public ShareBoardConfig setCancelButtonBackground(int i10) {
        setCancelButtonBackground(i10, 0);
        return this;
    }

    public ShareBoardConfig setCancelButtonBackground(int i10, int i11) {
        this.mCancelBtnBgColor = i10;
        this.mCancelBtnBgPressedColor = i11;
        return this;
    }

    public ShareBoardConfig setCancelButtonText(String str) {
        if (TextUtils.isEmpty(str)) {
            setCancelButtonVisibility(false);
        } else {
            setCancelButtonVisibility(true);
            this.mCancelBtnText = str;
        }
        return this;
    }

    public ShareBoardConfig setCancelButtonTextColor(int i10) {
        this.mCancelBtnColor = i10;
        return this;
    }

    public ShareBoardConfig setCancelButtonVisibility(boolean z10) {
        this.mCancelBtnVisibility = z10;
        return this;
    }

    public ShareBoardConfig setIndicatorColor(int i10) {
        setIndicatorColor(i10, 0);
        return this;
    }

    public ShareBoardConfig setIndicatorColor(int i10, int i11) {
        if (i10 != 0) {
            this.mIndicatorNormalColor = i10;
        }
        if (i11 != 0) {
            this.mIndicatorSelectedColor = i11;
        }
        setIndicatorVisibility(true);
        return this;
    }

    public ShareBoardConfig setIndicatorVisibility(boolean z10) {
        this.mIndicatorVisibility = z10;
        return this;
    }

    public ShareBoardConfig setMenuItemBackgroundColor(int i10) {
        setMenuItemBackgroundColor(i10, 0);
        return this;
    }

    public ShareBoardConfig setMenuItemBackgroundColor(int i10, int i11) {
        this.mMenuBgColor = i10;
        this.mMenuBgPressedColor = i11;
        return this;
    }

    public ShareBoardConfig setMenuItemBackgroundShape(int i10) {
        setMenuItemBackgroundShape(i10, 0);
        return this;
    }

    public ShareBoardConfig setMenuItemBackgroundShape(int i10, int i11) {
        if (i10 != BG_SHAPE_CIRCULAR && i10 != BG_SHAPE_ROUNDED_SQUARE) {
            i10 = BG_SHAPE_NONE;
        }
        this.mMenuBgShape = i10;
        this.mMenuBgShapeAngle = i11;
        return this;
    }

    public ShareBoardConfig setMenuItemIconPressedColor(int i10) {
        this.mMenuIconPressedColor = i10;
        return this;
    }

    public ShareBoardConfig setMenuItemTextColor(int i10) {
        this.mMenuTextColor = i10;
        return this;
    }

    public ShareBoardConfig setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
        return this;
    }

    void setOrientation(boolean z10) {
        if (z10) {
            int i10 = this.mShareboardPosition;
            if (i10 == SHAREBOARD_POSITION_BOTTOM) {
                this.mMenuColumnNum = 6;
                return;
            } else {
                if (i10 == SHAREBOARD_POSITION_CENTER) {
                    this.mMenuColumnNum = 5;
                    return;
                }
                return;
            }
        }
        int i11 = this.mShareboardPosition;
        if (i11 == SHAREBOARD_POSITION_BOTTOM) {
            this.mMenuColumnNum = 4;
        } else if (i11 == SHAREBOARD_POSITION_CENTER) {
            this.mMenuColumnNum = 3;
        }
    }

    void setShareBoardlistener(ShareBoardlistener shareBoardlistener) {
        this.mShareBoardlistener = shareBoardlistener;
    }

    public ShareBoardConfig setShareboardBackgroundColor(int i10) {
        this.mShareboardBgColor = i10;
        return this;
    }

    public ShareBoardConfig setShareboardPostion(int i10) {
        int i11 = SHAREBOARD_POSITION_BOTTOM;
        if (i10 != i11 && i10 != SHAREBOARD_POSITION_CENTER && i10 != SHAREBOARD_POSITION_TOP) {
            i10 = i11;
        }
        this.mShareboardPosition = i10;
        return this;
    }

    public ShareBoardConfig setStatusBarHeight(int i10) {
        this.mTopMargin = i10;
        return this;
    }

    public ShareBoardConfig setTitleText(String str) {
        if (TextUtils.isEmpty(str)) {
            setTitleVisibility(false);
        } else {
            setTitleVisibility(true);
            this.mTitleText = str;
        }
        return this;
    }

    public ShareBoardConfig setTitleTextColor(int i10) {
        this.mTitleTextColor = i10;
        return this;
    }

    public ShareBoardConfig setTitleVisibility(boolean z10) {
        this.mTitleVisibility = z10;
        return this;
    }
}
