package com.creater.manageserver.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: createryan
 * @date 2022/8/11 18:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private Integer code;
    private String message;
    private Object result;

    public static Result ok(){
        return new Result(200, "", null);
    }
    public static Result ok(Object result){
        return new Result(200, "", result);
    }public static Result ok(String message){
        return new Result(200, message, null);
    }
    public static Result ok(String message, Object result){
        return new Result(200, message, result);
    }
    public static Result fail(String message){
        return new Result(200, message, null);
    }
}
