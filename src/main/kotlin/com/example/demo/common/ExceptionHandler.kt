package com.example.demo.common

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionHandler {
    @ExceptionHandler(BaseException::class)
    protected fun handleBaseException(e: BaseException): ResponseEntity<BaseRes>{
        return ResponseEntity.status(e.baseResponseCode.status)
            .body(BaseRes(e.baseResponseCode.status, e.baseResponseCode.message))
    }
}