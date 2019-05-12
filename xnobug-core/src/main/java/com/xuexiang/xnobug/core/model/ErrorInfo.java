package com.xuexiang.xnobug.core.model;

/**
 * 错误信息
 *
 * @author xuexiang
 * @since 2019-05-05 09:45
 */
public class ErrorInfo {
    /**
     * 类名
     */
    public String className;
    /**
     * 方法名
     */
    public String methodName;
    /**
     * 行数
     */
    public int lineNumber;
    /**
     * 错误类型
     */
    public String errorType;
    /**
     * 错误发生时间
     */
    public long errorTime;
    /**
     * 线程名
     */
    public String threadName;
    /**
     * 错误简要信息
     */
    public String errorSummary;
    /**
     * 错误文件存储路径
     */
    public String errorFilePath;

    public String getClassName() {
        return className;
    }

    public ErrorInfo setClassName(String className) {
        this.className = className;
        return this;
    }

    public String getMethodName() {
        return methodName;
    }

    public ErrorInfo setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public ErrorInfo setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    public String getErrorType() {
        return errorType;
    }

    public ErrorInfo setErrorType(String errorType) {
        this.errorType = errorType;
        return this;
    }

    public long getErrorTime() {
        return errorTime;
    }

    public ErrorInfo setErrorTime(long errorTime) {
        this.errorTime = errorTime;
        return this;
    }

    public String getThreadName() {
        return threadName;
    }

    public ErrorInfo setThreadName(String threadName) {
        this.threadName = threadName;
        return this;
    }

    public String getErrorSummary() {
        return errorSummary;
    }

    public ErrorInfo setErrorSummary(String errorSummary) {
        this.errorSummary = errorSummary;
        return this;
    }

    public String getErrorFilePath() {
        return errorFilePath;
    }

    public ErrorInfo setErrorFilePath(String errorFilePath) {
        this.errorFilePath = errorFilePath;
        return this;
    }

    @Override
    public String toString() {
        return "ErrorInfo{" +
                "className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", lineNumber='" + lineNumber + '\'' +
                ", errorType='" + errorType + '\'' +
                ", errorTime='" + errorTime + '\'' +
                ", threadName='" + threadName + '\'' +
                ", errorSummary='" + errorSummary + '\'' +
                ", errorFilePath='" + errorFilePath + '\'' +
                '}';
    }
}
