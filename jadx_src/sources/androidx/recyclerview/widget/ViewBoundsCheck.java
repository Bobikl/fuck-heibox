package androidx.recyclerview.widget;

import android.view.View;
import bb.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
public class ViewBoundsCheck {
    static final int CVE_PVE_POS = 12;
    static final int CVE_PVS_POS = 8;
    static final int CVS_PVE_POS = 4;
    static final int CVS_PVS_POS = 0;
    static final int EQ = 2;
    static final int FLAG_CVE_EQ_PVE = 8192;
    static final int FLAG_CVE_EQ_PVS = 512;
    static final int FLAG_CVE_GT_PVE = 4096;
    static final int FLAG_CVE_GT_PVS = 256;
    static final int FLAG_CVE_LT_PVE = 16384;
    static final int FLAG_CVE_LT_PVS = 1024;
    static final int FLAG_CVS_EQ_PVE = 32;
    static final int FLAG_CVS_EQ_PVS = 2;
    static final int FLAG_CVS_GT_PVE = 16;
    static final int FLAG_CVS_GT_PVS = 1;
    static final int FLAG_CVS_LT_PVE = 64;
    static final int FLAG_CVS_LT_PVS = 4;
    static final int GT = 1;
    static final int LT = 4;
    static final int MASK = 7;
    BoundFlags mBoundFlags = new BoundFlags();
    final Callback mCallback;

    public static class BoundFlags {
        int mBoundFlags = 0;
        int mChildEnd;
        int mChildStart;
        int mRvEnd;
        int mRvStart;

        BoundFlags() {
        }

        void addFlags(int i10) {
            this.mBoundFlags = i10 | this.mBoundFlags;
        }

        boolean boundsMatch() {
            int i10 = this.mBoundFlags;
            if ((i10 & 7) != 0 && (i10 & (compare(this.mChildStart, this.mRvStart) << 0)) == 0) {
                return false;
            }
            int i11 = this.mBoundFlags;
            if ((i11 & 112) != 0 && (i11 & (compare(this.mChildStart, this.mRvEnd) << 4)) == 0) {
                return false;
            }
            int i12 = this.mBoundFlags;
            if ((i12 & c.b.zv) != 0 && (i12 & (compare(this.mChildEnd, this.mRvStart) << 8)) == 0) {
                return false;
            }
            int i13 = this.mBoundFlags;
            return (i13 & 28672) == 0 || (i13 & (compare(this.mChildEnd, this.mRvEnd) << 12)) != 0;
        }

        int compare(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void resetFlags() {
            this.mBoundFlags = 0;
        }

        void setBounds(int i10, int i11, int i12, int i13) {
            this.mRvStart = i10;
            this.mRvEnd = i11;
            this.mChildStart = i12;
            this.mChildEnd = i13;
        }
    }

    public interface Callback {
        View getChildAt(int i10);

        int getChildEnd(View view);

        int getChildStart(View view);

        int getParentEnd();

        int getParentStart();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    ViewBoundsCheck(Callback callback) {
        this.mCallback = callback;
    }

    View findOneViewWithinBoundFlags(int i10, int i11, int i12, int i13) {
        int parentStart = this.mCallback.getParentStart();
        int parentEnd = this.mCallback.getParentEnd();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View childAt = this.mCallback.getChildAt(i10);
            this.mBoundFlags.setBounds(parentStart, parentEnd, this.mCallback.getChildStart(childAt), this.mCallback.getChildEnd(childAt));
            if (i12 != 0) {
                this.mBoundFlags.resetFlags();
                this.mBoundFlags.addFlags(i12);
                if (this.mBoundFlags.boundsMatch()) {
                    return childAt;
                }
            }
            if (i13 != 0) {
                this.mBoundFlags.resetFlags();
                this.mBoundFlags.addFlags(i13);
                if (this.mBoundFlags.boundsMatch()) {
                    view = childAt;
                }
            }
            i10 += i14;
        }
        return view;
    }

    boolean isViewWithinBoundFlags(View view, int i10) {
        this.mBoundFlags.setBounds(this.mCallback.getParentStart(), this.mCallback.getParentEnd(), this.mCallback.getChildStart(view), this.mCallback.getChildEnd(view));
        if (i10 == 0) {
            return false;
        }
        this.mBoundFlags.resetFlags();
        this.mBoundFlags.addFlags(i10);
        return this.mBoundFlags.boundsMatch();
    }
}
