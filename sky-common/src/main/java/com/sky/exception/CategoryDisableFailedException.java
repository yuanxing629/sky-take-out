package com.sky.exception;

/**
 * 分类禁用异常
 */
public class CategoryDisableFailedException extends BaseException {

    public CategoryDisableFailedException() {
    }

    public CategoryDisableFailedException(String message) {
        super(message);
    }
}
