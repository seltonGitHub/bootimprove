package com.boot.bootprove.VO;

import lombok.Data;

//统一返回类
@Data
public class ResponseInfo {
    private Integer status;
    private Object data;

    public ResponseInfo() {
        this.status = 200;
    }
}
