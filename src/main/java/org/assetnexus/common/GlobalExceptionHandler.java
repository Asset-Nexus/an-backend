package org.assetnexus.common;

import lombok.extern.slf4j.Slf4j;
import org.assetnexus.vo.ResponseVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseVO<String>> handleException(Exception ex) {
        log.error(ex.getMessage());
        return new ResponseEntity<>(ResponseVO.newFail(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
