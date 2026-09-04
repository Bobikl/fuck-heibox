package io.flutter.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final ReflectionAccessors reflectionAccessors = new ReflectionAccessors();
    private final SparseArray<ViewAndId> flutterIdToOrigin = new SparseArray<>();
    private final Map<ViewAndId, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    public static class ReflectionAccessors {

        @p0
        private final Field childNodeIdsField;

        @p0
        private final Method getChildId;

        @p0
        private final Method getParentNodeId;

        @p0
        private final Method getRecordSourceNodeId;

        @p0
        private final Method getSourceNodeId;

        @p0
        private final Method longArrayGetIndex;

        /* JADX WARN: Multi-variable type inference failed */
        @SuppressLint({"DiscouragedPrivateApi,PrivateApi"})
        private ReflectionAccessors() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Field field;
            Method method5;
            Method method6 = null;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused) {
                Log.w(AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                Log.w(AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            if (Build.VERSION.SDK_INT > 26) {
                try {
                    Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method4 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
                    method3 = null;
                    field = declaredField;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
                    Log.w(AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
                    method3 = null;
                    method4 = null;
                    field = method4;
                }
                this.getSourceNodeId = method;
                this.getParentNodeId = method6;
                this.getRecordSourceNodeId = method2;
                this.getChildId = method3;
                this.childNodeIdsField = field;
                this.longArrayGetIndex = method4;
            }
            try {
                method5 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
            } catch (NoSuchMethodException unused4) {
                Log.w(AccessibilityViewEmbedder.TAG, "can't invoke getParentNodeId with reflection");
                method5 = null;
            }
            try {
                method3 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
                method4 = null;
            } catch (NoSuchMethodException unused5) {
                Log.w(AccessibilityViewEmbedder.TAG, "can't invoke getChildId with reflection");
                method3 = null;
                method4 = null;
            }
            method6 = method5;
            field = method4;
            this.getSourceNodeId = method;
            this.getParentNodeId = method6;
            this.getRecordSourceNodeId = method2;
            this.getChildId = method3;
            this.childNodeIdsField = field;
            this.longArrayGetIndex = method4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @p0
        public Long getChildId(@n0 AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
            Method method = this.getChildId;
            if (method == null && (this.childNodeIdsField == null || this.longArrayGetIndex == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, Integer.valueOf(i10));
                } catch (IllegalAccessException e10) {
                    Log.w(AccessibilityViewEmbedder.TAG, "Failed to access getChildId method.", e10);
                } catch (InvocationTargetException e11) {
                    Log.w(AccessibilityViewEmbedder.TAG, "The getChildId method threw an exception when invoked.", e11);
                }
            } else {
                try {
                    return Long.valueOf(((Long) this.longArrayGetIndex.invoke(this.childNodeIdsField.get(accessibilityNodeInfo), Integer.valueOf(i10))).longValue());
                } catch (ArrayIndexOutOfBoundsException e12) {
                    e = e12;
                    Log.w(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                } catch (IllegalAccessException e13) {
                    Log.w(AccessibilityViewEmbedder.TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e13);
                } catch (InvocationTargetException e14) {
                    e = e14;
                    Log.w(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @p0
        public Long getParentNodeId(@n0 AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.getParentNodeId;
            if (method != null) {
                try {
                    return Long.valueOf(((Long) method.invoke(accessibilityNodeInfo, new Object[0])).longValue());
                } catch (IllegalAccessException e10) {
                    Log.w(AccessibilityViewEmbedder.TAG, "Failed to access getParentNodeId method.", e10);
                } catch (InvocationTargetException e11) {
                    Log.w(AccessibilityViewEmbedder.TAG, "The getParentNodeId method threw an exception when invoked.", e11);
                }
            }
            return yoinkParentIdFromParcel(accessibilityNodeInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @p0
        public Long getRecordSourceNodeId(@n0 AccessibilityRecord accessibilityRecord) {
            Method method = this.getRecordSourceNodeId;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.w(AccessibilityViewEmbedder.TAG, "Failed to access the getRecordSourceNodeId method.", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.w(AccessibilityViewEmbedder.TAG, "The getRecordSourceNodeId method threw an exception when invoked.", e11);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @p0
        public Long getSourceNodeId(@n0 AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.getSourceNodeId;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.w(AccessibilityViewEmbedder.TAG, "Failed to access getSourceNodeId method.", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.w(AccessibilityViewEmbedder.TAG, "The getSourceNodeId method threw an exception when invoked.", e11);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getVirtualNodeId(long j10) {
            return (int) (j10 >> 32);
        }

        private static boolean isBitSet(long j10, int i10) {
            return (j10 & (1 << i10)) != 0;
        }

        @p0
        private static Long yoinkParentIdFromParcel(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (Build.VERSION.SDK_INT < 26) {
                Log.w(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.setDataPosition(0);
            accessibilityNodeInfoObtain.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            long j10 = parcelObtain.readLong();
            if (isBitSet(j10, 0)) {
                parcelObtain.readInt();
            }
            if (isBitSet(j10, 1)) {
                parcelObtain.readLong();
            }
            if (isBitSet(j10, 2)) {
                parcelObtain.readInt();
            }
            Long lValueOf = isBitSet(j10, 3) ? Long.valueOf(parcelObtain.readLong()) : null;
            parcelObtain.recycle();
            return lValueOf;
        }
    }

    public static class ViewAndId {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        final int f119493id;
        final View view;

        private ViewAndId(View view, int i10) {
            this.view = view;
            this.f119493id = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewAndId)) {
                return false;
            }
            ViewAndId viewAndId = (ViewAndId) obj;
            return this.f119493id == viewAndId.f119493id && this.view.equals(viewAndId.view);
        }

        public int hashCode() {
            return ((this.view.hashCode() + 31) * 31) + this.f119493id;
        }
    }

    AccessibilityViewEmbedder(@n0 View view, int i10) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i10;
    }

    private void addChildrenToFlutterNode(@n0 AccessibilityNodeInfo accessibilityNodeInfo, @n0 View view, @n0 AccessibilityNodeInfo accessibilityNodeInfo2) {
        int iIntValue;
        for (int i10 = 0; i10 < accessibilityNodeInfo.getChildCount(); i10++) {
            Long childId = this.reflectionAccessors.getChildId(accessibilityNodeInfo, i10);
            if (childId != null) {
                int virtualNodeId = ReflectionAccessors.getVirtualNodeId(childId.longValue());
                ViewAndId viewAndId = new ViewAndId(view, virtualNodeId);
                if (this.originToFlutterId.containsKey(viewAndId)) {
                    iIntValue = this.originToFlutterId.get(viewAndId).intValue();
                } else {
                    int i11 = this.nextFlutterId;
                    this.nextFlutterId = i11 + 1;
                    cacheVirtualIdMappings(view, virtualNodeId, i11);
                    iIntValue = i11;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, iIntValue);
            }
        }
    }

    private void cacheVirtualIdMappings(@n0 View view, int i10, int i11) {
        ViewAndId viewAndId = new ViewAndId(view, i10);
        this.originToFlutterId.put(viewAndId, Integer.valueOf(i11));
        this.flutterIdToOrigin.put(i11, viewAndId);
    }

    @n0
    private AccessibilityNodeInfo convertToFlutterNode(@n0 AccessibilityNodeInfo accessibilityNodeInfo, int i10, @n0 View view) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i10);
        accessibilityNodeInfoObtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        accessibilityNodeInfoObtain.setSource(this.rootAccessibilityView, i10);
        accessibilityNodeInfoObtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, accessibilityNodeInfoObtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, accessibilityNodeInfoObtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        return accessibilityNodeInfoObtain;
    }

    private void copyAccessibilityFields(@n0 AccessibilityNodeInfo accessibilityNodeInfo, @n0 AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        int i10 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        if (i10 >= 24) {
            accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
            accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        }
        if (i10 >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    private void setFlutterNodeParent(@n0 AccessibilityNodeInfo accessibilityNodeInfo, @n0 View view, @n0 AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long parentNodeId = this.reflectionAccessors.getParentNodeId(accessibilityNodeInfo);
        if (parentNodeId == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new ViewAndId(view, ReflectionAccessors.getVirtualNodeId(parentNodeId.longValue())));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(@n0 AccessibilityNodeInfo accessibilityNodeInfo, @n0 Rect rect, @n0 AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    @p0
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo;
        ViewAndId viewAndId = this.flutterIdToOrigin.get(i10);
        if (viewAndId == null || !this.embeddedViewToDisplayBounds.containsKey(viewAndId.view) || viewAndId.view.getAccessibilityNodeProvider() == null || (accessibilityNodeInfoCreateAccessibilityNodeInfo = viewAndId.view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(viewAndId.f119493id)) == null) {
            return null;
        }
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i10, viewAndId.view);
    }

    @p0
    public Integer getRecordFlutterId(@n0 View view, @n0 AccessibilityRecord accessibilityRecord) {
        Long recordSourceNodeId = this.reflectionAccessors.getRecordSourceNodeId(accessibilityRecord);
        if (recordSourceNodeId == null) {
            return null;
        }
        return this.originToFlutterId.get(new ViewAndId(view, ReflectionAccessors.getVirtualNodeId(recordSourceNodeId.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(@n0 View view, int i10, @n0 Rect rect) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long sourceNodeId = this.reflectionAccessors.getSourceNodeId(accessibilityNodeInfoCreateAccessibilityNodeInfo);
        if (sourceNodeId == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, ReflectionAccessors.getVirtualNodeId(sourceNodeId.longValue()), i10);
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i10, view);
    }

    public boolean onAccessibilityHoverEvent(int i10, @n0 MotionEvent motionEvent) {
        ViewAndId viewAndId = this.flutterIdToOrigin.get(i10);
        if (viewAndId == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(viewAndId.view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i11] = pointerProperties;
            motionEvent.getPointerProperties(i11, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i11, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i11] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return viewAndId.view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i10, int i11, @p0 Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        ViewAndId viewAndId = this.flutterIdToOrigin.get(i10);
        if (viewAndId == null || (accessibilityNodeProvider = viewAndId.view.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(viewAndId.f119493id, i11, bundle);
    }

    public View platformViewOfNode(int i10) {
        ViewAndId viewAndId = this.flutterIdToOrigin.get(i10);
        if (viewAndId == null) {
            return null;
        }
        return viewAndId.view;
    }

    public boolean requestSendAccessibilityEvent(@n0 View view, @n0 View view2, @n0 AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long recordSourceNodeId = this.reflectionAccessors.getRecordSourceNodeId(accessibilityEvent);
        if (recordSourceNodeId == null) {
            return false;
        }
        int virtualNodeId = ReflectionAccessors.getVirtualNodeId(recordSourceNodeId.longValue());
        Integer numValueOf = this.originToFlutterId.get(new ViewAndId(view, virtualNodeId));
        if (numValueOf == null) {
            int i10 = this.nextFlutterId;
            this.nextFlutterId = i10 + 1;
            numValueOf = Integer.valueOf(i10);
            cacheVirtualIdMappings(view, virtualNodeId, numValueOf.intValue());
        }
        accessibilityEventObtain.setSource(this.rootAccessibilityView, numValueOf.intValue());
        accessibilityEventObtain.setClassName(accessibilityEvent.getClassName());
        accessibilityEventObtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i11 = 0; i11 < accessibilityEventObtain.getRecordCount(); i11++) {
            AccessibilityRecord record = accessibilityEventObtain.getRecord(i11);
            Long recordSourceNodeId2 = this.reflectionAccessors.getRecordSourceNodeId(record);
            if (recordSourceNodeId2 == null) {
                return false;
            }
            ViewAndId viewAndId = new ViewAndId(view, ReflectionAccessors.getVirtualNodeId(recordSourceNodeId2.longValue()));
            if (!this.originToFlutterId.containsKey(viewAndId)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(viewAndId).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, accessibilityEventObtain);
    }
}
