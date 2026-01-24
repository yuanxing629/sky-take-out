package com.sky.exception;

/**
 * 菜品禁用失败异常
 */
public class DishDisableFailedException extends BaseException {

    public DishDisableFailedException() {
    }

    public DishDisableFailedException(String message) {
        super(message);
    }
}
