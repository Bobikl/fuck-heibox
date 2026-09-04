package com.taobao.downloader.download.impl2;

import android.os.Environment;
import anet.channel.util.HttpConstant;
import com.taobao.downloader.download.IDownloader;
import com.taobao.downloader.download.IListener;
import com.taobao.downloader.download.protocol.DLConnection;
import com.taobao.downloader.download.protocol.DLInputStream;
import com.taobao.downloader.request.Param;
import com.taobao.downloader.request.task.SingleTask;
import com.taobao.downloader.util.Dlog;
import com.taobao.downloader.util.FileUtils;
import com.taobao.downloader.util.Switcher;
import com.xiaomi.mipush.sdk.Constants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultDownloader2 implements IDownloader {
    public static final int ST_CANCELED = 2;
    public static final int ST_PAUSED = 1;
    private static final String TAG = "Downloader";
    private InputContext inputContext;
    private int mStatus;
    private OutputContext outputContext;

    private boolean doNetworkDownload() throws Throwable {
        Throwable th2;
        DLInputStream inputStream;
        DLConnection connection;
        RandomAccessFile randomAccessFile = null;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            connection = getConnection();
            try {
                this.outputContext.downloadStat.connectTime += System.currentTimeMillis() - jCurrentTimeMillis;
                if (connection == null) {
                    if (connection != null) {
                        try {
                            connection.disConnect();
                        } catch (Throwable th3) {
                            Dlog.e(TAG, "on exception", th3, new Object[0]);
                        }
                    }
                    return false;
                }
                try {
                    try {
                        inputStream = connection.getInputStream();
                        if (inputStream == null) {
                            try {
                                throw new IOException("inputstream is null");
                            } catch (IOException e10) {
                                e = e10;
                                Dlog.e(TAG, "conn.getinputstream exception", e, new Object[0]);
                                this.outputContext.errorInfo.addErrorInfo(-12, 205, connection.getErrorMsg()).connectError = true;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th4) {
                                        Dlog.e(TAG, "on exception", th4, new Object[0]);
                                    }
                                }
                                try {
                                    connection.disConnect();
                                } catch (Throwable th5) {
                                    Dlog.e(TAG, "on exception", th5, new Object[0]);
                                }
                                return false;
                            }
                        }
                        try {
                            RandomAccessFile randomAccessFile2 = this.inputContext.getRandomAccessFile();
                            if (randomAccessFile2 == null) {
                                throw new FileNotFoundException("outputStream is null");
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            boolean zSaveData = saveData(inputStream, randomAccessFile2);
                            this.outputContext.downloadStat.downloadTime += System.currentTimeMillis() - jCurrentTimeMillis2;
                            if (!zSaveData) {
                                if (randomAccessFile2 != null) {
                                    try {
                                        randomAccessFile2.close();
                                    } catch (IOException e11) {
                                        Dlog.e(TAG, "on exception", e11, new Object[0]);
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th6) {
                                        Dlog.e(TAG, "on exception", th6, new Object[0]);
                                    }
                                }
                                try {
                                    connection.disConnect();
                                } catch (Throwable th7) {
                                    Dlog.e(TAG, "on exception", th7, new Object[0]);
                                }
                                return false;
                            }
                            if (!this.inputContext.hitTmpCache()) {
                                this.inputContext.tempFile.delete();
                                this.outputContext.errorInfo.addErrorInfo(this.inputContext.getFileErrorCode(), 106, "download invalid");
                                if (randomAccessFile2 != null) {
                                    try {
                                        randomAccessFile2.close();
                                    } catch (IOException e12) {
                                        Dlog.e(TAG, "on exception", e12, new Object[0]);
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th8) {
                                        Dlog.e(TAG, "on exception", th8, new Object[0]);
                                    }
                                }
                                try {
                                    connection.disConnect();
                                } catch (Throwable th9) {
                                    Dlog.e(TAG, "on exception", th9, new Object[0]);
                                }
                                return false;
                            }
                            InputContext inputContext = this.inputContext;
                            if (FileUtils.mvFile(inputContext.tempFile, inputContext.downloadFile)) {
                                this.outputContext.successCode = 10;
                                if (randomAccessFile2 != null) {
                                    try {
                                        randomAccessFile2.close();
                                    } catch (IOException e13) {
                                        Dlog.e(TAG, "on exception", e13, new Object[0]);
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th10) {
                                        Dlog.e(TAG, "on exception", th10, new Object[0]);
                                    }
                                }
                                try {
                                    connection.disConnect();
                                } catch (Throwable th11) {
                                    Dlog.e(TAG, "on exception", th11, new Object[0]);
                                }
                                return true;
                            }
                            this.outputContext.errorInfo.addErrorInfo(-11, this.inputContext.downloadFile.getParentFile().canWrite() ? 104 : 105, "rename tmp file error").ioError = true;
                            if (randomAccessFile2 != null) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e14) {
                                    Dlog.e(TAG, "on exception", e14, new Object[0]);
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th12) {
                                    Dlog.e(TAG, "on exception", th12, new Object[0]);
                                }
                            }
                            try {
                                connection.disConnect();
                            } catch (Throwable th13) {
                                Dlog.e(TAG, "on exception", th13, new Object[0]);
                            }
                            return false;
                        } catch (FileNotFoundException e15) {
                            Dlog.e(TAG, "getRandomAccessFile", e15, new Object[0]);
                            this.outputContext.errorInfo.addErrorInfo(-11, 103, connection.getErrorMsg()).ioError = true;
                            if (0 != 0) {
                                try {
                                    randomAccessFile.close();
                                } catch (IOException e16) {
                                    Dlog.e(TAG, "on exception", e16, new Object[0]);
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th14) {
                                    Dlog.e(TAG, "on exception", th14, new Object[0]);
                                }
                            }
                            try {
                                connection.disConnect();
                            } catch (Throwable th15) {
                                Dlog.e(TAG, "on exception", th15, new Object[0]);
                            }
                            return false;
                        }
                    } catch (IOException e17) {
                        e = e17;
                        inputStream = null;
                    }
                } catch (Throwable th16) {
                    th2 = th16;
                }
            } catch (Throwable th17) {
                th2 = th17;
                inputStream = null;
            }
        } catch (Throwable th18) {
            th2 = th18;
            inputStream = null;
            connection = null;
        }
        if (0 != 0) {
            try {
                randomAccessFile.close();
            } catch (IOException e18) {
                Dlog.e(TAG, "on exception", e18, new Object[0]);
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable th19) {
                Dlog.e(TAG, "on exception", th19, new Object[0]);
            }
        }
        if (connection == null) {
            throw th2;
        }
        try {
            connection.disConnect();
            throw th2;
        } catch (Throwable th20) {
            Dlog.e(TAG, "on exception", th20, new Object[0]);
            throw th2;
        }
    }

    private DLConnection getConnection() {
        InputContext inputContext = this.inputContext;
        DLConnection connection = Switcher.getConnection(inputContext.mTask.item, inputContext.mConfig);
        try {
            InputContext inputContext2 = this.inputContext;
            connection.openConnection(inputContext2.url, inputContext2.mConfig);
            connection.addRequestProperty(HttpConstant.F_REFER, "download_" + this.inputContext.mTask.param.bizId);
            long previousFileSize = this.inputContext.getPreviousFileSize();
            if (0 != previousFileSize) {
                String str = "bytes=" + previousFileSize + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
                Dlog.i(TAG, "getConnection", "add request property range", str);
                connection.addRequestProperty("Range", str);
                this.outputContext.downloadStat.range = true;
            } else {
                this.outputContext.downloadStat.range = false;
            }
            try {
                connection.connect();
                try {
                    int statusCode = connection.getStatusCode();
                    if (this.inputContext.isHttpStatusCodeOk(connection.getDownloadLength(), statusCode)) {
                        return connection;
                    }
                    this.outputContext.errorInfo.addErrorInfo(-12, statusCode, connection.getErrorMsg()).connectError = true;
                    return null;
                } catch (Exception e10) {
                    Dlog.e(TAG, "conn.getstatuscode exception", e10, new Object[0]);
                    this.outputContext.errorInfo.addErrorInfo(-12, 204, connection.getErrorMsg()).connectError = true;
                    return null;
                }
            } catch (IOException e11) {
                Dlog.e(TAG, "conn.conn exception", e11, new Object[0]);
                this.outputContext.errorInfo.addErrorInfo(-12, 203, connection.getErrorMsg()).connectError = true;
                return null;
            }
        } catch (IOException e12) {
            Dlog.e(TAG, "conn.open exception", e12, new Object[0]);
            this.outputContext.errorInfo.addErrorInfo(-12, 202, connection.getErrorMsg()).connectError = true;
            return null;
        }
    }

    private String getErrorMsg(Throwable th2) {
        if (!(th2 instanceof RuntimeException) || th2.getMessage() == null || th2.getMessage().length() >= 20) {
            return th2.getClass().getSimpleName();
        }
        return th2.getClass().getSimpleName() + ":" + th2.getMessage();
    }

    private int getStatus() {
        int i10 = this.mStatus;
        if (i10 <= 0) {
            return 0;
        }
        if ((i10 & 1) == 1) {
            return 1;
        }
        if ((i10 & 2) != 2) {
            return 0;
        }
        if (this.inputContext.tempFile.exists()) {
            this.inputContext.tempFile.delete();
        }
        return 2;
    }

    private boolean isAvailableSapce(long j10) {
        return Environment.getExternalStorageDirectory().getFreeSpace() >= j10;
    }

    private boolean saveData(DLInputStream dLInputStream, RandomAccessFile randomAccessFile) {
        if (dLInputStream == null || randomAccessFile == null) {
            OutputContext.ErrorInfo errorInfo = this.outputContext.errorInfo;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("savedataParam:");
            sb2.append(dLInputStream == null);
            sb2.append("|");
            sb2.append(randomAccessFile == null);
            errorInfo.addErrorInfo(-19, 0, sb2.toString());
            return false;
        }
        this.outputContext.mDownloadSize = this.inputContext.tempFile.length();
        FileChannel channel = randomAccessFile.getChannel();
        try {
            channel.position(randomAccessFile.length());
            byte[] bArr = new byte[Switcher.getDLReadBufferSize()];
            while (true) {
                int status = getStatus();
                if (status > 0) {
                    this.outputContext.errorInfo.addErrorInfo(-20, status, "");
                    return false;
                }
                try {
                    int i10 = dLInputStream.read(bArr);
                    if (-1 == i10) {
                        return true;
                    }
                    this.outputContext.hasReadData = true;
                    try {
                        channel.write(ByteBuffer.wrap(bArr, 0, i10));
                        OutputContext outputContext = this.outputContext;
                        long j10 = i10;
                        outputContext.mDownloadSize += j10;
                        outputContext.downloadStat.traffic += j10;
                        outputContext.updateProgress();
                    } catch (IOException e10) {
                        Dlog.e(TAG, "fc.write exception", e10, new Object[0]);
                        this.outputContext.errorInfo.addErrorInfo(-11, 102, getErrorMsg(e10)).ioError = true;
                        return false;
                    }
                } catch (Exception e11) {
                    Dlog.e(TAG, "input.read exception", e11, new Object[0]);
                    this.outputContext.errorInfo.addErrorInfo(-12, 201, getErrorMsg(e11)).readStreamError = true;
                    return false;
                }
            }
        } catch (IOException e12) {
            Dlog.e(TAG, "fc.position exception", e12, new Object[0]);
            this.outputContext.errorInfo.addErrorInfo(-11, 101, getErrorMsg(e12)).ioError = true;
            return false;
        }
    }

    @Override // com.taobao.downloader.download.IDownloader
    public void cancel() {
        this.mStatus |= 2;
    }

    @Override // com.taobao.downloader.download.IDownloader
    public void download(SingleTask singleTask, IListener iListener) {
        OutputContext outputContext;
        this.inputContext = new InputContext(singleTask);
        this.outputContext = new OutputContext(iListener);
        try {
            int status = getStatus();
            if (status <= 0) {
                try {
                    this.inputContext.prepareDownload();
                    if (this.inputContext.hitFileCache()) {
                        outputContext = this.outputContext;
                        outputContext.successCode = 11;
                    } else {
                        if (!this.inputContext.hitTmpCache()) {
                            if (isAvailableSapce(singleTask.item.size)) {
                                doNetworkDownload();
                                return;
                            }
                            OutputContext outputContext2 = this.outputContext;
                            OutputContext.ErrorInfo errorInfo = outputContext2.errorInfo;
                            errorInfo.success = false;
                            errorInfo.errorCode = -21;
                            InputContext inputContext = this.inputContext;
                            Param param = inputContext.mTask.param;
                            param.retryTimes = 0;
                            param.callbackCondition = 0;
                            outputContext2.callback(inputContext);
                            return;
                        }
                        InputContext inputContext2 = this.inputContext;
                        if (FileUtils.mvFile(inputContext2.tempFile, inputContext2.downloadFile)) {
                            this.outputContext.successCode = 11;
                        } else {
                            this.outputContext.errorInfo.addErrorInfo(-11, this.inputContext.downloadFile.getParentFile().canWrite() ? 104 : 105, "rename tmp file error").ioError = true;
                        }
                    }
                } catch (Throwable th2) {
                    this.outputContext.errorInfo.addErrorInfo(-10, 0, singleTask.item.url).urlError = true;
                    Dlog.e(TAG, "prepare download exception", th2, new Object[0]);
                }
                outputContext.callback(this.inputContext);
            }
            this.outputContext.errorInfo.addErrorInfo(-20, status, "");
            outputContext = this.outputContext;
            outputContext.callback(this.inputContext);
        } catch (Throwable th3) {
            try {
                Dlog.e(TAG, "do download exception", th3, new Object[0]);
                this.outputContext.errorInfo.addErrorInfo(-19, 301, getErrorMsg(th3));
            } finally {
                this.outputContext.callback(this.inputContext);
            }
        }
    }

    @Override // com.taobao.downloader.download.IDownloader
    public void pause() {
        this.mStatus |= 1;
    }
}
