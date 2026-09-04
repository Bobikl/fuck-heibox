package com.tencent.cos.xml.transfer;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.cos.xml.BeaconService;
import com.tencent.cos.xml.model.CosXmlResult;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class TaskStateMonitor implements Runnable {
    public static final int MESSAGE_RELEASE_LOOP = 3;
    public static final int MESSAGE_TASK_CONSTRAINT = 5;
    public static final int MESSAGE_TASK_INIT = 4;
    public static final int MESSAGE_TASK_MANUAL = 2;
    public static final int MESSAGE_TASK_RESULT = 1;
    private static final String TAG = "TaskStateMonitor";
    private static TaskStateMonitor monitor;
    private static Handler taskHandler;
    private Looper looper;
    private volatile boolean isRunning = false;
    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    public class StructMsg {
        COSXMLTask cosxmlTask;
        Exception exception;
        CosXmlResult result;
        volatile TransferState transferState;

        private StructMsg() {
        }
    }

    private TaskStateMonitor() {
    }

    public static TaskStateMonitor getInstance() {
        synchronized (TaskStateMonitor.class) {
            if (monitor == null) {
                monitor = new TaskStateMonitor();
            }
            monitor.monitor();
        }
        return monitor;
    }

    private void monitor() {
        if (this.isRunning) {
            return;
        }
        this.executorService.submit(this);
        this.isRunning = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseLooper() {
        quitSafely();
    }

    private void setMessageQueue() throws IllegalAccessException, NoSuchFieldException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        Field declaredField = Looper.class.getDeclaredField("mQueue");
        declaredField.setAccessible(true);
        for (Constructor<?> constructor : Class.forName("android.os.MessageQueue").getDeclaredConstructors()) {
            constructor.setAccessible(true);
            for (Class<?> cls : constructor.getParameterTypes()) {
                if (cls.getName().equalsIgnoreCase("boolean")) {
                    declaredField.set(this.looper, constructor.newInstance(Boolean.TRUE));
                    break;
                }
            }
        }
    }

    public Looper getLooper() {
        if (!Thread.currentThread().isAlive()) {
            return null;
        }
        synchronized (this) {
            while (Thread.currentThread().isAlive() && this.looper == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        return this.looper;
    }

    public void quitSafely() {
        taskHandler.removeCallbacksAndMessages(null);
        Looper looper = getLooper();
        if (looper != null) {
            looper.quitSafely();
        }
        this.isRunning = false;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this) {
            Looper looperMyLooper = Looper.myLooper();
            this.looper = looperMyLooper;
            if (looperMyLooper != null) {
                notifyAll();
            }
        }
        if (this.looper == null) {
            Looper.prepare();
            synchronized (this) {
                this.looper = Looper.myLooper();
                notifyAll();
            }
        }
        try {
            setMessageQueue();
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            BeaconService.getInstance().reportError(TAG, e10);
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
            BeaconService.getInstance().reportError(TAG, e11);
        } catch (InstantiationException e12) {
            e12.printStackTrace();
            BeaconService.getInstance().reportError(TAG, e12);
        } catch (NoSuchFieldException e13) {
            e13.printStackTrace();
            BeaconService.getInstance().reportError(TAG, e13);
        } catch (InvocationTargetException e14) {
            e14.printStackTrace();
            BeaconService.getInstance().reportError(TAG, e14);
        }
        taskHandler = new Handler(getLooper()) { // from class: com.tencent.cos.xml.transfer.TaskStateMonitor.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i10 = message.what;
                if (i10 == 1) {
                    StructMsg structMsg = (StructMsg) message.obj;
                    TaskStateMonitor.this.stateTransform(structMsg.cosxmlTask, structMsg.transferState, structMsg.exception, structMsg.result, false);
                    return;
                }
                if (i10 == 2) {
                    StructMsg structMsg2 = (StructMsg) message.obj;
                    TaskStateMonitor.this.stateTransform(structMsg2.cosxmlTask, structMsg2.transferState, structMsg2.exception, null, false);
                    return;
                }
                if (i10 == 3) {
                    TaskStateMonitor.this.releaseLooper();
                    return;
                }
                if (i10 == 4) {
                    StructMsg structMsg3 = (StructMsg) message.obj;
                    TaskStateMonitor.this.stateTransform(structMsg3.cosxmlTask, structMsg3.transferState, structMsg3.exception, structMsg3.result, true);
                } else {
                    if (i10 != 5) {
                        return;
                    }
                    StructMsg structMsg4 = (StructMsg) message.obj;
                    TaskStateMonitor.this.stateTransform(structMsg4.cosxmlTask, structMsg4.transferState, structMsg4.exception, structMsg4.result, false);
                }
            }
        };
        Looper.loop();
    }

    protected void sendStateMessage(COSXMLTask cOSXMLTask, TransferState transferState, Exception exc, CosXmlResult cosXmlResult, int i10) {
        Handler handler = taskHandler;
        if (handler == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i10;
        StructMsg structMsg = new StructMsg();
        structMsg.cosxmlTask = cOSXMLTask;
        structMsg.transferState = transferState;
        structMsg.exception = exc;
        structMsg.result = cosXmlResult;
        messageObtainMessage.obj = structMsg;
        taskHandler.sendMessage(messageObtainMessage);
    }

    protected void stateTransform(COSXMLTask cOSXMLTask, TransferState transferState, Exception exc, CosXmlResult cosXmlResult, boolean z10) {
        cOSXMLTask.updateState(transferState, exc, cosXmlResult, z10);
    }
}
